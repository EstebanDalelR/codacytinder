package java8.util.function;

public interface ToLongBiFunction<T, U> {
    long applyAsLong(T t, U u);
}
