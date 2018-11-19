package rx.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.Cancellable;
import rx.p498c.C19401c;

public final class CancellableSubscription extends AtomicReference<Cancellable> implements Subscription {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableSubscription(Cancellable cancellable) {
        super(cancellable);
    }

    public boolean isUnsubscribed() {
        return get() == null;
    }

    public void unsubscribe() {
        if (get() != null) {
            Cancellable cancellable = (Cancellable) getAndSet(null);
            if (cancellable != null) {
                try {
                    cancellable.cancel();
                } catch (Throwable e) {
                    C19410a.m69874b(e);
                    C19401c.m69811a(e);
                }
            }
        }
    }
}
