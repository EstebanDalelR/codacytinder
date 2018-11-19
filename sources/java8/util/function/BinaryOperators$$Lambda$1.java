package java8.util.function;

import java.util.Comparator;

final /* synthetic */ class BinaryOperators$$Lambda$1 implements BinaryOperator {
    /* renamed from: a */
    private final Comparator f57629a;

    private BinaryOperators$$Lambda$1(Comparator comparator) {
        this.f57629a = comparator;
    }

    /* renamed from: a */
    public static BinaryOperator m66651a(Comparator comparator) {
        return new BinaryOperators$$Lambda$1(comparator);
    }

    public Object apply(Object obj, Object obj2) {
        return BinaryOperators.m59347d(this.f57629a, obj, obj2);
    }
}
