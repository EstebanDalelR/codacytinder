package java8.util;

import java8.util.function.Consumer;
import java8.util.function.IntConsumer;

final /* synthetic */ class Spliterators$OfInt$$Lambda$1 implements IntConsumer {
    /* renamed from: a */
    private final Consumer f54321a;

    private Spliterators$OfInt$$Lambda$1(Consumer consumer) {
        this.f54321a = consumer;
    }

    /* renamed from: a */
    public static IntConsumer m63877a(Consumer consumer) {
        return new Spliterators$OfInt$$Lambda$1(consumer);
    }

    public void accept(int i) {
        this.f54321a.accept(Integer.valueOf(i));
    }
}
