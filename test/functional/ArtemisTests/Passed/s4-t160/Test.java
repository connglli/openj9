// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.net.HttpCookie;
import java.util.List;
import java.util.Locale;

public class Test {

    public static final int N = 256;

    public static long instanceCount = -3484625359L;

    public static int iFld = -63480;

    public static boolean bFld = false;

    public short sFld = 21887;

    public int iFld1 = 8;

    public static int iFld2 = 56976;

    public static volatile byte byFld = 67;

    public static volatile int[] iArrFld = new int[N];

    public short[] sArrFld = new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 13);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {
        int i2 = -6, i3 = -9, i4 = -4, i5 = -1, i6 = 3, i7 = 2, i8 = -12;
        double d1 = 125.126423, d2 = 31.47024;
        float f = -18.146F, fArr[] = new float[N];
        short s = 8647, sArr[] = new short[N];
        byte by = -52;
        long l1 = -3010332342L, lArr[] = new long[N];
        boolean b1 = false;
        FuzzerUtils.init(lArr, -3593109993L);
        FuzzerUtils.init(fArr, -43.800F);
        FuzzerUtils.init(sArr, (short) 14552);
        Test.iArrFld[(i2 >>> 1) % N] *= i2;
        lArr = lArr;
        for (i3 = 11; 190 > i3; i3 += 3) {
            lArr[i3] = i4;
            i5 = 1;
            do {
                Test.iArrFld[i5 + 1] -= i3;
                fArr[i5] -= (float) d1;
                i2 = -182;
                f = -92;
                Test.iArrFld[i5 + 1] = (int) -42.1023F;
                i2 = (int) 4924374447498413241L;
                i2 += s;
                Test.instanceCount <<= i3;
            } while (++i5 < 9);
            Test.iArrFld[i3 + 1] = -243;
            d2 = 1;
            do {
                i4 += (int) (((d2 * Test.instanceCount) + by) - i5);
                lArr[(int) (d2 + 1)] = i3;
                i4 = (int) Test.instanceCount;
                for (i6 = 1; i6 < 1; ++i6) {
                    i2 -= i6;
                    i7 += s;
                    Test.iArrFld[(int) (d2)] = i2;
                    i7 += i3;
                }
                s = (short) 10939L;
                for (l1 = 1; l1 < 1; l1 += 3) {
                    if (b1) {
                        try {
                            i7 = (Test.iArrFld[i3 - 1] / i3);
                            i7 = (i5 % i2);
                            i7 = (i7 % i2);
                        } catch (ArithmeticException a_e) {
                        }
                        b1 = b1;
                        i4 += i7;
                        Test.iArrFld[(int) (d2 - 1)] -= i2;
                        i8 *= i7;
                        Test.instanceCount += i7;
                        if (b1)
                            continue;
                        if (b1)
                            continue;
                        f += (((l1 * f) + i3) - f);
                        i8 >>= (int) Test.instanceCount;
                        sArr[i3 + 1] <<= (short) 34094L;
                    } else {
                        if (b1)
                            break;
                    }
                }
            } while (++d2 < 9);
            {
                java.io.PrintStream ax$5 = System.out;
                java.io.PrintStream ax$6 = System.err;
                java.io.PrintStream ax$7 = new java.io.PrintStream(new java.io.OutputStream() {

                    @Override
                    public void write(int b) throws java.io.IOException {
                        // DO NOTHING: DISCARD ALL OUTPUTS
                    }
                });
                System.setOut(ax$7);
                System.setErr(ax$7);
                try {
                    for (int ax$3 = -1738; ax$3 < 4534; ax$3 += 1) {
                        int ax$0 = i3;
                        int ax$1 = i2;
                        try {
                            i2 = i3;
                        } catch (Throwable ax$2) {
                        } finally {
                            i3 = ax$0;
                            i2 = ax$1;
                        }
                    }
                } catch (Throwable ax$4) {
                }
                System.setOut(ax$5);
                System.setErr(ax$6);
            }
        }
        vMeth2_check_sum += i2 + i3 + i4 + i5 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f) + s + Double.doubleToLongBits(d2) + by + i6 + i7 + l1 + i8 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth1(int i1, long l) {
        double d3 = 53.30171;
        int i9 = 167;
        byte by1 = -9;
        vMeth2();
        for (d3 = 4; d3 < 103; ++d3) {
            i1 -= (int) -1019655325L;
            try {
                i9 = (i9 % Test.iArrFld[(int) (d3 - 1)]);
                i1 = (Test.iArrFld[(int) (d3 + 1)] % -723737171);
                Test.iArrFld[(int) (d3 - 1)] = (i1 / -84);
            } catch (ArithmeticException a_e) {
            }
            i9 = (int) l;
            i9 += by1;
            Test.iArrFld = Test.iArrFld;
        }
        vMeth1_check_sum += i1 + l + Double.doubleToLongBits(d3) + i9 + by1;
    }

    public static void vMeth(boolean b) {
        int i = 191, i10 = -46, i11 = -2, i12 = 12, i13 = 202, i14 = 5, i15 = -163, i16 = -7542, i17 = -13, iArr[] = new int[N];
        double d = 2.72564, dArr[] = new double[N];
        float f1 = -1.685F, fArr1[] = new float[N];
        byte by2 = -40;
        long[] lArr1 = new long[N];
        FuzzerUtils.init(iArr, -17069);
        FuzzerUtils.init(fArr1, 2.342F);
        FuzzerUtils.init(dArr, -1.36589);
        FuzzerUtils.init(lArr1, 185L);
        i = 1;
        while (++i < 127) {
            d = iArr[i];
            iArr[i + 1] -= i;
            vMeth1(i, Test.instanceCount);
            f1 = i;
            for (i10 = i; i10 < 4; ++i10) {
                switch(((i % 4) * 5) + 6) {
                    case 24:
                        for (i12 = 1; i12 < 1; i12++) {
                            Test.instanceCount += (i12 ^ i12);
                            try {
                                i13 = (1935663368 % i);
                                i13 = (i12 % i11);
                                Test.iFld = (Test.iFld / 36);
                            } catch (ArithmeticException a_e) {
                            }
                            {
                                java.io.PrintStream ax$14 = System.out;
                                java.io.PrintStream ax$15 = System.err;
                                java.io.PrintStream ax$16 = new java.io.PrintStream(new java.io.OutputStream() {

                                    @Override
                                    public void write(int b) throws java.io.IOException {
                                        // DO NOTHING: DISCARD ALL OUTPUTS
                                    }
                                });
                                System.setOut(ax$16);
                                System.setErr(ax$16);
                                try {
                                    for (int ax$12 = -2786; ax$12 < 4017; ax$12 += 1) {
                                        try {
                                            java.util.Locale ax$10 = new Locale("ja", "JP", "JP");
                                            try {
                                                // Forces a non US locale
                                                Locale.setDefault(Locale.FRANCE);
                                                List<HttpCookie> ax$9 = HttpCookie.parse("set-cookie:" + " CUSTOMER=WILE_E_COYOTE;" + " expires=Sat, 09-Nov-2041 23:12:40 GMT");
                                                if (ax$9 == null || ax$9.isEmpty()) {
                                                }
                                                for (HttpCookie ax$8 : ax$9) {
                                                    if (ax$8.getMaxAge() == 0) {
                                                    }
                                                }
                                            } finally {
                                                // restore the reserved locale
                                                Locale.setDefault(ax$10);
                                            }
                                        } catch (Throwable ax$11) {
                                        } finally {
                                        }
                                    }
                                } catch (Throwable ax$13) {
                                }
                                System.setOut(ax$14);
                                System.setErr(ax$15);
                            }
                            if (i11 != 0) {
                                vMeth_check_sum += (b ? 1 : 0) + i + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + i14 + i15 + by2 + i16 + i17 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1);
                                return;
                            }
                            Test.instanceCount *= i11;
                            d = f1;
                            f1 = f1;
                            fArr1 = fArr1;
                            Test.iFld += 0;
                            fArr1 = fArr1;
                            if (Test.bFld)
                                continue;
                        }
                        dArr[i] = i13;
                        if (false)
                            continue;
                        Test.instanceCount *= i;
                        Test.instanceCount &= 85;
                        for (i14 = 1; i14 < 1; ++i14) {
                            i11 = i11;
                            if (Test.bFld)
                                continue;
                            Test.iArrFld[i10] *= Test.iFld;
                            if (i12 != 0) {
                                vMeth_check_sum += (b ? 1 : 0) + i + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + i14 + i15 + by2 + i16 + i17 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1);
                                return;
                            }
                        }
                        i15 += 0;
                        if (Test.bFld)
                            continue;
                        f1 += by2;
                        i13 *= (int) d;
                        Test.iFld -= -175;
                    case 14:
                        i15 += (int) f1;
                        for (i16 = 1; i16 > 1; i16 -= 3) {
                            Test.instanceCount += (i16 * i16);
                            lArr1[i10] *= i;
                        }
                        f1 += i10;
                        break;
                    case 7:
                        iArr[i10 - 1] += -39595;
                        break;
                    case 9:
                        Test.iArrFld[i10] <<= (int) Test.instanceCount;
                        break;
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + i14 + i15 + by2 + i16 + i17 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {
        double d4 = 1.91054, d5 = 95.58874;
        long l2 = -19980L, l3 = -188L;
        int i18 = 167, i19 = 8, i20 = -18669, i21 = -97, i22 = -2, i23 = 47352, i24 = 7, i25 = -5, i26 = -10, i27 = -84, i28 = -118, i29 = -28234;
        float f2 = -1.391F, f3 = 0.426F;
        vMeth(Test.bFld);
        d4 *= Test.iFld;
        Test.iArrFld[(Test.iFld >>> 1) % N] = 10;
        for (l2 = 124; l2 > 2; l2 -= 2) {
            for (f2 = l2; f2 < 82; f2 += 3) {
                for (d5 = 1; d5 < 1; d5 += 2) {
                    Test.iFld += i20;
                }
            }
            Test.instanceCount -= (long) d4;
            i21 = 1;
            do {
                i19 >>= i18;
                i19 += i21;
                Test.iFld >>= i19;
                Test.instanceCount *= i19;
                i19 >>>= Test.iFld;
                i18 += (i21 - i21);
                d4 -= Test.iFld;
                sFld <<= (short) i18;
                Test.iArrFld[i21] -= i21;
                i20 = (int) f2;
                sFld *= (short) 34975;
                i18 -= (int) Test.instanceCount;
            } while (++i21 < 82);
            Test.iFld = i19;
            Test.instanceCount -= -646436564528315976L;
            for (i22 = 2; i22 < 82; ++i22) {
                Test.instanceCount += (((i22 * f2) + l2) - iFld1);
                i19 = i19;
                i23 <<= i19;
            }
            iFld1 = i18;
            l3 = 1;
            while (++l3 < 82) {
                for (i24 = 1; i24 < 1; i24++) {
                    i25 += (i24 + Test.iFld2);
                    i23 = i18;
                    Test.instanceCount *= Test.instanceCount;
                    if (Test.bFld)
                        continue;
                    Test.iFld -= Test.iFld2;
                    f3 += (i24 - i21);
                    Test.iArrFld[(int) (l3 - 1)] >>>= (int) Test.instanceCount;
                    Test.iFld2 = Test.iFld2;
                    Test.instanceCount <<= 6;
                    Test.iFld += i24;
                    iFld1 += (i24 | l2);
                    Test.iArrFld[(int) (l2)] &= i25;
                    i25 %= (int) ((long) (f2) | 1);
                }
            }
            Test.iArrFld[(int) (l2)] += (int) f2;
            Test.instanceCount += l2;
            switch((int) (((l2 % 2) * 5) + 3)) {
                case 5:
                    sFld = (short) i20;
                    if (false) {
                        Test.instanceCount = 1;
                        Test.instanceCount -= iFld1;
                        for (i26 = 82; i26 > 4; --i26) {
                            sFld += (short) (((i26 * i25) + f3) - l3);
                            switch((i26 % 4) + 60) {
                                case 60:
                                    Test.iArrFld[(int) (l2 - 1)] *= (int) Test.instanceCount;
                                    Test.iArrFld[i26] ^= -2;
                                    i25 += (((i26 * i21) + i23) - l3);
                                    i27 *= 6;
                                    Test.instanceCount -= (long) d4;
                                    i19 += i26;
                                    f3 += i22;
                                    i25 += i26;
                                    Test.bFld = Test.bFld;
                                    Test.instanceCount += (i26 + sFld);
                                    i19 += (i26 * i26);
                                    if (Test.bFld)
                                        continue;
                                    Test.iFld -= i22;
                                    break;
                                case 61:
                                    i20 = 199;
                                    Test.instanceCount += -6287;
                                    i19 += i24;
                                    Test.instanceCount = -93;
                                    f3 = -126;
                                    sArrFld[(int) (l2 - 1)] = Test.byFld;
                                    for (i28 = i26; i28 < 2; ++i28) {
                                        Test.iFld = i27;
                                        i18 += (int) l2;
                                    }
                                    break;
                                case 62:
                                    if (Test.bFld)
                                        continue;
                                    break;
                                case 63:
                                    Test.bFld = true;
                                    break;
                            }
                        }
                    } else if (false) {
                        Test.instanceCount >>= -2;
                    } else {
                        iFld1 += (-187 + (l2 * l2));
                    }
                    break;
                case 8:
                    if (false)
                        continue;
                    break;
                default:
                    f3 *= -213;
            }
        }
        FuzzerUtils.out.println("d4 l2 i18 = " + Double.doubleToLongBits(d4) + "," + l2 + "," + i18);
        FuzzerUtils.out.println("f2 i19 d5 = " + Float.floatToIntBits(f2) + "," + i19 + "," + Double.doubleToLongBits(d5));
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 l3 i24 = " + i23 + "," + l3 + "," + i24);
        FuzzerUtils.out.println("i25 f3 i26 = " + i25 + "," + Float.floatToIntBits(f3) + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("sFld iFld1 Test.iFld2 = " + sFld + "," + iFld1 + "," + Test.iFld2);
        FuzzerUtils.out.println("Test.byFld Test.iArrFld sArrFld = " + Test.byFld + "," + FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  vMeth ->  vMeth mainTest
// DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
// DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}
