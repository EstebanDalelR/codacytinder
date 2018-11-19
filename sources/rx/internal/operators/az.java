package rx.internal.operators;

import rx.C19571c;
import rx.Observable.Operator;
import rx.Producer;
import rx.exceptions.C19410a;
import rx.functions.Func1;

public final class az<T> implements Operator<T, T> {
    /* renamed from: a */
    final Func1<? super T, Boolean> f62047a;

    /* renamed from: rx.internal.operators.az$a */
    final class C19711a extends C19571c<T> {
        /* renamed from: a */
        final /* synthetic */ az f61668a;
        /* renamed from: b */
        private final C19571c<? super T> f61669b;
        /* renamed from: c */
        private boolean f61670c;

        C19711a(az azVar, C19571c<? super T> c19571c) {
            this.f61668a = azVar;
            this.f61669b = c19571c;
        }

        public void onNext(T t) {
            this.f61669b.onNext(t);
            try {
                if (((Boolean) this.f61668a.f62047a.call(t)).booleanValue()) {
                    this.f61670c = true;
                    this.f61669b.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.f61670c = true;
                C19410a.m69870a(th, this.f61669b, (Object) t);
                unsubscribe();
            }
        }

        public void onCompleted() {
            if (!this.f61670c) {
                this.f61669b.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (!this.f61670c) {
                this.f61669b.onError(th);
            }
        }

        /* renamed from: a */
        void m70976a(long j) {
            request(j);
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71467a((C19571c) obj);
    }

    public az(Func1<? super T, Boolean> func1) {
        this.f62047a = func1;
    }

    /* renamed from: a */
    public C19571c<? super T> m71467a(C19571c<? super T> c19571c) {
        final C19571c<? super T> c19711a = new C19711a(this, c19571c);
        c19571c.add(c19711a);
        c19571c.setProducer(new Producer(this) {
            /* renamed from: b */
            final /* synthetic */ az f61205b;

            public void request(long j) {
                c19711a.m70976a(j);
            }
        });
        return c19711a;
    }
}
