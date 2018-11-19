package java8.util.stream;

import java8.util.function.ToDoubleFunction;

final /* synthetic */ class DoublePipeline$$Lambda$3 implements ToDoubleFunction {
    /* renamed from: a */
    private static final DoublePipeline$$Lambda$3 f54545a = new DoublePipeline$$Lambda$3();

    private DoublePipeline$$Lambda$3() {
    }

    /* renamed from: a */
    public static ToDoubleFunction m63975a() {
        return f54545a;
    }

    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }
}
