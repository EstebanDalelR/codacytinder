package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.CheckResult;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface MediaSourceEventListener {

    /* renamed from: com.google.android.exoplayer2.source.MediaSourceEventListener$a */
    public static final class C2177a {
        /* renamed from: a */
        public final int f6259a;
        @Nullable
        /* renamed from: b */
        public final C2166a f6260b;
        /* renamed from: c */
        private final CopyOnWriteArrayList<C2176a> f6261c;
        /* renamed from: d */
        private final long f6262d;

        /* renamed from: com.google.android.exoplayer2.source.MediaSourceEventListener$a$a */
        private static final class C2176a {
            /* renamed from: a */
            public final Handler f6257a;
            /* renamed from: b */
            public final MediaSourceEventListener f6258b;

            public C2176a(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.f6257a = handler;
                this.f6258b = mediaSourceEventListener;
            }
        }

        public C2177a() {
            this(new CopyOnWriteArrayList(), 0, null, 0);
        }

        private C2177a(CopyOnWriteArrayList<C2176a> copyOnWriteArrayList, int i, @Nullable C2166a c2166a, long j) {
            this.f6261c = copyOnWriteArrayList;
            this.f6259a = i;
            this.f6260b = c2166a;
            this.f6262d = j;
        }

        @CheckResult
        /* renamed from: a */
        public C2177a m7824a(int i, @Nullable C2166a c2166a, long j) {
            return new C2177a(this.f6261c, i, c2166a, j);
        }

        /* renamed from: a */
        public void m7828a(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            boolean z = (handler == null || mediaSourceEventListener == null) ? false : true;
            C2289a.m8311a(z);
            this.f6261c.add(new C2176a(handler, mediaSourceEventListener));
        }

        /* renamed from: a */
        public void m7832a(MediaSourceEventListener mediaSourceEventListener) {
            Iterator it = this.f6261c.iterator();
            while (it.hasNext()) {
                C2176a c2176a = (C2176a) it.next();
                if (c2176a.f6258b == mediaSourceEventListener) {
                    this.f6261c.remove(c2176a);
                }
            }
        }

        /* renamed from: a */
        public void m7825a() {
            C2289a.m8313b(this.f6260b != null);
            Iterator it = this.f6261c.iterator();
            while (it.hasNext()) {
                C2176a c2176a = (C2176a) it.next();
                final MediaSourceEventListener mediaSourceEventListener = c2176a.f6258b;
                m7823a(c2176a.f6257a, new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2177a f6228b;

                    public void run() {
                        mediaSourceEventListener.onMediaPeriodCreated(this.f6228b.f6259a, this.f6228b.f6260b);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m7838b() {
            C2289a.m8313b(this.f6260b != null);
            Iterator it = this.f6261c.iterator();
            while (it.hasNext()) {
                C2176a c2176a = (C2176a) it.next();
                final MediaSourceEventListener mediaSourceEventListener = c2176a.f6258b;
                m7823a(c2176a.f6257a, new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2177a f6230b;

                    public void run() {
                        mediaSourceEventListener.onMediaPeriodReleased(this.f6230b.f6259a, this.f6230b.f6260b);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7833a(DataSpec dataSpec, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3) {
            m7829a(new C2178b(dataSpec, j3, 0, 0), new C2179c(i, i2, format, i3, obj, m7822a(j), m7822a(j2)));
        }

        /* renamed from: a */
        public void m7829a(final C2178b c2178b, final C2179c c2179c) {
            Iterator it = this.f6261c.iterator();
            while (it.hasNext()) {
                C2176a c2176a = (C2176a) it.next();
                final MediaSourceEventListener mediaSourceEventListener = c2176a.f6258b;
                m7823a(c2176a.f6257a, new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C2177a f6234d;

                    public void run() {
                        mediaSourceEventListener.onLoadStarted(this.f6234d.f6259a, this.f6234d.f6260b, c2178b, c2179c);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7836a(DataSpec dataSpec, int i, long j, long j2, long j3) {
            m7834a(dataSpec, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: a */
        public void m7834a(DataSpec dataSpec, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
            m7839b(new C2178b(dataSpec, j3, j4, j5), new C2179c(i, i2, format, i3, obj, m7822a(j), m7822a(j2)));
        }

        /* renamed from: b */
        public void m7839b(final C2178b c2178b, final C2179c c2179c) {
            Iterator it = this.f6261c.iterator();
            while (it.hasNext()) {
                C2176a c2176a = (C2176a) it.next();
                final MediaSourceEventListener mediaSourceEventListener = c2176a.f6258b;
                m7823a(c2176a.f6257a, new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C2177a f6238d;

                    public void run() {
                        mediaSourceEventListener.onLoadCompleted(this.f6238d.f6259a, this.f6238d.f6260b, c2178b, c2179c);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m7842b(DataSpec dataSpec, int i, long j, long j2, long j3) {
            m7841b(dataSpec, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: b */
        public void m7841b(DataSpec dataSpec, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
            m7844c(new C2178b(dataSpec, j3, j4, j5), new C2179c(i, i2, format, i3, obj, m7822a(j), m7822a(j2)));
        }

        /* renamed from: c */
        public void m7844c(final C2178b c2178b, final C2179c c2179c) {
            Iterator it = this.f6261c.iterator();
            while (it.hasNext()) {
                C2176a c2176a = (C2176a) it.next();
                final MediaSourceEventListener mediaSourceEventListener = c2176a.f6258b;
                m7823a(c2176a.f6257a, new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C2177a f6242d;

                    public void run() {
                        mediaSourceEventListener.onLoadCanceled(this.f6242d.f6259a, this.f6242d.f6260b, c2178b, c2179c);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7837a(DataSpec dataSpec, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            m7835a(dataSpec, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }

        /* renamed from: a */
        public void m7835a(DataSpec dataSpec, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            m7830a(new C2178b(dataSpec, j3, j4, j5), new C2179c(i, i2, format, i3, obj, m7822a(j), m7822a(j2)), iOException, z);
        }

        /* renamed from: a */
        public void m7830a(C2178b c2178b, C2179c c2179c, IOException iOException, boolean z) {
            Iterator it = this.f6261c.iterator();
            while (it.hasNext()) {
                C2176a c2176a = (C2176a) it.next();
                final MediaSourceEventListener mediaSourceEventListener = c2176a.f6258b;
                final C2178b c2178b2 = c2178b;
                final C2179c c2179c2 = c2179c;
                final IOException iOException2 = iOException;
                final boolean z2 = z;
                m7823a(c2176a.f6257a, new Runnable(this) {
                    /* renamed from: f */
                    final /* synthetic */ C2177a f6248f;

                    public void run() {
                        mediaSourceEventListener.onLoadError(this.f6248f.f6259a, this.f6248f.f6260b, c2178b2, c2179c2, iOException2, z2);
                    }
                });
            }
        }

        /* renamed from: c */
        public void m7843c() {
            C2289a.m8313b(this.f6260b != null);
            Iterator it = this.f6261c.iterator();
            while (it.hasNext()) {
                C2176a c2176a = (C2176a) it.next();
                final MediaSourceEventListener mediaSourceEventListener = c2176a.f6258b;
                m7823a(c2176a.f6257a, new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2177a f6250b;

                    public void run() {
                        mediaSourceEventListener.onReadingStarted(this.f6250b.f6259a, this.f6250b.f6260b);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7826a(int i, long j, long j2) {
            m7831a(new C2179c(1, i, null, 3, null, m7822a(j), m7822a(j2)));
        }

        /* renamed from: a */
        public void m7831a(final C2179c c2179c) {
            Iterator it = this.f6261c.iterator();
            while (it.hasNext()) {
                C2176a c2176a = (C2176a) it.next();
                final MediaSourceEventListener mediaSourceEventListener = c2176a.f6258b;
                m7823a(c2176a.f6257a, new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ C2177a f6253c;

                    public void run() {
                        mediaSourceEventListener.onUpstreamDiscarded(this.f6253c.f6259a, this.f6253c.f6260b, c2179c);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7827a(int i, @Nullable Format format, int i2, @Nullable Object obj, long j) {
            m7840b(new C2179c(1, i, format, i2, obj, m7822a(j), -9223372036854775807L));
        }

        /* renamed from: b */
        public void m7840b(final C2179c c2179c) {
            Iterator it = this.f6261c.iterator();
            while (it.hasNext()) {
                C2176a c2176a = (C2176a) it.next();
                final MediaSourceEventListener mediaSourceEventListener = c2176a.f6258b;
                m7823a(c2176a.f6257a, new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ C2177a f6256c;

                    public void run() {
                        mediaSourceEventListener.onDownstreamFormatChanged(this.f6256c.f6259a, this.f6256c.f6260b, c2179c);
                    }
                });
            }
        }

        /* renamed from: a */
        private long m7822a(long j) {
            j = C2005C.m7215a(j);
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f6262d + j;
        }

        /* renamed from: a */
        private void m7823a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.MediaSourceEventListener$b */
    public static final class C2178b {
        /* renamed from: a */
        public final DataSpec f6263a;
        /* renamed from: b */
        public final long f6264b;
        /* renamed from: c */
        public final long f6265c;
        /* renamed from: d */
        public final long f6266d;

        public C2178b(DataSpec dataSpec, long j, long j2, long j3) {
            this.f6263a = dataSpec;
            this.f6264b = j;
            this.f6265c = j2;
            this.f6266d = j3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.MediaSourceEventListener$c */
    public static final class C2179c {
        /* renamed from: a */
        public final int f6267a;
        /* renamed from: b */
        public final int f6268b;
        @Nullable
        /* renamed from: c */
        public final Format f6269c;
        /* renamed from: d */
        public final int f6270d;
        @Nullable
        /* renamed from: e */
        public final Object f6271e;
        /* renamed from: f */
        public final long f6272f;
        /* renamed from: g */
        public final long f6273g;

        public C2179c(int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2) {
            this.f6267a = i;
            this.f6268b = i2;
            this.f6269c = format;
            this.f6270d = i3;
            this.f6271e = obj;
            this.f6272f = j;
            this.f6273g = j2;
        }
    }

    void onDownstreamFormatChanged(int i, @Nullable C2166a c2166a, C2179c c2179c);

    void onLoadCanceled(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c);

    void onLoadCompleted(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c);

    void onLoadError(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c, IOException iOException, boolean z);

    void onLoadStarted(int i, @Nullable C2166a c2166a, C2178b c2178b, C2179c c2179c);

    void onMediaPeriodCreated(int i, C2166a c2166a);

    void onMediaPeriodReleased(int i, C2166a c2166a);

    void onReadingStarted(int i, C2166a c2166a);

    void onUpstreamDiscarded(int i, C2166a c2166a, C2179c c2179c);
}
