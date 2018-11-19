package rx.p494a.p496b;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import rx.C2671a;
import rx.p494a.p495a.C19395a;

/* renamed from: rx.a.b.a */
public final class C19397a {
    /* renamed from: a */
    private static final AtomicReference<C19397a> f60548a = new AtomicReference();
    /* renamed from: b */
    private final C2671a f60549b;

    /* renamed from: b */
    private static C19397a m69786b() {
        C19397a c19397a;
        do {
            c19397a = (C19397a) f60548a.get();
            if (c19397a != null) {
                return c19397a;
            }
            c19397a = new C19397a();
        } while (!f60548a.compareAndSet(null, c19397a));
        return c19397a;
    }

    private C19397a() {
        C2671a b = C19395a.m69780a().m69781b().m69784b();
        if (b != null) {
            this.f60549b = b;
        } else {
            this.f60549b = new C19564b(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public static C2671a m69785a() {
        return C19397a.m69786b().f60549b;
    }
}
