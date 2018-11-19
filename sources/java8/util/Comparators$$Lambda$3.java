package java8.util;

import java.io.Serializable;
import java.util.Comparator;
import java8.lang.Integers;
import java8.util.function.ToIntFunction;

final /* synthetic */ class Comparators$$Lambda$3 implements Serializable, Comparator {
    /* renamed from: a */
    private final ToIntFunction f48711a;

    public int compare(Object obj, Object obj2) {
        return Integers.m59016a(this.f48711a.applyAsInt(obj), this.f48711a.applyAsInt(obj2));
    }
}
