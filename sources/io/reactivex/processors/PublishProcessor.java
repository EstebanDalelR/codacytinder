package io.reactivex.processors;

import com.google.android.exoplayer2.Format;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class PublishProcessor<T> extends C18430a<T> {
    /* renamed from: a */
    static final PublishSubscription[] f59114a = new PublishSubscription[0];
    /* renamed from: c */
    static final PublishSubscription[] f59115c = new PublishSubscription[0];
    /* renamed from: d */
    final AtomicReference<PublishSubscription<T>[]> f59116d = new AtomicReference(f59115c);
    /* renamed from: e */
    Throwable f59117e;

    static final class PublishSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 3562861878281475070L;
        /* renamed from: a */
        final Subscriber<? super T> f54162a;
        /* renamed from: b */
        final PublishProcessor<T> f54163b;

        PublishSubscription(Subscriber<? super T> subscriber, PublishProcessor<T> publishProcessor) {
            this.f54162a = subscriber;
            this.f54163b = publishProcessor;
        }

        /* renamed from: a */
        public void m63760a(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    this.f54162a.onNext(t);
                    C15735a.m58970d(this, 1);
                } else {
                    cancel();
                    this.f54162a.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }

        /* renamed from: a */
        public void m63761a(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f54162a.onError(th);
            } else {
                C2667a.a(th);
            }
        }

        /* renamed from: a */
        public void m63759a() {
            if (get() != Long.MIN_VALUE) {
                this.f54162a.onComplete();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58968b(this, j);
            }
        }

        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f54163b.m67666b(this);
            }
        }

        /* renamed from: b */
        public boolean m63762b() {
            return get() == Long.MIN_VALUE;
        }
    }

    @CheckReturnValue
    /* renamed from: q */
    public static <T> PublishProcessor<T> m67663q() {
        return new PublishProcessor();
    }

    PublishProcessor() {
    }

    /* renamed from: a */
    public void m67664a(Subscriber<? super T> subscriber) {
        PublishSubscription publishSubscription = new PublishSubscription(subscriber, this);
        subscriber.onSubscribe(publishSubscription);
        if (!m67665a(publishSubscription)) {
            Throwable th = this.f59117e;
            if (th != null) {
                subscriber.onError(th);
            } else {
                subscriber.onComplete();
            }
        } else if (publishSubscription.m63762b() != null) {
            m67666b(publishSubscription);
        }
    }

    /* renamed from: a */
    boolean m67665a(PublishSubscription<T> publishSubscription) {
        PublishSubscription[] publishSubscriptionArr;
        Object obj;
        do {
            publishSubscriptionArr = (PublishSubscription[]) this.f59116d.get();
            if (publishSubscriptionArr == f59114a) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            obj = new PublishSubscription[(length + 1)];
            System.arraycopy(publishSubscriptionArr, 0, obj, 0, length);
            obj[length] = publishSubscription;
        } while (!this.f59116d.compareAndSet(publishSubscriptionArr, obj));
        return true;
    }

    /* renamed from: b */
    void m67666b(PublishSubscription<T> publishSubscription) {
        PublishSubscription[] publishSubscriptionArr;
        Object obj;
        do {
            publishSubscriptionArr = (PublishSubscription[]) this.f59116d.get();
            if (publishSubscriptionArr != f59114a) {
                if (publishSubscriptionArr != f59115c) {
                    int length = publishSubscriptionArr.length;
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (publishSubscriptionArr[i2] == publishSubscription) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f59115c;
                        } else {
                            Object obj2 = new PublishSubscription[(length - 1)];
                            System.arraycopy(publishSubscriptionArr, 0, obj2, 0, i);
                            System.arraycopy(publishSubscriptionArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        } while (!this.f59116d.compareAndSet(publishSubscriptionArr, obj));
    }

    public void onSubscribe(Subscription subscription) {
        if (this.f59116d.get() == f59114a) {
            subscription.cancel();
        } else {
            subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
        }
    }

    public void onNext(T t) {
        C15684a.m58895a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f59116d.get() != f59114a) {
            for (PublishSubscription a : (PublishSubscription[]) this.f59116d.get()) {
                a.m63760a((Object) t);
            }
        }
    }

    public void onError(Throwable th) {
        C15684a.m58895a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f59116d.get() == f59114a) {
            C2667a.a(th);
            return;
        }
        this.f59117e = th;
        for (PublishSubscription a : (PublishSubscription[]) this.f59116d.getAndSet(f59114a)) {
            a.m63761a(th);
        }
    }

    public void onComplete() {
        if (this.f59116d.get() != f59114a) {
            for (PublishSubscription a : (PublishSubscription[]) this.f59116d.getAndSet(f59114a)) {
                a.m63759a();
            }
        }
    }

    /* renamed from: r */
    public boolean mo14002r() {
        return ((PublishSubscription[]) this.f59116d.get()).length != 0;
    }
}
