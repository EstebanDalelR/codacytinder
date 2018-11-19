package java8.util.stream;

import java8.util.function.Function;

final /* synthetic */ class Collectors$$Lambda$71 implements Function {
    /* renamed from: a */
    private final Collector f54497a;

    public Object apply(Object obj) {
        return new Partition(this.f54497a.finisher().apply(((Partition) obj).f48878a), this.f54497a.finisher().apply(((Partition) obj).f48879b));
    }
}
