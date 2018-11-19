package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Completable$OnSubscribe;
import rx.CompletableEmitter;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.Action1;
import rx.functions.Cancellable;
import rx.internal.subscriptions.CancellableSubscription;
import rx.internal.subscriptions.SequentialSubscription;
import rx.p498c.C19401c;

public final class CompletableFromEmitter implements Completable$OnSubscribe {
    /* renamed from: a */
    final Action1<CompletableEmitter> f62196a;

    static final class FromEmitter extends AtomicBoolean implements CompletableEmitter, Subscription {
        private static final long serialVersionUID = 5539301318568668881L;
        /* renamed from: a */
        final CompletableSubscriber f61126a;
        /* renamed from: b */
        final SequentialSubscription f61127b = new SequentialSubscription();

        public FromEmitter(CompletableSubscriber completableSubscriber) {
            this.f61126a = completableSubscriber;
        }

        public void onCompleted() {
            if (compareAndSet(false, true)) {
                try {
                    this.f61126a.onCompleted();
                } finally {
                    this.f61127b.unsubscribe();
                }
            }
        }

        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                try {
                    this.f61126a.onError(th);
                } finally {
                    this.f61127b.unsubscribe();
                }
            } else {
                C19401c.m69811a(th);
            }
        }

        public void setSubscription(Subscription subscription) {
            this.f61127b.m70619a(subscription);
        }

        public void setCancellation(Cancellable cancellable) {
            setSubscription(new CancellableSubscription(cancellable));
        }

        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f61127b.unsubscribe();
            }
        }

        public boolean isUnsubscribed() {
            return get();
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71565a((CompletableSubscriber) obj);
    }

    public CompletableFromEmitter(Action1<CompletableEmitter> action1) {
        this.f62196a = action1;
    }

    /* renamed from: a */
    public void m71565a(CompletableSubscriber completableSubscriber) {
        Object fromEmitter = new FromEmitter(completableSubscriber);
        completableSubscriber.onSubscribe(fromEmitter);
        try {
            this.f62196a.call(fromEmitter);
        } catch (CompletableSubscriber completableSubscriber2) {
            C19410a.m69874b(completableSubscriber2);
            fromEmitter.onError(completableSubscriber2);
        }
    }
}
