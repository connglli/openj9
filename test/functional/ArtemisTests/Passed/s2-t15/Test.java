// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.nio.CharBuffer;

public class Test {

    public static final int N = 256;

    public static long instanceCount = -195L;

    public int iFld = 1;

    public static double dFld = -40.78733;

    public static short sFld = -4856;

    public static byte byFld = -121;

    public static float fFld = 42.553F;

    public static boolean bFld = false;

    public volatile int iFld1 = -38369;

    public float fFld1 = -42.746F;

    public static int[] iArrFld = new int[N];

    public static long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -19240);
        FuzzerUtils.init(Test.lArrFld, 25763L);
    }

    public static long iMeth_check_sum = 0;

    public static long iMeth1_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static void vMeth(int i2, long l, int i3) {
        if (ax$11) {
            int ax$15 = i2;
            try {
                for (int ax$13 = 0; ax$13 < 2; ax$13++) {
                    for (int ax$14 = 0; ax$14 < 2; ax$14++) {
                        for (int ax$12 = 0; ax$12 < 2; ax$12++) {
                            i2++;
                        }
                    }
                }
            } catch (Throwable ax$16) {
            } finally {
                i2 = ax$15;
            }
            return;
        }
        int i4 = 5, i5 = 64268, i6 = 150, i7 = -5, i8 = -135, i9 = -3, i10 = 14;
        long l1 = -4124435339128872352L, lArr[] = new long[N];
        byte by = 117;
        float f = -51.943F, fArr[] = new float[N];
        boolean b = true, bArr[] = new boolean[N];
        short[] sArr = new short[N];
        double[] dArr = new double[N];
        FuzzerUtils.init(lArr, 2876844483118534719L);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(sArr, (short) 27156);
        FuzzerUtils.init(fArr, -21.502F);
        FuzzerUtils.init(dArr, 5.103338);
        for (i4 = 4; i4 < 148; ++i4) {
            for (i6 = 1; 4 > i6; ++i6) {
                for (l1 = 1; l1 < 2; ++l1) {
                    i3 &= 63;
                    by -= (byte) 50.1002F;
                    lArr[(int) (l1 + 1)] = -33500;
                    Test.sFld += by;
                    i3 *= i7;
                    switch(((i4 % 10) * 5) + 7) {
                        case 36:
                            switch((i4 % 3) + 108) {
                                case 108:
                                    Test.instanceCount += (long) f;
                                    Test.iArrFld[(int) (l1)] >>>= by;
                                    by >>>= (byte) 0L;
                                    i9 = (int) Test.instanceCount;
                                    if (true)
                                        break;
                                    i3 -= i5;
                                    Test.dFld += 37717L;
                                    i10 |= i7;
                                    Test.instanceCount += i8;
                                    i5 += (int) (l1 * l1);
                                    switch((int) (((l1 % 9) * 5) + 112)) {
                                        case 145:
                                            bArr[(int) (l1 - 1)] = b;
                                            Test.sFld -= (short) i8;
                                            i10 = i5;
                                            Test.iArrFld[(int) (l1 - 1)] *= (int) f;
                                            i10 += (int) l1;
                                            if (b)
                                                break;
                                            break;
                                        case 150:
                                            f += ((long) l1 | (long) i7);
                                            l -= Test.instanceCount;
                                            i9 += (int) (l1 * l1);
                                            Test.iArrFld[(int) (l1)] -= (int) Test.instanceCount;
                                            i3 -= 1;
                                            Test.iArrFld[(int) (l1)] = (int) Test.dFld;
                                            sArr[i4] -= (short) l1;
                                            i7 *= i2;
                                            lArr[i6] = i5;
                                            if (b)
                                                break;
                                        case 129:
                                            i3 *= i6;
                                            break;
                                        case 125:
                                            by &= (byte) i3;
                                            break;
                                        case 155:
                                            i7 = i7;
                                        case 148:
                                            i8 += (int) f;
                                            break;
                                        case 116:
                                            l |= l;
                                            break;
                                        case 117:
                                            i5 += Test.sFld;
                                            break;
                                        case 153:
                                            i2 = i7;
                                            break;
                                    }
                                case 109:
                                    i10 = i3;
                                case 110:
                                    by *= (byte) i4;
                                    break;
                            }
                            break;
                        case 27:
                            i8 = i9;
                            break;
                        case 10:
                            Test.iArrFld[i4] <<= (int) l1;
                            break;
                        case 11:
                            i8 = (int) 3L;
                        case 22:
                            fArr[(int) (l1 - 1)] = -2;
                            break;
                        case 51:
                            i5 += (int) l1;
                            break;
                        case 29:
                            i7 %= (int) (Test.instanceCount | 1);
                            break;
                        case 30:
                            i5 &= -25274;
                            break;
                        case 54:
                            Test.instanceCount <<= i9;
                            break;
                        case 49:
                            dArr[i4 + 1] = i4;
                        default:
                            if (b)
                                continue;
                    }
                }
            }
        }
        vMeth_check_sum += i2 + l + i3 + i4 + i5 + i6 + i7 + l1 + i8 + by + Float.floatToIntBits(f) + i9 + i10 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth1() {
        if (ax$22) {
            try {
                float[] ax$24 = { -0.0f, -0.0f, 0.0f, -0.0f };
                float ax$30 = 42.0f;
                float ax$29 = 1.0001F;
                float ax$27 = 15.0f;
                int ax$28 = 100044;
                float[] ax$25 = new float[10];
                float[] ax$26 = { -0.0f, -0.0f, 0.0f, -0.0f };
                float ax$23 = ax$27 + (float) ax$28;
                ax$29 += ax$23;
                ax$24[ax$28] = ax$23;
                ax$25[ax$28] = ax$30;
                ax$26[ax$28] = -ax$30;
            } catch (Throwable ax$31) {
            } finally {
            }
            return 962661443;
        }
        int i11 = 34367, i12 = -1032, i13 = -34740, i14 = 11, i15 = -8, i16 = 24678, i17 = 238, i18 = -46145;
        float f1 = -105.402F, f2 = -2.37F;
        long[] lArr1 = new long[N];
        short[] sArr1 = new short[N];
        FuzzerUtils.init(lArr1, -54L);
        FuzzerUtils.init(sArr1, (short) -17187);
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
            try {
                ax$11 = true;
                for (int ax$17 = 0; ax$17 < 6600; ax$17 += 1) vMeth(1381956712, -3073565889367324364L, 375391145);
            } catch (java.lang.Throwable ax$18) {
            } finally {
                ax$11 = false;
            }
            System.setOut(ax$19);
            System.setErr(ax$20);
        }
        vMeth(i11, -30407L, i11);
        for (i12 = 148; i12 > 8; i12 -= 2) {
            i11 += i11;
            for (i14 = 1; i14 < 8; i14++) {
                i11 -= i13;
                for (i16 = 1; i16 < 2; i16++) {
                    Test.iArrFld[i14 - 1] = i16;
                    if (i17 != 0) {
                    }
                    i15 -= (int) -83.398F;
                    if (true)
                        break;
                    Test.dFld = 12504L;
                    if (i17 != 0) {
                    }
                    Test.sFld -= (short) f1;
                }
                Test.instanceCount += (i14 + i14);
                switch((i12 % 2) + 63) {
                    case 63:
                        i11 += (44479 + (i14 * i14));
                        for (f2 = 2; f2 > 1; f2 -= 3) {
                            switch(((i14 % 2) * 5) + 44) {
                                case 50:
                                    Test.instanceCount += (long) (f2 * i11);
                                    f1 %= (i13 | 1);
                                case 51:
                                    Test.instanceCount *= Test.instanceCount;
                                    i15 = i18;
                                    i18 = 4;
                                    i11 = 16485;
                                    f1 -= Test.instanceCount;
                                    Test.iArrFld = Test.iArrFld;
                                    break;
                            }
                            i18 = i16;
                            Test.iArrFld[i14 + 1] -= (int) Test.dFld;
                            f1 += (((f2 * f2) + f1) - Test.byFld);
                            i11 = (int) Test.instanceCount;
                            i17 *= (int) Test.instanceCount;
                            lArr1[(i13 >>> 1) % N] = i18;
                            i13 >>= i14;
                            i13 = -2;
                            if (i12 != 0) {
                            }
                            sArr1[(int) (f2)] = (short) i16;
                            Test.instanceCount += (long) (f2 + i13);
                        }
                        break;
                    case 64:
                        i11 = i11;
                        break;
                    default:
                        Test.sFld += (short) i14;
                }
            }
        }
        long meth_res = i11 + i12 + i13 + i14 + i15 + i16 + i17 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i18 + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(sArr1);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i, int i1) {
        long l2 = 139L;
        int i19 = 244, i20 = -148, i22 = 47918, i23 = -208, i24 = 197;
        Test.instanceCount = (long) Float.intBitsToFloat(iMeth1());
        l2 -= i1;
        Test.lArrFld = Test.lArrFld;
        i = -9452;
        if (false) {
        } else {
            Test.fFld *= 0;
            i = i;
            i1 |= 33;
        }
        i19 = 1;
        do {
            i1 >>= i1;
            i20 = 1;
            do {
                int i21 = -110;
                Test.instanceCount += i21;
                i1 += i21;
                for (i22 = 1; i22 < 4; ++i22) {
                    Test.iArrFld[i20 + 1] = 83;
                    Test.lArrFld = Test.lArrFld;
                    i21 >>= i23;
                    i <<= (int) l2;
                    switch(((i19 % 1) * 5) + 23) {
                        case 27:
                            i23 = i21;
                            i21 -= (int) -7L;
                            Test.iArrFld[i22] *= (int) -44577L;
                            i21 >>>= i24;
                            Test.instanceCount = i1;
                            Test.instanceCount -= Test.instanceCount;
                            i21 *= i19;
                            Test.iArrFld[i20 + 1] >>= 218;
                            break;
                    }
                    i *= 18;
                    Test.byFld = (byte) l2;
                    i >>= i;
                    Test.iArrFld[i20 + 1] = -29318;
                    if (i23 != 0) {
                    }
                    i += i20;
                    Test.byFld = (byte) Test.instanceCount;
                }
                {
                    java.io.PrintStream ax$8 = System.out;
                    java.io.PrintStream ax$9 = System.err;
                    java.io.PrintStream ax$10 = new java.io.PrintStream(new java.io.OutputStream() {

                        @Override
                        public void write(int b) throws java.io.IOException {
                            // DO NOTHING: DISCARD ALL OUTPUTS
                        }
                    });
                    System.setOut(ax$10);
                    System.setErr(ax$10);
                    try {
                        for (int ax$6 = -4648; ax$6 < 3776; ax$6 += 1) {
                            long ax$2 = l2;
                            int ax$3 = i21;
                            int ax$4 = i19;
                            try {
                                long[] ax$1 = { 0x7ff0000000000001L, 0x7ff4000000000000L, 0x7ff8000000000000L, 0x7fffffffffffffffL, 0xfff0000000000001L, 0xfff4000000000000L, 0xfff8000000000000L, 0xffffffffffffffffL };
                                long[] ax$0 = { // 7-bit
                                0x0FL, 0x7FL, 0xFFL };
                                ax$1[i21] = (long) ((ax$0[i21] & l2) >> i19);
                            } catch (Throwable ax$5) {
                            } finally {
                                l2 = ax$2;
                                i21 = ax$3;
                                i19 = ax$4;
                            }
                        }
                    } catch (Throwable ax$7) {
                    }
                    System.setOut(ax$8);
                    System.setErr(ax$9);
                }
                if (Test.bFld) {
                    if (Test.bFld)
                        break;
                    i <<= (int) l2;
                }
            } while ((i20 += 3) < 4);
        } while (++i19 < 131);
        long meth_res = i + i1 + l2 + i19 + i20 + i22 + i23 + i24;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {
        if (ax$37) {
            try {
                CharSequence ax$38 = CharBuffer.wrap("foo");
                for (int ax$39 = 0; ax$39 < ax$38.length(); ax$39++) ;
            } catch (Throwable ax$40) {
            } finally {
            }
            return;
        }
        short s = 22393;
        int i25 = -245, i26 = 220, i27 = -32478, i28 = 171, i29 = 243, i30 = -8, i31 = 21843;
        float[] fArr1 = new float[N];
        double[] dArr1 = new double[N];
        FuzzerUtils.init(fArr1, 1.284F);
        FuzzerUtils.init(dArr1, -2.68388);
        iFld <<= (int) (Test.instanceCount--);
        Test.dFld *= (((s *= (short) -4) * iMeth(-1, iFld)) >> 46);
        for (i25 = 9; i25 < 244; i25++) {
            fArr1[i25] += -48585;
            for (i27 = 1; i27 < 22; ++i27) {
                for (i29 = 1; i29 < 2; i29++) {
                    i28 += i28;
                    Test.fFld = Test.instanceCount;
                    switch(((-7 >>> 1) % 5) + 108) {
                        case 108:
                            try {
                                Test.iArrFld[i27] = (Test.iArrFld[i25 - 1] % i26);
                                i30 = (1666330477 / Test.iArrFld[i27 - 1]);
                                i26 = (i26 % i27);
                            } catch (ArithmeticException a_e) {
                            }
                            i30 >>= Test.byFld;
                            i30 -= Test.sFld;
                            break;
                        case 109:
                            try {
                                i30 = (i30 / i25);
                                i28 = (i28 / i26);
                                i26 = (118 / i30);
                            } catch (ArithmeticException a_e) {
                            }
                            i28 = (int) Test.fFld;
                            Test.instanceCount = 427082352397416015L;
                            Test.iArrFld[i27 + 1] |= i28;
                            Test.iArrFld = FuzzerUtils.int1array(N, (int) -13);
                            break;
                        case 110:
                            Test.sFld -= (short) i28;
                            switch(((i29 % 3) * 5) + 96) {
                                case 99:
                                    i28 += i29;
                                    Test.dFld -= Test.instanceCount;
                                    i26 += i29;
                                    Test.fFld *= Test.byFld;
                                    Test.fFld += (float) 86.48181;
                                    Test.iArrFld[i25] += i26;
                                    try {
                                        i26 = (Test.iArrFld[i29 - 1] % iFld);
                                        i26 = (-370740267 % i28);
                                        iFld = (i30 % i26);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    i26 = i25;
                                    Test.fFld += i29;
                                    switch(((i28 >>> 1) % 1) + 45) {
                                        case 45:
                                            Test.instanceCount ^= -13;
                                            i26 -= 52535;
                                            i28 = i28;
                                            Test.bFld = true;
                                            i26 = Test.sFld;
                                            Test.fFld = i29;
                                            i28 *= i30;
                                            Test.fFld -= Test.instanceCount;
                                            i30 = (int) Test.instanceCount;
                                            i28 += i29;
                                            i30 = 100;
                                    }
                                    break;
                                case 100:
                                    Test.instanceCount = (long) Test.dFld;
                                    i26 += i29;
                                    break;
                                case 98:
                                    Test.iArrFld[i29 - 1] -= iFld1;
                                    i28 *= -30875;
                                    i28 = i30;
                                    break;
                            }
                            i28 += (i29 * i30);
                            iFld1 = (int) Test.instanceCount;
                            Test.dFld = iFld;
                            i30 >>= i27;
                            iFld1 = Test.sFld;
                            Test.instanceCount += i29;
                            if (true) {
                                iFld >>= s;
                                i30 *= (int) fFld1;
                                Test.iArrFld[i25 - 1] += (int) -1.106591;
                                i26 += Test.sFld;
                                i30 += 71;
                                iFld += (i29 * i29);
                                Test.iArrFld[i29 + 1] /= (int) (iFld1 | 1);
                            } else {
                                Test.instanceCount += (((i29 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                                i28 += i29;
                                if (Test.bFld) {
                                    i28 >>>= -39552;
                                    iFld *= -132;
                                    iFld1 *= Test.sFld;
                                    Test.iArrFld[i25] *= s;
                                    i30 = i26;
                                    iFld += (((i29 * i29) + s) - Test.fFld);
                                    i28 -= i26;
                                    i26 *= i25;
                                } else if (Test.bFld) {
                                    Test.bFld = Test.bFld;
                                    iFld1 += i31;
                                    dArr1[i27 - 1] = i26;
                                    Test.fFld *= i29;
                                    Test.iArrFld[i25 + 1] += i28;
                                } else if (Test.bFld) {
                                    fFld1 = -14;
                                }
                            }
                            break;
                        case 111:
                            i26 = (int) -7L;
                            break;
                        case 112:
                            i31 += (69 + (i29 * i29));
                            break;
                    }
                }
            }
        }
        FuzzerUtils.out.println("s i25 i26 = " + s + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 fArr1 = " + i30 + "," + i31 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));
        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.sFld Test.byFld Test.fFld = " + Test.sFld + "," + Test.byFld + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.bFld iFld1 fFld1 = " + (Test.bFld ? 1 : 0) + "," + iFld1 + "," + Float.floatToIntBits(fFld1));
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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

    private static Boolean ax$11 = false;

    private static Boolean ax$22 = false;

    private static Boolean ax$37 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  iMeth ->  iMeth mainTest
// DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
// DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}
