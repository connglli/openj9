// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

public class Test {

    public static final int N = 256;

    public static long instanceCount = 7395L;

    public static float fFld = -1.129F;

    public static boolean bFld = true;

    public volatile int iFld = -5;

    public volatile double dFld = -112.29755;

    public static volatile int iFld1 = 33667;

    public static int[] iArrFld = new int[N];

    public static float[] fArrFld = new float[N];

    public static volatile long[] lArrFld = new long[N];

    public static double[] dArrFld = new double[N];

    public static byte[][] byArrFld = new byte[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 133);
        FuzzerUtils.init(Test.fArrFld, 0.686F);
        FuzzerUtils.init(Test.lArrFld, -4L);
        FuzzerUtils.init(Test.dArrFld, 88.71891);
        FuzzerUtils.init(Test.byArrFld, (byte) 109);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {
        int i5 = 10, i6 = -57642, i7 = 54673, i8 = 58428;
        short s = 27045;
        long l = 1296426711L, l1 = -279333808669270064L, lArr[] = new long[N];
        double d = 78.18307;
        byte by = -125, byArr[] = new byte[N];
        FuzzerUtils.init(byArr, (byte) 105);
        FuzzerUtils.init(lArr, -9702L);
        i5 = i5;
        i5 |= s;
        i6 = 1;
        do {
            l = 6;
            do {
                i5 -= (int) d;
                for (i7 = 1; i7 < 1; ++i7) {
                    i8 += (i7 - i6);
                    Test.iArrFld = FuzzerUtils.int1array(N, (int) -47394);
                    Test.instanceCount *= i7;
                    if (Test.bFld) {
                        switch((i6 % 10) + 120) {
                            case 120:
                                switch((i6 % 10) + 125) {
                                    case 125:
                                        switch(((i6 % 10) * 5) + 10) {
                                            case 13:
                                                i5 = i8;
                                                Test.instanceCount = -8238214124675592996L;
                                                i8 = i6;
                                                i5 += (i7 | i7);
                                                Test.fFld *= i6;
                                                i5 += (((i7 * i5) + i5) - i5);
                                                break;
                                            case 17:
                                                Test.instanceCount = Test.instanceCount;
                                                i5 += (((i7 * Test.fFld) + i8) - Test.fFld);
                                                i8 |= i5;
                                                if (i8 != 0) {
                                                    vMeth2_check_sum += i5 + s + i6 + l + Double.doubleToLongBits(d) + i7 + i8 + by + l1 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
                                                    return;
                                                }
                                                break;
                                            case 44:
                                                i8 *= 2;
                                                Test.iArrFld[(int) (l - 1)] *= i6;
                                                i8 += (i7 * i7);
                                                i8 += i8;
                                                Test.iArrFld = Test.iArrFld;
                                                Test.fFld %= (Test.instanceCount | 1);
                                                Test.instanceCount *= s;
                                                i8 ^= i7;
                                                i5 = i6;
                                                i8 += (int) d;
                                                i8 += (int) l;
                                                Test.fFld += i7;
                                                if (true)
                                                    break;
                                                break;
                                            case 50:
                                                Test.instanceCount -= -63362;
                                                break;
                                            case 56:
                                                i5 = -8;
                                                break;
                                            case 11:
                                                i8 -= i6;
                                                break;
                                            case 31:
                                                if (Test.bFld)
                                                    break;
                                            case 47:
                                                Test.iArrFld[i6 - 1] -= (int) Test.instanceCount;
                                                break;
                                            case 24:
                                                i8 >>= i6;
                                                break;
                                            case 32:
                                                Test.fFld = s;
                                                break;
                                            default:
                                                i5 <<= i5;
                                        }
                                        break;
                                    case 126:
                                        i8 >>>= i8;
                                    case 127:
                                        Test.iArrFld[i6 - 1] *= (int) l;
                                        break;
                                    case 128:
                                        Test.instanceCount >>>= by;
                                    case 129:
                                        i8 = i5;
                                    case 130:
                                        l1 -= i7;
                                        break;
                                    case 131:
                                        s = s;
                                        break;
                                    case 132:
                                        i8 = i6;
                                    case 133:
                                    case 134:
                                        Test.fArrFld[i6] = 58171;
                                        break;
                                    default:
                                        by += (byte) (-125 + (i7 * i7));
                                }
                                break;
                            case 121:
                                d = -68.544F;
                            case 122:
                                i5 = i7;
                                break;
                            case 123:
                                l1 = (long) d;
                                break;
                            case 124:
                                Test.iArrFld[(int) (l - 1)] *= (int) Test.fFld;
                                break;
                            case 125:
                                byArr[i6 + 1] = (byte) i5;
                                break;
                            case 126:
                                if (Test.bFld)
                                    break;
                                break;
                            case 127:
                                i5 <<= (int) 2L;
                                break;
                            case 128:
                                i8 = i8;
                                break;
                            case 129:
                                i5 += i8;
                                break;
                            default:
                                i5 = i5;
                        }
                    } else if (Test.bFld) {
                        lArr[i6 - 1] *= i6;
                        vMeth2_check_sum += i5 + s + i6 + l + Double.doubleToLongBits(d) + i7 + i8 + by + l1 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                }
            } while (--l > 0);
        } while (++i6 < 93);
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
                for (int ax$4 = -719; ax$4 < 5994; ax$4 += 1) {
                    try {
                        int ax$2 = 0xf000;
                        ax$2++;
                    } catch (Throwable ax$3) {
                    } finally {
                    }
                }
            } catch (Throwable ax$5) {
            }
            System.setOut(ax$6);
            System.setErr(ax$7);
        }
        vMeth2_check_sum += i5 + s + i6 + l + Double.doubleToLongBits(d) + i7 + i8 + by + l1 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i1, int i2, int i3) {
        int i4 = -124, i9 = -6, i10 = -6, i11 = -1, i12 = 41, i13 = 254, i14 = -13767, i15 = -201, i16 = -195;
        double d1 = 0.72119, dArr[] = new double[N];
        float f = -72.562F;
        byte by1 = -123;
        short[] sArr = new short[N];
        FuzzerUtils.init(dArr, 1.81233);
        FuzzerUtils.init(sArr, (short) -30561);
        i4 = 1;
        while (++i4 < 225) {
            vMeth2();
            i1 -= (int) d1;
            i1 += 103;
            Test.instanceCount += (-15413 + (i4 * i4));
            i3 = (int) Test.fFld;
            i3 += (((i4 * i3) + Test.fFld) - i2);
            Test.fFld += 6583672048226327989L;
            Test.instanceCount = i4;
            i3 += (int) Test.instanceCount;
            {
                java.io.PrintStream ax$9 = System.out;
                java.io.PrintStream ax$10 = System.err;
                java.io.PrintStream ax$11 = new java.io.PrintStream(new java.io.OutputStream() {

                    @Override
                    public void write(int b) throws java.io.IOException {
                        // DO NOTHING: DISCARD ALL OUTPUTS
                    }
                });
                System.setOut(ax$11);
                System.setErr(ax$11);
                {
                    boolean ax$18 = false;
                    for (int ax$17 = -1452; ax$17 < 6426; ax$17 += 7) {
                        if (!ax$18) {
                            ax$18 = true;
                            {
                                System.setOut(ax$9);
                                System.setErr(ax$10);
                                for (f = 3; f > 1; f--) {
                                    Test.instanceCount = Test.instanceCount;
                                    by1 -= (byte) -140L;
                                    Test.iArrFld[i4] -= (int) -38924L;
                                    i9 += i1;
                                    i10 = 1;
                                    do {
                                        Test.lArrFld = Test.lArrFld;
                                        i3 += 44618;
                                    } while (++i10 < 2);
                                    if (Test.bFld)
                                        continue;
                                    i9 += i3;
                                    i1 = (int) -18.305F;
                                    Test.instanceCount |= 321001722L;
                                    i9 += (int) Test.instanceCount;
                                }
                                System.setOut(ax$11);
                                System.setErr(ax$11);
                            }
                        }
                        int ax$14 = i11;
                        int ax$15 = i9;
                        try {
                            short[] ax$12 = new short[] { 20, 10, 0, -10, -20 };
                            short[] ax$13 = new short[] { 20, 10, 0, -10, -20 };
                            ax$13[i9] = (short) (ax$12[i9] | i11);
                        } catch (Throwable ax$16) {
                        } finally {
                            i11 = ax$14;
                            i9 = ax$15;
                        }
                    }
                }
                System.setOut(ax$9);
                System.setErr(ax$10);
            }
            dArr[i4] *= -6;
            for (i11 = 1; i11 < 3; ++i11) {
                i9 >>= i11;
                i13 = 1;
                do {
                    sArr = sArr;
                    Test.fFld = f;
                } while (++i13 < 2);
            }
        }
        for (i14 = 3; i14 < 150; ++i14) {
            Test.fArrFld[i14] = Test.instanceCount;
            Test.fFld = i3;
            i9 += (int) Test.instanceCount;
            Test.instanceCount = i4;
            i16 = 1;
            do {
                Test.lArrFld[i14] += 9;
                i9 += (((i16 * i1) + f) - i9);
            } while ((i16 += 2) < 4);
        }
        vMeth1_check_sum += i1 + i2 + i3 + i4 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f) + i9 + by1 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(int i) {
        int i17 = 35072, i18 = -161, i19 = -47997, i20 = 25279, i21 = 8, i22 = -57477, i23 = 250, i24 = -171, i25 = 7;
        short s1 = 23120;
        double d2 = -1.94487;
        byte[][] byArr1 = new byte[N][N];
        FuzzerUtils.init(byArr1, (byte) -106);
        vMeth1(i, i, i);
        for (i17 = 249; 8 < i17; i17--) {
            i *= i17;
            Test.instanceCount += (i17 + i17);
            for (i19 = i17; i19 < 3; ++i19) {
                if (Test.bFld)
                    continue;
                i += (int) Test.fFld;
                for (i21 = 1; i21 < 1; ++i21) {
                    byte by2 = -77;
                    i -= i20;
                    Test.instanceCount *= 61274L;
                    by2 <<= (byte) 10;
                    s1 = (short) i22;
                    s1 = (short) i22;
                    Test.dArrFld[i17 + 1] += 0;
                    i18 += (((i21 * i19) + i20) - i);
                }
                i18 += (i19 ^ (long) Test.fFld);
                switch(((i19 % 2) * 5) + 85) {
                    case 94:
                        for (d2 = 1; 1 > d2; d2++) {
                            byArr1[i19 + 1][(int) (d2)] = (byte) Test.instanceCount;
                            Test.instanceCount *= Test.instanceCount;
                            Test.iArrFld[(int) (d2 - 1)] = i21;
                            Test.iArrFld[i17] = (int) Test.instanceCount;
                            Test.instanceCount += (long) d2;
                            i18 += (int) (d2 * d2);
                            Test.instanceCount = (long) Test.fFld;
                            Test.instanceCount = Test.instanceCount;
                        }
                        i18 += (((i19 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                        for (i24 = 1; i24 < 1; ++i24) {
                            Test.fFld += (i24 - i21);
                            switch(((i24 % 8) * 5) + 8) {
                                case 43:
                                    i23 -= i25;
                                    Test.fArrFld[i24] *= Test.instanceCount;
                                    if (Test.bFld)
                                        continue;
                                    Test.iArrFld[i17] += (int) Test.instanceCount;
                                    if (Test.bFld)
                                        break;
                                    i20 = -8;
                                    i20 -= i18;
                                case 23:
                                    i22 += i25;
                                    break;
                                case 22:
                                    Test.dArrFld[i24 + 1] += Test.instanceCount;
                                    break;
                                case 31:
                                    i <<= i24;
                                case 29:
                                case 18:
                                    i20 = (int) Test.instanceCount;
                                    break;
                                case 48:
                                    Test.iArrFld[i17 + 1] &= s1;
                                case 12:
                                    i25 = (int) 1268519976144925767L;
                                    break;
                                default:
                                    Test.iArrFld[i17 + 1] = i22;
                            }
                        }
                        break;
                    case 95:
                        Test.fFld = (float) d2;
                        break;
                }
            }
        }
        vMeth_check_sum += i + i17 + i18 + i19 + i20 + i21 + i22 + s1 + Double.doubleToLongBits(d2) + i23 + i24 + i25 + FuzzerUtils.checkSum(byArr1);
    }

    public void mainTest(String[] strArr1) {
        int i26 = -218, i27 = 38949, i28 = 10912, i29 = 8, i30 = 2, i31 = 47884, i32 = -79, i33 = -7, i34 = -4, i35 = 13, i36 = 13, i37 = 34, i38 = 8, i39 = 7858;
        byte by3 = 86;
        short s2 = -28338, sArr1[] = new short[N];
        long l2 = 4248978863L, l3 = 3725836149L;
        FuzzerUtils.init(sArr1, (short) -16568);
        vMeth(iFld);
        i26 = 1;
        do {
            Test.fFld += iFld;
            for (i27 = 22; i27 > 1; --i27) {
                if (Test.bFld)
                    break;
                Test.instanceCount += i27;
                Test.fArrFld[i27 + 1] += -53;
                Test.fFld *= Test.instanceCount;
            }
            for (i29 = i26; i29 < 22; i29 += 2) {
                i28 = i26;
                sArr1[i29] -= (short) Test.fFld;
                Test.lArrFld = Test.lArrFld;
            }
            for (i31 = 1; i31 < 22; i31++) {
                i30 += (i31 ^ Test.instanceCount);
                for (i33 = 1; i33 < 2; i33++) {
                    sArr1[i33] = (short) i32;
                    i32 &= i29;
                    i34 = 1;
                    i30 -= (int) Test.instanceCount;
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount -= -122L;
                    by3 *= (byte) -11L;
                    Test.dArrFld[i33 - 1] = Test.fFld;
                    i32 *= -6256;
                    Test.fArrFld[i31 + 1] = i32;
                    i32 += i33;
                    Test.instanceCount -= iFld;
                    Test.byArrFld[i33][i26 + 1] = (byte) -46;
                    s2 ^= (short) i31;
                }
                i28 *= (int) Test.instanceCount;
                Test.fArrFld[i31 - 1] += iFld;
                for (i35 = 1; i35 < 2; i35++) {
                    Test.iArrFld[i35 + 1] += 57122;
                    iFld = i27;
                    switch(((i26 % 2) * 5) + 97) {
                        case 105:
                        case 103:
                            Test.bFld = Test.bFld;
                            try {
                                Test.iArrFld[i26 + 1] = (i27 / i33);
                                iFld = (44461 / i35);
                                i36 = (i27 / i36);
                            } catch (ArithmeticException a_e) {
                            }
                            Test.iArrFld[i35 + 1] -= (int) Test.instanceCount;
                            i36 = i31;
                            Test.instanceCount |= by3;
                            Test.iArrFld[i35] -= i29;
                            i32 += (i35 ^ i35);
                            i34 += (((i35 * Test.fFld) + i31) - Test.fFld);
                            break;
                    }
                }
                s2 += (short) i29;
                l2 = 1;
                while (++l2 < 2) {
                    i30 = i32;
                    switch(((iFld >>> 1) % 1) + 24) {
                        case 24:
                            iFld >>= i27;
                            Test.instanceCount += (-4894031324278154898L + (l2 * l2));
                            Test.fFld = (float) dFld;
                            Test.fFld = -1;
                            if (Test.bFld)
                                continue;
                            iFld >>>= 30565;
                            Test.instanceCount += i36;
                            i30 += (int) (((l2 * i35) + Test.fFld) - l3);
                            i37 = i38;
                            i32 -= (int) Test.instanceCount;
                            l3 = Test.iFld1;
                            i32 |= iFld;
                            i28 += i34;
                            by3 ^= (byte) i30;
                            i34 += (int) (-3877465998L + (l2 * l2));
                            break;
                        default:
                            i39 <<= i30;
                            if (Test.bFld)
                                break;
                            i30 -= i39;
                            i32 -= iFld;
                            i36 -= i38;
                            i36 += (int) (l2 * l2);
                            switch((i26 % 5) + 14) {
                                case 14:
                                    l3 = l3;
                                    Test.instanceCount = (long) 1.737F;
                                    i28 = (int) l3;
                                    Test.iArrFld[(int) (l2 + 1)] = i27;
                                    break;
                                case 15:
                                    dFld = Test.iFld1;
                                    Test.iFld1 <<= i33;
                                case 16:
                                    Test.fArrFld[i31 - 1] -= i34;
                                    break;
                                case 17:
                                    Test.dArrFld[(int) (l2)] = Test.iFld1;
                                    break;
                                case 18:
                                    Test.iArrFld[(int) (l2 - 1)] *= (int) Test.fFld;
                                    break;
                                default:
                                    iFld += i33;
                            }
                    }
                }
            }
        } while (++i26 < 231);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 i33 i34 = " + i32 + "," + i33 + "," + i34);
        FuzzerUtils.out.println("by3 s2 i35 = " + by3 + "," + s2 + "," + i35);
        FuzzerUtils.out.println("i36 l2 l3 = " + i36 + "," + l2 + "," + l3);
        FuzzerUtils.out.println("i37 i38 i39 = " + i37 + "," + i38 + "," + i39);
        FuzzerUtils.out.println("sArr1 = " + FuzzerUtils.checkSum(sArr1));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," + Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("iFld dFld Test.iFld1 = " + iFld + "," + Double.doubleToLongBits(dFld) + "," + Test.iFld1);
        FuzzerUtils.out.println("Test.iArrFld Test.fArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.dArrFld Test.byArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.byArrFld));
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
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  vMeth ->  vMeth mainTest
// DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
// DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}
