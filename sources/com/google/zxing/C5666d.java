package com.google.zxing;

import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.zxing.d */
public abstract class C5666d {
    /* renamed from: a */
    private final int f20993a;
    /* renamed from: b */
    private final int f20994b;

    /* renamed from: a */
    public abstract byte[] m24775a(int i, byte[] bArr);

    /* renamed from: c */
    public boolean m24777c() {
        return false;
    }

    /* renamed from: a */
    public final int m24774a() {
        return this.f20993a;
    }

    /* renamed from: b */
    public final int m24776b() {
        return this.f20994b;
    }

    /* renamed from: d */
    public C5666d m24778d() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        byte[] bArr = new byte[this.f20993a];
        StringBuilder stringBuilder = new StringBuilder(this.f20994b * (this.f20993a + 1));
        byte[] bArr2 = bArr;
        for (int i = 0; i < this.f20994b; i++) {
            bArr2 = m24775a(i, bArr2);
            for (int i2 = 0; i2 < this.f20993a; i2++) {
                int i3 = bArr2[i2] & 255;
                char c = i3 < 64 ? '#' : i3 < ProfileEditingConfig.DEFAULT_MAX_LENGTH ? '+' : i3 < 192 ? '.' : ' ';
                stringBuilder.append(c);
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
