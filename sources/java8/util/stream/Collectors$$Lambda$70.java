package java8.util.stream;

import java8.util.function.Supplier;

final /* synthetic */ class Collectors$$Lambda$70 implements Supplier {
    /* renamed from: a */
    private final Collector f54496a;

    public Object get() {
        return new Partition(this.f54496a.supplier().get(), this.f54496a.supplier().get());
    }
}
