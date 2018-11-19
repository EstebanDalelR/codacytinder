package rx.internal.operators;

import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.exceptions.C19410a;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.p498c.C19401c;

/* renamed from: rx.internal.operators.o */
public final class C19886o<T, R> implements OnSubscribe<R> {
    /* renamed from: a */
    final Observable<T> f62280a;
    /* renamed from: b */
    final Func1<? super T, ? extends R> f62281b;

    /* renamed from: rx.internal.operators.o$a */
    static final class C19737a<T, R> extends C19571c<T> {
        /* renamed from: a */
        final C19571c<? super R> f61753a;
        /* renamed from: b */
        final Func1<? super T, ? extends R> f61754b;
        /* renamed from: c */
        boolean f61755c;

        public C19737a(C19571c<? super R> c19571c, Func1<? super T, ? extends R> func1) {
            this.f61753a = c19571c;
            this.f61754b = func1;
        }

        public void onNext(T t) {
            try {
                this.f61753a.onNext(this.f61754b.call(t));
            } catch (Throwable th) {
                C19410a.m69874b(th);
                unsubscribe();
                onError(OnErrorThrowable.m69866a(th, t));
            }
        }

        public void onError(Throwable th) {
            if (this.f61755c) {
                C19401c.m69811a(th);
                return;
            }
            this.f61755c = true;
            this.f61753a.onError(th);
        }

        public void onCompleted() {
            if (!this.f61755c) {
                this.f61753a.onCompleted();
            }
        }

        public void setProducer(Producer producer) {
            this.f61753a.setProducer(producer);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71613a((C19571c) obj);
    }

    public C19886o(Observable<T> observable, Func1<? super T, ? extends R> func1) {
        this.f62280a = observable;
        this.f62281b = func1;
    }

    /* renamed from: a */
    public void m71613a(C19571c<? super R> c19571c) {
        C19571c c19737a = new C19737a(c19571c, this.f62281b);
        c19571c.add(c19737a);
        this.f62280a.m69661a(c19737a);
    }
}
