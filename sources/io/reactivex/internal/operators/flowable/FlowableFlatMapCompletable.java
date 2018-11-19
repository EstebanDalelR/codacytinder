package io.reactivex.internal.operators.flowable;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableFlatMapCompletable<T> extends C18364a<T, T> {
    /* renamed from: c */
    final Function<? super T, ? extends CompletableSource> f58821c;
    /* renamed from: d */
    final int f58822d;
    /* renamed from: e */
    final boolean f58823e;

    static final class FlatMapCompletableMainSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        /* renamed from: a */
        final Subscriber<? super T> f59456a;
        /* renamed from: b */
        final AtomicThrowable f59457b = new AtomicThrowable();
        /* renamed from: c */
        final Function<? super T, ? extends CompletableSource> f59458c;
        /* renamed from: d */
        final boolean f59459d;
        /* renamed from: e */
        final C17356a f59460e = new C17356a();
        /* renamed from: f */
        final int f59461f;
        /* renamed from: g */
        Subscription f59462g;
        /* renamed from: h */
        volatile boolean f59463h;

        final class InnerConsumer extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            private static final long serialVersionUID = 8606673141535671828L;
            /* renamed from: a */
            final /* synthetic */ FlatMapCompletableMainSubscriber f53225a;

            InnerConsumer(FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber) {
                this.f53225a = flatMapCompletableMainSubscriber;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onComplete() {
                this.f53225a.m68193a(this);
            }

            public void onError(Throwable th) {
                this.f53225a.m68194a(this, th);
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }
        }

        public void clear() {
        }

        public boolean isEmpty() {
            return true;
        }

        @Nullable
        public T poll() throws Exception {
            return null;
        }

        public void request(long j) {
        }

        public int requestFusion(int i) {
            return i & 2;
        }

        FlatMapCompletableMainSubscriber(Subscriber<? super T> subscriber, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
            this.f59456a = subscriber;
            this.f59458c = function;
            this.f59459d = z;
            this.f59461f = i;
            lazySet(1);
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f59462g, subscription)) {
                this.f59462g = subscription;
                this.f59456a.onSubscribe(this);
                int i = this.f59461f;
                if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                    subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
                } else {
                    subscription.request((long) i);
                }
            }
        }

        public void onNext(T t) {
            try {
                CompletableSource completableSource = (CompletableSource) C15684a.m58895a(this.f59458c.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                Object innerConsumer = new InnerConsumer(this);
                if (!this.f59463h && this.f59460e.add(innerConsumer)) {
                    completableSource.subscribe(innerConsumer);
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f59462g.cancel();
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            if (!this.f59457b.m58961a(th)) {
                C2667a.a(th);
            } else if (this.f59459d == null) {
                cancel();
                if (getAndSet(null) > null) {
                    this.f59456a.onError(this.f59457b.m58960a());
                }
            } else if (decrementAndGet() == null) {
                this.f59456a.onError(this.f59457b.m58960a());
            } else if (this.f59461f != Integer.MAX_VALUE) {
                this.f59462g.request(1);
            }
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a = this.f59457b.m58960a();
                if (a != null) {
                    this.f59456a.onError(a);
                } else {
                    this.f59456a.onComplete();
                }
            } else if (this.f59461f != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                this.f59462g.request(1);
            }
        }

        public void cancel() {
            this.f59463h = true;
            this.f59462g.cancel();
            this.f59460e.dispose();
        }

        /* renamed from: a */
        void m68193a(InnerConsumer innerConsumer) {
            this.f59460e.delete(innerConsumer);
            onComplete();
        }

        /* renamed from: a */
        void m68194a(InnerConsumer innerConsumer, Throwable th) {
            this.f59460e.delete(innerConsumer);
            onError(th);
        }
    }

    public FlowableFlatMapCompletable(C3957b<T> c3957b, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
        super(c3957b);
        this.f58821c = function;
        this.f58823e = z;
        this.f58822d = i;
    }

    /* renamed from: a */
    protected void m67576a(Subscriber<? super T> subscriber) {
        this.a.a(new FlatMapCompletableMainSubscriber(subscriber, this.f58821c, this.f58823e, this.f58822d));
    }
}
