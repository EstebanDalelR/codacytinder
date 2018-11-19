package io.reactivex.subscribers;

import com.google.android.exoplayer2.Format;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15737d;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.subscribers.a */
public abstract class C18433a<T> implements FlowableSubscriber<T>, Disposable {
    /* renamed from: b */
    final AtomicReference<Subscription> f57440b = new AtomicReference();

    public final void onSubscribe(Subscription subscription) {
        if (C15737d.m58977a(this.f57440b, subscription, getClass()) != null) {
            mo13975a();
        }
    }

    /* renamed from: a */
    protected void mo13975a() {
        ((Subscription) this.f57440b.get()).request(Format.OFFSET_SAMPLE_RELATIVE);
    }

    /* renamed from: b */
    protected final void m66614b(long j) {
        ((Subscription) this.f57440b.get()).request(j);
    }

    public final boolean isDisposed() {
        return this.f57440b.get() == SubscriptionHelper.CANCELLED;
    }

    public final void dispose() {
        SubscriptionHelper.cancel(this.f57440b);
    }
}
