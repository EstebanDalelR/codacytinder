package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import java.util.concurrent.Callable;

public final class ax<T, R> extends C18394a<T, ObservableSource<? extends R>> {
    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<? extends R>> f59029b;
    /* renamed from: c */
    final Function<? super Throwable, ? extends ObservableSource<? extends R>> f59030c;
    /* renamed from: d */
    final Callable<? extends ObservableSource<? extends R>> f59031d;

    /* renamed from: io.reactivex.internal.operators.observable.ax$a */
    static final class C17466a<T, R> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super ObservableSource<? extends R>> f53891a;
        /* renamed from: b */
        final Function<? super T, ? extends ObservableSource<? extends R>> f53892b;
        /* renamed from: c */
        final Function<? super Throwable, ? extends ObservableSource<? extends R>> f53893c;
        /* renamed from: d */
        final Callable<? extends ObservableSource<? extends R>> f53894d;
        /* renamed from: e */
        Disposable f53895e;

        C17466a(Observer<? super ObservableSource<? extends R>> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
            this.f53891a = observer;
            this.f53892b = function;
            this.f53893c = function2;
            this.f53894d = callable;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53895e, disposable)) {
                this.f53895e = disposable;
                this.f53891a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53895e.dispose();
        }

        public boolean isDisposed() {
            return this.f53895e.isDisposed();
        }

        public void onNext(T t) {
            try {
                this.f53891a.onNext((ObservableSource) C15684a.m58895a(this.f53892b.apply(t), "The onNext ObservableSource returned is null"));
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f53891a.onError(t2);
            }
        }

        public void onError(Throwable th) {
            try {
                this.f53891a.onNext((ObservableSource) C15684a.m58895a(this.f53893c.apply(th), "The onError ObservableSource returned is null"));
                this.f53891a.onComplete();
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                this.f53891a.onError(new CompositeException(th, th2));
            }
        }

        public void onComplete() {
            try {
                this.f53891a.onNext((ObservableSource) C15684a.m58895a(this.f53894d.call(), "The onComplete ObservableSource returned is null"));
                this.f53891a.onComplete();
            } catch (Throwable th) {
                C15678a.m58850b(th);
                this.f53891a.onError(th);
            }
        }
    }

    public ax(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
        super(observableSource);
        this.f59029b = function;
        this.f59030c = function2;
        this.f59031d = callable;
    }

    public void subscribeActual(Observer<? super ObservableSource<? extends R>> observer) {
        this.a.subscribe(new C17466a(observer, this.f59029b, this.f59030c, this.f59031d));
    }
}
