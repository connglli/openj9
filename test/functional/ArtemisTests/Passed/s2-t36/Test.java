// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

public class Test {

    public static final int N = 256;

    public static long instanceCount = 34L;

    public static float fFld = 102.949F;

    public volatile short sFld = 32326;

    public int iFld = 35505;

    public int iFld1 = 61638;

    public static int[] iArrFld = new int[N];

    public static boolean[] bArrFld = new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 3);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long iMeth_check_sum = 0;

    public static long iMeth1_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static void vMeth(int i6, long l2, int i7) {
        if (ax$8) {
            try {
                int ax$9 = 0x8100;
                int ax$11 = 1558824;
                for (int ax$10 = 0; ax$10 < ax$11; ax$10++) {
                    ax$9++;
                }
            } catch (Throwable ax$12) {
            } finally {
            }
            return;
        }
        int i8 = 0, i9 = 0, i10 = -167, i11 = -159, i12 = -19599, i13 = -11810, i14 = -5439, i15 = 0, i16 = 8601, i17 = 14524;
        float f1 = -22.720F;
        short s = 16821;
        boolean b = true;
        double d = 37.84657;
        long[] lArr1 = new long[N];
        FuzzerUtils.init(lArr1, 3247707241851580287L);
        i8 = 1;
        while (++i8 < 135) {
            l2 *= (long) f1;
            for (i9 = 1; i9 < 4; i9++) {
                i7 += (int) (58227L + (i9 * i9));
                f1 = i9;
                i6 += i10;
                i11 *= i8;
                f1 = -29254;
                for (i12 = i8; i12 < 2; i12++) {
                    i6 += (((i12 * i13) + f1) - i7);
                    i6 += i6;
                    i7 += (((i12 * l2) + i6) - i11);
                    i11 <<= i10;
                    lArr1[i12] <<= l2;
                    l2 = -70;
                    Test.instanceCount = (long) f1;
                    i10 -= i8;
                }
                f1 += (((i9 * f1) + i10) - Test.instanceCount);
                Test.instanceCount -= (long) -114.36571;
                i7 <<= -19922;
                i7 += i9;
                Test.iArrFld[(i13 >>> 1) % N] &= i12;
                s -= (short) l2;
            }
            s -= (short) -6;
            lArr1[i8] *= i9;
            if (b) {
                for (i14 = 1; i14 < 4; ++i14) {
                    switch((((i9 >>> 1) % 9) * 5) + 28) {
                        case 52:
                            lArr1[i14 + 1] += i10;
                            Test.instanceCount >>= l2;
                            i6 = 102;
                            for (i16 = 2; i16 > 1; --i16) {
                                Test.instanceCount -= l2;
                                i10 |= i12;
                                f1 += i16;
                                if (false)
                                    break;
                                i7 = 50074;
                            }
                        case 40:
                            s += (short) (i14 | i17);
                        case 63:
                            l2 += (((i14 * i15) + i6) - l2);
                        case 31:
                            l2 >>= i8;
                            break;
                        case 62:
                            b = b;
                        case 30:
                            i7 -= (int) Test.instanceCount;
                        case 71:
                            i7 = i8;
                            break;
                        case 41:
                            if (b)
                                continue;
                            break;
                        case 33:
                            i7 *= (int) 40674L;
                            break;
                    }
                }
            } else if (b) {
                d = f1;
            }
        }
        vMeth_check_sum += i6 + l2 + i7 + i8 + Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + s + i14 + i15 + i16 + i17 + (b ? 1 : 0) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth1() {
        if (ax$18) {
            try {
                int ax$20 = 499501;
                java.lang.String[] ax$19 = { "com..net", "com..", ".com", ".com." };
                ax$20 = Integer.parseInt(ax$19[1]);
            } catch (Throwable ax$21) {
            } finally {
            }
            return -924289466;
        }
        int i18 = 62, i19 = 99, i20 = -8, i21 = -3, i22 = 111, i23 = -5, i24 = 7, iArr1[][] = new int[N][N];
        double d1 = -122.94867, d2 = 1.66805;
        long[][] lArr2 = new long[N][N];
        FuzzerUtils.init(iArr1, -54054);
        FuzzerUtils.init(lArr2, 686049084L);
        iArr1 = (iArr1 = (iArr1 = (iArr1 = FuzzerUtils.int2array(N, (int) 237))));
        {
            java.io.PrintStream ax$15 = System.out;
            java.io.PrintStream ax$16 = System.err;
            java.io.PrintStream ax$17 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$17);
            System.setErr(ax$17);
            try {
                ax$8 = true;
                for (int ax$13 = 0; ax$13 < 7273; ax$13 += 1) vMeth(1152922186, -5046796198650650780L, -1905420631);
            } catch (java.lang.Throwable ax$14) {
            } finally {
                ax$8 = false;
            }
            System.setOut(ax$15);
            System.setErr(ax$16);
        }
        vMeth(i18, Test.instanceCount, i18);
        i18 *= i18;
        i18 = i18;
        Test.iArrFld[(-11611 >>> 1) % N] = i18;
        for (d1 = 4; d1 < 82; d1++) {
            i18 += (int) (d1 + i18);
            for (i20 = 1; i20 < 7; ++i20) {
                boolean b1 = false;
                int i25 = -168;
                switch((int) (((d1 % 1) * 5) + 25)) {
                    case 29:
                        Test.iArrFld[i20 + 1] = 9;
                        Test.iArrFld[(int) (d1 + 1)] += 39222;
                        Test.fFld = i20;
                        i18 &= i19;
                        b1 = b1;
                        i18 = i19;
                        d2 *= Test.fFld;
                        Test.fFld += (5 + (i20 * i20));
                        lArr2[(int) (d1)][i20 + 1] >>= i20;
                        switch(((i20 >>> 1) % 7) + 79) {
                            case 79:
                                for (i22 = 1; 2 > i22; ++i22) {
                                    Test.instanceCount = (long) Test.fFld;
                                    d2 %= (i20 | 1);
                                    iArr1[i20 - 1][(int) (d1 - 1)] += i24;
                                    Test.fFld += Test.instanceCount;
                                    i18 += (((i22 * i22) + Test.instanceCount) - i24);
                                }
                                b1 = false;
                                Test.fFld += i20;
                                Test.instanceCount += (i20 | i24);
                                i21 += i20;
                                i19 = (int) Test.fFld;
                                i23 += i20;
                                i24 -= (int) Test.instanceCount;
                            case 80:
                                Test.instanceCount = i18;
                                break;
                            case 81:
                                i19 <<= 95;
                                Test.instanceCount *= i20;
                                Test.fFld -= i22;
                                Test.iArrFld[(int) (d1)] -= (int) Test.instanceCount;
                            case 82:
                                Test.instanceCount *= Test.instanceCount;
                                break;
                            case 83:
                                i19 -= (int) Test.instanceCount;
                                break;
                            case 84:
                                i18 ^= (int) Test.instanceCount;
                                break;
                            case 85:
                                i25 = i24;
                                break;
                            default:
                                i23 += (i20 ^ i23);
                        }
                    default:
                        i24 += (i20 * i20);
                }
            }
        }
        long meth_res = i18 + Double.doubleToLongBits(d1) + i19 + i20 + i21 + Double.doubleToLongBits(d2) + i22 + i23 + i24 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr2);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public int iMeth(long l, int i1, long l1) {
        byte by = 30;
        float f = 1.738F, fArr[] = new float[N];
        int i2 = -59808, i3 = 4, i4 = 35884, i5 = 24503, i26 = 123, i27 = -14, i28 = 161, i29 = -10, i30 = 36, i31 = -147, i32 = 18, i33 = 90, i34 = 56424;
        double d3 = -10.97034;
        boolean b2 = false;
        long[] lArr = new long[N];
        FuzzerUtils.init(lArr, -60865L);
        FuzzerUtils.init(fArr, -1.496F);
        lArr[(i1 >>> 1) % N] += (long) (by + (++f));
        for (i2 = 2; i2 < 139; i2++) {
            for (i4 = 1; i4 < 4; ++i4) {
                f = (float) (((i1 * i2) + (0.110287 + iMeth1())) + Test.instanceCount);
                for (i26 = 1; 2 > i26; i26++) {
                    i5 = (int) d3;
                    i27 >>= (int) 8L;
                    lArr[i26] *= i2;
                    Test.fFld = -20947;
                }
                Test.iArrFld[i4 + 1] += (int) -19.124319;
                fArr[i4 - 1] = i3;
                l <<= i2;
                l1 = Test.instanceCount;
                Test.bArrFld = FuzzerUtils.boolean1array(N, (boolean) false);
                sFld -= (short) 6;
                lArr[i2] = Test.instanceCount;
                for (i28 = 2; i28 > 1; i28 -= 2) {
                    b2 = b2;
                    i1 %= (int) (i28 | 1);
                    i29 -= (int) Test.instanceCount;
                }
                Test.fFld += (((i4 * i2) + i27) - i5);
                for (i30 = 1; i30 < 2; i30++) {
                    i27 = i28;
                }
                l1 -= i1;
                switch((((-5 >>> 1) % 2) * 5) + 126) {
                    case 136:
                        Test.fFld = l;
                        f += (-10 + (i4 * i4));
                        for (i32 = 1; 2 > i32; ++i32) {
                            Test.fFld += (((i32 * i2) + i4) - Test.instanceCount);
                            by += (byte) Test.fFld;
                            Test.instanceCount += i5;
                            Test.iArrFld[i32 - 1] &= i3;
                        }
                        switch((i4 % 2) + 80) {
                            case 80:
                                i34 = 1;
                                while (++i34 < 2) {
                                    Test.iArrFld = FuzzerUtils.int1array(N, (int) -13);
                                    if (b2)
                                        continue;
                                    i33 = i1;
                                }
                                break;
                            case 81:
                                i5 -= i33;
                                break;
                        }
                        break;
                    case 128:
                        Test.fFld -= i26;
                    default:
                        l1 = by;
                }
            }
        }
        long meth_res = l + i1 + l1 + by + Float.floatToIntBits(f) + i2 + i3 + i4 + i5 + i26 + i27 + Double.doubleToLongBits(d3) + i28 + i29 + (b2 ? 1 : 0) + i30 + i31 + i32 + i33 + i34 + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {
        int i = -165, i35 = -14, i36 = -31, i37 = -18, i38 = 17865, i39 = 12, i40 = -141, i41 = -61824, i42 = -176, i43 = 3, iArr[][] = new int[N][N];
        boolean b3 = true;
        double d4 = -89.118468;
        short[] sArr = new short[N];
        long[][] lArr3 = new long[N][N];
        float[] fArr1 = new float[N];
        byte[] byArr = new byte[N];
        FuzzerUtils.init(iArr, 8);
        FuzzerUtils.init(sArr, (short) -26242);
        FuzzerUtils.init(lArr3, 8176L);
        FuzzerUtils.init(fArr1, 2.573F);
        FuzzerUtils.init(byArr, (byte) 127);
        i <<= 17017;
        iArr[(i >>> 1) % N][(i >>> 1) % N] = (((i * i) * iMeth(Test.instanceCount, i, Test.instanceCount)) + i);
        for (i35 = 6; i35 < 138; ++i35) {
            sArr = sArr;
            if (b3)
                continue;
            Test.instanceCount *= 8;
            Test.instanceCount -= i35;
            i36 *= i35;
            for (i37 = 38; i37 > i35; i37--) {
                d4 *= 50.41575;
                d4 -= 3745673589419214330L;
                lArr3 = lArr3;
                for (i39 = 1; i39 < 1; i39++) {
                    byte by1 = 71;
                    i38 *= i41;
                    i36 += (int) Test.fFld;
                    Test.instanceCount = i38;
                    i40 += (i39 * i40);
                    switch((i37 % 1) + 57) {
                        case 57:
                            Test.fFld += (i39 * i39);
                            i = (int) Test.instanceCount;
                            i += -8077;
                            Test.instanceCount += (i39 * i39);
                            i <<= by1;
                            d4 += 20613;
                            Test.instanceCount += i36;
                            i41 += (((i39 * i41) + i38) - i37);
                        default:
                            if (false)
                                continue;
                            fArr1[i39] -= i38;
                            i41 += (int) Test.fFld;
                            if (b3) {
                                if (false)
                                    break;
                                Test.instanceCount = i41;
                                i *= (int) Test.fFld;
                                i42 += (int) Test.instanceCount;
                                i36 <<= i37;
                                i38 += i38;
                                i40 -= i36;
                            } else {
                                try {
                                    iArr[i39 - 1][i35 - 1] = (i37 % -38);
                                    i = (121 / i36);
                                    iArr[i35][i35 + 1] = (Test.iArrFld[i37] / i);
                                } catch (ArithmeticException a_e) {
                                }
                                iArr[i39 - 1][i35] = (int) -2021824080543933554L;
                                i42 += -10336;
                                i43 -= i41;
                                i = i39;
                                i38 = i42;
                                try {
                                    iArr[i35 - 1][i37] = (i37 / -211);
                                    i41 = (i37 % i38);
                                    i = (i36 % 707310306);
                                } catch (ArithmeticException a_e) {
                                }
                                Test.iArrFld[i37] = i43;
                                i42 += i39;
                                i41 += i39;
                                Test.instanceCount -= i38;
                                d4 = by1;
                                Test.fFld = i41;
                                i40 += (i39 * i39);
                            }
                            i36 &= i36;
                            i42 += i39;
                            i36 += (i39 | Test.instanceCount);
                            iArr[i39 + 1][i35 + 1] = (int) Test.instanceCount;
                            switch((i35 % 4) + 49) {
                                case 49:
                                    sArr[i35] >>>= (short) Test.instanceCount;
                                    i40 ^= i41;
                                    i36 += (i39 | Test.instanceCount);
                                    i36 >>= (int) Test.instanceCount;
                                    byArr[i37 - 1] = (byte) d4;
                                    try {
                                        i40 = (Test.iArrFld[i37] / iFld);
                                        iFld = (Test.iArrFld[i35 - 1] / -1187871374);
                                        i41 = (1341128460 / i36);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    i38 += (i39 - by1);
                                    if (false) {
                                        iArr[i35][(iFld1 >>> 1) % N] = i37;
                                    } else {
                                        d4 = i35;
                                        Test.bArrFld[i39 - 1] = b3;
                                        Test.instanceCount = i41;
                                        iFld += i39;
                                        by1 -= (byte) i38;
                                        i42 *= i39;
                                        Test.fFld = Test.instanceCount;
                                        Test.instanceCount += (((i39 * i37) + sFld) - i40);
                                        Test.instanceCount -= (long) Test.fFld;
                                        Test.fFld += i35;
                                    }
                                    break;
                                case 50:
                                    fArr1 = fArr1;
                                    break;
                                case 51:
                                    i41 = by1;
                                    break;
                                case 52:
                                    Test.instanceCount %= (Test.instanceCount | 1);
                                    break;
                            }
                    }
                }
            }
        }
        FuzzerUtils.out.println("i i35 i36 = " + i + "," + i35 + "," + i36);
        FuzzerUtils.out.println("b3 i37 i38 = " + (b3 ? 1 : 0) + "," + i37 + "," + i38);
        FuzzerUtils.out.println("d4 i39 i40 = " + Double.doubleToLongBits(d4) + "," + i39 + "," + i40);
        FuzzerUtils.out.println("i41 i42 i43 = " + i41 + "," + i42 + "," + i43);
        FuzzerUtils.out.println("iArr sArr lArr3 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(sArr) + "," + FuzzerUtils.checkSum(lArr3));
        FuzzerUtils.out.println("fArr1 byArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld sFld = " + Test.instanceCount + "," + Float.floatToIntBits(Test.fFld) + "," + sFld);
        FuzzerUtils.out.println("iFld iFld1 Test.iArrFld = " + iFld + "," + iFld1 + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));
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
                for (int ax$3 = -4808; ax$3 < 3585; ax$3 += 1) {
                    float ax$1 = fFld;
                    try {
                        boolean ax$0 = false;
                        if (fFld != (ax$0 ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY))
                            ;
                    } catch (Throwable ax$2) {
                    } finally {
                        fFld = ax$1;
                    }
                }
            } catch (Throwable ax$4) {
            }
            System.setOut(ax$5);
            System.setErr(ax$6);
        }
    }

    private static Boolean ax$8 = false;

    private static Boolean ax$18 = false;
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
