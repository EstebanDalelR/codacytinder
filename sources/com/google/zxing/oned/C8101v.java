package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C5664a;

/* renamed from: com.google.zxing.oned.v */
public final class C8101v extends C7811t {
    /* renamed from: a */
    static final int[] f29063a = new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37};
    /* renamed from: g */
    private static final int[] f29064g = new int[]{1, 1, 1, 1, 1, 1};
    /* renamed from: h */
    private static final int[][] f29065h = new int[][]{new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    /* renamed from: i */
    private final int[] f29066i;

    /* renamed from: a */
    protected int mo7599a(C5664a c5664a, int[] iArr, StringBuilder stringBuilder) throws NotFoundException {
        int[] iArr2 = this.f29066i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int a = c5664a.m24751a();
        int i = iArr[1];
        iArr = null;
        int i2 = 0;
        while (iArr < 6 && i < a) {
            int a2 = C7811t.m33568a(c5664a, iArr2, i, f);
            stringBuilder.append((char) ((a2 % 10) + 48));
            int i3 = i;
            for (int i4 : iArr2) {
                i3 += i4;
            }
            if (a2 >= 10) {
                i2 = (1 << (5 - iArr)) | i2;
            }
            iArr++;
            i = i3;
        }
        C8101v.m34452a(stringBuilder, i2);
        return i;
    }

    /* renamed from: a */
    protected int[] mo7602a(C5664a c5664a, int i) throws NotFoundException {
        return C7811t.m33571a(c5664a, i, true, f29064g);
    }

    /* renamed from: a */
    protected boolean mo7601a(String str) throws FormatException {
        return super.mo7601a(C8101v.m34453b(str));
    }

    /* renamed from: a */
    private static void m34452a(StringBuilder stringBuilder, int i) throws NotFoundException {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f29065h[i2][i3]) {
                    stringBuilder.insert(0, (char) (i2 + 48));
                    stringBuilder.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    BarcodeFormat mo7600a() {
        return BarcodeFormat.UPC_E;
    }

    /* renamed from: b */
    public static String m34453b(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder stringBuilder = new StringBuilder(12);
        stringBuilder.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                stringBuilder.append(cArr, 0, 2);
                stringBuilder.append(c);
                stringBuilder.append("0000");
                stringBuilder.append(cArr, 2, 3);
                break;
            case '3':
                stringBuilder.append(cArr, 0, 3);
                stringBuilder.append("00000");
                stringBuilder.append(cArr, 3, 2);
                break;
            case '4':
                stringBuilder.append(cArr, 0, 4);
                stringBuilder.append("00000");
                stringBuilder.append(cArr[4]);
                break;
            default:
                stringBuilder.append(cArr, 0, 5);
                stringBuilder.append("0000");
                stringBuilder.append(c);
                break;
        }
        stringBuilder.append(str.charAt(7));
        return stringBuilder.toString();
    }
}
