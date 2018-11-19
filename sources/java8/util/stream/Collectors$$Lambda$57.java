package java8.util.stream;

import java8.util.function.BiConsumer;
import java8.util.function.BinaryOperator;
import java8.util.function.Function;

final /* synthetic */ class Collectors$$Lambda$57 implements BiConsumer {
    /* renamed from: a */
    private final BinaryOperator f54475a;
    /* renamed from: b */
    private final Function f54476b;

    public void accept(Object obj, Object obj2) {
        ((Object[]) obj)[0] = this.f54475a.apply(((Object[]) obj)[0], this.f54476b.apply(obj2));
    }
}
