package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.EngineRunnable.C3027a;
import com.bumptech.glide.p026d.C0987h;
import com.bumptech.glide.request.ResourceCallback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.bumptech.glide.load.engine.c */
class C4087c implements C3027a {
    /* renamed from: a */
    private static final C1015a f12960a = new C1015a();
    /* renamed from: b */
    private static final Handler f12961b = new Handler(Looper.getMainLooper(), new C1016b());
    /* renamed from: c */
    private final List<ResourceCallback> f12962c;
    /* renamed from: d */
    private final C1015a f12963d;
    /* renamed from: e */
    private final C1024d f12964e;
    /* renamed from: f */
    private final Key f12965f;
    /* renamed from: g */
    private final ExecutorService f12966g;
    /* renamed from: h */
    private final ExecutorService f12967h;
    /* renamed from: i */
    private final boolean f12968i;
    /* renamed from: j */
    private boolean f12969j;
    /* renamed from: k */
    private Resource<?> f12970k;
    /* renamed from: l */
    private boolean f12971l;
    /* renamed from: m */
    private Exception f12972m;
    /* renamed from: n */
    private boolean f12973n;
    /* renamed from: o */
    private Set<ResourceCallback> f12974o;
    /* renamed from: p */
    private EngineRunnable f12975p;
    /* renamed from: q */
    private C3048g<?> f12976q;
    /* renamed from: r */
    private volatile Future<?> f12977r;

    /* renamed from: com.bumptech.glide.load.engine.c$a */
    static class C1015a {
        C1015a() {
        }

        /* renamed from: a */
        public <R> C3048g<R> m3549a(Resource<R> resource, boolean z) {
            return new C3048g(resource, z);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.c$b */
    private static class C1016b implements Callback {
        private C1016b() {
        }

        public boolean handleMessage(Message message) {
            if (1 != message.what) {
                if (2 != message.what) {
                    return null;
                }
            }
            C4087c c4087c = (C4087c) message.obj;
            if (1 == message.what) {
                c4087c.m15947b();
            } else {
                c4087c.m15949c();
            }
            return true;
        }
    }

    public C4087c(Key key, ExecutorService executorService, ExecutorService executorService2, boolean z, C1024d c1024d) {
        this(key, executorService, executorService2, z, c1024d, f12960a);
    }

    public C4087c(Key key, ExecutorService executorService, ExecutorService executorService2, boolean z, C1024d c1024d, C1015a c1015a) {
        this.f12962c = new ArrayList();
        this.f12965f = key;
        this.f12966g = executorService;
        this.f12967h = executorService2;
        this.f12968i = z;
        this.f12964e = c1024d;
        this.f12963d = c1015a;
    }

    /* renamed from: a */
    public void m15953a(EngineRunnable engineRunnable) {
        this.f12975p = engineRunnable;
        this.f12977r = this.f12966g.submit(engineRunnable);
    }

    /* renamed from: b */
    public void mo3184b(EngineRunnable engineRunnable) {
        this.f12977r = this.f12967h.submit(engineRunnable);
    }

    /* renamed from: a */
    public void m15954a(ResourceCallback resourceCallback) {
        C0987h.m3411a();
        if (this.f12971l) {
            resourceCallback.onResourceReady(this.f12976q);
        } else if (this.f12973n) {
            resourceCallback.onException(this.f12972m);
        } else {
            this.f12962c.add(resourceCallback);
        }
    }

    /* renamed from: b */
    public void m15956b(ResourceCallback resourceCallback) {
        C0987h.m3411a();
        if (!this.f12971l) {
            if (!this.f12973n) {
                this.f12962c.remove(resourceCallback);
                if (this.f12962c.isEmpty() != null) {
                    m15952a();
                    return;
                }
                return;
            }
        }
        m15950c(resourceCallback);
    }

    /* renamed from: c */
    private void m15950c(ResourceCallback resourceCallback) {
        if (this.f12974o == null) {
            this.f12974o = new HashSet();
        }
        this.f12974o.add(resourceCallback);
    }

    /* renamed from: d */
    private boolean m15951d(ResourceCallback resourceCallback) {
        return (this.f12974o == null || this.f12974o.contains(resourceCallback) == null) ? null : true;
    }

    /* renamed from: a */
    void m15952a() {
        if (!(this.f12973n || this.f12971l)) {
            if (!this.f12969j) {
                this.f12975p.m11938a();
                Future future = this.f12977r;
                if (future != null) {
                    future.cancel(true);
                }
                this.f12969j = true;
                this.f12964e.mo1277a(this, this.f12965f);
            }
        }
    }

    public void onResourceReady(Resource<?> resource) {
        this.f12970k = resource;
        f12961b.obtainMessage(1, this).sendToTarget();
    }

    /* renamed from: b */
    private void m15947b() {
        if (this.f12969j) {
            this.f12970k.recycle();
        } else if (this.f12962c.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        } else {
            this.f12976q = this.f12963d.m3549a(this.f12970k, this.f12968i);
            this.f12971l = true;
            this.f12976q.m12002b();
            this.f12964e.mo1276a(this.f12965f, this.f12976q);
            for (ResourceCallback resourceCallback : this.f12962c) {
                if (!m15951d(resourceCallback)) {
                    this.f12976q.m12002b();
                    resourceCallback.onResourceReady(this.f12976q);
                }
            }
            this.f12976q.m12003c();
        }
    }

    public void onException(Exception exception) {
        this.f12972m = exception;
        f12961b.obtainMessage(2, this).sendToTarget();
    }

    /* renamed from: c */
    private void m15949c() {
        if (!this.f12969j) {
            if (this.f12962c.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            this.f12973n = true;
            this.f12964e.mo1276a(this.f12965f, null);
            for (ResourceCallback resourceCallback : this.f12962c) {
                if (!m15951d(resourceCallback)) {
                    resourceCallback.onException(this.f12972m);
                }
            }
        }
    }
}
