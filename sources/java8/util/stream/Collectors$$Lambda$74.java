package java8.util.stream;

import java.util.Map;
import java8.util.Maps;
import java8.util.function.BiConsumer;
import java8.util.function.BinaryOperator;
import java8.util.function.Function;

final /* synthetic */ class Collectors$$Lambda$74 implements BiConsumer {
    /* renamed from: a */
    private final Function f54500a;
    /* renamed from: b */
    private final Function f54501b;
    /* renamed from: c */
    private final BinaryOperator f54502c;

    public void accept(Object obj, Object obj2) {
        Maps.m59108a((Map) obj, this.f54500a.apply(obj2), this.f54501b.apply(obj2), this.f54502c);
    }
}
