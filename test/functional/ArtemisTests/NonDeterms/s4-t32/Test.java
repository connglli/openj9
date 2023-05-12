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

public class Test {

    public static final int N = 256;

    public static volatile long instanceCount = -4803851647869671147L;

    public static volatile int iFld = 3;

    public static boolean bFld = false;

    public static int iFld1 = 214;

    public static int iFld2 = -35359;

    public static volatile int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -13);
    }

    public static long vSmallMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static long lMeth_check_sum = 0;

    public static void vSmallMeth(long l, int i) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -1);
        i *= (Math.abs(98) - ((7 + (i - 14486)) / ((iArr[(i >>> 1) % N]++) | 1)));
        vSmallMeth_check_sum += l + i + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth() {
        float f2 = -98.68F, f3 = -2.109F, fArr[] = new float[N];
        double d = -31.103416;
        int i6 = -24346, i7 = -9133, i8 = -4, i9 = 6243, i10 = 63933, i11 = -4, i12 = -244, i13 = -209, iArr3[] = new int[N];
        long l3 = -99L, lArr[] = new long[N];
        boolean b = true;
        short s = 28790;
        byte by = -36;
        FuzzerUtils.init(iArr3, 2);
        FuzzerUtils.init(lArr, -4668L);
        FuzzerUtils.init(fArr, -1.781F);
        f2 = (float) d;
        i6 = 1;
        while (++i6 < 155) {
            Test.iFld += (int) Test.instanceCount;
            Test.iFld &= (int) l3;
            if (b) {
                if (false) {
                    for (f3 = 1; f3 < 4; ++f3) {
                        i8 = 1;
                        while (++i8 < 2) {
                            if (Test.bFld)
                                break;
                            Test.iFld = (int) l3;
                            Test.bFld = b;
                            iArr3[(int) (f3 + 1)] = Test.iFld;
                        }
                        iArr3[(int) (f3 - 1)] = i8;
                        s = (short) Test.instanceCount;
                    }
                    for (i9 = 1; i9 < 4; ++i9) {
                        i7 = i7;
                        for (i11 = i9; 2 > i11; i11++) {
                            i12 *= (int) f2;
                            Test.instanceCount = i10;
                            if (b) {
                                switch(((i6 % 9) * 5) + 30) {
                                    case 35:
                                        d += i10;
                                        try {
                                            Test.iFld = (62 / Test.iFld1);
                                            Test.iFld1 = (iArr3[i11] / 47);
                                            iArr3[i11 + 1] = (Test.iFld / i6);
                                        } catch (ArithmeticException a_e) {
                                        }
                                        {
                                            java.io.PrintStream ax$4 = System.out;
                                            java.io.PrintStream ax$5 = System.err;
                                            java.io.PrintStream ax$6 = new java.io.PrintStream(new java.io.OutputStream() {

                                                @Override
                                                public void write(int b) throws java.io.IOException {
                                                    // DO NOTHING: DISCARD ALL OUTPUTS
                                                }
                                            });
                                            System.setOut(ax$6);
                                            System.setErr(ax$6);
                                            try {
                                                for (int ax$2 = -3194; ax$2 < 3041; ax$2 += 1) {
                                                    try {
                                                        int ax$0 = 143444;
                                                        ax$0 += 7;
                                                    } catch (Throwable ax$1) {
                                                    } finally {
                                                    }
                                                }
                                            } catch (Throwable ax$3) {
                                            }
                                            System.setOut(ax$4);
                                            System.setErr(ax$5);
                                        }
                                        switch(((55645 >>> 1) % 3) + 2) {
                                            case 2:
                                            case 3:
                                                i10 = i7;
                                                i12 ^= Test.iFld1;
                                                iArr3[i9 - 1] -= -9;
                                                i10 += (i11 - i6);
                                                i10 = -4949;
                                                lArr[i9] >>>= i11;
                                                Test.iFld = (int) l3;
                                                if (Test.bFld)
                                                    continue;
                                                break;
                                            case 4:
                                                Test.instanceCount = (long) d;
                                        }
                                        break;
                                    case 32:
                                        i12 += (((i11 * i9) + i8) - l3);
                                        try {
                                            i7 = (i9 / -35829);
                                            Test.iFld1 = (i7 % i6);
                                            Test.iFld = (iArr3[i6 - 1] % i12);
                                        } catch (ArithmeticException a_e) {
                                        }
                                        i10 -= i6;
                                        Test.iFld1 += i8;
                                        break;
                                    case 31:
                                        iArr3[i11] += (int) 2.15511;
                                        break;
                                    case 49:
                                        d -= i6;
                                        break;
                                    case 50:
                                        iArr3[i11 + 1] >>= i11;
                                        break;
                                    case 36:
                                        lArr[i11] = -3038L;
                                        break;
                                    case 34:
                                        i10 >>= i10;
                                        break;
                                    case 65:
                                        Test.bFld = b;
                                    case 59:
                                        i13 -= i7;
                                        break;
                                }
                            } else {
                                fArr[i6 + 1] %= (i12 | 1);
                            }
                        }
                    }
                } else if (b) {
                    iArr3[i6] = by;
                } else {
                    if (true)
                        continue;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + i6 + l3 + Float.floatToIntBits(f3) + i7 + i8 + (b ? 1 : 0) + s + i9 + i10 + i11 + i12 + i13 + by + FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth(int i5, long l2) {
        int i14 = 2, i15 = 15540, i16 = -218, i17 = -49002, i18 = -45181, i19 = -5, i20 = 197, i21 = 188, iArr4[] = new int[N];
        boolean b1 = true;
        double d1 = 56.101653;
        byte by1 = -76;
        FuzzerUtils.init(iArr4, -28336);
        lMeth();
        i14 = 1;
        do {
            b1 = Test.bFld;
            l2 += Test.iFld1;
            if (b1)
                break;
            d1 -= i5;
            for (i15 = i14; 4 > i15; ++i15) {
                float f4 = 30.481F;
                by1 *= (byte) i14;
                i5 *= 80;
                i16 &= i15;
                Test.instanceCount = 60363;
                i16 = (int) d1;
                f4 += (((i15 * l2) + Test.iFld) - f4);
                l2 <<= i5;
                if (i15 != 0) {
                    vMeth_check_sum += i5 + l2 + i14 + (b1 ? 1 : 0) + Double.doubleToLongBits(d1) + i15 + i16 + by1 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr4);
                    return;
                }
                i16 = -204;
                Test.instanceCount *= (long) 1.112673;
                d1 -= i5;
                l2 += (((i15 * i15) + f4) - Test.iFld1);
                i16 += (i15 * i15);
                Test.iFld >>>= (int) Test.instanceCount;
            }
            d1 = l2;
            Test.iFld += i5;
        } while (++i14 < 161);
        i16 -= i15;
        Test.iArrFld[(Test.iFld >>> 1) % N] = (int) l2;
        Test.iFld = i14;
        i17 = 235;
        while (--i17 > 0) {
            if (b1)
                continue;
            i5 += (i17 * i17);
            if (Test.bFld) {
                Test.iFld1 += i17;
                i18 = 1;
                while (++i18 < 3) {
                    Test.iFld1 = (int) l2;
                    for (i19 = 1; i19 < 1; i19++) {
                        try {
                            i21 = (i18 / i15);
                            Test.iFld1 = (-43 % i21);
                            Test.iFld2 = (62753 % i5);
                        } catch (ArithmeticException a_e) {
                        }
                        Test.iFld >>= i19;
                        Test.iFld2 -= i19;
                    }
                    {
                        java.io.PrintStream ax$14 = System.out;
                        java.io.PrintStream ax$15 = System.err;
                        java.io.PrintStream ax$16 = new java.io.PrintStream(new java.io.OutputStream() {

                            @Override
                            public void write(int b) throws java.io.IOException {
                                // DO NOTHING: DISCARD ALL OUTPUTS
                            }
                        });
                        System.setOut(ax$16);
                        System.setErr(ax$16);
                        try {
                            for (int ax$12 = -2909; ax$12 < 6600; ax$12 += 1) {
                                int ax$10 = i19;
                                try {
                                    int[] ax$7 = new int[] { 0xF1F2F3F4 };
                                    for (int ax$8 = Integer.MIN_VALUE + 4; ax$8 <= 10; ax$8++) {
                                        for (int ax$9 = 4; ax$9 < ax$8 - 5; ax$9++) {
                                            i19 += ax$7[ax$9 - 4];
                                        }
                                    }
                                } catch (Throwable ax$11) {
                                } finally {
                                    i19 = ax$10;
                                }
                            }
                        } catch (Throwable ax$13) {
                        }
                        System.setOut(ax$14);
                        System.setErr(ax$15);
                    }
                }
            } else {
                iArr4[i17 - 1] = Test.iFld1;
            }
        }
        vMeth_check_sum += i5 + l2 + i14 + (b1 ? 1 : 0) + Double.doubleToLongBits(d1) + i15 + i16 + by1 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr4);
    }

    public static int iMeth(long l1) {
        int i1 = 8053, i2 = 42, i3 = 13, i4 = 13013, i22 = -61932, i23 = -83, i24 = -3, i25 = -65332, iArr2[] = new int[N];
        float f1 = 65.136F;
        short s1 = 12094;
        double d2 = 2.83756;
        byte by2 = 1;
        FuzzerUtils.init(iArr2, 54211);
        for (i1 = 204; i1 > 7; --i1) {
            f1 += (-Math.min(Test.iFld - i2, i1 * 161));
        }
        iArr2[(i1 >>> 1) % N] -= (Test.iFld--);
        vSmallMeth(455209117L, i1);
        for (i3 = 14; i3 < 252; ++i3) {
            vMeth(i2, Test.instanceCount);
            Test.iFld1 >>= (int) Test.instanceCount;
            i2 += i3;
            f1 -= (float) 43.7636;
            i2 >>= 10263;
            for (i22 = 1; 3 > i22; i22++) {
                i4 += i22;
                f1 *= i22;
                for (i24 = i22; i24 < 2; ++i24) {
                    s1 -= (short) d2;
                    Test.iFld1 -= (int) Test.instanceCount;
                    l1 += (((i24 * i22) + f1) - i1);
                    try {
                        i2 = (15726 % Test.iArrFld[i3 + 1]);
                        i23 = (-63 % i1);
                        i23 = (42 % Test.iArrFld[i3]);
                    } catch (ArithmeticException a_e) {
                    }
                    switch((i24 % 2) + 73) {
                        case 73:
                            switch((((i4 >>> 1) % 2) * 5) + 74) {
                                case 75:
                                    f1 -= Test.iFld;
                                    i23 >>= i4;
                                    i2 += by2;
                                    i23 >>= Test.iFld1;
                                case 78:
                                    i23 >>= i3;
                                    Test.iFld2 <<= -87;
                                    i25 -= -53;
                                    i4 += i24;
                                    try {
                                        Test.iFld1 = (Test.iFld2 / Test.iFld2);
                                        Test.iFld1 = (25183 / iArr2[i3]);
                                        Test.iArrFld[i24] = (Test.iArrFld[i24 + 1] % i25);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    break;
                                default:
                                    Test.iFld *= (int) l1;
                                    Test.instanceCount = Test.iFld;
                                    i25 = 10;
                                    l1 += Test.iFld1;
                                    i4 = i4;
                            }
                            i25 = (int) -46.720F;
                            i25 *= (int) Test.instanceCount;
                            i2 = (int) Test.instanceCount;
                            break;
                        case 74:
                            Test.instanceCount += (i24 * i24);
                            break;
                        default:
                            Test.iFld1 -= (int) d2;
                    }
                }
            }
        }
        long meth_res = l1 + i1 + i2 + Float.floatToIntBits(f1) + i3 + i4 + i22 + i23 + i24 + i25 + s1 + Double.doubleToLongBits(d2) + by2 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {
        if (ax$17) {
            try {
                while (true) ;
            } catch (Throwable ax$18) {
            } finally {
            }
            return;
        }
        float f = 0.499F;
        int[][] iArr1 = new int[N][N];
        FuzzerUtils.init(iArr1, -6);
        for (int smallinvoc = 0; smallinvoc < 941; smallinvoc++) vSmallMeth((long) (f + (f *= (Test.iFld++))), (int) (((-1.756F - iArr1[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N]) - (-34 + Test.instanceCount)) + iMeth(Test.instanceCount)));
        FuzzerUtils.out.println("f iArr1 = " + Float.floatToIntBits(f) + "," + FuzzerUtils.checkSum(iArr1));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iFld1 Test.iFld2 Test.iArrFld = " + Test.iFld1 + "," + Test.iFld2 + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }

    public static void main(String[] strArr) {
        if (ax$24) {
            int ax$29 = iFld2;
            try {
                java.lang.Long[] ax$27 = new java.lang.Long[1165];
                java.lang.Integer[] ax$26 = new java.lang.Integer[3948];
                for (int ax$28 = 0; ax$28 < iFld2; ax$28++) {
                    ax$26[ax$28] = Integer.valueOf(ax$28);
                    ax$27[ax$28] = Long.valueOf(ax$28 + iFld2);
                }
            } catch (Throwable ax$30) {
            } finally {
                iFld2 = ax$29;
            }
            return;
        }
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    private static Boolean ax$17 = false;

    private static Boolean ax$24 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  vSmallMeth ->  vSmallMeth mainTest Test iMeth
// DEBUG  iMeth ->  iMeth mainTest
// DEBUG  vMeth ->  vMeth iMeth mainTest
// DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}

