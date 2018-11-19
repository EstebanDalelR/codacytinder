package rx;

class Completable$3 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ Single f62180a;

    Completable$3(Single single) {
        this.f62180a = single;
    }

    public /* synthetic */ void call(Object obj) {
        m71556a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71556a(final CompletableSubscriber completableSubscriber) {
        C19566b c196511 = new C19566b<Object>(this) {
            /* renamed from: b */
            final /* synthetic */ Completable$3 f61433b;

            public void onError(Throwable th) {
                completableSubscriber.onError(th);
            }

            /* renamed from: a */
            public void mo14737a(Object obj) {
                completableSubscriber.onCompleted();
            }
        };
        completableSubscriber.onSubscribe(c196511);
        this.f62180a.m69762a(c196511);
    }
}
