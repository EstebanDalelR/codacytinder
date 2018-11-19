package rx;

import rx.functions.Action0;
import rx.internal.util.C19615i;

class Completable$11 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ C2671a f62163a;
    /* renamed from: b */
    final /* synthetic */ Completable f62164b;

    Completable$11(Completable completable, C2671a c2671a) {
        this.f62164b = completable;
        this.f62163a = c2671a;
    }

    public /* synthetic */ void call(Object obj) {
        m71543a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71543a(final CompletableSubscriber completableSubscriber) {
        final Object c19615i = new C19615i();
        final Subscription createWorker = this.f62163a.createWorker();
        c19615i.m70647a(createWorker);
        completableSubscriber.onSubscribe(c19615i);
        this.f62164b.a(new CompletableSubscriber(this) {
            /* renamed from: d */
            final /* synthetic */ Completable$11 f61080d;

            /* renamed from: rx.Completable$11$1$1 */
            class C198041 implements Action0 {
                /* renamed from: a */
                final /* synthetic */ C195551 f61942a;

                C198041(C195551 c195551) {
                    this.f61942a = c195551;
                }

                public void call() {
                    try {
                        completableSubscriber.onCompleted();
                    } finally {
                        c19615i.unsubscribe();
                    }
                }
            }

            public void onCompleted() {
                createWorker.mo14740a(new C198041(this));
            }

            public void onError(final Throwable th) {
                createWorker.mo14740a(new Action0(this) {
                    /* renamed from: b */
                    final /* synthetic */ C195551 f61944b;

                    public void call() {
                        try {
                            completableSubscriber.onError(th);
                        } finally {
                            c19615i.unsubscribe();
                        }
                    }
                });
            }

            public void onSubscribe(Subscription subscription) {
                c19615i.m70647a(subscription);
            }
        });
    }
}
