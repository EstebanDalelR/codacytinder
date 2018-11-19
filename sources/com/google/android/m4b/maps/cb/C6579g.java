package com.google.android.m4b.maps.cb;

import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.be.C6459d;
import com.google.android.m4b.maps.ca.C5052d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.m4b.maps.cb.g */
public class C6579g implements C5065h {
    /* renamed from: a */
    protected int f24624a;
    /* renamed from: b */
    int[] f24625b;
    /* renamed from: c */
    int f24626c;
    /* renamed from: d */
    int f24627d;
    /* renamed from: e */
    Buffer f24628e;
    /* renamed from: f */
    protected final int f24629f;
    /* renamed from: g */
    protected final int f24630g;
    /* renamed from: h */
    protected final int f24631h;
    /* renamed from: i */
    int f24632i;
    /* renamed from: j */
    protected C6459d f24633j;
    /* renamed from: k */
    private boolean f24634k;

    /* renamed from: b */
    public void mo7116b(C5052d c5052d) {
    }

    public C6579g(int i) {
        this(i, false);
    }

    public C6579g(int i, boolean z) {
        this.f24624a = 0;
        this.f24634k = z;
        this.f24626c = i;
        this.f24629f = 5132;
        this.f24630g = 4;
        this.f24631h = 1;
        m29325d();
    }

    C6579g() {
        this.f24624a = 0;
        this.f24629f = 5132;
        this.f24630g = 4;
        this.f24631h = 1;
    }

    protected C6579g(int i, int i2, int i3, boolean z) {
        this.f24624a = false;
        this.f24634k = true;
        this.f24626c = i;
        if (i2 != 5132) {
            switch (i2) {
                case 5120:
                case 5121:
                    this.f24630g = 1;
                    break;
                case 5122:
                    this.f24630g = 2;
                    break;
                default:
                    throw new IllegalArgumentException("glNativeType must be one of GL_FIXED, GL_SHORT or GL_BYTE");
            }
        }
        this.f24630g = 4;
        this.f24629f = i2;
        this.f24631h = i3;
        m29325d();
    }

    /* renamed from: a */
    protected final void m29326a() {
        if (this.f24633j != null) {
            this.f24633j.m21158b(this.f24632i);
            this.f24625b = (int[]) this.f24633j.c;
            this.f24632i = this.f24633j.d;
        }
    }

    /* renamed from: a */
    public void mo5254a(int i, int i2) {
        this.f24627d++;
        int[] iArr = this.f24625b;
        int i3 = this.f24632i;
        this.f24632i = i3 + 1;
        iArr[i3] = i;
        i = this.f24625b;
        int i4 = this.f24632i;
        this.f24632i = i4 + 1;
        i[i4] = i2;
        if (this.f24632i >= 1024) {
            m29326a();
        }
    }

    /* renamed from: a */
    public void mo5251a(float f, float f2) {
        this.f24627d++;
        int[] iArr = this.f24625b;
        int i = this.f24632i;
        this.f24632i = i + 1;
        iArr[i] = Math.round(f * 65536.0f);
        f = this.f24625b;
        int i2 = this.f24632i;
        this.f24632i = i2 + 1;
        f[i2] = Math.round(f2 * 65536.0f);
        if (this.f24632i >= 1.435E-42f) {
            m29326a();
        }
    }

    /* renamed from: a */
    public void mo5260a(int[] iArr, int i, int i2) {
        if (this.f24633j != null) {
            if (this.f24632i + i2 >= 1024) {
                int i3 = i + i2;
                while (i < i3) {
                    int min = Math.min(i3 - i, 1024 - this.f24632i);
                    System.arraycopy(iArr, i, this.f24625b, this.f24632i, min);
                    i += min;
                    this.f24632i += min;
                    m29326a();
                }
                this.f24627d += i2 / 2;
            }
        }
        System.arraycopy(iArr, i, this.f24625b, this.f24632i, i2);
        this.f24632i += i2;
        this.f24627d += i2 / 2;
    }

