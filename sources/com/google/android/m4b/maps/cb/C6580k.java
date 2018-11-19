package com.google.android.m4b.maps.cb;

import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.be.C6459d;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.ca.C5052d;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* renamed from: com.google.android.m4b.maps.cb.k */
public class C6580k implements C5067l {
    /* renamed from: a */
    protected int f24635a;
    /* renamed from: b */
    int[] f24636b;
    /* renamed from: c */
    int f24637c;
    /* renamed from: d */
    int f24638d;
    /* renamed from: e */
    IntBuffer f24639e;
    /* renamed from: f */
    int f24640f;
    /* renamed from: g */
    protected C6459d f24641g;
    /* renamed from: h */
    private boolean f24642h;

    /* renamed from: b */
    public void mo7121b(C5052d c5052d) {
    }

    public C6580k(int i) {
        this(i, false);
    }

    public C6580k(int i, boolean z) {
        this.f24635a = 0;
        this.f24642h = z;
        this.f24637c = i;
        m29344e();
    }

    C6580k() {
        this.f24635a = 0;
    }

    /* renamed from: b */
    protected final void m29351b() {
        if (this.f24641g != null) {
            this.f24641g.m21158b(this.f24640f);
            this.f24636b = (int[]) this.f24641g.c;
            this.f24640f = this.f24641g.d;
        }
    }

    /* renamed from: a */
    public void mo5257a(af afVar, int i) {
        this.f24638d++;
        afVar.m21478a(i, this.f24636b, this.f24640f);
        this.f24640f += 3;
        if (this.f24640f >= 1024) {
            m29351b();
        }
    }

    /* renamed from: a */
    public final void mo5258a(af afVar, int i, byte b) {
        mo5257a(afVar, i);
    }

    /* renamed from: a */
    public void mo5252a(float f, float f2, float f3) {
        this.f24638d++;
        int[] iArr = this.f24636b;
        int i = this.f24640f;
        this.f24640f = i + 1;
        iArr[i] = (int) (f * 65536.0f);
        f = this.f24636b;
        int i2 = this.f24640f;
        this.f24640f = i2 + 1;
        f[i2] = (int) (f2 * 65536.0f);
        f = this.f24636b;
        f2 = this.f24640f;
        this.f24640f = f2 + 1;
        f[f2] = (int) (f3 * 65536.0f);
        if (this.f24640f >= 1.435E-42f) {
            m29351b();
        }
    }

    /* renamed from: a */
    public final int mo5250a() {
        return this.f24638d;
    }

    /* renamed from: e */
    private void m29344e() {
        this.f24640f = 0;
        if (this.f24636b == null) {
            int i = this.f24637c * 3;
            if (i >= 1024) {
                if (!this.f24642h) {
                    this.f24641g = new C6459d(i);
                    m29351b();
                }
            }
            this.f24636b = new int[i];
        } else if (this.f24641g != null) {
            this.f24641g.m21155a();
            m29351b();
        }
        this.f24638d = 0;
        this.f24639e = null;
    }

    /* renamed from: a */
    public void mo7120a(C5052d c5052d) {
        mo7121b(c5052d);
        m29344e();
    }

    /* renamed from: c */
    public final void m29354c(C5052d c5052d) {
        mo7121b(c5052d);
        if (this.f24641g != null) {
            this.f24641g.m21159c();
            this.f24641g = null;
        }
        this.f24636b = null;
    }

    /* renamed from: a */
    public final void mo5253a(int i) {
        if (i > this.f24637c) {
            i = Math.max(i, this.f24637c * 2);
            int i2 = i * 3;
            if (this.f24641g == null) {
                if (i2 >= 1024) {
                    if (!this.f24642h) {
                        this.f24641g = new C6459d(i2);
                        this.f24641g.m21156a(this.f24636b, this.f24640f);
                        this.f24636b = (int[]) this.f24641g.c;
                        this.f24640f = this.f24641g.d;
                    }
                }
                if (this.f24642h && C4728u.m21050a("VertexBuffer", 5)) {
                    Log.w("VertexBuffer", "Attempt to grow fixed size buffer");
                }
                Object obj = new int[i2];
                System.arraycopy(this.f24636b, 0, obj, 0, this.f24640f);
                this.f24636b = obj;
            } else {
                this.f24641g.m21160c(i2);
            }
            this.f24637c = i;
        }
    }

    /* renamed from: d */
    public void mo7123d(C5052d c5052d) {
        synchronized (this) {
            if (this.f24639e == null) {
                mo7124e(c5052d);
            }
        }
        this.f24635a = this.f24639e.limit() * 4;
        c5052d.m22635x().glVertexPointer(3, 5132, 0, this.f24639e);
    }

    /* renamed from: e */
    protected void mo7124e(C5052d c5052d) {
        int i = this.f24638d * 3;
        c5052d = c5052d.m22623l().m22651a(i * 4);
        c5052d.order(ByteOrder.nativeOrder());
        this.f24639e = c5052d.asIntBuffer();
        if (this.f24641g == null) {
            this.f24639e.put(this.f24636b, 0, i);
        } else {
            m29351b();
            this.f24641g.m28317a(this.f24639e);
            this.f24641g.m21159c();
            this.f24641g = null;
        }
        this.f24639e.position(0);
        this.f24636b = null;
    }

    /* renamed from: c */
    public final int m29353c() {
        return this.f24635a;
    }

    /* renamed from: d */
    public int mo7122d() {
        int i = 32;
        if (this.f24641g != null) {
            i = 32 + (this.f24641g.m21157b() * 4);
        } else if (this.f24636b != null) {
            i = 32 + ((this.f24636b.length * 4) + 16);
        }
        return this.f24639e != null ? i + (this.f24639e.capacity() * 4) : i;
    }
}
