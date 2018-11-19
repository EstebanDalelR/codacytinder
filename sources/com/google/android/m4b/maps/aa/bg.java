package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.ListIterator;

final class bg<E> extends ae<E> {
    /* renamed from: a */
    private final transient int f27193a;
    /* renamed from: b */
    private final transient int f27194b;
    /* renamed from: c */
    private final transient Object[] f27195c;

    public final /* synthetic */ ListIterator listIterator(int i) {
        return mo7003a(i);
    }

    private bg(Object[] objArr, int i, int i2) {
        this.f27193a = i;
        this.f27194b = i2;
        this.f27195c = objArr;
    }

    bg(Object[] objArr) {
        this(objArr, 0, objArr.length);
    }

    public final int size() {
        return this.f27194b;
    }

    /* renamed from: d */
    final boolean mo4791d() {
        return this.f27194b != this.f27195c.length;
    }

    /* renamed from: a */
    final int mo4784a(Object[] objArr, int i) {
        System.arraycopy(this.f27195c, this.f27193a, objArr, i, this.f27194b);
        return i + this.f27194b;
    }

    public final E get(int i) {
        C5571j.m24291a(i, this.f27194b);
        return this.f27195c[i + this.f27193a];
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = 0; i < this.f27194b; i++) {
            if (this.f27195c[this.f27193a + i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = this.f27194b - 1; i >= 0; i--) {
            if (this.f27195c[this.f27193a + i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    final ae<E> mo7004b(int i, int i2) {
        return new bg(this.f27195c, this.f27193a + i, i2 - i);
    }

    /* renamed from: a */
    public final bx<E> mo7003a(int i) {
        return at.m20510a(this.f27195c, this.f27193a, this.f27194b, i);
    }
}
