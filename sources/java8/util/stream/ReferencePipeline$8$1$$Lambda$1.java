package java8.util.stream;

import java8.util.function.IntConsumer;

final /* synthetic */ class ReferencePipeline$8$1$$Lambda$1 implements IntConsumer {
    /* renamed from: a */
    private final Sink f54631a;

    private ReferencePipeline$8$1$$Lambda$1(Sink sink) {
        this.f54631a = sink;
    }

    /* renamed from: a */
    public static IntConsumer m64061a(Sink sink) {
        return new ReferencePipeline$8$1$$Lambda$1(sink);
    }

    public void accept(int i) {
        this.f54631a.accept(i);
    }
}
