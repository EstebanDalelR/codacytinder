package io.reactivex.internal.operators.flowable;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.C18434b;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.operators.flowable.d */
public final class C19004d<T> extends C18364a<T, T> {
    /* renamed from: c */
    final long f58872c;
    /* renamed from: d */
    final TimeUnit f58873d;
    /* renamed from: e */
    final C15679f f58874e;
    /* renamed from: f */
    final boolean f58875f;

    /* renamed from: io.reactivex.internal.operators.flowable.d$a */
    static final class C18367a<T> implements FlowableSubscriber<T>, Subscription {
        /* renamed from: a */
        final Subscriber<? super T> f57089a;
        /* renamed from: b */
        final long f57090b;
        /* renamed from: c */
        final TimeUnit f57091c;
        /* renamed from: d */
        final C17362c f57092d;
        /* renamed from: e */
        final boolean f57093e;
        /* renamed from: f */
        Subscription f57094f;

        /* renamed from: io.reactivex.internal.operators.flowable.d$a$a */
        final class C15693a implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C18367a f48561a;

            C15693a(C18367a c18367a) {
                this.f48561a = c18367a;
            }

            public void run() {
                try {
                    this.f48561a.f57089a.onComplete();
                } finally {
                    this.f48561a.f57092d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.d$a$b */
        final class C15694b implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C18367a f48562a;
            /* renamed from: b */
            private final Throwable f48563b;

            C15694b(C18367a c18367a, Throwable th) {
                this.f48562a = c18367a;
                this.f48563b = th;
            }

            public void run() {
                try {
                    this.f48562a.f57089a.onError(this.f48563b);
                } finally {
                    this.f48562a.f57092d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.d$a$c */
        final class C15695c implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C18367a f48564a;
            /* renamed from: b */
            private final T f48565b;

            C15695c(C18367a c18367a, T t) {
                this.f48564a = c18367a;
                this.f48565b = t;
            }

            public void run() {
                this.f48564a.f57089a.onNext(this.f48565b);
            }
        }

        C18367a(Subscriber<? super T> subscriber, long j, TimeUnit timeUnit, C17362c c17362c, boolean z) {
            this.f57089a = subscriber;
            this.f57090b = j;
            this.f57091c = timeUnit;
            this.f57092d = c17362c;
            this.f57093e = z;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57094f, subscription)) {
                this.f57094f = subscription;
                this.f57089a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f57092d.mo13559a(new C15695c(this, t), this.f57090b, this.f57091c);
        }

        public void onError(Throwable th) {
            this.f57092d.mo13559a(new C15694b(this, th), this.f57093e != null ? this.f57090b : 0, this.f57091c);
        }

        public void onComplete() {
            this.f57092d.mo13559a(new C15693a(this), this.f57090b, this.f57091c);
        }

        public void request(long j) {
            this.f57094f.request(j);
        }

        public void cancel() {
            this.f57094f.cancel();
            this.f57092d.dispose();
        }
    }

    public C19004d(C3957b<T> c3957b, long j, TimeUnit timeUnit, C15679f c15679f, boolean z) {
        super(c3957b);
        this.f58872c = j;
        this.f58873d = timeUnit;
        this.f58874e = c15679f;
        this.f58875f = z;
    }

    /* renamed from: a */
    protected void m67606a(Subscriber<? super T> subscriber) {
        Subscriber subscriber2;
        if (this.f58875f) {
            subscriber2 = subscriber;
        } else {
            subscriber2 = new C18434b(subscriber);
        }
        this.a.a(new C18367a(subscriber2, this.f58872c, this.f58873d, this.f58874e.mo12872a(), this.f58875f));
    }
}
