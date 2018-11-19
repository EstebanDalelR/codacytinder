package rx.p500e;

import rx.Subscription;
import rx.internal.subscriptions.SequentialSubscription;

/* renamed from: rx.e.c */
public final class C19574c implements Subscription {
    /* renamed from: a */
    final SequentialSubscription f61121a = new SequentialSubscription();

    public boolean isUnsubscribed() {
        return this.f61121a.isUnsubscribed();
    }

    public void unsubscribe() {
        this.f61121a.unsubscribe();
    }

    /* renamed from: a */
    public void m70552a(Subscription subscription) {
        if (subscription == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.f61121a.m70620b(subscription);
    }
}
