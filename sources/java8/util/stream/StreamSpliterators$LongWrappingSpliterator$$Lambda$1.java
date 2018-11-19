package java8.util.stream;

import java8.util.function.BooleanSupplier;

final /* synthetic */ class StreamSpliterators$LongWrappingSpliterator$$Lambda$1 implements BooleanSupplier {
    /* renamed from: a */
    private final LongWrappingSpliterator f54670a;

    private StreamSpliterators$LongWrappingSpliterator$$Lambda$1(LongWrappingSpliterator longWrappingSpliterator) {
        this.f54670a = longWrappingSpliterator;
    }

    /* renamed from: a */
    public static BooleanSupplier m64104a(LongWrappingSpliterator longWrappingSpliterator) {
        return new StreamSpliterators$LongWrappingSpliterator$$Lambda$1(longWrappingSpliterator);
    }

    public boolean getAsBoolean() {
        return this.f54670a.m67898d();
    }
}
