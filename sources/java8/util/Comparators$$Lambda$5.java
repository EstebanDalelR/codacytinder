package java8.util;

import java.io.Serializable;
import java.util.Comparator;
import java8.util.function.ToDoubleFunction;

final /* synthetic */ class Comparators$$Lambda$5 implements Serializable, Comparator {
    /* renamed from: a */
    private final ToDoubleFunction f48713a;

    public int compare(Object obj, Object obj2) {
        return Double.compare(this.f48713a.applyAsDouble(obj), this.f48713a.applyAsDouble(obj2));
    }
}
