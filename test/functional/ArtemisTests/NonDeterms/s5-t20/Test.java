// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.BitSet;

public class Test {
    public static final int N = 256;

    public static long instanceCount = -61966L;

    public static short sFld = 2470;

    public static double dFld = 1.3009;

    public static float fFld = 1.835F;

    public static float fArrFld[] = new float[N];

    public static int iArrFld[] = new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 33.273F);
        FuzzerUtils.init(Test.iArrFld, 0);
    }

    public static long fMeth_check_sum = 0;

    public static long lMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static void vMeth(long l) {
        int i4 = -3;
        int i5 = -50894;
        int i6 = -10;
        int i7 = -15077;
        int i8 = -160;
        int i9 = 2;
        int i10 = 3;
        int i11 = 2;
        int i12 = -38;
        int i13 = 238;
        int i14 = 229;
        int i15 = 74;
        int i16 = 9;
        int i17 = -14;
        int i18 = 162;
        float f = 0.59F;
        short s = 20983;
        double d = 0.64848;
        boolean b1 = false;
        long lArr1[] = new long[N];
        FuzzerUtils.init(lArr1, 3L);
        for (i4 = 2; i4 < 238; ++i4) {
            f += i4 - i4;
            i5 += i4;
            s *= ((short) (Test.instanceCount));
            i5 -= ((int) (f));
            for (i6 = 1; i6 < 3; ++i6) {
                l += i6;
                for (i8 = 1; i8 < 2; ++i8) {
                    s *= ((short) (i5));
                    i7 = i8;
                    f += Test.instanceCount;
                    i5 += i5;
                    d += i8;
                }
            }
        }
        for (i10 = 2; i10 < 141; i10++) {
            i9 += i10 * f;
            d = i11;
            i9 += (-202) + (i10 * i10);
            try {
                i11 = 920390105 % i5;
                i5 = i12 % (-2127577258);
                i5 = i4 % 1464041569;
            } catch (ArithmeticException a_e) {
            }
        }
        for (i13 = 5; 239 > i13; i13 += 2) {
            switch ((i13 % 2) + 5) {
                case 5 :
                    Test.sFld >>= ((short) (i9));
                    d = Test.instanceCount;
                    for (i15 = 1; i15 < 5; ++i15) {
                        i14 = i4;
                        i14 = ((int) (l));
                        lArr1[i13 - 1] *= 2;
                        i7 = ((int) (l));
                        for (i17 = 2; i17 > i15; i17 -= 2) {
                            if (b1)
                                break;

                            l *= s;
                            i5 += i17 * i17;
                            f *= i10;
                            i9 *= i12;
                            i9 += ((i17 * f) + i16) - i10;
                            b1 = b1;
                            i16 >>>= i9;
                        }
                        lArr1[i13] += ((long) (2.312F));
                    }
                    break;
                case 6 :
                    if (b1)
                        continue;

                default :
                    Test.instanceCount -= i4;
            }
        }
        vMeth_check_sum += (((((((((((((((((((l + i4) + i5) + Float.floatToIntBits(f)) + s) + i6) + i7) + i8) + i9) + Double.doubleToLongBits(d)) + i10) + i11) + i12) + i13) + i14) + i15) + i16) + i17) + i18) + (b1 ? 1 : 0)) + FuzzerUtils.checkSum(lArr1);
    }

    public static long lMeth() {
        float f1 = 0.383F;
        int i19 = -23262;
        int i20 = -63120;
        int i21 = 4;
        int i22 = -130;
        int i23 = 245;
        int i24 = -148;
        int i25 = -51453;
        int i26 = 18;
        int i27 = 32033;
        int i28 = 196;
        int i29 = 130;
        int i30 = -18744;
        double d1 = 116.31423;
        byte by = 72;
        long lArr2[] = new long[N];
        FuzzerUtils.init(lArr2, 2005515759L);
        vMeth(Test.instanceCount);
        f1 += i19;
        i20 = 1;
        while ((++i20) < 212) {
            Test.instanceCount *= ((long) (-57.89507));
        } 
        for (i21 = 7; i21 < 202; i21 += 2) {
            i19 += -1;
        }
        i23 = 1;
        while ((++i23) < 218) {
            i22 = i19;
            for (i24 = 1; i24 < 3; ++i24) {
                for (i26 = 2; i26 > 1; i26 -= 2) {
                    i27 += ((int) (Test.instanceCount));
                    i25 = 797;
                    i19 <<= i25;
                }
                i27 += ((int) (d1));
                Test.sFld += ((short) (i24));
                i22 += i24 * i24;
            }
            i25 *= 48;
            i22 -= i20;
            switch (((i26 >>> 1) % 2) + 87) {
                case 87 :
                    for (i28 = 1; i28 < 3; i28 += 2) {
                        i29 += i28;
                        Test.instanceCount += Test.instanceCount;
                        by ^= ((byte) (Test.instanceCount));
                        Test.instanceCount += ((i28 * Test.instanceCount) + i20) - i23;
                        by *= ((byte) (i19));
                        Test.sFld += ((short) (i24));
                        Test.iArrFld[i28 - 1] -= i27;
                        i22 += ((i28 * i29) + i29) - i20;
                        i29 = by;
                        i30 = 1;
                        while ((++i30) < 3) {
                            Test.iArrFld[i23] = ((int) (-1.626F));
                            Test.iArrFld[i23 - 1] = i19;
                            i29 = i20;
                            try {
                                i22 = i26 / Test.iArrFld[(i27 >>> 1) % N];
                                Test.iArrFld[i23 + 1] = i21 % i26;
                                Test.iArrFld[i28] = i26 / (-1713992206);
                            } catch (ArithmeticException a_e) {
                            }
                            i29 += 9;
                            i19 += i30 | i22;
                            i29 >>= i28;
                        } 
                    }
                case 88 :
                    i27 += i23;
                    break;
                default :
                    i19 *= ((int) (f1));
            }
        } 
        long meth_res = ((((((((((((((Float.floatToIntBits(f1) + i19) + i20) + i21) + i22) + i23) + i24) + i25) + i26) + i27) + Double.doubleToLongBits(d1)) + i28) + i29) + by) + i30) + FuzzerUtils.checkSum(lArr2);
        lMeth_check_sum += meth_res;
        return ((long) (meth_res));
    }

    public static float fMeth(boolean b) {
        int i3 = -175;
        int i31 = 24726;
        int i32 = -2;
        int i33 = -10;
        int i35 = -10;
        int i36 = 26261;
        int i37 = -2;
        int i38 = -201;
        int i39 = -4984;
        int i40 = -6;
        float f2 = -2.304F;
        double d2 = -45.55933;
        double dArr1[] = new double[N];
        byte by1 = 84;
        long lArr3[] = new long[N];
        FuzzerUtils.init(lArr3, 3303710800871909543L);
        FuzzerUtils.init(dArr1, 0.89935);
        i3 += ((int) (lMeth()));
        for (i31 = 2; i31 < 177; ++i31) {
            i3 /= ((int) (i31 | 1));
            i33 = 1;
            while ((++i33) < 3) {
                i32 /= ((int) (-48.15552));
            } 
        }
        f2 *= ((float) (d2));
        i32 = ((int) (f2));
        i32 = i32;
        for (int i34 : Test.iArrFld) {
            Test.instanceCount = i33;
            if (b)
                continue;

            switch (((58608 >>> 1) % 7) + 84) {
                case 84 :
                    Test.dFld *= d2;
                    by1 /= ((byte) (-4227304885L));
                    i35 = 1;
                    do {
                        i34 = i31;
                        i34 ^= ((int) (Test.instanceCount));
                        i32 += i35 + Test.sFld;
                        lArr3[i35 - 1] <<= Test.instanceCount;
                        i3 += i35 ^ Test.sFld;
                        Test.sFld = Test.sFld;
                        Test.instanceCount = i31;
                        i3 += ((i35 * Test.instanceCount) + i31) - i33;
                    } while ((++i35) < 2 );
                    i36 *= i34;
                    i36 -= ((int) (f2));
                    switch ((((i36 >>> 1) % 1) * 5) + 91) {
                        case 96 :
                            for (i37 = 1; 2 > i37; i37++) {
                                i34 >>>= i34;
                                d2 /= i35 | 1;
                                Test.iArrFld[i37] >>= -1607;
                                for (i39 = 1; i39 < 2; i39++) {
                                    switch (((i39 % 9) * 5) + 59) {
                                        case 82 :
                                            switch ((i39 % 6) + 106) {
                                                case 106 :
                                                    i34 ^= i40;
                                                    f2 += i34;
                                                    f2 += i3;
                                                    break;
                                                case 107 :
                                                    Test.iArrFld[i39] = i31;
                                                    break;
                                                case 108 :
                                                    lArr3[i37] -= i32;
                                                    break;
                                                case 109 :
                                                    dArr1 = dArr1;
                                                    break;
                                                case 110 :
                                                    Test.sFld = ((short) (i31));
                                                    break;
                                                case 111 :
                                                    i3 -= i31;
                                                default :
                                                    if (i3 != 0) {
                                                    }
                                            }
                                        case 98 :
                                            i32 += ((int) (Test.instanceCount));
                                            break;
                                        case 74 :
                                            Test.dFld += Test.instanceCount;
                                            break;
                                        case 79 :
                                            f2 *= Test.sFld;
                                            break;
                                        case 69 :
                                            i36 -= i3;
                                            break;
                                        case 80 :
                                            f2 = f2;
                                        case 68 :
                                            i38 >>= by1;
                                            break;
                                        case 76 :
                                            i40 = ((int) (Test.instanceCount));
                                            break;
                                        case 63 :
                                            Test.iArrFld[i37 - 1] = i39;
                                            break;
                                        default :
                                            Test.iArrFld[i37 - 1] >>= i37;
                                    }
                                }
                            }
                            break;
                    }
                    break;
                case 85 :
                    lArr3[(60884 >>> 1) % N] = Test.instanceCount;
                    break;
                case 86 :
                case 87 :
                    i32 &= -61554;
                    break;
                case 88 :
                case 89 :
                    i36 = ((int) (d2));
                    break;
                case 90 :
                    i38 = i31;
                    break;
                default :
                    Test.instanceCount *= i33;
            }
        }
        long meth_res = (((((((((((((((b ? 1 : 0) + i3) + i31) + i32) + i33) + Float.floatToIntBits(f2)) + Double.doubleToLongBits(d2)) + by1) + i35) + i36) + i37) + i38) + i39) + i40) + FuzzerUtils.checkSum(lArr3)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        fMeth_check_sum += meth_res;
        return ((float) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        if (Test.ax$0) {
            BitSet ax$1 = new BitSet();
            String[] ax$2 = new String[]{ "f1" };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                for (int ax$3 = 0; ax$3 < ax$2.length; ax$3++) {
                    try {
                        InetAddress.getAllByName(ax$2[ax$3]);
                    } catch (UnknownHostException ax$4) {
                        ax$1.set(ax$3);
                    }
                }
            } catch (Throwable ax$5) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        int i = -6444;
        int i1 = 51020;
        int i2 = 31356;
        int i41 = 19832;
        int i42 = 13;
        int i43 = 11;
        boolean b2 = false;
        byte by2 = -41;
        long lArr[] = new long[N];
        short sArr[] = new short[N];
        double dArr[] = new double[N];
        FuzzerUtils.init(lArr, -14409L);
        FuzzerUtils.init(sArr, ((short) (7839)));
        FuzzerUtils.init(dArr, 1.37903);
        i += ((int) (--Test.fArrFld[(131 >>> 1) % N]));
        for (i1 = 10; 230 > i1; i1++) {
            lArr = lArr = lArr = lArr = lArr;
            sArr[i1 - 1] >>= ((short) ((Test.instanceCount * (i2 - i2)) / ((--Test.iArrFld[i1 - 1]) | 1)));
            lArr[(i1 >>> 1) % N] -= ((long) (((dArr[i1] = i2) - fMeth(b2)) + (-10325)));
            for (i41 = i1; i41 < 23; i41++) {
                i += i41;
                i42 = i1;
                b2 = b2;
                Test.iArrFld[i41] -= -90;
                Test.iArrFld[i1 - 1] <<= i1;
                Test.instanceCount += i41 | i2;
                lArr[i41 + 1] = i;
                i43 = 1;
                do {
                    Test.dFld -= Test.fFld;
                    i42 >>>= i43;
                    Test.sFld *= ((short) (-1.873F));
                    if (b2)
                        continue;

                    i2 += (-11) + (i43 * i43);
                    i42 = i43;
                    i += ((i43 * Test.fFld) + i2) - Test.instanceCount;
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount = i;
                    i42 = i1;
                    by2 *= ((byte) (i));
                    switch ((((i43 >>> 1) % 4) * 5) + 40) {
                        case 42 :
                            Test.fFld = Test.fFld;
                            switch (((i2 >>> 1) % 4) + 44) {
                                case 44 :
                                    Test.instanceCount -= Test.instanceCount;
                                    Test.iArrFld[i43 + 1] -= ((int) (Test.fFld));
                                    Test.fFld *= 38;
                                    Test.instanceCount = i41;
                                    Test.iArrFld[i43] = -250;
                                    i42 *= i43;
                                    Test.iArrFld = Test.iArrFld;
                                    Test.instanceCount = ((long) (-103.13346));
                                    Test.instanceCount <<= i2;
                                    i42 *= ((int) (Test.instanceCount));
                                    i42 = ((int) (Test.instanceCount));
                                    Test.instanceCount += ((long) (Test.fFld));
                                    Test.iArrFld = Test.iArrFld;
                                    Test.iArrFld[i1 - 1] -= i;
                                case 45 :
                                    i <<= ((int) (Test.instanceCount));
                                    i2 += i1;
                                    break;
                                case 46 :
                                    i2 >>= i42;
                                    Test.sFld -= ((short) (i41));
                                    Test.fFld *= i1;
                                    i2 %= ((int) (3690229802L));
                                    Test.instanceCount = i42;
                                    i42 = i43;
                                    i = Test.sFld;
                                case 47 :
                                    Test.sFld &= ((short) (0));
                                    sArr[i43 + 1] += ((short) (i43));
                                    Test.iArrFld[i1] = ((int) (Test.instanceCount));
                                    Test.fFld += i43 * i43;
                                    try {
                                        i42 = (-141) / i;
                                        i42 = i1 / (-63364);
                                        i2 = i1 % (-63028);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    i42 <<= i;
                                    break;
                            }
                            i2 += ((i43 * Test.instanceCount) + Test.instanceCount) - Test.fFld;
                            if (b2) {
                                i += i43 - by2;
                                Test.fFld = Test.instanceCount;
                                if (false) {
                                    i42 *= i;
                                    i42 = i2;
                                    i = i;
                                    b2 = b2;
                                    Test.instanceCount += (-10044) + (i43 * i43);
                                }
                                Test.iArrFld[i43 + 1] = i;
                                i2 >>= i42;
                                i2 += ((i43 * Test.instanceCount) + i2) - i41;
                                i42 -= i;
                                i2 = ((int) (Test.instanceCount));
                                i += Test.sFld;
                                Test.instanceCount *= i1;
                                Test.fFld *= ((float) (Test.dFld));
                            } else if (b2) {
                                Test.iArrFld[i1 + 1] = ((int) (Test.fFld));
                            }
                            break;
                        case 43 :
                            Test.iArrFld[i41 + 1] %= ((int) (by2 | 1));
                        case 60 :
                            Test.dFld += i;
                            break;
                        case 53 :
                            i2 += i;
                        default :
                            i42 = i;
                    }
                } while ((++i43) < 1 );
            }
        }
        FuzzerUtils.out.println((((("i i1 i2 = " + i) + ",") + i1) + ",") + i2);
        FuzzerUtils.out.println((((("b2 i41 i42 = " + (b2 ? 1 : 0)) + ",") + i41) + ",") + i42);
        FuzzerUtils.out.println((((("i43 by2 lArr = " + i43) + ",") + by2) + ",") + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println((("sArr dArr = " + FuzzerUtils.checkSum(sArr)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println((((("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount) + ",") + Test.sFld) + ",") + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println((((("Test.fFld Test.fArrFld Test.iArrFld = " + Float.floatToIntBits(Test.fFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))) + ",") + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                {
                    final int ax$22 = i;
                    try {
                        int[] ax$7 = new int[]{ -744875500, 1953317484 };
                        long[] ax$8 = new long[]{ -1731702603729772444L, -2564924805040174932L, -5393172585154235665L, 751026610924712813L, -5808664045399029737L };
                        byte[] ax$9 = new byte[]{ 0, -1, -2, -3, -4 };
                        char[] ax$10 = new char[]{ '롂', '', 'ᖺ', 'Ⓡ', '', '禯' };
                        short[] ax$11 = new short[]{ ((short) (-5706)), ((short) (29578)), ((short) (20242)), ((short) (18724)), ((short) (11514)) };
                        char[] ax$16 = new char[]{ '', '°', 'ጽ', '䥁' };
                        char[] ax$17 = new char[]{ '', '縙', '祉', '찞', '귞', '릇', '∍', '縦' };
                        char[] ax$19 = new char[]{ '錏', '䕮', 'ᵐ', '', '쓷', '을' };
                        for (int ax$6 = -245; ax$6 < (-245 + 10682); ax$6 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$13 = 0, ax$14 = -17; ax$13 < i; ax$13++ , ax$14 += 3) {
                                    ax$9[ax$13] = ((byte) (ax$14));
                                    ax$11[ax$13] = ((short) (ax$14));
                                    ax$10[ax$13] = ((char) (ax$14));
                                    ax$7[ax$13] = ax$14;
                                    ax$8[ax$13] = ax$14;
                                }
                            } catch (Throwable ax$15) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            Test.ax$0 = true;
                            _instance.mainTest(new String[]{ "s", "s", "s", "s", "s", "s", "s", "s" });
                            Test.ax$0 = false;
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$20 = 0; ax$20 < i; ax$20++) {
                                    ax$17[ax$20] = ((char) (ax$20));
                                    ax$16[ax$20] = ax$19[ax$20 & 7];
                                }
                            } catch (Throwable ax$21) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        i = ax$22;
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