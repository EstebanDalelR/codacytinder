package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.m4b.maps.aa.a */
abstract class C7395a<E> extends bx<E> {
    /* renamed from: a */
    private final int f27138a;
    /* renamed from: b */
    private int f27139b;

    /* renamed from: a */
    protected abstract E mo7519a(int i);

    protected C7395a(int i, int i2) {
        C5571j.m24300b(i2, i);
        this.f27138a = i;
        this.f27139b = i2;
    }

    public final boolean hasNext() {
        return this.f27139b < this.f27138a;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f27139b;
            this.f27139b = i + 1;
            return mo7519a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f27139b;
    }

    public final boolean hasPrevious() {
        return this.f27139b > 0;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f27139b - 1;
            this.f27139b = i;
            return mo7519a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f27139b - 1;
    }
}
