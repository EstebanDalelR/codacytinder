package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import org.reactivestreams.Subscriber;

public final class FlowableOnErrorReturn<T> extends C18364a<T, T> {
    /* renamed from: c */
    final Function<? super Throwable, ? extends T> f58839c;

    static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        /* renamed from: a */
        final Function<? super Throwable, ? extends T> f58838a;

        OnErrorReturnSubscriber(Subscriber<? super T> subscriber, Function<? super Throwable, ? extends T> function) {
            super(subscriber);
            this.f58838a = function;
        }

        public void onNext(T t) {
            this.e++;
            this.b.onNext(t);
        }

        public void onError(Throwable th) {
            try {
                m66596a(C15684a.m58895a(this.f58838a.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                this.b.onError(new CompositeException(th, th2));
            }
        }

        public void onComplete() {
            this.b.onComplete();
        }
    }

    public FlowableOnErrorReturn(C3957b<T> c3957b, Function<? super Throwable, ? extends T> function) {
        super(c3957b);
        this.f58839c = function;
    }

    /* renamed from: a */
    protected void m67584a(Subscriber<? super T> subscriber) {
        this.a.a(new OnErrorReturnSubscriber(subscriber, this.f58839c));
    }
}
