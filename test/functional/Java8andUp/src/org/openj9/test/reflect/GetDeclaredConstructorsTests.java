/*******************************************************************************
 * Copyright (c) 2018, 2018 Felipe Pontes
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
package org.openj9.test.reflect;

import org.openj9.resources.reflect.B;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.lang.reflect.Constructor;

public class GetDeclaredConstructorsTests {

	@Test(groups = { "level.sanity" })
	public void testGetDeclaredConstructorsAfterNewInstance() {
		try {
			B.class.newInstance();
		} catch (ExceptionInInitializerError e) {
		} catch (Exception e) {
		} finally {
			Constructor[] declaredConstructors = B.class.getDeclaredConstructors();
			int expectedConstructorsListSize = 1;
			int actualConstructorsListSize = declaredConstructors.length;
			Assert.assertEquals(expectedConstructorsListSize, actualConstructorsListSize, "wrong declared constructors list size");
			String expectedConstructorSignature = "public org.openj9.resources.reflect.B()";
			String actualConstructorSignature = declaredConstructors[0].toString();
			Assert.assertEquals(expectedConstructorSignature, actualConstructorSignature, "wrong signatures for declared constructor");
		}
	}

}
