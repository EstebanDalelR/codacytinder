package java8.util.stream;

import java.util.concurrent.ConcurrentMap;
import java8.util.function.BiConsumer;
import java8.util.function.Function;
import java8.util.function.Supplier;

final /* synthetic */ class Collectors$$Lambda$66 implements BiConsumer {
    /* renamed from: a */
    private final Function f54489a;
    /* renamed from: b */
    private final Supplier f54490b;
    /* renamed from: c */
    private final BiConsumer f54491c;

    public void accept(Object obj, Object obj2) {
        Collectors.m59523c(this.f54489a, this.f54490b, this.f54491c, (ConcurrentMap) obj, obj2);
    }
}
