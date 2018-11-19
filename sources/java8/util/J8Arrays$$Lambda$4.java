package java8.util;

import java8.util.function.IntConsumer;
import java8.util.function.IntToDoubleFunction;

final /* synthetic */ class J8Arrays$$Lambda$4 implements IntConsumer {
    /* renamed from: a */
    private final double[] f54236a;
    /* renamed from: b */
    private final IntToDoubleFunction f54237b;

    public void accept(int i) {
        this.f54236a[i] = this.f54237b.applyAsDouble(i);
    }
}
