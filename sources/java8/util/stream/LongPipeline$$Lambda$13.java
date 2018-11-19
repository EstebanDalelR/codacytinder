package java8.util.stream;

import java8.util.function.BiConsumer;
import java8.util.function.BinaryOperator;

final /* synthetic */ class LongPipeline$$Lambda$13 implements BinaryOperator {
    /* renamed from: a */
    private final BiConsumer f57675a;

    private LongPipeline$$Lambda$13(BiConsumer biConsumer) {
        this.f57675a = biConsumer;
    }

    /* renamed from: a */
    public static BinaryOperator m66733a(BiConsumer biConsumer) {
        return new LongPipeline$$Lambda$13(biConsumer);
    }

    public Object apply(Object obj, Object obj2) {
        return this.f57675a.accept(obj, obj2);
    }
}
