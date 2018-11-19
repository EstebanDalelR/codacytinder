package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.C19571c;
import rx.C2671a;
import rx.Observable.Operator;
import rx.functions.Action0;

public final class ae<T> implements Operator<T, T> {
    /* renamed from: a */
    final long f61993a;
    /* renamed from: b */
    final TimeUnit f61994b;
    /* renamed from: c */
    final C2671a f61995c;

    public /* synthetic */ Object call(Object obj) {
        return m71433a((C19571c) obj);
    }

    public ae(long j, TimeUnit timeUnit, C2671a c2671a) {
        this.f61993a = j;
        this.f61994b = timeUnit;
        this.f61995c = c2671a;
    }

    /* renamed from: a */
    public C19571c<? super T> m71433a(final C19571c<? super T> c19571c) {
        final Object createWorker = this.f61995c.createWorker();
        c19571c.add(createWorker);
        return new C19571c<T>(this, c19571c) {
            /* renamed from: a */
            boolean f61573a;
            /* renamed from: d */
            final /* synthetic */ ae f61576d;

            /* renamed from: rx.internal.operators.ae$1$1 */
            class C198201 implements Action0 {
                /* renamed from: a */
                final /* synthetic */ C196871 f61988a;

                C198201(C196871 c196871) {
                    this.f61988a = c196871;
                }

                public void call() {
                    if (!this.f61988a.f61573a) {
                        this.f61988a.f61573a = true;
                        c19571c.onCompleted();
                    }
                }
            }

            public void onCompleted() {
                createWorker.mo14741a(new C198201(this), this.f61576d.f61993a, this.f61576d.f61994b);
            }

            public void onError(final Throwable th) {
                createWorker.mo14740a(new Action0(this) {
                    /* renamed from: b */
                    final /* synthetic */ C196871 f61990b;

                    public void call() {
                        if (!this.f61990b.f61573a) {
                            this.f61990b.f61573a = true;
                            c19571c.onError(th);
                            createWorker.unsubscribe();
                        }
                    }
                });
            }

            public void onNext(final T t) {
                createWorker.mo14741a(new Action0(this) {
                    /* renamed from: b */
                    final /* synthetic */ C196871 f61992b;

                    public void call() {
                        if (!this.f61992b.f61573a) {
                            c19571c.onNext(t);
                        }
                    }
                }, this.f61576d.f61993a, this.f61576d.f61994b);
            }
        };
    }
}
