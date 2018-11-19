package rx.internal.operators;

import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.exceptions.C19410a;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.p498c.C19401c;

/* renamed from: rx.internal.operators.l */
public final class C19883l<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Observable<T> f62275a;
    /* renamed from: b */
    final Func1<? super T, Boolean> f62276b;

    /* renamed from: rx.internal.operators.l$a */
    static final class C19736a<T> extends C19571c<T> {
        /* renamed from: a */
        final C19571c<? super T> f61750a;
        /* renamed from: b */
        final Func1<? super T, Boolean> f61751b;
        /* renamed from: c */
        boolean f61752c;

        public C19736a(C19571c<? super T> c19571c, Func1<? super T, Boolean> func1) {
            this.f61750a = c19571c;
            this.f61751b = func1;
            request(null);
        }

        public void onNext(T t) {
            try {
                if (((Boolean) this.f61751b.call(t)).booleanValue()) {
                    this.f61750a.onNext(t);
                } else {
                    request(1);
                }
            } catch (Throwable th) {
                C19410a.m69874b(th);
                unsubscribe();
                onError(OnErrorThrowable.m69866a(th, t));
            }
        }

        public void onError(Throwable th) {
            if (this.f61752c) {
                C19401c.m69811a(th);
                return;
            }
            this.f61752c = true;
            this.f61750a.onError(th);
        }

        public void onCompleted() {
            if (!this.f61752c) {
                this.f61750a.onCompleted();
            }
        }

        public void setProducer(Producer producer) {
            super.setProducer(producer);
            this.f61750a.setProducer(producer);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71610a((C19571c) obj);
    }

    public C19883l(Observable<T> observable, Func1<? super T, Boolean> func1) {
        this.f62275a = observable;
        this.f62276b = func1;
    }

    /* renamed from: a */
    public void m71610a(C19571c<? super T> c19571c) {
        C19571c c19736a = new C19736a(c19571c, this.f62276b);
        c19571c.add(c19736a);
        this.f62275a.m69661a(c19736a);
    }
}
