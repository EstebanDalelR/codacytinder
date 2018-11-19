package com.google.android.m4b.maps.ct;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.m4b.maps.ct.C6656q.C6655a;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.ct.e */
public final class C5257e {
    /* renamed from: a */
    private final byte[] f19542a;
    /* renamed from: b */
    private final boolean f19543b;
    /* renamed from: c */
    private int f19544c;
    /* renamed from: d */
    private int f19545d;
    /* renamed from: e */
    private int f19546e;
    /* renamed from: f */
    private final InputStream f19547f;
    /* renamed from: g */
    private int f19548g;
    /* renamed from: h */
    private boolean f19549h;
    /* renamed from: i */
    private int f19550i;
    /* renamed from: j */
    private int f19551j;
    /* renamed from: k */
    private int f19552k;
    /* renamed from: l */
    private int f19553l;
    /* renamed from: m */
    private int f19554m;
    /* renamed from: n */
    private C5256a f19555n;

    /* renamed from: com.google.android.m4b.maps.ct.e$a */
    interface C5256a {
    }

    /* renamed from: a */
    public static C5257e m23280a(InputStream inputStream) {
        return new C5257e(inputStream);
    }

    /* renamed from: a */
    public static C5257e m23281a(byte[] bArr, int i, int i2) {
        C5257e c5257e = new C5257e(bArr, i, i2);
        try {
            c5257e.m23296b(i2);
            return c5257e;
        } catch (byte[] bArr2) {
            throw new IllegalArgumentException(bArr2);
        }
    }

    /* renamed from: a */
    static C5257e m23279a(C6654p c6654p) {
        C5257e c5257e = new C5257e(c6654p);
        try {
            c5257e.m23296b(c6654p.mo5381b());
            return c5257e;
        } catch (C6654p c6654p2) {
            throw new IllegalArgumentException(c6654p2);
        }
    }

    /* renamed from: a */
    public final void m23292a(int i) {
        if (this.f19548g != i) {
            throw C5274m.m23413f();
        }
    }

    /* renamed from: b */
    public final double m23295b() {
        return Double.longBitsToDouble(m23289x());
    }

    /* renamed from: c */
    public final float m23297c() {
        return Float.intBitsToFloat(m23288w());
    }

    /* renamed from: d */
    public final long m23299d() {
        return m23286u();
    }

    /* renamed from: e */
    public final long m23300e() {
        return m23286u();
    }

    /* renamed from: f */
    public final int m23301f() {
        return m23314s();
    }

    /* renamed from: g */
    public final long m23302g() {
        return m23289x();
    }

    /* renamed from: h */
    public final int m23303h() {
        return m23288w();
    }

    /* renamed from: i */
    public final boolean m23304i() {
        return m23286u() != 0;
    }

    /* renamed from: j */
    public final String m23305j() {
        int s = m23314s();
        if (s <= this.f19544c - this.f19546e && s > 0) {
            String str = new String(this.f19542a, this.f19546e, s, C5273l.f19591a);
            this.f19546e += s;
            return str;
        } else if (s == 0) {
            return "";
        } else {
            return new String(m23284f(s), C5273l.f19591a);
        }
    }

    /* renamed from: k */
    public final String m23306k() {
        byte[] bArr;
        int s = m23314s();
        int i = this.f19546e;
        Object obj = null;
        if (s <= this.f19544c - i && s > 0) {
            bArr = this.f19542a;
            this.f19546e = i + s;
        } else if (s == 0) {
            return "";
        } else {
            bArr = m23284f(s);
            i = 0;
        }
        if (C5294y.m23476a(bArr, i, i + s) == 0) {
            obj = 1;
        }
        if (obj != null) {
            return new String(bArr, i, s, C5273l.f19591a);
        }
        throw C5274m.m23417j();
    }

    /* renamed from: a */
    public final void m23293a(int i, C6655a c6655a, C5262h c5262h) {
        if (this.f19552k >= this.f19553l) {
            throw C5274m.m23415h();
        }
        this.f19552k++;
        c6655a.mo7223b(this, c5262h);
        m23292a(C5299z.m23483a(i, 4));
        this.f19552k--;
    }

    /* renamed from: a */
    public final void m23294a(C6655a c6655a, C5262h c5262h) {
        int s = m23314s();
        if (this.f19552k >= this.f19553l) {
            throw C5274m.m23415h();
        }
        s = m23296b(s);
        this.f19552k++;
        c6655a.mo7223b(this, c5262h);
        m23292a((int) null);
        this.f19552k--;
        m23298c(s);
    }

