package io.reactivex.internal.operators.observable;

import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.p079d.C2667a;

public final class ar<T> extends C3956a implements FuseToObservable<T> {
    /* renamed from: a */
    final ObservableSource<T> f57251a;

    /* renamed from: io.reactivex.internal.operators.observable.ar$a */
    static final class C17463a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final CompletableObserver f53882a;
        /* renamed from: b */
        Disposable f53883b;

        public void onNext(T t) {
        }

        C17463a(CompletableObserver completableObserver) {
            this.f53882a = completableObserver;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53883b = disposable;
            this.f53882a.onSubscribe(this);
        }

        public void onError(Throwable th) {
            this.f53882a.onError(th);
        }

        public void onComplete() {
            this.f53882a.onComplete();
        }

        public void dispose() {
            this.f53883b.dispose();
        }

        public boolean isDisposed() {
            return this.f53883b.isDisposed();
        }
    }

    public ar(ObservableSource<T> observableSource) {
        this.f57251a = observableSource;
    }

    /* renamed from: a */
    public void m66510a(CompletableObserver completableObserver) {
        this.f57251a.subscribe(new C17463a(completableObserver));
    }

    public C3959e<T> fuseToObservable() {
        return C2667a.a(new aq(this.f57251a));
    }
}
