package java8.util.function;

public interface BiFunction<T, U, R> {
    R apply(T t, U u);
}
