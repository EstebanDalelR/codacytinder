package java8.util.stream;

import java8.util.function.BinaryOperator;

final /* synthetic */ class Collectors$$Lambda$69 implements BinaryOperator {
    /* renamed from: a */
    private final BinaryOperator f57657a;

    public Object apply(Object obj, Object obj2) {
        return new Partition(this.f57657a.apply(((Partition) obj).f48878a, ((Partition) obj2).f48878a), this.f57657a.apply(((Partition) obj).f48879b, ((Partition) obj2).f48879b));
    }
}
