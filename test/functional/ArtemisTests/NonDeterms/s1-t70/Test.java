// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.util.Locale;
import java.util.Map;
import java.util.Hashtable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Test {

    public static final int N = 256;

    public static long instanceCount = 7L;

    public double dFld = 0.18759;

    public static int iFld = 10;

    public static boolean bFld = false;

    public static double dFld1 = 0.99666;

    public static byte byFld = -3;

    public static volatile long lFld = 63239L;

    public static long lFld1 = 1L;

    public short sFld = 23637;

    public static long[] lArrFld = new long[N];

    public static float[] fArrFld = new float[N];

    public double[] dArrFld = new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 0L);
        FuzzerUtils.init(Test.fArrFld, 61.879F);
    }

    public static long vMeth_check_sum = 0;

    public static long lMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static int iMeth(int i7, int i8) {
        int i9 = 221, i10 = -240, i11 = -18267, i12 = 10, i13 = -55019, i14 = 61932, i15 = 16154, i16 = 0, i17 = 4, i18 = -10514, i19 = -54233, i20 = -11, i21 = 6, iArr1[] = new int[N];
        float f2 = 112.685F;
        byte by = -19;
        double d = 2.45677, dArr[][] = new double[N][N];
        long l2 = 118L, lArr[][] = new long[N][N];
        FuzzerUtils.init(lArr, -4324633421292996046L);
        FuzzerUtils.init(iArr1, 590);
        FuzzerUtils.init(dArr, 0.94885);
        lArr = lArr;
        i7 -= i7;
        for (i9 = 90; i9 > 2; i9--) {
            switch((i9 % 3) + 5) {
                case 5:
                    Test.instanceCount = i8;
                    i11 = 1;
                    while (++i11 < 6) {
                        switch((i11 % 2) + 68) {
                            case 68:
                            case 69:
                                if (Test.bFld)
                                    continue;
                                Test.instanceCount = i8;
                                Test.instanceCount += (i11 + i11);
                                break;
                            default:
                                for (i12 = 1; i12 < 1; ++i12) {
                                    f2 += (-2.384F + (i12 * i12));
                                    Test.instanceCount -= by;
                                    Test.iFld += i9;
                                    iArr1[(11 >>> 1) % N] ^= i7;
                                }
                                i8 *= i8;
                                for (i14 = 1; i14 < 1; ++i14) {
                                    i7 = (int) Test.instanceCount;
                                }
                        }
                    }
                    for (i16 = 1; i16 < 6; ++i16) {
                        Test.lArrFld = Test.lArrFld;
                    }
                    i13 += (int) Test.instanceCount;
                    i13 *= Test.iFld;
                    for (d = 1; d < 6; ++d) {
                        Test.iFld += (int) ((long) d | i17);
                        for (l2 = (long) (d); 2 > l2; ++l2) {
                            i13 += -8;
                            Test.instanceCount = l2;
                            i10 >>= (int) Test.instanceCount;
                            i17 = i15;
                            iArr1[i9 + 1] -= by;
                        }
                        dArr[i9][(int) (d + 1)] /= -26;
                        i10 = i9;
                        Test.lArrFld[i9 - 1] += (long) d;
                        for (i20 = 1; i20 < 2; i20++) {
                            Test.instanceCount += (((i20 * i14) + l2) - i8);
                            i19 -= i7;
                            i10 -= (int) d;
                        }
                    }
                    break;
                case 6:
                    Test.bFld = true;
                case 7:
                    Test.instanceCount -= i7;
                    break;
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f2) + by + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d) + i18 + l2 + i19 + i20 + i21 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static long lMeth(long l, float f1) {
        int i5 = -55656, i6 = -220, i22 = 44, i23 = 192, i24 = -5, i25 = 67, iArr2[][] = new int[N][N];
        double d1 = 2.26866, dArr1[] = new double[N];
        short s = 8302;
        long l3 = 2L;
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, -127.676F);
        FuzzerUtils.init(dArr1, 17.128542);
        FuzzerUtils.init(iArr2, 0);
        i5 = 216;
        while (--i5 > 0) {
            i6 = 3;
            do {
                Test.iFld = -62236;
                f1 *= (i5 - (--Test.iFld));
                Test.instanceCount >>= (long) (Math.abs(f1 - Test.iFld) * (iMeth(i6, i5) - 0.16917));
                Test.iFld += (((i6 * Test.iFld) + i5) - Test.iFld);
                fArr[i6] += l;
                switch(((i6 % 8) * 5) + 48) {
                    case 80:
                        Test.instanceCount += (long) (0.737F + (i6 * i6));
                        Test.iFld *= (int) Test.dFld1;
                        break;
                    case 67:
                        d1 = 1;
                        do {
                            Test.instanceCount -= Test.iFld;
                            if (Test.bFld)
                                continue;
                            f1 += (float) (d1 * Test.iFld);
                            Test.iFld += (int) (((d1 * i6) + Test.iFld) - Test.iFld);
                            Test.byFld += (byte) (((d1 * i5) + s) - Test.iFld);
                            Test.lFld = 42;
                            dArr1[i6 + 1] *= 0.129252;
                            iArr2[i6 + 1][(int) (d1)] -= i5;
                            Test.lArrFld = FuzzerUtils.long1array(N, (long) -5658623729068367008L);
                            Test.iFld += (int) (((d1 * i5) + i5) - i5);
                            iArr2[(int) (d1)][i6 - 1] = i5;
                            Test.iFld += (int) (((d1 * Test.iFld) + i6) - Test.byFld);
                            f1 += (float) d1;
                            Test.iFld += (int) d1;
                        } while (++d1 < 1);
                        i22 = 1;
                        do {
                            Test.iFld *= Test.iFld;
                            Test.instanceCount = i22;
                        } while (++i22 < 1);
                        switch(((i5 >>> 1) % 1) + 9) {
                            case 9:
                                Test.bFld = Test.bFld;
                                if (Test.bFld)
                                    continue;
                                switch(((i6 % 7) * 5) + 115) {
                                    case 142:
                                        Test.iFld |= (int) Test.lFld1;
                                        break;
                                    case 116:
                                        l += Test.iFld;
                                        for (i23 = 1; i23 < 1; ++i23) {
                                            fArr = fArr;
                                            Test.bFld = Test.bFld;
                                        }
                                    case 128:
                                        Test.lFld |= -14;
                                        break;
                                    case 122:
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
                                                boolean ax$14 = false;
                                                for (int ax$13 = -1072; ax$13 < 6609; ax$13 += 7) {
                                                    if (!ax$14) {
                                                        ax$14 = true;
                                                        {
                                                            System.setOut(ax$0);
                                                            System.setErr(ax$1);
                                                            if (i23 != 0) {
                                                            }
                                                            System.setOut(ax$2);
                                                            System.setErr(ax$2);
                                                        }
                                                    }
                                                    int ax$9 = i24;
                                                    int ax$10 = i23;
                                                    int ax$11 = i22;
                                                    try {
                                                        java.util.Map ax$7 = new Hashtable();
                                                        java.util.Locale[] ax$4 = new java.util.Locale[251];
                                                        for (int ax$5 = 0; ax$5 < ax$4.length; ax$5++) {
                                                            Locale ax$3 = ax$4[ax$5];
                                                            int ax$6 = ax$3.hashCode();
                                                            i24 = Math.min(ax$6, i24);
                                                            i23 = Math.max(ax$6, i23);
                                                            Integer ax$8 = new Integer(ax$6);
                                                            if (ax$7.containsKey(ax$8)) {
                                                                i22++;
                                                            } else {
                                                                ax$7.put(ax$8, ax$3);
                                                            }
                                                        }
                                                    } catch (Throwable ax$12) {
                                                    } finally {
                                                        i24 = ax$9;
                                                        i23 = ax$10;
                                                        i22 = ax$11;
                                                    }
                                                }
                                            }
                                            System.setOut(ax$0);
                                            System.setErr(ax$1);
                                        }
                                    case 119:
                                        fArr[i6 + 1] %= 6564684983538172586L;
                                        break;
                                    case 145:
                                        i24 *= 217;
                                        break;
                                    case 148:
                                        Test.iFld += i6;
                                }
                                break;
                        }
                        break;
                    case 79:
                        iArr2[i6][i6 - 1] = (int) Test.instanceCount;
                    case 62:
                        i24 -= i25;
                        break;
                    case 61:
                        i24 += i6;
                    case 53:
                        Test.iFld = i22;
                        break;
                    case 73:
                        i25 += (int) 2L;
                        break;
                    case 77:
                        Test.iFld += (i6 - l3);
                        break;
                    default:
                        Test.dFld1 = Test.dFld1;
                }
            } while (--i6 > 0);
        }
        long meth_res = l + Float.floatToIntBits(f1) + i5 + i6 + Double.doubleToLongBits(d1) + s + i22 + i23 + i24 + i25 + l3 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth(int i1, int i2) {
        int i3 = 1, i4 = -14, i26 = 63468, i27 = 56, i28 = -2915, i29 = 13975, i30 = 12, i31 = 11, i32 = -32990, iArr[] = new int[N];
        float f3 = 0.658F;
        short s1 = 7667;
        long l4 = 11L, lArr1[] = new long[N];
        FuzzerUtils.init(iArr, -62647);
        FuzzerUtils.init(lArr1, 6L);
        for (i3 = 2; i3 < 127; i3++) {
            i1 += i3;
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
                {
                    boolean ax$29 = false;
                    for (int ax$28 = -758; ax$28 < 9117; ax$28 += 7) {
                        if (!ax$29) {
                            ax$29 = true;
                            {
                                System.setOut(ax$15);
                                System.setErr(ax$16);
                                iArr[i3] = i1;
                                System.setOut(ax$17);
                                System.setErr(ax$17);
                            }
                        }
                        int ax$23 = i29;
                        int ax$24 = i32;
                        int ax$25 = i31;
                        int ax$26 = i30;
                        try {
                            java.lang.String[] ax$22 = { "'{'", "'{", "{", "''", "}", "a", "'" };
                            BigDecimal ax$20 = new BigDecimal(ax$22[i31]);
                            BigDecimal ax$21 = new BigDecimal(ax$22[i30]);
                            BigDecimal ax$18 = ax$20.divide(ax$21, new MathContext(i29, RoundingMode.HALF_EVEN));
                            BigDecimal ax$19 = ax$20.divide(ax$21, new MathContext(128, RoundingMode.HALF_EVEN)).round(new MathContext(i29, RoundingMode.HALF_EVEN));
                            if (!ax$18.equals(ax$19)) {
                                i32++;
                            }
                        } catch (Throwable ax$27) {
                        } finally {
                            i29 = ax$23;
                            i32 = ax$24;
                            i31 = ax$25;
                            i30 = ax$26;
                        }
                    }
                }
                System.setOut(ax$15);
                System.setErr(ax$16);
            }
            Test.instanceCount ^= (-(iArr[(i3 >>> 1) % N] - (i2 + Test.instanceCount)));
            i2 = (int) lMeth(Test.lFld1, -2.602F);
            for (i26 = 1; 5 > i26; i26++) {
                i2 += (int) f3;
                i2 /= (int) ((long) (Test.dFld1) | 1);
                Test.fArrFld[i26 - 1] -= 155;
                Test.iFld += (int) (92.171F + (i26 * i26));
                try {
                    i27 = (i27 / 142);
                    Test.iFld = (iArr[i3] % Test.iFld);
                    i4 = (i1 / -1086303295);
                } catch (ArithmeticException a_e) {
                }
                i1 -= i1;
                i2 = (int) Test.lFld;
                for (i28 = 1; i28 < 2; ++i28) {
                    Test.lArrFld[i28 + 1] <<= i4;
                    i4 <<= i27;
                    Test.lFld ^= s1;
                    l4 += i28;
                    Test.iFld = (int) -32.52113;
                    Test.dFld1 = i26;
                    Test.dFld1 += i29;
                    lArr1[(i28 >>> 1) % N] <<= i28;
                    f3 *= Test.instanceCount;
                    Test.iFld -= i29;
                    if (Test.bFld)
                        break;
                    i27 -= i29;
                }
                Test.iFld -= 232;
                i30 = 1;
                while (++i30 < 2) {
                    Test.lFld = -111;
                }
                i2 -= (int) Test.lFld;
                for (i31 = 1; i31 < 2; ++i31) {
                    if (Test.iFld != 0) {
                        vMeth_check_sum += i1 + i2 + i3 + i4 + i26 + i27 + Float.floatToIntBits(f3) + i28 + i29 + s1 + l4 + i30 + i31 + i32 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
                        return;
                    }
                    i27 *= Test.byFld;
                    i4 = i29;
                    f3 -= i3;
                    i29 += (int) Test.lFld1;
                    lArr1[i3 + 1] = i26;
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + i26 + i27 + Float.floatToIntBits(f3) + i28 + i29 + s1 + l4 + i30 + i31 + i32 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {
        int i = 20184, i33 = 110, i34 = -5, i35 = -61507, i36 = 0, i37 = -6, i38 = 45562, i39 = 65, i40 = 93, i41 = -8, i42 = -43198, i43 = -245, i44 = -238, i45 = 42528, i46 = -1133, iArr3[] = new int[N];
        float f = -55.627F, f4 = -28.262F, f5 = 111.845F;
        FuzzerUtils.init(iArr3, -12);
        i += (int) ((i = (int) (dFld + f)) + (-(i + i)));
        vMeth(5, Test.iFld);
        for (i33 = 6; i33 < 122; ++i33) {
            Test.lFld = Test.lFld;
            Test.iFld = i;
            f *= i34;
            f += i33;
            for (i35 = 1; i35 < 44; i35++) {
                Test.lFld -= 4;
                Test.byFld = (byte) 14;
                i34 = i33;
                i = i33;
            }
            iArr3[i33] >>= Test.byFld;
            for (i37 = 44; i33 < i37; i37 -= 3) {
                i36 = -12;
                for (i39 = 1; i39 < 1; ++i39) {
                    i = i35;
                    i >>= (int) Test.lFld1;
                    i34 <<= -12;
                    Test.bFld = Test.bFld;
                    i += (((i39 * i34) + i41) - f);
                    i41 += i39;
                    i34 += sFld;
                    sFld |= (short) -14;
                    i = sFld;
                    i = i36;
                    if (Test.bFld)
                        break;
                    i41 = i41;
                    Test.lFld1 = i41;
                }
                i36 += i37;
                i38 = 5;
            }
            f = Test.iFld;
            i41 >>= (int) Test.lFld1;
            Test.lArrFld[i33 + 1] += i41;
        }
        for (f4 = 8; f4 < 150; f4++) {
            Test.dFld1 /= 1906715694L;
            f5 = 1;
            while (++f5 < 36) {
                i42 ^= i41;
                dArrFld[(int) (f5)] = f4;
                i40 = (int) f4;
                Test.lFld += i37;
                i40 *= (int) f;
            }
            i38 = (int) -201L;
            for (i43 = 2; i43 < 36; i43 += 2) {
                Test.dFld1 -= Test.instanceCount;
                i34 = i33;
                for (i45 = i43; i45 < 3; i45++) {
                    Test.fArrFld[i45 + 1] -= i35;
                    if (Test.bFld) {
                        i38 >>>= i45;
                        Test.instanceCount -= Test.lFld;
                        i42 >>= i37;
                        Test.lArrFld[i45 - 1] -= i37;
                        i40 *= i33;
                        i42 += (((i45 * i35) + i42) - i42);
                        i44 += i38;
                        i41 += 64785;
                        i42 >>= (int) Test.instanceCount;
                        i42 = (int) dFld;
                        switch(((i43 >>> 1) % 2) + 112) {
                            case 112:
                                if (Test.bFld) {
                                    iArr3[(int) (f4 + 1)] <<= i40;
                                    i42 += (i45 * i45);
                                    Test.iFld = i33;
                                    i36 = i41;
                                    i -= (int) Test.lFld1;
                                    iArr3[(int) (f4)] = i41;
                                    iArr3[i43] -= i43;
                                    dFld -= i42;
                                    i34 -= Test.byFld;
                                    i41 = (int) Test.lFld1;
                                    i40 >>= Test.byFld;
                                    i41 += (i45 ^ i33);
                                    Test.lFld1 += i45;
                                    Test.lFld <<= Test.lFld;
                                } else if (Test.bFld) {
                                    Test.lArrFld[i45 + 1] *= Test.lFld1;
                                } else {
                                    i40 += i45;
                                }
                                break;
                            case 113:
                                i41 <<= i42;
                                break;
                        }
                    } else {
                        if (Test.bFld)
                            break;
                    }
                }
            }
            {
                java.io.PrintStream ax$35 = System.out;
                java.io.PrintStream ax$36 = System.err;
                java.io.PrintStream ax$37 = new java.io.PrintStream(new java.io.OutputStream() {

                    @Override
                    public void write(int b) throws java.io.IOException {
                        // DO NOTHING: DISCARD ALL OUTPUTS
                    }
                });
                System.setOut(ax$37);
                System.setErr(ax$37);
                try {
                    for (int ax$33 = -3002; ax$33 < 2377; ax$33 += 1) {
                        try {
                            boolean[] ax$30 = { true, false, false, false, false, false, false };
                            int ax$31 = 2635416;
                            ax$30[ax$31] = false;
                        } catch (Throwable ax$32) {
                        } finally {
                        }
                    }
                } catch (Throwable ax$34) {
                }
                System.setOut(ax$35);
                System.setErr(ax$36);
            }
        }
        FuzzerUtils.out.println("i f i33 = " + i + "," + Float.floatToIntBits(f) + "," + i33);
        FuzzerUtils.out.println("i34 i35 i36 = " + i34 + "," + i35 + "," + i36);
        FuzzerUtils.out.println("i37 i38 i39 = " + i37 + "," + i38 + "," + i39);
        FuzzerUtils.out.println("i40 i41 f4 = " + i40 + "," + i41 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i42 f5 i43 = " + i42 + "," + Float.floatToIntBits(f5) + "," + i43);
        FuzzerUtils.out.println("i44 i45 i46 = " + i44 + "," + i45 + "," + i46);
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("Test.instanceCount dFld Test.iFld = " + Test.instanceCount + "," + Double.doubleToLongBits(dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.bFld Test.dFld1 Test.byFld = " + (Test.bFld ? 1 : 0) + "," + Double.doubleToLongBits(Test.dFld1) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.lFld Test.lFld1 sFld = " + Test.lFld + "," + Test.lFld1 + "," + sFld);
        FuzzerUtils.out.println("Test.lArrFld Test.fArrFld dArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        if (ax$38) {
            boolean ax$39 = bFld;
            try {
                if (!bFld)
                    ;
            } catch (Throwable ax$40) {
            } finally {
                bFld = ax$39;
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

    private static Boolean ax$38 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  vMeth ->  vMeth mainTest
// DEBUG  lMeth ->  lMeth vMeth mainTest
// DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}

