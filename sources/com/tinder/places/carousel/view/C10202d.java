package com.tinder.places.carousel.view;

import android.support.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tinder.places.carousel.view.d */
public class C10202d {
    /* renamed from: a */
    private int f33265a;
    /* renamed from: b */
    private C10203e[] f33266b;
    /* renamed from: c */
    private final List<WeakReference<C10203e>> f33267c = new ArrayList();

    C10202d() {
    }

    /* renamed from: a */
    void m41517a(int i) {
        if (this.f33266b == null || this.f33266b.length != i) {
            if (this.f33266b != null) {
                m41513a(this.f33266b);
            }
            this.f33266b = new C10203e[i];
            m41514c();
        }
    }

    /* renamed from: a */
    void m41518a(int i, int i2, float f) {
        if (i >= 0 && i < this.f33266b.length) {
            i = this.f33266b[i];
            i.m41523a(Integer.valueOf(i2));
            i.m41522a(Float.valueOf(f));
        }
    }

    /* renamed from: a */
    public int m41516a() {
        return this.f33265a;
    }

    /* renamed from: b */
    public void m41519b(int i) {
        this.f33265a = i;
    }

    /* renamed from: b */
    public C10203e[] m41520b() {
        return this.f33266b;
    }

    /* renamed from: a */
    private void m41513a(@NonNull C10203e... c10203eArr) {
        for (Object weakReference : c10203eArr) {
            this.f33267c.add(new WeakReference(weakReference));
        }
    }

    /* renamed from: c */
    private void m41514c() {
        int length = this.f33266b.length;
        for (int i = 0; i < length; i++) {
            if (this.f33266b[i] == null) {
                this.f33266b[i] = m41515d();
            }
        }
    }

    /* renamed from: d */
    private C10203e m41515d() {
        Iterator it = this.f33267c.iterator();
        while (it.hasNext()) {
            C10203e c10203e = (C10203e) ((WeakReference) it.next()).get();
            it.remove();
            if (c10203e != null) {
                return c10203e;
            }
        }
        return new C10203e();
    }
}
