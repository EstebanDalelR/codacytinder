package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.Completable$OnSubscribe;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.internal.subscriptions.SequentialSubscription;
import rx.p500e.C19407e;

public final class CompletableOnSubscribeConcatIterable implements Completable$OnSubscribe {
    /* renamed from: a */
    final Iterable<? extends Completable> f62198a;

    static final class ConcatInnerSubscriber extends AtomicInteger implements CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        /* renamed from: a */
        final CompletableSubscriber f61132a;
        /* renamed from: b */
        final Iterator<? extends Completable> f61133b;
        /* renamed from: c */
        final SequentialSubscription f61134c = new SequentialSubscription();

        public ConcatInnerSubscriber(CompletableSubscriber completableSubscriber, Iterator<? extends Completable> it) {
            this.f61132a = completableSubscriber;
            this.f61133b = it;
        }

        public void onSubscribe(Subscription subscription) {
            this.f61134c.m70620b(subscription);
        }

        public void onError(Throwable th) {
            this.f61132a.onError(th);
        }

        public void onCompleted() {
            m70560a();
        }

        /* renamed from: a */
        void m70560a() {
            if (!this.f61134c.isUnsubscribed() && getAndIncrement() == 0) {
                Iterator it = this.f61133b;
                while (!this.f61134c.isUnsubscribed()) {
                    try {
                        if (it.hasNext()) {
                            try {
                                Completable completable = (Completable) it.next();
                                if (completable == null) {
                                    this.f61132a.onError(new NullPointerException("The completable returned is null"));
                                    return;
                                }
                                completable.a(this);
                                if (decrementAndGet() == 0) {
                                    return;
                                }
                            } catch (Throwable th) {
                                this.f61132a.onError(th);
                                return;
                            }
                        }
                        this.f61132a.onCompleted();
                        return;
                    } catch (Throwable th2) {
                        this.f61132a.onError(th2);
                        return;
                    }
                }
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71567a((CompletableSubscriber) obj);
    }

    public CompletableOnSubscribeConcatIterable(Iterable<? extends Completable> iterable) {
        this.f62198a = iterable;
    }

    /* renamed from: a */
    public void m71567a(CompletableSubscriber completableSubscriber) {
        try {
            Iterator it = this.f62198a.iterator();
            if (it == null) {
                completableSubscriber.onSubscribe(C19407e.m69855b());
                completableSubscriber.onError(new NullPointerException("The iterator returned is null"));
                return;
            }
            ConcatInnerSubscriber concatInnerSubscriber = new ConcatInnerSubscriber(completableSubscriber, it);
            completableSubscriber.onSubscribe(concatInnerSubscriber.f61134c);
            concatInnerSubscriber.m70560a();
        } catch (Throwable th) {
            completableSubscriber.onSubscribe(C19407e.m69855b());
            completableSubscriber.onError(th);
        }
    }
}
