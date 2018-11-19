package hu.akarnokd.rxjava.interop;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import rx.Completable$OnSubscribe;
import rx.CompletableSubscriber;
import rx.Subscription;

/* renamed from: hu.akarnokd.rxjava.interop.b */
final class C19174b implements Completable$OnSubscribe {
    /* renamed from: a */
    final CompletableSource f59430a;

    /* renamed from: hu.akarnokd.rxjava.interop.b$a */
    static final class C17298a implements CompletableObserver, Subscription {
        /* renamed from: a */
        final CompletableSubscriber f52965a;
        /* renamed from: b */
        Disposable f52966b;

        C17298a(CompletableSubscriber completableSubscriber) {
            this.f52965a = completableSubscriber;
        }

        public void onSubscribe(Disposable disposable) {
            this.f52966b = disposable;
            this.f52965a.onSubscribe(this);
        }

        public void onComplete() {
            this.f52965a.onCompleted();
        }

        public void onError(Throwable th) {
            this.f52965a.onError(th);
        }

        public void unsubscribe() {
            this.f52966b.dispose();
        }

        public boolean isUnsubscribed() {
            return this.f52966b.isDisposed();
        }
    }

    public /* synthetic */ void call(Object obj) {
        m68176a((CompletableSubscriber) obj);
    }

    C19174b(CompletableSource completableSource) {
        this.f59430a = completableSource;
    }

    /* renamed from: a */
    public void m68176a(CompletableSubscriber completableSubscriber) {
        this.f59430a.subscribe(new C17298a(completableSubscriber));
    }
}
