package hu.akarnokd.rxjava.interop;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;

/* renamed from: hu.akarnokd.rxjava.interop.a */
final class C18321a extends C3956a {
    /* renamed from: a */
    final Completable f56786a;

    /* renamed from: hu.akarnokd.rxjava.interop.a$a */
    static final class C17297a implements Disposable, CompletableSubscriber {
        /* renamed from: a */
        final CompletableObserver f52963a;
        /* renamed from: b */
        Subscription f52964b;

        C17297a(CompletableObserver completableObserver) {
            this.f52963a = completableObserver;
        }

        public void onSubscribe(Subscription subscription) {
            this.f52964b = subscription;
            this.f52963a.onSubscribe(this);
        }

        public void onCompleted() {
            this.f52963a.onComplete();
        }

        public void onError(Throwable th) {
            this.f52963a.onError(th);
        }

        public void dispose() {
            this.f52964b.unsubscribe();
        }

        public boolean isDisposed() {
            return this.f52964b.isUnsubscribed();
        }
    }

    C18321a(Completable completable) {
        this.f56786a = completable;
    }

    /* renamed from: a */
    protected void m66338a(CompletableObserver completableObserver) {
        this.f56786a.b(new C17297a(completableObserver));
    }
}
