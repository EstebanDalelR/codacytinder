package java8.util.function;

public final class DoublePredicates {
    /* renamed from: d */
    private static /* synthetic */ boolean m59358d(DoublePredicate doublePredicate, DoublePredicate doublePredicate2, double d) {
        return (doublePredicate.test(d) == null || doublePredicate2.test(d) == null) ? null : true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean m59357c(DoublePredicate doublePredicate, DoublePredicate doublePredicate2, double d) {
        if (doublePredicate.test(d) == null) {
            if (doublePredicate2.test(d) == null) {
                return null;
            }
        }
        return true;
    }

    private DoublePredicates() {
    }
}
