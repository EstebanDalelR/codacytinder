package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5674f;
import com.google.zxing.C5675g;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C5664a;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.oned.q */
final class C5677q {
    /* renamed from: a */
    private final int[] f21039a;
    /* renamed from: b */
    private final StringBuilder f21040b;

    /* renamed from: a */
    C5674f m24852a(int i, C5664a c5664a, int[] iArr) throws NotFoundException {
        StringBuilder stringBuilder = this.f21040b;
        stringBuilder.setLength(0);
        c5664a = m24850a(c5664a, iArr, stringBuilder);
        String stringBuilder2 = stringBuilder.toString();
        Map a = C5677q.m24851a(stringBuilder2);
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
    private int m24850a(C5664a c5664a, int[] iArr, StringBuilder stringBuilder) throws NotFoundException {
        int[] iArr2 = this.f21039a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int a = c5664a.m24751a();
        int i = iArr[1];
        iArr = null;
        int i2 = 0;
        while (iArr < 2 && i < a) {
            int a2 = C7811t.m33568a(c5664a, iArr2, i, C7811t.f28266f);
            stringBuilder.append((char) ((a2 % 10) + 48));
            int i3 = i;
            for (int i4 : iArr2) {
                i3 += i4;
            }
            if (a2 >= 10) {
                i2 = (1 << (1 - iArr)) | i2;
            }
            i = iArr != 1 ? c5664a.m24761c(c5664a.m24759b(i3)) : i3;
            iArr++;
        }
        if (stringBuilder.length() != 2) {
            throw NotFoundException.m30473a();
        } else if (Integer.parseInt(stringBuilder.toString()) % 4 == i2) {
            return i;
        } else {
            throw NotFoundException.m30473a();
        }
    }

    /* renamed from: a */
    private static Map<ResultMetadataType, Object> m24851a(String str) {
        if (str.length() != 2) {
            return null;
        }
        Map<ResultMetadataType, Object> enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }
}
