package com.google.android.m4b.maps.cf;

import com.google.android.m4b.maps.cf.C5108f.C5107a;

/* renamed from: com.google.android.m4b.maps.cf.h */
public abstract class C5113h {
    /* renamed from: a */
    public static final int f18999a = C5112a.values().length;
    /* renamed from: e */
    private static int f19000e = C5112a.TEXTURE0.m22800a();
    /* renamed from: b */
    protected boolean f19001b = false;
    /* renamed from: c */
    protected int f19002c = 0;
    /* renamed from: d */
    final C5112a f19003d;
    /* renamed from: f */
    private C5111g f19004f = null;

    /* renamed from: com.google.android.m4b.maps.cf.h$a */
    public enum C5112a {
        PICK(0),
        TEXTURE0(1),
        TEXTURE1(2),
        SHADER(3),
        STENCIL(4),
        POLYGON(5),
        BLEND(6);
        
        /* renamed from: h */
        private final int f18998h;

        /* renamed from: a */
        public final int m22800a() {
            return this.f18998h;
        }

        private C5112a(int i) {
            this.f18998h = i;
        }
    }

    protected C5113h(C5112a c5112a) {
        this.f19003d = c5112a;
    }

    /* renamed from: a */
    boolean mo5295a(C5111g c5111g, C5107a c5107a) {
        if (c5107a.f18965d == this.f19001b && !c5107a.f18966e) {
            return false;
        }
        if (!c5107a.f18965d && !c5107a.f18966e && this.f19002c != 0) {
            return false;
        }
        this.f19001b = c5107a.f18965d;
        if (this.f19001b == null) {
            c5111g = null;
        }
        this.f19004f = c5111g;
        return true;
    }

    /* renamed from: i */
    final void m22802i() {
        this.f19002c++;
    }

    /* renamed from: j */
    final void m22803j() {
        this.f19002c--;
    }
}
