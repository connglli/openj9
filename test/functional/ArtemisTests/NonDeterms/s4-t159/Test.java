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

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class Test {

    public static final int N = 256;

    public static long instanceCount = 142L;

    public static int iFld = -41163;

    public static long lFld = 38L;

    public static boolean bFld = true;

    public static double dFld = 91.34871;

    public volatile double dFld1 = 2.23419;

    public static long[] lArrFld = new long[N];

    public static double[] dArrFld = new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 4146770826775235752L);
        FuzzerUtils.init(Test.dArrFld, 0.123718);
    }

    public static long iMeth_check_sum = 0;

    public static long fMeth_check_sum = 0;

    public static long iMeth1_check_sum = 0;

    public static int iMeth1(byte by1, long l1, double d) {
        if (ax$12) {
            int ax$21 = iFld;
            try {
                java.util.Random ax$17 = new Random(69);
                java.util.Set ax$14 = new HashSet();
                int ax$13 = ax$17.nextInt() % iFld;
                Integer ax$15 = new Integer(ax$13 < 0 ? -ax$13 : ax$13);
                int ax$19 = ax$14.size();
                boolean ax$18 = ax$14.contains(ax$15);
                boolean ax$16 = ax$14.add(ax$15);
                if (!ax$14.contains(ax$15))
                    ;
                if (ax$16 == ax$18)
                    ;
                int ax$20 = ax$14.size();
                if (ax$16 && ax$19 == ax$20)
                    ;
                if (!ax$16 && ax$19 != ax$20)
                    ;
            } catch (Throwable ax$22) {
            } finally {
                iFld = ax$21;
            }
            return -1885099500;
        }
        float f2 = 1.594F, f3 = -1.887F;
        int i9 = -10, i10 = 196, i11 = 56452, i12 = 222, i13 = 4, i14 = 235, i15 = 0, i16 = 38796, i17 = -20, i18 = -201, i19 = 5, i20 = -126, i21 = 7, iArr1[] = new int[N];
        boolean b = false;
        FuzzerUtils.init(iArr1, -10);
        f2 = Test.iFld;
        for (i9 = 109; i9 > 2; i9 -= 2) {
            Test.iFld += (10 + (i9 * i9));
            for (i11 = 1; i11 < 10; i11++) {
                Test.iFld = Test.iFld;
                Test.iFld += (int) d;
                for (i13 = 1; 2 > i13; ++i13) {
                    f2 -= f2;
                    i12 *= (int) 81.595F;
                    i10 += i14;
                    if (b)
                        continue;
                    Test.iFld = i12;
                    iArr1[i11] ^= i12;
                    Test.instanceCount += (((i13 * i14) + i14) - i10);
                    l1 = Test.iFld;
                }
                i15 -= i15;
            }
        }
        l1 >>>= i13;
        i10 += (int) Test.instanceCount;
        iArr1 = FuzzerUtils.int1array(N, (int) -89);
        for (i16 = 6; i16 < 155; ++i16) {
            i10 = (int) -6687412403970478736L;
            if (b) {
                for (i18 = 1; i18 < 4; i18++) {
                    for (i20 = 1; i20 < 2; ++i20) {
                        Test.lArrFld = Test.lArrFld;
                        i17 <<= i18;
                        Test.lArrFld[i18] = (long) f2;
                        f2 += i20;
                        Test.lArrFld[i16 - 1] = i12;
                        Test.iFld >>= i12;
                        d = i20;
                        Test.iFld += (int) l1;
                        f3 -= by1;
                        iArr1[i16] += (int) l1;
                        Test.instanceCount = i9;
                        Test.instanceCount += (((i20 * l1) + i10) - Test.instanceCount);
                        i12 += (i20 ^ Test.instanceCount);
                    }
                }
            } else if (b) {
                Test.iFld *= i12;
            } else {
                Test.instanceCount = i19;
            }
        }
        long meth_res = by1 + l1 + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i9 + i10 + i11 + i12 + i13 + i14 + (b ? 1 : 0) + i15 + i16 + i17 + i18 + i19 + i20 + i21 + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static float fMeth(byte by, int i3, long l) {
        int i5 = -60, i6 = -9, i7 = -10, i8 = -16830, i22 = 5, i23 = -3, i24 = 4, i25 = -31, i26 = 12, iArr[] = new int[N];
        float f1 = -2.517F, f4 = 51.639F, fArr[] = new float[N];
        double d1 = 9.119705;
        boolean b1 = true;
        FuzzerUtils.init(iArr, -9207);
        FuzzerUtils.init(fArr, -28.984F);
        for (int i4 : iArr) {
            for (i5 = 1; i5 < 2; i5++) {
                i4 ^= (iArr[i5]--);
                for (i7 = 1; 2 > i7; i7++) {
                    i3 -= (int) f1;
                    i4 += ((i4++) - iArr[i7 - 1]);
                    l += (((i7 * Test.instanceCount) + l) - i7);
                    i6 = (int) (fArr[i5] + (Test.instanceCount + l));
                    i8 = (iArr[i5 + 1] * (i4--));
                    iArr[i5 + 1] = (int) (--f1);
                    iArr[i7 + 1] = iMeth1((byte) (16), l, d1);
                    d1 += Test.iFld;
                    Test.iFld += i4;
                    Test.iFld <<= (int) 6963035593070309570L;
                    try {
                        i6 = (-1826044698 % Test.iFld);
                        i3 = (i8 / -110);
                        i8 = (i8 / 1662162245);
                    } catch (ArithmeticException a_e) {
                    }
                }
                f1 += (i5 * i5);
                i3 >>= i7;
                Test.lArrFld[i5] >>= i3;
                i4 = (int) l;
            }
            by = (byte) i8;
            Test.instanceCount >>>= i8;
            for (i22 = 1; 2 > i22; i22 += 3) {
                f1 += i22;
                l >>= 4;
                Test.iFld = i8;
                Test.instanceCount = i6;
                iArr[i22] = i7;
                try {
                    i6 = (iArr[i22 - 1] / i5);
                    i8 = (i22 / 131);
                    i8 = (217 / i4);
                } catch (ArithmeticException a_e) {
                }
                i6 = i8;
            }
            for (i24 = 1; 2 > i24; i24++) {
                Test.iFld += (i24 + Test.instanceCount);
                for (f4 = 1; f4 < 2; f4++) {
                    b1 = b1;
                    switch((((i22 >>> 1) % 7) * 5) + 33) {
                        case 51:
                            i8 *= (int) l;
                            i3 = i23;
                            i8 += (int) (((f4 * i8) + l) - i8);
                            break;
                        case 58:
                            l <<= i22;
                        case 39:
                            try {
                                i3 = (iArr[(int) (f4 - 1)] / -4823);
                                i26 = (-17497 % i4);
                                i6 = (i26 / 125);
                            } catch (ArithmeticException a_e) {
                            }
                            break;
                        case 68:
                            f1 -= 33309;
                        case 48:
                            i8 >>>= i4;
                        case 35:
                            if (i25 != 0) {
                            }
                            break;
                        case 42:
                            try {
                                iArr[i24] = (51084 % iArr[i24]);
                                i6 = (iArr[(int) (f4 - 1)] % iArr[i24]);
                                i8 = (227 % i7);
                            } catch (ArithmeticException a_e) {
                            }
                            break;
                    }
                }
            }
        }
        long meth_res = by + i3 + l + i5 + i6 + i7 + i8 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i22 + i23 + i24 + i25 + Float.floatToIntBits(f4) + i26 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static int iMeth(int i2, short s, float f) {
        double d2 = -1.9802;
        int i27 = 0, i28 = -196, i29 = 8488, i30 = -11380, i31 = 1, i32 = 3, i33 = 20, i34 = -17908, iArr2[] = new int[N], iArr3[] = new int[N];
        boolean b2 = false;
        byte by2 = 55;
        FuzzerUtils.init(iArr2, -12);
        FuzzerUtils.init(iArr3, -1);
        f += fMeth((byte) (-28), i2, Test.instanceCount);
        d2 = s;
        for (i27 = 4; i27 < 95; ++i27) {
            Test.iFld = s;
            for (i29 = 1; i29 < 6; ++i29) {
                switch(((i29 % 10) * 5) + 71) {
                    case 108:
                        i30 = 216;
                        f = Test.instanceCount;
                        i28 += (((i29 * f) + i2) - f);
                        switch(((i27 % 8) * 5) + 5) {
                            case 39:
                                i2 >>= (int) Test.instanceCount;
                                iArr2[i29] >>= -14;
                                break;
                            case 17:
                                if (false)
                                    break;
                                switch(((i29 % 6) * 5) + 120) {
                                    case 131:
                                        i30 *= i29;
                                        for (i31 = 2; i31 > 1; i31 -= 2) {
                                            Test.lArrFld[i29] += (long) d2;
                                            s <<= (short) i31;
                                            i32 = i32;
                                            s -= (short) Test.instanceCount;
                                            if (b2)
                                                break;
                                            b2 = b2;
                                        }
                                        Test.instanceCount /= -193;
                                        i30 >>= (int) Test.instanceCount;
                                        i30 += (i29 * i29);
                                        i2 += (i29 * i2);
                                        iArr2[i27] = i31;
                                        i33 = 1;
                                        do {
                                            i30 = i31;
                                            if (b2)
                                                continue;
                                            if (true) {
                                                Test.iFld = i30;
                                                Test.instanceCount &= i28;
                                                i28 = (int) Test.instanceCount;
                                                i28 += (((i33 * Test.instanceCount) + Test.instanceCount) - i33);
                                                Test.iFld += i27;
                                                i30 += (int) -16.30F;
                                            } else {
                                                f += Test.instanceCount;
                                            }
                                        } while (++i33 < 2);
                                        break;
                                    case 141:
                                        iArr2[i27 - 1] -= i30;
                                        break;
                                    case 130:
                                        i2 += (i29 ^ (long) f);
                                        break;
                                    case 137:
                                        Test.instanceCount ^= -8;
                                    case 145:
                                        try {
                                            i30 = (iArr2[i29] / 116);
                                            i28 = (iArr3[i29 + 1] % i29);
                                            Test.iFld = (iArr3[i29] % 227);
                                        } catch (ArithmeticException a_e) {
                                        }
                                    case 147:
                                        i32 += (int) Test.instanceCount;
                                        break;
                                    default:
                                        by2 <<= (byte) s;
                                }
                                break;
                            case 29:
                                iArr3[i27 + 1] = (int) f;
                                break;
                            case 21:
                            case 20:
                                Test.instanceCount = -1093;
                                break;
                            case 37:
                            case 11:
                                iArr3[i29] &= i28;
                                break;
                            case 8:
                                i32 *= (int) d2;
                                break;
                            default:
                                Test.lArrFld[i29 - 1] >>= Test.iFld;
                        }
                    case 115:
                        f += f;
                        break;
                    case 82:
                        Test.iFld = i30;
                        break;
                    case 80:
                        i32 += (i29 + by2);
                        break;
                    case 88:
                        i2 = i28;
                        break;
                    case 120:
                        Test.lArrFld[i29] = Test.instanceCount;
                    case 96:
                        if (i32 != 0) {
                        }
                        break;
                    case 78:
                        Test.lFld *= Test.iFld;
                        break;
                    case 113:
                        i28 <<= s;
                        break;
                    case 92:
                        iArr3[i27 + 1] -= 195;
                        break;
                    default:
                        i34 += (i29 + i32);
                }
            }
        }
        long meth_res = i2 + s + Float.floatToIntBits(f) + Double.doubleToLongBits(d2) + i27 + i28 + i29 + i30 + i31 + i32 + (b2 ? 1 : 0) + i33 + by2 + i34 + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(iArr3);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {
        int i = -14, i1 = 25982, i35 = 0, i36 = -230, i37 = 2, iArr4[] = new int[N];
        float f5 = -116.473F, f6 = -23.14F;
        short s1 = -32069, sArr[][] = new short[N][N];
        double d3 = 67.26597;
        byte by3 = 79;
        FuzzerUtils.init(iArr4, 0);
        FuzzerUtils.init(sArr, (short) -17883);
        i = 247;
        do {
            boolean b3 = true;
            i1 = Math.max(iMeth(i1, (short) (9901), f5), i1);
            Test.instanceCount = s1;
            if (b3)
                continue;
            Test.iFld = (int) f5;
            Test.lFld += (77 + (i * i));
        } while (--i > 0);
        Test.lFld *= i1;
        for (i35 = 2; i35 < 238; i35++) {
            i36 = i;
            for (f6 = 1; f6 < 22; f6++) {
                d3 = 1;
                do {
                    Test.iFld = -2841;
                    Test.iFld = i35;
                    Test.lFld += (long) d3;
                    iArr4[i35 + 1] -= i36;
                    i1 *= Test.iFld;
                    Test.instanceCount = Test.lFld;
                    switch((int) ((f6 % 6) + 59)) {
                        case 59:
                            i1 *= i;
                            if (Test.bFld)
                                break;
                            i36 += i;
                            Test.lFld = -3;
                            i36 = i35;
                            break;
                        case 60:
                            Test.iFld += i36;
                            i1 = i35;
                            break;
                        case 61:
                            i36 = Test.iFld;
                            Test.dArrFld[(int) (f6 + 1)] += -3;
                            Test.iFld += (102 + (d3 * d3));
                            i1 = i;
                            break;
                        case 62:
                            if (Test.bFld)
                                continue;
                            iArr4[(int) (d3 - 1)] >>= i1;
                            Test.instanceCount += i36;
                            Test.lFld = i36;
                            break;
                        case 63:
                            switch(((i1 >>> 1) % 5) + 80) {
                                case 80:
                                    by3 = (byte) i36;
                                    by3 += (byte) d3;
                                    Test.dFld -= Test.iFld;
                                    Test.dFld -= Test.lFld;
                                    iArr4[(int) (d3 - 1)] >>= i35;
                                    i1 -= i;
                                case 81:
                                    s1 += (short) i1;
                                    Test.lArrFld[(int) (d3 + 1)] += 59;
                                    Test.iFld = (int) Test.lFld;
                                    i1 -= 39015;
                                    i36 = s1;
                                    sArr[i35 + 1][i35] = (short) 191;
                                    iArr4[(int) (f6 - 1)] = 4;
                                    i1 <<= i36;
                                    i37 <<= 46805;
                                    i36 += (int) d3;
                                    by3 -= (byte) f6;
                                case 82:
                                    iArr4 = iArr4;
                                    i1 &= i35;
                                    Test.instanceCount += i35;
                                    dFld1 = i35;
                                    Test.lArrFld = Test.lArrFld;
                                    i36 >>>= (int) Test.lFld;
                                    Test.iFld *= (int) Test.lFld;
                                    i37 = (int) 3968617882L;
                                    iArr4[i35 - 1] += (int) d3;
                                    if (Test.bFld) {
                                        i37 = (int) Test.instanceCount;
                                    }
                                    i36 >>= 7391;
                                    break;
                                case 83:
                                    Test.instanceCount -= i1;
                                    if (Test.bFld) {
                                        i37 ^= -11;
                                        iArr4[(int) (f6)] = 63202;
                                        Test.lArrFld[i35] = 50413;
                                        Test.bFld = Test.bFld;
                                        dFld1 -= i35;
                                        Test.lFld += (14L + (d3 * d3));
                                        i37 = (int) 43002L;
                                        Test.iFld *= 25535;
                                        i1 += (int) Test.lFld;
                                        Test.instanceCount = Test.iFld;
                                    } else if (true) {
                                        i1 = i36;
                                    } else {
                                        iArr4[(int) (d3 + 1)] += i37;
                                    }
                                case 84:
                                    Test.instanceCount += i36;
                                    break;
                            }
                            break;
                        case 64:
                            if (Test.bFld)
                                continue;
                            break;
                    }
                } while ((d3 += 3) < 2);
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
                        for (int ax$7 = -4600; ax$7 < 5174; ax$7 += 1) {
                            boolean ax$5 = bFld;
                            try {
                                // We're not inlining throw at the moment.
                                if (bFld) {
                                }
                            } catch (Throwable ax$6) {
                            } finally {
                                bFld = ax$5;
                            }
                        }
                    } catch (Throwable ax$8) {
                    }
                    System.setOut(ax$9);
                    System.setErr(ax$10);
                }
            }
        }
        FuzzerUtils.out.println("i i1 f5 = " + i + "," + i1 + "," + Float.floatToIntBits(f5));
        FuzzerUtils.out.println("s1 i35 i36 = " + s1 + "," + i35 + "," + i36);
        FuzzerUtils.out.println("f6 i37 d3 = " + Float.floatToIntBits(f6) + "," + i37 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("by3 iArr4 sArr = " + by3 + "," + FuzzerUtils.checkSum(iArr4) + "," + FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.lFld = " + Test.instanceCount + "," + Test.iFld + "," + Test.lFld);
        FuzzerUtils.out.println("Test.bFld Test.dFld dFld1 = " + (Test.bFld ? 1 : 0) + "," + Double.doubleToLongBits(Test.dFld) + "," + Double.doubleToLongBits(dFld1));
        FuzzerUtils.out.println("Test.lArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
    }

    private static Boolean ax$12 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  iMeth ->  iMeth mainTest
// DEBUG  fMeth ->  fMeth iMeth mainTest
// DEBUG  iMeth1 ->  iMeth1 fMeth iMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}

