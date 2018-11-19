package io.reactivex.internal.operators.single;

import io.reactivex.C15679f;
import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleSubscribeOn<T> extends C3960g<T> {
    /* renamed from: a */
    final SingleSource<? extends T> f57320a;
    /* renamed from: b */
    final C15679f f57321b;

    static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        /* renamed from: a */
        final SingleObserver<? super T> f54067a;
        /* renamed from: b */
        final SequentialDisposable f54068b = new SequentialDisposable();
        /* renamed from: c */
        final SingleSource<? extends T> f54069c;

        SubscribeOnObserver(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource) {
            this.f54067a = singleObserver;
            this.f54069c = singleSource;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(T t) {
            this.f54067a.onSuccess(t);
        }

        public void onError(Throwable th) {
            this.f54067a.onError(th);
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            this.f54068b.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void run() {
            this.f54069c.subscribe(this);
        }
    }

    public SingleSubscribeOn(SingleSource<? extends T> singleSource, C15679f c15679f) {
        this.f57320a = singleSource;
        this.f57321b = c15679f;
    }

    /* renamed from: a */
    protected void m66536a(SingleObserver<? super T> singleObserver) {
        Runnable subscribeOnObserver = new SubscribeOnObserver(singleObserver, this.f57320a);
        singleObserver.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.f54068b.m63458b(this.f57321b.mo12918a(subscribeOnObserver));
    }
}
