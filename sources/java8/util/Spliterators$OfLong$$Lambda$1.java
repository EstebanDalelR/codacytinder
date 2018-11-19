package java8.util;

import java8.util.function.Consumer;
import java8.util.function.LongConsumer;

final /* synthetic */ class Spliterators$OfLong$$Lambda$1 implements LongConsumer {
    /* renamed from: a */
    private final Consumer f54323a;

    private Spliterators$OfLong$$Lambda$1(Consumer consumer) {
        this.f54323a = consumer;
    }

    /* renamed from: a */
    public static LongConsumer m63879a(Consumer consumer) {
        return new Spliterators$OfLong$$Lambda$1(consumer);
    }

    public void accept(long j) {
        this.f54323a.accept(Long.valueOf(j));
    }
}
