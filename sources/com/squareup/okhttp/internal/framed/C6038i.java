package com.squareup.okhttp.internal.framed;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.Arrays;

/* renamed from: com.squareup.okhttp.internal.framed.i */
public final class C6038i {
    /* renamed from: a */
    private int f22129a;
    /* renamed from: b */
    private int f22130b;
    /* renamed from: c */
    private int f22131c;
    /* renamed from: d */
    private final int[] f22132d = new int[10];

    /* renamed from: a */
    void m26095a() {
        this.f22131c = 0;
        this.f22130b = 0;
        this.f22129a = 0;
        Arrays.fill(this.f22132d, 0);
    }

    /* renamed from: a */
    C6038i m26094a(int i, int i2, int i3) {
        if (i >= this.f22132d.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f22129a |= i4;
        if ((i2 & 1) != 0) {
            this.f22130b |= i4;
        } else {
            this.f22130b &= i4 ^ -1;
        }
        if ((i2 & 2) != 0) {
            this.f22131c |= i4;
        } else {
            this.f22131c &= i4 ^ -1;
        }
        this.f22132d[i] = i3;
        return this;
    }

    /* renamed from: a */
    boolean m26097a(int i) {
        return ((1 << i) & this.f22129a) != 0;
    }

    /* renamed from: b */
    int m26099b(int i) {
        return this.f22132d[i];
    }

    /* renamed from: c */
    int m26101c(int i) {
        int i2 = m26105g(i) ? 2 : 0;
        return m26104f(i) != 0 ? i2 | 1 : i2;
    }

    /* renamed from: b */
    int m26098b() {
        return Integer.bitCount(this.f22129a);
    }

    /* renamed from: c */
    int m26100c() {
        return (this.f22129a & 2) != 0 ? this.f22132d[1] : -1;
    }

    /* renamed from: d */
    int m26102d(int i) {
        return (this.f22129a & 32) != 0 ? this.f22132d[5] : i;
    }

    /* renamed from: e */
    int m26103e(int i) {
        return (this.f22129a & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? this.f22132d[7] : i;
    }

    /* renamed from: f */
    boolean m26104f(int i) {
        return ((1 << i) & this.f22130b) != 0;
    }

    /* renamed from: g */
    boolean m26105g(int i) {
        return ((1 << i) & this.f22131c) != 0;
    }

    /* renamed from: a */
    void m26096a(C6038i c6038i) {
        for (int i = 0; i < 10; i++) {
            if (c6038i.m26097a(i)) {
                m26094a(i, c6038i.m26101c(i), c6038i.m26099b(i));
            }
        }
    }
}
