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

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Test {
    public static final int N = 256;

    public static long instanceCount = -1191467522314844515L;

    public static boolean bFld = true;

    public static byte byFld = 46;

    public static int iFld = -17;

    public static volatile short sFld = 20970;

    public double dFld = -1.65325;

    public static float fFld = 0.765F;

    public int iFld1 = -58;

    public static long vMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, double d2, int i5) {
        int i7 = 489;
        int i8 = -244;
        int i9 = 218;
        int i10 = 203;
        int i11 = 19738;
        int i12 = 15;
        int i13 = -172;
        int i14 = 28008;
        int iArr[] = new int[N];
        float f = 2.31F;
        long l1 = -86L;
        long lArr[] = new long[N];
        FuzzerUtils.init(iArr, -2);
        FuzzerUtils.init(lArr, -14L);
        for (int i6 : iArr) {
            for (i7 = 1; i7 < 2; ++i7) {
                i8 = i5;
                f -= i8;
                for (i9 = 1; i9 < 2; ++i9) {
                    f -= i8;
                    if (Test.bFld) {
                        iArr[i9 - 1] += i10;
                        i5 += i10;
                        if (true)
                            break;

                        Test.instanceCount = 8L;
                        i8 >>>= ((int) (Test.instanceCount));
                        if (Test.bFld) {
                            Test.instanceCount += ((i9 * i6) + Test.instanceCount) - Test.instanceCount;
                            d2 += Test.instanceCount;
                            if (false)
                                break;

                        }
                        i10 = ((int) (Test.instanceCount));
                        d2 += i7;
                        Test.byFld += ((byte) (20.83927));
                        i6 -= i10;
                    } else if (Test.bFld) {
                        f += ((i9 * i8) + Test.instanceCount) - Test.instanceCount;
                        i8 = i7;
                    }
                    f += i8;
                }
                try {
                    i11 = (-37535) % i6;
                    i10 = 1422640823 % i6;
                    i10 = iArr[i7 - 1] / i7;
                } catch (ArithmeticException a_e) {
                }
                Test.instanceCount += ((long) (d2));
                Test.instanceCount += i6;
                switch ((i7 % 5) + 33) {
                    case 33 :
                        Test.instanceCount *= i8;
                        iArr[i7 + 1] = i5;
                        lArr[i7] -= i9;
                        iArr[i7 + 1] = i4;
                        for (i12 = i7; i12 < 2; ++i12) {
                            i11 = i9;
                            f -= ((float) (-2.162));
                            iArr[i7 - 1] |= i12;
                            lArr[i12 - 1] = i10;
                            Test.instanceCount += i12;
                        }
                        break;
                    case 34 :
                        Test.instanceCount += i7 * i7;
                        break;
                    case 35 :
                        l1 = i6;
                    case 36 :
                        try {
                            i4 = i14 % (-13344);
                            i6 = i12 / i12;
                            iArr[i7] = i13 / (-169);
                        } catch (ArithmeticException a_e) {
                        }
                        break;
                    case 37 :
                        iArr[i7 + 1] = ((int) (f));
                        break;
                    default :
                        if (Test.bFld)
                            continue;

                }
            }
        }
        vMeth1_check_sum += (((((((((((((i4 + Double.doubleToLongBits(d2)) + i5) + i7) + i8) + Float.floatToIntBits(f)) + i9) + i10) + i11) + i12) + i13) + l1) + i14) + FuzzerUtils.checkSum(iArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {
        int i1 = -75;
        int i2 = 4;
        int i3 = 151;
        int i15 = -21;
        int i16 = 12;
        int i17 = 162;
        int i18 = -175;
        int i19 = -2;
        int i20 = 10;
        int i21 = 46650;
        int i22 = 143;
        {
            try {
                Runtime ax$1 = null;
                String[] ax$2 = new String[]{ "s", "s", "s", "s", "s", "s", "s", "s", "s" };
                File ax$3 = new File(".\\StopCs.txt");
                for (int ax$0 = -666; ax$0 < (-666 + 12932); ax$0 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        try {
                            ax$1.exec("echo", ax$2, ax$3);
                        } catch (NullPointerException ax$4) {
                        }
                    } catch (Throwable ax$5) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
            }
        }
        int i23 = -83;
        int iArr1[] = new int[N];
        double d1 = 0.30292;
        double d3 = 1.113386;
        short s = 7219;
        short s1 = -20214;
        byte by = -15;
        float f1 = 46.934F;
        long lArr1[] = new long[N];
        FuzzerUtils.init(iArr1, 88);
        FuzzerUtils.init(lArr1, 55588L);
        for (i1 = 9; i1 < 159; i1++) {
            d1 = Float.intBitsToFloat(i2--) / (((s = ((short) (Test.instanceCount))) + Math.max(i2, 9)) | 1);
            Test.instanceCount -= 56484;
        }
        by = ((byte) ((i2--) / ((-(i2 + i3)) | 1)));
        vMeth1(i2, d1, i2);
        Test.instanceCount <<= i3;
        i2 += i1;
        i3 -= i2;
        iArr1[(i2 >>> 1) % N] = ((int) (Test.instanceCount));
        for (i15 = 6; i15 < 181; ++i15) {
            switch (((i15 % 10) * 5) + 47) {
                case 54 :
                    for (i17 = 3; i17 > 1; i17--) {
                        lArr1[i17] -= Test.instanceCount;
                        i2 = Test.iFld;
                        f1 = i1;
                        Test.instanceCount += i15;
                        f1 += i17 * i17;
                        i3 += (-63907) + (i17 * i17);
                        f1 += i17;
                        for (i19 = 1; i19 < 2; i19++) {
                            i20 = Test.byFld;
                            Test.byFld *= ((byte) (i17));
                            i18 = i18;
                            try {
                                i3 = 23900 / Test.iFld;
                                Test.iFld = i18 / i17;
                                i21 = i17 % i1;
                            } catch (ArithmeticException a_e) {
                            }
                            lArr1[i17] = -8;
                            i3 += i2;
                            i18 += ((i19 * Test.instanceCount) + f1) - Test.instanceCount;
                            iArr1[i17 + 1] = i18;
                        }
                        f1 += ((i17 * i19) + f1) - Test.instanceCount;
                        if (Test.bFld)
                            break;

                    }
                    for (d3 = 1; d3 < 3; d3++) {
                        i23 = 1;
                        while ((++i23) < 2) {
                            if (Test.bFld) {
                                iArr1[i15] -= i22;
                                i3 -= -43024;
                                Test.instanceCount <<= i1;
                                iArr1[i23 - 1] -= i17;
                            } else if (Test.bFld) {
                                i20 += i23;
                            } else {
                                try {
                                    Test.iFld = i19 / (-50039);
                                    i21 = i15 % (-129);
                                    i2 = i19 % 212;
                                } catch (ArithmeticException a_e) {
                                }
                            }
                        } 
                    }
                    break;
                case 77 :
                    i16 -= i22;
                    break;
                case 92 :
                    lArr1[i15] += by;
                case 86 :
                    i2 -= i15;
                    break;
                case 57 :
                    i22 += i15 * i15;
                    break;
                case 67 :
                    s1 <<= ((short) (i15));
                case 97 :
                    i22 -= i23;
                    break;
                case 66 :
                    i21 += ((i15 * Test.instanceCount) + Test.instanceCount) - i19;
                case 87 :
                    Test.instanceCount = ((long) (f1));
                case 76 :
                    i2 += i3;
                default :
                    i22 -= s;
            }
        }
        long meth_res = ((((((((((((((((((i1 + i2) + Double.doubleToLongBits(d1)) + s) + by) + i3) + i15) + i16) + i17) + i18) + Float.floatToIntBits(f1)) + i19) + i20) + i21) + Double.doubleToLongBits(d3)) + i22) + i23) + s1) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth(int i, double d, long l) {
        float f2 = -84.852F;
        int i24 = 6;
        int i25 = -7;
        int i26 = 32085;
        int i27 = 237;
        int i28 = 13;
        int i29 = 44403;
        int i30 = -64;
        int i31 = 14;
        int i32 = -2;
        double d4 = 35.82708;
        long lArr2[][] = new long[N][N];
        FuzzerUtils.init(lArr2, -212769443802216775L);
        iMeth();
        Test.instanceCount -= i;
        l -= ((long) (f2));
        for (i24 = 4; i24 < 84; i24++) {
            f2 = Test.iFld;
        }
        for (i26 = 6; i26 < 148; ++i26) {
            i -= ((int) (d));
            f2 += 28822L + (i26 * i26);
            i >>= ((int) (Test.instanceCount));
            Test.instanceCount = Test.sFld;
            i27 = i27;
            lArr2[i26][i26] = -8;
            for (i28 = 1; i28 < 4; i28++) {
                l += i29;
                i += i28;
                i25 -= Test.iFld;
                Test.instanceCount *= i26;
                i29 -= ((int) (f2));
                if (i29 != 0) {
                    vMeth_check_sum += (((((((((((((i + Double.doubleToLongBits(d)) + l) + Float.floatToIntBits(f2)) + i24) + i25) + i26) + i27) + i28) + i29) + i30) + Double.doubleToLongBits(d4)) + i31) + i32) + FuzzerUtils.checkSum(lArr2);
                    return;
                }
                i += i28 * i28;
            }
            lArr2[i26][i26] -= -64202;
        }
        i30 = 223;
        while ((--i30) > 0) {
            i25 -= ((int) (d));
            Test.instanceCount -= i28;
            Test.instanceCount = ((long) (d));
            Test.instanceCount = 220;
            Test.iFld = i;
            for (d4 = i30; d4 < 3; ++d4) {
                Test.iFld = i28;
                Test.instanceCount += ((long) (((long) (d4)) ^ l));
                Test.instanceCount ^= i25;
                i25 = i31;
                i32 = 1;
                while ((--i32) > 0) {
                    if (Test.bFld) {
                        Test.byFld *= ((byte) (i25));
                        i25 |= i26;
                        i25 -= ((int) (f2));
                    } else {
                        i27 *= i28;
                    }
                } 
            }
        } 
        vMeth_check_sum += (((((((((((((i + Double.doubleToLongBits(d)) + l) + Float.floatToIntBits(f2)) + i24) + i25) + i26) + i27) + i28) + i29) + i30) + Double.doubleToLongBits(d4)) + i31) + i32) + FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {
        int i33 = 30419;
        int i34 = -193;
        int i35 = 55773;
        int i36 = 1;
        int i37 = -13;
        int i38 = 30;
        int i39 = 14;
        int i40 = 139;
        int i41 = -7;
        int i42 = 6;
        int i43 = 92;
        int iArr2[][] = new int[N][N];
        double d5 = 0.127437;
        double dArr[] = new double[N];
        float fArr[] = new float[N];
        short sArr[] = new short[N];
        long lArr3[] = new long[N];
        FuzzerUtils.init(fArr, -93.545F);
        FuzzerUtils.init(iArr2, 171);
        FuzzerUtils.init(dArr, 0.51347);
        FuzzerUtils.init(sArr, ((short) (30511)));
        FuzzerUtils.init(lArr3, 0L);
        fArr = fArr = fArr = fArr = fArr;
        vMeth(Test.iFld, dFld, -3602642306714308524L);
        Test.byFld = ((byte) (Test.instanceCount));
        Test.fFld -= Test.iFld;
        i33 = 1;
        do {
            try {
                Test.iFld = iArr2[i33 + 1][i33] % (-15348);
                Test.iFld = Test.iFld / (-133);
                Test.iFld = Test.iFld % (-135);
            } catch (ArithmeticException a_e) {
            }
            Test.iFld += i33 + Test.iFld;
            i34 = 1;
            while ((++i34) < 56) {
                for (i35 = 1; i35 < 1; i35++) {
                    Test.instanceCount += Test.instanceCount;
                    i36 *= i34;
                    iArr2[i34][i33 + 1] *= i35;
                    i36 += i35;
                    iArr2[i33][i35] = i34;
                    iArr2[i34][i34] &= Test.iFld;
                    Test.iFld >>= 5;
                    Test.instanceCount = i33;
                    Test.iFld += i34;
                    d5 -= Test.iFld;
                    Test.iFld -= i35;
                    try {
                        i36 = i34 / Test.iFld;
                        Test.iFld = (-7294) % Test.iFld;
                        Test.iFld = (-54) / i35;
                    } catch (ArithmeticException a_e) {
                    }
                    try {
                        Test.iFld = i34 / i35;
                        i36 = (-66) % i34;
                        i36 = 28 / i33;
                    } catch (ArithmeticException a_e) {
                    }
                    switch (((((-142) >>> 1) % 2) * 5) + 79) {
                        case 83 :
                            Test.iFld *= ((int) (-2784125442L));
                            iArr2[i34][i33] += i33;
                            if (Test.bFld)
                                break;

                            Test.iFld = ((int) (dFld));
                            i36 *= ((int) (Test.instanceCount));
                            Test.instanceCount &= Test.instanceCount;
                            try {
                                i36 = 20346 / i34;
                                iArr2[i34][i33] = 23 / iArr2[i34 - 1][i33 - 1];
                                Test.iFld = iArr2[i35 + 1][i33 - 1] / i33;
                            } catch (ArithmeticException a_e) {
                            }
                            Test.instanceCount |= i34;
                            dArr[i34] += Test.instanceCount;
                            i36 >>= i34;
                            Test.fFld -= Test.instanceCount;
                            Test.instanceCount = i33;
                            break;
                        case 89 :
                            Test.sFld = ((short) (i33));
                            d5 *= Test.fFld;
                            Test.iFld = i33;
                            sArr[i35 - 1] *= ((short) (Test.instanceCount));
                            break;
                        default :
                            Test.instanceCount = Test.instanceCount;
                            Test.iFld >>>= i36;
                            i36 = 27929;
                            i36 <<= i34;
                    }
                    Test.iFld += ((int) ((-2323319058L) + (i35 * i35)));
                }
                for (i37 = 1; i37 < 1; i37++) {
                    iArr2[i33][i34 + 1] -= ((int) (Test.fFld));
                    Test.iFld += i37;
                    Test.byFld = ((byte) (Test.iFld));
                    i36 += ((int) (Test.instanceCount));
                    if (Test.bFld)
                        break;

                    Test.instanceCount += i33;
                    iFld1 -= i36;
                    lArr3[(i34 >>> 1) % N] -= Test.iFld;
                    d5 += Test.instanceCount;
                    i38 *= i36;
                    if (Test.bFld)
                        break;

                }
                Test.fFld += Test.instanceCount;
                switch (((i36 >>> 1) % 1) + 8) {
                    case 8 :
                        iArr2[i34][i34] = ((int) (Test.instanceCount));
                        i39 = 1;
                        do {
                            i36 += i39;
                            i38 = -45822;
                            Test.instanceCount -= ((long) (Test.fFld));
                            Test.instanceCount = Test.iFld;
                            i40 += ((i39 * Test.fFld) + Test.sFld) - i37;
                        } while ((++i39) < 1 );
                        for (i41 = 1; i41 < 1; i41++) {
                            Test.instanceCount += 0L + (i41 * i41);
                            Test.instanceCount = i37;
                            Test.instanceCount += i41 * i41;
                        }
                        iArr2[i34][i34 + 1] = 10;
                        Test.instanceCount += i34;
                        i43 += i34 + i38;
                        break;
                }
                lArr3[i34 + 1] = Test.sFld;
            } 
            Test.iFld = i39;
            i38 += i33;
        } while ((++i33) < 90 );
        FuzzerUtils.out.println((((("i33 i34 i35 = " + i33) + ",") + i34) + ",") + i35);
        FuzzerUtils.out.println((((("i36 d5 i37 = " + i36) + ",") + Double.doubleToLongBits(d5)) + ",") + i37);
        FuzzerUtils.out.println((((("i38 i39 i40 = " + i38) + ",") + i39) + ",") + i40);
        FuzzerUtils.out.println((((("i41 i42 i43 = " + i41) + ",") + i42) + ",") + i43);
        FuzzerUtils.out.println((((("fArr iArr2 dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + ",") + FuzzerUtils.checkSum(iArr2)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println((("sArr lArr3 = " + FuzzerUtils.checkSum(sArr)) + ",") + FuzzerUtils.checkSum(lArr3));
        FuzzerUtils.out.println((((("Test.instanceCount Test.bFld Test.byFld = " + Test.instanceCount) + ",") + (Test.bFld ? 1 : 0)) + ",") + Test.byFld);
        FuzzerUtils.out.println((((("Test.iFld Test.sFld dFld = " + Test.iFld) + ",") + Test.sFld) + ",") + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println((("Test.fFld iFld1 = " + Float.floatToIntBits(Test.fFld)) + ",") + iFld1);
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