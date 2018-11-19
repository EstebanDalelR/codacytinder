package java8.util.stream;

import java8.util.function.IntConsumer;

final /* synthetic */ class IntPipeline$$Lambda$1 implements IntConsumer {
    /* renamed from: a */
    private final Sink f54571a;

    private IntPipeline$$Lambda$1(Sink sink) {
        this.f54571a = sink;
    }

    /* renamed from: a */
    public static IntConsumer m63998a(Sink sink) {
        return new IntPipeline$$Lambda$1(sink);
    }

    public void accept(int i) {
        this.f54571a.accept(i);
    }
}
