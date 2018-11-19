package com.google.android.m4b.maps.bx;

public class af {
    /* renamed from: a */
    private boolean f18394a;
    /* renamed from: b */
    private ai f18395b;
    /* renamed from: c */
    private boolean f18396c;

    /* renamed from: a */
    protected boolean mo4976a(boolean z) {
        return true;
    }

    /* renamed from: b */
    public void mo4977b() {
    }

    /* renamed from: c */
    public void mo4978c() {
    }

    /* renamed from: d */
    protected void mo4979d() {
    }

    protected af() {
    }

    /* renamed from: b */
    final void m22292b(boolean z) {
        if (mo4976a(z)) {
            this.f18395b.m29016a(null);
            synchronized (this) {
                this.f18394a = true;
                notifyAll();
            }
        }
    }

    /* renamed from: a */
    public final void m22289a(ai aiVar) {
        this.f18395b = aiVar;
    }

    /* renamed from: e */
    final boolean m22295e() {
        this.f18396c = false;
        return false;
    }
}
