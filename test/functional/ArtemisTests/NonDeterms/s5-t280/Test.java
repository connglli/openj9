/*******************************************************************************
 * Copyright IBM Corp. and others 2023
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

// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.SocketPermission;
import java.nio.channels.Pipe;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 11L;

    public static int iFld = 57;

    public static float fFld = -2.282F;

    public static volatile double dFld = 105.88667;

    public static boolean bFld = false;

    public int iFld1 = 8;

    public int iFld2 = -16;

    public static short sFld = -16987;

    public static int iArrFld[] = new int[N];

    public static int iArrFld1[] = new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -64480);
        FuzzerUtils.init(Test.iArrFld1, 4);
    }

    public static long lMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static int iMeth(byte by) {
        int i5 = 24;
        int i6 = 30930;
        int i7 = -248;
        int i8 = 30333;
        int i9 = 53;
        int i10 = 51239;
        int i11 = -7;
        int i12 = 25636;
        int i13 = 46100;
        boolean b = true;
        double dArr[][] = new double[N][N];
        long lArr[] = new long[N];
        FuzzerUtils.init(dArr, 2.23966);
        FuzzerUtils.init(lArr, 95L);
        for (i5 = 4; i5 < 128; i5++) {
            Test.iArrFld[i5] += ((int) (Test.fFld));
            Test.instanceCount -= Test.instanceCount;
            b = false;
            Test.iFld += i5 * i5;
            for (i7 = 1; i7 < 5; i7++) {
                Test.fFld += 28651 + (i7 * i7);
                Test.instanceCount -= i8;
                i6 += Test.iFld;
                Test.iFld += -18;
                Test.instanceCount = i7;
                i9 = 1;
                do {
                    Test.instanceCount = Test.instanceCount;
                    i8 += i9 * i9;
                    i6 = i8;
                    i6 += i9 * i9;
                    if (i9 != 0) {
                    }
                    Test.instanceCount |= i5;
                    Test.iArrFld[i9 - 1] &= ((int) (8907431109865359300L));
                    {
                        final boolean ax$12 = Test.bFld;
                        final int ax$13 = i5;
                        try {
                            Selector ax$2 = null;
                            Pipe[] ax$4 = new Pipe[]{ null, null };
                            String[] ax$9 = new String[]{ "/bin/cat" };
                            boolean ax$1 = false;
                            for (int ax$0 = -291; ax$0 < (-291 + 13641); ax$0 += 1) {
                                Test.AxOutputRedirectionHelper.redirect();
                                try {
                                    for (int ax$5 = 0; ax$5 < i5; ax$5++) {
                                        ax$4[ax$5] = Pipe.open();
                                        Pipe.SourceChannel ax$6 = ax$4[ax$5].source();
                                        ax$6.configureBlocking(false);
                                        ax$6.register(ax$2, SelectionKey.OP_READ);
                                        Pipe.SinkChannel ax$7 = ax$4[ax$5].sink();
                                        ax$7.configureBlocking(false);
                                        ax$7.register(ax$2, SelectionKey.OP_WRITE);
                                    }
                                } catch (Throwable ax$8) {
                                } finally {
                                }
                                Test.AxOutputRedirectionHelper.recover();
                                if (!ax$1) {
                                    Test.iArrFld = Test.iArrFld;
                                    ax$1 = true;
                                }
                                Test.AxOutputRedirectionHelper.redirect();
                                try {
                                    if (ax$9.length > 0) {
                                        if (ax$9[0].equals("-d")) {
                                            bFld = false;
                                        }
                                    }
                                } catch (Throwable ax$11) {
                                } finally {
                                }
                                Test.AxOutputRedirectionHelper.recover();
                            }
                        } finally {
                            Test.bFld = ax$12;
                            i5 = ax$13;
                        }
                    }
                } while ((++i9) < 2 );
                i8 *= ((int) (Test.instanceCount));
                switch (((i5 % 1) * 5) + 59) {
                    case 63 :
                        i8 <<= i6;
                        i8 += i9;
                        if (b) {
                            Test.instanceCount += ((long) (1.57402));
                            for (i10 = i7; i10 < 2; ++i10) {
                                Test.fFld = Test.instanceCount;
                                if (false)
                                    break;

                            }
                            i8 -= i9;
                            Test.iFld = i6;
                            for (i12 = 1; 2 > i12; ++i12) {
                                Test.dFld = i12;
                                dArr[i7 + 1][i12 + 1] %= i8 | 1;
                                lArr[i5 - 1] = i8;
                                Test.fFld -= ((float) (Test.dFld));
                                i11 = Test.iFld;
                            }
                        } else {
                            i6 += i7 * i7;
                        }
                        break;
                    default :
                }
            }
        }
        long meth_res = (((((((((((by + i5) + i6) + (b ? 1 : 0)) + i7) + i8) + i9) + i10) + i11) + i12) + i13) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth(long l) {
        int i = 12;
        int i1 = 2111;
        int i2 = -67;
        int i3 = 16;
        int i4 = 250;
        int i14 = 23;
        int i15 = 5;
        int iArr1[][] = new int[N][N];
        short s = 27112;
        double d = 0.1526;
        byte by1 = 17;
        boolean b1 = true;
        float fArr[] = new float[N];
        FuzzerUtils.init(iArr1, -12);
        FuzzerUtils.init(fArr, -83.86F);
        i = 1;
        do {
            for (i1 = i; i1 < 4; ++i1) {
                iArr1[i1 - 1] = iArr1[i1 + 1] = iArr1[i] = iArr1[i1 - 1] = iArr1[i1 + 1];
                s = ((short) (iArr1[i + 1][(i1 >>> 1) % N]--));
                if (Test.iFld != 0) {
                    vMeth_check_sum += ((((((((((((l + i) + i1) + i2) + s) + Double.doubleToLongBits(d)) + i3) + i4) + by1) + i14) + i15) + (b1 ? 1 : 0)) + FuzzerUtils.checkSum(iArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                d -= 3;
                for (i3 = 1; i3 < 1; ++i3) {
                    iArr1[i1 + 1][i1] *= ((int) (l));
                }
                iArr1[i + 1][i - 1] -= iMeth(by1);
                if (b1) {
                    for (i14 = 1; i14 > 1; i14--) {
                        i15 = i2;
                        i15 = i2;
                        switch ((i % 8) + 4) {
                            case 4 :
                                try {
                                    i15 = Test.iFld / 31829;
                                    i2 = Test.iArrFld[i - 1] / i15;
                                    i15 = i3 / 64722;
                                } catch (ArithmeticException a_e) {
                                }
                                i4 += i4;
                                break;
                            case 5 :
                                l = s;
                                s *= ((short) (i1));
                                break;
                            case 6 :
                                Test.instanceCount = Test.iFld;
                                Test.iFld += i14;
                                Test.iFld += -41;
                                try {
                                    i15 = iArr1[i][i + 1] / 1348882413;
                                    i4 = iArr1[i - 1][i1 + 1] % (-187);
                                    i4 = (-12116) % Test.iFld;
                                } catch (ArithmeticException a_e) {
                                }
                                b1 = b1;
                                l -= ((long) (Test.fFld));
                                Test.iFld = 20506;
                                iArr1[i1][(i4 >>> 1) % N] %= ((int) (s | 1));
                                break;
                            case 7 :
                                iArr1[i + 1][i] >>= i15;
                                i4 = ((int) (Test.fFld));
                                fArr[i1 + 1] += Test.instanceCount;
                                fArr = fArr;
                                i15 += Test.iFld;
                                fArr[i1 - 1] -= 44783;
                                i2 *= i15;
                                i2 -= i;
                                Test.fFld = l;
                                i15 <<= i1;
                                i4 += i14 | i3;
                                break;
                            case 8 :
                                i4 = i14;
                                break;
                            case 9 :
                                Test.iFld += ((int) (-1284044145L));
                                break;
                            case 10 :
                                if (i14 != 0) {
                                    vMeth_check_sum += ((((((((((((l + i) + i1) + i2) + s) + Double.doubleToLongBits(d)) + i3) + i4) + by1) + i14) + i15) + (b1 ? 1 : 0)) + FuzzerUtils.checkSum(iArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                                    return;
                                }
                            case 11 :
                                i15 = i15;
                                break;
                            default :
                                Test.iFld = i3;
                        }
                    }
                } else if (b1) {
                    try {
                        i2 = i % i15;
                        i2 = i2 / (-413827943);
                        iArr1[i1 - 1][i1] = (-28024) % Test.iFld;
                    } catch (ArithmeticException a_e) {
                    }
                } else {
                    s += ((short) (Test.fFld));
                }
            }
        } while ((++i) < 137 );
        vMeth_check_sum += ((((((((((((l + i) + i1) + i2) + s) + Double.doubleToLongBits(d)) + i3) + i4) + by1) + i14) + i15) + (b1 ? 1 : 0)) + FuzzerUtils.checkSum(iArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth() {
        if (Test.ax$14) {
            final long ax$17 = Test.iMeth_check_sum;
            Test.AxOutputRedirectionHelper.redirect();
            try {
                if (iMeth_check_sum != 0xffL);
            } catch (Throwable ax$16) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            Test.iMeth_check_sum = ax$17;
            return -8693131033164279780L;
        }
        float f = 1.567F;
        float f1 = 0.75F;
        int i16 = 186;
        int i17 = -13;
        int i18 = 48989;
        int i19 = 5;
        int i20 = -17837;
        int i21 = 218;
        int i22 = 18888;
        int i23 = -45665;
        int i24 = 5;
        int i25 = 12;
        int i26 = -13;
        int iArr[] = new int[N];
        byte by2 = -24;
        byte byArr[] = new byte[N];
        long l1 = -3240425744L;
        short s1 = -11959;
        FuzzerUtils.init(iArr, 14);
        FuzzerUtils.init(byArr, ((byte) (27)));
        iArr[(Test.iFld >>> 1) % N] *= iArr[(Test.iFld >>> 1) % N]--;
        vMeth(-1837617436L);
        Test.dFld = f;
        for (i16 = 3; 77 > i16; ++i16) {
            for (i18 = 7; i18 > 1; i18--) {
                iArr[i18] = ((int) (-3624951419632776471L));
                for (i20 = 1; i20 < 2; i20++) {
                    i21 = i18;
                    i19 -= i20;
                    i17 -= -9476;
                    i21 *= i19;
                    if (i18 != 0) {
                    }
                    i21 += Test.iFld;
                    Test.bFld = Test.bFld;
                    Test.fFld -= -20629;
                    i19 = Test.iFld;
                    i17 += ((int) (11L));
                }
            }
            i17 += i16 + i21;
            Test.instanceCount = i17;
            Test.instanceCount -= i16;
            by2 = ((byte) (i21));
            i19 += ((int) (Test.dFld));
        }
        iArr[((-18971) >>> 1) % N] -= Test.iFld;
        i19 = ((int) (-112L));
        for (i22 = 150; i22 > 9; i22 -= 2) {
            Test.iArrFld = iArr;
            f1 -= i17;
            for (l1 = i22; l1 < 8; ++l1) {
                s1 += ((short) (183));
                for (i25 = 1; i25 > 1; --i25) {
                    byArr[i22] = ((byte) (l1));
                    Test.bFld = Test.bFld;
                    if (Test.bFld)
                        break;

                    Test.bFld = Test.bFld;
                    Test.iArrFld[i22] >>= i22;
                    i26 = i16;
                    if (Test.bFld)
                        continue;

                }
            }
        }
        long meth_res = ((((((((((((((((Float.floatToIntBits(f) + i16) + i17) + i18) + i19) + i20) + i21) + by2) + i22) + i23) + Float.floatToIntBits(f1)) + l1) + i24) + s1) + i25) + i26) + FuzzerUtils.checkSum(iArr)) + FuzzerUtils.checkSum(byArr);
        lMeth_check_sum += meth_res;
        return ((long) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        if (Test.ax$25) {
            final int ax$28 = Test.iFld;
            Test.AxOutputRedirectionHelper.redirect();
            try {
            } catch (Throwable ax$27) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            Test.iFld = ax$28;
            return;
        }
        int i27 = -8;
        int i28 = -10;
        int i29 = -45887;
        int i30 = -8;
        int i31 = -5;
        int i32 = 172;
        int i33 = -43742;
        int i34 = -1;
        int i35 = -8118;
        int i36 = 21;
        int i37 = 19115;
        int i38 = -19540;
        int i39 = 9;
        byte by3 = -28;
        byte byArr1[] = new byte[N];
        short s2 = -23300;
        boolean b2 = false;
        long lArr1[] = new long[N];
        FuzzerUtils.init(lArr1, 3L);
        FuzzerUtils.init(byArr1, ((byte) (112)));
        {
            try {
                int[] ax$19 = new int[20];
                int[] ax$21 = new int[]{ 10, 20, 45, 38, 88 };
                float[] ax$22 = new float[16];
                for (int ax$18 = -694; ax$18 < (-694 + 4822); ax$18 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if (ax$19.length != 0) {
                        }
                    } catch (Throwable ax$20) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$14 = true;
                    lMeth();
                    Test.ax$14 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$23 = 0; ax$23 < 128; ax$23++) {
                            ax$22[ax$23] = ((float) (ax$21[ax$23]));
                        }
                    } catch (Throwable ax$24) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
            }
        }
        lMeth();
        for (i27 = 8; i27 < 193; i27++) {
            for (i29 = 1; i29 < 28; ++i29) {
                switch (((i27 % 10) * 5) + 17) {
                    case 38 :
                        Test.iArrFld[i27 + 1] = i27;
                        i31 = i31;
                        Test.iFld = i31;
                        switch (((i29 % 5) * 5) + 62) {
                            case 75 :
                                i32 = 1;
                                while ((++i32) < 2) {
                                    i30 <<= ((int) (Test.instanceCount));
                                    i30 += i32;
                                    Test.instanceCount += ((i32 * Test.iFld) + Test.instanceCount) - Test.instanceCount;
                                    try {
                                        i30 = (-1212736075) % i30;
                                        i33 = 1302404004 / i28;
                                        Test.iFld = 207 % i27;
                                    } catch (ArithmeticException a_e) {
                                    }
                                } 
                                i28 += i29 * i29;
                                for (i34 = 2; i34 > 1; i34 -= 3) {
                                    Test.iArrFld = Test.iArrFld;
                                    Test.instanceCount -= 12280L;
                                    Test.iArrFld[i29 + 1] >>= Test.iFld;
                                    Test.iArrFld[i29] /= ((int) (i29 | 1));
                                    Test.iFld /= ((int) (Test.instanceCount | 1));
                                    by3 += ((byte) (i29));
                                    Test.iFld &= 12;
                                    i35 = ((int) (Test.fFld));
                                    i35 += ((int) (Test.fFld));
                                    i33 = Test.iFld;
                                    Test.instanceCount <<= i34;
                                    i31 = i28;
                                    Test.iArrFld[i27] -= ((int) (Test.dFld));
                                }
                                Test.instanceCount *= i31;
                                for (i36 = 1; 2 > i36; i36++) {
                                    Test.instanceCount += Test.instanceCount;
                                    i35 += i36 * i31;
                                }
                                Test.bFld = Test.bFld;
                                i33 -= ((int) (Test.instanceCount));
                            case 73 :
                                i28 = i29;
                                i35 = iFld1;
                                Test.dFld -= -8L;
                                if (b2) {
                                    lArr1[i27 + 1] = 7995545662783782490L;
                                    i37 -= i34;
                                    i35 = i35;
                                    switch (((i29 % 2) * 5) + 123) {
                                        case 131 :
                                        case 128 :
                                            for (i38 = 1; i38 < 2; i38++) {
                                                s2 += ((short) (Test.dFld));
                                                switch (((i38 % 10) * 5) + 86) {
                                                    case 87 :
                                                        i28 = 86;
                                                        by3 += ((byte) (i38 + i35));
                                                        Test.dFld = i32;
                                                        Test.fFld += ((i38 * Test.instanceCount) + Test.instanceCount) - i39;
                                                        Test.iArrFld[i29 - 1] += ((int) (Test.instanceCount));
                                                        switch ((i27 % 4) + 46) {
                                                            case 46 :
                                                                i35 += ((int) (146774704559132491L));
                                                                try {
                                                                    i35 = i31 / i35;
                                                                    i28 = i29 / 61030;
                                                                    i30 = i38 % (-68);
                                                                } catch (ArithmeticException a_e) {
                                                                }
                                                                break;
                                                            case 47 :
                                                                switch (((i38 % 5) * 5) + 71) {
                                                                    case 73 :
                                                                        i31 = -37173;
                                                                        if (Test.bFld)
                                                                            break;

                                                                        iFld1 *= ((int) (Test.fFld));
                                                                        Test.instanceCount *= i31;
                                                                        iFld2 += i38 ^ i29;
                                                                        break;
                                                                    case 79 :
                                                                        Test.instanceCount -= Test.instanceCount;
                                                                        i31 = -12478;
                                                                        i35 += i38 + Test.instanceCount;
                                                                        Test.fFld = Test.instanceCount;
                                                                        Test.instanceCount >>>= i34;
                                                                        lArr1[i27 - 1] <<= Test.instanceCount;
                                                                        if (Test.bFld)
                                                                            continue;

                                                                        iFld1 += ((i38 * Test.fFld) + i39) - Test.iFld;
                                                                        try {
                                                                            Test.iArrFld[i27] = (-109) / Test.iFld;
                                                                            i39 = i31 / (-120);
                                                                            i28 = (-232) / Test.iArrFld1[i38 - 1];
                                                                        } catch (ArithmeticException a_e) {
                                                                        }
                                                                        break;
                                                                    case 77 :
                                                                        s2 = ((short) (0));
                                                                        i31 = i30;
                                                                        break;
                                                                    case 89 :
                                                                        Test.iArrFld[i38] = ((int) (12966L));
                                                                        i31 *= i31;
                                                                        i39 -= i28;
                                                                        if (Test.bFld)
                                                                            break;

                                                                        i28 += i38 ^ s2;
                                                                        break;
                                                                    case 95 :
                                                                        i37 += ((i38 * s2) + Test.fFld) - iFld2;
                                                                        break;
                                                                    default :
                                                                        if (Test.bFld)
                                                                            break;

                                                                }
                                                                break;
                                                            case 48 :
                                                                try {
                                                                    iFld2 = i31 % i27;
                                                                    i37 = (-842977035) / i36;
                                                                    i31 = i36 % i39;
                                                                } catch (ArithmeticException a_e) {
                                                                }
                                                                break;
                                                            case 49 :
                                                                Test.instanceCount >>= 24754L;
                                                                break;
                                                            default :
                                                                Test.sFld &= ((short) (-11991));
                                                        }
                                                        break;
                                                    case 120 :
                                                        Test.instanceCount -= ((long) (Test.fFld));
                                                        break;
                                                    case 93 :
                                                        Test.instanceCount /= -1;
                                                        break;
                                                    case 104 :
                                                        if (Test.bFld)
                                                            continue;

                                                        break;
                                                    case 91 :
                                                        Test.fFld *= i32;
                                                        break;
                                                    case 101 :
                                                        Test.instanceCount &= Test.iFld;
                                                    case 115 :
                                                        i35 = ((int) (Test.instanceCount));
                                                        break;
                                                    case 103 :
                                                        i37 = i36;
                                                    case 88 :
                                                        Test.iFld = -7;
                                                        break;
                                                    case 125 :
                                                        if (Test.bFld)
                                                            break;

                                                        break;
                                                    default :
                                                        i37 += i38;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    iFld2 *= 14;
                                }
                                break;
                            case 85 :
                                iFld1 += i29 * i29;
                            case 64 :
                                byArr1 = FuzzerUtils.byte1array(N, ((byte) (-127)));
                                break;
                            case 65 :
                                Test.iArrFld[i27 - 1] = ((int) (6022043601881749996L));
                                break;
                        }
                        break;
                    case 41 :
                        iFld2 += i29 - by3;
                        break;
                    case 25 :
                        iFld1 += i29 + i30;
                        break;
                    case 44 :
                        i28 = i34;
                        break;
                    case 30 :
                        Test.iArrFld[i27 - 1] = i39;
                    case 31 :
                        i35 = iFld1;
                        break;
                    case 27 :
                        Test.instanceCount += i29;
                    case 56 :
                        Test.sFld = ((short) (Test.instanceCount));
                        break;
                    case 57 :
                        iFld1 += i29 + iFld1;
                        break;
                    case 18 :
                        i35 = iFld2;
                        break;
                    default :
                        i37 = ((int) (Test.instanceCount));
                }
            }
        }
        FuzzerUtils.out.println((((("i27 i28 i29 = " + i27) + ",") + i28) + ",") + i29);
        FuzzerUtils.out.println((((("i30 i31 i32 = " + i30) + ",") + i31) + ",") + i32);
        FuzzerUtils.out.println((((("i33 i34 i35 = " + i33) + ",") + i34) + ",") + i35);
        FuzzerUtils.out.println((((("by3 i36 i37 = " + by3) + ",") + i36) + ",") + i37);
        FuzzerUtils.out.println((((("i38 i39 s2 = " + i38) + ",") + i39) + ",") + s2);
        FuzzerUtils.out.println((((("b2 lArr1 byArr1 = " + (b2 ? 1 : 0)) + ",") + FuzzerUtils.checkSum(lArr1)) + ",") + FuzzerUtils.checkSum(byArr1));
        FuzzerUtils.out.println((((("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount) + ",") + Test.iFld) + ",") + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println((((("Test.dFld Test.bFld iFld1 = " + Double.doubleToLongBits(Test.dFld)) + ",") + (Test.bFld ? 1 : 0)) + ",") + iFld1);
        FuzzerUtils.out.println((((("iFld2 Test.sFld Test.iArrFld = " + iFld2) + ",") + Test.sFld) + ",") + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.iArrFld1 = " + FuzzerUtils.checkSum(Test.iArrFld1));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                {
                    final short ax$35 = Test.sFld;
                    final int ax$36 = i;
                    try {
                        for (int ax$29 = -165; ax$29 < (-165 + 13089); ax$29 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                do {
                                    i += Integer.bitCount(sFld);
                                } while ((++sFld) != 0 );
                            } catch (Throwable ax$32) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            Test.ax$25 = true;
                            _instance.mainTest(new String[]{ "s", "s", "s", "s", "s", "s", "s" });
                            Test.ax$25 = false;
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                SocketPermission ax$33 = new SocketPermission("*", "connect , accept");
                            } catch (Throwable ax$34) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        Test.sFld = ax$35;
                        i = ax$36;
                    }
                }
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public static final class AxOutputRedirectionHelper {
        private static final PrintStream devNull = new PrintStream(new OutputStream() {
            @Override
            public void write(int i) throws IOException {
            }
        });

        private static final PrintStream stdOutBk = System.out;

        private static final PrintStream stdErrBk = System.err;

        public static void redirect() {
            System.setOut(AxOutputRedirectionHelper.devNull);
            System.setErr(AxOutputRedirectionHelper.devNull);
        }

        public static void recover() {
            System.setOut(AxOutputRedirectionHelper.stdOutBk);
            System.setErr(AxOutputRedirectionHelper.stdErrBk);
        }
    }

    static Boolean ax$14 = false;

    static Boolean ax$25 = false;
}