package java8.util.stream;

import java8.util.function.BiConsumer;
import java8.util.function.Function;

final /* synthetic */ class Collectors$$Lambda$21 implements BiConsumer {
    /* renamed from: a */
    private final BiConsumer f54441a;
    /* renamed from: b */
    private final Function f54442b;

    public void accept(Object obj, Object obj2) {
        this.f54441a.accept(obj, this.f54442b.apply(obj2));
    }
}
