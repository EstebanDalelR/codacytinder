package java8.util.stream;

import java8.util.LongSummaryStatistics;
import java8.util.function.BiConsumer;
import java8.util.function.ToLongFunction;

final /* synthetic */ class Collectors$$Lambda$82 implements BiConsumer {
    /* renamed from: a */
    private final ToLongFunction f54511a;

    public void accept(Object obj, Object obj2) {
        ((LongSummaryStatistics) obj).accept(this.f54511a.applyAsLong(obj2));
    }
}
