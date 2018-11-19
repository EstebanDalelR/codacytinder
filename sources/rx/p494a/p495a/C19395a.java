package rx.p494a.p495a;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.a.a.a */
public final class C19395a {
    /* renamed from: a */
    private static final C19395a f60545a = new C19395a();
    /* renamed from: b */
    private final AtomicReference<C19396b> f60546b = new AtomicReference();

    /* renamed from: a */
    public static C19395a m69780a() {
        return f60545a;
    }

    C19395a() {
    }

    /* renamed from: b */
    public C19396b m69781b() {
        if (this.f60546b.get() == null) {
            this.f60546b.compareAndSet(null, C19396b.m69782a());
        }
        return (C19396b) this.f60546b.get();
    }
}
