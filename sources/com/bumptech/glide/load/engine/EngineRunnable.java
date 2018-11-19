package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.executor.Prioritized;
import com.bumptech.glide.request.ResourceCallback;

class EngineRunnable implements Prioritized, Runnable {
    /* renamed from: a */
    private final Priority f9433a;
    /* renamed from: b */
    private final C3027a f9434b;
    /* renamed from: c */
    private final C1001a<?, ?, ?> f9435c;
    /* renamed from: d */
    private Stage f9436d = Stage.CACHE;
    /* renamed from: e */
    private volatile boolean f9437e;

    private enum Stage {
        CACHE,
        SOURCE
    }

    /* renamed from: com.bumptech.glide.load.engine.EngineRunnable$a */
    interface C3027a extends ResourceCallback {
        /* renamed from: b */
        void mo3184b(EngineRunnable engineRunnable);
    }

    public EngineRunnable(C3027a c3027a, C1001a<?, ?, ?> c1001a, Priority priority) {
        this.f9434b = c3027a;
        this.f9435c = c1001a;
        this.f9433a = priority;
    }

    /* renamed from: a */
    public void m11938a() {
        this.f9437e = true;
        this.f9435c.m3522d();
    }

    public void run() {
        if (!this.f9437e) {
            Exception exception;
            Resource resource = null;
            try {
                exception = null;
                resource = m11935c();
            } catch (Throwable e) {
                if (Log.isLoggable("EngineRunnable", 2)) {
                    Log.v("EngineRunnable", "Out Of Memory Error decoding", e);
                }
                exception = new ErrorWrappingGlideException(e);
            } catch (Throwable e2) {
                if (Log.isLoggable("EngineRunnable", 2)) {
                    Log.v("EngineRunnable", "Exception decoding", e2);
                }
                exception = e2;
            }
            if (this.f9437e) {
                if (resource != null) {
                    resource.recycle();
                }
                return;
            }
            if (resource == null) {
                m11933a(exception);
            } else {
                m11932a(resource);
            }
        }
    }

    /* renamed from: b */
    private boolean m11934b() {
        return this.f9436d == Stage.CACHE;
    }

    /* renamed from: a */
    private void m11932a(Resource resource) {
        this.f9434b.onResourceReady(resource);
    }

    /* renamed from: a */
    private void m11933a(Exception exception) {
        if (m11934b()) {
            this.f9436d = Stage.SOURCE;
            this.f9434b.mo3184b(this);
            return;
        }
        this.f9434b.onException(exception);
    }

    /* renamed from: c */
    private Resource<?> m11935c() throws Exception {
        if (m11934b()) {
            return m11936d();
        }
        return m11937e();
    }

    /* renamed from: d */
    private Resource<?> m11936d() throws Exception {
        Resource<?> a;
        try {
            a = this.f9435c.m3519a();
        } catch (Exception e) {
            if (Log.isLoggable("EngineRunnable", 3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Exception decoding result from cache: ");
                stringBuilder.append(e);
                Log.d("EngineRunnable", stringBuilder.toString());
            }
            a = null;
        }
        return a == null ? this.f9435c.m3520b() : a;
    }

    /* renamed from: e */
    private Resource<?> m11937e() throws Exception {
        return this.f9435c.m3521c();
    }

    public int getPriority() {
        return this.f9433a.ordinal();
    }
}
