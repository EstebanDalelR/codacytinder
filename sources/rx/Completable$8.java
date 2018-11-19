package rx;

import rx.p500e.C19407e;

class Completable$8 implements Completable$OnSubscribe {
    Completable$8() {
    }

    public /* synthetic */ void call(Object obj) {
        m71559a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71559a(CompletableSubscriber completableSubscriber) {
        completableSubscriber.onSubscribe(C19407e.m69855b());
    }
}
