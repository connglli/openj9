// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.io.IOException;

public class Test {

    public static final int N = 256;

    public static long instanceCount = -305776606L;

    public static double dFld = -118.120664;

    public static byte byFld = 124;

    public static float fFld = 0.420F;

    public static long lFld = -2658402176259967639L;

    public static volatile short sFld = 23370;

    public static float[] fArrFld = new float[N];

    public static byte[] byArrFld = new byte[N];

    public static long[] lArrFld = new long[N];

    public double[][] dArrFld = new double[N][N];

    public short[] sArrFld = new short[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.193F);
        FuzzerUtils.init(Test.byArrFld, (byte) -40);
        FuzzerUtils.init(Test.lArrFld, 3350807102L);
    }

    public static long iMeth_check_sum = 0;

    public static long iMeth1_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static void vMeth(int i4, float f1, long l) {
        float f2 = 0.985F;
        int i5 = 18328, i6 = -49092, i7 = -77, i8 = 146, i9 = 1, iArr[] = new int[N];
        byte by = -6;
        short s1 = 10326;
        FuzzerUtils.init(iArr, -43944);
        f1 -= i4;
        f2 = 1;
        do {
            boolean b = false;
            if (b)
                continue;
            i4 += (int) f2;
            b = b;
            for (i5 = 1; i5 < 4; ++i5) {
                for (i7 = 1; 2 > i7; ++i7) {
                    i8 += i7;
                    if (b) {
                        i8 <<= i4;
                        i6 = (int) l;
                        i6 = (int) Test.instanceCount;
                        i6 /= (int) (by | 1);
                        Test.fArrFld[(i8 >>> 1) % N] = l;
                        if (b)
                            continue;
                        l <<= 27L;
                        iArr[i5] += i8;
                        i6 *= (int) Test.dFld;
                        Test.instanceCount += (((i7 * i8) + i7) - i5);
                        f1 -= l;
                        vMeth_check_sum += i4 + Float.floatToIntBits(f1) + l + Float.floatToIntBits(f2) + i5 + i6 + i7 + i8 + by + s1 + i9 + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    switch((((-33997 >>> 1) % 2) * 5) + 44) {
                        case 51:
                            s1 -= (short) i7;
                            i4 = i7;
                            i4 *= i5;
                            i8 += (i7 - Test.instanceCount);
                            i8 = (int) Test.instanceCount;
                            i8 *= -45;
                            l -= i4;
                            f1 += (float) Test.dFld;
                            i4 = i9;
                            l += (i7 - l);
                            i4 *= (int) l;
                            i4 += i7;
                            break;
                        case 46:
                            i8 = i5;
                            break;
                    }
                    i4 += (int) (1.10F + (i7 * i7));
                    Test.fArrFld[(int) (f2 - 1)] += Test.instanceCount;
                    i4 -= i7;
                }
            }
        } while (++f2 < 142);
        vMeth_check_sum += i4 + Float.floatToIntBits(f1) + l + Float.floatToIntBits(f2) + i5 + i6 + i7 + i8 + by + s1 + i9 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1(short s, int i2, int i3) {
        float f3 = -1.204F;
        int i10 = -13, i11 = 162, i12 = -13, i13 = -159, i14 = -50610, i15 = -28136, i16 = 39, iArr1[] = new int[N];
        boolean b1 = false;
        double[] dArr = new double[N];
        short[] sArr = new short[N];
        long[][] lArr = new long[N][N];
        FuzzerUtils.init(dArr, 0.53529);
        FuzzerUtils.init(iArr1, -251);
        FuzzerUtils.init(sArr, (short) -8718);
        FuzzerUtils.init(lArr, 3111336680L);
        i2 += (--i2);
        vMeth(7, f3, Test.instanceCount);
        i10 = 1;
        while (++i10 < 107) {
            for (i11 = i10; 5 > i11; i11 += 2) {
                f3 += Test.instanceCount;
                if (i10 != 0) {
                }
                Test.instanceCount = (long) -40.5605;
                i12 += i11;
                i12 *= i10;
                i2 += (i11 * Test.byFld);
                Test.instanceCount = Test.instanceCount;
                i2 -= (int) f3;
                i13 = 1;
                do {
                    i3 = (int) Test.instanceCount;
                    Test.instanceCount += (((i13 * i10) + i12) - i11);
                    Test.dFld = Test.dFld;
                    i3 += i11;
                    Test.instanceCount -= i3;
                    dArr[i11 + 1] *= i13;
                } while ((i13 += 3) < 1);
                Test.instanceCount *= i13;
                i2 *= (int) f3;
                for (i14 = 1; i14 < 1; i14++) {
                    i15 = (int) Test.instanceCount;
                    iArr1[i11] = i12;
                    try {
                        iArr1[i14 + 1] = (i3 / i10);
                        i15 = (i3 / -54131);
                        iArr1[i10] = (i3 / i13);
                    } catch (ArithmeticException a_e) {
                    }
                    Test.byArrFld[i11 + 1] += Test.byFld;
                    i12 += (((i14 * i11) + i14) - f3);
                    if (true) {
                        Test.byFld -= (byte) f3;
                        i2 *= i2;
                        Test.byArrFld[i14 - 1] += (byte) Test.instanceCount;
                        i3 += (int) -74.427F;
                        i2 += -40805;
                        switch(((i12 >>> 1) % 1) + 68) {
                            case 68:
                                b1 = b1;
                                i15 = (int) Test.dFld;
                                break;
                        }
                        i12 += (((i14 * i16) + i12) - i10);
                    } else if (b1) {
                        sArr[i10 + 1] = (short) i16;
                    } else {
                        lArr[i10 - 1][i10] *= i15;
                    }
                }
            }
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
                try {
                    for (int ax$7 = -4361; ax$7 < 1210; ax$7 += 1) {
                        int ax$5 = i11;
                        try {
                            int[] ax$2 = new int[] { 0xF1F2F3F4 };
                            byte[] ax$1 = new byte[16];
                            int[] ax$0 = { 0x11, 0x22, 0x33, 0x44, 0x88, 0x99, 0xaa, 0xbb };
                            for (int ax$4 = ax$1[0]; (ax$4 ^ ax$1[1]) > -128; ax$4++) {
                                int ax$3 = ax$4 - -(i11 << 0x26cb6487);
                                ax$0[ax$3] = (ax$2[ax$3 + -ax$1[0]] - -ax$2[ax$3 - -ax$1[0]] - -ax$2[-128 + ax$3] - -ax$2[128 + ax$3]) / ax$1[6];
                            }
                        } catch (Throwable ax$6) {
                        } finally {
                            i11 = ax$5;
                        }
                    }
                } catch (Throwable ax$8) {
                }
                System.setOut(ax$9);
                System.setErr(ax$10);
            }
        }
        long meth_res = s + i2 + i3 + Float.floatToIntBits(f3) + i10 + i11 + i12 + i13 + i14 + i15 + (b1 ? 1 : 0) + i16 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i1) {
        float f = -14.733F;
        int i17 = 4684, i18 = 63554, i19 = -56307, i20 = 16719, i21 = 53300, i22 = 9, i23 = 10, i24 = 1820, i25 = 2, i26 = 8, i27 = 5, i28 = 14369, i29 = 48, iArr2[] = new int[N];
        short s2 = 26, sArr1[] = new short[N];
        boolean b2 = true;
        double[] dArr1 = new double[N];
        FuzzerUtils.init(dArr1, 2.40846);
        FuzzerUtils.init(iArr2, -50489);
        FuzzerUtils.init(sArr1, (short) 16147);
        i1 = (int) (((--f) + iMeth1((short) (9757), i1, i1)) * -3691258382843773977L);
        for (i17 = 14; i17 < 237; ++i17) {
            Test.dFld *= s2;
            i18 += (17419 + (i17 * i17));
            if (b2)
                break;
            if (i17 != 0) {
            }
            i1 = i18;
            for (i19 = i17; 3 > i19; i19 += 2) {
                for (i21 = 1; i21 > 1; --i21) {
                    i1 = (int) Test.instanceCount;
                    i18 = (int) Test.dFld;
                    Test.instanceCount /= (Test.byFld | 1);
                    i22 += (i21 * i21);
                }
                Test.instanceCount -= i1;
                for (i23 = i19; i23 < 1; i23++) {
                    Test.instanceCount += -18;
                    Test.instanceCount += (i23 * i23);
                    Test.dFld = Test.instanceCount;
                    i20 = i21;
                    dArr1[i19 - 1] -= Test.instanceCount;
                    i18 = i21;
                    i1 /= (int) (i1 | 1);
                    f += 142;
                    iArr2[i23 + 1] |= i23;
                    iArr2[i17] -= i20;
                    if (i22 != 0) {
                    }
                    if (b2)
                        continue;
                }
                {
                    java.io.PrintStream ax$12 = System.out;
                    java.io.PrintStream ax$13 = System.err;
                    java.io.PrintStream ax$14 = new java.io.PrintStream(new java.io.OutputStream() {

                        @Override
                        public void write(int b) throws java.io.IOException {
                            // DO NOTHING: DISCARD ALL OUTPUTS
                        }
                    });
                    System.setOut(ax$14);
                    System.setErr(ax$14);
                    {
                        boolean ax$20 = false;
                        for (int ax$19 = -241; ax$19 < 7800; ax$19 += 7) {
                            if (!ax$20) {
                                ax$20 = true;
                                {
                                    System.setOut(ax$12);
                                    System.setErr(ax$13);
                                    for (i25 = 1; 1 > i25; i25++) {
                                        Test.instanceCount += i25;
                                        i27 = i18;
                                        i26 <<= i1;
                                        i20 = (int) Test.instanceCount;
                                        sArr1[i19] = Test.byFld;
                                        Test.instanceCount = i22;
                                    }
                                    System.setOut(ax$14);
                                    System.setErr(ax$14);
                                }
                            }
                            try {
                                java.lang.Throwable ax$17 = new Error();
                                if (!(ax$17 instanceof IOException))
                                    ;
                            } catch (Throwable ax$18) {
                            } finally {
                            }
                        }
                    }
                    System.setOut(ax$12);
                    System.setErr(ax$13);
                }
            }
        }
        for (i28 = 1; i28 < 251; i28++) {
            Test.instanceCount += (((i28 * Test.instanceCount) + f) - i1);
            s2 += (short) 97;
        }
        long meth_res = i1 + Float.floatToIntBits(f) + i17 + i18 + s2 + (b2 ? 1 : 0) + i19 + i20 + i21 + i22 + i23 + i24 + i25 + i26 + i27 + i28 + i29 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(sArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {
        int i = 10, i30 = -32422, i31 = -61666, i32 = -51620, i33 = 96, i34 = -150, i35 = 9, iArr3[] = new int[N], iArr4[][] = new int[N][N];
        double d = 0.114929;
        float f4 = 76.47F, fArr[] = new float[N];
        boolean b3 = true, bArr[] = new boolean[N];
        long[][] lArr1 = new long[N][N];
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr3, 171);
        FuzzerUtils.init(fArr, -77.192F);
        FuzzerUtils.init(iArr4, -7);
        FuzzerUtils.init(lArr1, 690422139L);
        bArr[(i >>> 1) % N] = ((iMeth(-59993) * i) != Test.byFld);
        for (i30 = 10; i30 < 253; i30++) {
            Test.instanceCount += (long) 1.815F;
        }
        i <<= i;
        d = 1;
        do {
            switch((int) ((d % 2) + 26)) {
                case 26:
                    Test.lArrFld[(int) (d)] += i;
                    Test.instanceCount += i31;
                    f4 = 1;
                    do {
                        Test.instanceCount -= i30;
                        i31 = i31;
                        iArr3 = iArr3;
                        for (i32 = (int) (d); i32 < 1; ++i32) {
                            float f5 = -73.943F;
                            Test.instanceCount += (-2925 + (i32 * i32));
                            Test.instanceCount -= -14;
                            Test.fFld += (float) Test.dFld;
                            iArr3[(int) (d - 1)] = 12;
                            if (false)
                                continue;
                            if (true)
                                continue;
                            iArr3[(int) (d)] -= i30;
                            Test.fFld = i31;
                            i33 = i32;
                            switch((int) (((d % 7) * 5) + 89)) {
                                case 105:
                                    fArr[i32] = -55693;
                                    Test.instanceCount += 77;
                                    iArr4 = iArr4;
                                    i33 += i32;
                                    Test.fFld = i33;
                                    try {
                                        iArr3[(int) (d + 1)] = (i / i);
                                        i33 = (i30 / iArr4[(int) (d - 1)][(int) (d + 1)]);
                                        iArr3[(int) (f4 + 1)] = (-47 % i32);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    Test.lFld *= i31;
                                    Test.lFld &= i30;
                                    i33 -= i30;
                                    i31 += i;
                                    i33 = (int) Test.lFld;
                                    iArr3[(int) (f4)] = i33;
                                    break;
                                case 119:
                                    switch((int) ((d % 9) + 92)) {
                                        case 92:
                                            Test.sFld = (short) Test.instanceCount;
                                            i33 *= (int) f4;
                                            Test.sFld -= (short) i31;
                                            Test.dFld += Test.fFld;
                                            Test.lFld += i32;
                                            b3 = b3;
                                            i = (int) d;
                                            i33 += (i32 ^ Test.instanceCount);
                                            i = i33;
                                            i += i30;
                                            i -= i33;
                                            Test.byFld >>= (byte) i31;
                                            switch(((i32 % 5) * 5) + 27) {
                                                case 50:
                                                    i = Test.byFld;
                                                    break;
                                                case 48:
                                                    i33 = (int) -2.564F;
                                                    i33 = Test.sFld;
                                                    i31 = (int) 11L;
                                                    i33 *= i;
                                                    Test.fFld -= -252;
                                                    iArr4[i32][(int) (d)] %= (int) (i32 | 1);
                                                    i33 = i31;
                                                    dArrFld = FuzzerUtils.double2array(N, (double) -1.29035);
                                                    Test.byFld += (byte) (i32 | Test.instanceCount);
                                                    Test.instanceCount >>= i;
                                                    Test.lFld -= 0;
                                                    i34 *= (int) Test.lFld;
                                                    break;
                                                case 28:
                                                    lArr1[(int) (d + 1)][i32 - 1] = i33;
                                                    i33 = 41;
                                                    i = i34;
                                                    i34 += i30;
                                                    i = (int) Test.dFld;
                                                    i31 += i32;
                                                    Test.dFld += Test.fFld;
                                                    f5 -= (float) Test.dFld;
                                                    break;
                                                case 51:
                                                    i34 -= Test.byFld;
                                                    Test.instanceCount *= Test.lFld;
                                                    Test.fFld += i32;
                                                    iArr4[i32 + 1] = iArr3;
                                                    if (false)
                                                        break;
                                                    break;
                                                case 32:
                                                    i ^= i34;
                                                    break;
                                            }
                                            break;
                                        case 93:
                                            i31 += (((i32 * Test.fFld) + i35) - i30);
                                            break;
                                        case 94:
                                            sArrFld[(int) (f4 + 1)] = (short) i30;
                                            break;
                                        case 95:
                                            Test.instanceCount >>= i30;
                                        case 96:
                                            Test.dFld = Test.dFld;
                                            break;
                                        case 97:
                                            iArr3[(int) (d)] = -27131;
                                            break;
                                        case 98:
                                            i34 = (int) Test.lFld;
                                            break;
                                        case 99:
                                            Test.instanceCount += (((i32 * Test.lFld) + i34) - Test.byFld);
                                            break;
                                        case 100:
                                            f5 += (i32 - i30);
                                            break;
                                    }
                                    break;
                                case 106:
                                    i >>= (int) -46164L;
                                    break;
                                case 121:
                                    if (b3)
                                        continue;
                                    break;
                                case 93:
                                    i34 <<= i;
                                    break;
                                case 122:
                                    i33 |= i33;
                                    break;
                                case 96:
                                default:
                                    i34 <<= Test.byFld;
                            }
                        }
                    } while (++f4 < 26);
                    {
                        java.io.PrintStream ax$28 = System.out;
                        java.io.PrintStream ax$29 = System.err;
                        java.io.PrintStream ax$30 = new java.io.PrintStream(new java.io.OutputStream() {

                            @Override
                            public void write(int b) throws java.io.IOException {
                                // DO NOTHING: DISCARD ALL OUTPUTS
                            }
                        });
                        System.setOut(ax$30);
                        System.setErr(ax$30);
                        try {
                            for (int ax$26 = -4600; ax$26 < 2075; ax$26 += 1) {
                                int ax$23 = i31;
                                int ax$24 = i30;
                                try {
                                    int[] ax$21 = { 0, 1, 2, 3, 0x1234_5678, 0x8000_0000, 0x8000_0001, 0x8000_0002, 0x8000_0003, 0x8765_4321, 0xFFFF_FFFE, 0xFFFF_FFFF };
                                    for (int ax$22 = i30 - 1; ax$22 >= i31; ax$22--) {
                                        ax$21[ax$22] += 1;
                                    }
                                } catch (Throwable ax$25) {
                                } finally {
                                    i31 = ax$23;
                                    i30 = ax$24;
                                }
                            }
                        } catch (Throwable ax$27) {
                        }
                        System.setOut(ax$28);
                        System.setErr(ax$29);
                    }
                    break;
                case 27:
                    Test.fFld += (float) Test.dFld;
                    break;
            }
        } while (++d < 197);
        FuzzerUtils.out.println("i i30 i31 = " + i + "," + i30 + "," + i31);
        FuzzerUtils.out.println("d f4 i32 = " + Double.doubleToLongBits(d) + "," + Float.floatToIntBits(f4) + "," + i32);
        FuzzerUtils.out.println("i33 b3 i34 = " + i33 + "," + (b3 ? 1 : 0) + "," + i34);
        FuzzerUtils.out.println("i35 bArr iArr3 = " + i35 + "," + FuzzerUtils.checkSum(bArr) + "," + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("fArr iArr4 lArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," + FuzzerUtils.checkSum(iArr4) + "," + FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.byFld = " + Test.instanceCount + "," + Double.doubleToLongBits(Test.dFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.fFld Test.lFld Test.sFld = " + Float.floatToIntBits(Test.fFld) + "," + Test.lFld + "," + Test.sFld);
        FuzzerUtils.out.println("Test.fArrFld Test.byArrFld Test.lArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.byArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("dArrFld sArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
        {
            java.io.PrintStream ax$42 = System.out;
            java.io.PrintStream ax$43 = System.err;
            java.io.PrintStream ax$44 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$44);
            System.setErr(ax$44);
            try {
                for (int ax$40 = -4143; ax$40 < 2225; ax$40 += 1) {
                    try {
                        int ax$38 = 0xBC00009A;
                        int ax$36 = 100077;
                        for (int ax$37 = 0; ax$37 < ax$38; ax$37++) {
                            int ax$34 = ax$36;
                            ax$36 = ax$34 + ax$37;
                            int ax$35 = ax$36;
                            ax$36 = ax$35 + 2 * ax$37;
                        }
                    } catch (Throwable ax$39) {
                    } finally {
                    }
                }
            } catch (Throwable ax$41) {
            }
            System.setOut(ax$42);
            System.setErr(ax$43);
        }
    }
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  iMeth ->  iMeth mainTest
// DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
// DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}

