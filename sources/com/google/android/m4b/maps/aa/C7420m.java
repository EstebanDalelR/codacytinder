package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.aa.m */
final class C7420m extends al<Object> {
    /* renamed from: a */
    static final C7420m f27214a = new C7420m();
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final int mo4784a(Object[] objArr, int i) {
        return i;
    }

    public final boolean contains(Object obj) {
        return false;
    }

    /* renamed from: d */
    final boolean mo4791d() {
        return false;
    }

    /* renamed from: g */
    final boolean mo7005g() {
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final int size() {
        return 0;
    }

    public final String toString() {
        return "[]";
    }

    private C7420m() {
    }

    public final boolean containsAll(Collection<?> collection) {
        return collection.isEmpty();
    }

    /* renamed from: a */
    public final bw<Object> mo4785a() {
        return at.m20505a();
    }

    /* renamed from: b */
    public final ae<Object> mo4786b() {
        return ae.m27685e();
    }

    public final boolean equals(Object obj) {
        return obj instanceof Set ? ((Set) obj).isEmpty() : null;
    }

    final Object readResolve() {
        return f27214a;
    }

    public final /* synthetic */ Iterator iterator() {
        return at.m20505a();
    }
}
