package java8.util.stream;

import java.util.Map;
import java8.util.Maps;
import java8.util.Objects;
import java8.util.function.BiConsumer;
import java8.util.function.Function;
import java8.util.function.Supplier;

final /* synthetic */ class Collectors$$Lambda$61 implements BiConsumer {
    /* renamed from: a */
    private final Function f54480a;
    /* renamed from: b */
    private final Supplier f54481b;
    /* renamed from: c */
    private final BiConsumer f54482c;

    public void accept(Object obj, Object obj2) {
        this.f54482c.accept(Maps.m59109a((Map) obj, Objects.m59113a(this.f54480a.apply(obj2), "element cannot be mapped to a null key"), Collectors$$Lambda$91.m63958a(this.f54481b)), obj2);
    }
}
