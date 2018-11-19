package rx.internal.operators;

import rx.C19571c;
import rx.Observable.Operator;
import rx.Producer;
import rx.exceptions.C19410a;
import rx.exceptions.OnErrorThrowable;
import rx.p498c.C19401c;

public class ac<T, R> implements Operator<R, T> {
    /* renamed from: a */
    final Class<R> f61982a;

    /* renamed from: rx.internal.operators.ac$a */
    static final class C19685a<T, R> extends C19571c<T> {
        /* renamed from: a */
        final C19571c<? super R> f61564a;
        /* renamed from: b */
        final Class<R> f61565b;
        /* renamed from: c */
        boolean f61566c;

        public C19685a(C19571c<? super R> c19571c, Class<R> cls) {
            this.f61564a = c19571c;
            this.f61565b = cls;
        }

        public void onNext(T t) {
            try {
                this.f61564a.onNext(this.f61565b.cast(t));
            } catch (Throwable th) {
                C19410a.m69874b(th);
                unsubscribe();
                onError(OnErrorThrowable.m69866a(th, t));
            }
        }

        public void onError(Throwable th) {
            if (this.f61566c) {
                C19401c.m69811a(th);
                return;
            }
            this.f61566c = true;
            this.f61564a.onError(th);
        }

        public void onCompleted() {
            if (!this.f61566c) {
                this.f61564a.onCompleted();
            }
        }

        public void setProducer(Producer producer) {
            this.f61564a.setProducer(producer);
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71431a((C19571c) obj);
    }

    public ac(Class<R> cls) {
        this.f61982a = cls;
    }

    /* renamed from: a */
    public C19571c<? super T> m71431a(C19571c<? super R> c19571c) {
        Object c19685a = new C19685a(c19571c, this.f61982a);
        c19571c.add(c19685a);
        return c19685a;
    }
}
