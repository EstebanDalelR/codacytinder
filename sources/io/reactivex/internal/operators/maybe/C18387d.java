package io.reactivex.internal.operators.maybe;

import io.reactivex.C3958c;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.maybe.d */
public final class C18387d<T> extends C3958c<T> {
    /* renamed from: a */
    final SingleSource<T> f57156a;
    /* renamed from: b */
    final Predicate<? super T> f57157b;

    /* renamed from: io.reactivex.internal.operators.maybe.d$a */
    static final class C17419a<T> implements SingleObserver<T>, Disposable {
        /* renamed from: a */
        final MaybeObserver<? super T> f53286a;
        /* renamed from: b */
        final Predicate<? super T> f53287b;
        /* renamed from: c */
        Disposable f53288c;

        C17419a(MaybeObserver<? super T> maybeObserver, Predicate<? super T> predicate) {
            this.f53286a = maybeObserver;
            this.f53287b = predicate;
        }

        public void dispose() {
            Disposable disposable = this.f53288c;
            this.f53288c = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f53288c.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53288c, disposable)) {
                this.f53288c = disposable;
                this.f53286a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                if (this.f53287b.test(t)) {
                    this.f53286a.onSuccess(t);
                } else {
                    this.f53286a.onComplete();
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f53286a.onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f53286a.onError(th);
        }
    }

    public C18387d(SingleSource<T> singleSource, Predicate<? super T> predicate) {
        this.f57156a = singleSource;
        this.f57157b = predicate;
    }

    /* renamed from: a */
    protected void m66485a(MaybeObserver<? super T> maybeObserver) {
        this.f57156a.subscribe(new C17419a(maybeObserver, this.f57157b));
    }
}
