// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

public class Test {

    public static final int N = 256;

    public static long instanceCount = -6L;

    public static volatile double dFld = 5.16448;

    public static float fFld = -16.495F;

    public static boolean bFld = true;

    public static byte byFld = -93;

    public static int iFld = 199;

    public static int iFld1 = 20;

    public short sFld = -29948;

    public static int[] iArrFld = new int[N];

    public static double[] dArrFld = new double[N];

    public static long[] lArrFld = new long[N];

    public float[] fArrFld = new float[N];

    public short[] sArrFld = new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -20179);
        FuzzerUtils.init(Test.dArrFld, -52.55362);
        FuzzerUtils.init(Test.lArrFld, -119L);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d, int i4, double d1) {
        if (ax$36) {
            int ax$40 = i4;
            try {
                long[] ax$39 = new long[60];
                long[] ax$37 = { // 7-bit
                0x0FL, 0x7FL, 0xFFL };
                for (int ax$38 = 0; ax$38 < ax$39.length; ax$38 += 1) {
                    ax$39[ax$38] = (long) (ax$37[ax$38] / (-i4));
                }
            } catch (Throwable ax$41) {
            } finally {
                i4 = ax$40;
            }
            return;
        }
        int i5 = 44129, i6 = -13, i7 = -53641, i8 = 38, i9 = 57528, i10 = 200;
        byte by = -119, byArr[] = new byte[N];
        short s = -19910;
        boolean b = true;
        long[] lArr = new long[N];
        FuzzerUtils.init(byArr, (byte) -34);
        FuzzerUtils.init(lArr, 37555L);
        for (i5 = 3; 119 > i5; i5++) {
            for (i7 = i5; i7 < 5; i7++) {
                if (b) {
                    Test.iArrFld[(i4 >>> 1) % N] += i8;
                    by = (byte) i4;
                    Test.instanceCount -= i7;
                    i6 *= (int) Test.fFld;
                    i6 *= i8;
                    Test.fFld += (i7 * i7);
                } else if (b) {
                    Test.dArrFld[i5 - 1] = s;
                    for (i9 = 1; i9 > 1; i9--) {
                        if (false) {
                            i8 = i5;
                            i6 -= (int) d;
                            i10 = (int) Test.instanceCount;
                            i6 = (int) Test.instanceCount;
                            i8 >>= i4;
                            if (false)
                                break;
                            i6 = (int) Test.instanceCount;
                            Test.fFld += i5;
                            Test.instanceCount += i9;
                            if (b) {
                                Test.instanceCount = i7;
                                i10 += (i9 ^ Test.instanceCount);
                                Test.iArrFld[i9 - 1] += (int) Test.fFld;
                                i10 = (int) d1;
                                byArr[i5] = (byte) i8;
                                i8 -= i10;
                                switch((((i7 >>> 1) % 9) * 5) + 80) {
                                    case 119:
                                    case 81:
                                    case 100:
                                        Test.instanceCount <<= -7;
                                        if (b)
                                            continue;
                                        i10 += (((i9 * i6) + i10) - i4);
                                        Test.instanceCount += i9;
                                        i6 = (int) -4054085019L;
                                        Test.fFld = i7;
                                        Test.instanceCount -= i7;
                                        i6 &= (int) Test.instanceCount;
                                        break;
                                    case 104:
                                        Test.instanceCount <<= i4;
                                        break;
                                    case 109:
                                        Test.iArrFld[(i9 >>> 1) % N] -= (int) d1;
                                        break;
                                    case 99:
                                        Test.instanceCount += i7;
                                    case 83:
                                        lArr[i9] = i10;
                                    case 92:
                                    case 86:
                                        Test.fFld = -2193463602407871628L;
                                        break;
                                    default:
                                        i8 += i7;
                                }
                            } else if (b) {
                                i8 += (i9 ^ Test.instanceCount);
                            } else if (b) {
                                Test.iArrFld[i5 + 1] = (int) Test.instanceCount;
                            } else {
                                b = b;
                            }
                        } else {
                            Test.instanceCount -= Test.instanceCount;
                        }
                    }
                } else if (Test.bFld) {
                    i6 += (92 + (i7 * i7));
                } else {
                    i10 += i7;
                }
            }
        }
        vMeth2_check_sum += Double.doubleToLongBits(d) + i4 + Double.doubleToLongBits(d1) + i5 + i6 + i7 + i8 + by + s + i9 + i10 + (b ? 1 : 0) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i3) {
        int i11 = 3, i12 = -22033, i13 = -137, i14 = -42965, i15 = 177, iArr[] = new int[N];
        float f = -72.915F, fArr[] = new float[N];
        short s1 = -10443;
        boolean[][] bArr = new boolean[N][N];
        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(fArr, -64.568F);
        FuzzerUtils.init(bArr, true);
        i3 &= ((i3--) - i3);
        Test.dFld = ((--iArr[(i3 >>> 1) % N]) + Test.fFld);
        {
            java.io.PrintStream ax$44 = System.out;
            java.io.PrintStream ax$45 = System.err;
            java.io.PrintStream ax$46 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$46);
            System.setErr(ax$46);
            try {
                ax$36 = true;
                for (int ax$42 = 0; ax$42 < 8298; ax$42 += 1) vMeth2(0.1590598702416981, 218189418, 0.3771141476328099);
            } catch (java.lang.Throwable ax$43) {
            } finally {
                ax$36 = false;
            }
            System.setOut(ax$44);
            System.setErr(ax$45);
        }
        vMeth2(Test.dFld, i3, Test.dFld);
        Test.dFld -= i3;
        i3 = (int) Test.instanceCount;
        Test.bFld = Test.bFld;
        for (i11 = 3; i11 < 83; i11++) {
            f = 1;
            while (++f < 7) {
                fArr[i11 + 1] -= 31;
                i3 <<= (int) Test.instanceCount;
                Test.instanceCount -= i11;
                i3 -= (int) Test.instanceCount;
                bArr[i11 + 1] = bArr[(int) (f + 1)];
                Test.dFld = i11;
                i12 += 14083;
                for (i13 = 1; i13 < 1; ++i13) {
                    Test.dFld += Test.byFld;
                    Test.fFld *= i15;
                    s1 -= (short) i12;
                    i12 = i11;
                    switch(((i3 >>> 1) % 4) + 82) {
                        case 82:
                            if (Test.bFld)
                                continue;
                            i15 = (int) Test.instanceCount;
                            i15 *= i14;
                            i12 += i13;
                            iArr[(i13 >>> 1) % N] *= (int) Test.instanceCount;
                            Test.lArrFld[i11 + 1] >>= Test.instanceCount;
                            i15 = 34388;
                            fArr[i11 - 1] -= i3;
                            break;
                        case 83:
                            Test.bFld = false;
                            Test.instanceCount = (long) f;
                            break;
                        case 84:
                            i14 += i13;
                            break;
                        case 85:
                            Test.byFld = (byte) i13;
                            Test.bFld = Test.bFld;
                            i15 += i14;
                            i12 = i14;
                            iArr[i13 - 1] *= i13;
                    }
                }
            }
        }
        {
            java.io.PrintStream ax$5 = System.out;
            java.io.PrintStream ax$6 = System.err;
            java.io.PrintStream ax$7 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$7);
            System.setErr(ax$7);
            try {
                for (int ax$3 = -1273; ax$3 < 4171; ax$3 += 1) {
                    boolean ax$1 = bFld;
                    try {
                        boolean ax$0 = true;
                        if (ax$0 != bFld) {
                        }
                    } catch (Throwable ax$2) {
                    } finally {
                        bFld = ax$1;
                    }
                }
            } catch (Throwable ax$4) {
            }
            System.setOut(ax$5);
            System.setErr(ax$6);
        }
        vMeth1_check_sum += i3 + i11 + i12 + Float.floatToIntBits(f) + i13 + i14 + i15 + s1 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(int i1, int i2) {
        int i16 = 43333, i17 = -2029, i18 = -42, i19 = 42381, i20 = -13, i21 = 8, i22 = -2, i23 = -6, i25 = 113;
        short s2 = -9139;
        double d2 = 0.69158;
        vMeth1(-2);
        for (i16 = 9; i16 < 241; ++i16) {
            i1 += (((i16 * i2) + Test.instanceCount) - i1);
            i18 = 1;
            while (++i18 < 3) {
                i2 *= (int) 37.762F;
                i1 -= (int) Test.instanceCount;
                i1 += i18;
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
                    {
                        boolean ax$16 = false;
                        for (int ax$15 = -714; ax$15 < 9277; ax$15 += 2) {
                            if (!ax$16) {
                                ax$16 = true;
                                {
                                    System.setOut(ax$8);
                                    System.setErr(ax$9);
                                    switch(((i18 % 1) * 5) + 34) {
                                        case 35:
                                    }
                                    System.setOut(ax$10);
                                    System.setErr(ax$10);
                                }
                            }
                            int ax$13 = i19;
                            try {
                                short[] ax$12 = new short[] { 20, 10, 0, -10, -20 };
                                short[] ax$11 = new short[] { 20, 10, 0, -10, -20 };
                                ax$12[i19] = (short) (ax$11[i19] + (i19 & 3));
                            } catch (Throwable ax$14) {
                            } finally {
                                i19 = ax$13;
                            }
                        }
                    }
                    System.setOut(ax$8);
                    System.setErr(ax$9);
                }
                Test.instanceCount = 3;
            }
            for (i19 = 1; i19 < 3; i19++) {
                int i24 = -3;
                i20 |= i20;
                Test.iFld = i16;
                for (i21 = 2; i21 > i19; i21 -= 3) {
                    i17 /= (int) (i17 | 1);
                    Test.iArrFld[i16] *= -59129;
                    Test.iFld += i21;
                    i22 += i21;
                    Test.instanceCount += i18;
                    Test.dFld = Test.instanceCount;
                    s2 = (short) -2;
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount = i2;
                    Test.byFld += (byte) i21;
                }
                Test.iFld += (((i19 * i18) + i2) - i16);
                if (i21 != 0) {
                    vMeth_check_sum += i1 + i2 + i16 + i17 + i18 + i19 + i20 + i21 + i22 + s2 + Double.doubleToLongBits(d2) + i23 + i25;
                    return;
                }
                for (d2 = 1; d2 < 2; d2++) {
                    Test.instanceCount = Test.iFld;
                }
                try {
                    i17 = (Test.iArrFld[i16] % 4002);
                    i24 = (-173 % i20);
                    i2 = (i1 % 1307924620);
                } catch (ArithmeticException a_e) {
                }
                i17 -= i19;
                Test.byFld += (byte) -53.742F;
                i1 = (int) 94.716F;
                Test.iFld -= i19;
                i25 = 1;
                while (++i25 < 2) {
                    Test.instanceCount -= i19;
                    Test.instanceCount *= (long) 1.628F;
                    i24 = i19;
                    i23 = i16;
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i16 + i17 + i18 + i19 + i20 + i21 + i22 + s2 + Double.doubleToLongBits(d2) + i23 + i25;
    }

    public void mainTest(String[] strArr1) {
        long l = -738006231946075323L;
        int i = -79, i26 = 233, i27 = -11, i28 = -49448, i29 = -10, i30 = 8, i31 = -58524, i32 = -851, i33 = 147, i34 = -8;
        for (l = 2; 82 > l; ++l) {
            vMeth(Test.iFld, Test.iFld);
            Test.iArrFld[(int) (l)] -= Test.iFld1;
            for (i26 = 3; 63 > i26; ++i26) {
                Test.iArrFld = Test.iArrFld;
                for (i28 = 1; i28 < 2; ++i28) {
                    i29 >>>= (int) l;
                    switch((i26 % 1) + 107) {
                        case 107:
                            Test.bFld = Test.bFld;
                            Test.iArrFld[i26 - 1] += (int) Test.dFld;
                            Test.iArrFld[(i26 >>> 1) % N] = sFld;
                            Test.iArrFld[i28] = (int) 13257L;
                        default:
                            Test.bFld = Test.bFld;
                            Test.iArrFld[i26 - 1] >>= i28;
                            i29 += (((i28 * i26) + l) - l);
                            Test.iFld -= Test.iFld1;
                            fArrFld[i26] = Test.iFld1;
                            Test.instanceCount += i26;
                            Test.instanceCount = -7L;
                            sFld = (short) 8;
                    }
                }
                Test.iArrFld[i26] ^= -35;
                Test.iArrFld[i26 - 1] += (int) -4304319104973490895L;
                Test.fFld += i;
                Test.iArrFld[(int) (l)] = (int) -3580220638L;
                Test.instanceCount += (((i26 * Test.fFld) + Test.instanceCount) - i26);
                Test.iFld1 <<= -10;
                i = (int) Test.instanceCount;
                for (i30 = 2; i30 > 1; i30 -= 3) {
                    if (Test.bFld)
                        continue;
                    i31 = i31;
                    i31 -= (int) -245L;
                    Test.iFld1 += (i30 | Test.iFld1);
                    i31 *= 81;
                    i31 *= (int) Test.fFld;
                    i29 += (i30 ^ Test.iFld1);
                    try {
                        Test.iFld = (57841 / i);
                        i29 = (19653 % Test.iFld);
                        i = (i27 % -232);
                    } catch (ArithmeticException a_e) {
                    }
                    Test.iFld >>= i31;
                }
                i32 = 1;
                do {
                    Test.bFld = Test.bFld;
                    Test.instanceCount += (i32 + i);
                    i31 += (((i32 * i29) + i29) - Test.byFld);
                    if (Test.bFld) {
                        i29 += -15318;
                        sFld += (short) i32;
                        Test.iFld1 += (((i32 * i30) + i30) - i30);
                        i27 *= i29;
                        i29 += (i32 * i32);
                        i29 -= (int) 1.619F;
                        i31 -= Test.iFld;
                        Test.iArrFld[i26] ^= Test.iFld;
                        Test.iFld = i29;
                    } else if (Test.bFld) {
                        Test.lArrFld = Test.lArrFld;
                        Test.iFld1 *= (int) 1.247F;
                        fArrFld[(int) (l)] += sFld;
                        Test.fFld -= Test.byFld;
                        i29 = Test.byFld;
                        Test.iFld1 = i26;
                        Test.dFld = Test.instanceCount;
                    }
                    Test.iArrFld[i26 + 1] &= i31;
                    Test.iArrFld[(int) (l + 1)] <<= (int) -11L;
                    Test.iArrFld[(int) (l + 1)] = (int) l;
                } while (++i32 < 2);
                {
                    java.io.PrintStream ax$33 = System.out;
                    java.io.PrintStream ax$34 = System.err;
                    java.io.PrintStream ax$35 = new java.io.PrintStream(new java.io.OutputStream() {

                        @Override
                        public void write(int b) throws java.io.IOException {
                            // DO NOTHING: DISCARD ALL OUTPUTS
                        }
                    });
                    System.setOut(ax$35);
                    System.setErr(ax$35);
                    try {
                        for (int ax$31 = -2795; ax$31 < 6958; ax$31 += 1) {
                            boolean ax$29 = bFld;
                            try {
                                bFld = false;
                            } catch (Throwable ax$30) {
                            } finally {
                                bFld = ax$29;
                            }
                        }
                    } catch (Throwable ax$32) {
                    }
                    System.setOut(ax$33);
                    System.setErr(ax$34);
                }
                i = (int) -57L;
                for (i33 = 1; i33 < 2; i33++) {
                    i34 -= 10123;
                    i += (-116 + (i33 * i33));
                    i34 = Test.byFld;
                    fArrFld[i26 - 1] = 22047;
                    i34 += (i33 * i33);
                    i34 &= (int) -13L;
                    sArrFld[i33] -= (short) i28;
                    sFld <<= (short) Test.instanceCount;
                    Test.iArrFld[i26] -= i26;
                    Test.iArrFld[i26 - 1] += i27;
                }
                i34 -= (int) -53183L;
                Test.iFld -= i31;
            }
        }
        FuzzerUtils.out.println("l i i26 = " + l + "," + i + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("i33 i34 = " + i33 + "," + i34);
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.fFld = " + Test.instanceCount + "," + Double.doubleToLongBits(Test.dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.bFld Test.byFld Test.iFld = " + (Test.bFld ? 1 : 0) + "," + Test.byFld + "," + Test.iFld);
        FuzzerUtils.out.println("Test.iFld1 sFld Test.iArrFld = " + Test.iFld1 + "," + sFld + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.dArrFld Test.lArrFld fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("sArrFld = " + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        if (ax$47) {
            try {
                java.lang.String ax$48 = "com..net";
                if (ax$48.length() < 22) {
                }
            } catch (Throwable ax$49) {
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

    private static Boolean ax$36 = false;

    private static Boolean ax$47 = false;
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
