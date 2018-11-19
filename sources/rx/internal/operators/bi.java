package rx.internal.operators;

import java.util.concurrent.Callable;
import rx.C19566b;
import rx.Single.OnSubscribe;
import rx.exceptions.C19410a;

public final class bi<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Callable<? extends T> f62242a;

    public /* synthetic */ void call(Object obj) {
        m71588a((C19566b) obj);
    }

    public bi(Callable<? extends T> callable) {
        this.f62242a = callable;
    }

    /* renamed from: a */
    public void m71588a(C19566b<? super T> c19566b) {
        try {
            c19566b.mo14737a(this.f62242a.call());
        } catch (Throwable th) {
            C19410a.m69874b(th);
            c19566b.onError(th);
        }
    }
}
