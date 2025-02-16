/*******************************************************************************
 * Copyright IBM Corp. and others 2001
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
package com.ibm.jvmti.tests.registerNativesWithRetransformation;

public class rnwr001_Runner_V2 {
	public boolean runTest1() {
		rnwr001_Sub_V2 object = new rnwr001_Sub_V2();
		if (object.registeredNativeMethod() != 100) {
			return false;
		}
		return true;
	}
	
	public boolean runTest2() {
		rnwr001_Interface_V2 object = (rnwr001_Interface_V2) new rnwr001_Sub_V2();
		if (object.m1() != 10) {
			return false;
		}
		return true;
	}
	
	public boolean runTest3() {
		rnwr001_Interface_V2 object = (rnwr001_Interface_V2) new rnwr001_Sub_V2();
		if (object.m2() != 100) {
			return false;
		}
		return true;
	}
}
