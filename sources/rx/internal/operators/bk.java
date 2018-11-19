package rx.internal.operators;

import rx.C19566b;
import rx.C19571c;
import rx.Observable.Operator;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.internal.operators.bj.C19719a;
import rx.internal.producers.SingleProducer;
import rx.p498c.C19401c;

public final class bk<T, R> implements OnSubscribe<R> {
    /* renamed from: a */
    final OnSubscribe<T> f62244a;
    /* renamed from: b */
    final Operator<? extends R, ? super T> f62245b;

    /* renamed from: rx.internal.operators.bk$a */
    static final class C19720a<T> extends C19566b<T> {
        /* renamed from: a */
        final C19571c<? super T> f61695a;

        C19720a(C19571c<? super T> c19571c) {
            this.f61695a = c19571c;
        }

        /* renamed from: a */
        public void mo14737a(T t) {
            this.f61695a.setProducer(new SingleProducer(this.f61695a, t));
        }

        public void onError(Throwable th) {
            this.f61695a.onError(th);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71591a((C19566b) obj);
    }

    /* renamed from: a */
    public void m71591a(C19566b<? super R> c19566b) {
        Subscription c19719a = new C19719a(c19566b);
        c19566b.m70541a(c19719a);
        try {
            C19571c c19571c = (C19571c) C19401c.m69812b(this.f62245b).call(c19719a);
            C19566b a = m71590a(c19571c);
            c19571c.onStart();
            this.f62244a.call(a);
        } catch (Throwable th) {
            C19410a.m69871a(th, (C19566b) c19566b);
        }
    }

    /* renamed from: a */
    public static <T> C19566b<T> m71590a(C19571c<T> c19571c) {
        Object c19720a = new C19720a(c19571c);
        c19571c.add(c19720a);
        return c19720a;
    }
}
