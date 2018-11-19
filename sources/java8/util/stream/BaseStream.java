package java8.util.stream;

import java.util.Iterator;
import java8.util.Spliterator;

public interface BaseStream<T, S extends BaseStream<T, S>> {
    void close();

    boolean isParallel();

    Iterator<T> iterator();

    S onClose(Runnable runnable);

    S parallel();

    S sequential();

    Spliterator<T> spliterator();

    S unordered();
}
