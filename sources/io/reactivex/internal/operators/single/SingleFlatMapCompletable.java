package io.reactivex.internal.operators.single;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleFlatMapCompletable<T> extends C3956a {
    /* renamed from: a */
    final SingleSource<T> f57314a;
    /* renamed from: b */
    final Function<? super T, ? extends CompletableSource> f57315b;

    static final class FlatMapCompletableObserver<T> extends AtomicReference<Disposable> implements CompletableObserver, SingleObserver<T>, Disposable {
        private static final long serialVersionUID = -2177128922851101253L;
        /* renamed from: a */
        final CompletableObserver f54059a;
        /* renamed from: b */
        final Function<? super T, ? extends CompletableSource> f54060b;

        FlatMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function) {
            this.f54059a = completableObserver;
            this.f54060b = function;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        public void onSuccess(T t) {
            try {
                CompletableSource completableSource = (CompletableSource) C15684a.m58895a(this.f54060b.apply(t), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    completableSource.subscribe(this);
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f54059a.onError(th);
        }

        public void onComplete() {
            this.f54059a.onComplete();
        }
    }

    public SingleFlatMapCompletable(SingleSource<T> singleSource, Function<? super T, ? extends CompletableSource> function) {
        this.f57314a = singleSource;
        this.f57315b = function;
    }

    /* renamed from: a */
    protected void m66533a(CompletableObserver completableObserver) {
        Object flatMapCompletableObserver = new FlatMapCompletableObserver(completableObserver, this.f57315b);
        completableObserver.onSubscribe(flatMapCompletableObserver);
        this.f57314a.subscribe(flatMapCompletableObserver);
    }
}
