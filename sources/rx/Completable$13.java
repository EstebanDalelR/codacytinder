package rx;

import java.util.Arrays;
import rx.exceptions.CompositeException;
import rx.functions.Func1;
import rx.p500e.C19575d;

class Completable$13 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ Func1 f62167a;
    /* renamed from: b */
    final /* synthetic */ Completable f62168b;

    Completable$13(Completable completable, Func1 func1) {
        this.f62168b = completable;
        this.f62167a = func1;
    }

    public /* synthetic */ void call(Object obj) {
        m71545a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71545a(final CompletableSubscriber completableSubscriber) {
        final Object c19575d = new C19575d();
        completableSubscriber.onSubscribe(c19575d);
        this.f62168b.a(new CompletableSubscriber(this) {
            /* renamed from: c */
            final /* synthetic */ Completable$13 f61086c;

            /* renamed from: rx.Completable$13$1$1 */
            class C195571 implements CompletableSubscriber {
                /* renamed from: a */
                final /* synthetic */ C195581 f61083a;

                C195571(C195581 c195581) {
                    this.f61083a = c195581;
                }

                public void onCompleted() {
                    completableSubscriber.onCompleted();
                }

                public void onError(Throwable th) {
                    completableSubscriber.onError(th);
                }

                public void onSubscribe(Subscription subscription) {
                    c19575d.m70554a(subscription);
                }
            }

            public void onCompleted() {
                completableSubscriber.onCompleted();
            }

            public void onError(Throwable th) {
                try {
                    Completable completable = (Completable) this.f61086c.f62167a.call(th);
                    if (completable == null) {
                        NullPointerException nullPointerException = new NullPointerException("The completable returned is null");
                        completableSubscriber.onError(new CompositeException(Arrays.asList(new Throwable[]{th, nullPointerException})));
                        return;
                    }
                    completable.a(new C195571(this));
                } catch (Throwable th2) {
                    completableSubscriber.onError(new CompositeException(Arrays.asList(new Throwable[]{th, th2})));
                }
            }

            public void onSubscribe(Subscription subscription) {
                c19575d.m70554a(subscription);
            }
        });
    }
}
