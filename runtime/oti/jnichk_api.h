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

#ifndef jnichk_api_h
#define jnichk_api_h

/**
* @file jnichk_api.h
* @brief Public API for the JNICHK module.
*
* This file contains public function prototypes and
* type definitions for the JNICHK module.
*
*/

#include "j9.h"
#include "j9comp.h"
#include "jni.h"

#ifdef __cplusplus
extern "C" {
#endif

#define JNICHK_VERBOSE 0x1
#define JNICHK_PROFILE 0x2
#define JNICHK_NONFATAL 0x4
#define JNICHK_PEDANTIC 0x8
#define JNICHK_TRACE 0x10
#define JNICHK_NOWARN 0x20
#define JNICHK_NOADVICE 0x40
#define JNICHK_NOBOUNDS 0x80
#define JNICHK_NOVALIST 0x100
#define JNICHK_INCLUDEBOOT 0x200
#define JNICHK_ALWAYSCOPY 0x400
#define JNICHK_ABORTONERROR 0x800

#ifdef __cplusplus
}
#endif

#endif /* jnichk_api_h */

