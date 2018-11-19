package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5674f;
import com.google.zxing.C5675g;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C5664a;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.f */
public final class C7807f extends C7001n {
    /* renamed from: a */
    static final int[] f28250a;
    /* renamed from: b */
    private static final char[] f28251b = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    /* renamed from: c */
    private static final int f28252c;
    /* renamed from: d */
    private final StringBuilder f28253d;
    /* renamed from: e */
    private final int[] f28254e;

    static {
        int[] iArr = new int[]{276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, MapboxConstants.ANIMATION_DURATION, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f28250a = iArr;
        f28252c = iArr[47];
    }

    /* renamed from: a */
    public C5674f mo7371a(int i, C5664a c5664a, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int i2;
        map = m33552a(c5664a);
        int b = c5664a.m24759b(map[1]);
        int a = c5664a.m24751a();
        int[] iArr = this.f28254e;
        Arrays.fill(iArr, 0);
        CharSequence charSequence = this.f28253d;
        charSequence.setLength(0);
        while (true) {
            C7001n.m30502a(c5664a, b, iArr);
            int a2 = C7807f.m33549a(iArr);
            if (a2 < 0) {
                throw NotFoundException.m30473a();
            }
            char a3 = C7807f.m33548a(a2);
            charSequence.append(a3);
            i2 = b;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int b2 = c5664a.m24759b(i2);
            if (a3 == '*') {
                break;
            }
            b = b2;
        }
        charSequence.deleteCharAt(charSequence.length() - 1);
        i2 = 0;
        for (int i32 : iArr) {
            i2 += i32;
        }
        if (b2 != a) {
            if (c5664a.m24756a(b2) != null) {
                if (charSequence.length() < 2) {
                    throw NotFoundException.m30473a();
                }
                C7807f.m33553b(charSequence);
                charSequence.setLength(charSequence.length() - 2);
                c5664a = C7807f.m33550a(charSequence);
                float f = ((float) b) + (((float) i2) / 2.0f);
                r2 = new C5675g[2];
                i = (float) i;
                r2[0] = new C5675g(((float) (map[1] + map[0])) / 1073741824, i);
                r2[1] = new C5675g(f, i);
                return new C5674f(c5664a, null, r2, BarcodeFormat.CODE_93);
            }
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    private int[] m33552a(C5664a c5664a) throws NotFoundException {
        int a = c5664a.m24751a();
        int b = c5664a.m24759b(0);
        Arrays.fill(this.f28254e, 0);
        int[] iArr = this.f28254e;
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
                } else if (C7807f.m33549a(iArr) == f28252c) {
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
    private static int m33549a(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        int i22 = 0;
        while (i3 < length) {
            int round = Math.round((((float) iArr[i3]) * 9.0f) / ((float) i));
            if (round > 0) {
                if (round <= 4) {
                    if ((i3 & 1) == 0) {
                        int i4 = i22;
                        for (i22 = 0; i22 < round; i22++) {
                            i4 = (i4 << 1) | 1;
                        }
                        i22 = i4;
                    } else {
                        i22 <<= round;
                    }
                    i3++;
                }
            }
            return -1;
        }
        return i22;
    }

    /* renamed from: a */
    private static char m33548a(int i) throws NotFoundException {
        for (int i2 = 0; i2 < f28250a.length; i2++) {
            if (f28250a[i2] == i) {
                return f28251b[i2];
            }
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    private static String m33550a(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 'a' || charAt > 'd') {
                stringBuilder.append(charAt);
            } else if (i >= length - 1) {
                throw FormatException.m30472a();
            } else {
                i++;
                char charAt2 = charSequence.charAt(i);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            charAt = (char) (charAt2 - 64);
                            break;
                        }
                        throw FormatException.m30472a();
                    case 'b':
                        if (charAt2 < 'A' || charAt2 > 'E') {
                            if (charAt2 < 'F' || charAt2 > 'J') {
                                if (charAt2 < 'K' || charAt2 > 'O') {
                                    if (charAt2 < 'P' || charAt2 > 'S') {
                                        if (charAt2 >= 'T' && charAt2 <= 'Z') {
                                            charAt = '';
                                            break;
                                        }
                                        throw FormatException.m30472a();
                                    }
                                    charAt = (char) (charAt2 + 43);
                                    break;
                                }
                                charAt = (char) (charAt2 + 16);
                                break;
                            }
                            charAt = (char) (charAt2 - 11);
                            break;
                        }
                        charAt = (char) (charAt2 - 38);
                        break;
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            charAt = (char) (charAt2 - 32);
                            break;
                        } else if (charAt2 == 'Z') {
                            charAt = ':';
                            break;
                        } else {
                            throw FormatException.m30472a();
                        }
                        break;
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            charAt = (char) (charAt2 + 32);
                            break;
                        }
                        throw FormatException.m30472a();
                        break;
                    default:
                        charAt = '\u0000';
                        break;
                }
                stringBuilder.append(charAt);
            }
            i++;
        }
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static void m33553b(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        C7807f.m33551a(charSequence, length - 2, 20);
        C7807f.m33551a(charSequence, length - 1, 15);
    }

    /* renamed from: a */
    private static void m33551a(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f28251b[i3 % 47]) {
            throw ChecksumException.m30471a();
        }
    }
}
