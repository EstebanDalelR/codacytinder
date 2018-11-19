package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.cg.bp;
import com.google.android.m4b.maps.cg.bw;

public final class ai {
    /* renamed from: a */
    private ah f18104a;
    /* renamed from: b */
    private float f18105b = -1.0f;
    /* renamed from: c */
    private boolean f18106c = false;
    /* renamed from: d */
    private String f18107d = "";
    /* renamed from: e */
    private int f18108e;
    /* renamed from: f */
    private float f18109f;
    /* renamed from: g */
    private float f18110g;
    /* renamed from: h */
    private float f18111h;
    /* renamed from: i */
    private float f18112i;
    /* renamed from: j */
    private boolean f18113j;
    /* renamed from: k */
    private final C6413m f18114k;

    public ai(C6413m c6413m) {
        this.f18114k = c6413m;
        this.f18104a = new ah(c6413m);
    }

    /* renamed from: a */
    public final void m22045a(float f) {
        this.f18105b = f;
    }

    /* renamed from: a */
    public final void m22046a(C4944q c4944q, bw bwVar) {
        String str = c4944q.f18269i;
        if (!this.f18107d.equals(str)) {
            this.f18106c = c4944q.f18262b;
            this.f18107d = str;
            this.f18108e = c4944q.f18275o;
            m22044b(bwVar);
            m22043a(0, 0, 1);
        }
    }

    /* renamed from: a */
    public final void m22047a(bw bwVar) {
        if (!this.f18113j) {
            m22044b(bwVar);
        } else if (Math.abs(this.f18111h - bwVar.m23054e()) > 0.999f) {
            m22043a(0, 1, 0);
            m22044b(bwVar);
        } else {
            Object obj;
            if (this.f18113j) {
                if (this.f18105b < 0.0f) {
                    new IllegalStateException("FOV not set").printStackTrace();
                } else {
                    float b = bwVar.m23049b();
                    float d = bwVar.m23053d();
                    if (!(this.f18109f == b && this.f18110g == d) && bp.m23006n((float) Math.acos((double) ((bp.m23000h(this.f18110g) * bp.m23000h(d)) + ((bp.m23001i(this.f18110g) * bp.m23001i(d)) * bp.m23001i(this.f18109f - b))))) * 2.0f > this.f18105b * this.f18112i) {
                        obj = 1;
                        if (obj != null) {
                            m22043a(1, 0, 0);
                            m22044b(bwVar);
                        }
                    }
                }
            }
            obj = null;
            if (obj != null) {
                m22043a(1, 0, 0);
                m22044b(bwVar);
            }
        }
    }

    /* renamed from: a */
    private void m22043a(int i, int i2, int i3) {
        if (!(this.f18106c || this.f18104a.m32380a(this.f18108e, i, i2, i3))) {
            this.f18104a = new ah(this.f18114k);
            this.f18104a.m32380a(this.f18108e, i, i2, i3);
        }
    }

    /* renamed from: b */
    private void m22044b(bw bwVar) {
        this.f18113j = bwVar != null;
        if (this.f18113j) {
            this.f18109f = bwVar.m23049b();
            this.f18110g = bwVar.m23053d();
            this.f18111h = bwVar.m23054e();
            this.f18112i = bwVar.m23055f();
        }
    }
}
