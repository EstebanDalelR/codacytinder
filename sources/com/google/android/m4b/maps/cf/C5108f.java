package com.google.android.m4b.maps.cf;

import java.lang.reflect.Array;

/* renamed from: com.google.android.m4b.maps.cf.f */
public class C5108f {
    /* renamed from: a */
    volatile C5121t f18967a = new C5121t();
    /* renamed from: b */
    protected boolean f18968b = true;
    /* renamed from: c */
    protected boolean f18969c = false;
    /* renamed from: d */
    private final C5113h[][] f18970d = ((C5113h[][]) Array.newInstance(C5113h.class, new int[]{5, C5113h.f18999a}));
    /* renamed from: e */
    private final C5122u[] f18971e = new C5122u[5];
    /* renamed from: f */
    private C5121t[] f18972f = new C5121t[5];
    /* renamed from: g */
    private int[] f18973g = new int[5];
    /* renamed from: h */
    private float[][] f18974h = new float[5][];
    /* renamed from: i */
    private byte f18975i = (byte) 0;
    /* renamed from: j */
    private byte f18976j = (byte) -1;
    /* renamed from: k */
    private C5111g f18977k;

    /* renamed from: com.google.android.m4b.maps.cf.f$a */
    public enum C5107a {
        NOT_LIVE(false, false),
        NOT_LIVE_WITH_NEW_CONTEXT(false, true),
        LIVE(true, false),
        LIVE_WITH_NEW_CONTEXT(true, true);
        
        /* renamed from: d */
        public final boolean f18965d;
        /* renamed from: e */
        public final boolean f18966e;

        private C5107a(boolean z, boolean z2) {
            this.f18965d = z;
            this.f18966e = z2;
        }
    }

    /* renamed from: a */
    final boolean m22789a(C5111g c5111g, C5107a c5107a) {
        if (c5107a.f18965d == this.f18969c && !c5107a.f18966e) {
            return false;
        }
        this.f18977k = c5111g;
        C5122u[] c5122uArr = this.f18971e;
        for (int i = 0; i < 5; i++) {
            C5122u c5122u = c5122uArr[i];
            if (c5122u != null) {
                if (!c5107a.f18966e) {
                    if (c5107a.f18965d) {
                        c5122u.m22821b();
                    } else {
                        c5122u.m22819a();
                    }
                }
                c5122u.mo5294a(c5111g, c5107a);
            }
        }
        C5111g.m22796a("Entity", "vertex data setLive");
        for (C5113h[] c5113hArr : this.f18970d) {
            for (C5113h c5113h : r0[r3]) {
                if (c5113h != null) {
                    if (!c5107a.f18966e) {
                        if (c5107a.f18965d) {
                            c5113h.m22802i();
                        } else {
                            c5113h.m22803j();
                        }
                    }
                    c5113h.mo5295a(c5111g, c5107a);
                }
            }
        }
        C5111g.m22796a("Entity", "entity state setLive");
        this.f18969c = c5107a.f18965d;
        return true;
    }
}
