package java8.util;

import java.util.Iterator;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.LongConsumer;

public interface PrimitiveIterator<T, T_CONS> extends Iterator<T> {

    public interface OfDouble extends PrimitiveIterator<Double, DoubleConsumer> {
        void forEachRemaining(DoubleConsumer doubleConsumer);

        Double next();

        double nextDouble();
    }

    public interface OfInt extends PrimitiveIterator<Integer, IntConsumer> {
        void forEachRemaining(IntConsumer intConsumer);

        Integer next();

        int nextInt();
    }

    public interface OfLong extends PrimitiveIterator<Long, LongConsumer> {
        void forEachRemaining(LongConsumer longConsumer);

        Long next();

        long nextLong();
    }

    void forEachRemaining(T_CONS t_cons);
}
