// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.net.URLDecoder;

public class Test {

    public static final int N = 256;

    public static long instanceCount = -23206L;

    public static double dFld = -110.51149;

    public static boolean bFld = true;

    public static byte byFld = 13;

    public static int iFld = -4;

    public float fFld = 1.25F;

    public static int iFld1 = -4814;

    public static int iFld2 = -6864;

    public int[] iArrFld = new int[N];

    public static long vSmallMeth_check_sum = 0;

    public static long lMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static void vSmallMeth(int i, boolean b1, int i1) {
        if (ax$17) {
            int ax$20 = iFld2;
            int ax$21 = i1;
            int ax$22 = i;
            try {
                char[] ax$18 = new char[100];
                char[] ax$19 = new char[] { 40000, 40001, 40002, 40003, 40004 };
                ax$19[i1] = (char) ((ax$18[i1] & iFld2) >> i);
            } catch (Throwable ax$23) {
            } finally {
                iFld2 = ax$20;
                i1 = ax$21;
                i = ax$22;
            }
            return;
        }
        long[] lArr = new long[N];
        FuzzerUtils.init(lArr, -9L);
        lArr[(i >>> 1) % N] ^= ((--Test.instanceCount) - lArr[(i >>> 1) % N]);
        vSmallMeth_check_sum += i + (b1 ? 1 : 0) + i1 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l1) {
        int i5 = -26288, i6 = 50603, i7 = -96, i9 = -58, i10 = -11, i11 = 32880, i12 = 16, i13 = -6, iArr[] = new int[N];
        short s = 6984;
        long l2 = -167L, l3 = 35558L, lArr1[][] = new long[N][N];
        byte[] byArr = new byte[N];
        boolean[] bArr = new boolean[N];
        FuzzerUtils.init(lArr1, 10L);
        FuzzerUtils.init(byArr, (byte) -94);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr, -45);
        lArr1 = (lArr1 = (lArr1 = (lArr1 = lArr1)));
        {
            java.io.PrintStream ax$26 = System.out;
            java.io.PrintStream ax$27 = System.err;
            java.io.PrintStream ax$28 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$28);
            System.setErr(ax$28);
            try {
                ax$17 = true;
                for (int ax$24 = 0; ax$24 < 6303; ax$24 += 1) vSmallMeth(376079635, true, -1616735945);
            } catch (java.lang.Throwable ax$25) {
            } finally {
                ax$17 = false;
            }
            System.setOut(ax$26);
            System.setErr(ax$27);
        }
        vSmallMeth(i5, false, -3);
        Test.instanceCount = i5;
        for (i6 = 6; i6 < 226; i6++) {
            if (Test.bFld)
                continue;
            i7 += i6;
            Test.instanceCount *= -5805;
            byArr[i6 + 1] = (byte) i5;
        }
        bArr[(i5 >>> 1) % N] = Test.bFld;
        s >>>= (short) i6;
        for (int i8 : iArr) {
            i8 = 58244;
            i9 = 1;
            do {
                l2 = 1;
                do {
                    i5 += (int) l1;
                    i8 -= i8;
                } while (++l2 < 1);
                for (i10 = 1; i10 < 1; i10++) {
                    Test.dFld -= i11;
                    l3 = 30245L;
                    i8 = i8;
                    Test.instanceCount += (((i10 * i7) + i7) - l2);
                    iArr[i9] *= i5;
                    i5 = i6;
                    i7 = i9;
                    Test.byFld += (byte) -84;
                    i7 = i5;
                    i5 += (int) l3;
                    Test.bFld = true;
                }
                i8 = -2;
                for (i12 = 1; i12 < 1; i12++) {
                    switch(((i12 % 2) * 5) + 78) {
                        case 85:
                            i5 *= i5;
                            Test.bFld = Test.bFld;
                            break;
                        case 81:
                            i11 = -14;
                            i11 ^= i5;
                            if (i9 != 0) {
                                vMeth_check_sum += l1 + i5 + i6 + i7 + s + i9 + l2 + i10 + i11 + l3 + i12 + i13 + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
                                return;
                            }
                            l3 += (i12 - i13);
                        default:
                            iArr[i12] >>= i5;
                    }
                }
            } while (++i9 < 2);
        }
        vMeth_check_sum += l1 + i5 + i6 + i7 + s + i9 + l2 + i10 + i11 + l3 + i12 + i13 + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(int i3, int i4, long l) {
        int i14 = 60697, i15 = -207, i16 = 6, i17 = -4315, i18 = -2, iArr1[] = new int[N];
        float f1 = -113.862F;
        short[] sArr = new short[N];
        double[][] dArr = new double[N][N];
        FuzzerUtils.init(iArr1, -173);
        FuzzerUtils.init(sArr, (short) -11713);
        FuzzerUtils.init(dArr, -55.77610);
        vMeth(Test.instanceCount);
        for (i14 = 3; 147 > i14; i14++) {
            i3 = i14;
            for (i16 = i14; 4 > i16; i16++) {
                i18 = 1;
                while (++i18 < 1) {
                    i3 += (i18 + l);
                    Test.iFld += (i18 * l);
                    switch((i16 % 1) + 28) {
                        case 28:
                            iArr1[i18 + 1] &= Test.iFld;
                            i17 += (((i18 * f1) + i16) - i16);
                            iArr1[i18 + 1] = (int) Test.instanceCount;
                            i3 >>= (int) Test.instanceCount;
                            f1 += i18;
                            f1 += l;
                            break;
                        default:
                            Test.iFld += i14;
                            if (false)
                                break;
                            l += (i18 | (long) f1);
                            Test.iFld *= i18;
                            if (Test.bFld)
                                break;
                            sArr[i14 + 1] = (short) l;
                            dArr[i18 - 1][i18 - 1] = -10;
                            Test.iFld = 62690;
                            dArr[i16][i18] += Test.dFld;
                            l *= i4;
                            iArr1[i14] = (int) Test.instanceCount;
                            dArr = dArr;
                    }
                    i3 = 7;
                    i3 >>= i14;
                    iArr1[i14] -= i16;
                    i15 <<= Test.byFld;
                    i3 *= -10;
                    i3 += i18;
                    iArr1[i18 - 1] = (int) Test.instanceCount;
                    l += (long) Test.dFld;
                    i15 += i18;
                    Test.iFld *= (int) 135L;
                    if (Test.bFld)
                        break;
                }
                {
                    java.io.PrintStream ax$6 = System.out;
                    java.io.PrintStream ax$7 = System.err;
                    java.io.PrintStream ax$8 = new java.io.PrintStream(new java.io.OutputStream() {

                        @Override
                        public void write(int b) throws java.io.IOException {
                            // DO NOTHING: DISCARD ALL OUTPUTS
                        }
                    });
                    System.setOut(ax$8);
                    System.setErr(ax$8);
                    try {
                        for (int ax$4 = -443; ax$4 < 5073; ax$4 += 1) {
                            int ax$2 = i18;
                            try {
                                long[] ax$1 = new long[] { 0x1122334455667788L, 0x8877665544332211L, 0L, 1L, -1l };
                                long[] ax$0 = { 0x7ff0000000000001L, 0x7ff4000000000000L, 0x7ff8000000000000L, 0x7fffffffffffffffL, 0xfff0000000000001L, 0xfff4000000000000L, 0xfff8000000000000L, 0xffffffffffffffffL };
                                for (; i18 < ax$1.length; i18++) {
                                    ax$1[i18] = (long) (ax$0[i18] << (i18 & 3));
                                }
                            } catch (Throwable ax$3) {
                            } finally {
                                i18 = ax$2;
                            }
                        }
                    } catch (Throwable ax$5) {
                    }
                    System.setOut(ax$6);
                    System.setErr(ax$7);
                }
            }
        }
        long meth_res = i3 + i4 + l + i14 + i15 + i16 + i17 + i18 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public void mainTest(String[] strArr1) {
        boolean b = false;
        int i2 = 2, i19 = 51436, i20 = -38358, i21 = -92, i22 = -1, i23 = -13, i24 = -40817, i25 = -51919, i26 = 188, i27 = -22750, i28 = 92;
        float f = -102.146F, f2 = -43.466F, f3 = 2.877F, fArr[] = new float[N];
        long[] lArr2 = new long[N], lArr3 = new long[N];
        short[] sArr1 = new short[N];
        FuzzerUtils.init(lArr2, -372865607L);
        FuzzerUtils.init(lArr3, 4661709101299398564L);
        FuzzerUtils.init(fArr, 38.557F);
        FuzzerUtils.init(sArr1, (short) -6639);
        b = b;
        for (int smallinvoc = 0; smallinvoc < 679; smallinvoc++) vSmallMeth(i2++, b || ((i2 >= Test.instanceCount) && (!(true != (i2 == Test.dFld)))), iArrFld[(i2 >>> 1) % N] - i2);
        {
            java.io.PrintStream ax$26 = System.out;
            java.io.PrintStream ax$27 = System.err;
            java.io.PrintStream ax$28 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$28);
            System.setErr(ax$28);
            try {
                ax$17 = true;
                for (int ax$24 = 0; ax$24 < 6303; ax$24 += 1) vSmallMeth(376079635, true, -1616735945);
            } catch (java.lang.Throwable ax$25) {
            } finally {
                ax$17 = false;
            }
            System.setOut(ax$26);
            System.setErr(ax$27);
        }
        vSmallMeth((int) (-((-(63.528F * (-(f + -20621L)))) - (f++))), true, i2);
        lMeth(Test.iFld, Test.iFld, Test.instanceCount);
        Test.instanceCount = Test.iFld;
        iArrFld[(64201 >>> 1) % N] = -53067;
        iArrFld[(i2 >>> 1) % N] -= -17469;
        for (i19 = 7; 113 > i19; i19++) {
            short s1 = -22441;
            i21 = 1;
            do {
                iArrFld[i19 + 1] ^= -7358;
                i2 = -117;
                Test.instanceCount |= i19;
                Test.iFld += (int) (-20.252F + (i21 * i21));
                i2 = (int) 7826079665290347328L;
                Test.instanceCount &= Test.iFld;
                i20 *= -6937;
                if (b)
                    break;
                Test.instanceCount &= i19;
                i20 += (int) (15324L + (i21 * i21));
            } while (++i21 < 48);
            lArr2[i19] *= s1;
            f += i19;
            switch((((i20 >>> 1) % 5) * 5) + 88) {
                case 107:
                    Test.iFld |= Test.iFld;
                    lArr2[i19 - 1] = i22;
                    for (f2 = 2; f2 < 48; f2 += 3) {
                        for (f3 = 1; f3 < 4; ++f3) {
                            i24 = i23;
                            iArrFld[i19 + 1] >>= (int) Test.instanceCount;
                            Test.instanceCount *= (long) f;
                            Test.dFld = Test.iFld;
                            i23 += (int) f3;
                            fFld -= Test.byFld;
                            fFld = Test.instanceCount;
                            try {
                                iArrFld[i19 - 1] = (i21 % -181);
                                i24 = (i23 / i19);
                                i20 = (885782168 % iArrFld[(int) (f3 - 1)]);
                            } catch (ArithmeticException a_e) {
                            }
                            switch((int) ((f2 % 1) + 110)) {
                                case 110:
                                    Test.instanceCount = Test.instanceCount;
                                    try {
                                        i24 = (-37647 / iArrFld[(int) (f2 - 1)]);
                                        Test.iFld = (iArrFld[(int) (f3 + 1)] % i24);
                                        i22 = (iArrFld[i19 - 1] % 128);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    Test.iFld1 = (int) Test.instanceCount;
                                    i2 -= -157;
                                    lArr3[(int) (f3)] <<= Test.byFld;
                                    fArr[(int) (f3 - 1)] += -185;
                                    break;
                            }
                            i22 -= i21;
                            i22 = (int) Test.instanceCount;
                            i20 += -100;
                            i24 ^= (int) 2835691025982416072L;
                            i24 = i20;
                            i24 += (int) Test.instanceCount;
                        }
                        i20 |= (int) Test.instanceCount;
                        for (i25 = 1; i25 < 4; ++i25) {
                            i23 = (int) Test.instanceCount;
                            i23 = i21;
                            Test.dFld -= 47199;
                            Test.instanceCount += (long) 1.110F;
                        }
                        i23 += (int) (((f2 * Test.instanceCount) + Test.iFld) - Test.iFld2);
                        i23 = i26;
                        switch((i19 % 8) + 68) {
                            case 68:
                                i2 += (int) ((long) f2 ^ i22);
                                Test.iFld2 *= i24;
                                if (b)
                                    continue;
                                iArrFld[(int) (f2 + 1)] = (int) fFld;
                                break;
                            case 69:
                                iArrFld[i19 - 1] = (int) f2;
                                i22 = Test.iFld2;
                                for (i27 = 1; i27 < 4; ++i27) {
                                    Test.instanceCount += (long) Test.dFld;
                                    f += i27;
                                    if (true)
                                        continue;
                                    if (true)
                                        break;
                                    sArr1 = sArr1;
                                    i26 = i22;
                                    Test.iFld1 = i25;
                                    Test.iFld = (int) Test.instanceCount;
                                    Test.dFld -= i22;
                                }
                                Test.iFld1 *= i19;
                                iArrFld[(int) (f2 - 1)] += (int) f3;
                                Test.instanceCount -= 2635;
                                break;
                            case 70:
                                i2 -= i27;
                            case 71:
                                lArr3[i19] <<= s1;
                            case 72:
                                i28 += (int) (f2 * Test.iFld);
                                break;
                            case 73:
                            case 74:
                                lArr2[(int) (f2)] *= i27;
                                break;
                            case 75:
                                i20 -= 71;
                            default:
                                f -= Test.iFld1;
                        }
                    }
                    break;
                case 91:
                    fFld += i2;
                    break;
                case 97:
                    if (Test.bFld)
                        continue;
                    break;
                case 104:
                case 100:
                    i20 += (i19 + i23);
                    break;
            }
        }
        FuzzerUtils.out.println("b i2 f = " + (b ? 1 : 0) + "," + i2 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 f2 i23 = " + i22 + "," + Float.floatToIntBits(f2) + "," + i23);
        FuzzerUtils.out.println("f3 i24 i25 = " + Float.floatToIntBits(f3) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("lArr2 lArr3 fArr = " + FuzzerUtils.checkSum(lArr2) + "," + FuzzerUtils.checkSum(lArr3) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("sArr1 = " + FuzzerUtils.checkSum(sArr1));
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.bFld = " + Test.instanceCount + "," + Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.byFld Test.iFld fFld = " + Test.byFld + "," + Test.iFld + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.iFld1 Test.iFld2 iArrFld = " + Test.iFld1 + "," + Test.iFld2 + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }

    public static void main(String[] strArr) {
        {
            java.io.PrintStream ax$9 = System.out;
            java.io.PrintStream ax$10 = System.err;
            java.io.PrintStream ax$11 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$11);
            System.setErr(ax$11);
            {
                boolean ax$16 = false;
                for (int ax$15 = -3510; ax$15 < 1719; ax$15 += 9) {
                    if (!ax$16) {
                        ax$16 = true;
                        {
                            System.setOut(ax$9);
                            System.setErr(ax$10);
                            try {
                                Test _instance = new Test();
                                for (int i = 0; i < 10; i++) {
                                    _instance.mainTest(strArr);
                                }
                            } catch (Exception ex) {
                                FuzzerUtils.out.println(ex.getClass().getCanonicalName());
                            }
                            System.setOut(ax$11);
                            System.setErr(ax$11);
                        }
                    }
                    try {
                        URLDecoder ax$13 = new java.net.URLDecoder();
                        String ax$12 = ax$13.decode("%-1", "iso-8859-1");
                    } catch (Throwable ax$14) {
                    } finally {
                    }
                }
            }
            System.setOut(ax$9);
            System.setErr(ax$10);
        }
    }

    private static Boolean ax$17 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth lMeth
// DEBUG  lMeth ->  lMeth mainTest
// DEBUG  vMeth ->  vMeth lMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}

