package rx;

import java.util.concurrent.Callable;
import rx.p500e.C19572a;

class Completable$26 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ Callable f62178a;

    Completable$26(Callable callable) {
        this.f62178a = callable;
    }

    public /* synthetic */ void call(Object obj) {
        m71554a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71554a(CompletableSubscriber completableSubscriber) {
        C19572a c19572a = new C19572a();
        completableSubscriber.onSubscribe(c19572a);
        try {
            this.f62178a.call();
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
