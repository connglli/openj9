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

    public static long instanceCount = -77L;

    public static volatile byte byFld = -46;

    public static short sFld = 22147;

    public int iFld = -6;

    public static double[] dArrFld = new double[N];

    public static int[][] iArrFld = new int[N][N];

    public static volatile short[] sArrFld = new short[N];

    public static float[] fArrFld = new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -46.29319);
        FuzzerUtils.init(Test.iArrFld, -11);
        FuzzerUtils.init(Test.sArrFld, (short) -15638);
        FuzzerUtils.init(Test.fArrFld, 66.1021F);
    }

    public static long vMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, float f2) {
        int i8 = -76, i9 = -10, i10 = -11, i11 = 0, i12 = -4335, i13 = 138, iArr1[] = new int[N];
        long l = 55L, lArr[] = new long[N];
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, -2.28802);
        FuzzerUtils.init(iArr1, 60);
        FuzzerUtils.init(lArr, 4278128880L);
        i7 = i7;
        i8 = 1;
        {
            java.io.PrintStream ax$0 = System.out;
            java.io.PrintStream ax$1 = System.err;
            java.io.PrintStream ax$2 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$2);
            System.setErr(ax$2);
            {
                boolean ax$10 = false;
                for (int ax$9 = -3391; ax$9 < 3148; ax$9 += 9) {
                    if (!ax$10) {
                        ax$10 = true;
                        {
                            System.setOut(ax$0);
                            System.setErr(ax$1);
                            while (++i8 < 113) {
                                for (l = 1; l < 5; ++l) {
                                    for (i10 = 1; i10 < 2; ++i10) {
                                        f2 = Test.instanceCount;
                                        f2 = i10;
                                        Test.byFld += (byte) (i10 * Test.instanceCount);
                                        switch((int) ((l % 2) + 110)) {
                                            case 110:
                                                Test.instanceCount >>= i8;
                                                Test.instanceCount -= i10;
                                                i9 += i11;
                                                f2 += i9;
                                                f2 -= i8;
                                                f2 = i8;
                                                break;
                                            case 111:
                                                Test.instanceCount += (i10 - f2);
                                                i7 |= (int) l;
                                                i11 *= i8;
                                                i9 *= (int) Test.instanceCount;
                                                i11 += (((i10 * l) + Test.instanceCount) - Test.instanceCount);
                                                dArr[i8] -= i10;
                                            default:
                                                i9 = (int) Test.instanceCount;
                                                iArr1 = iArr1;
                                                i9 += i11;
                                                f2 -= i11;
                                                i7 = i9;
                                                i11 *= i7;
                                                Test.instanceCount += i8;
                                                Test.instanceCount = 9;
                                        }
                                        iArr1[i10] <<= -10;
                                        f2 = i10;
                                        lArr = lArr;
                                    }
                                }
                                Test.instanceCount &= Test.sFld;
                                f2 += 15709;
                                i7 &= i11;
                                for (i12 = 1; i12 < 5; i12++) {
                                    i9 <<= (int) Test.instanceCount;
                                    f2 *= i9;
                                }
                            }
                            System.setOut(ax$2);
                            System.setErr(ax$2);
                        }
                    }
                    long ax$5 = l;
                    long ax$6 = vMeth1_check_sum;
                    long ax$7 = iMeth_check_sum;
                    try {
                        /*
             * Make the dividend positive shifting it right by 1 bit then get
             * the quotient an remainder and correct them properly
             */
                        long ax$3 = l >>> 1;
                        long ax$4 = 1000000000L >>> 1;
                        iMeth_check_sum = ax$3 / ax$4;
                        vMeth1_check_sum = ax$3 % ax$4;
                        // double the remainder and add 1 if 'a' is odd
                        vMeth1_check_sum = (vMeth1_check_sum << 1) + (l & 1);
                    } catch (Throwable ax$8) {
                    } finally {
                        l = ax$5;
                        vMeth1_check_sum = ax$6;
                        iMeth_check_sum = ax$7;
                    }
                }
            }
            System.setOut(ax$0);
            System.setErr(ax$1);
        }
        vMeth1_check_sum += i7 + Float.floatToIntBits(f2) + i8 + l + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {
        int i14 = -54863, i17 = 0, i18 = 6, i19 = 249, i20 = -33234, iArr2[] = new int[N];
        float f3 = -1.800F, fArr[] = new float[N];
        double d2 = 0.3162;
        long l1 = 7427L, lArr1[] = new long[N];
        boolean b1 = true;
        FuzzerUtils.init(iArr2, -68);
        FuzzerUtils.init(lArr1, -10718L);
        FuzzerUtils.init(fArr, -1.1001F);
        vMeth1(i14, f3);
        i14 ^= (int) Test.instanceCount;
        for (int i15 : iArr2) {
            for (i17 = 1; i17 < 2; i17++) {
                Test.byFld += (byte) (6.350F + (i17 * i17));
                f3 -= -15128L;
                iArr2[i17 - 1] = (int) d2;
                for (i19 = 1; i19 < 2; i19++) {
                    switch((i17 % 1) + 14) {
                        case 14:
                            i20 >>= (int) Test.instanceCount;
                            i18 = Test.byFld;
                            i20 += (int) Test.instanceCount;
                            lArr1[i19 - 1] += i15;
                            switch(((i19 % 2) * 5) + 93) {
                                case 98:
                                    i14 *= -2;
                                    iArr2[i19 + 1] -= Test.sFld;
                                    break;
                                case 102:
                                    i14 >>>= i14;
                                    i18 += (i19 + i19);
                                    iArr2[i17 - 1] = i17;
                                    i18 = i18;
                                    f3 += (i19 - Test.instanceCount);
                                    Test.instanceCount = i17;
                                    i20 = (int) l1;
                                    iArr2[i17 + 1] -= i17;
                                    l1 -= i20;
                                    if (b1) {
                                        i20 += (i19 | i20);
                                        i18 = i14;
                                        Test.instanceCount += Test.sFld;
                                        i18 = i18;
                                        Test.dArrFld[i19 - 1] = -42;
                                        Test.instanceCount = i19;
                                        fArr = fArr;
                                        if (b1)
                                            break;
                                    } else if (false) {
                                        i15 -= (int) Test.instanceCount;
                                        i20 += i19;
                                        Test.instanceCount = i14;
                                    } else {
                                        Test.instanceCount <<= 12;
                                    }
                                    break;
                            }
                            break;
                        default:
                            l1 += Test.sFld;
                    }
                }
            }
        }
        long meth_res = i14 + Float.floatToIntBits(f3) + i17 + i18 + Double.doubleToLongBits(d2) + i19 + i20 + l1 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i5, double d1, int i6) {
        boolean b = true, bArr[] = new boolean[N];
        int i21 = -1, i22 = -4, i23 = -213, i24 = -12, i25 = 39563, i26 = -35757;
        float f4 = -2.280F;
        long l2 = -3L, lArr2[] = new long[N];
        short s = 29459;
        FuzzerUtils.init(lArr2, 25470L);
        FuzzerUtils.init(bArr, true);
        b = ((b = (b || b)) && ((i6 << Test.byFld) != i5));
        i6 = iMeth();
        i21 = 1;
        do {
            i5 = -63505;
            i5 += (((i21 * i6) + i6) - f4);
            switch((i21 % 10) + 4) {
                case 4:
                    i6 -= i21;
                    switch((i21 % 2) + 120) {
                        case 120:
                            Test.instanceCount <<= Test.byFld;
                            i6 >>= i21;
                            i6 += i21;
                            i6 = (int) -10L;
                            lArr2[i21 - 1] <<= 14;
                            i5 += (int) Test.instanceCount;
                            Test.iArrFld[i21][i21] -= -40;
                            i6 += i5;
                            switch((i21 % 5) + 29) {
                                case 29:
                                    i5 = i6;
                                    lArr2[i21 - 1] -= (long) f4;
                                case 30:
                                case 31:
                                    for (i22 = 1; 5 > i22; i22++) {
                                        switch(((i5 >>> 1) % 5) + 127) {
                                            case 127:
                                                for (l2 = 1; 2 > l2; l2++) {
                                                    f4 = i24;
                                                }
                                                {
                                                    java.io.PrintStream ax$26 = System.out;
                                                    java.io.PrintStream ax$27 = System.err;
                                                    java.io.PrintStream ax$28 = new java.io.PrintStream(new java.io.OutputStream() {

                                                        @Override
                                                        public void write(int b) throws java.io.IOException {
                                                            // DO NOTHING: DISCARD ALL OUTPUTS
                                                        }
                                                    });
                                                    System.setOut(ax$28);
                                                    System.setErr(ax$28);
                                                    try {
                                                        for (int ax$24 = -2611; ax$24 < 6372; ax$24 += 1) {
                                                            int ax$22 = i22;
                                                            try {
                                                                if (i22 < 0)
                                                                    ;
                                                            } catch (Throwable ax$23) {
                                                            } finally {
                                                                i22 = ax$22;
                                                            }
                                                        }
                                                    } catch (Throwable ax$25) {
                                                    }
                                                    System.setOut(ax$26);
                                                    System.setErr(ax$27);
                                                }
                                                for (i25 = 2; i25 > 1; i25--) {
                                                    Test.instanceCount *= Test.instanceCount;
                                                    Test.sFld = (short) i21;
                                                    Test.iArrFld[i21 + 1][i25 + 1] -= Test.byFld;
                                                    i24 = i26;
                                                    Test.sFld = s;
                                                    i5 += (((i25 * i22) + i25) - i22);
                                                    Test.iArrFld[i25 + 1][i21] += i21;
                                                    bArr[i21] = b;
                                                    Test.instanceCount += (((i25 * i21) + i22) - i5);
                                                    lArr2[i25] *= (long) d1;
                                                    i23 += (2 + (i25 * i25));
                                                    i5 -= (int) -72.129662;
                                                    i5 -= i5;
                                                }
                                                break;
                                            case 128:
                                                Test.iArrFld[i21 + 1][i21] = (int) Test.instanceCount;
                                                break;
                                            case 129:
                                                Test.instanceCount += -11547;
                                                break;
                                            case 130:
                                            case 131:
                                                if (b)
                                                    continue;
                                                break;
                                            default:
                                                i24 -= (int) Test.instanceCount;
                                        }
                                    }
                                    break;
                                case 32:
                                    try {
                                        i23 = (i23 / Test.iArrFld[i21][i21 - 1]);
                                        Test.iArrFld[i21 - 1][i21] = (i24 / 23);
                                        i24 = (i26 % Test.iArrFld[i21 - 1][i21 + 1]);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    break;
                                case 33:
                                    Test.instanceCount = -138;
                                    break;
                            }
                            break;
                        case 121:
                            Test.instanceCount = i21;
                            break;
                        default:
                            if (i21 != 0) {
                                vMeth_check_sum += i5 + Double.doubleToLongBits(d1) + i6 + (b ? 1 : 0) + i21 + Float.floatToIntBits(f4) + i22 + i23 + l2 + i24 + i25 + i26 + s + FuzzerUtils.checkSum(lArr2) + FuzzerUtils.checkSum(bArr);
                                return;
                            }
                    }
                case 5:
                    d1 *= i22;
                    break;
                case 6:
                    d1 -= i25;
                    break;
                case 7:
                case 8:
                    i26 = i6;
                    break;
                case 9:
                    Test.instanceCount >>>= Test.instanceCount;
                    break;
                case 10:
                    i26 += (i21 | i21);
                    break;
                case 11:
                    Test.iArrFld[i21 - 1] = Test.iArrFld[i21 + 1];
                    break;
                case 12:
                    lArr2 = lArr2;
                case 13:
                    i26 = i5;
                    break;
            }
        } while (++i21 < 123);
        vMeth_check_sum += i5 + Double.doubleToLongBits(d1) + i6 + (b ? 1 : 0) + i21 + Float.floatToIntBits(f4) + i22 + i23 + l2 + i24 + i25 + i26 + s + FuzzerUtils.checkSum(lArr2) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {
        double d = 0.30814;
        int i1 = -123, i2 = 221, i3 = 52498, i4 = 55924, i27 = 78, i28 = -19764, i29 = 12, iArr[] = new int[N];
        float f = 118.717F, f1 = 2.434F, f5 = 1.784F;
        boolean b2 = true;
        long[] lArr3 = new long[N];
        FuzzerUtils.init(iArr, -151);
        FuzzerUtils.init(lArr3, 8666152341218018125L);
        Test.instanceCount -= 36;
        for (int i : iArr) {
            Test.instanceCount /= (((long) (d - (i = (int) (d - 34022)))) | 1);
            for (i1 = 1; i1 < 20; i1++) {
                {
                    java.io.PrintStream ax$29 = System.out;
                    java.io.PrintStream ax$30 = System.err;
                    java.io.PrintStream ax$31 = new java.io.PrintStream(new java.io.OutputStream() {

                        @Override
                        public void write(int b) throws java.io.IOException {
                            // DO NOTHING: DISCARD ALL OUTPUTS
                        }
                    });
                    System.setOut(ax$31);
                    System.setErr(ax$31);
                    {
                        boolean ax$33 = false;
                        for (int ax$32 = -3717; ax$32 < 1967; ax$32 += 3) {
                            if (!ax$33) {
                                ax$33 = true;
                                {
                                    System.setOut(ax$29);
                                    System.setErr(ax$30);
                                    for (i3 = 1; i3 < 2; i3++) {
                                        iArr[i1 + 1] = (int) Math.abs(f++);
                                        Test.instanceCount += (long) ((-(i--)) - f);
                                        iArr[i1] += (int) (((i--) - (i2 + f)) * ((d * f1) % ((--i4) | 1)));
                                        vMeth(i1, d, i4);
                                        Test.instanceCount += iFld;
                                        f += (float) -1.20645;
                                        Test.instanceCount <<= i;
                                        i2 -= i;
                                        i4 += (i3 ^ i2);
                                        Test.dArrFld[i1 - 1] = i1;
                                        d -= Test.byFld;
                                    }
                                    System.setOut(ax$31);
                                    System.setErr(ax$31);
                                }
                            }
                        }
                    }
                    System.setOut(ax$29);
                    System.setErr(ax$30);
                }
                for (i27 = i1; i27 < 2; i27++) {
                    i4 -= i28;
                    i28 += i;
                    Test.instanceCount <<= 33;
                    i4 *= i1;
                    f1 += (195 + (i27 * i27));
                    Test.instanceCount &= iFld;
                    i4 += i2;
                    Test.instanceCount += (i27 - i28);
                    Test.byFld += (byte) (((i27 * f1) + f1) - i1);
                    i28 += (i27 * Test.instanceCount);
                    if (b2) {
                        Test.instanceCount <<= -8929;
                        i -= i3;
                        switch((i1 % 2) + 7) {
                            case 7:
                                Test.sArrFld[i27 - 1] += (short) -3102194859L;
                                i4 -= (int) Test.instanceCount;
                                i28 += (int) f;
                                Test.instanceCount -= (long) f1;
                                i2 >>>= (int) Test.instanceCount;
                                Test.fArrFld[i1 - 1] = i3;
                                Test.fArrFld[i1 + 1] *= i2;
                                i4 += (i27 + i4);
                                iFld += (int) (203L + (i27 * i27));
                                i2 += (int) d;
                                break;
                            case 8:
                                d = -1.168;
                                Test.instanceCount += (i27 + i28);
                                i += (((i27 * iFld) + i1) - Test.instanceCount);
                                i28 += (9 + (i27 * i27));
                                switch(((i28 >>> 1) % 9) + 69) {
                                    case 69:
                                        Test.sFld += (short) Test.instanceCount;
                                        i28 *= i1;
                                        break;
                                    case 70:
                                        Test.instanceCount += Test.instanceCount;
                                        iArr[i27 + 1] *= (int) Test.instanceCount;
                                        i = i;
                                        i4 = (int) 125.100F;
                                        i28 >>= i;
                                        i2 += (i27 + Test.instanceCount);
                                        break;
                                    case 71:
                                        Test.byFld += (byte) (((i27 * f1) + i28) - Test.instanceCount);
                                        switch(((i1 >>> 1) % 3) + 118) {
                                            case 118:
                                                iFld += i2;
                                                i = 3;
                                                Test.fArrFld[i27] += i28;
                                                switch((((i2 >>> 1) % 2) * 5) + 100) {
                                                    case 107:
                                                        i28 = i27;
                                                        i -= i1;
                                                        i4 *= i28;
                                                        i2 += i27;
                                                        Test.instanceCount &= i1;
                                                        Test.fArrFld[i1] = 172;
                                                        Test.instanceCount += Test.instanceCount;
                                                        i4 *= (int) f5;
                                                    case 110:
                                                        i29 += (((i27 * i) + i4) - i4);
                                                        Test.byFld += (byte) (((i27 * i2) + i) - Test.instanceCount);
                                                        i28 += (((i27 * i2) + i4) - Test.sFld);
                                                        f1 = i3;
                                                        i -= i3;
                                                        Test.sFld += (short) (3884 + (i27 * i27));
                                                        i4 -= (int) Test.instanceCount;
                                                        break;
                                                }
                                            case 119:
                                                d = i;
                                                break;
                                            case 120:
                                                b2 = b2;
                                        }
                                        break;
                                    case 72:
                                        i += (((i27 * f1) + Test.byFld) - Test.instanceCount);
                                        break;
                                    case 73:
                                        lArr3[i27] = i27;
                                        break;
                                    case 74:
                                        Test.instanceCount = i28;
                                        break;
                                    case 75:
                                        iFld &= i1;
                                        break;
                                    case 76:
                                        Test.instanceCount = (long) f1;
                                        break;
                                    case 77:
                                        i29 = (int) Test.instanceCount;
                                }
                                break;
                            default:
                                lArr3[i27 + 1] >>= i28;
                        }
                    }
                }
            }
        }
        FuzzerUtils.out.println("d i1 i2 = " + Double.doubleToLongBits(d) + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 f = " + i3 + "," + i4 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("f1 i27 i28 = " + Float.floatToIntBits(f1) + "," + i27 + "," + i28);
        FuzzerUtils.out.println("f5 i29 b2 = " + Float.floatToIntBits(f5) + "," + i29 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("iArr lArr3 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr3));
        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.sFld = " + Test.instanceCount + "," + Test.byFld + "," + Test.sFld);
        FuzzerUtils.out.println("iFld Test.dArrFld Test.iArrFld = " + iFld + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.sArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.sArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        if (ax$34) {
            try {
                Thread.currentThread().interrupted();
            } catch (Throwable ax$50) {
            } finally {
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

    private static Boolean ax$34 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  vMeth ->  vMeth mainTest
// DEBUG  iMeth ->  iMeth vMeth mainTest
// DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}

