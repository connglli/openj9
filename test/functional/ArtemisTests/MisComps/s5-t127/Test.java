// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.text.Collator;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 25782L;

    public static double dFld = 0.82732;

    public volatile float fFld = -39.573F;

    public volatile int iFld = 61;

    public static short sFld = 2552;

    public static long lArrFld[] = new long[N];

    public static boolean bArrFld[] = new boolean[N];

    public short sArrFld[] = new short[N];

    public double dArrFld[] = new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 300416985L);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static long dMeth_check_sum = 0;

    public static double dMeth(long l, int i8) {
        int i9 = 12;
        int i10 = -24142;
        int i11 = 33822;
        int i12 = -16810;
        int i13 = -6;
        int i14 = 133;
        int i15 = 169;
        int i16 = -24842;
        int iArr1[] = new int[N];
        short s = 11032;
        double d = 0.97538;
        float f1 = -123.528F;
        float fArr[] = new float[N];
        byte by = -103;
        boolean b = true;
        FuzzerUtils.init(iArr1, 215);
        FuzzerUtils.init(fArr, -14.731F);
        for (i9 = 12; 205 > i9; i9++) {
            try {
                iArr1[i9 - 1] = i10 % iArr1[((-8) >>> 1) % N];
                i8 = i10 / 13662;
                i10 = i9 / i8;
            } catch (ArithmeticException a_e) {
            }
            i8 += i9 * Test.instanceCount;
            for (i11 = 1; i11 < 3; i11++) {
                s -= ((short) (i11));
            }
            i12 -= i10;
            for (i13 = i9; i13 < 3; i13++) {
                Test.instanceCount = i12;
                Test.instanceCount += ((i13 * i13) + l) - i9;
                for (i15 = 1; i15 < 1; i15++) {
                    iArr1[i9 - 1] += -23893;
                    i14 -= ((int) (d));
                    f1 -= i15;
                    i12 = 1;
                    by <<= ((byte) (i12));
                    switch ((i9 % 6) + 98) {
                        case 98 :
                            Test.instanceCount *= i9;
                            switch ((i15 % 1) + 88) {
                                case 88 :
                                    f1 += i15;
                                    Test.instanceCount <<= -12;
                                    break;
                                default :
                                    b = b;
                                    Test.lArrFld[i15 + 1] >>>= 6655872966394667710L;
                                    iArr1[i9 - 1] /= ((int) (49.765F));
                                    f1 = s;
                                    i16 += i15;
                                    iArr1[i15] -= i14;
                                    i12 += i11;
                                    l ^= i15;
                                    iArr1 = iArr1;
                                    fArr[i15 + 1] = l;
                                    Test.instanceCount += i15 * i15;
                                    i8 += ((int) (f1));
                                    iArr1[i13] = i14;
                            }
                            Test.lArrFld[i15 - 1] ^= i9;
                            i10 -= i10;
                            if (b)
                                continue;

                            break;
                        case 99 :
                            iArr1[i13 - 1] -= i16;
                            break;
                        case 100 :
                            i8 += ((int) (d));
                            break;
                        case 101 :
                            Test.lArrFld[i13] <<= l;
                            break;
                        case 102 :
                            l &= i11;
                            break;
                        case 103 :
                            i8 = i10;
                            break;
                    }
                }
            }
        }
        long meth_res = (((((((((((((((l + i8) + i9) + i10) + i11) + i12) + s) + i13) + i14) + i15) + i16) + Double.doubleToLongBits(d)) + Float.floatToIntBits(f1)) + by) + (b ? 1 : 0)) + FuzzerUtils.checkSum(iArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        dMeth_check_sum += meth_res;
        return ((double) (meth_res));
    }

    public static void vMeth(int i3) {
        float f = -1.329F;
        int i4 = 6817;
        int i5 = -11339;
        int i6 = 63184;
        int i7 = 15741;
        int i17 = 171;
        int i18 = 98;
        int i19 = 18766;
        int i20 = -3;
        int i21 = -35654;
        int i22 = 179;
        int i23 = -5;
        int i24 = 50361;
        int i25 = 33614;
        int iArr[][] = new int[N][N];
        boolean b1 = false;
        short s1 = 3532;
        byte by1 = 24;
        double dArr[] = new double[N];
        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(dArr, -115.28667);
        i3 = i3;
        Test.instanceCount += i3++;
        switch ((((((int) (12 * (14749 - (f++)))) >>> 1) % 1) * 5) + 9) {
            case 11 :
                for (i4 = 4; i4 < 109; ++i4) {
                    i6 = 1;
                    while ((++i6) < 5) {
                        i7 = 1;
                        while ((++i7) < 1) {
                            i5 += ((int) ((-37.46F) + (i7 * i7)));
                            iArr[i6 + 1][i4] = Integer.reverseBytes(((int) ((i3 + i5) - (Test.instanceCount * i7))));
                        }
                        i3 += ((int) (-(dMeth(Test.instanceCount, i7) - (-4210590470318995256L))));
                        i5 -= i7;
                        i5 *= i4;
                        for (i17 = 1; i17 < 1; ++i17) {
                            Test.dFld += Test.instanceCount;
                            i19 += i17;
                            f -= f;
                        }
                        i5 += i6;
                    }
                    Test.bArrFld[i4 + 1] = b1;
                    for (i20 = i4; 5 > i20; ++i20) {
                        for (i22 = 1; i22 < 1; i22++) {
                            s1 += ((short) (-62011));
                        }
                        for (i24 = 1; i24 > i4; i24--) {
                            Test.instanceCount = -113;
                            dArr[i24] *= i5;
                            i21 += ((i24 * i24) + i20) - i21;
                            iArr[i24 + 1][i24 + 1] += i21;
                            dArr[i20 - 1] -= -2.8171;
                            if (b1) {
                                Test.dFld *= by1;
                                i19 += i20;
                                Test.instanceCount = -34193;
                                i25 = -64389;
                                i23 = ((int) (Test.instanceCount));
                                Test.instanceCount -= i20;
                                Test.instanceCount -= i23;
                                iArr[i24 + 1][i24] = i20;
                            } else if (b1) {
                                Test.instanceCount -= i17;
                                iArr[i20 + 1][i20] -= i21;
                            } else {
                                Test.instanceCount += i24 | i19;
                            }
                        }
                    }
                }
                break;
            default :
                by1 = ((byte) (i19));
        }
        vMeth_check_sum += ((((((((((((((((((i3 + Float.floatToIntBits(f)) + i4) + i5) + i6) + i7) + i17) + i18) + i19) + (b1 ? 1 : 0)) + i20) + i21) + i22) + i23) + s1) + i24) + i25) + by1) + FuzzerUtils.checkSum(iArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public int iMeth(int i1, int i2) {
        int i26 = 13;
        byte by2 = 103;
        float f2 = 53.544F;
        vMeth(i1);
        i26 = 1;
        do {
            {
                final int ax$7 = i1;
                final int ax$8 = i2;
                try {
                    int[] ax$2 = new int[]{ 10, 20, 45, 38, 88 };
                    for (int ax$0 = -156; ax$0 < (-156 + 10705); ax$0 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            while ((ax$2[i2] != i1) & (i1 < i2)) {
                                if ((i1 % 20) == 19) {
                                }
                                i1++;
                                i1++;
                            }
                        } catch (Throwable ax$6) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                    }
                } finally {
                    i1 = ax$7;
                    i2 = ax$8;
                }
            }
            sArrFld[i26 + 1] = ((short) (Test.instanceCount));
            i1 |= 16215;
            by2 = ((byte) (Test.instanceCount));
            Test.instanceCount += i26 * by2;
            f2 += i26;
        } while ((++i26) < 107 );
        for (double d1 : dArrFld) {
            Test.instanceCount = i2;
            Test.dFld *= f2;
            i2 = i26;
        }
        long meth_res = (((i1 + i2) + i26) + by2) + Float.floatToIntBits(f2);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        if (Test.ax$9) {
            Test.AxOutputRedirectionHelper.redirect();
            try {
                BigDecimal[][] ax$10 = new BigDecimal[][]{ new BigDecimal[]{ new BigDecimal("1.00000"), new BigDecimal("1") }, new BigDecimal[]{ new BigDecimal("1.000"), new BigDecimal("1") }, new BigDecimal[]{ new BigDecimal("1"), new BigDecimal("1") }, new BigDecimal[]{ new BigDecimal("0.1234"), new BigDecimal("0.1234") }, new BigDecimal[]{ new BigDecimal("0.12340"), new BigDecimal("0.1234") }, new BigDecimal[]{ new BigDecimal("0.12340000000"), new BigDecimal("0.1234") }, new BigDecimal[]{ new BigDecimal("1234.5678"), new BigDecimal("1234.5678") }, new BigDecimal[]{ new BigDecimal("1234.56780"), new BigDecimal("1234.5678") }, new BigDecimal[]{ new BigDecimal("1234.567800000"), new BigDecimal("1234.5678") }, new BigDecimal[]{ new BigDecimal("0"), new BigDecimal("0") }, new BigDecimal[]{ new BigDecimal("0e2"), BigDecimal.ZERO }, new BigDecimal[]{ new BigDecimal("0e-2"), BigDecimal.ZERO }, new BigDecimal[]{ new BigDecimal("0e42"), BigDecimal.ZERO }, new BigDecimal[]{ new BigDecimal("+0e42"), BigDecimal.ZERO }, new BigDecimal[]{ new BigDecimal("-0e42"), BigDecimal.ZERO }, new BigDecimal[]{ new BigDecimal("0e-42"), BigDecimal.ZERO }, new BigDecimal[]{ new BigDecimal("+0e-42"), BigDecimal.ZERO }, new BigDecimal[]{ new BigDecimal("-0e-42"), BigDecimal.ZERO }, new BigDecimal[]{ new BigDecimal("0e-2"), BigDecimal.ZERO }, new BigDecimal[]{ new BigDecimal("0e100"), BigDecimal.ZERO }, new BigDecimal[]{ new BigDecimal("0e-100"), BigDecimal.ZERO }, new BigDecimal[]{ new BigDecimal("10"), new BigDecimal("1e1") }, new BigDecimal[]{ new BigDecimal("20"), new BigDecimal("2e1") }, new BigDecimal[]{ new BigDecimal("100"), new BigDecimal("1e2") }, new BigDecimal[]{ new BigDecimal("1000000000"), new BigDecimal("1e9") }, new BigDecimal[]{ new BigDecimal("100000000e1"), new BigDecimal("1e9") }, new BigDecimal[]{ new BigDecimal("10000000e2"), new BigDecimal("1e9") }, new BigDecimal[]{ new BigDecimal("1000000e3"), new BigDecimal("1e9") }, new BigDecimal[]{ new BigDecimal("100000e4"), new BigDecimal("1e9") }, new BigDecimal[]{ new BigDecimal("1.0000000000000000000000000000"), new BigDecimal("1") }, new BigDecimal[]{ new BigDecimal("-1.0000000000000000000000000000"), new BigDecimal("-1") }, new BigDecimal[]{ new BigDecimal("1.00000000000000000000000000001"), new BigDecimal("1.00000000000000000000000000001") }, new BigDecimal[]{ new BigDecimal("1000000000000000000000000000000e4"), new BigDecimal("1e34") } };
                for (int ax$11 = 0; ax$11 < ax$10.length; ax$11++) {
                    if (!ax$10[ax$11][0].stripTrailingZeros().equals(ax$10[ax$11][1])) {
                    }
                    ax$10[ax$11][0] = ax$10[ax$11][0].negate();
                    ax$10[ax$11][1] = ax$10[ax$11][1].negate();
                    if (!ax$10[ax$11][0].stripTrailingZeros().equals(ax$10[ax$11][1])) {
                    }
                }
            } catch (Throwable ax$12) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        int i = 5807;
        int i27 = -1;
        int i28 = 11;
        int i29 = -47;
        int i30 = -91;
        int i31 = -4;
        int i32 = -162;
        int i33 = 67;
        int i34 = -25855;
        int i35 = -24;
        int iArr2[][] = new int[N][N];
        long l1 = 125L;
        boolean b2 = false;
        byte by3 = -101;
        byte byArr[][] = new byte[N][N];
        float f3 = 23.751F;
        FuzzerUtils.init(iArr2, -46);
        FuzzerUtils.init(byArr, ((byte) (-127)));
        i -= ((int) ((1857707843L | Integer.reverseBytes(i)) + iMeth(i, -55)));
        i27 = 1;
        do {
            l1 -= l1;
        } while ((++i27) < 184 );
        for (i28 = 6; i28 < 108; ++i28) {
            try {
                iArr2[i28][i28] = (-33422) % iArr2[i28 + 1][i28];
                i = i27 / (-36);
                i29 = (-119) % i29;
            } catch (ArithmeticException a_e) {
            }
            i30 = 50;
            while ((i30 -= 2) > 0) {
                fFld *= i28;
                b2 = b2;
                iArr2[i28][i30] += 4;
                for (i31 = 1; i31 < 2; ++i31) {
                    b2 = b2;
                    Test.instanceCount += i31;
                    Test.dFld -= 38;
                    i = 26838;
                    Test.instanceCount += ((i31 * l1) + i29) - i29;
                    i29 |= ((int) (Test.instanceCount));
                    i29 = ((int) (fFld));
                    if (b2)
                        continue;

                    b2 = b2;
                    i += i31 ^ by3;
                    i32 = i30;
                    b2 = b2;
                    i29 += i29;
                }
                i29 -= -19564;
                i32 >>= i28;
                Test.instanceCount >>= i27;
                fFld += Test.instanceCount;
                i |= i27;
                i32 += ((i30 * i29) + iFld) - Test.instanceCount;
                switch ((i30 % 2) + 3) {
                    case 3 :
                        l1 += ((i30 * l1) + Test.instanceCount) - Test.sFld;
                        b2 = b2;
                        iFld *= i28;
                        Test.instanceCount *= l1;
                        fFld += i;
                        i32 *= -27702;
                        byArr[i28] = byArr[i28];
                        i29 *= 6;
                        i33 = 1;
                        do {
                            iArr2[i33][i30] = i33;
                            dArrFld[i33 + 1] += by3;
                        } while ((++i33) < 2 );
                        i &= i32;
                        break;
                    case 4 :
                        b2 = b2;
                        for (f3 = 2; f3 > 1; f3--) {
                            try {
                                i32 = i29 % 40346;
                                i32 = i35 / i32;
                                iArr2[i30][i30 + 1] = (-50) % i28;
                            } catch (ArithmeticException a_e) {
                            }
                            Test.dFld = -54111;
                            Test.dFld -= 16780;
                            i34 += -27;
                            i29 >>= ((int) (l1));
                            iArr2[((int) (f3 - 1))][i28] *= -14;
                            iFld += ((int) (-29.6005));
                            switch ((i30 % 8) + 96) {
                                case 96 :
                                    fFld = Test.instanceCount;
                                    i29 = 3696;
                                    Test.sFld += ((short) (f3 * f3));
                                    i32 = ((int) (f3));
                                    Test.lArrFld[i28] *= i27;
                                    iFld = ((int) (-1640895929L));
                                case 97 :
                                    Test.instanceCount = 11;
                                    l1 = 462050537L;
                                    iArr2[i30][((int) (f3))] -= 12;
                                    iFld += 8;
                                    i34 += ((int) (-2.102466));
                                    fFld %= i29 | 1;
                                    break;
                                case 98 :
                                    iFld *= i33;
                                    iArr2[i28][i30 - 1] = i30;
                                    i34 += iFld;
                                    Test.instanceCount <<= Test.sFld;
                                    i32 -= i33;
                                case 99 :
                                    i35 = i28;
                                    i35 = 238;
                                    i = i27;
                                    l1 >>>= -5;
                                    i32 = ((int) (1.91F));
                                    i29 += ((int) (((f3 * Test.sFld) + i29) - i29));
                                    break;
                                case 100 :
                                    Test.instanceCount = i28;
                                    break;
                                case 101 :
                                    i29 += ((int) (f3));
                                    break;
                                case 102 :
                                    i34 += ((int) (f3 + by3));
                                case 103 :
                                    fFld += ((f3 * f3) + by3) - i;
                                    break;
                                default :
                                    by3 /= ((byte) (2934555334L));
                            }
                        }
                        break;
                    default :
                        b2 = false;
                }
            }
        }
        FuzzerUtils.out.println((((("i i27 l1 = " + i) + ",") + i27) + ",") + l1);
        FuzzerUtils.out.println((((("i28 i29 i30 = " + i28) + ",") + i29) + ",") + i30);
        FuzzerUtils.out.println((((("b2 i31 i32 = " + (b2 ? 1 : 0)) + ",") + i31) + ",") + i32);
        FuzzerUtils.out.println((((("by3 i33 f3 = " + by3) + ",") + i33) + ",") + Float.floatToIntBits(f3));
        FuzzerUtils.out.println((((("i34 i35 iArr2 = " + i34) + ",") + i35) + ",") + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println((((("Test.instanceCount Test.dFld fFld = " + Test.instanceCount) + ",") + Double.doubleToLongBits(Test.dFld)) + ",") + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println((((("iFld Test.sFld Test.lArrFld = " + iFld) + ",") + Test.sFld) + ",") + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println((((("Test.bArrFld sArrFld dArrFld = " + FuzzerUtils.checkSum(Test.bArrFld)) + ",") + FuzzerUtils.checkSum(sArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                {
                    final int ax$23 = i;
                    try {
                        char ax$14 = '赉';
                        String ax$15 = "2466124847.925947";
                        String[] ax$19 = new String[]{ "y", "yy", "yyy", "yyyy", "yyyyy", "yyyyyy" };
                        Collator ax$20 = null;
                        for (int ax$13 = -145; ax$13 < (-145 + 3169); ax$13 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                try {
                                    ax$14 = ax$15.charAt(i);
                                } catch (StringIndexOutOfBoundsException ax$17) {
                                    ax$14 = '\u0000';
                                }
                            } catch (Throwable ax$18) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            Test.ax$9 = true;
                            _instance.mainTest(new String[]{ "s", "s", "s", "s", "s", "s", "s" });
                            Test.ax$9 = false;
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$21 = 0; ax$21 < ax$19.length; ax$21++) {
                                    ax$20.compare(ax$19[ax$21], ax$19[ax$21]);
                                }
                            } catch (Throwable ax$22) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        i = ax$23;
                    }
                }
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public static final class AxOutputRedirectionHelper {
        private static final PrintStream devNull = new PrintStream(new OutputStream() {
            @Override
            public void write(int i) throws IOException {
            }
        });

        private static final PrintStream stdOutBk = System.out;

        private static final PrintStream stdErrBk = System.err;

        public static void redirect() {
            System.setOut(AxOutputRedirectionHelper.devNull);
            System.setErr(AxOutputRedirectionHelper.devNull);
        }

        public static void recover() {
            System.setOut(AxOutputRedirectionHelper.stdOutBk);
            System.setErr(AxOutputRedirectionHelper.stdErrBk);
        }
    }

    static Boolean ax$9 = false;
}
