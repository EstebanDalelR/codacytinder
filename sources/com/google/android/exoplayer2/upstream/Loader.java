package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

public final class Loader implements LoaderErrorThrower {
    /* renamed from: a */
    private final ExecutorService f11663a;
    /* renamed from: b */
    private C2276a<? extends Loadable> f11664b;
    /* renamed from: c */
    private IOException f11665c;

    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T t, long j, long j2, boolean z);

        void onLoadCompleted(T t, long j, long j2);

        int onLoadError(T t, long j, long j2, IOException iOException);
    }

    public interface Loadable {
        void cancelLoad();

        boolean isLoadCanceled();

        void load() throws IOException, InterruptedException;
    }

    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RetryAction {
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected ");
            stringBuilder.append(th.getClass().getSimpleName());
            stringBuilder.append(": ");
            stringBuilder.append(th.getMessage());
            super(stringBuilder.toString(), th);
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.upstream.Loader$a */
    private final class C2276a<T extends Loadable> extends Handler implements Runnable {
        /* renamed from: a */
        public final int f6833a;
        /* renamed from: b */
        final /* synthetic */ Loader f6834b;
        /* renamed from: c */
        private final T f6835c;
        /* renamed from: d */
        private final Callback<T> f6836d;
        /* renamed from: e */
        private final long f6837e;
        /* renamed from: f */
        private IOException f6838f;
        /* renamed from: g */
        private int f6839g;
        /* renamed from: h */
        private volatile Thread f6840h;
        /* renamed from: i */
        private volatile boolean f6841i;

        public C2276a(Loader loader, Looper looper, T t, Callback<T> callback, int i, long j) {
            this.f6834b = loader;
            super(looper);
            this.f6835c = t;
            this.f6836d = callback;
            this.f6833a = i;
            this.f6837e = j;
        }

        /* renamed from: a */
        public void m8244a(int i) throws IOException {
            if (this.f6838f != null && this.f6839g > i) {
                throw this.f6838f;
            }
        }

        /* renamed from: a */
        public void m8245a(long j) {
            C2289a.m8313b(this.f6834b.f11664b == null);
            this.f6834b.f11664b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m8241a();
            }
        }

        /* renamed from: a */
        public void m8246a(boolean z) {
            this.f6841i = z;
            this.f6838f = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f6835c.cancelLoad();
                if (this.f6840h != null) {
                    this.f6840h.interrupt();
                }
            }
            if (z) {
                m8242b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f6836d.onLoadCanceled(this.f6835c, elapsedRealtime, elapsedRealtime - this.f6837e, true);
            }
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = 2;
            r1 = 3;
            r2 = java.lang.Thread.currentThread();	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r4.f6840h = r2;	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2 = r4.f6835c;	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2 = r2.isLoadCanceled();	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            if (r2 != 0) goto L_0x003c;	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
        L_0x0010:
            r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2.<init>();	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r3 = "load:";	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2.append(r3);	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r3 = r4.f6835c;	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r3 = r3.getClass();	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r3 = r3.getSimpleName();	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2.append(r3);	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2 = r2.toString();	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            com.google.android.exoplayer2.util.C2311t.m8447a(r2);	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2 = r4.f6835c;	 Catch:{ all -> 0x0037 }
            r2.load();	 Catch:{ all -> 0x0037 }
            com.google.android.exoplayer2.util.C2311t.m8446a();	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            goto L_0x003c;	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
        L_0x0037:
            r2 = move-exception;	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            com.google.android.exoplayer2.util.C2311t.m8446a();	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            throw r2;	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
        L_0x003c:
            r2 = r4.f6841i;	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            if (r2 != 0) goto L_0x00a8;	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
        L_0x0040:
            r4.sendEmptyMessage(r0);	 Catch:{ IOException -> 0x009c, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            goto L_0x00a8;
        L_0x0044:
            r0 = move-exception;
            r1 = "LoadTask";
            r2 = "Unexpected error loading stream";
            android.util.Log.e(r1, r2, r0);
            r1 = r4.f6841i;
            if (r1 != 0) goto L_0x0058;
        L_0x0050:
            r1 = 4;
            r1 = r4.obtainMessage(r1, r0);
            r1.sendToTarget();
        L_0x0058:
            throw r0;
        L_0x0059:
            r0 = move-exception;
            r2 = "LoadTask";
            r3 = "OutOfMemory error loading stream";
            android.util.Log.e(r2, r3, r0);
            r2 = r4.f6841i;
            if (r2 != 0) goto L_0x00a8;
        L_0x0065:
            r2 = new com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
            r2.<init>(r0);
            r0 = r4.obtainMessage(r1, r2);
            r0.sendToTarget();
            goto L_0x00a8;
        L_0x0072:
            r0 = move-exception;
            r2 = "LoadTask";
            r3 = "Unexpected exception loading stream";
            android.util.Log.e(r2, r3, r0);
            r2 = r4.f6841i;
            if (r2 != 0) goto L_0x00a8;
        L_0x007e:
            r2 = new com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
            r2.<init>(r0);
            r0 = r4.obtainMessage(r1, r2);
            r0.sendToTarget();
            goto L_0x00a8;
        L_0x008b:
            r1 = r4.f6835c;
            r1 = r1.isLoadCanceled();
            com.google.android.exoplayer2.util.C2289a.m8313b(r1);
            r1 = r4.f6841i;
            if (r1 != 0) goto L_0x00a8;
        L_0x0098:
            r4.sendEmptyMessage(r0);
            goto L_0x00a8;
        L_0x009c:
            r0 = move-exception;
            r2 = r4.f6841i;
            if (r2 != 0) goto L_0x00a8;
        L_0x00a1:
            r0 = r4.obtainMessage(r1, r0);
            r0.sendToTarget();
        L_0x00a8:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.a.run():void");
        }

        public void handleMessage(Message message) {
            if (!this.f6841i) {
                if (message.what == 0) {
                    m8241a();
                } else if (message.what == 4) {
                    throw ((Error) message.obj);
                } else {
                    m8242b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f6837e;
                    if (this.f6835c.isLoadCanceled()) {
                        this.f6836d.onLoadCanceled(this.f6835c, elapsedRealtime, j, false);
                        return;
                    }
                    switch (message.what) {
                        case 1:
                            this.f6836d.onLoadCanceled(this.f6835c, elapsedRealtime, j, false);
                            break;
                        case 2:
                            try {
                                this.f6836d.onLoadCompleted(this.f6835c, elapsedRealtime, j);
                                break;
                            } catch (Message message2) {
                                Log.e("LoadTask", "Unexpected exception handling load completed", message2);
                                this.f6834b.f11665c = new UnexpectedLoaderException(message2);
                                break;
                            }
                        case 3:
                            this.f6838f = (IOException) message2.obj;
                            message2 = this.f6836d.onLoadError(this.f6835c, elapsedRealtime, j, this.f6838f);
                            if (message2 != 3) {
                                if (message2 != 2) {
                                    int i = 1;
                                    if (message2 != 1) {
                                        i = 1 + this.f6839g;
                                    }
                                    this.f6839g = i;
                                    m8245a(m8243c());
                                    break;
                                }
                            }
                            this.f6834b.f11665c = this.f6838f;
                            break;
                            break;
                        default:
                            break;
                    }
                }
            }
        }

        /* renamed from: a */
        private void m8241a() {
            this.f6838f = null;
            this.f6834b.f11663a.execute(this.f6834b.f11664b);
        }

        /* renamed from: b */
        private void m8242b() {
            this.f6834b.f11664b = null;
        }

        /* renamed from: c */
        private long m8243c() {
            return (long) Math.min((this.f6839g - 1) * AdError.NETWORK_ERROR_CODE, 5000);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$b */
    private static final class C2277b implements Runnable {
        /* renamed from: a */
        private final ReleaseCallback f6842a;

        public C2277b(ReleaseCallback releaseCallback) {
            this.f6842a = releaseCallback;
        }

        public void run() {
            this.f6842a.onLoaderReleased();
        }
    }

    public Loader(String str) {
        this.f11663a = C2314v.m8470a(str);
    }

    /* renamed from: a */
    public <T extends Loadable> long m14085a(T t, Callback<T> callback, int i) {
        Looper myLooper = Looper.myLooper();
        C2289a.m8313b(myLooper != null);
        this.f11665c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C2276a(this, myLooper, t, callback, i, elapsedRealtime).m8245a((long) null);
        return elapsedRealtime;
    }

    /* renamed from: a */
    public boolean m14087a() {
        return this.f11664b != null;
    }

    /* renamed from: b */
    public void m14088b() {
        this.f11664b.m8246a(false);
    }

    /* renamed from: c */
    public void m14089c() {
        m14086a(null);
    }

    /* renamed from: a */
    public void m14086a(@Nullable ReleaseCallback releaseCallback) {
        if (this.f11664b != null) {
            this.f11664b.m8246a(true);
        }
        if (releaseCallback != null) {
            this.f11663a.execute(new C2277b(releaseCallback));
        }
        this.f11663a.shutdown();
    }

    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void maybeThrowError(int i) throws IOException {
        if (this.f11665c != null) {
            throw this.f11665c;
        } else if (this.f11664b != null) {
            C2276a c2276a = this.f11664b;
            if (i == Integer.MIN_VALUE) {
                i = this.f11664b.f6833a;
            }
            c2276a.m8244a(i);
        }
    }
}
