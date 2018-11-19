package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.C2165q.C2163a;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.C4250d;
import com.google.android.exoplayer2.source.DeferredMediaPeriod;
import com.google.android.exoplayer2.source.DeferredMediaPeriod.PrepareErrorListener;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class AdsMediaSource extends C4250d<C2166a> {
    /* renamed from: a */
    private final MediaSource f14422a;
    /* renamed from: b */
    private final MediaSourceFactory f14423b;
    /* renamed from: c */
    private final AdsLoader f14424c;
    /* renamed from: d */
    private final ViewGroup f14425d;
    @Nullable
    /* renamed from: e */
    private final Handler f14426e;
    @Nullable
    /* renamed from: f */
    private final EventListener f14427f;
    /* renamed from: g */
    private final Handler f14428g;
    /* renamed from: h */
    private final Map<MediaSource, List<DeferredMediaPeriod>> f14429h;
    /* renamed from: i */
    private final C2163a f14430i;
    /* renamed from: j */
    private C3674b f14431j;
    /* renamed from: k */
    private C2165q f14432k;
    /* renamed from: l */
    private Object f14433l;
    /* renamed from: m */
    private AdPlaybackState f14434m;
    /* renamed from: n */
    private MediaSource[][] f14435n;
    /* renamed from: o */
    private long[][] f14436o;

    /* renamed from: com.google.android.exoplayer2.source.ads.AdsMediaSource$2 */
    class C21852 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ AdsMediaSource f6293a;

        C21852(AdsMediaSource adsMediaSource) {
            this.f6293a = adsMediaSource;
        }

        public void run() {
            this.f6293a.f14424c.detachPlayer();
        }
    }

    public static final class AdLoadException extends IOException {
        /* renamed from: a */
        public final int f6294a;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        /* renamed from: a */
        public static AdLoadException m7860a(Exception exception) {
            return new AdLoadException(0, exception);
        }

        private AdLoadException(int i, Exception exception) {
            super(exception);
            this.f6294a = i;
        }

        /* renamed from: a */
        public RuntimeException m7861a() {
            C2289a.m8313b(this.f6294a == 3);
            return (RuntimeException) getCause();
        }
    }

    @Deprecated
    public interface EventListener {
        void onAdClicked();

        void onAdLoadError(IOException iOException);

        void onAdTapped();

        void onInternalAdLoadError(RuntimeException runtimeException);
    }

    public interface MediaSourceFactory {
        MediaSource createMediaSource(Uri uri);

        int[] getSupportedTypes();
    }

    /* renamed from: com.google.android.exoplayer2.source.ads.AdsMediaSource$a */
    private final class C3673a implements PrepareErrorListener {
        /* renamed from: a */
        final /* synthetic */ AdsMediaSource f11361a;
        /* renamed from: b */
        private final Uri f11362b;
        /* renamed from: c */
        private final int f11363c;
        /* renamed from: d */
        private final int f11364d;

        public C3673a(AdsMediaSource adsMediaSource, Uri uri, int i, int i2) {
            this.f11361a = adsMediaSource;
            this.f11362b = uri;
            this.f11363c = i;
            this.f11364d = i2;
        }

        public void onPrepareError(C2166a c2166a, final IOException iOException) {
            this.f11361a.m13913a(c2166a).m7837a(new DataSpec(this.f11362b), 6, -1, 0, 0, AdLoadException.m7860a(iOException), true);
            this.f11361a.f14428g.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C3673a f6296b;

                public void run() {
                    this.f6296b.f11361a.f14424c.handlePrepareError(this.f6296b.f11363c, this.f6296b.f11364d, iOException);
                }
            });
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.ads.AdsMediaSource$b */
    private final class C3674b implements com.google.android.exoplayer2.source.ads.AdsLoader.EventListener {
        /* renamed from: a */
        final /* synthetic */ AdsMediaSource f11365a;
        /* renamed from: b */
        private final Handler f11366b = new Handler();
        /* renamed from: c */
        private volatile boolean f11367c;

        /* renamed from: com.google.android.exoplayer2.source.ads.AdsMediaSource$b$2 */
        class C21882 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C3674b f6299a;

            C21882(C3674b c3674b) {
                this.f6299a = c3674b;
            }

            public void run() {
                if (!this.f6299a.f11367c) {
                    this.f6299a.f11365a.f14427f.onAdClicked();
                }
            }
        }

        /* renamed from: com.google.android.exoplayer2.source.ads.AdsMediaSource$b$3 */
        class C21893 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C3674b f6300a;

            C21893(C3674b c3674b) {
                this.f6300a = c3674b;
            }

            public void run() {
                if (!this.f6300a.f11367c) {
                    this.f6300a.f11365a.f14427f.onAdTapped();
                }
            }
        }

        public C3674b(AdsMediaSource adsMediaSource) {
            this.f11365a = adsMediaSource;
        }

        /* renamed from: a */
        public void m13911a() {
            this.f11367c = true;
            this.f11366b.removeCallbacksAndMessages(null);
        }

        public void onAdPlaybackState(final AdPlaybackState adPlaybackState) {
            if (!this.f11367c) {
                this.f11366b.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C3674b f6298b;

                    public void run() {
                        if (!this.f6298b.f11367c) {
                            this.f6298b.f11365a.m17999a(adPlaybackState);
                        }
                    }
                });
            }
        }

        public void onAdClicked() {
            if (!(this.f11367c || this.f11365a.f14426e == null || this.f11365a.f14427f == null)) {
                this.f11365a.f14426e.post(new C21882(this));
            }
        }

        public void onAdTapped() {
            if (!(this.f11367c || this.f11365a.f14426e == null || this.f11365a.f14427f == null)) {
                this.f11365a.f14426e.post(new C21893(this));
            }
        }

        public void onAdLoadError(final AdLoadException adLoadException, DataSpec dataSpec) {
            if (!this.f11367c) {
                this.f11365a.m13913a(null).m7837a(dataSpec, 6, -1, 0, 0, adLoadException, true);
                if (!(this.f11365a.f14426e == null || this.f11365a.f14427f == null)) {
                    this.f11365a.f14426e.post(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C3674b f6302b;

                        public void run() {
                            if (!this.f6302b.f11367c) {
                                if (adLoadException.f6294a == 3) {
                                    this.f6302b.f11365a.f14427f.onInternalAdLoadError(adLoadException.m7861a());
                                } else {
                                    this.f6302b.f11365a.f14427f.onAdLoadError(adLoadException);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3495a(final ExoPlayer exoPlayer, boolean z) {
        super.mo3495a(exoPlayer, z);
        C2289a.m8311a(z);
        z = new C3674b(this);
        this.f14431j = z;
        m16958a((Object) new C2166a(0), this.f14422a);
        this.f14428g.post(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ AdsMediaSource f6292c;

            public void run() {
                this.f6292c.f14424c.attachPlayer(exoPlayer, z, this.f6292c.f14425d);
            }
        });
    }

    public MediaPeriod createPeriod(C2166a c2166a, Allocator allocator) {
        if (this.f14434m.f6285b <= 0 || !c2166a.m7821a()) {
            MediaPeriod deferredMediaPeriod = new DeferredMediaPeriod(this.f14422a, c2166a, allocator);
            deferredMediaPeriod.m16930a();
            return deferredMediaPeriod;
        }
        MediaSource createMediaSource;
        int i = c2166a.f6224b;
        int i2 = c2166a.f6225c;
        Uri uri = this.f14434m.f6287d[i].f6281b[i2];
        if (this.f14435n[i].length <= i2) {
            createMediaSource = this.f14423b.createMediaSource(uri);
            int length = this.f14435n[i].length;
            if (i2 >= length) {
                int i3 = i2 + 1;
                this.f14435n[i] = (MediaSource[]) Arrays.copyOf(this.f14435n[i], i3);
                this.f14436o[i] = Arrays.copyOf(this.f14436o[i], i3);
                Arrays.fill(this.f14436o[i], length, i3, -9223372036854775807L);
            }
            this.f14435n[i][i2] = createMediaSource;
            this.f14429h.put(createMediaSource, new ArrayList());
            m16958a((Object) c2166a, createMediaSource);
        }
        createMediaSource = this.f14435n[i][i2];
        MediaPeriod deferredMediaPeriod2 = new DeferredMediaPeriod(createMediaSource, new C2166a(0, c2166a.f6226d), allocator);
        deferredMediaPeriod2.m16931a(new C3673a(this, uri, i, i2));
        List list = (List) this.f14429h.get(createMediaSource);
        if (list == null) {
            deferredMediaPeriod2.m16930a();
        } else {
            list.add(deferredMediaPeriod2);
        }
        return deferredMediaPeriod2;
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        DeferredMediaPeriod deferredMediaPeriod = (DeferredMediaPeriod) mediaPeriod;
        List list = (List) this.f14429h.get(deferredMediaPeriod.f13643a);
        if (list != null) {
            list.remove(deferredMediaPeriod);
        }
        deferredMediaPeriod.m16933b();
    }

    /* renamed from: a */
    public void mo3493a() {
        super.mo3493a();
        this.f14431j.m13911a();
        this.f14431j = null;
        this.f14429h.clear();
        this.f14432k = null;
        this.f14433l = null;
        this.f14434m = null;
        this.f14435n = new MediaSource[0][];
        this.f14436o = new long[0][];
        this.f14428g.post(new C21852(this));
    }

    /* renamed from: a */
    protected void m18012a(C2166a c2166a, MediaSource mediaSource, C2165q c2165q, @Nullable Object obj) {
        if (c2166a.m7821a()) {
            m17998a(mediaSource, c2166a.f6224b, c2166a.f6225c, c2165q);
        } else {
            m18004b(c2165q, obj);
        }
    }

    @Nullable
    /* renamed from: a */
    protected C2166a m18008a(C2166a c2166a, C2166a c2166a2) {
        return c2166a.m7821a() ? c2166a : c2166a2;
    }

    /* renamed from: a */
    private void m17999a(AdPlaybackState adPlaybackState) {
        if (this.f14434m == null) {
            this.f14435n = new MediaSource[adPlaybackState.f6285b][];
            Arrays.fill(this.f14435n, new MediaSource[0]);
            this.f14436o = new long[adPlaybackState.f6285b][];
            Arrays.fill(this.f14436o, new long[0]);
        }
        this.f14434m = adPlaybackState;
        m18003b();
    }

    /* renamed from: b */
    private void m18004b(C2165q c2165q, Object obj) {
        this.f14432k = c2165q;
        this.f14433l = obj;
        m18003b();
    }

    /* renamed from: a */
    private void m17998a(MediaSource mediaSource, int i, int i2, C2165q c2165q) {
        int i3 = 0;
        boolean z = true;
        if (c2165q.mo2319c() != 1) {
            z = false;
        }
        C2289a.m8311a(z);
        this.f14436o[i][i2] = c2165q.m7797a(0, this.f14430i).m7772a();
        if (this.f14429h.containsKey(mediaSource) != 0) {
            List list = (List) this.f14429h.get(mediaSource);
            while (i3 < list.size()) {
                ((DeferredMediaPeriod) list.get(i3)).m16930a();
                i3++;
            }
            this.f14429h.remove(mediaSource);
        }
        m18003b();
    }

    /* renamed from: b */
    private void m18003b() {
        if (this.f14434m != null && this.f14432k != null) {
            this.f14434m = this.f14434m.m7858a(this.f14436o);
            m13916a(this.f14434m.f6285b == 0 ? this.f14432k : new C4246a(this.f14432k, this.f14434m), this.f14433l);
        }
    }
}
