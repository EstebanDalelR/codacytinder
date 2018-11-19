package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;

public final class bb<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Function<? super Throwable, ? extends T> f59034b;

    /* renamed from: io.reactivex.internal.operators.observable.bb$a */
    static final class C17469a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53904a;
        /* renamed from: b */
        final Function<? super Throwable, ? extends T> f53905b;
        /* renamed from: c */
        Disposable f53906c;

        C17469a(Observer<? super T> observer, Function<? super Throwable, ? extends T> function) {
            this.f53904a = observer;
            this.f53905b = function;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53906c, disposable)) {
                this.f53906c = disposable;
                this.f53904a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53906c.dispose();
        }

        public boolean isDisposed() {
            return this.f53906c.isDisposed();
        }

        public void onNext(T t) {
            this.f53904a.onNext(t);
        }

        public void onError(Throwable th) {
            Throwable nullPointerException;
            try {
                Object apply = this.f53905b.apply(th);
                if (apply == null) {
                    nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f53904a.onError(nullPointerException);
                    return;
                }
                this.f53904a.onNext(apply);
                this.f53904a.onComplete();
            } catch (Throwable nullPointerException2) {
                C15678a.m58850b(nullPointerException2);
                this.f53904a.onError(new CompositeException(th, nullPointerException2));
            }
        }

        public void onComplete() {
            this.f53904a.onComplete();
        }
    }

    public bb(ObservableSource<T> observableSource, Function<? super Throwable, ? extends T> function) {
        super(observableSource);
        this.f59034b = function;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17469a(observer, this.f59034b));
    }
}
