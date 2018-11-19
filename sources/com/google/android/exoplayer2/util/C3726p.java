package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.C2153n;

/* renamed from: com.google.android.exoplayer2.util.p */
public final class C3726p implements MediaClock {
    /* renamed from: a */
    private final Clock f11764a;
    /* renamed from: b */
    private boolean f11765b;
    /* renamed from: c */
    private long f11766c;
    /* renamed from: d */
    private long f11767d;
    /* renamed from: e */
    private C2153n f11768e = C2153n.f6151a;

    public C3726p(Clock clock) {
        this.f11764a = clock;
    }

    /* renamed from: a */
    public void m14149a() {
        if (!this.f11765b) {
            this.f11767d = this.f11764a.elapsedRealtime();
            this.f11765b = true;
        }
    }

    /* renamed from: b */
    public void m14151b() {
        if (this.f11765b) {
            m14150a(getPositionUs());
            this.f11765b = false;
        }
    }

    /* renamed from: a */
    public void m14150a(long j) {
        this.f11766c = j;
        if (this.f11765b != null) {
            this.f11767d = this.f11764a.elapsedRealtime();
        }
    }

    public long getPositionUs() {
        long j = this.f11766c;
        if (!this.f11765b) {
            return j;
        }
        long elapsedRealtime = this.f11764a.elapsedRealtime() - this.f11767d;
        if (this.f11768e.f6152b == 1.0f) {
            return j + C2005C.m7216b(elapsedRealtime);
        }
        return j + this.f11768e.m7731a(elapsedRealtime);
    }

    public C2153n setPlaybackParameters(C2153n c2153n) {
        if (this.f11765b) {
            m14150a(getPositionUs());
        }
        this.f11768e = c2153n;
        return c2153n;
    }

    public C2153n getPlaybackParameters() {
        return this.f11768e;
    }
}
