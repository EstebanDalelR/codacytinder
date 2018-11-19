package hu.akarnokd.rxjava.interop;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import rx.C19566b;
import rx.Single;

/* renamed from: hu.akarnokd.rxjava.interop.f */
final class C18327f<T> extends C3960g<T> {
    /* renamed from: a */
    final Single<T> f56794a;

    /* renamed from: hu.akarnokd.rxjava.interop.f$a */
    static final class C18326a<T> extends C19566b<T> implements Disposable {
        /* renamed from: a */
        final SingleObserver<? super T> f56793a;

        C18326a(SingleObserver<? super T> singleObserver) {
            this.f56793a = singleObserver;
        }

        /* renamed from: a */
        public void m66341a(T t) {
            if (t == null) {
                this.f56793a.onError(new NullPointerException("The upstream 1.x Single signalled a null value which is not supported in 2.x"));
            } else {
                this.f56793a.onSuccess(t);
            }
        }

        public void onError(Throwable th) {
            this.f56793a.onError(th);
        }

        public void dispose() {
            unsubscribe();
        }

        public boolean isDisposed() {
            return isUnsubscribed();
        }
    }

    C18327f(Single<T> single) {
        this.f56794a = single;
    }

    /* renamed from: a */
    protected void m66342a(SingleObserver<? super T> singleObserver) {
        Object c18326a = new C18326a(singleObserver);
        singleObserver.onSubscribe(c18326a);
        this.f56794a.a(c18326a);
    }
}
