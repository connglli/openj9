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
import java.util.List;

public class Test {
    public static final int N = 256;

    public static long instanceCount = -5302240318170779965L;

    public static byte byFld = 64;

    public static int iFld = -48927;

    public static float fFld = 101.79F;

    public static short sFld = -24580;

    public short sFld1 = -24755;

    public static int iArrFld[] = new int[N];

    public static long lArrFld[] = new long[N];

    public volatile double dArrFld[] = new double[N];

    public short sArrFld[] = new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 6);
        FuzzerUtils.init(Test.lArrFld, -9L);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l3) {
        int i2 = 186;
        int i3 = 36;
        int i4 = -3;
        int i5 = 58708;
        int i6 = -9;
        int i7 = 0;
        int i8 = -86;
        int i9 = 39727;
        int i10 = -45102;
        int i11 = -5;
        boolean b = false;
        float f1 = 66.147F;
        float fArr[] = new float[N];
        double d = 0.42757;
        FuzzerUtils.init(fArr, 1.925F);
        Test.iFld -= Test.iFld;
        Test.instanceCount = Test.iFld;
        Test.iFld = ((int) (1.20026));
        for (i2 = 8; i2 < 249; ++i2) {
            for (i4 = 1; i4 < 3; i4 += 3) {
                i3 = i2;
                i6 = 1;
                do {
                    i5 = i6;
                    i3 += -1;
                    b = b;
                    i5 >>>= ((int) (Test.instanceCount));
                    i5 <<= ((int) (l3));
                    i5 += i6 + f1;
                    i3 = ((int) (l3));
                    i5 <<= Test.iFld;
                } while ((++i6) < 3 );
                switch ((i2 % 2) + 102) {
                    case 102 :
                        for (i7 = 3; i7 > 1; --i7) {
                            f1 *= i3;
                            i3 -= ((int) (f1));
                            i5 ^= ((int) (-6984332267585696537L));
                            i8 = ((int) (Test.instanceCount));
                            i3 -= ((int) (d));
                            Test.instanceCount -= i5;
                            d -= i5;
                            i5 = i2;
                        }
                        d = l3;
                        i3 *= Test.byFld;
                        Test.byFld >>= ((byte) (i6));
                        for (i9 = 1; 3 > i9; i9++) {
                            i8 += ((i9 * i8) + i6) - Test.instanceCount;
                            i8 += -202;
                            i10 *= i2;
                            Test.iFld *= Test.byFld;
                            switch (((i9 % 5) * 5) + 43) {
                                case 64 :
                                    if (b)
                                        continue;

                                    fArr[i2 + 1] *= 0.425F;
                                    Test.iFld += i9 | i7;
                                    break;
                                case 52 :
                                    i5 *= 38447;
                                    break;
                                case 67 :
                                    Test.iFld -= ((int) (f1));
                                    break;
                                case 54 :
                                    Test.iFld = i9;
                                    break;
                                case 60 :
                                    Test.iArrFld[i2] >>= i11;
                                    break;
                                default :
                                    i8 += i9;
                            }
                        }
                        break;
                    case 103 :
                        i11 = -204;
                        break;
                    default :
                        Test.iArrFld = Test.iArrFld;
                }
            }
        }
        vMeth2_check_sum += (((((((((((((l3 + i2) + i3) + i4) + i5) + i6) + (b ? 1 : 0)) + Float.floatToIntBits(f1)) + i7) + i8) + Double.doubleToLongBits(d)) + i9) + i10) + i11) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(long l1, int i1, long l2) {
        boolean b1 = false;
        int i12 = -98;
        int i13 = 12;
        int i14 = -1;
        short s = -27270;
        l1 += i1;
        l2 = Math.abs(++i1) + (++i1);
        vMeth2(l1);
        Test.fFld *= i1;
        b1 = b1;
        Test.lArrFld = Test.lArrFld;
        i12 = 1;
        while ((++i12) < 102) {
            try {
                Test.iFld = Test.iFld % Test.iArrFld[i12];
                i1 = Test.iFld / Test.iArrFld[i12];
                Test.iFld = (-226) / i12;
            } catch (ArithmeticException a_e) {
            }
            Test.iArrFld[i12 - 1] = Test.iFld;
            Test.fFld -= Test.iFld;
            Test.iFld = -24840;
            i1 += i12 * i12;
            l1 = Test.byFld;
            Test.iFld += i12 ^ Test.byFld;
            for (i13 = 5; i13 > i12; i13--) {
                try {
                    i14 = i14 % 971743169;
                    Test.iArrFld[i12 + 1] = i12 / 18336;
                    Test.iFld = (-55846) / i1;
                } catch (ArithmeticException a_e) {
                }
                Test.fFld += i14;
                Test.iArrFld[i13 - 1] >>= -8094;
                {
                    try {
                        byte[] ax$6 = new byte[0];
                        byte[] ax$7 = new byte[5];
                        byte[] ax$8 = new byte[]{ ((byte) (-103)), ((byte) (13)), ((byte) (-23)), ((byte) (98)), ((byte) (48)), ((byte) (-90)), ((byte) (-2)), ((byte) (107)) };
                        List<String> ax$11 = null;
                        StringBuffer ax$12 = new StringBuffer("banach");
                        boolean ax$5 = false;
                        for (int ax$4 = -895; ax$4 < (-895 + 19625); ax$4 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$9 = 0; ax$9 < ax$8.length; ax$9 += 1) {
                                    ax$8[ax$9] = ((byte) (ax$6[ax$9] + ax$7[ax$9]));
                                }
                            } catch (Throwable ax$10) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            if (!ax$5) {
                                Test.lArrFld[i13 + 1] = i13;
                                ax$5 = true;
                            }
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                try {
                                    ax$12.insert(ax$12.length() + 1, ax$11);
                                } catch (StringIndexOutOfBoundsException ax$13) {

                                } catch (Throwable ax$14) {
                                }
                            } catch (Throwable ax$15) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                    }
                }
                l2 += i13;
                i14 += i13 * i13;
                i1 = i14;
                l1 += i13;
                i1 += i13 * i13;
            }
            Test.instanceCount -= ((long) (Test.fFld));
        } 
        Test.iFld = i12;
        Test.iFld >>>= s;
        vMeth1_check_sum += ((((((l1 + i1) + l2) + (b1 ? 1 : 0)) + i12) + i13) + i14) + s;
    }

    public static void vMeth(long l, int i) {
        float f = -35.442F;
        int i15 = -167;
        int i16 = -54;
        int i17 = 39449;
        int i18 = 6907;
        int i19 = -17815;
        int i20 = 10;
        int i21 = 49;
        int i22 = -1;
        int i23 = 42383;
        int i24 = 6;
        long l4 = 0L;
        long l5 = -1011547144L;
        double d1 = -119.49873;
        double d2 = 0.63202;
        double dArr[] = new double[N];
        FuzzerUtils.init(dArr, -37.71403);
        Test.iArrFld[(i >>> 1) % N] <<= ((int) (i = ((int) (f - (i + Test.byFld)))));
        vMeth1(Test.instanceCount, i, 24631L);
        i15 = 1;
        do {
            l4 *= l;
        } while ((++i15) < 250 );
        Test.lArrFld[(i >>> 1) % N] -= Test.iFld;
        Test.byFld = ((byte) (Test.sFld));
        for (d1 = 1; d1 < 89; ++d1) {
            boolean b2 = true;
            Test.iArrFld = Test.iArrFld;
            switch (((int) (((d1 % 5) * 5) + 31))) {
                case 32 :
                    Test.iArrFld[((int) (d1 + 1))] *= i15;
                    Test.sFld = ((short) (Test.iFld));
                    l4 = i15;
                    for (i17 = 1; 6 > i17; ++i17) {
                        i18 <<= i16;
                        l4 += i17;
                        Test.iArrFld = Test.iArrFld;
                        i16 -= ((int) (610417403L));
                    }
                    i += Test.iFld;
                    break;
                case 34 :
                case 52 :
                    i += ((int) (((d1 * Test.instanceCount) + l) - i18));
                    dArr[((int) (d1 + 1))] += l;
                case 56 :
                    switch (((int) (((d1 % 10) * 5) + 72))) {
                        case 81 :
                            i19 = 1;
                            while ((++i19) < 6) {
                                Test.lArrFld[((int) (d1 - 1))] -= ((long) (f));
                            } 
                            i18 -= ((int) (f));
                            Test.iFld = ((int) (Test.fFld));
                            if (b2)
                                break;

                            i18 += ((int) (((d1 * Test.byFld) + i18) - i18));
                            for (i20 = 1; 6 > i20; i20++) {
                                for (i22 = ((int) (d1)); i22 < 2; i22++) {
                                    i23 <<= -29972;
                                    {
                                        final boolean ax$3 = b2;
                                        try {
                                            for (int ax$0 = -322; ax$0 < (-322 + 2537); ax$0 += 1) {
                                                Test.AxOutputRedirectionHelper.redirect();
                                                try {
                                                    if (b2) {
                                                    }
                                                } catch (Throwable ax$2) {
                                                } finally {
                                                }
                                                Test.AxOutputRedirectionHelper.recover();
                                            }
                                        } finally {
                                            b2 = ax$3;
                                        }
                                    }
                                    Test.instanceCount += 1;
                                    l *= i20;
                                }
                                i23 += i19;
                                i16 = ((int) (Test.instanceCount));
                                for (l5 = 1; l5 < 2; ++l5) {
                                    Test.byFld += ((byte) (((l5 * Test.byFld) + Test.instanceCount) - l5));
                                    Test.iArrFld[i20] += -74;
                                }
                            }
                        case 97 :
                            i24 += ((int) (l5));
                        case 91 :
                            i21 -= i;
                        case 115 :
                            i23 *= Test.iFld;
                            break;
                        case 113 :
                            Test.iArrFld[((int) (d1 - 1))] += i;
                            break;
                        case 78 :
                            f = i22;
                        case 92 :
                            Test.iFld |= i24;
                        case 85 :
                            Test.iFld += ((int) (-223L));
                            break;
                        case 110 :
                            i16 = Test.iFld;
                            break;
                        case 94 :
                            i23 -= i18;
                        default :
                            Test.fFld -= i17;
                    }
                    break;
                case 45 :
                default :
                    d2 = d1;
            }
        }
        vMeth_check_sum += ((((((((((((((((l + i) + Float.floatToIntBits(f)) + i15) + l4) + Double.doubleToLongBits(d1)) + i16) + i17) + i18) + i19) + i20) + i21) + i22) + i23) + l5) + i24) + Double.doubleToLongBits(d2)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {
        int i25 = -145;
        int i26 = 6350;
        int i27 = -3;
        int i28 = 9;
        int i29 = -14388;
        int i30 = -137;
        int i31 = 391;
        int i32 = 186;
        int i33 = 25176;
        int i34 = -10;
        int i35 = 5;
        int i36 = -10;
        int i37 = -31836;
        int i38 = -7;
        int i39 = -14;
        int i40 = 9;
        int i41 = 52694;
        double d3 = 0.130215;
        boolean b3 = false;
        float f2 = 0.696F;
        float fArr1[] = new float[N];
        FuzzerUtils.init(fArr1, -41.995F);
        vMeth(Test.instanceCount, Test.iFld);
        Test.instanceCount -= Test.iFld;
        Test.iFld = 6;
        Test.iArrFld[(Test.iFld >>> 1) % N] <<= ((int) (Test.instanceCount));
        Test.iArrFld[(20834 >>> 1) % N] += 4114;
        Test.instanceCount = -9;
        for (i25 = 4; 107 > i25; ++i25) {
            i26 += i25;
            fArr1[i25 - 1] += ((float) (d3));
        }
        Test.fFld += Test.fFld;
        Test.iFld = Test.iFld;
        Test.lArrFld[(Test.iFld >>> 1) % N] += Test.iFld;
        for (i27 = 8; i27 < 197; ++i27) {
            switch (((i28 >>> 1) % 7) + 105) {
                case 105 :
                    if (b3)
                        break;

                    Test.iArrFld[i27 - 1] += -50;
                    switch (((i27 % 6) * 5) + 32) {
                        case 45 :
                            Test.instanceCount += i27 * i27;
                            for (i29 = 1; i29 < 27; i29++) {
                                i30 -= i28;
                                Test.iArrFld[i27 - 1] -= ((int) (-7.866F));
                                i28 >>>= ((int) (Test.instanceCount));
                                i28 += i29;
                                i28 += Test.byFld;
                                for (f2 = 1; f2 < 2; f2++) {
                                    i30 += ((int) (3527183456L));
                                    if (true) {
                                        Test.iFld = Test.iFld;
                                        Test.iArrFld[((int) (f2))] += ((int) (57.686F));
                                    }
                                    i28 -= Test.iFld;
                                    Test.sFld += ((short) (((f2 * Test.instanceCount) + f2) - Test.instanceCount));
                                    i31 >>>= i27;
                                    Test.iArrFld[((int) (f2))] = -200;
                                    Test.instanceCount += ((long) (((f2 * Test.instanceCount) + Test.instanceCount) - i31));
                                    i26 &= Test.iFld;
                                    dArrFld = dArrFld;
                                }
                                Test.instanceCount += Test.iFld;
                            }
                            break;
                        case 49 :
                            d3 += -27967;
                            Test.iArrFld[i27] += i27;
                            if (b3) {
                                for (i32 = i27; i32 < 27; ++i32) {
                                    fArr1[i27] *= i25;
                                }
                                for (i34 = 1; 27 > i34; i34++) {
                                    Test.instanceCount = Test.instanceCount;
                                    Test.instanceCount -= ((long) (d3));
                                    i26 = ((int) (-48.52589));
                                }
                                Test.iArrFld[i27 + 1] = -5;
                                switch (((i31 >>> 1) % 4) + 104) {
                                    case 104 :
                                        for (i36 = 27; i36 > 1; i36--) {
                                            Test.fFld += Test.instanceCount;
                                            for (i38 = 1; i38 < 2; ++i38) {
                                                i31 >>= i34;
                                                Test.sFld = ((short) (i39));
                                                Test.fFld += Test.instanceCount;
                                                i37 -= -58;
                                                i30 *= i32;
                                            }
                                            Test.lArrFld[i36 - 1] *= Test.instanceCount;
                                            if (b3) {
                                                Test.lArrFld[i27 - 1] -= i28;
                                                i37 += ((i36 * i34) + i25) - Test.instanceCount;
                                                Test.iArrFld[i27 - 1] = -245;
                                                i39 -= i30;
                                                sFld1 = ((short) (Test.instanceCount));
                                                for (i40 = 1; 2 > i40; i40++) {
                                                    Test.iFld >>>= i32;
                                                    Test.instanceCount <<= Test.instanceCount;
                                                    Test.iFld = i36;
                                                    i37 += ((int) (Test.instanceCount));
                                                    Test.iArrFld[i27] += ((int) (Test.instanceCount));
                                                    if (b3)
                                                        continue;

                                                    i31 += i40;
                                                    i31 |= i40;
                                                    sArrFld[i40] = ((short) (Test.instanceCount));
                                                    fArr1[i36] = i32;
                                                    Test.iArrFld[i40 + 1] = ((int) (Test.instanceCount));
                                                }
                                            } else if (b3) {
                                                d3 = Test.instanceCount;
                                            } else if (b3) {
                                                Test.instanceCount += (-8) + (i36 * i36);
                                            } else if (b3)
                                                continue;

                                        }
                                        break;
                                    case 105 :
                                        i30 += i27 - Test.instanceCount;
                                        break;
                                    case 106 :
                                        Test.instanceCount -= Test.instanceCount;
                                        break;
                                    case 107 :
                                        fArr1[i27] -= Test.iFld;
                                        break;
                                }
                            } else {
                                i30 >>= ((int) (Test.instanceCount));
                            }
                        case 33 :
                            Test.instanceCount -= i30;
                            break;
                        case 54 :
                            Test.byFld *= ((byte) (d3));
                        case 40 :
                            Test.sFld *= ((short) (Test.instanceCount));
                            break;
                        case 39 :
                            sFld1 |= ((short) (Test.instanceCount));
                            break;
                        default :
                            i28 += i27 - Test.instanceCount;
                    }
                case 106 :
                    Test.fFld += ((float) (d3));
                    break;
                case 107 :
                    i26 *= 86;
                    break;
                case 108 :
                    Test.fFld = i30;
                case 109 :
                    Test.instanceCount += ((i27 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount;
                case 110 :
                    i35 *= ((int) (Test.instanceCount));
                    break;
                case 111 :
                    Test.instanceCount = Test.instanceCount;
                default :
                    i41 -= ((int) (-16.694F));
            }
        }
        FuzzerUtils.out.println((((("i25 i26 d3 = " + i25) + ",") + i26) + ",") + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println((((("i27 i28 b3 = " + i27) + ",") + i28) + ",") + (b3 ? 1 : 0));
        FuzzerUtils.out.println((((("i29 i30 f2 = " + i29) + ",") + i30) + ",") + Float.floatToIntBits(f2));
        FuzzerUtils.out.println((((("i31 i32 i33 = " + i31) + ",") + i32) + ",") + i33);
        FuzzerUtils.out.println((((("i34 i35 i36 = " + i34) + ",") + i35) + ",") + i36);
        FuzzerUtils.out.println((((("i37 i38 i39 = " + i37) + ",") + i38) + ",") + i39);
        FuzzerUtils.out.println((((("i40 i41 fArr1 = " + i40) + ",") + i41) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));
        FuzzerUtils.out.println((((("Test.instanceCount Test.byFld Test.iFld = " + Test.instanceCount) + ",") + Test.byFld) + ",") + Test.iFld);
        FuzzerUtils.out.println((((("Test.fFld Test.sFld sFld1 = " + Float.floatToIntBits(Test.fFld)) + ",") + Test.sFld) + ",") + sFld1);
        FuzzerUtils.out.println((((("Test.iArrFld Test.lArrFld dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld)) + ",") + FuzzerUtils.checkSum(Test.lArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("sArrFld = " + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
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
}