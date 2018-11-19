package java8.util.function;

import java8.util.Objects;

public final class Consumers {
    /* renamed from: a */
    public static <T> Consumer<T> m59348a(Consumer<? super T> consumer, Consumer<? super T> consumer2) {
        Objects.m59115b(consumer);
        Objects.m59115b(consumer2);
        return Consumers$$Lambda$1.m63911a(consumer, consumer2);
    }

    /* renamed from: b */
    private static /* synthetic */ void m59350b(Consumer consumer, Consumer consumer2, Object obj) {
        consumer.accept(obj);
        consumer2.accept(obj);
    }

    private Consumers() {
    }
}
