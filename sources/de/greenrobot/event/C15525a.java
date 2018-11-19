package de.greenrobot.event;

/* renamed from: de.greenrobot.event.a */
class C15525a implements Runnable {
    /* renamed from: a */
    private final C15530h f47954a = new C15530h();
    /* renamed from: b */
    private final C2664c f47955b;

    C15525a(C2664c c2664c) {
        this.f47955b = c2664c;
    }

    /* renamed from: a */
    public void m58010a(C15534l c15534l, Object obj) {
        this.f47954a.m58022a(C15529g.m58018a(c15534l, obj));
        this.f47955b.c().execute(this);
    }

    public void run() {
        C15529g a = this.f47954a.m58020a();
        if (a == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f47955b.a(a);
    }
}
