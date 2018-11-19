package rx;

import rx.p500e.C19407e;

class Completable$1 implements Completable$OnSubscribe {
    Completable$1() {
    }

    public /* synthetic */ void call(Object obj) {
        m71548a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71548a(CompletableSubscriber completableSubscriber) {
        completableSubscriber.onSubscribe(C19407e.m69855b());
        completableSubscriber.onCompleted();
    }
}
