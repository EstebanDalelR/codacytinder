package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.C4251g.C2205c;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2178b;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2179c;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;

public final class ExtractorMediaSource extends C3675b implements C2205c {
    /* renamed from: a */
    private final Uri f13653a;
    /* renamed from: b */
    private final Factory f13654b;
    /* renamed from: c */
    private final ExtractorsFactory f13655c;
    /* renamed from: d */
    private final int f13656d;
    /* renamed from: e */
    private final String f13657e;
    /* renamed from: f */
    private final int f13658f;
    @Nullable
    /* renamed from: g */
    private final Object f13659g;
    /* renamed from: h */
    private long f13660h;
    /* renamed from: i */
    private boolean f13661i;

    @Deprecated
    public interface EventListener {
        void onLoadError(IOException iOException);
    }

    /* renamed from: com.google.android.exoplayer2.source.ExtractorMediaSource$a */
    private static final class C4245a extends C3686e {
        /* renamed from: a */
        private final EventListener f13652a;

        public C4245a(EventListener eventListener) {
            this.f13652a = (EventListener) C2289a.m8309a((Object) eventListener);
        }

        public void onLoadError(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c, IOException iOException, boolean z) {
            this.f13652a.onLoadError(iOException);
        }
    }

    /* renamed from: a */
    public void mo3493a() {
    }

    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    @Deprecated
    public ExtractorMediaSource(Uri uri, Factory factory, ExtractorsFactory extractorsFactory, Handler handler, EventListener eventListener) {
        this(uri, factory, extractorsFactory, handler, eventListener, null);
    }

    @Deprecated
    public ExtractorMediaSource(Uri uri, Factory factory, ExtractorsFactory extractorsFactory, Handler handler, EventListener eventListener, String str) {
        this(uri, factory, extractorsFactory, -1, handler, eventListener, str, 1048576);
    }

    @Deprecated
    public ExtractorMediaSource(Uri uri, Factory factory, ExtractorsFactory extractorsFactory, int i, Handler handler, EventListener eventListener, String str, int i2) {
        Handler handler2 = handler;
        EventListener eventListener2 = eventListener;
        this(uri, factory, extractorsFactory, i, str, i2, null);
        if (eventListener2 == null || handler2 == null) {
            ExtractorMediaSource extractorMediaSource = this;
            return;
        }
        addEventListener(handler2, new C4245a(eventListener2));
    }

    private ExtractorMediaSource(Uri uri, Factory factory, ExtractorsFactory extractorsFactory, int i, @Nullable String str, int i2, @Nullable Object obj) {
        this.f13653a = uri;
        this.f13654b = factory;
        this.f13655c = extractorsFactory;
        this.f13656d = i;
        this.f13657e = str;
        this.f13658f = i2;
        this.f13660h = 1;
        this.f13659g = obj;
    }

    /* renamed from: a */
    public void mo3495a(ExoPlayer exoPlayer, boolean z) {
        m16934b(this.f13660h, false);
    }

    public MediaPeriod createPeriod(C2166a c2166a, Allocator allocator) {
        C2289a.m8311a(c2166a.f6223a == 0);
        return new C4251g(this.f13653a, this.f13654b.createDataSource(), this.f13655c.createExtractors(), this.f13656d, m13913a(c2166a), this, allocator, this.f13657e, this.f13658f);
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((C4251g) mediaPeriod).m16989a();
    }

    /* renamed from: a */
    public void mo3494a(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f13660h;
        }
        if (this.f13660h != j || this.f13661i != z) {
            m16934b(j, z);
        }
    }

    /* renamed from: b */
    private void m16934b(long j, boolean z) {
        this.f13660h = j;
        this.f13661i = z;
        m13916a((C2165q) new C3696l(this.f13660h, this.f13661i, false, this.f13659g), null);
    }
}
