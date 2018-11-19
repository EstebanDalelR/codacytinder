package rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;
import rx.C19571c;
import rx.Observer;
import rx.Producer;
import rx.exceptions.C19410a;

public final class SingleDelayedProducer<T> extends AtomicInteger implements Producer {
    private static final long serialVersionUID = -2873467947112093874L;
    /* renamed from: a */
    final C19571c<? super T> f61231a;
    /* renamed from: b */
    T f61232b;

    public SingleDelayedProducer(C19571c<? super T> c19571c) {
        this.f61231a = c19571c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void request(long r4) {
        /*
        r3 = this;
        r0 = 0;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x000e;
    L_0x0006:
        r4 = new java.lang.IllegalArgumentException;
        r5 = "n >= 0 required";
        r4.<init>(r5);
        throw r4;
    L_0x000e:
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x0013;
    L_0x0012:
        return;
    L_0x0013:
        r4 = r3.get();
        if (r4 != 0) goto L_0x0022;
    L_0x0019:
        r4 = 0;
        r5 = 2;
        r4 = r3.compareAndSet(r4, r5);
        if (r4 != 0) goto L_0x0033;
    L_0x0021:
        goto L_0x0013;
    L_0x0022:
        r5 = 1;
        if (r4 != r5) goto L_0x0033;
    L_0x0025:
        r4 = 3;
        r4 = r3.compareAndSet(r5, r4);
        if (r4 == 0) goto L_0x0033;
    L_0x002c:
        r4 = r3.f61231a;
        r5 = r3.f61232b;
        m70603a(r4, r5);
    L_0x0033:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.producers.SingleDelayedProducer.request(long):void");
    }

    /* renamed from: a */
    public void m70604a(T t) {
        while (true) {
            int i = get();
            if (i != 0) {
                break;
            }
            this.f61232b = t;
            if (compareAndSet(0, 1)) {
                return;
            }
        }
        if (i == 2 && compareAndSet(2, 3)) {
            m70603a(this.f61231a, t);
        }
    }

    /* renamed from: a */
    private static <T> void m70603a(C19571c<? super T> c19571c, T t) {
        if (!c19571c.isUnsubscribed()) {
            try {
                c19571c.onNext(t);
                if (c19571c.isUnsubscribed() == null) {
                    c19571c.onCompleted();
                }
            } catch (Throwable th) {
                C19410a.m69870a(th, (Observer) c19571c, (Object) t);
            }
        }
    }
}
