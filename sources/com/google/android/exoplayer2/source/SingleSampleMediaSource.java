package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;

public final class SingleSampleMediaSource extends C3675b {
    /* renamed from: a */
    private final DataSpec f13662a;
    /* renamed from: b */
    private final Factory f13663b;
    /* renamed from: c */
    private final Format f13664c;
    /* renamed from: d */
    private final long f13665d;
    /* renamed from: e */
    private final int f13666e;
    /* renamed from: f */
    private final boolean f13667f;
    /* renamed from: g */
    private final C2165q f13668g;

    @Deprecated
    public interface EventListener {
        void onLoadError(int i, IOException iOException);
    }

    /* renamed from: a */
    public void mo3493a() {
    }

    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    /* renamed from: a */
    public void mo3495a(ExoPlayer exoPlayer, boolean z) {
        m13916a((C2165q) this.f13668g, (Object) false);
    }

    public MediaPeriod createPeriod(C2166a c2166a, Allocator allocator) {
        C2289a.m8311a(c2166a.f6223a == null ? true : null);
        return new C4256m(this.f13662a, this.f13663b, this.f13664c, this.f13665d, this.f13666e, m13913a(c2166a), this.f13667f);
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((C4256m) mediaPeriod).m17016a();
    }
}
