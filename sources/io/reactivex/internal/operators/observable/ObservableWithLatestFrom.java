package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.observers.C17530d;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableWithLatestFrom<T, U, R> extends C18394a<T, R> {
    /* renamed from: b */
    final BiFunction<? super T, ? super U, ? extends R> f59015b;
    /* renamed from: c */
    final ObservableSource<? extends U> f59016c;

    static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements Observer<T>, Disposable {
        private static final long serialVersionUID = -312246233408980075L;
        /* renamed from: a */
        final Observer<? super R> f53820a;
        /* renamed from: b */
        final BiFunction<? super T, ? super U, ? extends R> f53821b;
        /* renamed from: c */
        final AtomicReference<Disposable> f53822c = new AtomicReference();
        /* renamed from: d */
        final AtomicReference<Disposable> f53823d = new AtomicReference();

        WithLatestFromObserver(Observer<? super R> observer, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.f53820a = observer;
            this.f53821b = biFunction;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f53822c, disposable);
        }

        public void onNext(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    this.f53820a.onNext(C15684a.m58895a(this.f53821b.apply(t, obj), "The combiner returned a null value"));
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    dispose();
                    this.f53820a.onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f53823d);
            this.f53820a.onError(th);
        }

        public void onComplete() {
            DisposableHelper.dispose(this.f53823d);
            this.f53820a.onComplete();
        }

        public void dispose() {
            DisposableHelper.dispose(this.f53822c);
            DisposableHelper.dispose(this.f53823d);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) this.f53822c.get());
        }

        /* renamed from: a */
        public boolean m63691a(Disposable disposable) {
            return DisposableHelper.setOnce(this.f53823d, disposable);
        }

        /* renamed from: a */
        public void m63690a(Throwable th) {
            DisposableHelper.dispose(this.f53822c);
            this.f53820a.onError(th);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWithLatestFrom$a */
    final class C17453a implements Observer<U> {
        /* renamed from: a */
        final /* synthetic */ ObservableWithLatestFrom f53824a;
        /* renamed from: b */
        private final WithLatestFromObserver<T, U, R> f53825b;

        public void onComplete() {
        }

        C17453a(ObservableWithLatestFrom observableWithLatestFrom, WithLatestFromObserver<T, U, R> withLatestFromObserver) {
            this.f53824a = observableWithLatestFrom;
            this.f53825b = withLatestFromObserver;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53825b.m63691a(disposable);
        }

        public void onNext(U u) {
            this.f53825b.lazySet(u);
        }

        public void onError(Throwable th) {
            this.f53825b.m63690a(th);
        }
    }

    public ObservableWithLatestFrom(ObservableSource<T> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.f59015b = biFunction;
        this.f59016c = observableSource2;
    }

    public void subscribeActual(Observer<? super R> observer) {
        Object c17530d = new C17530d(observer);
        observer = new WithLatestFromObserver(c17530d, this.f59015b);
        c17530d.onSubscribe(observer);
        this.f59016c.subscribe(new C17453a(this, observer));
        this.a.subscribe(observer);
    }
}
