package rx;

import java.util.concurrent.TimeUnit;
import rx.functions.Action0;
import rx.p500e.C19574c;

class Completable$4 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ C2671a f62181a;
    /* renamed from: b */
    final /* synthetic */ long f62182b;
    /* renamed from: c */
    final /* synthetic */ TimeUnit f62183c;

    Completable$4(C2671a c2671a, long j, TimeUnit timeUnit) {
        this.f62181a = c2671a;
        this.f62182b = j;
        this.f62183c = timeUnit;
    }

    public /* synthetic */ void call(Object obj) {
        m71557a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71557a(final CompletableSubscriber completableSubscriber) {
        C19574c c19574c = new C19574c();
        completableSubscriber.onSubscribe(c19574c);
        if (!c19574c.isUnsubscribed()) {
            final a$a createWorker = this.f62181a.createWorker();
            c19574c.m70552a(createWorker);
            createWorker.mo14741a(new Action0(this) {
                /* renamed from: c */
                final /* synthetic */ Completable$4 f61950c;

                public void call() {
                    try {
                        completableSubscriber.onCompleted();
                    } finally {
                        createWorker.unsubscribe();
                    }
                }
            }, this.f62182b, this.f62183c);
        }
    }
}
