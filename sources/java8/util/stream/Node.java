package java8.util.stream;

import java8.util.Spliterator;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.IntFunction;
import java8.util.function.LongConsumer;

interface Node<T> {

    public interface OfPrimitive<T, T_CONS, T_ARR, T_SPLITR extends java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>, T_NODE extends OfPrimitive<T, T_CONS, T_ARR, T_SPLITR, T_NODE>> extends Node<T> {
        T[] asArray(IntFunction<T[]> intFunction);

        T_ARR asPrimitiveArray();

        void copyInto(T_ARR t_arr, int i);

        void forEach(T_CONS t_cons);

        T_NODE getChild(int i);

        T_ARR newArray(int i);

        T_SPLITR spliterator();

        T_NODE truncate(long j, long j2, IntFunction<T[]> intFunction);
    }

    public interface Builder<T> extends Sink<T> {

        public interface OfDouble extends Builder<Double>, java8.util.stream.Sink.OfDouble {
            OfDouble build();
        }

        public interface OfInt extends Builder<Integer>, java8.util.stream.Sink.OfInt {
            OfInt build();
        }

        public interface OfLong extends Builder<Long>, java8.util.stream.Sink.OfLong {
            OfLong build();
        }

        Node<T> build();
    }

    public interface OfDouble extends OfPrimitive<Double, DoubleConsumer, double[], java8.util.Spliterator.OfDouble, OfDouble> {
        void copyInto(Double[] dArr, int i);

        void forEach(Consumer<? super Double> consumer);

        StreamShape getShape();

        double[] newArray(int i);

        OfDouble truncate(long j, long j2, IntFunction<Double[]> intFunction);
    }

    public interface OfInt extends OfPrimitive<Integer, IntConsumer, int[], java8.util.Spliterator.OfInt, OfInt> {
        void copyInto(Integer[] numArr, int i);

        void forEach(Consumer<? super Integer> consumer);

        StreamShape getShape();

        int[] newArray(int i);

        OfInt truncate(long j, long j2, IntFunction<Integer[]> intFunction);
    }

    public interface OfLong extends OfPrimitive<Long, LongConsumer, long[], java8.util.Spliterator.OfLong, OfLong> {
        void copyInto(Long[] lArr, int i);

        void forEach(Consumer<? super Long> consumer);

        StreamShape getShape();

        long[] newArray(int i);

        OfLong truncate(long j, long j2, IntFunction<Long[]> intFunction);
    }

    /* renamed from: a */
    Node<T> mo13001a(long j, long j2, IntFunction<T[]> intFunction);

    /* renamed from: a */
    void mo13002a(T[] tArr, int i);

    Node<T> a_(int i);

    T[] asArray(IntFunction<T[]> intFunction);

    /* renamed from: c */
    long mo12999c();

    /* renamed from: e */
    int mo13000e();

    void forEach(Consumer<? super T> consumer);

    Spliterator<T> y_();
}
