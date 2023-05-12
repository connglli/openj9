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

import java.security.KeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.SignatureException;
import java.security.ProviderException;
import java.security.cert.CertificateParsingException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.InvalidAlgorithmParameterException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.DigestException;
import java.security.InvalidKeyException;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;

public class Test {

    public static final int N = 256;

    public static long instanceCount = -8L;

    public static float fFld = 114.1014F;

    public static byte byFld = 43;

    public static int iFld = 0;

    public static boolean bFld = true;

    public double dFld = 2.109742;

    public static float fFld1 = -48.483F;

    public byte[] byArrFld = new byte[N];

    public static boolean[] bArrFld = new boolean[N];

    public float[] fArrFld = new float[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;

    public static long lMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5, int i6) {
        if (ax$0) {
            int ax$2 = i5;
            try {
                int[] ax$1 = { 0, 1, 2, 3, 0x1234_5678, 0x8000_0000, 0x8000_0001, 0x8000_0002, 0x8000_0003, 0x8765_4321, 0xFFFF_FFFE, 0xFFFF_FFFF };
                // These two accesses MAY ALIAS
                ax$1[i5 - 1]++;
                ax$1[9 - i5]++;
            } catch (Throwable ax$3) {
            } finally {
                i5 = ax$2;
            }
            return;
        }
        int i7 = -14, i8 = -11, i9 = 54, i10 = -99, i11 = -2, i12 = -108, i13 = -39504, i14 = 8143, iArr1[] = new int[N], iArr2[][] = new int[N][N];
        boolean b = false;
        byte by = -76;
        double d = -94.130104;
        short s = 29878;
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr1, 5);
        FuzzerUtils.init(iArr2, 7);
        FuzzerUtils.init(fArr, 0.568F);
        for (i7 = 2; i7 < 121; ++i7) {
            iArr1 = FuzzerUtils.int1array(N, (int) -13);
            i8 = (int) Test.instanceCount;
            iArr1[i7 - 1] ^= (int) Test.instanceCount;
            iArr2 = iArr2;
            for (i9 = 1; 5 > i9; i9 += 3) {
                for (i11 = 5; i11 > 1; i11 -= 2) {
                    i8 >>= i8;
                    Test.instanceCount = 168;
                    if (b)
                        continue;
                    i6 = -56998;
                    i6 &= (int) Test.instanceCount;
                    Test.instanceCount = 59376L;
                    i10 <<= (int) Test.instanceCount;
                    i8 = i6;
                    i6 += (((i11 * i11) + Test.fFld) - Test.instanceCount);
                    Test.fFld = Test.byFld;
                    i12 -= (int) 1.683F;
                    by *= (byte) d;
                    i10 += i12;
                    i6 *= (int) 60305L;
                    d += i7;
                }
                i12 = 168;
                switch((i7 % 10) + 24) {
                    case 24:
                        for (i13 = i7; i13 < 5; i13++) {
                            i5 >>= i7;
                            switch(((i7 % 10) * 5) + 70) {
                                case 80:
                                    i6 = 61637;
                                    Test.instanceCount += i13;
                                    i14 ^= (int) Test.instanceCount;
                                    Test.fFld += (float) d;
                                    fArr[i13] = -11;
                                    i8 = i13;
                                    i6 *= 111;
                                    iArr2[i7 + 1][i7] = (int) 4023351888L;
                                    i14 += i13;
                                    Test.instanceCount *= i10;
                                    break;
                                case 84:
                                    i5 >>= 64147;
                                    break;
                                case 71:
                                    i6 = -7;
                                    break;
                                case 112:
                                    i8 = i12;
                                    break;
                                case 109:
                                    i5 = (int) Test.instanceCount;
                                case 95:
                                    if (false)
                                        continue;
                                    break;
                                case 92:
                                    i5 >>= s;
                                    break;
                                case 118:
                                    i14 >>= i13;
                                    break;
                                case 98:
                                    Test.fFld = i8;
                                case 74:
                                    i10 = (int) Test.instanceCount;
                                    break;
                                default:
                                    if (b)
                                        break;
                            }
                        }
                        break;
                    case 25:
                        i8 = i14;
                        break;
                    case 26:
                        i5 ^= i8;
                        break;
                    case 27:
                        Test.fFld += i10;
                        break;
                    case 28:
                        Test.fFld = i9;
                    case 29:
                        if (i8 != 0) {
                            vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + (b ? 1 : 0) + by + Double.doubleToLongBits(d) + i13 + i14 + s + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                            return;
                        }
                        break;
                    case 30:
                        i14 += (i9 | i8);
                        break;
                    case 31:
                        iArr2[i7][i9] = i9;
                        break;
                    case 32:
                        i5 += (int) 8368681561261088805L;
                    case 33:
                    default:
                        i12 += (((i9 * i7) + Test.byFld) - Test.instanceCount);
                }
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + (b ? 1 : 0) + by + Double.doubleToLongBits(d) + i13 + i14 + s + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth(int i4, long l) {
        if (ax$9) {
            int ax$11 = i4;
            int ax$12 = iFld;
            try {
                java.lang.String[] ax$10 = { "'{'", "'{", "{", "''", "}", "a", "'" };
                if (ax$10.length == 42) {
                    i4 = 34;
                } else {
                    iFld = 32;
                    i4 = 22;
                }
            } catch (Throwable ax$13) {
            } finally {
                i4 = ax$11;
                iFld = ax$12;
            }
            return -3407973656895574212L;
        }
        int i15 = -3, i16 = -11, i17 = -5129, i18 = 56011, i19 = 7408, i20 = 14, i21 = -2, iArr3[] = new int[N];
        double d2 = 47.44656, d3 = -1.86640;
        long l1 = 2L;
        FuzzerUtils.init(iArr3, -14);
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
                ax$0 = true;
                for (int ax$4 = 0; ax$4 < 7752; ax$4 += 1) vMeth1(2032363575, -2043080220);
            } catch (java.lang.Throwable ax$5) {
            } finally {
                ax$0 = false;
            }
            System.setOut(ax$6);
            System.setErr(ax$7);
        }
        vMeth1(0, Test.iFld);
        Test.instanceCount = Test.iFld;
        l *= Test.iFld;
        i15 = 199;
        do {
            Test.bFld = Test.bFld;
            iArr3[i15] >>= (int) Test.instanceCount;
            iArr3 = iArr3;
            for (i16 = 1; i16 < 8; i16++) {
                Test.iFld += (i16 + l);
                iArr3[i15] &= i15;
                Test.iFld = i16;
            }
            i18 -= i16;
            for (i19 = 1; i19 < 8; ++i19) {
                double d1 = 0.13671;
                Test.iFld = i4;
                l <<= i17;
                i17 = i4;
                i20 >>= -192;
                d1 += 64124;
                iArr3[i15] = i20;
                Test.instanceCount = Test.instanceCount;
                i20 += (((i19 * Test.iFld) + i15) - i18);
            }
            if (Test.bFld) {
                i18 = Test.byFld;
                iArr3[i15] += (int) 48275L;
                for (d2 = 1; d2 < 8; ++d2) {
                    int i22 = -145;
                    d3 += i16;
                    Test.instanceCount = i20;
                    Test.byFld += (byte) (((d2 * Test.byFld) + l) - i4);
                    i21 = i22;
                    l *= i20;
                    i18 = i20;
                    Test.byFld = (byte) l;
                    l1 = 1;
                    do {
                        Test.instanceCount = -60456;
                        i21 += (int) l1;
                        l -= i20;
                        i20 = (int) Test.instanceCount;
                    } while (++l1 < 2);
                }
            } else if (Test.bFld) {
                i18 -= (int) Test.fFld;
            } else if (Test.bFld) {
                l = i15;
            } else {
                if (Test.bFld)
                    break;
            }
        } while ((i15 -= 3) > 0);
        long meth_res = i4 + l + i15 + i16 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(d2) + i21 + Double.doubleToLongBits(d3) + l1 + FuzzerUtils.checkSum(iArr3);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public void vMeth(int i, float f, int i1) {
        if (ax$19) {
            try {
                java.lang.String ax$43 = "1.449910930627067E-24";
                java.lang.Exception ax$52 = new Exception();
                SecurityException ax$53 = new SecurityException(ax$52);
                if (!ax$53.getCause().equals(ax$52)) {
                }
                ax$53 = new SecurityException(ax$43, ax$52);
                if (!ax$53.getMessage().equals(ax$43) || !ax$53.getCause().equals(ax$52)) {
                }
                DigestException ax$44 = new DigestException(ax$52);
                if (!ax$44.getCause().equals(ax$52)) {
                }
                ax$44 = new DigestException(ax$43, ax$52);
                if (!ax$44.getMessage().equals(ax$43) || !ax$44.getCause().equals(ax$52)) {
                }
                GeneralSecurityException ax$55 = new GeneralSecurityException(ax$52);
                if (!ax$55.getCause().equals(ax$52)) {
                }
                ax$55 = new GeneralSecurityException(ax$43, ax$52);
                if (!ax$55.getMessage().equals(ax$43) || !ax$55.getCause().equals(ax$52)) {
                }
                InvalidAlgorithmParameterException ax$59 = new InvalidAlgorithmParameterException(ax$52);
                if (!ax$59.getCause().equals(ax$52)) {
                }
                ax$59 = new InvalidAlgorithmParameterException(ax$43, ax$52);
                if (!ax$59.getMessage().equals(ax$43) || !ax$59.getCause().equals(ax$52)) {
                }
                InvalidKeyException ax$46 = new InvalidKeyException(ax$52);
                if (!ax$46.getCause().equals(ax$52)) {
                }
                ax$46 = new InvalidKeyException(ax$43, ax$52);
                if (!ax$46.getMessage().equals(ax$43) || !ax$46.getCause().equals(ax$52)) {
                }
                InvalidKeySpecException ax$50 = new InvalidKeySpecException(ax$52);
                if (!ax$50.getCause().equals(ax$52)) {
                }
                ax$50 = new InvalidKeySpecException(ax$43, ax$52);
                if (!ax$50.getMessage().equals(ax$43) || !ax$50.getCause().equals(ax$52)) {
                }
                KeyException ax$57 = new KeyException(ax$52);
                if (!ax$57.getCause().equals(ax$52)) {
                }
                ax$57 = new KeyException(ax$43, ax$52);
                if (!ax$57.getMessage().equals(ax$43) || !ax$57.getCause().equals(ax$52)) {
                }
                KeyManagementException ax$47 = new KeyManagementException(ax$52);
                if (!ax$47.getCause().equals(ax$52)) {
                }
                ax$47 = new KeyManagementException(ax$43, ax$52);
                if (!ax$47.getMessage().equals(ax$43) || !ax$47.getCause().equals(ax$52)) {
                }
                KeyStoreException ax$60 = new KeyStoreException(ax$52);
                if (!ax$60.getCause().equals(ax$52)) {
                }
                ax$60 = new KeyStoreException(ax$43, ax$52);
                if (!ax$60.getMessage().equals(ax$43) || !ax$60.getCause().equals(ax$52)) {
                }
                NoSuchAlgorithmException ax$58 = new NoSuchAlgorithmException(ax$52);
                if (!ax$58.getCause().equals(ax$52)) {
                }
                ax$58 = new NoSuchAlgorithmException(ax$43, ax$52);
                if (!ax$58.getMessage().equals(ax$43) || !ax$58.getCause().equals(ax$52)) {
                }
                ProviderException ax$54 = new ProviderException(ax$52);
                if (!ax$54.getCause().equals(ax$52)) {
                }
                ax$54 = new ProviderException(ax$43, ax$52);
                if (!ax$54.getMessage().equals(ax$43) || !ax$54.getCause().equals(ax$52)) {
                }
                SignatureException ax$45 = new SignatureException(ax$52);
                if (!ax$45.getCause().equals(ax$52)) {
                }
                ax$45 = new SignatureException(ax$43, ax$52);
                if (!ax$45.getMessage().equals(ax$43) || !ax$45.getCause().equals(ax$52)) {
                }
                CRLException ax$51 = new CRLException(ax$52);
                if (!ax$51.getCause().equals(ax$52)) {
                }
                ax$51 = new CRLException(ax$43, ax$52);
                if (!ax$51.getMessage().equals(ax$43) || !ax$51.getCause().equals(ax$52)) {
                }
                CertificateException ax$48 = new CertificateException(ax$52);
                if (!ax$48.getCause().equals(ax$52)) {
                }
                ax$48 = new CertificateException(ax$43, ax$52);
                if (!ax$48.getMessage().equals(ax$43) || !ax$48.getCause().equals(ax$52)) {
                }
                CertificateParsingException ax$56 = new CertificateParsingException(ax$52);
                if (!ax$56.getCause().equals(ax$52)) {
                }
                ax$56 = new CertificateParsingException(ax$43, ax$52);
                if (!ax$56.getMessage().equals(ax$43) || !ax$56.getCause().equals(ax$52)) {
                }
                CertificateEncodingException ax$49 = new CertificateEncodingException(ax$52);
                if (!ax$49.getCause().equals(ax$52)) {
                }
                ax$49 = new CertificateEncodingException(ax$43, ax$52);
                if (!ax$49.getMessage().equals(ax$43) || !ax$49.getCause().equals(ax$52)) {
                }
            } catch (Throwable ax$61) {
            } finally {
            }
            return;
        }
        int i2 = -4, i3 = 14, i23 = 9240, i24 = -5, i25 = 52550, iArr[] = new int[N];
        float f1 = 1.260F;
        double d4 = -96.50453;
        short s1 = -14698;
        long l2 = -2163631936L, lArr[] = new long[N];
        FuzzerUtils.init(iArr, 214);
        FuzzerUtils.init(lArr, -2172883779L);
        for (i2 = 168; i2 > 10; i2--) {
            i1 <<= (int) ((iArr[i2 + 1] + Test.instanceCount) - (lMeth(-54964, Test.instanceCount) - i1));
            lArr[i2] >>= Test.byFld;
            i = (int) Test.instanceCount;
            for (i23 = 4; i2 < i23; i23 -= 3) {
                for (f1 = 1; f1 < 1; f1++) {
                    Test.fFld += (((f1 * i25) + Test.instanceCount) - Test.fFld);
                    i += i23;
                    d4 += i;
                    s1 |= (short) i24;
                    if (Test.bFld)
                        continue;
                    i += Test.iFld;
                    i25 >>>= i3;
                    switch(((i23 % 1) * 5) + 105) {
                        case 110:
                            byArrFld[i2 + 1] <<= (byte) Test.iFld;
                            i25 -= Test.byFld;
                            lArr = lArr;
                            i24 += (int) (((f1 * i2) + i1) - Test.instanceCount);
                            f = -8;
                            Test.bArrFld[(int) (f1 - 1)] = Test.bFld;
                            i1 = (int) Test.instanceCount;
                            d4 -= i3;
                            i += i24;
                            Test.iFld -= i25;
                            iArr[(int) (f1)] -= i2;
                            Test.fFld += (f1 - i1);
                            switch(((i1 >>> 1) % 9) + 72) {
                                case 72:
                                    Test.byFld = (byte) Test.instanceCount;
                                    i3 *= (int) d4;
                                    d4 -= -241L;
                                    i3 = (int) -81.126388;
                                    break;
                                case 73:
                                    i25 %= (int) (Test.instanceCount | 1);
                                    i1 = i25;
                                    Test.instanceCount >>= -6;
                                    Test.instanceCount += (long) (((f1 * i24) + Test.iFld) - i23);
                                    Test.bFld = Test.bFld;
                                    Test.iFld += (int) d4;
                                    break;
                                case 74:
                                    Test.instanceCount += (long) (f1 + Test.iFld);
                                    break;
                                case 75:
                                    l2 >>= -22;
                                    break;
                                case 76:
                                case 77:
                                    Test.fFld -= i;
                                    break;
                                case 78:
                                    i1 *= Test.iFld;
                                    break;
                                case 79:
                                    i1 += (int) (((f1 * i23) + i3) - i2);
                                    break;
                                case 80:
                                    i3 <<= 3;
                                    break;
                                default:
                                    Test.instanceCount -= i1;
                            }
                            break;
                    }
                }
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + i2 + i3 + i23 + i24 + Float.floatToIntBits(f1) + i25 + Double.doubleToLongBits(d4) + s1 + l2 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {
        float f2 = 100.495F;
        int i26 = -172, i27 = -44469, i28 = 11, i29 = 186, i30 = -1, i31 = 64, i32 = -182, iArr4[] = new int[N];
        short s2 = 10319, sArr[] = new short[N];
        boolean b1 = false;
        long l3 = 12L, lArr1[] = new long[N];
        FuzzerUtils.init(iArr4, 75);
        FuzzerUtils.init(lArr1, 42658L);
        FuzzerUtils.init(sArr, (short) 13817);
        {
            java.io.PrintStream ax$64 = System.out;
            java.io.PrintStream ax$65 = System.err;
            java.io.PrintStream ax$66 = new java.io.PrintStream(new java.io.OutputStream() {

                @Override
                public void write(int b) throws java.io.IOException {
                    // DO NOTHING: DISCARD ALL OUTPUTS
                }
            });
            System.setOut(ax$66);
            System.setErr(ax$66);
            try {
                ax$19 = true;
                for (int ax$62 = 0; ax$62 < 7632; ax$62 += 1) vMeth(174405981, (float) 0.9873145720147848, -1319955284);
            } catch (java.lang.Throwable ax$63) {
            } finally {
                ax$19 = false;
            }
            System.setOut(ax$64);
            System.setErr(ax$65);
        }
        vMeth(Test.iFld, Test.fFld, -13);
        for (f2 = 7; f2 < 130; f2++) {
            for (i27 = (int) (f2); i27 < 41; ++i27) {
                Test.instanceCount += i27;
                Test.byFld += (byte) (-2.584F + (i27 * i27));
                iArr4[i27 - 1] >>= i27;
                i29 += (i27 * i27);
                for (i30 = 1; 1 < i30; --i30) {
                    float f3 = 0.69F;
                    s2 += (short) (22374 + (i30 * i30));
                    iArr4[i27] *= -81;
                    try {
                        iArr4[i27 - 1] = (i29 % -1296454189);
                        Test.iFld = (i32 / 23);
                        i32 = (Test.iFld % i29);
                    } catch (ArithmeticException a_e) {
                    }
                    fArrFld[i27] = i31;
                    dFld -= Test.fFld1;
                    Test.iFld ^= (int) Test.instanceCount;
                    iArr4[i27 - 1] >>>= i31;
                    Test.instanceCount = i27;
                    switch(((i31 >>> 1) % 10) + 117) {
                        case 117:
                            Test.instanceCount ^= 133;
                            Test.instanceCount %= ((long) (Test.fFld) | 1);
                            switch((int) ((f2 % 5) + 62)) {
                                case 62:
                                    iArr4[i27 + 1] += (int) -2.520F;
                                    lArr1 = lArr1;
                                    iArr4 = iArr4;
                                    i26 >>>= i32;
                                    i29 = (int) Test.instanceCount;
                                    i31 <<= 193;
                                    i26 += s2;
                                    break;
                                case 63:
                                    i31 <<= i29;
                                    b1 = Test.bFld;
                                    i26 &= (int) Test.instanceCount;
                                    i29 += Test.iFld;
                                    iArr4[(int) (f2 + 1)] *= i29;
                                    Test.fFld = -197;
                                    Test.byFld = (byte) Test.iFld;
                                    Test.byFld -= (byte) Test.instanceCount;
                                    Test.instanceCount += i30;
                                    lArr1[(int) (f2)] = Test.instanceCount;
                                    Test.instanceCount <<= i32;
                                    i32 |= i32;
                                    i31 -= (int) Test.fFld;
                                    i31 |= Test.byFld;
                                    i32 = i30;
                                case 64:
                                    s2 += (short) (((i30 * i28) + i27) - Test.instanceCount);
                                    b1 = Test.bFld;
                                    Test.bFld = b1;
                                    Test.instanceCount |= Test.instanceCount;
                                    i32 <<= i29;
                                    i32 = i29;
                                    i29 = i32;
                                    switch(((i31 >>> 1) % 4) + 99) {
                                        case 99:
                                            Test.instanceCount -= i31;
                                            iArr4[i27 + 1] -= (int) Test.instanceCount;
                                            switch(((i28 >>> 1) % 2) + 86) {
                                                case 86:
                                                    Test.instanceCount = Test.instanceCount;
                                                    Test.fFld1 = i28;
                                                    Test.fFld1 = Test.instanceCount;
                                                case 87:
                                                    Test.byFld <<= (byte) i26;
                                                    i31 -= i26;
                                                    Test.instanceCount += (((i30 * i26) + Test.fFld) - i31);
                                                    switch(((i30 % 7) * 5) + 124) {
                                                        case 151:
                                                            iArr4[(int) (f2)] = (int) Test.instanceCount;
                                                            Test.fFld1 += (-52065 + (i30 * i30));
                                                            i32 += i30;
                                                            break;
                                                        case 131:
                                                            i32 &= (int) Test.instanceCount;
                                                            i28 -= i29;
                                                            switch((i27 % 5) + 114) {
                                                                case 114:
                                                                    i29 >>= Test.byFld;
                                                                    Test.instanceCount |= i27;
                                                                    switch((((i31 >>> 1) % 8) * 5) + 90) {
                                                                        case 115:
                                                                            i31 *= (int) Test.fFld;
                                                                            iArr4[i27 - 1] = i32;
                                                                            if (b1)
                                                                                continue;
                                                                            Test.fFld1 += Test.instanceCount;
                                                                            iArr4[(int) (f2)] *= i28;
                                                                            iArr4[(int) (f2 - 1)] *= i28;
                                                                            break;
                                                                        case 117:
                                                                            i31 = i26;
                                                                            break;
                                                                        case 91:
                                                                            dFld += l3;
                                                                        case 100:
                                                                        case 111:
                                                                            i31 >>= (int) Test.instanceCount;
                                                                            break;
                                                                        case 106:
                                                                            Test.byFld = (byte) i31;
                                                                        case 92:
                                                                            lArr1[i30] = i31;
                                                                            break;
                                                                        case 94:
                                                                        default:
                                                                            Test.iFld = i26;
                                                                    }
                                                                case 115:
                                                                    s2 <<= (short) i30;
                                                                    break;
                                                                case 116:
                                                                    if (Test.bFld)
                                                                        continue;
                                                                    break;
                                                                case 117:
                                                                    l3 += (i30 * Test.fFld1);
                                                                    break;
                                                                case 118:
                                                                    i28 += (((i30 * i29) + l3) - f3);
                                                                    break;
                                                                default:
                                                                    i31 = (int) dFld;
                                                            }
                                                            break;
                                                        case 152:
                                                            i26 >>= Test.iFld;
                                                        case 154:
                                                            Test.instanceCount *= Test.instanceCount;
                                                        case 158:
                                                            i28 = i32;
                                                            break;
                                                        case 125:
                                                            Test.byFld += (byte) (i30 | l3);
                                                        case 147:
                                                            try {
                                                                i29 = (Test.iFld / -9141);
                                                                i29 = (iArr4[i27 - 1] % iArr4[(int) (f2 - 1)]);
                                                                Test.iFld = (-32859 % iArr4[i27]);
                                                            } catch (ArithmeticException a_e) {
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case 100:
                                            Test.instanceCount += (i30 | i29);
                                            break;
                                        case 101:
                                        case 102:
                                            Test.fFld += (i30 * i30);
                                            break;
                                        default:
                                            iArr4 = FuzzerUtils.int1array(N, (int) 41819);
                                    }
                                    break;
                                case 65:
                                case 66:
                                    if (false)
                                        break;
                                    break;
                            }
                        case 118:
                            lArr1[i30 + 1] -= i26;
                            break;
                        case 119:
                            if (b1)
                                break;
                            break;
                        case 120:
                            i26 += i27;
                            break;
                        case 121:
                            iArr4[i27 + 1] >>= i30;
                            break;
                        case 122:
                            iArr4[(int) (f2 - 1)] = i28;
                            break;
                        case 123:
                            i26 += (int) (0.586F + (i30 * i30));
                            break;
                        case 124:
                            i32 -= s2;
                            break;
                        case 125:
                            i28 += (((i30 * i28) + i32) - i26);
                            break;
                        case 126:
                            sArr[i30 - 1] += (short) i31;
                            break;
                        default:
                            i31 += (int) (8567435370940903802L + (i30 * i30));
                    }
                }
            }
        }
        FuzzerUtils.out.println("f2 i26 i27 = " + Float.floatToIntBits(f2) + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 s2 i32 = " + i31 + "," + s2 + "," + i32);
        FuzzerUtils.out.println("b1 l3 iArr4 = " + (b1 ? 1 : 0) + "," + l3 + "," + FuzzerUtils.checkSum(iArr4));
        FuzzerUtils.out.println("lArr1 sArr = " + FuzzerUtils.checkSum(lArr1) + "," + FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," + Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld Test.bFld dFld = " + Test.iFld + "," + (Test.bFld ? 1 : 0) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.fFld1 byArrFld Test.bArrFld = " + Float.floatToIntBits(Test.fFld1) + "," + FuzzerUtils.checkSum(byArrFld) + "," + FuzzerUtils.checkSum(Test.bArrFld));
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
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
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    private static Boolean ax$0 = false;

    private static Boolean ax$9 = false;

    private static Boolean ax$19 = false;
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

