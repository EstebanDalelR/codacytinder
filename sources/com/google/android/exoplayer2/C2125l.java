package com.google.android.exoplayer2;

import android.support.annotation.Nullable;
import android.util.Pair;
import com.google.android.exoplayer2.C2165q.C2163a;
import com.google.android.exoplayer2.C2165q.C2164b;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.l */
final class C2125l {
    /* renamed from: a */
    private final C2163a f6085a = new C2163a();
    /* renamed from: b */
    private final C2164b f6086b = new C2164b();
    /* renamed from: c */
    private long f6087c;
    /* renamed from: d */
    private C2165q f6088d;
    /* renamed from: e */
    private int f6089e;
    /* renamed from: f */
    private boolean f6090f;
    /* renamed from: g */
    private C2123j f6091g;
    /* renamed from: h */
    private C2123j f6092h;
    /* renamed from: i */
    private C2123j f6093i;
    /* renamed from: j */
    private int f6094j;
    /* renamed from: k */
    private Object f6095k;
    /* renamed from: l */
    private long f6096l;

    /* renamed from: a */
    public void m7618a(C2165q c2165q) {
        this.f6088d = c2165q;
    }

    /* renamed from: a */
    public boolean m7620a(int i) {
        this.f6089e = i;
        return m7612i();
    }

    /* renamed from: a */
    public boolean m7624a(boolean z) {
        this.f6090f = z;
        return m7612i();
    }

    /* renamed from: a */
    public boolean m7622a(MediaPeriod mediaPeriod) {
        return (this.f6093i == null || this.f6093i.f6063a != mediaPeriod) ? null : true;
    }

    /* renamed from: a */
    public void m7617a(long j) {
        if (this.f6093i != null) {
            this.f6093i.m7596c(j);
        }
    }

