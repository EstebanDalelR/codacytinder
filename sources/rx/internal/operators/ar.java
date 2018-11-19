package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.C2671a;
import rx.Observable.Operator;
import rx.Observer;
import rx.exceptions.C19410a;
import rx.functions.Action0;
import rx.observers.C19781e;

public final class ar<T> implements Operator<T, T> {
    /* renamed from: a */
    final long f62027a;
    /* renamed from: b */
    final TimeUnit f62028b;
    /* renamed from: c */
    final C2671a f62029c;

    /* renamed from: rx.internal.operators.ar$a */
    static final class C19825a<T> extends C19571c<T> implements Action0 {
        /* renamed from: c */
        private static final Object f62024c = new Object();
        /* renamed from: a */
        final AtomicReference<Object> f62025a = new AtomicReference(f62024c);
        /* renamed from: b */
        private final C19571c<? super T> f62026b;

        public C19825a(C19571c<? super T> c19571c) {
            this.f62026b = c19571c;
        }

        public void onStart() {
            request(Format.OFFSET_SAMPLE_RELATIVE);
        }

        public void onNext(T t) {
            this.f62025a.set(t);
        }

        public void onError(Throwable th) {
            this.f62026b.onError(th);
            unsubscribe();
        }

        public void onCompleted() {
            m71457a();
            this.f62026b.onCompleted();
            unsubscribe();
        }

        public void call() {
            m71457a();
        }

        /* renamed from: a */
        private void m71457a() {
            Object andSet = this.f62025a.getAndSet(f62024c);
            if (andSet != f62024c) {
                try {
                    this.f62026b.onNext(andSet);
                } catch (Throwable th) {
                    C19410a.m69869a(th, (Observer) this);
                }
            }
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71458a((C19571c) obj);
    }

    public ar(long j, TimeUnit timeUnit, C2671a c2671a) {
        this.f62027a = j;
        this.f62028b = timeUnit;
        this.f62029c = c2671a;
    }

    /* renamed from: a */
    public C19571c<? super T> m71458a(C19571c<? super T> c19571c) {
        C19571c c19781e = new C19781e(c19571c);
        Object createWorker = this.f62029c.createWorker();
        c19571c.add(createWorker);
        Action0 c19825a = new C19825a(c19781e);
        c19571c.add(c19825a);
        createWorker.mo14760a(c19825a, this.f62027a, this.f62027a, this.f62028b);
        return c19825a;
    }
}
