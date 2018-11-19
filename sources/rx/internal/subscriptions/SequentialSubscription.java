package rx.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.p500e.C19407e;

public final class SequentialSubscription extends AtomicReference<Subscription> implements Subscription {
    private static final long serialVersionUID = 995205034283130269L;

    public SequentialSubscription(Subscription subscription) {
        lazySet(subscription);
    }

    /* renamed from: a */
    public Subscription m70618a() {
        Subscription subscription = (Subscription) super.get();
        return subscription == Unsubscribed.INSTANCE ? C19407e.m69855b() : subscription;
    }

    /* renamed from: a */
    public boolean m70619a(Subscription subscription) {
        Subscription subscription2;
        do {
            subscription2 = (Subscription) get();
            if (subscription2 == Unsubscribed.INSTANCE) {
                if (subscription != null) {
                    subscription.unsubscribe();
                }
                return null;
            }
        } while (!compareAndSet(subscription2, subscription));
        if (subscription2 != null) {
            subscription2.unsubscribe();
        }
        return true;
    }

    /* renamed from: b */
    public boolean m70620b(Subscription subscription) {
        Subscription subscription2;
        do {
            subscription2 = (Subscription) get();
            if (subscription2 == Unsubscribed.INSTANCE) {
                if (subscription != null) {
                    subscription.unsubscribe();
                }
                return null;
            }
        } while (!compareAndSet(subscription2, subscription));
        return true;
    }

    public void unsubscribe() {
        if (((Subscription) get()) != Unsubscribed.INSTANCE) {
            Subscription subscription = (Subscription) getAndSet(Unsubscribed.INSTANCE);
            if (subscription != null && subscription != Unsubscribed.INSTANCE) {
                subscription.unsubscribe();
            }
        }
    }

    public boolean isUnsubscribed() {
        return get() == Unsubscribed.INSTANCE;
    }
}
