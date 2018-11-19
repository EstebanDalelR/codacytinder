package rx.internal.operators;

import rx.C19566b;
import rx.Single;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.p498c.C19401c;

public final class bo<T, R> implements OnSubscribe<R> {
    /* renamed from: a */
    final Single<T> f62252a;
    /* renamed from: b */
    final Func1<? super T, ? extends R> f62253b;

    /* renamed from: rx.internal.operators.bo$a */
    static final class C19724a<T, R> extends C19566b<T> {
        /* renamed from: a */
        final C19566b<? super R> f61704a;
        /* renamed from: b */
        final Func1<? super T, ? extends R> f61705b;
        /* renamed from: c */
        boolean f61706c;

        public C19724a(C19566b<? super R> c19566b, Func1<? super T, ? extends R> func1) {
            this.f61704a = c19566b;
            this.f61705b = func1;
        }

        /* renamed from: a */
        public void mo14737a(T t) {
            try {
                this.f61704a.mo14737a(this.f61705b.call(t));
            } catch (Throwable th) {
                C19410a.m69874b(th);
                unsubscribe();
                onError(OnErrorThrowable.m69866a(th, t));
            }
        }

        public void onError(Throwable th) {
            if (this.f61706c) {
                C19401c.m69811a(th);
                return;
            }
            this.f61706c = true;
            this.f61704a.onError(th);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71595a((C19566b) obj);
    }

    public bo(Single<T> single, Func1<? super T, ? extends R> func1) {
        this.f62252a = single;
        this.f62253b = func1;
    }

    /* renamed from: a */
    public void m71595a(C19566b<? super R> c19566b) {
        C19566b c19724a = new C19724a(c19566b, this.f62253b);
        c19566b.m70541a((Subscription) c19724a);
        this.f62252a.m69762a(c19724a);
    }
}
