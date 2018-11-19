package java8.util.stream;

import java.util.List;
import java8.util.function.BinaryOperator;

final /* synthetic */ class Collectors$$Lambda$7 implements BinaryOperator {
    /* renamed from: a */
    private static final Collectors$$Lambda$7 f57658a = new Collectors$$Lambda$7();

    private Collectors$$Lambda$7() {
    }

    /* renamed from: a */
    public static BinaryOperator m66670a() {
        return f57658a;
    }

    public Object apply(Object obj, Object obj2) {
        return ((List) obj).addAll((List) obj2);
    }
}
