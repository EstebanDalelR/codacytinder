package java8.util.stream;

import java8.util.function.Supplier;

final /* synthetic */ class AbstractPipeline$$Lambda$1 implements Supplier {
    /* renamed from: a */
    private final AbstractPipeline f54418a;

    private AbstractPipeline$$Lambda$1(AbstractPipeline abstractPipeline) {
        this.f54418a = abstractPipeline;
    }

    /* renamed from: a */
    public static Supplier m63912a(AbstractPipeline abstractPipeline) {
        return new AbstractPipeline$$Lambda$1(abstractPipeline);
    }

    public Object get() {
        return this.f54418a.mo13634g();
    }
}
