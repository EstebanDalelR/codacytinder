package java8.util.stream;

import java8.util.function.DoubleConsumer;

final /* synthetic */ class DoublePipeline$$Lambda$1 implements DoubleConsumer {
    /* renamed from: a */
    private final Sink f54543a;

    private DoublePipeline$$Lambda$1(Sink sink) {
        this.f54543a = sink;
    }

    /* renamed from: a */
    public static DoubleConsumer m63973a(Sink sink) {
        return new DoublePipeline$$Lambda$1(sink);
    }

    public void accept(double d) {
        this.f54543a.accept(d);
    }
}
