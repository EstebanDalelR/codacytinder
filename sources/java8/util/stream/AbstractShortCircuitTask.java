package java8.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import java8.util.Spliterator;

abstract class AbstractShortCircuitTask<P_IN, P_OUT, R, K extends AbstractShortCircuitTask<P_IN, P_OUT, R, K>> extends AbstractTask<P_IN, P_OUT, R, K> {
    /* renamed from: a */
    protected final AtomicReference<R> f59224a;
    /* renamed from: b */
    protected volatile boolean f59225b;

    /* renamed from: o */
    protected abstract R mo13726o();

    protected AbstractShortCircuitTask(PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator) {
        super((PipelineHelper) pipelineHelper, (Spliterator) spliterator);
        this.f59224a = new AtomicReference(null);
    }

    protected AbstractShortCircuitTask(K k, Spliterator<P_IN> spliterator) {
        super((AbstractTask) k, (Spliterator) spliterator);
        this.f59224a = k.f59224a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo13596a() {
        /*
        r10 = this;
        r0 = r10.e;
        r1 = r0.estimateSize();
        r3 = r10.m66660c(r1);
        r5 = r10.f59224a;
        r6 = 0;
        r6 = r0;
        r7 = 0;
        r0 = r10;
    L_0x0010:
        r8 = r5.get();
        if (r8 != 0) goto L_0x0055;
    L_0x0016:
        r8 = r0.m67716r();
        if (r8 == 0) goto L_0x0021;
    L_0x001c:
        r8 = r0.mo13726o();
        goto L_0x0055;
    L_0x0021:
        r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r8 <= 0) goto L_0x0051;
    L_0x0025:
        r1 = r6.trySplit();
        if (r1 != 0) goto L_0x002c;
    L_0x002b:
        goto L_0x0051;
    L_0x002c:
        r2 = r0.mo14018a(r1);
        r2 = (java8.util.stream.AbstractShortCircuitTask) r2;
        r0.g = r2;
        r8 = r0.mo14018a(r6);
        r8 = (java8.util.stream.AbstractShortCircuitTask) r8;
        r0.h = r8;
        r9 = 1;
        r0.mo12937a(r9);
        if (r7 == 0) goto L_0x0046;
    L_0x0042:
        r6 = r1;
        r0 = r2;
        r2 = r8;
        goto L_0x0047;
    L_0x0046:
        r0 = r8;
    L_0x0047:
        r7 = r7 ^ 1;
        r2.m59284j();
        r1 = r6.estimateSize();
        goto L_0x0010;
    L_0x0051:
        r8 = r0.mo14019t();
    L_0x0055:
        r0.mo14009b(r8);
        r0.mo12941d();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.stream.AbstractShortCircuitTask.a():void");
    }

    /* renamed from: a */
    protected void m67710a(R r) {
        if (r != null) {
            this.f59224a.compareAndSet(null, r);
        }
    }

    /* renamed from: b */
    protected void mo14009b(R r) {
        if (!m66665v()) {
            super.mo14009b((Object) r);
        } else if (r != null) {
            this.f59224a.compareAndSet(null, r);
        }
    }

    /* renamed from: g */
    public R mo12944g() {
        return mo13614p();
    }

    /* renamed from: p */
    public R mo13614p() {
        if (!m66665v()) {
            return super.mo13614p();
        }
        R r = this.f59224a.get();
        if (r == null) {
            r = mo13726o();
        }
        return r;
    }

    /* renamed from: q */
    protected void mo14010q() {
        this.f59225b = true;
    }

    /* renamed from: r */
    protected boolean m67716r() {
        boolean z = this.f59225b;
        if (!z) {
            AbstractTask w = m66666w();
            while (true) {
                AbstractShortCircuitTask abstractShortCircuitTask = (AbstractShortCircuitTask) w;
                if (z || abstractShortCircuitTask == null) {
                    break;
                }
                z = abstractShortCircuitTask.f59225b;
                w = abstractShortCircuitTask.m66666w();
            }
        }
        return z;
    }

    /* renamed from: s */
    protected void m67717s() {
        AbstractTask abstractTask = this;
        for (AbstractTask abstractTask2 = (AbstractShortCircuitTask) m66666w(); abstractTask2 != null; abstractTask2 = (AbstractShortCircuitTask) abstractTask2.m66666w()) {
            if (abstractTask2.g == abstractTask) {
                AbstractShortCircuitTask abstractShortCircuitTask = (AbstractShortCircuitTask) abstractTask2.h;
                if (!abstractShortCircuitTask.f59225b) {
                    abstractShortCircuitTask.mo14010q();
                }
            }
            abstractTask = abstractTask2;
        }
    }
}
