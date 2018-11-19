package java8.util.function;

public final class BiPredicates {
    /* renamed from: d */
    private static /* synthetic */ boolean m59341d(BiPredicate biPredicate, BiPredicate biPredicate2, Object obj, Object obj2) {
        return (biPredicate.test(obj, obj2) == null || biPredicate2.test(obj, obj2) == null) ? null : true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean m59340c(BiPredicate biPredicate, BiPredicate biPredicate2, Object obj, Object obj2) {
        if (biPredicate.test(obj, obj2) == null) {
            if (biPredicate2.test(obj, obj2) == null) {
                return null;
            }
        }
        return true;
    }

    private BiPredicates() {
    }
}
