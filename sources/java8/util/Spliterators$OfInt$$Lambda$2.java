package java8.util;

import java8.util.function.Consumer;
import java8.util.function.IntConsumer;

final /* synthetic */ class Spliterators$OfInt$$Lambda$2 implements IntConsumer {
    /* renamed from: a */
    private final Consumer f54322a;

    private Spliterators$OfInt$$Lambda$2(Consumer consumer) {
        this.f54322a = consumer;
    }

    /* renamed from: a */
    public static IntConsumer m63878a(Consumer consumer) {
        return new Spliterators$OfInt$$Lambda$2(consumer);
    }

    public void accept(int i) {
        this.f54322a.accept(Integer.valueOf(i));
    }
}
