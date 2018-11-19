package rx.internal.operators;

import rx.C19566b;
import rx.Single;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.Action0;
import rx.p498c.C19401c;

public final class be<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Single<T> f62233a;
    /* renamed from: b */
    final Action0 f62234b;

    /* renamed from: rx.internal.operators.be$a */
    static final class C19717a<T> extends C19566b<T> {
        /* renamed from: a */
        final C19566b<? super T> f61687a;
        /* renamed from: b */
        final Action0 f61688b;

        public C19717a(C19566b<? super T> c19566b, Action0 action0) {
            this.f61687a = c19566b;
            this.f61688b = action0;
        }

        /* renamed from: a */
        public void mo14737a(T t) {
            try {
                this.f61687a.mo14737a((Object) t);
            } finally {
                m70978a();
            }
        }

        public void onError(Throwable th) {
            try {
                this.f61687a.onError(th);
            } finally {
                m70978a();
            }
        }

        /* renamed from: a */
        void m70978a() {
            try {
                this.f61688b.call();
            } catch (Throwable th) {
                C19410a.m69874b(th);
                C19401c.m69811a(th);
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71584a((C19566b) obj);
    }

    public be(Single<T> single, Action0 action0) {
        this.f62233a = single;
        this.f62234b = action0;
    }

    /* renamed from: a */
    public void m71584a(C19566b<? super T> c19566b) {
        C19566b c19717a = new C19717a(c19566b, this.f62234b);
        c19566b.m70541a((Subscription) c19717a);
        this.f62233a.m69762a(c19717a);
    }
}
