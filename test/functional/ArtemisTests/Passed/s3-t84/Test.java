// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.math.RoundingMode;

public class Test {

    public static final int N = 256;

    public static long instanceCount = 586L;

    public static double dFld = -87.15165;

    public static float fFld = 32.517F;

    public static short sFld = -6711;

    public static int iFld = -1;

    public boolean bFld = false;

    public static volatile int[] iArrFld = new int[N];

    public static float[] fArrFld = new float[N];

    public boolean[] bArrFld = new boolean[N];

    public static long[] lArrFld = new long[N];

    public double[] dArrFld = new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -14);
        FuzzerUtils.init(Test.fArrFld, -2.809F);
        FuzzerUtils.init(Test.lArrFld, 16659L);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static int iMeth(int i7) {
        int i8 = 33863, i9 = 71, i10 = -2, i11 = 4202, i12 = -30, i13 = 8, iArr1[] = new int[N], iArr2[] = new int[N];
        float f1 = 88.706F, fArr[] = new float[N];
        boolean b = false;
        byte by = -112;
        double[] dArr = new double[N];
        long[] lArr = new long[N];
        FuzzerUtils.init(iArr1, -46009);
        FuzzerUtils.init(dArr, -1.8466);
        FuzzerUtils.init(iArr2, 60);
        FuzzerUtils.init(fArr, 94.353F);
        FuzzerUtils.init(lArr, -13514L);
        i8 /= (int) (i7 | 1);
        iArr1[(i7 >>> 1) % N] -= 0;
        for (i9 = 10; i9 < 219; i9++) {
            i11 = 1;
            do {
                i8 -= (int) Test.instanceCount;
                Test.instanceCount -= Test.instanceCount;
                for (i12 = i9; i12 < 1; ++i12) {
                    short s1 = 6331;
                    i7 &= (int) Test.instanceCount;
                    if (b) {
                        switch(((i9 % 8) * 5) + 45) {
                            case 49:
                                Test.instanceCount += i13;
                                dArr[i9 + 1] = i9;
                                switch((((i13 >>> 1) % 9) * 5) + 123) {
                                    case 165:
                                        i10 = (int) f1;
                                        i10 >>= i12;
                                        i13 = -54011;
                                        i8 = (int) Test.instanceCount;
                                        try {
                                            iArr2[i11] = (i7 % i8);
                                            i8 = (i12 % 96);
                                            i13 = (i8 / i7);
                                        } catch (ArithmeticException a_e) {
                                        }
                                        Test.instanceCount += (i12 | i8);
                                        i10 += i7;
                                        switch(((i9 % 9) * 5) + 82) {
                                            case 126:
                                                iArr1 = FuzzerUtils.int1array(N, (int) -78);
                                                i10 += (((i12 * i11) + i11) - i13);
                                                i7 += i12;
                                                i7 <<= i10;
                                                iArr1[i12] = 147;
                                                iArr2[i11] = (int) 1.61537;
                                                iArr2[i9] = i7;
                                                b = true;
                                                break;
                                            case 95:
                                            case 105:
                                            case 109:
                                            case 98:
                                                i13 += 167;
                                                switch((i12 % 2) + 102) {
                                                    case 102:
                                                        i7 *= -177;
                                                        b = false;
                                                        Test.instanceCount += (long) Test.dFld;
                                                        i8 -= i10;
                                                        i13 += i7;
                                                        i10 = -12;
                                                        break;
                                                    case 103:
                                                        i10 = 117;
                                                    default:
                                                        i10 = i9;
                                                }
                                                break;
                                            case 124:
                                                iArr2[i9 - 1] ^= i13;
                                                break;
                                            case 91:
                                                Test.instanceCount = (long) f1;
                                                break;
                                            case 115:
                                                f1 *= (float) Test.dFld;
                                                break;
                                            case 90:
                                                fArr[i11] += f1;
                                                break;
                                            default:
                                                iArr2[i11] = i12;
                                        }
                                    case 140:
                                        iArr2[i12 + 1] = 10;
                                        break;
                                    case 132:
                                        i8 >>>= (int) Test.instanceCount;
                                    case 151:
                                        Test.instanceCount += (-235 + (i12 * i12));
                                        break;
                                    case 159:
                                        b = true;
                                    case 141:
                                        iArr1[i9 - 1] <<= i9;
                                        break;
                                    case 155:
                                        fArr[i12 + 1] = i7;
                                    case 157:
                                        i8 >>= i13;
                                        break;
                                    case 144:
                                        Test.instanceCount = i12;
                                        break;
                                    default:
                                        if (b)
                                            continue;
                                }
                            case 66:
                                i8 *= by;
                                break;
                            case 77:
                                iArr2[i12 + 1] = i8;
                                break;
                            case 57:
                                s1 -= (short) f1;
                                break;
                            case 58:
                                lArr[i12] -= (long) f1;
                            case 73:
                                dArr[i12 + 1] = i10;
                            case 59:
                                iArr1[(i13 >>> 1) % N] += i8;
                                break;
                            case 76:
                                i8 = (int) Test.instanceCount;
                                break;
                            default:
                                if (false)
                                    break;
                        }
                    } else {
                        lArr = FuzzerUtils.long1array(N, (long) 3931732065L);
                    }
                }
            } while (++i11 < 3);
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f1) + (b ? 1 : 0) + by + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth1(int i5, int i6) {
        if (ax$7) {
            try {
                for (RoundingMode ax$8 : RoundingMode.values()) {
                    if (ax$8 != RoundingMode.valueOf(ax$8.toString())) {
                    }
                }
            } catch (Throwable ax$9) {
            } finally {
            }
            return;
        }
        int i14 = 6, i15 = 146, i16 = -25, i17 = -40202, i18 = -2387, i19 = -7, i20 = 5, i21 = -10, i22 = 60561, i23 = -3, i24 = 14;
        boolean b1 = true;
        byte by1 = 78;
        float f2 = 0.578F, fArr1[] = new float[N];
        long[] lArr1 = new long[N];
        FuzzerUtils.init(lArr1, -19358L);
        FuzzerUtils.init(fArr1, 0.592F);
        Test.instanceCount *= iMeth(i6);
        i5 += 10;
        i14 = 218;
        while (--i14 > 0) {
            for (i15 = 1; i15 < 3; i15 += 3) {
                if (b1)
                    continue;
            }
        }
        for (i17 = 3; i17 < 98; i17++) {
            i18 -= i16;
            for (i19 = 6; i19 > 1; i19--) {
                i20 = -119;
                Test.dFld = i15;
                by1 <<= (byte) i15;
                Test.instanceCount -= i17;
                i16 += i20;
                i16 ^= i14;
                Test.iArrFld[i17] -= i17;
                i5 *= (int) Test.dFld;
                i6 >>= i16;
            }
            for (i21 = 6; i21 > 1; i21 -= 3) {
                switch(((i14 >>> 1) % 4) + 5) {
                    case 5:
                        by1 = (byte) i19;
                        i16 = i15;
                        i5 -= (int) f2;
                        f2 *= (float) Test.dFld;
                        Test.instanceCount = i16;
                        lArr1[i21] -= i14;
                        for (i23 = 1; i23 < 6; i23++) {
                            lArr1[i23] = i6;
                            i22 = (int) f2;
                            f2 = i19;
                            Test.instanceCount += (i23 ^ i19);
                            i5 *= (int) 109.103777;
                            i24 += (37434 + (i23 * i23));
                            i22 += (i23 + i14);
                            i5 = i20;
                            i5 *= (int) f2;
                            i18 /= (int) (i15 | 1);
                            by1 <<= (byte) 59563;
                        }
                        break;
                    case 6:
                        i24 += (i21 | i18);
                        break;
                    case 7:
                        i5 += (int) f2;
                        break;
                    case 8:
                        fArr1[i21] *= i15;
                        break;
                }
            }
        }
        vMeth1_check_sum += i5 + i6 + i14 + i15 + i16 + (b1 ? 1 : 0) + i17 + i18 + i19 + i20 + by1 + i21 + i22 + Float.floatToIntBits(f2) + i23 + i24 + FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static void vMeth(int i, int i1, float f) {
        int i2 = -214, i3 = -127, i4 = 236, i25 = -55, i26 = -65333, i27 = 6, i28 = 233, i29 = 5, iArr[] = new int[N];
        boolean b2 = true;
        short[] sArr = new short[N];
        long[] lArr2 = new long[N];
        FuzzerUtils.init(iArr, -78);
        FuzzerUtils.init(sArr, (short) 28903);
        FuzzerUtils.init(lArr2, -9200415549808288986L);
        for (i2 = 3; i2 < 120; ++i2) {
            i3 *= (int) ((iArr[i2 - 1] - Math.abs(Test.instanceCount)) + i1);
            i4 = 1;
            do {
                {
                    java.io.PrintStream ax$12 = System.out;
                    java.io.PrintStream ax$13 = System.err;
                    java.io.PrintStream ax$14 = new java.io.PrintStream(new java.io.OutputStream() {

                        @Override
                        public void write(int b) throws java.io.IOException {
                            // DO NOTHING: DISCARD ALL OUTPUTS
                        }
                    });
                    System.setOut(ax$14);
                    System.setErr(ax$14);
                    try {
                        ax$7 = true;
                        for (int ax$10 = 0; ax$10 < 9920; ax$10 += 1) vMeth1(-1200261385, -1541924265);
                    } catch (java.lang.Throwable ax$11) {
                    } finally {
                        ax$7 = false;
                    }
                    System.setOut(ax$12);
                    System.setErr(ax$13);
                }
                vMeth1(i4, 4);
                for (i25 = i2; i25 < 1; ++i25) {
                    i3 = (int) 15143L;
                    Test.instanceCount += (long) f;
                    i26 -= i25;
                }
                i27 = 1;
                do {
                    long l = -133L;
                    Test.fFld += -54217;
                    iArr[i27 - 1] -= i1;
                    i26 -= (int) Test.instanceCount;
                    i3 ^= (int) l;
                    lArr2[(i >>> 1) % N] += l;
                    Test.fFld += Test.fFld;
                } while ((i27 += 3) < 1);
                Test.fArrFld[i4 + 1] *= Test.instanceCount;
                if (b2)
                    continue;
                {
                    java.io.PrintStream ax$4 = System.out;
                    java.io.PrintStream ax$5 = System.err;
                    java.io.PrintStream ax$6 = new java.io.PrintStream(new java.io.OutputStream() {

                        @Override
                        public void write(int b) throws java.io.IOException {
                            // DO NOTHING: DISCARD ALL OUTPUTS
                        }
                    });
                    System.setOut(ax$6);
                    System.setErr(ax$6);
                    try {
                        for (int ax$2 = -4697; ax$2 < 4131; ax$2 += 1) {
                            int ax$0 = i29;
                            try {
                                i29++;
                            } catch (Throwable ax$1) {
                            } finally {
                                i29 = ax$0;
                            }
                        }
                    } catch (Throwable ax$3) {
                    }
                    System.setOut(ax$4);
                    System.setErr(ax$5);
                }
                f += (i4 * f);
                for (i28 = 1; i28 < 1; i28++) {
                    long l1 = -47L;
                    Test.instanceCount -= (long) f;
                    Test.fArrFld = Test.fArrFld;
                    iArr[i28] += (int) -112.59131;
                    i += (i28 * i25);
                    i3 -= Test.sFld;
                    Test.sFld -= (short) i29;
                    Test.sFld = (short) l1;
                    i26 -= (int) Test.fFld;
                    i26 = (int) l1;
                    iArr = iArr;
                    i3 *= i2;
                    Test.instanceCount |= i29;
                    l1 = (long) Test.fFld;
                    if (b2) {
                        Test.dFld += Test.instanceCount;
                        i1 = (int) 1.32297;
                        i29 += (int) l1;
                        Test.iArrFld[i2 - 1] += i26;
                    } else if (b2) {
                        if (i25 != 0) {
                            vMeth_check_sum += i + i1 + Float.floatToIntBits(f) + i2 + i3 + i4 + i25 + i26 + i27 + (b2 ? 1 : 0) + i28 + i29 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr2);
                            return;
                        }
                    } else if (b2) {
                        i1 = i27;
                    }
                }
            } while (++i4 < 5);
        }
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f) + i2 + i3 + i4 + i25 + i26 + i27 + (b2 ? 1 : 0) + i28 + i29 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {
        int i30 = 21265, i31 = 9, i32 = 63516, i33 = -4, i34 = -18774, i35 = 38975, i36 = -2, i37 = 50115, i38 = 62385, i39 = -53044, i40 = 35671, i41 = 4095, i42 = -43, i43 = 133, i44 = -40113, i45 = -44458;
        float f3 = -23.53F, f4 = -83.788F;
        byte by2 = -97;
        vMeth(i30, 189, Test.fFld);
        i30 += (int) Test.instanceCount;
        i30 -= i30;
        for (f3 = 2; f3 < 91; f3++) {
            i31 = (int) Test.dFld;
            i30 += (int) (f3 * f3);
            try {
                i31 = (-35 % i30);
                i30 = (i30 % 58951);
                i32 = (Test.iArrFld[(int) (f3)] / -9646);
            } catch (ArithmeticException a_e) {
            }
            for (i33 = 1; i33 < 57; ++i33) {
                i30 -= i33;
                i32 ^= -32456;
                Test.iArrFld[i33] = i33;
                by2 <<= (byte) i32;
                by2 >>= (byte) 20302;
                Test.dFld *= i34;
                Test.instanceCount += (long) Test.dFld;
                Test.iArrFld[(int) (f3 - 1)] = i32;
                Test.instanceCount += i32;
                Test.fFld += (i33 + i31);
                i30 += by2;
                by2 -= (byte) i33;
                i34 += (-1 + (i33 * i33));
            }
            if (bFld) {
                Test.fFld += Test.instanceCount;
                i32 <<= (int) Test.instanceCount;
                Test.sFld -= (short) i34;
                i30 <<= i30;
                i32 -= (int) Test.dFld;
                i32 = (int) Test.fFld;
                Test.instanceCount += (long) (((f3 * Test.instanceCount) + i34) - i33);
                bFld = bFld;
                if (bFld) {
                    for (i35 = 3; i35 < 57; ++i35) {
                        Test.iFld >>= -58020;
                        by2 = (byte) Test.instanceCount;
                        for (i37 = 1; i37 < 2; ++i37) {
                            i30 = (int) Test.instanceCount;
                            Test.dFld = -1581;
                            Test.iArrFld[(int) (f3)] += (int) Test.fFld;
                            i39 += (((i37 * f3) + i30) - i31);
                        }
                        i32 = 19593;
                        Test.instanceCount += i37;
                        bArrFld = bArrFld;
                        i36 >>>= (int) Test.instanceCount;
                        Test.dFld += i38;
                        Test.iFld += (((i35 * i38) + i31) - i39);
                        bFld = bFld;
                        i38 = i35;
                        Test.instanceCount = i40;
                        Test.dFld -= Test.fFld;
                        Test.fFld += i33;
                    }
                } else {
                    i30 += i38;
                    i31 = (int) Test.instanceCount;
                    Test.lArrFld[(int) (f3)] = i34;
                    Test.instanceCount -= i37;
                }
                for (i41 = 1; i41 < 57; ++i41) {
                    i32 &= -6649;
                    dArrFld[i41 - 1] = 13671;
                    if (bFld)
                        continue;
                    i36 += (int) -2.32945;
                    i30 += i41;
                    i34 -= by2;
                    Test.iFld = i39;
                    for (i43 = 1; i43 < 2; i43++) {
                        Test.instanceCount <<= i40;
                    }
                    by2 += (byte) i41;
                    i32 -= i36;
                    for (f4 = 1; f4 < 2; ++f4) {
                        Test.instanceCount += (long) (((f4 * i38) + Test.instanceCount) - i38);
                        i39 += (int) Test.fFld;
                        i42 += (int) f4;
                        i31 += (int) (((f4 * i32) + i45) - i32);
                        Test.instanceCount = i41;
                        Test.fFld -= Test.instanceCount;
                        Test.instanceCount *= -116L;
                        i31 = i42;
                    }
                }
            } else if (bFld) {
                i42 += (int) ((long) f3 | i45);
            } else {
                i30 *= Test.sFld;
            }
        }
        FuzzerUtils.out.println("i30 f3 i31 = " + i30 + "," + Float.floatToIntBits(f3) + "," + i31);
        FuzzerUtils.out.println("i32 i33 i34 = " + i32 + "," + i33 + "," + i34);
        FuzzerUtils.out.println("by2 i35 i36 = " + by2 + "," + i35 + "," + i36);
        FuzzerUtils.out.println("i37 i38 i39 = " + i37 + "," + i38 + "," + i39);
        FuzzerUtils.out.println("i40 i41 i42 = " + i40 + "," + i41 + "," + i42);
        FuzzerUtils.out.println("i43 i44 f4 = " + i43 + "," + i44 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i45 = " + i45);
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.fFld = " + Test.instanceCount + "," + Double.doubleToLongBits(Test.dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.sFld Test.iFld bFld = " + Test.sFld + "," + Test.iFld + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld Test.fArrFld bArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(bArrFld));
        FuzzerUtils.out.println("Test.lArrFld dArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        if (ax$15) {
            int ax$18 = iFld;
            try {
                boolean ax$16 = false;
                for (int ax$17 = 0; ax$17 < iFld; ax$17++) {
                    ax$16 ^= true;
                }
            } catch (Throwable ax$19) {
            } finally {
                iFld = ax$18;
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

    private static Boolean ax$7 = false;

    private static Boolean ax$15 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  vMeth ->  vMeth mainTest
// DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
// DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}
