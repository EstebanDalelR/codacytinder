package rx;

import rx.internal.util.C19615i;

/* renamed from: rx.b */
public abstract class C19566b<T> implements Subscription {
    /* renamed from: a */
    private final C19615i f61113a = new C19615i();

    /* renamed from: a */
    public abstract void mo14737a(T t);

    public abstract void onError(Throwable th);

    /* renamed from: a */
    public final void m70541a(Subscription subscription) {
        this.f61113a.m70647a(subscription);
    }

    public final void unsubscribe() {
        this.f61113a.unsubscribe();
    }

    public final boolean isUnsubscribed() {
        return this.f61113a.isUnsubscribed();
    }
}
