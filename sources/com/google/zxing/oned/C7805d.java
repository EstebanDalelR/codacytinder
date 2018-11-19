package com.google.zxing.oned;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5674f;
import com.google.zxing.C5675g;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C5664a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.d */
public final class C7805d extends C7001n {
    /* renamed from: a */
    static final int[] f28244a;
    /* renamed from: b */
    static final int f28245b;
    /* renamed from: c */
    private final boolean f28246c;
    /* renamed from: d */
    private final boolean f28247d;
    /* renamed from: e */
    private final StringBuilder f28248e;
    /* renamed from: f */
    private final int[] f28249f;

    static {
        int[] iArr = new int[]{52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42};
        f28244a = iArr;
        f28245b = iArr[39];
    }

    /* renamed from: a */
    public C5674f mo7371a(int i, C5664a c5664a, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int b;
        int[] iArr = this.f28249f;
        Arrays.fill(iArr, 0);
        CharSequence charSequence = this.f28248e;
        charSequence.setLength(0);
        int[] a = C7805d.m33544a(c5664a, iArr);
        int b2 = c5664a.m24759b(a[1]);
        int a2 = c5664a.m24751a();
        while (true) {
            C7001n.m30502a(c5664a, b2, iArr);
            int a3 = C7805d.m33542a(iArr);
            if (a3 < 0) {
                throw NotFoundException.m30473a();
            }
            char a4 = C7805d.m33541a(a3);
            charSequence.append(a4);
            int i2 = b2;
            for (int i3 : iArr) {
                i2 += i3;
            }
            b = c5664a.m24759b(i2);
            if (a4 == '*') {
                break;
            }
            b2 = b;
        }
        charSequence.setLength(charSequence.length() - 1);
        int i4 = 0;
        for (int i22 : iArr) {
            i4 += i22;
        }
        c5664a = (b - b2) - i4;
        if (b == a2 || (c5664a << 1) >= i4) {
            if (this.f28246c != null) {
                Map<DecodeHintType, ?> length = charSequence.length() - 1;
                a2 = 0;
                for (map = null; map < length; map++) {
                    a2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f28248e.charAt(map));
                }
                if (charSequence.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(a2 % 43)) {
                    throw ChecksumException.m30471a();
                }
                charSequence.setLength(length);
            }
            if (charSequence.length() == null) {
                throw NotFoundException.m30473a();
            }
            if (this.f28247d != null) {
                c5664a = C7805d.m33543a(charSequence);
            } else {
                c5664a = charSequence.toString();
            }
            float f = ((float) b2) + (((float) i4) / 2.0f);
            r5 = new C5675g[2];
            i = (float) i;
            r5[0] = new C5675g(((float) (a[1] + a[0])) / 1073741824, i);
            r5[1] = new C5675g(f, i);
            return new C5674f(c5664a, null, r5, BarcodeFormat.CODE_39);
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    private static int[] m33544a(C5664a c5664a, int[] iArr) throws NotFoundException {
        int a = c5664a.m24751a();
        int b = c5664a.m24759b(0);
        int length = iArr.length;
        int i = b;
        int i2 = 0;
        int i3 = 0;
        while (b < a) {
            if ((c5664a.m24756a(b) ^ i2) != 0) {
                iArr[i3] = iArr[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (C7805d.m33542a(iArr) == f28245b && c5664a.m24757a(Math.max(0, i - ((b - i) / 2)), i, false)) {
                    return new int[]{i, b};
                } else {
                    i += iArr[0] + iArr[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i4] = 0;
                    i3--;
                }
                iArr[i3] = 1;
                i2 ^= 1;
            }
            b++;
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    private static int m33542a(int[] iArr) {
        int i;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            int i3 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (int i4 : iArr) {
                if (i4 < i3 && i4 > r2) {
                    i3 = i4;
                }
            }
            int i5 = 0;
            i = 0;
            int i42 = 0;
            for (i2 = 0; i2 < length; i2++) {
                int i6 = iArr[i2];
                if (i6 > i3) {
                    i |= 1 << ((length - 1) - i2);
                    i5++;
                    i42 += i6;
                }
            }
            if (i5 == 3) {
                break;
            } else if (i5 <= 3) {
                return -1;
            } else {
                i2 = i3;
            }
        }
        for (int i7 = 0; i7 < length && i5 > 0; i7++) {
            i2 = iArr[i7];
            if (i2 > i3) {
                i5--;
                if ((i2 << 1) >= i42) {
                    return -1;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private static char m33541a(int i) throws NotFoundException {
        for (int i2 = 0; i2 < f28244a.length; i2++) {
            if (f28244a[i2] == i) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".charAt(i2);
            }
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    private static String m33543a(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (!(charAt == '+' || charAt == '$' || charAt == '%')) {
                if (charAt != '/') {
                    stringBuilder.append(charAt);
                    i++;
                }
            }
            i++;
            char charAt2 = charSequence.charAt(i);
            if (charAt != '+') {
                if (charAt != '/') {
                    switch (charAt) {
                        case '$':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                charAt = (char) (charAt2 - 64);
                                break;
                            }
                            throw FormatException.m30472a();
                            break;
                        case '%':
                            if (charAt2 < 'A' || charAt2 > 'E') {
                                if (charAt2 >= 'F' && charAt2 <= 'W') {
                                    charAt = (char) (charAt2 - 11);
                                    break;
                                }
                                throw FormatException.m30472a();
                            }
                            charAt = (char) (charAt2 - 38);
                            break;
                            break;
                        default:
                            charAt = '\u0000';
                            break;
                    }
                } else if (charAt2 >= 'A' && charAt2 <= 'O') {
                    charAt = (char) (charAt2 - 32);
                } else if (charAt2 == 'Z') {
                    charAt = ':';
                } else {
                    throw FormatException.m30472a();
                }
            } else if (charAt2 < 'A' || charAt2 > 'Z') {
                throw FormatException.m30472a();
            } else {
                charAt = (char) (charAt2 + 32);
            }
            stringBuilder.append(charAt);
            i++;
        }
        return stringBuilder.toString();
    }
}
