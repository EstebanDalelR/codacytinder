package java8.util.stream;

import java8.util.function.DoubleConsumer;

final /* synthetic */ class ReferencePipeline$9$1$$Lambda$1 implements DoubleConsumer {
    /* renamed from: a */
    private final Sink f54632a;

    private ReferencePipeline$9$1$$Lambda$1(Sink sink) {
        this.f54632a = sink;
    }

    /* renamed from: a */
    public static DoubleConsumer m64062a(Sink sink) {
        return new ReferencePipeline$9$1$$Lambda$1(sink);
    }

    public void accept(double d) {
        this.f54632a.accept(d);
    }
}
