package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.C19571c;
import rx.Observable.Operator;
import rx.internal.producers.SingleProducer;
import rx.p498c.C19401c;

public final class at<T> implements Operator<T, T> {
    /* renamed from: a */
    private final boolean f62033a;
    /* renamed from: b */
    private final T f62034b;

    /* renamed from: rx.internal.operators.at$a */
    static final class C19428a {
        /* renamed from: a */
        static final at<?> f60621a = new at();
    }

    /* renamed from: rx.internal.operators.at$b */
    static final class C19704b<T> extends C19571c<T> {
        /* renamed from: a */
        private final C19571c<? super T> f61636a;
        /* renamed from: b */
        private final boolean f61637b;
        /* renamed from: c */
        private final T f61638c;
        /* renamed from: d */
        private T f61639d;
        /* renamed from: e */
        private boolean f61640e;
        /* renamed from: f */
        private boolean f61641f;

        C19704b(C19571c<? super T> c19571c, boolean z, T t) {
            this.f61636a = c19571c;
            this.f61637b = z;
            this.f61638c = t;
            request(2);
        }

        public void onNext(T t) {
            if (!this.f61641f) {
                if (this.f61640e) {
                    this.f61641f = true;
                    this.f61636a.onError(new IllegalArgumentException("Sequence contains too many elements"));
                    unsubscribe();
                    return;
                }
                this.f61639d = t;
                this.f61640e = true;
            }
        }

        public void onCompleted() {
            if (!this.f61641f) {
                if (this.f61640e) {
                    this.f61636a.setProducer(new SingleProducer(this.f61636a, this.f61639d));
                } else if (this.f61637b) {
                    this.f61636a.setProducer(new SingleProducer(this.f61636a, this.f61638c));
                } else {
                    this.f61636a.onError(new NoSuchElementException("Sequence contains no elements"));
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f61641f) {
                C19401c.m69811a(th);
            } else {
                this.f61636a.onError(th);
            }
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71461a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> at<T> m71460a() {
        return C19428a.f60621a;
    }

    at() {
        this(false, null);
    }

    public at(T t) {
        this(true, t);
    }

    private at(boolean z, T t) {
        this.f62033a = z;
        this.f62034b = t;
    }

    /* renamed from: a */
    public C19571c<? super T> m71461a(C19571c<? super T> c19571c) {
        Object c19704b = new C19704b(c19571c, this.f62033a, this.f62034b);
        c19571c.add(c19704b);
        return c19704b;
    }
}
