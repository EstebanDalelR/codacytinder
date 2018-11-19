package java8.util.stream;

import java8.util.function.DoubleBinaryOperator;

final /* synthetic */ class DoublePipeline$$Lambda$8 implements DoubleBinaryOperator {
    /* renamed from: a */
    private static final DoublePipeline$$Lambda$8 f54550a = new DoublePipeline$$Lambda$8();

    private DoublePipeline$$Lambda$8() {
    }

    /* renamed from: a */
    public static DoubleBinaryOperator m63980a() {
        return f54550a;
    }

    public double applyAsDouble(double d, double d2) {
        return Math.max(d, d2);
    }
}
