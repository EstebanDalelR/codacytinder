package java8.util.stream;

import java8.util.function.IntBinaryOperator;

final /* synthetic */ class IntPipeline$$Lambda$5 implements IntBinaryOperator {
    /* renamed from: a */
    private static final IntPipeline$$Lambda$5 f54575a = new IntPipeline$$Lambda$5();

    private IntPipeline$$Lambda$5() {
    }

    /* renamed from: a */
    public static IntBinaryOperator m64002a() {
        return f54575a;
    }

    public int applyAsInt(int i, int i2) {
        return Math.min(i, i2);
    }
}
