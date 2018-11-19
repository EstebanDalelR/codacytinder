package rx.internal.operators;

import java.util.concurrent.Callable;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.exceptions.C19410a;
import rx.internal.producers.SingleDelayedProducer;

/* renamed from: rx.internal.operators.m */
public final class C19884m<T> implements OnSubscribe<T> {
    /* renamed from: a */
    private final Callable<? extends T> f62277a;

    public /* synthetic */ void call(Object obj) {
        m71611a((C19571c) obj);
    }

    public C19884m(Callable<? extends T> callable) {
        this.f62277a = callable;
    }

    /* renamed from: a */
    public void m71611a(C19571c<? super T> c19571c) {
        Object singleDelayedProducer = new SingleDelayedProducer(c19571c);
        c19571c.setProducer(singleDelayedProducer);
        try {
            singleDelayedProducer.m70604a(this.f62277a.call());
        } catch (Throwable th) {
            C19410a.m69869a(th, (Observer) c19571c);
        }
    }
}
