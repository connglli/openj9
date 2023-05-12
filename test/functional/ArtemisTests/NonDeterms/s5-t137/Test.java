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
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipOutputStream;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 1806229801L;

    public static double dFld = 0.90049;

    public static boolean bFld = false;

    public static volatile byte byFld = -27;

    public static float fFld = -2.225F;

    public volatile int iFld = -16248;

    public static short sFld = 12242;

    public static float fArrFld[] = new float[N];

    public static int iArrFld[][] = new int[N][N];

    public static boolean bArrFld[] = new boolean[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -94.869F);
        FuzzerUtils.init(Test.iArrFld, -12);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1) {
        int i2 = 16626;
        int i3 = 18823;
        int i4 = 9;
        int i5 = -64270;
        int i6 = 50212;
        int i7 = 2;
        int i8 = 5;
        float f = 1.969F;
        short s = -5848;
        i2 *= ((int) (78L));
        for (i3 = 6; i3 < 120; ++i3) {
            i4 += ((i3 * i3) + i2) - i4;
            Test.dFld *= -9L;
            i2 = i2;
            if (Test.bFld)
                break;

            Test.instanceCount = Test.byFld;
            f += i3;
            for (i5 = 1; i5 < 5; ++i5) {
                Test.bFld = Test.bFld;
                i4 = i2;
                i6 >>= 1532;
                i2 += i5 * i5;
                for (i7 = 2; i7 > i5; i7 -= 3) {
                    float f1 = -1.273F;
                    i2 -= 122;
                    i6 = i4;
                    Test.instanceCount += i5;
                    i4 += ((int) (f));
                    if (i8 != 0) {
                        vMeth2_check_sum += ((((((((l1 + i2) + i3) + i4) + Float.floatToIntBits(f)) + i5) + i6) + i7) + i8) + s;
                        return;
                    }
                    i8 *= 13;
                    Test.instanceCount += i2;
                    i2 += i2;
                    Test.bFld = true;
                    i2 = ((int) (Test.instanceCount));
                    i4 += ((i7 * f1) + i4) - Test.instanceCount;
                    i2 += i7;
                    i4 += i7 * i7;
                }
                i4 *= i6;
                if (i2 != 0) {
                    vMeth2_check_sum += ((((((((l1 + i2) + i3) + i4) + Float.floatToIntBits(f)) + i5) + i6) + i7) + i8) + s;
                    return;
                }
                i2 = s;
                l1 -= i7;
                i6 += Test.byFld;
                s += ((short) (l1));
            }
            i8 += ((i3 * Test.instanceCount) + i5) - i6;
            {
                final int ax$31 = i5;
                final int ax$32 = i7;
                try {
                    long[] ax$24 = new long[]{ -165825065132154369L, 9141828717962496124L, 7873215585183807565L, 7149792047374639004L, -1548474201951433399L };
                    byte[] ax$27 = new byte[10];
                    ZipOutputStream ax$29 = null;
                    boolean ax$22 = false;
                    for (int ax$21 = -121; ax$21 < (-121 + 19475); ax$21 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            for (int ax$25 = 0; ax$25 < i7; ax$25++) {
                                ax$24[ax$25] = ((long) (ax$25));
                            }
                        } catch (Throwable ax$26) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                        if (!ax$22) {
                            i4 += 69 + (i3 * i3);
                            ax$22 = true;
                        }
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            ax$29.write(ax$27, 0, i5);
                        } catch (Throwable ax$30) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                    }
                } finally {
                    i5 = ax$31;
                    i7 = ax$32;
                }
            }
            i4 += i3 + i3;
            i8 = i5;
        }
        vMeth2_check_sum += ((((((((l1 + i2) + i3) + i4) + Float.floatToIntBits(f)) + i5) + i6) + i7) + i8) + s;
    }

    public static void vMeth1(double d, double d1, long l) {
        if (Test.ax$5) {
            int[] ax$6 = new int[]{ 2084623062, 1854665364, -145748696 };
            int ax$7 = 0x18000;
            int ax$8 = 0x40000000;
            int[] ax$9 = new int[]{ -1697731206, 2128769274, -1396341722, 664875083 };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                ax$9[ax$7] = ((int) (ax$6[ax$7] >>> (-ax$8)));
            } catch (Throwable ax$10) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        int i1 = -59655;
        int i10 = -12;
        int i11 = 11;
        int i12 = 5;
        int i13 = 72;
        int i14 = -53;
        int iArr[] = new int[N];
        float f2 = -55.849F;
        float f3 = -57.934F;
        short s1 = -21838;
        long lArr[] = new long[N];
        FuzzerUtils.init(iArr, -52582);
        FuzzerUtils.init(lArr, -35985L);
        i1 *= i1 - (i1++);
        vMeth2(62L);
        try {
            d1 = Test.instanceCount;
            i1 = ((int) (f2));
            for (int i9 : iArr) {
                Test.byFld = ((byte) (l));
                Test.instanceCount >>= i9;
                i10 = 1;
                while ((++i10) < 2) {
                    i9 += ((i10 * l) + i1) - Test.instanceCount;
                    f2 -= f2;
                    i1 %= ((int) (i9 | 1));
                    for (i11 = 1; 1 > i11; i11++) {
                        Test.instanceCount += ((i11 * i11) + i9) - f3;
                        lArr[i11] -= i12;
                        Test.instanceCount -= i10;
                        f3 = i1;
                        i1 += ((int) (f2));
                        i9 = -101;
                        i9 = s1;
                    }
                    i9 <<= i12;
                    for (i13 = 1 - 256; i13 < 1; i13++) {
                        iArr[i10 + 1] >>= i10;
                        i14 += i14;
                        i14 += i11;
                        i1 += ((int) (l));
                        i12 += i13;
                        if (Test.bFld)
                            continue;

                        i14 = i14;
                        i12 += i13;
                        i14 <<= ((int) (-8388L));
                        l = i11;
                        d1 += l;
                        i9 = -19556;
                        f3 -= ((float) (Test.dFld));
                        i1 += ((i13 * s1) + s1) - i14;
                    }
                    i1 = ((int) (l));
                } 
            }
        } catch (ArrayIndexOutOfBoundsException exc1) {
            iArr[(i1 >>> 1) % N] = i13;
        } finally {
            f2 += i11;
        }
        vMeth1_check_sum += ((((((((((((Double.doubleToLongBits(d) + Double.doubleToLongBits(d1)) + l) + i1) + Float.floatToIntBits(f2)) + i10) + i11) + i12) + Float.floatToIntBits(f3)) + s1) + i13) + i14) + FuzzerUtils.checkSum(iArr)) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth() {
        int i = -35309;
        int i15 = 117;
        int i16 = 227;
        int i17 = -12;
        int i18 = -10;
        int i19 = 12;
        int i20 = 38036;
        int i21 = 168;
        int i22 = 55;
        int i23 = -54972;
        int iArr1[] = new int[N];
        short s2 = 24088;
        long l2 = -4024972609213147356L;
        long lArr1[] = new long[N];
        float f4 = -2.84F;
        float fArr[][] = new float[N][N];
        FuzzerUtils.init(iArr1, 6);
        FuzzerUtils.init(lArr1, 0L);
        FuzzerUtils.init(fArr, 119.173F);
        i = ((int) ((-(i - (-53818))) - (i |= ((int) (i - Test.dFld)))));
        i *= ++i;
        {
            final int ax$20 = i18;
            try {
                AtomicReference<Long> ax$12 = new AtomicReference<Long>();
                int[] ax$15 = new int[]{ -789559843, 1722848624, -647495922, -1315338202, 8987581, 1651139192, -1170201992, -159027639, 1720895431 };
                int[] ax$16 = new int[20];
                int[] ax$17 = new int[]{ 1, 2, 3, 4 };
                for (int ax$11 = -581; ax$11 < (-581 + 7444); ax$11 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        ax$12.lazySet(9L);
                    } catch (Throwable ax$13) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$5 = true;
                    vMeth1(0.5508613060364264, 0.3164303290035291, -1029524407711732719L);
                    Test.ax$5 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$18 = 0; ax$18 < Math.min(Math.min(ax$15.length, ax$16.length), ax$17.length); ax$18++) {
                            i18 += (ax$15[ax$18] + ax$16[ax$18]) + ax$17[ax$18];
                        }
                    } catch (Throwable ax$19) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                i18 = ax$20;
            }
        }
        vMeth1(Test.dFld, Test.dFld, Test.instanceCount);
        i15 = 1;
        while ((++i15) < 149) {
            for (i16 = 1; i16 < 4; ++i16) {
                i += i16;
                i17 = i16;
                iArr1[i15 - 1] = ((int) (Test.instanceCount));
                for (i18 = 1; 2 > i18; i18 += 2) {
                    i -= ((int) (Test.dFld));
                    {
                        try {
                            WeakReference[] ax$1 = new WeakReference[]{ null, null, null };
                            Object ax$2 = new Object();
                            for (int ax$0 = -396; ax$0 < (-396 + 2263); ax$0 += 1) {
                                Test.AxOutputRedirectionHelper.redirect();
                                try {
                                    for (int ax$3 = 0; ax$3 < ax$1.length; ++ax$3) {
                                        ax$1[ax$3] = new WeakReference(ax$2);
                                    }
                                } catch (Throwable ax$4) {
                                } finally {
                                }
                                Test.AxOutputRedirectionHelper.recover();
                            }
                        } finally {
                        }
                    }
                    s2 = ((short) (50543));
                    if (Test.bFld)
                        break;

                    lArr1[i18 - 1] -= i17;
                    i19 &= i17;
                    s2 += ((short) (i18));
                    iArr1[i15] += i20;
                    i20 *= ((int) (Test.dFld));
                    Test.instanceCount = 4273751757069232108L;
                    i += 8;
                    Test.fFld = 85;
                    Test.bFld = Test.bFld;
                    i += i18;
                    i += i18 + i19;
                    Test.instanceCount = 4;
                }
                for (l2 = i16; l2 < 2; ++l2) {
                    i21 = ((int) (l2));
                    iArr1[i16] -= i17;
                }
                i21 = i21;
                for (f4 = i16; f4 < 2; f4++) {
                    fArr[i16 - 1][i16 - 1] -= i23;
                    i19 <<= i;
                    i21 = 13;
                    Test.instanceCount = i17;
                    Test.instanceCount += ((long) (f4));
                    if (true) {
                        i21 += ((int) (((long) (f4)) | Test.instanceCount));
                        Test.fFld -= i17;
                    } else {
                        iArr1[i16 + 1] -= ((int) (Test.dFld));
                    }
                }
            }
        } 
        vMeth_check_sum += ((((((((((((((i + i15) + i16) + i17) + i18) + i19) + s2) + i20) + l2) + i21) + Float.floatToIntBits(f4)) + i22) + i23) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(lArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {
        int i24 = -27;
        int i25 = -21000;
        int i26 = 13;
        int i27 = 58609;
        int i28 = 59908;
        int i29 = 8;
        int i30 = 4;
        int i31 = -3883;
        int i32 = 2;
        int i33 = -57;
        int i34 = -8807;
        int i35 = -10;
        int i36 = 246;
        int i37 = -42295;
        int i38 = -13;
        int i39 = 0;
        int i40 = 3;
        int i41 = 98;
        int i42 = -62065;
        int i43 = 164;
        int i44 = 3;
        int i45 = 0;
        int i46 = -221;
        int iArr2[] = new int[N];
        long l3 = -42L;
        long lArr2[] = new long[N];
        double d2 = 2.126795;
        byte byArr[] = new byte[N];
        FuzzerUtils.init(lArr2, -1599887005L);
        FuzzerUtils.init(byArr, ((byte) (-98)));
        FuzzerUtils.init(iArr2, -29246);
        vMeth();
        for (i24 = 112; i24 > 1; i24--) {
            i25 = ((int) (Test.instanceCount));
            i26 = 1;
            do {
                i25 += 11 + (i26 * i26);
                i25 += -3;
                for (i27 = 1; i27 < 1; i27++) {
                    i28 = i26;
                    Test.instanceCount += i27;
                    i28 = i24;
                    i28 %= ((int) (((long) (Test.dFld)) | 1));
                    Test.instanceCount += ((i27 * Test.instanceCount) + i24) - i27;
                    i28 = i28;
                    Test.fFld *= Test.instanceCount;
                    i25 >>= i24;
                    i25 += ((int) (6L));
                    i25 += i28;
                }
                Test.dFld = Test.fFld;
                lArr2[i26] <<= Test.instanceCount;
                Test.instanceCount -= Test.instanceCount;
                Test.fArrFld = Test.fArrFld;
                i25 -= i28;
                Test.fFld += 6722;
            } while ((++i26) < 46 );
            Test.instanceCount = 62723L;
            byArr[i24 + 1] += ((byte) (i28));
            i25 <<= i25;
            for (i29 = 2; i29 < 46; i29++) {
                for (i31 = 1; i31 < 2; ++i31) {
                    i30 = -36002;
                    i28 *= Test.byFld;
                }
                Test.fFld *= ((float) (Test.dFld));
                lArr2[i24] = Test.instanceCount;
                i32 -= i26;
                iArr2[i29] = i28;
                lArr2[i24] += i30;
                for (i33 = 1; i33 < 2; ++i33) {
                    iArr2[i33 + 1] *= i33;
                    Test.fFld += i30;
                    Test.fFld += i33 * i33;
                    Test.fFld -= 228L;
                    i34 >>= ((int) (-8L));
                    iFld += ((i33 * i28) + iFld) - i32;
                    Test.instanceCount += (-92L) + (i33 * i33);
                    Test.instanceCount -= iFld;
                    i25 -= i30;
                }
                for (l3 = i29; l3 < 2; ++l3) {
                    i34 -= i26;
                    Test.iArrFld = FuzzerUtils.int2array(N, ((int) (8)));
                    i30 += ((int) (((l3 * Test.byFld) + l3) - i24));
                }
                i30 = i30;
            }
            i25 = i35;
        }
        Test.iArrFld[(iFld >>> 1) % N][(6 >>> 1) % N] = 0;
        Test.bFld = Test.bFld;
        Test.sFld -= ((short) (Test.fFld));
        i35 = i30;
        for (i36 = 4; i36 < 235; i36++) {
            i37 *= ((int) (l3));
            Test.instanceCount = ((long) (Test.fFld));
            i28 >>= i29;
            for (i38 = 1; 22 > i38; i38++) {
                i25 -= ((int) (13L));
                for (i40 = 1; i40 < 2; i40++) {
                    Test.fFld -= Test.sFld;
                }
                i37 -= ((int) (Test.fFld));
                Test.fFld += (-21L) + (i38 * i38);
                for (i42 = 2; i42 > i36; i42--) {
                    i41 = ((int) (Test.instanceCount));
                }
                i41 >>= i35;
                Test.dFld = Test.instanceCount;
            }
            iArr2[i36 + 1] = ((int) (Test.instanceCount));
            for (i44 = 1; 22 > i44; ++i44) {
                for (d2 = 1; d2 < 2; ++d2) {
                    Test.fFld *= i37;
                    Test.bArrFld[((int) (d2 + 1))] = true;
                }
                i34 += ((i44 * Test.byFld) + i46) - i36;
            }
        }
        FuzzerUtils.out.println((((("i24 i25 i26 = " + i24) + ",") + i25) + ",") + i26);
        FuzzerUtils.out.println((((("i27 i28 i29 = " + i27) + ",") + i28) + ",") + i29);
        FuzzerUtils.out.println((((("i30 i31 i32 = " + i30) + ",") + i31) + ",") + i32);
        FuzzerUtils.out.println((((("i33 i34 l3 = " + i33) + ",") + i34) + ",") + l3);
        FuzzerUtils.out.println((((("i35 i36 i37 = " + i35) + ",") + i36) + ",") + i37);
        FuzzerUtils.out.println((((("i38 i39 i40 = " + i38) + ",") + i39) + ",") + i40);
        FuzzerUtils.out.println((((("i41 i42 i43 = " + i41) + ",") + i42) + ",") + i43);
        FuzzerUtils.out.println((((("i44 i45 d2 = " + i44) + ",") + i45) + ",") + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println((((("i46 lArr2 byArr = " + i46) + ",") + FuzzerUtils.checkSum(lArr2)) + ",") + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println((((("Test.instanceCount Test.dFld Test.bFld = " + Test.instanceCount) + ",") + Double.doubleToLongBits(Test.dFld)) + ",") + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println((((("Test.byFld Test.fFld iFld = " + Test.byFld) + ",") + Float.floatToIntBits(Test.fFld)) + ",") + iFld);
        FuzzerUtils.out.println((((("Test.sFld Test.fArrFld Test.iArrFld = " + Test.sFld) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))) + ",") + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));
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

    static Boolean ax$5 = false;
}