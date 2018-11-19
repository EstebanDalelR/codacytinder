package java8.util.stream;

import java8.util.function.LongConsumer;

final /* synthetic */ class LongPipeline$$Lambda$1 implements LongConsumer {
    /* renamed from: a */
    private final Sink f54585a;

    private LongPipeline$$Lambda$1(Sink sink) {
        this.f54585a = sink;
    }

    /* renamed from: a */
    public static LongConsumer m64012a(Sink sink) {
        return new LongPipeline$$Lambda$1(sink);
    }

    public void accept(long j) {
        this.f54585a.accept(j);
    }
}
