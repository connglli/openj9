// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Test {
    public static final int N = 256;

    public static long instanceCount = -7069345726429820165L;

    public static byte byFld = 124;

    public static volatile short sFld = 4804;

    public static float fArrFld[] = new float[N];

    public static long lArrFld[][] = new long[N][N];

    public static volatile double dArrFld[] = new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 41.159F);
        FuzzerUtils.init(Test.lArrFld, 3038099632215441862L);
        FuzzerUtils.init(Test.dArrFld, 107.68551);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static int iMeth() {
        int i7 = 126;
        int i8 = -6256;
        int i9 = 30;
        int i10 = -12;
        int i11 = -164;
        int i12 = -13;
        int i13 = 45175;
        int iArr[] = new int[N];
        double d2 = -2.96564;
        double dArr[][] = new double[N][N];
        float f1 = 89.681F;
        boolean b1 = true;
        short s1 = -24863;
        byte byArr[] = new byte[N];
        long lArr[] = new long[N];
        FuzzerUtils.init(dArr, -2.9152);
        FuzzerUtils.init(byArr, ((byte) (110)));
        FuzzerUtils.init(iArr, 62672);
        FuzzerUtils.init(lArr, 11374L);
        i7 = i7;
        for (i8 = 210; i8 > 1; --i8) {
            try {
                i9 = (-21608) % i9;
                i7 = (-23) / i9;
                i9 = i9 / (-51433);
            } catch (ArithmeticException a_e) {
            }
            Test.instanceCount = i9;
            i7 ^= i7;
            dArr[i8][i8 - 1] -= d2;
            i10 = ((int) (f1));
            i10 += ((i8 * i8) + f1) - i10;
            Test.instanceCount += i8 * i8;
            i7 *= i9;
            i9 = ((int) (Test.instanceCount));
            i9 += (-6) + (i8 * i8);
            Test.byFld >>= ((byte) (i7));
            switch (((((-14) >>> 1) % 5) * 5) + 68) {
                case 82 :
                    for (i11 = 3; i11 > 1; i11 -= 2) {
                        i13 = 1;
                        do {
                            i7 += 194;
                            Test.instanceCount /= ((long) (f1)) | 1;
                            b1 = false;
                            b1 = true;
                            f1 = ((float) (d2));
                            i9 ^= i10;
                            i9 -= ((int) (-71.81973));
                            i12 += ((int) ((-2994455648L) + (i13 * i13)));
                            i9 = i8;
                            i7 = -8530;
                            i9 = i12;
                            f1 *= s1;
                        } while ((++i13) < 3 );
                        i9 += 126 + (i11 * i11);
                        i9 ^= ((int) (Test.instanceCount));
                        i12 -= Test.byFld;
                        byArr[i11 + 1] = ((byte) (i8));
                        i10 -= ((int) (f1));
                        i7 += ((i11 * i11) + i13) - i8;
                        iArr[i8] = i13;
                    }
                    f1 *= Test.byFld;
                    Test.instanceCount *= i9;
                case 84 :
                    lArr[i8 + 1] = i7;
                    break;
                case 83 :
                    i12 *= -10;
                    break;
                case 71 :
                    s1 -= ((short) (62402));
                    break;
                case 77 :
                default :
                    Test.fArrFld[i8 - 1] -= 199;
            }
        }
        long meth_res = (((((((((((((i7 + i8) + i9) + Double.doubleToLongBits(d2)) + i10) + Float.floatToIntBits(f1)) + i11) + i12) + i13) + (b1 ? 1 : 0)) + s1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))) + FuzzerUtils.checkSum(byArr)) + FuzzerUtils.checkSum(iArr)) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth1(double d1, boolean b) {
        if (Test.ax$0) {
            String[][][] ax$1 = new String[][][]{ new String[][]{ new String[]{ "s" }, new String[]{ "s", "s", "s", "s", "s", "s", "s", "s", "s" } }, new String[][]{ new String[]{ "s", "s", "s", "s", "s" }, new String[]{ "s", "s", "s", "s" } }, new String[][]{ new String[]{ "s", "s", "s", "s" }, new String[]{ "s", "s", "s", "s" } } };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                ax$1[1][0][0] = "bad store";
            } catch (Throwable ax$2) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        int i1 = 61576;
        int i2 = 56652;
        int i3 = -12;
        int i4 = 171;
        int i5 = 9927;
        int i6 = 1513;
        int i14 = -56517;
        int i15 = -41398;
        int i16 = -55986;
        int iArr1[] = new int[N];
        float f = -23.489F;
        double d3 = 46.114535;
        FuzzerUtils.init(iArr1, -8);
        for (i1 = 2; i1 < 185; ++i1) {
            for (i3 = 1; i3 < 3; i3++) {
                for (i5 = 1; i5 < 2; i5++) {
                    long l1 = 52L;
                    f += i5;
                    iMeth();
                    iArr1[i3] = i4;
                    l1 -= i5;
                    i6 = ((int) (f));
                    i2 += i3;
                    Test.lArrFld[i3 - 1][i3 - 1] = ((long) (-1.66798));
                    if (b)
                        continue;

                }
                i6 += i3 + i3;
                i2 = i6;
                for (i14 = 1; 2 > i14; i14++) {
                    i15 -= Test.sFld;
                    switch ((i3 % 2) + 41) {
                        case 41 :
                            Test.instanceCount -= 1L;
                            f *= Test.instanceCount;
                            switch (((i1 % 9) * 5) + 116) {
                                case 145 :
                                    i6 *= i4;
                                    break;
                                case 154 :
                                    i15 = i4;
                                    i15 += i14 | Test.instanceCount;
                                    iArr1[i14] += -27040;
                                    i2 = i1;
                                    iArr1[(i14 >>> 1) % N] += i1;
                                    i15 = i3;
                                    iArr1[i3] -= i14;
                                    i16 >>= i15;
                                    i15 += i14 - Test.byFld;
                                    Test.instanceCount -= i15;
                                    i6 -= ((int) (f));
                                    break;
                                case 155 :
                                    d3 = i2;
                                    if (b)
                                        break;

                                    iArr1[i3] = ((int) (Test.instanceCount));
                                    Test.instanceCount ^= i15;
                                    f += i14;
                                    Test.lArrFld[i14][i3 + 1] *= i2;
                                    break;
                                case 117 :
                                    i2 -= i1;
                                    break;
                                case 148 :
                                case 157 :
                                    iArr1[i14 - 1] >>= i3;
                                case 138 :
                                    i16 >>>= 17672;
                                    break;
                                case 161 :
                                    Test.instanceCount -= i2;
                                    break;
                                case 156 :
                                    Test.sFld = ((short) (-27647));
                            }
                            break;
                        case 42 :
                            if (false)
                                continue;

                            break;
                    }
                }
            }
        }
        vMeth1_check_sum += ((((((((((((Double.doubleToLongBits(d1) + (b ? 1 : 0)) + i1) + i2) + i3) + i4) + i5) + i6) + Float.floatToIntBits(f)) + i14) + i15) + i16) + Double.doubleToLongBits(d3)) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(long l) {
        int i = 6;
        int i17 = -6474;
        int i18 = 5;
        int i19 = 112;
        int i20 = 13;
        int i21 = -5;
        int i22 = 95;
        int iArr2[] = new int[N];
        double d = 0.63138;
        short s = -3134;
        short sArr[] = new short[N];
        boolean b2 = true;
        boolean bArr[] = new boolean[N];
        float f2 = -10.893F;
        FuzzerUtils.init(iArr2, -49981);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(sArr, ((short) (20223)));
        i -= ((int) (Math.sqrt(Math.abs(d))));
        s = ((short) (i * ((i--) * (i + 0))));
        {
            final long ax$15 = Test.vMeth_check_sum;
            final int ax$16 = i20;
            final long ax$17 = l;
            try {
                boolean ax$5 = new Boolean(true);
                char[] ax$9 = new char[]{ ((char) (0xf3f4)) };
                char[] ax$11 = new char[]{ '⿾', '', '䐂', '?', '鋚', '⒲', '㳂', '奜', '鱏' };
                for (int ax$3 = -38; ax$3 < (-38 + 9456); ax$3 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if (vMeth_check_sum != l) {
                            ax$5 = true;
                        }
                    } catch (Throwable ax$7) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$0 = true;
                    vMeth1(0.10238028223971007, true);
                    Test.ax$0 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        long ax$12 = ((short) (ax$9[i20]));
                        long ax$13 = ((short) (ax$11[i20]));
                        l += Math.abs(ax$12 - ax$13);
                    } catch (Throwable ax$14) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                Test.vMeth_check_sum = ax$15;
                i20 = ax$16;
                l = ax$17;
            }
        }
        vMeth1(d, b2);
        i -= i;
        for (i17 = 5; i17 < 102; i17++) {
            i19 >>= Test.sFld;
            Test.byFld += ((byte) (i17 - f2));
            Test.dArrFld[i17 - 1] = d;
            i20 = 1;
            do {
                f2 -= -91;
                Test.sFld += ((short) (((i20 * i17) + Test.instanceCount) - i18));
                i += i20;
                try {
                    i19 = i / 48700;
                    i19 = iArr2[i17 + 1] / 1104;
                    i = i18 / iArr2[i17];
                } catch (ArithmeticException a_e) {
                }
                try {
                    i18 = 44654 % i20;
                    i = 55 / iArr2[i17 - 1];
                    iArr2[i20] = i18 / i17;
                } catch (ArithmeticException a_e) {
                }
                i += i20 | i19;
                for (i21 = i17; i21 < 1; ++i21) {
                    i18 += ((int) ((-1.679F) + (i21 * i21)));
                    i22 = ((int) (Test.instanceCount));
                    i19 = ((int) (Test.instanceCount));
                    d -= i19;
                    bArr[i20 - 1] = b2;
                    if (b2) {
                        i22 += ((i21 * i) + i21) - f2;
                        i22 = i20;
                        iArr2 = iArr2;
                        if (b2) {
                            i *= i20;
                            i19 += ((int) (l));
                        }
                        iArr2[i20] = i;
                        iArr2[i21] = i18;
                        switch ((i21 % 2) + 31) {
                            case 31 :
                                sArr[i21] *= ((short) (i20));
                                Test.dArrFld[i17] = i17;
                                i18 -= ((int) (l));
                            case 32 :
                                i22 += 64516 + (i21 * i21);
                                break;
                            default :
                                if (i19 != 0) {
                                    vMeth_check_sum += (((((((((((((l + i) + Double.doubleToLongBits(d)) + s) + (b2 ? 1 : 0)) + i17) + i18) + i19) + Float.floatToIntBits(f2)) + i20) + i21) + i22) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(bArr)) + FuzzerUtils.checkSum(sArr);
                                    return;
                                }
                                if (i19 != 0) {
                                    vMeth_check_sum += (((((((((((((l + i) + Double.doubleToLongBits(d)) + s) + (b2 ? 1 : 0)) + i17) + i18) + i19) + Float.floatToIntBits(f2)) + i20) + i21) + i22) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(bArr)) + FuzzerUtils.checkSum(sArr);
                                    return;
                                }
                        }
                        vMeth_check_sum += (((((((((((((l + i) + Double.doubleToLongBits(d)) + s) + (b2 ? 1 : 0)) + i17) + i18) + i19) + Float.floatToIntBits(f2)) + i20) + i21) + i22) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(bArr)) + FuzzerUtils.checkSum(sArr);
                        return;
                    }
                }
            } while ((++i20) < 6 );
        }
        vMeth_check_sum += (((((((((((((l + i) + Double.doubleToLongBits(d)) + s) + (b2 ? 1 : 0)) + i17) + i18) + i19) + Float.floatToIntBits(f2)) + i20) + i21) + i22) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(bArr)) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {
        int i23 = -139;
        vMeth(Test.instanceCount);
        i23 += i23;
        i23 &= i23;
        FuzzerUtils.out.println("i23 = " + i23);
        FuzzerUtils.out.println((((("Test.instanceCount Test.byFld Test.sFld = " + Test.instanceCount) + ",") + Test.byFld) + ",") + Test.sFld);
        FuzzerUtils.out.println((((("Test.fArrFld Test.lArrFld Test.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))) + ",") + FuzzerUtils.checkSum(Test.lArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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