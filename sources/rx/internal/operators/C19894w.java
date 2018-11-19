package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.C19571c;
import rx.C2671a;
import rx.Observable.OnSubscribe;
import rx.exceptions.C19410a;
import rx.functions.Action0;

/* renamed from: rx.internal.operators.w */
public final class C19894w implements OnSubscribe<Long> {
    /* renamed from: a */
    final long f62304a;
    /* renamed from: b */
    final TimeUnit f62305b;
    /* renamed from: c */
    final C2671a f62306c;

    public /* synthetic */ void call(Object obj) {
        m71632a((C19571c) obj);
    }

    public C19894w(long j, TimeUnit timeUnit, C2671a c2671a) {
        this.f62304a = j;
        this.f62305b = timeUnit;
        this.f62306c = c2671a;
    }

    /* renamed from: a */
    public void m71632a(final C19571c<? super Long> c19571c) {
        Object createWorker = this.f62306c.createWorker();
        c19571c.add(createWorker);
        createWorker.mo14741a(new Action0(this) {
            /* renamed from: b */
            final /* synthetic */ C19894w f62087b;

            public void call() {
                try {
                    c19571c.onNext(Long.valueOf(0));
                    c19571c.onCompleted();
                } catch (Throwable th) {
                    C19410a.m69869a(th, c19571c);
                }
            }
        }, this.f62304a, this.f62305b);
    }
}
