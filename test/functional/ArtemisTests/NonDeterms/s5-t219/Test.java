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
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.spi.SelectorProvider;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
    public static final int N = 256;

    public static long instanceCount = -192L;

    public static int iFld = 0;

    public static volatile float fFld = -88.17F;

    public static double dFld = -2.59377;

    public static boolean bFld = false;

    public byte byFld = 119;

    public int iFld1 = 17767;

    public static byte byArrFld[] = new byte[N];

    public static double dArrFld[] = new double[N];

    public static boolean bArrFld[][] = new boolean[N][N];

    static {
        FuzzerUtils.init(Test.byArrFld, ((byte) (-26)));
        FuzzerUtils.init(Test.dArrFld, 2.7756);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;

    public static long iMeth_check_sum = 0;

    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l) {
        int i10 = 16477;
        int i11 = 248;
        int i12 = 5301;
        int i13 = -15227;
        int i14 = -78;
        int i15 = -9;
        int i16 = 36671;
        int i17 = -30047;
        int iArr2[] = new int[N];
        boolean b = true;
        boolean bArr[] = new boolean[N];
        float fArr2[][] = new float[N][N];
        FuzzerUtils.init(iArr2, 4);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr2, 6.595F);
        try {
            i10 = 1;
            while ((++i10) < 172) {
                i11 = 1;
                do {
                    Test.iFld = ((int) (Test.dFld));
                    if (false)
                        continue;

                    Test.dFld *= l;
                    Test.iFld = 121;
                    iArr2[i11 + 1] = Test.iFld;
                    Test.iFld <<= i10;
                    bArr[i10 + 1] = false;
                    for (i12 = 1; i12 < 1; ++i12) {
                        Test.iFld = ((int) (l));
                        i13 |= Test.iFld;
                        i13 += i13;
                        Test.fFld *= -2.759F;
                        iArr2[i12 + 1] += i10;
                        Test.instanceCount += i12 * i12;
                    }
                    Test.instanceCount += l;
                    iArr2[i10] += i13;
                    Test.byArrFld[i10 + 1] = ((byte) (Test.instanceCount));
                } while ((++i11) < 3 );
                Test.iFld &= 29610;
                i13 = ((int) (Test.fFld));
                for (i14 = 3; i14 > 1; --i14) {
                    iArr2[i10 + 1] -= ((int) (l));
                    if (b) {
                        i15 += ((i14 * i12) + Test.iFld) - i12;
                    } else if (b) {
                        for (i16 = i14; i16 < 2; i16++) {
                            Test.fFld += Test.fFld;
                            try {
                                i15 = 1497188388 % iArr2[i16];
                                i17 = i11 / 29196;
                                i15 = (-1627392989) / iArr2[i14];
                            } catch (ArithmeticException a_e) {
                            }
                            iArr2[i10] = i16;
                        }
                        fArr2[i10 + 1][i10 + 1] = -52;
                        i15 = ((int) (Test.fFld));
                        if (false) {
                            Test.iFld += 45332 + (i14 * i14);
                            Test.dFld = Test.fFld;
                            i17 += i14;
                            i13 <<= i17;
                        }
                    }
                }
            } 
        } catch (ArithmeticException exc1) {
            b = b;
        }
        long meth_res = (((((((((((l + i10) + i11) + i12) + i13) + i14) + i15) + i16) + i17) + (b ? 1 : 0)) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(bArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2));
        iMeth1_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static int iMeth(int i4, float f, int i5) {
        if (Test.ax$0) {
            Pipe ax$1 = null;
            Test.AxOutputRedirectionHelper.redirect();
            try {
                if (ax$1.source().isBlocking());
            } catch (Throwable ax$2) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return 1386653667;
        }
        int i7 = -83;
        int i8 = -254;
        int i9 = -91;
        int i18 = 53092;
        int i19 = 180;
        int i20 = -3;
        int i21 = -35202;
        int i22 = -19481;
        int i23 = 13069;
        int i24 = -225;
        int iArr1[] = new int[N];
        boolean b1 = true;
        long l1 = -7L;
        long lArr[] = new long[N];
        byte by = 96;
        float fArr1[] = new float[N];
        FuzzerUtils.init(fArr1, -80.772F);
        FuzzerUtils.init(iArr1, 63);
        FuzzerUtils.init(lArr, -155L);
        fArr1[(38427 >>> 1) % N] -= Math.max(((long) ((Test.iFld - Test.dFld) - (i4 + Test.iFld))), Test.instanceCount >>= i5);
        Test.iFld += -i4;
        Test.iFld = iArr1[(Test.iFld >>> 1) % N];
        for (int i6 : iArr1) {
            for (i7 = 1; i7 < 2; i7++) {
                i4 -= iArr1[i7];
                i4 += i4 - ((i5--) * i8);
                i4 = (-(i9 - i5)) - iMeth1(Test.instanceCount);
                b1 = b1;
                i9 += i7;
                i18 = 1;
                do {
                    f *= l1;
                } while ((++i18) < 2 );
                i6 = i9;
                Test.instanceCount ^= Test.instanceCount;
                i8 <<= ((int) (11L));
                Test.instanceCount += ((long) (Test.dFld));
                i9 >>= 13849;
                iArr1[i7] = -224;
                i19 = 1;
                do {
                    Test.fFld *= i4;
                    i4 -= i8;
                    i4 += i19 * i20;
                } while ((++i19) < 2 );
            }
            if (b1) {
                for (i21 = 2; i21 > 1; i21--) {
                    Test.instanceCount -= -4;
                    i22 = ((int) (l1));
                    try {
                        i5 = i9 / 45442;
                        i6 = i7 / (-25539);
                        Test.iFld = i5 / iArr1[i21 - 1];
                    } catch (ArithmeticException a_e) {
                    }
                    iArr1[i21 + 1] = i20;
                    Test.dFld = l1;
                    switch ((i21 % 2) + 38) {
                        case 38 :
                            for (i23 = i21; i23 < 2; ++i23) {
                                i20 >>= i19;
                                fArr1[i23 - 1] += i18;
                                by += ((byte) (i23 | i21));
                                lArr = lArr;
                                i8 >>= i5;
                                Test.instanceCount <<= by;
                            }
                            break;
                        case 39 :
                            i5 = ((int) (l1));
                            break;
                    }
                }
            }
        }
        long meth_res = (((((((((((((((((i4 + Float.floatToIntBits(f)) + i5) + i7) + i8) + i9) + (b1 ? 1 : 0)) + i18) + l1) + i19) + i20) + i21) + i22) + i23) + i24) + by) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1))) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static void vMeth(int i, int i1, int i2) {
        int i3 = -11;
        int i25 = -14;
        int i26 = 158;
        int i27 = 54230;
        int i28 = -59124;
        int i30 = -7;
        int i31 = 19932;
        int i32 = 18160;
        int i33 = 0;
        int iArr3[] = new int[N];
        short s = -30876;
        byte by1 = 122;
        float fArr[] = new float[N];
        long lArr1[][] = new long[N][N];
        FuzzerUtils.init(fArr, 0.583F);
        FuzzerUtils.init(lArr1, -3707062536179735509L);
        FuzzerUtils.init(iArr3, -8);
        Test.iFld += ((int) (fArr[(Test.iFld >>> 1) % N]--));
        i += -(++i);
        {
            final long ax$27 = Test.vMeth_check_sum;
            final long ax$28 = Test.instanceCount;
            final long ax$29 = Test.iMeth1_check_sum;
            final long ax$30 = Test.iMeth_check_sum;
            try {
                Random ax$4 = new Random(69);
                for (int ax$3 = -26; ax$3 < (-26 + 3945); ax$3 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        SelectorProvider ax$5 = SelectorProvider.provider();
                        Pipe ax$6 = ax$5.openPipe();
                        Pipe.SinkChannel ax$7 = ax$6.sink();
                        Pipe.SourceChannel ax$8 = ax$6.source();
                        ByteBuffer ax$9 = ByteBuffer.allocateDirect(10);
                        byte[] ax$10 = new byte[10];
                        ax$4.nextBytes(ax$10);
                        ax$9.put(ax$10);
                        ax$9.flip();
                        int ax$11 = 0;
                        while (ax$11 < 10) {
                            int ax$12 = ax$7.write(ax$9);
                            if (ax$12 < 0);
                            ax$11 += ax$12;
                        } 
                        ByteBuffer ax$13 = ByteBuffer.allocateDirect(10);
                        int ax$14 = 0;
                        do {
                            int ax$15 = ax$8.read(ax$13);
                            if (ax$15 > 0) {
                                ax$14 += ax$15;
                            }
                        } while (ax$14 < 10 );
                        for (int ax$16 = 0; ax$16 < 10; ax$16++) {
                            if (ax$9.get(ax$16) != ax$13.get(ax$16));
                        }
                        ax$7.close();
                        ax$8.close();
                    } catch (Throwable ax$17) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$0 = true;
                    iMeth(11965953, 0.5451617F, 1900078782);
                    Test.ax$0 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if ((((((((iMeth1_check_sum != 0) || (iMeth1_check_sum != 0)) || (vMeth_check_sum != 0)) || (instanceCount != 0)) || (instanceCount != 0)) || (vMeth_check_sum != 0)) || (vMeth_check_sum != 0)) || (iMeth_check_sum != 0)) {
                        }
                    } catch (Throwable ax$26) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                Test.vMeth_check_sum = ax$27;
                Test.instanceCount = ax$28;
                Test.iMeth1_check_sum = ax$29;
                Test.iMeth_check_sum = ax$30;
            }
        }
        i3 += iMeth(i3, Test.fFld, i1);
        i1 >>>= ((int) (Test.instanceCount));
        {
            final double ax$63 = Test.dFld;
            final int ax$64 = i30;
            final int ax$65 = i26;
            try {
                List<Integer> ax$52 = null;
                Double ax$58 = 0.0;
                Double ax$59 = 75.0;
                boolean ax$51 = false;
                for (int ax$50 = -233; ax$50 < (-233 + 17808); ax$50 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$54 = 0; ax$54 < i30; ax$54++) {
                            for (int ax$55 = 0; ax$55 < ax$54; ax$55++) {
                                ax$52.add(ax$54);
                            }
                        }
                        Collections.shuffle(ax$52);
                        for (int ax$56 = 0; ax$56 < i30; ax$56++) {
                            if (Collections.frequency(ax$52, ax$56) != ax$56);
                        }
                    } catch (Throwable ax$57) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    if (!ax$51) {
                        i25 *= ((int) (Test.instanceCount));
                        ax$51 = true;
                    }
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if ((i26 & 1) == 0) {
                            ax$59 = new Double(dFld + 1.0);
                            ax$58 = new Double(dFld + 2.0);
                        }
                    } catch (Throwable ax$62) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                Test.dFld = ax$63;
                i30 = ax$64;
                i26 = ax$65;
            }
        }
        lArr1[(i26 >>> 1) % N][(i2 >>> 1) % N] = i25;
        for (i27 = 118; 7 < i27; --i27) {
            int i29 = -55;
            Test.iFld -= ((int) (Test.fFld));
            Test.instanceCount = ((long) (Test.fFld));
            i29 += ((int) (Test.dFld));
            if (true)
                continue;

            for (i30 = 5; i30 > 1; i30 -= 3) {
                i2 += ((i30 * Test.instanceCount) + i25) - i26;
                Test.byArrFld[i27 - 1] -= ((byte) (s));
                i3 += i30;
                Test.instanceCount = i;
            }
            Test.bFld = false;
            i = i27;
        }
        for (i32 = 12; i32 < 250; ++i32) {
            fArr = fArr;
            by1 = ((byte) (i1));
            iArr3[i32 - 1] >>= i30;
            Test.dArrFld = Test.dArrFld;
            i25 <<= 78;
            Test.instanceCount = Test.instanceCount;
            i3 >>= ((int) (Test.instanceCount));
        }
        vMeth_check_sum += (((((((((((((((i + i1) + i2) + i3) + i25) + i26) + i27) + i28) + i30) + i31) + s) + i32) + i33) + by1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + FuzzerUtils.checkSum(lArr1)) + FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {
        int i34 = -21473;
        int i35 = 4;
        int i36 = -11;
        int i37 = 9774;
        int i38 = -11;
        int i39 = 2;
        int i40 = 6;
        int i41 = 149;
        int i42 = -86;
        int i43 = 71;
        int iArr[] = new int[N];
        short s1 = -14457;
        boolean b2 = true;
        long lArr2[] = new long[N];
        float fArr3[] = new float[N];
        FuzzerUtils.init(iArr, 44);
        FuzzerUtils.init(lArr2, 0L);
        FuzzerUtils.init(fArr3, 2.857F);
        iArr = iArr;
        Test.instanceCount -= ((long) (Test.iFld - (Test.iFld * (Test.iFld - Test.fFld))));
        vMeth(Test.iFld, Test.iFld, Test.iFld);
        for (i34 = 100; i34 > 3; i34--) {
            Test.fFld -= s1;
            byFld = ((byte) (Test.instanceCount));
            Test.iFld = 244;
            lArr2 = lArr2;
            Test.instanceCount = Test.instanceCount;
            if (Test.bFld) {
                Test.iFld += i34 + i35;
                for (i36 = 2; i36 < 52; ++i36) {
                    for (i38 = i34; i38 < 2; i38++) {
                        i35 = 0;
                        s1 = ((short) (i39));
                        byFld += ((byte) (Test.fFld));
                        iArr[i34] *= ((int) (Test.instanceCount));
                        i37 = 30646;
                        i37 = i39;
                        Test.dFld *= Test.iFld;
                        lArr2[i38] = byFld;
                        i39 += 164 + (i38 * i38);
                        Test.fFld *= i36;
                        i39 -= -6408;
                        Test.instanceCount >>= -2;
                        lArr2[i36] >>= i35;
                    }
                    for (i40 = 1; i40 < 2; ++i40) {
                        Test.iFld += i40;
                        Test.fFld = Test.iFld;
                    }
                    Test.iFld -= i39;
                    iArr[i34 - 1] >>= ((int) (1134954061531598409L));
                    iArr[i34] *= s1;
                    for (i42 = 1; i42 < 2; i42 += 3) {
                        Test.iFld = i42;
                        switch (((i34 % 6) * 5) + 41) {
                            case 50 :
                                i37 = ((int) (Test.instanceCount));
                                Test.dFld += i38;
                                iArr[i42 - 1] = i41;
                                i35 ^= i40;
                                i41 = i39;
                                Test.fFld = s1;
                                break;
                            case 54 :
                                i43 *= i35;
                                break;
                            case 57 :
                            case 45 :
                                i43 = Test.iFld;
                                Test.iFld += ((int) (Test.dFld));
                                Test.iFld = -2;
                                lArr2[i42 - 1] *= i41;
                                switch ((((i34 >>> 1) % 6) * 5) + 54) {
                                    case 78 :
                                        i39 = ((int) (Test.dFld));
                                        Test.instanceCount = i40;
                                        Test.bFld = b2;
                                        Test.instanceCount += i42 * i42;
                                        iArr[i34 - 1] *= i43;
                                        switch ((i42 % 10) + 5) {
                                            case 5 :
                                                i41 = ((int) (Test.instanceCount));
                                                Test.bArrFld[i36 + 1][i42] = b2;
                                                i35 -= i39;
                                                i39 = i40;
                                                b2 = b2;
                                                try {
                                                    i41 = i38 / (-56752);
                                                    i43 = iArr[i34] % 54938;
                                                    i41 = iArr[i42] / 190;
                                                } catch (ArithmeticException a_e) {
                                                }
                                                s1 <<= ((short) (Test.instanceCount));
                                                Test.fFld *= Test.instanceCount;
                                                Test.fFld -= Test.iFld;
                                                i35 -= i35;
                                                Test.instanceCount -= i39;
                                                byFld += ((byte) (((i42 * Test.instanceCount) + Test.fFld) - i37));
                                                i37 += i40;
                                                Test.iFld = ((int) (Test.dFld));
                                                break;
                                            case 6 :
                                                Test.dArrFld[i36] = Test.instanceCount;
                                                Test.iFld = 45107;
                                                byFld *= ((byte) (16955));
                                                switch ((i34 % 8) + 34) {
                                                    case 34 :
                                                        i35 ^= i34;
                                                        iArr[i36 - 1] += byFld;
                                                        i39 *= ((int) (296996927L));
                                                        i43 >>= i43;
                                                        break;
                                                    case 35 :
                                                        i37 += -10;
                                                        break;
                                                    case 36 :
                                                        Test.bArrFld[i42 - 1][i36 - 1] = Test.bFld;
                                                        break;
                                                    case 37 :
                                                        i35 -= i37;
                                                        break;
                                                    case 38 :
                                                        i39 += ((i42 * i43) + iFld1) - Test.instanceCount;
                                                        break;
                                                    case 39 :
                                                        Test.byArrFld[i36 + 1] = ((byte) (-142));
                                                        break;
                                                    case 40 :
                                                        i43 &= i41;
                                                        break;
                                                    case 41 :
                                                        fArr3[i42] *= -26681;
                                                        break;
                                                }
                                                {
                                                    final byte ax$44 = this.byFld;
                                                    final long ax$45 = Test.instanceCount;
                                                    final int ax$46 = i40;
                                                    final long ax$47 = Test.iMeth1_check_sum;
                                                    final int ax$48 = i36;
                                                    final long ax$49 = Test.iMeth_check_sum;
                                                    try {
                                                        byte[] ax$36 = new byte[]{ ((byte) (-43)), ((byte) (14)), ((byte) (-75)), ((byte) (94)), ((byte) (91)), ((byte) (54)), ((byte) (96)) };
                                                        byte[] ax$39 = new byte[]{ ((byte) (-17)), ((byte) (-28)) };
                                                        for (int ax$31 = -552; ax$31 < (-552 + 7774); ax$31 += 1) {
                                                            Test.AxOutputRedirectionHelper.redirect();
                                                            try {
                                                                while ((i40 + 3) < ax$39.length) {
                                                                    iMeth1_check_sum = (((((long) (ax$39[i40++] & 0xff)) << 24) + (((long) (ax$39[i40++] & 0xff)) << 16)) + (((long) (ax$39[i40++] & 0xff)) << 8)) + ((long) (ax$39[i40++] & 0xff));
                                                                    if (iMeth1_check_sum == 0) {
                                                                        ax$36[i36++] = 'z';
                                                                    } else {
                                                                        iMeth1_check_sum = iMeth1_check_sum;
                                                                        ax$36[i36++] = ((byte) ((iMeth1_check_sum / iMeth1_check_sum) + byFld));
                                                                        iMeth1_check_sum = iMeth1_check_sum % iMeth1_check_sum;
                                                                        ax$36[i36++] = ((byte) ((iMeth1_check_sum / iMeth_check_sum) + byFld));
                                                                        iMeth1_check_sum = iMeth1_check_sum % iMeth_check_sum;
                                                                        ax$36[i36++] = ((byte) ((iMeth1_check_sum / instanceCount) + byFld));
                                                                        iMeth1_check_sum = iMeth1_check_sum % instanceCount;
                                                                        ax$36[i36++] = ((byte) ((iMeth1_check_sum / iMeth_check_sum) + byFld));
                                                                        iMeth1_check_sum = iMeth1_check_sum % iMeth_check_sum;
                                                                        ax$36[i36++] = ((byte) (iMeth1_check_sum + byFld));
                                                                    }
                                                                } 
                                                            } catch (Throwable ax$43) {
                                                            } finally {
                                                            }
                                                            Test.AxOutputRedirectionHelper.recover();
                                                        }
                                                    } finally {
                                                        this.byFld = ax$44;
                                                        Test.instanceCount = ax$45;
                                                        i40 = ax$46;
                                                        Test.iMeth1_check_sum = ax$47;
                                                        i36 = ax$48;
                                                        Test.iMeth_check_sum = ax$49;
                                                    }
                                                }
                                                break;
                                            case 7 :
                                                Test.dArrFld[i36] = iFld1;
                                            case 8 :
                                                Test.iFld += ((int) (Test.instanceCount));
                                            case 9 :
                                                i37 = s1;
                                            case 10 :
                                                i35 *= s1;
                                                break;
                                            case 11 :
                                                s1 -= ((short) (i38));
                                                break;
                                            case 12 :
                                            case 13 :
                                                Test.fFld += Test.instanceCount;
                                                break;
                                            case 14 :
                                                Test.fFld = -55839;
                                                break;
                                        }
                                    case 82 :
                                        if (b2)
                                            break;

                                    case 55 :
                                        i39 += i42;
                                        break;
                                    case 72 :
                                        Test.instanceCount *= Test.instanceCount;
                                        break;
                                    case 68 :
                                        iFld1 += ((int) (Test.instanceCount));
                                        break;
                                    case 66 :
                                        i35 <<= Test.iFld;
                                        break;
                                    default :
                                        i37 /= ((int) (Test.instanceCount | 1));
                                }
                                break;
                            case 61 :
                                i35 *= ((int) (231L));
                                break;
                            case 58 :
                                if (Test.bFld)
                                    break;

                            default :
                                byFld = ((byte) (i34));
                        }
                    }
                }
            }
        }
        FuzzerUtils.out.println((((("i34 i35 s1 = " + i34) + ",") + i35) + ",") + s1);
        FuzzerUtils.out.println((((("i36 i37 i38 = " + i36) + ",") + i37) + ",") + i38);
        FuzzerUtils.out.println((((("i39 i40 i41 = " + i39) + ",") + i40) + ",") + i41);
        FuzzerUtils.out.println((((("i42 i43 b2 = " + i42) + ",") + i43) + ",") + (b2 ? 1 : 0));
        FuzzerUtils.out.println((((("iArr lArr2 fArr3 = " + FuzzerUtils.checkSum(iArr)) + ",") + FuzzerUtils.checkSum(lArr2)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr3)));
        FuzzerUtils.out.println((((("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount) + ",") + Test.iFld) + ",") + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println((((("Test.dFld Test.bFld byFld = " + Double.doubleToLongBits(Test.dFld)) + ",") + (Test.bFld ? 1 : 0)) + ",") + byFld);
        FuzzerUtils.out.println((((("iFld1 Test.byArrFld Test.dArrFld = " + iFld1) + ",") + FuzzerUtils.checkSum(Test.byArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
}