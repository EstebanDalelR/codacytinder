package rx;

import rx.functions.Action0;

class Completable$19 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ C2671a f62170a;
    /* renamed from: b */
    final /* synthetic */ Completable f62171b;

    Completable$19(Completable completable, C2671a c2671a) {
        this.f62171b = completable;
        this.f62170a = c2671a;
    }

    public /* synthetic */ void call(Object obj) {
        m71547a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71547a(final CompletableSubscriber completableSubscriber) {
        final a$a createWorker = this.f62170a.createWorker();
        createWorker.mo14740a(new Action0(this) {
            /* renamed from: c */
            final /* synthetic */ Completable$19 f61947c;

            public void call() {
                try {
                    this.f61947c.f62171b.a(completableSubscriber);
                } finally {
                    createWorker.unsubscribe();
                }
            }
        });
    }
}
