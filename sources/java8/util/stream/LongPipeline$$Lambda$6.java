package java8.util.stream;

import java8.util.function.LongBinaryOperator;

final /* synthetic */ class LongPipeline$$Lambda$6 implements LongBinaryOperator {
    /* renamed from: a */
    private static final LongPipeline$$Lambda$6 f54590a = new LongPipeline$$Lambda$6();

    private LongPipeline$$Lambda$6() {
    }

    /* renamed from: a */
    public static LongBinaryOperator m64017a() {
        return f54590a;
    }

    public long applyAsLong(long j, long j2) {
        return Math.max(j, j2);
    }
}
