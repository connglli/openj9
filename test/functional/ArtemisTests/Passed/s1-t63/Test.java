// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.math.BigDecimal;

public class Test {

    public static final int N = 256;

    public static long instanceCount = -218L;

    public static byte byFld = -115;

    public static boolean bFld = true;

    public static byte byFld1 = 102;

    public static double dFld = -2.119101;

    public static volatile int iFld = -7;

    public static volatile long lFld = 1521482856L;

    public long lFld1 = -136L;

    public static byte byFld2 = -42;

    public static float[] fArrFld = new float[N];

    public static volatile int[] iArrFld = new int[N];

    public static long[] lArrFld = new long[N];

    public short[] sArrFld = new short[N];

    public byte[] byArrFld = new byte[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.33F);
        FuzzerUtils.init(Test.iArrFld, 8);
        FuzzerUtils.init(Test.lArrFld, 662807752L);
    }

    public static long vSmallMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long dMeth_check_sum = 0;

    public static double dMeth(int i3) {
        int i4 = 3533, i5 = -55, i6 = -54111, i7 = -44323, i8 = -2;
        short s = -31088, sArr[] = new short[N];
        double d = -2.12763;
        byte[] byArr = new byte[N];
        boolean[] bArr = new boolean[N];
        long[][] lArr = new long[N][N];
        FuzzerUtils.init(byArr, (byte) 97);
        FuzzerUtils.init(sArr, (short) -10713);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr, 2075500894681520363L);
        try {
            i3 |= i3;
            Test.instanceCount *= Test.byFld;
            for (i4 = 208; i4 > 9; --i4) {
                if (i5 != 0) {
                }
                s += (short) 52L;
                for (i6 = 3; i6 > 1; i6--) {
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount -= Test.instanceCount;
                    byArr[i6 + 1] = (byte) d;
                    i7 >>>= i6;
                    i5 += i6;
                    Test.fArrFld[i4] += Test.instanceCount;
                    sArr[i6 - 1] >>= (short) i4;
                    i3 = i6;
                    i5 += i6;
                    i3 -= (int) 109.59069;
                    i5 += i6;
                    i8 = 1;
                    do {
                        float f = 1.634F;
                        i3 += (int) f;
                        i3 |= (int) Test.instanceCount;
                        bArr[i4 + 1] = Test.bFld;
                        i3 += (11028 + (i8 * i8));
                        i5 += i4;
                        d = 12751;
                        i3 -= -54;
                        switch((((12 >>> 1) % 6) * 5) + 63) {
                            case 77:
                                Test.instanceCount *= i4;
                                lArr[i4][(i7 >>> 1) % N] = (long) d;
                                try {
                                    Test.iArrFld[i6 + 1] = (i6 / -1575658619);
                                    i5 = (-957757246 / i6);
                                    i7 = (i7 % i8);
                                } catch (ArithmeticException a_e) {
                                }
                                Test.bFld = true;
                                if (Test.bFld) {
                                    s += (short) (i8 ^ i3);
                                    Test.iArrFld[i6] += i7;
                                    bArr = FuzzerUtils.boolean1array(N, (boolean) true);
                                    Test.instanceCount *= -49682;
                                } else {
                                    i5 += (((i8 * Test.instanceCount) + i3) - Test.instanceCount);
                                }
                                break;
                            case 70:
                                Test.instanceCount += i8;
                                break;
                            case 66:
                                i3 += (i8 * i8);
                                break;
                            case 69:
                                i7 += (int) d;
                                break;
                            case 81:
                                Test.byFld1 -= (byte) i3;
                                break;
                            case 86:
                                d -= d;
                                break;
                            default:
                                Test.iArrFld[i4 + 1] |= i5;
                        }
                        {
                            java.io.PrintStream ax$6 = System.out;
                            java.io.PrintStream ax$7 = System.err;
                            java.io.PrintStream ax$8 = new java.io.PrintStream(new java.io.OutputStream() {

                                @Override
                                public void write(int b) throws java.io.IOException {
                                    // DO NOTHING: DISCARD ALL OUTPUTS
                                }
                            });
                            System.setOut(ax$8);
                            System.setErr(ax$8);
                            try {
                                for (int ax$4 = -3547; ax$4 < 5728; ax$4 += 1) {
                                    int ax$0 = i5;
                                    int ax$1 = i6;
                                    int ax$2 = i4;
                                    try {
                                        if (i4 < 0) {
                                            i6++;
                                        } else {
                                            i5++;
                                        }
                                    } catch (Throwable ax$3) {
                                    } finally {
                                        i5 = ax$0;
                                        i6 = ax$1;
                                        i4 = ax$2;
                                    }
                                }
                            } catch (Throwable ax$5) {
                            }
                            System.setOut(ax$6);
                            System.setErr(ax$7);
                        }
                    } while (++i8 < 2);
                }
            }
        } catch (NegativeArraySizeException exc1) {
            i7 >>= Test.byFld1;
        }
        long meth_res = i3 + i4 + i5 + s + i6 + i7 + Double.doubleToLongBits(d) + i8 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static int iMeth(int i2) {
        byte by = 4;
        int i9 = 55406, i10 = 26986, i11 = -133, i12 = 212, i13 = 10;
        double d1 = 69.48694;
        long l = -5L;
        short s1 = -29944;
        by = (byte) dMeth(i2);
        i2 = i2;
        for (i9 = 5; 96 > i9; ++i9) {
            i2 = (int) Test.instanceCount;
            Test.dFld += Test.instanceCount;
            i10 = i9;
            for (i11 = 1; i11 < 6; ++i11) {
                switch((((i9 >>> 1) % 1) * 5) + 96) {
                    case 100:
                        Test.instanceCount += (long) -1.750F;
                        Test.lArrFld[i9] |= Test.instanceCount;
                        i10 = i2;
                        i12 += i11;
                        i2 = i9;
                        i10 -= i9;
                        i10 -= (int) Test.instanceCount;
                        break;
                    default:
                        i12 = i2;
                        i12 += i11;
                        Test.iArrFld = FuzzerUtils.int1array(N, (int) -198);
                        if (Test.bFld)
                            continue;
                        {
                            java.io.PrintStream ax$16 = System.out;
                            java.io.PrintStream ax$17 = System.err;
                            java.io.PrintStream ax$18 = new java.io.PrintStream(new java.io.OutputStream() {

                                @Override
                                public void write(int b) throws java.io.IOException {
                                    // DO NOTHING: DISCARD ALL OUTPUTS
                                }
                            });
                            System.setOut(ax$18);
                            System.setErr(ax$18);
                            try {
                                for (int ax$14 = -3735; ax$14 < 5568; ax$14 += 1) {
                                    int ax$12 = i9;
                                    try {
                                        int[] ax$9 = { 3, 9, 13 };
                                        int[] ax$11 = { 7 };
                                        for (int ax$10 = 0; ax$10 < ax$11.length; ax$10 += 1) {
                                            ax$11[ax$10] = (int) (ax$9[ax$10] >>> i9);
                                        }
                                    } catch (Throwable ax$13) {
                                    } finally {
                                        i9 = ax$12;
                                    }
                                }
                            } catch (Throwable ax$15) {
                            }
                            System.setOut(ax$16);
                            System.setErr(ax$17);
                        }
                        Test.instanceCount += i10;
                        Test.iArrFld[i9] *= i11;
                        Test.instanceCount += (i11 * i11);
                }
                by = (byte) i2;
                i10 += i11;
                i12 >>= (int) -7L;
                Test.instanceCount -= i12;
                Test.byFld = (byte) i10;
                for (d1 = 1; d1 < 2; d1 += 2) {
                    Test.lArrFld[(int) (d1)] <<= by;
                    l <<= by;
                    i10 += (int) -17L;
                }
            }
            Test.dFld = Test.instanceCount;
            Test.bFld = Test.bFld;
            Test.bFld = Test.bFld;
            l += (-50179 + (i9 * i9));
            Test.fArrFld[i9 + 1] += i2;
            s1 += (short) l;
        }
        long meth_res = i2 + by + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d1) + i13 + l + s1;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vSmallMeth() {
        int i1 = 211, iArr[] = new int[N];
        FuzzerUtils.init(iArr, 192);
        iArr = (iArr = (iArr = (iArr = iArr)));
        i1 -= iMeth(i1);
        {
            java.io.PrintStream ax$19 = System.out;
            java.io.PrintStream ax$20 = System.err;
            java.io.PrintStream ax$21 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$21);
            System.setErr(ax$21);
            {
                boolean ax$28 = false;
                for (int ax$27 = -450; ax$27 < 7540; ax$27 += 5) {
                    if (!ax$28) {
                        ax$28 = true;
                        {
                            System.setOut(ax$19);
                            System.setErr(ax$20);
                            vSmallMeth_check_sum += i1 + FuzzerUtils.checkSum(iArr);
                            System.setOut(ax$21);
                            System.setErr(ax$21);
                        }
                    }
                    try {
                        java.lang.String[] ax$24 = { "f1" };
                        java.math.BigDecimal ax$25 = new BigDecimal("123e3");
                        for (String ax$22 : ax$24) {
                            BigDecimal ax$23 = new BigDecimal(ax$22);
                            // System.err.println("Testing " + s);
                            if (!ax$25.equals(ax$23) || ax$23.precision() != 1) {
                            }
                        }
                    } catch (Throwable ax$26) {
                    } finally {
                    }
                }
            }
            System.setOut(ax$19);
            System.setErr(ax$20);
        }
    }

    public void mainTest(String[] strArr1) {
        long l1 = 4L;
        int i14 = -33, i15 = 9912, i16 = -34580, i17 = 13, i18 = 10, i19 = 7, i20 = -2177, i21 = -3, i22 = 19;
        short s2 = 550;
        float f1 = 17.111F;
        for (int smallinvoc = 0; smallinvoc < 128; smallinvoc++) vSmallMeth();
        Test.iFld *= Test.iFld;
        for (l1 = 7; l1 < 134; l1++) {
            switch((((Test.iFld >>> 1) % 9) * 5) + 94) {
                case 121:
                    Test.instanceCount += (long) 2.247F;
                    i14 <<= (int) l1;
                    if (Test.bFld)
                        continue;
                    Test.instanceCount += i14;
                    for (i15 = 1; i15 < 40; ++i15) {
                        Test.iArrFld[(int) (l1)] |= i15;
                        Test.iFld += (7 + (i15 * i15));
                        Test.lFld -= i14;
                        switch((i15 % 1) + 33) {
                            case 33:
                                sArrFld[i15 + 1] += s2;
                                Test.instanceCount += 62213;
                                i16 >>>= Test.iFld;
                                i16 -= -9134;
                                i17 = 1;
                                do {
                                    Test.iFld += (i17 ^ i14);
                                    i14 += (i17 | s2);
                                    Test.instanceCount += (((i17 * i14) + i16) - i14);
                                    i14 >>= Test.iFld;
                                    i16 *= (int) f1;
                                } while (++i17 < 2);
                                Test.iFld = (int) Test.lFld;
                                Test.iArrFld[(int) (l1 + 1)] = (int) lFld1;
                                break;
                            default:
                                Test.iFld = 12412;
                                f1 += i15;
                                i14 = (int) Test.lFld;
                                f1 *= i14;
                                if (Test.bFld) {
                                    f1 *= i15;
                                } else {
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
                                        boolean ax$38 = false;
                                        for (int ax$37 = -2141; ax$37 < 4920; ax$37 += 8) {
                                            if (!ax$38) {
                                                ax$38 = true;
                                                {
                                                    System.setOut(ax$29);
                                                    System.setErr(ax$30);
                                                    if (Test.bFld) {
                                                        i18 = 1;
                                                        do {
                                                            f1 = f1;
                                                            i16 -= -39521;
                                                            i14 = (int) Test.dFld;
                                                            i14 += i18;
                                                            f1 = Test.iFld;
                                                            Test.iFld += i14;
                                                            i16 += (i18 * i18);
                                                            i16 += i18;
                                                            lFld1 = Test.lFld;
                                                            Test.instanceCount += i15;
                                                            i14 *= (int) -127.246F;
                                                        } while (++i18 < 2);
                                                        i19 = 1;
                                                        do {
                                                            Test.bFld = false;
                                                            f1 -= i17;
                                                            Test.dFld += -8;
                                                            Test.byFld1 = (byte) l1;
                                                            Test.lArrFld[i19 - 1] *= Test.byFld1;
                                                        } while (++i19 < 2);
                                                        Test.byFld1 += (byte) i15;
                                                        i14 += i15;
                                                        for (i20 = 1; i20 < 2; ++i20) {
                                                            Test.lFld = Test.lFld;
                                                            f1 += Test.byFld2;
                                                            Test.iFld -= i17;
                                                            Test.byFld -= (byte) i21;
                                                            Test.iArrFld = Test.iArrFld;
                                                            Test.lArrFld[i15 - 1] -= i17;
                                                            Test.dFld += i17;
                                                            i21 >>= (int) lFld1;
                                                            Test.instanceCount = i16;
                                                            switch((int) (((l1 % 1) * 5) + 41)) {
                                                                case 46:
                                                                    f1 += (i20 - i15);
                                                                    Test.iFld -= i18;
                                                                    f1 += i19;
                                                                    Test.lFld = -61;
                                                                    byArrFld[(int) (l1)] += (byte) l1;
                                                                    i16 += (((i20 * i15) + Test.iFld) - i18);
                                                                    Test.iArrFld[i15 - 1] = i15;
                                                                    Test.fArrFld = Test.fArrFld;
                                                                    Test.iFld = (int) f1;
                                                                    break;
                                                                default:
                                                                    if (Test.bFld)
                                                                        break;
                                                                    try {
                                                                        Test.iFld = (i17 % 1114931740);
                                                                        i22 = (i22 % i15);
                                                                        Test.iArrFld[i15] = (Test.iFld % 2759);
                                                                    } catch (ArithmeticException a_e) {
                                                                    }
                                                            }
                                                            i14 += i21;
                                                            Test.iArrFld[i15 - 1] -= Test.iFld;
                                                        }
                                                    } else {
                                                        i16 = 6;
                                                    }
                                                    System.setOut(ax$31);
                                                    System.setErr(ax$31);
                                                }
                                            }
                                            long ax$32 = iMeth_check_sum;
                                            long ax$33 = l1;
                                            long ax$34 = dMeth_check_sum;
                                            int ax$35 = i19;
                                            try {
                                                if (l1 == dMeth_check_sum) {
                                                    if (iMeth_check_sum != 0) {
                                                        i19++;
                                                    }
                                                }
                                            } catch (Throwable ax$36) {
                                            } finally {
                                                iMeth_check_sum = ax$32;
                                                l1 = ax$33;
                                                dMeth_check_sum = ax$34;
                                                i19 = ax$35;
                                            }
                                        }
                                    }
                                    System.setOut(ax$29);
                                    System.setErr(ax$30);
                                }
                        }
                    }
                case 96:
                    i14 = (int) l1;
                    break;
                case 120:
                    Test.byFld2 >>= (byte) lFld1;
                    break;
                case 106:
                    Test.iFld = -122;
                    break;
                case 132:
                    i22 = -223;
                    break;
                case 134:
                    if (false)
                        continue;
                    break;
                case 123:
                    i22 += (int) (l1 + Test.instanceCount);
                    break;
                case 126:
                    s2 = (short) i19;
                    break;
                case 111:
                    f1 *= 39926;
                    break;
            }
        }
        FuzzerUtils.out.println("l1 i14 i15 = " + l1 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 s2 i17 = " + i16 + "," + s2 + "," + i17);
        FuzzerUtils.out.println("f1 i18 i19 = " + Float.floatToIntBits(f1) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.bFld = " + Test.instanceCount + "," + Test.byFld + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.byFld1 Test.dFld Test.iFld = " + Test.byFld1 + "," + Double.doubleToLongBits(Test.dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.lFld lFld1 Test.byFld2 = " + Test.lFld + "," + lFld1 + "," + Test.byFld2);
        FuzzerUtils.out.println("Test.fArrFld Test.iArrFld Test.lArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("sArrFld byArrFld = " + FuzzerUtils.checkSum(sArrFld) + "," + FuzzerUtils.checkSum(byArrFld));
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
// DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
// DEBUG  dMeth ->  dMeth iMeth vSmallMeth mainTest Test
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}
