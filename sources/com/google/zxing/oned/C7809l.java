package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5674f;
import com.google.zxing.C5675g;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C5664a;
import java.util.Map;

/* renamed from: com.google.zxing.oned.l */
public final class C7809l extends C7001n {
    /* renamed from: a */
    static final int[][] f28255a = new int[][]{new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    /* renamed from: b */
    private static final int[] f28256b = new int[]{6, 8, 10, 12, 14};
    /* renamed from: d */
    private static final int[] f28257d = new int[]{1, 1, 1, 1};
    /* renamed from: e */
    private static final int[] f28258e = new int[]{1, 1, 3};
    /* renamed from: c */
    private int f28259c;

    /* renamed from: a */
    public C5674f mo7371a(int i, C5664a c5664a, Map<DecodeHintType, ?> map) throws FormatException, NotFoundException {
        int[] a = m33562a(c5664a);
        int[] c = m33565c(c5664a);
        StringBuilder stringBuilder = new StringBuilder(20);
        C7809l.m33561a(c5664a, a[1], c[0], stringBuilder);
        c5664a = stringBuilder.toString();
        map = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
        if (map == null) {
            map = f28256b;
        }
        int length = c5664a.length();
        int i2 = 0;
        for (int i3 : r13) {
            if (length == i3) {
                map = true;
                break;
            }
            if (i3 > i2) {
                i2 = i3;
            }
        }
        map = null;
        if (map == null && length > i2) {
            map = true;
        }
        if (map == null) {
            throw FormatException.m30472a();
        }
        r4 = new C5675g[2];
        i = (float) i;
        r4[0] = new C5675g((float) a[1], i);
        r4[1] = new C5675g((float) c[0], i);
        return new C5674f(c5664a, null, r4, BarcodeFormat.ITF);
    }

    /* renamed from: a */
    private static void m33561a(C5664a c5664a, int i, int i2, StringBuilder stringBuilder) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C7001n.m30502a(c5664a, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            stringBuilder.append((char) (C7809l.m33559a(iArr2) + 48));
            stringBuilder.append((char) (C7809l.m33559a(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: a */
    private int[] m33562a(C5664a c5664a) throws NotFoundException {
        int[] b = C7809l.m33564b(c5664a, C7809l.m33563b(c5664a), f28257d);
        this.f28259c = (b[1] - b[0]) / 4;
        m33560a(c5664a, b[0]);
        return b;
    }

    /* renamed from: a */
    private void m33560a(C5664a c5664a, int i) throws NotFoundException {
        int i2 = this.f28259c * 10;
        if (i2 >= i) {
            i2 = i;
        }
        i--;
        while (i2 > 0 && i >= 0 && !c5664a.m24756a(i)) {
            i2--;
            i--;
        }
        if (i2 != 0) {
            throw NotFoundException.m30473a();
        }
    }

    /* renamed from: b */
    private static int m33563b(C5664a c5664a) throws NotFoundException {
        int a = c5664a.m24751a();
        c5664a = c5664a.m24759b(0);
        if (c5664a != a) {
            return c5664a;
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: c */
    private int[] m33565c(C5664a c5664a) throws NotFoundException {
        c5664a.m24762c();
        try {
            int[] b = C7809l.m33564b(c5664a, C7809l.m33563b(c5664a), f28258e);
            m33560a(c5664a, b[0]);
            int i = b[0];
            b[0] = c5664a.m24751a() - b[1];
            b[1] = c5664a.m24751a() - i;
            return b;
        } finally {
            c5664a.m24762c();
        }
    }

    /* renamed from: b */
    private static int[] m33564b(C5664a c5664a, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        Object obj = new int[length];
        int a = c5664a.m24751a();
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (i < a) {
            if ((c5664a.m24756a(i) ^ i3) != 0) {
                obj[i4] = obj[i4] + 1;
            } else {
                int i5 = length - 1;
                if (i4 != i5) {
                    i4++;
                } else if (C7001n.m30500a((int[]) obj, iArr, 0.78f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += obj[0] + obj[1];
                    int i6 = length - 2;
                    System.arraycopy(obj, 2, obj, 0, i6);
                    obj[i6] = null;
                    obj[i5] = null;
                    i4--;
                }
                obj[i4] = 1;
                i3 ^= 1;
            }
            i++;
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    private static int m33559a(int[] iArr) throws NotFoundException {
        int length = f28255a.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float a = C7001n.m30500a(iArr, f28255a[i2], 0.78f);
            if (a < f) {
                i = i2;
                f = a;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw NotFoundException.m30473a();
    }
}
