// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.zip.ZipInputStream;

public class Test {
    public static final int N = 256;

    public static volatile long instanceCount = 188355544L;

    public static short sFld = 26377;

    public float fFld = -45.673F;

    public int iFld = -18987;

    public static boolean bFld = false;

    public static int iFld1 = -17460;

    public static long lArrFld[] = new long[N];

    public static volatile double dArrFld[] = new double[N];

    public volatile float fArrFld[] = new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -7L);
        FuzzerUtils.init(Test.dArrFld, 2.114113);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long fMeth_check_sum = 0;

    public static float fMeth(long l1, long l2) {
        if (Test.ax$0) {
            final int ax$6 = Test.iFld1;
            byte[] ax$2 = new byte[]{ 0, -1, -2, -3, -4 };
            ZipInputStream ax$3 = null;
            Test.AxOutputRedirectionHelper.redirect();
            try {
                iFld1 = ax$3.read(ax$2, ++iFld1, 1);
            } catch (Throwable ax$5) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            Test.iFld1 = ax$6;
            return 0.32488173F;
        }
        int i4 = -12315;
        int i5 = 44436;
        int i6 = -56;
        int i7 = -43667;
        int i8 = 22618;
        int iArr[] = new int[N];
        double d1 = -1.82244;
        float f = -119.611F;
        byte by1 = -118;
        boolean b = true;
        long l3 = 76L;
        FuzzerUtils.init(iArr, 98);
        for (i4 = 6; i4 < 249; i4++) {
            for (i6 = 1; i6 < 3; ++i6) {
                iArr[i6] = i6;
                try {
                    i5 = i6 % i4;
                    i7 = iArr[i4 - 1] / 251247440;
                    i7 = i6 / iArr[i4 - 1];
                } catch (ArithmeticException a_e) {
                }
                i5 = ((int) (d1));
                i7 -= -8;
                i8 = 1;
                do {
                    f -= i6;
                    l1 += i8 * i8;
                    i5 += i8 - i6;
                    d1 -= i8;
                    i7 &= ((int) (l2));
                    l2 *= ((long) (-98.543F));
                    l2 += i6;
                    try {
                        i5 = i6 % 223;
                        i5 = i8 % i7;
                        i5 = 50 / i8;
                    } catch (ArithmeticException a_e) {
                    }
                    i7 += i8;
                    i7 = i4;
                    if (b) {
                        i5 += ((int) (f));
                        try {
                            i7 = iArr[i8 - 1] / (-47);
                            i7 = i5 % (-41075);
                            iArr[i4 - 1] = i8 % iArr[i8 + 1];
                        } catch (ArithmeticException a_e) {
                        }
                        l2 += ((long) (f));
                        if (b) {
                            i7 += ((i8 * i4) + Test.sFld) - i8;
                            i7 += i8 * i8;
                            i5 /= ((int) (Test.sFld | 1));
                            i7 = i6;
                            switch ((i4 % 5) + 17) {
                                case 17 :
                                    by1 >>= ((byte) (i6));
                                    i7 -= by1;
                                    i5 |= i8;
                                    break;
                                case 18 :
                                    i5 = i8;
                                    i7 += ((i8 * i8) + i6) - Test.instanceCount;
                                    if (b)
                                        continue;

                                    if (i6 != 0) {
                                    }
                                    l2 -= ((long) (f));
                                    i5 = i7;
                                    i7 -= i8;
                                    break;
                                case 19 :
                                    i5 <<= i4;
                                    break;
                                case 20 :
                                    i7 = i4;
                                    break;
                                case 21 :
                                    l3 = i7;
                                    break;
                            }
                        } else {
                            i7 += (-4981) + (i8 * i8);
                        }
                    } else if (true) {
                        iArr[i6 - 1] = ((int) (64.969F));
                    } else if (b) {
                        Test.lArrFld[i4 - 1] += 107;
                    } else {
                        l3 = i4;
                    }
                } while ((++i8) < 2 );
            }
        }
        long meth_res = (((((((((((l1 + l2) + i4) + i5) + i6) + i7) + Double.doubleToLongBits(d1)) + i8) + Float.floatToIntBits(f)) + by1) + (b ? 1 : 0)) + l3) + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return ((float) (meth_res));
    }

    public static void vMeth1(double d, int i1) {
        byte by = 72;
        int i2 = 4;
        int i3 = -53;
        int i9 = -42420;
        int i10 = 2;
        int i11 = 166;
        int i12 = 158;
        int iArr1[][] = new int[N][N];
        float f1 = 1.397F;
        float fArr[] = new float[N];
        boolean b1 = false;
        boolean bArr[][] = new boolean[N][N];
        FuzzerUtils.init(iArr1, -46564);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(fArr, -86.646F);
        by += ((byte) (i1 & (i1--)));
        for (i2 = 1; i2 < 173; ++i2) {
            i3 += i2 | i3;
            {
                final int ax$17 = Test.iFld1;
                final int ax$18 = i1;
                final int ax$19 = i2;
                try {
                    AtomicIntegerArray ax$8 = null;
                    Integer ax$13 = -1758509130;
                    Integer ax$15 = 195225786;
                    for (int ax$7 = -987; ax$7 < (-987 + 13529); ax$7 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            ax$8.set(i2 + i1, iFld1);
                        } catch (Throwable ax$12) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                        Test.ax$0 = true;
                        fMeth(-5095047994908902451L, -6102152813961490625L);
                        Test.ax$0 = false;
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            if ((iFld1 & 1) == 0) {
                                ax$15 = ax$15 + 1;
                            } else {
                                ax$13 = ax$13 + 2;
                            }
                        } catch (Throwable ax$16) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                    }
                } finally {
                    Test.iFld1 = ax$17;
                    i1 = ax$18;
                    i2 = ax$19;
                }
            }
            Test.instanceCount += ((long) (fMeth(Test.instanceCount, Test.instanceCount)));
            f1 += i2 + i2;
            i1 >>>= i1;
            if (b1) {
                by += ((byte) (i2));
                iArr1[i2 + 1][i2 - 1] |= i3;
                vMeth1_check_sum += ((((((((((((Double.doubleToLongBits(d) + i1) + by) + i2) + i3) + Float.floatToIntBits(f1)) + (b1 ? 1 : 0)) + i9) + i10) + i11) + i12) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(bArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            } else if (b1) {
                bArr[i2][i2 + 1] = b1;
                fArr[i2 + 1] = -2818;
                i9 = 1;
                while ((i9 += 2) < 3) {
                    switch ((((i2 >>> 1) % 6) * 5) + 91) {
                        case 100 :
                            i3 += i9 * i9;
                            b1 = false;
                            i3 += i9;
                            switch (((i9 % 2) * 5) + 37) {
                                case 44 :
                                    if (b1)
                                        break;

                                    i3 ^= -6;
                                    i3 += i9 ^ i3;
                                    break;
                                case 43 :
                                    i10 = 1;
                                    while ((++i10) < 3) {
                                        Test.dArrFld = Test.dArrFld;
                                        if (i1 != 0) {
                                            vMeth1_check_sum += ((((((((((((Double.doubleToLongBits(d) + i1) + by) + i2) + i3) + Float.floatToIntBits(f1)) + (b1 ? 1 : 0)) + i9) + i10) + i11) + i12) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(bArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                                            return;
                                        }
                                        if (b1)
                                            continue;

                                        fArr[i9 - 1] -= f1;
                                        Test.lArrFld[i10] >>= -93;
                                        i1 >>>= i3;
                                    }
                                    for (i11 = i9; i11 < 3; i11++) {
                                        Test.instanceCount = i10;
                                        i3 -= i10;
                                        Test.instanceCount -= i1;
                                        i12 += i11 * i11;
                                        iArr1[i2][i9 - 1] <<= ((int) (-60793L));
                                        i3 = i12;
                                        Test.instanceCount = Test.instanceCount;
                                        i1 += ((i11 * i11) + i9) - f1;
                                        i12 <<= i2;
                                    }
                                    break;
                                default :
                                    iArr1[i9 - 1][i2 + 1] = i2;
                            }
                            break;
                        case 92 :
                            i12 += i9 + i11;
                            break;
                        case 117 :
                            i12 += ((i9 * i10) + i2) - i10;
                            break;
                        case 98 :
                        case 121 :
                            f1 += ((i9 * Test.instanceCount) + i11) - i9;
                            break;
                        case 101 :
                        default :
                            i3 = ((int) (-2L));
                    }
                }
            } else {
                i12 <<= i10;
                vMeth1_check_sum += ((((((((((((Double.doubleToLongBits(d) + i1) + by) + i2) + i3) + Float.floatToIntBits(f1)) + (b1 ? 1 : 0)) + i9) + i10) + i11) + i12) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(bArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
        }
        vMeth1_check_sum += ((((((((((((Double.doubleToLongBits(d) + i1) + by) + i2) + i3) + Float.floatToIntBits(f1)) + (b1 ? 1 : 0)) + i9) + i10) + i11) + i12) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(bArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void vMeth(long l, int i, short s) {
        double d2 = 0.90986;
        int i13 = -8;
        int i14 = 7;
        int i15 = 3;
        int i16 = -10;
        int i17 = -7;
        int i18 = 3;
        int i19 = -26774;
        int i20 = 4;
        int i21 = -232;
        int i22 = -1;
        int i23 = 46215;
        int i24 = 131;
        int i25 = -90;
        int i26 = 12;
        int iArr2[] = new int[N];
        byte by2 = 110;
        FuzzerUtils.init(iArr2, -4);
        vMeth1(d2, i);
        for (i13 = 3; 193 > i13; ++i13) {
            if (i13 != 0) {
                vMeth_check_sum += ((((((((((((((((((l + i) + s) + Double.doubleToLongBits(d2)) + i13) + i14) + i15) + i16) + i17) + i18) + i19) + by2) + i20) + i21) + i22) + i23) + i24) + i25) + i26) + FuzzerUtils.checkSum(iArr2);
                return;
            }
            i += i13;
        }
        for (i15 = 3; i15 < 164; ++i15) {
            i17 = 1;
            do {
                for (i18 = 1; i18 < 1; ++i18) {
                    i14 *= Test.sFld;
                    iArr2[i18 + 1] -= by2;
                    fFld -= i20;
                    i |= ((int) (l));
                    l = i13;
                    i19 = -64922;
                    iArr2[(i16 >>> 1) % N] = i14;
                }
                i += ((int) (l));
                Test.dArrFld[i15] += l;
                if (true) {
                    s += ((short) (i17));
                    i21 += i14;
                    iFld = by2;
                    fFld *= Test.instanceCount;
                    for (i22 = 1; i22 > 1; --i22) {
                        iArr2[i17] = i22;
                        fArrFld[i15] = i19;
                        i21 += ((i22 * i19) + i) - i22;
                        i21 += i21;
                        Test.lArrFld[i17] += ((long) (d2));
                        l += i22 * i22;
                    }
                    Test.bFld = Test.bFld;
                    for (i24 = 1; 1 > i24; ++i24) {
                        Test.lArrFld[i15 - 1] >>= l;
                        i19 = -308;
                        i23 += i20;
                        iFld = ((int) (fFld));
                        i ^= ((int) (l));
                    }
                    i19 = s;
                    i26 <<= ((int) (Test.instanceCount));
                } else {
                    i25 >>>= i15;
                    vMeth_check_sum += ((((((((((((((((((l + i) + s) + Double.doubleToLongBits(d2)) + i13) + i14) + i15) + i16) + i17) + i18) + i19) + by2) + i20) + i21) + i22) + i23) + i24) + i25) + i26) + FuzzerUtils.checkSum(iArr2);
                    return;
                }
            } while ((++i17) < 4 );
        }
        vMeth_check_sum += ((((((((((((((((((l + i) + s) + Double.doubleToLongBits(d2)) + i13) + i14) + i15) + i16) + i17) + i18) + i19) + by2) + i20) + i21) + i22) + i23) + i24) + i25) + i26) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {
        if (Test.ax$20) {
            double ax$21 = new Double(65485.0F);
            Test.AxOutputRedirectionHelper.redirect();
            try {
                ax$21 = 10.0 / ax$21;
            } catch (Throwable ax$22) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        int i27 = 6;
        int i28 = -133;
        int i29 = 92;
        int i30 = 6;
        int i32 = -14;
        int iArr3[][] = new int[N][N];
        byte by3 = -65;
        FuzzerUtils.init(iArr3, 12782);
        vMeth(Test.instanceCount, iFld, Test.sFld);
        i27 = 1;
        do {
            for (i28 = 1; i28 < 22; ++i28) {
                double d3 = -1.5824;
                i29 <<= ((int) (Test.instanceCount));
                iFld = Test.sFld;
                iFld += ((i28 * iFld) + i29) - iFld;
                d3 = iFld;
                Test.bFld = Test.bFld;
                d3 += i28;
                i29 += ((int) (d3));
                i30 = 1;
                while ((++i30) < 2) {
                    int i31 = 12754;
                    Test.lArrFld[i28] &= i30;
                    iFld += i30 * i30;
                    Test.instanceCount += 14502L;
                    i29 += ((int) (1.9226));
                    iFld = ((int) (Test.instanceCount));
                    switch ((i28 % 4) + 126) {
                        case 126 :
                            iFld = i28;
                            switch (((i28 % 5) * 5) + 87) {
                                case 92 :
                                    i29 &= i27;
                                    i29 = i27;
                                    by3 += ((byte) (i28));
                                    iArr3[i30][i30 - 1] = ((int) (Test.instanceCount));
                                    Test.lArrFld[i30 - 1] = Test.instanceCount;
                                    Test.lArrFld[i30] += i27;
                                    switch (((i28 % 2) * 5) + 90) {
                                        case 95 :
                                            d3 = i30;
                                            by3 *= ((byte) (i28));
                                            fFld += by3;
                                            iArr3[i30][i28 + 1] = i30;
                                            i29 = 0;
                                            Test.instanceCount *= i27;
                                            Test.iFld1 &= i30;
                                            Test.instanceCount = Test.sFld;
                                            i29 >>= 0;
                                            iArr3[i30 - 1][i30 + 1] |= ((int) (Test.instanceCount));
                                            iFld += i30 - i27;
                                            try {
                                                i29 = iArr3[i28][i28] % (-111);
                                                i29 = 1732479271 / i27;
                                                i29 = i28 / iArr3[i27][i30 + 1];
                                            } catch (ArithmeticException a_e) {
                                            }
                                            fArrFld[i27] = 204;
                                            switch ((i27 % 8) + 50) {
                                                case 50 :
                                                    iFld = iFld;
                                                    Test.iFld1 = ((int) (Test.instanceCount));
                                                    Test.iFld1 += ((int) (Test.instanceCount));
                                                    Test.sFld += ((short) (i30));
                                                    fFld = Test.instanceCount;
                                                    iFld += i30;
                                                    iFld += ((i30 * Test.instanceCount) + i29) - Test.instanceCount;
                                                    Test.iFld1 -= Test.iFld1;
                                                    iFld = i30;
                                                    iFld = 38743;
                                                    Test.iFld1 += i30 * Test.instanceCount;
                                                    i29 = i29;
                                                    break;
                                                case 51 :
                                                    Test.sFld += ((short) (((i30 * i27) + Test.instanceCount) - i29));
                                                    fFld += i30;
                                                    if (Test.bFld)
                                                        continue;

                                                    by3 |= ((byte) (i28));
                                                    break;
                                                case 52 :
                                                    try {
                                                        iFld = (-126) / iFld;
                                                        i29 = (-33771) / iArr3[i27 + 1][i28];
                                                        i29 = (-191) % Test.iFld1;
                                                    } catch (ArithmeticException a_e) {
                                                    }
                                                    i29 += i31;
                                                    i29 += ((int) (-48863194776157325L));
                                                    i29 = 226;
                                                    Test.bFld = Test.bFld;
                                                case 53 :
                                                    i31 += ((i30 * by3) + fFld) - by3;
                                                    Test.instanceCount += i30 + Test.instanceCount;
                                                    Test.instanceCount *= -75;
                                                    iFld += i30;
                                                    d3 -= i27;
                                                    i29 -= iFld;
                                                    fFld = fFld;
                                                    i32 = ((int) (Test.instanceCount));
                                                case 54 :
                                                    fFld += ((i30 * i32) + Test.instanceCount) - Test.iFld1;
                                                    Test.iFld1 += i30 * i31;
                                                    i32 <<= i28;
                                                    i31 += Test.sFld;
                                                    iFld -= ((int) (Test.instanceCount));
                                                    Test.instanceCount -= ((long) (d3));
                                                    break;
                                                case 55 :
                                                    fFld *= i30;
                                                    break;
                                                case 56 :
                                                    Test.instanceCount += i30;
                                                    break;
                                                case 57 :
                                                    iArr3[i27 - 1][i27] += i28;
                                                    break;
                                            }
                                            break;
                                        case 92 :
                                            Test.instanceCount -= Test.instanceCount;
                                            break;
                                        default :
                                            iArr3[i27 + 1][i30] = 3;
                                    }
                                    break;
                                case 94 :
                                case 97 :
                                    iFld += iFld;
                                    break;
                                case 101 :
                                    i31 = i29;
                                case 90 :
                                    iArr3[i30 - 1][i27 + 1] -= iFld;
                                default :
                                    iArr3[i28 - 1][i27 - 1] >>= ((int) (11L));
                            }
                            break;
                        case 127 :
                            fFld -= 75L;
                            break;
                        case 128 :
                            i31 -= i30;
                            break;
                        case 129 :
                            i31 += ((i30 * i30) + Test.iFld1) - i31;
                            break;
                    }
                }
            }
        } while ((++i27) < 234 );
        FuzzerUtils.out.println((((("i27 i28 i29 = " + i27) + ",") + i28) + ",") + i29);
        FuzzerUtils.out.println((((("i30 by3 i32 = " + i30) + ",") + by3) + ",") + i32);
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println((((("Test.instanceCount Test.sFld fFld = " + Test.instanceCount) + ",") + Test.sFld) + ",") + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println((((("iFld Test.bFld Test.iFld1 = " + iFld) + ",") + (Test.bFld ? 1 : 0)) + ",") + Test.iFld1);
        FuzzerUtils.out.println((((("Test.lArrFld Test.dArrFld fArrFld = " + FuzzerUtils.checkSum(Test.lArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld))) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                {
                    final int ax$34 = i;
                    try {
                        short[] ax$24 = new short[]{ ((short) (-21931)), ((short) (1378)), ((short) (24457)), ((short) (-18450)) };
                        short[] ax$26 = new short[]{ ((short) (-16683)), ((short) (-15400)), ((short) (-16007)), ((short) (-17673)), ((short) (-13872)), ((short) (11217)), ((short) (24135)), ((short) (15998)) };
                        SelectableChannel[] ax$29 = new SelectableChannel[]{ null, null, null };
                        for (int ax$23 = -762; ax$23 < (-762 + 17112); ax$23 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$27 = 0; ax$27 < ax$26.length; ax$27 += 1) {
                                    ax$26[ax$27] = ((short) (ax$24[ax$27] >>> (-i)));
                                }
                            } catch (Throwable ax$28) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            Test.ax$20 = true;
                            _instance.mainTest(new String[]{ "s", "s", "s", "s", "s", "s", "s" });
                            Test.ax$20 = false;
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                SelectableChannel ax$31 = ax$29[i];
                                ax$31.close();
                                try {
                                    ax$31.configureBlocking(true);
                                } catch (ClosedChannelException ax$32) {

                                }
                            } catch (Throwable ax$33) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        i = ax$34;
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

    static Boolean ax$20 = false;
}