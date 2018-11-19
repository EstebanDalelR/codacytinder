package java8.util.stream;

import java8.util.IntSummaryStatistics;
import java8.util.function.BiConsumer;
import java8.util.function.ToIntFunction;

final /* synthetic */ class Collectors$$Lambda$79 implements BiConsumer {
    /* renamed from: a */
    private final ToIntFunction f54509a;

    public void accept(Object obj, Object obj2) {
        ((IntSummaryStatistics) obj).accept(this.f54509a.applyAsInt(obj2));
    }
}
