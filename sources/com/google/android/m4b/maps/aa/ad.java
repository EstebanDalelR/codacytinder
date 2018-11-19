package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

final class ad<E extends Enum<E>> extends al<E> {
    /* renamed from: a */
    private final transient EnumSet<E> f27141a;
    /* renamed from: b */
    private transient int f27142b;

    /* renamed from: com.google.android.m4b.maps.aa.ad$a */
    static class C4538a<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private EnumSet<E> f16853a;

        C4538a(EnumSet<E> enumSet) {
            this.f16853a = enumSet;
        }

        final Object readResolve() {
            return new ad(this.f16853a.clone());
        }
    }

    /* renamed from: d */
    final boolean mo4791d() {
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo4785a();
    }

    /* renamed from: a */
    static <E extends Enum<E>> al<E> m31821a(EnumSet<E> enumSet) {
        switch (enumSet.size()) {
            case 0:
                return C7420m.f27214a;
            case 1:
                return al.m27700a(as.m20502a(enumSet));
            default:
                return new ad(enumSet);
        }
    }

    private ad(EnumSet<E> enumSet) {
        this.f27141a = enumSet;
    }

    /* renamed from: a */
    public final bw<E> mo4785a() {
        return at.m20507a(this.f27141a.iterator());
    }

    public final int size() {
        return this.f27141a.size();
    }

    public final boolean contains(Object obj) {
        return this.f27141a.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f27141a.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.f27141a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (this.f27141a.equals(obj) == null) {
                return null;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f27142b;
        if (i != 0) {
            return i;
        }
        i = this.f27141a.hashCode();
        this.f27142b = i;
        return i;
    }

    public final String toString() {
        return this.f27141a.toString();
    }

    final Object writeReplace() {
        return new C4538a(this.f27141a);
    }
}
