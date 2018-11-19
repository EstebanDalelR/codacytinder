package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.support.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.audio.a */
public final class C2026a {
    /* renamed from: a */
    public static final C2026a f5553a = new C2025a().m7293a();
    /* renamed from: b */
    public final int f5554b;
    /* renamed from: c */
    public final int f5555c;
    /* renamed from: d */
    public final int f5556d;
    /* renamed from: e */
    private AudioAttributes f5557e;

    /* renamed from: com.google.android.exoplayer2.audio.a$a */
    public static final class C2025a {
        /* renamed from: a */
        private int f5550a = 0;
        /* renamed from: b */
        private int f5551b = 0;
        /* renamed from: c */
        private int f5552c = 1;

        /* renamed from: a */
        public C2026a m7293a() {
            return new C2026a(this.f5550a, this.f5551b, this.f5552c);
        }
    }

    private C2026a(int i, int i2, int i3) {
        this.f5554b = i;
        this.f5555c = i2;
        this.f5556d = i3;
    }

    @TargetApi(21)
    /* renamed from: a */
    AudioAttributes m7294a() {
        if (this.f5557e == null) {
            this.f5557e = new Builder().setContentType(this.f5554b).setFlags(this.f5555c).setUsage(this.f5556d).build();
        }
        return this.f5557e;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2026a c2026a = (C2026a) obj;
                if (this.f5554b != c2026a.f5554b || this.f5555c != c2026a.f5555c || this.f5556d != c2026a.f5556d) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f5554b) * 31) + this.f5555c) * 31) + this.f5556d;
    }
}
