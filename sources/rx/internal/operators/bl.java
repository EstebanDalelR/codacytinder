package rx.internal.operators;

import rx.C19566b;
import rx.C2671a;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.a$a;
import rx.functions.Action0;

public final class bl<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final OnSubscribe<T> f62246a;
    /* renamed from: b */
    final C2671a f62247b;

    /* renamed from: rx.internal.operators.bl$a */
    static final class C19830a<T> extends C19566b<T> implements Action0 {
        /* renamed from: a */
        final C19566b<? super T> f62059a;
        /* renamed from: b */
        final a$a f62060b;
        /* renamed from: c */
        T f62061c;
        /* renamed from: d */
        Throwable f62062d;

        public C19830a(C19566b<? super T> c19566b, a$a a_a) {
            this.f62059a = c19566b;
            this.f62060b = a_a;
        }

        /* renamed from: a */
        public void mo14737a(T t) {
            this.f62061c = t;
            this.f62060b.mo14740a(this);
        }

        public void onError(Throwable th) {
            this.f62062d = th;
            this.f62060b.mo14740a(this);
        }

        public void call() {
            try {
                Throwable th = this.f62062d;
                if (th != null) {
                    this.f62062d = null;
                    this.f62059a.onError(th);
                } else {
                    Object obj = this.f62061c;
                    this.f62061c = null;
                    this.f62059a.mo14737a(obj);
                }
                this.f62060b.unsubscribe();
            } catch (Throwable th2) {
                this.f62060b.unsubscribe();
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71592a((C19566b) obj);
    }

    public bl(OnSubscribe<T> onSubscribe, C2671a c2671a) {
        this.f62246a = onSubscribe;
        this.f62247b = c2671a;
    }

    /* renamed from: a */
    public void m71592a(C19566b<? super T> c19566b) {
        Subscription createWorker = this.f62247b.createWorker();
        Subscription c19830a = new C19830a(c19566b, createWorker);
        c19566b.m70541a(createWorker);
        c19566b.m70541a(c19830a);
        this.f62246a.call(c19830a);
    }
}
