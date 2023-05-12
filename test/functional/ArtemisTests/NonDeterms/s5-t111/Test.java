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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.UUID;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 5310937063603392393L;

    public static short sFld = -31149;

    public static float fFld = 0.376F;

    public static volatile boolean bFld = false;

    public static long lFld = -2346352957L;

    public int iFld = -40013;

    public static int iFld1 = 241;

    public static long lArrFld[] = new long[N];

    public double dArrFld[] = new double[N];

    public short sArrFld[][] = new short[N][N];

    public static float fArrFld[] = new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 8430282649770787037L);
        FuzzerUtils.init(Test.fArrFld, -1.716F);
    }

    public static long iMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2) {
        int i3 = 124;
        int i4 = 855;
        int i6 = -2;
        int i7 = -7;
        int i8 = 1;
        int i9 = -13;
        int iArr[] = new int[N];
        boolean b = false;
        double d = 0.123208;
        FuzzerUtils.init(iArr, 241);
        i2 = i2;
        for (i3 = 7; i3 < 131; ++i3) {
            i4 = i2;
            i4 += ((int) (Test.instanceCount));
            Test.instanceCount = 12;
            b = b;
            i2 &= i3;
            iArr[i3] = ((int) (Test.instanceCount));
            for (i6 = 5; 1 < i6; i6 -= 3) {
                i7 >>= ((int) (Test.instanceCount));
                try {
                    i7 = i3 % i3;
                    iArr[i3] = iArr[i3] % (-244);
                    i7 = i6 % i6;
                } catch (ArithmeticException a_e) {
                }
                i8 = 1;
                do {
                    iArr[i6] = i3;
                    i4 += 4 + (i8 * i8);
                    Test.sFld = ((short) (i8));
                    switch (((i8 % 2) * 5) + 95) {
                        case 101 :
                            Test.fFld *= Test.fFld;
                            if (i2 != 0) {
                                vMeth1_check_sum += ((((((((i2 + i3) + i4) + (b ? 1 : 0)) + i6) + i7) + i8) + i9) + Double.doubleToLongBits(d)) + FuzzerUtils.checkSum(iArr);
                                return;
                            }
                            if (b)
                                break;

                            Test.instanceCount >>= i9;
                            break;
                        case 98 :
                            i7 |= i8;
                            Test.fFld += 7 + (i8 * i8);
                            i2 -= -2;
                            d -= i3;
                            i2 += i8;
                            switch (((i8 % 2) * 5) + 81) {
                                case 90 :
                                    i4 = i6;
                                    i9 ^= i4;
                                    i4 += i8 * Test.instanceCount;
                                    Test.fFld *= Test.fFld;
                                    i7 = i4;
                                    i2 -= ((int) (Test.instanceCount));
                                    i4 *= ((int) (Test.fFld));
                                    i2 -= i2;
                                    i7 += ((i8 * i7) + i7) - i7;
                                    i7 *= ((int) (Test.fFld));
                                case 85 :
                                    iArr = iArr;
                                    break;
                                default :
                                    Test.instanceCount <<= Test.sFld;
                            }
                        default :
                            if (i9 != 0) {
                                vMeth1_check_sum += ((((((((i2 + i3) + i4) + (b ? 1 : 0)) + i6) + i7) + i8) + i9) + Double.doubleToLongBits(d)) + FuzzerUtils.checkSum(iArr);
                                return;
                            }
                    }
                } while ((++i8) < 5 );
            }
        }
        vMeth1_check_sum += ((((((((i2 + i3) + i4) + (b ? 1 : 0)) + i6) + i7) + i8) + i9) + Double.doubleToLongBits(d)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(float f) {
        int i10 = 101;
        int i11 = 12;
        int i12 = 13;
        int i13 = 1;
        int i14 = 3;
        int iArr1[][] = new int[N][N];
        byte by = 35;
        long l1 = 10L;
        long lArr[] = new long[N];
        double d1 = 0.39343;
        short sArr[] = new short[N];
        FuzzerUtils.init(iArr1, 52023);
        FuzzerUtils.init(lArr, 58697L);
        FuzzerUtils.init(sArr, ((short) (-2002)));
        vMeth1(i10);
        i10 = i10;
        i10 = i10;
        by >>= ((byte) (Test.instanceCount));
        for (i11 = 8; i11 < 138; i11 += 3) {
            for (l1 = 12; l1 > i11; --l1) {
                Test.instanceCount += l1;
                i12 += i11;
                by >>= ((byte) (i11));
                iArr1[((int) (l1 - 1))][((int) (l1 + 1))] >>>= ((int) (l1));
                i14 = 1;
                while ((++i14) < 1) {
                    switch (((int) (((l1 % 2) * 5) + 67))) {
                        case 73 :
                            i12 = ((int) (l1));
                            by = ((byte) (i12));
                            i13 = ((int) (d1));
                            Test.instanceCount = 238;
                            lArr = lArr;
                            if (i14 != 0) {
                                vMeth_check_sum += ((((((((((Float.floatToIntBits(f) + i10) + by) + i11) + i12) + l1) + i13) + i14) + Double.doubleToLongBits(d1)) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(lArr)) + FuzzerUtils.checkSum(sArr);
                                return;
                            }
                            i10 += ((i14 * Test.instanceCount) + i12) - i10;
                            if (true)
                                break;

                            i12 += i14;
                            break;
                        case 75 :
                            i13 = i10;
                            Test.fFld *= i10;
                            i10 &= i14;
                            Test.bFld = Test.bFld;
                            i12 = ((int) (Test.instanceCount));
                            i13 -= i12;
                            d1 = i11;
                            try {
                                i13 = i11 % i14;
                                i13 = i14 % i14;
                                i13 = (-63) / i11;
                            } catch (ArithmeticException a_e) {
                            }
                            Test.instanceCount -= i12;
                            i10 = i10;
                            lArr[((int) (l1 + 1))] &= i12;
                            break;
                        default :
                            Test.sFld += ((short) (Test.fFld));
                            sArr[i14 - 1] = ((short) (-44378));
                            if (i13 != 0) {
                                vMeth_check_sum += ((((((((((Float.floatToIntBits(f) + i10) + by) + i11) + i12) + l1) + i13) + i14) + Double.doubleToLongBits(d1)) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(lArr)) + FuzzerUtils.checkSum(sArr);
                                return;
                            }
                            Test.instanceCount *= 5;
                            iArr1[((int) (l1 + 1))][((int) (l1))] -= i11;
                    }
                } 
            }
        }
        vMeth_check_sum += ((((((((((Float.floatToIntBits(f) + i10) + by) + i11) + i12) + l1) + i13) + i14) + Double.doubleToLongBits(d1)) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(lArr)) + FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth(int i, int i1, long l) {
        float f1 = 73.347F;
        float fArr[] = new float[N];
        int i15 = -2994;
        int i16 = 4;
        int i17 = -7;
        int i18 = 30994;
        int i19 = -13;
        int iArr2[] = new int[N];
        byte by1 = -4;
        FuzzerUtils.init(iArr2, 3);
        FuzzerUtils.init(fArr, 67.361F);
        i -= --i;
        vMeth(Test.fFld);
        {
            try {
                List ax$2 = null;
                Object ax$4 = new Object();
                ByteArrayInputStream ax$5 = null;
                boolean ax$1 = false;
                for (int ax$0 = -471; ax$0 < (-471 + 16316); ax$0 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if (!ax$2.contains(new UUID(4, 4)));
                    } catch (Throwable ax$3) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    if (!ax$1) {
                        l += ((long) (Test.fFld));
                        ax$1 = true;
                    }
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        try (ObjectInputStream ax$6 = new ObjectInputStream(ax$5)) {
                            ax$4 = ax$6.readObject();
                        }
                    } catch (Throwable ax$7) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
            }
        }
        for (f1 = 2; f1 < 80; ++f1) {
            for (i16 = 1; i16 < 7; ++i16) {
                for (i18 = 1; i18 < 2; i18 += 2) {
                    double d2 = 0.46643;
                    i1 *= i18;
                    d2 *= l;
                    iArr2[((int) (f1))] -= ((int) (d2));
                    i17 = -40448;
                    Test.fFld += ((i18 * l) + i15) - i17;
                    Test.fFld = i19;
                    Test.fFld = i15;
                    switch ((((i19 >>> 1) % 6) * 5) + 93) {
                        case 123 :
                            d2 = -3263554999L;
                            fArr[i16 + 1] /= i19 | 1;
                            i += (-190) + (i18 * i18);
                            i1 += 4;
                            iArr2[i18 + 1] *= -42678;
                            i19 -= i15;
                            i1 += i18;
                            iArr2[((int) (f1))] += 5892;
                            Test.fFld += i18;
                            i15 ^= i16;
                            break;
                        case 122 :
                            i1 &= i16;
                            i17 += i;
                            Test.lFld -= ((long) (f1));
                            i = i;
                            Test.instanceCount += ((long) ((-80.408F) + (i18 * i18)));
                            Test.instanceCount >>= by1;
                            break;
                        case 105 :
                            by1 += ((byte) (i18 | Test.sFld));
                            i1 = i16;
                            break;
                        case 112 :
                            switch ((((i15 >>> 1) % 1) * 5) + 79) {
                                case 81 :
                                    i19 += i18 | Test.instanceCount;
                                    i19 -= i17;
                                    i1 &= 21247;
                                    Test.instanceCount >>= 4;
                                    break;
                                default :
                                    i19 -= ((int) (d2));
                            }
                            break;
                        case 96 :
                        case 116 :
                            Test.lArrFld = Test.lArrFld;
                            break;
                    }
                }
            }
        }
        long meth_res = ((((((((((i + i1) + l) + Float.floatToIntBits(f1)) + i15) + i16) + i17) + i18) + i19) + by1) + FuzzerUtils.checkSum(iArr2)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        int i20 = -89;
        int i21 = 52801;
        int i22 = -231;
        int i23 = -48046;
        int i24 = -128;
        int iArr3[] = new int[N];
        byte by2 = 51;
        double d3 = -10.66698;
        float f2 = 107.682F;
        FuzzerUtils.init(iArr3, 4);
        switch ((((iMeth(iFld, iFld, Test.instanceCount) >>> 1) % 10) * 5) + 70) {
            case 79 :
                iFld = Test.sFld;
                i20 = 1;
                while ((++i20) < 223) {
                    for (i21 = 23; i21 > 1; --i21) {
                        i22 -= ((int) (-18341L));
                        Test.bFld = Test.bFld;
                        iFld = ((int) (Test.instanceCount));
                        Test.lFld += (-222) + (i21 * i21);
                        i22 += (-49232) + (i21 * i21);
                        iArr3[i20 - 1] = by2;
                        i22 *= ((int) (66L));
                        iFld += i21;
                        if (Test.bFld) {
                            for (i23 = 2; i23 > 1; --i23) {
                                long l2 = 10L;
                                dArrFld[i21 + 1] -= -122;
                                Test.instanceCount = Test.lFld;
                                i22 -= ((int) (d3));
                                i22 = ((int) (d3));
                                Test.instanceCount += i23 * i24;
                                Test.instanceCount = i24;
                                i24 <<= 5379;
                                i22 = ((int) (Test.lFld));
                                d3 -= Test.instanceCount;
                                try {
                                    iFld = i22 / (-217);
                                    iFld = i23 / i20;
                                    i22 = iFld / (-32637);
                                } catch (ArithmeticException a_e) {
                                }
                                i24 += 12845 + (i23 * i23);
                                switch (((i20 % 10) * 5) + 109) {
                                    case 150 :
                                        iArr3[i20 + 1] = i24;
                                        iFld = Test.sFld;
                                        if (Test.bFld)
                                            continue;

                                        switch ((i23 % 10) + 22) {
                                            case 22 :
                                                i22 += ((int) (Test.lFld));
                                                iFld -= -1;
                                                switch ((((i20 >>> 1) % 8) * 5) + 86) {
                                                    case 91 :
                                                        Test.fFld = by2;
                                                        Test.lFld = i22;
                                                        if (Test.bFld)
                                                            continue;

                                                        iFld -= i21;
                                                        f2 = i21;
                                                        iFld += ((i23 * Test.fFld) + by2) - iFld;
                                                        Test.bFld = Test.bFld;
                                                        Test.lArrFld[i20 - 1] -= Test.instanceCount;
                                                        iArr3 = iArr3;
                                                        iArr3[i21] = ((int) (Test.lFld));
                                                        Test.lFld += ((long) (-112.5065));
                                                        Test.lFld = iFld;
                                                        iFld = 58441;
                                                        l2 -= i21;
                                                        Test.lFld = i22;
                                                        break;
                                                    case 115 :
                                                        iFld += i21;
                                                        iArr3[i21] |= -111;
                                                        switch ((i21 % 3) + 63) {
                                                            case 63 :
                                                                iFld = i23;
                                                                iFld = ((int) (Test.lFld));
                                                                iFld -= i22;
                                                                switch (((iFld >>> 1) % 9) + 94) {
                                                                    case 94 :
                                                                        i22 += 9;
                                                                        Test.lArrFld[i21] += ((long) (Test.fFld));
                                                                        break;
                                                                    case 95 :
                                                                        Test.lFld *= iFld;
                                                                        Test.instanceCount ^= i20;
                                                                        switch (((i20 % 9) * 5) + 12) {
                                                                            case 52 :
                                                                                Test.sFld = ((short) (i21));
                                                                                sArrFld[i23 + 1][i20 - 1] &= ((short) (i24));
                                                                                i24 -= ((int) (Test.lFld));
                                                                                l2 = -5;
                                                                                i22 *= i22;
                                                                                Test.lArrFld[i20 - 1] = i21;
                                                                                Test.bFld = Test.bFld;
                                                                                by2 = ((byte) (-67.823F));
                                                                                if (Test.bFld) {
                                                                                    i24 = -186;
                                                                                    l2 -= iFld;
                                                                                    switch ((i20 % 1) + 68) {
                                                                                        case 68 :
                                                                                            Test.lArrFld[i20 + 1] = l2;
                                                                                            l2 = i22;
                                                                                            Test.lArrFld[i20 - 1] ^= 1;
                                                                                            break;
                                                                                        default :
                                                                                            i24 += i23 | Test.lFld;
                                                                                    }
                                                                                } else if (Test.bFld) {
                                                                                    if (Test.bFld)
                                                                                        continue;

                                                                                } else if (Test.bFld) {
                                                                                    Test.bFld = false;
                                                                                } else {
                                                                                    i22 = ((int) (-4178455556L));
                                                                                }
                                                                                break;
                                                                            case 18 :
                                                                                Test.sFld *= ((short) (-14));
                                                                                break;
                                                                            case 41 :
                                                                                l2 *= l2;
                                                                            case 32 :
                                                                                dArrFld[i20] = d3;
                                                                            case 16 :
                                                                            case 20 :
                                                                                if (true)
                                                                                    continue;

                                                                                break;
                                                                            case 54 :
                                                                                i24 |= i24;
                                                                            case 35 :
                                                                                l2 += ((i23 * i22) + i21) - f2;
                                                                                break;
                                                                            case 44 :
                                                                                Test.iFld1 >>= i22;
                                                                                break;
                                                                        }
                                                                        break;
                                                                    case 96 :
                                                                        Test.fFld /= Test.lFld | 1;
                                                                    case 97 :
                                                                        i22 += Test.iFld1;
                                                                        break;
                                                                    case 98 :
                                                                        iArr3[i23 + 1] *= -41609;
                                                                    case 99 :
                                                                    case 100 :
                                                                        i24 += ((i23 * i21) + i23) - f2;
                                                                    case 101 :
                                                                        iArr3[i21 + 1] = -14;
                                                                        break;
                                                                    case 102 :
                                                                    default :
                                                                        f2 *= 48841;
                                                                }
                                                                break;
                                                            case 64 :
                                                                Test.bFld = Test.bFld;
                                                                break;
                                                            case 65 :
                                                                by2 = ((byte) (d3));
                                                        }
                                                        break;
                                                    case 93 :
                                                        Test.fFld *= i21;
                                                    case 107 :
                                                        Test.iFld1 = ((int) (-72.1915));
                                                        break;
                                                    case 106 :
                                                        iFld = i22;
                                                        break;
                                                    case 109 :
                                                        d3 = i23;
                                                        break;
                                                    case 119 :
                                                        Test.lArrFld[i20] = i22;
                                                        break;
                                                    case 120 :
                                                        iArr3[i20] += ((int) (2.912F));
                                                        break;
                                                }
                                            case 23 :
                                                l2 <<= Test.iFld1;
                                            case 24 :
                                                i22 -= ((int) (Test.instanceCount));
                                                break;
                                            case 25 :
                                                Test.lArrFld[i21 + 1] -= ((long) (Test.fFld));
                                                break;
                                            case 26 :
                                                i24 -= ((int) (Test.fFld));
                                                break;
                                            case 27 :
                                                l2 += ((long) (f2));
                                                break;
                                            case 28 :
                                                i24 += i23;
                                                break;
                                            case 29 :
                                                Test.iFld1 -= iFld;
                                                break;
                                            case 30 :
                                                iFld += i23 * i21;
                                                break;
                                            case 31 :
                                                Test.iFld1 >>= i24;
                                                break;
                                        }
                                        break;
                                    case 139 :
                                        if (false)
                                            break;

                                        break;
                                    case 152 :
                                        Test.sFld = ((short) (Test.lFld));
                                        break;
                                    case 123 :
                                    case 143 :
                                        Test.fFld *= i22;
                                        break;
                                    case 157 :
                                        iFld = i23;
                                    case 135 :
                                        Test.sFld *= ((short) (Test.iFld1));
                                        break;
                                    case 149 :
                                        l2 += ((i23 * i23) + i21) - Test.lFld;
                                        break;
                                    case 136 :
                                        Test.lFld -= i22;
                                    case 115 :
                                        i22 = ((int) (Test.instanceCount));
                                        break;
                                    default :
                                        l2 += i23 - Test.fFld;
                                }
                            }
                        }
                    }
                } 
                break;
            case 106 :
                Test.fArrFld[(i22 >>> 1) % N] -= -2;
                break;
            case 78 :
                i24 *= Test.iFld1;
                break;
            case 94 :
                Test.iFld1 += Test.iFld1;
                break;
            case 83 :
                Test.lArrFld[(125 >>> 1) % N] = Test.instanceCount;
            case 114 :
                iArr3[(i20 >>> 1) % N] -= i23;
                break;
            case 89 :
                iFld >>= Test.sFld;
                break;
            case 112 :
                Test.bFld = Test.bFld;
            case 102 :
                Test.iFld1 -= i20;
                break;
            case 86 :
                Test.instanceCount *= i22;
                break;
            default :
        }
        FuzzerUtils.out.println((((("i20 i21 i22 = " + i20) + ",") + i21) + ",") + i22);
        FuzzerUtils.out.println((((("by2 i23 i24 = " + by2) + ",") + i23) + ",") + i24);
        FuzzerUtils.out.println((((("d3 f2 iArr3 = " + Double.doubleToLongBits(d3)) + ",") + Float.floatToIntBits(f2)) + ",") + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println((((("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount) + ",") + Test.sFld) + ",") + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println((((("Test.bFld Test.lFld iFld = " + (Test.bFld ? 1 : 0)) + ",") + Test.lFld) + ",") + iFld);
        FuzzerUtils.out.println((((("Test.iFld1 Test.lArrFld dArrFld = " + Test.iFld1) + ",") + FuzzerUtils.checkSum(Test.lArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println((("sArrFld Test.fArrFld = " + FuzzerUtils.checkSum(sArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
                    Object[] ax$9 = new Object[100000];
                    for (int ax$8 = -126; ax$8 < (-126 + 8169); ax$8 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            ax$9[0] = ax$9[1];
                        } catch (Throwable ax$10) {
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
}