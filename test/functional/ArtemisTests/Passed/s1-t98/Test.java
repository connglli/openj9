// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

public class Test {

    public static final int N = 256;

    public static long instanceCount = -1L;

    public static byte byFld = -77;

    public static float fFld = 45.789F;

    public static int iFld = -19544;

    public static long lFld = -32225L;

    public short sFld = 16650;

    public static long lFld1 = -2L;

    public static int[] iArrFld = new int[N];

    public static volatile long[][] lArrFld = new long[N][N];

    public static float[] fArrFld = new float[N];

    public volatile double[] dArrFld = new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -146);
        FuzzerUtils.init(Test.lArrFld, -3254909583L);
        FuzzerUtils.init(Test.fArrFld, -1.358F);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long dMeth_check_sum = 0;

    public static double dMeth(int i4, float f) {
        int i5 = -207, i6 = 210, i7 = -12, i8 = -34, i9 = 67, i10 = 0, i11 = 156, i12 = -12877, iArr[][] = new int[N][N];
        double d2 = -1.8547, d3 = 10.89724;
        short s = 26346;
        boolean b = false;
        FuzzerUtils.init(iArr, 26382);
        Test.instanceCount = i4;
        i4 = i4;
        i5 = i6;
        for (i7 = 2; i7 < 86; i7++) {
            i4 += (i7 | i4);
            if (b) {
                i5 *= (int) d2;
                if (b) {
                    iArr[i7 + 1][i7] = i7;
                } else if (b) {
                    i9 = 1;
                    do {
                        f -= Test.instanceCount;
                        f += s;
                        switch(((i9 % 10) * 5) + 47) {
                            case 64:
                                f -= i5;
                                for (i10 = 1; 1 > i10; ++i10) {
                                    i5 <<= i4;
                                    i5 *= -8;
                                    Test.instanceCount += (i10 + i7);
                                    iArr[i10 - 1][i7] = i5;
                                    s += (short) -253;
                                    f += (i10 * i8);
                                }
                                i6 = -242;
                                iArr[i7] = iArr[i9];
                                iArr[i7 - 1][i9 - 1] <<= (int) Test.instanceCount;
                                i6 += (int) f;
                                b = b;
                                break;
                            case 80:
                                iArr[i7 + 1][i9 - 1] <<= i11;
                                break;
                            case 82:
                                iArr[i7 + 1][i7] <<= 1;
                                f += i8;
                                if (false) {
                                    iArr[i9 + 1][i7 + 1] = -2;
                                    for (d3 = 1; d3 < 1; d3++) {
                                        Test.instanceCount -= 3066028841L;
                                        i11 += (int) (d3 * i6);
                                        b = b;
                                        i12 -= i4;
                                        i8 += i5;
                                    }
                                } else if (b) {
                                    i5 += i7;
                                } else {
                                    try {
                                        i8 = (i9 % i11);
                                        i6 = (iArr[i7 + 1][i9] % i10);
                                        i6 = (i4 % i4);
                                    } catch (ArithmeticException a_e) {
                                    }
                                }
                                break;
                            case 70:
                                s += (short) -56.48618;
                                break;
                            case 93:
                                Test.instanceCount *= i9;
                                break;
                            case 78:
                                iArr[i7 - 1][i7 + 1] = i5;
                                break;
                            case 66:
                                iArr[i7][i7 - 1] += i4;
                                break;
                            case 96:
                                Test.instanceCount = i10;
                            case 75:
                                i12 += (int) Test.instanceCount;
                                break;
                            case 71:
                        }
                    } while (++i9 < 6);
                } else if (b) {
                    i6 -= i10;
                } else {
                    i12 += (((i7 * i6) + i12) - i8);
                }
            } else if (b) {
                i8 = s;
            } else {
                iArr[i7 + 1] = iArr[i7 + 1];
            }
        }
        long meth_res = i4 + Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d2) + i9 + s + i10 + i11 + (b ? 1 : 0) + Double.doubleToLongBits(d3) + i12 + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static void vMeth1() {
        int i1 = -232, i2 = 62739, i3 = 11, i13 = -1, i14 = 2, i15 = -53819, i16 = 12, i17 = 14, i19 = 55, i20 = 9248;
        double d1 = -70.90940;
        boolean b1 = false;
        float[] fArr = new float[N];
        long[] lArr = new long[N];
        FuzzerUtils.init(fArr, 2.732F);
        FuzzerUtils.init(lArr, 3765652130L);
        i1 = 217;
        do {
            i2 = (int) ((-(i1 * i2)) + (i1 * (-(Test.instanceCount - d1))));
            i3 = 1;
            while (++i3 < 3) {
                i2 *= Math.max(-103, (int) (dMeth(i3, 0.513F) * 11));
                Test.instanceCount += (-4 + (i3 * i3));
                i2 += (-245 + (i3 * i3));
            }
            if (false) {
                Test.iArrFld[i1 - 1] >>= -4;
                i2 >>= i1;
                i2 = Test.byFld;
                Test.fFld *= -5;
                i2 = (int) Test.instanceCount;
                i2 += i1;
                i13 = 3;
                while ((i13 -= 3) > 0) {
                    i2 += i13;
                    try {
                        i2 = (Test.iArrFld[i13] / i2);
                        i2 = (Test.iArrFld[i1 + 1] % 790856222);
                        i2 = (57988 / Test.iArrFld[i13]);
                    } catch (ArithmeticException a_e) {
                    }
                    i2 = i3;
                    i2 = i2;
                }
                i2 -= i2;
                for (i14 = i1; i14 < 3; i14 += 2) {
                    i2 -= (int) Test.instanceCount;
                }
                switch(((i1 % 2) * 5) + 39) {
                    case 42:
                        i15 += i15;
                        for (i16 = i1; 3 > i16; i16++) {
                            int i18 = 3;
                            switch((i16 % 4) + 78) {
                                case 78:
                                    try {
                                        i2 = (i18 / 95);
                                        i17 = (i15 % 49018);
                                        i2 = (63117 % i2);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    for (i19 = 1; i19 < 1; i19++) {
                                        Test.instanceCount = i15;
                                        Test.iArrFld[i19 - 1] = i19;
                                        Test.instanceCount = i18;
                                        Test.iArrFld[i1 - 1] = i14;
                                        i17 = (int) Test.instanceCount;
                                        i15 = (int) -64342L;
                                        Test.iArrFld[i16 - 1] = (int) Test.fFld;
                                        fArr = fArr;
                                        Test.instanceCount += (long) Test.fFld;
                                        if (b1)
                                            continue;
                                    }
                                    break;
                                case 79:
                                    Test.iArrFld[i16] = Test.byFld;
                                    break;
                                case 80:
                                    Test.iArrFld[i16] = -18;
                                    break;
                                case 81:
                                    lArr[i16 - 1] -= i19;
                                    break;
                                default:
                                    Test.instanceCount = (long) 72.502F;
                            }
                        }
                        break;
                    case 45:
                        lArr[i1] -= i14;
                        break;
                    default:
                        i20 += i2;
                }
                vMeth1_check_sum += i1 + i2 + Double.doubleToLongBits(d1) + i3 + i13 + i14 + i15 + i16 + i17 + i19 + i20 + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
                return;
            } else {
                Test.fFld -= i2;
            }
        } while (--i1 > 0);
        vMeth1_check_sum += i1 + i2 + Double.doubleToLongBits(d1) + i3 + i13 + i14 + i15 + i16 + i17 + i19 + i20 + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(double d, int i) {
        if (ax$0) {
            int ax$7 = i;
            try {
                int ax$6 = 256 * 1024 * 1024;
                int ax$5 = 0x00010002;
                int ax$2 = 0x03;
                int ax$1 = 8080;
                int ax$4 = 70000;
                byte[] ax$3 = new byte[1 << 14];
                for (ax$5 = 1; ax$5 < 58; ax$5++) for (ax$6 = ax$5; 1 + 400 > ax$6; ax$6++) {
                    ax$3[ax$6] -= ax$4;
                    ax$1 += ax$6;
                    switch(i % 5) {
                        case 107:
                            i >>= ax$2;
                    }
                }
            } catch (Throwable ax$8) {
            } finally {
                i = ax$7;
            }
            return;
        }
        boolean b2 = false, bArr[] = new boolean[N];
        double d4 = 0.33425;
        int i21 = 14, i22 = -251, i23 = -232, i24 = -8, i25 = -111, i26 = 109, i27 = 1464, i28 = 7, i29 = 23851, i30 = 13, i31 = -106, i32 = -97, i33 = 11;
        short s1 = 22534;
        FuzzerUtils.init(bArr, true);
        vMeth1();
        Test.instanceCount = 23510L;
        i += i;
        i = (int) Test.fFld;
        b2 = b2;
        i += i;
        i >>= i;
        i = i;
        i = i;
        d4 += d;
        b2 = b2;
        i = i;
        i = 40;
        for (i21 = 14; i21 < 250; ++i21) {
            bArr[i21 + 1] = true;
            for (i23 = 1; i23 < 3; i23++) {
                i = (int) -1489428130L;
                Test.iArrFld[i23] += (int) d;
                if (b2)
                    break;
            }
        }
        for (i25 = 8; 192 > i25; ++i25) {
            for (i27 = 1; i27 < 3; ++i27) {
                for (i29 = 2; i29 > 1; i29--) {
                    Test.fFld += (-5 + (i29 * i29));
                }
                Test.iFld *= (int) Test.fFld;
                Test.instanceCount += (i27 * Test.fFld);
                Test.iArrFld[i27 - 1] >>= Test.byFld;
                i31 = 2;
                do {
                    Test.lArrFld[i27 + 1][i31 - 1] = i;
                    if (b2)
                        break;
                    Test.iFld -= s1;
                } while (--i31 > 0);
                for (i32 = 1; 2 > i32; i32 += 3) {
                    Test.fFld = i24;
                    Test.instanceCount += i22;
                    i33 += i32;
                    i33 = 1;
                    i28 += (((i32 * Test.fFld) + i21) - i23);
                }
                i26 += i33;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i + (b2 ? 1 : 0) + Double.doubleToLongBits(d4) + i21 + i22 + i23 + i24 + i25 + i26 + i27 + i28 + i29 + i30 + i31 + s1 + i32 + i33 + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {
        int i34 = 6, i35 = -34945, i36 = 28, i37 = -2, i38 = -40, i39 = 212, i40 = -82, i41 = -6, i42 = 7, i43 = 30872, i44 = 22488, i45 = -218;
        double d5 = 30.25382;
        long l = 3643512466L, l1 = 0L;
        float f1 = 0.217F;
        boolean b4 = true;
        byte[] byArr = new byte[N];
        FuzzerUtils.init(byArr, (byte) 57);
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
                ax$0 = true;
                for (int ax$9 = 0; ax$9 < 6683; ax$9 += 1) vMeth(0.2660549401640039, -572329205);
            } catch (java.lang.Throwable ax$10) {
            } finally {
                ax$0 = false;
            }
            System.setOut(ax$11);
            System.setErr(ax$12);
        }
        vMeth(-2.39889, -4);
        Test.iFld <<= (int) Test.instanceCount;
        if (b4) {
            for (i34 = 7; i34 < 141; i34++) {
                for (i36 = 38; i36 > 1; --i36) {
                    d5 = Test.iFld;
                    byArr[i34] += (byte) Test.lFld;
                    for (i38 = 1; i38 < 2; i38 += 3) {
                        i39 = (int) Test.fFld;
                        Test.fFld *= -103;
                    }
                    for (i40 = 2; 1 < i40; i40--) {
                        boolean b3 = true;
                        i41 >>= i40;
                        i37 += (int) (3446561046L + (i40 * i40));
                        i37 = (int) l;
                        b3 = b3;
                        Test.lFld += (i40 ^ i37);
                        i39 = (int) Test.instanceCount;
                        Test.iFld += (((i40 * Test.instanceCount) + i35) - Test.lFld);
                        i37 >>>= i34;
                        Test.lFld -= 19925;
                        Test.lArrFld[i36][i40 - 1] = i35;
                        i39 -= (int) -63.1018F;
                        if (false)
                            continue;
                        i41 = -10965;
                        i35 += i40;
                    }
                    switch((i36 % 1) + 73) {
                        case 73:
                            d5 = i35;
                            Test.fArrFld[i34] -= Test.iFld;
                            for (i42 = i36; i42 < 2; i42 += 3) {
                                Test.iFld = Test.iFld;
                                Test.iArrFld[i42 - 1] += 19974;
                                Test.iFld = -248;
                                l -= i36;
                                Test.fFld += i35;
                            }
                            for (f1 = 2; f1 > 1; --f1) {
                                Test.iFld = (int) Test.instanceCount;
                                Test.iFld = i37;
                            }
                            i37 = i35;
                            Test.fFld *= i38;
                    }
                    i41 >>= 1;
                    i35 += (-190 + (i36 * i36));
                    dArrFld[i36 + 1] = Test.instanceCount;
                    Test.instanceCount += i36;
                    switch((i36 % 2) + 58) {
                        case 58:
                            i41 >>= Test.byFld;
                            i41 += i38;
                            i45 = 1;
                            do {
                                i43 *= 8;
                                switch((i34 % 10) + 25) {
                                    case 25:
                                        i41 *= -204;
                                        Test.lFld += (((i45 * i43) + l1) - i41);
                                        sFld = (short) 1.67774;
                                        Test.fFld += (30895 + (i45 * i45));
                                        i35 += i45;
                                        Test.lFld <<= 188;
                                        Test.iArrFld[i45] -= i44;
                                        Test.iFld += (i45 ^ i34);
                                        Test.lArrFld[i36 + 1][i36 - 1] = (long) Test.fFld;
                                        i39 += i45;
                                        if (b4) {
                                            Test.fFld += (float) d5;
                                            Test.fFld += ((long) i45 | (long) Test.byFld);
                                            Test.lFld1 += (i45 * i45);
                                            i39 += (int) l1;
                                            d5 = -7;
                                            switch(((i34 % 6) * 5) + 103) {
                                                case 104:
                                                    i44 = (int) d5;
                                                    break;
                                                case 112:
                                                    i39 ^= i44;
                                                    i39 += (i45 - i43);
                                                    i41 = i35;
                                                    Test.lArrFld[i34 - 1][i34] = l;
                                                    i39 *= (int) l;
                                                    break;
                                                case 114:
                                                    i35 = (int) Test.instanceCount;
                                                    i37 *= (int) Test.lFld;
                                                    i43 += i45;
                                                    break;
                                                case 110:
                                                    i41 += (i45 ^ i36);
                                                    break;
                                                case 109:
                                                    Test.iArrFld[i36] = Test.byFld;
                                                    break;
                                                case 113:
                                                    Test.iArrFld[i34] = (int) Test.fFld;
                                                default:
                                                    i41 += i45;
                                            }
                                        }
                                        break;
                                    case 26:
                                        Test.fArrFld[i34 - 1] += 86;
                                        break;
                                    case 27:
                                        Test.fArrFld = Test.fArrFld;
                                        break;
                                    case 28:
                                        Test.byFld *= (byte) i40;
                                        break;
                                    case 29:
                                        sFld *= (short) Test.instanceCount;
                                        break;
                                    case 30:
                                        i35 += 37;
                                        break;
                                    case 31:
                                        if (b4)
                                            break;
                                        break;
                                    case 32:
                                        Test.lFld = l;
                                    case 33:
                                    case 34:
                                        Test.iArrFld = FuzzerUtils.int1array(N, (int) 50424);
                                        break;
                                    default:
                                        i39 *= i44;
                                }
                            } while (++i45 < 2);
                        case 59:
                            i41 += (int) 8794928015745854672L;
                            break;
                        default:
                            i41 >>>= Test.byFld;
                    }
                }
            }
        } else {
            Test.iFld = -58;
        }
        FuzzerUtils.out.println("i34 i35 i36 = " + i34 + "," + i35 + "," + i36);
        FuzzerUtils.out.println("i37 d5 i38 = " + i37 + "," + Double.doubleToLongBits(d5) + "," + i38);
        FuzzerUtils.out.println("i39 i40 i41 = " + i39 + "," + i40 + "," + i41);
        FuzzerUtils.out.println("l i42 i43 = " + l + "," + i42 + "," + i43);
        FuzzerUtils.out.println("f1 i44 i45 = " + Float.floatToIntBits(f1) + "," + i44 + "," + i45);
        FuzzerUtils.out.println("l1 b4 byArr = " + l1 + "," + (b4 ? 1 : 0) + "," + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.fFld = " + Test.instanceCount + "," + Test.byFld + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld Test.lFld sFld = " + Test.iFld + "," + Test.lFld + "," + sFld);
        FuzzerUtils.out.println("Test.lFld1 Test.iArrFld Test.lArrFld = " + Test.lFld1 + "," + FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.fArrFld dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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

    private static Boolean ax$0 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  vMeth ->  vMeth mainTest
// DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
// DEBUG  dMeth ->  dMeth vMeth1 vMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}
