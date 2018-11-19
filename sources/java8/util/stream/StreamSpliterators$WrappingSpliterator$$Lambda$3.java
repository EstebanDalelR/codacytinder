package java8.util.stream;

import java8.util.function.Consumer;

final /* synthetic */ class StreamSpliterators$WrappingSpliterator$$Lambda$3 implements Consumer {
    /* renamed from: a */
    private final Consumer f54679a;

    private StreamSpliterators$WrappingSpliterator$$Lambda$3(Consumer consumer) {
        this.f54679a = consumer;
    }

    /* renamed from: a */
    public static Consumer m64118a(Consumer consumer) {
        return new StreamSpliterators$WrappingSpliterator$$Lambda$3(consumer);
    }

    public void accept(Object obj) {
        this.f54679a.accept(obj);
    }
}
