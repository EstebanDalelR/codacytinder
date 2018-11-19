package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.operators.flowable.j */
public final class C18373j extends C3957b<Object> implements ScalarCallable<Object> {
    /* renamed from: a */
    public static final C3957b<Object> f57116a = new C18373j();

    public Object call() {
        return null;
    }

    private C18373j() {
    }

    /* renamed from: a */
    public void m66471a(Subscriber<? super Object> subscriber) {
        EmptySubscription.complete(subscriber);
    }
}
