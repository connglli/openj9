// Generated by Java* Fuzzer test generator (1.0.001) and Artemis program mutator.


public class Test {
    public static final int N = 256;

    public static long instanceCount = -41757L;

    public static volatile short sFld = 758;

    public static byte byFld = 31;

    public static double dFld = 28.106362;

    public static boolean bArrFld[] = new boolean[N];

    public static float fArrFld[] = new float[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.fArrFld, 2.579F);
    }

    public static long vMeth_check_sum = 0;

    public static long vMeth1_check_sum = 0;

    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {
        double d = 1.71024;
        double d1 = 123.2036;
        double d2 = -1.69479;
        int i7 = 236;
        int i8 = 7;
        int i9 = 24869;
        int i10 = 62;
        int i11 = -117;
        int i12 = -237;
        int i13 = 155;
        int i14 = 40;
        int i15 = 64468;
        int i16 = -229;
        int i17 = -9340;
        int iArr1[][] = new int[N][N];
        float f2 = 1.6F;
        long l = -7L;
        long lArr1[][] = new long[N][N];
        boolean b = true;
        FuzzerUtils.init(iArr1, -7);
        FuzzerUtils.init(lArr1, -30208L);
        for (d = 2; d < 103; d++) {
            i7 += ((int) (d));
            for (i8 = 5; i8 > d; i8 -= 3) {
                Test.instanceCount <<= Test.instanceCount;
                i10 = 1;
                do {
                    f2 *= i7;
                    iArr1[i8 - 1][i10 + 1] = i9;
                    Test.instanceCount += i10;
                    iArr1[i8 - 1][i8 + 1] %= ((int) (i9 | 1));
                    i7 += ((int) (Test.instanceCount));
                } while ((++i10) < 1 );
                Test.sFld = ((short) (i9));
                i9 ^= i9;
            }
            l = 1;
            while ((++l) < 5) {
                Test.instanceCount >>= i9;
                Test.sFld <<= ((short) (i7));
                d1 += i10;
                i7 *= i7;
                Test.sFld = Test.byFld;
                i9 = i9;
            } 
            for (d2 = d; 5 > d2; d2++) {
                Test.bArrFld[((int) (d2))] = b;
            }
            for (i12 = ((int) (d)); i12 < 5; i12++) {
                i14 = 1;
                while ((++i14) < 1) {
                    i9 = i10;
                } 
                i13 = ((int) (f2));
                for (i15 = 1; i15 < 1; ++i15) {
                    i7 = ((int) (Test.instanceCount));
                    switch (((i12 % 10) * 5) + 90) {
                        case 104 :
                            i16 = i15;
                            break;
                        case 102 :
                            i9 <<= i13;
                            i16 = 84;
                            iArr1[((int) (d))][i12 + 1] -= ((int) (l));
                            d1 = f2;
                            i9 = i10;
                            iArr1[((int) (d))][i15 + 1] %= ((int) (Test.instanceCount | 1));
                            break;
                        case 110 :
                            i7 = ((int) (4L));
                            i9 = i8;
                            break;
                        case 120 :
                            Test.instanceCount = l;
                        case 139 :
                            Test.instanceCount = 204L;
                            break;
                        case 107 :
                        case 124 :
                            try {
                                i16 = i8 / i12;
                                i13 = 213 / i13;
                                i17 = (-39713) % iArr1[i15 + 1][i15 - 1];
                            } catch (ArithmeticException a_e) {
                            }
                        case 138 :
                            Test.instanceCount += 36400 + (i15 * i15);
                            break;
                        case 100 :
                        case 103 :
                            lArr1[i15 + 1][i15] = 26669;
                    }
                }
            }
        }
        vMeth2_check_sum += (((((((((((((((((Double.doubleToLongBits(d) + i7) + i8) + i9) + i10) + Float.floatToIntBits(f2)) + l) + Double.doubleToLongBits(d1)) + Double.doubleToLongBits(d2)) + i11) + (b ? 1 : 0)) + i12) + i13) + i14) + i15) + i16) + i17) + FuzzerUtils.checkSum(iArr1)) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth1(int i4, int i5, int i6) {
        float f3 = -2.458F;
        float f4 = 1.302F;
        int i18 = 205;
        int i19 = 247;
        int i20 = 0;
        int i21 = -97;
        int i22 = -50827;
        int iArr2[] = new int[N];
        boolean b1 = false;
        short sArr[] = new short[N];
        long lArr2[] = new long[N];
        FuzzerUtils.init(iArr2, -6);
        FuzzerUtils.init(sArr, ((short) (13565)));
        FuzzerUtils.init(lArr2, 25L);
        vMeth2();
        Test.instanceCount <<= i4;
        Test.sFld = ((short) (i5));
        i4 >>= Test.sFld;
        f3 = 1;
        do {
            Test.sFld = ((short) (59543));
            iArr2[(i4 >>> 1) % N] += ((int) (Test.instanceCount));
            Test.instanceCount = i6;
            i18 = 3;
            while ((--i18) > 0) {
                iArr2[i18] = ((int) (f3));
                try {
                    i6 = i6 % i6;
                    i6 = (-59521) / i6;
                    iArr2[((int) (f3 - 1))] = i5 % (-78);
                } catch (ArithmeticException a_e) {
                }
                for (i19 = 1; i19 > 1; i19 -= 2) {
                    i4 += ((i19 * i20) + i19) - Test.instanceCount;
                    sArr[((int) (f3 + 1))] = ((short) (i18));
                    f4 -= 171;
                    i5 += i19;
                    i4 |= i5;
                    iArr2[i18] = i4;
                    Test.sFld = Test.byFld;
                    i6 >>= -2;
                    Test.instanceCount = Test.instanceCount;
                    b1 = b1;
                    Test.byFld += ((byte) (((i19 * i20) + i19) - i19));
                    if (b1)
                        continue;

                    Test.instanceCount = ((long) (f3));
                    Test.instanceCount >>= Test.instanceCount;
                }
                for (i21 = 1; i21 > 1; --i21) {
                    i5 *= ((int) (f3));
                    b1 = b1;
                    i22 = ((int) (Test.instanceCount));
                    iArr2[((int) (f3 + 1))] <<= i5;
                    Test.instanceCount += i21 ^ i4;
                    if (i21 != 0) {
                        vMeth1_check_sum += ((((((((((((i4 + i5) + i6) + Float.floatToIntBits(f3)) + i18) + i19) + i20) + Float.floatToIntBits(f4)) + (b1 ? 1 : 0)) + i21) + i22) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(lArr2);
                        return;
                    }
                    f4 += i20;
                    lArr2[i18] -= Test.byFld;
                    i22 = i20;
                    if (i22 != 0) {
                        vMeth1_check_sum += ((((((((((((i4 + i5) + i6) + Float.floatToIntBits(f3)) + i18) + i19) + i20) + Float.floatToIntBits(f4)) + (b1 ? 1 : 0)) + i21) + i22) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(lArr2);
                        return;
                    }
                }
            } 
        } while ((++f3) < 198 );
        vMeth1_check_sum += ((((((((((((i4 + i5) + i6) + Float.floatToIntBits(f3)) + i18) + i19) + i20) + Float.floatToIntBits(f4)) + (b1 ? 1 : 0)) + i21) + i22) + FuzzerUtils.checkSum(iArr2)) + FuzzerUtils.checkSum(sArr)) + FuzzerUtils.checkSum(lArr2);
    }

    public static void vMeth() {
        int i1 = 4;
        int i2 = -43350;
        int i3 = 142;
        int i23 = 12;
        int i24 = 0;
        int i25 = 65353;
        int i26 = -6;
        int i27 = -253;
        int i28 = 47550;
        int i29 = 14;
        int iArr[] = new int[N];
        float f1 = 29.159F;
        float f5 = 2.104F;
        short s = -1724;
        double d3 = -21.52184;
        boolean b2 = false;
        long lArr[][] = new long[N][N];
        byte byArr[] = new byte[N];
        FuzzerUtils.init(lArr, -1597735505L);
        FuzzerUtils.init(iArr, -227);
        FuzzerUtils.init(byArr, ((byte) (74)));
        lArr[(i1 >>> 1) % N][((-1) >>> 1) % N] = ((long) (((++i1) * (--Test.instanceCount)) + (f1 * (f1 - s))));
        for (i2 = 7; 178 > i2; i2++) {
            i1 *= iArr[i2 - 1]++;
            vMeth1(i2, -57, i1);
        }
        d3 = 148;
        while ((--d3) > 0) {
            for (i23 = 1; i23 < 4; i23++) {
                i1 = ((int) (Test.instanceCount));
                i24 = i1;
            }
            Test.instanceCount += ((long) (d3));
            f1 += ((float) (((d3 * i1) + Test.instanceCount) - i24));
            for (i25 = ((int) (d3)); i25 < 4; ++i25) {
                i1 = i3;
                Test.instanceCount += i25 * i25;
                for (i27 = 1; i27 < 1; i27++) {
                    f1 = i27;
                    Test.instanceCount += ((long) (f1));
                    f1 *= i1;
                    Test.instanceCount += ((i27 * i2) + i27) - i27;
                    i26 = i25;
                    try {
                        iArr[((int) (d3 + 1))] = (-164) / iArr[i27];
                        i24 = i27 / i1;
                        i24 = (-24330) / i1;
                    } catch (ArithmeticException a_e) {
                    }
                    switch ((((i23 >>> 1) % 3) * 5) + 78) {
                        case 90 :
                            iArr[i25] += i26;
                            Test.instanceCount += ((i27 * i24) + i24) - f1;
                            switch (((i25 % 2) * 5) + 119) {
                                case 121 :
                                    f1 -= Test.byFld;
                                    i28 /= ((int) (((long) (f5)) | 1));
                                    f5 = Test.byFld;
                                    Test.dFld = i1;
                                    try {
                                        i1 = iArr[i25] % (-196);
                                        i3 = 51573 % i1;
                                        i24 = i1 % 31730;
                                    } catch (ArithmeticException a_e) {
                                    }
                                    iArr[i27] = i25;
                                    if (b2)
                                        break;

                                    Test.instanceCount = 8049680020899534899L;
                                    iArr[i25] = i26;
                                    f5 += i3;
                                    i29 += i27 - i3;
                                    i28 ^= i28;
                                    break;
                                case 122 :
                                    i28 -= i2;
                            }
                            break;
                        case 80 :
                            iArr = iArr;
                            break;
                        case 87 :
                            byArr[((int) (d3 - 1))] = ((byte) (i26));
                            break;
                        default :
                            Test.instanceCount += i27 * i27;
                    }
                }
            }
        } 
        vMeth_check_sum += ((((((((((((((((i1 + Float.floatToIntBits(f1)) + s) + i2) + i3) + Double.doubleToLongBits(d3)) + i23) + i24) + i25) + i26) + i27) + i28) + Float.floatToIntBits(f5)) + (b2 ? 1 : 0)) + i29) + FuzzerUtils.checkSum(lArr)) + FuzzerUtils.checkSum(iArr)) + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {
        int i = -8;
        int i30 = 52;
        int i31 = 20726;
        int i32 = 2;
        int i33 = 61;
        int i34 = -57001;
        int i35 = 2;
        int i36 = 13;
        int i37 = -5;
        int i38 = -27439;
        int i40 = 41034;
        int i41 = -14183;
        int i43 = 46;
        int i44 = 2;
        int i45 = -8;
        int i46 = 6;
        int iArr3[] = new int[N];
        float f = 1.245F;
        boolean b3 = false;
        long lArr3[][] = new long[N][N];
        double dArr[] = new double[N];
        FuzzerUtils.init(iArr3, 10);
        FuzzerUtils.init(lArr3, -1231459388L);
        FuzzerUtils.init(dArr, -1.7046);
        i = ((int) (++f));
        vMeth();
        Test.instanceCount = i;
        i >>= i;
        for (i30 = 8; 146 > i30; i30++) {
            b3 = b3;
            f = i31;
            Test.instanceCount = i;
            switch ((i30 % 1) + 126) {
                case 126 :
                    iArr3[i30] <<= i30;
                    Test.instanceCount <<= Test.byFld;
                    i += 2 + (i30 * i30);
                    f = ((float) (Test.dFld));
                    break;
            }
            for (i32 = 2; i32 < 37; i32++) {
                Test.instanceCount += ((i32 * i30) + i32) - f;
                iArr3 = iArr3;
                Test.instanceCount += ((i32 * i) + Test.instanceCount) - i;
                for (i34 = 1; i34 < 2; i34++) {
                    Test.sFld = ((short) (i));
                }
                Test.instanceCount -= i35;
                i36 = 1;
                do {
                    if (b3)
                        break;

                    f -= f;
                    iArr3[i30 + 1] = i34;
                    f *= f;
                    iArr3[i36] = Test.sFld;
                    i31 += ((i36 * i34) + i30) - i30;
                    f %= i32 | 1;
                    lArr3[i30][i30] = -14;
                    i35 ^= i31;
                } while ((++i36) < 2 );
                i35 += (-4) + (i32 * i32);
                for (i37 = 1; i37 < 2; ++i37) {
                    i33 = ((int) (Test.instanceCount));
                    try {
                        i38 = i35 % (-50480);
                        i31 = iArr3[i37 - 1] / i36;
                        i33 = i37 / (-186);
                    } catch (ArithmeticException a_e) {
                    }
                    Test.instanceCount += ((long) (-99.11081));
                    Test.instanceCount = ((long) (Test.dFld));
                    i += i37;
                    iArr3[i30 + 1] -= ((int) (Test.dFld));
                    Test.instanceCount += i37;
                    i38 = Test.sFld;
                }
                i38 -= i;
                i35 = i34;
                i33 <<= i;
            }
            i += (-207) + (i30 * i30);
            i40 = 1;
            do {
                i = i32;
                iArr3[i40] -= i38;
                i /= -174;
                i31 *= i36;
                Test.instanceCount += i40;
                f += ((float) (-1.81941));
                i += i40 - i33;
                if (false)
                    continue;

                if (false)
                    break;

                i31 += i41;
                i *= i36;
                Test.fArrFld[i40] = 153;
                i >>= ((int) (Test.instanceCount));
                i = -24;
                b3 = false;
            } while ((++i40) < 37 );
            i35 += i30 * i30;
            Test.instanceCount = 14;
            i33 += i30;
            f = f;
            lArr3 = lArr3;
            i35 = 3623;
            i41 += i30;
            dArr[i30] -= i32;
        }
        i33 = -3;
        for (i43 = 6; i43 < 142; i43++) {
            for (i45 = 1; i45 < 37; i45++) {
                if (b3)
                    continue;

                if (b3)
                    break;

                i35 += -44025;
                iArr3[i43] = i43;
            }
        }
        FuzzerUtils.out.println((((("i f i30 = " + i) + ",") + Float.floatToIntBits(f)) + ",") + i30);
        FuzzerUtils.out.println((((("i31 b3 i32 = " + i31) + ",") + (b3 ? 1 : 0)) + ",") + i32);
        FuzzerUtils.out.println((((("i33 i34 i35 = " + i33) + ",") + i34) + ",") + i35);
        FuzzerUtils.out.println((((("i36 i37 i38 = " + i36) + ",") + i37) + ",") + i38);
        FuzzerUtils.out.println((((("i40 i41 i43 = " + i40) + ",") + i41) + ",") + i43);
        FuzzerUtils.out.println((((("i44 i45 i46 = " + i44) + ",") + i45) + ",") + i46);
        FuzzerUtils.out.println((((("iArr3 lArr3 dArr = " + FuzzerUtils.checkSum(iArr3)) + ",") + FuzzerUtils.checkSum(lArr3)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println((((("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount) + ",") + Test.sFld) + ",") + Test.byFld);
        FuzzerUtils.out.println((((("Test.dFld Test.bArrFld Test.fArrFld = " + Double.doubleToLongBits(Test.dFld)) + ",") + FuzzerUtils.checkSum(Test.bArrFld)) + ",") + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
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
}