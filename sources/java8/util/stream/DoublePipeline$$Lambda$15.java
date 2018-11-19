package java8.util.stream;

import java8.util.function.BiConsumer;
import java8.util.function.BinaryOperator;

final /* synthetic */ class DoublePipeline$$Lambda$15 implements BinaryOperator {
    /* renamed from: a */
    private final BiConsumer f57662a;

    private DoublePipeline$$Lambda$15(BiConsumer biConsumer) {
        this.f57662a = biConsumer;
    }

    /* renamed from: a */
    public static BinaryOperator m66671a(BiConsumer biConsumer) {
        return new DoublePipeline$$Lambda$15(biConsumer);
    }

    public Object apply(Object obj, Object obj2) {
        return this.f57662a.accept(obj, obj2);
    }
}
