package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.Observable.Operator;
import rx.Observer;
import rx.Producer;
import rx.exceptions.C19410a;
import rx.functions.Action1;
import rx.p498c.C19401c;

public class an<T> implements Operator<T, T> {
    /* renamed from: a */
    final Action1<? super T> f62017a;

    /* renamed from: rx.internal.operators.an$a */
    static final class C19427a {
        /* renamed from: a */
        static final an<Object> f60620a = new an();
    }

    public /* synthetic */ Object call(Object obj) {
        return m71452a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> an<T> m71451a() {
        return C19427a.f60620a;
    }

    an() {
        this(null);
    }

    public an(Action1<? super T> action1) {
        this.f62017a = action1;
    }

    /* renamed from: a */
    public C19571c<? super T> m71452a(final C19571c<? super T> c19571c) {
        final AtomicLong atomicLong = new AtomicLong();
        c19571c.setProducer(new Producer(this) {
            /* renamed from: b */
            final /* synthetic */ an f61188b;

            public void request(long j) {
                C19419a.m69900a(atomicLong, j);
            }
        });
        return new C19571c<T>(this, c19571c) {
            /* renamed from: a */
            boolean f61598a;
            /* renamed from: d */
            final /* synthetic */ an f61601d;

            public void onStart() {
                request(Format.OFFSET_SAMPLE_RELATIVE);
            }

            public void onCompleted() {
                if (!this.f61598a) {
                    this.f61598a = true;
                    c19571c.onCompleted();
                }
            }

            public void onError(Throwable th) {
                if (this.f61598a) {
                    C19401c.m69811a(th);
                    return;
                }
                this.f61598a = true;
                c19571c.onError(th);
            }

            public void onNext(T t) {
                if (!this.f61598a) {
                    if (atomicLong.get() > 0) {
                        c19571c.onNext(t);
                        atomicLong.decrementAndGet();
                    } else if (this.f61601d.f62017a != null) {
                        try {
                            this.f61601d.f62017a.call(t);
                        } catch (Throwable th) {
                            C19410a.m69870a(th, (Observer) this, (Object) t);
                        }
                    }
                }
            }
        };
    }
}
