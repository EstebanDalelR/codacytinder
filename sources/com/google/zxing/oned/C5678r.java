package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5674f;
import com.google.zxing.C5675g;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C5664a;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.oned.r */
final class C5678r {
    /* renamed from: a */
    private static final int[] f21041a = new int[]{24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    /* renamed from: b */
    private final int[] f21042b;
    /* renamed from: c */
    private final StringBuilder f21043c;

    /* renamed from: a */
    C5674f m24858a(int i, C5664a c5664a, int[] iArr) throws NotFoundException {
        StringBuilder stringBuilder = this.f21043c;
        stringBuilder.setLength(0);
        c5664a = m24854a(c5664a, iArr, stringBuilder);
        String stringBuilder2 = stringBuilder.toString();
        Map a = C5678r.m24856a(stringBuilder2);
        r4 = new C5675g[2];
        i = (float) i;
        r4[0] = new C5675g(((float) (iArr[0] + iArr[1])) / 2.0f, i);
        r4[1] = new C5675g((float) c5664a, i);
        C5674f c5674f = new C5674f(stringBuilder2, null, r4, BarcodeFormat.UPC_EAN_EXTENSION);
        if (a != null) {
            c5674f.m24841a(a);
        }
        return c5674f;
    }

    /* renamed from: a */
    private int m24854a(C5664a c5664a, int[] iArr, StringBuilder stringBuilder) throws NotFoundException {
        int[] iArr2 = this.f21042b;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int a = c5664a.m24751a();
        int i = iArr[1];
        iArr = null;
        int i2 = 0;
        while (iArr < 5 && i < a) {
            int a2 = C7811t.m33568a(c5664a, iArr2, i, C7811t.f28266f);
            stringBuilder.append((char) ((a2 % 10) + 48));
            int i3 = i;
            for (int i4 : iArr2) {
                i3 += i4;
            }
            if (a2 >= 10) {
                i2 |= 1 << (4 - iArr);
            }
            i = iArr != 4 ? c5664a.m24761c(c5664a.m24759b(i3)) : i3;
            iArr++;
        }
        if (stringBuilder.length() != 5) {
            throw NotFoundException.m30473a();
        }
        if (C5678r.m24855a(stringBuilder.toString()) == C5678r.m24853a(i2)) {
            return i;
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    private static int m24855a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - 48;
        }
        i *= 3;
        for (length--; length >= 0; length -= 2) {
            i += charSequence.charAt(length) - 48;
        }
        return (i * 3) % 10;
    }

    /* renamed from: a */
    private static int m24853a(int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f21041a[i2]) {
                return i2;
            }
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    private static Map<ResultMetadataType, Object> m24856a(String str) {
        if (str.length() != 5) {
            return null;
        }
        str = C5678r.m24857b(str);
        if (str == null) {
            return null;
        }
        Map<ResultMetadataType, Object> enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.SUGGESTED_PRICE, str);
        return enumMap;
    }

    /* renamed from: b */
    private static String m24857b(String str) {
        String str2;
        StringBuilder stringBuilder;
        char charAt = str.charAt(0);
        if (charAt == '0') {
            str2 = "£";
        } else if (charAt == '5') {
            str2 = "$";
        } else if (charAt != '9') {
            str2 = "";
        } else if ("90000".equals(str)) {
            return null;
        } else {
            if ("99991".equals(str)) {
                return "0.00";
            }
            if ("99990".equals(str)) {
                return "Used";
            }
            str2 = "";
        }
        str = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(str / 100);
        str %= 100;
        if (str < 10) {
            stringBuilder = new StringBuilder("0");
            stringBuilder.append(str);
            str = stringBuilder.toString();
        } else {
            str = String.valueOf(str);
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(valueOf);
        stringBuilder.append('.');
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
