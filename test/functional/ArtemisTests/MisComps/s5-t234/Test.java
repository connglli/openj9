// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 170L;

    public float fFld = 1.246F;

    public static int iFld = -8278;

    public static boolean bFld = true;

    public static byte byFld = -70;

    public volatile int iArrFld[] = new int[N];

    public static volatile int iArrFld1[] = new int[N];

    public volatile short sArrFld[] = new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -195);
    }

    public static long iMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l, long l1, int i7) {
        int i8 = 0;
        int i9 = 8;
        int i10 = 12;
        int i11 = 34897;
        int i12 = -4;
        int i13 = -45440;
        int i14 = 1;
        int i15 = 63974;
        int iArr1[] = new int[N];
        double d = 0.37157;
        double dArr[] = new double[N];
        float f = 0.71F;
        float fArr1[] = new float[N];
        short s = -3121;
        short sArr[] = new short[N];
        byte by = 30;
        long lArr[] = new long[N];
        FuzzerUtils.init(dArr, 55.86206);
        FuzzerUtils.init(lArr, 65509L);
        FuzzerUtils.init(iArr1, 171);
        FuzzerUtils.init(fArr1, -39.198F);
        FuzzerUtils.init(sArr, ((short) (-19839)));
        for (i8 = 4; 166 > i8; i8++) {
            switch ((((-10) >>> 1) % 10) + 54) {
                case 54 :
                    dArr = dArr;
                    i9 += i8 ^ i8;
                    i10 = 4;
                    do {
                        for (i11 = 1; i11 < 1; ++i11) {
                            if (Test.bFld) {
                                i7 -= ((int) (Test.instanceCount));
                            } else if (Test.bFld) {
                                Test.instanceCount = i7;
                                d = f;
                                i12 += (-18483) + (i11 * i11);
                                Test.iFld = i10;
                                Test.iFld += i10;
                                i12 += i11 * i11;
                                d += s;
                                i9 &= i8;
                                lArr[i10 - 1] -= l1;
                                Test.iFld = 9;
                                Test.iFld = i8;
                                i9 <<= by;
                            } else if (Test.bFld) {
                                iArr1[i10 - 1] = ((int) (Test.instanceCount));
                                lArr[i8 + 1] += by;
                            }
                            l >>= i10;
                            i9 += ((int) (f));
                            fArr1[i11] = i9;
                            i7 -= ((int) (f));
                            by = by;
                            i12 = ((int) (f));
                            sArr[i10] = ((short) (i10));
                            iArr1[i11] <<= i9;
                            if (Test.bFld)
                                break;

                        }
                        for (i13 = 1; i13 < 1; ++i13) {
                            if (Test.bFld) {
                                i9 += ((i13 * l1) + i15) - i15;
                                l1 += i8;
                                f -= i13;
                                i15 += i13;
                            }
                        }
                    } while ((--i10) > 0 );
                    break;
                case 55 :
                    iArr1[i8] = ((int) (d));
                    break;
                case 56 :
                    i15 >>= i8;
                case 57 :
                    s *= ((short) (i11));
                    break;
                case 58 :
                    i14 *= i10;
                case 59 :
                    i15 = i15;
                    break;
                case 60 :
                    l1 += s;
                case 61 :
                    f -= s;
                case 62 :
                    sArr[i8 + 1] -= ((short) (Test.instanceCount));
                case 63 :
                    iArr1[i8 - 1] = ((int) (l1));
            }
        }
        long meth_res = ((((((((((((((((((l + l1) + i7) + i8) + i9) + i10) + i11) + i12) + Double.doubleToLongBits(d)) + Float.floatToIntBits(f)) + s) + by) + i13) + i14) + i15) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))) + FuzzerUtils.checkSum(lArr)) + FuzzerUtils.checkSum(iArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1))) + FuzzerUtils.checkSum(sArr);
        iMeth1_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth() {
        int i4 = 93;
        int i5 = -36807;
        int i16 = -39136;
        int i17 = 159;
        int i18 = -46267;
        int i19 = -14128;
        int i20 = -13;
        int i21 = -9;
        int i22 = 10;
        int i23 = 231;
        int i24 = 10;
        int i25 = -7424;
        int iArr[] = new int[N];
        float f1 = -70.62F;
        float f2 = -2.459F;
        long lArr1[] = new long[N];
        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(lArr1, 520420566493110032L);
        for (i4 = 1; i4 < 151; i4++) {
            int i6 = 8;
            i5 = i6--;
            iArr[i4] = iMeth1(175L, Test.instanceCount, i5);
        }
        Test.iFld = ((int) (Test.instanceCount));
        for (i16 = 3; 223 > i16; i16++) {
            double d1 = 45.1064;
            i17 -= -31434;
            for (f1 = 1; 3 > f1; f1++) {
                i5 = Test.iFld;
            }
            Test.instanceCount >>= -61771;
            Test.iFld -= ((int) (d1));
            for (i19 = 1; 3 > i19; i19++) {
                if (Test.bFld) {
                    i21 -= i5;
                    f2 = -743961170493337618L;
                    i20 = ((int) (Test.instanceCount));
                    switch ((((-238) >>> 1) % 7) + 22) {
                        case 22 :
                            switch ((((i20 >>> 1) % 1) * 5) + 66) {
                                case 70 :
                                    iArr[i16] = -65261;
                                    Test.instanceCount += i19 * i19;
                                    lArr1[i16] += Test.instanceCount;
                                    for (i22 = 1; 2 > i22; i22 += 3) {
                                        i23 >>= Test.iFld;
                                    }
                                    break;
                                default :
                                    for (i24 = i19; i24 < 2; i24 += 2) {
                                        f2 = i24;
                                        i20 = i22;
                                        i17 *= ((int) (Test.instanceCount));
                                        i25 = ((int) (20126L));
                                        i21 *= i20;
                                        Test.instanceCount -= i20;
                                        Test.bFld = false;
                                        i23 += i24;
                                        i25 += ((i24 * i20) + f1) - i25;
                                        Test.byFld -= ((byte) (f2));
                                        Test.byFld += ((byte) (i24 * i24));
                                    }
                                    d1 %= i17 | 1;
                                    Test.bFld = Test.bFld;
                            }
                            if (Test.bFld)
                                continue;

                            break;
                        case 23 :
                            i17 = ((int) (-32.49183));
                            break;
                        case 24 :
                            try {
                                i18 = iArr[i19] % i22;
                                i17 = i24 % (-26684);
                                Test.iFld = (-6034) % i23;
                            } catch (ArithmeticException a_e) {
                            }
                            break;
                        case 25 :
                            f2 += (-20439L) + (i19 * i19);
                        case 26 :
                            Test.instanceCount >>= i4;
                            break;
                        case 27 :
                            iArr = iArr;
                        case 28 :
                            i23 = ((int) (-22670L));
                            break;
                        default :
                            Test.instanceCount *= 14;
                    }
                } else {
                    i17 -= i18;
                }
            }
        }
        vMeth_check_sum += ((((((((((((((i4 + i5) + i16) + i17) + Float.floatToIntBits(f1)) + i18) + i19) + i20) + i21) + Float.floatToIntBits(f2)) + i22) + i23) + i24) + i25) + FuzzerUtils.checkSum(iArr)) + FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth(int i2, int i3) {
        int i26 = 128;
        int i27 = -14;
        int i28 = 15597;
        int i29 = -45416;
        int i30 = 64;
        int i31 = -53766;
        double d2 = 2.102008;
        long l2 = -203563527L;
        float f4 = -121.535F;
        float fArr2[] = new float[N];
        FuzzerUtils.init(fArr2, 2.909F);
        vMeth();
        i26 = 232;
        do {
            for (i27 = 1; i27 < 5; i27 += 2) {
                i29 = 1;
                do {
                    float f3 = -57.824F;
                    Test.iArrFld1[i29 - 1] += ((int) (d2));
                    i2 += ((i29 * i3) + i29) - i2;
                    Test.instanceCount += ((long) (f3));
                    Test.instanceCount += i29 * i29;
                    i28 += i29;
                    Test.iFld += i29;
                    l2 += Test.iFld;
                    i2 &= i29;
                    Test.instanceCount *= i29;
                    i2 += ((i29 * i28) + l2) - i28;
                    i3 += i3;
                    l2 += i29;
                    i28 = ((int) (2.675F));
                } while ((++i29) < 3 );
                Test.iArrFld1[i26 + 1] = i27;
                i2 *= ((int) (f4));
                d2 = f4;
                Test.iArrFld1[i26] = i2;
                for (i30 = 1; i30 < 3; i30++) {
                    i31 += i30 * i26;
                    f4 += l2;
                    i2 <<= i30;
                    i28 -= -12;
                    Test.iArrFld1[i30 + 1] = ((int) (f4));
                    i31 >>= i26;
                    i28 += i3;
                    Test.iFld -= ((int) (f4));
                    fArr2[i27 - 1] = i27;
                    i31 -= ((int) (f4));
                    switch ((i27 % 2) + 46) {
                        case 46 :
                            i3 += i30 * i30;
                            d2 = l2;
                            Test.instanceCount = i28;
                            if (Test.bFld)
                                continue;

                            break;
                        case 47 :
                            Test.iArrFld1 = Test.iArrFld1;
                            break;
                        default :
                            {
                                final int ax$10 = i31;
                                final int ax$11 = i2;
                                try {
                                    AtomicIntegerArray ax$5 = null;
                                    AtomicIntegerArray ax$6 = null;
                                    boolean ax$1 = false;
                                    for (int ax$0 = -811; ax$0 < (-811 + 9731); ax$0 += 1) {
                                        Test.AxOutputRedirectionHelper.redirect();
                                        try {
                                            i31 += 2;
                                        } catch (Throwable ax$3) {
                                        } finally {
                                        }
                                        Test.AxOutputRedirectionHelper.recover();
                                        if (!ax$1) {
                                            Test.iFld = ((int) (Test.instanceCount));
                                            ax$1 = true;
                                        }
                                        Test.AxOutputRedirectionHelper.redirect();
                                        try {
                                            for (int ax$8 = 0; (ax$8 * i2) < i31; ax$8 += 1) {
                                                ax$5.compareAndSet(ax$8 * i2, 123, -123);
                                                ax$6.compareAndSet(ax$8 * i2, 123, -103);
                                            }
                                        } catch (Throwable ax$9) {
                                        } finally {
                                        }
                                        Test.AxOutputRedirectionHelper.recover();
                                    }
                                } finally {
                                    i31 = ax$10;
                                    i2 = ax$11;
                                }
                            }
                    }
                }
            }
        } while ((i26 -= 2) > 0 );
        long meth_res = ((((((((((i2 + i3) + i26) + i27) + i28) + i29) + Double.doubleToLongBits(d2)) + l2) + Float.floatToIntBits(f4)) + i30) + i31) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2));
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        if (Test.ax$21) {
            final int ax$25 = Test.iFld;
            int[] ax$22 = new int[]{ 2071522446, 584519390, -2043827700, 1990845836, 346315152, 1159937263, 1174203991 };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                ax$22[iFld] = iFld;
            } catch (Throwable ax$24) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            Test.iFld = ax$25;
            return;
        }
        int i = 13;
        int i1 = 3412;
        int i33 = 10;
        int i34 = 137;
        int i35 = -211;
        int i36 = -40;
        int i37 = 34296;
        int iArr2[] = new int[N];
        int iArr3[] = new int[N];
        long l3 = 12341L;
        long lArr2[] = new long[N];
        short s1 = 25759;
        float fArr[] = new float[N];
        double dArr1[] = new double[N];
        FuzzerUtils.init(fArr, -2.435F);
        FuzzerUtils.init(dArr1, 0.5659);
        FuzzerUtils.init(lArr2, -3L);
        FuzzerUtils.init(iArr2, 0);
        FuzzerUtils.init(iArr3, 17169);
        i = 1;
        while ((++i) < 123) {
            try {
                i1 = i / 1810090799;
                i1 = iArrFld[i] % 16587;
                i1 = (-1256860629) % i;
            } catch (ArithmeticException a_e) {
            }
            i1 += (-205) + (i * i);
        } 
        fArr[(i1 >>> 1) % N] += fFld = iMeth(i, i);
        i1 = i;
        fArr[(i >>> 1) % N] *= 7063;
        Test.byFld += ((byte) (i1));
        for (int i32 : Test.iArrFld1) {
            for (i33 = 1; i33 < 20; i33++) {
                i32 &= ((int) (Test.instanceCount));
                dArr1[i33 - 1] *= 2.233F;
                i35 = 1;
                do {
                    double d3 = -72.12834;
                    l3 = Test.iFld;
                    if (Test.bFld) {
                        lArr2[i33] = i35;
                        i34 >>>= i;
                        l3 = Test.byFld;
                        dArr1[i33] /= i35 | 1;
                        Test.instanceCount = Test.instanceCount;
                        d3 = i35;
                    } else if (Test.bFld) {
                        Test.byFld += ((byte) (5289211359582056992L));
                        iArr2[i33 + 1] += i34;
                        fFld = i1;
                        try {
                            i32 = i32 % i32;
                            Test.iArrFld1[i35 + 1] = i35 / (-73);
                            iArrFld[i35] = Test.iFld / iArrFld[i35];
                        } catch (ArithmeticException a_e) {
                        }
                        i34 *= ((int) (122.1329));
                        try {
                            i36 = i / i;
                            i36 = 242 % i34;
                            Test.iFld = 80 % Test.iFld;
                        } catch (ArithmeticException a_e) {
                        }
                        d3 += i34;
                    } else {
                        i36 = Test.byFld;
                        iArrFld[i33 + 1] = i1;
                        i34 += Test.iFld;
                        i34 -= -59662;
                        fFld = 41119;
                        Test.iFld = ((int) (l3));
                        i1 ^= ((int) (l3));
                        i36 = Test.iFld;
                        s1 += ((short) (((i35 * i1) + Test.instanceCount) - l3));
                        i36 = ((int) (d3));
                        i32 = -244;
                        dArr1[i33 - 1] *= fFld;
                        Test.bFld = Test.bFld;
                        switch ((((-7) >>> 1) % 7) + 1) {
                            case 1 :
                                Test.iFld += i35;
                                i36 >>= i;
                                Test.iFld *= i35;
                                Test.instanceCount >>>= i32;
                                i34 += ((i35 * fFld) + Test.iFld) - l3;
                                Test.iArrFld1[i33 - 1] = i33;
                                Test.instanceCount += i35 ^ i35;
                                lArr2 = lArr2;
                                iArr3[i33 + 1] = ((int) (0L));
                                l3 ^= i32;
                                if (Test.bFld)
                                    break;

                                i37 += ((int) (-121.783F));
                                if (false)
                                    break;

                                sArrFld[i33 - 1] %= ((short) (i35 | 1));
                                fFld += i35 * i35;
                                break;
                            case 2 :
                                i37 = ((int) (Test.instanceCount));
                                fFld = Test.iFld;
                                i37 -= i33;
                                i34 <<= Test.iFld;
                                i36 += ((int) (Test.instanceCount));
                                dArr1[i33 - 1] += Test.instanceCount;
                                fFld -= ((float) (-2.52822));
                                Test.iFld += i35 + i;
                                i32 = s1;
                                switch ((i35 % 6) + 121) {
                                    case 121 :
                                        Test.iFld += ((int) (fFld));
                                        Test.instanceCount += i35;
                                        i34 = ((int) (Test.instanceCount));
                                        if (false) {
                                            i34 = Test.iFld;
                                        } else if (Test.bFld) {
                                            i37 = i36;
                                            fFld = i36;
                                            try {
                                                i32 = iArr2[i35] % 1680;
                                                iArrFld[i33 + 1] = 986727885 % i32;
                                                i36 = i36 % i36;
                                            } catch (ArithmeticException a_e) {
                                            }
                                            l3 >>>= Test.byFld;
                                        } else {
                                            d3 += s1;
                                        }
                                        break;
                                    case 122 :
                                        if (Test.bFld)
                                            continue;

                                        break;
                                    case 123 :
                                        i32 >>= i1;
                                        break;
                                    case 124 :
                                        i36 = ((int) (l3));
                                        break;
                                    case 125 :
                                        i34 += i34;
                                        break;
                                    case 126 :
                                        try {
                                            i32 = i34 % i36;
                                            i36 = (-1275) % i34;
                                            iArr2[i33 - 1] = i35 % 395461660;
                                        } catch (ArithmeticException a_e) {
                                        }
                                        break;
                                }
                                break;
                            case 3 :
                                Test.instanceCount >>= i1;
                                break;
                            case 4 :
                                i34 += i35 - Test.instanceCount;
                                break;
                            case 5 :
                                i32 += 20014;
                            case 6 :
                                i37 = i36;
                            case 7 :
                                if (Test.bFld)
                                    break;

                                break;
                        }
                    }
                } while ((++i35) < 2 );
            }
        }
        FuzzerUtils.out.println((((("i i1 i33 = " + i) + ",") + i1) + ",") + i33);
        FuzzerUtils.out.println((((("i34 i35 l3 = " + i34) + ",") + i35) + ",") + l3);
        FuzzerUtils.out.println((((("i36 s1 i37 = " + i36) + ",") + s1) + ",") + i37);
        FuzzerUtils.out.println((((("fArr dArr1 lArr2 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1))) + ",") + FuzzerUtils.checkSum(lArr2));
        FuzzerUtils.out.println((("iArr2 iArr3 = " + FuzzerUtils.checkSum(iArr2)) + ",") + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println((((("Test.instanceCount fFld Test.iFld = " + Test.instanceCount) + ",") + Float.floatToIntBits(fFld)) + ",") + Test.iFld);
        FuzzerUtils.out.println((((("Test.bFld Test.byFld iArrFld = " + (Test.bFld ? 1 : 0)) + ",") + Test.byFld) + ",") + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println((("Test.iArrFld1 sArrFld = " + FuzzerUtils.checkSum(Test.iArrFld1)) + ",") + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }

    public static void main(String[] strArr) {
        {
            final int ax$20 = Test.iFld;
            try {
                int[] ax$13 = new int[]{ 3, 9, 13 };
                for (int ax$12 = -109; ax$12 < (-109 + 15641); ax$12 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$15 = 0; ax$15 < 100; ax$15++) {
                            for (int ax$16 = ax$15; ax$16 < 100; ax$16++) {
                                int ax$17 = 0;
                                for (long ax$18 = 0; ax$18 < 100; ax$18++) {
                                    ax$17 += ax$18;
                                }
                                if (ax$13 != null) {
                                    ax$17 = ax$13[ax$16];
                                }
                                iFld += ax$17;
                            }
                        }
                    } catch (Throwable ax$19) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                Test.iFld = ax$20;
            }
        }
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                {
                    final int ax$34 = i;
                    try {
                        Byte ax$27 = -5;
                        int[] ax$30 = new int[]{ 7 };
                        int[] ax$32 = new int[]{ 25328832, 2107121613, -1939856321 };
                        for (int ax$26 = -170; ax$26 < (-170 + 5253); ax$26 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$28 = 0; ax$28 < 1000; ax$28++) {
                                    if ((ax$28 & 1) == 0) {
                                        ax$27 = ((byte) (ax$27 + 1));
                                    }
                                }
                            } catch (Throwable ax$29) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            Test.ax$21 = true;
                            _instance.mainTest(new String[]{ "s", "s", "s" });
                            Test.ax$21 = false;
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                ax$30[i] = ax$32[20] - 7;
                                i++;
                                ax$30[i] = ax$32[20] - 7;
                            } catch (Throwable ax$33) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        i = ax$34;
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

    static Boolean ax$21 = false;
}
