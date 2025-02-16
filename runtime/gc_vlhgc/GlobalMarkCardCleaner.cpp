
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

#include "j9.h"
#include "j9cfg.h"
#include "j9port.h"
#include "modronopt.h"

#include "GlobalMarkCardCleaner.hpp"

#include "CycleState.hpp"
#include "EnvironmentVLHGC.hpp"
#include "GlobalMarkingScheme.hpp"

void
MM_GlobalMarkCardCleaner::clean(MM_EnvironmentBase *envModron, void *lowAddress, void *highAddress, Card *cardToClean)
{
	MM_EnvironmentVLHGC* env = MM_EnvironmentVLHGC::getEnvironment(envModron);
	Assert_MM_false(MM_CycleState::CT_PARTIAL_GARBAGE_COLLECTION == env->_cycleState->_collectionType);
	Assert_MM_true(NULL != _markingScheme);
	
	Card fromState = *cardToClean;
	Card toState = CARD_INVALID;
	switch(fromState) {
	case CARD_DIRTY:
		toState = CARD_PGC_MUST_SCAN;
		break;
	case CARD_GMP_MUST_SCAN:
		toState = CARD_CLEAN;
		break;
	case CARD_CLEAN:
	case CARD_PGC_MUST_SCAN:
		/* other card states are not of interest to this cleaner and should be ignored */
		break;
	default:
		Assert_MM_unreachable();
	}
	/* only update the card state if we identified a transition we are interested in since some are to be ignored:
	 * Consider the case of seeing CARD_GMP_MUST_SCAN during a PGC (which is allowed to happen if we have GMP followed
	 * by GMP).  We want to ignore this transition.
	 */
	if (CARD_INVALID != toState) {
		*cardToClean = toState;
		_markingScheme->scanObjectsInRange(env, lowAddress, highAddress);
	}
}
