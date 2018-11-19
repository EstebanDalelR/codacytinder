package java8.util.function;

public final class LongPredicates {
    /* renamed from: d */
    private static /* synthetic */ boolean m59392d(LongPredicate longPredicate, LongPredicate longPredicate2, long j) {
        return (longPredicate.test(j) == null || longPredicate2.test(j) == null) ? null : true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean m59391c(LongPredicate longPredicate, LongPredicate longPredicate2, long j) {
        if (longPredicate.test(j) == null) {
            if (longPredicate2.test(j) == null) {
                return null;
            }
        }
        return true;
    }

    private LongPredicates() {
    }
}
