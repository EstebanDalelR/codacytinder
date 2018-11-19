package io.reactivex.internal.operators.flowable;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class FlowableFlatMapCompletableCompletable<T> extends C3956a implements FuseToFlowable<T> {
    /* renamed from: a */
    final C3957b<T> f56940a;
    /* renamed from: b */
    final Function<? super T, ? extends CompletableSource> f56941b;
    /* renamed from: c */
    final int f56942c;
    /* renamed from: d */
    final boolean f56943d;

    static final class FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        private static final long serialVersionUID = 8443155186132538303L;
        /* renamed from: a */
        final CompletableObserver f56932a;
        /* renamed from: b */
        final AtomicThrowable f56933b = new AtomicThrowable();
        /* renamed from: c */
        final Function<? super T, ? extends CompletableSource> f56934c;
        /* renamed from: d */
        final boolean f56935d;
        /* renamed from: e */
        final C17356a f56936e = new C17356a();
        /* renamed from: f */
        final int f56937f;
        /* renamed from: g */
        Subscription f56938g;
        /* renamed from: h */
        volatile boolean f56939h;

        final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            private static final long serialVersionUID = 8606673141535671828L;
            /* renamed from: a */
            final /* synthetic */ FlatMapCompletableMainSubscriber f53226a;

            InnerObserver(FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber) {
                this.f53226a = flatMapCompletableMainSubscriber;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onComplete() {
                this.f53226a.m66433a(this);
            }

            public void onError(Throwable th) {
                this.f53226a.m66434a(this, th);
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }
        }

        FlatMapCompletableMainSubscriber(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
            this.f56932a = completableObserver;
            this.f56934c = function;
            this.f56935d = z;
            this.f56937f = i;
            lazySet(1);
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f56938g, subscription)) {
                this.f56938g = subscription;
                this.f56932a.onSubscribe(this);
                int i = this.f56937f;
                if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                    subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
                } else {
                    subscription.request((long) i);
                }
            }
        }

        public void onNext(T t) {
            try {
                CompletableSource completableSource = (CompletableSource) C15684a.m58895a(this.f56934c.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                Object innerObserver = new InnerObserver(this);
                if (!this.f56939h && this.f56936e.add(innerObserver)) {
                    completableSource.subscribe(innerObserver);
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f56938g.cancel();
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            if (!this.f56933b.m58961a(th)) {
                C2667a.a(th);
            } else if (this.f56935d == null) {
                dispose();
                if (getAndSet(null) > null) {
                    this.f56932a.onError(this.f56933b.m58960a());
                }
            } else if (decrementAndGet() == null) {
                this.f56932a.onError(this.f56933b.m58960a());
            } else if (this.f56937f != Integer.MAX_VALUE) {
                this.f56938g.request(1);
            }
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a = this.f56933b.m58960a();
                if (a != null) {
                    this.f56932a.onError(a);
                } else {
                    this.f56932a.onComplete();
                }
            } else if (this.f56937f != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                this.f56938g.request(1);
            }
        }

        public void dispose() {
            this.f56939h = true;
            this.f56938g.cancel();
            this.f56936e.dispose();
        }

        public boolean isDisposed() {
            return this.f56936e.isDisposed();
        }

        /* renamed from: a */
        void m66433a(InnerObserver innerObserver) {
            this.f56936e.delete(innerObserver);
            onComplete();
        }

        /* renamed from: a */
        void m66434a(InnerObserver innerObserver, Throwable th) {
            this.f56936e.delete(innerObserver);
            onError(th);
        }
    }

    public FlowableFlatMapCompletableCompletable(C3957b<T> c3957b, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
        this.f56940a = c3957b;
        this.f56941b = function;
        this.f56943d = z;
        this.f56942c = i;
    }

    /* renamed from: a */
    protected void m66435a(CompletableObserver completableObserver) {
        this.f56940a.a(new FlatMapCompletableMainSubscriber(completableObserver, this.f56941b, this.f56943d, this.f56942c));
    }

    public C3957b<T> fuseToFlowable() {
        return C2667a.a(new FlowableFlatMapCompletable(this.f56940a, this.f56941b, this.f56943d, this.f56942c));
    }
}
