// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 244L;

    public static int iFld = 24261;

    public static volatile int iFld1 = -26;

    public static double dFld = 12.109326;

    public float fFld = 90.841F;

    public static short sFld = -19569;

    public static int iFld2 = -52;

    public static int iArrFld[] = new int[N];

    public static short sArrFld[][] = new short[N][N];

    public static float fArrFld[] = new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 5);
        FuzzerUtils.init(Test.sArrFld, ((short) (-2255)));
        FuzzerUtils.init(Test.fArrFld, 28.12F);
    }

    public static long vMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {
        int i1 = 4384;
        int i2 = -14597;
        int i3 = 29;
        int i4 = -159;
        int iArr[] = new int[N];
        byte by = 33;
        double d1 = 1.4121;
        float f = -111.205F;
        long lArr[] = new long[N];
        FuzzerUtils.init(lArr, 2604239628L);
        FuzzerUtils.init(iArr, -6);
        i1 = 1;
        while ((++i1) < 229) {
            Test.iFld += i1;
            Test.iArrFld[i1] += Test.iFld;
            for (i2 = 1; i2 < 3; i2++) {
                Test.iFld *= i1;
                i4 = 1;
                while ((++i4) < 2) {
                    lArr[i4] = Test.instanceCount;
                    i3 -= i3;
                    Test.iFld >>= i3;
                    i3 -= i1;
                    Test.instanceCount -= i2;
                    by += ((byte) (((i4 * i1) + i3) - i4));
                    switch (((i4 % 3) * 5) + 21) {
                        case 28 :
                            i3 -= by;
                            break;
                        case 30 :
                            i3 *= 108;
                            Test.instanceCount = ((long) (d1));
                            Test.iFld += ((int) (2992847505L + (i4 * i4)));
                            i3 <<= Test.iFld;
                            i3 *= ((int) (Test.instanceCount));
                            i3 *= ((int) (Test.instanceCount));
                            Test.iFld *= i1;
                        case 26 :
                            Test.iFld -= Test.iFld;
                            f = Test.instanceCount;
                            i3 = i3;
                            i3 = ((int) (-57.109709));
                            f += i3;
                            Test.instanceCount += ((i4 * i1) + f) - i4;
                            break;
                        default :
                            Test.iArrFld[i4 + 1] &= i2;
                            Test.iFld *= Test.iFld;
                            f -= i2;
                            Test.instanceCount = i2;
                            f += i4;
                            Test.instanceCount -= Test.iFld;
                            Test.iFld += i4 | i1;
                            Test.instanceCount += Test.instanceCount;
                            Test.iArrFld[i4] = Test.iFld1;
                            Test.iArrFld = iArr;
                    }
                } 
            }
        } 
        vMeth1_check_sum += (((((((i1 + i2) + i3) + i4) + by) + Double.doubleToLongBits(d1)) + Float.floatToIntBits(f)) + FuzzerUtils.checkSum(lArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i, double d) {
        int i5 = 115;
        int i6 = -74;
        int i7 = -54;
        int i8 = 11;
        int i9 = 166;
        int i10 = 44;
        int i11 = -34;
        int i12 = -6;
        int i13 = 26715;
        int i14 = 250;
        {
            final int ax$5 = i12;
            try {
                int[] ax$2 = new int[]{ 1, 3 };
                byte[] ax$3 = new byte[]{ 0, -1, -2, -3, -4 };
                for (int ax$0 = -760; ax$0 < (-760 + 18581); ax$0 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        ax$2[i12] = ax$3[2];
                    } catch (Throwable ax$4) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                i12 = ax$5;
            }
        }
        int iArr1[][] = new int[N][N];
        double d2 = 0.8891;
        double dArr[] = new double[N];
        boolean b = false;
        float f1 = 0.142F;
        short s = 13113;
        long l = 2658754787190080462L;
        long lArr1[][] = new long[N][N];
        FuzzerUtils.init(iArr1, -123);
        FuzzerUtils.init(dArr, 73.12339);
        FuzzerUtils.init(lArr1, -35726L);
        vMeth1();
        Test.iFld1 *= ((int) (d));
        for (i5 = 1; i5 < 121; ++i5) {
            for (i7 = 5; 1 < i7; i7--) {
                iArr1 = iArr1;
                Test.instanceCount += i7 + Test.iFld;
                for (d2 = 1; d2 < 2; d2++) {
                    if (b)
                        break;

                    i6 = -14;
                    dArr[((int) (d2))] = 48166;
                }
                Test.iFld1 /= ((int) (Test.instanceCount | 1));
                f1 += (-2) + (i7 * i7);
                Test.sArrFld[i5 + 1][i7] -= ((short) (i9));
                Test.iFld1 -= ((int) (f1));
                Test.iFld = i7;
                Test.iFld1 = ((int) (f1));
                i6 += ((i7 * Test.instanceCount) + i7) - Test.instanceCount;
                lArr1[i5 - 1] = lArr1[i5 + 1];
                d -= i7;
                for (i10 = 1; i10 < 2; i10++) {
                    i6 <<= i5;
                    Test.instanceCount = i7;
                    i8 = i10;
                    Test.instanceCount -= i6;
                    s = ((short) (4));
                    i12 += i10;
                }
                i6 -= ((int) (-65.883F));
                b = b;
            }
            i9 &= ((int) (Test.instanceCount));
            if (b) {
                Test.iFld1 = s;
                i8 -= i7;
            } else {
                if (false)
                    break;

                i13 = 5;
                do {
                    for (l = 1; l < 1; ++l) {
                        i += i9;
                        f1 += ((l * l) + f1) - l;
                    }
                } while ((--i13) > 0 );
            }
        }
        long meth_res = ((((((((((((((((((i + Double.doubleToLongBits(d)) + i5) + i6) + i7) + i8) + Double.doubleToLongBits(d2)) + i9) + (b ? 1 : 0)) + Float.floatToIntBits(f1)) + i10) + i11) + s) + i12) + i13) + l) + i14) + FuzzerUtils.checkSum(iArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth() {
        int i15 = 13;
        int i16 = -32;
        int i17 = -110;
        int i18 = 48724;
        int i19 = -1;
        {
            final int ax$34 = Test.iFld;
            try {
                int[] ax$30 = new int[]{ 0xf1f2f3f4 };
                int[] ax$32 = new int[]{ -1443625813 };
                for (int ax$29 = -124; ax$29 < (-124 + 2749); ax$29 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (; iFld < (ax$32.length - 4); iFld += 4) {
                            ax$32[iFld + 0] = ax$30[iFld + 0] << 0;
                            ax$32[iFld + 1] = ax$30[iFld + 1] << 1;
                            ax$32[iFld + 2] = ax$30[iFld + 2] << 2;
                            ax$32[iFld + 3] = ax$30[iFld + 3] << 3;
                        }
                    } catch (Throwable ax$33) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                Test.iFld = ax$34;
            }
        }
        int i20 = -243;
        int i21 = -13;
        int i22 = -156;
        short s1 = 4121;
        float f2 = -44.894F;
        byte by1 = 40;
        boolean b1 = false;
        double dArr1[] = new double[N];
        long lArr2[] = new long[N];
        FuzzerUtils.init(dArr1, 58.18946);
        FuzzerUtils.init(lArr2, -10L);
        iMeth(Test.iFld1, Test.dFld);
        Test.fArrFld[(Test.iFld1 >>> 1) % N] = Test.iFld1;
        for (i15 = 9; i15 < 208; i15++) {
            if (Test.iFld1 != 0) {
                vMeth_check_sum += ((((((((((((i15 + i16) + i17) + i18) + i19) + s1) + Float.floatToIntBits(f2)) + by1) + i20) + i21) + i22) + (b1 ? 1 : 0)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1))) + FuzzerUtils.checkSum(lArr2);
                return;
            }
            Test.iFld += Test.iFld1;
            Test.iFld += i15;
            i16 *= Test.iFld;
            dArr1[i15 + 1] = 107.104841;
            Test.iFld += ((i15 * Test.iFld) + Test.instanceCount) - i16;
            for (i17 = 1; i17 < 3; ++i17) {
                i19 = 1;
                while ((i19 += 3) < 2) {
                    lArr2[i15 + 1] = i17;
                    i16 = i15;
                    s1 += ((short) (f2));
                    by1 <<= ((byte) (Test.instanceCount));
                    if (i15 != 0) {
                        vMeth_check_sum += ((((((((((((i15 + i16) + i17) + i18) + i19) + s1) + Float.floatToIntBits(f2)) + by1) + i20) + i21) + i22) + (b1 ? 1 : 0)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1))) + FuzzerUtils.checkSum(lArr2);
                        return;
                    }
                    Test.iFld1 += i19;
                    Test.dFld -= f2;
                    Test.sArrFld[i19 - 1][i19 + 1] = ((short) (i19));
                    Test.iFld1 &= Test.iFld1;
                    Test.instanceCount += i19;
                    Test.iFld += ((i19 * f2) + Test.instanceCount) - s1;
                } 
                Test.instanceCount <<= Test.instanceCount;
                i16 += ((i17 * i15) + f2) - i17;
            }
            i20 = 1;
            while ((++i20) < 3) {
                switch (((i15 % 1) * 5) + 29) {
                    case 31 :
                        Test.iFld1 = i18;
                        for (i21 = 1; i21 < 1; i21++) {
                            i16 = 8;
                            Test.iArrFld[i15] = Test.iFld;
                            Test.iFld += i21;
                            i22 ^= Test.iFld1;
                            i22 *= i18;
                            Test.instanceCount += ((i21 * f2) + i20) - i17;
                            b1 = b1;
                            if (i21 != 0) {
                                vMeth_check_sum += ((((((((((((i15 + i16) + i17) + i18) + i19) + s1) + Float.floatToIntBits(f2)) + by1) + i20) + i21) + i22) + (b1 ? 1 : 0)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1))) + FuzzerUtils.checkSum(lArr2);
                                return;
                            }
                            b1 = b1;
                        }
                        break;
                    default :
                        i18 += ((int) (Test.instanceCount));
                }
            } 
        }
        vMeth_check_sum += ((((((((((((i15 + i16) + i17) + i18) + i19) + s1) + Float.floatToIntBits(f2)) + by1) + i20) + i21) + i22) + (b1 ? 1 : 0)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1))) + FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {
        if (Test.ax$6) {
            final int ax$12 = Test.iFld;
            AtomicIntegerArray ax$7 = null;
            AtomicIntegerArray ax$9 = null;
            Test.AxOutputRedirectionHelper.redirect();
            try {
                for (int ax$10 = 0; ax$10 < iFld; ax$10++) {
                    ax$7.set(ax$10, -1);
                    ax$9.set(ax$10, -1);
                }
            } catch (Throwable ax$11) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            Test.iFld = ax$12;
            return;
        }
        double d3 = -2.111328;
        double dArr2[] = new double[N];
        int i23 = 247;
        int i24 = -88;
        int i25 = -8;
        int i26 = 3;
        int i27 = -1903;
        int i28 = -102;
        boolean b2 = true;
        boolean bArr[] = new boolean[N];
        byte by2 = -67;
        long lArr3[] = new long[N];
        FuzzerUtils.init(lArr3, -6L);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(dArr2, 0.125626);
        vMeth();
        lArr3[(Test.iFld >>> 1) % N] -= Test.iFld1;
        Test.iArrFld[((-25) >>> 1) % N] -= ((int) (Test.instanceCount));
        Test.dFld *= Test.instanceCount;
        Test.instanceCount *= ((long) (Test.dFld));
        Test.iFld1 = Test.iFld1;
        for (d3 = 10; d3 < 207; ++d3) {
            Test.iFld += ((int) (d3));
            for (i24 = ((int) (d3)); i24 < 26; ++i24) {
                i25 += i25;
                Test.iFld1 += i24 - Test.iFld1;
                Test.instanceCount = i23;
                Test.dFld -= i24;
                if (false)
                    continue;

                for (i26 = 1; i26 > 1; i26--) {
                    Test.dFld = Test.instanceCount;
                    Test.dFld += Test.instanceCount;
                    Test.iFld -= ((int) (Test.instanceCount));
                    Test.iArrFld[((int) (d3 + 1))] |= ((int) (Test.instanceCount));
                    bArr[(i27 >>> 1) % N] = b2;
                    Test.iArrFld[i24 - 1] >>>= i24;
                    Test.iFld1 = i24;
                    Test.iFld *= i24;
                    Test.iArrFld[((int) (d3 - 1))] -= ((int) (fFld));
                    i23 += ((int) (Test.instanceCount));
                    switch (((i24 % 5) * 5) + 20) {
                        case 27 :
                        case 22 :
                            Test.instanceCount -= Test.iFld1;
                            Test.iFld <<= by2;
                            Test.instanceCount *= by2;
                            Test.instanceCount += i26 - Test.instanceCount;
                            if (b2) {
                                i25 += Test.iFld;
                                Test.iFld += ((i26 * Test.sFld) + Test.iFld) - fFld;
                                Test.instanceCount = Test.instanceCount;
                                Test.iFld1 <<= i27;
                                i23 *= Test.iFld;
                                try {
                                    i27 = (-28098) / Test.iFld2;
                                    Test.iFld = i27 % (-991473784);
                                    i25 = Test.iFld / (-185);
                                } catch (ArithmeticException a_e) {
                                }
                            } else {
                                Test.iFld2 += ((int) (fFld));
                                i25 -= by2;
                                Test.instanceCount -= Test.instanceCount;
                                Test.iFld1 += ((i26 * Test.iFld) + Test.instanceCount) - Test.instanceCount;
                                i27 *= i27;
                                i27 = i24;
                                Test.iFld1 = i24;
                                dArr2[((int) (d3))] += i25;
                                i27 += i26 | Test.iFld1;
                            }
                            i23 <<= i27;
                            Test.iArrFld[i26 + 1] &= i24;
                            i23 += ((i26 * Test.instanceCount) + i27) - i24;
                            try {
                                Test.iArrFld[((int) (d3 + 1))] = Test.iArrFld[i26 + 1] / i25;
                                Test.iFld2 = Test.iFld2 % Test.iArrFld[i24];
                                i27 = i27 % Test.iFld2;
                            } catch (ArithmeticException a_e) {
                            }
                            Test.iFld2 -= ((int) (Test.instanceCount));
                            i25 = ((int) (-10.83F));
                            Test.instanceCount -= ((long) (d3));
                        case 36 :
                            i23 = Test.iFld;
                            Test.iFld1 = 5;
                            Test.instanceCount += ((i26 * by2) + i27) - fFld;
                            i25 = ((int) (Test.instanceCount));
                            fFld += ((i26 * Test.iFld2) + i25) - Test.iFld;
                            i28 -= ((int) (103.716F));
                            break;
                        case 26 :
                            Test.instanceCount ^= i27;
                            if (b2)
                                break;

                            by2 ^= ((byte) (Test.instanceCount));
                            Test.instanceCount ^= i28;
                            i23 = i26;
                            Test.iArrFld = Test.iArrFld;
                            break;
                        case 38 :
                        default :
                            Test.iFld2 = i28;
                            Test.instanceCount = by2;
                            Test.instanceCount -= ((long) (fFld));
                            Test.iFld >>= i27;
                            switch ((i24 % 2) + 33) {
                                case 33 :
                                    Test.instanceCount = Test.instanceCount;
                                    Test.dFld += Test.iFld2;
                                    Test.fArrFld[i24 + 1] *= i24;
                                    i23 <<= ((int) (Test.instanceCount));
                                    dArr2[((int) (d3))] += i24;
                                case 34 :
                                    Test.dFld += i28;
                                    break;
                                default :
                                    Test.instanceCount = i28;
                            }
                    }
                }
            }
        }
        FuzzerUtils.out.println((((("d3 i23 i24 = " + Double.doubleToLongBits(d3)) + ",") + i23) + ",") + i24);
        FuzzerUtils.out.println((((("i25 i26 i27 = " + i25) + ",") + i26) + ",") + i27);
        FuzzerUtils.out.println((((("b2 by2 i28 = " + (b2 ? 1 : 0)) + ",") + by2) + ",") + i28);
        FuzzerUtils.out.println((((("lArr3 bArr dArr2 = " + FuzzerUtils.checkSum(lArr3)) + ",") + FuzzerUtils.checkSum(bArr)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr2)));
        FuzzerUtils.out.println((((("Test.instanceCount Test.iFld Test.iFld1 = " + Test.instanceCount) + ",") + Test.iFld) + ",") + Test.iFld1);
        FuzzerUtils.out.println((((("Test.dFld fFld Test.sFld = " + Double.doubleToLongBits(Test.dFld)) + ",") + Float.floatToIntBits(fFld)) + ",") + Test.sFld);
        FuzzerUtils.out.println((((("Test.iFld2 Test.iArrFld Test.sArrFld = " + Test.iFld2) + ",") + FuzzerUtils.checkSum(Test.iArrFld)) + ",") + FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                {
                    final int ax$25 = Test.iFld1;
                    final int ax$26 = Test.iFld;
                    final int ax$27 = Test.iFld2;
                    final int ax$28 = i;
                    try {
                        int[] ax$14 = new int[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
                        for (int ax$13 = -815; ax$13 < (-815 + 12109); ax$13 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$17 = 0; ax$17 < iFld2;) {
                                    int ax$18 = ax$14[ax$17];
                                    iFld1 += ax$18;
                                    ++ax$17;
                                    ax$14[ax$17] = ax$18;
                                }
                            } catch (Throwable ax$19) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            Test.ax$6 = true;
                            _instance.mainTest(new String[]{ "s", "s", "s", "s" });
                            Test.ax$6 = false;
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$22 = 0; ax$22 < iFld; ax$22++) {
                                    for (int ax$23 = 0; ax$23 < 10; ax$23++) {
                                        i++;
                                    }
                                }
                            } catch (Throwable ax$24) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        Test.iFld1 = ax$25;
                        Test.iFld = ax$26;
                        Test.iFld2 = ax$27;
                        i = ax$28;
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

    static Boolean ax$6 = false;
}
