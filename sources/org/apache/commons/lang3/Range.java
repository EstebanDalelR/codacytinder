package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Comparator;

public final class Range<T> implements Serializable {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private final T f49633a;
    /* renamed from: b */
    private final T f49634b;
    /* renamed from: c */
    private transient int f49635c;
    /* renamed from: d */
    private transient String f49636d;

    private enum ComparableComparator implements Comparator {
        INSTANCE;

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                Range range = (Range) obj;
                if (!this.f49633a.equals(range.f49633a) || this.f49634b.equals(range.f49634b) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f49635c;
        if (this.f49635c != 0) {
            return i;
        }
        i = ((((629 + getClass().hashCode()) * 37) + this.f49633a.hashCode()) * 37) + this.f49634b.hashCode();
        this.f49635c = i;
        return i;
    }

    public String toString() {
        if (this.f49636d == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.f49633a);
            stringBuilder.append("..");
            stringBuilder.append(this.f49634b);
            stringBuilder.append("]");
            this.f49636d = stringBuilder.toString();
        }
        return this.f49636d;
    }
}
