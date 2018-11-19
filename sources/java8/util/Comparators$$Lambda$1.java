package java8.util;

import java.io.Serializable;
import java.util.Comparator;
import java8.util.function.Function;

final /* synthetic */ class Comparators$$Lambda$1 implements Serializable, Comparator {
    /* renamed from: a */
    private final Comparator f48708a;
    /* renamed from: b */
    private final Function f48709b;

    public int compare(Object obj, Object obj2) {
        return this.f48708a.compare(this.f48709b.apply(obj), this.f48709b.apply(obj2));
    }
}
