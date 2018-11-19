package java8.util.stream;

import java.util.concurrent.ConcurrentMap;
import java8.util.Objects;
import java8.util.concurrent.ConcurrentMaps;
import java8.util.function.BiConsumer;
import java8.util.function.Function;
import java8.util.function.Supplier;

final /* synthetic */ class Collectors$$Lambda$65 implements BiConsumer {
    /* renamed from: a */
    private final Function f54486a;
    /* renamed from: b */
    private final Supplier f54487b;
    /* renamed from: c */
    private final BiConsumer f54488c;

    public void accept(Object obj, Object obj2) {
        this.f54488c.accept(ConcurrentMaps.m59214a((ConcurrentMap) obj, Objects.m59113a(this.f54486a.apply(obj2), "element cannot be mapped to a null key"), Collectors$$Lambda$89.m63956a(this.f54487b)), obj2);
    }
}
