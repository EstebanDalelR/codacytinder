package java8.util.stream;

import java.util.concurrent.ConcurrentMap;
import java8.util.concurrent.ConcurrentMaps;
import java8.util.function.BiConsumer;
import java8.util.function.BiFunction;
import java8.util.function.BinaryOperator;
import java8.util.function.Function;

final /* synthetic */ class Collectors$$Lambda$77 implements BiConsumer {
    /* renamed from: a */
    private final Function f54505a;
    /* renamed from: b */
    private final Function f54506b;
    /* renamed from: c */
    private final BinaryOperator f54507c;

    public void accept(Object obj, Object obj2) {
        ConcurrentMaps.m59213a((ConcurrentMap) obj, this.f54505a.apply(obj2), this.f54506b.apply(obj2), (BiFunction) this.f54507c);
    }
}
