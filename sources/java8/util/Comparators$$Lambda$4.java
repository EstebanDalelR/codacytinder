package java8.util;

import java.io.Serializable;
import java.util.Comparator;
import java8.lang.Longs;
import java8.util.function.ToLongFunction;

final /* synthetic */ class Comparators$$Lambda$4 implements Serializable, Comparator {
    /* renamed from: a */
    private final ToLongFunction f48712a;

    public int compare(Object obj, Object obj2) {
        return Longs.m59021a(this.f48712a.applyAsLong(obj), this.f48712a.applyAsLong(obj2));
    }
}
