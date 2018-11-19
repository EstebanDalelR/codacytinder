package java8.util.stream;

import java8.util.function.IntBinaryOperator;

final /* synthetic */ class IntPipeline$$Lambda$6 implements IntBinaryOperator {
    /* renamed from: a */
    private static final IntPipeline$$Lambda$6 f54576a = new IntPipeline$$Lambda$6();

    private IntPipeline$$Lambda$6() {
    }

    /* renamed from: a */
    public static IntBinaryOperator m64003a() {
        return f54576a;
    }

    public int applyAsInt(int i, int i2) {
        return Math.max(i, i2);
    }
}
