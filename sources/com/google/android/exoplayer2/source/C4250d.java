package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.source.MediaSource.SourceInfoRefreshListener;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2177a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2178b;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2179c;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.google.android.exoplayer2.source.d */
public abstract class C4250d<T> extends C3675b {
    /* renamed from: a */
    private final HashMap<T, C2193b> f13680a = new HashMap();
    /* renamed from: b */
    private ExoPlayer f13681b;
    /* renamed from: c */
    private Handler f13682c;

    /* renamed from: com.google.android.exoplayer2.source.d$b */
    private static final class C2193b {
        /* renamed from: a */
        public final MediaSource f6305a;
        /* renamed from: b */
        public final SourceInfoRefreshListener f6306b;
        /* renamed from: c */
        public final MediaSourceEventListener f6307c;

        public C2193b(MediaSource mediaSource, SourceInfoRefreshListener sourceInfoRefreshListener, MediaSourceEventListener mediaSourceEventListener) {
            this.f6305a = mediaSource;
            this.f6306b = sourceInfoRefreshListener;
            this.f6307c = mediaSourceEventListener;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.d$a */
    private final class C3682a implements MediaSourceEventListener {
        /* renamed from: a */
        final /* synthetic */ C4250d f11425a;
        @Nullable
        /* renamed from: b */
        private final T f11426b;
        /* renamed from: c */
        private C2177a f11427c;

        public C3682a(C4250d c4250d, @Nullable T t) {
            this.f11425a = c4250d;
            this.f11427c = c4250d.m13913a(null);
            this.f11426b = t;
        }

        public void onMediaPeriodCreated(int i, C2166a c2166a) {
            if (m13947a(i, c2166a) != 0) {
                this.f11427c.m7825a();
            }
        }

        public void onMediaPeriodReleased(int i, C2166a c2166a) {
            if (m13947a(i, c2166a) != 0) {
                this.f11427c.m7838b();
            }
        }

        public void onLoadStarted(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c) {
            if (m13947a(i, c2166a) != 0) {
                this.f11427c.m7829a(c2178b, m13946a(c2179c));
            }
        }

        public void onLoadCompleted(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c) {
            if (m13947a(i, c2166a) != 0) {
                this.f11427c.m7839b(c2178b, m13946a(c2179c));
            }
        }

        public void onLoadCanceled(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c) {
            if (m13947a(i, c2166a) != 0) {
                this.f11427c.m7844c(c2178b, m13946a(c2179c));
            }
        }

        public void onLoadError(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c, IOException iOException, boolean z) {
            if (m13947a(i, c2166a) != 0) {
                this.f11427c.m7830a(c2178b, m13946a(c2179c), iOException, z);
            }
        }

        public void onReadingStarted(int i, C2166a c2166a) {
            if (m13947a(i, c2166a) != 0) {
                this.f11427c.m7843c();
            }
        }

        public void onUpstreamDiscarded(int i, @Nullable C2166a c2166a, C2179c c2179c) {
            if (m13947a(i, c2166a) != 0) {
                this.f11427c.m7831a(m13946a(c2179c));
            }
        }

        public void onDownstreamFormatChanged(int i, @Nullable C2166a c2166a, C2179c c2179c) {
            if (m13947a(i, c2166a) != 0) {
                this.f11427c.m7840b(m13946a(c2179c));
            }
        }

        /* renamed from: a */
        private boolean m13947a(int i, @Nullable C2166a c2166a) {
            Object a;
            if (c2166a != null) {
                a = this.f11425a.mo3729a(this.f11426b, c2166a);
                if (a == null) {
                    return false;
                }
            }
            a = null;
            i = this.f11425a.m16953a(this.f11426b, i);
            if (!(this.f11427c.f6259a == i && C2314v.m8480a(this.f11427c.f6260b, a))) {
                this.f11427c = this.f11425a.m13912a(i, a, 0);
            }
            return true;
        }

        /* renamed from: a */
        private C2179c m13946a(C2179c c2179c) {
            long a = this.f11425a.mo3727a(this.f11426b, c2179c.f6272f);
            long a2 = this.f11425a.mo3727a(this.f11426b, c2179c.f6273g);
            if (a == c2179c.f6272f && a2 == c2179c.f6273g) {
                return c2179c;
            }
            return new C2179c(c2179c.f6267a, c2179c.f6268b, c2179c.f6269c, c2179c.f6270d, c2179c.f6271e, a, a2);
        }
    }

    /* renamed from: a */
    protected int m16953a(@Nullable T t, int i) {
        return i;
    }

    /* renamed from: a */
    protected long mo3727a(@Nullable T t, long j) {
        return j;
    }

    @Nullable
    /* renamed from: a */
    protected C2166a mo3729a(@Nullable T t, C2166a c2166a) {
        return c2166a;
    }

    /* renamed from: a */
    protected abstract void mo3728a(@Nullable T t, MediaSource mediaSource, C2165q c2165q, @Nullable Object obj);

    protected C4250d() {
    }

    @CallSuper
    /* renamed from: a */
    public void mo3495a(ExoPlayer exoPlayer, boolean z) {
        this.f13681b = exoPlayer;
        this.f13682c = new Handler();
    }

    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        for (C2193b c2193b : this.f13680a.values()) {
            c2193b.f6305a.maybeThrowSourceInfoRefreshError();
        }
    }

    @CallSuper
    /* renamed from: a */
    public void mo3493a() {
        for (C2193b c2193b : this.f13680a.values()) {
            c2193b.f6305a.releaseSource(c2193b.f6306b);
            c2193b.f6305a.removeEventListener(c2193b.f6307c);
        }
        this.f13680a.clear();
        this.f13681b = null;
    }

    /* renamed from: a */
    protected final void m16958a(@Nullable final T t, MediaSource mediaSource) {
        C2289a.m8311a(this.f13680a.containsKey(t) ^ 1);
        SourceInfoRefreshListener c36811 = new SourceInfoRefreshListener(this) {
            /* renamed from: b */
            final /* synthetic */ C4250d f11424b;

            public void onSourceInfoRefreshed(MediaSource mediaSource, C2165q c2165q, @Nullable Object obj) {
                this.f11424b.mo3728a(t, mediaSource, c2165q, obj);
            }
        };
        MediaSourceEventListener c3682a = new C3682a(this, t);
        this.f13680a.put(t, new C2193b(mediaSource, c36811, c3682a));
        mediaSource.addEventListener(this.f13682c, c3682a);
        mediaSource.prepareSource(this.f13681b, false, c36811);
    }
}
