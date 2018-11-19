package java8.util.stream;

import java8.util.Spliterator;
import java8.util.concurrent.CountedCompleter;
import java8.util.concurrent.ForkJoinPool;

abstract class AbstractTask<P_IN, P_OUT, R, K extends AbstractTask<P_IN, P_OUT, R, K>> extends CountedCompleter<R> {
    /* renamed from: c */
    static final int f57634c = (ForkJoinPool.m59246b() << 2);
    /* renamed from: a */
    private R f57635a;
    /* renamed from: d */
    protected final PipelineHelper<P_OUT> f57636d;
    /* renamed from: e */
    protected Spliterator<P_IN> f57637e;
    /* renamed from: f */
    protected long f57638f;
    /* renamed from: g */
    protected K f57639g;
    /* renamed from: h */
    protected K f57640h;

    /* renamed from: a */
    protected abstract K mo14018a(Spliterator<P_IN> spliterator);

    /* renamed from: t */
    protected abstract R mo14019t();

    protected AbstractTask(PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator) {
        super(null);
        this.f57636d = pipelineHelper;
        this.f57637e = spliterator;
        this.f57638f = null;
    }

    protected AbstractTask(K k, Spliterator<P_IN> spliterator) {
        super(k);
        this.f57637e = spliterator;
        this.f57636d = k.f57636d;
        this.f57638f = k.f57638f;
    }

    /* renamed from: b */
    public static long m66655b(long j) {
        j /= (long) f57634c;
        return j > 0 ? j : 1;
    }

    /* renamed from: c */
    protected final long m66660c(long j) {
        long j2 = this.f57638f;
        if (j2 != 0) {
            return j2;
        }
        j2 = m66655b(j);
        this.f57638f = j2;
        return j2;
    }

    /* renamed from: g */
    public R mo12944g() {
        return this.f57635a;
    }

    /* renamed from: p */
    protected R mo13614p() {
        return this.f57635a;
    }

    /* renamed from: b */
    protected void mo14009b(R r) {
        this.f57635a = r;
    }

    /* renamed from: u */
    protected boolean m66664u() {
        return this.f57639g == null;
    }

    /* renamed from: v */
    protected boolean m66665v() {
        return m66666w() == null;
    }

    /* renamed from: w */
    protected K m66666w() {
        return (AbstractTask) A_();
    }

    /* renamed from: a */
    public void mo13596a() {
        Spliterator spliterator = this.f57637e;
        long estimateSize = spliterator.estimateSize();
        long c = m66660c(estimateSize);
        AbstractTask abstractTask = this;
        int i = 0;
        while (estimateSize > c) {
            Spliterator trySplit = spliterator.trySplit();
            if (trySplit == null) {
                break;
            }
            AbstractTask a = abstractTask.mo14018a(trySplit);
            abstractTask.f57639g = a;
            AbstractTask a2 = abstractTask.mo14018a(spliterator);
            abstractTask.f57640h = a2;
            abstractTask.mo12937a(1);
            if (i != 0) {
                spliterator = trySplit;
                abstractTask = a;
                a = a2;
            } else {
                abstractTask = a2;
            }
            i ^= 1;
            a.m59284j();
            estimateSize = spliterator.estimateSize();
        }
        abstractTask.mo14009b(abstractTask.mo14019t());
        abstractTask.mo12941d();
    }

    /* renamed from: a */
    public void mo13597a(CountedCompleter<?> countedCompleter) {
        this.f57637e = null;
        this.f57640h = null;
        this.f57639g = null;
    }

    /* renamed from: x */
    protected boolean m66667x() {
        AbstractTask abstractTask = this;
        while (abstractTask != null) {
            AbstractTask w = abstractTask.m66666w();
            if (w != null && w.f57639g != abstractTask) {
                return false;
            }
            abstractTask = w;
        }
        return true;
    }
}
