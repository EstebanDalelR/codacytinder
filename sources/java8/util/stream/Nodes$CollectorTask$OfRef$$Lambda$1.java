package java8.util.stream;

import java8.util.function.IntFunction;
import java8.util.function.LongFunction;

final /* synthetic */ class Nodes$CollectorTask$OfRef$$Lambda$1 implements LongFunction {
    /* renamed from: a */
    private final IntFunction f54617a;

    private Nodes$CollectorTask$OfRef$$Lambda$1(IntFunction intFunction) {
        this.f54617a = intFunction;
    }

    /* renamed from: a */
    public static LongFunction m64045a(IntFunction intFunction) {
        return new Nodes$CollectorTask$OfRef$$Lambda$1(intFunction);
    }

    public Object apply(long j) {
        return Nodes.m59611a(j, this.f54617a);
    }
}
