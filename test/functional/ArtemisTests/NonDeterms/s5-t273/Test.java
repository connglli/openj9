// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 3519177644L;

    public static short sFld = -6816;

    public static double dFld = 108.42641;

    public static int iArrFld[] = new int[N];

    public static byte byArrFld[] = new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -174);
        FuzzerUtils.init(Test.byArrFld, ((byte) (-91)));
    }

    public static long bMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d) {
        int i3 = -138;
        int i4 = -13;
        int i5 = -14;
        int i6 = -117;
        int i7 = -126;
        int i8 = -201;
        int i9 = 27144;
        boolean b = true;
        long lArr[][] = new long[N][N];
        double dArr[] = new double[N];
        FuzzerUtils.init(lArr, -3009340787L);
        FuzzerUtils.init(dArr, 1.65769);
        i3 ^= i3;
        i4 = 1;
        while ((++i4) < 107) {
            float f1 = 0.266F;
            byte by = -42;
            i3 %= -49;
            i3 += ((int) (f1));
            switch (((i3 >>> 1) % 3) + 121) {
                case 121 :
                    Test.iArrFld[i4 - 1] += ((int) (3.4533));
                    i3 = i4;
                    i3 *= i4;
                    i3 = ((int) (Test.instanceCount));
                    Test.instanceCount += i3;
                    Test.sFld += ((short) (i4));
                    Test.instanceCount += i4;
                    Test.iArrFld[i4] += ((int) (-38.67105));
                    i3 = ((int) (Test.instanceCount));
                    Test.iArrFld[i4 + 1] += i4;
                    i3 = ((int) (-2459387049L));
                    switch ((((i3 >>> 1) % 9) * 5) + 41) {
                        case 86 :
                            i3 = i4;
                            f1 += i4 + i3;
                            switch (((i4 % 6) * 5) + 43) {
                                case 47 :
                                    for (i5 = 1; i5 < 5; ++i5) {
                                        switch ((i5 % 3) + 81) {
                                            case 81 :
                                                Test.sFld += ((short) (i3));
                                                i3 *= i3;
                                                b = false;
                                                try {
                                                    i6 = i3 % i5;
                                                    Test.iArrFld[i4] = (-55209) / i3;
                                                    i3 = i6 % Test.iArrFld[i4 - 1];
                                                } catch (ArithmeticException a_e) {
                                                }
                                                lArr = lArr;
                                                Test.instanceCount = i6;
                                                for (i7 = 1; i7 < 2; i7++) {
                                                    i8 <<= 31648;
                                                    Test.instanceCount = i4;
                                                    i3 = ((int) (d));
                                                    if (b)
                                                        continue;

                                                }
                                                Test.iArrFld[i4 - 1] <<= i9;
                                                i9 ^= i5;
                                                i8 = i3;
                                                dArr[i5] *= i5;
                                                break;
                                            case 82 :
                                                i3 = ((int) (d));
                                                break;
                                            case 83 :
                                                i9 = ((int) (f1));
                                            default :
                                                i3 >>= -10291;
                                        }
                                    }
                                    break;
                                case 59 :
                                    if (true)
                                        continue;

                                    break;
                                case 49 :
                                    f1 += i4 + Test.instanceCount;
                                case 46 :
                                    Test.instanceCount += i4 | i5;
                                case 55 :
                                    Test.instanceCount -= 120;
                                    break;
                                case 57 :
                                    i8 += i4 * i7;
                                    break;
                                default :
                                    i9 >>= -127;
                            }
                        case 55 :
                            i9 -= ((int) (64561L));
                        case 85 :
                            f1 += i4 * i9;
                            break;
                        case 59 :
                            i8 = i7;
                        case 46 :
                            try {
                                i8 = i9 % 36790;
                                i8 = i4 / i6;
                                i6 = Test.iArrFld[i4 + 1] / i4;
                            } catch (ArithmeticException a_e) {
                            }
                            break;
                        case 65 :
                            i6 %= ((int) (i9 | 1));
                            break;
                        case 77 :
                            if (i8 != 0) {
                                vMeth1_check_sum += (((((((((Double.doubleToLongBits(d) + i3) + i4) + i5) + i6) + (b ? 1 : 0)) + i7) + i8) + i9) + FuzzerUtils.checkSum(lArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                                return;
                            }
                            break;
                        case 75 :
                            by = ((byte) (i9));
                        case 81 :
                            try {
                                i3 = i8 % i4;
                                i9 = i4 % i9;
                                i6 = 907371491 % i3;
                            } catch (ArithmeticException a_e) {
                            }
                            break;
                    }
                    break;
                case 122 :
                    i3 += i5;
                    break;
                case 123 :
                    Test.byArrFld = Test.byArrFld;
                    break;
            }
        } 
        vMeth1_check_sum += (((((((((Double.doubleToLongBits(d) + i3) + i4) + i5) + i6) + (b ? 1 : 0)) + i7) + i8) + i9) + FuzzerUtils.checkSum(lArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(long l1, int i2, float f) {
        if (Test.ax$17) {
            short[] ax$18 = new short[]{ ((short) (-11562)) };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                for (int ax$19 = 0; ax$19 < 128; ax$19++) {
                    ax$18[ax$19] >>>= 2;
                }
            } catch (Throwable ax$20) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        double d1 = -10.13486;
        int i12 = 0;
        int i13 = -78;
        int i15 = 109;
        int i16 = -40200;
        int i17 = 175;
        int i18 = -14;
        int i19 = 105;
        boolean b1 = true;
        vMeth1(d1);
        i2 += i2;
        i2 >>>= ((int) (l1));
        i2 ^= ((int) (l1));
        for (i12 = 2; i12 < 253; i12++) {
            switch (((i12 >>> 1) % 5) + 125) {
                case 125 :
                    f = i13;
                    i2 /= ((int) (i12 | 1));
                    d1 += 88;
                    i15 = 1;
                    do {
                        d1 *= f;
                        d1 = i2;
                        if (i13 != 0) {
                            vMeth_check_sum += ((((((((((l1 + i2) + Float.floatToIntBits(f)) + Double.doubleToLongBits(d1)) + i12) + i13) + i15) + i16) + i17) + i18) + (b1 ? 1 : 0)) + i19;
                            return;
                        }
                        i2 ^= i15;
                        f = i12;
                    } while ((i15 += 2) < 2 );
                    l1 = i13;
                    Test.instanceCount = i2;
                    Test.iArrFld[i12] = i13;
                    i16 = 1;
                    do {
                        i13 += ((i16 * i13) + i15) - i16;
                        i2 = i15;
                        for (i17 = 1; 1 > i17; ++i17) {
                            try {
                                Test.iArrFld[i17] = i13 % Test.iArrFld[i12];
                                i18 = 19670 % Test.iArrFld[i12 - 1];
                                Test.iArrFld[i12] = Test.iArrFld[i16] % i16;
                            } catch (ArithmeticException a_e) {
                            }
                            if (b1)
                                break;

                            Test.sFld = ((short) (i12));
                            f += i12;
                            Test.instanceCount = -28649L;
                            i18 ^= i16;
                            if (b1)
                                break;

                            i18 += i17 * i17;
                        }
                        i2 += i16;
                        Test.iArrFld[i12] += i17;
                        i19 = 1;
                        while ((i19 -= 2) > 0) {
                            if (b1) {
                                i13 = ((int) (l1));
                                f = f;
                                i2 = 58670;
                            }
                        } 
                    } while ((++i16) < 2 );
                    break;
                case 126 :
                    Test.iArrFld[i12] = i15;
                    break;
                case 127 :
                    l1 += -157L;
                    break;
                case 128 :
                    i18 /= ((int) (i19 | 1));
                case 129 :
                    i18 += ((int) (d1));
            }
        }
        vMeth_check_sum += ((((((((((l1 + i2) + Float.floatToIntBits(f)) + Double.doubleToLongBits(d1)) + i12) + i13) + i15) + i16) + i17) + i18) + (b1 ? 1 : 0)) + i19;
    }

    public static boolean bMeth(int i1) {
        if (Test.ax$0) {
            Object ax$1 = new Object() {};
            Object[] ax$2 = new String[2];
            Test.AxOutputRedirectionHelper.redirect();
            try {
                for (int ax$3 = 0; ax$3 < ax$2.length; ax$3++) {
                    ax$2[ax$3] = ax$1;
                }
            } catch (Throwable ax$4) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return false;
        }
        long l = 3978218811321399854L;
        long lArr1[] = new long[N];
        float f2 = 0.517F;
        float fArr[] = new float[N];
        int i20 = 6521;
        int i21 = -19588;
        int i22 = -1;
        int i23 = 8;
        int i24 = 39078;
        int i25 = -20201;
        int i26 = 34281;
        int i27 = -17275;
        int i28 = 31;
        int i29 = 5;
        boolean b2 = false;
        byte by1 = -91;
        short sArr[] = new short[N];
        FuzzerUtils.init(sArr, ((short) (3536)));
        FuzzerUtils.init(fArr, 96.189F);
        FuzzerUtils.init(lArr1, 8757044801144618939L);
        l = ((i1--) + Math.abs(Test.instanceCount)) + Math.max(i1 - (-92), i1 - i1);
        i1 = i1;
        {
            final int ax$35 = i29;
            final int ax$36 = i20;
            final short ax$37 = Test.sFld;
            try {
                byte[] ax$22 = new byte[]{ ((byte) (105)) };
                byte[] ax$25 = new byte[5];
                int[] ax$31 = new int[]{ 7 };
                for (int ax$21 = -748; ax$21 < (-748 + 19647); ax$21 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$26 = 0; ax$26 < i20; ax$26++) {
                            byte ax$27 = ax$25[ax$26];
                            byte ax$28 = ax$22[ax$26];
                            int ax$29 = ax$27 - ax$28;
                            if (ax$29 < 0) {
                                ax$29 = -ax$29;
                            }
                            sFld += ax$29;
                        }
                    } catch (Throwable ax$30) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$17 = true;
                    vMeth(-291945548787286631L, 1551612687, 0.73399705F);
                    Test.ax$17 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$33 = 10; ax$33 <= 10; ax$33++) {
                            i29 -= ax$31[ax$33];
                        }
                    } catch (Throwable ax$34) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                i29 = ax$35;
                i20 = ax$36;
                Test.sFld = ax$37;
            }
        }
        vMeth(-153L, -7, f2);
        for (i20 = 2; i20 < 124; i20++) {
            f2 -= i1;
            i21 -= i20;
            for (i22 = 1; i22 < 5; ++i22) {
                Test.sFld += ((short) (i21));
                sArr = sArr;
                Test.iArrFld = FuzzerUtils.int1array(N, ((int) (88)));
                i1 *= i1;
                Test.dFld = i20;
                Test.dFld += f2;
                l += ((i22 * Test.sFld) + Test.sFld) - i21;
                if (b2)
                    break;

                i23 += i22 + i23;
                f2 -= -114;
                i23 += ((i22 * i21) + i22) - i22;
                for (i24 = 1; i24 < 2; ++i24) {
                    i23 -= i21;
                }
            }
            fArr = fArr;
        }
        for (long l2 : lArr1) {
            switch ((((i20 >>> 1) % 6) * 5) + 12) {
                case 17 :
                    for (i26 = 1; i26 < 2; ++i26) {
                        f2 *= i1;
                        for (i28 = i26; 2 > i28; ++i28) {
                            i25 *= by1;
                            i25 <<= i29;
                            Test.instanceCount += i28;
                            i1 = i1;
                            Test.iArrFld = Test.iArrFld;
                        }
                        i23 += ((i26 * i27) + i21) - i21;
                        i23 = 105;
                        Test.instanceCount *= by1;
                        if (false)
                            break;

                        Test.iArrFld[i26 - 1] *= i27;
                        if (b2)
                            break;

                    }
                    break;
                case 31 :
                    Test.iArrFld[(i22 >>> 1) % N] = i25;
                    break;
                case 41 :
                    i27 = i28;
                    break;
                case 39 :
                    try {
                        i23 = (-81) / i22;
                        i27 = 87 % i27;
                        Test.iArrFld[(i23 >>> 1) % N] = i20 % 56123;
                    } catch (ArithmeticException a_e) {
                    }
                    break;
                case 40 :
                    try {
                        i27 = i23 % (-11004);
                        i25 = i25 / 1352978592;
                        i27 = i28 % Test.iArrFld[(i20 >>> 1) % N];
                    } catch (ArithmeticException a_e) {
                    }
                    break;
                case 13 :
                    Test.iArrFld[(i1 >>> 1) % N] = ((int) (Test.dFld));
                    break;
                default :
                    l2 -= ((long) (Test.dFld));
            }
        }
        long meth_res = ((((((((((((((((i1 + l) + Float.floatToIntBits(f2)) + i20) + i21) + i22) + i23) + (b2 ? 1 : 0)) + i24) + i25) + i26) + i27) + i28) + i29) + by1) + FuzzerUtils.checkSum(sArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + FuzzerUtils.checkSum(lArr1);
        bMeth_check_sum += meth_res;
        return (meth_res % 2) > 0;
    }

    public void mainTest(String[] strArr3) {
        int i30 = 1;
        int i31 = 46640;
        int i32 = -49232;
        int i33 = -110;
        int i34 = -5;
        int i35 = -1;
        int i36 = 2;
        int i37 = 5;
        int i38 = -173;
        int i39 = 11272;
        int i40 = 219;
        int i41 = -181;
        int i42 = 53;
        int iArr[][] = new int[N][N];
        float f3 = -72.936F;
        float f4 = -2.405F;
        byte by2 = 11;
        long lArr2[] = new long[N];
        FuzzerUtils.init(iArr, 40093);
        FuzzerUtils.init(lArr2, 7417677354178599615L);
        {
            final short ax$13 = Test.sFld;
            final int ax$14 = i42;
            final int ax$15 = i34;
            final byte ax$16 = by2;
            try {
                ByteBuffer ax$6 = null;
                for (int ax$5 = -106; ax$5 < (-106 + 16999); ax$5 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if (ax$6.put(1, by2).get(1) != by2) {
                        }
                    } catch (Throwable ax$8) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$0 = true;
                    bMeth(1509955946);
                    Test.ax$0 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        i34++;
                    } catch (Throwable ax$12) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                Test.sFld = ax$13;
                i42 = ax$14;
                i34 = ax$15;
                by2 = ax$16;
            }
        }
        bMeth(56);
        for (i30 = 9; i30 < 207; ++i30) {
            try {
                i31 = i31 / i30;
                i31 = i30 / (-40795);
                i31 = 122 / i31;
            } catch (ArithmeticException a_e) {
            }
            i32 = 1;
            do {
                Test.sFld -= ((short) (Test.instanceCount));
                Test.instanceCount = i32;
                i31 = i32;
                i31 += ((i32 * i30) + i31) - i31;
                Test.iArrFld[i32 + 1] = i30;
                for (i33 = 1; i33 < 1; ++i33) {
                    i31 %= ((int) (Test.sFld | 1));
                    Test.instanceCount <<= i30;
                    i34 = ((int) (Test.dFld));
                    i34 = i34;
                    i34 -= ((int) (Test.instanceCount));
                    i34 += 118 + (i33 * i33);
                }
                Test.instanceCount = ((long) (f3));
                f3 += Test.instanceCount;
                i31 = 3;
                switch (((i32 % 2) * 5) + 7) {
                    case 17 :
                        Test.instanceCount = Test.instanceCount;
                        for (f4 = 1; f4 < 1; ++f4) {
                            i34 *= -45743;
                            i34 = i33;
                            by2 += ((byte) (f4));
                            i31 += ((int) (f4));
                            i31 = 31458;
                        }
                        i34 += i30;
                        for (i36 = 1; i36 < 1; ++i36) {
                            boolean b3 = true;
                            switch (((i36 >>> 1) % 2) + 104) {
                                case 104 :
                                    Test.dFld += 0.606F;
                                    Test.instanceCount += ((i36 * i37) + i30) - Test.instanceCount;
                                    i31 -= 36006;
                                    by2 *= ((byte) (i32));
                                    Test.dFld *= f4;
                                    if (false)
                                        break;

                                    break;
                                case 105 :
                                    b3 = b3;
                                    i34 >>>= by2;
                                    Test.instanceCount -= Test.instanceCount;
                                    Test.instanceCount <<= Test.instanceCount;
                                    if (b3)
                                        continue;

                                    Test.instanceCount += 6870024052839362052L;
                            }
                            i35 = -16549;
                            Test.dFld *= -6997;
                            i37 = i31;
                        }
                        f3 += 7061;
                        Test.instanceCount = i37;
                        Test.instanceCount += i32;
                        for (i38 = 1; i38 > 1; i38 -= 2) {
                            i35 -= ((int) (1.81F));
                            Test.dFld += Test.instanceCount;
                            i37 += i32;
                            try {
                                i37 = i38 % Test.iArrFld[i32];
                                i34 = (-20727) / i34;
                                i35 = i39 % i34;
                            } catch (ArithmeticException a_e) {
                            }
                        }
                        for (i40 = 1; i40 < 1; ++i40) {
                            boolean b4 = true;
                            switch ((((-14) >>> 1) % 4) + 18) {
                                case 18 :
                                    if (b4) {
                                        i34 = ((int) (Test.instanceCount));
                                        i34 += ((int) (Test.instanceCount));
                                        Test.iArrFld[i30] >>>= ((int) (Test.instanceCount));
                                        Test.instanceCount >>= i31;
                                        f3 -= f3;
                                        i34 += ((int) (62346L));
                                        i34 += ((int) (f3));
                                        i34 >>= i38;
                                        iArr = iArr;
                                        switch (((i40 % 7) * 5) + 123) {
                                            case 128 :
                                                i39 += i40 + i41;
                                                i37 += ((i40 * i31) + i35) - i34;
                                                f3 *= i38;
                                                Test.instanceCount += 12;
                                                by2 -= ((byte) (f3));
                                                Test.instanceCount <<= i36;
                                                break;
                                            case 124 :
                                                if (false)
                                                    break;

                                                i35 >>>= i35;
                                                i37 -= i41;
                                                break;
                                            case 151 :
                                            case 152 :
                                                i34 += i37;
                                                break;
                                            case 135 :
                                                if (b4)
                                                    break;

                                                break;
                                            case 145 :
                                                f3 *= by2;
                                                break;
                                            case 155 :
                                                iArr[i30 + 1][i40] = i41;
                                                break;
                                            default :
                                                i41 += ((i40 * i31) + i35) - i42;
                                        }
                                    } else if (b4) {
                                        if (false)
                                            break;

                                    } else {
                                        f3 *= f4;
                                    }
                                    break;
                                case 19 :
                                    b4 = b4;
                                    break;
                                case 20 :
                                    i41 <<= i34;
                                    break;
                                case 21 :
                                    iArr[i30 - 1][i40 - 1] >>= i41;
                            }
                        }
                        break;
                    case 15 :
                        lArr2[i30 - 1] = 32522L;
                    default :
                        lArr2[i32 + 1] -= i39;
                }
            } while ((++i32) < 26 );
        }
        FuzzerUtils.out.println((((("i30 i31 i32 = " + i30) + ",") + i31) + ",") + i32);
        FuzzerUtils.out.println((((("i33 i34 f3 = " + i33) + ",") + i34) + ",") + Float.floatToIntBits(f3));
        FuzzerUtils.out.println((((("f4 i35 by2 = " + Float.floatToIntBits(f4)) + ",") + i35) + ",") + by2);
        FuzzerUtils.out.println((((("i36 i37 i38 = " + i36) + ",") + i37) + ",") + i38);
        FuzzerUtils.out.println((((("i39 i40 i41 = " + i39) + ",") + i40) + ",") + i41);
        FuzzerUtils.out.println((((("i42 iArr lArr2 = " + i42) + ",") + FuzzerUtils.checkSum(iArr)) + ",") + FuzzerUtils.checkSum(lArr2));
        FuzzerUtils.out.println((((("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount) + ",") + Test.sFld) + ",") + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println((("Test.iArrFld Test.byArrFld = " + FuzzerUtils.checkSum(Test.iArrFld)) + ",") + FuzzerUtils.checkSum(Test.byArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }

    public static void main(String[] strArr2) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr2);
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

    static Boolean ax$17 = false;
}