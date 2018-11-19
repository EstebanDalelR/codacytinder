package rx.p500e;

import rx.Subscription;
import rx.internal.subscriptions.SequentialSubscription;

/* renamed from: rx.e.d */
public final class C19575d implements Subscription {
    /* renamed from: a */
    final SequentialSubscription f61122a = new SequentialSubscription();

    public boolean isUnsubscribed() {
        return this.f61122a.isUnsubscribed();
    }

    public void unsubscribe() {
        this.f61122a.unsubscribe();
    }

    /* renamed from: a */
    public void m70554a(Subscription subscription) {
        if (subscription == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.f61122a.m70619a(subscription);
    }

    /* renamed from: a */
    public Subscription m70553a() {
        return this.f61122a.m70618a();
    }
}
