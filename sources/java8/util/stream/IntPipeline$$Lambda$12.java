package java8.util.stream;

import java8.util.IntSummaryStatistics;
import java8.util.function.BiConsumer;

final /* synthetic */ class IntPipeline$$Lambda$12 implements BiConsumer {
    /* renamed from: a */
    private static final IntPipeline$$Lambda$12 f54569a = new IntPipeline$$Lambda$12();

    private IntPipeline$$Lambda$12() {
    }

    /* renamed from: a */
    public static BiConsumer m63996a() {
        return f54569a;
    }

    public void accept(Object obj, Object obj2) {
        ((IntSummaryStatistics) obj).m63826a((IntSummaryStatistics) obj2);
    }
}
