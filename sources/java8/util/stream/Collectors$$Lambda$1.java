package java8.util.stream;

import java.util.Map;
import java8.util.function.BinaryOperator;

final /* synthetic */ class Collectors$$Lambda$1 implements BinaryOperator {
    /* renamed from: a */
    private static final Collectors$$Lambda$1 f57645a = new Collectors$$Lambda$1();

    private Collectors$$Lambda$1() {
    }

    /* renamed from: a */
    public static BinaryOperator m66669a() {
        return f57645a;
    }

    public Object apply(Object obj, Object obj2) {
        return Collectors.m59475b((Map) obj, (Map) obj2);
    }
}
