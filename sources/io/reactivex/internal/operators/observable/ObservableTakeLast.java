package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

public final class ObservableTakeLast<T> extends C18394a<T, T> {
    /* renamed from: b */
    final int f58992b;

    static final class TakeLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {
        private static final long serialVersionUID = 7240042530241604978L;
        /* renamed from: a */
        final Observer<? super T> f53738a;
        /* renamed from: b */
        final int f53739b;
        /* renamed from: c */
        Disposable f53740c;
        /* renamed from: d */
        volatile boolean f53741d;

        TakeLastObserver(Observer<? super T> observer, int i) {
            this.f53738a = observer;
            this.f53739b = i;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53740c, disposable)) {
                this.f53740c = disposable;
                this.f53738a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (this.f53739b == size()) {
                poll();
            }
            offer(t);
        }

        public void onError(Throwable th) {
            this.f53738a.onError(th);
        }

        public void onComplete() {
            Observer observer = this.f53738a;
            while (!this.f53741d) {
                Object poll = poll();
                if (poll == null) {
                    if (!this.f53741d) {
                        observer.onComplete();
                    }
                    return;
                }
                observer.onNext(poll);
            }
        }

        public void dispose() {
            if (!this.f53741d) {
                this.f53741d = true;
                this.f53740c.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f53741d;
        }
    }

    public ObservableTakeLast(ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.f58992b = i;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new TakeLastObserver(observer, this.f58992b));
    }
}
