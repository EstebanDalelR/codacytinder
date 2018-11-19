package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ObservableUnsubscribeOn<T> extends C18394a<T, T> {
    /* renamed from: b */
    final C15679f f59011b;

    static final class UnsubscribeObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = 1015244841293359600L;
        /* renamed from: a */
        final Observer<? super T> f53795a;
        /* renamed from: b */
        final C15679f f53796b;
        /* renamed from: c */
        Disposable f53797c;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver$a */
        final class C15710a implements Runnable {
            /* renamed from: a */
            final /* synthetic */ UnsubscribeObserver f48591a;

            C15710a(UnsubscribeObserver unsubscribeObserver) {
                this.f48591a = unsubscribeObserver;
            }

            public void run() {
                this.f48591a.f53797c.dispose();
            }
        }

        UnsubscribeObserver(Observer<? super T> observer, C15679f c15679f) {
            this.f53795a = observer;
            this.f53796b = c15679f;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53797c, disposable)) {
                this.f53797c = disposable;
                this.f53795a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!get()) {
                this.f53795a.onNext(t);
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                C2667a.a(th);
            } else {
                this.f53795a.onError(th);
            }
        }

        public void onComplete() {
            if (!get()) {
                this.f53795a.onComplete();
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f53796b.mo12918a(new C15710a(this));
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }

    public ObservableUnsubscribeOn(ObservableSource<T> observableSource, C15679f c15679f) {
        super(observableSource);
        this.f59011b = c15679f;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new UnsubscribeObserver(observer, this.f59011b));
    }
}
