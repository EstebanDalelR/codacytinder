package rx;

import rx.Single.OnSubscribe;
import rx.functions.Func0;

class Completable$21 implements OnSubscribe<T> {
    /* renamed from: a */
    final /* synthetic */ Func0 f62173a;
    /* renamed from: b */
    final /* synthetic */ Completable f62174b;

    Completable$21(Completable completable, Func0 func0) {
        this.f62174b = completable;
        this.f62173a = func0;
    }

    public /* synthetic */ void call(Object obj) {
        m71550a((C19566b) obj);
    }

    /* renamed from: a */
    public void m71550a(final C19566b<? super T> c19566b) {
        this.f62174b.a(new CompletableSubscriber(this) {
            /* renamed from: b */
            final /* synthetic */ Completable$21 f61105b;

            public void onCompleted() {
                try {
                    Object call = this.f61105b.f62173a.call();
                    if (call == null) {
                        c19566b.onError(new NullPointerException("The value supplied is null"));
                    } else {
                        c19566b.mo14737a(call);
                    }
                } catch (Throwable th) {
                    c19566b.onError(th);
                }
            }

            public void onError(Throwable th) {
                c19566b.onError(th);
            }

            public void onSubscribe(Subscription subscription) {
                c19566b.m70541a(subscription);
            }
        });
    }
}
