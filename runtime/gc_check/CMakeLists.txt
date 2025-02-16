################################################################################
# Copyright IBM Corp. and others 2017
#
# This program and the accompanying materials are made available under
# the terms of the Eclipse Public License 2.0 which accompanies this
# distribution and is available at https://www.eclipse.org/legal/epl-2.0/
# or the Apache License, Version 2.0 which accompanies this distribution and
# is available at https://www.apache.org/licenses/LICENSE-2.0.
#
# This Source Code may also be made available under the following
# Secondary Licenses when the conditions for such availability set
# forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
# General Public License, version 2 with the GNU Classpath
# Exception [1] and GNU General Public License, version 2 with the
# OpenJDK Assembly Exception [2].
#
# [1] https://www.gnu.org/software/classpath/license.html
# [2] https://openjdk.org/legal/assembly-exception.html
#
# SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
################################################################################

set(gc_check_sources
	Check.cpp
	CheckClassHeap.cpp
	CheckClassLoaders.cpp
	CheckCycle.cpp
	CheckEngine.cpp
	CheckError.cpp
	CheckFinalizableList.cpp
	CheckJNIGlobalReferences.cpp
	CheckJNIWeakGlobalReferences.cpp
	CheckJVMTIObjectTagTables.cpp
	CheckMonitorTable.cpp
	CheckObjectHeap.cpp
	CheckOwnableSynchronizerList.cpp
	CheckRememberedSet.cpp
	CheckReporter.cpp
	CheckReporterTTY.cpp
	CheckStringTable.cpp
	CheckUnfinalizedList.cpp
	CheckVMClassSlots.cpp
	CheckVMThreads.cpp
	CheckVMThreadStacks.cpp
	FixDeadObjects.cpp
	ScanFormatter.cpp
)

j9vm_add_library(j9gccheck STATIC
	${gc_check_sources}
)

target_include_directories(j9gccheck
	PUBLIC
		${CMAKE_CURRENT_SOURCE_DIR}
)

target_link_libraries(j9gccheck
	PRIVATE
		j9vm_interface

		omrgc
		j9gcbase
		j9gcstructs
		j9gcstats
)

if(OMR_MIXED_REFERENCES_MODE_STATIC)
	j9vm_add_library(j9gccheck_full STATIC
		${gc_check_sources}
	)

	target_include_directories(j9gccheck_full
		PUBLIC
			${CMAKE_CURRENT_SOURCE_DIR}
	)

	target_link_libraries(j9gccheck_full
		PRIVATE
			j9vm_interface

			omrgc_full
			j9gcbase_full
			j9gcstructs_full
			j9gcstats_full
	)
endif()
