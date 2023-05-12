// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;

public class Test {
    public static final int N = 256;

    public static volatile long instanceCount = 1239106584963633530L;

    public static short sFld = -26578;

    public static double dFld = -82.95013;

    public static float fFld = 80.115F;

    public static byte byFld = 125;

    public static int iArrFld[] = new int[N];

    public static long lArrFld[][] = new long[N][N];

    public static boolean bArrFld[][] = new boolean[N][N];

    public byte byArrFld[] = new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 35573);
        FuzzerUtils.init(Test.lArrFld, -1753835261122474195L);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long lMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static int iMeth() {
        if (Test.ax$0) {
            byte[] ax$1 = new byte[0];
            Test.AxOutputRedirectionHelper.redirect();
            try {
                for (int ax$2 = 0; ax$2 < 128; ax$2++) {
                    ax$1[ax$2] >>= 31;
                }
            } catch (Throwable ax$3) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return 705786456;
        }
        int i6 = -4;
        int i7 = 65451;
        int i8 = -31778;
        int i9 = -48057;
        int i10 = 162;
        int i11 = 237;
        int iArr[] = new int[N];
        double d = 2.57557;
        long l1 = 1812430873911635754L;
        byte by = 48;
        boolean b = false;
        boolean b1 = true;
        float f = -2.93F;
        FuzzerUtils.init(iArr, 15683);
        i6 >>= i6;
        switch ((((i6 >>> 1) % 3) * 5) + 64) {
            case 73 :
                for (d = 1; d < 135; ++d) {
                    i6 = i6;
                    i6 = i6;
                }
                i7 = i7;
                break;
            case 76 :
            case 72 :
            default :
                iArr[(i7 >>> 1) % N] *= i6;
                i6 <<= ((int) (Test.instanceCount));
                switch (((i6 >>> 1) % 7) + 98) {
                    case 98 :
                        for (l1 = 4; 108 > l1; l1++) {
                            for (i9 = 1; i9 < 5; ++i9) {
                                i8 += ((int) (Test.instanceCount));
                                i8 = 39889;
                                iArr[((int) (l1 + 1))] >>= by;
                                if (b) {
                                    iArr[((int) (l1 + 1))] += -46086;
                                    i7 *= ((int) (d));
                                    switch (((i7 >>> 1) % 2) + 26) {
                                        case 26 :
                                            i8 += i9;
                                            switch ((((-45389) >>> 1) % 4) + 125) {
                                                case 125 :
                                                    i8 += i9;
                                                    i8 += i7;
                                                    i7 += (-2626) + (i9 * i9);
                                                    i7 = 6;
                                                    iArr[i9 + 1] %= 223;
                                                    i10 += ((int) (Test.instanceCount));
                                                    i10 ^= i8;
                                                    Test.instanceCount += i9;
                                                    i10 += -144;
                                                    b = b;
                                                case 126 :
                                                    Test.sFld += ((short) (-13));
                                                    try {
                                                        i8 = i7 % 1547981732;
                                                        iArr[i9 - 1] = i9 / 17336;
                                                        i10 = i6 % i10;
                                                    } catch (ArithmeticException a_e) {
                                                    }
                                                    i11 = 1;
                                                    do {
                                                        i7 += i11 * i11;
                                                        i8 += ((i11 * i11) + i11) - f;
                                                        Test.dFld *= i10;
                                                        i10 *= ((int) (l1));
                                                    } while ((++i11) < 2 );
                                                case 127 :
                                                    i6 /= ((int) (i10 | 1));
                                                case 128 :
                                                default :
                                                    i7 += ((i9 * l1) + i11) - i10;
                                            }
                                            break;
                                        case 27 :
                                            f += ((i9 * f) + Test.instanceCount) - i8;
                                            break;
                                    }
                                } else if (b1) {
                                    Test.sFld += ((short) (7));
                                }
                            }
                        }
                        break;
                    case 99 :
                        Test.instanceCount -= ((long) (-113.901F));
                        break;
                    case 100 :
                        Test.instanceCount *= i7;
                        break;
                    case 101 :
                        iArr[(i7 >>> 1) % N] = i11;
                        break;
                    case 102 :
                        i7 -= ((int) (-79.387F));
                        break;
                    case 103 :
                        Test.instanceCount += ((long) (f));
                    case 104 :
                        i7 = i6;
                    default :
                        Test.instanceCount <<= i7;
                }
        }
        long meth_res = (((((((((((i6 + Double.doubleToLongBits(d)) + i7) + l1) + i8) + i9) + i10) + by) + (b ? 1 : 0)) + i11) + Float.floatToIntBits(f)) + (b1 ? 1 : 0)) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth(int i2, long l, int i3) {
        int i4 = -94;
        int i5 = 9;
        int i13 = 131;
        int i14 = 102;
        int i15 = -7;
        int i16 = -133;
        int iArr1[] = new int[N];
        boolean b2 = true;
        boolean bArr[] = new boolean[N];
        float fArr[] = new float[N];
        FuzzerUtils.init(iArr1, 5797);
        FuzzerUtils.init(fArr, -2.878F);
        FuzzerUtils.init(bArr, true);
        for (i4 = 5; i4 < 182; ++i4) {
            i5 -= -((i3++) - (-(-i4)));
            {
                final boolean ax$12 = b2;
                final long ax$13 = Test.vMeth_check_sum;
                final int ax$14 = i13;
                try {
                    int[] ax$5 = new int[]{ -1809985081, 935675535, -952456203, 964384484, 1966405658, 284690128, -1658109041, 1778605281 };
                    for (int ax$4 = -823; ax$4 < (-823 + 19209); ax$4 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            for (int ax$7 = 0; ax$7 <= 3; ax$7++) {
                                ax$5[i13 * ax$7] += 1;
                            }
                        } catch (Throwable ax$8) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                        Test.ax$0 = true;
                        iMeth();
                        Test.ax$0 = false;
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            if ((!b2) && (vMeth_check_sum != (-1))) {
                            }
                        } catch (Throwable ax$11) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                    }
                } finally {
                    b2 = ax$12;
                    Test.vMeth_check_sum = ax$13;
                    i13 = ax$14;
                }
            }
            i5 -= iMeth();
            Test.dFld *= i4;
            i5 += i4 * i4;
            if (true) {
                iArr1[(i5 >>> 1) % N] -= i3;
                i2 = i5;
                for (i13 = 1; i13 < 3; ++i13) {
                    Test.sFld += ((short) (i13));
                    Test.sFld *= ((short) (i13));
                    i3 += i13;
                    i14 = i2;
                    switch ((i4 % 2) + 65) {
                        case 65 :
                            l = -31337;
                            if (i4 != 0) {
                                vMeth_check_sum += (((((((((((i2 + l) + i3) + i4) + i5) + i13) + i14) + (b2 ? 1 : 0)) + i15) + i16) + FuzzerUtils.checkSum(iArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + FuzzerUtils.checkSum(bArr);
                                return;
                            }
                            i14 += ((i13 * i4) + i3) - Test.instanceCount;
                            i14 -= i4;
                            i2 = Test.sFld;
                            Test.dFld -= 55780;
                            switch ((i13 % 2) + 67) {
                                case 67 :
                                    if (b2)
                                        break;

                                    iArr1[i13 - 1] = ((int) (Test.instanceCount));
                                    for (i15 = 1; i15 < 2; i15++) {
                                        fArr = fArr;
                                        Test.instanceCount = i5;
                                        bArr[i13] = b2;
                                        Test.instanceCount <<= i3;
                                        i5 -= ((int) (l));
                                        fArr[i4 - 1] -= i2;
                                        i2 += i15 | ((long) (Test.fFld));
                                        iArr1[i15] = -19;
                                        i14 = i15;
                                        Test.fFld += l;
                                        i2 += i15 ^ i15;
                                        i14 &= i15;
                                        i2 += i15 * i15;
                                    }
                                case 68 :
                                    if (false)
                                        break;

                                    break;
                                default :
                                    i3 = -5;
                            }
                            break;
                        case 66 :
                            Test.instanceCount += i13 | i4;
                            break;
                    }
                }
            } else {
                {
                    final boolean ax$29 = b2;
                    final int ax$30 = i2;
                    final int ax$31 = i4;
                    final int ax$32 = i16;
                    final int ax$33 = i15;
                    try {
                        ByteBuffer ax$17 = null;
                        CharsetEncoder ax$19 = null;
                        CharBuffer ax$21 = null;
                        PrintStream ax$27 = null;
                        boolean ax$16 = false;
                        for (int ax$15 = -480; ax$15 < (-480 + 14977); ax$15 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$22 = 0; ax$22 < i16; ax$22++) {
                                    ax$21.clear();
                                    ax$17.clear();
                                    b2 = b2 && ax$19.encode(ax$21, ax$17, true).isUnderflow();
                                }
                            } catch (Throwable ax$23) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            if (!ax$16) {
                                i14 *= ((int) (Test.instanceCount));
                                ax$16 = true;
                            }
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                if (i15 != 0) {
                                    ax$27.println("i=" + i4);
                                    i2++;
                                }
                            } catch (Throwable ax$28) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        b2 = ax$29;
                        i2 = ax$30;
                        i4 = ax$31;
                        i16 = ax$32;
                        i15 = ax$33;
                    }
                }
            }
        }
        vMeth_check_sum += (((((((((((i2 + l) + i3) + i4) + i5) + i13) + i14) + (b2 ? 1 : 0)) + i15) + i16) + FuzzerUtils.checkSum(iArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + FuzzerUtils.checkSum(bArr);
    }

    public static long lMeth(int i1) {
        int i17 = 41640;
        int i18 = -159;
        int i19 = 10;
        int i20 = 1;
        int i21 = -54130;
        int i22 = -58695;
        boolean b3 = false;
        long l2 = 229L;
        short sArr[][] = new short[N][N];
        FuzzerUtils.init(sArr, ((short) (-27502)));
        vMeth(i1, Test.instanceCount, i1);
        i17 = 1;
        while ((++i17) < 222) {
            i1 = i1;
            for (i18 = 3; 1 < i18; --i18) {
                if (b3)
                    break;

                for (i20 = 1; i20 < 2; i20++) {
                    Test.iArrFld[(i17 >>> 1) % N] >>= ((int) (13L));
                    switch (((i17 % 5) * 5) + 120) {
                        case 125 :
                            Test.lArrFld[i17 - 1][i17 - 1] += i17;
                            break;
                        case 144 :
                            i21 *= i22;
                            Test.lArrFld[i20 - 1][i17] >>= i20;
                            i22 ^= i1;
                            Test.instanceCount += ((i20 * i19) + i1) - i1;
                            i22 &= i21;
                            i1 += ((int) (989238479L));
                            i21 >>= i20;
                            Test.bArrFld[i20][i17 - 1] = false;
                            i1 -= Test.byFld;
                            i1 = Test.byFld;
                            i22 = i21;
                            b3 = b3;
                        case 127 :
                            sArr[i17][i18 + 1] -= ((short) (i18));
                            switch (((i20 % 10) * 5) + 1) {
                                case 28 :
                                    Test.instanceCount &= i17;
                                    i1 = i20;
                                    Test.iArrFld[i20 - 1] += ((int) (Test.instanceCount));
                                    i22 += i20 | i20;
                                    b3 = b3;
                                    i21 -= -4737;
                                    break;
                                case 14 :
                                    l2 += 141 + (i20 * i20);
                                    if (true)
                                        continue;

                                    i1 = i1;
                                    Test.iArrFld[i20] |= i22;
                                    switch (i20 % 1) {
                                        case 0 :
                                            i22 *= i17;
                                            i19 += i20;
                                            Test.instanceCount -= i1;
                                            break;
                                        default :
                                            i21 = i21;
                                    }
                                    break;
                                case 6 :
                                case 2 :
                                    i22 += ((int) (Test.fFld));
                                    break;
                                case 46 :
                                    i1 += ((i20 * i1) + i21) - i22;
                                    break;
                                case 10 :
                                    try {
                                        i22 = i21 / i1;
                                        i19 = i19 / i17;
                                        i19 = i1 / i19;
                                    } catch (ArithmeticException a_e) {
                                    }
                                    break;
                                case 18 :
                                    i21 &= i1;
                                    break;
                                case 13 :
                                    l2 -= i20;
                                    break;
                                case 20 :
                                    l2 += ((long) (1.994F));
                                case 45 :
                                    i19 = 27512;
                            }
                            break;
                        case 122 :
                            i22 = i22;
                            break;
                        case 123 :
                            i22 = ((int) (Test.fFld));
                    }
                }
            }
        } 
        long meth_res = ((((((((i1 + i17) + i18) + i19) + (b3 ? 1 : 0)) + i20) + i21) + i22) + l2) + FuzzerUtils.checkSum(sArr);
        lMeth_check_sum += meth_res;
        return ((long) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        int i = 61134;
        int i23 = -18671;
        int i24 = -34;
        int i25 = 13;
        int i26 = 9837;
        int i27 = -11;
        int i28 = 37591;
        int i29 = -6;
        int i30 = 12;
        int i31 = 200;
        int i32 = -24054;
        boolean b4 = true;
        long l3 = 46380L;
        long l4 = -1844355683L;
        double dArr[] = new double[N];
        FuzzerUtils.init(dArr, -100.110822);
        i ^= ((int) (lMeth(i)));
        Test.instanceCount ^= i;
        i23 = 1;
        do {
            for (i24 = i23; i24 < 85; i24++) {
                for (i26 = i23; i26 < 1; ++i26) {
                    Test.iArrFld[i24] = ((int) (Test.instanceCount));
                    Test.instanceCount = Test.instanceCount;
                    i += i26;
                    i25 = Test.byFld;
                    Test.instanceCount %= i25 | 1;
                    i |= i26;
                    Test.sFld *= ((short) (Test.instanceCount));
                }
                i += ((int) (1.372F));
                Test.fFld += i24;
                Test.lArrFld[i24 + 1][i24] -= i;
                switch ((i24 % 1) + 38) {
                    case 38 :
                        Test.instanceCount &= i27;
                        Test.iArrFld = Test.iArrFld;
                        if (b4)
                            continue;

                        Test.iArrFld[i23 + 1] = 115;
                        break;
                    default :
                        Test.iArrFld[i24 - 1] = Test.sFld;
                        Test.dFld = Test.instanceCount;
                        Test.instanceCount = Test.byFld;
                        for (i28 = 1; i28 < 1; ++i28) {
                            i29 *= i26;
                        }
                        i30 = 1;
                        while ((++i30) < 1) {
                            byArrFld[i24 - 1] = ((byte) (-198));
                            Test.lArrFld[i30][i23 - 1] = ((long) (Test.fFld));
                            i29 >>>= i;
                            Test.lArrFld[i23 + 1][i30 - 1] = i24;
                            Test.byFld = ((byte) (i));
                            switch (((i23 >>> 1) % 2) + 93) {
                                case 93 :
                                    Test.sFld += ((short) (i30 * i30));
                                    switch ((i30 % 5) + 62) {
                                        case 62 :
                                            Test.lArrFld[i24 + 1][i30] /= ((long) (57.67921));
                                            i27 *= ((int) (Test.fFld));
                                            Test.dFld = i28;
                                            Test.iArrFld[i23 + 1] = ((int) (16620L));
                                            i >>= 10;
                                            Test.dFld -= i23;
                                            try {
                                                i25 = (-51266) / Test.iArrFld[i24];
                                                i = (-30373) % i23;
                                                i29 = 5 / Test.iArrFld[i30 + 1];
                                            } catch (ArithmeticException a_e) {
                                            }
                                            Test.iArrFld[i30 - 1] *= ((int) (-3599312844058322963L));
                                            b4 = b4;
                                            i31 += i27;
                                            break;
                                        case 63 :
                                            Test.iArrFld[i23] -= ((int) (-118.281F));
                                            i25 += ((int) ((-75.31F) + (i30 * i30)));
                                            b4 = b4;
                                            if (b4) {
                                                Test.iArrFld[i30 + 1] *= i26;
                                                i25 += i28;
                                                Test.dFld += i31;
                                                i27 -= ((int) (Test.fFld));
                                                if (b4)
                                                    continue;

                                                i32 += (-204) + (i30 * i30);
                                                Test.iArrFld = Test.iArrFld;
                                                if (b4)
                                                    break;

                                                Test.bArrFld[i24 + 1][i23 - 1] = b4;
                                                i31 += i27;
                                                Test.instanceCount ^= i;
                                                b4 = b4;
                                                Test.instanceCount -= i28;
                                                i27 += i30 * i30;
                                                i27 ^= ((int) (Test.instanceCount));
                                            } else {
                                                i29 <<= i31;
                                                Test.instanceCount -= Test.sFld;
                                                Test.dFld = Test.fFld;
                                                i29 -= ((int) (Test.instanceCount));
                                                l3 += i30;
                                                Test.iArrFld = Test.iArrFld;
                                                i29 = Test.sFld;
                                                Test.sFld += ((short) (i28));
                                                l4 = Test.byFld;
                                                i <<= 30771;
                                                Test.iArrFld[i30 - 1] = i24;
                                                i27 = -197;
                                            }
                                        case 64 :
                                            dArr[i23 - 1] -= l3;
                                            break;
                                        case 65 :
                                            Test.lArrFld[i23][i24 + 1] += l4;
                                            break;
                                        case 66 :
                                    }
                                case 94 :
                                    i25 &= 6;
                                    break;
                            }
                        } 
                }
            }
        } while ((i23 += 3) < 179 );
        FuzzerUtils.out.println((((("i i23 i24 = " + i) + ",") + i23) + ",") + i24);
        FuzzerUtils.out.println((((("i25 i26 i27 = " + i25) + ",") + i26) + ",") + i27);
        FuzzerUtils.out.println((((("b4 i28 i29 = " + (b4 ? 1 : 0)) + ",") + i28) + ",") + i29);
        FuzzerUtils.out.println((((("i30 i31 i32 = " + i30) + ",") + i31) + ",") + i32);
        FuzzerUtils.out.println((((("l3 l4 dArr = " + l3) + ",") + l4) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println((((("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount) + ",") + Test.sFld) + ",") + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println((((("Test.fFld Test.byFld Test.iArrFld = " + Float.floatToIntBits(Test.fFld)) + ",") + Test.byFld) + ",") + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println((((("Test.lArrFld Test.bArrFld byArrFld = " + FuzzerUtils.checkSum(Test.lArrFld)) + ",") + FuzzerUtils.checkSum(Test.bArrFld)) + ",") + FuzzerUtils.checkSum(byArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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