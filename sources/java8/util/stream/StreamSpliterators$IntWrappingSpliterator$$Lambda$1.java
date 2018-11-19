package java8.util.stream;

import java8.util.function.BooleanSupplier;

final /* synthetic */ class StreamSpliterators$IntWrappingSpliterator$$Lambda$1 implements BooleanSupplier {
    /* renamed from: a */
    private final IntWrappingSpliterator f54669a;

    private StreamSpliterators$IntWrappingSpliterator$$Lambda$1(IntWrappingSpliterator intWrappingSpliterator) {
        this.f54669a = intWrappingSpliterator;
    }

    /* renamed from: a */
    public static BooleanSupplier m64103a(IntWrappingSpliterator intWrappingSpliterator) {
        return new StreamSpliterators$IntWrappingSpliterator$$Lambda$1(intWrappingSpliterator);
    }

    public boolean getAsBoolean() {
        return this.f54669a.m67890d();
    }
}
