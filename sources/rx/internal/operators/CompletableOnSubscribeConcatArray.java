package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.Completable$OnSubscribe;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.internal.subscriptions.SequentialSubscription;

public final class CompletableOnSubscribeConcatArray implements Completable$OnSubscribe {
    /* renamed from: a */
    final Completable[] f62197a;

    static final class ConcatInnerSubscriber extends AtomicInteger implements CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        /* renamed from: a */
        final CompletableSubscriber f61128a;
        /* renamed from: b */
        final Completable[] f61129b;
        /* renamed from: c */
        int f61130c;
        /* renamed from: d */
        final SequentialSubscription f61131d = new SequentialSubscription();

        public ConcatInnerSubscriber(CompletableSubscriber completableSubscriber, Completable[] completableArr) {
            this.f61128a = completableSubscriber;
            this.f61129b = completableArr;
        }

        public void onSubscribe(Subscription subscription) {
            this.f61131d.m70620b(subscription);
        }

        public void onError(Throwable th) {
            this.f61128a.onError(th);
        }

        public void onCompleted() {
            m70559a();
        }

        /* renamed from: a */
        void m70559a() {
            if (!this.f61131d.isUnsubscribed() && getAndIncrement() == 0) {
                Completable[] completableArr = this.f61129b;
                while (!this.f61131d.isUnsubscribed()) {
                    int i = this.f61130c;
                    this.f61130c = i + 1;
                    if (i == completableArr.length) {
                        this.f61128a.onCompleted();
                        return;
                    }
                    completableArr[i].a(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71566a((CompletableSubscriber) obj);
    }

    public CompletableOnSubscribeConcatArray(Completable[] completableArr) {
        this.f62197a = completableArr;
    }

    /* renamed from: a */
    public void m71566a(CompletableSubscriber completableSubscriber) {
        ConcatInnerSubscriber concatInnerSubscriber = new ConcatInnerSubscriber(completableSubscriber, this.f62197a);
        completableSubscriber.onSubscribe(concatInnerSubscriber.f61131d);
        concatInnerSubscriber.m70559a();
    }
}
