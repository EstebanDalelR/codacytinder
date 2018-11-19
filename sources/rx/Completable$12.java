package rx;

import java.util.Arrays;
import rx.exceptions.C19410a;
import rx.exceptions.CompositeException;
import rx.functions.Func1;

class Completable$12 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ Func1 f62165a;
    /* renamed from: b */
    final /* synthetic */ Completable f62166b;

    Completable$12(Completable completable, Func1 func1) {
        this.f62166b = completable;
        this.f62165a = func1;
    }

    public /* synthetic */ void call(Object obj) {
        m71544a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71544a(final CompletableSubscriber completableSubscriber) {
        this.f62166b.a(new CompletableSubscriber(this) {
            /* renamed from: b */
            final /* synthetic */ Completable$12 f61082b;

            public void onCompleted() {
                completableSubscriber.onCompleted();
            }

            public void onError(Throwable th) {
                int i = 0;
                try {
                    i = ((Boolean) this.f61082b.f62165a.call(th)).booleanValue();
                } catch (Throwable th2) {
                    C19410a.m69874b(th2);
                    th = new CompositeException(Arrays.asList(new Throwable[]{th, th2}));
                }
                if (i != 0) {
                    completableSubscriber.onCompleted();
                } else {
                    completableSubscriber.onError(th);
                }
            }

            public void onSubscribe(Subscription subscription) {
                completableSubscriber.onSubscribe(subscription);
            }
        });
    }
}
