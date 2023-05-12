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
import java.util.UUID;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 1L;

    public byte byFld = 106;

    public static short sFld = 13054;

    public boolean bFld = false;

    public volatile int iFld = 7;

    public static byte byFld1 = 0;

    public static long lArrFld[][] = new long[N][N];

    public static float fArrFld[] = new float[N];

    public static short sArrFld[] = new short[N];

    public static long lArrFld1[] = new long[N];

    public static boolean bArrFld[] = new boolean[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 0L);
        FuzzerUtils.init(Test.fArrFld, -1.601F);
        FuzzerUtils.init(Test.sArrFld, ((short) (-12443)));
        FuzzerUtils.init(Test.lArrFld1, 22691L);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f2) {
        int i2 = 15413;
        i2 -= ((int) (Test.instanceCount));
        vMeth1_check_sum += Float.floatToIntBits(f2) + i2;
    }

    public static void vMeth() {
        if (Test.ax$3) {
            long[] ax$4 = new long[]{ 1572389532138150469L, 5895907708451311366L, -2199013658887556136L, -4063038653418966517L, 6614355986613647133L, -7298671386983899677L, 300042749403287020L, 7357580935595877005L, -5939410303967395848L };
            int ax$5 = 1302099015;
            long[] ax$6 = new long[]{ 0xfL, 0x7fL, 0xffL };
            Test.AxOutputRedirectionHelper.redirect();
            try {
                for (int ax$7 = 0; ax$7 < ax$6.length; ax$7 += 1) {
                    ax$6[ax$7] = ((long) (ax$4[ax$7] >> (-ax$5)));
                }
            } catch (Throwable ax$8) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return;
        }
        int i3 = 14;
        int i4 = 9;
        int i5 = 10;
        int i6 = -1222;
        int i7 = 94;
        int i8 = 5;
        int i9 = 160;
        int i10 = 3;
        int i11 = -128;
        int i12 = 11;
        int i13 = -10;
        int i14 = -39753;
        int iArr1[] = new int[N];
        short s1 = 21314;
        float f3 = -1.947F;
        byte by = 5;
        byte byArr[] = new byte[N];
        double d = 68.94357;
        FuzzerUtils.init(iArr1, 0);
        FuzzerUtils.init(byArr, ((byte) (41)));
        vMeth1(-2.32F);
        for (i3 = 5; i3 < 91; i3++) {
            try {
                i4 = i4 / (-11554);
                i5 = (-210) % i4;
                i5 = i4 % i5;
            } catch (ArithmeticException a_e) {
            }
            i4 >>= i4;
            i6 = 1;
            do {
                Test.sFld = Test.sFld;
                i4 += i6 + i5;
                i5 -= ((int) (Test.instanceCount));
                iArr1[i6 + 1] = i6;
                for (i7 = 1; 1 > i7; i7++) {
                    byArr[i3 - 1] = ((byte) (i6));
                    i8 += i7;
                    i4 += i7 | Test.instanceCount;
                    try {
                        i8 = (-191) / i3;
                        iArr1[i6 + 1] = i4 / (-11003);
                        i8 = (-19661) % i5;
                    } catch (ArithmeticException a_e) {
                    }
                    Test.instanceCount = i5;
                    try {
                        i4 = i9 % i7;
                        i5 = i5 % (-179);
                        i4 = iArr1[i7] / 1000738936;
                    } catch (ArithmeticException a_e) {
                    }
                    i5 += i7 * i7;
                    Test.instanceCount -= s1;
                }
                for (i10 = 1; i10 < 1; i10++) {
                    i4 >>= i5;
                    Test.instanceCount = i8;
                    i8 = i10;
                    f3 += i10;
                    Test.instanceCount = -198;
                    f3 = i7;
                    iArr1 = iArr1;
                    Test.lArrFld[i3 - 1][i10] = Test.instanceCount;
                    if (i6 != 0) {
                        vMeth_check_sum += ((((((((((((((((i3 + i4) + i5) + i6) + i7) + i8) + i9) + s1) + i10) + i11) + Float.floatToIntBits(f3)) + by) + i12) + i13) + i14) + Double.doubleToLongBits(d)) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(byArr);
                        return;
                    }
                }
                by *= ((byte) (14L));
                i9 = ((int) (Test.instanceCount));
                i8 >>>= ((int) (Test.instanceCount));
            } while ((++i6) < 6 );
            for (i12 = 1; i12 < 6; i12++) {
                i14 = 1;
                do {
                    switch ((((i14 >>> 1) % 4) * 5) + 36) {
                        case 55 :
                            i4 >>= by;
                            Test.instanceCount += Test.instanceCount;
                            Test.lArrFld[i14][i12 - 1] = i9;
                            break;
                        case 46 :
                        case 39 :
                            Test.instanceCount >>= by;
                            break;
                        case 47 :
                            i9 = ((int) (d));
                            break;
                    }
                } while ((++i14) < 2 );
            }
        }
        vMeth_check_sum += ((((((((((((((((i3 + i4) + i5) + i6) + i7) + i8) + i9) + s1) + i10) + i11) + Float.floatToIntBits(f3)) + by) + i12) + i13) + i14) + Double.doubleToLongBits(d)) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth(long l, int i1) {
        float f1 = 2.237F;
        float fArr[] = new float[N];
        int i15 = -76;
        int i16 = 203;
        int i17 = -145;
        int i18 = -21;
        int i19 = 8731;
        int i20 = 58422;
        int i21 = 5;
        int i22 = -231;
        int i23 = -6757;
        int i24 = -138;
        int i25 = 2;
        int iArr2[] = new int[N];
        byte by1 = -86;
        byte byArr1[] = new byte[N];
        long l1 = 6L;
        boolean b = false;
        short sArr[] = new short[N];
        FuzzerUtils.init(sArr, ((short) (16620)));
        FuzzerUtils.init(iArr2, 47936);
        FuzzerUtils.init(fArr, -97.318F);
        FuzzerUtils.init(byArr1, ((byte) (73)));
        i1 <<= ((int) (((long) (Math.abs(f1) + (++i1))) ^ i1));
        {
            final long ax$19 = Test.vMeth_check_sum;
            final int ax$20 = i17;
            final int ax$21 = i21;
            final int ax$22 = i25;
            try {
                Exception ax$10 = new Exception();
                Exception ax$11 = new Exception();
                String ax$14 = "s";
                for (int ax$9 = -197; ax$9 < (-197 + 18620); ax$9 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        ax$10 = ax$11;
                    } catch (Throwable ax$12) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$3 = true;
                    vMeth();
                    Test.ax$3 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if (Integer.toUnsignedLong(i25) != vMeth_check_sum) {
                            i17++;
                        }
                    } catch (Throwable ax$18) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                Test.vMeth_check_sum = ax$19;
                i17 = ax$20;
                i21 = ax$21;
                i25 = ax$22;
            }
        }
        vMeth();
        for (i15 = 9; i15 < 144; i15++) {
            if (b) {
                i1 = i1;
                i16 <<= ((int) (Test.instanceCount));
                i17 = 1;
                while ((++i17) < 4) {
                    for (i18 = i17; i18 < 1; ++i18) {
                        sArr[i15 - 1] += ((short) (Test.instanceCount));
                        i20 = i15;
                        l >>>= i17;
                        try {
                            iArr2[i17] = i16 % iArr2[i15 - 1];
                            i16 = (-24696) / i19;
                            iArr2[i17] = iArr2[i15] / (-36192);
                        } catch (ArithmeticException a_e) {
                        }
                    }
                    i20 += ((int) (Test.instanceCount));
                    for (i21 = i15; 1 > i21; i21++) {
                        l -= ((long) (f1));
                        {
                            try {
                                UUID ax$1 = new UUID(35L, 63L);
                                for (int ax$0 = -256; ax$0 < (-256 + 7687); ax$0 += 1) {
                                    Test.AxOutputRedirectionHelper.redirect();
                                    try {
                                        if (ax$1.clockSequence() != 16);
                                    } catch (Throwable ax$2) {
                                    } finally {
                                    }
                                    Test.AxOutputRedirectionHelper.recover();
                                }
                            } finally {
                            }
                        }
                        i19 = i18;
                        i20 += ((i21 * f1) + Test.instanceCount) - Test.sFld;
                        i16 = ((int) (Test.instanceCount));
                        fArr[i21 + 1] -= i18;
                        i16 += i21;
                        byArr1[i15 - 1] += ((byte) (i16));
                        by1 = ((byte) (i16));
                    }
                    l -= i16;
                    iArr2[i15 + 1] = i21;
                    iArr2 = iArr2;
                    i23 = 1;
                    do {
                        i19 >>= ((int) (Test.instanceCount));
                        Test.instanceCount = i15;
                        i24 += i16;
                        i22 -= ((int) (f1));
                        iArr2[i23] = ((int) (l1));
                        i20 = -34360;
                        i22 = i25;
                        Test.lArrFld[i15 + 1][i15 + 1] += i16;
                        iArr2 = iArr2;
                        i16 = ((int) (l1));
                    } while ((--i23) > 0 );
                    Test.instanceCount -= i16;
                } 
            } else {
                l1 -= ((long) (f1));
            }
        }
        long meth_res = (((((((((((((((((((l + i1) + Float.floatToIntBits(f1)) + i15) + i16) + i17) + i18) + i19) + i20) + i21) + i22) + by1) + i23) + i24) + l1) + i25) + (b ? 1 : 0)) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(iArr2)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + FuzzerUtils.checkSum(byArr1);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        short s = 9836;
        float f = 66.934F;
        int i = -51528;
        int i26 = 237;
        int i27 = 88;
        int i28 = -2;
        int i29 = -48430;
        int i30 = -78;
        int i31 = 14;
        int iArr[] = new int[N];
        double d1 = -7.21271;
        double d2 = 0.128448;
        FuzzerUtils.init(iArr, -122);
        Test.instanceCount <<= ((long) ((s -= ((short) (f))) + (-(i *= i)))) << i;
        iArr[(27126 >>> 1) % N] = Math.min(Math.abs(((int) (byFld - Test.instanceCount))), iMeth(Test.instanceCount, i));
        for (i26 = 1; i26 < 171; i26++) {
            f += i26;
            i27 += ((i26 * i26) + Test.instanceCount) - i;
            Test.lArrFld[i26 - 1] = Test.lArrFld[i26];
            f += s;
            if (false)
                break;

            i28 = 1;
            do {
                i = ((int) (Test.instanceCount));
                for (i29 = 1; i29 < 1; i29++) {
                    byFld += ((byte) (Test.instanceCount));
                    i30 += i;
                    s += ((short) (i29));
                    f *= i27;
                    Test.fArrFld[i28 - 1] = 159;
                    Test.sArrFld[i28] += ((short) (-156));
                    Test.sFld = ((short) (-236));
                    if (false) {
                        Test.lArrFld[i29 - 1][i26 - 1] = Test.instanceCount;
                        Test.instanceCount >>>= s;
                        i27 *= i31;
                        switch (((i29 % 6) * 5) + 31) {
                            case 40 :
                                d1 = i27;
                                iArr[i29] %= ((int) (i29 | 1));
                                i27 -= i29;
                                i31 += 63082 + (i29 * i29);
                                s = ((short) (f));
                                iArr[i28 - 1] = byFld;
                                Test.instanceCount = 176;
                                Test.instanceCount = 12162;
                                Test.lArrFld1[i28 + 1] -= i31;
                                i30 += i29;
                                break;
                            case 36 :
                                d1 -= i28;
                                if (bFld) {
                                    i = i;
                                    i30 += i29 * i29;
                                    Test.instanceCount -= i31;
                                    f += f;
                                    i30 *= ((int) (f));
                                    bFld = bFld;
                                    switch ((i28 % 10) + 117) {
                                        case 117 :
                                            Test.instanceCount -= i28;
                                            i27 += ((i29 * f) + f) - i29;
                                            d1 += -19992;
                                            iArr[i28] -= 8;
                                            i30 = ((int) (Test.instanceCount));
                                            byFld = ((byte) (i27));
                                            Test.bArrFld[i29 - 1] = bFld;
                                            bFld = bFld;
                                        case 118 :
                                            iArr[i28 + 1] += ((int) (Test.instanceCount));
                                            i27 = -42988;
                                            iArr[i28 + 1] += i31;
                                            iFld *= i30;
                                            Test.sArrFld[i26] = ((short) (i28));
                                            switch (((i28 % 3) * 5) + 39) {
                                                case 45 :
                                                    i31 += i29;
                                                    i += i29;
                                                    Test.instanceCount = -2;
                                                    iArr[i29 + 1] = s;
                                                    Test.instanceCount -= 100;
                                                    Test.byFld1 |= ((byte) (i31));
                                                    i30 = ((int) (f));
                                                    Test.lArrFld1[i28] = i28;
                                                    i += i29 * i29;
                                                    Test.lArrFld1[i28] = byFld;
                                                    break;
                                                case 53 :
                                                    i = i28;
                                                    if (bFld) {
                                                        iArr[i26 + 1] ^= 55;
                                                        i <<= ((int) (Test.instanceCount));
                                                        Test.instanceCount += i28;
                                                        i = i27;
                                                        d2 -= i26;
                                                        s += ((short) (((i29 * Test.instanceCount) + i26) - iFld));
                                                        iArr[i28 + 1] = i26;
                                                    } else if (bFld) {
                                                        d1 -= -38L;
                                                    } else {
                                                        byFld += ((byte) (d2));
                                                    }
                                                    break;
                                                case 42 :
                                                    Test.instanceCount -= -3;
                                            }
                                        case 119 :
                                            iArr[i29 + 1] = 6;
                                            break;
                                        case 120 :
                                        case 121 :
                                            f += ((i29 * f) + i31) - i30;
                                            break;
                                        case 122 :
                                            if (bFld)
                                                continue;

                                            break;
                                        case 123 :
                                            Test.sFld += ((short) (i29 ^ Test.instanceCount));
                                            break;
                                        case 124 :
                                            i += (-132) + (i29 * i29);
                                        case 125 :
                                            iFld = ((int) (Test.instanceCount));
                                            break;
                                        case 126 :
                                            i30 -= 0;
                                            break;
                                        default :
                                            Test.instanceCount += i29 * i29;
                                    }
                                } else {
                                    i27 -= ((int) (Test.instanceCount));
                                }
                                break;
                            case 58 :
                                Test.instanceCount += i29 - i31;
                            case 57 :
                                i30 = s;
                            case 61 :
                                i31 = ((int) (f));
                                break;
                            case 44 :
                                i30 += i29;
                                break;
                            default :
                                f = Test.instanceCount;
                        }
                    } else if (bFld) {
                        Test.instanceCount = i29;
                    } else {
                        Test.instanceCount ^= Test.instanceCount;
                    }
                }
            } while ((++i28) < 30 );
        }
        FuzzerUtils.out.println((((("s f i = " + s) + ",") + Float.floatToIntBits(f)) + ",") + i);
        FuzzerUtils.out.println((((("i26 i27 i28 = " + i26) + ",") + i27) + ",") + i28);
        FuzzerUtils.out.println((((("i29 i30 i31 = " + i29) + ",") + i30) + ",") + i31);
        FuzzerUtils.out.println((((("d1 d2 iArr = " + Double.doubleToLongBits(d1)) + ",") + Double.doubleToLongBits(d2)) + ",") + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println((((("Test.instanceCount byFld Test.sFld = " + Test.instanceCount) + ",") + byFld) + ",") + Test.sFld);
        FuzzerUtils.out.println((((("bFld iFld Test.byFld1 = " + (bFld ? 1 : 0)) + ",") + iFld) + ",") + Test.byFld1);
        FuzzerUtils.out.println((((("Test.lArrFld Test.fArrFld Test.sArrFld = " + FuzzerUtils.checkSum(Test.lArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))) + ",") + FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println((("Test.lArrFld1 Test.bArrFld = " + FuzzerUtils.checkSum(Test.lArrFld1)) + ",") + FuzzerUtils.checkSum(Test.bArrFld));
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

    static Boolean ax$3 = false;
}