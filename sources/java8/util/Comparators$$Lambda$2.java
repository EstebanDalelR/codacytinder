package java8.util;

import java.io.Serializable;
import java.util.Comparator;
import java8.util.function.Function;

final /* synthetic */ class Comparators$$Lambda$2 implements Serializable, Comparator {
    /* renamed from: a */
    private final Function f48710a;

    public int compare(Object obj, Object obj2) {
        return ((Comparable) this.f48710a.apply(obj)).compareTo(this.f48710a.apply(obj2));
    }
}
