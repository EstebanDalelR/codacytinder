package com.google.android.exoplayer2.source;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.source.ShuffleOrder.C3671a;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.source.i */
public final class C4374i extends C4250d<Void> {
    /* renamed from: a */
    private final MediaSource f14465a;
    /* renamed from: b */
    private final int f14466b;
    /* renamed from: c */
    private int f14467c;

    /* renamed from: com.google.android.exoplayer2.source.i$a */
    private static final class C4253a extends C3690h {
        public C4253a(C2165q c2165q) {
            super(c2165q);
        }

        /* renamed from: a */
        public int mo2334a(int i, int i2, boolean z) {
            i = this.b.mo2334a(i, i2, z);
            return i == -1 ? mo2337b(z) : i;
        }

        /* renamed from: b */
        public int mo2336b(int i, int i2, boolean z) {
            i = this.b.mo2336b(i, i2, z);
            return i == -1 ? mo2335a(z) : i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.i$b */
    private static final class C4254b extends C3672a {
        /* renamed from: b */
        private final C2165q f13759b;
        /* renamed from: c */
        private final int f13760c;
        /* renamed from: d */
        private final int f13761d;
        /* renamed from: e */
        private final int f13762e;

        public C4254b(C2165q c2165q, int i) {
            boolean z = false;
            super(false, new C3671a(i));
            this.f13759b = c2165q;
            this.f13760c = c2165q.mo2319c();
            this.f13761d = c2165q.mo2318b();
            this.f13762e = i;
            if (this.f13760c > null) {
                if (i <= Integer.MAX_VALUE / this.f13760c) {
                    z = true;
                }
                C2289a.m8314b(z, "LoopingMediaSource contains too many periods");
            }
        }

        /* renamed from: b */
        public int mo2318b() {
            return this.f13761d * this.f13762e;
        }

        /* renamed from: c */
        public int mo2319c() {
            return this.f13760c * this.f13762e;
        }

        /* renamed from: a */
        protected int mo3501a(int i) {
            return i / this.f13760c;
        }

        /* renamed from: b */
        protected int mo3502b(int i) {
            return i / this.f13761d;
        }

        /* renamed from: b */
        protected int mo3503b(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        /* renamed from: c */
        protected C2165q mo3504c(int i) {
            return this.f13759b;
        }

        /* renamed from: d */
        protected int mo3505d(int i) {
            return i * this.f13760c;
        }

        /* renamed from: e */
        protected int mo3506e(int i) {
            return i * this.f13761d;
        }

        /* renamed from: f */
        protected Object mo3507f(int i) {
            return Integer.valueOf(i);
        }
    }

    public C4374i(MediaSource mediaSource) {
        this(mediaSource, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public C4374i(MediaSource mediaSource, int i) {
        C2289a.m8311a(i > 0);
        this.f14465a = mediaSource;
        this.f14466b = i;
    }

    /* renamed from: a */
    public void mo3495a(ExoPlayer exoPlayer, boolean z) {
        super.mo3495a(exoPlayer, z);
        m16958a((Object) false, (MediaSource) this.f14465a);
    }

    public MediaPeriod createPeriod(C2166a c2166a, Allocator allocator) {
        if (this.f14466b != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return this.f14465a.createPeriod(c2166a.m7820a(c2166a.f6223a % this.f14467c), allocator);
        }
        return this.f14465a.createPeriod(c2166a, allocator);
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        this.f14465a.releasePeriod(mediaPeriod);
    }

    /* renamed from: a */
    public void mo3493a() {
        super.mo3493a();
        this.f14467c = 0;
    }

    /* renamed from: a */
    protected void m18028a(Void voidR, MediaSource mediaSource, C2165q c2165q, @Nullable Object obj) {
        this.f14467c = c2165q.mo2319c();
        m13916a((C2165q) this.f14466b != Integer.MAX_VALUE ? new C4254b(c2165q, this.f14466b) : new C4253a(c2165q), obj);
    }
}
