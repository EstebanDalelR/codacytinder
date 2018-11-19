package java8.util.stream;

import java8.util.DoubleSummaryStatistics;
import java8.util.function.BiConsumer;
import java8.util.function.ToDoubleFunction;

final /* synthetic */ class Collectors$$Lambda$85 implements BiConsumer {
    /* renamed from: a */
    private final ToDoubleFunction f54513a;

    public void accept(Object obj, Object obj2) {
        ((DoubleSummaryStatistics) obj).accept(this.f54513a.applyAsDouble(obj2));
    }
}
