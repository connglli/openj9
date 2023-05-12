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
import java.nio.channels.SocketChannel;
import java.util.List;

public class Test {
    public static final int N = 256;

    public static long instanceCount = 5734136199070435319L;

    public static int iFld = 213;

    public static int iFld1 = 31866;

    public static volatile int iFld2 = -90;

    public static long lFld = -59L;

    public static volatile float fArrFld[] = new float[N];

    public static boolean bArrFld[] = new boolean[N];

    public static long lArrFld[] = new long[N];

    public static short sArrFld[] = new short[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.866F);
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.lArrFld, -7038886035624141185L);
        FuzzerUtils.init(Test.sArrFld, ((short) (2677)));
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static int iMeth() {
        int i5 = 12;
        int i6 = 34944;
        int i7 = -72;
        int i8 = 8;
        int i9 = 11318;
        int i10 = 55176;
        int i11 = 21937;
        int i12 = -12171;
        int i13 = -36779;
        int iArr2[] = new int[N];
        boolean b = false;
        float f1 = 114.153F;
        short s = 16235;
        FuzzerUtils.init(iArr2, -20850);
        for (i5 = 196; i5 > 10; i5--) {
            iArr2 = iArr2;
            Test.iFld -= i5;
            Test.iFld = ((int) (Test.instanceCount));
            Test.iFld -= -13;
            if (b)
                break;

        }
        for (i7 = 3; 178 > i7; i7 += 2) {
            i9 = 1;
            do {
                switch (((((-2) >>> 1) % 8) * 5) + 55) {
                    case 86 :
                    case 65 :
                        f1 += Test.iFld;
                        f1 -= f1;
                        f1 = i6;
                        if (b)
                            continue;

                        Test.instanceCount += Test.instanceCount;
                        Test.iFld = i6;
                        {
                            final int ax$6 = i9;
                            try {
                                char[] ax$1 = new char[]{ 40000, 40001, 40002, 40003, 40004 };
                                char[] ax$2 = new char[]{ 40000, 40001, 40002, 40003, 40004 };
                                for (int ax$0 = -431; ax$0 < (-431 + 13638); ax$0 += 1) {
                                    Test.AxOutputRedirectionHelper.redirect();
                                    try {
                                        for (int ax$4 = 16; ax$4 < i9; ax$4++) {
                                            ax$1[ax$4] = ((char) (ax$4));
                                            ax$2[ax$4] = ((char) (ax$4));
                                        }
                                    } catch (Throwable ax$5) {
                                    } finally {
                                    }
                                    Test.AxOutputRedirectionHelper.recover();
                                }
                            } finally {
                                i9 = ax$6;
                            }
                        }
                        Test.instanceCount *= i6;
                        for (i10 = 1; i10 < 1; ++i10) {
                            Test.instanceCount ^= i10;
                            i8 = i8;
                            iArr2[i9 + 1] = i7;
                            if (b)
                                continue;

                            Test.iFld = i6;
                            i8 += i10;
                            Test.instanceCount >>= Test.iFld;
                            Test.fArrFld[i9] = Test.iFld;
                            if (b)
                                continue;

                            Test.bArrFld[i10] = b;
                            if (i6 != 0) {
                            }
                        }
                        for (i12 = 1; 1 > i12; i12++) {
                            i6 = ((int) (56621L));
                            i6 = 14;
                            s += ((short) (Test.instanceCount));
                            i13 += i8;
                            Test.instanceCount += i12 * i12;
                        }
                        try {
                            iArr2[i7 + 1] = iArr2[i9] / (-40);
                            i13 = i12 % i9;
                            i13 = i10 % (-9502);
                        } catch (ArithmeticException a_e) {
                        }
                        Test.lArrFld[((-2) >>> 1) % N] >>= -19L;
                        break;
                    case 83 :
                        iArr2[i9 + 1] += i9;
                        break;
                    case 84 :
                    case 77 :
                        i13 += i9 | i6;
                    case 72 :
                        iArr2 = iArr2;
                        break;
                    case 60 :
                        Test.instanceCount >>= i10;
                        break;
                    case 71 :
                        i11 *= 14;
                        break;
                }
            } while ((++i9) < 6 );
        }
        long meth_res = (((((((((((i5 + i6) + (b ? 1 : 0)) + i7) + i8) + i9) + Float.floatToIntBits(f1)) + i10) + i11) + i12) + i13) + s) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth1(long l1, int i3, float f) {
        if (Test.ax$11) {
            final int ax$15 = i3;
            List<byte[]> ax$13 = null;
            Test.AxOutputRedirectionHelper.redirect();
            try {
                while (true) {
                    ax$13.add(new byte[1048576]);
                    i3++;
                } 
            } catch (Throwable ax$14) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            i3 = ax$15;
            return;
        }
        int i4 = 13;
        int i14 = 240;
        int i15 = 1;
        int i16 = -33;
        int i17 = 245;
        int i18 = -158;
        int i19 = 155;
        int iArr1[] = new int[N];
        double d = 0.24353;
        double dArr[] = new double[N];
        byte by1 = -119;
        short s1 = 16701;
        boolean b1 = true;
        FuzzerUtils.init(iArr1, 56217);
        FuzzerUtils.init(dArr, 1.19184);
        i4 = 1;
        while ((++i4) < 220) {
            i3 >>>= ((int) (((Test.instanceCount + l1) - (--iArr1[i4 - 1])) + iMeth()));
            i3 += i4;
            Test.iFld += i4 * i3;
            try {
                Test.iFld = (-33254) % i4;
                Test.iFld1 = i3 % iArr1[i4 + 1];
                Test.iFld = i4 % i4;
            } catch (ArithmeticException a_e) {
            }
        } 
        d = by1;
        by1 = ((byte) (i3));
        i14 = 1;
        do {
            i15 = 1;
            do {
                iArr1[i15 + 1] = s1;
                switch ((i14 % 10) + 84) {
                    case 84 :
                        l1 = i4;
                    case 85 :
                    case 86 :
                        switch (((i3 >>> 1) % 6) + 67) {
                            case 67 :
                                i3 = ((int) (f));
                                Test.iFld += ((int) (l1));
                                if (b1) {
                                    for (i16 = 1; i16 < 3; i16++) {
                                        s1 <<= ((short) (51587));
                                        i17 -= ((int) (f));
                                        d -= Test.iFld1;
                                        iArr1[i14 - 1] += i4;
                                        Test.iFld1 &= i14;
                                        l1 += -28142;
                                        dArr = dArr;
                                        Test.iFld += i3;
                                        l1 += i16;
                                    }
                                    f += i15;
                                    f -= i4;
                                }
                                for (i18 = 1; i18 < 3; ++i18) {
                                    i19 += i19;
                                    Test.iFld1 = Test.iFld;
                                    b1 = b1;
                                    Test.lArrFld[i14 - 1] += l1;
                                    Test.instanceCount <<= by1;
                                    iArr1[i15 - 1] = i18;
                                    i3 -= ((int) (l1));
                                    iArr1[i15 + 1] = Test.iFld1;
                                }
                            case 68 :
                                Test.instanceCount += Test.iFld1;
                            case 69 :
                                Test.iFld1 += i17;
                            case 70 :
                                iArr1[i15 + 1] += 6;
                            case 71 :
                                iArr1[i14 + 1] <<= i19;
                                break;
                            case 72 :
                                i3 += i3;
                                break;
                        }
                        break;
                    case 87 :
                        if (b1)
                            break;

                        break;
                    case 88 :
                        Test.instanceCount = i14;
                        break;
                    case 89 :
                        if (b1)
                            break;

                    case 90 :
                    case 91 :
                        i17 += ((i15 * i19) + i19) - i14;
                        break;
                    case 92 :
                        b1 = b1;
                    case 93 :
                        dArr[i15 - 1] = -8;
                        break;
                }
            } while ((i15 += 3) < 3 );
        } while ((++i14) < 181 );
        vMeth1_check_sum += ((((((((((((((l1 + i3) + Float.floatToIntBits(f)) + i4) + Double.doubleToLongBits(d)) + by1) + i14) + i15) + s1) + i16) + i17) + (b1 ? 1 : 0)) + i18) + i19) + FuzzerUtils.checkSum(iArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i1, long l, int i2) {
        float f2 = 60.399F;
        int i20 = -25772;
        int i21 = 7;
        int i22 = -9;
        int i23 = 40222;
        int i24 = 0;
        int i25 = 2924;
        int iArr3[] = new int[N];
        double d1 = 0.17198;
        boolean b2 = true;
        byte by2 = 96;
        byte by3 = -93;
        short s2 = -32007;
        FuzzerUtils.init(iArr3, -16369);
        {
            try {
                float[] ax$17 = new float[16];
                float ax$18 = 0.41745794F;
                float[] ax$19 = new float[]{ 0.40103096F, 0.95836425F, 0.18324542F, 0.0971514F, 0.12308967F, 0.99089277F };
                int[] ax$22 = new int[]{ -578326424, -1051660173, 69968202, -2006309177, 1413756578, -224587461, -1115457389, 1396050076 };
                for (int ax$16 = -353; ax$16 < (-353 + 16663); ax$16 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$20 = 0; ax$20 < ax$19.length; ax$20 += 1) {
                            ax$19[ax$20] += ax$17[ax$20] + ax$18;
                        }
                    } catch (Throwable ax$21) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$11 = true;
                    vMeth1(3858290476842486014L, 1361378627, 0.8909748F);
                    Test.ax$11 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$23 = 0; ax$23 <= 3; ax$23++) {
                            for (int ax$24 = 0; ax$24 <= 3; ax$24++) {
                                ax$22[ax$23 * ax$24] += 1;
                            }
                        }
                    } catch (Throwable ax$25) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
            }
        }
        vMeth1(1070363902L, Test.iFld, f2);
        if (b2) {
            for (i20 = 3; 101 > i20; i20++) {
                if (Test.iFld != 0) {
                    vMeth_check_sum += ((((((((((((((i1 + l) + i2) + Float.floatToIntBits(f2)) + i20) + i21) + Double.doubleToLongBits(d1)) + (b2 ? 1 : 0)) + i22) + i23) + i24) + i25) + by2) + by3) + s2) + FuzzerUtils.checkSum(iArr3);
                    return;
                }
                d1 -= Test.iFld1;
                Test.iFld *= ((int) (d1));
                if (b2)
                    continue;

                Test.instanceCount = Test.iFld1;
                Test.fArrFld[i20] += 20564;
                for (i22 = 1; i22 < 6; i22++) {
                    i1 = Test.iFld1;
                    f2 = 181;
                    if (b2) {
                        i24 = 1;
                        while ((++i24) < 2) {
                            iArr3[i20 - 1] = i21;
                            i2 >>= i1;
                            l = Test.iFld1;
                            switch (((i2 >>> 1) % 9) + 49) {
                                case 49 :
                                    f2 *= 15145;
                                    Test.iFld += i24 ^ i25;
                                    try {
                                        i2 = i2 / i24;
                                        iArr3[i24] = Test.iFld % i21;
                                        i25 = iArr3[i24] / 147;
                                    } catch (ArithmeticException a_e) {
                                    }
                                    d1 = Test.iFld2;
                                    f2 += by2;
                                    l = ((long) (d1));
                                    b2 = b2;
                                    i21 = 126;
                                    Test.instanceCount += by3;
                                case 50 :
                                    Test.iFld += ((int) (2332305347L + (i24 * i24)));
                                    Test.iFld1 *= i22;
                                    iArr3[i22] -= s2;
                                    d1 -= i1;
                                    i23 = i20;
                                    by2 = ((byte) (61812L));
                                    i23 += ((int) (f2));
                                    i23 = ((int) (Test.instanceCount));
                                    Test.instanceCount = by3;
                                    {
                                        try {
                                            SocketChannel ax$8 = null;
                                            for (int ax$7 = -788; ax$7 < (-788 + 11659); ax$7 += 1) {
                                                Test.AxOutputRedirectionHelper.redirect();
                                                try {
                                                    for (int ax$9 = 0; ax$9 < 256; ax$9++) {
                                                        ax$8.socket().sendUrgentData(ax$9);
                                                    }
                                                } catch (Throwable ax$10) {
                                                } finally {
                                                }
                                                Test.AxOutputRedirectionHelper.recover();
                                            }
                                        } finally {
                                        }
                                    }
                                    iArr3[i20 - 1] *= -3339;
                                    break;
                                case 51 :
                                    if (Test.iFld2 != 0) {
                                        vMeth_check_sum += ((((((((((((((i1 + l) + i2) + Float.floatToIntBits(f2)) + i20) + i21) + Double.doubleToLongBits(d1)) + (b2 ? 1 : 0)) + i22) + i23) + i24) + i25) + by2) + by3) + s2) + FuzzerUtils.checkSum(iArr3);
                                        return;
                                    }
                                    break;
                                case 52 :
                                    d1 += 58433;
                                    break;
                                case 53 :
                                    if (i21 != 0) {
                                        vMeth_check_sum += ((((((((((((((i1 + l) + i2) + Float.floatToIntBits(f2)) + i20) + i21) + Double.doubleToLongBits(d1)) + (b2 ? 1 : 0)) + i22) + i23) + i24) + i25) + by2) + by3) + s2) + FuzzerUtils.checkSum(iArr3);
                                        return;
                                    }
                                    break;
                                case 54 :
                                    f2 -= s2;
                                case 55 :
                                    i25 *= i2;
                                    break;
                                case 56 :
                                    f2 /= i23 | 1;
                                case 57 :
                                    Test.sArrFld[i20 + 1] = ((short) (i20));
                                    break;
                                default :
                                    s2 = ((short) (i25));
                            }
                        } 
                    } else if (b2) {
                        Test.iFld1 = Test.iFld2;
                    } else if (b2) {
                        Test.lFld = -24927;
                    }
                }
            }
        } else if (b2) {
            Test.iFld -= i21;
        } else {
            b2 = false;
        }
        vMeth_check_sum += ((((((((((((((i1 + l) + i2) + Float.floatToIntBits(f2)) + i20) + i21) + Double.doubleToLongBits(d1)) + (b2 ? 1 : 0)) + i22) + i23) + i24) + i25) + by2) + by3) + s2) + FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {
        byte by = -56;
        int i = 4;
        int iArr[] = new int[N];
        double d2 = 64.20105;
        FuzzerUtils.init(iArr, 97);
        by >>= ((byte) (((Test.instanceCount -= Test.instanceCount) * (--i)) * (-(Test.instanceCount * Test.instanceCount))));
        iArr[(i >>> 1) % N] >>= ((int) (Test.instanceCount++));
        i >>= ((int) (Math.min(Test.instanceCount, Test.instanceCount)));
        vMeth(Test.iFld, 22828L, Test.iFld2);
        d2 -= 134L;
        FuzzerUtils.out.println((((("by i d2 = " + by) + ",") + i) + ",") + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println((((("Test.instanceCount Test.iFld Test.iFld1 = " + Test.instanceCount) + ",") + Test.iFld) + ",") + Test.iFld1);
        FuzzerUtils.out.println((((("Test.iFld2 Test.lFld Test.fArrFld = " + Test.iFld2) + ",") + Test.lFld) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println((((("Test.bArrFld Test.lArrFld Test.sArrFld = " + FuzzerUtils.checkSum(Test.bArrFld)) + ",") + FuzzerUtils.checkSum(Test.lArrFld)) + ",") + FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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

    static Boolean ax$11 = false;
}