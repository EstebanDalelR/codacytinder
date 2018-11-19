package java8.util;

import java.util.Enumeration;
import java.util.Iterator;
import java8.util.PrimitiveIterator.OfDouble;
import java8.util.PrimitiveIterator.OfInt;
import java8.util.PrimitiveIterator.OfLong;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.LongConsumer;

public final class Iterators {

    /* renamed from: java8.util.Iterators$1 */
    static class C157641 implements Iterator<E> {
        /* renamed from: a */
        final /* synthetic */ Enumeration f48736a;

        public boolean hasNext() {
            return this.f48736a.hasMoreElements();
        }

        public E next() {
            return this.f48736a.nextElement();
        }

        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    /* renamed from: a */
    public static <E> void m59078a(Iterator<E> it, Consumer<? super E> consumer) {
        Objects.m59115b(it);
        Objects.m59115b(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    /* renamed from: a */
    public static void m59080a(OfInt ofInt, IntConsumer intConsumer) {
        Objects.m59115b(ofInt);
        Objects.m59115b(intConsumer);
        while (ofInt.hasNext()) {
            intConsumer.accept(ofInt.next().intValue());
        }
    }

    /* renamed from: a */
    public static void m59081a(OfLong ofLong, LongConsumer longConsumer) {
        Objects.m59115b(ofLong);
        Objects.m59115b(longConsumer);
        while (ofLong.hasNext()) {
            longConsumer.accept(ofLong.next().longValue());
        }
    }

    /* renamed from: a */
    public static void m59079a(OfDouble ofDouble, DoubleConsumer doubleConsumer) {
        Objects.m59115b(ofDouble);
        Objects.m59115b(doubleConsumer);
        while (ofDouble.hasNext()) {
            doubleConsumer.accept(ofDouble.next().doubleValue());
        }
    }

    private Iterators() {
    }
}
