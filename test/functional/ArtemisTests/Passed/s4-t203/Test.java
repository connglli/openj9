// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

public class Test {

    public static final int N = 256;

    public static volatile long instanceCount = 2523408687L;

    public static double dFld = 0.87513;

    public static int[] iArrFld = new int[N];

    public static byte[] byArrFld = new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 61204);
        FuzzerUtils.init(Test.byArrFld, (byte) -30);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {
        if (ax$5) {
            try {
                java.lang.Thread[] ax$6 = new java.lang.Thread[3368];
                int ax$7 = 100033;
                ax$6[ax$7].start();
            } catch (Throwable ax$8) {
            } finally {
            }
            return;
        }
        int i8 = -681, i9 = -13, i10 = 9, i11 = -125, i12 = -4, i13 = 12858, i14 = -4717, i15 = -124, i16 = 41597, i17 = 0;
        short s = -31467, sArr[] = new short[N];
        float f1 = 101.581F;
        boolean b = true;
        long l = 5142910239443753891L, lArr[] = new long[N];
        double d = -27.66878, d1 = 0.34770;
        byte by1 = 29;
        FuzzerUtils.init(lArr, 138L);
        FuzzerUtils.init(sArr, (short) 7901);
        i8 ^= s;
        for (i9 = 3; i9 < 236; ++i9) {
            f1 = i8;
        }
        b = b;
        i10 = (int) Test.instanceCount;
        i11 = 1;
        do {
            for (l = 1; 3 > l; ++l) {
                i8 -= i9;
                if (b)
                    continue;
                for (i13 = 2; i13 > 1; i13--) {
                    Test.instanceCount *= -54540;
                    f1 += i13;
                    Test.instanceCount /= (i10 | 1);
                    Test.instanceCount += (long) (-2.683F + (i13 * i13));
                    i12 += i10;
                    i8 >>= i11;
                }
                for (d = 1; 2 > d; d++) {
                    Test.iArrFld[(int) (d - 1)] = i9;
                    i15 = i11;
                    i10 = i9;
                    lArr[(int) (l + 1)] = Test.instanceCount;
                    d1 += 57019;
                    i14 *= i8;
                    Test.iArrFld = Test.iArrFld;
                    Test.instanceCount <<= -2319;
                    Test.iArrFld[i11 + 1] = i14;
                    i10 += (int) (d * d);
                    Test.byArrFld[(int) (d)] = (byte) l;
                    Test.iArrFld[i11] = i8;
                }
                i12 += (int) (l ^ Test.instanceCount);
                for (i16 = 2; i16 > l; i16 -= 2) {
                    Test.instanceCount <<= -35L;
                    f1 += i17;
                }
                if (b) {
                    Test.iArrFld[i11 + 1] -= s;
                    sArr[i11] *= (short) i17;
                    by1 = (byte) i15;
                } else {
                    i17 += (int) l;
                }
            }
        } while (++i11 < 247);
        vMeth2_check_sum += i8 + s + i9 + i10 + Float.floatToIntBits(f1) + (b ? 1 : 0) + i11 + l + i12 + i13 + i14 + Double.doubleToLongBits(d) + i15 + Double.doubleToLongBits(d1) + i16 + i17 + by1 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth1(byte by) {
        int i6 = 251, i7 = -234, i18 = -46317, i19 = 13, i20 = 10, i21 = -8, i22 = -125, i23 = -48545, i24 = -47345, i25 = 2, i26 = -34811;
        boolean b1 = true;
        float[][] fArr = new float[N][N];
        long[] lArr1 = new long[N];
        FuzzerUtils.init(fArr, 0.958F);
        FuzzerUtils.init(lArr1, 2143035530503851345L);
        for (i6 = 2; i6 < 99; i6++) {
            {
                java.io.PrintStream ax$11 = System.out;
                java.io.PrintStream ax$12 = System.err;
                java.io.PrintStream ax$13 = new java.io.PrintStream(new java.io.OutputStream() {

                    @Override
                    public void write(int b) throws java.io.IOException {
                        // DO NOTHING: DISCARD ALL OUTPUTS
                    }
                });
                System.setOut(ax$13);
                System.setErr(ax$13);
                try {
                    ax$5 = true;
                    for (int ax$9 = 0; ax$9 < 5926; ax$9 += 1) vMeth2();
                } catch (java.lang.Throwable ax$10) {
                } finally {
                    ax$5 = false;
                }
                System.setOut(ax$11);
                System.setErr(ax$12);
            }
            vMeth2();
            if (i6 != 0) {
                vMeth1_check_sum += by + i6 + i7 + i18 + i19 + i20 + i21 + (b1 ? 1 : 0) + i22 + i23 + i24 + i25 + i26 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr1);
                return;
            }
            for (i18 = i6; i18 < 6; ++i18) {
                float f2 = -2.454F;
                i7 *= -90;
                f2 += Test.instanceCount;
                if (i18 != 0) {
                    vMeth1_check_sum += by + i6 + i7 + i18 + i19 + i20 + i21 + (b1 ? 1 : 0) + i22 + i23 + i24 + i25 + i26 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr1);
                    return;
                }
                i19 = 42720;
                Test.instanceCount *= (long) f2;
                for (i20 = 1; 1 > i20; ++i20) {
                    b1 = b1;
                    Test.dFld -= -5L;
                    Test.instanceCount = Test.instanceCount;
                    i7 = i20;
                    Test.dFld = i18;
                    i19 = i21;
                    by += (byte) (-111 + (i20 * i20));
                    Test.iArrFld[i6] += (int) Test.instanceCount;
                    if (true)
                        break;
                }
                Test.instanceCount += (i18 * i18);
                for (i22 = 1; 1 > i22; ++i22) {
                    fArr[i6 - 1][i18 - 1] -= 72.976F;
                    i23 += (int) Test.instanceCount;
                    if (false)
                        break;
                    Test.instanceCount += (i22 | i6);
                }
                i24 = 1;
                do {
                    lArr1[i18] %= (i7 | 1);
                    i23 *= (int) Test.instanceCount;
                } while (++i24 < 1);
                for (i25 = 1; i25 < 1; i25++) {
                    Test.dFld *= i7;
                    lArr1[i6 + 1] = i25;
                    if (i22 != 0) {
                        vMeth1_check_sum += by + i6 + i7 + i18 + i19 + i20 + i21 + (b1 ? 1 : 0) + i22 + i23 + i24 + i25 + i26 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr1);
                        return;
                    }
                    i7 += (int) f2;
                    Test.byArrFld[i18 + 1] &= (byte) -45359;
                    Test.instanceCount <<= i21;
                    Test.iArrFld[i18] -= (int) Test.instanceCount;
                    i19 *= (int) Test.dFld;
                }
            }
        }
        vMeth1_check_sum += by + i6 + i7 + i18 + i19 + i20 + i21 + (b1 ? 1 : 0) + i22 + i23 + i24 + i25 + i26 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i, int i1, int i2) {
        int i3 = 170, i4 = 59525, i5 = -55304, i27 = -5, i28 = 116, i29 = 0, i30 = 10662, i31 = -130, i32 = -29223;
        float f = 2.963F;
        boolean b2 = true, b3 = true;
        short s1 = -22090;
        double[][] dArr = new double[N][N];
        long[] lArr2 = new long[N];
        FuzzerUtils.init(dArr, -124.42932);
        FuzzerUtils.init(lArr2, 5813584866778933537L);
        i3 = 1;
        while (++i3 < 179) {
            Test.instanceCount = (++i2);
            for (i4 = 1; i4 < 3; i4++) {
                f -= (--i);
            }
            vMeth1((byte) (-81));
        }
        f += Test.instanceCount;
        Test.iArrFld[(i3 >>> 1) % N] = i2;
        b2 = b3;
        for (i27 = 6; 140 > i27; i27++) {
            Test.instanceCount /= (Test.instanceCount | 1);
            i += (((i27 * i3) + i5) - f);
            for (i29 = 1; i29 < 4; i29++) {
                i31 = 1;
                while (++i31 < 2) {
                    switch((i31 % 6) + 61) {
                        case 61:
                            i28 += i31;
                            switch((i29 % 2) + 9) {
                                case 9:
                                    i1 = -50340;
                                    i30 ^= i;
                                    break;
                                case 10:
                                    i2 <<= i27;
                                    i28 -= i;
                                    break;
                                default:
                                    i <<= i;
                                    Test.iArrFld = FuzzerUtils.int1array(N, (int) -221);
                                    i2 += (((i31 * i5) + i5) - i4);
                                    dArr[i27][i29 + 1] *= i29;
                                    i1 >>= (int) Test.instanceCount;
                                    i1 -= (int) Test.instanceCount;
                                    Test.dFld = f;
                                    i30 >>= i;
                            }
                            i30 = (int) Test.instanceCount;
                            i5 -= (int) Test.instanceCount;
                            i28 += (i31 * i31);
                            i2 *= (int) -115.631F;
                            lArr2[i31] = i2;
                            i5 -= i30;
                            Test.instanceCount = i;
                            f += -59428;
                            try {
                                i30 = (Test.iArrFld[i27 - 1] / i28);
                                Test.iArrFld[i29 + 1] = (i28 / 38826);
                                i5 = (i5 % 29932);
                            } catch (ArithmeticException a_e) {
                            }
                            break;
                        case 62:
                            i = (int) f;
                            break;
                        case 63:
                            i |= 8409;
                            break;
                        case 64:
                            i1 <<= s1;
                        case 65:
                            Test.dFld *= 41;
                            break;
                        case 66:
                            i32 >>>= i29;
                            break;
                        default:
                            i28 += (int) f;
                    }
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + (b2 ? 1 : 0) + (b3 ? 1 : 0) + i27 + i28 + i29 + i30 + i31 + s1 + i32 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {
        int i33 = 6, i34 = -43656, i35 = -26347;
        byte by2 = 45;
        float f3 = 2.738F;
        vMeth(i33, i33, i33);
        Test.instanceCount *= (long) Test.dFld;
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
                boolean ax$4 = false;
                for (int ax$3 = -4922; ax$3 < 4356; ax$3 += 5) {
                    if (!ax$4) {
                        ax$4 = true;
                        {
                            System.setOut(ax$0);
                            System.setErr(ax$1);
                            for (i34 = 3; i34 < 195; i34++) {
                                Test.dFld = Test.instanceCount;
                                i33 = by2;
                            }
                            System.setOut(ax$2);
                            System.setErr(ax$2);
                        }
                    }
                }
            }
            System.setOut(ax$0);
            System.setErr(ax$1);
        }
        Test.iArrFld[(-2 >>> 1) % N] = 8439;
        by2 = (byte) i33;
        i33 = (int) f3;
        FuzzerUtils.out.println("i33 i34 i35 = " + i33 + "," + i34 + "," + i35);
        FuzzerUtils.out.println("by2 f3 = " + by2 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iArrFld = " + Test.instanceCount + "," + Double.doubleToLongBits(Test.dFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.byArrFld = " + FuzzerUtils.checkSum(Test.byArrFld));
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

    private static Boolean ax$5 = false;
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
