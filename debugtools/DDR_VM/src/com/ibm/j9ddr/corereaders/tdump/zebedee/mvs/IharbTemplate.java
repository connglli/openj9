/*******************************************************************************
 * Copyright IBM Corp. and others 2006
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
package com.ibm.j9ddr.corereaders.tdump.zebedee.mvs;

import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

/* This class was generated automatically by com.ibm.zebedee.util.Xml2Java */

public final class IharbTemplate {

    public static int length() {
        return 176;
    }

    public static long getRbopsw(ImageInputStream inputStream, long address) throws IOException {
        inputStream.seek(address + 16);
        return inputStream.readLong();
    }
    public static int getRbopsw$offset() {
        return 16;
    }
    public static int getRbopsw$length() {
        return 64;
    }
    public static long getRblinkXrblnkRblinkb(ImageInputStream inputStream, long address) throws IOException {
        inputStream.seek(address + 29);
        long result = inputStream.readBits(24);
        return result;
    }
    public static int getRblinkXrblnkRblinkb$offset() {
        return 29;
    }
    public static int getRblinkXrblnkRblinkb$length() {
        return 24;
    }
    public static long getRbgrsave(ImageInputStream inputStream, long address) throws IOException {
        inputStream.seek(address + 32);
        throw new Error("request for long value for field rbgrsave which has length of 64");
    }
    public static int getRbgrsave$offset() {
        return 32;
    }
    public static int getRbgrsave$length() {
        return 512;
    }
}
