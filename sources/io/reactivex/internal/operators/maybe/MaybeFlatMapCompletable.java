package io.reactivex.internal.operators.maybe;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatMapCompletable<T> extends C3956a {
    /* renamed from: a */
    final MaybeSource<T> f57144a;
    /* renamed from: b */
    final Function<? super T, ? extends CompletableSource> f57145b;

    static final class FlatMapCompletableObserver<T> extends AtomicReference<Disposable> implements CompletableObserver, MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = -2177128922851101253L;
        /* renamed from: a */
        final CompletableObserver f53252a;
        /* renamed from: b */
        final Function<? super T, ? extends CompletableSource> f53253b;

        FlatMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function) {
            this.f53252a = completableObserver;
            this.f53253b = function;
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
                CompletableSource completableSource = (CompletableSource) C15684a.m58895a(this.f53253b.apply(t), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    completableSource.subscribe(this);
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f53252a.onError(th);
        }

        public void onComplete() {
            this.f53252a.onComplete();
        }
    }

    public MaybeFlatMapCompletable(MaybeSource<T> maybeSource, Function<? super T, ? extends CompletableSource> function) {
        this.f57144a = maybeSource;
        this.f57145b = function;
    }

    /* renamed from: a */
    protected void m66479a(CompletableObserver completableObserver) {
        Object flatMapCompletableObserver = new FlatMapCompletableObserver(completableObserver, this.f57145b);
        completableObserver.onSubscribe(flatMapCompletableObserver);
        this.f57144a.subscribe(flatMapCompletableObserver);
    }
}
