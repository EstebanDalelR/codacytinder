package java8.util.stream;

import java8.util.function.Consumer;

final /* synthetic */ class StreamSpliterators$WrappingSpliterator$$Lambda$1 implements Consumer {
    /* renamed from: a */
    private final SpinedBuffer f54677a;

    private StreamSpliterators$WrappingSpliterator$$Lambda$1(SpinedBuffer spinedBuffer) {
        this.f54677a = spinedBuffer;
    }

    /* renamed from: a */
    public static Consumer m64116a(SpinedBuffer spinedBuffer) {
        return new StreamSpliterators$WrappingSpliterator$$Lambda$1(spinedBuffer);
    }

    public void accept(Object obj) {
        this.f54677a.accept(obj);
    }
}
