package java8.util;

import java8.util.function.Consumer;
import java8.util.function.LongConsumer;

final /* synthetic */ class Spliterators$OfLong$$Lambda$2 implements LongConsumer {
    /* renamed from: a */
    private final Consumer f54324a;

    private Spliterators$OfLong$$Lambda$2(Consumer consumer) {
        this.f54324a = consumer;
    }

    /* renamed from: a */
    public static LongConsumer m63880a(Consumer consumer) {
        return new Spliterators$OfLong$$Lambda$2(consumer);
    }

    public void accept(long j) {
        this.f54324a.accept(Long.valueOf(j));
    }
}
