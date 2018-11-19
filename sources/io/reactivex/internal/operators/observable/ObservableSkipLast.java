package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

public final class ObservableSkipLast<T> extends C18394a<T, T> {
    /* renamed from: b */
    final int f58982b;

    static final class SkipLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {
        private static final long serialVersionUID = -3807491841935125653L;
        /* renamed from: a */
        final Observer<? super T> f53708a;
        /* renamed from: b */
        final int f53709b;
        /* renamed from: c */
        Disposable f53710c;

        SkipLastObserver(Observer<? super T> observer, int i) {
            super(i);
            this.f53708a = observer;
            this.f53709b = i;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53710c, disposable)) {
                this.f53710c = disposable;
                this.f53708a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53710c.dispose();
        }

        public boolean isDisposed() {
            return this.f53710c.isDisposed();
        }

        public void onNext(T t) {
            if (this.f53709b == size()) {
                this.f53708a.onNext(poll());
            }
            offer(t);
        }

        public void onError(Throwable th) {
            this.f53708a.onError(th);
        }

        public void onComplete() {
            this.f53708a.onComplete();
        }
    }

    public ObservableSkipLast(ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.f58982b = i;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new SkipLastObserver(observer, this.f58982b));
    }
}
