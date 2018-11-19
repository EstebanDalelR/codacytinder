package com.google.android.m4b.maps.cb;

import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.be.C6457b;
import com.google.android.m4b.maps.be.C6457b.C4776a;
import com.google.android.m4b.maps.ca.C5052d;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.m4b.maps.cb.a */
public class C5062a {
    /* renamed from: a */
    protected byte[] f18764a;
    /* renamed from: b */
    protected int f18765b;
    /* renamed from: c */
    ByteBuffer f18766c;
    /* renamed from: d */
    protected int f18767d;
    /* renamed from: e */
    protected C6457b f18768e;
    /* renamed from: f */
    private int f18769f;
    /* renamed from: g */
    private int f18770g;
    /* renamed from: h */
    private boolean f18771h;
    /* renamed from: i */
    private int f18772i;

    /* renamed from: com.google.android.m4b.maps.cb.a$1 */
    class C65751 implements C4776a {
        /* renamed from: a */
        private /* synthetic */ C5062a f24613a;

        C65751(C5062a c5062a) {
            this.f24613a = c5062a;
        }

        /* renamed from: a */
        public final void mo5266a(byte[] bArr, int i) {
            this.f24613a.m22664a(bArr, i);
        }
    }

    /* renamed from: a */
    public void mo5267a(C5052d c5052d) {
    }

    public C5062a(int i) {
        this(i, false);
    }

    public C5062a(int i, boolean z) {
        this.f18767d = 0;
        this.f18772i = 0;
        this.f18771h = z;
        this.f18769f = i;
        this.f18770g = 0;
        if (this.f18764a == 0) {
            boolean z2 = this.f18769f * 4;
            if (z2 >= true) {
                if (!this.f18771h) {
                    this.f18768e = new C6457b(z2);
                    m22665c();
                }
            }
            this.f18764a = new byte[z2];
        } else if (this.f18768e != 0) {
            this.f18768e.m21155a();
            m22665c();
        }
        this.f18765b = 0;
        this.f18766c = 0;
    }

    /* renamed from: c */
    private void m22665c() {
        if (this.f18768e != null) {
            this.f18768e.m21158b(this.f18770g);
            this.f18764a = (byte[]) this.f18768e.c;
            this.f18770g = this.f18768e.d;
        }
    }

    /* renamed from: a */
    public final void m22668a(int i, int i2) {
        byte b = (byte) (i >>> 24);
        byte b2 = (byte) (i >>> 16);
        byte b3 = (byte) (i >>> 8);
        i = (byte) i;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.f18764a;
            int i4 = this.f18770g;
            this.f18770g = i4 + 1;
            bArr[i4] = b;
            bArr = this.f18764a;
            i4 = this.f18770g;
            this.f18770g = i4 + 1;
            bArr[i4] = b2;
            bArr = this.f18764a;
            i4 = this.f18770g;
            this.f18770g = i4 + 1;
            bArr[i4] = b3;
            bArr = this.f18764a;
            i4 = this.f18770g;
            this.f18770g = i4 + 1;
            bArr[i4] = i;
            if (this.f18770g >= 4096) {
                m22665c();
            }
        }
        this.f18765b += i2;
    }

    /* renamed from: b */
    public final void m22672b(int i, int i2) {
        byte b = (byte) (i >>> 24);
        byte b2 = (byte) (i >>> 16);
        byte b3 = (byte) (i >>> 8);
        i = (byte) i;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.f18764a;
            int i4 = this.f18770g;
            this.f18770g = i4 + 1;
            bArr[i4] = b2;
            bArr = this.f18764a;
            i4 = this.f18770g;
            this.f18770g = i4 + 1;
            bArr[i4] = b3;
            bArr = this.f18764a;
            i4 = this.f18770g;
            this.f18770g = i4 + 1;
            bArr[i4] = i;
            bArr = this.f18764a;
            i4 = this.f18770g;
            this.f18770g = i4 + 1;
            bArr[i4] = b;
            if (this.f18770g >= 4096) {
                m22665c();
            }
        }
        this.f18765b += i2;
    }

    /* renamed from: b */
    public final void m22673b(C5052d c5052d) {
        mo5267a(c5052d);
        if (this.f18768e != null) {
            this.f18768e.m21159c();
            this.f18768e = null;
        }
        this.f18764a = null;
    }

    /* renamed from: a */
    public final void m22667a(int i) {
        if (i > this.f18769f) {
            i = Math.max(i, this.f18769f * 2);
            int i2 = i * 4;
            if (this.f18768e == null) {
                if (i2 >= 4096) {
                    if (!this.f18771h) {
                        this.f18768e = new C6457b(i2);
                        this.f18768e.m21156a(this.f18764a, this.f18770g);
                        this.f18764a = (byte[]) this.f18768e.c;
                        this.f18770g = this.f18768e.d;
                    }
                }
                if (this.f18771h && C4728u.m21050a("ColorBuffer", 5)) {
                    Log.w("ColorBuffer", "Attempt to grow fixed size buffer");
                }
                Object obj = new byte[i2];
                System.arraycopy(this.f18764a, 0, obj, 0, this.f18770g);
                this.f18764a = obj;
            } else {
                this.f18768e.m21160c(i2);
            }
            this.f18769f = i;
        }
    }

    /* renamed from: c */
    public void mo5269c(C5052d c5052d) {
        if (this.f18766c == null) {
            mo5270d(c5052d);
        }
        this.f18767d = this.f18766c.limit();
        c5052d.m22635x().glColorPointer(4, 5121, 0, this.f18766c);
    }

    /* renamed from: d */
    protected void mo5270d(C5052d c5052d) {
        int i = this.f18765b * 4;
        this.f18766c = c5052d.m22623l().m22651a(i);
        m22669a(i, true);
    }

    /* renamed from: a */
    private void m22664a(byte[] bArr, int i) {
        int i2 = 0;
        if (this.f18772i > 0) {
            while (i2 < i) {
                this.f18766c.put((byte) (this.f18772i + (((255 - this.f18772i) * (bArr[i2] & 255)) / 255)));
                i2++;
            }
            return;
        }
        this.f18766c.put(bArr, 0, i);
    }

    /* renamed from: a */
    protected final void m22669a(int i, boolean z) {
        if (this.f18768e == null) {
            m22664a(this.f18764a, i);
        } else {
            m22665c();
            this.f18768e.m28314a(new C65751(this));
        }
        this.f18766c.limit(i);
        this.f18766c.position(0);
        if (z) {
            if (this.f18768e != 0) {
                this.f18768e.m21159c();
                this.f18768e = null;
            }
            this.f18764a = null;
        }
    }

    /* renamed from: a */
    public final int m22666a() {
        return this.f18767d;
    }

    /* renamed from: b */
    public int mo5268b() {
        int i = 32;
        if (this.f18768e != null) {
            i = 32 + this.f18768e.m21157b();
        } else if (this.f18764a != null) {
            i = 32 + (this.f18764a.length + 16);
        }
        return this.f18766c != null ? i + this.f18766c.capacity() : i;
    }
}
