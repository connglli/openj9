// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 12L;

    public static double dFld = 2.23459;

    public static int iFld = -55349;

    public static float fFld = -6.783F;

    public static int iFld1 = -6321;

    public boolean bFld = false;

    public static volatile float fArrFld[] = new float[N];

    public long lArrFld[] = new long[N];

    public int iArrFld[] = new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 45.265F);
    }

    public static long vMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, int i7) {
        if (Test.ax$22) {
            final int ax$30 = Test.iFld;
            final int ax$29 = Test.iFld1;
            final long ax$28 = Test.vMeth1_check_sum;
            boolean[] ax$26 = new boolean[]{ true, true, false };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                ax$26[(iFld1 * 64) + iFld] = (vMeth1_check_sum & (1L << iFld)) != 0;
            } catch (Throwable ax$27) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            Test.vMeth1_check_sum = ax$28;
            Test.iFld1 = ax$29;
            Test.iFld = ax$30;
            return;
        }
        i6 *= ((int) (Test.dFld));
        vMeth1_check_sum += i6 + i7;
    }

    public static int iMeth() {
        int i5 = 44270;
        int i8 = 15383;
        int i9 = -65276;
        int i10 = -37;
        int i11 = -3;
        int i12 = 223;
        int i13 = -9792;
        int i14 = -209;
        int i15 = -63991;
        int i16 = 203;
        int iArr[] = new int[N];
        int iArr1[][] = new int[N][N];
        boolean b = true;
        long l1 = 7838632287241873356L;
        long l2 = -48351L;
        long lArr[] = new long[N];
        float f1 = 0.507F;
        byte by = -110;
        FuzzerUtils.init(iArr, 252);
        FuzzerUtils.init(lArr, 57L);
        FuzzerUtils.init(iArr1, 192);
        i5 = iArr[(i5 >>> 1) % N] |= iArr[(i5 >>> 1) % N];
        i5 += ++i5;
        {
            final int ax$39 = i12;
            final int ax$40 = i13;
            try {
                AtomicIntegerArray ax$32 = null;
                byte[] ax$36 = new byte[]{ ((byte) (-81)) };
                for (int ax$31 = -993; ax$31 < (-993 + 14119); ax$31 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$34 = 0; ax$34 < i12; ax$34++) {
                            ax$32.lazySet(ax$34, 123);
                        }
                    } catch (Throwable ax$35) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$22 = true;
                    vMeth1(-1259040499, -735453207);
                    Test.ax$22 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        ax$36[i13++] = ((byte) (0xff));
                    } catch (Throwable ax$38) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                i12 = ax$39;
                i13 = ax$40;
            }
        }
        vMeth1(i5, i5);
        for (i8 = 185; i8 > 3; i8--) {
            short s = 12785;
            if (b)
                break;

            iArr[i8 - 1] &= -12;
            i5 = s;
            l1 -= i9;
            for (i10 = 1; 3 > i10; ++i10) {
                iArr[i8] <<= i11;
            }
            f1 = Test.instanceCount;
            Test.instanceCount <<= i5;
            i5 = by;
            i5 -= ((int) (l1));
            i12 = 1;
            do {
                lArr = lArr;
                i9 -= 9517;
                iArr[i8 - 1] = ((int) (Test.instanceCount));
                iArr1 = iArr1;
                f1 += i12;
                try {
                    iArr1[i8][i8] = i9 / i11;
                    i11 = 75 / i5;
                    i11 = i10 / 69;
                } catch (ArithmeticException a_e) {
                }
                l2 ^= i5;
                i9 += i12 * i11;
                l2 = -64;
            } while ((++i12) < 3 );
            for (i13 = 1; i13 < 3; i13++) {
                lArr[i13 - 1] = i5;
                iArr1[i8][i8 - 1] = ((int) (Test.instanceCount));
                Test.instanceCount = i12;
                for (i15 = 1; 2 > i15; i15++) {
                    iArr[i15 - 1] <<= i8;
                    i16 -= ((int) (86L));
                    {
                        final int ax$9 = Test.iFld1;
                        final int ax$10 = i14;
                        try {
                            int[] ax$2 = new int[8];
                            int[] ax$4 = new int[]{ -590338612, -154698580, -32701439, -574420349, 226795168, -334224495, 873210926, 26063843 };
                            boolean ax$1 = false;
                            for (int ax$0 = -781; ax$0 < (-781 + 14638); ax$0 += 1) {
                                Test.AxOutputRedirectionHelper.redirect();
                                try {
                                    for (int ax$5 = 0; ax$5 < iFld1; ax$5++) {
                                        ax$2[ax$5] += 1;
                                        ax$4[ax$5] += 1;
                                    }
                                } catch (Throwable ax$6) {
                                } finally {
                                }
                                Test.AxOutputRedirectionHelper.recover();
                                if (!ax$1) {
                                    Test.dFld -= i12;
                                    ax$1 = true;
                                }
                                Test.AxOutputRedirectionHelper.redirect();
                                try {
                                    i14++;
                                } catch (Throwable ax$8) {
                                } finally {
                                }
                                Test.AxOutputRedirectionHelper.recover();
                            }
                        } finally {
                            Test.iFld1 = ax$9;
                            i14 = ax$10;
                        }
                    }
                    if (b) {
                        l2 = l1;
                        i16 <<= i13;
                        i5 += ((int) ((-133L) + (i15 * i15)));
                        i16 += i15 | ((long) (f1));
                    } else if (b) {
                        Test.dFld -= i12;
                    }
                }
            }
        }
        long meth_res = ((((((((((((((((i5 + i8) + i9) + (b ? 1 : 0)) + l1) + i10) + i11) + Float.floatToIntBits(f1)) + by) + i12) + l2) + i13) + i14) + i15) + i16) + FuzzerUtils.checkSum(iArr)) + FuzzerUtils.checkSum(lArr)) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth(int i, long l, float f) {
        int i1 = 5;
        int i2 = 14549;
        int i3 = 29149;
        int i4 = -38618;
        int i17 = -1;
        int i18 = -3;
        int i19 = -15604;
        int i20 = 159;
        int iArr2[] = new int[N];
        long l3 = 3L;
        long lArr1[] = new long[N];
        byte by1 = -102;
        boolean bArr[] = new boolean[N];
        float fArr[] = new float[N];
        FuzzerUtils.init(iArr2, 12);
        FuzzerUtils.init(lArr1, -28470L);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr, 14.798F);
        for (i1 = 8; i1 < 223; i1++) {
            for (i3 = 1; 3 > i3; i3++) {
                f += Integer.reverseBytes(iMeth());
                i4 = 66;
            }
            for (l3 = 3; 1 < l3; --l3) {
                f += Test.instanceCount;
                i <<= i17;
                f *= i4;
                f += l;
                for (i18 = 1; i18 < 2; ++i18) {
                    boolean b1 = false;
                    if (i19 != 0) {
                        vMeth_check_sum += (((((((((((((((i + l) + Float.floatToIntBits(f)) + i1) + i2) + i3) + i4) + l3) + i17) + i18) + i19) + i20) + by1) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(lArr1)) + FuzzerUtils.checkSum(bArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    l <<= i4;
                    iArr2[((int) (l3 + 1))] = ((int) (l));
                    i17 += i18 * i17;
                    i2 *= i2;
                    switch (((int) (((l3 % 10) * 5) + 96))) {
                        case 139 :
                            f *= ((float) (-2.63027));
                            l >>>= i;
                            i17 = i19;
                            switch (((int) (((l3 % 1) * 5) + 65))) {
                                case 67 :
                                    Test.instanceCount = i3;
                                    i2 = ((int) (l3));
                                    iArr2[i1] -= ((int) (-3L));
                                    try {
                                        i4 = i20 % 62174;
                                        Test.iFld = i20 % (-1467292938);
                                        i4 = iArr2[((int) (l3))] % (-22835);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    break;
                            }
                            l *= i17;
                            lArr1[i1] -= 1;
                            iArr2[((int) (l3 - 1))] <<= ((int) (Test.instanceCount));
                            bArr[i1 + 1] = b1;
                            l <<= i1;
                            l += 97;
                            l += ((long) (Test.dFld));
                            Test.iFld = -65171;
                        case 125 :
                            i += i18;
                            f *= by1;
                            {
                                final int ax$21 = i1;
                                try {
                                    byte[] ax$13 = new byte[5];
                                    FileOutputStream ax$14 = null;
                                    double[] ax$16 = new double[]{ 0.6608077578923401, 0.7742290875746671, 0.02013671661031735 };
                                    double[] ax$17 = new double[]{ 0.6040981931233775, 0.8545696351902841, 0.8947187709659625, 0.8696900555175554, 0.9748299523203888, 0.04646421331021244, 0.9642597946163901 };
                                    double[] ax$19 = new double[]{ 0.17266435739459585, 0.7882137575838282, 0.9970345661879982, 0.5851190530642175, 0.7807637341651855, 0.6810332626469842, 0.1555310497202037, 0.4153937655653879, 0.572753741181278 };
                                    boolean ax$12 = false;
                                    for (int ax$11 = -473; ax$11 < (-473 + 12071); ax$11 += 1) {
                                        Test.AxOutputRedirectionHelper.redirect();
                                        try {
                                            ax$14.write(ax$13, 0, ax$13.length);
                                        } catch (Throwable ax$15) {
                                        } finally {
                                        }
                                        Test.AxOutputRedirectionHelper.recover();
                                        if (!ax$12) {
                                            i17 -= i19;
                                            ax$12 = true;
                                        }
                                        Test.AxOutputRedirectionHelper.redirect();
                                        try {
                                            ax$19[i1] = ax$16[i1] * ax$17[i1];
                                        } catch (Throwable ax$20) {
                                        } finally {
                                        }
                                        Test.AxOutputRedirectionHelper.recover();
                                    }
                                } finally {
                                    i1 = ax$21;
                                }
                            }
                            Test.instanceCount = -1;
                            break;
                        case 97 :
                            i4 = i;
                            break;
                        case 111 :
                            i4 *= i19;
                            break;
                        case 127 :
                            i4 = -19;
                            break;
                        case 121 :
                            i20 = ((int) (1.21444));
                            break;
                        case 100 :
                            i -= 50530;
                            break;
                        case 106 :
                            Test.instanceCount *= l;
                            break;
                        case 103 :
                            iArr2[((int) (l3))] += i17;
                            break;
                        case 101 :
                            fArr[((int) (l3 - 1))] = i17;
                    }
                }
            }
        }
        vMeth_check_sum += (((((((((((((((i + l) + Float.floatToIntBits(f)) + i1) + i2) + i3) + i4) + l3) + i17) + i18) + i19) + i20) + by1) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(lArr1)) + FuzzerUtils.checkSum(bArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {
        int i21 = 0;
        int i22 = -18;
        int i23 = -1;
        int i24 = 46845;
        int i25 = 39809;
        int i26 = 52081;
        int i27 = -13;
        int i28 = -8;
        int i29 = 54468;
        int i30 = 38308;
        int iArr3[] = new int[N];
        double d = -47.14778;
        double dArr[] = new double[N];
        short s1 = -3468;
        byte by2 = 60;
        float f2 = 0.423F;
        long l4 = -32068L;
        FuzzerUtils.init(iArr3, 1);
        FuzzerUtils.init(dArr, 40.103454);
        vMeth(Test.iFld, Test.instanceCount, Test.fFld);
        for (i21 = 10; 221 > i21; i21 += 3) {
            for (i23 = 1; i23 < 72; ++i23) {
                i25 = 1;
                while ((++i25) < 2) {
                    Test.fArrFld = Test.fArrFld;
                    lArrFld[i23 + 1] = i25;
                    i24 = i22;
                }
            }
            for (i26 = 2; i26 < 72; i26++) {
                iArrFld[i21] = ((int) (1162334735L));
                Test.fArrFld = Test.fArrFld;
                lArrFld[i26 - 1] += Test.instanceCount;
                i24 = ((int) (d));
                s1 -= ((short) (i22));
                iArr3[i21] = i27;
                for (i28 = 1; i28 < 2; i28++) {
                    Test.instanceCount = by2;
                    lArrFld[i26 + 1] >>= s1;
                }
                Test.fFld += ((i26 * i27) + Test.instanceCount) - Test.fFld;
                i24 >>= i29;
                for (f2 = i21; f2 < 2; ++f2) {
                    i29 >>= ((int) (-4513224624270891469L));
                    Test.instanceCount = Test.iFld1;
                    lArrFld = lArrFld;
                    i24 += i28;
                    i24 |= i25;
                    Test.iFld = i25;
                    switch ((((3 >>> 1) % 4) * 5) + 1) {
                        case 4 :
                            Test.instanceCount += ((long) (((f2 * Test.instanceCount) + i27) - i29));
                            Test.iFld1 *= i27;
                            Test.fFld -= Test.instanceCount;
                            if (bFld) {
                                Test.instanceCount -= Test.instanceCount;
                                by2 = ((byte) (Test.instanceCount));
                            } else {
                                Test.iFld1 += ((int) (f2 * i29));
                                iArr3[((int) (f2 - 1))] *= ((int) (l4));
                                Test.iFld *= i23;
                                i24 = Test.iFld;
                                Test.iFld = i26;
                                lArrFld[i26 + 1] -= i24;
                                bFld = bFld;
                                iArrFld = iArr3;
                            }
                            break;
                        case 6 :
                            l4 += i22;
                            switch ((i26 % 1) + 110) {
                                case 110 :
                                    by2 = ((byte) (-97));
                                    Test.fFld /= ((long) (Test.dFld)) | 1;
                                    Test.instanceCount = i21;
                                    i24 = 7;
                                    Test.dFld -= d;
                                    bFld = bFld;
                                    i27 += ((int) (f2 * f2));
                                    break;
                            }
                            lArrFld[((int) (f2 - 1))] = ((long) (Test.fFld));
                            Test.instanceCount = i21;
                            bFld = false;
                            try {
                                i24 = 70 % i21;
                                i30 = 210241311 % iArr3[i26 + 1];
                                i27 = i24 / i24;
                            } catch (ArithmeticException a_e) {
                            }
                        case 3 :
                            l4 = i30;
                            i22 *= i26;
                            Test.iFld1 += ((int) (((long) (f2)) ^ Test.iFld1));
                            Test.iFld -= -2;
                            Test.fFld = i29;
                            lArrFld[((int) (f2 + 1))] += i21;
                            i22 += 21983;
                        case 10 :
                            Test.instanceCount -= Test.iFld1;
                            Test.instanceCount += ((long) (((f2 * i24) + i22) - Test.fFld));
                            bFld = bFld;
                            dArr[i26] -= Test.fFld;
                            Test.instanceCount -= i24;
                            i24 += ((int) (((f2 * s1) + Test.instanceCount) - i25));
                            d /= Test.instanceCount | 1;
                            d += -4;
                            i30 *= i28;
                            i27 -= ((int) (Test.dFld));
                            d -= i30;
                            iArr3 = iArr3;
                            lArrFld[i21] <<= -28;
                            break;
                    }
                    Test.iFld1 = i30;
                }
            }
        }
        FuzzerUtils.out.println((((("i21 i22 i23 = " + i21) + ",") + i22) + ",") + i23);
        FuzzerUtils.out.println((((("i24 i25 i26 = " + i24) + ",") + i25) + ",") + i26);
        FuzzerUtils.out.println((((("i27 d s1 = " + i27) + ",") + Double.doubleToLongBits(d)) + ",") + s1);
        FuzzerUtils.out.println((((("i28 i29 by2 = " + i28) + ",") + i29) + ",") + by2);
        FuzzerUtils.out.println((((("f2 i30 l4 = " + Float.floatToIntBits(f2)) + ",") + i30) + ",") + l4);
        FuzzerUtils.out.println((("iArr3 dArr = " + FuzzerUtils.checkSum(iArr3)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println((((("Test.instanceCount Test.dFld Test.iFld = " + Test.instanceCount) + ",") + Double.doubleToLongBits(Test.dFld)) + ",") + Test.iFld);
        FuzzerUtils.out.println((((("Test.fFld Test.iFld1 bFld = " + Float.floatToIntBits(Test.fFld)) + ",") + Test.iFld1) + ",") + (bFld ? 1 : 0));
        FuzzerUtils.out.println((((("Test.fArrFld lArrFld iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))) + ",") + FuzzerUtils.checkSum(lArrFld)) + ",") + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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

    static Boolean ax$22 = false;
}