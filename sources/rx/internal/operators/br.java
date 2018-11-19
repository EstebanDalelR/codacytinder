package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.C19566b;
import rx.C19571c;
import rx.Observable;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.p498c.C19401c;

public final class br<T, U> implements OnSubscribe<T> {
    /* renamed from: a */
    final OnSubscribe<T> f62258a;
    /* renamed from: b */
    final Observable<? extends U> f62259b;

    /* renamed from: rx.internal.operators.br$a */
    static final class C19729a<T, U> extends C19566b<T> {
        /* renamed from: a */
        final C19566b<? super T> f61717a;
        /* renamed from: b */
        final AtomicBoolean f61718b = new AtomicBoolean();
        /* renamed from: c */
        final C19571c<U> f61719c = new C19728a(this);

        /* renamed from: rx.internal.operators.br$a$a */
        final class C19728a extends C19571c<U> {
            /* renamed from: a */
            final /* synthetic */ C19729a f61716a;

            C19728a(C19729a c19729a) {
                this.f61716a = c19729a;
            }

            public void onNext(U u) {
                onCompleted();
            }

            public void onError(Throwable th) {
                this.f61716a.onError(th);
            }

            public void onCompleted() {
                onError(new CancellationException("Single::takeUntil(Observable) - Stream was canceled before emitting a terminal event."));
            }
        }

        C19729a(C19566b<? super T> c19566b) {
            this.f61717a = c19566b;
            m70541a((Subscription) this.f61719c);
        }

        /* renamed from: a */
        public void mo14737a(T t) {
            if (this.f61718b.compareAndSet(false, true)) {
                unsubscribe();
                this.f61717a.mo14737a((Object) t);
            }
        }

        public void onError(Throwable th) {
            if (this.f61718b.compareAndSet(false, true)) {
                unsubscribe();
                this.f61717a.onError(th);
                return;
            }
            C19401c.m69811a(th);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71600a((C19566b) obj);
    }

    public br(OnSubscribe<T> onSubscribe, Observable<? extends U> observable) {
        this.f62258a = onSubscribe;
        this.f62259b = observable;
    }

    /* renamed from: a */
    public void m71600a(C19566b<? super T> c19566b) {
        Subscription c19729a = new C19729a(c19566b);
        c19566b.m70541a(c19729a);
        this.f62259b.m69677b(c19729a.f61719c);
        this.f62258a.call(c19729a);
    }
}
