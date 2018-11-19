package java8.util.stream;

import java8.util.function.BooleanSupplier;

final /* synthetic */ class StreamSpliterators$DoubleWrappingSpliterator$$Lambda$1 implements BooleanSupplier {
    /* renamed from: a */
    private final DoubleWrappingSpliterator f54667a;

    private StreamSpliterators$DoubleWrappingSpliterator$$Lambda$1(DoubleWrappingSpliterator doubleWrappingSpliterator) {
        this.f54667a = doubleWrappingSpliterator;
    }

    /* renamed from: a */
    public static BooleanSupplier m64102a(DoubleWrappingSpliterator doubleWrappingSpliterator) {
        return new StreamSpliterators$DoubleWrappingSpliterator$$Lambda$1(doubleWrappingSpliterator);
    }

    public boolean getAsBoolean() {
        return this.f54667a.m67882d();
    }
}
