package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.C19571c;
import rx.C2671a;
import rx.Observable.OnSubscribe;
import rx.a$a;
import rx.exceptions.C19410a;
import rx.functions.Action0;

/* renamed from: rx.internal.operators.x */
public final class C19895x implements OnSubscribe<Long> {
    /* renamed from: a */
    final long f62307a;
    /* renamed from: b */
    final long f62308b;
    /* renamed from: c */
    final TimeUnit f62309c;
    /* renamed from: d */
    final C2671a f62310d;

    public /* synthetic */ void call(Object obj) {
        m71633a((C19571c) obj);
    }

    public C19895x(long j, long j2, TimeUnit timeUnit, C2671a c2671a) {
        this.f62307a = j;
        this.f62308b = j2;
        this.f62309c = timeUnit;
        this.f62310d = c2671a;
    }

    /* renamed from: a */
    public void m71633a(final C19571c<? super Long> c19571c) {
        final a$a createWorker = this.f62310d.createWorker();
        c19571c.add(createWorker);
        createWorker.mo14760a(new Action0(this) {
            /* renamed from: a */
            long f62088a;
            /* renamed from: d */
            final /* synthetic */ C19895x f62091d;

            public void call() {
                try {
                    C19571c c19571c = c19571c;
                    long j = this.f62088a;
                    this.f62088a = j + 1;
                    c19571c.onNext(Long.valueOf(j));
                } catch (Throwable th) {
                    createWorker.unsubscribe();
                } finally {
                    C19410a.m69869a(th, c19571c);
                }
            }
        }, this.f62307a, this.f62308b, this.f62309c);
    }
}
