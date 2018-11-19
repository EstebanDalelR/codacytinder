package java8.util.function;

public final class IntPredicates {
    /* renamed from: d */
    private static /* synthetic */ boolean m59378d(IntPredicate intPredicate, IntPredicate intPredicate2, int i) {
        return (intPredicate.test(i) == null || intPredicate2.test(i) == null) ? null : true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean m59377c(IntPredicate intPredicate, IntPredicate intPredicate2, int i) {
        if (intPredicate.test(i) == null) {
            if (intPredicate2.test(i) == null) {
                return null;
            }
        }
        return true;
    }

    private IntPredicates() {
    }
}
