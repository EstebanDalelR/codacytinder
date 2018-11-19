package java8.util.stream;

import java8.util.function.BiConsumer;
import java8.util.function.ToLongFunction;

final /* synthetic */ class Collectors$$Lambda$30 implements BiConsumer {
    /* renamed from: a */
    private final ToLongFunction f54454a;

    public void accept(Object obj, Object obj2) {
        ((long[]) obj)[0] = ((long[]) obj)[0] + this.f54454a.applyAsLong(obj2);
    }
}