    /* renamed from: a */
    public boolean m7619a() {
        if (this.f6093i != null) {
            if (this.f6093i.f6070h.f6084g || !this.f6093i.m7593b() || this.f6093i.f6070h.f6082e == -9223372036854775807L || this.f6094j >= 100) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: a */
    public C2124k m7613a(long j, C2126m c2126m) {
        if (this.f6093i == null) {
            return m7604a(c2126m);
        }
        return m7602a(this.f6093i, j);
    }

    /* renamed from: a */
    public MediaPeriod m7615a(RendererCapabilities[] rendererCapabilitiesArr, TrackSelector trackSelector, Allocator allocator, MediaSource mediaSource, Object obj, C2124k c2124k) {
        C2124k c2124k2;
        long j;
        if (this.f6093i == null) {
            c2124k2 = c2124k;
            j = c2124k2.f6079b;
        } else {
            c2124k2 = c2124k;
            j = r0.f6093i.m7586a() + r0.f6093i.f6070h.f6082e;
        }
        C2123j c2123j = new C2123j(rendererCapabilitiesArr, j, trackSelector, allocator, mediaSource, obj, c2124k2);
        if (r0.f6093i != null) {
            C2289a.m8313b(m7630f());
            r0.f6093i.f6071i = c2123j;
        }
        r0.f6095k = null;
        r0.f6093i = c2123j;
        r0.f6094j++;
        return c2123j.f6063a;
    }

    /* renamed from: b */
    public C2123j m7625b() {
        return this.f6093i;
    }

    /* renamed from: c */
    public C2123j m7627c() {
        return this.f6091g;
    }

    /* renamed from: d */
    public C2123j m7628d() {
        return this.f6092h;
    }

    /* renamed from: e */
    public C2123j m7629e() {
        return m7630f() ? this.f6091g : this.f6093i;
    }

    /* renamed from: f */
    public boolean m7630f() {
        return this.f6091g != null;
    }

    /* renamed from: g */
    public C2123j m7631g() {
        boolean z = (this.f6092h == null || this.f6092h.f6071i == null) ? false : true;
        C2289a.m8313b(z);
        this.f6092h = this.f6092h.f6071i;
        return this.f6092h;
    }

    /* renamed from: h */
    public C2123j m7632h() {
        if (this.f6091g != null) {
            if (this.f6091g == this.f6092h) {
                this.f6092h = this.f6091g.f6071i;
            }
            this.f6091g.m7597d();
            this.f6091g = this.f6091g.f6071i;
            this.f6094j--;
            if (this.f6094j == 0) {
                this.f6093i = null;
            }
        } else {
            this.f6091g = this.f6093i;
            this.f6092h = this.f6093i;
        }
        return this.f6091g;
    }

    /* renamed from: a */
    public boolean m7621a(C2123j c2123j) {
        boolean z = false;
        C2289a.m8313b(c2123j != null);
        this.f6093i = c2123j;
        while (c2123j.f6071i != null) {
            c2123j = c2123j.f6071i;
            if (c2123j == this.f6092h) {
                this.f6092h = this.f6091g;
                z = true;
            }
            c2123j.m7597d();
            this.f6094j--;
        }
        this.f6093i.f6071i = null;
        return z;
    }

    /* renamed from: b */
    public void m7626b(boolean z) {
        C2123j e = m7629e();
        if (e != null) {
            this.f6095k = z ? e.f6064b : false;
            this.f6096l = e.f6070h.f6078a.f6226d;
            e.m7597d();
            m7621a(e);
        } else if (!z) {
            this.f6095k = null;
        }
        this.f6091g = null;
        this.f6093i = null;
        this.f6092h = null;
        this.f6094j = false;
    }

    /* renamed from: a */
    public boolean m7623a(C2166a c2166a, long j) {
        int i = c2166a.f6223a;
        C2123j c2123j = null;
        C2123j e = m7629e();
        while (e != null) {
            if (c2123j == null) {
                e.f6070h = m7614a(e.f6070h, i);
            } else {
                if (i != -1) {
                    if (e.f6064b.equals(this.f6088d.mo2316a(i, this.f6085a, true).f6204b)) {
                        C2124k a = m7602a(c2123j, j);
                        if (a == null) {
                            return m7621a(c2123j) ^ 1;
                        }
                        e.f6070h = m7614a(e.f6070h, i);
                        if (!m7607a(e, a)) {
                            return m7621a(c2123j) ^ 1;
                        }
                    }
                }
                return m7621a(c2123j) ^ 1;
            }
            if (e.f6070h.f6083f != null) {
                i = this.f6088d.m7792a(i, this.f6085a, this.f6086b, this.f6089e, this.f6090f);
            }
            C2123j c2123j2 = e;
            Object obj = e.f6071i;
            c2123j = c2123j2;
        }
        return true;
    }

    /* renamed from: a */
    public C2124k m7614a(C2124k c2124k, int i) {
        return m7603a(c2124k, c2124k.f6078a.m7820a(i));
    }

    /* renamed from: a */
    public C2166a m7616a(int i, long j) {
        return m7606a(i, j, m7609b(i));
    }

    /* renamed from: a */
    private C2166a m7606a(int i, long j, long j2) {
        this.f6088d.m7797a(i, this.f6085a);
        int a = this.f6085a.m7771a(j);
        if (a == -1) {
            return new C2166a(i, j2);
        }
        return new C2166a(i, a, this.f6085a.m7776b(a), j2);
    }

    /* renamed from: b */
    private long m7609b(int i) {
        int a;
        i = this.f6088d.mo2316a(i, this.f6085a, true).f6204b;
        int i2 = this.f6085a.f6205c;
        if (this.f6095k != null) {
            a = this.f6088d.mo2315a(this.f6095k);
            if (a != -1 && this.f6088d.m7797a(a, this.f6085a).f6205c == i2) {
                return this.f6096l;
            }
        }
        for (C2123j e = m7629e(); e != null; e = e.f6071i) {
            if (e.f6064b.equals(i)) {
                return e.f6070h.f6078a.f6226d;
            }
        }
        for (i = m7629e(); i != 0; i = i.f6071i) {
            a = this.f6088d.mo2315a(i.f6064b);
            if (a != -1 && this.f6088d.m7797a(a, this.f6085a).f6205c == i2) {
                return i.f6070h.f6078a.f6226d;
            }
        }
        long j = this.f6087c;
        this.f6087c = j + 1;
        return j;
    }

    /* renamed from: a */
    private boolean m7607a(C2123j c2123j, C2124k c2124k) {
        c2123j = c2123j.f6070h;
        return (c2123j.f6079b == c2124k.f6079b && c2123j.f6080c == c2124k.f6080c && c2123j.f6078a.equals(c2124k.f6078a) != null) ? true : null;
    }

    /* renamed from: i */
    private boolean m7612i() {
        C2123j e = m7629e();
        boolean z = true;
        if (e == null) {
            return true;
        }
        while (true) {
            int a = this.f6088d.m7792a(e.f6070h.f6078a.f6223a, this.f6085a, this.f6086b, this.f6089e, this.f6090f);
            while (e.f6071i != null && !e.f6070h.f6083f) {
                e = e.f6071i;
            }
            if (a == -1 || e.f6071i == null) {
                break;
            } else if (e.f6071i.f6070h.f6078a.f6223a != a) {
                break;
            } else {
                e = e.f6071i;
            }
        }
        boolean a2 = m7621a(e);
        e.f6070h = m7603a(e.f6070h, e.f6070h.f6078a);
        if (a2) {
            if (m7630f()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    private C2124k m7604a(C2126m c2126m) {
        return m7605a(c2126m.f6099c, c2126m.f6101e, c2126m.f6100d);
    }

    @Nullable
    /* renamed from: a */
    private C2124k m7602a(C2123j c2123j, long j) {
        C2125l c2125l = this;
        C2123j c2123j2 = c2123j;
        C2124k c2124k = c2123j2.f6070h;
        C2124k c2124k2 = null;
        int a;
        long longValue;
        int i;
        if (c2124k.f6083f) {
            a = c2125l.f6088d.m7792a(c2124k.f6078a.f6223a, c2125l.f6085a, c2125l.f6086b, c2125l.f6089e, c2125l.f6090f);
            if (a == -1) {
                return null;
            }
            int i2 = c2125l.f6088d.mo2316a(a, c2125l.f6085a, true).f6205c;
            Object obj = c2125l.f6085a.f6204b;
            long j2 = c2124k.f6078a.f6226d;
            long j3 = 0;
            if (c2125l.f6088d.m7799a(i2, c2125l.f6086b).f6214f == a) {
                j2 = (c2123j.m7586a() + c2124k.f6082e) - j;
                C2165q c2165q = c2125l.f6088d;
                Pair a2 = c2165q.m7796a(c2125l.f6086b, c2125l.f6085a, i2, -9223372036854775807L, Math.max(0, j2));
                if (a2 == null) {
                    return null;
                }
                long j4;
                a = ((Integer) a2.first).intValue();
                longValue = ((Long) a2.second).longValue();
                if (c2123j2.f6071i == null || !c2123j2.f6071i.f6064b.equals(obj)) {
                    j4 = c2125l.f6087c;
                    c2125l.f6087c = j4 + 1;
                } else {
                    j4 = c2123j2.f6071i.f6070h.f6078a.f6226d;
                }
                j3 = longValue;
                longValue = j4;
                i = a;
            } else {
                i = a;
                longValue = j2;
            }
            long j5 = j3;
            return m7605a(m7606a(i, j5, longValue), j5, j3);
        }
        C2166a c2166a = c2124k.f6078a;
        c2125l.f6088d.m7797a(c2166a.f6223a, c2125l.f6085a);
        int d;
        if (c2166a.m7821a()) {
            a = c2166a.f6224b;
            d = c2125l.f6085a.m7784d(a);
            if (d == -1) {
                return null;
            }
            int a3 = c2125l.f6085a.m7770a(a, c2166a.f6225c);
            if (a3 < d) {
                if (c2125l.f6085a.m7779b(a, a3)) {
                    c2124k2 = m7601a(c2166a.f6223a, a, a3, c2124k.f6081d, c2166a.f6226d);
                }
                return c2124k2;
            }
            return m7610b(c2166a.f6223a, c2124k.f6081d, c2166a.f6226d);
        } else if (c2124k.f6080c != Long.MIN_VALUE) {
            a = c2125l.f6085a.m7771a(c2124k.f6080c);
            if (a == -1) {
                return m7610b(c2166a.f6223a, c2124k.f6080c, c2166a.f6226d);
            }
            d = c2125l.f6085a.m7776b(a);
            if (c2125l.f6085a.m7779b(a, d)) {
                c2124k2 = m7601a(c2166a.f6223a, a, d, c2124k.f6080c, c2166a.f6226d);
            }
            return c2124k2;
        } else {
            i = c2125l.f6085a.m7783d();
            if (i == 0) {
                return null;
            }
            a = i - 1;
            if (c2125l.f6085a.m7773a(a) == Long.MIN_VALUE) {
                if (!c2125l.f6085a.m7782c(a)) {
                    d = c2125l.f6085a.m7776b(a);
                    if (!c2125l.f6085a.m7779b(a, d)) {
                        return null;
                    }
                    longValue = c2125l.f6085a.m7772a();
                    return m7601a(c2166a.f6223a, a, d, longValue, c2166a.f6226d);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    private C2124k m7603a(C2124k c2124k, C2166a c2166a) {
        long c;
        long j;
        long j2 = c2124k.f6079b;
        long j3 = c2124k.f6080c;
        boolean b = m7611b(c2166a, j3);
        boolean a = m7608a(c2166a, b);
        this.f6088d.m7797a(c2166a.f6223a, this.f6085a);
        if (c2166a.m7821a()) {
            c = this.f6085a.m7781c(c2166a.f6224b, c2166a.f6225c);
        } else if (j3 == Long.MIN_VALUE) {
            c = this.f6085a.m7772a();
        } else {
            j = j3;
            return new C2124k(c2166a, j2, j3, c2124k.f6081d, j, b, a);
        }
        j = c;
        return new C2124k(c2166a, j2, j3, c2124k.f6081d, j, b, a);
    }

    /* renamed from: a */
    private C2124k m7605a(C2166a c2166a, long j, long j2) {
        this.f6088d.m7797a(c2166a.f6223a, this.f6085a);
        if (!c2166a.m7821a()) {
            return m7610b(c2166a.f6223a, j2, c2166a.f6226d);
        } else if (this.f6085a.m7779b(c2166a.f6224b, c2166a.f6225c) == null) {
            return null;
        } else {
            return m7601a(c2166a.f6223a, c2166a.f6224b, c2166a.f6225c, j, c2166a.f6226d);
        }
    }

    /* renamed from: a */
    private C2124k m7601a(int i, int i2, int i3, long j, long j2) {
        C2166a c2166a = new C2166a(i, i2, i3, j2);
        boolean b = m7611b(c2166a, Long.MIN_VALUE);
        boolean a = m7608a(c2166a, b);
        return new C2124k(c2166a, i3 == this.f6085a.m7776b(i2) ? r0.f6085a.m7785e() : 0, Long.MIN_VALUE, j, this.f6088d.m7797a(c2166a.f6223a, this.f6085a).m7781c(c2166a.f6224b, c2166a.f6225c), b, a);
    }

    /* renamed from: b */
    private C2124k m7610b(int i, long j, long j2) {
        long j3;
        C2166a c2166a = new C2166a(i, j2);
        this.f6088d.m7797a(c2166a.f6223a, this.f6085a);
        long j4 = j;
        int b = this.f6085a.m7777b(j4);
        if (b == -1) {
            j3 = Long.MIN_VALUE;
        } else {
            j3 = r0.f6085a.m7773a(b);
        }
        boolean b2 = m7611b(c2166a, j3);
        return new C2124k(c2166a, j4, j3, -9223372036854775807L, j3 == Long.MIN_VALUE ? r0.f6085a.m7772a() : j3, b2, m7608a(c2166a, b2));
    }

    /* renamed from: b */
    private boolean m7611b(C2166a c2166a, long j) {
        int d = this.f6088d.m7797a(c2166a.f6223a, this.f6085a).m7783d();
        boolean z = true;
        if (d == 0) {
            return true;
        }
        d--;
        boolean a = c2166a.m7821a();
        if (this.f6085a.m7773a(d) != Long.MIN_VALUE) {
            if (a || j != Long.MIN_VALUE) {
                z = false;
            }
            return z;
        }
        j = this.f6085a.m7784d(d);
        if (j == -1) {
            return false;
        }
        c2166a = (a && c2166a.f6224b == d && c2166a.f6225c == j - 1) ? true : null;
        if (c2166a == null) {
            if (a || this.f6085a.m7776b(d) != j) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m7608a(C2166a c2166a, boolean z) {
        return (this.f6088d.m7799a(this.f6088d.m7797a(c2166a.f6223a, this.f6085a).f6205c, this.f6086b).f6213e || this.f6088d.m7806b(c2166a.f6223a, this.f6085a, this.f6086b, this.f6089e, this.f6090f) == null || !z) ? null : true;
    }
}
