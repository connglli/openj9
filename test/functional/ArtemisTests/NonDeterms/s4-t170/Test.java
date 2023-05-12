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

import java.nio.file.DirectoryIteratorException;
import java.util.HashSet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.util.Set;
import java.io.ObjectOutputStream;

public class Test {

    public static final int N = 256;

    public static long instanceCount = 23722L;

    public static double dFld = -2.74352;

    public static float fFld = -19.969F;

    public static short sFld = 6717;

    public static volatile long lFld = -3373765927L;

    public static int[] iArrFld = new int[N];

    public static long[] lArrFld = new long[N];

    public static float[] fArrFld = new float[N];

    public static boolean[] bArrFld = new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 41370);
        FuzzerUtils.init(Test.lArrFld, 9501L);
        FuzzerUtils.init(Test.fArrFld, -111.460F);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f2, long l1) {
        int i7 = 187, i8 = 9, i9 = -1, i10 = 8, i11 = -9276, i12 = 4, i13 = -13, i14 = 190;
        short s = -30690;
        byte by1 = -122;
        boolean b = true;
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, -6.51604);
        for (i7 = 132; i7 > 8; --i7) {
            s += by1;
            for (i9 = 1; i9 < 5; i9++) {
                if (b)
                    continue;
            }
            f2 += i9;
            if (i8 != 0) {
                vMeth2_check_sum += Float.floatToIntBits(f2) + l1 + i7 + i8 + s + by1 + i9 + i10 + (b ? 1 : 0) + i11 + i12 + i13 + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
            try {
                i10 = (i7 % -8282);
                Test.iArrFld[i7 - 1] = (i9 / i10);
                i10 = (i10 % 35057799);
            } catch (ArithmeticException a_e) {
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
                    for (int ax$4 = -2020; ax$4 < 3995; ax$4 += 1) {
                        try {
                            int ax$2 = 0x7FFFFFC0;
                            java.lang.String[] ax$0 = new String[] { "/bin/cat" };
                            boolean ax$1 = false;
                            if (ax$0.length == 42) {
                                ax$1 = true;
                            } else {
                                ax$2 = 32;
                                ax$1 = false;
                            }
                            if (ax$1) {
                                ax$2 = 12;
                            } else {
                                ax$2 = 54;
                            }
                        } catch (Throwable ax$3) {
                        } finally {
                        }
                    }
                } catch (Throwable ax$5) {
                }
                System.setOut(ax$6);
                System.setErr(ax$7);
            }
            Test.lArrFld[i7] = i9;
            b = b;
            for (i11 = 1; i11 < 5; ++i11) {
                Test.instanceCount *= 58951L;
                by1 = (byte) i8;
                for (i13 = i7; i13 < 2; i13++) {
                    l1 += 150;
                    b = false;
                    switch(((i7 % 2) * 5) + 95) {
                        case 102:
                            f2 = f2;
                            s += (short) (i13 - i8);
                            Test.instanceCount *= i8;
                            switch(((i11 % 1) * 5) + 28) {
                                case 30:
                                    f2 += i13;
                                    Test.fArrFld[i11] = i13;
                                    i12 = i11;
                                    b = b;
                                    Test.dFld += l1;
                                    if (i13 != 0) {
                                        vMeth2_check_sum += Float.floatToIntBits(f2) + l1 + i7 + i8 + s + by1 + i9 + i10 + (b ? 1 : 0) + i11 + i12 + i13 + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                                        return;
                                    }
                                    i14 = (int) l1;
                                    i10 = (int) f2;
                                    l1 += (((i13 * i8) + i7) - i7);
                                    i10 >>= i12;
                            }
                            i8 <<= (int) l1;
                            l1 -= i13;
                            if (b)
                                continue;
                            i8 -= (int) f2;
                            Test.dFld *= l1;
                            by1 = (byte) Test.dFld;
                            break;
                        case 98:
                            i12 += i14;
                        default:
                            Test.iArrFld = Test.iArrFld;
                    }
                }
            }
        }
        vMeth2_check_sum += Float.floatToIntBits(f2) + l1 + i7 + i8 + s + by1 + i9 + i10 + (b ? 1 : 0) + i11 + i12 + i13 + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1() {
        if (ax$9) {
            try {
                int ax$12 = 0x7fff0000;
                java.lang.Object ax$13 = "0.001575281434595963";
                java.lang.Object[] ax$10 = new Object[1000000];
                int ax$11 = 0x10000001;
                if (((Comparable) ax$10[ax$12]).compareTo((Comparable) ax$13) < 0) {
                    ax$13 = ax$10[ax$12];
                    ax$11 = ax$12;
                }
            } catch (Throwable ax$14) {
            } finally {
            }
            return;
        }
        float f1 = 1.495F, f3 = -71.104F, fArr[] = new float[N];
        int i3 = 44257, i4 = 14984, i5 = -23195, i6 = 24386, i15 = 0, i16 = -30032, i17 = 153;
        double d = 72.103818;
        byte by = -65;
        short s1 = -16593;
        long[] lArr1 = new long[N];
        boolean[] bArr = new boolean[N];
        FuzzerUtils.init(lArr1, -131L);
        FuzzerUtils.init(fArr, -71.483F);
        FuzzerUtils.init(bArr, true);
        for (f1 = 3; f1 < 131; ++f1) {
            i4 = 1;
            do {
                d -= ((i3 = (int) lArr1[i4]) + by);
                i3 -= ((9 >> (i4 - i3)) - (++i3));
                for (i5 = (int) (f1); i5 < 1; i5++) {
                    fArr[i4] = ((-(i5 - 0.1019F)) + (Test.instanceCount--));
                    vMeth2(f1, Test.instanceCount);
                    Test.iArrFld = Test.iArrFld;
                    i6 += (-54 + (i5 * i5));
                    Test.instanceCount += i6;
                    f3 += f1;
                    i3 -= (int) Test.dFld;
                    Test.iArrFld[(int) (f1)] += (int) Test.dFld;
                    i6 -= (int) Test.instanceCount;
                    s1 = (short) i5;
                    Test.instanceCount += i15;
                    lArr1[i5 - 1] = Test.instanceCount;
                    i6 += (i5 + by);
                    i6 -= i3;
                    i3 = i3;
                }
                f3 = i5;
                for (i16 = 1; 1 > i16; i16++) {
                    i3 = i5;
                    Test.instanceCount += (long) f3;
                    i6 += i16;
                    bArr = bArr;
                    i6 += 509;
                    i6 = (int) Test.instanceCount;
                    Test.iArrFld[i16] >>>= (int) Test.instanceCount;
                    Test.instanceCount = (long) f1;
                    d -= d;
                    i17 -= (int) Test.instanceCount;
                    i17 += (i16 * i16);
                    i17 = (int) f1;
                }
                Test.iArrFld[i4 + 1] *= i17;
                f3 += Test.instanceCount;
                i15 = i17;
            } while (++i4 < 4);
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i3 + i4 + Double.doubleToLongBits(d) + by + i5 + i6 + Float.floatToIntBits(f3) + s1 + i15 + i16 + i17 + FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(int i, int i1, float f) {
        int i2 = 3070, i18 = 3, i19 = 207, i20 = 46, i21 = -143, i22 = 10, i23 = 9, i24 = -16561;
        long l = 1L, lArr[] = new long[N];
        short s2 = -7632;
        boolean b1 = true;
        byte by2 = 90;
        FuzzerUtils.init(lArr, -180L);
        i1 &= i1;
        lArr[(i1 >>> 1) % N] ^= Math.min(Integer.reverseBytes(i1) - (64 + (5 + (i + i1))), Test.instanceCount);
        i2 = (int) (((i++) * (l = i2)) + Test.instanceCount);
        {
            java.io.PrintStream ax$17 = System.out;
            java.io.PrintStream ax$18 = System.err;
            java.io.PrintStream ax$19 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$19);
            System.setErr(ax$19);
            try {
                ax$9 = true;
                for (int ax$15 = 0; ax$15 < 6063; ax$15 += 1) vMeth1();
            } catch (java.lang.Throwable ax$16) {
            } finally {
                ax$9 = false;
            }
            System.setOut(ax$17);
            System.setErr(ax$18);
        }
        vMeth1();
        i2 = (int) Test.instanceCount;
        Test.bArrFld[(94 >>> 1) % N] = false;
        for (i18 = 190; 10 < i18; i18 -= 2) {
            Test.dFld += f;
            f = i;
            for (i20 = 6; i20 > 1; --i20) {
                i22 = 2;
                while (--i22 > 0) {
                    Test.instanceCount >>>= i1;
                    switch(((i18 % 4) * 5) + 61) {
                        case 65:
                            i = -65;
                            f += Test.instanceCount;
                            break;
                        case 70:
                            Test.iArrFld[i20 - 1] <<= (int) l;
                            break;
                        case 69:
                            l += i1;
                        case 71:
                            s2 <<= (short) l;
                            Test.iArrFld[i22 + 1] >>= (int) -4L;
                            if (b1)
                                break;
                            i = -132;
                            i19 += (i22 + i2);
                            i1 += (((i22 * s2) + f) - l);
                            i1 = i2;
                            Test.instanceCount += Test.instanceCount;
                            i2 += -13;
                            Test.instanceCount *= i20;
                            Test.dFld *= i2;
                            Test.instanceCount = i19;
                            Test.fArrFld[i22] = 0.925F;
                            Test.instanceCount = -106;
                            break;
                    }
                    i21 <<= (int) Test.instanceCount;
                }
                i2 += (((i20 * i19) + i) - i20);
            }
            for (i23 = i18; i23 < 6; ++i23) {
                i24 += (-101 + (i23 * i23));
                by2 = (byte) i20;
                i2 += (((i23 * Test.instanceCount) + f) - Test.instanceCount);
            }
        }
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f) + i2 + l + i18 + i19 + i20 + i21 + i22 + s2 + (b1 ? 1 : 0) + i23 + i24 + by2 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {
        if (ax$20) {
            try {
                // NullPointerException
                try {
                    new DirectoryIteratorException(null);
                } catch (NullPointerException expected) {
                }
            } catch (Throwable ax$24) {
            } finally {
            }
            return;
        }
        int i25 = -23, i26 = -32451, i27 = 10, i28 = 4, i29 = 7, i30 = -219, i31 = 48054, i32 = 51054, i33 = 183, i34 = 10665, i35 = 134, i36 = -2, i37 = -11, i38 = -35283, i39 = -8, i40 = 11, i41 = -14;
        double d2 = -105.105377;
        boolean b2 = true;
        byte by3 = 119;
        float f4 = -91.403F;
        vMeth(i25, -62581, Test.fFld);
        for (i26 = 2; i26 < 128; i26++) {
            Test.iArrFld[i26] = 115;
            Test.fFld = (float) Test.dFld;
            Test.instanceCount = i26;
            Test.iArrFld[i26] = i25;
            switch((i26 % 1) + 81) {
                case 81:
                    Test.iArrFld[i26 - 1] -= 186;
                    for (i28 = i26; i28 < 40; ++i28) {
                        Test.iArrFld[i26 + 1] *= i29;
                        for (d2 = 1; d2 < 1; d2++) {
                            Test.instanceCount = (long) 1.1014F;
                            if (b2)
                                continue;
                            i30 *= i28;
                            i29 += -11;
                        }
                        i30 = (int) Test.instanceCount;
                        for (i31 = 1; i31 < 1; ++i31) {
                            Test.instanceCount += (i31 | i29);
                        }
                        Test.iArrFld[i26] = (int) Test.instanceCount;
                        i25 = (int) Test.instanceCount;
                        i30 += 41;
                        for (i33 = 1; i33 > 1; --i33) {
                            i25 += (i33 + i30);
                            Test.fFld = Test.fFld;
                            by3 -= (byte) Test.fFld;
                            Test.iArrFld[i28 + 1] = i32;
                        }
                        i25 += (((i28 * Test.fFld) + i30) - i33);
                        Test.instanceCount = i26;
                        i27 += i25;
                        Test.iArrFld[i28] = -128;
                    }
                    i30 >>= Test.sFld;
                    Test.iArrFld[i26 - 1] = (int) Test.instanceCount;
                    Test.dFld -= i34;
            }
            Test.iArrFld[i26 - 1] -= (int) d2;
            f4 -= by3;
            Test.fArrFld[i26] = i26;
            i35 = 1;
            do {
                Test.fFld += i35;
                Test.instanceCount += Test.instanceCount;
                i30 += (i35 ^ i33);
                i25 += i29;
                by3 *= (byte) i30;
                for (i36 = 1; i36 < 1; ++i36) {
                    f4 = i36;
                }
                switch(((i26 % 5) * 5) + 19) {
                    case 38:
                        i29 -= i26;
                        break;
                    case 34:
                        i38 = 1;
                        do {
                            Test.instanceCount -= -54;
                            i34 -= (int) Test.dFld;
                            i32 = i30;
                            Test.dFld = Test.instanceCount;
                            if (b2)
                                continue;
                            i27 *= i37;
                            Test.lArrFld[i35 + 1] = Test.instanceCount;
                            if (b2)
                                break;
                            f4 -= i27;
                            Test.fArrFld[i26 + 1] += Test.instanceCount;
                        } while (++i38 < 1);
                        Test.instanceCount += (long) Test.fFld;
                        Test.instanceCount = i35;
                        by3 -= (byte) 8L;
                        for (i39 = 1; i39 < 1; i39++) {
                            Test.instanceCount += (i39 - i40);
                            i34 += (i39 * i39);
                            i25 += i31;
                            i25 *= i33;
                        }
                        Test.instanceCount = i31;
                        switch((i26 % 5) + 104) {
                            case 104:
                                switch(((i26 % 8) * 5) + 52) {
                                    case 78:
                                        i41 = 1;
                                        do {
                                            i37 *= i39;
                                            Test.iArrFld[i35] = (int) Test.instanceCount;
                                            Test.dFld -= i39;
                                            Test.instanceCount = 17567;
                                            i37 += (((i41 * i40) + Test.instanceCount) - i38);
                                            i32 -= i32;
                                        } while (++i41 < 1);
                                        break;
                                    case 81:
                                        try {
                                            i37 = (Test.iArrFld[i26 + 1] / i36);
                                            i40 = (i34 % Test.iArrFld[i35 + 1]);
                                            i30 = (i29 / Test.iArrFld[i35 - 1]);
                                        } catch (ArithmeticException a_e) {
                                        }
                                        break;
                                    case 63:
                                        i25 = by3;
                                        break;
                                    case 72:
                                        Test.sFld *= (short) i37;
                                        break;
                                    case 82:
                                        if (false)
                                            break;
                                        break;
                                    case 90:
                                        Test.iArrFld[i26] += (int) Test.instanceCount;
                                        break;
                                    case 73:
                                    case 91:
                                        Test.instanceCount = 4252030502L;
                                    default:
                                        Test.iArrFld[i26 + 1] = (int) Test.instanceCount;
                                }
                                break;
                            case 105:
                                Test.fFld -= i34;
                                break;
                            case 106:
                                Test.instanceCount += (i35 * i35);
                            case 107:
                                i37 = (int) Test.instanceCount;
                                break;
                            case 108:
                                f4 = i41;
                                break;
                        }
                        break;
                    case 44:
                        i30 *= -2;
                        break;
                    case 26:
                        i37 += (((i35 * Test.lFld) + Test.instanceCount) - i36);
                        break;
                    case 39:
                        i40 = (int) Test.lFld;
                        break;
                }
            } while (++i35 < 40);
        }
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 d2 = " + i28 + "," + i29 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i30 b2 i31 = " + i30 + "," + (b2 ? 1 : 0) + "," + i31);
        FuzzerUtils.out.println("i32 i33 i34 = " + i32 + "," + i33 + "," + i34);
        FuzzerUtils.out.println("by3 f4 i35 = " + by3 + "," + Float.floatToIntBits(f4) + "," + i35);
        FuzzerUtils.out.println("i36 i37 i38 = " + i36 + "," + i37 + "," + i38);
        FuzzerUtils.out.println("i39 i40 i41 = " + i39 + "," + i40 + "," + i41);
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.fFld = " + Test.instanceCount + "," + Double.doubleToLongBits(Test.dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.sFld Test.lFld Test.iArrFld = " + Test.sFld + "," + Test.lFld + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld Test.fArrFld Test.bArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.bArrFld));
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        if (ax$30) {
            try {
                java.util.Set ax$34 = new HashSet();
                java.util.Set ax$31 = new HashSet();
                // Serialize
                ByteArrayOutputStream ax$33 = new ByteArrayOutputStream();
                ObjectOutputStream ax$36 = new ObjectOutputStream(ax$33);
                ax$36.writeObject(ax$34);
                ax$36.flush();
                // Deserialize
                ByteArrayInputStream ax$35 = new ByteArrayInputStream(ax$33.toByteArray());
                ax$36.close();
                ObjectInputStream ax$32 = new ObjectInputStream(ax$35);
                ax$31 = (Set) ax$32.readObject();
                ax$32.close();
            } catch (Throwable ax$37) {
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

    private static Boolean ax$9 = false;

    private static Boolean ax$20 = false;

    private static Boolean ax$30 = false;
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

