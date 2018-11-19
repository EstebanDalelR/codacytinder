package java8.util.stream;

import java8.util.function.Function;
import java8.util.function.Supplier;

final /* synthetic */ class Collectors$$Lambda$89 implements Function {
    /* renamed from: a */
    private final Supplier f54516a;

    private Collectors$$Lambda$89(Supplier supplier) {
        this.f54516a = supplier;
    }

    /* renamed from: a */
    public static Function m63956a(Supplier supplier) {
        return new Collectors$$Lambda$89(supplier);
    }

    public Object apply(Object obj) {
        return this.f54516a.get();
    }
}
