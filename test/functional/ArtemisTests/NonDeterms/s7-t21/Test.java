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

public class Test {
    public static final int N = 256;

    public static volatile long instanceCount = -3702474144L;

    public static double dFld = -52.128832;

    public static int iFld = -204;

    public static byte byFld = 64;

    public boolean bFld = true;

    public static int iArrFld[] = new int[N];

    public static volatile int iArrFld1[] = new int[N];

    public static float fArrFld[] = new float[N];

    public static double dArrFld[] = new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 26127);
        FuzzerUtils.init(Test.iArrFld1, 9);
        FuzzerUtils.init(Test.fArrFld, 1.359F);
        FuzzerUtils.init(Test.dArrFld, 0.7953);
    }

    public static long vMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static int iMeth() {
        int i3 = -11;
        Test.dFld = Test.iArrFld[(i3 >>> 1) % N];
        long meth_res = i3;
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth2(int i12, int i13, long l1) {
        float f1 = 111.253F;
        float f2 = 43.103F;
        int i14 = -21378;
        int i15 = 232;
        int i16 = -11;
        int i17 = -232;
        int i18 = -6;
        int i19 = -13;
        int i20 = -237;
        short s = 32663;
        short sArr[] = new short[N];
        byte by1 = 110;
        boolean b1 = false;
        long lArr[] = new long[N];
        FuzzerUtils.init(sArr, ((short) (20694)));
        FuzzerUtils.init(lArr, 5963388229626410365L);
        sArr[((-158) >>> 1) % N] *= ((short) (f1));
        i12 |= i12;
        i14 = 1;
        while ((++i14) < 114) {
            i13 -= i12;
            for (i15 = i14; i15 < 5; i15++) {
                Test.instanceCount -= i13;
            }
        } 
        Test.iArrFld1[(i13 >>> 1) % N] *= s;
        for (i17 = 234; 7 < i17; i17 -= 2) {
            lArr[i17 - 1] = Test.instanceCount;
            for (i19 = 1; 5 > i19; ++i19) {
                i18 += ((i19 * Test.instanceCount) + f1) - i14;
                Test.iArrFld[i19 - 1] = i18;
                Test.iArrFld1 = Test.iArrFld1;
                Test.iArrFld[i17 - 1] -= i17;
                i18 -= ((int) (-4L));
                i16 = i15;
                i12 = -6;
                f1 += l1;
                f1 -= s;
                f2 = 1;
                while ((++f2) < 2) {
                    f1 += i19;
                    Test.iArrFld1[i17 + 1] = i15;
                    l1 += ((long) (((f2 * by1) + Test.instanceCount) - i15));
                    if (b1)
                        continue;

                    f1 += ((f2 * i20) + i17) - Test.instanceCount;
                    i16 -= i14;
                    i12 -= ((int) (Test.dFld));
                    l1 -= 24646;
                    s *= ((short) (f2));
                    if (i20 != 0) {
                        vMeth2_check_sum += (((((((((((((((i12 + i13) + l1) + Float.floatToIntBits(f1)) + i14) + i15) + i16) + s) + i17) + i18) + i19) + i20) + Float.floatToIntBits(f2)) + by1) + (b1 ? 1 : 0)) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                } 
                lArr[i17 + 1] = s;
                Test.instanceCount = i14;
                if (b1)
                    break;

                i12 >>= i14;
                i13 += ((i19 * i19) + i15) - i14;
            }
            i13 = 13;
            l1 -= ((long) (Test.dFld));
        }
        vMeth2_check_sum += (((((((((((((((i12 + i13) + l1) + Float.floatToIntBits(f1)) + i14) + i15) + i16) + s) + i17) + i18) + i19) + i20) + Float.floatToIntBits(f2)) + by1) + (b1 ? 1 : 0)) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(long l, int i8) {
        int i9 = 142;
        int i10 = -11;
        int i11 = 61225;
        int i21 = 9;
        int i22 = -41425;
        int i23 = -7;
        int i24 = 17739;
        int i25 = 12;
        int i26 = 2747;
        int i27 = -85;
        int i28 = 11;
        int iArr1[] = new int[N];
        long l2 = 222L;
        long l3 = -227L;
        long lArr1[] = new long[N];
        byte by2 = -124;
        byte byArr[] = new byte[N];
        boolean b2 = true;
        boolean bArr[][] = new boolean[N][N];
        float f3 = -56.467F;
        float f4 = 70.854F;
        FuzzerUtils.init(lArr1, -2342763279L);
        FuzzerUtils.init(iArr1, 170);
        FuzzerUtils.init(byArr, ((byte) (-113)));
        FuzzerUtils.init(bArr, false);
        l *= --i8;
        for (i9 = 2; i9 < 126; ++i9) {
            i8 += i9 * i9;
            i11 = 1;
            while ((++i11) < 5) {
                vMeth2(i9, i8, Test.instanceCount);
                Test.iArrFld[i9] >>= 237;
                Test.instanceCount += 467 + (i11 * i11);
            } 
            {
                final int ax$29 = i27;
                try {
                    Float ax$24 = 0.9977875F;
                    Float ax$25 = 0.07245529F;
                    boolean ax$23 = false;
                    for (int ax$22 = -66; ax$22 < (-66 + 5285); ax$22 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            ax$25 = ax$25 + 1.0F;
                            ax$24 = ax$24 + 2.0F;
                        } catch (Throwable ax$26) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                        if (!ax$23) {
                            i10 >>= ((int) (Test.instanceCount));
                            ax$23 = true;
                        }
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            i27++;
                        } catch (Throwable ax$28) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                    }
                } finally {
                    i27 = ax$29;
                }
            }
            i10 += i10;
            lArr1[i9 - 1] += i9;
            i21 = 1;
            while ((++i21) < 5) {
                for (l2 = 1; 1 > l2; l2++) {
                    i8 -= -8454;
                    iArr1[((int) (l2))] -= by2;
                    i22 = i10;
                    i22 = ((int) (l3));
                    b2 = b2;
                    i10 -= ((int) (Test.dFld));
                    lArr1[i21 - 1] *= i11;
                    byArr[i9] >>= ((byte) (i22));
                    Test.fArrFld[((int) (l2 + 1))] = 0L;
                    l3 >>= i22;
                }
                if (true)
                    break;

                if (i21 != 0) {
                    vMeth1_check_sum += (((((((((((((((((((((l + i8) + i9) + i10) + i11) + i21) + l2) + i22) + by2) + l3) + (b2 ? 1 : 0)) + i23) + i24) + i25) + i26) + i27) + Float.floatToIntBits(f3)) + i28) + Float.floatToIntBits(f4)) + FuzzerUtils.checkSum(lArr1)) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(byArr)) + FuzzerUtils.checkSum(bArr);
                    return;
                }
                Test.iFld = -11;
                try {
                    i10 = 1840 % i10;
                    i8 = Test.iFld / 10491;
                    i10 = 26284 % i21;
                } catch (ArithmeticException a_e) {
                }
            } 
            i23 = 5;
            while ((--i23) > 0) {
                Test.fArrFld[i23 - 1] *= l2;
                bArr[i23 - 1][i23 - 1] = false;
            } 
        }
        i10 *= 13;
        for (i24 = 105; i24 > 6; i24 -= 3) {
            for (i26 = i24; i26 < 16; ++i26) {
                try {
                    i25 = (-1887795447) / i25;
                    Test.iArrFld1[i24 - 1] = (-2109760247) % i23;
                    i8 = i23 % 24224;
                } catch (ArithmeticException a_e) {
                }
                for (f3 = i26; f3 < 1; ++f3) {
                    Test.dFld *= i25;
                    f4 += ((f3 * i22) + i22) - Test.instanceCount;
                    l >>= i28;
                }
            }
        }
        vMeth1_check_sum += (((((((((((((((((((((l + i8) + i9) + i10) + i11) + i21) + l2) + i22) + by2) + l3) + (b2 ? 1 : 0)) + i23) + i24) + i25) + i26) + i27) + Float.floatToIntBits(f3)) + i28) + Float.floatToIntBits(f4)) + FuzzerUtils.checkSum(lArr1)) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(byArr)) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(int i2) {
        if (Test.ax$6) {
            final int ax$14 = i2;
            final int ax$13 = Test.iFld;
            int[] ax$8 = new int[]{ -1631850106, 325787511, -1842340554, 1583762050 };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                iFld += ax$8[i2];
                int ax$11 = iFld;
                iFld = i2;
                i2 = ax$11;
            } catch (Throwable ax$12) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            Test.iFld = ax$13;
            i2 = ax$14;
            return;
        }
        float f = 0.569F;
        byte by = 2;
        int i4 = -249;
        int i5 = 62590;
        int i6 = -5;
        int i7 = -31384;
        int i29 = -63078;
        boolean b = true;
        short s1 = 16613;
        long l4 = 3797464346L;
        Test.instanceCount -= ((long) (iMeth() * (iMeth() + (f + i2))));
        Test.instanceCount = (-3) | ((long) (iMeth() * (by - (-90.82212))));
        if (true) {
            i4 = 116;
            do {
                i5 = 1;
                while ((++i5) < 5) {
                    Test.iArrFld[i4 - 1] *= ((int) (i2 = ((int) (Math.abs(i4 + Test.instanceCount)))));
                    Test.iArrFld[i5 - 1] <<= iMeth();
                    Test.iArrFld[i4 - 1] -= iMeth();
                    for (i6 = 1; 1 > i6; i6++) {
                        if (b)
                            continue;

                        i7 -= ((int) ((-Math.max(-10, 20)) + Test.instanceCount));
                        Test.iArrFld[i4] += ((int) (f));
                        f += ((i6 * i6) + i4) - i6;
                        vMeth1(4L, -5);
                        Test.iArrFld1[(Test.iFld >>> 1) % N] += i5;
                        Test.instanceCount += ((i6 * i6) + Test.iFld) - Test.instanceCount;
                        Test.fArrFld = Test.fArrFld;
                        Test.iFld += ((int) (77.515F + (i6 * i6)));
                    }
                    i2 = 228;
                    f -= i4;
                    Test.dFld *= Test.iFld;
                    Test.iArrFld[i4 + 1] %= ((int) (i5 | 1));
                    Test.instanceCount += ((i5 * Test.instanceCount) + i2) - i7;
                    Test.iArrFld[i4 - 1] /= ((int) (s1 | 1));
                    Test.iFld += i4;
                    s1 += ((short) (i5 | i5));
                    for (l4 = 1; l4 < 1; l4 += 2) {
                        Test.iArrFld[i5 - 1] /= ((int) (i4 | 1));
                        Test.iFld *= i4;
                    }
                    i7 = i2;
                    Test.instanceCount += i5;
                } 
                if (true)
                    break;

                Test.instanceCount = i29;
                if (b) {
                    i2 = ((int) (Test.dFld));
                }
                Test.iArrFld = Test.iArrFld;
                Test.instanceCount = i2;
            } while ((--i4) > 0 );
        }
        vMeth_check_sum += (((((((((i2 + Float.floatToIntBits(f)) + by) + i4) + i5) + i6) + i7) + (b ? 1 : 0)) + s1) + l4) + i29;
    }

    public void mainTest(String[] strArr1) {
        int i = 10;
        int i1 = 10;
        int i30 = 8;
        int i31 = 110;
        int i32 = -4817;
        int i33 = 12587;
        int iArr[] = new int[N];
        float f5 = 18.134F;
        float f6 = 2.183F;
        long lArr2[] = new long[N];
        short sArr1[] = new short[N];
        FuzzerUtils.init(iArr, -40692);
        FuzzerUtils.init(lArr2, 2403585422L);
        FuzzerUtils.init(sArr1, ((short) (-32547)));
        for (i = 8; i < 241; ++i) {
            iArr[i] = --i1;
            switch ((i % 7) + 76) {
                case 76 :
                    {
                        final double ax$21 = Test.dFld;
                        try {
                            String ax$17 = "s";
                            for (int ax$15 = -440; ax$15 < (-440 + 7691); ax$15 += 1) {
                                Test.AxOutputRedirectionHelper.redirect();
                                try {
                                    if (dFld != dFld) {
                                    }
                                } catch (Throwable ax$19) {
                                } finally {
                                }
                                Test.AxOutputRedirectionHelper.recover();
                                Test.ax$6 = true;
                                vMeth(642531827);
                                Test.ax$6 = false;
                                Test.AxOutputRedirectionHelper.redirect();
                                try {
                                    Thread.currentThread().interrupted();
                                } catch (Throwable ax$20) {
                                } finally {
                                }
                                Test.AxOutputRedirectionHelper.recover();
                            }
                        } finally {
                            Test.dFld = ax$21;
                        }
                    }
                    vMeth(Test.iFld);
                    iArr[i] = 29499;
                    i1 ^= i1;
                    for (i30 = 1; i30 < 22; i30++) {
                        iArr[i30 - 1] = i30;
                        if (true)
                            break;

                        i1 *= i1;
                        f5 = 1;
                        while ((++f5) < 2) {
                            short s2 = -24904;
                            Test.fArrFld[((int) (f5 - 1))] -= i1;
                            i1 >>>= 5356;
                            s2 >>= Test.byFld;
                            i31 = ((int) (Test.instanceCount));
                            lArr2[i] = i;
                            Test.iFld += ((int) (((long) (f5)) ^ ((long) (f5))));
                            i31 /= 97;
                            switch ((i % 5) + 44) {
                                case 44 :
                                    Test.iFld += i31;
                                    i1 >>>= 23165;
                                    iArr[((int) (f5 - 1))] = i1;
                                    i1 *= Test.iFld;
                                    Test.iArrFld[i30] = i1;
                                    f6 += f5 + Test.instanceCount;
                                    Test.dFld += Test.byFld;
                                    Test.dFld = s2;
                                    i1 = i;
                                    i31 -= ((int) (-159L));
                                    if (bFld)
                                        continue;

                                    break;
                                case 45 :
                                    Test.instanceCount += ((long) (f5));
                                    Test.iArrFld1[i30 - 1] = i1;
                                    i31 += i;
                                    break;
                                case 46 :
                                    Test.iFld += i1;
                                case 47 :
                                    Test.instanceCount += ((long) (f5 - i));
                                    Test.iFld <<= i31;
                                    i31 = i1;
                                    Test.instanceCount = i30;
                                    switch ((((-117) >>> 1) % 5) + 5) {
                                        case 5 :
                                            Test.instanceCount -= i1;
                                            Test.dArrFld[i30 + 1] += Test.iFld;
                                            f6 += f5 + f5;
                                            i31 *= Test.iFld;
                                            f6 += f5;
                                            i31 -= Test.iFld;
                                            if (true)
                                                break;

                                            i31 += 65146 + (f5 * f5);
                                            Test.instanceCount >>= i;
                                            Test.iArrFld[i30] = 104;
                                            i1 = ((int) (Test.instanceCount));
                                            s2 = ((short) (i1));
                                            sArr1[((int) (f5 - 1))] >>= ((short) (-3));
                                            i1 -= i;
                                            break;
                                        case 6 :
                                            Test.instanceCount <<= i30;
                                            lArr2[((int) (f5 - 1))] -= ((long) (f6));
                                            Test.instanceCount -= s2;
                                            Test.instanceCount -= ((long) (Test.dFld));
                                            i1 = -2508;
                                            lArr2[i30 - 1] = ((long) (f6));
                                            switch (((int) ((f5 % 2) + 56))) {
                                                case 56 :
                                                    Test.dFld -= i31;
                                                    Test.dFld *= Test.instanceCount;
                                                    try {
                                                        Test.iArrFld[((int) (f5))] = 1112786996 / Test.iArrFld1[i30 - 1];
                                                        iArr[i] = (-209) / Test.iFld;
                                                        i31 = Test.iArrFld1[((int) (f5 + 1))] / 199;
                                                    } catch (ArithmeticException a_e) {
                                                    }
                                                    if (bFld)
                                                        continue;

                                                    lArr2[((int) (f5))] = Test.instanceCount;
                                                    switch ((((i31 >>> 1) % 9) * 5) + 57) {
                                                        case 85 :
                                                            Test.instanceCount = i;
                                                            break;
                                                        case 80 :
                                                            Test.instanceCount <<= Test.byFld;
                                                            Test.iArrFld = iArr;
                                                            Test.instanceCount += ((long) (f5));
                                                            iArr[i30 + 1] = ((int) (-109.115312));
                                                            break;
                                                        case 101 :
                                                            i1 = i31;
                                                            i32 += ((int) (f5));
                                                            i32 = 1;
                                                        case 84 :
                                                            Test.byFld = ((byte) (i32));
                                                        case 83 :
                                                            Test.dArrFld[i30] = i31;
                                                            break;
                                                        case 77 :
                                                            lArr2[i - 1] *= Test.instanceCount;
                                                        case 91 :
                                                            i31 <<= ((int) (-14735L));
                                                            break;
                                                        case 72 :
                                                            s2 *= Test.byFld;
                                                            break;
                                                        case 87 :
                                                            Test.instanceCount &= i32;
                                                    }
                                                    break;
                                                case 57 :
                                                default :
                                                    i31 = ((int) (Test.instanceCount));
                                            }
                                        case 7 :
                                            Test.instanceCount += ((long) (f5));
                                        case 8 :
                                            i32 = i1;
                                            break;
                                        case 9 :
                                            if (true)
                                                continue;

                                            break;
                                    }
                                case 48 :
                                    f6 = i33;
                                    break;
                                default :
                                    Test.instanceCount += (-5) + (f5 * f5);
                            }
                        } 
                    }
                    break;
                case 77 :
                    Test.dFld = i1;
                    break;
                case 78 :
                    i33 += i + Test.instanceCount;
                case 79 :
                    Test.instanceCount &= Test.instanceCount;
                    break;
                case 80 :
                    Test.iArrFld1[i + 1] <<= ((int) (Test.instanceCount));
                    break;
                case 81 :
                    Test.iArrFld[i + 1] <<= -107;
                    break;
                case 82 :
                    sArr1[i + 1] = ((short) (26510));
            }
        }
        FuzzerUtils.out.println((((("i i1 i30 = " + i) + ",") + i1) + ",") + i30);
        FuzzerUtils.out.println((((("i31 f5 f6 = " + i31) + ",") + Float.floatToIntBits(f5)) + ",") + Float.floatToIntBits(f6));
        FuzzerUtils.out.println((((("i32 i33 iArr = " + i32) + ",") + i33) + ",") + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println((("lArr2 sArr1 = " + FuzzerUtils.checkSum(lArr2)) + ",") + FuzzerUtils.checkSum(sArr1));
        FuzzerUtils.out.println((((("Test.instanceCount Test.dFld Test.iFld = " + Test.instanceCount) + ",") + Double.doubleToLongBits(Test.dFld)) + ",") + Test.iFld);
        FuzzerUtils.out.println((((("Test.byFld bFld Test.iArrFld = " + Test.byFld) + ",") + (bFld ? 1 : 0)) + ",") + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println((((("Test.iArrFld1 Test.fArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld1)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            {
                final double ax$4 = Test.dFld;
                final int ax$5 = Test.iFld;
                try {
                    for (int ax$0 = -897; ax$0 < (-897 + 7021); ax$0 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            if (iFld < 0) {
                                dFld = -dFld;
                            }
                        } catch (Throwable ax$3) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                    }
                } finally {
                    Test.dFld = ax$4;
                    Test.iFld = ax$5;
                }
            }
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

    static Boolean ax$6 = false;
}