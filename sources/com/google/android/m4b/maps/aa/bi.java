package com.google.android.m4b.maps.aa;

import java.util.Iterator;

final class bi<E> extends al<E> {
    /* renamed from: a */
    private final Object[] f27196a;
    /* renamed from: b */
    private transient Object[] f27197b;
    /* renamed from: c */
    private final transient int f27198c;
    /* renamed from: d */
    private final transient int f27199d;

    /* renamed from: d */
    final boolean mo4791d() {
        return false;
    }

    /* renamed from: g */
    final boolean mo7005g() {
        return true;
    }

    bi(Object[] objArr, int i, Object[] objArr2, int i2) {
        this.f27196a = objArr;
        this.f27197b = objArr2;
        this.f27198c = i2;
        this.f27199d = i;
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int a = C4588x.m20678a(obj.hashCode());
        while (true) {
            Object obj2 = this.f27197b[this.f27198c & a];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a++;
        }
    }

    public final int size() {
        return this.f27196a.length;
    }

    /* renamed from: a */
    public final bw<E> mo4785a() {
        return at.m20509a(this.f27196a);
    }

    /* renamed from: a */
    final int mo4784a(Object[] objArr, int i) {
        System.arraycopy(this.f27196a, 0, objArr, i, this.f27196a.length);
        return i + this.f27196a.length;
    }

    /* renamed from: c */
    final ae<E> mo4790c() {
        return new be((aa) this, this.f27196a);
    }

    public final int hashCode() {
        return this.f27199d;
    }

    public final /* synthetic */ Iterator iterator() {
        return at.m20509a(this.f27196a);
    }
}
