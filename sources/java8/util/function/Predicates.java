package java8.util.function;

public final class Predicates {
    /* renamed from: d */
    private static /* synthetic */ boolean m59406d(Predicate predicate, Predicate predicate2, Object obj) {
        return (predicate.test(obj) == null || predicate2.test(obj) == null) ? null : true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean m59405c(Predicate predicate, Predicate predicate2, Object obj) {
        if (predicate.test(obj) == null) {
            if (predicate2.test(obj) == null) {
                return null;
            }
        }
        return true;
    }

    private Predicates() {
    }
}
