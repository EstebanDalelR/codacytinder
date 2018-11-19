package rx;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.p498c.C19401c;
import rx.p500e.C19573b;

class Completable$17 implements Completable$OnSubscribe {
    /* renamed from: a */
    final /* synthetic */ Completable[] f62169a;

    Completable$17(Completable[] completableArr) {
        this.f62169a = completableArr;
    }

    public /* synthetic */ void call(Object obj) {
        m71546a((CompletableSubscriber) obj);
    }

    /* renamed from: a */
    public void m71546a(final CompletableSubscriber completableSubscriber) {
        final C19573b c19573b = new C19573b();
        completableSubscriber.onSubscribe(c19573b);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        CompletableSubscriber c195591 = new CompletableSubscriber(this) {
            /* renamed from: d */
            final /* synthetic */ Completable$17 f61101d;

            public void onCompleted() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    c19573b.unsubscribe();
                    completableSubscriber.onCompleted();
                }
            }

            public void onError(Throwable th) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    c19573b.unsubscribe();
                    completableSubscriber.onError(th);
                    return;
                }
                C19401c.m69811a(th);
            }

            public void onSubscribe(Subscription subscription) {
                c19573b.m70548a(subscription);
            }
        };
        Completable[] completableArr = this.f62169a;
        int length = completableArr.length;
        int i = 0;
        while (i < length) {
            Completable completable = completableArr[i];
            if (!c19573b.isUnsubscribed()) {
                if (completable == null) {
                    Throwable nullPointerException = new NullPointerException("One of the sources is null");
                    if (atomicBoolean.compareAndSet(false, true)) {
                        c19573b.unsubscribe();
                        completableSubscriber.onError(nullPointerException);
                    } else {
                        C19401c.m69811a(nullPointerException);
                    }
                    return;
                }
                if (!atomicBoolean.get()) {
                    if (!c19573b.isUnsubscribed()) {
                        completable.a(c195591);
                        i++;
                    }
                }
                return;
            }
            return;
        }
    }
}
