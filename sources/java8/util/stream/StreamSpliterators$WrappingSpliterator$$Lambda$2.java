package java8.util.stream;

import java8.util.function.BooleanSupplier;

final /* synthetic */ class StreamSpliterators$WrappingSpliterator$$Lambda$2 implements BooleanSupplier {
    /* renamed from: a */
    private final WrappingSpliterator f54678a;

    private StreamSpliterators$WrappingSpliterator$$Lambda$2(WrappingSpliterator wrappingSpliterator) {
        this.f54678a = wrappingSpliterator;
    }

    /* renamed from: a */
    public static BooleanSupplier m64117a(WrappingSpliterator wrappingSpliterator) {
        return new StreamSpliterators$WrappingSpliterator$$Lambda$2(wrappingSpliterator);
    }

    public boolean getAsBoolean() {
        return this.f54678a.m66878d();
    }
}
