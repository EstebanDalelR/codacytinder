package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.C2074g;
import com.google.android.exoplayer2.extractor.C2076i;
import com.google.android.exoplayer2.extractor.SeekMap.C2054a;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.C3634a;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.extractor.mp3.a */
final class C4238a implements C3634a {
    /* renamed from: a */
    private final long f13573a;
    /* renamed from: b */
    private final int f13574b;
    /* renamed from: c */
    private final long f13575c;
    /* renamed from: d */
    private final int f13576d;
    /* renamed from: e */
    private final long f13577e;

    public C4238a(long j, long j2, C2074g c2074g) {
        this.f13573a = j2;
        this.f13574b = c2074g.f5721c;
        this.f13576d = c2074g.f5724f;
        if (j == -1) {
            this.f13575c = -1;
            this.f13577e = -9223372036854775807L;
            return;
        }
        this.f13575c = j - j2;
        this.f13577e = mo3477a(j);
    }

    public boolean isSeekable() {
        return this.f13575c != -1;
    }

    public C2054a getSeekPoints(long j) {
        if (this.f13575c == -1) {
            return new C2054a(new C2076i(0, this.f13573a));
        }
        long a = C2314v.m8462a((((((long) this.f13576d) * j) / 8000000) / ((long) this.f13574b)) * ((long) this.f13574b), 0, this.f13575c - ((long) this.f13574b));
        long j2 = this.f13573a + a;
        long a2 = mo3477a(j2);
        C2076i c2076i = new C2076i(a2, j2);
        if (a2 < j) {
            if (a != this.f13575c - ((long) this.f13574b)) {
                a = j2 + ((long) this.f13574b);
                return new C2054a(c2076i, new C2076i(mo3477a(a), a));
            }
        }
        return new C2054a(c2076i);
    }

    /* renamed from: a */
    public long mo3477a(long j) {
        return ((Math.max(0, j - this.f13573a) * 1000000) * 8) / ((long) this.f13576d);
    }

    public long getDurationUs() {
        return this.f13577e;
    }
}
