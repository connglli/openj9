// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {
    public static final int N = 256;

    public static long instanceCount = -62L;

    public int iFld = -131;

    public static double dFld = 72.93015;

    public static int iFld1 = -58012;

    public static int iFld2 = 33;

    public volatile int iFld3 = -50042;

    public static long lArrFld[] = new long[N];

    public static float fArrFld[] = new float[N];

    public static int iArrFld[] = new int[N];

    public volatile boolean bArrFld[] = new boolean[N];

    public double dArrFld[][] = new double[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -4284537878039984155L);
        FuzzerUtils.init(Test.fArrFld, 2.287F);
        FuzzerUtils.init(Test.iArrFld, 14);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i1, byte by) {
        float f2 = 63.647F;
        int i2 = 63480;
        int i3 = -165;
        int i4 = -107;
        int i5 = -37584;
        int i6 = 76;
        int i7 = 94;
        int i8 = 2;
        short s = -5887;
        boolean b = true;
        l = ((long) (Test.dFld));
        f2 += ((float) (Test.dFld));
        for (long l1 : Test.lArrFld) {
            for (i2 = 1; i2 < 2; ++i2) {
                i4 = 1;
                while ((++i4) < 2) {
                    Test.fArrFld[i2] -= s;
                    l *= i4;
                    Test.dFld -= Test.instanceCount;
                    i1 = ((int) (Test.dFld));
                    Test.instanceCount -= -2344002587L;
                    i3 += i4;
                    i1 += i4;
                    Test.lArrFld[i2] = 1127345086L;
                    try {
                        i3 = i1 / i3;
                        i3 = 37696 % i3;
                        i3 = 17298 / i1;
                    } catch (ArithmeticException a_e) {
                    }
                    i1 *= by;
                    i1 += i4;
                    Test.iArrFld[i2 + 1] = i2;
                    Test.instanceCount *= i3;
                    i1 += ((i4 * s) + i3) - i4;
                    if (b)
                        break;

                }
                i3 *= ((int) (Test.instanceCount));
                i3 <<= i2;
                i3 = i4;
                Test.lArrFld[i2 - 1] <<= l1;
                Test.iArrFld[i2] <<= i3;
                for (i5 = 1; 2 > i5; i5++) {
                    Test.dFld += i4;
                    Test.instanceCount >>= i1;
                    l += i4;
                    i3 += i5 * i1;
                    try {
                        i3 = i1 / 256;
                        i1 = i4 / i6;
                        Test.iArrFld[i5] = i3 / 1716279912;
                    } catch (ArithmeticException a_e) {
                    }
                    i6 += i3;
                }
                i6 -= by;
            }
            i6 = 6252;
            for (i7 = 1; i7 < 2; i7++) {
                l1 -= i7;
                l1 = ((long) (f2));
            }
        }
        vMeth2_check_sum += (((((((((((l + i1) + by) + Float.floatToIntBits(f2)) + i2) + i3) + i4) + s) + (b ? 1 : 0)) + i5) + i6) + i7) + i8;
    }

    public static void vMeth1(double d) {
        int i9 = 125;
        int i10 = -26441;
        int i11 = 7;
        int i12 = 209;
        int i13 = -9;
        int i14 = 56272;
        int i15 = 14;
        short s1 = 4545;
        byte by1 = -92;
        boolean b1 = false;
        boolean bArr[] = new boolean[N];
        double dArr[][] = new double[N][N];
        FuzzerUtils.init(dArr, -120.2103);
        FuzzerUtils.init(bArr, false);
        vMeth2(Test.instanceCount, i9, ((byte) (110)));
        s1 = ((short) (i9));
        for (i10 = 6; i10 < 122; i10++) {
            float f3 = -116.387F;
            f3 = Test.instanceCount;
            Test.iArrFld[i10] <<= i10;
            Test.lArrFld = FuzzerUtils.long1array(N, ((long) (192L)));
            i12 = 1;
            while ((++i12) < 5) {
                for (i13 = 1; i13 > 1; i13--) {
                    i14 = i13;
                    i9 += i13 ^ Test.instanceCount;
                    i11 += i13;
                    by1 *= ((byte) (i13));
                    Test.fArrFld = FuzzerUtils.float1array(N, ((float) (5.824F)));
                    Test.instanceCount += i9;
                    i11 += i13 * i13;
                    switch (((i10 % 5) * 5) + 13) {
                        case 22 :
                        case 26 :
                            Test.instanceCount += ((i13 * i12) + i10) - i13;
                            switch ((i12 % 8) + 20) {
                                case 20 :
                                    i14 = i13;
                                    Test.iArrFld[i10] ^= i12;
                                    break;
                                case 21 :
                                case 22 :
                                    i14 += i13;
                                    Test.iArrFld[i12] = ((int) (33290L));
                                    if (b1)
                                        continue;

                                    try {
                                        i14 = 2618 / i11;
                                        Test.iArrFld[i10] = i10 / (-66);
                                        Test.iArrFld[i10 + 1] = i13 / i11;
                                    } catch (ArithmeticException a_e) {
                                    }
                                    i9 |= ((int) (Test.instanceCount));
                                    i11 <<= i10;
                                    i11 += i13 | Test.instanceCount;
                                    s1 = ((short) (i10));
                                    i11 -= ((int) (1.431F));
                                    switch ((i13 % 9) + 81) {
                                        case 81 :
                                            if (b1)
                                                break;

                                            i11 >>>= ((int) (Test.instanceCount));
                                            i11 += ((i13 * i13) + Test.instanceCount) - i11;
                                            i11 %= ((int) (-1882204169315204749L));
                                            i11 = 40841;
                                            Test.instanceCount -= by1;
                                            b1 = b1;
                                            break;
                                        case 82 :
                                            dArr[i12][i10 + 1] = -8;
                                        case 83 :
                                            Test.iArrFld[i12] += i10;
                                            break;
                                        case 84 :
                                            Test.instanceCount -= i14;
                                            break;
                                        case 85 :
                                            s1 += ((short) (Test.iFld1));
                                            break;
                                        case 86 :
                                            Test.instanceCount += i13;
                                            break;
                                        case 87 :
                                            Test.instanceCount += i13;
                                            break;
                                        case 88 :
                                            Test.instanceCount = i9;
                                        case 89 :
                                            i14 ^= i14;
                                            break;
                                        default :
                                            Test.iArrFld[i13 + 1] ^= i13;
                                    }
                                    break;
                                case 23 :
                                    i9 = i15;
                                    break;
                                case 24 :
                                    i14 = i10;
                                    break;
                                case 25 :
                                    bArr[i10 + 1] = b1;
                                    break;
                                case 26 :
                                    if (b1)
                                        break;

                                    break;
                                case 27 :
                                    f3 -= f3;
                                default :
                                    i11 -= ((int) (1.94706));
                            }
                        case 37 :
                            i11 += ((i13 * s1) + i11) - i13;
                            break;
                        case 35 :
                            Test.instanceCount += i13;
                            break;
                        case 23 :
                            try {
                                i15 = i12 / (-7754061);
                                i11 = i10 % 129;
                                i14 = (-166) % Test.iArrFld[i13];
                            } catch (ArithmeticException a_e) {
                            }
                            break;
                    }
                }
            }
        }
        vMeth1_check_sum += (((((((((((Double.doubleToLongBits(d) + i9) + s1) + i10) + i11) + i12) + i13) + i14) + by1) + (b1 ? 1 : 0)) + i15) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))) + FuzzerUtils.checkSum(bArr);
    }

    public void vMeth() {
        if (Test.ax$15) {
            boolean ax$16 = false;
            Test.AxOutputRedirectionHelper.redirect();
            try {
                if (!ax$16) {
                }
            } catch (Throwable ax$17) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        int i = 9;
        int i16 = -128;
        int i18 = 8506;
        int i19 = 13;
        int i20 = -3;
        int i21 = -2869;
        int i22 = -162;
        int i23 = 123;
        float f4 = -57.114F;
        short s2 = 11860;
        byte by2 = -29;
        boolean b2 = false;
        i = 206;
        while ((--i) > 0) {
            vMeth1(Test.dFld);
            iFld += ((int) (f4));
            Test.dFld += iFld;
            i16 = iFld;
            Test.iFld1 = ((int) (f4));
            f4 -= i;
        }
        Test.instanceCount >>>= s2;
        Test.iFld1 = 129;
        for (int i17 : Test.iArrFld) {
            Test.fArrFld[(i16 >>> 1) % N] += i;
            if (b2) {
                Test.iFld2 -= ((int) (Test.instanceCount));
                by2 += ((byte) (f4));
                f4 = Test.instanceCount;
                if (i17 != 0) {
                    vMeth_check_sum += ((((((((((i + Float.floatToIntBits(f4)) + i16) + s2) + by2) + i18) + i19) + i20) + i21) + i22) + i23) + (b2 ? 1 : 0);
                    return;
                }
                Test.iFld1 = i16;
                i17 *= i16;
                i18 = 1;
                do {
                    Test.iFld2 -= Test.iFld2;
                    Test.iFld1 = i16;
                    switch ((i18 % 7) + 30) {
                        case 30 :
                            for (i19 = i18; i19 < 1; i19++) {
                                Test.instanceCount = i20;
                                Test.dFld -= i20;
                            }
                            Test.iArrFld = FuzzerUtils.int1array(N, ((int) (1)));
                            bArrFld = bArrFld;
                            i16 *= ((int) (f4));
                            dArrFld[i18 - 1][i18 - 1] = i19;
                            break;
                        case 31 :
                            Test.iArrFld[i18 + 1] = ((int) (f4));
                            for (i21 = 1; i21 < 1; i21++) {
                                switch (((i18 % 1) * 5) + 8) {
                                    case 9 :
                                        Test.dFld = i23;
                                        Test.iArrFld[(i17 >>> 1) % N] >>= i23;
                                        Test.lArrFld[i21 - 1] -= Test.instanceCount;
                                        Test.instanceCount = -81;
                                        break;
                                }
                                i20 -= i16;
                            }
                        case 32 :
                            if (b2)
                                break;

                            break;
                        case 33 :
                            i22 = i21;
                            break;
                        case 34 :
                            by2 |= ((byte) (i20));
                            break;
                        case 35 :
                            Test.instanceCount += i18;
                        case 36 :
                            i17 += i18 * i18;
                    }
                } while ((++i18) < 2 );
            } else {
                Test.instanceCount >>= iFld;
            }
        }
        vMeth_check_sum += ((((((((((i + Float.floatToIntBits(f4)) + i16) + s2) + by2) + i18) + i19) + i20) + i21) + i22) + i23) + (b2 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {
        if (Test.ax$0) {
            boolean ax$1 = false;
            Test.AxOutputRedirectionHelper.redirect();
            try {
                for (long ax$2 = System.nanoTime(); ax$2 < 42; ++ax$2) {
                    for (long ax$3 = System.currentTimeMillis(); ax$3 != 42; ++ax$3) {
                    }
                }
            } catch (Throwable ax$4) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        float f = 41.79F;
        float f1 = -72.983F;
        int i24 = -47645;
        int i25 = -100;
        int i26 = -194;
        int i27 = 60067;
        int i28 = 41590;
        int i29 = -46602;
        int i30 = 114;
        int i31 = -204;
        int i32 = -217;
        int i33 = 54952;
        int i34 = -5;
        int i35 = 60786;
        int i36 = 47179;
        int i37 = -35485;
        int i38 = 11;
        int i39 = 0;
        int iArr[] = new int[N];
        double d1 = -25.26613;
        short s3 = 30994;
        long l2 = -1533487845L;
        byte by3 = 35;
        boolean b3 = false;
        FuzzerUtils.init(iArr, 16);
        f -= ((Test.instanceCount * iFld) - (++f1)) + (iArr[((-12) >>> 1) % N] + iArr[((-37) >>> 1) % N]);
        {
            final int ax$26 = i28;
            final long ax$27 = l2;
            final int ax$28 = i26;
            try {
                long[] ax$19 = new long[]{ -4200726799660174900L, -3384332368849880239L, 158493123109781537L, -7223365464233463243L, 2696309159686159485L, -4624854385263374839L, 7502160548729650877L };
                long[] ax$22 = new long[]{ 172309953958515908L, -8373110835353628722L };
                for (int ax$18 = -590; ax$18 < (-590 + 16307); ax$18 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        ax$22[i28] = ((long) (ax$19[i28] & l2));
                    } catch (Throwable ax$23) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$15 = true;
                    vMeth();
                    Test.ax$15 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        i26++;
                    } catch (Throwable ax$25) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                i28 = ax$26;
                l2 = ax$27;
                i26 = ax$28;
            }
        }
        vMeth();
        for (i24 = 1; i24 < 159; i24++) {
            Test.lArrFld[((-200) >>> 1) % N] = Test.iFld1;
            for (i26 = 2; i26 < 32; i26++) {
                i27 += i26 * i28;
                Test.iFld1 += ((int) (f));
                Test.iArrFld[(i27 >>> 1) % N] -= ((int) (Test.instanceCount));
                Test.dFld -= iFld;
            }
            for (i29 = 1; i29 < 32; ++i29) {
                f += i29 * i26;
                i27 -= i30;
                for (i31 = 1; i31 < 2; i31++) {
                    Test.instanceCount -= i29;
                    Test.dFld += i32;
                    Test.dFld += -60546;
                    i25 += i31 ^ i30;
                    i25 -= i33;
                }
                for (i34 = 1; i34 < 2; ++i34) {
                    i27 += ((int) (Test.instanceCount));
                    f1 += Test.iFld2;
                    i27 = ((int) (Test.instanceCount));
                    f -= ((float) (Test.dFld));
                    iFld >>= i29;
                    i35 += i33;
                    Test.iFld1 += i34 - i26;
                    Test.instanceCount += ((long) ((-122.236F) + (i34 * i34)));
                    i25 <<= ((int) (Test.instanceCount));
                    iFld3 = i30;
                }
                Test.lArrFld[i29] = ((long) (Test.dFld));
            }
        }
        i36 = 1;
        while ((++i36) < 133) {
            Test.dFld *= -6L;
            Test.instanceCount = i25;
            i32 = ((int) (Test.dFld));
            for (d1 = i36; d1 < 38; ++d1) {
                i27 = i37;
                for (i38 = 1; i38 < 1; i38++) {
                    switch (((i27 >>> 1) % 4) + 119) {
                        case 119 :
                            iFld *= i26;
                            f1 -= -11;
                            i30 *= ((int) (-161L));
                            i28 = s3;
                            l2 = Test.instanceCount;
                            f = l2;
                            Test.iArrFld[i36] = i31;
                            i37 += i37;
                            Test.iArrFld[i38 + 1] *= -219;
                            i32 += i38 - iFld;
                            i27 = i37;
                            i30 *= ((int) (8744246563776211595L));
                            i35 = ((int) (f));
                            break;
                        case 120 :
                            iFld3 -= Test.iFld1;
                            try {
                                i30 = 967558877 % i37;
                                Test.iArrFld[(i39 >>> 1) % N] = iFld % 228;
                                Test.iFld2 = i33 / (-1799557648);
                            } catch (ArithmeticException a_e) {
                            }
                            switch (((int) ((d1 % 6) + 35))) {
                                case 35 :
                                    Test.dFld -= i39;
                                    iArr = iArr;
                                    l2 += l2;
                                    Test.instanceCount = l2;
                                    i25 += ((int) (d1));
                                    i25 -= i30;
                                    break;
                                case 36 :
                                    i30 += i38 * i36;
                                case 37 :
                                    switch (((int) ((d1 % 7) + 71))) {
                                        case 71 :
                                            iFld3 = -25353;
                                            Test.dFld = 6L;
                                            Test.iFld1 = ((int) (f1));
                                            f += i38;
                                            iFld += i38 - i29;
                                            Test.dFld += i35;
                                            iArr[((int) (d1 - 1))] = i30;
                                        case 72 :
                                            by3 -= ((byte) (i24));
                                            dArrFld[i38] = dArrFld[i36 + 1];
                                            l2 = iFld;
                                            i30 >>= i29;
                                            l2 -= 3;
                                            i30 <<= 6;
                                            break;
                                        case 73 :
                                            Test.dFld = -205;
                                            break;
                                        case 74 :
                                            i28 &= i25;
                                            break;
                                        case 75 :
                                            l2 += i30;
                                        case 76 :
                                            Test.dFld = i35;
                                            break;
                                        case 77 :
                                            if (b3)
                                                continue;

                                            break;
                                        default :
                                            Test.iFld1 &= ((int) (l2));
                                    }
                                    break;
                                case 38 :
                                    i39 &= s3;
                                    break;
                                case 39 :
                                    by3 += ((byte) (i37));
                                case 40 :
                                    Test.lArrFld[i36] &= l2;
                                default :
                                    i35 -= -8;
                            }
                            break;
                        case 121 :
                            Test.iArrFld[i36] = 22;
                            break;
                        case 122 :
                            Test.instanceCount -= i26;
                            break;
                        default :
                            dArrFld[(i32 >>> 1) % N][i38 - 1] = i25;
                    }
                }
            }
        }
        FuzzerUtils.out.println((((("f f1 i24 = " + Float.floatToIntBits(f)) + ",") + Float.floatToIntBits(f1)) + ",") + i24);
        FuzzerUtils.out.println((((("i25 i26 i27 = " + i25) + ",") + i26) + ",") + i27);
        FuzzerUtils.out.println((((("i28 i29 i30 = " + i28) + ",") + i29) + ",") + i30);
        FuzzerUtils.out.println((((("i31 i32 i33 = " + i31) + ",") + i32) + ",") + i33);
        FuzzerUtils.out.println((((("i34 i35 i36 = " + i34) + ",") + i35) + ",") + i36);
        FuzzerUtils.out.println((((("d1 i37 i38 = " + Double.doubleToLongBits(d1)) + ",") + i37) + ",") + i38);
        FuzzerUtils.out.println((((("i39 s3 l2 = " + i39) + ",") + s3) + ",") + l2);
        FuzzerUtils.out.println((((("by3 b3 iArr = " + by3) + ",") + (b3 ? 1 : 0)) + ",") + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println((((("Test.instanceCount iFld Test.dFld = " + Test.instanceCount) + ",") + iFld) + ",") + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println((((("Test.iFld1 Test.iFld2 iFld3 = " + Test.iFld1) + ",") + Test.iFld2) + ",") + iFld3);
        FuzzerUtils.out.println((((("Test.lArrFld Test.fArrFld Test.iArrFld = " + FuzzerUtils.checkSum(Test.lArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))) + ",") + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println((("bArrFld dArrFld = " + FuzzerUtils.checkSum(bArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                {
                    final int ax$14 = i;
                    try {
                        int[] ax$6 = new int[]{ 372231319, 1981722132, 1720122214, 789629537, 483853400, -1999190304, 605645296, 473625479, -1686002086 };
                        ServerSocket ax$10 = null;
                        for (int ax$5 = -701; ax$5 < (-701 + 3779); ax$5 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$8 = 0; ax$8 < i; ax$8++) {
                                    ax$6[ax$8] = ax$8;
                                }
                            } catch (Throwable ax$9) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            Test.ax$0 = true;
                            _instance.mainTest(new String[]{ "s", "s", "s", "s", "s" });
                            Test.ax$0 = false;
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                Socket ax$11;
                                try {
                                    while (true) {
                                        ax$11 = ax$10.accept();
                                        ax$11.close();
                                    }
                                } catch (IOException ax$12) {
                                }
                            } catch (Throwable ax$13) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        i = ax$14;
                    }
                }
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

    static Boolean ax$15 = false;
}