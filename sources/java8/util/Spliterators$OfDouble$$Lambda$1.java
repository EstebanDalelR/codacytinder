package java8.util;

import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;

final /* synthetic */ class Spliterators$OfDouble$$Lambda$1 implements DoubleConsumer {
    /* renamed from: a */
    private final Consumer f54319a;

    private Spliterators$OfDouble$$Lambda$1(Consumer consumer) {
        this.f54319a = consumer;
    }

    /* renamed from: a */
    public static DoubleConsumer m63875a(Consumer consumer) {
        return new Spliterators$OfDouble$$Lambda$1(consumer);
    }

    public void accept(double d) {
        this.f54319a.accept(Double.valueOf(d));
    }
}
