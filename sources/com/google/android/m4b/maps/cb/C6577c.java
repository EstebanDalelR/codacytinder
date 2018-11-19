package com.google.android.m4b.maps.cb;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.be.C6461e;
import com.google.android.m4b.maps.ca.C5052d;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.m4b.maps.cb.c */
public class C6577c implements C5063d {
    /* renamed from: a */
    protected short[] f24616a;
    /* renamed from: b */
    int f24617b;
    /* renamed from: c */
    ShortBuffer f24618c;
    /* renamed from: d */
    protected int f24619d;
    /* renamed from: e */
    protected C6461e f24620e;
    /* renamed from: f */
    private int f24621f;
    /* renamed from: g */
    private int f24622g;
    /* renamed from: h */
    private boolean f24623h;

    /* renamed from: b */
    public void mo7111b(C5052d c5052d) {
    }

    public C6577c(int i) {
        this(i, false);
    }

    public C6577c(int i, boolean z) {
        this.f24619d = 0;
        this.f24623h = z;
        this.f24621f = i;
        m29306f();
    }

    /* renamed from: a */
    protected final void m29307a() {
        if (this.f24620e != null) {
            this.f24620e.m21158b(this.f24622g);
            this.f24616a = (short[]) this.f24620e.c;
            this.f24622g = this.f24620e.d;
        }
    }

    /* renamed from: e */
    private void m29305e() {
        if (this.f24622g >= ItemAnimator.FLAG_MOVED) {
            m29307a();
        }
    }

    /* renamed from: d */
    public final void mo5264d(int i) {
        short[] sArr = this.f24616a;
        int i2 = this.f24622g;
        this.f24622g = i2 + 1;
        sArr[i2] = (short) i;
        this.f24617b++;
        if (this.f24622g >= ItemAnimator.FLAG_MOVED) {
            m29307a();
        }
    }

    /* renamed from: a */
    public final void m29313a(short s, short s2) {
        short[] sArr = this.f24616a;
        int i = this.f24622g;
        this.f24622g = i + 1;
        sArr[i] = s;
        s = this.f24616a;
        int i2 = this.f24622g;
        this.f24622g = i2 + 1;
        s[i2] = s2;
        this.f24617b += 2;
        if (this.f24622g >= (short) 2048) {
            m29307a();
        }
    }

    /* renamed from: a */
    public final void m29314a(short s, short s2, short s3) {
        short[] sArr = this.f24616a;
        int i = this.f24622g;
        this.f24622g = i + 1;
        sArr[i] = s;
        s = this.f24616a;
        int i2 = this.f24622g;
        this.f24622g = i2 + 1;
        s[i2] = s2;
        s = this.f24616a;
        s2 = this.f24622g;
        this.f24622g = s2 + 1;
        s[s2] = s3;
        this.f24617b += 3;
        if (this.f24622g >= (short) 2048) {
            m29307a();
        }
    }

    /* renamed from: a */
    public final void mo5255a(int i, int i2, int i3) {
        short[] sArr = this.f24616a;
        int i4 = this.f24622g;
        this.f24622g = i4 + 1;
        sArr[i4] = (short) i;
        i = this.f24616a;
        int i5 = this.f24622g;
        this.f24622g = i5 + 1;
        i[i5] = (short) i2;
        i = this.f24616a;
        i2 = this.f24622g;
        this.f24622g = i2 + 1;
        i[i2] = (short) i3;
        this.f24617b += 3;
        if (this.f24622g >= ItemAnimator.FLAG_MOVED) {
            m29307a();
        }
    }

    /* renamed from: a */
    public final void mo5256a(int i, int i2, int i3, int i4) {
        short[] sArr = this.f24616a;
        int i5 = this.f24622g;
        this.f24622g = i5 + 1;
        sArr[i5] = (short) i;
        i = this.f24616a;
        int i6 = this.f24622g;
        this.f24622g = i6 + 1;
        i2 = (short) i2;
        i[i6] = i2;
        i = this.f24616a;
        i6 = this.f24622g;
        this.f24622g = i6 + 1;
        i3 = (short) i3;
        i[i6] = i3;
        i = this.f24616a;
        i6 = this.f24622g;
        this.f24622g = i6 + 1;
        i[i6] = i3;
        i = this.f24616a;
        i3 = this.f24622g;
        this.f24622g = i3 + 1;
        i[i3] = i2;
        i = this.f24616a;
        i2 = this.f24622g;
        this.f24622g = i2 + 1;
        i[i2] = (short) i4;
        this.f24617b += 6;
        if (this.f24622g >= ItemAnimator.FLAG_MOVED) {
            m29307a();
        }
    }

