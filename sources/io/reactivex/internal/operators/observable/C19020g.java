package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.operators.observable.g */
public final class C19020g<T> extends C18394a<T, Boolean> {
    /* renamed from: b */
    final Predicate<? super T> f59063b;

    /* renamed from: io.reactivex.internal.operators.observable.g$a */
    static final class C17491a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super Boolean> f53995a;
        /* renamed from: b */
        final Predicate<? super T> f53996b;
        /* renamed from: c */
        Disposable f53997c;
        /* renamed from: d */
        boolean f53998d;

        C17491a(Observer<? super Boolean> observer, Predicate<? super T> predicate) {
            this.f53995a = observer;
            this.f53996b = predicate;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53997c, disposable)) {
                this.f53997c = disposable;
                this.f53995a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f53998d) {
                try {
                    if (this.f53996b.test(t) != null) {
                        this.f53998d = true;
                        this.f53997c.dispose();
                        this.f53995a.onNext(Boolean.valueOf(true));
                        this.f53995a.onComplete();
                    }
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53997c.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53998d) {
                C2667a.a(th);
                return;
            }
            this.f53998d = true;
            this.f53995a.onError(th);
        }

        public void onComplete() {
            if (!this.f53998d) {
                this.f53998d = true;
                this.f53995a.onNext(Boolean.valueOf(false));
                this.f53995a.onComplete();
            }
        }

        public void dispose() {
            this.f53997c.dispose();
        }

        public boolean isDisposed() {
            return this.f53997c.isDisposed();
        }
    }

    public C19020g(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f59063b = predicate;
    }

    protected void subscribeActual(Observer<? super Boolean> observer) {
        this.a.subscribe(new C17491a(observer, this.f59063b));
    }
}
