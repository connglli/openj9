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

    public static long instanceCount = -1L;

    public static byte byFld = 49;

    public static volatile boolean bFld = false;

    public static float fFld = 1.199F;

    public double dFld = 23.4061;

    public volatile int[] iArrFld = new int[N];

    public static int[] iArrFld1 = new int[N];

    public static double[] dArrFld = new double[N];

    public static long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, 13);
        FuzzerUtils.init(Test.dArrFld, 118.98887);
        FuzzerUtils.init(Test.lArrFld, 4L);
    }

    public static long vMeth_check_sum = 0;

    public static long lMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {
        int i8 = -3, i9 = 64752, i10 = 86, i11 = 127, i12 = 13, i13 = -13, i14 = -6, i15 = -2, i16 = -9, i17 = 46653, i18 = -57772, i19 = 79, i20 = -5065;
        double d = 77.93157;
        float f = 14.456F;
        short s1 = 28868, sArr[] = new short[N];
        FuzzerUtils.init(sArr, (short) 23564);
        for (i8 = 5; i8 < 229; ++i8) {
            Test.iArrFld1[i8 + 1] -= Test.byFld;
            Test.iArrFld1[i8 - 1] <<= (int) Test.instanceCount;
            for (i10 = 1; i10 < 3; i10++) {
                Test.instanceCount -= i8;
            }
            i9 = (int) Test.instanceCount;
            d = f;
            Test.iArrFld1[i8 - 1] = i9;
            d *= f;
        }
        for (i12 = 5; 176 > i12; ++i12) {
            for (i14 = 1; i14 < 3; i14++) {
                sArr[i12] = Test.byFld;
                i16 = 1;
                while (++i16 < 2) {
                    Test.iArrFld1[i14] += (int) d;
                    Test.iArrFld1[(-24440 >>> 1) % N] = i11;
                }
                i9 = (int) -232L;
                for (i17 = 1; 2 > i17; ++i17) {
                    Test.instanceCount *= -1;
                    i18 += (((i17 * i16) + i18) - Test.instanceCount);
                    Test.instanceCount *= i17;
                    i9 = i13;
                    Test.iArrFld1[i12] = s1;
                    Test.instanceCount *= i9;
                    i18 += i17;
                }
                for (i19 = i14; i19 < 2; i19++) {
                    if (Test.bFld) {
                        d -= i20;
                        f += (((i19 * i11) + i16) - s1);
                        d -= i14;
                        i20 = i11;
                        Test.iArrFld1[i12 - 1] = (int) -2L;
                        i13 += (int) Test.instanceCount;
                    } else if (Test.bFld) {
                        Test.instanceCount += (23446 + (i19 * i19));
                        Test.byFld &= (byte) -126;
                        i18 += (i19 * i19);
                        Test.instanceCount += (((i19 * i9) + Test.instanceCount) - i16);
                        s1 += (short) i19;
                    } else if (Test.bFld) {
                        i20 += (int) Test.instanceCount;
                    }
                }
            }
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i12 + i13 + i14 + i15 + i16 + i17 + i18 + s1 + i19 + i20 + FuzzerUtils.checkSum(sArr);
    }

    public static long lMeth() {
        if (ax$9) {
            try {
                int ax$10 = 3200;
                int ax$11 = 0x8000_0000;
                if (ax$10 > ax$11)
                    ax$10 = ax$11;
            } catch (Throwable ax$12) {
            } finally {
            }
            return -3921149212043297446L;
        }
        int i6 = -61672, i7 = 53531, i21 = -10, i22 = -1, i23 = 94, i24 = -8, i25 = -146, i26 = 52;
        short s2 = 27170;
        float[][] fArr = new float[N][N];
        long[][] lArr = new long[N][N];
        FuzzerUtils.init(fArr, -59.846F);
        FuzzerUtils.init(lArr, 11L);
        i6 = 1;
        do {
            Test.instanceCount = Math.abs((int) ((i6 * i6) + (Test.instanceCount * i6)));
            i7 -= (int) ((i6 + (i7 + -26.204F)) + ((--Test.byFld) + Test.iArrFld1[i6 - 1]));
            vMeth1();
            Test.fFld += (i6 + i6);
            Test.fFld += i6;
            i7 += i6;
            i7 += (int) Test.instanceCount;
            Test.dArrFld[i6] = -8;
            if (Test.bFld)
                break;
            i7 += i7;
            i7 = i6;
        } while (++i6 < 109);
        Test.fFld += Test.instanceCount;
        fArr[(189 >>> 1) % N][(i7 >>> 1) % N] *= i7;
        for (i21 = 5; i21 < 111; i21++) {
            i22 = (int) Test.instanceCount;
            Test.iArrFld1[i21 - 1] ^= -33687;
            i7 = Test.byFld;
            switch((i21 % 10) + 94) {
                case 94:
                    if (Test.bFld)
                        continue;
                    i22 += (9 + (i21 * i21));
                    break;
                case 95:
                    for (i23 = i21; 5 > i23; ++i23) {
                        i24 = i7;
                        Test.instanceCount += i23;
                        for (i25 = 1; i25 < 1; ++i25) {
                            i24 += i25;
                            Test.instanceCount += Test.instanceCount;
                            i24 <<= i6;
                            Test.instanceCount ^= -31909;
                            Test.iArrFld1[i21] -= (int) Test.instanceCount;
                            i22 = i25;
                            i24 += (i25 - i24);
                            Test.instanceCount += Test.instanceCount;
                            i7 -= i25;
                            s2 -= (short) i26;
                            Test.iArrFld1[i21 - 1] = i25;
                            Test.lArrFld[i21] <<= Test.byFld;
                        }
                    }
                    break;
                case 96:
                    Test.fFld = Test.fFld;
                    break;
                case 97:
                    Test.fFld -= 111;
                    break;
                case 98:
                    s2 += (short) (101 + (i21 * i21));
                    break;
                case 99:
                    Test.iArrFld1[i21 + 1] |= (int) -2223205908L;
                    break;
                case 100:
                    lArr = lArr;
                    break;
                case 101:
                    s2 += (short) i21;
                    break;
                case 102:
                    Test.instanceCount += (((i21 * i7) + s2) - i22);
                    break;
                case 103:
                    Test.instanceCount >>= Test.byFld;
                    break;
            }
        }
        long meth_res = i6 + i7 + i21 + i22 + i23 + i24 + i25 + i26 + s2 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth() {
        if (ax$18) {
            boolean ax$43 = bFld;
            try {
                boolean ax$42 = false;
                if (ax$42 != bFld)
                    ;
            } catch (Throwable ax$44) {
            } finally {
                bFld = ax$43;
            }
            return;
        }
        int i1 = -1, i2 = 32851, i3 = -47, i4 = -14, i5 = 15707, i28 = -58667, i29 = -13334;
        short s = 26137, sArr1[] = new short[N];
        FuzzerUtils.init(sArr1, (short) -5010);
        for (i1 = 5; i1 < 118; i1 += 3) {
            for (i3 = 1; 14 > i3; i3++) {
                i5 = 1;
                do {
                    i2 |= (int) (((i3 + Test.instanceCount) * Test.iArrFld1[i5 + 1]) + ((Test.instanceCount + Test.instanceCount) + s));
                } while (++i5 < 2);
                Test.iArrFld1[i1 - 1] = i1;
                Test.instanceCount *= (Math.abs((int) (-179L * lMeth())) * Test.instanceCount);
                switch((i1 % 3) + 103) {
                    case 103:
                        i2 += (-49213 + (i3 * i3));
                        Test.iArrFld1[i3 + 1] = i4;
                        if (Test.bFld) {
                            Test.instanceCount *= s;
                            Test.byFld *= (byte) i1;
                            for (i28 = 1; i28 < 2; i28++) {
                                double d1 = -7.113381;
                                i2 <<= i5;
                                Test.instanceCount += (i28 ^ i29);
                                switch(((i1 % 6) * 5) + 21) {
                                    case 32:
                                        i2 -= (int) -111.661F;
                                        switch((((4122 >>> 1) % 7) * 5) + 109) {
                                            case 122:
                                                i2 += i28;
                                                Test.iArrFld1[i3 + 1] = (int) Test.instanceCount;
                                                break;
                                            case 137:
                                                i2 = (int) Test.fFld;
                                                Test.bFld = true;
                                                break;
                                            case 129:
                                                Test.instanceCount += (i28 + i4);
                                                Test.iArrFld1 = Test.iArrFld1;
                                                try {
                                                    i2 = (185 % i5);
                                                    i4 = (Test.iArrFld1[i28 - 1] / 41690);
                                                    Test.iArrFld1[i3 - 1] = (i5 / -17279);
                                                } catch (ArithmeticException a_e) {
                                                }
                                                Test.instanceCount -= i1;
                                                i4 += i28;
                                                Test.iArrFld1 = FuzzerUtils.int1array(N, (int) -7);
                                                Test.fFld = -4081;
                                                Test.fFld *= i5;
                                                break;
                                            case 142:
                                                i29 = i3;
                                                switch(((i4 >>> 1) % 9) + 102) {
                                                    case 102:
                                                        if (Test.bFld)
                                                            continue;
                                                        i29 = (int) Test.instanceCount;
                                                        i4 *= i28;
                                                        i4 -= i5;
                                                        Test.iArrFld1[i3 - 1] >>= -1;
                                                        break;
                                                    case 103:
                                                        sArr1[i1 - 1] -= (short) i29;
                                                        break;
                                                    case 104:
                                                        Test.instanceCount = i4;
                                                        break;
                                                    case 105:
                                                        i4 -= i3;
                                                        break;
                                                    case 106:
                                                    case 107:
                                                        i2 *= (int) Test.instanceCount;
                                                        break;
                                                    case 108:
                                                        i2 -= i1;
                                                        break;
                                                    case 109:
                                                        i4 += (((i28 * i29) + Test.instanceCount) - i3);
                                                        break;
                                                    case 110:
                                                }
                                            case 125:
                                                i29 >>= s;
                                            case 111:
                                                Test.lArrFld[i28] <<= i3;
                                                break;
                                            case 128:
                                                i29 = (int) d1;
                                            default:
                                                i2 %= (int) (i4 | 1);
                                        }
                                    case 36:
                                    case 49:
                                        i2 = (int) Test.fFld;
                                        break;
                                    case 45:
                                        Test.instanceCount = i1;
                                    case 24:
                                        Test.instanceCount += (((i28 * Test.fFld) + Test.byFld) - i3);
                                        break;
                                    case 41:
                                        i4 += i28;
                                        break;
                                }
                            }
                        } else if (Test.bFld) {
                            Test.lArrFld[i1 + 1] = i2;
                        }
                        break;
                    case 104:
                    case 105:
                        i4 = (int) 13729060L;
                        break;
                    default:
                        Test.instanceCount = 13;
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + s + i28 + i29 + FuzzerUtils.checkSum(sArr1);
    }

    public void mainTest(String[] strArr1) {
        int i = 218;
        Test.instanceCount = ((++i) - (-iArrFld[(i >>> 1) % N]));
        {
            java.io.PrintStream ax$47 = System.out;
            java.io.PrintStream ax$48 = System.err;
            java.io.PrintStream ax$49 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$49);
            System.setErr(ax$49);
            try {
                ax$18 = true;
                for (int ax$45 = 0; ax$45 < 5768; ax$45 += 1) vMeth();
            } catch (java.lang.Throwable ax$46) {
            } finally {
                ax$18 = false;
            }
            System.setOut(ax$47);
            System.setErr(ax$48);
        }
        vMeth();
        dFld -= -250;
        i = i;
        FuzzerUtils.out.println("i = " + i);
        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.bFld = " + Test.instanceCount + "," + Test.byFld + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.fFld dFld iArrFld = " + Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.iArrFld1 Test.dArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
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
                    for (int ax$4 = -752; ax$4 < 7702; ax$4 += 1) {
                        try {
                            int ax$2 = 499501;
                            int ax$1 = 256 * 1024 * 1024;
                            for (int ax$0 = 0; ax$0 < ax$2; ax$0++) ax$1++;
                        } catch (Throwable ax$3) {
                        } finally {
                        }
                    }
                } catch (Throwable ax$5) {
                }
                System.setOut(ax$6);
                System.setErr(ax$7);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    private static Boolean ax$9 = false;

    private static Boolean ax$18 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  vMeth ->  vMeth mainTest
// DEBUG  lMeth ->  lMeth vMeth mainTest
// DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}

