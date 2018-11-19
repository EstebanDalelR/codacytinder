package rx.internal.operators;

import rx.C19566b;
import rx.Single.OnSubscribe;
import rx.exceptions.C19410a;
import rx.functions.Action0;

public final class bg<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final OnSubscribe<T> f62238a;
    /* renamed from: b */
    final Action0 f62239b;

    public /* synthetic */ void call(Object obj) {
        m71586a((C19566b) obj);
    }

    public bg(OnSubscribe<T> onSubscribe, Action0 action0) {
        this.f62238a = onSubscribe;
        this.f62239b = action0;
    }

    /* renamed from: a */
    public void m71586a(C19566b<? super T> c19566b) {
        try {
            this.f62239b.call();
            this.f62238a.call(c19566b);
        } catch (Throwable th) {
            C19410a.m69874b(th);
            c19566b.onError(th);
        }
    }
}