    /* renamed from: l */
    public final C5255d m23307l() {
        int s = m23314s();
        if (s <= this.f19544c - this.f19546e && s > 0) {
            C5255d a = C5255d.m23268a(this.f19542a, this.f19546e, s);
            this.f19546e += s;
            return a;
        } else if (s == 0) {
            return C5255d.f19541a;
        } else {
            return new C6654p(m23284f(s));
        }
    }

    /* renamed from: m */
    public final int m23308m() {
        return m23314s();
    }

    /* renamed from: n */
    public final int m23309n() {
        return m23314s();
    }

    /* renamed from: o */
    public final int m23310o() {
        return m23288w();
    }

    /* renamed from: p */
    public final long m23311p() {
        return m23289x();
    }

    /* renamed from: q */
    public final int m23312q() {
        int s = m23314s();
        return (-(s & 1)) ^ (s >>> 1);
    }

    /* renamed from: r */
    public final long m23313r() {
        long u = m23286u();
        return (u >>> 1) ^ (-(u & 1));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: s */
    public final int m23314s() {
        /*
        r5 = this;
        r0 = r5.f19546e;
        r1 = r5.f19544c;
        if (r1 == r0) goto L_0x006d;
    L_0x0006:
        r1 = r5.f19542a;
        r2 = r0 + 1;
        r0 = r1[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.f19546e = r2;
        return r0;
    L_0x0011:
        r3 = r5.f19544c;
        r3 = r3 - r2;
        r4 = 9;
        if (r3 < r4) goto L_0x006d;
    L_0x0018:
        r3 = r2 + 1;
        r2 = r1[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0024;
    L_0x0021:
        r0 = r0 ^ -128;
        goto L_0x006a;
    L_0x0024:
        r2 = r3 + 1;
        r3 = r1[r3];
        r3 = r3 << 14;
        r0 = r0 ^ r3;
        if (r0 < 0) goto L_0x0031;
    L_0x002d:
        r0 = r0 ^ 16256;
    L_0x002f:
        r3 = r2;
        goto L_0x006a;
    L_0x0031:
        r3 = r2 + 1;
        r2 = r1[r2];
        r2 = r2 << 21;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x003f;
    L_0x003a:
        r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r1;
        goto L_0x006a;
    L_0x003f:
        r2 = r3 + 1;
        r3 = r1[r3];
        r4 = r3 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r3 >= 0) goto L_0x002f;
    L_0x004c:
        r3 = r2 + 1;
        r2 = r1[r2];
        if (r2 >= 0) goto L_0x006a;
    L_0x0052:
        r2 = r3 + 1;
        r3 = r1[r3];
        if (r3 >= 0) goto L_0x002f;
    L_0x0058:
        r3 = r2 + 1;
        r2 = r1[r2];
        if (r2 >= 0) goto L_0x006a;
    L_0x005e:
        r2 = r3 + 1;
        r3 = r1[r3];
        if (r3 >= 0) goto L_0x002f;
    L_0x0064:
        r3 = r2 + 1;
        r1 = r1[r2];
        if (r1 < 0) goto L_0x006d;
    L_0x006a:
        r5.f19546e = r3;
        return r0;
    L_0x006d:
        r0 = r5.m23287v();
        r0 = (int) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ct.e.s():int");
    }

    /* renamed from: u */
    private long m23286u() {
        int i = this.f19546e;
        if (this.f19544c != i) {
            byte[] bArr = this.f19542a;
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.f19546e = i2;
                return (long) b;
            } else if (this.f19544c - i2 >= 9) {
                long j;
                long j2;
                long j3;
                int i3 = i2 + 1;
                i = b ^ (bArr[i2] << 7);
                if (i < 0) {
                    j = (long) (i ^ -128);
                } else {
                    i2 = i3 + 1;
                    i ^= bArr[i3] << 14;
                    if (i >= 0) {
                        j2 = (long) (i ^ 16256);
                        i = i2;
                        j3 = j2;
                        this.f19546e = i;
                        return j3;
                    }
                    i3 = i2 + 1;
                    i ^= bArr[i2] << 21;
                    if (i < 0) {
                        j = (long) (i ^ -2080896);
                    } else {
                        long j4;
                        long j5 = (long) i;
                        i = i3 + 1;
                        long j6 = j5 ^ (((long) bArr[i3]) << 28);
                        if (j6 >= 0) {
                            j4 = j6 ^ 266354560;
                        } else {
                            int i4 = i + 1;
                            long j7 = j6 ^ (((long) bArr[i]) << 35);
                            if (j7 < 0) {
                                j3 = j7 ^ -34093383808L;
                            } else {
                                i = i4 + 1;
                                j6 = j7 ^ (((long) bArr[i4]) << 42);
                                if (j6 >= 0) {
                                    j4 = j6 ^ 4363953127296L;
                                } else {
                                    i4 = i + 1;
                                    j7 = j6 ^ (((long) bArr[i]) << 49);
                                    if (j7 < 0) {
                                        j3 = j7 ^ -558586000294016L;
                                    } else {
                                        i = i4 + 1;
                                        long j8 = (j7 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                        if (j8 < 0) {
                                            i4 = i + 1;
                                            if (((long) bArr[i]) >= 0) {
                                                i = i4;
                                            }
                                        }
                                        j3 = j8;
                                        this.f19546e = i;
                                        return j3;
                                    }
                                }
                            }
                            i = i4;
                            this.f19546e = i;
                            return j3;
                        }
                        j3 = j4;
                        this.f19546e = i;
                        return j3;
                    }
                }
                j2 = j;
                i = i3;
                j3 = j2;
                this.f19546e = i;
                return j3;
            }
        }
        return m23287v();
    }

    /* renamed from: w */
    private int m23288w() {
        int i = this.f19546e;
        if (this.f19544c - i < 4) {
            m23282d(4);
            i = this.f19546e;
        }
        byte[] bArr = this.f19542a;
        this.f19546e = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    /* renamed from: x */
    private long m23289x() {
        int i = this.f19546e;
        if (this.f19544c - i < 8) {
            m23282d(8);
            i = this.f19546e;
        }
        byte[] bArr = this.f19542a;
        this.f19546e = i + 8;
        return (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48)) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private C5257e(byte[] bArr, int i, int i2) {
        this.f19549h = false;
        this.f19551j = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f19553l = 100;
        this.f19554m = 67108864;
        this.f19555n = null;
        this.f19542a = bArr;
        this.f19544c = i2 + i;
        this.f19546e = i;
        this.f19550i = -i;
        this.f19547f = null;
        this.f19543b = false;
    }

    private C5257e(InputStream inputStream) {
        this.f19549h = false;
        this.f19551j = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f19553l = 100;
        this.f19554m = 67108864;
        this.f19555n = null;
        this.f19542a = new byte[4096];
        this.f19544c = 0;
        this.f19546e = 0;
        this.f19550i = 0;
        this.f19547f = inputStream;
        this.f19543b = false;
    }

    private C5257e(C6654p c6654p) {
        this.f19549h = false;
        this.f19551j = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f19553l = 100;
        this.f19554m = 67108864;
        this.f19555n = null;
        this.f19542a = c6654p.f24940b;
        this.f19546e = c6654p.m29696h();
        this.f19544c = this.f19546e + c6654p.mo5381b();
        this.f19550i = -this.f19546e;
        this.f19547f = null;
        this.f19543b = true;
    }

    /* renamed from: b */
    public final int m23296b(int i) {
        if (i < 0) {
            throw C5274m.m23410c();
        }
        i += this.f19550i + this.f19546e;
        int i2 = this.f19551j;
        if (i > i2) {
            throw C5274m.m23409b();
        }
        this.f19551j = i;
        m23290y();
        return i2;
    }

    /* renamed from: y */
    private void m23290y() {
        this.f19544c += this.f19545d;
        int i = this.f19550i + this.f19544c;
        if (i > this.f19551j) {
            this.f19545d = i - this.f19551j;
            this.f19544c -= this.f19545d;
            return;
        }
        this.f19545d = 0;
    }

    /* renamed from: c */
    public final void m23298c(int i) {
        this.f19551j = i;
        m23290y();
    }

    /* renamed from: t */
    public final int m23315t() {
        if (this.f19551j == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return -1;
        }
        return this.f19551j - (this.f19550i + this.f19546e);
    }

    /* renamed from: d */
    private void m23282d(int i) {
        if (m23283e(i) == 0) {
            throw C5274m.m23409b();
        }
    }

    /* renamed from: e */
    private boolean m23283e(int i) {
        StringBuilder stringBuilder;
        while (this.f19546e + i > this.f19544c) {
            if ((this.f19550i + this.f19546e) + i <= this.f19551j && this.f19547f != null) {
                int i2 = this.f19546e;
                if (i2 > 0) {
                    if (this.f19544c > i2) {
                        System.arraycopy(this.f19542a, i2, this.f19542a, 0, this.f19544c - i2);
                    }
                    this.f19550i += i2;
                    this.f19544c -= i2;
                    this.f19546e = 0;
                }
                i2 = this.f19547f.read(this.f19542a, this.f19544c, this.f19542a.length - this.f19544c);
                if (i2 != 0 && i2 >= -1) {
                    if (i2 <= this.f19542a.length) {
                        if (i2 > 0) {
                            this.f19544c += i2;
                            if ((this.f19550i + i) - this.f19554m > 0) {
                                throw C5274m.m23416i();
                            }
                            m23290y();
                            if (this.f19544c >= i) {
                                return true;
                            }
                        }
                    }
                }
                stringBuilder = new StringBuilder(102);
                stringBuilder.append("InputStream#read(byte[]) returned invalid result: ");
                stringBuilder.append(i2);
                stringBuilder.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(stringBuilder.toString());
            }
            return false;
        }
        stringBuilder = new StringBuilder(77);
        stringBuilder.append("refillBuffer() called when ");
        stringBuilder.append(i);
        stringBuilder.append(" bytes were already available in buffer");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: f */
    private byte[] m23284f(int i) {
        if (i <= 0) {
            if (i == 0) {
                return C5273l.f19592b;
            }
            throw C5274m.m23410c();
        } else if ((this.f19550i + this.f19546e) + i > this.f19551j) {
            m23285g((this.f19551j - this.f19550i) - this.f19546e);
            throw C5274m.m23409b();
        } else if (i < 4096) {
            Object obj = new byte[i];
            r2 = this.f19544c - this.f19546e;
            System.arraycopy(this.f19542a, this.f19546e, obj, 0, r2);
            this.f19546e = this.f19544c;
            i -= r2;
            if (this.f19544c - this.f19546e < i) {
                m23282d(i);
            }
            System.arraycopy(this.f19542a, 0, obj, r2, i);
            this.f19546e = i;
            return obj;
        } else {
            r2 = this.f19546e;
            int i2 = this.f19544c;
            this.f19550i += this.f19544c;
            this.f19546e = 0;
            this.f19544c = 0;
            i2 -= r2;
            int i3 = i - i2;
            List<byte[]> arrayList = new ArrayList();
            while (i3 > 0) {
                Object obj2 = new byte[Math.min(i3, 4096)];
                int i4 = 0;
                while (i4 < obj2.length) {
                    int i5;
                    if (this.f19547f == null) {
                        i5 = -1;
                    } else {
                        i5 = this.f19547f.read(obj2, i4, obj2.length - i4);
                    }
                    if (i5 == -1) {
                        throw C5274m.m23409b();
                    }
                    this.f19550i += i5;
                    i4 += i5;
                }
                i3 -= obj2.length;
                arrayList.add(obj2);
            }
            i = new byte[i];
            System.arraycopy(this.f19542a, r2, i, 0, i2);
            for (byte[] bArr : arrayList) {
                System.arraycopy(bArr, 0, i, i2, bArr.length);
                i2 += bArr.length;
            }
            return i;
        }
    }

    /* renamed from: g */
    private void m23285g(int i) {
        if (i <= this.f19544c - this.f19546e && i >= 0) {
            this.f19546e += i;
        } else if (i < 0) {
            throw C5274m.m23410c();
        } else if ((this.f19550i + this.f19546e) + i > this.f19551j) {
            m23285g((this.f19551j - this.f19550i) - this.f19546e);
            throw C5274m.m23409b();
        } else {
            int i2 = this.f19544c - this.f19546e;
            this.f19546e = this.f19544c;
            m23282d(1);
            while (true) {
                int i3 = i - i2;
                if (i3 > this.f19544c) {
                    i2 += this.f19544c;
                    this.f19546e = this.f19544c;
                    m23282d(1);
                } else {
                    this.f19546e = i3;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final int m23291a() {
        int i = 1;
        if (this.f19546e != this.f19544c || m23283e(1)) {
            i = 0;
        }
        if (i != 0) {
            this.f19548g = 0;
            return 0;
        }
        this.f19548g = m23314s();
        if (C5299z.m23485b(this.f19548g) != 0) {
            return this.f19548g;
        }
        throw C5274m.m23412e();
    }

    /* renamed from: v */
    private long m23287v() {
        long j = 0;
        int i = 0;
        while (i < 64) {
            if (this.f19546e == this.f19544c) {
                m23282d(1);
            }
            byte[] bArr = this.f19542a;
            int i2 = this.f19546e;
            this.f19546e = i2 + 1;
            byte b = bArr[i2];
            long j2 = j | (((long) (b & 127)) << i);
            if ((b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                return j2;
            }
            i += 7;
            j = j2;
        }
        throw C5274m.m23411d();
    }
}
