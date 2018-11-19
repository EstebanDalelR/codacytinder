package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.operators.flowable.l */
public final class C18374l<T> extends C3957b<T> {
    /* renamed from: a */
    private final C3959e<T> f57117a;

    /* renamed from: io.reactivex.internal.operators.flowable.l$a */
    static class C17412a<T> implements Observer<T>, Subscription {
        /* renamed from: a */
        private final Subscriber<? super T> f53246a;
        /* renamed from: b */
        private Disposable f53247b;

        public void request(long j) {
        }

        C17412a(Subscriber<? super T> subscriber) {
            this.f53246a = subscriber;
        }

        public void onComplete() {
            this.f53246a.onComplete();
        }

        public void onError(Throwable th) {
            this.f53246a.onError(th);
        }

        public void onNext(T t) {
            this.f53246a.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            this.f53247b = disposable;
            this.f53246a.onSubscribe(this);
        }

        public void cancel() {
            this.f53247b.dispose();
        }
    }

    public C18374l(C3959e<T> c3959e) {
        this.f57117a = c3959e;
    }

    /* renamed from: a */
    protected void m66472a(Subscriber<? super T> subscriber) {
        this.f57117a.subscribe(new C17412a(subscriber));
    }
}
