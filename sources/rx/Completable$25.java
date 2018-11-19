package rx;

import rx.functions.Action0;
import rx.p500e.C19572a;

class Completable$25 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ Action0 f62177a;

    Completable$25(Action0 action0) {
        this.f62177a = action0;
    }

    public /* synthetic */ void call(Object obj) {
        m71553a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71553a(CompletableSubscriber completableSubscriber) {
        C19572a c19572a = new C19572a();
        completableSubscriber.onSubscribe(c19572a);
        try {
            this.f62177a.call();
            if (!c19572a.isUnsubscribed()) {
                completableSubscriber.onCompleted();
            }
        } catch (Throwable th) {
            if (!c19572a.isUnsubscribed()) {
                completableSubscriber.onError(th);
            }
        }
    }
}
