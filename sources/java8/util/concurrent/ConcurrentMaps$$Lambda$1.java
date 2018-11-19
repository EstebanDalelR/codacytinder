package java8.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import java8.util.function.BiConsumer;
import java8.util.function.BiFunction;

final /* synthetic */ class ConcurrentMaps$$Lambda$1 implements BiConsumer {
    /* renamed from: a */
    private final ConcurrentMap f54334a;
    /* renamed from: b */
    private final BiFunction f54335b;

    private ConcurrentMaps$$Lambda$1(ConcurrentMap concurrentMap, BiFunction biFunction) {
        this.f54334a = concurrentMap;
        this.f54335b = biFunction;
    }

    /* renamed from: a */
    public static BiConsumer m63886a(ConcurrentMap concurrentMap, BiFunction biFunction) {
        return new ConcurrentMaps$$Lambda$1(concurrentMap, biFunction);
    }

    public void accept(Object obj, Object obj2) {
        ConcurrentMaps.m59218b(this.f54334a, this.f54335b, obj, obj2);
    }
}
