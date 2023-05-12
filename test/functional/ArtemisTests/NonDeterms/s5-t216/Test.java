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
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.security.IdentityScope;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.jar.Attributes;

public class Test {
    public static final int N = 256;

    public static long instanceCount = -3L;

    public static double dFld = -1.72554;

    public static boolean bFld = true;

    public float fFld = -2.364F;

    public long lFld = -5746019319241600961L;

    public static int iFld = 37688;

    public static short sArrFld[] = new short[N];

    public static int iArrFld[] = new int[N];

    public static float fArrFld[] = new float[N];

    static {
        FuzzerUtils.init(Test.sArrFld, ((short) (3426)));
        FuzzerUtils.init(Test.iArrFld, 238);
        FuzzerUtils.init(Test.fArrFld, 1.714F);
    }

    public static long iMeth_check_sum = 0;

    public static long iMeth1_check_sum = 0;

    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i5, int i6, int i7) {
        int i8 = -12;
        int i9 = 10;
        int i10 = -12;
        int i11 = -94;
        int i12 = -1;
        int i13 = 12;
        int i14 = 36525;
        int i15 = 49623;
        int i16 = -10932;
        int i17 = 1;
        int i18 = 59;
        int i19 = -217;
        int iArr[] = new int[N];
        boolean b = false;
        float f = -2.588F;
        float fArr[] = new float[N];
        short s = 3045;
        short sArr[] = new short[N];
        byte by = 39;
        byte byArr[] = new byte[N];
        double d1 = 10.122603;
        long lArr[] = new long[N];
        FuzzerUtils.init(iArr, -5);
        FuzzerUtils.init(fArr, -2.617F);
        FuzzerUtils.init(lArr, 93L);
        FuzzerUtils.init(byArr, ((byte) (97)));
        FuzzerUtils.init(sArr, ((short) (2093)));
        try {
            switch (((i6 >>> 1) % 9) + 105) {
                case 105 :
                    for (i8 = 9; i8 < 157; ++i8) {
                        if (b)
                            break;

                        i9 += (-50) + (i8 * i8);
                        iArr[i8 + 1] += ((int) (f));
                    }
                    for (i10 = 98; 5 < i10; i10 -= 3) {
                        for (i12 = 1; i12 < 17; ++i12) {
                            for (i14 = 1; i14 < 2; i14++) {
                                i6 = ((int) (Test.instanceCount));
                                s -= ((short) (i10));
                                i15 &= i5;
                            }
                            Test.instanceCount = i7;
                            if (i9 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            s *= ((short) (i7));
                            fArr[i12] -= i11;
                            lArr[i10 + 1] <<= Test.instanceCount;
                            lArr[i10 - 1] >>= -26054;
                            Test.instanceCount = 50756;
                            if (i8 != 0) {
                            }
                        }
                        byArr[i10 + 1] = ((byte) (i12));
                        for (i16 = i10; i16 < 17; ++i16) {
                            Test.instanceCount *= Test.instanceCount;
                            f -= i12;
                            by *= ((byte) (Test.instanceCount));
                            iArr[i10 - 1] = 26;
                            s += s;
                            for (i18 = 1; i18 < 1; i18++) {
                                Test.instanceCount += i18;
                                i6 = i6;
                                i11 = 35;
                                i6 -= i10;
                                iArr = iArr;
                                Test.instanceCount *= i18;
                                sArr[i16 + 1] -= ((short) (d1));
                            }
                            f = i8;
                        }
                    }
                    break;
                case 106 :
                    lArr[(i7 >>> 1) % N] = ((long) (1.27F));
                    break;
                case 107 :
                    iArr[((-8) >>> 1) % N] += i5;
                    break;
                case 108 :
                    Test.instanceCount = i12;
                    break;
                case 109 :
                    i15 = ((int) (-2.707F));
                case 110 :
                    s = ((short) (i14));
                    break;
                case 111 :
                case 112 :
                    Test.instanceCount %= i12 | 1;
                    break;
                case 113 :
                default :
                    b = b;
            }
        } catch (UserDefinedExceptionTest exc1) {
            i19 -= ((int) (Test.instanceCount));
        }
        long meth_res = (((((((((((((((((((((((i5 + i6) + i7) + i8) + i9) + (b ? 1 : 0)) + Float.floatToIntBits(f)) + i10) + i11) + i12) + i13) + i14) + i15) + s) + i16) + i17) + by) + i18) + i19) + Double.doubleToLongBits(d1)) + FuzzerUtils.checkSum(iArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))) + FuzzerUtils.checkSum(lArr)) + FuzzerUtils.checkSum(byArr)) + FuzzerUtils.checkSum(sArr);
        iMeth2_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public static int iMeth1(int i1, int i2) {
        if (Test.ax$23) {
            IdentityScope ax$24 = null;
            Test.AxOutputRedirectionHelper.redirect();
            try {
                if (ax$24 != null) {
                }
            } catch (Throwable ax$25) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return -31906328;
        }
        int i3 = 51074;
        int i4 = 17766;
        int i20 = 228;
        int i21 = -250;
        int i22 = 57018;
        int i23 = -38;
        int i24 = -8531;
        int i25 = -1;
        int i26 = -41544;
        int i27 = 0;
        int iArr1[] = new int[N];
        float f1 = -107.419F;
        float fArr1[] = new float[N];
        byte by1 = -4;
        byte byArr1[] = new byte[N];
        short s1 = 6723;
        long lArr1[] = new long[N];
        boolean bArr[] = new boolean[N];
        FuzzerUtils.init(byArr1, ((byte) (102)));
        FuzzerUtils.init(fArr1, 0.775F);
        FuzzerUtils.init(iArr1, 6);
        FuzzerUtils.init(lArr1, -25115L);
        FuzzerUtils.init(bArr, false);
        for (i3 = 8; i3 < 139; i3++) {
            i2 >>>= ((int) ((Test.instanceCount--) * (iMeth2(i4, i4, i3) - f1)));
            for (i20 = 1; i20 < 4; ++i20) {
                byArr1[i3 - 1] *= ((byte) (i3));
                for (i22 = 1; i22 < 2; i22++) {
                    i2 /= ((int) (i20 | 1));
                    i2 += ((i22 * i1) + i21) - i23;
                    by1 = ((byte) (i2));
                    fArr1[i20] += i1;
                }
                iArr1[i20] -= i21;
                i4 += i20 + i23;
                f1 = i3;
                if (i2 != 0) {
                }
            }
            lArr1[i3 + 1] -= ((long) (Test.dFld));
            for (i24 = 1; 4 > i24; i24++) {
                Test.dFld = i4;
                for (i26 = 1; i26 < 2; ++i26) {
                    f1 += ((float) (32.33287));
                    Test.instanceCount = i20;
                    Test.dFld = i2;
                    bArr[i3 - 1] = true;
                    i2 *= ((int) (Test.instanceCount));
                    i21 = i27;
                    Test.instanceCount = Test.instanceCount;
                    switch ((i26 % 2) + 60) {
                        case 60 :
                            switch (((i3 % 3) * 5) + 49) {
                                case 63 :
                                    fArr1[i3 + 1] = i26;
                                    f1 += -22539;
                                    Test.instanceCount += i26 * i26;
                                    i21 += i26 * i2;
                                    break;
                                case 57 :
                                    i4 = i25;
                                    i4 ^= s1;
                                    Test.instanceCount -= Test.instanceCount;
                                    lArr1[i3 + 1] = ((long) (f1));
                                    i4 += i26;
                                    i1 -= i22;
                                    i23 += ((int) (Test.instanceCount));
                                    break;
                                case 50 :
                                    iArr1[i26 + 1] -= 140;
                                    break;
                            }
                        case 61 :
                            Test.instanceCount += i26;
                            break;
                        default :
                            if (Test.bFld)
                                continue;

                    }
                }
            }
        }
        long meth_res = ((((((((((((((((((i1 + i2) + i3) + i4) + Float.floatToIntBits(f1)) + i20) + i21) + i22) + i23) + by1) + i24) + i25) + i26) + i27) + s1) + FuzzerUtils.checkSum(byArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1))) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(lArr1)) + FuzzerUtils.checkSum(bArr);
        iMeth1_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public int iMeth(int i) {
        if (Test.ax$0) {
            Test.AxOutputRedirectionHelper.redirect();
            try {
                Attributes ax$1 = new Attributes();
                try {
                    ax$1.put("this is not an Attributes.Name", "value");
                } catch (ClassCastException ax$2) {
                }
                try {
                    ax$1.put(new Attributes.Name("name"), new Integer(0));
                } catch (ClassCastException ax$3) {
                }
                try {
                    ax$1.putAll(new HashMap());
                } catch (ClassCastException ax$4) {
                }
            } catch (Throwable ax$5) {
            } finally {
            }
            Test.AxOutputRedirectionHelper.recover();
            return -1980923778;
        }
        double d = -2.105474;
        float f2 = -13.635F;
        int i28 = 11;
        int i29 = -44;
        int i30 = -90;
        int i31 = -7;
        int i32 = -175;
        int iArr2[] = new int[N];
        byte by2 = -12;
        boolean b1 = true;
        boolean bArr1[] = new boolean[N];
        short s2 = -31438;
        FuzzerUtils.init(iArr2, -31301);
        FuzzerUtils.init(bArr1, true);
        i += ++i;
        if (b1) {
            {
                try {
                    Object ax$27 = new Object();
                    Object ax$28 = new Object() {};
                    Map ax$29 = null;
                    for (int ax$26 = -354; ax$26 < (-354 + 13952); ax$26 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            Iterator ax$30 = ax$29.keySet().iterator();
                            while (ax$30.hasNext()) {
                                Object ax$31 = ax$30.next();
                                if ((ax$31 == ax$27) || (ax$31 == ax$28)) {
                                    ax$30.remove();
                                }
                            } 
                        } catch (Throwable ax$32) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                        Test.ax$23 = true;
                        iMeth1(-379807283, -1127192214);
                        Test.ax$23 = false;
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            HashMap ax$33 = new HashMap(100, Float.NaN);
                        } catch (Throwable ax$34) {
                        } finally {
                        }
                        Test.AxOutputRedirectionHelper.recover();
                    }
                } finally {
                }
            }
            d *= iMeth1(0, i);
            for (f2 = 5; f2 < 162; f2 += 3) {
                for (i29 = 10; i29 > 1; --i29) {
                    i += i30;
                    switch (((int) ((f2 % 8) + 100))) {
                        case 100 :
                            i28 += i29 * i29;
                            i28 += by2;
                            i30 += i29 * Test.instanceCount;
                            break;
                        case 101 :
                            iArr2[i29] *= ((int) (Test.instanceCount));
                            break;
                        case 102 :
                            i30 -= i30;
                            bArr1[((int) (f2 + 1))] = b1;
                            s2 = ((short) (i30));
                            try {
                                i = i / 43085;
                                i30 = (-55627) % i;
                                i30 = (-18946) / i29;
                            } catch (ArithmeticException a_e) {
                            }
                            i28 -= ((int) (f2));
                            Test.instanceCount -= by2;
                            Test.instanceCount /= ((long) (f2)) | 1;
                            fFld += fFld;
                            i28 += ((i29 * i28) + f2) - i30;
                            i28 *= i30;
                            for (i31 = ((int) (f2)); i31 < 2; i31++) {
                                i += i31 + Test.instanceCount;
                                Test.instanceCount <<= Test.instanceCount;
                                i32 >>>= i30;
                                if (true)
                                    continue;

                                i += 6 + (i31 * i31);
                                Test.instanceCount *= -47738;
                                if (b1) {
                                    b1 = Test.bFld;
                                    i30 = ((int) (Test.instanceCount));
                                    i30 += i31 ^ ((long) (f2));
                                    Test.instanceCount >>>= s2;
                                    Test.sArrFld[((int) (f2 - 1))] <<= ((short) (i31));
                                    i -= -11;
                                    i = ((int) (-2.62698));
                                    i = ((int) (f2));
                                } else {
                                    i28 >>>= ((int) (65287L));
                                }
                            }
                            break;
                        case 103 :
                            iArr2[i29 + 1] ^= i;
                            break;
                        case 104 :
                            i += ((i29 * s2) + i28) - fFld;
                            break;
                        case 105 :
                            Test.dFld += -177;
                            break;
                        case 106 :
                            i28 += ((int) (Test.instanceCount));
                            break;
                        case 107 :
                            Test.instanceCount += ((long) (Test.dFld));
                            break;
                        default :
                            i30 -= ((int) (Test.instanceCount));
                    }
                }
            }
        } else if (true) {
            iArr2[(i31 >>> 1) % N] -= ((int) (Test.instanceCount));
        }
        long meth_res = (((((((((((i + Double.doubleToLongBits(d)) + Float.floatToIntBits(f2)) + i28) + i29) + i30) + by2) + (b1 ? 1 : 0)) + s2) + i31) + i32) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(bArr1);
        iMeth_check_sum += meth_res;
        return ((int) (meth_res));
    }

    public void mainTest(String[] strArr1) {
        int i33 = 27669;
        int i34 = 12;
        int i35 = 6;
        int i36 = -44;
        int i37 = 82;
        int i38 = -158;
        int i39 = -25198;
        int i40 = -9;
        int i41 = -2;
        int i42 = 0;
        int i43 = -55161;
        int i44 = 0;
        short s3 = 2938;
        byte by3 = -99;
        double d2 = 2.15195;
        float f3 = -28.681F;
        long lArr2[] = new long[N];
        long lArr3[][] = new long[N][N];
        FuzzerUtils.init(lArr2, 2242330925L);
        FuzzerUtils.init(lArr3, -3131280709018075148L);
        {
            final long ax$19 = this.lFld;
            final int ax$20 = i43;
            final int ax$21 = i34;
            final int ax$22 = i44;
            try {
                Long ax$7 = 9223372036854774784L;
                Long ax$9 = 0x12481248L;
                long[] ax$11 = new long[]{ -8523030291556565935L, -1653036116134534153L, -6039993068180972013L, 7269297374909504318L, 2963263727005547699L, -1379764694311213303L };
                long[] ax$12 = new long[]{ -2069579259723712375L, -3054653269185874690L, 8026334281786016662L, -4064524740774045601L, -1520907448025352185L, -3855256735037582412L, -3882320394282746812L };
                long[] ax$13 = new long[]{ 7843506233399147800L, -6336168521815697585L, -3712459844131920181L };
                for (int ax$6 = -319; ax$6 < (-319 + 5174); ax$6 += 1) {
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        if ((lFld & 1) == 0) {
                            ax$9 = new Long(lFld + 1);
                            ax$7 = new Long(lFld + 2);
                        }
                    } catch (Throwable ax$10) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                    Test.ax$0 = true;
                    iMeth(-211640625);
                    Test.ax$0 = false;
                    Test.AxOutputRedirectionHelper.redirect();
                    try {
                        for (int ax$17 = 0; ax$17 < i43; ax$17++) {
                            ax$12[i44] = ax$11[i34];
                            ax$13[i44] = ax$11[ax$17];
                            i44++;
                        }
                    } catch (Throwable ax$18) {
                    } finally {
                    }
                    Test.AxOutputRedirectionHelper.recover();
                }
            } finally {
                this.lFld = ax$19;
                i43 = ax$20;
                i34 = ax$21;
                i44 = ax$22;
            }
        }
        iMeth(4);
        Test.bFld = Test.bFld;
        for (i33 = 6; i33 < 150; i33++) {
            Test.instanceCount = ((long) (Test.dFld));
            s3 = ((short) (5));
            Test.instanceCount = ((long) (fFld));
            i34 = s3;
            for (i35 = 1; i35 < 35; ++i35) {
                Test.iArrFld[(i36 >>> 1) % N] %= ((int) (((long) (fFld)) | 1));
                i34 -= i36;
                i34 += ((int) (Test.instanceCount));
                i36 *= ((int) (Test.instanceCount));
                Test.bFld = true;
                i36 >>= i35;
                i34 += s3;
                i34 >>= i33;
                if (Test.bFld)
                    break;

                Test.dFld += -217;
                Test.bFld = Test.bFld;
                Test.instanceCount >>= i36;
                Test.dFld = fFld;
                i36 = ((int) (9L));
            }
            i36 = -11;
            switch (((i34 >>> 1) % 2) + 84) {
                case 84 :
                    lFld *= lFld;
                    break;
                case 85 :
                    by3 += ((byte) (i33 - s3));
                    for (i37 = 2; 35 > i37; i37++) {
                        s3 -= ((short) (46993));
                        i38 <<= ((int) (lFld));
                        by3 = ((byte) (i35));
                        fFld += i33;
                        for (i39 = 1; i39 < 2; i39++) {
                            lArr2[i37 + 1] = ((long) (Test.dFld));
                            i40 >>= i34;
                            fFld = i34;
                        }
                        d2 *= -5252;
                    }
                    lFld <<= 3;
                    for (i41 = 1; i41 < 35; i41++) {
                        fFld += i41;
                        d2 *= -21;
                        Test.iArrFld[i33] = ((int) (Test.instanceCount));
                        Test.iArrFld = Test.iArrFld;
                        Test.iArrFld[i41 + 1] += -3067;
                        i43 = 1;
                        do {
                            lFld += i43 * i43;
                            lArr3 = lArr3;
                            i36 = i42;
                            fFld *= i37;
                            Test.fArrFld[i33 - 1] = by3;
                            if (Test.bFld) {
                                lArr2[i33] = i43;
                                Test.bFld = Test.bFld;
                            } else {
                                Test.instanceCount -= ((long) (Test.dFld));
                                lArr3[i33][i43 + 1] = i38;
                                d2 *= lFld;
                                if (Test.bFld)
                                    continue;

                                i38 = -51172;
                                fFld = -186;
                                i34 >>= i35;
                                i38 += ((int) (lFld));
                                i40 += i43 | lFld;
                                i42 = -26464;
                                i34 += (-10) + (i43 * i43);
                                i34 *= i40;
                                i40 >>= ((int) (Test.instanceCount));
                                Test.instanceCount += -102;
                                i36 = -20027;
                            }
                            Test.iFld += ((i43 * Test.iFld) + fFld) - i43;
                            Test.instanceCount -= ((long) (fFld));
                            lArr3[i43][i43 + 1] = i40;
                        } while ((++i43) < 2 );
                    }
            }
            Test.iFld += ((i33 * fFld) + i36) - i40;
            i34 = i38;
            for (f3 = 2; f3 < 35; ++f3) {
                i42 += i37;
                Test.bFld = false;
            }
        }
        FuzzerUtils.out.println((((("i33 i34 s3 = " + i33) + ",") + i34) + ",") + s3);
        FuzzerUtils.out.println((((("i35 i36 by3 = " + i35) + ",") + i36) + ",") + by3);
        FuzzerUtils.out.println((((("i37 i38 i39 = " + i37) + ",") + i38) + ",") + i39);
        FuzzerUtils.out.println((((("i40 d2 i41 = " + i40) + ",") + Double.doubleToLongBits(d2)) + ",") + i41);
        FuzzerUtils.out.println((((("i42 i43 f3 = " + i42) + ",") + i43) + ",") + Float.floatToIntBits(f3));
        FuzzerUtils.out.println((((("i44 lArr2 lArr3 = " + i44) + ",") + FuzzerUtils.checkSum(lArr2)) + ",") + FuzzerUtils.checkSum(lArr3));
        FuzzerUtils.out.println((((("Test.instanceCount Test.dFld Test.bFld = " + Test.instanceCount) + ",") + Double.doubleToLongBits(Test.dFld)) + ",") + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println((((("fFld lFld Test.iFld = " + Float.floatToIntBits(fFld)) + ",") + lFld) + ",") + Test.iFld);
        FuzzerUtils.out.println((((("Test.sArrFld Test.iArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.sArrFld)) + ",") + FuzzerUtils.checkSum(Test.iArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
                    Object ax$36 = new Object();
                    Object ax$37 = new int[2];
                    for (int ax$35 = -182; ax$35 < (-182 + 5610); ax$35 += 1) {
                        Test.AxOutputRedirectionHelper.redirect();
                        try {
                            try {
                                ByteArrayOutputStream ax$38 = new ByteArrayOutputStream();
                                ObjectOutputStream ax$39 = new ObjectOutputStream(ax$38);
                                ax$39.writeObject(ax$37);
                                byte[] ax$40 = ax$38.toByteArray();
                                ByteArrayInputStream ax$41 = new ByteArrayInputStream(ax$40);
                                ObjectInputStream ax$42 = new ObjectInputStream(ax$41);
                                ax$36 = ax$42.readObject();
                            } catch (Exception ax$43) {
                            }
                        } catch (Throwable ax$44) {
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

    static Boolean ax$23 = false;
}