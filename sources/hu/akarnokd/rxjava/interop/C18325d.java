package hu.akarnokd.rxjava.interop;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.p079d.C2667a;
import rx.C19571c;
import rx.Observable;

/* renamed from: hu.akarnokd.rxjava.interop.d */
final class C18325d<T> extends C3959e<T> {
    /* renamed from: a */
    final Observable<T> f56792a;

    /* renamed from: hu.akarnokd.rxjava.interop.d$a */
    static final class C18324a<T> extends C19571c<T> implements Disposable {
        /* renamed from: a */
        final Observer<? super T> f56790a;
        /* renamed from: b */
        boolean f56791b;

        C18324a(Observer<? super T> observer) {
            this.f56790a = observer;
        }

        public void onNext(T t) {
            if (!this.f56791b) {
                if (t == null) {
                    unsubscribe();
                    onError(new NullPointerException("The upstream 1.x Observable signalled a null value which is not supported in 2.x"));
                } else {
                    this.f56790a.onNext(t);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f56791b) {
                C2667a.a(th);
                return;
            }
            this.f56791b = true;
            this.f56790a.onError(th);
            unsubscribe();
        }

        public void onCompleted() {
            if (!this.f56791b) {
                this.f56791b = true;
                this.f56790a.onComplete();
                unsubscribe();
            }
        }

        public void dispose() {
            unsubscribe();
        }

        public boolean isDisposed() {
            return isUnsubscribed();
        }
    }

    C18325d(Observable<T> observable) {
        this.f56792a = observable;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        Object c18324a = new C18324a(observer);
        observer.onSubscribe(c18324a);
        this.f56792a.a(c18324a);
    }
}
