package java8.util;

import java8.util.function.IntConsumer;
import java8.util.function.IntFunction;

final /* synthetic */ class J8Arrays$$Lambda$1 implements IntConsumer {
    /* renamed from: a */
    private final Object[] f54230a;
    /* renamed from: b */
    private final IntFunction f54231b;

    public void accept(int i) {
        this.f54230a[i] = this.f54231b.apply(i);
    }
}
