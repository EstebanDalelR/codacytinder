package java8.util;

import java8.util.function.IntConsumer;
import java8.util.function.IntToLongFunction;

final /* synthetic */ class J8Arrays$$Lambda$3 implements IntConsumer {
    /* renamed from: a */
    private final long[] f54234a;
    /* renamed from: b */
    private final IntToLongFunction f54235b;

    public void accept(int i) {
        this.f54234a[i] = this.f54235b.applyAsLong(i);
    }
}
