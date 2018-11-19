package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.observable.m */
public final class C19024m<T, U> extends C18394a<T, U> {
    /* renamed from: b */
    final Callable<? extends U> f59075b;
    /* renamed from: c */
    final BiConsumer<? super U, ? super T> f59076c;

    /* renamed from: io.reactivex.internal.operators.observable.m$a */
    static final class C17493a<T, U> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super U> f54003a;
        /* renamed from: b */
        final BiConsumer<? super U, ? super T> f54004b;
        /* renamed from: c */
        final U f54005c;
        /* renamed from: d */
        Disposable f54006d;
        /* renamed from: e */
        boolean f54007e;

        C17493a(Observer<? super U> observer, U u, BiConsumer<? super U, ? super T> biConsumer) {
            this.f54003a = observer;
            this.f54004b = biConsumer;
            this.f54005c = u;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54006d, disposable)) {
                this.f54006d = disposable;
                this.f54003a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f54006d.dispose();
        }

        public boolean isDisposed() {
            return this.f54006d.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f54007e) {
                try {
                    this.f54004b.accept(this.f54005c, t);
                } catch (T t2) {
                    this.f54006d.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f54007e) {
                C2667a.a(th);
                return;
            }
            this.f54007e = true;
            this.f54003a.onError(th);
        }

        public void onComplete() {
            if (!this.f54007e) {
                this.f54007e = true;
                this.f54003a.onNext(this.f54005c);
                this.f54003a.onComplete();
            }
        }
    }

    public C19024m(ObservableSource<T> observableSource, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        super(observableSource);
        this.f59075b = callable;
        this.f59076c = biConsumer;
    }

    protected void subscribeActual(Observer<? super U> observer) {
        try {
            this.a.subscribe(new C17493a(observer, C15684a.m58895a(this.f59075b.call(), "The initialSupplier returned a null value"), this.f59076c));
        } catch (Throwable th) {
            EmptyDisposable.error(th, (Observer) observer);
        }
    }
}
