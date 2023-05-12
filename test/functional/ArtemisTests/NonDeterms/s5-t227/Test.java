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

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 1L;

    public static float fFld = -2.853F;

    public static short sFld = 20958;

    public static double dFld = -69.115618;

    public int iFld = 172;

    public static volatile short sArrFld[] = new short[N];

    public static long lArrFld[] = new long[N];

    public static byte byArrFld[] = new byte[N];

    static {
        FuzzerUtils.init(Test.sArrFld, ((short) (28405)));
        FuzzerUtils.init(Test.lArrFld, -122L);
        FuzzerUtils.init(Test.byArrFld, ((byte) (-8)));
    }

    public static long vMeth_check_sum = 0;

    public static long byMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {
        int i3 = 18650;
        int i4 = -55;
        int i5 = -16;
        int i6 = 4;
        int i7 = 97;
        int i8 = -13738;
        int i9 = -39452;
        int i10 = -81;
        int iArr2[] = new int[N];
        double d = 82.6945;
        short sArr[] = new short[N];
        FuzzerUtils.init(iArr2, -97);
        FuzzerUtils.init(sArr, ((short) (31360)));
        iArr2 = iArr2;
        for (i3 = 3; i3 < 82; ++i3) {
            byte by = -34;
            i4 *= i3;
            by &= ((byte) (i3));
            iArr2[i3] = i4;
            for (i5 = 1; i5 < 7; i5 += 3) {
                i6 += 148 + (i5 * i5);
                i6 = i7;
                try {
                    i7 = i6 / 26145;
                    i6 = i4 / i7;
                    iArr2[i5] = i6 % i3;
                } catch (ArithmeticException a_e) {
                }
                i7 ^= ((int) (Test.instanceCount));
                for (i8 = 1; 4 > i8; ++i8) {
                    iArr2[i5 + 1] -= i5;
                    i9 <<= i9;
                    i9 = i4;
                    Test.instanceCount /= ((long) (Test.fFld)) | 1;
                    Test.instanceCount = i5;
                    sArr[i8 + 1] = ((short) (i8));
                    Test.fFld += i8 * i8;
                    Test.instanceCount *= i8;
                }
                i10 = 1;
                while ((++i10) < 4) {
                    i6 += i10 * i10;
                    Test.fFld += Test.instanceCount;
                    by += ((byte) (i10));
                    i4 += ((int) (Test.instanceCount));
                    Test.fFld = ((float) (d));
                    i7 += (-8484) + (i10 * i10);
                    i7 *= i10;
                    iArr2[i3] &= i6;
                    Test.fFld -= i9;
                    Test.sFld += ((short) (((i10 * i7) + i6) - i6));
                } 
                i9 *= i8;
                i4 *= i10;
                d = -2852;
            }
            switch (((i3 % 4) * 5) + 106) {
                case 113 :
                case 120 :
                    Test.instanceCount += i9;
                    i4 += ((int) (Test.instanceCount));
                    Test.instanceCount <<= i6;
                case 118 :
                    by = ((byte) (23));
                    break;
                case 107 :
                    Test.instanceCount += i3;
                    break;
                default :
                    i6 -= ((int) (Test.fFld));
            }
        }
        vMeth1_check_sum += (((((((((i3 + i4) + i5) + i6) + i7) + i8) + i9) + i10) + Double.doubleToLongBits(d)) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(sArr);
    }

    public static byte byMeth() {
        if (Test.ax$0) {
            int ax$1 = -876862162;
            char[] ax$2 = new char[100];
            char ax$3 = 'y';
            char[] ax$4 = new char[]{ '渙' };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                ax$3 += Math.abs(ax$2[ax$1] - ax$4[ax$1]);
            } catch (Throwable ax$5) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return ((byte) (-14));
        }
        int i2 = -1;
        int i13 = -28104;
        int i14 = 24350;
        int i15 = 2;
        int iArr1[] = new int[N];
        int iArr3[] = new int[N];
        double d1 = 102.6947;
        double d2 = -81.67233;
        long l = -44473L;
        boolean b = true;
        byte by1 = -77;
        FuzzerUtils.init(iArr1, 4);
        FuzzerUtils.init(iArr3, -9893);
        iArr1[(i2 >>> 1) % N] = ((int) (-47718L));
        vMeth1();
        iArr1[(i2 >>> 1) % N] -= i2;
        i2 <<= ((int) (Test.instanceCount));
        for (int i11 : iArr1) {
            iArr1[(i11 >>> 1) % N] = i2;
            Test.sArrFld = Test.sArrFld;
            i11 >>= i11;
            i2 *= i11;
        }
        iArr1[(i2 >>> 1) % N] &= ((int) (Test.instanceCount));
        for (int i12 : iArr1) {
            d1 += Test.fFld;
            i12 *= ((int) (-1633712551L));
            if (i12 != 0) {
            }
            iArr1[(i2 >>> 1) % N] += ((int) (-42L));
            if (true) {
                i2 -= i2;
                for (l = 1; l < 2; ++l) {
                    Test.instanceCount += l ^ i12;
                    for (i14 = 1; i14 < 2; i14++) {
                        switch ((((-9995) >>> 1) % 7) + 124) {
                            case 124 :
                                i15 = ((int) (Test.instanceCount));
                                i12 = ((int) (Test.instanceCount));
                                iArr3[i14] -= i13;
                                i15 |= 11494;
                                i13 |= i14;
                                if (b)
                                    break;

                                i15 -= ((int) (d1));
                                iArr1[((int) (l))] /= ((int) (125.72589));
                                i13 += i14;
                            case 125 :
                                Test.instanceCount >>= 233;
                                break;
                            case 126 :
                                Test.instanceCount += 123;
                                iArr3[((int) (l + 1))] = i2;
                                iArr3[((int) (l))] += 60660;
                            case 127 :
                                by1 &= ((byte) (Test.sFld));
                                Test.instanceCount = i15;
                                Test.fFld *= 2;
                                break;
                            case 128 :
                                d2 *= i12;
                            case 129 :
                                by1 = ((byte) (-6894397852622280739L));
                                break;
                            case 130 :
                                i12 += i14;
                            default :
                                by1 = ((byte) (l));
                        }
                    }
                }
            } else if (b) {
                i12 <<= i15;
            } else {
                iArr1[(i15 >>> 1) % N] = ((int) (Test.fFld));
            }
        }
        long meth_res = (((((((((i2 + Double.doubleToLongBits(d1)) + l) + i13) + i14) + i15) + (b ? 1 : 0)) + by1) + Double.doubleToLongBits(d2)) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(iArr3);
        byMeth_check_sum += meth_res;
        return ((byte) (meth_res));
    }

    public static void vMeth(int i) {
        if (Test.ax$35) {
            final int ax$40 = i;
            int[] ax$37 = new int[]{ 10, 20, 45, 38, 88 };
            int[] ax$38 = new int[]{ 864834813, -187904737, -2143669859, 176769190, 1701023759 };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                if ((i % 2) == 0) {
                    ax$38 = ax$37;
                }
            } catch (Throwable ax$39) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            i = ax$40;
            return;
        }
        int i1 = -23299;
        int i16 = 10;
        int i17 = 184;
        int i18 = 13;
        int i19 = -48;
        int i20 = 13622;
        int i21 = 13;
        int i22 = 57843;
        int i23 = -12;
        int i24 = 214;
        int iArr[][] = new int[N][N];
        boolean b1 = true;
        byte by2 = 8;
        float fArr[] = new float[N];
        double dArr[] = new double[N];
        FuzzerUtils.init(fArr, -2.425F);
        FuzzerUtils.init(iArr, 1);
        FuzzerUtils.init(dArr, 30.24002);
        i = i;
        fArr[(i >>> 1) % N] *= Test.fFld *= Test.fFld;
        Test.fFld *= Long.reverseBytes(Test.instanceCount * i) << iArr[((-14206) >>> 1) % N][(i >>> 1) % N];
        if (b1) {
            i1 = 1;
            do {
                i *= ++i;
                {
                    final int ax$19 = i18;
                    final int ax$20 = i;
                    try {
                        int[] ax$7 = new int[]{ 2, 5, 9, -1, -3, 10, 8, 4 };
                        float[] ax$8 = new float[]{ 0.24639362F, 0.966769F, 0.558533F, 0.6988929F, 0.6703361F, 0.58745474F };
                        char[] ax$12 = new char[]{ ((char) (0xf3f4)) };
                        char[] ax$14 = new char[]{ '', '?', '㠤', '', '턊', '현', '䝰', '', '斾' };
                        for (int ax$6 = -272; ax$6 < (-272 + 19688); ax$6 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$9 = 0; ax$9 < ax$7.length; ax$9++) {
                                    ax$7[ax$9] = ((int) (ax$8[20])) - 2;
                                }
                            } catch (Throwable ax$10) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            Test.ax$0 = true;
                            byMeth();
                            Test.ax$0 = false;
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                for (int ax$15 = 0; ax$15 < i18; ax$15++) {
                                    char ax$16 = ax$12[ax$15];
                                    char ax$17 = ax$14[ax$15];
                                    i += (ax$16 >= ax$17) ? ax$16 - ax$17 : ax$17 - ax$16;
                                }
                            } catch (Throwable ax$18) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        i18 = ax$19;
                        i = ax$20;
                    }
                }
                i <<= byMeth();
                for (i16 = 3; i16 > 1; i16--) {
                    Test.instanceCount += i16;
                    for (i18 = 1; i18 < 2; ++i18) {
                        Test.lArrFld[i1 + 1] += i16;
                        i -= 123;
                        dArr = dArr;
                        fArr[i1] -= 64871;
                        i17 += i18;
                    }
                    Test.fFld += i16 * i18;
                    if (i1 != 0) {
                        vMeth_check_sum += ((((((((((((((i + i1) + i16) + i17) + i18) + i19) + (b1 ? 1 : 0)) + i20) + i21) + i22) + by2) + i23) + i24) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + FuzzerUtils.checkSum(iArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                        return;
                    }
                    iArr[i1 + 1][i16 + 1] >>>= i17;
                    i -= i17;
                }
                dArr[i1] -= Test.instanceCount;
                if (b1)
                    continue;

                i20 = 1;
                while ((++i20) < 3) {
                    for (i21 = i1; i21 < 1; i21++) {
                        Test.fFld += i;
                    }
                    Test.dFld -= -33.654F;
                    i17 *= i22;
                    iArr[i20][i1] = i22;
                    by2 |= ((byte) (i21));
                    i19 -= ((int) (Test.instanceCount));
                    Test.instanceCount += Test.instanceCount;
                } 
                i19 -= i16;
                i19 += ((int) (Test.fFld));
                i19 >>= i17;
                for (i23 = 3; i23 > 1; --i23) {
                    i19 -= i19;
                    iArr[i1][i1] >>= ((int) (Test.instanceCount));
                    Test.instanceCount += i18;
                }
            } while ((++i1) < 226 );
        } else if (b1) {
            i24 -= ((int) (Test.instanceCount));
        } else {
            i24 ^= i21;
            vMeth_check_sum += ((((((((((((((i + i1) + i16) + i17) + i18) + i19) + (b1 ? 1 : 0)) + i20) + i21) + i22) + by2) + i23) + i24) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + FuzzerUtils.checkSum(iArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
            return;
        }
        vMeth_check_sum += ((((((((((((((i + i1) + i16) + i17) + i18) + i19) + (b1 ? 1 : 0)) + i20) + i21) + i22) + by2) + i23) + i24) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + FuzzerUtils.checkSum(iArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {
        if (Test.ax$25) {
            final int ax$29 = this.iFld;
            int[] ax$26 = new int[]{ -1901142745, -387593707, -1866817323, -323890990, 1209578243, -531081022, -424191260 };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                ax$26[iFld] += -219;
            } catch (Throwable ax$28) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            this.iFld = ax$29;
            return;
        }
        byte by3 = -84;
        int i25 = -11223;
        int i26 = 162;
        int i27 = -21851;
        int i28 = -9;
        int i29 = -2;
        int i30 = -8;
        int i31 = 223;
        int iArr4[] = new int[N];
        long l2 = 6L;
        boolean b2 = true;
        float f = -1.559F;
        FuzzerUtils.init(iArr4, -12);
        {
            final int ax$49 = i28;
            try {
                Random ax$42 = new Random();
                for (int ax$41 = -694; ax$41 < (-694 + 14796); ax$41 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$43 = 0; ax$43 < 100; ax$43++) {
                            double ax$44 = ax$42.nextDouble();
                            Double ax$45 = new Double(ax$44);
                            if (!ax$45.toString().equals(Double.toString(ax$44)));
                        }
                    } catch (Throwable ax$46) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$35 = true;
                    vMeth(1582431);
                    Test.ax$35 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        i28 = 1;
                    } catch (Throwable ax$48) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                i28 = ax$49;
            }
        }
        vMeth(iFld);
        iFld -= 3;
        Test.instanceCount *= iFld;
        iFld >>= -4539;
        iFld = by3;
        Test.instanceCount += iFld;
        for (i25 = 228; i25 > 1; --i25) {
            iFld += 162 + (i25 * i25);
            for (l2 = 1; l2 < 23; ++l2) {
                iFld <<= i25;
                i26 = i26;
                i27 += ((int) (((l2 * Test.fFld) + i26) - i25));
                i27 *= ((int) (-35242L));
                if (b2) {
                    i26 = iFld;
                    Test.instanceCount = iFld;
                    Test.instanceCount += ((long) (Test.fFld));
                    if (b2)
                        continue;

                    for (i28 = 1; i28 < 2; ++i28) {
                        Test.fFld -= -236;
                        Test.fFld += Test.fFld;
                        Test.instanceCount *= i25;
                        Test.fFld += (-42152) + (i28 * i28);
                        Test.instanceCount += i25;
                        i29 = 184;
                        i29 += i28;
                        by3 = ((byte) (Test.instanceCount));
                        iFld >>>= ((int) (l2));
                    }
                    Test.instanceCount += ((l2 * i28) + Test.instanceCount) - i28;
                    b2 = b2;
                    Test.sArrFld[i25] += ((short) (118.541F));
                    Test.instanceCount -= i27;
                } else {
                    by3 *= ((byte) (i26));
                    for (i30 = ((int) (l2)); i30 < 2; ++i30) {
                        iArr4[((int) (l2))] -= i29;
                        Test.dFld += i30;
                        iArr4[((int) (l2))] <<= i30;
                        iArr4[((int) (l2 - 1))] *= i28;
                        if (b2)
                            break;

                        i31 = i29;
                        switch ((((-41739) >>> 1) % 2) + 44) {
                            case 44 :
                                Test.lArrFld[i25] = i25;
                                Test.instanceCount += i30 - by3;
                                i29 >>= ((int) (Test.instanceCount));
                                i26 -= 7;
                                i29 = i26;
                                b2 = b2;
                                Test.instanceCount += i25;
                                Test.instanceCount = ((long) (Test.dFld));
                                iFld += i30 ^ ((long) (Test.fFld));
                                iArr4[i30 + 1] >>= Test.sFld;
                                Test.fFld *= i31;
                                Test.lArrFld[i25] -= ((long) (f));
                                break;
                            case 45 :
                                i31 >>>= 66;
                                i29 += i30 + iFld;
                                i26 %= ((int) (iFld | 1));
                                i29 <<= iFld;
                                switch ((i25 % 2) + 58) {
                                    case 58 :
                                        switch ((((i27 >>> 1) % 8) * 5) + 115) {
                                            case 138 :
                                                by3 += ((byte) (((i30 * i26) + i26) - i25));
                                                Test.instanceCount += ((long) (Test.fFld));
                                                f -= i30;
                                                try {
                                                    i29 = i26 / 15973;
                                                    i31 = 57304 % iArr4[i25];
                                                    i29 = i31 / i29;
                                                } catch (ArithmeticException a_e) {
                                                }
                                                Test.instanceCount += i30 * Test.instanceCount;
                                                iArr4[((int) (l2 + 1))] >>= -208;
                                                iArr4[i25 - 1] += iFld;
                                                Test.byArrFld[i30] = ((byte) (i30));
                                                if (b2) {
                                                    i26 >>= i27;
                                                    iArr4[i30] = ((int) (Test.instanceCount));
                                                    i26 = 225;
                                                    Test.instanceCount = i31;
                                                }
                                                iArr4[i25 + 1] *= ((int) (Test.dFld));
                                            case 142 :
                                                iFld = i28;
                                                iFld *= 60560;
                                            case 130 :
                                                i31 += ((int) (l2));
                                            case 126 :
                                                Test.fFld += i30;
                                                break;
                                            case 121 :
                                            case 135 :
                                                Test.lArrFld[i30] *= Test.instanceCount;
                                                break;
                                            case 127 :
                                                Test.lArrFld[((int) (l2 - 1))] = l2;
                                                break;
                                            case 145 :
                                                Test.fFld += i30 * i30;
                                                break;
                                            default :
                                                b2 = false;
                                        }
                                        break;
                                    case 59 :
                                        i31 = i30;
                                        break;
                                }
                                break;
                        }
                    }
                }
            }
        }
        FuzzerUtils.out.println((((("by3 i25 i26 = " + by3) + ",") + i25) + ",") + i26);
        FuzzerUtils.out.println((((("l2 i27 b2 = " + l2) + ",") + i27) + ",") + (b2 ? 1 : 0));
        FuzzerUtils.out.println((((("i28 i29 i30 = " + i28) + ",") + i29) + ",") + i30);
        FuzzerUtils.out.println((((("i31 f iArr4 = " + i31) + ",") + Float.floatToIntBits(f)) + ",") + FuzzerUtils.checkSum(iArr4));
        FuzzerUtils.out.println((((("Test.instanceCount Test.fFld Test.sFld = " + Test.instanceCount) + ",") + Float.floatToIntBits(Test.fFld)) + ",") + Test.sFld);
        FuzzerUtils.out.println((((("Test.dFld iFld Test.sArrFld = " + Double.doubleToLongBits(Test.dFld)) + ",") + iFld) + ",") + FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println((("Test.lArrFld Test.byArrFld = " + FuzzerUtils.checkSum(Test.lArrFld)) + ",") + FuzzerUtils.checkSum(Test.byArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            {
                try {
                    AtomicIntegerArray ax$22 = null;
                    int ax$23 = 12;
                    for (int ax$21 = -876; ax$21 < (-876 + 4645); ax$21 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            ax$22.set(ax$23, ax$23);
                        } catch (Throwable ax$24) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                    }
                } finally {
                }
            }
            Test _instance = new Test();
            for (int i = 0; i < 10; i++) {
                {
                    final short ax$34 = Test.sFld;
                    try {
                        for (int ax$30 = -227; ax$30 < (-227 + 12691); ax$30 += 1) {
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                sFld = 0;
                            } catch (Throwable ax$32) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                            Test.ax$25 = true;
                            _instance.mainTest(new String[]{ "s", "s", "s", "s" });
                            Test.ax$25 = false;
                            Test.AxOutputRedirectionHelper.redirect();
                            try {
                                Runtime.getRuntime().exec(new String());
                            } catch (Throwable ax$33) {
                            } finally {
                            }
                            Test.AxOutputRedirectionHelper.recover();
                        }
                    } finally {
                        Test.sFld = ax$34;
                    }
                }
                _instance.mainTest(strArr);
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

    static Boolean ax$25 = false;

    static Boolean ax$35 = false;
}