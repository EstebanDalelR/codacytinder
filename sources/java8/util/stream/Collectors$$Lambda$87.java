package java8.util.stream;

import java8.util.function.BiFunction;
import java8.util.function.Function;

final /* synthetic */ class Collectors$$Lambda$87 implements BiFunction {
    /* renamed from: a */
    private final Function f54514a;

    private Collectors$$Lambda$87(Function function) {
        this.f54514a = function;
    }

    /* renamed from: a */
    public static BiFunction m63954a(Function function) {
        return new Collectors$$Lambda$87(function);
    }

    public Object apply(Object obj, Object obj2) {
        return this.f54514a.apply(obj2);
    }
}
