package java8.util.function;

import java.util.Comparator;

final /* synthetic */ class BinaryOperators$$Lambda$2 implements BinaryOperator {
    /* renamed from: a */
    private final Comparator f57630a;

    private BinaryOperators$$Lambda$2(Comparator comparator) {
        this.f57630a = comparator;
    }

    /* renamed from: a */
    public static BinaryOperator m66652a(Comparator comparator) {
        return new BinaryOperators$$Lambda$2(comparator);
    }

    public Object apply(Object obj, Object obj2) {
        return BinaryOperators.m59346c(this.f57630a, obj, obj2);
    }
}
