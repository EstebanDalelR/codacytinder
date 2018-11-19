package java8.util.stream;

import java.util.Collection;
import java8.util.function.BinaryOperator;

final /* synthetic */ class Collectors$$Lambda$4 implements BinaryOperator {
    /* renamed from: a */
    private static final Collectors$$Lambda$4 f57653a = new Collectors$$Lambda$4();

    private Collectors$$Lambda$4() {
    }

    public Object apply(Object obj, Object obj2) {
        return ((Collection) obj).addAll((Collection) obj2);
    }
}
