package java8.util.stream;

import java.util.Map;
import java8.util.function.BiConsumer;
import java8.util.function.Function;

final /* synthetic */ class Collectors$$Lambda$2 implements BiConsumer {
    /* renamed from: a */
    private final Function f54452a;
    /* renamed from: b */
    private final Function f54453b;

    private Collectors$$Lambda$2(Function function, Function function2) {
        this.f54452a = function;
        this.f54453b = function2;
    }

    /* renamed from: a */
    public static BiConsumer m63950a(Function function, Function function2) {
        return new Collectors$$Lambda$2(function, function2);
    }

    public void accept(Object obj, Object obj2) {
        Collectors.m59498b(this.f54452a, this.f54453b, (Map) obj, obj2);
    }
}
