package rx.internal.operators;

import rx.C19566b;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.Func1;

public final class bm<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final OnSubscribe<T> f62248a;
    /* renamed from: b */
    final Func1<Throwable, ? extends T> f62249b;

    /* renamed from: rx.internal.operators.bm$a */
    static final class C19721a<T> extends C19566b<T> {
        /* renamed from: a */
        final C19566b<? super T> f61696a;
        /* renamed from: b */
        final Func1<Throwable, ? extends T> f61697b;

        public C19721a(C19566b<? super T> c19566b, Func1<Throwable, ? extends T> func1) {
            this.f61696a = c19566b;
            this.f61697b = func1;
        }

        /* renamed from: a */
        public void mo14737a(T t) {
            this.f61696a.mo14737a((Object) t);
        }

        public void onError(Throwable th) {
            try {
                this.f61696a.mo14737a(this.f61697b.call(th));
            } catch (Throwable th2) {
                C19410a.m69874b(th2);
                this.f61696a.onError(th2);
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71593a((C19566b) obj);
    }

    public bm(OnSubscribe<T> onSubscribe, Func1<Throwable, ? extends T> func1) {
        this.f62248a = onSubscribe;
        this.f62249b = func1;
    }

    /* renamed from: a */
    public void m71593a(C19566b<? super T> c19566b) {
        Subscription c19721a = new C19721a(c19566b, this.f62249b);
        c19566b.m70541a(c19721a);
        this.f62248a.call(c19721a);
    }
}
