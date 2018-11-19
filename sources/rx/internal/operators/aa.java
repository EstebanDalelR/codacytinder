package rx.internal.operators;

import rx.C19571c;
import rx.Observable.Operator;
import rx.Observer;
import rx.Producer;
import rx.exceptions.C19410a;
import rx.functions.Func1;
import rx.internal.producers.SingleDelayedProducer;
import rx.p498c.C19401c;

public final class aa<T> implements Operator<Boolean, T> {
    /* renamed from: a */
    final Func1<? super T, Boolean> f61980a;
    /* renamed from: b */
    final boolean f61981b;

    public /* synthetic */ Object call(Object obj) {
        return m71428a((C19571c) obj);
    }

    public aa(Func1<? super T, Boolean> func1, boolean z) {
        this.f61980a = func1;
        this.f61981b = z;
    }

    /* renamed from: a */
    public C19571c<? super T> m71428a(final C19571c<? super Boolean> c19571c) {
        final Producer singleDelayedProducer = new SingleDelayedProducer(c19571c);
        Object c196841 = new C19571c<T>(this) {
            /* renamed from: a */
            boolean f61559a;
            /* renamed from: b */
            boolean f61560b;
            /* renamed from: e */
            final /* synthetic */ aa f61563e;

            public void onNext(T t) {
                if (!this.f61560b) {
                    this.f61559a = true;
                    try {
                        if (((Boolean) this.f61563e.f61980a.call(t)).booleanValue()) {
                            this.f61560b = true;
                            singleDelayedProducer.m70604a(Boolean.valueOf(true ^ this.f61563e.f61981b));
                            unsubscribe();
                        }
                    } catch (Throwable th) {
                        C19410a.m69870a(th, (Observer) this, (Object) t);
                    }
                }
            }

            public void onError(Throwable th) {
                if (this.f61560b) {
                    C19401c.m69811a(th);
                    return;
                }
                this.f61560b = true;
                c19571c.onError(th);
            }

            public void onCompleted() {
                if (!this.f61560b) {
                    this.f61560b = true;
                    if (this.f61559a) {
                        singleDelayedProducer.m70604a(Boolean.valueOf(false));
                    } else {
                        singleDelayedProducer.m70604a(Boolean.valueOf(this.f61563e.f61981b));
                    }
                }
            }
        };
        c19571c.add(c196841);
        c19571c.setProducer(singleDelayedProducer);
        return c196841;
    }
}
