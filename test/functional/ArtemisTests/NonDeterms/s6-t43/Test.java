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

    public static volatile long instanceCount = 149L;

    public static volatile int iFld = -1883;

    public static double dFld = -1.12602;

    public static byte byFld = -94;

    public static double dArrFld[] = new double[N];

    public int iArrFld[] = new int[N];

    public static float fArrFld[] = new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 2.16964);
        FuzzerUtils.init(Test.fArrFld, -97.842F);
    }

    public static long fMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long iMeth1_check_sum = 0;

    public static int iMeth1(byte by) {
        int i5 = 30591;
        int i6 = -33543;
        int i7 = -26101;
        int i8 = -7;
        int i9 = 5;
        int i10 = -2;
        int i11 = 20157;
        int iArr1[] = new int[N];
        float f = -31.552F;
        short s = -7780;
        long l = -26003L;
        double d1 = -123.90182;
        boolean b = true;
        FuzzerUtils.init(iArr1, 106);
        i5 = i5;
        iArr1[(4 >>> 1) % N] *= i5;
        i6 = 1;
        while ((++i6) < 158) {
            if (i5 != 0) {
            }
            i5 >>= i6;
            i5 += ((int) (f));
            iArr1[i6 + 1] -= i5;
            i7 = 1;
            do {
                i5 += i7 + Test.instanceCount;
                i5 += i7;
                Test.instanceCount -= i5;
                for (i8 = 1; i8 < 1; i8++) {
                    Test.iFld += i8;
                    iArr1[i8] *= Test.iFld;
                    i9 += i8 ^ i6;
                    i5 += ((i8 * Test.instanceCount) + i9) - i6;
                    i5 += i8 * Test.iFld;
                    Test.instanceCount = Test.iFld;
                }
                f += ((i7 * i7) + i6) - s;
                for (i10 = 1; 1 > i10; ++i10) {
                    i9 -= i8;
                    i9 += i10 | l;
                    l += i6;
                    d1 = i8;
                    switch (((0 >>> 1) % 6) + 35) {
                        case 35 :
                            i9 -= i7;
                            Test.instanceCount = -141L;
                            Test.iFld += i10;
                            Test.iFld += i10;
                            l = Test.instanceCount;
                            i9 = i8;
                            break;
                        case 36 :
                            i11 = ((int) (l));
                            f += -67.42F;
                            b = b;
                            if (i8 != 0) {
                            }
                            Test.iFld >>= ((int) (Test.instanceCount));
                            f -= by;
                            break;
                        case 37 :
                            i11 = ((int) (-105.99237));
                            break;
                        case 38 :
                            i5 += i7;
                        case 39 :
                            l *= i5;
                            break;
                        case 40 :
                            Test.instanceCount -= Test.instanceCount;
                        default :
                            iArr1[i7 - 1] += s;
                    }
                }
            } while ((++i7) < 4 );
        } 
        long meth_res = ((((((((((((by + i5) + i6) + Float.floatToIntBits(f)) + i7) + i8) + i9) + s) + i10) + i11) + l) + Double.doubleToLongBits(d1)) + (b ? 1 : 0)) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static int iMeth() {
        if (Test.ax$0) {
            final int ax$6 = Test.iFld;
            int[] ax$3 = new int[]{ 2, 5, 9, -1, -3, 10, 8, 4 };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                for (int ax$4 = iFld; ax$4 >= iFld; ax$4--) {
                    ax$3[ax$4] = ((((ax$3[ax$4 - 2] + ax$3[ax$4 - 1]) + ax$3[ax$4]) + ax$3[ax$4 + 1]) + ax$3[ax$4 + 2]) / 5;
                }
            } catch (Throwable ax$5) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            Test.iFld = ax$6;
            return 433886372;
        }
        int i3 = 165;
        int i4 = 49858;
        int i12 = -40523;
        int i13 = 86;
        int iArr2[][] = new int[N][N];
        byte by1 = 47;
        float f1 = 1.7F;
        float f2 = 1.696F;
        short s1 = -13564;
        boolean b1 = true;
        double d2 = 44.74059;
        FuzzerUtils.init(iArr2, 11);
        for (i3 = 9; i3 < 242; i3++) {
            iMeth1(by1);
            iArr2[i3 - 1][i3] = by1;
            Test.iFld += ((i3 * i4) + i3) - i3;
            iArr2[i3][i3 + 1] = Test.iFld;
            i4 -= Test.iFld;
            try {
                i4 = i3 % 1885001992;
                i4 = i3 % i4;
                i4 = Test.iFld % 45844;
            } catch (ArithmeticException a_e) {
            }
            for (i12 = 3; i12 > 1; i12 -= 2) {
                Test.instanceCount -= Test.instanceCount;
                Test.instanceCount >>= Test.instanceCount;
                Test.instanceCount += i12 * i12;
                if (b1) {
                    Test.iFld += i12;
                    f1 -= s1;
                    Test.instanceCount += i12;
                } else if (b1) {
                    Test.iFld <<= s1;
                    by1 <<= ((byte) (Test.instanceCount));
                    i13 = i3;
                    i4 += 57691;
                    switch ((i12 % 8) + 82) {
                        case 82 :
                            iArr2[i3][i3 - 1] += i13;
                            Test.iFld -= -34391;
                            i13 = 22110;
                            Test.iFld += ((int) (Test.instanceCount));
                            f2 = 1;
                            while ((++f2) < 3) {
                                by1 += ((byte) (f2));
                                if (b1)
                                    continue;

                                f1 *= i3;
                                i4 -= ((int) (f1));
                                Test.iFld = ((int) (2.884F));
                                i4 = i12;
                                i4 >>>= i4;
                            } 
                            i4 += i13;
                            break;
                        case 83 :
                            if (i13 != 0) {
                            }
                            f1 += i12 * by1;
                            break;
                        case 84 :
                            f1 *= ((float) (d2));
                            iArr2[i3][i3 + 1] -= i3;
                            break;
                        case 85 :
                            i4 *= 140;
                            break;
                        case 86 :
                            i4 = Test.iFld;
                            break;
                        case 87 :
                            try {
                                i4 = i3 % (-32294);
                                Test.iFld = Test.iFld % iArr2[i12 - 1][(i4 >>> 1) % N];
                                iArr2[i3][i3 - 1] = Test.iFld / i4;
                            } catch (ArithmeticException a_e) {
                            }
                        case 88 :
                            Test.instanceCount = i3;
                        case 89 :
                            Test.iFld <<= i4;
                            break;
                        default :
                            d2 += Test.instanceCount;
                    }
                }
            }
        }
        long meth_res = (((((((((i3 + i4) + by1) + i12) + i13) + Float.floatToIntBits(f1)) + s1) + Float.floatToIntBits(f2)) + (b1 ? 1 : 0)) + Double.doubleToLongBits(d2)) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public float fMeth(int i1, double d, int i2) {
        int iArr[] = new int[N];
        long lArr[] = new long[N];
        double dArr[] = new double[N];
        FuzzerUtils.init(iArr, -195);
        FuzzerUtils.init(lArr, -35406L);
        FuzzerUtils.init(dArr, -57.46431);
        d -= (++i2) + (++i2);
        {
            final double ax$14 = d;
            try {
                Object ax$8 = new Object();
                Object ax$9 = new Object();
                for (int ax$7 = -968; ax$7 < (-968 + 8999); ax$7 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        try {
                            ax$8 = ((int[]) (ax$9));
                        } catch (ClassCastException ax$10) {
                        }
                    } catch (Throwable ax$11) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$0 = true;
                    iMeth();
                    Test.ax$0 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if (d != 529.0) {
                        }
                    } catch (Throwable ax$13) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                d = ax$14;
            }
        }
        iArr[(i2 >>> 1) % N] = iMeth();
        lArr[(i1 >>> 1) % N] += -7;
        dArr[(i1 >>> 1) % N] -= Test.instanceCount;
        long meth_res = ((((i1 + Double.doubleToLongBits(d)) + i2) + FuzzerUtils.checkSum(iArr)) + FuzzerUtils.checkSum(lArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return ((float) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        if (Test.ax$15) {
            final double ax$19 = Test.dFld;
            double[] ax$17 = new double[]{ 0.17788725824398133, 0.10277211007547082, 0.3140406932831945, 0.8267439714881999 };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                dFld = ax$17[0];
            } catch (Throwable ax$18) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            Test.dFld = ax$19;
            return;
        }
        int i = -79;
        int i14 = 34009;
        int i15 = -5;
        int i16 = -126;
        int i17 = 228;
        int i18 = -237;
        int i19 = 194;
        boolean b2 = false;
        float f4 = -97.288F;
        long lArr1[] = new long[N];
        byte byArr[] = new byte[N];
        FuzzerUtils.init(lArr1, 2127406243L);
        FuzzerUtils.init(byArr, ((byte) (52)));
        i -= ((int) (Float.intBitsToFloat(Math.abs(i))));
        i &= ((int) (Test.instanceCount));
        fMeth(Test.iFld, 57.125908, Test.iFld);
        i -= ((int) (116.75857));
        Test.dArrFld[(i >>> 1) % N] *= Test.iFld;
        for (i14 = 6; 96 > i14; i14++) {
            Test.instanceCount += ((i14 * Test.instanceCount) + i) - Test.iFld;
            Test.iFld = ((int) (Test.instanceCount));
            i += ((int) (-22389L));
            if (b2) {
                for (i16 = 1; i16 < 56; ++i16) {
                    if (b2)
                        break;

                    Test.dFld -= i14;
                    i18 = 1;
                    do {
                        float f3 = 0.107F;
                        short s2 = 30082;
                        switch ((((55659 >>> 1) % 1) * 5) + 69) {
                            case 72 :
                                Test.instanceCount = Test.iFld;
                                i += ((i18 * f3) + i17) - f3;
                                if (b2) {
                                    i15 -= -126;
                                    lArr1[i16] *= Test.iFld;
                                    Test.iFld = i;
                                    i15 -= ((int) (-52989L));
                                    f3 += -184;
                                    f3 *= i14;
                                    f3 += ((float) (Test.dFld));
                                    Test.instanceCount += i18;
                                    Test.iFld = ((int) (Test.instanceCount));
                                    try {
                                        i17 = i19 % 181021921;
                                        i15 = i16 % iArrFld[i14 - 1];
                                        i = Test.iFld / 58;
                                    } catch (ArithmeticException a_e) {
                                    }
                                } else {
                                    iArrFld[i16] = -1;
                                    switch (((((-21256) >>> 1) % 10) * 5) + 15) {
                                        case 27 :
                                            iArrFld = iArrFld;
                                            if (b2) {
                                                Test.dFld *= i14;
                                                if (b2) {
                                                    i19 <<= i18;
                                                    Test.fArrFld = FuzzerUtils.float1array(N, ((float) (2.225F)));
                                                    Test.byFld -= ((byte) (79L));
                                                    Test.instanceCount += 43452;
                                                    iArrFld[i18] = i14;
                                                    i15 = ((int) (Test.dFld));
                                                } else {
                                                    i = i17;
                                                    switch ((i18 % 2) + 75) {
                                                        case 75 :
                                                            lArr1[i14] = i;
                                                            Test.instanceCount = Test.instanceCount;
                                                            Test.byFld += ((byte) (i14));
                                                            b2 = true;
                                                            f3 *= i;
                                                            f3 -= i;
                                                            i19 = i19;
                                                            if (true) {
                                                                i19 -= ((int) (1.82925));
                                                                i15 *= ((int) (f3));
                                                                i17 = i17;
                                                                i17 += i18;
                                                                i19 = i15;
                                                                i19 *= ((int) (Test.instanceCount));
                                                                i15 = i14;
                                                                s2 <<= ((short) (Test.instanceCount));
                                                                lArr1[i18 - 1] /= -25902;
                                                            } else if (true) {
                                                                if (b2) {
                                                                    i15 *= -29;
                                                                } else if (b2) {
                                                                    if (b2) {
                                                                        iArrFld[i18 - 1] >>= i19;
                                                                    } else if (b2) {
                                                                        i17 -= i14;
                                                                    } else {
                                                                        i19 += Test.iFld;
                                                                        f3 += i18;
                                                                        Test.dArrFld[i18 + 1] = f3;
                                                                    }
                                                                    Test.instanceCount <<= -20537L;
                                                                    i15 = 182;
                                                                }
                                                                try {
                                                                    i = i16 / i;
                                                                    i19 = i17 / (-135);
                                                                    i17 = i19 % 255;
                                                                } catch (ArithmeticException a_e) {
                                                                }
                                                                Test.dFld *= i18;
                                                                i /= ((int) (((long) (Test.dFld)) | 1));
                                                                f3 += i18;
                                                                i17 *= 0;
                                                                i += i18;
                                                            } else {
                                                                iArrFld[i14] = i18;
                                                            }
                                                        case 76 :
                                                            i = ((int) (Test.dFld));
                                                        default :
                                                            i15 |= ((int) (Test.instanceCount));
                                                    }
                                                }
                                            }
                                            break;
                                        case 50 :
                                        case 24 :
                                            Test.instanceCount = i18;
                                            break;
                                        case 17 :
                                            i15 += ((i18 * i17) + Test.instanceCount) - i18;
                                            break;
                                        case 43 :
                                            i15 >>>= ((int) (Test.instanceCount));
                                            break;
                                        case 63 :
                                        case 30 :
                                            iArrFld[i16 - 1] += i18;
                                            break;
                                        case 22 :
                                            byArr[i18 + 1] = ((byte) (i14));
                                            break;
                                        case 65 :
                                            s2 |= ((short) (Test.instanceCount));
                                            break;
                                        case 46 :
                                            i19 += 55532;
                                            break;
                                        default :
                                            i19 -= ((int) (f3));
                                    }
                                }
                                break;
                            default :
                                iArrFld[i14 + 1] *= ((int) (-8L));
                        }
                    } while ((++i18) < 2 );
                }
            } else {
                f4 -= i16;
            }
        }
        FuzzerUtils.out.println((((("i i14 i15 = " + i) + ",") + i14) + ",") + i15);
        FuzzerUtils.out.println((((("i16 i17 b2 = " + i16) + ",") + i17) + ",") + (b2 ? 1 : 0));
        FuzzerUtils.out.println((((("i18 i19 f4 = " + i18) + ",") + i19) + ",") + Float.floatToIntBits(f4));
        FuzzerUtils.out.println((("lArr1 byArr = " + FuzzerUtils.checkSum(lArr1)) + ",") + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println((((("Test.instanceCount Test.iFld Test.dFld = " + Test.instanceCount) + ",") + Test.iFld) + ",") + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println((((("Test.byFld Test.dArrFld iArrFld = " + Test.byFld) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld))) + ",") + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                {
                    final int ax$32 = i;
                    try {
                        short ax$21 = ((short) (7187));
                        short[] ax$22 = new short[]{ ((short) (-7944)) };
                        short[] ax$26 = new short[]{ ((short) (638)), ((short) (17698)) };
                        short[] ax$27 = new short[]{ 20, 10, 0, -10, -20 };
                        short[] ax$28 = new short[]{ ((short) (12948)), ((short) (-23597)), ((short) (-24929)) };
                        for (int ax$20 = -265; ax$20 < (-265 + 19547); ax$20 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$24 = 0; ax$24 < ax$22.length; ax$24++) {
                                    i += Math.abs(ax$21 - ax$22[ax$24]);
                                }
                            } catch (Throwable ax$25) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            Test.ax$15 = true;
                            _instance.mainTest(new String[]{ "s", "s", "s", "s", "s", "s", "s", "s" });
                            Test.ax$15 = false;
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                int ax$29 = Math.min(ax$27.length, Math.min(ax$28.length, ax$26.length));
                                for (int ax$30 = 0; ax$30 < ax$29; ax$30++) {
                                    ax$27[ax$30] = ((short) (((1 + ax$28[ax$30]) + ax$26[ax$30]) >> 1));
                                }
                            } catch (Throwable ax$31) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        i = ax$32;
                    }
                }
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    static Boolean ax$0 = false;

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

    static Boolean ax$15 = false;
}