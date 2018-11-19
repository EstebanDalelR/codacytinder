package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class LambdaSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Disposable, LambdaConsumerIntrospection, Subscription {
    private static final long serialVersionUID = -7251123623727029452L;
    /* renamed from: a */
    final Consumer<? super T> f57392a;
    /* renamed from: b */
    final Consumer<? super Throwable> f57393b;
    /* renamed from: c */
    final Action f57394c;
    /* renamed from: d */
    final Consumer<? super Subscription> f57395d;

    public LambdaSubscriber(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Subscription> consumer3) {
        this.f57392a = consumer;
        this.f57393b = consumer2;
        this.f57394c = action;
        this.f57395d = consumer3;
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            try {
                this.f57395d.accept(this);
            } catch (Throwable th) {
                C15678a.m58850b(th);
                subscription.cancel();
                onError(th);
            }
        }
    }

    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.f57392a.accept(t);
            } catch (T t2) {
                C15678a.m58850b(t2);
                ((Subscription) get()).cancel();
                onError(t2);
            }
        }
    }

    public void onError(Throwable th) {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.f57393b.accept(th);
                return;
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                C2667a.a(new CompositeException(th, th2));
                return;
            }
        }
        C2667a.a(th);
    }

    public void onComplete() {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.f57394c.run();
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(th);
            }
        }
    }

    public void dispose() {
        cancel();
    }

    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    public void request(long j) {
        ((Subscription) get()).request(j);
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean hasCustomOnError() {
        return this.f57393b != Functions.f48544f;
    }
}
