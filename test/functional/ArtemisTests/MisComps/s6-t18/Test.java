// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.FloatBuffer;
import java.security.Provider;

public class Test {
    public static final int N = 256;

    public static long instanceCount = -172L;

    public static double dFld = -61.64259;

    public static boolean bFld = false;

    public static short sFld = -1248;

    public static byte byFld = -96;

    public static volatile float fFld = 2.248F;

    public int iFld = -3;

    public short sFld1 = -17188;

    public static double dArrFld[] = new double[N];

    public static int iArrFld[][] = new int[N][N];

    public long lArrFld[] = new long[N];

    public short sArrFld[][] = new short[N][N];

    static {
        FuzzerUtils.init(Test.dArrFld, -1.72405);
        FuzzerUtils.init(Test.iArrFld, 40544);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long lMeth_check_sum = 0;

    public static long lMeth() {
        short s = -22737;
        int i5 = 2;
        int i6 = 6;
        int i7 = -169;
        int i8 = -123;
        int i9 = 1;
        int i10 = -43504;
        int i11 = -221;
        int i12 = 51272;
        int i13 = 104;
        int i14 = 2;
        int iArr1[] = new int[N];
        float f1 = 16.638F;
        byte by = 3;
        boolean b2 = true;
        boolean bArr[][] = new boolean[N][N];
        long lArr[] = new long[N];
        FuzzerUtils.init(iArr1, 8);
        FuzzerUtils.init(lArr, -4L);
        FuzzerUtils.init(bArr, true);
        s = ((short) (-6));
        i5 = ((int) (f1));
        i5 <<= ((int) (Test.instanceCount));
        iArr1[(i5 >>> 1) % N] *= i5;
        i5 += i6;
        i5 <<= i5;
        for (i7 = 5; i7 < 92; i7++) {
            i9 = 1;
            while ((i9 += 3) < 6) {
                iArr1[i9 + 1] -= ((int) (Test.dFld));
                switch ((i7 % 2) + 117) {
                    case 117 :
                        Test.instanceCount = i10;
                        for (i11 = 1; i11 < 3; ++i11) {
                            i8 = ((int) (Test.instanceCount));
                            if (b2) {
                                switch (((i9 >>> 1) % 9) + 18) {
                                    case 18 :
                                        i6 += ((i11 * i7) + i5) - Test.instanceCount;
                                        i8 += i11 * i11;
                                        i6 -= i7;
                                        Test.instanceCount <<= Test.instanceCount;
                                        Test.instanceCount = 11634;
                                        break;
                                    case 19 :
                                        f1 += i11 * i5;
                                        i6 += ((int) (f1));
                                        Test.instanceCount += i11 * Test.instanceCount;
                                        iArr1[i7] >>= i6;
                                        iArr1[i11] ^= i10;
                                        i5 ^= i8;
                                        by += ((byte) (((i11 * i6) + s) - f1));
                                        i8 = by;
                                        switch (((i7 % 8) * 5) + 45) {
                                            case 68 :
                                                try {
                                                    i13 = i5 % i10;
                                                    i13 = iArr1[i9 + 1] % iArr1[i11 - 1];
                                                    i6 = i5 / i7;
                                                } catch (ArithmeticException a_e) {
                                                }
                                                iArr1 = FuzzerUtils.int1array(N, ((int) (-220)));
                                                f1 *= i5;
                                                Test.dFld *= Test.instanceCount;
                                                f1 += i11 * i5;
                                                by -= ((byte) (Test.instanceCount));
                                                i8 += ((int) (1.46446));
                                                i6 += ((i11 * i6) + i9) - i5;
                                                break;
                                            case 52 :
                                                i10 = s;
                                            case 60 :
                                            case 65 :
                                                Test.instanceCount *= i12;
                                            case 61 :
                                                i14 += i6;
                                                break;
                                            case 71 :
                                                Test.dFld += s;
                                                break;
                                            case 57 :
                                                b2 = b2;
                                                break;
                                            case 53 :
                                                i5 |= i10;
                                            default :
                                                i8 += by;
                                        }
                                        break;
                                    case 20 :
                                        s >>= ((short) (Test.instanceCount));
                                    case 21 :
                                        iArr1[i7] = i5;
                                        break;
                                    case 22 :
                                        i6 *= ((int) (1125678703750807794L));
                                        break;
                                    case 23 :
                                        i10 += i10;
                                    case 24 :
                                        i8 += ((i11 * Test.instanceCount) + Test.instanceCount) - i14;
                                        break;
                                    case 25 :
                                        i12 -= i13;
                                        break;
                                    case 26 :
                                        i10 += -22657;
                                        break;
                                }
                            } else if (b2) {
                                try {
                                    i10 = (-55926) % i8;
                                    i14 = i12 / 27454;
                                    i8 = (-122) / i7;
                                } catch (ArithmeticException a_e) {
                                }
                            } else {
                                b2 = Test.bFld;
                            }
                        }
                        break;
                    case 118 :
                        lArr = FuzzerUtils.long1array(N, ((long) (-10L)));
                        break;
                    default :
                        bArr[i9][i9 - 1] = Test.bFld;
                }
            }
        }
        long meth_res = (((((((((((((((s + i5) + Float.floatToIntBits(f1)) + i6) + i7) + i8) + i9) + i10) + i11) + i12) + by) + i13) + i14) + (b2 ? 1 : 0)) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(lArr)) + FuzzerUtils.checkSum(bArr);
        lMeth_check_sum += meth_res;
        return ((long) (meth_res));
    }

    public static void vMeth1(int i1, int i2) {
        if (Test.ax$12) {
            final int ax$18 = i2;
            char[] ax$13 = new char[]{ '蘉', '䤯', '罘' };
            short[] ax$14 = new short[]{ ((short) (30353)), ((short) (30510)), ((short) (10402)), ((short) (31099)), ((short) (-10580)), ((short) (15540)) };
            char[] ax$16 = new char[1];
            Test.AxOutputRedirectionHelper.redirect();
            try {
                ax$16[i2] = ((char) (ax$13[i2] ^ ax$14[i2]));
            } catch (Throwable ax$17) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            i2 = ax$18;
            return;
        }
        int i3 = -54999;
        int i4 = -246;
        int i15 = -2635;
        int i16 = 60;
        int i17 = 13;
        int i18 = 18027;
        int i19 = 11;
        int i20 = 14;
        int i21 = -183;
        int iArr[] = new int[N];
        boolean b1 = false;
        float f2 = 124.189F;
        FuzzerUtils.init(iArr, -31402);
        iArr[(14777 >>> 1) % N] += i1--;
        for (i3 = 9; i3 < 227; ++i3) {
            Test.instanceCount += (-4835) + (i3 * i3);
            b1 = ((Test.dFld - i3) <= Math.min(-12, i1)) == ((Test.dFld >= Test.instanceCount) ^ true);
            iArr[i3 - 1] += ((int) (lMeth() - Test.sFld));
            f2 -= i3;
            iArr[i3] = ((int) (986415299L));
            iArr = iArr;
        }
        for (i15 = 14; i15 < 243; ++i15) {
            i17 = 1;
            do {
                i2 += i3;
                i2 *= i17;
                Test.byFld -= ((byte) (Test.dFld));
            } while ((++i17) < 3 );
            i18 = 1;
            while ((++i18) < 3) {
                Test.sFld >>= ((short) (Test.instanceCount));
                if (Test.bFld)
                    break;

                Test.instanceCount += -642956989L;
                Test.dFld += Test.sFld;
                Test.instanceCount += -26789;
                for (i19 = 1; i19 < 1; ++i19) {
                    Test.dFld = -147;
                    i2 |= ((int) (Test.instanceCount));
                    Test.instanceCount *= i3;
                    Test.instanceCount += -60793;
                    if (false)
                        continue;

                    switch (((i19 % 5) * 5) + 106) {
                        case 114 :
                            Test.dArrFld = FuzzerUtils.double1array(N, ((double) (-1.54355)));
                            i1 = -4;
                            i16 -= i19;
                            break;
                        case 121 :
                            Test.instanceCount = -232L;
                            try {
                                i2 = i1 % i2;
                                i1 = iArr[i15] % 43;
                                i4 = (-29851) % i21;
                            } catch (ArithmeticException a_e) {
                            }
                            i20 = i17;
                            Test.dFld -= Test.instanceCount;
                            Test.dFld = i17;
                            if (b1)
                                continue;

                            i21 = i15;
                            Test.sFld = ((short) (i18));
                            break;
                        case 118 :
                            Test.instanceCount <<= 12;
                        case 110 :
                            i21 *= -200;
                        case 113 :
                            if (Test.bFld)
                                break;

                            break;
                        default :
                            Test.instanceCount /= ((long) (46.843F));
                    }
                }
            }
        }
        vMeth1_check_sum += ((((((((((((i1 + i2) + i3) + i4) + (b1 ? 1 : 0)) + Float.floatToIntBits(f2)) + i15) + i16) + i17) + i18) + i19) + i20) + i21) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i, boolean b) {
        float f = 122.213F;
        int i22 = -86;
        int i23 = -161;
        int i24 = 34756;
        int i25 = 5;
        int i26 = -10;
        int i27 = 14;
        short sArr[] = new short[N];
        long lArr1[] = new long[N];
        long lArr2[] = new long[N];
        FuzzerUtils.init(sArr, ((short) (-25948)));
        FuzzerUtils.init(lArr1, 5629419121486026578L);
        FuzzerUtils.init(lArr2, -6040390L);
        i >>= ((int) ((f + (i++)) + i));
        {
            final int ax$26 = i23;
            try {
                Thread[] ax$20 = new Thread[]{ new Thread() };
                Provider ax$23 = null;
                Provider ax$24 = null;
                for (int ax$19 = -944; ax$19 < (-944 + 16464); ax$19 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        ax$20[i23].join();
                    } catch (Throwable ax$22) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$12 = true;
                    vMeth1(-2090657258, -938593739);
                    Test.ax$12 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if (ax$24.equals(ax$23) == false) {
                        }
                    } catch (Throwable ax$25) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                i23 = ax$26;
            }
        }
        vMeth1(-22, i);
        sArr[(i >>> 1) % N] -= ((short) (i));
        for (i22 = 3; i22 < 242; i22++) {
            Test.instanceCount *= i22;
            {
                try {
                    for (int ax$9 = -652; ax$9 < (-652 + 4700); ax$9 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            for (int ax$10 = 0; ax$10 < 4; ax$10++) {
                            }
                        } catch (Throwable ax$11) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                    }
                } finally {
                }
            }
            i23 -= ((int) (Test.instanceCount));
            f -= i;
            for (i24 = 1; i24 < 3; ++i24) {
                for (i26 = 2; i26 > 1; i26--) {
                    Test.instanceCount += i26;
                    i += ((i26 * i24) + i25) - i22;
                    i25 -= ((int) (f));
                    Test.instanceCount = Test.byFld;
                    if (Test.bFld) {
                        Test.iArrFld[i26 + 1][i22 + 1] -= i27;
                        i25 += i26 - i23;
                        f += i26;
                        i27 -= i25;
                        if (b)
                            break;

                        f *= i;
                        i25 += i26 * i26;
                        Test.fFld += Test.instanceCount;
                        lArr1 = lArr2;
                        Test.fFld -= i23;
                    } else if (Test.bFld) {
                        Test.instanceCount = i24;
                        i23 = ((int) (Test.instanceCount));
                        i25 = ((int) (Test.instanceCount));
                        lArr1 = lArr1;
                        i -= i;
                        Test.dArrFld[i22] -= i23;
                        i >>= 12;
                        f = Test.instanceCount;
                        i >>= i22;
                    } else if (b) {
                        switch ((i22 % 8) + 45) {
                            case 45 :
                                f = i24;
                                Test.instanceCount <<= i24;
                                Test.instanceCount += i26 * i26;
                                break;
                            case 46 :
                                i <<= i22;
                                break;
                            case 47 :
                                Test.iArrFld[i22 - 1] = Test.iArrFld[i24];
                            case 48 :
                            case 49 :
                                i23 >>= Test.sFld;
                                break;
                            case 50 :
                                if (b)
                                    continue;

                            case 51 :
                                Test.instanceCount /= i24 | 1;
                                break;
                            case 52 :
                                try {
                                    i23 = Test.iArrFld[i24 + 1][i24 + 1] / 34408;
                                    Test.iArrFld[i26 + 1][i24 + 1] = i26 % 5439;
                                    Test.iArrFld[i26 + 1][i24] = i27 % i;
                                } catch (ArithmeticException a_e) {
                                }
                            default :
                                f -= ((float) (Test.dFld));
                        }
                    } else if (false)
                        continue;

                }
            }
        }
        vMeth_check_sum += ((((((((((i + (b ? 1 : 0)) + Float.floatToIntBits(f)) + i22) + i23) + i24) + i25) + i26) + i27) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(lArr1)) + FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {
        int i28 = 73;
        int i29 = 29;
        int i30 = 148;
        int i31 = 39093;
        int i32 = 37;
        int i33 = 27059;
        int i34 = 36;
        int i35 = 5;
        int i36 = 20414;
        int i37 = -187;
        int i38 = 54511;
        long l = -8820208142075914900L;
        boolean bArr1[] = new boolean[N];
        FuzzerUtils.init(bArr1, false);
        vMeth(iFld, Test.bFld);
        iFld += Test.sFld;
        Test.iArrFld[(iFld >>> 1) % N][((-7) >>> 1) % N] |= Test.sFld;
        if (Test.bFld) {
            iFld = ((int) (Test.instanceCount));
            Test.dFld *= -22046;
            for (i28 = 1; i28 < 185; i28++) {
                {
                    try {
                        FloatBuffer ax$6 = null;
                        float ax$7 = 0.43906832F;
                        for (int ax$5 = -914; ax$5 < (-914 + 11325); ax$5 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                if (ax$6.put(3, ax$7).get(3) != ax$7) {
                                }
                            } catch (Throwable ax$8) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                    }
                }
                for (i30 = i28; 28 > i30; i30++) {
                    i31 += i30 * i30;
                    i31 -= ((int) (Test.instanceCount));
                    for (i32 = 1; i32 > 1; i32--) {
                        Test.iArrFld[i30][i28 - 1] = i28;
                        i29 = ((int) (Test.instanceCount));
                        Test.instanceCount += -2;
                        iFld >>= 28020;
                        Test.instanceCount = iFld;
                    }
                    i33 = -11;
                    switch ((i28 % 7) + 26) {
                        case 26 :
                            i34 = 1;
                            do {
                                Test.instanceCount += i31;
                                lArrFld[i28] *= ((long) (Test.fFld));
                                iFld = i28;
                            } while ((++i34) < 1 );
                            break;
                        case 27 :
                        case 28 :
                            iFld = ((int) (Test.instanceCount));
                            if (Test.bFld) {
                                l = i34;
                                switch (((i30 % 4) * 5) + 123) {
                                    case 139 :
                                        lArrFld[i28] -= i30;
                                        Test.fFld += i28;
                                        iFld += iFld;
                                        Test.instanceCount = l;
                                        iFld = i32;
                                        for (i35 = i28; i35 < 1; i35++) {
                                            Test.bFld = Test.bFld;
                                            iFld = Test.byFld;
                                            Test.iArrFld[i30 + 1][i35] += i36;
                                            Test.iArrFld[i28 + 1][i30] = ((int) (-20L));
                                            iFld += i34;
                                            l += i35;
                                            Test.fFld -= sFld1;
                                            Test.instanceCount <<= l;
                                            i33 += i35 * i35;
                                            l += Test.instanceCount;
                                            if (Test.bFld)
                                                break;

                                            i36 <<= iFld;
                                            i31 >>= i33;
                                        }
                                        i37 = 1;
                                        do {
                                            int i39 = 4;
                                            iFld += i37 + Test.instanceCount;
                                            l = i32;
                                            i31 >>>= -22333;
                                            Test.sFld = ((short) (-9));
                                            switch ((i37 % 10) + 83) {
                                                case 83 :
                                                    i36 = ((int) (l));
                                                    i29 <<= iFld;
                                                    i36 >>= i31;
                                                    if (Test.bFld) {
                                                        Test.byFld = ((byte) (i28));
                                                        lArrFld[i30 + 1] += -3479222376L;
                                                        i33 += (-15) + (i37 * i37);
                                                        Test.instanceCount += i37;
                                                        iFld *= ((int) (-13L));
                                                        i38 = ((int) (Test.instanceCount));
                                                        i31 >>= i35;
                                                        i29 = ((int) (Test.fFld));
                                                        switch ((i28 % 2) + 55) {
                                                            case 55 :
                                                                Test.iArrFld[i28][i30 - 1] = i36;
                                                                i39 += i37 * i37;
                                                                Test.iArrFld[i37 - 1] = Test.iArrFld[i28 + 1];
                                                                Test.iArrFld[i37 + 1][i30 + 1] += ((int) (Test.dFld));
                                                                i38 += i35;
                                                            case 56 :
                                                                switch (((i28 % 4) * 5) + 27) {
                                                                    case 35 :
                                                                        i29 *= i36;
                                                                        Test.fFld = iFld;
                                                                        break;
                                                                    case 46 :
                                                                        i38 += (-12) + (i37 * i37);
                                                                        i29 >>= ((int) (l));
                                                                        i39 -= i32;
                                                                        break;
                                                                    case 42 :
                                                                        Test.iArrFld[i28][i28] = ((int) (Test.instanceCount));
                                                                        break;
                                                                    case 43 :
                                                                        i31 += ((int) (-2000489922244244796L));
                                                                        break;
                                                                    default :
                                                                        i33 -= i28;
                                                                }
                                                                break;
                                                            default :
                                                                sArrFld[i28 + 1] = sArrFld[i37];
                                                        }
                                                    } else if (Test.bFld) {
                                                        Test.byFld &= ((byte) (i35));
                                                    } else if (Test.bFld) {
                                                        Test.fFld *= i34;
                                                    } else {
                                                        i39 -= ((int) (Test.fFld));
                                                    }
                                                    break;
                                                case 84 :
                                                    i33 = i33;
                                                    break;
                                                case 85 :
                                                case 86 :
                                                    iFld += ((int) (2447765590L + (i37 * i37)));
                                                    break;
                                                case 87 :
                                                    Test.fFld -= 14;
                                                    break;
                                                case 88 :
                                                    Test.instanceCount <<= i32;
                                                    break;
                                                case 89 :
                                                    i38 += ((i37 * Test.fFld) + i38) - Test.byFld;
                                                    break;
                                                case 90 :
                                                    Test.iArrFld[i30 - 1] = FuzzerUtils.int1array(N, ((int) (35364)));
                                                case 91 :
                                                    i29 = i36;
                                                case 92 :
                                                default :
                                                    Test.iArrFld[i37][i28] += i33;
                                            }
                                        } while ((++i37) < 1 );
                                        break;
                                    case 125 :
                                        i31 %= ((int) (i33 | 1));
                                        break;
                                    case 137 :
                                        Test.iArrFld[i30 - 1][i28 - 1] <<= i34;
                                        break;
                                    case 133 :
                                        Test.fFld += i36;
                                        break;
                                }
                            } else if (true) {
                                Test.iArrFld[i30 + 1][i30] -= i31;
                            } else {
                                bArr1[i30 - 1] = true;
                            }
                            break;
                        case 29 :
                            sArrFld[i28 + 1][i30 - 1] >>= ((short) (i31));
                            break;
                        case 30 :
                            iFld &= i31;
                            break;
                        case 31 :
                            Test.fFld = i29;
                            break;
                        case 32 :
                            i29 &= i33;
                            break;
                    }
                }
            }
        }
        FuzzerUtils.out.println((((("i28 i29 i30 = " + i28) + ",") + i29) + ",") + i30);
        FuzzerUtils.out.println((((("i31 i32 i33 = " + i31) + ",") + i32) + ",") + i33);
        FuzzerUtils.out.println((((("i34 l i35 = " + i34) + ",") + l) + ",") + i35);
        FuzzerUtils.out.println((((("i36 i37 i38 = " + i36) + ",") + i37) + ",") + i38);
        FuzzerUtils.out.println("bArr1 = " + FuzzerUtils.checkSum(bArr1));
        FuzzerUtils.out.println((((("Test.instanceCount Test.dFld Test.bFld = " + Test.instanceCount) + ",") + Double.doubleToLongBits(Test.dFld)) + ",") + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println((((("Test.sFld Test.byFld Test.fFld = " + Test.sFld) + ",") + Test.byFld) + ",") + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println((((("iFld sFld1 Test.dArrFld = " + iFld) + ",") + sFld1) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println((((("Test.iArrFld lArrFld sArrFld = " + FuzzerUtils.checkSum(Test.iArrFld)) + ",") + FuzzerUtils.checkSum(lArrFld)) + ",") + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
            {
                try {
                    int ax$1 = -1366011300;
                    Object[] ax$2 = new Object[]{ "sun.misc.BASE64Encoder" };
                    int ax$3 = new Integer(-3);
                    for (int ax$0 = -43; ax$0 < (-43 + 18066); ax$0 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            ax$2[ax$1] = new char[ax$3];
                            ax$1++;
                        } catch (Throwable ax$4) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                    }
                } finally {
                }
            }
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

    static Boolean ax$12 = false;
}
