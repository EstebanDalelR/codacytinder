package hu.akarnokd.rxjava.interop;

import io.reactivex.C3957b;
import io.reactivex.p079d.C2667a;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import rx.C19571c;
import rx.Observable;

/* renamed from: hu.akarnokd.rxjava.interop.c */
final class C18323c<T> extends C3957b<T> {
    /* renamed from: a */
    final Observable<T> f56789a;

    /* renamed from: hu.akarnokd.rxjava.interop.c$b */
    static final class C17299b implements Subscription {
        /* renamed from: a */
        final C18322a<?> f52967a;

        C17299b(C18322a<?> c18322a) {
            this.f52967a = c18322a;
        }

        public void request(long j) {
            this.f52967a.m66339a(j);
        }

        public void cancel() {
            this.f52967a.unsubscribe();
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.c$a */
    static final class C18322a<T> extends C19571c<T> {
        /* renamed from: a */
        final Subscriber<? super T> f56787a;
        /* renamed from: b */
        boolean f56788b;

        C18322a(Subscriber<? super T> subscriber) {
            this.f56787a = subscriber;
            request(0);
        }

        public void onNext(T t) {
            if (!this.f56788b) {
                if (t == null) {
                    unsubscribe();
                    onError(new NullPointerException("The upstream 1.x Observable signalled a null value which is not supported in 2.x"));
                } else {
                    this.f56787a.onNext(t);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f56788b) {
                C2667a.a(th);
                return;
            }
            this.f56788b = true;
            this.f56787a.onError(th);
            unsubscribe();
        }

        public void onCompleted() {
            if (!this.f56788b) {
                this.f56788b = true;
                this.f56787a.onComplete();
                unsubscribe();
            }
        }

        /* renamed from: a */
        void m66339a(long j) {
            request(j);
        }
    }

    C18323c(Observable<T> observable) {
        this.f56789a = observable;
    }

    /* renamed from: a */
    protected void m66340a(Subscriber<? super T> subscriber) {
        C19571c c18322a = new C18322a(subscriber);
        subscriber.onSubscribe(new C17299b(c18322a));
        this.f56789a.a(c18322a);
    }
}
