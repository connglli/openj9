/*******************************************************************************
 * Copyright IBM Corp. and others 1991
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] https://openjdk.org/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/

#include "RememberedSetCardListCardIterator.hpp"
#include "InterRegionRememberedSet.hpp"

bool
GC_RememberedSetCardListCardIterator::nextBuffer(MM_EnvironmentBase *env, MM_CardBufferControlBlock *cardBufferControlBlock)
{
	bool foundBuffer = false;

	if (NULL != cardBufferControlBlock) {
		/* yes, there is at least one */
		foundBuffer = true;
		_bufferCardList = cardBufferControlBlock->_card;
		_cardBufferControlBlockNext = cardBufferControlBlock->_next;

		_cardIndex = 0;

		/* _cardIndexTop has to be between 1 and MM_RememberedSetCardBucket::MAX_BUFFER_SIZE, inclusive */
		if (_currentBucket->isCurrentSlotWithinBuffer(env, _bufferCardList)) {
			bool const compressed = env->compressObjectReferences();
			_cardIndexTop = MM_RememberedSetCard::subtractCardAddresses(_currentBucket->_current, _bufferCardList, compressed);
		} else {
			_cardIndexTop = MM_RememberedSetCardBucket::MAX_BUFFER_SIZE;
		}
	}

	return foundBuffer;
}

bool
GC_RememberedSetCardListCardIterator::nextBucket(MM_EnvironmentBase* env)
{
	/* next bucket in the list */
	do {
		if (NULL == _currentBucket) {
			_currentBucket = _rscl->_bucketListHead;
		} else {
			_currentBucket = _currentBucket->_next;
		}
		if (NULL == _currentBucket) {
			/* this was the last bucket */
			return false;
		}

		/* if no buffer in this bucket, retry */
	} while (!nextBuffer(env, _currentBucket->_cardBufferControlBlockHead));

	return true;
}

UDATA
GC_RememberedSetCardListCardIterator::nextReferencingCard(MM_EnvironmentBase *env)
{
	bool const compressed = env->compressObjectReferences();
	do {
		do {
			/* next card within the buffer */
			if (_cardIndex < _cardIndexTop) {
				MM_RememberedSetCard *cardAddress = MM_RememberedSetCard::addToCardAddress(_bufferCardList, _cardIndex, compressed);
				_cardIndex += 1;
				return MM_RememberedSetCard::readCard(cardAddress, compressed);
			}
		} while (nextBuffer(env, _cardBufferControlBlockNext));
	} while (nextBucket(env));

	return 0;
}

void *
GC_RememberedSetCardListCardIterator::nextReferencingCardHeapAddress(MM_EnvironmentBase* env)
{
	MM_InterRegionRememberedSet *interRegionRememberedSet = MM_GCExtensions::getExtensions(env)->interRegionRememberedSet;
	UDATA card = nextReferencingCard(env);
	return interRegionRememberedSet->convertHeapAddressFromRememberedSetCard(card);
}
