package com.google.zxing.oned;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5674f;
import com.google.zxing.C5675g;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C5664a;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.a */
public final class C7802a extends C7001n {
    /* renamed from: a */
    static final char[] f28233a = "0123456789-$:/.+ABCD".toCharArray();
    /* renamed from: b */
    static final int[] f28234b = new int[]{3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    /* renamed from: c */
    private static final char[] f28235c = new char[]{'A', 'B', 'C', 'D'};
    /* renamed from: d */
    private final StringBuilder f28236d;
    /* renamed from: e */
    private int[] f28237e;
    /* renamed from: f */
    private int f28238f;

    /* renamed from: a */
    public C5674f mo7371a(int i, C5664a c5664a, Map<DecodeHintType, ?> map) throws NotFoundException {
        int c;
        Arrays.fill(this.f28237e, 0);
        m33532a(c5664a);
        c5664a = m33530a();
        this.f28236d.setLength(0);
        int i2 = c5664a;
        do {
            c = m33535c(i2);
            if (c != -1) {
                this.f28236d.append((char) c);
                i2 += 8;
                if (this.f28236d.length() > 1 && C7802a.m33533a(f28235c, f28233a[c])) {
                    break;
                }
            } else {
                throw NotFoundException.m30473a();
            }
        } while (i2 < this.f28238f);
        int i3 = i2 - 1;
        c = this.f28237e[i3];
        int i4 = 0;
        for (int i5 = -8; i5 < -1; i5++) {
            i4 += this.f28237e[i2 + i5];
        }
        if (i2 >= this.f28238f || c >= i4 / 2) {
            m33531a((int) c5664a);
            for (i2 = 0; i2 < this.f28236d.length(); i2++) {
                this.f28236d.setCharAt(i2, f28233a[this.f28236d.charAt(i2)]);
            }
            if (C7802a.m33533a(f28235c, this.f28236d.charAt(0))) {
                if (!C7802a.m33533a(f28235c, this.f28236d.charAt(this.f28236d.length() - 1))) {
                    throw NotFoundException.m30473a();
                } else if (this.f28236d.length() <= 3) {
                    throw NotFoundException.m30473a();
                } else {
                    if (map == null || map.containsKey(DecodeHintType.RETURN_CODABAR_START_END) == null) {
                        this.f28236d.deleteCharAt(this.f28236d.length() - 1);
                        this.f28236d.deleteCharAt(0);
                    }
                    i2 = 0;
                    for (map = null; map < c5664a; map++) {
                        i2 += this.f28237e[map];
                    }
                    map = (float) i2;
                    while (c5664a < i3) {
                        i2 += this.f28237e[c5664a];
                        c5664a++;
                    }
                    c5664a = (float) i2;
                    String stringBuilder = this.f28236d.toString();
                    r4 = new C5675g[2];
                    i = (float) i;
                    r4[0] = new C5675g(map, i);
                    r4[1] = new C5675g(c5664a, i);
                    return new C5674f(stringBuilder, null, r4, BarcodeFormat.CODABAR);
                }
            }
            throw NotFoundException.m30473a();
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    private void m33531a(int i) throws NotFoundException {
        int i2;
        int[] iArr = new int[]{0, 0, 0, 0};
        int[] iArr2 = new int[]{0, 0, 0, 0};
        int length = this.f28236d.length() - 1;
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (true) {
            int i6 = f28234b[this.f28236d.charAt(i5)];
            for (i2 = 6; i2 >= 0; i2--) {
                int i7 = (i2 & 1) + ((i6 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f28237e[i4 + i2];
                iArr2[i7] = iArr2[i7] + 1;
                i6 >>= 1;
            }
            if (i5 >= length) {
                break;
            }
            i4 += 8;
            i5++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (i4 = 0; i4 < 2; i4++) {
            fArr2[i4] = 0.0f;
            i2 = i4 + 2;
            fArr2[i2] = ((((float) iArr[i4]) / ((float) iArr2[i4])) + (((float) iArr[i2]) / ((float) iArr2[i2]))) / 2.0f;
            fArr[i4] = fArr2[i2];
            fArr[i2] = ((((float) iArr[i2]) * 2.0f) + 1.5f) / ((float) iArr2[i2]);
        }
        loop3:
        while (true) {
            int i8 = f28234b[this.f28236d.charAt(i3)];
            int i9 = 6;
            while (i9 >= 0) {
                i4 = (i9 & 1) + ((i8 & 1) << 1);
                float f = (float) this.f28237e[i + i9];
                if (f < fArr2[i4]) {
                    break loop3;
                } else if (f > fArr[i4]) {
                    break loop3;
                } else {
                    i8 >>= 1;
                    i9--;
                }
            }
            if (i3 < length) {
                i += 8;
                i3++;
            } else {
                return;
            }
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    private void m33532a(C5664a c5664a) throws NotFoundException {
        this.f28238f = 0;
        int c = c5664a.m24761c(0);
        int a = c5664a.m24751a();
        if (c >= a) {
            throw NotFoundException.m30473a();
        }
        int i = 1;
        int i2 = 0;
        while (c < a) {
            if ((c5664a.m24756a(c) ^ i) != 0) {
                i2++;
            } else {
                m33534b(i2);
                i ^= 1;
                i2 = 1;
            }
            c++;
        }
        m33534b(i2);
    }

    /* renamed from: b */
    private void m33534b(int i) {
        this.f28237e[this.f28238f] = i;
        this.f28238f++;
        if (this.f28238f >= this.f28237e.length) {
            i = new int[(this.f28238f << 1)];
            System.arraycopy(this.f28237e, 0, i, 0, this.f28238f);
            this.f28237e = i;
        }
    }

    /* renamed from: a */
    private int m33530a() throws NotFoundException {
        int i = 1;
        while (i < this.f28238f) {
            int c = m33535c(i);
            if (c != -1 && C7802a.m33533a(f28235c, f28233a[c])) {
                int i2 = 0;
                for (c = i; c < i + 7; c++) {
                    i2 += this.f28237e[c];
                }
                if (i == 1 || this.f28237e[i - 1] >= i2 / 2) {
                    return i;
                }
            }
            i += 2;
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    static boolean m33533a(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return 1;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private int m33535c(int i) {
        int i2 = i + 7;
        if (i2 >= this.f28238f) {
            return -1;
        }
        int i3;
        int[] iArr = this.f28237e;
        int i4 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i5 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i6 = 0;
        for (i3 = i; i3 < i2; i3 += 2) {
            int i7 = iArr[i3];
            if (i7 < i5) {
                i5 = i7;
            }
            if (i7 > i6) {
                i6 = i7;
            }
        }
        i5 = (i5 + i6) / 2;
        i6 = 0;
        for (i3 = i + 1; i3 < i2; i3 += 2) {
            i7 = iArr[i3];
            if (i7 < i4) {
                i4 = i7;
            }
            if (i7 > i6) {
                i6 = i7;
            }
        }
        i2 = (i4 + i6) / 2;
        i3 = ProfileEditingConfig.DEFAULT_MAX_LENGTH;
        i6 = 0;
        for (i4 = 0; i4 < 7; i4++) {
            i3 >>= 1;
            if (iArr[i + i4] > ((i4 & 1) == 0 ? i5 : i2)) {
                i6 |= i3;
            }
        }
        for (int i8 = 0; i8 < f28234b.length; i8++) {
            if (f28234b[i8] == i6) {
                return i8;
            }
        }
        return -1;
    }
}
