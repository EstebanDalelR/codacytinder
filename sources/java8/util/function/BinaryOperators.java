package java8.util.function;

import java.util.Comparator;
import java8.util.Objects;

public final class BinaryOperators {
    /* renamed from: a */
    public static <T> BinaryOperator<T> m59343a(Comparator<? super T> comparator) {
        Objects.m59115b(comparator);
        return BinaryOperators$$Lambda$1.m66651a(comparator);
    }

    /* renamed from: d */
    private static /* synthetic */ Object m59347d(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2) <= null ? obj : obj2;
    }

    /* renamed from: b */
    public static <T> BinaryOperator<T> m59345b(Comparator<? super T> comparator) {
        Objects.m59115b(comparator);
        return BinaryOperators$$Lambda$2.m66652a(comparator);
    }

    /* renamed from: c */
    private static /* synthetic */ Object m59346c(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2) >= null ? obj : obj2;
    }

    private BinaryOperators() {
    }
}
