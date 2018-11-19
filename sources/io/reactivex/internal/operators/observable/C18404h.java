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

/* renamed from: io.reactivex.internal.operators.observable.h */
public final class C18404h<T> extends C3960g<Boolean> implements FuseToObservable<Boolean> {
    /* renamed from: a */
    final ObservableSource<T> f57289a;
    /* renamed from: b */
    final Predicate<? super T> f57290b;

    /* renamed from: io.reactivex.internal.operators.observable.h$a */
    static final class C17492a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super Boolean> f53999a;
        /* renamed from: b */
        final Predicate<? super T> f54000b;
        /* renamed from: c */
        Disposable f54001c;
        /* renamed from: d */
        boolean f54002d;

        C17492a(SingleObserver<? super Boolean> singleObserver, Predicate<? super T> predicate) {
            this.f53999a = singleObserver;
            this.f54000b = predicate;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54001c, disposable)) {
                this.f54001c = disposable;
                this.f53999a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f54002d) {
                try {
                    if (this.f54000b.test(t) != null) {
                        this.f54002d = true;
                        this.f54001c.dispose();
                        this.f53999a.onSuccess(Boolean.valueOf(true));
                    }
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f54001c.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f54002d) {
                C2667a.a(th);
                return;
            }
            this.f54002d = true;
            this.f53999a.onError(th);
        }

        public void onComplete() {
            if (!this.f54002d) {
                this.f54002d = true;
                this.f53999a.onSuccess(Boolean.valueOf(false));
            }
        }

        public void dispose() {
            this.f54001c.dispose();
        }

        public boolean isDisposed() {
            return this.f54001c.isDisposed();
        }
    }

    public C18404h(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        this.f57289a = observableSource;
        this.f57290b = predicate;
    }

    /* renamed from: a */
    protected void m66525a(SingleObserver<? super Boolean> singleObserver) {
        this.f57289a.subscribe(new C17492a(singleObserver, this.f57290b));
    }

    public C3959e<Boolean> fuseToObservable() {
        return C2667a.a(new C19020g(this.f57289a, this.f57290b));
    }
}
