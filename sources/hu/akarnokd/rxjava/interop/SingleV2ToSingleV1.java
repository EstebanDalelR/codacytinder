package hu.akarnokd.rxjava.interop;

import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19566b;
import rx.Single.OnSubscribe;
import rx.Subscription;

final class SingleV2ToSingleV1<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final SingleSource<T> f59429a;

    static final class SourceSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Subscription {
        private static final long serialVersionUID = 4758098209431016997L;
        /* renamed from: a */
        final C19566b<? super T> f52962a;

        SourceSingleObserver(C19566b<? super T> c19566b) {
            this.f52962a = c19566b;
        }

        public void unsubscribe() {
            DisposableHelper.dispose(this);
        }

        public boolean isUnsubscribed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(T t) {
            this.f52962a.a(t);
        }

        public void onError(Throwable th) {
            this.f52962a.onError(th);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m68175a((C19566b) obj);
    }

    SingleV2ToSingleV1(SingleSource<T> singleSource) {
        this.f59429a = singleSource;
    }

    /* renamed from: a */
    public void m68175a(C19566b<? super T> c19566b) {
        Object sourceSingleObserver = new SourceSingleObserver(c19566b);
        c19566b.a(sourceSingleObserver);
        this.f59429a.subscribe(sourceSingleObserver);
    }
}
