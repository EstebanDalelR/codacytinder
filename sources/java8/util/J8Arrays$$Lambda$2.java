package java8.util;

import java8.util.function.IntConsumer;
import java8.util.function.IntUnaryOperator;

final /* synthetic */ class J8Arrays$$Lambda$2 implements IntConsumer {
    /* renamed from: a */
    private final int[] f54232a;
    /* renamed from: b */
    private final IntUnaryOperator f54233b;

    public void accept(int i) {
        this.f54232a[i] = this.f54233b.applyAsInt(i);
    }
}
