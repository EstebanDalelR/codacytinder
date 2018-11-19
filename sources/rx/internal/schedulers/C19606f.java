package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import rx.C2671a;
import rx.a$a;

/* renamed from: rx.internal.schedulers.f */
public final class C19606f extends C2671a {
    /* renamed from: a */
    private final ThreadFactory f61273a;

    public C19606f(ThreadFactory threadFactory) {
        this.f61273a = threadFactory;
    }

    public a$a createWorker() {
        return new C19755g(this.f61273a);
    }
}
