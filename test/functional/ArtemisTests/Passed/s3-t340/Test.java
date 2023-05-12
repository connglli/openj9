// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.

import java.security.KeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.SignatureException;
import java.security.cert.CertificateParsingException;
import java.security.ProviderException;
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

    public static long instanceCount = -2L;

    public float fFld = -113.418F;

    public static volatile short sFld = 9334;

    public static byte byFld = -14;

    public static int iFld = 249;

    public byte byFld1 = -3;

    public int iFld1 = 33440;

    public static long[] lArrFld = new long[N];

    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 83L);
        FuzzerUtils.init(Test.iArrFld, -61);
    }

    public static long iMeth_check_sum = 0;

    public static long iMeth1_check_sum = 0;

    public static long byMeth_check_sum = 0;

    public static byte byMeth(float f, int i7) {
        long l = 5868640551173186163L;
        int i8 = 0, i9 = -69, i10 = -40, i11 = -18700, iArr1[] = new int[N];
        boolean b = false;
        byte[] byArr = new byte[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(byArr, (byte) -118);
        FuzzerUtils.init(fArr, -45.587F);
        FuzzerUtils.init(iArr1, 17739);
        for (l = 192; 6 < l; l--) {
            for (i9 = 1; 3 > i9; i9++) {
                i10 += (((i9 * Test.instanceCount) + Test.instanceCount) - f);
                f += (((i9 * l) + f) - f);
                i8 = i10;
                i11 = 1;
                while (++i11 < 2) {
                    i10 += i11;
                    i8 = i8;
                    Test.instanceCount += (i11 + i10);
                    Test.instanceCount -= -2490210779L;
                    switch((i9 % 4) + 81) {
                        case 81:
                            f += -33323;
                            if (b)
                                continue;
                            if (i10 != 0) {
                            }
                            i7 = Test.sFld;
                            break;
                        case 82:
                            f = -52;
                            i7 += (23841 + (i11 * i11));
                            if (b)
                                break;
                            Test.instanceCount += i11;
                            i10 = i9;
                            break;
                        case 83:
                        case 84:
                            f += (110.933F + (i11 * i11));
                            i7 += Test.byFld;
                            switch((i9 % 4) + 70) {
                                case 70:
                                    byArr = byArr;
                                    Test.instanceCount += (i11 * i10);
                                    fArr[i11 - 1] -= 0.2F;
                                    if (b)
                                        break;
                                    iArr1[i11 + 1] += Test.byFld;
                                    break;
                                case 71:
                                    i10 = Test.byFld;
                                    Test.sFld >>= (short) i8;
                                    fArr = fArr;
                                    if (i8 != 0) {
                                    }
                                    byArr[(int) (l)] = (byte) 113;
                                    break;
                                case 72:
                                    Test.byFld *= (byte) Test.sFld;
                                    b = b;
                                    Test.instanceCount += (i11 ^ i7);
                                    i7 += i10;
                                    break;
                                case 73:
                                    i7 = i9;
                                    break;
                                default:
                                    i7 <<= i11;
                            }
                            break;
                        default:
                            i7 = Test.sFld;
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i7 + l + i8 + i9 + i10 + i11 + (b ? 1 : 0) + FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
        byMeth_check_sum += meth_res;
        return (byte) meth_res;
    }

    public static int iMeth1(int i6) {
        if (ax$15) {
            try {
                java.lang.String ax$16 = "3.672949986886802E-26";
                java.lang.Exception ax$25 = new RuntimeException();
                SecurityException ax$26 = new SecurityException(ax$25);
                if (!ax$26.getCause().equals(ax$25)) {
                }
                ax$26 = new SecurityException(ax$16, ax$25);
                if (!ax$26.getMessage().equals(ax$16) || !ax$26.getCause().equals(ax$25)) {
                }
                DigestException ax$17 = new DigestException(ax$25);
                if (!ax$17.getCause().equals(ax$25)) {
                }
                ax$17 = new DigestException(ax$16, ax$25);
                if (!ax$17.getMessage().equals(ax$16) || !ax$17.getCause().equals(ax$25)) {
                }
                GeneralSecurityException ax$28 = new GeneralSecurityException(ax$25);
                if (!ax$28.getCause().equals(ax$25)) {
                }
                ax$28 = new GeneralSecurityException(ax$16, ax$25);
                if (!ax$28.getMessage().equals(ax$16) || !ax$28.getCause().equals(ax$25)) {
                }
                InvalidAlgorithmParameterException ax$32 = new InvalidAlgorithmParameterException(ax$25);
                if (!ax$32.getCause().equals(ax$25)) {
                }
                ax$32 = new InvalidAlgorithmParameterException(ax$16, ax$25);
                if (!ax$32.getMessage().equals(ax$16) || !ax$32.getCause().equals(ax$25)) {
                }
                InvalidKeyException ax$19 = new InvalidKeyException(ax$25);
                if (!ax$19.getCause().equals(ax$25)) {
                }
                ax$19 = new InvalidKeyException(ax$16, ax$25);
                if (!ax$19.getMessage().equals(ax$16) || !ax$19.getCause().equals(ax$25)) {
                }
                InvalidKeySpecException ax$23 = new InvalidKeySpecException(ax$25);
                if (!ax$23.getCause().equals(ax$25)) {
                }
                ax$23 = new InvalidKeySpecException(ax$16, ax$25);
                if (!ax$23.getMessage().equals(ax$16) || !ax$23.getCause().equals(ax$25)) {
                }
                KeyException ax$30 = new KeyException(ax$25);
                if (!ax$30.getCause().equals(ax$25)) {
                }
                ax$30 = new KeyException(ax$16, ax$25);
                if (!ax$30.getMessage().equals(ax$16) || !ax$30.getCause().equals(ax$25)) {
                }
                KeyManagementException ax$20 = new KeyManagementException(ax$25);
                if (!ax$20.getCause().equals(ax$25)) {
                }
                ax$20 = new KeyManagementException(ax$16, ax$25);
                if (!ax$20.getMessage().equals(ax$16) || !ax$20.getCause().equals(ax$25)) {
                }
                KeyStoreException ax$33 = new KeyStoreException(ax$25);
                if (!ax$33.getCause().equals(ax$25)) {
                }
                ax$33 = new KeyStoreException(ax$16, ax$25);
                if (!ax$33.getMessage().equals(ax$16) || !ax$33.getCause().equals(ax$25)) {
                }
                NoSuchAlgorithmException ax$31 = new NoSuchAlgorithmException(ax$25);
                if (!ax$31.getCause().equals(ax$25)) {
                }
                ax$31 = new NoSuchAlgorithmException(ax$16, ax$25);
                if (!ax$31.getMessage().equals(ax$16) || !ax$31.getCause().equals(ax$25)) {
                }
                ProviderException ax$27 = new ProviderException(ax$25);
                if (!ax$27.getCause().equals(ax$25)) {
                }
                ax$27 = new ProviderException(ax$16, ax$25);
                if (!ax$27.getMessage().equals(ax$16) || !ax$27.getCause().equals(ax$25)) {
                }
                SignatureException ax$18 = new SignatureException(ax$25);
                if (!ax$18.getCause().equals(ax$25)) {
                }
                ax$18 = new SignatureException(ax$16, ax$25);
                if (!ax$18.getMessage().equals(ax$16) || !ax$18.getCause().equals(ax$25)) {
                }
                CRLException ax$24 = new CRLException(ax$25);
                if (!ax$24.getCause().equals(ax$25)) {
                }
                ax$24 = new CRLException(ax$16, ax$25);
                if (!ax$24.getMessage().equals(ax$16) || !ax$24.getCause().equals(ax$25)) {
                }
                CertificateException ax$21 = new CertificateException(ax$25);
                if (!ax$21.getCause().equals(ax$25)) {
                }
                ax$21 = new CertificateException(ax$16, ax$25);
                if (!ax$21.getMessage().equals(ax$16) || !ax$21.getCause().equals(ax$25)) {
                }
                CertificateParsingException ax$29 = new CertificateParsingException(ax$25);
                if (!ax$29.getCause().equals(ax$25)) {
                }
                ax$29 = new CertificateParsingException(ax$16, ax$25);
                if (!ax$29.getMessage().equals(ax$16) || !ax$29.getCause().equals(ax$25)) {
                }
                CertificateEncodingException ax$22 = new CertificateEncodingException(ax$25);
                if (!ax$22.getCause().equals(ax$25)) {
                }
                ax$22 = new CertificateEncodingException(ax$16, ax$25);
                if (!ax$22.getMessage().equals(ax$16) || !ax$22.getCause().equals(ax$25)) {
                }
            } catch (Throwable ax$34) {
            } finally {
            }
            return 663402621;
        }
        int i12 = 12, i13 = -99, i14 = -9, i15 = 7, iArr2[] = new int[N];
        float f1 = -88.321F, f2 = -2.634F;
        double d = 0.7174, dArr[] = new double[N];
        boolean b2 = true;
        long[] lArr = new long[N];
        FuzzerUtils.init(iArr2, -12);
        FuzzerUtils.init(dArr, 1.56150);
        FuzzerUtils.init(lArr, 4L);
        byMeth(0.825F, i6);
        if (b2) {
            for (i12 = 5; 197 > i12; i12++) {
                boolean b1 = true;
                switch((i12 % 8) + 61) {
                    case 61:
                        i13 *= 27936;
                        if (false)
                            break;
                        f1 += Test.instanceCount;
                        switch((i12 % 1) + 119) {
                            case 119:
                        }
                        if (i13 != 0) {
                        }
                        break;
                    case 62:
                        iArr2[i12 - 1] += (int) 4L;
                        if (b1) {
                            Test.byFld -= (byte) Test.instanceCount;
                            i6 = i13;
                        } else if (b1) {
                            i6 = i12;
                            i6 = i13;
                            i13 += i12;
                            Test.lArrFld[i12 + 1] = i6;
                            i6 += i12;
                            Test.instanceCount *= 67;
                        }
                        switch(((112 >>> 1) % 7) + 56) {
                            case 56:
                            case 57:
                                Test.instanceCount -= i13;
                                b1 = b1;
                                switch((i12 % 10) + 72) {
                                    case 72:
                                        for (f2 = i12; f2 < 3; f2++) {
                                            i13 *= -159;
                                            d -= f1;
                                            dArr = dArr;
                                            i6 = i12;
                                            i13 -= (int) 890615467776591489L;
                                            if (b1)
                                                break;
                                            d = i6;
                                            switch((int) ((f2 % 2) + 17)) {
                                                case 17:
                                                    switch((int) (((f2 % 1) * 5) + 83)) {
                                                        case 87:
                                                            f1 -= -63666;
                                                            Test.instanceCount >>= Test.instanceCount;
                                                            i6 += (int) (f2 + f1);
                                                            Test.sFld *= Test.byFld;
                                                        default:
                                                            Test.instanceCount -= (long) f2;
                                                    }
                                                case 18:
                                                    i14 *= i14;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 73:
                                        i6 += i12;
                                        break;
                                    case 74:
                                        Test.lArrFld[i12 + 1] /= (Test.iFld | 1);
                                        break;
                                    case 75:
                                        Test.instanceCount &= i12;
                                        break;
                                    case 76:
                                        Test.instanceCount *= i13;
                                    case 77:
                                        i6 += (i12 * i12);
                                    case 78:
                                        Test.sFld <<= (short) i6;
                                        break;
                                    case 79:
                                        i6 *= Test.iFld;
                                    case 80:
                                        b1 = b1;
                                    case 81:
                                        Test.iArrFld[i12 + 1] = Test.byFld;
                                }
                            case 58:
                            case 59:
                                Test.iFld >>= (int) Test.instanceCount;
                                break;
                            case 60:
                                i6 = (int) d;
                                break;
                            case 61:
                                i6 += (i12 - Test.instanceCount);
                            case 62:
                                i14 *= i12;
                                break;
                            default:
                                if (Test.iFld != 0) {
                                }
                        }
                        break;
                    case 63:
                        Test.byFld += (byte) i12;
                    case 64:
                        lArr[i12] = 8589213896922650055L;
                        break;
                    case 65:
                        Test.lArrFld = lArr;
                        break;
                    case 66:
                        i6 += i12;
                        break;
                    case 67:
                        i6 %= (int) (i14 | 1);
                        break;
                    case 68:
                        Test.instanceCount -= i15;
                        break;
                    default:
                        iArr2[i12] = Test.iFld;
                }
            }
        } else if (b2) {
            d -= i14;
        }
        long meth_res = i6 + i12 + i13 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i14 + Double.doubleToLongBits(d) + i15 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth() {
        int i4 = -83, i5 = -14, i16 = 2259, i17 = 81, i18 = -31, i19 = -4313, i20 = 9, i21 = -58372, i22 = 203, i23 = 77, i24 = 101, i25 = -88, iArr[] = new int[N];
        float f3 = 2.851F;
        boolean b3 = true, bArr[] = new boolean[N];
        double d1 = 1.75120, dArr1[][] = new double[N][N];
        FuzzerUtils.init(iArr, -8);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(dArr1, -41.29862);
        for (i4 = 14; i4 < 230; i4++) {
            i5 <<= (int) (Float.intBitsToFloat(iArr[i4]) * (~(12838 + iMeth1(i5))));
            Test.iFld = (int) Test.instanceCount;
            for (i16 = 1; i16 < 3; ++i16) {
                if (b3) {
                    Test.sFld = (short) Test.instanceCount;
                    for (i18 = i16; i18 < 2; ++i18) {
                        Test.sFld = (short) -6780859707779889594L;
                    }
                    i5 += i16;
                    Test.byFld += (byte) (i16 - Test.iFld);
                    Test.iFld <<= (int) Test.instanceCount;
                    {
                        java.io.PrintStream ax$0 = System.out;
                        java.io.PrintStream ax$1 = System.err;
                        java.io.PrintStream ax$2 = new java.io.PrintStream(new java.io.OutputStream() {

                            @Override
                            public void write(int b) throws java.io.IOException {
                                // DO NOTHING: DISCARD ALL OUTPUTS
                            }
                        });
                        System.setOut(ax$2);
                        System.setErr(ax$2);
                        {
                            boolean ax$6 = false;
                            for (int ax$5 = -745; ax$5 < 7779; ax$5 += 8) {
                                if (!ax$6) {
                                    ax$6 = true;
                                    {
                                        System.setOut(ax$0);
                                        System.setErr(ax$1);
                                        for (i20 = 1; i20 < 2; ++i20) {
                                            i19 += (-55923 + (i20 * i20));
                                            iArr[i4 + 1] = i20;
                                            iArr[i4] = i21;
                                            if (false) {
                                                f3 = Test.iFld;
                                                bArr[i16 - 1] = b3;
                                                i22 = i4;
                                                Test.instanceCount -= -32289;
                                            }
                                            Test.lArrFld[i20 + 1] -= -4;
                                            i19 -= (int) Test.instanceCount;
                                            f3 %= ((long) (d1) | 1);
                                            Test.instanceCount = i5;
                                            i5 >>= i23;
                                        }
                                        System.setOut(ax$2);
                                        System.setErr(ax$2);
                                    }
                                }
                                try {
                                    java.lang.Object[] ax$3 = new String[2];
                                    if (ax$3[1] != null)
                                        ;
                                } catch (Throwable ax$4) {
                                } finally {
                                }
                            }
                        }
                        System.setOut(ax$0);
                        System.setErr(ax$1);
                    }
                    i22 += i21;
                    Test.sFld = (short) i23;
                    i5 |= i20;
                    for (i24 = i16; i24 < 2; ++i24) {
                        i23 = i19;
                        switch((i4 % 2) + 45) {
                            case 45:
                                f3 -= Test.instanceCount;
                                if (b3)
                                    continue;
                                iArr[i24] = 52;
                                i21 += i24;
                                f3 *= i17;
                                i23 &= i19;
                                break;
                            case 46:
                                d1 += i18;
                                break;
                            default:
                                i19 += (int) -67.299F;
                        }
                    }
                } else {
                    dArr1[i16][i16] += Test.instanceCount;
                }
            }
        }
        long meth_res = i4 + i5 + i16 + i17 + i18 + i19 + i20 + i21 + Float.floatToIntBits(f3) + (b3 ? 1 : 0) + i22 + Double.doubleToLongBits(d1) + i23 + i24 + i25 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {
        if (ax$40) {
            int ax$43 = iFld;
            try {
                byte[] ax$41 = new byte[0];
                int ax$42 = 27467;
                while (ax$42-- > 0) {
                    ax$41[iFld++] = (byte) 0xff;
                }
            } catch (Throwable ax$44) {
            } finally {
                iFld = ax$43;
            }
            return;
        }
        int i = 53, i1 = -12, i2 = 133, i3 = -15627, i26 = 64555, i27 = 194, i28 = -3, i29 = -7, i31 = 157, iArr3[][] = new int[N][N];
        boolean b4 = false;
        double d2 = 1.39029, d3 = -2.14163;
        byte[] byArr1 = new byte[N];
        float[] fArr1 = new float[N];
        FuzzerUtils.init(iArr3, -44435);
        FuzzerUtils.init(byArr1, (byte) -30);
        FuzzerUtils.init(fArr1, 1.261F);
        i = 1;
        do {
            i1 <<= (int) (((++Test.lArrFld[i - 1]) + (fFld - Test.instanceCount)) - ((-(++i1)) + i));
            i1 *= (i1++);
            i1 -= (i1++);
        } while ((i += 3) < 235);
        for (i2 = 6; i2 < 235; ++i2) {
            Test.lArrFld[i2] = (long) ((-(Test.instanceCount * i)) - ((Test.instanceCount * fFld) * Test.lArrFld[i2]));
            i3 *= (iMeth() + Test.iFld);
            try {
                i3 = (i / Test.iArrFld[i2 + 1]);
                i3 = (i1 / -20915);
                Test.iFld = (i1 / 157);
            } catch (ArithmeticException a_e) {
            }
            if (b4)
                break;
            i3 = Test.sFld;
            d2 += Test.byFld;
            Test.iArrFld = Test.iArrFld;
            i3 *= Test.iFld;
            Test.iFld <<= (int) Test.instanceCount;
        }
        iArr3 = iArr3;
        for (long l1 : Test.lArrFld) {
            Test.iFld &= i;
        }
        i26 = 1;
        while (++i26 < 79) {
            for (d3 = 2; d3 < 64; ++d3) {
                for (i28 = 1; i28 < 2; i28++) {
                    int i30 = -58595;
                    switch(((i28 % 2) * 5) + 74) {
                        case 79:
                            i27 *= Test.sFld;
                            fFld -= fFld;
                            i29 = i2;
                            Test.instanceCount = i1;
                            Test.iFld += i28;
                            fFld -= i29;
                            Test.instanceCount -= 18860;
                            Test.instanceCount <<= Test.iFld;
                            i1 %= (int) (Test.instanceCount | 1);
                            Test.iArrFld[(int) (d3)] -= byFld1;
                            Test.instanceCount = i2;
                            d2 += i;
                        case 83:
                            i3 = Test.byFld;
                            i30 = 54;
                            iFld1 -= (int) fFld;
                            i3 += (i28 * i2);
                            Test.instanceCount += (((i28 * i30) + i28) - Test.instanceCount);
                            i30 = i2;
                            fFld += (i28 - i);
                            i27 = (int) d2;
                            i3 += (i28 | i3);
                            i30 += (i28 * i28);
                            break;
                        default:
                            iArr3[i28][(int) (d3)] /= (int) (i3 | 1);
                            i29 = (int) Test.instanceCount;
                            i27 |= i28;
                            i3 -= i1;
                    }
                    switch((i28 % 2) + 17) {
                        case 17:
                            iFld1 += i28;
                            Test.iArrFld[i28] -= 28760;
                            switch(((i29 >>> 1) % 8) + 108) {
                                case 108:
                                    i30 *= iFld1;
                                    break;
                                case 109:
                                    iArr3[i26][i28 - 1] -= i26;
                                    i31 = i28;
                                    byArr1[i26] ^= (byte) i28;
                                    Test.instanceCount *= (long) fFld;
                                    fFld -= 2970053016L;
                                    break;
                                case 110:
                                    Test.instanceCount <<= i30;
                                    Test.instanceCount = 5;
                                    fFld *= 4;
                                    Test.instanceCount += (long) (0.136F + (i28 * i28));
                                    Test.instanceCount += i31;
                                    b4 = false;
                                    i1 -= byFld1;
                                    try {
                                        Test.iFld = (iFld1 / i3);
                                        i1 = (i28 % Test.iArrFld[(int) (d3)]);
                                        i27 = (i31 % iArr3[(int) (d3)][i28]);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    iFld1 = Test.iFld;
                                    Test.iFld += iFld1;
                                    fArr1 = FuzzerUtils.float1array(N, (float) 2.51F);
                                    switch(((i2 >>> 1) % 1) + 14) {
                                        case 14:
                                            iArr3[(int) (d3 + 1)][(int) (d3 - 1)] = Test.iFld;
                                            iFld1 = -41898;
                                            Test.iArrFld = Test.iArrFld;
                                            Test.byFld = (byte) i29;
                                            break;
                                        default:
                                            i30 += (((i28 * i26) + i29) - Test.instanceCount);
                                            i27 += (int) 1.66499;
                                    }
                                    break;
                                case 111:
                                    fFld += Test.byFld;
                                case 112:
                                    fArr1[i28] -= i29;
                                case 113:
                                    Test.iFld += (i28 ^ Test.instanceCount);
                                    break;
                                case 114:
                                    Test.instanceCount = i;
                                    break;
                                case 115:
                                    byFld1 = (byte) i;
                                    break;
                                default:
                                    Test.iArrFld[i26 - 1] >>= -12;
                            }
                            break;
                        case 18:
                            b4 = b4;
                            break;
                    }
                }
            }
        }
        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 b4 d2 = " + i3 + "," + (b4 ? 1 : 0) + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i26 d3 i27 = " + i26 + "," + Double.doubleToLongBits(d3) + "," + i27);
        FuzzerUtils.out.println("i28 i29 i31 = " + i28 + "," + i29 + "," + i31);
        FuzzerUtils.out.println("iArr3 byArr1 fArr1 = " + FuzzerUtils.checkSum(iArr3) + "," + FuzzerUtils.checkSum(byArr1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));
        FuzzerUtils.out.println("Test.instanceCount fFld Test.sFld = " + Test.instanceCount + "," + Float.floatToIntBits(fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.byFld Test.iFld byFld1 = " + Test.byFld + "," + Test.iFld + "," + byFld1);
        FuzzerUtils.out.println("iFld1 Test.lArrFld Test.iArrFld = " + iFld1 + "," + FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test _instance = new Test();
            {
                java.io.PrintStream ax$7 = System.out;
                java.io.PrintStream ax$8 = System.err;
                java.io.PrintStream ax$9 = new java.io.PrintStream(new java.io.OutputStream() {

                    @Override
                    public void write(int b) throws java.io.IOException {
                        // DO NOTHING: DISCARD ALL OUTPUTS
                    }
                });
                System.setOut(ax$9);
                System.setErr(ax$9);
                {
                    boolean ax$14 = false;
                    for (int ax$13 = -2675; ax$13 < 4337; ax$13 += 5) {
                        if (!ax$14) {
                            ax$14 = true;
                            {
                                System.setOut(ax$7);
                                System.setErr(ax$8);
                                for (int i = 0; i < 10; i++) {
                                    _instance.mainTest(strArr);
                                }
                                System.setOut(ax$9);
                                System.setErr(ax$9);
                            }
                        }
                        try {
                            java.lang.Thread[] ax$10 = new java.lang.Thread[981];
                            for (int ax$11 = 0; ax$11 < 10; ax$11++) {
                                ax$10[ax$11].join();
                            }
                        } catch (Throwable ax$12) {
                        } finally {
                        }
                    }
                }
                System.setOut(ax$7);
                System.setErr(ax$8);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    private static Boolean ax$15 = false;

    private static Boolean ax$40 = false;
}
// /////////////////////////////////////////////////////////////////////
// DEBUG  Test ->  Test
// DEBUG  main ->  main
// DEBUG  mainTest ->  mainTest
// DEBUG  iMeth ->  iMeth mainTest
// DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
// DEBUG  byMeth ->  byMeth iMeth1 iMeth mainTest
// DEBUG  Depth = 3
// DEBUG  Classes = 1
// DEBUG  static objects = {}
