// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Map;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 2L;

    public static int iFld = 37329;

    public static int iArrFld[] = new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 31269);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {
        int i5 = 4;
        int i6 = 55784;
        int i7 = -144;
        int i8 = 42331;
        int iArr[] = new int[N];
        float f1 = -118.66F;
        byte by = -103;
        byte byArr[][] = new byte[N][N];
        double d = 1.78329;
        double dArr[] = new double[N];
        long lArr[] = new long[N];
        FuzzerUtils.init(iArr, -173);
        FuzzerUtils.init(lArr, 416369066724256987L);
        FuzzerUtils.init(byArr, ((byte) (78)));
        FuzzerUtils.init(dArr, 1.109643);
        Test.iFld += Test.iFld;
        for (i5 = 1; i5 < 150; i5 += 2) {
            i7 = 1;
            do {
                Test.iFld = ((int) (f1));
                iArr = iArr;
                Test.iFld += i7 * i7;
                Test.instanceCount = Test.iFld;
                Test.iFld += i7;
                i6 = i6;
                iArr[i7 - 1] += i7;
                Test.iFld >>= i7;
                lArr[i5] -= Test.instanceCount;
                i8 = 1;
                do {
                    i6 += -2;
                    Test.instanceCount *= ((long) (f1));
                    byArr[i8] = byArr[i7];
                    Test.iFld <<= by;
                    d += i7;
                    Test.iFld += ((i8 * Test.iFld) + i5) - i8;
                    switch (((i8 % 2) * 5) + 84) {
                        case 88 :
                            d += Test.iFld;
                            i6 += (-10) + (i8 * i8);
                            i6 += ((i8 * i8) + Test.instanceCount) - i6;
                            switch ((i5 % 1) + 119) {
                                case 119 :
                                    dArr[i8] = 123.71312;
                            }
                            i6 = i7;
                            if (false)
                                break;

                            i6 += i8;
                            i6 += Test.iFld;
                            f1 -= -7;
                            i6 += i5;
                            d -= Test.iFld;
                            break;
                        case 90 :
                            Test.instanceCount &= i7;
                            Test.iFld -= i6;
                            Test.instanceCount <<= i8;
                            Test.iFld /= ((int) (((long) (f1)) | 1));
                            Test.instanceCount += ((i8 * i5) + i6) - i5;
                            break;
                    }
                } while ((++i8) < 1 );
            } while ((++i7) < 7 );
        }
        vMeth2_check_sum += (((((((((i5 + i6) + i7) + Float.floatToIntBits(f1)) + i8) + by) + Double.doubleToLongBits(d)) + FuzzerUtils.checkSum(iArr)) + FuzzerUtils.checkSum(lArr)) + FuzzerUtils.checkSum(byArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1(int i3, long l) {
        if (Test.ax$0) {
            long[] ax$1 = new long[]{ 9170846035411164281L, -954332051394273685L, 2238136097471672567L, -710885270665406106L, -4810774226672998688L };
            long[] ax$2 = new long[]{ -1L, 0L, 1L };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                for (int ax$3 = 0; ax$3 < 100; ax$3++) {
                    long ax$4 = 12345 * ax$2[ax$3];
                    ax$1[ax$3] -= ax$4;
                    ax$2[ax$3] = ax$4;
                }
            } catch (Throwable ax$5) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        float f = -111.62F;
        float fArr[][] = new float[N][N];
        int i4 = 8;
        int i9 = 4;
        int i10 = 5;
        int i11 = -42;
        boolean b = false;
        double d1 = -54.80148;
        double d2 = 1.129597;
        double dArr1[] = new double[N];
        short s = 12345;
        byte by1 = 75;
        long l1 = 38380L;
        long lArr1[] = new long[N];
        FuzzerUtils.init(fArr, -1.458F);
        FuzzerUtils.init(dArr1, -1.44408);
        FuzzerUtils.init(lArr1, 157L);
        f += Math.min(Math.min(i3, i3) + (i3 - i3), ((int) ((0.55472 - (f++)) - (i3++))));
        i4 = 135;
        while ((--i4) > 0) {
            vMeth2();
            l = i3;
            if (b)
                continue;

            for (i9 = i4; i9 < 4; ++i9) {
                for (d1 = 1; d1 < 1; d1++) {
                    s += ((short) (i11));
                    Test.iFld += ((int) (d1));
                    i11 = ((int) (l));
                    f -= i3;
                    s = ((short) (d1));
                    if (false) {
                        Test.iFld = ((int) (-6L));
                        l += ((long) (((long) (d1)) ^ i4));
                        i11 *= ((int) (Test.instanceCount));
                        fArr[i4 - 1][((int) (d1 - 1))] += Test.iFld;
                        i10 -= i9;
                        i10 >>= i3;
                        dArr1[((int) (d1 + 1))] += i11;
                        i11 = i3;
                    } else if (true) {
                        i10 += ((int) ((-5L) + (d1 * d1)));
                        i10 += ((int) (d1 * d1));
                        d2 *= -49909;
                        f += ((float) (((d1 * f) + by1) - s));
                        Test.iFld |= ((int) (-8L));
                        if (b)
                            continue;

                        i3 = i11;
                        f -= Test.instanceCount;
                        i11 = i3;
                        lArr1[i9] >>= -5852218286363498546L;
                        f = ((float) (d2));
                        i10 = ((int) (l));
                    } else {
                        Test.iFld += ((int) (d1 * d1));
                        i3 = i10;
                        Test.iArrFld[i9 + 1] += i9;
                        l1 ^= i3;
                    }
                }
            }
        }
        vMeth1_check_sum += ((((((((((((((i3 + l) + Float.floatToIntBits(f)) + i4) + (b ? 1 : 0)) + i9) + i10) + Double.doubleToLongBits(d1)) + i11) + s) + Double.doubleToLongBits(d2)) + by1) + l1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1))) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i, int i1, int i2) {
        long l2 = 581254746L;
        {
            try {
                Object[][] ax$7 = new Object[][]{ new Object[]{ new Object(), new Object() }, new Object[]{ new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object() } };
                Map<Object, Object> ax$8 = null;
                for (int ax$6 = -720; ax$6 < (-720 + 15213); ax$6 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$9 = 0; ax$9 < ax$7[0].length; ax$9++) {
                            ax$8.put(ax$7[0][ax$9], ax$7[1][ax$9]);
                        }
                    } catch (Throwable ax$10) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$0 = true;
                    vMeth1(-411045117, -6335752818039703392L);
                    Test.ax$0 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        try {
                            Runtime.getRuntime().exec("");
                        } catch (IllegalArgumentException ax$11) {
                        }
                        try {
                            Runtime.getRuntime().exec(new String());
                        } catch (IllegalArgumentException ax$12) {
                        }
                    } catch (Throwable ax$13) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
            }
        }
        vMeth1(i2, l2);
        i2 = Test.iFld;
        vMeth_check_sum += ((i + i1) + i2) + l2;
    }

    public void mainTest(String[] strArr1) {
        int i12 = 0;
        int i13 = -2;
        int i14 = -1500;
        int i15 = 185;
        int i16 = -187;
        int i17 = -69;
        int i18 = -61439;
        int i19 = 11;
        int i20 = -172;
        int i21 = 7;
        int i22 = 12088;
        int i23 = -53811;
        int i24 = 163;
        int i25 = 17162;
        float f2 = 6.258F;
        boolean b1 = false;
        boolean bArr[][] = new boolean[N][N];
        double d3 = -74.25656;
        short s1 = 18140;
        byte byArr1[] = new byte[N];
        long lArr2[] = new long[N];
        long lArr3[] = new long[N];
        FuzzerUtils.init(byArr1, ((byte) (-80)));
        FuzzerUtils.init(lArr2, -30296L);
        FuzzerUtils.init(lArr3, -4440645534653382943L);
        FuzzerUtils.init(bArr, false);
        vMeth(Test.iFld, Test.iFld, Test.iFld);
        for (i12 = 4; 83 > i12; i12++) {
            for (i14 = 64; i14 > 3; i14 -= 2) {
                switch ((i14 % 1) + 92) {
                    case 92 :
                        for (i16 = i12; i16 < 3; i16++) {
                            Test.iFld <<= i16;
                            i13 -= i17;
                            switch ((i12 % 1) + 49) {
                                case 49 :
                                    Test.instanceCount = Test.instanceCount;
                                    i17 += i17;
                                    break;
                            }
                            Test.iFld += i16 + f2;
                        }
                        Test.iArrFld[i14 - 1] -= ((int) (Test.instanceCount));
                        i15 -= i15;
                        for (i18 = 1; i18 < 3; ++i18) {
                            i19 = i16;
                        }
                        byArr1[i12] |= ((byte) (14));
                        for (i20 = 1; 3 > i20; ++i20) {
                            Test.iArrFld[i20] = i14;
                            i15 *= i14;
                            b1 = b1;
                        }
                        i17 |= 5;
                        for (i22 = 1; i22 < 3; i22++) {
                            lArr2[i22] -= Test.instanceCount;
                            Test.iFld = ((int) (Test.instanceCount));
                            switch (((i22 % 1) * 5) + 127) {
                                case 130 :
                                    Test.instanceCount -= -13;
                                    Test.iArrFld[i22 - 1] = -144;
                                    Test.iFld += ((int) (90L));
                                    if (b1)
                                        continue;

                                default :
                                    i21 *= ((int) (Test.instanceCount));
                                    Test.iArrFld[i12] = ((int) (Test.instanceCount));
                                    try {
                                        i13 = (-238) / Test.iArrFld[i14 - 1];
                                        Test.iArrFld[i14 + 1] = i20 / i22;
                                        i17 = i14 / i14;
                                    } catch (ArithmeticException a_e) {
                                    }
                                    Test.instanceCount <<= i16;
                                    i13 += i22;
                                    f2 -= 26103;
                                    lArr2[i12 - 1] = Test.instanceCount;
                                    i15 >>= i14;
                                    i23 += i22;
                                    lArr2[i22] += 50499;
                                    i21 *= i21;
                            }
                            lArr2[i12 - 1] <<= Test.iFld;
                            i15 <<= i18;
                            Test.iArrFld[i12 + 1] = ((int) (f2));
                            i23 -= -29746;
                            if (b1)
                                break;

                            if (b1)
                                break;

                        }
                        Test.iArrFld[(Test.iFld >>> 1) % N] = -7;
                        break;
                    default :
                        f2 += i14 + i23;
                }
                try {
                    Test.iFld = i13 / i15;
                    i17 = i20 % (-1727784772);
                    Test.iArrFld[i12 + 1] = Test.iArrFld[i12] % 45413;
                } catch (ArithmeticException a_e) {
                }
                i17 = i21;
                for (i24 = 1; i24 < 3; i24 += 2) {
                    i13 += ((int) (d3));
                    f2 += ((i24 * i22) + Test.instanceCount) - i21;
                    switch ((((i13 >>> 1) % 6) * 5) + 88) {
                        case 93 :
                            f2 = Test.iFld;
                            break;
                        case 107 :
                            Test.iArrFld[i12 - 1] = i20;
                            lArr2[i14] = i21;
                            lArr3[i24 - 1] -= -3493143644682417714L;
                            i19 |= i12;
                            try {
                                i25 = 49179 / i15;
                                i23 = i14 % Test.iArrFld[i14];
                                i21 = i13 / (-75);
                            } catch (ArithmeticException a_e) {
                            }
                            i13 = i12;
                            lArr3[i14 + 1] += Test.iFld;
                        case 116 :
                            Test.instanceCount <<= i25;
                            Test.iArrFld[i12 - 1] -= i14;
                            f2 = Test.instanceCount;
                            d3 -= i17;
                            lArr3 = lArr2;
                            i13 *= s1;
                            Test.instanceCount += i15;
                            bArr[i24 + 1][i12 - 1] = b1;
                            switch (((i24 % 1) * 5) + 96) {
                                case 101 :
                                    i13 = i23;
                                    i25 += i19;
                                    i15 += i24 * i24;
                                    Test.instanceCount += i24 * i21;
                                    break;
                            }
                        case 108 :
                            lArr3 = lArr2;
                            break;
                        case 90 :
                            i25 += i21;
                            break;
                        case 110 :
                            lArr3[i24 + 1] -= s1;
                            break;
                        default :
                            Test.instanceCount >>= i21;
                    }
                }
            }
        }
        FuzzerUtils.out.println((((("i12 i13 i14 = " + i12) + ",") + i13) + ",") + i14);
        FuzzerUtils.out.println((((("i15 i16 i17 = " + i15) + ",") + i16) + ",") + i17);
        FuzzerUtils.out.println((((("f2 i18 i19 = " + Float.floatToIntBits(f2)) + ",") + i18) + ",") + i19);
        FuzzerUtils.out.println((((("i20 i21 b1 = " + i20) + ",") + i21) + ",") + (b1 ? 1 : 0));
        FuzzerUtils.out.println((((("i22 i23 i24 = " + i22) + ",") + i23) + ",") + i24);
        FuzzerUtils.out.println((((("i25 d3 s1 = " + i25) + ",") + Double.doubleToLongBits(d3)) + ",") + s1);
        FuzzerUtils.out.println((((("byArr1 lArr2 lArr3 = " + FuzzerUtils.checkSum(byArr1)) + ",") + FuzzerUtils.checkSum(lArr2)) + ",") + FuzzerUtils.checkSum(lArr3));
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));
        FuzzerUtils.out.println((((("Test.instanceCount Test.iFld Test.iArrFld = " + Test.instanceCount) + ",") + Test.iFld) + ",") + FuzzerUtils.checkSum(Test.iArrFld));
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

    static Boolean ax$0 = false;

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
}