// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

public class Test {

    public static final int N = 256;

    public static long instanceCount = -62L;

    public int iFld = 172;

    public static double dFld = 2.77645;

    public static short sFld = -51;

    public static boolean bFld = false;

    public static byte byFld = 93;

    public static float fFld = 117.240F;

    public static int[] iArrFld = new int[N];

    public static volatile byte[][] byArrFld = new byte[N][N];

    public static short[][] sArrFld = new short[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 140);
        FuzzerUtils.init(Test.byArrFld, (byte) -80);
        FuzzerUtils.init(Test.sArrFld, (short) 30955);
    }

    public static long iMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5, int i6, int i7) {
        float f1 = 1.909F;
        int i8 = -14, i9 = -182, i10 = -21820, i11 = 11908, i12 = -1, i13 = 8, i14 = 4257, i15 = 4, i16 = 9518, i17 = 5541;
        long l = -13L, lArr1[] = new long[N];
        FuzzerUtils.init(lArr1, -5L);
        Test.instanceCount -= (long) f1;
        for (i8 = 4; i8 < 253; ++i8) {
            byte by = 123;
            Test.iArrFld[i8] -= by;
            i6 <<= (int) Test.instanceCount;
            i6 += i5;
            try {
                i5 = (Test.iArrFld[i8] / i5);
                i7 = (-123 % i6);
                i5 = (i8 / 11972);
            } catch (ArithmeticException a_e) {
            }
        }
        i10 = 1;
        do {
            Test.instanceCount <<= i7;
            for (i11 = 1; i11 < 4; i11++) {
                for (i13 = i11; i13 < 2; i13++) {
                    Test.dFld = Test.sFld;
                    Test.bFld = Test.bFld;
                    f1 += Test.instanceCount;
                    Test.instanceCount >>= i13;
                    lArr1[i11] = i12;
                    Test.iArrFld = Test.iArrFld;
                }
                lArr1[i11 - 1] -= Test.instanceCount;
                i9 >>= 22882;
                i14 <<= (int) Test.instanceCount;
                i5 = (int) Test.instanceCount;
                i12 = (int) f1;
                i7 = -20128;
                if (i8 != 0) {
                    vMeth1_check_sum += i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + l + i17 + FuzzerUtils.checkSum(lArr1);
                    return;
                }
                for (i15 = 1; i15 < 2; ++i15) {
                    Test.iArrFld[i11 - 1] += i7;
                    if (Test.bFld) {
                        i14 = i11;
                        l += (i15 | i11);
                        Test.iArrFld[i15 - 1] = i16;
                    } else if (Test.bFld) {
                        i6 += (i15 * i15);
                        Test.iArrFld[i15] -= i5;
                        i12 = i10;
                        lArr1[i15 + 1] ^= 64;
                        lArr1[i11 - 1] = (long) f1;
                        i12 = (int) Test.instanceCount;
                        Test.instanceCount = i5;
                        if (true)
                            break;
                    } else {
                        i17 = Test.byFld;
                    }
                }
            }
        } while (++i10 < 149);
        vMeth1_check_sum += i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + l + i17 + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i, int i1, int i2) {
        if (ax$0) {
            int ax$2 = i1;
            float ax$3 = fFld;
            try {
                float[] ax$1 = new float[10];
                fFld += ax$1[i1];
            } catch (Throwable ax$4) {
            } finally {
                i1 = ax$2;
                fFld = ax$3;
            }
            return;
        }
        int i3 = 10, i4 = -3, i18 = 182, i19 = 16, i20 = -51138, i21 = 7, i22 = 21439;
        float f2 = -34.480F;
        long[] lArr2 = new long[N];
        FuzzerUtils.init(lArr2, 11337L);
        for (i3 = 2; 211 > i3; ++i3) {
            vMeth1(i2, i1, -63);
            i1 += i2;
            Test.dFld -= -2249L;
            i18 = 1;
            do {
                i2 += i;
                for (i19 = i3; i19 < 1; ++i19) {
                    Test.bFld = true;
                    i1 += -9;
                }
                Test.dFld += i4;
                i4 = i20;
                i1 -= i19;
                i21 = 1;
                while (--i21 > 0) {
                    i4 += i21;
                    if (Test.bFld)
                        continue;
                    i4 = i3;
                    Test.instanceCount *= Test.instanceCount;
                    f2 = i4;
                    Test.instanceCount += (((i21 * i21) + Test.instanceCount) - i2);
                    if (i != 0) {
                        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i18 + i19 + i20 + i21 + Float.floatToIntBits(f2) + i22 + FuzzerUtils.checkSum(lArr2);
                        return;
                    }
                    Test.bFld = Test.bFld;
                    switch(((i18 % 2) * 5) + 107) {
                        case 116:
                            Test.instanceCount += (((i21 * Test.sFld) + i18) - f2);
                            try {
                                i4 = (i21 / i19);
                                Test.iArrFld[i21 + 1] = (i1 / -14916);
                                i4 = (i3 / i21);
                            } catch (ArithmeticException a_e) {
                            }
                            switch(((i4 >>> 1) % 6) + 68) {
                                case 68:
                                    i4 = (int) Test.instanceCount;
                                    Test.iArrFld = Test.iArrFld;
                                    i1 += (i21 + Test.instanceCount);
                                    i22 <<= i3;
                                    i22 >>= i4;
                                    Test.iArrFld[(i2 >>> 1) % N] -= i18;
                                    if (Test.bFld)
                                        break;
                                    Test.byFld -= (byte) i3;
                                    if (false)
                                        continue;
                                    i4 += (((i21 * i1) + i) - i22);
                                    Test.iArrFld[i18 + 1] *= i1;
                                case 69:
                                    Test.iArrFld[i18 + 1] -= i;
                                case 70:
                                    i2 -= (int) Test.dFld;
                                    break;
                                case 71:
                                    if (Test.bFld)
                                        break;
                                case 72:
                                    Test.dFld = -8770;
                                    break;
                                case 73:
                                    lArr2[i3 - 1] = -13;
                                    break;
                            }
                        case 109:
                            Test.instanceCount += (-185 + (i21 * i21));
                            break;
                        default:
                            Test.instanceCount = i3;
                    }
                }
            } while (++i18 < 3);
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i18 + i19 + i20 + i21 + Float.floatToIntBits(f2) + i22 + FuzzerUtils.checkSum(lArr2);
    }

    public int iMeth(float f) {
        float f3 = -19.213F;
        int i23 = 24043, i24 = -56, i25 = 62, i26 = -28010, i27 = -50525, i28 = -8782;
        short s = -31519;
        long l1 = 250L, lArr3[] = new long[N];
        double[] dArr = new double[N];
        FuzzerUtils.init(lArr3, -1276863164L);
        FuzzerUtils.init(dArr, 38.27993);
        f += iFld;
        {
            java.io.PrintStream ax$7 = System.out;
            java.io.PrintStream ax$8 = System.err;
            java.io.PrintStream ax$9 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$9);
            System.setErr(ax$9);
            try {
                ax$0 = true;
                for (int ax$5 = 0; ax$5 < 5311; ax$5 += 1) vMeth(635068093, -1388068160, 1173771372);
            } catch (java.lang.Throwable ax$6) {
            } finally {
                ax$0 = false;
            }
            System.setOut(ax$7);
            System.setErr(ax$8);
        }
        vMeth(iFld, -242, iFld);
        iFld = iFld;
        Test.iArrFld[(iFld >>> 1) % N] += (int) Test.instanceCount;
        for (f3 = 3; 194 > f3; ++f3) {
            try {
                iFld = (iFld / 194);
                iFld = (i23 % Test.iArrFld[(int) (f3 + 1)]);
                Test.iArrFld[(int) (f3 - 1)] = (iFld % -180);
            } catch (ArithmeticException a_e) {
            }
            f += i23;
            iFld -= i23;
            iFld += (-1 + (f3 * f3));
            for (i24 = 1; i24 < 3; i24++) {
                if (Test.bFld) {
                    switch((int) ((f3 % 10) + 15)) {
                        case 15:
                            i26 = 1;
                            do {
                                Test.instanceCount = Test.instanceCount;
                                i23 = i24;
                                i25 = -12;
                                if (false)
                                    continue;
                                Test.iArrFld[i24] -= (int) f;
                                i25 += (((i26 * iFld) + f3) - Test.instanceCount);
                                i25 %= (int) ((long) (Test.dFld) | 1);
                                Test.iArrFld[(int) (f3 - 1)] = (int) Test.instanceCount;
                                Test.instanceCount = -6L;
                                i23 -= (int) f3;
                                iFld = s;
                                switch((((i26 >>> 1) % 8) * 5) + 4) {
                                    case 26:
                                        Test.byFld += (byte) (i26 - iFld);
                                        try {
                                            i23 = (-2436 % i26);
                                            i23 = (iFld / i23);
                                            i25 = (iFld / 131);
                                        } catch (ArithmeticException a_e) {
                                        }
                                        i25 = i23;
                                        Test.iArrFld[i24 + 1] += s;
                                        Test.instanceCount += Test.instanceCount;
                                        if (false)
                                            break;
                                        Test.iArrFld[i26] >>= 13;
                                        i25 -= i25;
                                        i25 += (int) f;
                                        iFld *= (int) Test.dFld;
                                        i25 *= (int) f;
                                        break;
                                    case 8:
                                        l1 += (i26 ^ iFld);
                                        break;
                                    case 20:
                                        i27 <<= i25;
                                    case 13:
                                        i27 += i26;
                                        break;
                                    case 32:
                                        i25 *= (int) -23.334F;
                                    case 43:
                                        lArr3[i26] >>= -41519;
                                    case 35:
                                    case 44:
                                        Test.sFld -= (short) i25;
                                        break;
                                    default:
                                        Test.instanceCount += -607126678L;
                                }
                            } while (++i26 < 2);
                            break;
                        case 16:
                            i27 += i24;
                            break;
                        case 17:
                            iFld = s;
                            break;
                        case 18:
                            iFld += i28;
                        case 19:
                            Test.iArrFld[(int) (f3)] *= -101;
                            break;
                        case 20:
                            lArr3 = lArr3;
                            break;
                        case 21:
                            i27 += i26;
                        case 22:
                            dArr[i24] += i24;
                            break;
                        case 23:
                            iFld += (-111 + (i24 * i24));
                            break;
                        case 24:
                            iFld = 81;
                            break;
                        default:
                            if (Test.bFld)
                                continue;
                    }
                } else {
                    s = (short) 137L;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + Float.floatToIntBits(f3) + i23 + i24 + i25 + i26 + s + l1 + i27 + i28 + FuzzerUtils.checkSum(lArr3) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {
        int i29 = 12, i30 = 144, i31 = 14, i32 = -14, i33 = 14, i34 = -51521, i35 = 205, i36 = 873;
        float f4 = 0.95F, fArr[] = new float[N];
        boolean b = false;
        long[] lArr = new long[N];
        double[] dArr1 = new double[N];
        FuzzerUtils.init(lArr, -1708216673L);
        FuzzerUtils.init(dArr1, 30.30350);
        FuzzerUtils.init(fArr, 124.203F);
        lArr[(iFld >>> 1) % N] += iFld;
        iMeth(-74.389F);
        i29 = 1;
        while (++i29 < 155) {
            iFld >>= i29;
        }
        for (i30 = 1; i30 < 203; ++i30) {
            Test.dFld = f4;
            Test.instanceCount += (i30 * Test.instanceCount);
            Test.iArrFld[i30] = iFld;
            f4 += (((i30 * i29) + iFld) - i29);
            i31 = i31;
            i31 += (((i30 * i29) + i31) - i30);
            Test.bFld = Test.bFld;
            Test.iArrFld[i30] += (int) Test.dFld;
            iFld = i30;
        }
        Test.instanceCount += (long) Test.dFld;
        i32 = 1;
        do {
            Test.dFld += Test.dFld;
            for (i33 = 2; 35 > i33; ++i33) {
                for (i35 = 1; i35 < 2; i35++) {
                    byte by1 = -33;
                    i34 *= (int) f4;
                    Test.dFld = by1;
                    switch((i32 % 3) + 61) {
                        case 61:
                            Test.byArrFld[i32][i35 - 1] >>= (byte) Test.instanceCount;
                            switch(((i33 % 2) * 5) + 5) {
                                case 9:
                                    dArr1[i33] = 147L;
                                    Test.instanceCount <<= i31;
                                    i31 += (i35 ^ Test.instanceCount);
                                    break;
                                case 6:
                                    Test.instanceCount += 86;
                                    fArr[i33 + 1] = Test.instanceCount;
                                    iFld = i32;
                                    Test.instanceCount += (i35 ^ Test.instanceCount);
                                    f4 -= i36;
                                    Test.dFld = Test.instanceCount;
                                    Test.bFld = b;
                                    by1 <<= (byte) i31;
                                    f4 = -8891988289004836215L;
                                    i31 += i35;
                                    break;
                            }
                            iFld <<= i36;
                            iFld += i34;
                            iFld &= -42;
                            lArr[i32 + 1] -= -6;
                            i34 = i36;
                            Test.iArrFld[i33 + 1] >>= 5;
                            i36 <<= 17331;
                            break;
                        case 62:
                            i34 += (48452 + (i35 * i35));
                            fArr = fArr;
                            f4 = (float) -40.38904;
                            i36 += (int) Test.dFld;
                            break;
                        case 63:
                            if (b) {
                                i36 += (int) Test.dFld;
                                Test.instanceCount = (long) f4;
                            } else if (false) {
                                Test.instanceCount = 19300L;
                                i36 -= -10431;
                                i34 = i33;
                                Test.iArrFld[(i35 >>> 1) % N] -= i29;
                                i34 = iFld;
                                i31 += i30;
                                Test.iArrFld[i35 + 1] += i36;
                                iFld += (((i35 * i31) + iFld) - i36);
                                switch((((i30 >>> 1) % 6) * 5) + 13) {
                                    case 39:
                                        iFld *= (int) Test.instanceCount;
                                        Test.instanceCount ^= i34;
                                        iFld -= (int) Test.instanceCount;
                                        iFld *= (int) Test.fFld;
                                        Test.sArrFld[i35][i33 + 1] *= Test.byFld;
                                        Test.iArrFld = Test.iArrFld;
                                        i31 += (i35 | Test.instanceCount);
                                        Test.iArrFld[i33] *= (int) Test.dFld;
                                        i36 *= (int) Test.dFld;
                                        i36 += (i35 * i35);
                                        Test.byFld -= (byte) i33;
                                        Test.instanceCount &= i31;
                                        break;
                                    case 28:
                                        f4 = i34;
                                        i34 = i34;
                                    case 15:
                                        Test.instanceCount *= 11620;
                                    case 27:
                                    case 42:
                                        Test.instanceCount += (((i35 * Test.instanceCount) + i30) - Test.fFld);
                                        break;
                                    case 41:
                                        i31 = iFld;
                                    default:
                                        i31 += (int) Test.instanceCount;
                                }
                            }
                            break;
                    }
                }
            }
        } while (++i32 < 144);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("f4 i32 i33 = " + Float.floatToIntBits(f4) + "," + i32 + "," + i33);
        FuzzerUtils.out.println("i34 i35 i36 = " + i34 + "," + i35 + "," + i36);
        FuzzerUtils.out.println("b lArr dArr1 = " + (b ? 1 : 0) + "," + FuzzerUtils.checkSum(lArr) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.sFld Test.bFld Test.byFld = " + Test.sFld + "," + (Test.bFld ? 1 : 0) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.fFld Test.iArrFld Test.byArrFld = " + Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.byArrFld));
        FuzzerUtils.out.println("Test.sArrFld = " + FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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

    private static Boolean ax$0 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  iMeth ->  iMeth mainTest
// DEBUG  vMeth ->  vMeth iMeth mainTest
// DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}
