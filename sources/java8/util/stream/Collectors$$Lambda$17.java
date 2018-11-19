package java8.util.stream;

import java8.util.StringJoiner;
import java8.util.function.BinaryOperator;

final /* synthetic */ class Collectors$$Lambda$17 implements BinaryOperator {
    /* renamed from: a */
    private static final Collectors$$Lambda$17 f57643a = new Collectors$$Lambda$17();

    private Collectors$$Lambda$17() {
    }

    /* renamed from: a */
    public static BinaryOperator m66668a() {
        return f57643a;
    }

    public Object apply(Object obj, Object obj2) {
        return ((StringJoiner) obj).m59198a((StringJoiner) obj2);
    }
}
