package com.bumptech.glide.request;

/* renamed from: com.bumptech.glide.request.b */
public class C3124b implements Request, RequestCoordinator {
    /* renamed from: a */
    private Request f9676a;
    /* renamed from: b */
    private Request f9677b;
    /* renamed from: c */
    private RequestCoordinator f9678c;

    public C3124b() {
        this(null);
    }

    public C3124b(RequestCoordinator requestCoordinator) {
        this.f9678c = requestCoordinator;
    }

    /* renamed from: a */
    public void m12102a(Request request, Request request2) {
        this.f9676a = request;
        this.f9677b = request2;
    }

    public boolean canSetImage(Request request) {
        return (!m12099a() || (request.equals(this.f9676a) == null && this.f9676a.isResourceSet() != null)) ? null : true;
    }

    /* renamed from: a */
    private boolean m12099a() {
        if (this.f9678c != null) {
            if (!this.f9678c.canSetImage(this)) {
                return false;
            }
        }
        return true;
    }

    public boolean canNotifyStatusChanged(Request request) {
        return (m12100b() && request.equals(this.f9676a) != null && isAnyResourceSet() == null) ? true : null;
    }

    /* renamed from: b */
    private boolean m12100b() {
        if (this.f9678c != null) {
            if (!this.f9678c.canNotifyStatusChanged(this)) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnyResourceSet() {
        if (!m12101c()) {
            if (!isResourceSet()) {
                return false;
            }
        }
        return true;
    }

    public void onRequestSuccess(Request request) {
        if (request.equals(this.f9677b) == null) {
            if (this.f9678c != null) {
                this.f9678c.onRequestSuccess(this);
            }
            if (this.f9677b.isComplete() == null) {
                this.f9677b.clear();
            }
        }
    }

    /* renamed from: c */
    private boolean m12101c() {
        return this.f9678c != null && this.f9678c.isAnyResourceSet();
    }

    public void begin() {
        if (!this.f9677b.isRunning()) {
            this.f9677b.begin();
        }
        if (!this.f9676a.isRunning()) {
            this.f9676a.begin();
        }
    }

    public void pause() {
        this.f9676a.pause();
        this.f9677b.pause();
    }

    public void clear() {
        this.f9677b.clear();
        this.f9676a.clear();
    }

    public boolean isPaused() {
        return this.f9676a.isPaused();
    }

    public boolean isRunning() {
        return this.f9676a.isRunning();
    }

    public boolean isComplete() {
        if (!this.f9676a.isComplete()) {
            if (!this.f9677b.isComplete()) {
                return false;
            }
        }
        return true;
    }

    public boolean isResourceSet() {
        if (!this.f9676a.isResourceSet()) {
            if (!this.f9677b.isResourceSet()) {
                return false;
            }
        }
        return true;
    }

    public boolean isCancelled() {
        return this.f9676a.isCancelled();
    }

    public boolean isFailed() {
        return this.f9676a.isFailed();
    }

    public void recycle() {
        this.f9676a.recycle();
        this.f9677b.recycle();
    }
}
