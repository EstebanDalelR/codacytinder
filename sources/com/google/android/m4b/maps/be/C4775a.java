package com.google.android.m4b.maps.be;

import java.util.LinkedList;

/* renamed from: com.google.android.m4b.maps.be.a */
public class C4775a<T> {
    /* renamed from: a */
    protected final LinkedList<T> f17450a = new LinkedList();
    /* renamed from: b */
    protected int f17451b;
    /* renamed from: c */
    public T f17452c;
    /* renamed from: d */
    public int f17453d;
    /* renamed from: e */
    private final C4777c<T> f17454e;
    /* renamed from: f */
    private final int f17455f;
    /* renamed from: g */
    private final int f17456g;
    /* renamed from: h */
    private final int f17457h;
    /* renamed from: i */
    private int f17458i;

    public C4775a(int i, int i2, C4777c<T> c4777c) {
        this.f17457h = i2;
        this.f17455f = 1 << i2;
        this.f17456g = this.f17455f - 1;
        this.f17454e = c4777c;
        this.f17458i = m21153d(i);
        m21155a();
    }

    /* renamed from: a */
    public final void m21155a() {
        this.f17451b = 0;
        this.f17453d = 0;
        this.f17452c = m21154a(0);
    }

    /* renamed from: d */
    private int m21153d(int i) {
        return (i >> this.f17457h) + ((i & this.f17456g) != 0 ? 1 : 0);
    }

    /* renamed from: a */
    public final T m21154a(int i) {
        if (i > this.f17458i) {
            int i2 = this.f17458i;
            StringBuilder stringBuilder = new StringBuilder(59);
            stringBuilder.append("Index out of bound : ");
            stringBuilder.append(i);
            stringBuilder.append("(index) > ");
            stringBuilder.append(i2);
            stringBuilder.append("(size)");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        while (i >= this.f17450a.size()) {
            this.f17450a.add(this.f17454e.m21164b());
        }
        return this.f17450a.get(i);
    }

    /* renamed from: b */
    public final void m21158b(int i) {
        if (i >= this.f17455f) {
            i &= this.f17456g;
            this.f17451b++;
            if (this.f17451b != this.f17458i) {
                Object obj = this.f17452c;
                this.f17452c = m21154a(this.f17451b);
                if (i != 0) {
                    System.arraycopy(obj, this.f17455f, this.f17452c, 0, i);
                }
            }
            this.f17453d = i;
            return;
        }
        this.f17453d = i;
    }

    /* renamed from: a */
    public final void m21156a(T t, int i) {
        m21155a();
        int i2 = 0;
        while (i2 < i) {
            int i3 = this.f17455f;
            if (this.f17455f + i2 > i) {
                i3 = i - i2;
            }
            System.arraycopy(t, i2, m21154a(this.f17451b), 0, i3);
            i2 += i3;
            if (i3 == this.f17455f) {
                this.f17451b++;
                this.f17453d = 0;
            } else {
                this.f17453d = i3;
            }
        }
    }

    /* renamed from: c */
    public final void m21160c(int i) {
        this.f17458i = Math.max(m21153d(i), this.f17458i);
    }

    /* renamed from: b */
    public final int m21157b() {
        return this.f17450a.size() << this.f17457h;
    }

    /* renamed from: c */
    public final void m21159c() {
        this.f17454e.m21163a(this.f17450a);
        this.f17450a.clear();
    }
}
