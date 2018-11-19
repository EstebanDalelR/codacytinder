package java8.lang;

import java.util.Collection;
import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.Spliterators;
import java8.util.function.Consumer;

public final class Iterables {
    /* renamed from: a */
    public static <T> void m59019a(Iterable<? extends T> iterable, Consumer<? super T> consumer) {
        Objects.m59115b(iterable);
        Objects.m59115b(consumer);
        for (Object accept : iterable) {
            consumer.accept(accept);
        }
    }

    /* renamed from: a */
    public static <T> Spliterator<T> m59018a(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return Spliterators.m59160a((Collection) iterable);
        }
        return Spliterators.m59162a(iterable.iterator(), 0);
    }

    private Iterables() {
    }
}
