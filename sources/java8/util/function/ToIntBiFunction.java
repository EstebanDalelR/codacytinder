package java8.util.function;

public interface ToIntBiFunction<T, U> {
    int applyAsInt(T t, U u);
}
