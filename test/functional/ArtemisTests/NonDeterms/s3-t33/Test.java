// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

public class Test {

    public static final int N = 256;

    public static long instanceCount = 7385266891791659976L;

    public int iFld = -15;

    public static int iFld1 = 3;

    public static byte byFld = -122;

    public static int iFld2 = 5;

    public short sFld = -12608;

    public boolean bFld = false;

    public static long[] lArrFld = new long[N];

    public static byte[] byArrFld = new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 8L);
        FuzzerUtils.init(Test.byArrFld, (byte) 94);
    }

    public static long bMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static void vMeth() {
        int i5 = 15989, i6 = -9, i7 = 8, i8 = -32227, i9 = 2, i10 = -187, i11 = 182, i12 = 48614, i13 = -3, i14 = -197, i15 = -55918, iArr[] = new int[N], iArr1[] = new int[N];
        double d = 0.123370, d1 = 103.45312;
        short s = 23366, sArr[] = new short[N];
        float f1 = 2.84F;
        FuzzerUtils.init(sArr, (short) 15273);
        FuzzerUtils.init(iArr, -7);
        FuzzerUtils.init(iArr1, 10);
        sArr[(6 >>> 1) % N] = (short) 0L;
        for (i5 = 9; 166 > i5; ++i5) {
            i6 /= (int) ((long) (d) | 1);
            s -= (short) i6;
            for (i7 = 1; i7 < 4; ++i7) {
                Test.instanceCount <<= 6;
            }
            i6 = (int) Test.instanceCount;
            i8 = i6;
            for (i9 = i5; 4 > i9; ++i9) {
                for (i11 = 1; i11 > 1; i11--) {
                    i6 += i11;
                    f1 *= i11;
                    d %= -42259;
                    Test.iFld1 *= i7;
                    Test.iFld1 += i6;
                    Test.instanceCount += i10;
                }
                Test.byFld = (byte) i9;
                for (d1 = 1; d1 < 1; d1++) {
                    i10 >>= i7;
                    Test.instanceCount += Test.instanceCount;
                    iArr[i9 + 1] -= 11324;
                    i6 = i8;
                    d = i8;
                }
                d += i11;
            }
            iArr1[i5 + 1] = i8;
            iArr1[i5] += Test.iFld1;
            i13 /= (int) (i8 | 1);
            Test.instanceCount = -1680661617L;
            i13 >>= i10;
        }
        i12 += 186;
        i10 += i8;
        i6 = i5;
        for (i14 = 2; i14 < 90; ++i14) {
            f1 += i14;
            i8 = i10;
            i13 = (int) Test.instanceCount;
            s -= (short) i8;
        }
        vMeth_check_sum += i5 + i6 + Double.doubleToLongBits(d) + s + i7 + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i13 + i14 + i15 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {
        boolean b = false;
        int i2 = 55071, i3 = -4, i4 = -7, i16 = -19453, i17 = 146, i18 = 118, i19 = -18924, i20 = -12636, i21 = -37, i22 = 13595, i23 = 8968, i24 = 9, i25 = 63369, iArr2[] = new int[N];
        short s1 = -7201;
        double d2 = -55.53456, dArr[] = new double[N];
        float f2 = 2.1016F;
        byte[] byArr = new byte[N];
        long[] lArr = new long[N], lArr1 = new long[N];
        FuzzerUtils.init(dArr, 90.49534);
        FuzzerUtils.init(byArr, (byte) -1);
        FuzzerUtils.init(lArr, -6L);
        FuzzerUtils.init(lArr1, 7974319285680751619L);
        FuzzerUtils.init(iArr2, 12);
        b = (((162 + (dArr[(i2 >>> 1) % N]++)) + (Test.instanceCount = Test.instanceCount)) >= Math.abs(Test.instanceCount++));
        for (i3 = 4; i3 < 179; i3++) {
            vMeth();
            Test.iFld1 ^= i4;
        }
        Test.instanceCount = i2;
        i2 = s1;
        for (i16 = 12; 212 > i16; ++i16) {
            Test.iFld1 -= i16;
        }
        Test.instanceCount %= ((long) (d2) | 1);
        i18 = 180;
        do {
            Test.byFld = (byte) i18;
            byArr = byArr;
            f2 = i16;
            for (i19 = i18; 3 > i19; i19++) {
                lArr = lArr1;
            }
            lArr1[i18 + 1] += (long) f2;
            for (i21 = 1; i21 < 3; i21 += 3) {
                f2 -= (float) 1.35949;
                if (false)
                    continue;
                for (i23 = 1; i23 < 3; i23++) {
                    i22 = i21;
                    try {
                        i17 = (-135 % i17);
                        i4 = (Test.iFld1 % iArr2[i23 + 1]);
                        Test.iFld2 = (i19 / 21866);
                    } catch (ArithmeticException a_e) {
                    }
                    i2 = i18;
                    i22 += (i23 | (long) f2);
                    iArr2[i23] <<= (int) Test.instanceCount;
                }
                i25 = 1;
                do {
                    Test.byFld = (byte) i20;
                    Test.instanceCount -= i2;
                    byArr = byArr;
                    i17 = Test.byFld;
                    i4 >>= i23;
                    d2 += i20;
                    iArr2[i18 + 1] -= i2;
                    if (b)
                        continue;
                    iArr2[i18 - 1] *= (int) Test.instanceCount;
                    i22 >>>= i22;
                    iArr2[i25 + 1] <<= -244;
                } while ((i25 += 3) < 3);
            }
        } while (--i18 > 0);
        long meth_res = (b ? 1 : 0) + i2 + i3 + i4 + s1 + i16 + i17 + Double.doubleToLongBits(d2) + i18 + Float.floatToIntBits(f2) + i19 + i20 + i21 + i22 + i23 + i24 + i25 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public boolean bMeth() {
        int i26 = 59318, i27 = 62, i28 = 11, i29 = -60295, i30 = -61, iArr3[][] = new int[N][N];
        double d3 = 83.108651, d4 = 27.6358, dArr1[] = new double[N];
        float f3 = 0.716F;
        short s2 = 29063;
        FuzzerUtils.init(iArr3, -58);
        FuzzerUtils.init(dArr1, -91.46435);
        iFld = iMeth();
        i26 = 1;
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
                for (int ax$3 = -4443; ax$3 < 2495; ax$3 += 4) {
                    if (!ax$4) {
                        ax$4 = true;
                        {
                            System.setOut(ax$0);
                            System.setErr(ax$1);
                            do {
                                for (i27 = 1; i27 < 4; ++i27) {
                                    for (d3 = i26; d3 < 2; ++d3) {
                                        iArr3[i26][i26 - 1] -= 11;
                                        Test.lArrFld[i27 + 1] = i28;
                                        Test.iFld2 += (int) (((d3 * Test.iFld1) + Test.instanceCount) - Test.instanceCount);
                                        iArr3[(int) (d3)][i27 + 1] += iFld;
                                        Test.iFld1 = Test.byFld;
                                        Test.iFld2 += iFld;
                                    }
                                    i30 = 1;
                                    while (++i30 < 2) {
                                        boolean b1 = false;
                                        Test.iFld1 -= iFld;
                                        if (b1)
                                            break;
                                        f3 += (i30 - i27);
                                        if (b1) {
                                            Test.iFld2 *= iFld;
                                            Test.instanceCount = i29;
                                            Test.lArrFld[i30 + 1] = Test.instanceCount;
                                            switch((i27 % 9) + 44) {
                                                case 44:
                                                    try {
                                                        Test.iFld1 = (-144 % iFld);
                                                        i28 = (Test.iFld2 % i30);
                                                        i29 = (iArr3[i26 - 1][i30] / 663837080);
                                                    } catch (ArithmeticException a_e) {
                                                    }
                                                    s2 <<= (short) -6;
                                                    d4 = Test.instanceCount;
                                                    iFld -= s2;
                                                    iArr3[i26 - 1] = FuzzerUtils.int1array(N, (int) -8136);
                                                    iArr3[i26 + 1] = iArr3[i26];
                                                    d4 %= (i30 | 1);
                                                    i29 /= (int) (Test.instanceCount | 1);
                                                    if (b1) {
                                                        f3 += i29;
                                                        f3 += i30;
                                                    } else {
                                                        Test.byFld <<= (byte) -167L;
                                                        Test.instanceCount |= Test.instanceCount;
                                                        iFld += (int) Test.instanceCount;
                                                        i28 <<= i30;
                                                    }
                                                    Test.byFld &= (byte) Test.instanceCount;
                                                    Test.iFld1 += iFld;
                                                    i28 += Test.iFld1;
                                                    break;
                                                case 45:
                                                case 46:
                                                    d4 -= Test.instanceCount;
                                                    break;
                                                case 47:
                                                    Test.iFld1 += i30;
                                                case 48:
                                                    Test.iFld2 *= -25538;
                                                    break;
                                                case 49:
                                                    dArr1[i30] -= Test.iFld2;
                                                case 50:
                                                    Test.instanceCount = i28;
                                                    break;
                                                case 51:
                                                    Test.instanceCount = 37;
                                                    break;
                                                case 52:
                                                    Test.instanceCount = i28;
                                                default:
                                                    try {
                                                        i29 = (iFld / i29);
                                                        i29 = (-14502 % iFld);
                                                        Test.iFld2 = (54394 / Test.iFld2);
                                                    } catch (ArithmeticException a_e) {
                                                    }
                                            }
                                        } else if (b1) {
                                            i28 = Test.iFld1;
                                        } else if (b1) {
                                            if (b1)
                                                break;
                                        } else {
                                            iArr3[i26][i27] = i28;
                                        }
                                    }
                                }
                            } while (++i26 < 137);
                            System.setOut(ax$2);
                            System.setErr(ax$2);
                        }
                    }
                }
            }
            System.setOut(ax$0);
            System.setErr(ax$1);
        }
        long meth_res = i26 + i27 + i28 + Double.doubleToLongBits(d3) + i29 + i30 + Float.floatToIntBits(f3) + s2 + Double.doubleToLongBits(d4) + FuzzerUtils.checkSum(iArr3) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {
        int i = -52834, i1 = 115, i31 = 11, i32 = -1587, i34 = -202, i35 = 30152, i36 = -144, iArr4[] = new int[N];
        float f = -2.612F;
        long l = -197L, l1 = -26250L;
        double d5 = 78.57940, d6 = 116.115697, dArr2[] = new double[N];
        byte by = 96;
        FuzzerUtils.init(iArr4, -6324);
        FuzzerUtils.init(dArr2, 1.48903);
        i += Math.min(Math.min(i - i, 0), (int) (i * (f - -36606)));
        i >>= (int) ((f++) - 562604928L);
        for (l = 8; l < 134; l++) {
            bMeth();
            if (bFld) {
                for (i31 = 2; i31 < 40; ++i31) {
                    i32 <<= i1;
                    Test.iFld1 = -162;
                    i1 = (int) d5;
                    Test.byFld = (byte) i;
                    i32 -= (int) 1317L;
                    Test.lArrFld[i31] %= (Test.instanceCount | 1);
                    iArr4[(int) (l - 1)] = (int) l;
                    iArr4[i31 + 1] *= (int) Test.instanceCount;
                    Test.instanceCount += Test.instanceCount;
                }
                Test.instanceCount += (l * Test.instanceCount);
                Test.iFld1 += (int) (((l * i) + Test.iFld1) - Test.instanceCount);
                iArr4[(int) (l - 1)] *= (int) f;
                dArr2[(int) (l + 1)] *= Test.iFld1;
                i34 = 1;
                while (++i34 < 40) {
                    switch((int) ((l % 2) + 8)) {
                        case 8:
                            iArr4[(int) (l)] -= iFld;
                            Test.lArrFld = Test.lArrFld;
                            iArr4[(int) (l + 1)] += 5922;
                            Test.instanceCount += Test.instanceCount;
                            break;
                        case 9:
                            Test.iFld1 -= i32;
                            i -= iFld;
                            for (d6 = 1; 1 < d6; --d6) {
                                Test.iFld1 += (26 + (d6 * d6));
                                Test.instanceCount = Test.instanceCount;
                                d5 = i32;
                                Test.iFld2 = (int) Test.instanceCount;
                                iArr4[i34 + 1] = (int) Test.instanceCount;
                                Test.instanceCount = Test.instanceCount;
                            }
                            Test.lArrFld[(int) (l - 1)] = sFld;
                            Test.iFld1 <<= i32;
                            Test.iFld1 += (218 + (i34 * i34));
                            i35 *= 185;
                            Test.instanceCount = 40;
                            try {
                                i = (98 / Test.iFld1);
                                iArr4[i34 + 1] = (-55 % Test.iFld1);
                                i = (i1 / i34);
                            } catch (ArithmeticException a_e) {
                            }
                            i36 = 1;
                            do {
                                boolean b2 = false;
                                switch(((i >>> 1) % 6) + 50) {
                                    case 50:
                                        i35 %= (int) (l | 1);
                                        i1 -= (int) -224L;
                                        i35 += (i36 ^ Test.instanceCount);
                                        Test.iFld1 += (int) l;
                                        i -= (int) l;
                                        f += (float) d6;
                                        d5 *= i36;
                                        iArr4[(int) (l + 1)] -= by;
                                        i32 += i36;
                                        i32 ^= i31;
                                        Test.iFld1 *= i36;
                                        d5 = i34;
                                        iArr4[i34] -= Test.iFld1;
                                        f += (i36 - Test.iFld2);
                                        Test.instanceCount = i36;
                                        break;
                                    case 51:
                                        i32 <<= 6;
                                        break;
                                    case 52:
                                        switch((int) (((l % 1) * 5) + 104)) {
                                            case 107:
                                                b2 = b2;
                                                i += (i36 ^ Test.iFld1);
                                                if (bFld)
                                                    continue;
                                                i32 -= (int) l;
                                                if (true)
                                                    break;
                                                i32 += i36;
                                                d5 /= 214L;
                                                iFld = i36;
                                                i = i34;
                                                l1 = Test.instanceCount;
                                                if (false)
                                                    continue;
                                                i32 >>= i34;
                                                break;
                                        }
                                        if (bFld) {
                                            l1 += (i36 - i31);
                                            iArr4[i36 + 1] = (int) f;
                                            Test.iFld2 += 9771;
                                        } else if (bFld) {
                                            Test.iFld1 -= iFld;
                                        } else if (b2) {
                                            iArr4[(int) (l)] = -162;
                                        }
                                        break;
                                    case 53:
                                        l1 <<= Test.iFld2;
                                    case 54:
                                        Test.byArrFld[i34] = (byte) -12;
                                    case 55:
                                        Test.instanceCount = Test.iFld2;
                                        break;
                                    default:
                                        Test.iFld2 += (i36 - Test.instanceCount);
                                }
                            } while (--i36 > 0);
                        default:
                            Test.lArrFld[i34] *= i1;
                    }
                }
            } else if (bFld) {
            } else {
                d5 += l1;
            }
        }
        FuzzerUtils.out.println("i f l = " + i + "," + Float.floatToIntBits(f) + "," + l);
        FuzzerUtils.out.println("i1 i31 i32 = " + i1 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("d5 i34 d6 = " + Double.doubleToLongBits(d5) + "," + i34 + "," + Double.doubleToLongBits(d6));
        FuzzerUtils.out.println("i35 i36 by = " + i35 + "," + i36 + "," + by);
        FuzzerUtils.out.println("l1 iArr4 dArr2 = " + l1 + "," + FuzzerUtils.checkSum(iArr4) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr2)));
        FuzzerUtils.out.println("Test.instanceCount iFld Test.iFld1 = " + Test.instanceCount + "," + iFld + "," + Test.iFld1);
        FuzzerUtils.out.println("Test.byFld Test.iFld2 sFld = " + Test.byFld + "," + Test.iFld2 + "," + sFld);
        FuzzerUtils.out.println("bFld Test.lArrFld Test.byArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(Test.byArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }

    public static void main(String[] strArr) {
        if (ax$5) {
            try {
                int ax$6 = 1558824;
                int ax$8 = 100096;
                int[] ax$7 = { -11 };
                ax$6 += ax$7[ax$8];
                for (int ax$9 = 0; ax$9 < 2; ++ax$9) {
                    // The HBoundsCheck for this array access will be updated to access
                    // the array length phi created for the deoptimization checks of the
                    // first loop. This crashed the compiler which used to DCHECK an array
                    // length in a bounds check cannot be a phi.
                    ax$6 += ax$7[ax$9];
                }
            } catch (Throwable ax$10) {
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

    private static Boolean ax$5 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  bMeth ->  bMeth mainTest
// DEBUG  iMeth ->  iMeth bMeth mainTest
// DEBUG  vMeth ->  vMeth iMeth bMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}
