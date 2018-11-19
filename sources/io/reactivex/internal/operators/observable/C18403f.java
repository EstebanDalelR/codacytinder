package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.operators.observable.f */
public final class C18403f<T> extends C3960g<Boolean> implements FuseToObservable<Boolean> {
    /* renamed from: a */
    final ObservableSource<T> f57287a;
    /* renamed from: b */
    final Predicate<? super T> f57288b;

    /* renamed from: io.reactivex.internal.operators.observable.f$a */
    static final class C17490a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super Boolean> f53991a;
        /* renamed from: b */
        final Predicate<? super T> f53992b;
        /* renamed from: c */
        Disposable f53993c;
        /* renamed from: d */
        boolean f53994d;

        C17490a(SingleObserver<? super Boolean> singleObserver, Predicate<? super T> predicate) {
            this.f53991a = singleObserver;
            this.f53992b = predicate;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53993c, disposable)) {
                this.f53993c = disposable;
                this.f53991a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f53994d) {
                try {
                    if (this.f53992b.test(t) == null) {
                        this.f53994d = true;
                        this.f53993c.dispose();
                        this.f53991a.onSuccess(Boolean.valueOf(false));
                    }
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53993c.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53994d) {
                C2667a.a(th);
                return;
            }
            this.f53994d = true;
            this.f53991a.onError(th);
        }

        public void onComplete() {
            if (!this.f53994d) {
                this.f53994d = true;
                this.f53991a.onSuccess(Boolean.valueOf(true));
            }
        }

        public void dispose() {
            this.f53993c.dispose();
        }

        public boolean isDisposed() {
            return this.f53993c.isDisposed();
        }
    }

    public C18403f(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        this.f57287a = observableSource;
        this.f57288b = predicate;
    }

    /* renamed from: a */
    protected void m66524a(SingleObserver<? super Boolean> singleObserver) {
        this.f57287a.subscribe(new C17490a(singleObserver, this.f57288b));
    }

    public C3959e<Boolean> fuseToObservable() {
        return C2667a.a(new C19019e(this.f57287a, this.f57288b));
    }
}
