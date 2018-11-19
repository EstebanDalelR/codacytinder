package rx;

import rx.functions.Action0;
import rx.p498c.C19401c;
import rx.p500e.C19574c;

class Completable$15 implements CompletableSubscriber {
    /* renamed from: a */
    boolean f61089a;
    /* renamed from: b */
    final /* synthetic */ Action0 f61090b;
    /* renamed from: c */
    final /* synthetic */ C19574c f61091c;
    /* renamed from: d */
    final /* synthetic */ Completable f61092d;

    Completable$15(Completable completable, Action0 action0, C19574c c19574c) {
        this.f61092d = completable;
        this.f61090b = action0;
        this.f61091c = c19574c;
    }

    public void onCompleted() {
        if (!this.f61089a) {
            this.f61089a = true;
            try {
                this.f61090b.call();
            } catch (Throwable th) {
                this.f61091c.unsubscribe();
            }
            this.f61091c.unsubscribe();
        }
    }

    public void onError(Throwable th) {
        C19401c.m69811a(th);
        this.f61091c.unsubscribe();
        Completable.c(th);
    }

    public void onSubscribe(Subscription subscription) {
        this.f61091c.m70552a(subscription);
    }
}