    /* renamed from: a */
    public final void m29329a(int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int[] iArr = this.f24625b;
            int i5 = this.f24632i;
            this.f24632i = i5 + 1;
            iArr[i5] = i;
            iArr = this.f24625b;
            i5 = this.f24632i;
            this.f24632i = i5 + 1;
            iArr[i5] = i2;
            if (this.f24632i >= 1024) {
                m29326a();
            }
        }
        this.f24627d += i3;
    }

    /* renamed from: a */
    public final void mo5259a(int[] iArr) {
        mo5260a(iArr, 0, iArr.length);
    }

    /* renamed from: g */
    public final int mo5265g() {
        return this.f24627d;
    }

    /* renamed from: d */
    private void m29325d() {
        this.f24632i = 0;
        if (this.f24625b == null) {
            int i = this.f24626c * 2;
            if (i >= 1024) {
                if (!this.f24634k) {
                    this.f24633j = new C6459d(i);
                    m29326a();
                }
            }
            this.f24625b = new int[i];
        } else if (this.f24633j != null) {
            this.f24633j.m21155a();
            m29326a();
        }
        this.f24627d = 0;
        this.f24628e = null;
    }

    /* renamed from: a */
    public void mo7114a(C5052d c5052d) {
        mo7116b(c5052d);
        m29325d();
    }

    /* renamed from: c */
    public final void m29340c(C5052d c5052d) {
        mo7116b(c5052d);
        if (this.f24633j != null) {
            this.f24633j.m21159c();
            this.f24633j = null;
        }
        this.f24625b = null;
    }

    /* renamed from: c */
    public final void mo5263c(int i) {
        if (i > this.f24626c) {
            i = Math.max(i, this.f24626c * 2);
            int i2 = i * 2;
            if (this.f24633j == null) {
                if (i2 >= 1024) {
                    if (!this.f24634k) {
                        this.f24633j = new C6459d(i2);
                        this.f24633j.m21156a(this.f24625b, this.f24632i);
                        this.f24625b = (int[]) this.f24633j.c;
                        this.f24632i = this.f24633j.d;
                    }
                }
                if (this.f24634k && C4728u.m21050a("TexCoordBuffer", 5)) {
                    Log.w("TexCoordBuffer", "Attempt to grow fixed size buffer");
                }
                Object obj = new int[i2];
                System.arraycopy(this.f24625b, 0, obj, 0, this.f24632i);
                this.f24625b = obj;
            } else {
                this.f24633j.m21160c(i2);
            }
            this.f24626c = i;
        }
    }

    /* renamed from: d */
    public void mo7118d(C5052d c5052d) {
        if (this.f24628e == null) {
            mo7119e(c5052d);
        }
        this.f24628e.position(0);
        this.f24624a = this.f24628e.limit() * this.f24630g;
        c5052d.m22635x().glTexCoordPointer(2, this.f24629f, 0, this.f24628e);
    }

    /* renamed from: a */
    public void mo7115a(C5052d c5052d, int i) {
        if (this.f24628e == null) {
            mo7119e(c5052d);
        }
        this.f24628e.position(i * 2);
        this.f24624a = (this.f24628e.limit() - i) * this.f24630g;
        c5052d.m22635x().glTexCoordPointer(2, this.f24629f, 0, this.f24628e);
    }

    /* renamed from: a */
    protected final void m29332a(ByteBuffer byteBuffer, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (this.f24625b[i2] / this.f24631h));
        }
    }

    /* renamed from: a */
    protected final void m29333a(ShortBuffer shortBuffer, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            shortBuffer.put((short) (this.f24625b[i2] / this.f24631h));
        }
    }

    /* renamed from: e */
    protected void mo7119e(C5052d c5052d) {
        int i = this.f24627d * 2;
        c5052d = c5052d.m22623l().m22651a(this.f24630g * i);
        c5052d.order(ByteOrder.nativeOrder());
        if (this.f24629f == 5122) {
            this.f24628e = c5052d.asShortBuffer();
            if (this.f24633j == null) {
                m29333a((ShortBuffer) this.f24628e, i);
            } else {
                m29326a();
                this.f24633j.m28318a((ShortBuffer) this.f24628e, this.f24631h);
            }
        } else {
            if (this.f24629f != 5120) {
                if (this.f24629f != 5121) {
                    this.f24628e = c5052d.asIntBuffer();
                    if (this.f24633j == null) {
                        ((IntBuffer) this.f24628e).put(this.f24625b, 0, i);
                    } else {
                        m29326a();
                        this.f24633j.m28317a((IntBuffer) this.f24628e);
                    }
                }
            }
            this.f24628e = c5052d;
            if (this.f24633j == null) {
                m29332a((ByteBuffer) this.f24628e, i);
            } else {
                m29326a();
                this.f24633j.m28316a((ByteBuffer) this.f24628e, this.f24631h);
            }
        }
        if (this.f24633j != null) {
            this.f24633j.m21159c();
            this.f24633j = null;
        }
        this.f24625b = null;
    }

    /* renamed from: b */
    public final int m29336b() {
        return this.f24624a;
    }

    /* renamed from: c */
    public int mo7117c() {
        int i = 44;
        if (this.f24633j != null) {
            i = 44 + (this.f24633j.m21157b() * 4);
        } else if (this.f24625b != null) {
            i = 44 + ((this.f24625b.length * 4) + 16);
        }
        return this.f24628e != null ? i + (this.f24628e.capacity() * this.f24630g) : i;
    }
}
