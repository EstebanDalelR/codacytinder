package rx;

import rx.p500e.C19407e;

class Completable$24 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ Throwable f62176a;

    Completable$24(Throwable th) {
        this.f62176a = th;
    }

    public /* synthetic */ void call(Object obj) {
        m71552a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71552a(CompletableSubscriber completableSubscriber) {
        completableSubscriber.onSubscribe(C19407e.m69855b());
        completableSubscriber.onError(this.f62176a);
    }
}
