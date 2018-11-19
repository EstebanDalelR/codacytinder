package rx;

import rx.functions.Func0;
import rx.p500e.C19407e;

class Completable$23 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ Func0 f62175a;

    Completable$23(Func0 func0) {
        this.f62175a = func0;
    }

    public /* synthetic */ void call(Object obj) {
        m71551a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71551a(CompletableSubscriber completableSubscriber) {
        try {
            Completable completable = (Completable) this.f62175a.call();
            if (completable == null) {
                completableSubscriber.onSubscribe(C19407e.m69855b());
                completableSubscriber.onError(new NullPointerException("The completable returned is null"));
                return;
            }
            completable.a(completableSubscriber);
        } catch (Throwable th) {
            completableSubscriber.onSubscribe(C19407e.m69855b());
            completableSubscriber.onError(th);
        }
    }
}
