package java8.util.stream;

import java8.util.function.LongBinaryOperator;

final /* synthetic */ class LongPipeline$$Lambda$5 implements LongBinaryOperator {
    /* renamed from: a */
    private static final LongPipeline$$Lambda$5 f54589a = new LongPipeline$$Lambda$5();

    private LongPipeline$$Lambda$5() {
    }

    /* renamed from: a */
    public static LongBinaryOperator m64016a() {
        return f54589a;
    }

    public long applyAsLong(long j, long j2) {
        return Math.min(j, j2);
    }
}
