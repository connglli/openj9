// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashSet;

public class Test {
    public static final int N = 256;

    public static long instanceCount = -9192735533632671660L;

    public static volatile short sFld = 13394;

    public static byte byFld = -26;

    public float fFld = 26.14F;

    public static double dFld = -2.6444;

    public int iFld = 59254;

    public static int iFld1 = 14882;

    public float fFld1 = 0.471F;

    public static int iArrFld[][] = new int[N][N];

    public static volatile float fArrFld[] = new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -49024);
        FuzzerUtils.init(Test.fArrFld, -113.73F);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1, int i4) {
        boolean b1 = false;
        double d1 = 0.59967;
        double d2 = -121.16202;
        double dArr[] = new double[N];
        int i5 = 171;
        int i6 = 5;
        int i7 = 234;
        int i8 = -14;
        int i9 = 11;
        int i10 = -139;
        float f = -95.731F;
        short s1 = -22606;
        byte byArr[] = new byte[N];
        long lArr[] = new long[N];
        FuzzerUtils.init(byArr, ((byte) (-125)));
        FuzzerUtils.init(dArr, 32.52861);
        FuzzerUtils.init(lArr, -3855948159L);
        b1 = true;
        d1 = 1;
        while ((++d1) < 182) {
            Test.iArrFld[((int) (d1 + 1))][((int) (d1 - 1))] -= i4;
            i4 = i4;
            byArr[((int) (d1))] = ((byte) (i4));
            i4 -= 40717;
            i4 = ((int) (d1));
            for (i5 = 1; i5 < 3; ++i5) {
                i6 += i5 * i5;
                for (i7 = i5; 2 > i7; i7++) {
                    short s = 12648;
                    i9 += ((i7 * i4) + f) - i5;
                    d2 = -45356;
                    i4 -= ((int) (Test.instanceCount));
                    i8 = i8;
                    dArr[((int) (d1 + 1))] += Test.instanceCount;
                    s = ((short) (-14268));
                    i4 = i7;
                    i6 += i7 * i7;
                    i8 += 14 + (i7 * i7);
                    i6 -= ((int) (Test.instanceCount));
                }
                Test.instanceCount = i4;
                i4 = 7;
                i8 += i5;
                i10 = 1;
                do {
                    i8 >>= i10;
                    d2 *= 55217L;
                    d2 *= s1;
                    switch (((int) ((d1 % 1) + 101))) {
                        case 101 :
                            d2 = i5;
                            d2 = 9813;
                            i8 >>>= ((int) (l1));
                            lArr = lArr;
                            i4 += i10 | i4;
                            Test.iArrFld[i10][i5 + 1] = i5;
                            i6 = ((int) (Test.instanceCount));
                            Test.fArrFld[i10] = i8;
                            i6 = s1;
                            break;
                    }
                } while ((++i10) < 2 );
            }
        } 
        vMeth2_check_sum += ((((((((((((((l1 + i4) + (b1 ? 1 : 0)) + Double.doubleToLongBits(d1)) + i5) + i6) + i7) + i8) + i9) + Float.floatToIntBits(f)) + Double.doubleToLongBits(d2)) + i10) + s1) + FuzzerUtils.checkSum(byArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i3) {
        int i11 = -31517;
        int i12 = -22621;
        int i13 = 60678;
        int i14 = 85;
        int i15 = 51662;
        int i16 = -2;
        int i17 = 6;
        int i18 = 153;
        byte by = 65;
        short s2 = 4772;
        float f1 = -2.23F;
        boolean b2 = true;
        long lArr1[][] = new long[N][N];
        FuzzerUtils.init(lArr1, 40512L);
        vMeth2(Test.instanceCount, 12);
        for (i11 = 5; i11 < 137; ++i11) {
            Test.instanceCount = Test.instanceCount;
            for (i13 = i11; i13 < 4; ++i13) {
                i14 = by;
            }
            for (i15 = 1; i15 < 4; ++i15) {
                double d3 = 23.110467;
                d3 = i13;
                s2 = ((short) (i16));
                for (i17 = 1; i17 < 2; i17++) {
                    if (b2) {
                        if (true) {
                            i18 -= i14;
                        } else {
                            Test.instanceCount = i13;
                            Test.iArrFld[i15] = Test.iArrFld[i17 - 1];
                            switch ((((i16 >>> 1) % 3) * 5) + 110) {
                                case 120 :
                                    i12 += i17 ^ i18;
                                    i14 = ((int) (Test.instanceCount));
                                    Test.instanceCount += i17;
                                    d3 -= 15017;
                                    i12 += ((int) (Test.instanceCount));
                                    i14 = ((int) (Test.instanceCount));
                                    switch (((i15 % 9) * 5) + 118) {
                                        case 131 :
                                            lArr1[i11 + 1][i15] -= Test.instanceCount;
                                            i14 = -10;
                                            i18 &= i14;
                                            if (b2) {
                                                s2 += ((short) (i17 - i15));
                                                Test.instanceCount += i17;
                                                Test.iArrFld[i11 - 1][i15] = s2;
                                                d3 = i3;
                                                Test.instanceCount = i15;
                                                i18 += i13;
                                            } else if (true) {
                                                i16 += i17;
                                                f1 -= ((float) (d3));
                                                vMeth1_check_sum += ((((((((((((i3 + i11) + i12) + i13) + i14) + by) + i15) + i16) + s2) + i17) + i18) + Float.floatToIntBits(f1)) + (b2 ? 1 : 0)) + FuzzerUtils.checkSum(lArr1);
                                                return;
                                            } else if (b2) {
                                                Test.instanceCount -= ((long) (f1));
                                                i16 += i17 * i17;
                                                i18 += i17 - i13;
                                            }
                                            break;
                                        case 122 :
                                            i18 += ((i17 * i17) + i17) - Test.instanceCount;
                                            break;
                                        case 133 :
                                            Test.instanceCount += i17 ^ i16;
                                            break;
                                        case 152 :
                                            if (i11 != 0) {
                                                vMeth1_check_sum += ((((((((((((i3 + i11) + i12) + i13) + i14) + by) + i15) + i16) + s2) + i17) + i18) + Float.floatToIntBits(f1)) + (b2 ? 1 : 0)) + FuzzerUtils.checkSum(lArr1);
                                                return;
                                            }
                                            break;
                                        case 149 :
                                            s2 += ((short) (11631 + (i17 * i17)));
                                        case 120 :
                                            i16 -= i16;
                                            break;
                                        case 136 :
                                            i18 += i12;
                                            break;
                                        case 141 :
                                            Test.iArrFld[i11] = FuzzerUtils.int1array(N, ((int) (3)));
                                            break;
                                        case 145 :
                                            f1 *= i12;
                                            break;
                                        default :
                                            f1 += ((i17 * i17) + Test.instanceCount) - i14;
                                    }
                                    break;
                                case 121 :
                                    f1 = i12;
                                case 124 :
                                    i14 = ((int) (f1));
                                    break;
                            }
                        }
                    }
                }
            }
        }
        vMeth1_check_sum += ((((((((((((i3 + i11) + i12) + i13) + i14) + by) + i15) + i16) + s2) + i17) + i18) + Float.floatToIntBits(f1)) + (b2 ? 1 : 0)) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(long l, int i, boolean b) {
        int i1 = 3;
        int i2 = -50147;
        int i19 = 41262;
        int i20 = -8;
        int i21 = -135;
        int i22 = -7;
        int i23 = -63862;
        int i24 = 182;
        int iArr[][] = new int[N][N];
        float f2 = 1.462F;
        float f3 = 12.522F;
        double d4 = -24.48998;
        double d5 = 103.23808;
        long lArr2[] = new long[N];
        byte byArr1[] = new byte[N];
        FuzzerUtils.init(lArr2, -5L);
        FuzzerUtils.init(byArr1, ((byte) (-50)));
        FuzzerUtils.init(iArr, -76);
        if (false) {
            switch ((((i >>> 1) % 1) * 5) + 24) {
                case 27 :
                    for (i1 = 7; i1 < 205; i1++) {
                        if (b) {
                            vMeth1(i2);
                            i19 = 1;
                            do {
                                i2 = i1;
                            } while ((++i19) < 3 );
                            l *= Test.instanceCount;
                            i20 = 1;
                            do {
                                lArr2[i1] = i19;
                                i2 &= i;
                                i += i20;
                                i = ((int) (f2));
                                byArr1[i1 + 1] >>= ((byte) (Test.sFld));
                                iArr[i20 + 1][i20] = ((int) (l));
                                for (f3 = i20; f3 < 1; f3++) {
                                    i21 += ((int) (((long) (f3)) ^ Test.instanceCount));
                                    d4 = 2.367F;
                                }
                                i2 += i20;
                            } while ((++i20) < 3 );
                            for (d5 = i1; d5 < 3; ++d5) {
                                i2 >>= i21;
                                switch (((i >>> 1) % 6) + 39) {
                                    case 39 :
                                        i22 ^= -11;
                                        for (i23 = 1; i23 < 1; ++i23) {
                                            l -= -8181694078634632606L;
                                            i22 += i23;
                                            switch ((((i20 >>> 1) % 2) * 5) + 85) {
                                                case 92 :
                                                    switch ((i1 % 1) + 61) {
                                                        case 61 :
                                                            f2 = i1;
                                                            Test.iArrFld[i23 - 1][i1 + 1] -= ((int) (f3));
                                                            i21 += i23;
                                                            i22 -= i1;
                                                            i21 += i22;
                                                            if (b) {
                                                                i24 += i2;
                                                                i24 = i1;
                                                                if (b)
                                                                    continue;

                                                            } else if (b) {
                                                                i22 += ((int) (57.483F + (i23 * i23)));
                                                            }
                                                    }
                                                case 88 :
                                                    i24 += i24;
                                            }
                                        }
                                        break;
                                    case 40 :
                                    case 41 :
                                        d4 = 4222;
                                        break;
                                    case 42 :
                                        i24 *= Test.sFld;
                                    case 43 :
                                    case 44 :
                                        i *= i23;
                                        break;
                                }
                            }
                        } else if (b) {
                            iArr[i1 + 1] = iArr[i1];
                        }
                    }
                    break;
                default :
                    b = b;
            }
        } else {
            iArr[(i >>> 1) % N][(i24 >>> 1) % N] += Test.byFld;
        }
        vMeth_check_sum += ((((((((((((((((l + i) + (b ? 1 : 0)) + i1) + i2) + i19) + i20) + Float.floatToIntBits(f2)) + Float.floatToIntBits(f3)) + i21) + Double.doubleToLongBits(d4)) + Double.doubleToLongBits(d5)) + i22) + i23) + i24) + FuzzerUtils.checkSum(lArr2)) + FuzzerUtils.checkSum(byArr1)) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {
        double d = 21.12186;
        double d6 = -125.38599;
        double dArr1[] = new double[N];
        int i25 = -4;
        int i26 = -5575;
        int i27 = 212;
        int i28 = 21339;
        int i29 = 35040;
        int i30 = -2;
        int i31 = -8;
        int i32 = 189;
        boolean b3 = false;
        boolean bArr[] = new boolean[N];
        float f4 = 30.42F;
        long lArr3[] = new long[N];
        FuzzerUtils.init(lArr3, 9L);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(dArr1, -2.55654);
        d = 1;
        do {
            vMeth(Test.instanceCount, i25, b3);
            Test.instanceCount += i25;
            i25 = 0;
            i25 += ((int) (d + i25));
            for (i26 = 2; i26 < 52; i26++) {
                i25 += i26;
                for (d6 = 1; d6 < 2; d6++) {
                    lArr3[((int) (d6))] <<= i27;
                    Test.instanceCount >>>= -18413L;
                    i27 += (-35) + (d6 * d6);
                    switch ((((-14) >>> 1) % 1) + 48) {
                        case 48 :
                            i27 *= ((int) (fFld));
                            i27 -= i27;
                            Test.instanceCount -= Test.byFld;
                            if (b3)
                                continue;

                            Test.iArrFld[i26 + 1][i26 + 1] = 32;
                            Test.byFld |= ((byte) (Test.instanceCount));
                            i28 = i27;
                            Test.dFld = -10535;
                            break;
                    }
                    Test.instanceCount = -220;
                }
                i29 -= ((int) (Test.instanceCount));
            }
            switch (((int) (((d % 8) * 5) + 121))) {
                case 146 :
                    bArr[((int) (d - 1))] = true;
                    fFld += ((float) (((d * i29) + Test.instanceCount) - Test.byFld));
                    for (i30 = 1; i30 < 52; ++i30) {
                        i28 *= i30;
                        Test.instanceCount += ((i30 * i28) + i28) - Test.byFld;
                        i32 = 1;
                        do {
                            switch (((int) ((d % 9) + 96))) {
                                case 96 :
                                    Test.dFld = -14926;
                                    Test.iArrFld[i32 - 1][i30 + 1] += Test.sFld;
                                    try {
                                        i29 = i26 / 1637420637;
                                        iFld = iFld / (-86);
                                        i29 = Test.iArrFld[i30 + 1][((int) (d))] / (-9);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    i28 <<= i31;
                                    i27 <<= 6088;
                                    Test.instanceCount = i32;
                                    if (b3)
                                        continue;

                                    Test.instanceCount += Test.instanceCount;
                                    iFld = -5;
                                    fFld += ((float) (Test.dFld));
                                    Test.sFld -= ((short) (4167));
                                    Test.fArrFld[i32] = fFld;
                                    i25 *= ((int) (Test.instanceCount));
                                    bArr[i32 - 1] = b3;
                                    b3 = b3;
                                case 97 :
                                    fFld -= f4;
                                    i27 /= ((int) (5612624143267175968L));
                                    i28 = i27;
                                    break;
                                case 98 :
                                    {
                                        final int ax$10 = i30;
                                        final float ax$11 = f4;
                                        try {
                                            float[] ax$2 = new float[]{ 0.18044889F };
                                            float[] ax$5 = new float[16];
                                            HashSet<Integer> ax$7 = new HashSet<Integer>();
                                            boolean ax$1 = false;
                                            for (int ax$0 = -680; ax$0 < (-680 + 7121); ax$0 += 1) {
                                                Test.AxOutputRedirectionHelper.redirect();
                                                try {
                                                    ax$5[i30] += ax$2[i30] + f4;
                                                } catch (Throwable ax$6) {
                                                } finally {
                                                }
                                                Test.AxOutputRedirectionHelper.recover();
                                                if (!ax$1) {
                                                    iFld += ((int) (Test.instanceCount));
                                                    ax$1 = true;
                                                }
                                                Test.AxOutputRedirectionHelper.redirect();
                                                try {
                                                    for (Object ax$8 : ax$7) {
                                                    }
                                                } catch (Throwable ax$9) {
                                                } finally {
                                                }
                                                Test.AxOutputRedirectionHelper.recover();
                                            }
                                        } finally {
                                            i30 = ax$10;
                                            f4 = ax$11;
                                        }
                                    }
                                    switch ((i30 % 1) + 51) {
                                        case 51 :
                                            dArr1[((int) (d - 1))] *= i30;
                                            Test.sFld += ((short) (((i32 * iFld) + i30) - i29));
                                            Test.instanceCount -= i25;
                                            Test.iArrFld = Test.iArrFld;
                                            i31 += i32;
                                            lArr3[((int) (d - 1))] += Test.instanceCount;
                                            b3 = b3;
                                            iFld = Test.iFld1;
                                            if (false)
                                                continue;

                                            b3 = b3;
                                            iFld = 2;
                                            Test.instanceCount >>>= i32;
                                            Test.iFld1 = ((int) (d));
                                            break;
                                        default :
                                            i27 += i32;
                                            if (b3) {
                                                Test.instanceCount = iFld;
                                                if (false)
                                                    break;

                                                i31 += -26509;
                                            } else {
                                                Test.iFld1 *= i27;
                                                b3 = b3;
                                                Test.byFld = ((byte) (Test.dFld));
                                                Test.iArrFld[((int) (d - 1))][i32] -= Test.iFld1;
                                                Test.instanceCount = Test.byFld;
                                                Test.byFld += ((byte) (((i32 * i26) + fFld) - fFld));
                                                Test.sFld = ((short) (i27));
                                            }
                                    }
                                    break;
                                case 99 :
                                    i25 += ((i32 * Test.sFld) + i26) - f4;
                                    break;
                                case 100 :
                                    i29 += i28;
                                    break;
                                case 101 :
                                    Test.instanceCount += i32;
                                    break;
                                case 102 :
                                    Test.instanceCount /= ((long) (fFld)) | 1;
                                    break;
                                case 103 :
                                    i25 -= Test.byFld;
                                    break;
                                case 104 :
                                    Test.instanceCount = ((long) (fFld1));
                                default :
                                    Test.iFld1 /= ((int) (-1.35382));
                            }
                        } while ((++i32) < 2 );
                    }
                    break;
                case 159 :
                    Test.instanceCount += ((long) (((d * fFld) + i32) - Test.instanceCount));
                case 138 :
                    i27 += i30;
                    break;
                case 161 :
                    Test.dFld *= i31;
                    break;
                case 158 :
                    i25 ^= ((int) (-2559473314L));
                    break;
                case 134 :
                    Test.instanceCount += -33638;
                    break;
                case 149 :
                    i29 *= i32;
                case 141 :
                    Test.instanceCount <<= Test.sFld;
                default :
                    Test.instanceCount += 18249 + (d * d);
            }
        } while ((++d) < 97 );
        FuzzerUtils.out.println((((("d i25 b3 = " + Double.doubleToLongBits(d)) + ",") + i25) + ",") + (b3 ? 1 : 0));
        FuzzerUtils.out.println((((("i26 i27 d6 = " + i26) + ",") + i27) + ",") + Double.doubleToLongBits(d6));
        FuzzerUtils.out.println((((("i28 i29 i30 = " + i28) + ",") + i29) + ",") + i30);
        FuzzerUtils.out.println((((("i31 i32 f4 = " + i31) + ",") + i32) + ",") + Float.floatToIntBits(f4));
        FuzzerUtils.out.println((((("lArr3 bArr dArr1 = " + FuzzerUtils.checkSum(lArr3)) + ",") + FuzzerUtils.checkSum(bArr)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));
        FuzzerUtils.out.println((((("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount) + ",") + Test.sFld) + ",") + Test.byFld);
        FuzzerUtils.out.println((((("fFld Test.dFld iFld = " + Float.floatToIntBits(fFld)) + ",") + Double.doubleToLongBits(Test.dFld)) + ",") + iFld);
        FuzzerUtils.out.println((((("Test.iFld1 fFld1 Test.iArrFld = " + Test.iFld1) + ",") + Float.floatToIntBits(fFld1)) + ",") + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
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