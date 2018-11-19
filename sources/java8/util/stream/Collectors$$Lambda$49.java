package java8.util.stream;

import java8.util.function.BiConsumer;
import java8.util.function.BinaryOperator;

final /* synthetic */ class Collectors$$Lambda$49 implements BiConsumer {
    /* renamed from: a */
    private final BinaryOperator f54469a;

    public void accept(Object obj, Object obj2) {
        ((Object[]) obj)[0] = this.f54469a.apply(((Object[]) obj)[0], obj2);
    }
}
