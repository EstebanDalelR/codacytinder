package java8.util.stream;

import java8.util.function.BiFunction;
import java8.util.function.Function;

final /* synthetic */ class Collectors$$Lambda$90 implements BiFunction {
    /* renamed from: a */
    private final Function f54518a;

    private Collectors$$Lambda$90(Function function) {
        this.f54518a = function;
    }

    /* renamed from: a */
    public static BiFunction m63957a(Function function) {
        return new Collectors$$Lambda$90(function);
    }

    public Object apply(Object obj, Object obj2) {
        return this.f54518a.apply(obj2);
    }
}
