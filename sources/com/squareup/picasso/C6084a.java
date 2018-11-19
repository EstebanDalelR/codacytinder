package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.Picasso.Priority;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a */
abstract class C6084a<T> {
    /* renamed from: a */
    final Picasso f22334a;
    /* renamed from: b */
    final C6104o f22335b;
    /* renamed from: c */
    final WeakReference<T> f22336c;
    /* renamed from: d */
    final boolean f22337d;
    /* renamed from: e */
    final int f22338e;
    /* renamed from: f */
    final int f22339f;
    /* renamed from: g */
    final int f22340g;
    /* renamed from: h */
    final Drawable f22341h;
    /* renamed from: i */
    final String f22342i;
    /* renamed from: j */
    final Object f22343j;
    /* renamed from: k */
    boolean f22344k;
    /* renamed from: l */
    boolean f22345l;

    /* renamed from: com.squareup.picasso.a$a */
    static class C6083a<M> extends WeakReference<M> {
        /* renamed from: a */
        final C6084a f22333a;

        public C6083a(C6084a c6084a, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f22333a = c6084a;
        }
    }

    /* renamed from: a */
    abstract void mo6579a();

    /* renamed from: a */
    abstract void mo6580a(Bitmap bitmap, LoadedFrom loadedFrom);

    C6084a(Picasso picasso, T t, C6104o c6104o, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.f22334a = picasso;
        this.f22335b = c6104o;
        if (t == null) {
            picasso = null;
        } else {
            picasso = new C6083a(this, t, picasso.f22324i);
        }
        this.f22336c = picasso;
        this.f22338e = i;
        this.f22339f = i2;
        this.f22337d = z;
        this.f22340g = i3;
        this.f22341h = drawable;
        this.f22342i = str;
        if (obj == null) {
            obj = this;
        }
        this.f22343j = obj;
    }

    /* renamed from: b */
    void mo6581b() {
        this.f22345l = true;
    }

    /* renamed from: c */
    C6104o m26441c() {
        return this.f22335b;
    }

    /* renamed from: d */
    T m26442d() {
        return this.f22336c == null ? null : this.f22336c.get();
    }

    /* renamed from: e */
    String m26443e() {
        return this.f22342i;
    }

    /* renamed from: f */
    boolean m26444f() {
        return this.f22345l;
    }

    /* renamed from: g */
    boolean m26445g() {
        return this.f22344k;
    }

    /* renamed from: h */
    int m26446h() {
        return this.f22338e;
    }

    /* renamed from: i */
    int m26447i() {
        return this.f22339f;
    }

    /* renamed from: j */
    Picasso m26448j() {
        return this.f22334a;
    }

    /* renamed from: k */
    Priority m26449k() {
        return this.f22335b.f22444r;
    }

    /* renamed from: l */
    Object m26450l() {
        return this.f22343j;
    }
}
