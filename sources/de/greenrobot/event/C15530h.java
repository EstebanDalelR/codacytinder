package de.greenrobot.event;

/* renamed from: de.greenrobot.event.h */
final class C15530h {
    /* renamed from: a */
    private C15529g f47984a;
    /* renamed from: b */
    private C15529g f47985b;

    C15530h() {
    }

    /* renamed from: a */
    synchronized void m58022a(C15529g c15529g) {
        if (c15529g == null) {
            throw new NullPointerException("null cannot be enqueued");
        }
        if (this.f47985b != null) {
            this.f47985b.f47983c = c15529g;
            this.f47985b = c15529g;
        } else if (this.f47984a == null) {
            this.f47985b = c15529g;
            this.f47984a = c15529g;
        } else {
            throw new IllegalStateException("Head present, but no tail");
        }
        notifyAll();
    }

    /* renamed from: a */
    synchronized C15529g m58020a() {
        C15529g c15529g;
        c15529g = this.f47984a;
        if (this.f47984a != null) {
            this.f47984a = this.f47984a.f47983c;
            if (this.f47984a == null) {
                this.f47985b = null;
            }
        }
        return c15529g;
    }

    /* renamed from: a */
    synchronized C15529g m58021a(int i) throws InterruptedException {
        if (this.f47984a == null) {
            wait((long) i);
        }
        return m58020a();
    }
}
