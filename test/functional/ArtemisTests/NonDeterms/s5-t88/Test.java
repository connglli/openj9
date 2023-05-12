// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.net.Socket;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.util.Random;
import java.util.UUID;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 5665369236496304098L;

    public volatile byte byFld = -51;

    public static float fFld = -1.228F;

    public static int iFld = -206;

    public static short sFld = 22309;

    public static long lFld = -622113077L;

    public static float fArrFld[] = new float[N];

    public static int iArrFld[][] = new int[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.191F);
        FuzzerUtils.init(Test.iArrFld, -6519);
    }

    public static long vMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i8, int i9) {
        if (Test.ax$14) {
            int[] ax$15 = new int[8];
            Test.AxOutputRedirectionHelper.redirect();
            try {
                for (byte ax$16 = 0; ax$16 < ax$15.length; ax$16++) {
                    ax$15[ax$16] = -ax$16;
                }
            } catch (Throwable ax$17) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return 1061078528;
        }
        double d1 = -1.6531;
        int i10 = 236;
        int i11 = 51;
        int i12 = -3;
        int i13 = 30835;
        int i14 = -11;
        int iArr2[] = new int[N];
        byte by = 75;
        short s = 31107;
        long lArr1[] = new long[N];
        FuzzerUtils.init(iArr2, 12826);
        FuzzerUtils.init(lArr1, 4191078724L);
        d1 -= i8;
        Test.instanceCount = i9;
        Test.fFld -= i9;
        i10 = 1;
        while ((++i10) < 206) {
            i9 += ((i10 * i9) + i9) - Test.instanceCount;
            for (i11 = 1; i11 < 3; i11 += 2) {
                i12 += i11;
                Test.instanceCount *= ((long) (Test.fFld));
                by >>= ((byte) (i9));
                iArr2[i10 - 1] = i11;
                i8 &= i11;
                for (i13 = 1; i13 < 3; i13++) {
                    switch (((i13 % 8) * 5) + 107) {
                        case 111 :
                            i9 ^= i8;
                            Test.fFld = 30723;
                            iArr2[i13] = -6985;
                            i8 += ((i13 * i10) + Test.instanceCount) - Test.instanceCount;
                            if (i12 != 0) {
                            }
                            i12 = ((int) (Test.instanceCount));
                            iArr2[i10 - 1] = i8;
                            switch ((i13 % 6) + 85) {
                                case 85 :
                                    i12 = i11;
                                    iArr2[i10] += i12;
                                    iArr2[i11] *= s;
                                    i9 += 0 + (i13 * i13);
                                    Test.instanceCount += i13 * i13;
                                    Test.instanceCount += i12;
                                    i14 -= i12;
                                    if (i12 != 0) {
                                    }
                                    iArr2[i10 - 1] >>= ((int) (Test.instanceCount));
                                    break;
                                case 86 :
                                    Test.instanceCount -= by;
                                    i8 -= by;
                                    Test.fArrFld = FuzzerUtils.float1array(N, ((float) (-63.639F)));
                                    i8 = i9;
                                    i9 >>= i11;
                                    Test.iFld = i11;
                                    Test.iFld = i9;
                                    break;
                                case 87 :
                                    Test.instanceCount = by;
                                    break;
                                case 88 :
                                    i12 *= by;
                                    break;
                                case 89 :
                                    i14 = i14;
                                    break;
                                case 90 :
                                    d1 -= d1;
                                default :
                                    Test.instanceCount <<= Test.instanceCount;
                            }
                            break;
                        case 117 :
                            s += ((short) (((i13 * Test.instanceCount) + i14) - i9));
                            break;
                        case 118 :
                            d1 *= Test.fFld;
                            break;
                        case 130 :
                            lArr1[i10 + 1] /= i14 | 1;
                            break;
                        case 124 :
                            Test.fFld += ((i13 * i14) + i11) - Test.instanceCount;
                            break;
                        case 129 :
                            Test.instanceCount -= 11;
                        case 108 :
                            Test.fFld *= Test.fFld;
                            break;
                        case 119 :
                            i8 -= ((int) (Test.fFld));
                    }
                }
            }
        } 
        long meth_res = ((((((((((i8 + i9) + Double.doubleToLongBits(d1)) + i10) + i11) + i12) + by) + i13) + i14) + s) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(lArr1);
        iMeth1_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static int iMeth(int i6) {
        if (Test.ax$0) {
            final int ax$6 = i6;
            short[] ax$1 = new short[]{ 20, 10, 0, -10, -20 };
            short[] ax$3 = new short[]{ ((short) (25673)), ((short) (-13166)), ((short) (19198)), ((short) (11563)), ((short) (26010)), ((short) (-25441)), ((short) (-15983)), ((short) (-9880)), ((short) (-22151)) };
            short[] ax$4 = new short[]{ 20, 10, 0, -10, -20 };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                ax$3[i6] = ((short) ((ax$4[i6] + ax$1[i6]) >> 1));
            } catch (Throwable ax$5) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            i6 = ax$6;
            return -364129270;
        }
        int i7 = -9;
        int i15 = 18625;
        int i16 = -41;
        int i17 = 216;
        int i18 = 65309;
        int i19 = -24530;
        int iArr1[][] = new int[N][N];
        boolean b1 = true;
        boolean bArr[] = new boolean[N];
        double d2 = 27.10835;
        byte by1 = -26;
        byte by2 = -54;
        long lArr2[] = new long[N];
        FuzzerUtils.init(iArr1, -26955);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr2, 4L);
        Test.instanceCount |= Math.abs(iArr1[(i7 >>> 1) % N][(i6 >>> 1) % N]);
        Test.instanceCount -= i6;
        {
            try {
                Random ax$19 = new Random(69);
                SelectableChannel[] ax$27 = new SelectableChannel[]{ null, null, null };
                for (int ax$18 = -225; ax$18 < (-225 + 15134); ax$18 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$20 = 0; ax$20 < 1000; ax$20++) {
                            long ax$21 = ax$19.nextLong();
                            long ax$22 = ax$19.nextLong();
                            int ax$23 = ax$19.nextInt(64);
                            UUID ax$24 = new UUID(ax$21, ax$22);
                            ax$21 = ax$21 ^ (1L << ax$23);
                            UUID ax$25 = new UUID(ax$21, ax$22);
                            if (ax$24.equals(ax$25));
                        }
                    } catch (Throwable ax$26) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$14 = true;
                    iMeth1(986548294, 1253650408);
                    Test.ax$14 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$28 = 0; ax$28 < ax$27.length; ax$28++) {
                            SelectableChannel ax$29 = ax$27[ax$28];
                            ax$29.close();
                            try {
                                ax$29.configureBlocking(true);
                            } catch (ClosedChannelException ax$30) {

                            }
                        }
                    } catch (Throwable ax$31) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
            }
        }
        i6 -= iMeth1(i6, Test.iFld);
        iArr1[(i7 >>> 1) % N] = iArr1[(i6 >>> 1) % N];
        try {
            Test.fFld += Test.instanceCount;
            if (b1) {
                i6 = ((int) (Test.instanceCount));
                i7 = Test.sFld;
            }
            Test.instanceCount -= Test.iFld;
            Test.instanceCount *= ((long) (121.94926));
            i15 = 1;
            while ((++i15) < 91) {
                i6 += i15 * i15;
                for (i16 = 1; 6 > i16; i16++) {
                    bArr[i15 - 1] = b1;
                    Test.instanceCount += i16 * Test.instanceCount;
                    for (d2 = 1; d2 < 2; ++d2) {
                        Test.instanceCount |= i16;
                        if (b1)
                            continue;

                        if (b1) {
                            i7 = i18;
                        } else if (b1) {
                            i6 += ((int) (((d2 * i7) + i6) - i6));
                            iArr1[((int) (d2 + 1))][((int) (d2 - 1))] = i19;
                            iArr1[i16 - 1][i16] |= i16;
                            Test.fFld *= Test.instanceCount;
                            i18 -= i17;
                            Test.instanceCount += ((long) (d2));
                            lArr2[i15 + 1] = i6;
                            Test.instanceCount = by1;
                            Test.fFld = i6;
                            iArr1[i15 - 1][i15 - 1] = Test.sFld;
                        }
                        i19 = by2;
                        i19 -= i6;
                        Test.fFld = i15;
                        i6 ^= -6;
                        i19 ^= ((int) (Test.instanceCount));
                    }
                    i17 %= ((int) (((long) (d2)) | 1));
                }
            } 
        } catch (UserDefinedExceptionTest exc1) {
            iArr1 = iArr1;
        } finally {
            Test.iFld = i19;
        }
        long meth_res = ((((((((((((i6 + i7) + (b1 ? 1 : 0)) + i15) + i16) + i17) + Double.doubleToLongBits(d2)) + i18) + i19) + by1) + by2) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(bArr)) + FuzzerUtils.checkSum(lArr2);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth(int i5) {
        if (Test.ax$41) {
            Socket ax$42 = new Socket();
            byte[] ax$43 = new byte[]{ ((byte) (10)), ((byte) (-40)), ((byte) (-60)), ((byte) (26)), ((byte) (-87)), ((byte) (1)), ((byte) (115)), ((byte) (-101)), ((byte) (31)) };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                ax$42.getInputStream().read(ax$43);
            } catch (Throwable ax$44) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        float f = 108.206F;
        int i20 = 145;
        int i21 = 65420;
        int i22 = -13501;
        int i23 = 169;
        int i24 = -244;
        int i25 = -12090;
        int i26 = -254;
        int i27 = 9;
        int i28 = -122;
        int iArr3[][] = new int[N][N];
        double d3 = -62.71929;
        boolean b2 = true;
        short s1 = 10868;
        short sArr[] = new short[N];
        FuzzerUtils.init(sArr, ((short) (20119)));
        FuzzerUtils.init(iArr3, 9);
        {
            final boolean ax$12 = b2;
            final int ax$13 = i23;
            try {
                for (int ax$7 = -906; ax$7 < (-906 + 10763); ax$7 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        b2 = true;
                    } catch (Throwable ax$9) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$0 = true;
                    iMeth(-528099474);
                    Test.ax$0 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if (i23 != 42) {
                        }
                    } catch (Throwable ax$11) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                b2 = ax$12;
                i23 = ax$13;
            }
        }
        iMeth(Test.iFld);
        if (b2) {
            for (f = 11; 218 > f; ++f) {
                sArr[((int) (f - 1))] += ((short) (f));
                for (i21 = 3; i21 > 1; i21 -= 2) {
                    Test.fFld += i21 * i21;
                }
                for (i23 = 1; i23 < 3; i23++) {
                    iArr3[((int) (f))][i23] >>= i23;
                    d3 += i20;
                    if (b2)
                        continue;

                    i20 = -60409;
                    i5 = i20;
                    iArr3[i23 + 1][((int) (f))] &= i5;
                    iArr3[i23 + 1][((int) (f))] = ((int) (Test.instanceCount));
                    Test.fFld = i21;
                    d3 += Test.instanceCount;
                    i24 = ((int) (Test.instanceCount));
                    Test.fArrFld[((int) (f))] += i20;
                }
                switch (((i23 >>> 1) % 2) + 107) {
                    case 107 :
                        Test.instanceCount += ((long) (f));
                        iArr3[((int) (f))][((int) (f + 1))] = -11837;
                        i25 = 3;
                        while ((i25 -= 2) > 0) {
                            for (i26 = ((int) (f)); i26 < 2; ++i26) {
                                Test.lFld = 14379;
                                i27 += ((int) (Test.lFld));
                                i27 >>= ((int) (Test.lFld));
                                try {
                                    Test.iFld = iArr3[i26 - 1][i25 - 1] % i28;
                                    i28 = iArr3[((int) (f))][i25] % Test.iFld;
                                    i20 = 2 / i27;
                                } catch (ArithmeticException a_e) {
                                }
                            }
                            s1 = ((short) (-2452581058L));
                            i24 += 8;
                            iArr3[((int) (f + 1))] = iArr3[((int) (f + 1))];
                            if (b2)
                                break;

                            if (false) {
                                if (i26 != 0) {
                                    vMeth_check_sum += ((((((((((((((i5 + Float.floatToIntBits(f)) + i20) + i21) + i22) + i23) + i24) + Double.doubleToLongBits(d3)) + (b2 ? 1 : 0)) + i25) + i26) + i27) + i28) + s1) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(iArr3);
                                    return;
                                }
                                iArr3[((int) (f))][i25 - 1] -= ((int) (Test.lFld));
                                if (i23 != 0) {
                                    vMeth_check_sum += ((((((((((((((i5 + Float.floatToIntBits(f)) + i20) + i21) + i22) + i23) + i24) + Double.doubleToLongBits(d3)) + (b2 ? 1 : 0)) + i25) + i26) + i27) + i28) + s1) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(iArr3);
                                    return;
                                }
                                iArr3[((int) (f + 1))][((int) (f))] = i26;
                            } else if (true) {
                                if (i28 != 0) {
                                    vMeth_check_sum += ((((((((((((((i5 + Float.floatToIntBits(f)) + i20) + i21) + i22) + i23) + i24) + Double.doubleToLongBits(d3)) + (b2 ? 1 : 0)) + i25) + i26) + i27) + i28) + s1) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(iArr3);
                                    return;
                                }
                            } else {
                                Test.instanceCount >>>= 252;
                                vMeth_check_sum += ((((((((((((((i5 + Float.floatToIntBits(f)) + i20) + i21) + i22) + i23) + i24) + Double.doubleToLongBits(d3)) + (b2 ? 1 : 0)) + i25) + i26) + i27) + i28) + s1) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(iArr3);
                                return;
                            }
                        } 
                        break;
                    case 108 :
                }
            }
        } else if (b2) {
            Test.iFld += ((int) (-88235162L));
        }
        vMeth_check_sum += ((((((((((((((i5 + Float.floatToIntBits(f)) + i20) + i21) + i22) + i23) + i24) + Double.doubleToLongBits(d3)) + (b2 ? 1 : 0)) + i25) + i26) + i27) + i28) + s1) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {
        int i = 12;
        int i1 = -187;
        int i2 = 36864;
        int i3 = -21639;
        int i4 = -6;
        int i29 = 214;
        int i30 = 0;
        int i31 = -2;
        int i32 = 112;
        int i33 = 41584;
        int i34 = 57;
        int i35 = -15;
        int i36 = -4;
        int i37 = 152;
        int i38 = -249;
        int i39 = -16353;
        int i40 = 1;
        int iArr[] = new int[N];
        double d = -86.66691;
        boolean b = false;
        long l = 7196843849021079627L;
        long lArr[] = new long[N];
        FuzzerUtils.init(lArr, 1889130385L);
        FuzzerUtils.init(iArr, 10);
        for (i = 4; 228 > i; ++i) {
            lArr[i - 1] += Math.max(i, i1);
            switch ((i % 10) + 33) {
                case 33 :
                    byFld *= ((byte) (iArr[i + 1] - i1));
                    iArr[i + 1] += ((int) (-964255082L));
                    for (d = 1; d < 23; ++d) {
                        Test.instanceCount += ((long) (d));
                        i1 += i2--;
                        if (false) {
                            lArr[i] |= ((long) (i - (i2 = ((int) (Test.fArrFld[i - 1])))));
                            i1 += ((int) (d - i1));
                            for (i3 = 1; 2 > i3; ++i3) {
                                Test.instanceCount -= Math.abs((i + i2) * (++i2));
                                i4 = i;
                                i2 = i4++;
                                Test.instanceCount >>>= i1++;
                                i1 += i3 * i3;
                                i4 = ((int) (4190289962L));
                                if (b)
                                    continue;

                                {
                                    final int ax$55 = i40;
                                    final int ax$56 = i36;
                                    final int ax$57 = i37;
                                    try {
                                        BigDecimal[] ax$48 = new BigDecimal[]{ null, null, null, null, null };
                                        BigDecimal[][] ax$51 = new BigDecimal[][]{ new BigDecimal[]{ null, null, null }, new BigDecimal[]{ null, null, null, null, null } };
                                        BigDecimal[] ax$52 = new BigDecimal[]{ new BigDecimal("78403046.66936930160"), new BigDecimal("8091404.666936930160"), new BigDecimal("1060240.4666936930160") };
                                        for (int ax$45 = -308; ax$45 < (-308 + 2450); ax$45 += 1) {
                                            Test.AxOutputRedirectionHelper.redirect();
                                            try {
                                                if (i37 > 0) {
                                                }
                                            } catch (Throwable ax$47) {
                                            } finally {
                                            }
                                            Test.AxOutputRedirectionHelper.recover();
                                            Test.ax$41 = true;
                                            vMeth(-1226855805);
                                            Test.ax$41 = false;
                                            Test.AxOutputRedirectionHelper.redirect();
                                            try {
                                                for (int ax$53 = 0; ax$53 < ax$48.length; ax$53++) {
                                                    if (!ax$52[i40].multiply(ax$48[ax$53]).equals(ax$51[i40][ax$53])) {
                                                        i36++;
                                                    }
                                                }
                                            } catch (Throwable ax$54) {
                                            } finally {
                                            }
                                            Test.AxOutputRedirectionHelper.recover();
                                        }
                                    } finally {
                                        i40 = ax$55;
                                        i36 = ax$56;
                                        i37 = ax$57;
                                    }
                                }
                                vMeth(Test.iFld);
                                i2 /= ((int) (Test.iFld | 1));
                                i2 += ((i3 * i3) + Test.sFld) - Test.iFld;
                                i4 <<= i1;
                            }
                            for (i29 = 2; 1 < i29; i29--) {
                                Test.sFld |= ((short) (i29));
                                try {
                                    i1 = iArr[i29] / Test.iFld;
                                    i4 = 14758 / Test.iFld;
                                    Test.iFld = i % Test.iFld;
                                } catch (ArithmeticException a_e) {
                                }
                                i1 = i3;
                                i2 += i29 * i29;
                                lArr[i29] *= i3;
                                i2 &= i2;
                                i4 *= i1;
                            }
                            iArr[((int) (d))] <<= i2;
                            for (i31 = 1; 2 > i31; ++i31) {
                                iArr[((int) (d + 1))] += i32;
                                lArr[i31 + 1] = -5951L;
                                iArr[i + 1] -= ((int) (Test.instanceCount));
                                i4 += i31 * i31;
                            }
                            Test.instanceCount += ((long) (d + Test.lFld));
                            i30 /= ((int) (i | 1));
                            i1 *= ((int) (Test.instanceCount));
                            Test.lFld -= Test.instanceCount;
                            for (i33 = 1; i33 < 2; i33++) {
                                Test.fFld += ((i33 * Test.lFld) + i30) - Test.sFld;
                                Test.instanceCount += ((long) (Test.fFld));
                                Test.iArrFld = Test.iArrFld;
                            }
                            Test.instanceCount -= i1;
                        } else {
                            if (b)
                                continue;

                            i30 += ((int) (((d * Test.instanceCount) + Test.iFld) - i31));
                            Test.fFld += i33;
                            Test.iArrFld[i + 1][i] <<= ((int) (Test.instanceCount));
                            iArr[((int) (d - 1))] >>= ((int) (1L));
                            Test.lFld <<= Test.instanceCount;
                            for (i35 = 1; i35 < 2; ++i35) {
                                i34 >>= i36;
                                try {
                                    Test.iFld = i % i35;
                                    Test.iArrFld[i35 - 1][((int) (d))] = i2 / (-233);
                                    i2 = i2 / (-74301468);
                                } catch (ArithmeticException a_e) {
                                }
                                Test.iFld += ((int) (0.99F + (i35 * i35)));
                                if (b)
                                    break;

                                Test.iFld += (-109) + (i35 * i35);
                            }
                            for (i37 = 1; i37 < 2; ++i37) {
                                Test.fFld -= i36;
                                Test.instanceCount += ((i37 * Test.instanceCount) + i4) - Test.lFld;
                                Test.lFld *= Test.iFld;
                                Test.fFld = l;
                                Test.fFld += ((i37 * i36) + l) - i1;
                                iArr[i - 1] >>>= i4;
                                i4 >>= ((int) (Test.lFld));
                                i4 += i37;
                                i30 += i37 - i1;
                            }
                            Test.iFld = ((int) (l));
                            for (i39 = 1; i39 < 2; i39++) {
                                Test.fFld += i39 + Test.lFld;
                                if (b)
                                    continue;

                                i2 += i38;
                                byFld = ((byte) (i38));
                                Test.iFld += (-90) + (i39 * i39);
                            }
                        }
                    }
                    break;
                case 34 :
                    i36 = i31;
                    break;
                case 35 :
                    i4 += i * i;
                    break;
                case 36 :
                    i30 += ((i * Test.lFld) + byFld) - i;
                    break;
                case 37 :
                    b = b;
                    break;
                case 38 :
                    l = i30;
                    break;
                case 39 :
                    Test.iFld >>= 96;
                    break;
                case 40 :
                    {
                        final int ax$40 = i1;
                        try {
                            double[] ax$34 = new double[1];
                            long[] ax$37 = new long[]{ 7L, 7L, 5L, 5L, 7L, 7L, 7L, 5L, 5L };
                            boolean ax$33 = false;
                            for (int ax$32 = -163; ax$32 < (-163 + 15367); ax$32 += 1) {
                                Test.AxOutputRedirectionHelper.redirect();
                                try {
                                    ax$34[i1] = 0;
                                } catch (Throwable ax$36) {
                                } finally {
                                }
                                Test.AxOutputRedirectionHelper.recover();
                                if (!ax$33) {
                                    i4 += ((int) (2753658516L + (i * i)));
                                    ax$33 = true;
                                }
                                Test.AxOutputRedirectionHelper.redirect();
                                try {
                                    for (int ax$38 = 0; ax$38 < 1000; ax$38++) {
                                        ax$37[ax$38] = ax$38;
                                    }
                                } catch (Throwable ax$39) {
                                } finally {
                                }
                                Test.AxOutputRedirectionHelper.recover();
                            }
                        } finally {
                            i1 = ax$40;
                        }
                    }
                case 41 :
                    i34 *= i35;
                    break;
                case 42 :
                    Test.instanceCount >>= i29;
                    break;
                default :
                    b = b;
            }
        }
        FuzzerUtils.out.println((((("i i1 d = " + i) + ",") + i1) + ",") + Double.doubleToLongBits(d));
        FuzzerUtils.out.println((((("i2 i3 i4 = " + i2) + ",") + i3) + ",") + i4);
        FuzzerUtils.out.println((((("b i29 i30 = " + (b ? 1 : 0)) + ",") + i29) + ",") + i30);
        FuzzerUtils.out.println((((("i31 i32 i33 = " + i31) + ",") + i32) + ",") + i33);
        FuzzerUtils.out.println((((("i34 i35 i36 = " + i34) + ",") + i35) + ",") + i36);
        FuzzerUtils.out.println((((("i37 i38 l = " + i37) + ",") + i38) + ",") + l);
        FuzzerUtils.out.println((((("i39 i40 lArr = " + i39) + ",") + i40) + ",") + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println((((("Test.instanceCount byFld Test.fFld = " + Test.instanceCount) + ",") + byFld) + ",") + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println((((("Test.iFld Test.sFld Test.lFld = " + Test.iFld) + ",") + Test.sFld) + ",") + Test.lFld);
        FuzzerUtils.out.println((("Test.fArrFld Test.iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))) + ",") + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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

    static Boolean ax$14 = false;

    static Boolean ax$41 = false;
}