// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test {
    public static final int N = 256;

    public static volatile long instanceCount = -27734L;

    public volatile int iFld = -8;

    public static boolean bFld = false;

    public static volatile byte byFld = 48;

    public static double dFld = -1.129969;

    public short sFld = -16720;

    public static volatile int iArrFld[] = new int[N];

    public static float fArrFld[] = new float[N];

    public static boolean bArrFld[] = new boolean[N];

    public long lArrFld[] = new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -57243);
        FuzzerUtils.init(Test.fArrFld, -51.288F);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long sMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2) {
        int i3 = 44351;
        int i4 = -58066;
        int i5 = -12;
        int i6 = 206;
        float f = -123.6F;
        double d1 = 2.120147;
        double d2 = 1.46749;
        long l2 = 140L;
        byte by = 2;
        boolean b = true;
        short s1 = -7217;
        for (i3 = 2; i3 < 121; i3 += 3) {
            for (i5 = 1; i5 < 13; i5 += 2) {
                f = 3;
                do {
                    Test.instanceCount >>>= i4;
                    i6 >>= ((int) (Test.instanceCount));
                    if (b) {
                        i6 += ((int) (d1));
                        Test.iArrFld[i3 - 1] -= ((int) (d2));
                        Test.instanceCount -= i4;
                        Test.instanceCount = i4;
                        i2 = i5;
                        Test.instanceCount = i4;
                        i6 += ((int) (f - i3));
                        {
                            final int ax$10 = i2;
                            final int ax$11 = i3;
                            final int ax$12 = i6;
                            try {
                                int[] ax$3 = new int[]{ 555198528, 464534435, 81919029, 1277814721, -1329885757 };
                                boolean ax$1 = false;
                                for (int ax$0 = -807; ax$0 < (-807 + 1334); ax$0 += 1) {
                                    Test.AxOutputRedirectionHelper.redirect();
                                    try {
                                        while ((ax$3[i6] != i2) & (i2 < i6)) {
                                            if ((i3 % 20) == 19) {
                                            }
                                            i3++;
                                            i2++;
                                        } 
                                    } catch (Throwable ax$7) {
                                    } finally {
                                    }
                                    Test.AxOutputRedirectionHelper.recover();
                                    if (!ax$1) {
                                        d1 = i5;
                                        ax$1 = true;
                                    }
                                    Test.AxOutputRedirectionHelper.redirect();
                                    try {
                                        if (i3 != 4) {
                                        }
                                    } catch (Throwable ax$9) {
                                    } finally {
                                    }
                                    Test.AxOutputRedirectionHelper.recover();
                                }
                            } finally {
                                i2 = ax$10;
                                i3 = ax$11;
                                i6 = ax$12;
                            }
                        }
                    } else if (b) {
                        d2 -= i2;
                        i6 += i3;
                        l2 += ((long) (d2));
                        try {
                            i6 = i2 % i4;
                            i6 = 38840401 % Test.iArrFld[i3];
                            i6 = Test.iArrFld[i5] / (-1437932628);
                        } catch (ArithmeticException a_e) {
                        }
                        Test.iArrFld[i5 - 1] += ((int) (l2));
                        l2 += ((long) (((long) (f)) ^ i6));
                    } else if (false) {
                        i4 >>= ((int) (l2));
                        i2 = ((int) (208L));
                        i2 -= by;
                        Test.instanceCount -= i5;
                        Test.fArrFld = Test.fArrFld;
                        if (b)
                            break;

                        Test.bArrFld[i3 - 1] = b;
                        Test.fArrFld[((int) (f))] += -29560;
                        i6 += ((int) (f));
                    } else {
                        i4 -= ((int) (f));
                        i4 += ((int) (-4500928907393429836L));
                        Test.iArrFld[i3 + 1] *= i5;
                        by = ((byte) (d2));
                    }
                    s1 += ((short) (3 + (f * f)));
                    i4 += i3;
                    i6 = i6;
                    i6 -= i5;
                } while ((--f) > 0 );
            }
        }
        long meth_res = ((((((((((i2 + i3) + i4) + i5) + i6) + Float.floatToIntBits(f)) + Double.doubleToLongBits(d1)) + Double.doubleToLongBits(d2)) + l2) + by) + (b ? 1 : 0)) + s1;
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth(int i1) {
        double d = 48.62698;
        short s = -31273;
        float f1 = 102.1019F;
        int i7 = 13;
        int i8 = -26282;
        int i9 = 32;
        int i10 = -25565;
        int i11 = -60307;
        int i12 = -37083;
        boolean b1 = false;
        long lArr[] = new long[N];
        FuzzerUtils.init(lArr, 6680826327712400974L);
        d += (s++) + 55384L;
        iMeth(i1);
        Test.instanceCount -= Test.instanceCount;
        Test.instanceCount = i1;
        Test.instanceCount += Test.instanceCount;
        f1 *= i1;
        i1 -= ((int) (d));
        Test.instanceCount %= i1 | 1;
        for (i7 = 10; 179 > i7; ++i7) {
            switch ((((-14) >>> 1) % 10) + 98) {
                case 98 :
                    if (b1) {
                        for (i9 = 1; i9 < 3; ++i9) {
                            i10 = ((int) (d));
                            i8 += i9;
                            f1 += i9;
                            i10 *= ((int) (2.195F));
                            switch ((i9 % 6) + 96) {
                                case 96 :
                                    Test.instanceCount += i9;
                                    i10 -= s;
                                    for (i11 = 1; i11 < 2; i11++) {
                                        i10 -= i11;
                                        i8 = i12;
                                        i1 -= ((int) (d));
                                        Test.instanceCount *= Test.instanceCount;
                                        i10 += i11 ^ i10;
                                        i8 <<= i9;
                                        f1 -= i12;
                                        Test.iArrFld = Test.iArrFld;
                                        Test.instanceCount *= i1;
                                    }
                                    d += Test.instanceCount;
                                    i10 = 0;
                                    i1 *= i1;
                                    Test.fArrFld[i9 + 1] += i10;
                                    lArr[i7] += i1;
                                    i1 *= i12;
                                    Test.instanceCount = i12;
                                case 97 :
                                    lArr[i7 - 1] |= i7;
                                case 98 :
                                case 99 :
                                    if (i1 != 0) {
                                        vMeth_check_sum += ((((((((((i1 + Double.doubleToLongBits(d)) + s) + Float.floatToIntBits(f1)) + i7) + i8) + i9) + i10) + i11) + i12) + (b1 ? 1 : 0)) + FuzzerUtils.checkSum(lArr);
                                        return;
                                    }
                                    break;
                                case 100 :
                                    Test.instanceCount = i10;
                                    break;
                                case 101 :
                                    b1 = b1;
                                default :
                                    Test.iArrFld[i9 + 1] -= i11;
                            }
                        }
                    } else if (true) {
                        Test.iArrFld = Test.iArrFld;
                    }
                    break;
                case 99 :
                    s *= ((short) (i12));
                    break;
                case 100 :
                    i8 *= -14;
                    break;
                case 101 :
                    Test.instanceCount ^= i10;
                case 102 :
                    i12 += i1;
                    break;
                case 103 :
                    i8 += ((i7 * f1) + i9) - i8;
                    break;
                case 104 :
                    lArr[i7 - 1] = ((long) (f1));
                case 105 :
                    if (i9 != 0) {
                        vMeth_check_sum += ((((((((((i1 + Double.doubleToLongBits(d)) + s) + Float.floatToIntBits(f1)) + i7) + i8) + i9) + i10) + i11) + i12) + (b1 ? 1 : 0)) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                case 106 :
                    i12 -= ((int) (f1));
                    break;
                case 107 :
                    {
                        try {
                            Socket ax$38 = new Socket();
                            Thread ax$40 = new Thread();
                            boolean ax$37 = false;
                            for (int ax$36 = -225; ax$36 < (-225 + 19625); ax$36 += 1) {
                                Test.AxOutputRedirectionHelper.redirect();
                                try {
                                    if (ax$38 != null) {
                                        ax$38.close();
                                    }
                                } catch (Throwable ax$39) {
                                } finally {
                                }
                                Test.AxOutputRedirectionHelper.recover();
                                if (!ax$37) {
                                    i10 = i12;
                                    ax$37 = true;
                                }
                                Test.AxOutputRedirectionHelper.redirect();
                                try {
                                    try {
                                        ax$40.join();
                                    } catch (InterruptedException ax$41) {
                                    }
                                } catch (Throwable ax$42) {
                                } finally {
                                }
                                Test.AxOutputRedirectionHelper.recover();
                            }
                        } finally {
                        }
                    }
                    break;
            }
        }
        vMeth_check_sum += ((((((((((i1 + Double.doubleToLongBits(d)) + s) + Float.floatToIntBits(f1)) + i7) + i8) + i9) + i10) + i11) + i12) + (b1 ? 1 : 0)) + FuzzerUtils.checkSum(lArr);
    }

    public static short sMeth(long l, int i, long l1) {
        int i13 = -6;
        int i14 = -11;
        int i15 = -7;
        int i16 = -208;
        int i17 = -8;
        int i18 = 234;
        int i19 = -41243;
        int i20 = -9;
        int i21 = -9;
        int i22 = 5;
        int i23 = 201;
        int i24 = -35957;
        float f2 = -57.627F;
        short s2 = -31887;
        long lArr1[] = new long[N];
        FuzzerUtils.init(lArr1, -7L);
        vMeth(i);
        i = i;
        i13 = 1;
        do {
            i += i13;
            if (Test.bFld)
                continue;

            i *= -11;
        } while ((++i13) < 195 );
        Test.iArrFld[(i >>> 1) % N] += i13;
        for (i14 = 2; i14 < 117; i14++) {
            i <<= i15;
            for (i16 = i14; i16 < 5; ++i16) {
                Test.byFld += ((byte) (i16));
                Test.fArrFld[i16 - 1] *= i14;
                Test.iArrFld[i16] += ((int) (l1));
            }
            Test.instanceCount += ((long) (Test.dFld));
            i17 *= 74;
            i -= i14;
            if (i15 != 0) {
            }
            Test.dFld *= Test.dFld;
            Test.bFld = Test.bFld;
        }
        i15 -= ((int) (67L));
        Test.iArrFld[((-588) >>> 1) % N] >>= ((int) (-1L));
        f2 -= i16;
        for (i18 = 1; i18 < 159; i18++) {
            lArr1[i18 + 1] = l1;
            for (i20 = 1; i20 < 4; ++i20) {
                i17 = ((int) (f2));
                switch ((i20 % 4) + 70) {
                    case 70 :
                        Test.dFld -= 53258;
                        break;
                    case 71 :
                    case 72 :
                        i19 *= i22;
                        i17 += i;
                        for (i23 = 1; i23 < 2; i23++) {
                            lArr1 = lArr1;
                            lArr1[i20 - 1] = Test.instanceCount;
                            l1 <<= 17;
                            s2 *= ((short) (Test.dFld));
                        }
                        Test.byFld = ((byte) (Test.dFld));
                        s2 >>>= ((short) (l));
                    case 73 :
                        i22 += i20 ^ i24;
                    default :
                        i22 -= ((int) (Test.dFld));
                }
            }
        }
        long meth_res = ((((((((((((((((l + i) + l1) + i13) + i14) + i15) + i16) + i17) + Float.floatToIntBits(f2)) + i18) + i19) + i20) + i21) + i22) + i23) + i24) + s2) + FuzzerUtils.checkSum(lArr1);
        sMeth_check_sum += meth_res;
        return ((short) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        int i25 = -48094;
        int i26 = -3;
        int i27 = 60916;
        int i28 = -228;
        int i29 = -23;
        int i30 = 115;
        float f3 = 29.249F;
        long lArr2[] = new long[N];
        FuzzerUtils.init(lArr2, 6L);
        iFld = (-iFld) + iFld;
        sMeth(Test.instanceCount, iFld, Test.instanceCount);
        Test.iArrFld[(iFld >>> 1) % N] = iFld;
        for (i25 = 4; i25 < 84; i25++) {
            i26 ^= Test.byFld;
            for (i27 = 2; 63 > i27; i27++) {
                for (i29 = i27; 2 > i29; ++i29) {
                    iFld += ((i29 * Test.instanceCount) + f3) - iFld;
                    i26 *= i30;
                    switch (((i25 >>> 1) % 2) + 110) {
                        case 110 :
                            i30 = ((int) (f3));
                            Test.iArrFld[i29 + 1] = 28799;
                            Test.byFld += Test.byFld;
                            lArrFld[(i26 >>> 1) % N] = 189L;
                            Test.instanceCount += (-2413713025L) + (i29 * i29);
                            i30 += i29;
                            i26 *= ((int) (1.848F));
                            Test.bFld = Test.bFld;
                            Test.iArrFld = Test.iArrFld;
                            sFld += ((short) (((i29 * sFld) + Test.instanceCount) - i26));
                            Test.iArrFld[i25] += i25;
                            iFld -= ((int) (Test.instanceCount));
                            iFld += ((int) (f3));
                            Test.dFld = f3;
                            switch ((i27 % 2) + 93) {
                                case 93 :
                                    try {
                                        iFld = i26 % (-1277040122);
                                        i28 = iFld % Test.iArrFld[i25 + 1];
                                        i30 = (-219) % iFld;
                                    } catch (ArithmeticException a_e) {
                                    }
                                    Test.instanceCount = Test.instanceCount;
                                    f3 -= i27;
                                    i28 *= ((int) (Test.instanceCount));
                                    i26 += i29;
                                    sFld += ((short) (i26));
                                    Test.instanceCount <<= i25;
                                    i30 += ((int) (Test.dFld));
                                    lArr2[i29 - 1] -= 43323;
                                    Test.bFld = Test.bFld;
                                    i30 = iFld;
                                    i30 %= ((int) (i28 | 1));
                                    i26 = i25;
                                    i26 -= i27;
                                    break;
                                case 94 :
                                    sFld >>= ((short) (i26));
                                    f3 /= ((long) (Test.dFld)) | 1;
                                    lArrFld[i27 + 1] = ((long) (Test.dFld));
                                    i26 += ((i29 * i28) + i28) - i25;
                                    Test.fArrFld = FuzzerUtils.float1array(N, ((float) (26.76F)));
                                    i28 = i26;
                                    break;
                            }
                        case 111 :
                            f3 = i28;
                            try {
                                i30 = (-38768) % Test.iArrFld[(iFld >>> 1) % N];
                                iFld = Test.iArrFld[i27 + 1] / i27;
                                i28 = i28 % 93;
                            } catch (ArithmeticException a_e) {
                            }
                            if (Test.bFld)
                                continue;

                            Test.iArrFld[(i28 >>> 1) % N] *= -18224;
                            Test.fArrFld[i27] -= f3;
                            Test.iArrFld[i27 + 1] *= i29;
                            break;
                        default :
                            i30 >>= 109;
                            if (Test.bFld)
                                continue;

                            Test.instanceCount += i29;
                            Test.iArrFld[i29 + 1] = iFld;
                            iFld += 50990;
                    }
                    i28 -= ((int) (f3));
                    Test.dFld += Test.instanceCount;
                    f3 += i29;
                    i28 = ((int) (Test.instanceCount));
                    i30 <<= sFld;
                    i26 += i29 - iFld;
                    iFld = 39571;
                    Test.byFld -= ((byte) (Test.instanceCount));
                    iFld = i30;
                    if (Test.bFld) {
                        i30 = i28;
                        switch ((i27 % 9) + 127) {
                            case 127 :
                                Test.instanceCount += i29 + Test.instanceCount;
                                {
                                    final int ax$33 = this.iFld;
                                    final int ax$34 = i27;
                                    final int ax$35 = i26;
                                    try {
                                        AtomicIntegerArray ax$22 = null;
                                        AtomicIntegerArray ax$24 = null;
                                        char[] ax$27 = new char[]{ 'ᴪ', '㧏', '齹', '睚', '쵆', '﨓', '麗' };
                                        char[] ax$30 = new char[]{ ((char) (0xf3f4)) };
                                        boolean ax$21 = false;
                                        for (int ax$20 = -703; ax$20 < (-703 + 4326); ax$20 += 1) {
                                            Test.AxOutputRedirectionHelper.redirect();
                                            try {
                                                ax$22.set(i26 * i27, ax$24.get(i26 * i27));
                                            } catch (Throwable ax$26) {
                                            } finally {
                                            }
                                            Test.AxOutputRedirectionHelper.recover();
                                            if (!ax$21) {
                                                Test.instanceCount = i28;
                                                ax$21 = true;
                                            }
                                            Test.AxOutputRedirectionHelper.redirect();
                                            try {
                                                for (int ax$31 = 0; ax$31 < ax$30.length; ax$31 += 1) {
                                                    ax$30[ax$31] = ((char) ((ax$27[ax$31] + i27) >> iFld));
                                                }
                                            } catch (Throwable ax$32) {
                                            } finally {
                                            }
                                            Test.AxOutputRedirectionHelper.recover();
                                        }
                                    } finally {
                                        this.iFld = ax$33;
                                        i27 = ax$34;
                                        i26 = ax$35;
                                    }
                                }
                                i30 = i30;
                                Test.byFld -= ((byte) (110));
                                lArrFld = lArr2;
                                break;
                            case 128 :
                                Test.iArrFld[i27 + 1] >>= 61326;
                                iFld >>= i26;
                                break;
                            case 129 :
                                i26 >>= i28;
                                break;
                            case 130 :
                                Test.iArrFld[i25 + 1] = ((int) (Test.instanceCount));
                            case 131 :
                                Test.iArrFld[i27 + 1] *= ((int) (Test.instanceCount));
                                break;
                            case 132 :
                                i28 = ((int) (f3));
                                break;
                            case 133 :
                                Test.iArrFld[i29 + 1] = -243;
                                break;
                            case 134 :
                                Test.instanceCount -= i29;
                                break;
                            case 135 :
                                if (Test.bFld)
                                    break;

                                break;
                            default :
                                i28 %= ((int) (2.111274));
                        }
                    }
                }
            }
        }
        FuzzerUtils.out.println((((("i25 i26 i27 = " + i25) + ",") + i26) + ",") + i27);
        FuzzerUtils.out.println((((("i28 i29 i30 = " + i28) + ",") + i29) + ",") + i30);
        FuzzerUtils.out.println((("f3 lArr2 = " + Float.floatToIntBits(f3)) + ",") + FuzzerUtils.checkSum(lArr2));
        FuzzerUtils.out.println((((("Test.instanceCount iFld Test.bFld = " + Test.instanceCount) + ",") + iFld) + ",") + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println((((("Test.byFld Test.dFld sFld = " + Test.byFld) + ",") + Double.doubleToLongBits(Test.dFld)) + ",") + sFld);
        FuzzerUtils.out.println((((("Test.iArrFld Test.fArrFld Test.bArrFld = " + FuzzerUtils.checkSum(Test.iArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))) + ",") + FuzzerUtils.checkSum(Test.bArrFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                {
                    final int ax$19 = i;
                    try {
                        long[] ax$14 = new long[60];
                        long[] ax$16 = new long[]{ 5322309359906448400L, -4863205155764886171L, -4779317074243296304L, -6264436191777021685L, 4711866221132607597L, -1627103410832870663L, 1405320212495659804L };
                        for (int ax$13 = -331; ax$13 < (-331 + 1094); ax$13 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$17 = 0; ax$17 < ax$16.length; ax$17 += 1) {
                                    ax$16[ax$17] = ((long) (ax$14[ax$17] >>> (-i)));
                                }
                            } catch (Throwable ax$18) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        i = ax$19;
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
}
