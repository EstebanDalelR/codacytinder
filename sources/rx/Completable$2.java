package rx;

class Completable$2 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ Observable f62179a;

    Completable$2(Observable observable) {
        this.f62179a = observable;
    }

    public /* synthetic */ void call(Object obj) {
        m71555a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71555a(final CompletableSubscriber completableSubscriber) {
        C19571c c196501 = new C19571c<Object>(this) {
            /* renamed from: b */
            final /* synthetic */ Completable$2 f61429b;

            public void onNext(Object obj) {
            }

            public void onCompleted() {
                completableSubscriber.onCompleted();
            }

            public void onError(Throwable th) {
                completableSubscriber.onError(th);
            }
        };
        completableSubscriber.onSubscribe(c196501);
        this.f62179a.m69661a(c196501);
    }
}
