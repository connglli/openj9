// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.channels.Selector;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 14L;

    public static volatile boolean bFld = false;

    public static int iFld = -54946;

    public static float fFld = 80.744F;

    public static byte byFld = -2;

    public static short sFld = 2672;

    public int iFld1 = 11;

    public static long lArrFld[] = new long[N];

    public static volatile float fArrFld[] = new float[N];

    public static short sArrFld[] = new short[N];

    public volatile boolean bArrFld[] = new boolean[N];

    public int iArrFld[] = new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1018243453720960433L);
        FuzzerUtils.init(Test.fArrFld, 0.383F);
        FuzzerUtils.init(Test.sArrFld, ((short) (11906)));
    }

    public static long lMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long fMeth_check_sum = 0;

    public static float fMeth(int i5) {
        int i6 = 35;
        int i7 = 25377;
        int i8 = 40;
        int i9 = -11;
        int i10 = 0;
        int i11 = 83;
        int iArr[] = new int[N];
        byte by = 72;
        short s = 10980;
        double d = -60.52359;
        FuzzerUtils.init(iArr, 63);
        {
            try {
                for (int ax$0 = -465; ax$0 < (-465 + 13200); ax$0 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if (RoundingMode.valueOf(BigDecimal.ROUND_FLOOR) != RoundingMode.FLOOR) {
                        }
                    } catch (Throwable ax$1) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
            }
        }
        i5 = ((int) (Test.instanceCount));
        iArr[(i5 >>> 1) % N] >>>= ((int) (Test.instanceCount));
        Test.instanceCount = Test.instanceCount;
        Test.instanceCount >>= Test.instanceCount;
        for (i6 = 3; i6 < 248; i6++) {
            i7 >>= by;
            s += ((short) (i7));
            for (i8 = 1; i8 < 3; i8++) {
                iArr[i8] = 120;
                for (i10 = 1; i10 < 2; i10++) {
                    float f1 = -2.457F;
                    if (Test.bFld)
                        continue;

                    i9 += i10;
                    i9 = i7;
                    i5 += ((int) (6L + (i10 * i10)));
                    d -= Test.instanceCount;
                    Test.lArrFld[i10] = Test.instanceCount;
                    i5 -= -29028;
                    i9 -= ((int) (-40104L));
                    switch (((i5 >>> 1) % 1) + 43) {
                        case 43 :
                            if (Test.bFld)
                                continue;

                            f1 += ((i10 * i7) + i8) - Test.instanceCount;
                            d = i5;
                            iArr[i6 + 1] -= i9;
                            iArr[i6 - 1] += i7;
                            i5 += i10 * Test.instanceCount;
                            iArr[i6 + 1] <<= -13;
                            i9 = ((int) (d));
                            Test.instanceCount = Test.instanceCount;
                            Test.instanceCount *= by;
                            break;
                    }
                    d += -139;
                    if (true) {
                        iArr[i6 - 1] = i8;
                        i9 += ((i10 * i10) + Test.instanceCount) - Test.instanceCount;
                        Test.instanceCount += i10 - i7;
                    } else {
                        iArr[i8 - 1] = ((int) (d));
                        Test.iFld |= Test.iFld;
                        Test.instanceCount = s;
                    }
                }
            }
        }
        long meth_res = (((((((((i5 + i6) + i7) + by) + s) + i8) + i9) + i10) + i11) + Double.doubleToLongBits(d)) + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return ((float) (meth_res));
    }

    public static int iMeth(float f) {
        double d1 = -39.22793;
        double dArr[] = new double[N];
        int i12 = -62;
        int i13 = 36258;
        int i14 = 68;
        int i15 = 121;
        int i16 = -11;
        int i17 = -163;
        int iArr1[][] = new int[N][N];
        int iArr2[] = new int[N];
        short s1 = -32213;
        byte by1 = -113;
        FuzzerUtils.init(dArr, 83.3784);
        FuzzerUtils.init(iArr1, -8);
        FuzzerUtils.init(iArr2, 93);
        f -= Math.abs(fMeth(Test.iFld));
        if (Test.bFld) {
            d1 *= Test.iFld;
        } else if (Test.bFld) {
            dArr[((-38419) >>> 1) % N] -= Test.iFld;
            Test.iFld = -1;
            for (i12 = 4; i12 < 83; ++i12) {
                Test.iFld += i12 | Test.iFld;
                f -= Test.instanceCount;
                i13 = i13;
                Test.iFld -= 44034;
                if (Test.bFld)
                    continue;

                switch ((i12 % 4) + 23) {
                    case 23 :
                    case 24 :
                        s1 >>= ((short) (i13));
                        i13 = -52;
                        for (i14 = 1; 7 > i14; i14++) {
                            iArr1[i12 + 1][i14] -= i13;
                            Test.instanceCount = -26304;
                            Test.instanceCount &= i14;
                            Test.instanceCount -= i14;
                            Test.instanceCount = i13;
                            i15 += 64 + (i14 * i14);
                            for (i16 = 1; i16 < 2; ++i16) {
                                if (i13 != 0) {
                                }
                                if (Test.bFld) {
                                    i17 = i15;
                                    f = 30441;
                                    iArr1[i12][i16] *= i15;
                                    i17 += ((i16 * f) + i13) - i15;
                                    Test.iFld += i16;
                                    Test.instanceCount -= i16;
                                    i13 *= ((int) (d1));
                                    Test.instanceCount += ((i16 * by1) + i16) - Test.instanceCount;
                                    i13 = ((int) (Test.instanceCount));
                                    i15 += i16 * i16;
                                    Test.iFld <<= by1;
                                }
                                i15 += ((i16 * i12) + Test.instanceCount) - s1;
                                iArr1[i14 + 1][i12 + 1] += i12;
                            }
                        }
                        break;
                    case 25 :
                        s1 = ((short) (0));
                        break;
                    case 26 :
                        i17 <<= i12;
                        break;
                }
            }
        } else if (Test.bFld) {
            Test.instanceCount = i12;
        } else {
            Test.iFld ^= i16;
        }
        long meth_res = (((((((((((Float.floatToIntBits(f) + Double.doubleToLongBits(d1)) + i12) + i13) + s1) + i14) + i15) + i16) + i17) + by1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static long lMeth(int i2, int i3, int i4) {
        double d3 = -61.111838;
        double dArr1[] = new double[N];
        int i20 = 30856;
        int i21 = -7;
        int i22 = -37262;
        int i23 = 108;
        int i24 = 29856;
        int i25 = -49;
        int iArr3[] = new int[N];
        float f3 = 1.942F;
        FuzzerUtils.init(iArr3, 111);
        FuzzerUtils.init(dArr1, 1.80571);
        Test.instanceCount = (i3++) * i2;
        i2 -= ((int) ((iMeth(Test.fFld) * Test.instanceCount) + d3));
        iArr3[(i3 >>> 1) % N] <<= i2;
        for (float f2 : Test.fArrFld) {
            i3 += i2;
        }
        Test.instanceCount -= Test.instanceCount;
        for (i20 = 3; i20 < 193; i20++) {
            Test.iFld -= i20;
            switch (((i4 >>> 1) % 1) + 74) {
                case 74 :
                    iArr3[i20 - 1] ^= ((int) (Test.instanceCount));
                    break;
            }
            Test.sArrFld[i20 + 1] += ((short) (i2));
            for (f3 = 1; 3 > f3; ++f3) {
                Test.instanceCount *= i2;
                i21 >>= -22204;
                for (i23 = 1; 2 > i23; i23++) {
                    switch (((int) ((f3 % 2) + 65))) {
                        case 65 :
                            Test.byFld += ((byte) (i23 | Test.sFld));
                            i21 >>>= i23;
                            i22 = i24;
                            switch (((i20 % 9) * 5) + 125) {
                                case 170 :
                                    i3 += ((i23 * f3) + i21) - Test.iFld;
                                    d3 *= i24;
                                    i2 += i23;
                                    i21 += i23 * Test.instanceCount;
                                    i21 = ((int) (Test.fFld));
                                    Test.instanceCount *= i3;
                                    Test.fFld -= Test.instanceCount;
                                    i21 -= ((int) (Test.instanceCount));
                                    switch ((((i20 >>> 1) % 10) * 5) + 28) {
                                        case 76 :
                                            Test.iFld = ((int) (188L));
                                            i24 += ((i23 * i21) + i24) - Test.iFld;
                                            Test.instanceCount = i20;
                                            Test.instanceCount += 12722 + (i23 * i23);
                                            try {
                                                i3 = i25 / 25260;
                                                i2 = 35860 / i23;
                                                i2 = 117 % iArr3[i23];
                                            } catch (ArithmeticException a_e) {
                                            }
                                            i21 += i23 ^ i22;
                                            Test.iFld <<= i22;
                                        case 70 :
                                            Test.fFld -= f3;
                                            break;
                                        case 29 :
                                        case 42 :
                                            i2 *= ((int) (f3));
                                            break;
                                        case 37 :
                                            Test.fFld = Test.instanceCount;
                                            break;
                                        case 50 :
                                            i4 *= ((int) (d3));
                                            break;
                                        case 36 :
                                            i4 += i23 * i23;
                                            break;
                                        case 63 :
                                            i24 += Test.sFld;
                                            break;
                                        case 57 :
                                            if (Test.bFld)
                                                break;

                                            break;
                                        case 65 :
                                            Test.instanceCount >>= 2L;
                                            break;
                                    }
                                case 146 :
                                    if (Test.bFld)
                                        continue;

                                    break;
                                case 148 :
                                    dArr1[i20 - 1] -= i3;
                                    break;
                                case 155 :
                                    i21 += i23;
                                    break;
                                case 141 :
                                    Test.instanceCount += i23;
                                    break;
                                case 153 :
                                    Test.fFld += ((i23 * i22) + f3) - i3;
                                    break;
                                case 135 :
                                    try {
                                        i24 = i3 % i3;
                                        i24 = i24 / 16709;
                                        i25 = i24 % i21;
                                    } catch (ArithmeticException a_e) {
                                    }
                                    break;
                                case 126 :
                                    iArr3 = iArr3;
                                    break;
                                case 144 :
                                    Test.instanceCount <<= Test.instanceCount;
                                    break;
                            }
                            break;
                        case 66 :
                            iArr3[i20 - 1] = ((int) (Test.instanceCount));
                            break;
                        default :
                            iArr3[i23 + 1] += Test.iFld;
                    }
                }
            }
        }
        long meth_res = (((((((((((i2 + i3) + i4) + Double.doubleToLongBits(d3)) + i20) + i21) + Float.floatToIntBits(f3)) + i22) + i23) + i24) + i25) + FuzzerUtils.checkSum(iArr3)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        lMeth_check_sum += meth_res;
        return ((long) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        int i = 33;
        int i1 = 2825;
        int i26 = 14243;
        int i27 = 0;
        int i28 = 0;
        double d4 = 22.76337;
        for (i = 6; i < 123; ++i) {
            lMeth(i1, Test.iFld, i1);
            i26 = 1;
            while ((++i26) < 43) {
                Test.iFld = i1;
                for (i27 = 1; i27 < 1; ++i27) {
                    Test.instanceCount += ((i27 * i26) + i1) - i27;
                    switch ((i % 6) + 111) {
                        case 111 :
                            Test.instanceCount = i28;
                            bArrFld[i26 + 1] = true;
                            i1 += ((i27 * i27) + i27) - Test.instanceCount;
                            i28 = 202;
                            i28 *= Test.iFld;
                            Test.iFld ^= Test.sFld;
                            i28 = i1;
                            d4 += -37320;
                            Test.instanceCount += i27 + i27;
                            switch ((i26 % 1) + 53) {
                                case 53 :
                                    Test.lArrFld[i - 1] >>= 29;
                                    d4 = d4;
                                    Test.sFld = ((short) (i26));
                                    iArrFld[i - 1] += i26;
                                    Test.iFld += (-61163) + (i27 * i27);
                                    Test.fArrFld[i26 - 1] -= -693597577811243580L;
                                    if (false)
                                        continue;

                                    Test.fFld += i27;
                                    i28 += i27 | Test.instanceCount;
                                    i28 += i27;
                                    break;
                                default :
                                    Test.fFld *= Test.fFld;
                                    i1 = Test.byFld;
                                    Test.fArrFld = Test.fArrFld;
                                    try {
                                        i28 = Test.iFld / i27;
                                        i1 = 14998 % i1;
                                        i1 = i1 / 44222;
                                    } catch (ArithmeticException a_e) {
                                    }
                                    Test.lArrFld[i - 1] += ((long) (Test.fFld));
                                    i28 = i27;
                                    iArrFld[i26 + 1] += ((int) (Test.fFld));
                                    iArrFld = iArrFld;
                                    i1 += i27;
                                    Test.iFld >>>= 12;
                                    i1 += i27 * i27;
                                    Test.fFld += i26;
                                    Test.instanceCount += i28;
                            }
                            d4 = 17361;
                            Test.instanceCount -= Test.byFld;
                            {
                                final boolean ax$12 = Test.bFld;
                                try {
                                    Selector ax$10 = null;
                                    for (int ax$8 = -549; ax$8 < (-549 + 9359); ax$8 += 1) {
                                        Test.AxOutputRedirectionHelper.redirect();
                                        try {
                                            ax$10.close();
                                            bFld = true;
                                        } catch (Throwable ax$11) {
                                        } finally {
                                        }
                                        Test.AxOutputRedirectionHelper.recover();
                                    }
                                } finally {
                                    Test.bFld = ax$12;
                                }
                            }
                            Test.fFld += i;
                            Test.instanceCount += i27 - Test.iFld;
                            break;
                        case 112 :
                            Test.iFld += ((i27 * Test.iFld) + i) - Test.iFld;
                            i28 += i;
                            i1 = 1954;
                            i1 = i1;
                            break;
                        case 113 :
                            i1 >>= i27;
                            Test.instanceCount = Test.byFld;
                            d4 -= i;
                            break;
                        case 114 :
                            if (Test.bFld)
                                continue;

                            iFld1 = iFld1;
                            Test.iFld *= -8;
                            i1 += i27;
                            i1 -= 8924;
                            Test.instanceCount >>= -284460409L;
                            iArrFld = iArrFld;
                            try {
                                iFld1 = 26 / i27;
                                Test.iFld = iArrFld[i + 1] / iArrFld[i26 - 1];
                                Test.iFld = iArrFld[i27 + 1] % iArrFld[i];
                            } catch (ArithmeticException a_e) {
                            }
                            if (Test.bFld)
                                continue;

                            break;
                        case 115 :
                            i1 = -17863;
                            Test.iFld += i;
                            iFld1 >>= -6;
                            try {
                                iFld1 = (-22) / iArrFld[i27];
                                Test.iFld = iArrFld[i26 - 1] % Test.iFld;
                                i28 = i26 % iArrFld[i27];
                            } catch (ArithmeticException a_e) {
                            }
                            Test.iFld = ((int) (Test.instanceCount));
                            Test.iFld += ((int) (Test.fFld));
                            i1 <<= 110;
                            break;
                        case 116 :
                            Test.sFld += ((short) (((i27 * Test.fFld) + Test.iFld) - i));
                            if (Test.bFld)
                                continue;

                            iArrFld[(i28 >>> 1) % N] = ((int) (Test.instanceCount));
                            Test.fFld += i28;
                            switch ((i % 3) + 109) {
                                case 109 :
                                    Test.instanceCount >>= iFld1;
                                    Test.byFld <<= ((byte) (Test.instanceCount));
                                    Test.iFld = -7;
                                    break;
                                case 110 :
                                    iArrFld[i27 - 1] >>>= i1;
                                    break;
                                case 111 :
                                    i1 |= i26;
                                    break;
                                default :
                                    try {
                                        iArrFld[i27 + 1] = i26 / (-43);
                                        iArrFld[i27 - 1] = i28 / i27;
                                        i1 = (-21255) % Test.iFld;
                                    } catch (ArithmeticException a_e) {
                                    }
                            }
                            break;
                    }
                }
            }
        }
        FuzzerUtils.out.println((((("i i1 i26 = " + i) + ",") + i1) + ",") + i26);
        FuzzerUtils.out.println((((("i27 i28 d4 = " + i27) + ",") + i28) + ",") + Double.doubleToLongBits(d4));
        FuzzerUtils.out.println((((("Test.instanceCount Test.bFld Test.iFld = " + Test.instanceCount) + ",") + (Test.bFld ? 1 : 0)) + ",") + Test.iFld);
        FuzzerUtils.out.println((((("Test.fFld Test.byFld Test.sFld = " + Float.floatToIntBits(Test.fFld)) + ",") + Test.byFld) + ",") + Test.sFld);
        FuzzerUtils.out.println((((("iFld1 Test.lArrFld Test.fArrFld = " + iFld1) + ",") + FuzzerUtils.checkSum(Test.lArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println((((("Test.sArrFld bArrFld iArrFld = " + FuzzerUtils.checkSum(Test.sArrFld)) + ",") + FuzzerUtils.checkSum(bArrFld)) + ",") + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }

    public static void main(String[] strArr) {
        {
            final int ax$7 = Test.iFld;
            try {
                char ax$3 = '歿';
                char ax$4 = 's';
                for (int ax$2 = -809; ax$2 < (-809 + 15433); ax$2 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if (ax$3 < ax$4) {
                            iFld = -1;
                        } else if (ax$3 > ax$4) {
                            iFld = 1;
                        }
                    } catch (Throwable ax$6) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                Test.iFld = ax$7;
            }
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