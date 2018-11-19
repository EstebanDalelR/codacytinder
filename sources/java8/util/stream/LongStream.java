package java8.util.stream;

import java8.util.LongSummaryStatistics;
import java8.util.OptionalDouble;
import java8.util.OptionalLong;
import java8.util.PrimitiveIterator.OfLong;
import java8.util.Spliterator;
import java8.util.function.BiConsumer;
import java8.util.function.LongBinaryOperator;
import java8.util.function.LongConsumer;
import java8.util.function.LongFunction;
import java8.util.function.LongPredicate;
import java8.util.function.LongToDoubleFunction;
import java8.util.function.LongToIntFunction;
import java8.util.function.LongUnaryOperator;
import java8.util.function.ObjLongConsumer;
import java8.util.function.Supplier;

public interface LongStream extends BaseStream<Long, LongStream> {

    public interface Builder extends LongConsumer {
        void accept(long j);

        Builder add(long j);

        LongStream build();
    }

    boolean allMatch(LongPredicate longPredicate);

    boolean anyMatch(LongPredicate longPredicate);

    DoubleStream asDoubleStream();

    OptionalDouble average();

    Stream<Long> boxed();

    <R> R collect(Supplier<R> supplier, ObjLongConsumer<R> objLongConsumer, BiConsumer<R, R> biConsumer);

    long count();

    LongStream distinct();

    LongStream dropWhile(LongPredicate longPredicate);

    LongStream filter(LongPredicate longPredicate);

    OptionalLong findAny();

    OptionalLong findFirst();

    LongStream flatMap(LongFunction<? extends LongStream> longFunction);

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    OfLong iterator();

    LongStream limit(long j);

    LongStream map(LongUnaryOperator longUnaryOperator);

    DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction);

    IntStream mapToInt(LongToIntFunction longToIntFunction);

    <U> Stream<U> mapToObj(LongFunction<? extends U> longFunction);

    OptionalLong max();

    OptionalLong min();

    boolean noneMatch(LongPredicate longPredicate);

    LongStream parallel();

    LongStream peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    OptionalLong reduce(LongBinaryOperator longBinaryOperator);

    LongStream sequential();

    LongStream skip(long j);

    LongStream sorted();

    Spliterator.OfLong spliterator();

    long sum();

    LongSummaryStatistics summaryStatistics();

    LongStream takeWhile(LongPredicate longPredicate);

    long[] toArray();
}
