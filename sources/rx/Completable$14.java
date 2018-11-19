package rx;

import rx.p498c.C19401c;
import rx.p500e.C19574c;

class Completable$14 implements CompletableSubscriber {
    /* renamed from: a */
    final /* synthetic */ C19574c f61087a;
    /* renamed from: b */
    final /* synthetic */ Completable f61088b;

    Completable$14(Completable completable, C19574c c19574c) {
        this.f61088b = completable;
        this.f61087a = c19574c;
    }

    public void onCompleted() {
        this.f61087a.unsubscribe();
    }

    public void onError(Throwable th) {
        C19401c.m69811a(th);
        this.f61087a.unsubscribe();
        Completable.c(th);
    }

    public void onSubscribe(Subscription subscription) {
        this.f61087a.m70552a(subscription);
    }
}
