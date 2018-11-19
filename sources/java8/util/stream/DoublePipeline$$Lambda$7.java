package java8.util.stream;

import java8.util.function.DoubleBinaryOperator;

final /* synthetic */ class DoublePipeline$$Lambda$7 implements DoubleBinaryOperator {
    /* renamed from: a */
    private static final DoublePipeline$$Lambda$7 f54549a = new DoublePipeline$$Lambda$7();

    private DoublePipeline$$Lambda$7() {
    }

    /* renamed from: a */
    public static DoubleBinaryOperator m63979a() {
        return f54549a;
    }

    public double applyAsDouble(double d, double d2) {
        return Math.min(d, d2);
    }
}
