package java8.util.stream;

import java8.util.function.BiConsumer;
import java8.util.function.BinaryOperator;

final /* synthetic */ class IntPipeline$$Lambda$13 implements BinaryOperator {
    /* renamed from: a */
    private final BiConsumer f57674a;

    private IntPipeline$$Lambda$13(BiConsumer biConsumer) {
        this.f57674a = biConsumer;
    }

    /* renamed from: a */
    public static BinaryOperator m66708a(BiConsumer biConsumer) {
        return new IntPipeline$$Lambda$13(biConsumer);
    }

    public Object apply(Object obj, Object obj2) {
        return this.f57674a.accept(obj, obj2);
    }
}
