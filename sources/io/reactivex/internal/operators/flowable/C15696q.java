package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.operators.flowable.q */
public final class C15696q {

    /* renamed from: io.reactivex.internal.operators.flowable.q$a */
    static final class C18378a<T, R> extends C3957b<R> {
        /* renamed from: a */
        final T f57122a;
        /* renamed from: c */
        final Function<? super T, ? extends Publisher<? extends R>> f57123c;

        C18378a(T t, Function<? super T, ? extends Publisher<? extends R>> function) {
            this.f57122a = t;
            this.f57123c = function;
        }

        /* renamed from: a */
        public void m66475a(Subscriber<? super R> subscriber) {
            try {
                Publisher publisher = (Publisher) C15684a.m58895a(this.f57123c.apply(this.f57122a), "The mapper returned a null Publisher");
                if (publisher instanceof Callable) {
                    try {
                        Object call = ((Callable) publisher).call();
                        if (call == null) {
                            EmptySubscription.complete(subscriber);
                            return;
                        }
                        subscriber.onSubscribe(new ScalarSubscription(subscriber, call));
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        EmptySubscription.error(th, subscriber);
                        return;
                    }
                }
                publisher.subscribe(subscriber);
            } catch (Throwable th2) {
                EmptySubscription.error(th2, subscriber);
            }
        }
    }

    /* renamed from: a */
    public static <T, R> boolean m58901a(Publisher<T> publisher, Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function) {
        if (!(publisher instanceof Callable)) {
            return null;
        }
        try {
            publisher = ((Callable) publisher).call();
            if (publisher == null) {
                EmptySubscription.complete(subscriber);
                return true;
            }
            try {
                publisher = (Publisher) C15684a.m58895a(function.apply(publisher), "The mapper returned a null Publisher");
                if ((publisher instanceof Callable) != null) {
                    try {
                        publisher = ((Callable) publisher).call();
                        if (publisher == null) {
                            EmptySubscription.complete(subscriber);
                            return true;
                        }
                        subscriber.onSubscribe(new ScalarSubscription(subscriber, publisher));
                    } catch (Publisher<T> publisher2) {
                        C15678a.m58850b(publisher2);
                        EmptySubscription.error(publisher2, subscriber);
                        return true;
                    }
                }
                publisher2.subscribe(subscriber);
                return true;
            } catch (Publisher<T> publisher22) {
                C15678a.m58850b(publisher22);
                EmptySubscription.error(publisher22, subscriber);
                return true;
            }
        } catch (Publisher<T> publisher222) {
            C15678a.m58850b(publisher222);
            EmptySubscription.error(publisher222, subscriber);
            return true;
        }
    }

    /* renamed from: a */
    public static <T, U> C3957b<U> m58900a(T t, Function<? super T, ? extends Publisher<? extends U>> function) {
        return C2667a.a(new C18378a(t, function));
    }
}
