package java8.util;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

public final class Comparators {

    private enum NaturalOrderComparator implements Comparator<Comparable<Object>> {
        INSTANCE;

        public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
            return comparable.compareTo(comparable2);
        }

        public Comparator<Comparable<Object>> reversed() {
            return Comparators.m59037a();
        }
    }

    private static final class NullComparator<T> implements Serializable, Comparator<T> {
        private static final long serialVersionUID = -7569533591570686392L;
        /* renamed from: a */
        private final boolean f48716a;
        /* renamed from: b */
        private final Comparator<T> f48717b;

        NullComparator(boolean z, Comparator<? super T> comparator) {
            this.f48716a = z;
            this.f48717b = comparator;
        }

        public int compare(T t, T t2) {
            int i = 1;
            int i2 = 0;
            if (t == null) {
                if (t2 == null) {
                    i = 0;
                } else if (this.f48716a != null) {
                    i = -1;
                }
                return i;
            } else if (t2 == null) {
                if (this.f48716a == null) {
                    i = -1;
                }
                return i;
            } else {
                if (this.f48717b != null) {
                    i2 = this.f48717b.compare(t, t2);
                }
                return i2;
            }
        }

        public Comparator<T> thenComparing(Comparator<? super T> comparator) {
            Objects.m59115b(comparator);
            boolean z = this.f48716a;
            if (this.f48717b != null) {
                comparator = Comparators.m59038a(this.f48717b, comparator);
            }
            return new NullComparator(z, comparator);
        }

        public Comparator<T> reversed() {
            return new NullComparator(this.f48716a ^ 1, this.f48717b == null ? null : Collections.reverseOrder(this.f48717b));
        }
    }

    /* renamed from: a */
    public static <T extends Comparable<? super T>> Comparator<T> m59037a() {
        return Collections.reverseOrder();
    }

    /* renamed from: b */
    public static <T extends Comparable<? super T>> Comparator<T> m59045b() {
        return NaturalOrderComparator.INSTANCE;
    }

    /* renamed from: a */
    public static <T> Comparator<T> m59038a(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        Objects.m59115b(comparator);
        Objects.m59115b(comparator2);
        if (comparator instanceof NullComparator) {
            return ((NullComparator) comparator).thenComparing(comparator2);
        }
        return (Comparator) ((Serializable) Comparators$$Lambda$6.m59030a(comparator, comparator2));
    }

    /* renamed from: b */
    private static /* synthetic */ int m59039b(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        comparator = comparator.compare(obj, obj2);
        return comparator != null ? comparator : comparator2.compare(obj, obj2);
    }

    private Comparators() {
    }
}
