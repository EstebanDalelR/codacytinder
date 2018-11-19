package java8.util.stream;

import java8.util.function.Function;
import java8.util.function.Supplier;

final /* synthetic */ class Collectors$$Lambda$91 implements Function {
    /* renamed from: a */
    private final Supplier f54519a;

    private Collectors$$Lambda$91(Supplier supplier) {
        this.f54519a = supplier;
    }

    /* renamed from: a */
    public static Function m63958a(Supplier supplier) {
        return new Collectors$$Lambda$91(supplier);
    }

    public Object apply(Object obj) {
        return this.f54519a.get();
    }
}
