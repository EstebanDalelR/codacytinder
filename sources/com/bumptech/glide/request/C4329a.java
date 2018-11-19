package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bumptech.glide.p026d.C0987h;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SizeReadyCallback;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.request.a */
public class C4329a<T, R> implements FutureTarget<R>, Runnable {
    /* renamed from: a */
    private static final C1068a f14190a = new C1068a();
    /* renamed from: b */
    private final Handler f14191b;
    /* renamed from: c */
    private final int f14192c;
    /* renamed from: d */
    private final int f14193d;
    /* renamed from: e */
    private final boolean f14194e;
    /* renamed from: f */
    private final C1068a f14195f;
    /* renamed from: g */
    private R f14196g;
    /* renamed from: h */
    private Request f14197h;
    /* renamed from: i */
    private boolean f14198i;
    /* renamed from: j */
    private Exception f14199j;
    /* renamed from: k */
    private boolean f14200k;
    /* renamed from: l */
    private boolean f14201l;

    /* renamed from: com.bumptech.glide.request.a$a */
    static class C1068a {
        C1068a() {
        }

        /* renamed from: a */
        public void m3676a(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }

        /* renamed from: a */
        public void m3675a(Object obj) {
            obj.notifyAll();
        }
    }

    public void onDestroy() {
    }

    public void onLoadCleared(Drawable drawable) {
    }

    public void onLoadStarted(Drawable drawable) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public C4329a(Handler handler, int i, int i2) {
        this(handler, i, i2, true, f14190a);
    }

    C4329a(Handler handler, int i, int i2, boolean z, C1068a c1068a) {
        this.f14191b = handler;
        this.f14192c = i;
        this.f14193d = i2;
        this.f14194e = z;
        this.f14195f = c1068a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean cancel(boolean r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f14198i;	 Catch:{ all -> 0x001d }
        r1 = 1;
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r2);
        return r1;
    L_0x0008:
        r0 = r2.isDone();	 Catch:{ all -> 0x001d }
        r0 = r0 ^ r1;
        if (r0 == 0) goto L_0x001b;
    L_0x000f:
        r2.f14198i = r1;	 Catch:{ all -> 0x001d }
        if (r3 == 0) goto L_0x0016;
    L_0x0013:
        r2.clear();	 Catch:{ all -> 0x001d }
    L_0x0016:
        r3 = r2.f14195f;	 Catch:{ all -> 0x001d }
        r3.m3675a(r2);	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r2);
        return r0;
    L_0x001d:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.a.cancel(boolean):boolean");
    }

    public synchronized boolean isCancelled() {
        return this.f14198i;
    }

    public synchronized boolean isDone() {
        boolean z;
        if (!this.f14198i) {
            if (!this.f14200k) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public R get() throws InterruptedException, ExecutionException {
        try {
            return m17516a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m17516a(Long.valueOf(timeUnit.toMillis(j)));
    }

    public void getSize(SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.f14192c, this.f14193d);
    }

    public void setRequest(Request request) {
        this.f14197h = request;
    }

    public Request getRequest() {
        return this.f14197h;
    }

    public synchronized void onLoadFailed(Exception exception, Drawable drawable) {
        this.f14201l = true;
        this.f14199j = exception;
        this.f14195f.m3675a(this);
    }

    public synchronized void onResourceReady(R r, GlideAnimation<? super R> glideAnimation) {
        this.f14200k = true;
        this.f14196g = r;
        this.f14195f.m3675a(this);
    }

    /* renamed from: a */
    private synchronized R m17516a(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f14194e) {
            C0987h.m3413b();
        }
        if (this.f14198i) {
            throw new CancellationException();
        } else if (this.f14201l) {
            throw new ExecutionException(this.f14199j);
        } else if (this.f14200k) {
            return this.f14196g;
        } else {
            if (l == null) {
                this.f14195f.m3676a(this, 0);
            } else if (l.longValue() > 0) {
                this.f14195f.m3676a(this, l.longValue());
            }
            if (Thread.interrupted() != null) {
                throw new InterruptedException();
            } else if (this.f14201l != null) {
                throw new ExecutionException(this.f14199j);
            } else if (this.f14198i != null) {
                throw new CancellationException();
            } else if (this.f14200k == null) {
                throw new TimeoutException();
            } else {
                return this.f14196g;
            }
        }
    }

    public void run() {
        if (this.f14197h != null) {
            this.f14197h.clear();
            cancel(false);
        }
    }

    public void clear() {
        this.f14191b.post(this);
    }
}
