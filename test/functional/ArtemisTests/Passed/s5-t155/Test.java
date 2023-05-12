// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 160L;

    public static float fFld = -82.247F;

    public volatile int iFld = 13;

    public static boolean bFld = false;

    public static int iFld1 = 100;

    public byte byFld = -90;

    public static float fArrFld[] = new float[N];

    public static int iArrFld[] = new int[N];

    public short sArrFld[] = new short[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -66.579F);
        FuzzerUtils.init(Test.iArrFld, 4);
    }

    public static long iMeth_check_sum = 0;

    public static long fMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static void vMeth() {
        int i9 = -17;
        float f1 = -73.566F;
        i9 *= ((int) (f1));
        i9 <<= i9;
        vMeth_check_sum += i9 + Float.floatToIntBits(f1);
    }

    public static float fMeth(long l, int i5) {
        int i6 = 62295;
        int i7 = -80;
        int i8 = 11;
        int i10 = -14;
        int i11 = -4;
        int i12 = -89;
        int i13 = 148;
        int i14 = -47434;
        int i15 = 53;
        int i16 = -6;
        int i17 = -2;
        int iArr[][] = new int[N][N];
        float f2 = -116.719F;
        double d = -2.92486;
        byte by = -99;
        short s = -6582;
        long l1 = 7L;
        long lArr[][] = new long[N][N];
        boolean b = true;
        FuzzerUtils.init(iArr, -140);
        FuzzerUtils.init(lArr, 11L);
        for (i6 = 1; i6 < 103; ++i6) {
            try {
                i7 = 181 / iArr[i6][i6 - 1];
                i8 = i8 % i6;
                iArr[i6 - 1][i6 + 1] = iArr[i6 - 1][i6] / i8;
            } catch (ArithmeticException a_e) {
            }
            vMeth();
            i5 >>= i8;
        }
        i8 <<= i5;
        iArr[(i6 >>> 1) % N][(i7 >>> 1) % N] = -4;
        for (i10 = 2; i10 < 89; i10++) {
            i8 *= ((int) (Test.instanceCount));
            i5 += i10 - i11;
            for (i12 = 1; 6 > i12; ++i12) {
                for (i14 = 2; i14 > 1; i14--) {
                    i8 <<= 214;
                    f2 %= ((long) (d)) | 1;
                    i11 = i8;
                    i5 -= i10;
                    i8 = ((int) (l));
                    iArr[i12 - 1][i12 - 1] = i13;
                    Test.instanceCount += (-6) + (i14 * i14);
                }
                i8 -= -11;
                switch ((((i14 >>> 1) % 2) * 5) + 49) {
                    case 55 :
                        i13 += ((i12 * i6) + Test.instanceCount) - i11;
                        Test.instanceCount |= i5;
                        i7 += i12 * i12;
                        by <<= ((byte) (i11));
                        i15 = i7;
                        i13 = ((int) (d));
                        Test.instanceCount >>>= by;
                        iArr[i10 + 1][i10 - 1] -= i8;
                        f2 *= i13;
                        if (b) {
                            Test.fArrFld[i12 - 1] += i15;
                            switch ((i12 % 10) + 86) {
                                case 86 :
                                    switch ((i10 % 9) + 73) {
                                        case 73 :
                                            i16 = 1;
                                            do {
                                                if (true)
                                                    break;

                                                lArr[i16][i12 + 1] *= s;
                                                i15 += ((i16 * f2) + l) - i15;
                                            } while ((++i16) < 2 );
                                            break;
                                        case 74 :
                                            l1 = i11;
                                            break;
                                        case 75 :
                                            iArr[i10 - 1][i12 + 1] = ((int) (f2));
                                            break;
                                        case 76 :
                                            i13 = ((int) (f2));
                                            break;
                                        case 77 :
                                            i5 <<= 137;
                                            break;
                                        case 78 :
                                            i7 = i12;
                                            break;
                                        case 79 :
                                        case 80 :
                                            if (b)
                                                break;

                                        case 81 :
                                            i8 = ((int) (l));
                                            break;
                                    }
                                    break;
                                case 87 :
                                    i7 = ((int) (l));
                                    break;
                                case 88 :
                                case 89 :
                                    lArr[i12 - 1][i12] = -118;
                                    break;
                                case 90 :
                                    Test.instanceCount = -62918;
                                    break;
                                case 91 :
                                    Test.fArrFld[i10 - 1] = i8;
                                case 92 :
                                case 93 :
                                    f2 -= i14;
                                    break;
                                case 94 :
                                    f2 += ((i12 * i11) + i13) - i17;
                                    break;
                                case 95 :
                                    l1 = -10310L;
                                    break;
                            }
                        } else {
                            l = 31L;
                        }
                        break;
                    case 54 :
                        iArr[i10] = iArr[i12];
                        break;
                }
            }
        }
        long meth_res = (((((((((((((((((((l + i5) + i6) + i7) + i8) + i10) + i11) + i12) + i13) + i14) + i15) + Float.floatToIntBits(f2)) + Double.doubleToLongBits(d)) + by) + i16) + s) + l1) + (b ? 1 : 0)) + i17) + FuzzerUtils.checkSum(iArr)) + FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return ((float) (meth_res));
    }

    public static int iMeth(float f, int i) {
        int i1 = 6;
        int i2 = 0;
        int i3 = 23268;
        int i4 = 215;
        int i18 = 190;
        int i19 = -55706;
        long l2 = 764480833L;
        boolean b1 = false;
        byte by1 = -126;
        for (i1 = 82; i1 > 1; i1--) {
            for (i3 = 7; i3 > 1; i3 -= 2) {
                i4 >>= ((int) ((Test.fArrFld[i1 - 1] += ++i2) - fMeth(Test.instanceCount, -32453)));
                for (l2 = 1; l2 < 3; l2++) {
                    switch ((i3 % 6) + 86) {
                        case 86 :
                            i4 = i4;
                            i = 30306;
                            b1 = true;
                            Test.instanceCount += ((l2 * i1) + Test.instanceCount) - i2;
                            Test.iArrFld[((int) (l2 + 1))] *= i2;
                            i18 += (-1220) + (l2 * l2);
                            i18 <<= i3;
                            break;
                        case 87 :
                            i += ((int) (((l2 * f) + i3) - i3));
                            i += ((int) (l2 * l2));
                            Test.iArrFld[i3 - 1] -= i;
                            Test.instanceCount = i1;
                            i18 -= i2;
                            Test.iArrFld[((int) (l2 + 1))] /= -26616;
                            i += ((int) (l2));
                            i *= i2;
                            Test.instanceCount = i3;
                            i += ((int) (l2));
                            if (i3 != 0) {
                            }
                            i4 = -2;
                            Test.instanceCount = i19;
                        case 88 :
                            Test.instanceCount = 238;
                            if (b1)
                                break;

                            i19 += by1;
                            try {
                                i18 = i1 / (-205);
                                i4 = Test.iArrFld[i3] % 1376497388;
                                i2 = i18 / i1;
                            } catch (ArithmeticException a_e) {
                            }
                            Test.instanceCount = i4;
                            i2 = i18;
                            Test.instanceCount += ((l2 * i4) + i3) - i18;
                            f += l2;
                            if (b1)
                                break;

                            Test.instanceCount = i19;
                            Test.iArrFld[i3] = 99;
                            Test.instanceCount += 29412;
                            break;
                        case 89 :
                            i19 *= i18;
                            break;
                        case 90 :
                            Test.iArrFld[i3] = ((int) (f));
                        case 91 :
                            i18 += ((int) (l2 ^ Test.instanceCount));
                            break;
                    }
                }
            }
        }
        long meth_res = (((((((((Float.floatToIntBits(f) + i) + i1) + i2) + i3) + i4) + l2) + i18) + (b1 ? 1 : 0)) + i19) + by1;
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        if (Test.ax$0) {
            Float ax$1 = 0.081554115F;
            Float ax$2 = 0.95988387F;
            Test.AxOutputRedirectionHelper.redirect();
            try {
                for (int ax$3 = 0; ax$3 < 1000; ax$3++) {
                    if ((ax$3 & 1) == 0) {
                        ax$1 = ax$1 + ax$2;
                    }
                }
            } catch (Throwable ax$4) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        double d1 = -2.129039;
        double dArr[] = new double[N];
        int i20 = 49773;
        int i21 = 41623;
        int i22 = -5;
        int i23 = -9237;
        int i24 = 23670;
        int i25 = 50552;
        int i26 = -13;
        short s1 = 22975;
        boolean bArr[] = new boolean[N];
        long lArr1[] = new long[N];
        byte byArr[] = new byte[N];
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(dArr, -103.54371);
        FuzzerUtils.init(lArr1, 230L);
        FuzzerUtils.init(byArr, ((byte) (-9)));
        iMeth(Test.fFld, iFld);
        iFld += ((int) (d1));
        for (i20 = 14; i20 < 236; ++i20) {
            for (i22 = 1; i22 < 23; ++i22) {
                iFld += (-5) + (i22 * i22);
                Test.iArrFld = Test.iArrFld;
                i23 += i22;
                switch ((i22 % 4) + 32) {
                    case 32 :
                        Test.fFld += i22;
                        i23 = iFld;
                        d1 = Test.instanceCount;
                        bArr = bArr;
                        iFld += i23;
                        dArr[i20 + 1] -= 0.56182;
                        try {
                            iFld = i20 / (-16790);
                            iFld = (-199) / iFld;
                            i23 = (-1776717366) / i23;
                        } catch (ArithmeticException a_e) {
                        }
                        i21 = ((int) (Test.instanceCount));
                    case 33 :
                        for (i24 = 1; i24 < 2; ++i24) {
                            if (Test.bFld)
                                break;

                            switch ((i22 % 1) + 25) {
                                case 25 :
                                    Test.iArrFld[i20] *= iFld;
                                    i21 += i24 ^ i23;
                                    break;
                                default :
                                    Test.fFld = iFld;
                                    dArr[i20 - 1] = Test.fFld;
                            }
                            s1 = ((short) (-14));
                            lArr1[i20 - 1] += Test.instanceCount;
                            switch (((((-24210) >>> 1) % 4) * 5) + 50) {
                                case 52 :
                                    Test.instanceCount += Test.instanceCount;
                                    iFld *= i23;
                                    Test.instanceCount += i24 ^ Test.iFld1;
                                    Test.bFld = Test.bFld;
                                    Test.instanceCount -= Test.instanceCount;
                                    Test.instanceCount *= iFld;
                                    lArr1[i20 - 1] += Test.iFld1;
                                    Test.iFld1 += i24 * i24;
                                    i21 = ((int) (Test.fFld));
                                    Test.iArrFld[i20 - 1] = i20;
                                    Test.iArrFld[i22 + 1] += Test.iFld1;
                                    lArr1[i22 - 1] += i25;
                                    Test.iArrFld[i24 - 1] -= i25;
                                    Test.instanceCount += i24;
                                    Test.fArrFld[i20] -= -250;
                                    break;
                                case 68 :
                                    if (Test.bFld)
                                        break;

                                    Test.instanceCount = ((long) (Test.fFld));
                                    Test.iFld1 += i24;
                                    Test.iFld1 -= ((int) (2.75298));
                                    Test.iFld1 = -5;
                                    Test.instanceCount %= -6L;
                                    s1 += ((short) (i24));
                                    Test.instanceCount >>= Test.iFld1;
                                    i25 = i22;
                                    try {
                                        i21 = iFld % 47693;
                                        i21 = i21 % i22;
                                        i21 = (-168) % Test.iArrFld[i22 - 1];
                                    } catch (ArithmeticException a_e) {
                                    }
                                    Test.instanceCount *= i25;
                                case 53 :
                                    i25 <<= i20;
                                    sArrFld[i22 + 1] = ((short) (i26));
                                    Test.instanceCount += i21;
                                    iFld *= ((int) (Test.instanceCount));
                                    Test.iFld1 = -31;
                                    Test.iArrFld[i22 + 1] = i22;
                                    byArr[i22 + 1] >>= ((byte) (Test.instanceCount));
                                    i26 = byFld;
                                    Test.instanceCount *= -85;
                                    Test.iArrFld[i24] = iFld;
                                    break;
                                case 56 :
                                    Test.fFld *= Test.instanceCount;
                                    break;
                            }
                            i23 += i24 * i22;
                            Test.instanceCount |= Test.instanceCount;
                            Test.fArrFld[i24 - 1] = iFld;
                            Test.fFld *= -8;
                            i26 += i24 | s1;
                            Test.iArrFld[i20 + 1] <<= i23;
                            switch (((((-2) >>> 1) % 8) * 5) + 59) {
                                case 69 :
                                case 61 :
                                    Test.fFld -= Test.instanceCount;
                                    if (true) {
                                        iFld += ((int) (Test.instanceCount));
                                        Test.iFld1 = 107;
                                        d1 = i26;
                                    } else if (Test.bFld) {
                                        i23 += i24 + i21;
                                    } else {
                                        Test.iArrFld = Test.iArrFld;
                                    }
                                    break;
                                case 93 :
                                    Test.fFld += ((i24 * Test.fFld) + Test.fFld) - i20;
                                    break;
                                case 97 :
                                    iFld -= ((int) (d1));
                                    break;
                                case 60 :
                                    lArr1[i24] %= -13L;
                                    break;
                                case 73 :
                                    Test.bFld = Test.bFld;
                                    break;
                                case 86 :
                                    i26 += i24 - i24;
                                    break;
                                case 87 :
                                    Test.instanceCount *= Test.instanceCount;
                                    break;
                            }
                        }
                        break;
                    case 34 :
                        Test.fFld += ((float) (d1));
                    case 35 :
                        byArr[i22] = ((byte) (iFld));
                        break;
                }
            }
        }
        FuzzerUtils.out.println((((("d1 i20 i21 = " + Double.doubleToLongBits(d1)) + ",") + i20) + ",") + i21);
        FuzzerUtils.out.println((((("i22 i23 i24 = " + i22) + ",") + i23) + ",") + i24);
        FuzzerUtils.out.println((((("i25 s1 i26 = " + i25) + ",") + s1) + ",") + i26);
        FuzzerUtils.out.println((((("bArr dArr lArr1 = " + FuzzerUtils.checkSum(bArr)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))) + ",") + FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println((((("Test.instanceCount Test.fFld iFld = " + Test.instanceCount) + ",") + Float.floatToIntBits(Test.fFld)) + ",") + iFld);
        FuzzerUtils.out.println((((("Test.bFld Test.iFld1 byFld = " + (Test.bFld ? 1 : 0)) + ",") + Test.iFld1) + ",") + byFld);
        FuzzerUtils.out.println((((("Test.fArrFld Test.iArrFld sArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))) + ",") + FuzzerUtils.checkSum(Test.iArrFld)) + ",") + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                {
                    final float ax$16 = Test.fFld;
                    final int ax$17 = i;
                    try {
                        BigDecimal ax$6 = null;
                        short[] ax$11 = new short[]{ ((short) (6607)), ((short) (30753)), ((short) (-17601)), ((short) (-25392)) };
                        short[] ax$13 = new short[]{ ((short) (-10975)), ((short) (14316)), ((short) (23397)), ((short) (-31080)), ((short) (7028)), ((short) (-14301)), ((short) (-21820)), ((short) (20911)), ((short) (-3052)) };
                        for (int ax$5 = -432; ax$5 < (-432 + 15814); ax$5 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                float ax$8 = ax$6.floatValue();
                                if (fFld != ax$8) {
                                    String ax$9 = String.format("Bad conversion:" + "got %g (%a)\texpected %g (%a)", fFld, fFld, ax$8, ax$8);
                                }
                            } catch (Throwable ax$10) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            Test.ax$0 = true;
                            _instance.mainTest(new String[]{ "s", "s", "s", "s", "s", "s" });
                            Test.ax$0 = false;
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$14 = 0; ax$14 < ax$13.length; ax$14 += 1) {
                                    ax$13[ax$14] = ((short) (ax$11[ax$14] * i));
                                }
                            } catch (Throwable ax$15) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        Test.fFld = ax$16;
                        i = ax$17;
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
}
