package com.google.android.m4b.maps.cf;

import android.opengl.GLES20;
import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.cf.C5108f.C5107a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.cf.o */
public class C5118o {
    /* renamed from: a */
    private int f19011a = 0;
    /* renamed from: b */
    private int f19012b = 0;
    /* renamed from: c */
    private Object f19013c = new Object();
    /* renamed from: d */
    private int f19014d = 0;
    /* renamed from: e */
    private int f19015e = 0;
    /* renamed from: f */
    private volatile boolean f19016f = true;
    /* renamed from: g */
    private boolean f19017g = false;
    /* renamed from: h */
    private float[] f19018h = new float[4];
    /* renamed from: i */
    private final List<C5106e> f19019i = new ArrayList();

    public C5118o() {
        if (this.f19017g) {
            C6591d.m29456b();
        }
        this.f19018h[0] = 0.0f;
        this.f19018h[1] = 0.0f;
        this.f19018h[2] = 0.0f;
        this.f19018h[3] = 1.0f;
    }

    /* renamed from: b */
    public final int m22811b() {
        return this.f19014d;
    }

    /* renamed from: c */
    public final int m22813c() {
        return this.f19015e;
    }

    /* renamed from: a */
    final boolean m22810a(C5107a c5107a) {
        if (c5107a.f18965d == this.f19017g && !c5107a.f18966e) {
            return null;
        }
        this.f19017g = c5107a.f18965d;
        return true;
    }

    /* renamed from: a */
    void mo7147a() {
        if (this.f19016f) {
            synchronized (this.f19013c) {
                this.f19011a = this.f19014d;
                this.f19012b = this.f19015e;
                this.f19016f = false;
            }
        }
        GLES20.glClearColor(this.f19018h[0], this.f19018h[1], this.f19018h[2], this.f19018h[3]);
        GLES20.glClearStencil(0);
        GLES20.glClear(17664);
        GLES20.glEnable(2929);
        GLES20.glEnable(2884);
    }

    /* renamed from: a */
    protected final void m22808a(int i, int i2) {
        synchronized (this.f19013c) {
            this.f19014d = i;
            this.f19015e = i2;
            this.f19016f = true;
        }
        synchronized (this.f19019i) {
            if (this.f19019i.isEmpty() == 0) {
                for (C5106e a : this.f19019i) {
                    a.m22783a(this.f19014d, this.f19015e);
                }
            } else if (C4728u.m21050a("RenderTarget", 5) != 0) {
                Log.w("RenderTarget", "this.sizeChangeListener is empty");
            }
        }
    }

    /* renamed from: a */
    final void m22809a(C5106e c5106e) {
        synchronized (this.f19019i) {
            this.f19019i.add(c5106e);
        }
    }

    /* renamed from: b */
    final void m22812b(C5106e c5106e) {
        synchronized (this.f19019i) {
            this.f19019i.remove(c5106e);
        }
    }
}
