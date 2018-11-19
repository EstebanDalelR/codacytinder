package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C15738e;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableMergeWithCompletable<T> extends C18394a<T, T> {
    /* renamed from: b */
    final CompletableSource f58946b;

    static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = -4592979584110982903L;
        /* renamed from: a */
        final Observer<? super T> f53567a;
        /* renamed from: b */
        final AtomicReference<Disposable> f53568b = new AtomicReference();
        /* renamed from: c */
        final OtherObserver f53569c = new OtherObserver(this);
        /* renamed from: d */
        final AtomicThrowable f53570d = new AtomicThrowable();
        /* renamed from: e */
        volatile boolean f53571e;
        /* renamed from: f */
        volatile boolean f53572f;

        static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -2935427570954647017L;
            /* renamed from: a */
            final MergeWithObserver<?> f53566a;

            OtherObserver(MergeWithObserver<?> mergeWithObserver) {
                this.f53566a = mergeWithObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onError(Throwable th) {
                this.f53566a.m63602a(th);
            }

            public void onComplete() {
                this.f53566a.m63601a();
            }
        }

        MergeWithObserver(Observer<? super T> observer) {
            this.f53567a = observer;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f53568b, disposable);
        }

        public void onNext(T t) {
            C15738e.m58978a(this.f53567a, (Object) t, (AtomicInteger) this, this.f53570d);
        }

        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f53568b);
            C15738e.m58979a(this.f53567a, th, (AtomicInteger) this, this.f53570d);
        }

        public void onComplete() {
            this.f53571e = true;
            if (this.f53572f) {
                C15738e.m58980a(this.f53567a, (AtomicInteger) this, this.f53570d);
            }
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) this.f53568b.get());
        }

        public void dispose() {
            DisposableHelper.dispose(this.f53568b);
            DisposableHelper.dispose(this.f53569c);
        }

        /* renamed from: a */
        void m63602a(Throwable th) {
            DisposableHelper.dispose(this.f53568b);
            C15738e.m58979a(this.f53567a, th, (AtomicInteger) this, this.f53570d);
        }

        /* renamed from: a */
        void m63601a() {
            this.f53572f = true;
            if (this.f53571e) {
                C15738e.m58980a(this.f53567a, (AtomicInteger) this, this.f53570d);
            }
        }
    }

    public ObservableMergeWithCompletable(C3959e<T> c3959e, CompletableSource completableSource) {
        super(c3959e);
        this.f58946b = completableSource;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.onSubscribe(mergeWithObserver);
        this.a.subscribe(mergeWithObserver);
        this.f58946b.subscribe(mergeWithObserver.f53569c);
    }
}
