package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSubscribeOn<T> extends C18394a<T, T> {
    /* renamed from: b */
    final C15679f f58988b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSubscribeOn$a */
    final class C15706a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ObservableSubscribeOn f48585a;
        /* renamed from: b */
        private final SubscribeOnObserver<T> f48586b;

        C15706a(ObservableSubscribeOn observableSubscribeOn, SubscribeOnObserver<T> subscribeOnObserver) {
            this.f48585a = observableSubscribeOn;
            this.f48586b = subscribeOnObserver;
        }

        public void run() {
            this.f48585a.a.subscribe(this.f48586b);
        }
    }

    static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8094547886072529208L;
        /* renamed from: a */
        final Observer<? super T> f53721a;
        /* renamed from: b */
        final AtomicReference<Disposable> f53722b = new AtomicReference();

        SubscribeOnObserver(Observer<? super T> observer) {
            this.f53721a = observer;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f53722b, disposable);
        }

        public void onNext(T t) {
            this.f53721a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f53721a.onError(th);
        }

        public void onComplete() {
            this.f53721a.onComplete();
        }

        public void dispose() {
            DisposableHelper.dispose(this.f53722b);
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        /* renamed from: a */
        void m63675a(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableSubscribeOn(ObservableSource<T> observableSource, C15679f c15679f) {
        super(observableSource);
        this.f58988b = c15679f;
    }

    public void subscribeActual(Observer<? super T> observer) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(observer);
        observer.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.m63675a(this.f58988b.mo12918a(new C15706a(this, subscribeOnObserver)));
    }
}
