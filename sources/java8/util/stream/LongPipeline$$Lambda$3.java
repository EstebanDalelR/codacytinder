package java8.util.stream;

import java8.util.function.ToLongFunction;

final /* synthetic */ class LongPipeline$$Lambda$3 implements ToLongFunction {
    /* renamed from: a */
    private static final LongPipeline$$Lambda$3 f54587a = new LongPipeline$$Lambda$3();

    private LongPipeline$$Lambda$3() {
    }

    /* renamed from: a */
    public static ToLongFunction m64014a() {
        return f54587a;
    }

    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }
}
