
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

/**
 * @file
 * @ingroup GC_Check
 */

#if !defined(CHECKCYCLE_HPP_)
#define CHECKCYCLE_HPP_

#include "j9.h"
#include "j9cfg.h"

#include "Base.hpp"
#include "CheckBase.hpp"

class GC_Check;
class GC_CheckEngine;

class GC_CheckCycle : public MM_Base
{
	/*
	 * Data members
	 */
private:
	typedef struct {
		const char *name;
		UDATA bitmask;
		GC_Check *(*function)(J9JavaVM *javaVM, GC_CheckEngine *engine);
	} funcStruct;
	
	const static funcStruct funcArray[];

	UDATA _checkFlags;
	UDATA _miscFlags;
	GCCheckInvokedBy _invokedBy; /**< What stage of GC invoked the check */
	UDATA _manualCheckInvocation; /**< Allow user to identify which installed GCCheck triggered message */
	UDATA _errorCount; /**< Number of errors encountered  */
	
	GC_Check *_checks; /**< Pointer to head of linked list of checks to run in this cycle */
	
	J9JavaVM *_javaVM;
	J9PortLibrary *_portLibrary;
	GC_CheckEngine *_engine;

protected:
public:

	/*
	 * Function members
	 */
private:
	void generateCheckList(UDATA scanFlags);

	bool initialize(const char *args);

protected:
public:

	static void printHelp(J9PortLibrary *portLib);
	
	UDATA getCheckFlags() { return _checkFlags; };
	UDATA getMiscFlags() { return _miscFlags; };
	GCCheckInvokedBy getInvoker() { return _invokedBy; };
	UDATA getManualCheckNumber() { return _manualCheckInvocation; };
	
	UDATA nextErrorCount() { return ++_errorCount; };
	
	/**
	 * Run the checks
	 * Iterates over the _checks linked list calling run() on each item in the list.
	 * @param invokedBy Identifier of the point in the GC the check has been called from
	 * @param filterFlags Tells which subset of the check list should be used (1bit meaning the checker will be used)
	 */
	void run(GCCheckInvokedBy invokedBy, UDATA filterFlags = J9MODRON_GCCHK_SCAN_ALL_SLOTS);
	void fixDeadObjects(GCCheckInvokedBy invokedBy);
	static GC_CheckCycle *newInstance(J9JavaVM *javaVM, GC_CheckEngine *, const char *args, UDATA manualCountInvocation = 0);
	virtual void kill();

	GC_CheckCycle(J9JavaVM *javaVM, GC_CheckEngine *engine, UDATA manualCountInvocation)
		: MM_Base()
		, _checkFlags(0)
		, _miscFlags(0)
		, _invokedBy(invocation_unknown)
		, _manualCheckInvocation(manualCountInvocation)
		, _errorCount(0)
		, _checks(NULL)
		, _javaVM(javaVM)
		, _portLibrary(javaVM->portLibrary)
		, _engine(engine)
	{}
};

#endif /* CHECKCYCLE_HPP_ */
