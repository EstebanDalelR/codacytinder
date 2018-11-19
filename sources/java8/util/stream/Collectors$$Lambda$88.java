package java8.util.stream;

import java8.util.function.Function;
import java8.util.function.Supplier;

final /* synthetic */ class Collectors$$Lambda$88 implements Function {
    /* renamed from: a */
    private final Supplier f54515a;

    private Collectors$$Lambda$88(Supplier supplier) {
        this.f54515a = supplier;
    }

    /* renamed from: a */
    public static Function m63955a(Supplier supplier) {
        return new Collectors$$Lambda$88(supplier);
    }

    public Object apply(Object obj) {
        return this.f54515a.get();
    }
}
