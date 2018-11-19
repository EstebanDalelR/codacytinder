package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Iterator;
import java.util.Set;

final class br<E> extends al<E> {
    /* renamed from: a */
    private transient E f27204a;
    /* renamed from: b */
    private transient int f27205b;

    /* renamed from: d */
    final boolean mo4791d() {
        return false;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int size() {
        return 1;
    }

    br(E e) {
        this.f27204a = C5571j.m24292a((Object) e);
    }

    br(E e, int i) {
        this.f27204a = e;
        this.f27205b = i;
    }

    public final boolean contains(Object obj) {
        return this.f27204a.equals(obj);
    }

    /* renamed from: a */
    public final bw<E> mo4785a() {
        return at.m20506a(this.f27204a);
    }

    /* renamed from: a */
    final int mo4784a(Object[] objArr, int i) {
        objArr[i] = this.f27204a;
        return i + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        return set.size() == 1 && this.f27204a.equals(set.iterator().next()) != null;
    }

    public final int hashCode() {
        int i = this.f27205b;
        if (i != 0) {
            return i;
        }
        i = this.f27204a.hashCode();
        this.f27205b = i;
        return i;
    }

    /* renamed from: g */
    final boolean mo7005g() {
        return this.f27205b != 0;
    }

    public final String toString() {
        String obj = this.f27204a.toString();
        StringBuilder stringBuilder = new StringBuilder(obj.length() + 2);
        stringBuilder.append('[');
        stringBuilder.append(obj);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final /* synthetic */ Iterator iterator() {
        return at.m20506a(this.f27204a);
    }
}
