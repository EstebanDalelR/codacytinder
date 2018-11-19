package rx.internal.operators;

import rx.C19566b;
import rx.Single;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.exceptions.CompositeException;
import rx.functions.Action1;

public final class bf<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Single<T> f62235a;
    /* renamed from: b */
    final Action1<? super T> f62236b;
    /* renamed from: c */
    final Action1<Throwable> f62237c;

    /* renamed from: rx.internal.operators.bf$a */
    static final class C19718a<T> extends C19566b<T> {
        /* renamed from: a */
        final C19566b<? super T> f61689a;
        /* renamed from: b */
        final Action1<? super T> f61690b;
        /* renamed from: c */
        final Action1<Throwable> f61691c;

        C19718a(C19566b<? super T> c19566b, Action1<? super T> action1, Action1<Throwable> action12) {
            this.f61689a = c19566b;
            this.f61690b = action1;
            this.f61691c = action12;
        }

        /* renamed from: a */
        public void mo14737a(T t) {
            try {
                this.f61690b.call(t);
                this.f61689a.mo14737a((Object) t);
            } catch (Throwable th) {
                C19410a.m69872a(th, (C19566b) this, (Object) t);
            }
        }

        public void onError(Throwable th) {
            try {
                this.f61691c.call(th);
                this.f61689a.onError(th);
            } catch (Throwable th2) {
                C19410a.m69874b(th2);
                this.f61689a.onError(new CompositeException(th, th2));
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71585a((C19566b) obj);
    }

    public bf(Single<T> single, Action1<? super T> action1, Action1<Throwable> action12) {
        this.f62235a = single;
        this.f62236b = action1;
        this.f62237c = action12;
    }

    /* renamed from: a */
    public void m71585a(C19566b<? super T> c19566b) {
        C19566b c19718a = new C19718a(c19566b, this.f62236b, this.f62237c);
        c19566b.m70541a((Subscription) c19718a);
        this.f62235a.m69762a(c19718a);
    }
}
