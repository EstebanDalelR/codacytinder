package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.maybe.c */
public final class C19013c<T> extends C18385a<T, T> {
    /* renamed from: b */
    final Predicate<? super T> f58893b;

    /* renamed from: io.reactivex.internal.operators.maybe.c$a */
    static final class C17418a<T> implements MaybeObserver<T>, Disposable {
        /* renamed from: a */
        final MaybeObserver<? super T> f53283a;
        /* renamed from: b */
        final Predicate<? super T> f53284b;
        /* renamed from: c */
        Disposable f53285c;

        C17418a(MaybeObserver<? super T> maybeObserver, Predicate<? super T> predicate) {
            this.f53283a = maybeObserver;
            this.f53284b = predicate;
        }

        public void dispose() {
            Disposable disposable = this.f53285c;
            this.f53285c = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f53285c.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53285c, disposable)) {
                this.f53285c = disposable;
                this.f53283a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                if (this.f53284b.test(t)) {
                    this.f53283a.onSuccess(t);
                } else {
                    this.f53283a.onComplete();
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f53283a.onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f53283a.onError(th);
        }

        public void onComplete() {
            this.f53283a.onComplete();
        }
    }

    public C19013c(MaybeSource<T> maybeSource, Predicate<? super T> predicate) {
        super(maybeSource);
        this.f58893b = predicate;
    }

    /* renamed from: a */
    protected void m67619a(MaybeObserver<? super T> maybeObserver) {
        this.a.subscribe(new C17418a(maybeObserver, this.f58893b));
    }
}
