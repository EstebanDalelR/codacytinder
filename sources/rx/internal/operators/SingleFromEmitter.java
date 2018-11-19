package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.C19566b;
import rx.Single.OnSubscribe;
import rx.SingleEmitter;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.Action1;
import rx.functions.Cancellable;
import rx.internal.subscriptions.CancellableSubscription;
import rx.internal.subscriptions.SequentialSubscription;
import rx.p498c.C19401c;

public final class SingleFromEmitter<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Action1<SingleEmitter<T>> f62223a;

    static final class SingleEmitterImpl<T> extends AtomicBoolean implements SingleEmitter<T>, Subscription {
        private static final long serialVersionUID = 8082834163465882809L;
        /* renamed from: a */
        final C19566b<? super T> f61182a;
        /* renamed from: b */
        final SequentialSubscription f61183b = new SequentialSubscription();

        SingleEmitterImpl(C19566b<? super T> c19566b) {
            this.f61182a = c19566b;
        }

        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f61183b.unsubscribe();
            }
        }

        public boolean isUnsubscribed() {
            return get();
        }

        public void onSuccess(T t) {
            if (compareAndSet(false, true)) {
                try {
                    this.f61182a.mo14737a((Object) t);
                } finally {
                    this.f61183b.unsubscribe();
                }
            }
        }

        public void onError(Throwable th) {
            if (th == null) {
                th = new NullPointerException();
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f61182a.onError(th);
                } finally {
                    this.f61183b.unsubscribe();
                }
            } else {
                C19401c.m69811a(th);
            }
        }

        public void setSubscription(Subscription subscription) {
            this.f61183b.m70619a(subscription);
        }

        public void setCancellation(Cancellable cancellable) {
            setSubscription(new CancellableSubscription(cancellable));
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71580a((C19566b) obj);
    }

    public SingleFromEmitter(Action1<SingleEmitter<T>> action1) {
        this.f62223a = action1;
    }

    /* renamed from: a */
    public void m71580a(C19566b<? super T> c19566b) {
        Subscription singleEmitterImpl = new SingleEmitterImpl(c19566b);
        c19566b.m70541a(singleEmitterImpl);
        try {
            this.f62223a.call(singleEmitterImpl);
        } catch (C19566b<? super T> c19566b2) {
            C19410a.m69874b(c19566b2);
            singleEmitterImpl.onError(c19566b2);
        }
    }
}
