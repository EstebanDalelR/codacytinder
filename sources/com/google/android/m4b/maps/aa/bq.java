package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Iterator;
import java.util.List;

final class bq<E> extends ae<E> {
    /* renamed from: a */
    private transient E f27203a;

    /* renamed from: d */
    final boolean mo4791d() {
        return false;
    }

    /* renamed from: f */
    public final ae<E> mo6982f() {
        return this;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int size() {
        return 1;
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return mo6981a(i, i2);
    }

    bq(E e) {
        this.f27203a = C5571j.m24292a((Object) e);
    }

    public final E get(int i) {
        C5571j.m24291a(i, 1);
        return this.f27203a;
    }

    public final int indexOf(Object obj) {
        return this.f27203a.equals(obj) != null ? null : -1;
    }

    /* renamed from: a */
    public final bw<E> mo4785a() {
        return at.m20506a(this.f27203a);
    }

    public final int lastIndexOf(Object obj) {
        return indexOf(obj);
    }

    /* renamed from: a */
    public final ae<E> mo6981a(int i, int i2) {
        C5571j.m24296a(i, i2, 1);
        return i == i2 ? ae.m27685e() : this;
    }

    public final boolean contains(Object obj) {
        return this.f27203a.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        return list.size() == 1 && this.f27203a.equals(list.get(0)) != null;
    }

    public final int hashCode() {
        return this.f27203a.hashCode() + 31;
    }

    public final String toString() {
        String obj = this.f27203a.toString();
        StringBuilder stringBuilder = new StringBuilder(obj.length() + 2);
        stringBuilder.append('[');
        stringBuilder.append(obj);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    final int mo4784a(Object[] objArr, int i) {
        objArr[i] = this.f27203a;
        return i + 1;
    }

    public final /* synthetic */ Iterator iterator() {
        return at.m20506a(this.f27203a);
    }
}
