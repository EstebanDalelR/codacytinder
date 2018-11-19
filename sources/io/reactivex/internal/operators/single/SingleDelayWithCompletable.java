package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.C17395n;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleDelayWithCompletable<T> extends C3960g<T> {
    /* renamed from: a */
    final SingleSource<T> f57306a;
    /* renamed from: b */
    final CompletableSource f57307b;

    static final class OtherObserver<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        private static final long serialVersionUID = -8565274649390031272L;
        /* renamed from: a */
        final SingleObserver<? super T> f54048a;
        /* renamed from: b */
        final SingleSource<T> f54049b;

        OtherObserver(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f54048a = singleObserver;
            this.f54049b = singleSource;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null) {
                this.f54048a.onSubscribe(this);
            }
        }

        public void onError(Throwable th) {
            this.f54048a.onError(th);
        }

        public void onComplete() {
            this.f54049b.subscribe(new C17395n(this, this.f54048a));
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }
    }

    public SingleDelayWithCompletable(SingleSource<T> singleSource, CompletableSource completableSource) {
        this.f57306a = singleSource;
        this.f57307b = completableSource;
    }

    /* renamed from: a */
    protected void m66529a(SingleObserver<? super T> singleObserver) {
        this.f57307b.subscribe(new OtherObserver(singleObserver, this.f57306a));
    }
}
