package java8.util;

import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;

final /* synthetic */ class Spliterators$OfDouble$$Lambda$2 implements DoubleConsumer {
    /* renamed from: a */
    private final Consumer f54320a;

    private Spliterators$OfDouble$$Lambda$2(Consumer consumer) {
        this.f54320a = consumer;
    }

    /* renamed from: a */
    public static DoubleConsumer m63876a(Consumer consumer) {
        return new Spliterators$OfDouble$$Lambda$2(consumer);
    }

    public void accept(double d) {
        this.f54320a.accept(Double.valueOf(d));
    }
}