    /* renamed from: a */
    public final void m29312a(C6577c c6577c, int i, int i2) {
        Object obj;
        Object obj2;
        int i3;
        int min;
        if (c6577c.f24620e != null) {
            if (c6577c.f24617b >= ItemAnimator.FLAG_MOVED) {
                obj = null;
                if (this.f24620e != null) {
                    if (this.f24622g + i2 <= ItemAnimator.FLAG_MOVED) {
                        obj2 = null;
                        if (obj == null && r4 != null) {
                            System.arraycopy(c6577c.f24616a, i, this.f24616a, this.f24622g, i2);
                            this.f24622g += i2;
                            this.f24617b += i2;
                            if (this.f24622g >= 2048 && this.f24620e != null) {
                                m29307a();
                            }
                            return;
                        } else if (c6577c.f24620e != null) {
                            m29304a(c6577c.f24616a, i, i2);
                        } else {
                            c6577c.m29305e();
                            i3 = i >> 11;
                            i &= 2047;
                            while (i2 > 0) {
                                min = Math.min(2048 - i, i2);
                                m29304a((short[]) c6577c.f24620e.m21154a(i3), i, min);
                                i3++;
                                i2 -= min;
                                i = 0;
                            }
                            return;
                        }
                    }
                }
                obj2 = 1;
                if (obj == null) {
                }
                if (c6577c.f24620e != null) {
                    c6577c.m29305e();
                    i3 = i >> 11;
                    i &= 2047;
                    while (i2 > 0) {
                        min = Math.min(2048 - i, i2);
                        m29304a((short[]) c6577c.f24620e.m21154a(i3), i, min);
                        i3++;
                        i2 -= min;
                        i = 0;
                    }
                    return;
                }
                m29304a(c6577c.f24616a, i, i2);
            }
        }
        obj = 1;
        if (this.f24620e != null) {
            if (this.f24622g + i2 <= ItemAnimator.FLAG_MOVED) {
                obj2 = null;
                if (obj == null) {
                }
                if (c6577c.f24620e != null) {
                    m29304a(c6577c.f24616a, i, i2);
                }
                c6577c.m29305e();
                i3 = i >> 11;
                i &= 2047;
                while (i2 > 0) {
                    min = Math.min(2048 - i, i2);
                    m29304a((short[]) c6577c.f24620e.m21154a(i3), i, min);
                    i3++;
                    i2 -= min;
                    i = 0;
                }
                return;
            }
        }
        obj2 = 1;
        if (obj == null) {
        }
        if (c6577c.f24620e != null) {
            c6577c.m29305e();
            i3 = i >> 11;
            i &= 2047;
            while (i2 > 0) {
                min = Math.min(2048 - i, i2);
                m29304a((short[]) c6577c.f24620e.m21154a(i3), i, min);
                i3++;
                i2 -= min;
                i = 0;
            }
            return;
        }
        m29304a(c6577c.f24616a, i, i2);
    }

    /* renamed from: a */
    private void m29304a(short[] sArr, int i, int i2) {
        if (this.f24620e == null) {
            System.arraycopy(sArr, i, this.f24616a, this.f24622g, i2);
            this.f24622g += i2;
        } else {
            int i3 = i + i2;
            while (i < i3) {
                int min = Math.min(i3 - i, 2048 - this.f24622g);
                System.arraycopy(sArr, i, this.f24616a, this.f24622g, min);
                i += min;
                this.f24622g += min;
                m29305e();
            }
        }
        this.f24617b += i2;
    }

    /* renamed from: b */
    public final int mo5261b() {
        return this.f24617b;
    }

    /* renamed from: f */
    private void m29306f() {
        this.f24622g = 0;
        if (this.f24616a == null) {
            if (this.f24621f >= ItemAnimator.FLAG_MOVED) {
                if (!this.f24623h) {
                    this.f24620e = new C6461e(this.f24621f);
                    m29307a();
                }
            }
            this.f24616a = new short[this.f24621f];
        } else if (this.f24620e != null) {
            this.f24620e.m21155a();
            m29307a();
        }
        this.f24617b = 0;
        this.f24618c = null;
    }

    /* renamed from: a */
    public void mo7109a(C5052d c5052d) {
        mo7111b(c5052d);
        m29306f();
    }

    /* renamed from: c */
    public final void m29319c(C5052d c5052d) {
        mo7111b(c5052d);
        if (this.f24620e != null) {
            this.f24620e.m21159c();
            this.f24620e = null;
        }
        this.f24616a = null;
    }

    /* renamed from: b */
    public final void mo5262b(int i) {
        if (i > this.f24621f) {
            i = Math.max(i, this.f24621f * 2);
            if (this.f24620e == null) {
                if (i >= ItemAnimator.FLAG_MOVED) {
                    if (!this.f24623h) {
                        this.f24620e = new C6461e(i);
                        this.f24620e.m21156a(this.f24616a, this.f24622g);
                        this.f24616a = (short[]) this.f24620e.c;
                        this.f24622g = this.f24620e.d;
                    }
                }
                if (this.f24623h && C4728u.m21050a("IndexBuffer", 5)) {
                    Log.w("IndexBuffer", "Attempt to grow fixed size buffer");
                }
                Object obj = new short[i];
                System.arraycopy(this.f24616a, 0, obj, 0, this.f24622g);
                this.f24616a = obj;
            } else {
                this.f24620e.m21160c(i);
            }
            this.f24621f = i;
        }
    }

    /* renamed from: a */
    public void mo7110a(C5052d c5052d, int i) {
        if (this.f24618c == null) {
            mo7113d(c5052d);
        }
        this.f24619d = this.f24618c.limit() * 2;
        c5052d.m22635x().glDrawElements(i, this.f24617b, 5123, this.f24618c);
    }

    /* renamed from: d */
    protected void mo7113d(C5052d c5052d) {
        c5052d = c5052d.m22623l().m22651a(this.f24617b * 2);
        c5052d.order(ByteOrder.nativeOrder());
        this.f24618c = c5052d.asShortBuffer();
        if (this.f24620e == null) {
            this.f24618c.put(this.f24616a, 0, this.f24617b);
        } else {
            m29307a();
            this.f24620e.m28320a(this.f24618c);
            this.f24620e.m21159c();
            this.f24620e = null;
        }
        this.f24618c.position(0);
        this.f24616a = null;
    }

    /* renamed from: c */
    public final int m29318c() {
        return this.f24619d;
    }

    /* renamed from: d */
    public int mo7112d() {
        int i = 32;
        if (this.f24620e != null) {
            i = 32 + (this.f24620e.m21157b() * 2);
        } else if (this.f24616a != null) {
            i = 32 + ((this.f24616a.length * 2) + 16);
        }
        return this.f24618c != null ? i + (this.f24618c.capacity() * 2) : i;
    }
}
