package java8.util.stream;

import java.util.Collection;
import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.Spliterator.OfDouble;
import java8.util.Spliterator.OfInt;
import java8.util.Spliterator.OfLong;
import java8.util.Spliterators;

public final class StreamSupport {
    private StreamSupport() {
    }

    /* renamed from: a */
    public static <T> Stream<T> m59708a(Collection<? extends T> collection) {
        return m59709a(Spliterators.m59160a((Collection) collection), false);
    }

    /* renamed from: a */
    public static <T> Stream<T> m59709a(Spliterator<T> spliterator, boolean z) {
        Objects.m59115b(spliterator);
        return new Head(spliterator, StreamOpFlag.fromCharacteristics((Spliterator) spliterator), z);
    }

    /* renamed from: a */
    public static IntStream m59706a(OfInt ofInt, boolean z) {
        return new Head(ofInt, StreamOpFlag.fromCharacteristics((Spliterator) ofInt), z);
    }

    /* renamed from: a */
    public static LongStream m59707a(OfLong ofLong, boolean z) {
        return new Head(ofLong, StreamOpFlag.fromCharacteristics((Spliterator) ofLong), z);
    }

    /* renamed from: a */
    public static DoubleStream m59705a(OfDouble ofDouble, boolean z) {
        return new Head(ofDouble, StreamOpFlag.fromCharacteristics((Spliterator) ofDouble), z);
    }
}
