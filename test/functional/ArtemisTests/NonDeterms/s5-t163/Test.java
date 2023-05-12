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
import java.util.TimeZone;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 4774068094670923440L;

    public short sFld = -10717;

    public static double dFld = -37.122376;

    public static volatile byte byFld = 119;

    public static boolean bFld = true;

    public static int iArrFld[] = new int[N];

    public static double dArrFld[] = new double[N];

    public volatile long lArrFld[] = new long[N];

    public float fArrFld[][] = new float[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -11);
        FuzzerUtils.init(Test.dArrFld, 53.93336);
    }

    public static long vMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1(byte by) {
        if (Test.ax$0) {
            TimeZone ax$1 = null;
            String ax$2 = "9.930642028144481E-19";
            TimeZone ax$3 = null;
            Test.AxOutputRedirectionHelper.redirect();
            try {
                if (ax$1 == ax$3) {
                }
            } catch (Throwable ax$4) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        int i4 = 23349;
        int i5 = -59867;
        int i6 = -4024;
        int i7 = 3;
        int i8 = 145;
        int i9 = 3;
        int i10 = 1;
        int i11 = 23614;
        int i12 = 36071;
        int i13 = 13748;
        int i14 = 2928;
        int i15 = -228;
        int i16 = 49;
        float f2 = -1.46F;
        double d = 50.85677;
        boolean b = false;
        short s = 20255;
        long l1 = 11L;
        long lArr[] = new long[N];
        FuzzerUtils.init(lArr, 396063094L);
        i4 = 1;
        while ((++i4) < 121) {
            Test.iArrFld[i4 - 1] = ((int) (f2));
            for (i5 = i4; 5 > i5; ++i5) {
                for (i7 = 1; i7 < 1; ++i7) {
                    try {
                        i8 = (-14151) / i7;
                        Test.iArrFld[i7] = i8 / i6;
                        i8 = i5 % 235;
                    } catch (ArithmeticException a_e) {
                    }
                    i8 = ((int) (d));
                    b = b;
                    i8 = i5;
                    Test.instanceCount = Test.instanceCount;
                    i6 += i7;
                    try {
                        i8 = i8 % i4;
                        Test.iArrFld[i5 + 1] = 81 % i7;
                        Test.iArrFld[i5] = i5 / Test.iArrFld[((-33967) >>> 1) % N];
                    } catch (ArithmeticException a_e) {
                    }
                }
                i6 += ((i5 * i4) + Test.instanceCount) - i8;
                i6 >>>= s;
                i8 += ((int) (Test.instanceCount));
                Test.instanceCount *= i6;
                i8 = ((int) (-5186857376409604841L));
                i6 = i6;
            }
        } 
        for (i9 = 1; i9 < 152; i9++) {
            for (i11 = 1; 4 > i11; i11++) {
                i6 = ((int) (d));
                i8 ^= i5;
            }
        }
        for (l1 = 11; l1 < 225; l1++) {
            if (b)
                break;

            Test.iArrFld[(i6 >>> 1) % N] = i4;
            lArr[((int) (l1 - 1))] = s;
            i8 *= ((int) (l1));
            i10 *= ((int) (-34264L));
            i14 = 1;
            while ((++i14) < 3) {
                i8 = ((int) (l1));
                Test.dArrFld[((int) (l1 - 1))] -= i11;
                i13 += i13;
                by ^= ((byte) (-235));
            } 
            i10 *= ((int) (Test.instanceCount));
            for (i15 = 1; i15 < 3; i15++) {
                i16 = i4;
                Test.instanceCount += ((long) (f2));
                i12 -= ((int) (d));
            }
        }
        vMeth1_check_sum += ((((((((((((((((((by + i4) + Float.floatToIntBits(f2)) + i5) + i6) + i7) + i8) + Double.doubleToLongBits(d)) + (b ? 1 : 0)) + s) + i9) + i10) + i11) + i12) + l1) + i13) + i14) + i15) + i16) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i3, long l) {
        byte by1 = -38;
        float f3 = 31.501F;
        float f4 = -115.5F;
        float fArr[] = new float[N];
        int i17 = -5;
        int i18 = -4;
        int i19 = -187;
        int i20 = -5;
        int i21 = -115;
        double d1 = 8.13387;
        boolean b1 = false;
        long lArr1[][] = new long[N][N];
        FuzzerUtils.init(fArr, 115.259F);
        FuzzerUtils.init(lArr1, 16746L);
        l = Math.abs((--i3) / ((-(i3++)) | 1));
        {
            final int ax$16 = i18;
            final int ax$17 = i17;
            final int ax$18 = i21;
            final int ax$19 = i3;
            try {
                int[] ax$12 = new int[]{ -1005333851, 1462693144 };
                for (int ax$5 = -965; ax$5 < (-965 + 14389); ax$5 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        int[] ax$7 = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                        int ax$8 = 0;
                        do {
                            i21 += ax$7[ax$8++];
                        } while (ax$8 <= ax$7.length );
                    } catch (Throwable ax$9) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$0 = true;
                    vMeth1(((byte) (-7)));
                    Test.ax$0 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (i3 = ax$12.length - 1; i3 >= 0; --i3) {
                            if (i3 >= i18) {
                                i21 += (i21 ^ 9) + (i17 != 0 ? 0 : i21);
                                i17 = i21;
                            }
                        }
                    } catch (Throwable ax$15) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                i18 = ax$16;
                i17 = ax$17;
                i21 = ax$18;
                i3 = ax$19;
            }
        }
        vMeth1(by1);
        f3 = ((float) (Test.dFld));
        i3 -= 3;
        f3 *= Test.instanceCount;
        Test.iArrFld[(i3 >>> 1) % N] -= i3;
        i17 = 1;
        do {
            Test.iArrFld[i17] += i17;
            switch ((((-11) >>> 1) % 9) + 37) {
                case 37 :
                case 38 :
                    f3 -= i3;
                    i3 += i17 * i17;
                    i3 |= i17;
                    l >>= i17;
                    i3 += ((i17 * i3) + i3) - l;
                    for (d1 = 1; d1 < 3; d1++) {
                        Test.dFld *= l;
                        Test.instanceCount -= 17987;
                        Test.iArrFld[(i3 >>> 1) % N] <<= ((int) (Test.instanceCount));
                        fArr[i17] += i17;
                        lArr1[((int) (d1))][((int) (d1))] <<= 6;
                        i18 -= i3;
                        i19 = 1;
                        do {
                            i18 += i19;
                            lArr1[i17 - 1][i19 + 1] *= ((long) (Test.dFld));
                            try {
                                i18 = 211 / i17;
                                i18 = i17 / 249;
                                i3 = i3 % i17;
                            } catch (ArithmeticException a_e) {
                            }
                            l -= Test.instanceCount;
                            Test.iArrFld[i17] = ((int) (l));
                            switch ((((i18 >>> 1) % 2) * 5) + 109) {
                                case 119 :
                                    i3 = ((int) (Test.instanceCount));
                                    i3 = i19;
                                    i20 = ((int) (f3));
                                    i3 += i19 * i19;
                                    Test.iArrFld[((int) (d1))] += 52289;
                                    b1 = b1;
                                    lArr1[i19 - 1][i17 + 1] += i3;
                                    lArr1[i19][i17 + 1] *= i19;
                                    i21 >>= i17;
                                    break;
                                case 110 :
                                    i18 = ((int) (Test.instanceCount));
                                    break;
                                default :
                                    Test.iArrFld[i19 + 1] += i21;
                            }
                        } while ((++i19) < 2 );
                    }
                    break;
                case 39 :
                    b1 = b1;
                    break;
                case 40 :
                    Test.dArrFld[i17 + 1] += i17;
                    break;
                case 41 :
                    f3 -= i21;
                    break;
                case 42 :
                    i20 &= ((int) (-545599389L));
                    break;
                case 43 :
                    i18 *= 3;
                    break;
                case 44 :
                    Test.iArrFld[i17] >>= i17;
                case 45 :
                    f4 += ((i17 * i3) + i20) - l;
                default :
                    Test.dFld = i17;
            }
        } while ((++i17) < 205 );
        long meth_res = ((((((((((((i3 + l) + by1) + Float.floatToIntBits(f3)) + i17) + Double.doubleToLongBits(d1)) + i18) + i19) + i20) + (b1 ? 1 : 0)) + i21) + Float.floatToIntBits(f4)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public void vMeth(float f) {
        int i = -1;
        int i1 = -84;
        int i2 = -5;
        int i22 = 2;
        int i23 = -227;
        int i24 = 167;
        int i25 = 41502;
        int i26 = 2;
        int i27 = 19790;
        int iArr[] = new int[N];
        float f1 = -1.355F;
        byte by2 = -78;
        double d2 = 1.124384;
        boolean b2 = true;
        FuzzerUtils.init(iArr, -121);
        i = ((int) (Test.instanceCount));
        Test.instanceCount -= (26283L >>> Long.reverseBytes(Test.instanceCount)) + iArr[(i >>> 1) % N];
        i -= ++iArr[(i >>> 1) % N];
        f1 = 1;
        while ((++f1) < 242) {
            for (i1 = 1; 3 > i1; ++i1) {
                sFld += ((short) (i1));
                Test.instanceCount += i1 + i1;
                i <<= iMeth(i1, Test.instanceCount);
                for (i22 = 1; 2 > i22; ++i22) {
                    Test.instanceCount = by2;
                    if (i != 0) {
                        vMeth_check_sum += (((((((((((((Float.floatToIntBits(f) + i) + Float.floatToIntBits(f1)) + i1) + i2) + i22) + i23) + by2) + Double.doubleToLongBits(d2)) + i24) + (b2 ? 1 : 0)) + i25) + i26) + i27) + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                }
            }
            iArr[((int) (f1))] -= ((int) (Test.dFld));
            for (d2 = 1; d2 < 3; d2++) {
                i23 -= ((int) (Test.instanceCount));
                if (b2)
                    break;

                i25 = 1;
                do {
                    Test.instanceCount = i;
                    i2 &= i1;
                } while ((++i25) < 2 );
                Test.iArrFld[((int) (d2 + 1))] <<= i;
                Test.instanceCount += i23;
                Test.iArrFld[((int) (f1))] <<= i25;
                switch (((int) (((d2 % 6) * 5) + 94))) {
                    case 118 :
                        lArrFld[((int) (d2))] *= i;
                        if (b2)
                            break;

                        i2 = ((int) (Test.instanceCount));
                        i += ((int) (((long) (d2)) | i1));
                        for (i26 = 1; i26 < 2; ++i26) {
                            b2 = b2;
                            i2 += i26 | i;
                            Test.instanceCount -= Test.instanceCount;
                            i2 *= ((int) (172L));
                            Test.dFld = Test.instanceCount;
                            switch (((i >>> 1) % 8) + 84) {
                                case 84 :
                                    i24 += i26;
                                    i2 += ((int) (Test.instanceCount));
                                    i24 += i26 * i26;
                                    lArrFld[i26] = ((long) (f));
                                    break;
                                case 85 :
                                    Test.dFld -= d2;
                                    break;
                                case 86 :
                                    Test.instanceCount += ((i26 * f1) + i27) - i22;
                                    break;
                                case 87 :
                                case 88 :
                                    Test.instanceCount -= i24;
                                case 89 :
                                    i2 = i26;
                                    break;
                                case 90 :
                                    f = i23;
                                    break;
                                case 91 :
                                    i27 = ((int) (203L));
                                    break;
                                default :
                                    Test.instanceCount += i26;
                            }
                        }
                        break;
                    case 105 :
                        Test.instanceCount += i2;
                        break;
                    case 111 :
                        i23 = i26;
                        break;
                    case 100 :
                        f = i23;
                        break;
                    case 97 :
                        Test.instanceCount *= i25;
                        break;
                    case 101 :
                    default :
                        Test.instanceCount -= i25;
                }
            }
        } 
        vMeth_check_sum += (((((((((((((Float.floatToIntBits(f) + i) + Float.floatToIntBits(f1)) + i1) + i2) + i22) + i23) + by2) + Double.doubleToLongBits(d2)) + i24) + (b2 ? 1 : 0)) + i25) + i26) + i27) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {
        float f5 = 25.467F;
        int i28 = -208;
        int i29 = 44556;
        int i31 = -13;
        int i32 = -11;
        int i33 = -22911;
        vMeth(f5);
        i28 = 1;
        do {
            int i30 = 56451;
            i29 ^= i29;
            fArrFld[i28 + 1][i28] = -5;
            f5 -= i28;
            Test.dArrFld[i28 - 1] = 204;
            i29 = i29;
            i29 += ((i28 * i29) + i29) - i30;
            Test.instanceCount *= Test.byFld;
            i31 = 1;
            do {
                for (i32 = i31; i32 < 1; ++i32) {
                    Test.bFld = Test.bFld;
                    switch (((i32 % 4) * 5) + 69) {
                        case 88 :
                            Test.instanceCount += i32;
                            Test.instanceCount += ((i32 * Test.instanceCount) + i32) - i28;
                            Test.bFld = Test.bFld;
                            i33 *= i33;
                            Test.instanceCount = sFld;
                            i33 = ((int) (Test.instanceCount));
                            i33 -= i30;
                            i29 -= ((int) (Test.instanceCount));
                            switch ((((i33 >>> 1) % 2) * 5) + 75) {
                                case 81 :
                                    i33 |= ((int) (35153L));
                                    i33 += ((i32 * i31) + i28) - i28;
                                    i33 += i32 | Test.instanceCount;
                                    if (true)
                                        break;

                                    Test.iArrFld[i31 - 1] -= 34021;
                                    fArrFld[i32 - 1][i28 - 1] = -13782;
                                    i29 = i28;
                                    Test.iArrFld[i31 + 1] -= 5;
                                    i30 >>= i28;
                                    switch (((i32 % 2) * 5) + 94) {
                                        case 102 :
                                            Test.dFld *= Test.instanceCount;
                                            Test.instanceCount -= 35581;
                                            break;
                                        case 104 :
                                            Test.instanceCount *= i32;
                                            break;
                                        default :
                                            Test.bFld = true;
                                            if (Test.bFld)
                                                break;

                                            i29 = ((int) (7842610036350442057L));
                                            Test.instanceCount = Test.instanceCount;
                                            i29 = sFld;
                                            i33 /= -242;
                                            i29 <<= sFld;
                                    }
                                    lArrFld = lArrFld;
                                    i29 += i32 | i29;
                                    i33 = i33;
                                    i30 += ((i32 * i29) + i30) - f5;
                                    try {
                                        i29 = i32 / i31;
                                        i29 = i32 / i29;
                                        i29 = Test.iArrFld[i32 - 1] % i29;
                                    } catch (ArithmeticException a_e) {
                                    }
                                    break;
                                case 83 :
                                    i33 <<= ((int) (Test.instanceCount));
                                    Test.byFld += ((byte) (i32));
                                    lArrFld[i32 + 1] -= i29;
                                    Test.instanceCount = i33;
                                    i33 |= i30;
                                    lArrFld[i28] >>= -9;
                                    Test.dFld += -245;
                                    i30 += i32 * i32;
                                    Test.dArrFld[i28] += i29;
                                    Test.iArrFld[i28 - 1] = 21030;
                                    Test.iArrFld[i32] += i28;
                                    lArrFld[i32] = Test.instanceCount;
                                    Test.instanceCount = Test.instanceCount;
                                    Test.instanceCount *= i30;
                                    break;
                                default :
                                    i33 += ((i32 * Test.instanceCount) + Test.instanceCount) - i31;
                                    Test.instanceCount = Test.instanceCount;
                                    Test.instanceCount += 11430 + (i32 * i32);
                                    i30 *= i28;
                                    i33 *= ((int) (1.519F));
                                    try {
                                        i30 = Test.iArrFld[i32] / 277;
                                        i33 = (-488139030) % i32;
                                        Test.iArrFld[i31 + 1] = Test.iArrFld[i32] / 24360;
                                    } catch (ArithmeticException a_e) {
                                    }
                            }
                            break;
                        case 72 :
                            i29 += ((int) (f5));
                            Test.iArrFld[i31 + 1] *= i29;
                            i30 += i32 * i32;
                            Test.dFld = 5;
                            i29 = ((int) (Test.instanceCount));
                            Test.instanceCount *= i30;
                            Test.iArrFld = Test.iArrFld;
                            i33 *= ((int) (Test.instanceCount));
                        case 74 :
                            Test.iArrFld[i31] >>= i32;
                            break;
                        case 75 :
                        default :
                            i29 |= 9;
                    }
                }
            } while ((++i31) < 59 );
        } while ((++i28) < 86 );
        FuzzerUtils.out.println((((("f5 i28 i29 = " + Float.floatToIntBits(f5)) + ",") + i28) + ",") + i29);
        FuzzerUtils.out.println((((("i31 i32 i33 = " + i31) + ",") + i32) + ",") + i33);
        FuzzerUtils.out.println((((("Test.instanceCount sFld Test.dFld = " + Test.instanceCount) + ",") + sFld) + ",") + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println((((("Test.byFld Test.bFld Test.iArrFld = " + Test.byFld) + ",") + (Test.bFld ? 1 : 0)) + ",") + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println((((("Test.dArrFld lArrFld fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld))) + ",") + FuzzerUtils.checkSum(lArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
}