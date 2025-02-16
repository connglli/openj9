package com.ibm.j9.cfdump.tests.lineardump.utils;

/*******************************************************************************
 * Copyright IBM Corp. and others 2010
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
 * Class representing a field in the ROM Class Linear Dump output.
 */
public class Field {
	private String name;
	private String value;
	private String addressStart;
	private String addressEnd;
	private String extraDescription;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressStart() {
		return addressStart;
	}
	public void setAddressStart(String addressStart) {
		this.addressStart = addressStart;
	}
	public String getAddressEnd() {
		return addressEnd;
	}
	public void setAddressEnd(String addressEnd) {
		this.addressEnd = addressEnd;
	}
	public String getExtraDescription() {
		return extraDescription;
	}
	public void setExtraDescription(String extraDescription) {
		this.extraDescription = extraDescription;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String toString() {
		return String.format("%s-%s [ %s %s ] %s", addressStart, addressEnd, value, name, extraDescription);
	}
}
