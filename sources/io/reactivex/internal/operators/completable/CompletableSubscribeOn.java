package io.reactivex.internal.operators.completable;

import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableSubscribeOn extends C3956a {
    /* renamed from: a */
    final CompletableSource f56812a;
    /* renamed from: b */
    final C15679f f56813b;

    static final class SubscribeOnObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        /* renamed from: a */
        final CompletableObserver f53189a;
        /* renamed from: b */
        final SequentialDisposable f53190b = new SequentialDisposable();
        /* renamed from: c */
        final CompletableSource f53191c;

        SubscribeOnObserver(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.f53189a = completableObserver;
            this.f53191c = completableSource;
        }

        public void run() {
            this.f53191c.subscribe(this);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onError(Throwable th) {
            this.f53189a.onError(th);
        }

        public void onComplete() {
            this.f53189a.onComplete();
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            this.f53190b.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }
    }

    public CompletableSubscribeOn(CompletableSource completableSource, C15679f c15679f) {
        this.f56812a = completableSource;
        this.f56813b = c15679f;
    }

    /* renamed from: a */
    protected void m66387a(CompletableObserver completableObserver) {
        Runnable subscribeOnObserver = new SubscribeOnObserver(completableObserver, this.f56812a);
        completableObserver.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.f53190b.m63458b(this.f56813b.mo12918a(subscribeOnObserver));
    }
}
