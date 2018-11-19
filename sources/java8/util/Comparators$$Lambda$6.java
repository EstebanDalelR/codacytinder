package java8.util;

import java.io.Serializable;
import java.util.Comparator;

final /* synthetic */ class Comparators$$Lambda$6 implements Serializable, Comparator {
    /* renamed from: a */
    private final Comparator f48714a;
    /* renamed from: b */
    private final Comparator f48715b;

    private Comparators$$Lambda$6(Comparator comparator, Comparator comparator2) {
        this.f48714a = comparator;
        this.f48715b = comparator2;
    }

    /* renamed from: a */
    public static Comparator m59030a(Comparator comparator, Comparator comparator2) {
        return new Comparators$$Lambda$6(comparator, comparator2);
    }

    public int compare(Object obj, Object obj2) {
        return Comparators.m59039b(this.f48714a, this.f48715b, obj, obj2);
    }
}
