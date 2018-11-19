package java8.util.stream;

import java8.util.function.BiConsumer;
import java8.util.function.ToIntFunction;

final /* synthetic */ class Collectors$$Lambda$26 implements BiConsumer {
    /* renamed from: a */
    private final ToIntFunction f54449a;

    public void accept(Object obj, Object obj2) {
        ((int[]) obj)[0] = ((int[]) obj)[0] + this.f54449a.applyAsInt(obj2);
    }
}
