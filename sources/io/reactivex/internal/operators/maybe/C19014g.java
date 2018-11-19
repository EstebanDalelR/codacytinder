package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;

/* renamed from: io.reactivex.internal.operators.maybe.g */
public final class C19014g<T, R> extends C18385a<T, R> {
    /* renamed from: b */
    final Function<? super T, ? extends R> f58894b;

    /* renamed from: io.reactivex.internal.operators.maybe.g$a */
    static final class C17420a<T, R> implements MaybeObserver<T>, Disposable {
        /* renamed from: a */
        final MaybeObserver<? super R> f53289a;
        /* renamed from: b */
        final Function<? super T, ? extends R> f53290b;
        /* renamed from: c */
        Disposable f53291c;

        C17420a(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends R> function) {
            this.f53289a = maybeObserver;
            this.f53290b = function;
        }

        public void dispose() {
            Disposable disposable = this.f53291c;
            this.f53291c = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f53291c.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53291c, disposable)) {
                this.f53291c = disposable;
                this.f53289a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                this.f53289a.onSuccess(C15684a.m58895a(this.f53290b.apply(t), "The mapper returned a null item"));
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f53289a.onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f53289a.onError(th);
        }

        public void onComplete() {
            this.f53289a.onComplete();
        }
    }

    public C19014g(MaybeSource<T> maybeSource, Function<? super T, ? extends R> function) {
        super(maybeSource);
        this.f58894b = function;
    }

    /* renamed from: a */
    protected void m67620a(MaybeObserver<? super R> maybeObserver) {
        this.a.subscribe(new C17420a(maybeObserver, this.f58894b));
    }
}
