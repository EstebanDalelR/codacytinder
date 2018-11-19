package java8.util.stream;

import java8.util.function.LongConsumer;

final /* synthetic */ class ReferencePipeline$10$1$$Lambda$1 implements LongConsumer {
    /* renamed from: a */
    private final Sink f54630a;

    private ReferencePipeline$10$1$$Lambda$1(Sink sink) {
        this.f54630a = sink;
    }

    /* renamed from: a */
    public static LongConsumer m64060a(Sink sink) {
        return new ReferencePipeline$10$1$$Lambda$1(sink);
    }

    public void accept(long j) {
        this.f54630a.accept(j);
    }
}
