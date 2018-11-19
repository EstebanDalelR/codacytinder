package com.google.android.exoplayer2.source;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.C2165q.C2163a;
import com.google.android.exoplayer2.C2165q.C2164b;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public final class ClippingMediaSource extends C4250d<Void> {
    /* renamed from: a */
    private final MediaSource f14402a;
    /* renamed from: b */
    private final long f14403b;
    /* renamed from: c */
    private final long f14404c;
    /* renamed from: d */
    private final boolean f14405d;
    /* renamed from: e */
    private final boolean f14406e;
    /* renamed from: f */
    private final boolean f14407f;
    /* renamed from: g */
    private final ArrayList<C4247c> f14408g;
    /* renamed from: h */
    private final C2164b f14409h;
    @Nullable
    /* renamed from: i */
    private Object f14410i;
    /* renamed from: j */
    private C4244a f14411j;
    /* renamed from: k */
    private IllegalClippingException f14412k;
    /* renamed from: l */
    private long f14413l;
    /* renamed from: m */
    private long f14414m;

    public static final class IllegalClippingException extends IOException {
        /* renamed from: a */
        public final int f6222a;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        /* renamed from: a */
        private static String m7819a(int i) {
            switch (i) {
                case 0:
                    return "invalid period count";
                case 1:
                    return "not seekable to start";
                case 2:
                    return "start exceeds end";
                default:
                    return "unknown";
            }
        }

        public IllegalClippingException(int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal clipping: ");
            stringBuilder.append(m7819a(i));
            super(stringBuilder.toString());
            this.f6222a = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.ClippingMediaSource$a */
    private static final class C4244a extends C3690h {
        /* renamed from: c */
        private final long f13639c;
        /* renamed from: d */
        private final long f13640d;
        /* renamed from: e */
        private final long f13641e;
        /* renamed from: f */
        private final boolean f13642f;

        public C4244a(C2165q c2165q, long j, long j2) throws IllegalClippingException {
            super(c2165q);
            boolean z = true;
            if (c2165q.mo2319c() != 1) {
                throw new IllegalClippingException(0);
            }
            c2165q = c2165q.m7800a(0, new C2164b(), false);
            j = Math.max(0, j);
            j2 = j2 == Long.MIN_VALUE ? c2165q.f6217i : Math.max(0, j2);
            if (c2165q.f6217i != -9223372036854775807L) {
                if (j2 > c2165q.f6217i) {
                    j2 = c2165q.f6217i;
                }
                if (j != 0 && !c2165q.f6212d) {
                    throw new IllegalClippingException(1);
                } else if (j > j2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f13639c = j;
            this.f13640d = j2;
            this.f13641e = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j;
            if (c2165q.f6213e != null) {
                if (j2 != -9223372036854775807L) {
                    if (c2165q.f6217i != -9223372036854775807L && j2 == c2165q.f6217i) {
                    }
                }
                this.f13642f = z;
            }
            z = false;
            this.f13642f = z;
        }

        /* renamed from: a */
        public C2164b mo2317a(int i, C2164b c2164b, boolean z, long j) {
            this.b.mo2317a(0, c2164b, z, 0);
            c2164b.f6218j += this.f13639c;
            c2164b.f6217i = this.f13641e;
            c2164b.f6213e = this.f13642f;
            if (!c2164b.f6216h) {
                c2164b.f6216h = Math.max(c2164b.f6216h, this.f13639c);
                if (this.f13640d) {
                    z = c2164b.f6216h;
                } else {
                    z = Math.min(c2164b.f6216h, this.f13640d);
                }
                c2164b.f6216h = z;
                c2164b.f6216h -= this.f13639c;
            }
            z = C2005C.m7215a(this.f13639c);
            if (c2164b.f6210b != -9223372036854775807L) {
                c2164b.f6210b += z;
            }
            if (c2164b.f6211c != -9223372036854775807L) {
                c2164b.f6211c += z;
            }
            return c2164b;
        }

        /* renamed from: a */
        public C2163a mo2316a(int i, C2163a c2163a, boolean z) {
            this.b.mo2316a(0, c2163a, z);
            long c = c2163a.m7780c() - this.f13639c;
            long j = -9223372036854775807L;
            if (this.f13641e != -9223372036854775807L) {
                j = this.f13641e - c;
            }
            return c2163a.m7774a(c2163a.f6203a, c2163a.f6204b, 0, j, c);
        }
    }

    /* renamed from: a */
    public void mo3495a(ExoPlayer exoPlayer, boolean z) {
        super.mo3495a(exoPlayer, z);
        m16958a((Object) false, (MediaSource) this.f14402a);
    }

    public void maybeThrowSourceInfoRefreshError() throws IOException {
        if (this.f14412k != null) {
            throw this.f14412k;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    public MediaPeriod createPeriod(C2166a c2166a, Allocator allocator) {
        MediaPeriod c4247c = new C4247c(this.f14402a.createPeriod(c2166a, allocator), this.f14405d, this.f14413l, this.f14414m);
        this.f14408g.add(c4247c);
        return c4247c;
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        C2289a.m8313b(this.f14408g.remove(mediaPeriod));
        this.f14402a.releasePeriod(((C4247c) mediaPeriod).f13670a);
        if (this.f14408g.isEmpty() != null && this.f14406e == null) {
            m17984a(this.f14411j.b);
        }
    }

    /* renamed from: a */
    public void mo3493a() {
        super.mo3493a();
        this.f14412k = null;
        this.f14411j = null;
    }

    /* renamed from: a */
    protected void m17990a(Void voidR, MediaSource mediaSource, C2165q c2165q, @Nullable Object obj) {
        if (this.f14412k == null) {
            this.f14410i = obj;
            m17984a(c2165q);
        }
    }

    /* renamed from: a */
    private void m17984a(C2165q c2165q) {
        long j;
        long j2;
        int i = 0;
        C2165q c2165q2 = c2165q;
        c2165q2.m7799a(0, this.f14409h);
        long d = this.f14409h.m7790d();
        long j3 = Long.MIN_VALUE;
        if (!(this.f14411j == null || r1.f14408g.isEmpty())) {
            if (!r1.f14406e) {
                j = r1.f14413l - d;
                if (r1.f14404c != Long.MIN_VALUE) {
                    j3 = r1.f14414m - d;
                }
                d = j;
                r1.f14411j = new C4244a(c2165q2, d, j3);
                m13916a(r1.f14411j, r1.f14410i);
            }
        }
        j = r1.f14403b;
        long j4 = r1.f14404c;
        if (r1.f14407f) {
            long b = r1.f14409h.m7788b();
            j2 = j + b;
            j4 += b;
        } else {
            j2 = j;
        }
        r1.f14413l = d + j2;
        if (r1.f14404c != Long.MIN_VALUE) {
            j3 = d + j4;
        }
        r1.f14414m = j3;
        int size = r1.f14408g.size();
        while (i < size) {
            ((C4247c) r1.f14408g.get(i)).m16944a(r1.f14413l, r1.f14414m);
            i++;
        }
        j3 = j4;
        d = j2;
        try {
            r1.f14411j = new C4244a(c2165q2, d, j3);
            m13916a(r1.f14411j, r1.f14410i);
        } catch (IllegalClippingException e) {
            r1.f14412k = e;
        }
    }

    /* renamed from: a */
    protected long m17986a(Void voidR, long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long a = C2005C.m7215a(this.f14403b);
        voidR = Math.max(0, j - a);
        if (this.f14404c != Long.MIN_VALUE) {
            voidR = Math.min(C2005C.m7215a(this.f14404c) - a, voidR);
        }
        return voidR;
    }
}
