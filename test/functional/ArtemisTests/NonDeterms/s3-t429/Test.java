/*******************************************************************************
 * Copyright IBM Corp. and others 2023
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] https://openjdk.org/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/

// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

public class Test {

    public static final int N = 256;

    public static long instanceCount = 1737755940036916784L;

    public static float fFld = -48.1001F;

    public int iFld = 6115;

    public byte byFld = -110;

    public static long[] lArrFld = new long[N];

    public static int[] iArrFld = new int[N];

    public byte[] byArrFld = new byte[N];

    public static float[] fArrFld = new float[N];

    public volatile double[][] dArrFld = new double[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, 2329338326L);
        FuzzerUtils.init(Test.iArrFld, -52);
        FuzzerUtils.init(Test.fArrFld, 2.567F);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {
        int i6 = 2081, i7 = -198, i8 = -79, i9 = 16869, i10 = 2, i11 = 13517, iArr[] = new int[N];
        float f = 0.600F;
        byte by = -16;
        short s = -4209;
        boolean b = false;
        long[] lArr = new long[N];
        FuzzerUtils.init(iArr, 45507);
        FuzzerUtils.init(lArr, -964265677L);
        for (i6 = 4; i6 < 126; i6++) {
            iArr[i6 + 1] = -7;
            Test.instanceCount = i7;
            i7 = (int) f;
            f -= i7;
            by += (byte) i6;
        }
        i7 *= i6;
        Test.instanceCount = i7;
        switch(((i6 >>> 1) % 9) + 92) {
            case 92:
                i8 = 1;
                while (++i8 < 221) {
                    if (b) {
                        f -= -3;
                        i7 = (int) Test.instanceCount;
                        i7 -= i6;
                    } else if (b) {
                        for (i9 = 3; i9 > 1; --i9) {
                            switch(((i9 % 8) * 5) + 37) {
                                case 49:
                                    iArr[i9] -= i10;
                                    try {
                                        i10 = (-54141 / i7);
                                        i7 = (-24341 / i6);
                                        iArr[i9 - 1] = (i8 % i7);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    break;
                                case 62:
                                    Test.instanceCount = 51767;
                                    break;
                                case 42:
                                    f += i8;
                                    iArr = iArr;
                                    f *= f;
                                    i7 -= (int) f;
                                case 68:
                                    i7 *= (int) Test.instanceCount;
                                    i10 -= i6;
                                    iArr[i9 - 1] = 10;
                                    break;
                                case 73:
                                    i11 = 1;
                                    do {
                                        i7 -= i9;
                                        i7 = i8;
                                        i7 += (i11 - i10);
                                        switch((i11 % 9) + 21) {
                                            case 21:
                                                f *= i9;
                                                i7 -= i9;
                                                s += (short) i9;
                                                Test.instanceCount = i9;
                                                i7 *= (int) 68.777F;
                                                Test.instanceCount = -40L;
                                            case 22:
                                                iArr[i9 - 1] ^= i7;
                                            case 23:
                                                i10 = i6;
                                            case 24:
                                                Test.instanceCount >>= i8;
                                                break;
                                            case 25:
                                                i7 += i11;
                                                break;
                                            case 26:
                                                Test.instanceCount += (long) -35.91978;
                                                break;
                                            case 27:
                                                if (b)
                                                    break;
                                                break;
                                            case 28:
                                                if (i7 != 0) {
                                                    vMeth2_check_sum += i6 + i7 + Float.floatToIntBits(f) + by + i8 + i9 + i10 + i11 + s + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
                                                    return;
                                                }
                                            case 29:
                                                if (b)
                                                    break;
                                                break;
                                            default:
                                                by += (byte) (-89 + (i11 * i11));
                                        }
                                    } while (++i11 < 2);
                                    break;
                                case 64:
                                    i7 >>= by;
                                    break;
                                case 58:
                                    Test.instanceCount -= Test.instanceCount;
                                    break;
                                case 54:
                                    i10 = i6;
                                    break;
                                default:
                                    i10 *= i7;
                            }
                        }
                    } else {
                        i7 += i10;
                    }
                }
                break;
            case 93:
                i7 += by;
                break;
            case 94:
            case 95:
                by = (byte) i11;
                break;
            case 96:
                Test.instanceCount *= i6;
                break;
            case 97:
                lArr[(i10 >>> 1) % N] >>= i11;
            case 98:
                i10 -= (int) -4556837914021909930L;
            case 99:
                f -= i9;
                break;
            case 100:
                i10 >>= i11;
                break;
        }
        vMeth2_check_sum += i6 + i7 + Float.floatToIntBits(f) + by + i8 + i9 + i10 + i11 + s + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i5, long l) {
        if (ax$0) {
            try {
                int[] ax$2 = new int[51];
                int ax$1 = 0x0e0f;
                int ax$3 = 1234;
                ax$1 += ax$2[ax$3];
            } catch (Throwable ax$4) {
            } finally {
            }
            return;
        }
        double d = 0.121176;
        int i12 = -8123, i13 = -121, i14 = -251, i15 = 14, i16 = 12;
        byte by1 = -61;
        l *= (((++i5) + (i5--)) + -32647);
        vMeth2();
        i5 = 17882;
        i5 += (int) d;
        i12 = 1;
        while (++i12 < 196) {
            short s1 = 27145;
            i5 += (i12 * i12);
            i5 >>= i12;
            s1 += (short) Test.fFld;
            Test.fFld += (-8996 + (i12 * i12));
            Test.instanceCount <<= i12;
            i5 = i5;
            d = -5659298834617461244L;
            Test.lArrFld[i12] -= (long) d;
            try {
                i5 = (i5 % Test.iArrFld[i12 + 1]);
                i5 = (4610 % i12);
                i5 = (i5 / 31292);
            } catch (ArithmeticException a_e) {
            }
            Test.instanceCount += i12;
            for (i13 = 1; 3 > i13; ++i13) {
                Test.iArrFld[i12] = i5;
                Test.instanceCount = i12;
                Test.lArrFld[i12] = l;
                l >>= i13;
                try {
                    i14 = (i13 % i5);
                    i14 = (i12 % i13);
                    i14 = (i13 % 12252);
                } catch (ArithmeticException a_e) {
                }
                i14 += i5;
                for (i15 = 1; i15 < 2; i15++) {
                    Test.iArrFld[i15] *= (int) l;
                    i5 += (int) Test.fFld;
                    Test.iArrFld = Test.iArrFld;
                    if (i5 != 0) {
                        vMeth1_check_sum += i5 + l + Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 + i16 + by1;
                        return;
                    }
                    i16 += (((i15 * i15) + i15) - i13);
                    l ^= i5;
                    i14 += (((i15 * i15) + i16) - i12);
                    i5 += i15;
                    i14 -= (int) l;
                    i16 += 33407;
                    by1 = (byte) l;
                    i14 = s1;
                    Test.iArrFld[i13 + 1] = -121;
                }
                d += Test.instanceCount;
            }
        }
        vMeth1_check_sum += i5 + l + Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 + i16 + by1;
    }

    public static void vMeth(int i, int i1, int i2) {
        if (ax$10) {
            float ax$15 = fFld;
            int ax$16 = i1;
            try {
                float ax$12 = 15;
                float ax$13 = 41.0f;
                float[] ax$11 = { -16777215.5f, -16777215.0f, -0.49999998f, -0.4999999701976776123046875f, 0.4999999701976776123046875f, 0.49999998f, 16777215.0f, 16777215.5f };
                float ax$14 = 49.0f;
                ax$11[i1 + 2] = ax$14;
                ax$11[i1 + 3] = ax$13;
                ax$11[i1 + 4] = fFld;
                ax$11[i1 + 5] = ax$12;
            } catch (Throwable ax$17) {
            } finally {
                fFld = ax$15;
                i1 = ax$16;
            }
            return;
        }
        int i3 = 10, i4 = -187, i17 = -39, i18 = 63347, i19 = -36, i20 = 186, i21 = -7344, i22 = 0, i23 = -17;
        byte by2 = -57, byArr[] = new byte[N];
        double d1 = -2.80162, d2 = 76.38947;
        long l1 = -119L;
        boolean[] bArr = new boolean[N];
        FuzzerUtils.init(byArr, (byte) 82);
        FuzzerUtils.init(bArr, false);
        for (i3 = 239; i3 > 9; i3 -= 3) {
            {
                java.io.PrintStream ax$7 = System.out;
                java.io.PrintStream ax$8 = System.err;
                java.io.PrintStream ax$9 = new java.io.PrintStream(new java.io.OutputStream() {

                    @Override
                    public void write(int b) throws java.io.IOException {
                        // DO NOTHING: DISCARD ALL OUTPUTS
                    }
                });
                System.setOut(ax$9);
                System.setErr(ax$9);
                try {
                    ax$0 = true;
                    for (int ax$5 = 0; ax$5 < 9463; ax$5 += 1) vMeth1(1353957224, 1132893400769441661L);
                } catch (java.lang.Throwable ax$6) {
                } finally {
                    ax$0 = false;
                }
                System.setOut(ax$7);
                System.setErr(ax$8);
            }
            vMeth1(i4, Test.instanceCount);
            i1 += i3;
            i2 += i3;
            Test.instanceCount = Test.instanceCount;
            Test.lArrFld[i3] += Test.instanceCount;
        }
        Test.lArrFld[(i1 >>> 1) % N] -= 6226839440574696492L;
        for (i17 = 11; 177 > i17; i17 += 2) {
            i += by2;
            for (i19 = 1; i19 < 7; ++i19) {
                i2 += i4;
                Test.instanceCount = -12;
            }
            i4 >>= i1;
            for (d1 = 1; d1 < 7; d1++) {
                try {
                    i1 = (Test.iArrFld[i17] / 1219886509);
                    i18 = (i2 % i3);
                    i22 = (i17 % 159);
                } catch (ArithmeticException a_e) {
                }
                byArr[i17 + 1] -= (byte) i22;
                for (l1 = 1; l1 < 2; l1++) {
                    boolean b1 = true;
                    switch((int) (((l1 % 2) * 5) + 13)) {
                        case 19:
                            i4 += 55;
                            by2 = (byte) -34;
                            if (b1)
                                continue;
                            Test.fFld += i1;
                            Test.fFld += l1;
                            i1 -= (int) Test.instanceCount;
                            i4 = i18;
                            Test.iArrFld[i17 + 1] = (int) Test.fFld;
                            bArr = bArr;
                            if (b1)
                                break;
                            Test.instanceCount = i3;
                            break;
                        case 18:
                            Test.instanceCount -= i2;
                            Test.iArrFld[(int) (l1)] <<= i21;
                            d2 %= ((long) (d1) | 1);
                            if (false) {
                                switch((int) ((d1 % 3) + 88)) {
                                    case 88:
                                        i23 += i4;
                                        Test.instanceCount = i23;
                                        d2 += i1;
                                    case 89:
                                        i1 = i20;
                                    case 90:
                                        Test.iArrFld[(int) (d1)] %= (int) (i19 | 1);
                                        break;
                                    default:
                                        Test.instanceCount += (((l1 * i22) + i2) - Test.fFld);
                                }
                            }
                    }
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i17 + i18 + by2 + i19 + i20 + Double.doubleToLongBits(d1) + i21 + i22 + l1 + i23 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {
        int i24 = 12990, i25 = -7591, i26 = 4, i27 = -36, i28 = 3979, i29 = 188, i30 = -106, i31 = 146, i32 = -38;
        short s2 = 6517, sArr[] = new short[N];
        double d3 = -89.49932;
        FuzzerUtils.init(sArr, (short) 31713);
        {
            java.io.PrintStream ax$20 = System.out;
            java.io.PrintStream ax$21 = System.err;
            java.io.PrintStream ax$22 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$22);
            System.setErr(ax$22);
            try {
                ax$10 = true;
                for (int ax$18 = 0; ax$18 < 6242; ax$18 += 1) vMeth(-1451942594, 290968904, -1104465733);
            } catch (java.lang.Throwable ax$19) {
            } finally {
                ax$10 = false;
            }
            System.setOut(ax$20);
            System.setErr(ax$21);
        }
        vMeth(i24, i24, i24);
        for (i25 = 2; i25 < 90; i25++) {
            for (i27 = 3; 57 > i27; ++i27) {
                i24 -= i25;
                s2 |= (short) Test.instanceCount;
                i28 += (i27 ^ i24);
                Test.instanceCount += (((i27 * i26) + Test.fFld) - Test.instanceCount);
                Test.instanceCount -= i26;
                i26 += (i27 * s2);
                Test.lArrFld[i25 - 1] <<= i24;
                Test.iArrFld[i27 - 1] = i27;
                byArrFld[i27] = (byte) Test.instanceCount;
                for (i29 = 1; i29 < 2; ++i29) {
                    Test.instanceCount = i29;
                    i28 = (int) Test.instanceCount;
                    i28 -= i29;
                    i24 *= (int) Test.instanceCount;
                    Test.instanceCount += i29;
                    Test.instanceCount >>= iFld;
                }
                i24 >>= (int) 1980744715L;
                for (i31 = 1; 2 > i31; i31 += 2) {
                    boolean b2 = true;
                    i30 *= (int) -45.2F;
                    Test.iArrFld[i25 + 1] -= i31;
                    Test.lArrFld[i31 - 1] |= i27;
                    i26 -= (int) Test.fFld;
                    Test.lArrFld[i25] += -53132;
                    s2 <<= (short) Test.instanceCount;
                    i24 += (i31 * Test.fFld);
                    Test.fArrFld = Test.fArrFld;
                    i32 += (((i31 * i29) + i28) - Test.instanceCount);
                    Test.instanceCount = iFld;
                    if (b2) {
                        i32 += i31;
                        i32 += (i31 * i31);
                        if (b2)
                            continue;
                        i24 += (int) (-14L + (i31 * i31));
                        s2 = (short) i32;
                        Test.instanceCount *= s2;
                        Test.instanceCount = i32;
                        if (b2) {
                            byFld += (byte) i26;
                        } else if (b2) {
                            i28 = -185;
                            i30 <<= i31;
                            i26 ^= i25;
                            i28 = i28;
                            i26 -= (int) Test.instanceCount;
                            s2 += (short) (((i31 * Test.instanceCount) + i24) - i31);
                            i28 += i31;
                            i32 = 8654;
                            Test.fFld = i29;
                            d3 -= iFld;
                            byFld = (byte) i25;
                        } else if (b2) {
                            Test.fFld = i28;
                            Test.fFld += i25;
                            Test.iArrFld[i31 - 1] = (int) Test.instanceCount;
                            switch(((i27 % 9) * 5) + 92) {
                                case 118:
                                    i28 ^= iFld;
                                    Test.instanceCount += i26;
                                    Test.fFld -= Test.instanceCount;
                                    i26 += i31;
                                    Test.instanceCount = i29;
                                    d3 += i25;
                                    i30 += (i31 + byFld);
                                    byFld <<= (byte) -163;
                                    Test.iArrFld[i25] += (int) d3;
                                    i32 >>= i29;
                                    switch(((15 >>> 1) % 4) + 56) {
                                        case 56:
                                            i32 += i31;
                                            Test.iArrFld[i25 + 1] *= i32;
                                            i24 += i24;
                                            Test.instanceCount >>= i32;
                                            dArrFld[i25 - 1][i31] = i30;
                                            i24 += i29;
                                            i26 += i31;
                                            Test.instanceCount *= i28;
                                            break;
                                        case 57:
                                            Test.instanceCount += i31;
                                            break;
                                        case 58:
                                            i32 += (i31 - i31);
                                        case 59:
                                            Test.instanceCount *= i28;
                                            break;
                                        default:
                                            Test.iArrFld[i25] = i28;
                                    }
                                    break;
                                case 125:
                                    i30 /= (int) (i32 | 1);
                                    break;
                                case 136:
                                    try {
                                        i24 = (-750311814 / i24);
                                        i30 = (i27 / i27);
                                        i26 = (-35400 % i27);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    break;
                                case 95:
                                    sArr[i27 - 1] += (short) Test.instanceCount;
                                    break;
                                case 133:
                                    Test.instanceCount &= i31;
                                case 117:
                                    d3 *= Test.instanceCount;
                                    break;
                                case 99:
                                    iFld += i31;
                                    break;
                                case 126:
                                    Test.instanceCount -= 3050506196L;
                                    break;
                                case 129:
                                    i32 <<= i32;
                                    break;
                            }
                        } else {
                            Test.fFld = (float) d3;
                        }
                    } else if (b2) {
                        i24 += i32;
                    } else {
                        d3 = Test.fFld;
                    }
                }
            }
        }
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 s2 = " + i27 + "," + i28 + "," + s2);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 d3 sArr = " + i32 + "," + Double.doubleToLongBits(d3) + "," + FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld iFld = " + Test.instanceCount + "," + Float.floatToIntBits(Test.fFld) + "," + iFld);
        FuzzerUtils.out.println("byFld Test.lArrFld Test.iArrFld = " + byFld + "," + FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("byArrFld Test.fArrFld dArrFld = " + FuzzerUtils.checkSum(byArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        if (ax$23) {
            try {
                int ax$24 = 5788;
                ax$24 = 5;
            } catch (Throwable ax$25) {
            } finally {
            }
            return;
        }
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    private static Boolean ax$0 = false;

    private static Boolean ax$10 = false;

    private static Boolean ax$23 = false;
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

