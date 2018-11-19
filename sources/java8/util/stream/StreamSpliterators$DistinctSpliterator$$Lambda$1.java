package java8.util.stream;

import java8.util.function.Consumer;

final /* synthetic */ class StreamSpliterators$DistinctSpliterator$$Lambda$1 implements Consumer {
    /* renamed from: a */
    private final DistinctSpliterator f54661a;
    /* renamed from: b */
    private final Consumer f54662b;

    private StreamSpliterators$DistinctSpliterator$$Lambda$1(DistinctSpliterator distinctSpliterator, Consumer consumer) {
        this.f54661a = distinctSpliterator;
        this.f54662b = consumer;
    }

    /* renamed from: a */
    public static Consumer m64098a(DistinctSpliterator distinctSpliterator, Consumer consumer) {
        return new StreamSpliterators$DistinctSpliterator$$Lambda$1(distinctSpliterator, consumer);
    }

    public void accept(Object obj) {
        this.f54661a.m64100a(this.f54662b, obj);
    }
}
