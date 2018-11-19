package com.google.android.gms.internal;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;

public final class adx {
    /* renamed from: a */
    private final byte[] f15077a;
    /* renamed from: b */
    private final int f15078b;
    /* renamed from: c */
    private final int f15079c;
    /* renamed from: d */
    private int f15080d;
    /* renamed from: e */
    private int f15081e;
    /* renamed from: f */
    private int f15082f;
    /* renamed from: g */
    private int f15083g;
    /* renamed from: h */
    private int f15084h = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    /* renamed from: i */
    private int f15085i;
    /* renamed from: j */
    private int f15086j = 64;
    /* renamed from: k */
    private int f15087k = 67108864;

    private adx(byte[] bArr, int i, int i2) {
        this.f15077a = bArr;
        this.f15078b = i;
        i2 += i;
        this.f15080d = i2;
        this.f15079c = i2;
        this.f15082f = i;
    }

    /* renamed from: a */
    public static adx m18974a(byte[] bArr, int i, int i2) {
        return new adx(bArr, 0, i2);
    }

    /* renamed from: f */
    private final void m18975f(int i) throws IOException {
        if (i < 0) {
            throw zzfjr.m20331b();
        } else if (this.f15082f + i > this.f15084h) {
            m18975f(this.f15084h - this.f15082f);
            throw zzfjr.m20330a();
        } else if (i <= this.f15080d - this.f15082f) {
            this.f15082f += i;
        } else {
            throw zzfjr.m20330a();
        }
    }

    /* renamed from: n */
    private final void m18976n() {
        this.f15080d += this.f15081e;
        int i = this.f15080d;
        if (i > this.f15084h) {
            this.f15081e = i - this.f15084h;
            this.f15080d -= this.f15081e;
            return;
        }
        this.f15081e = 0;
    }

    /* renamed from: o */
    private final byte m18977o() throws IOException {
        if (this.f15082f == this.f15080d) {
            throw zzfjr.m20330a();
        }
        byte[] bArr = this.f15077a;
        int i = this.f15082f;
        this.f15082f = i + 1;
        return bArr[i];
    }

    /* renamed from: a */
    public final int m18978a() throws IOException {
        if (this.f15082f == this.f15080d) {
            this.f15083g = 0;
            return 0;
        }
        this.f15083g = m18993h();
        if (this.f15083g != 0) {
            return this.f15083g;
        }
        throw new zzfjr("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void m18979a(int i) throws zzfjr {
        if (this.f15083g != i) {
            throw new zzfjr("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: a */
    public final void m18980a(aee aee) throws IOException {
        int h = m18993h();
        if (this.f15085i >= this.f15086j) {
            throw zzfjr.m20333d();
        }
        h = m18986c(h);
        this.f15085i++;
        aee.mo6839a(this);
        m18979a(0);
        this.f15085i--;
        m18987d(h);
    }

    /* renamed from: a */
    public final byte[] m18981a(int i, int i2) {
        if (i2 == 0) {
            return aeh.f15114h;
        }
        Object obj = new byte[i2];
        System.arraycopy(this.f15077a, this.f15078b + i, obj, 0, i2);
        return obj;
    }

    /* renamed from: b */
    public final long m18982b() throws IOException {
        return m18994i();
    }

    /* renamed from: b */
    final void m18983b(int i, int i2) {
        if (i > this.f15082f - this.f15078b) {
            int i3 = this.f15082f - this.f15078b;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i < 0) {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else {
            this.f15082f = this.f15078b + i;
            this.f15083g = i2;
        }
    }

    /* renamed from: b */
    public final boolean m18984b(int i) throws IOException {
        switch (i & 7) {
            case 0:
                m18993h();
                return true;
            case 1:
                m18996k();
                return true;
            case 2:
                m18975f(m18993h());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m18995j();
                return true;
            default:
                throw new zzfjr("Protocol message tag had invalid wire type.");
        }
        int a;
        do {
            a = m18978a();
            if (a != 0) {
            }
            m18979a(((i >>> 3) << 3) | 4);
            return true;
        } while (m18984b(a));
        m18979a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: c */
    public final int m18985c() throws IOException {
        return m18993h();
    }

    /* renamed from: c */
    public final int m18986c(int i) throws zzfjr {
        if (i < 0) {
            throw zzfjr.m20331b();
        }
        i += this.f15082f;
        int i2 = this.f15084h;
        if (i > i2) {
            throw zzfjr.m20330a();
        }
        this.f15084h = i;
        m18976n();
        return i2;
    }

    /* renamed from: d */
    public final void m18987d(int i) {
        this.f15084h = i;
        m18976n();
    }

    /* renamed from: d */
    public final boolean m18988d() throws IOException {
        return m18993h() != 0;
    }

    /* renamed from: e */
    public final String m18989e() throws IOException {
        int h = m18993h();
        if (h < 0) {
            throw zzfjr.m20331b();
        } else if (h > this.f15080d - this.f15082f) {
            throw zzfjr.m20330a();
        } else {
            String str = new String(this.f15077a, this.f15082f, h, aed.f15101a);
            this.f15082f += h;
            return str;
        }
    }

    /* renamed from: e */
    public final void m18990e(int i) {
        m18983b(i, this.f15083g);
    }

    /* renamed from: f */
    public final byte[] m18991f() throws IOException {
        int h = m18993h();
        if (h < 0) {
            throw zzfjr.m20331b();
        } else if (h == 0) {
            return aeh.f15114h;
        } else {
            if (h > this.f15080d - this.f15082f) {
                throw zzfjr.m20330a();
            }
            Object obj = new byte[h];
            System.arraycopy(this.f15077a, this.f15082f, obj, 0, h);
            this.f15082f += h;
            return obj;
        }
    }

    /* renamed from: g */
    public final long m18992g() throws IOException {
        long i = m18994i();
        return (i >>> 1) ^ (-(i & 1));
    }

    /* renamed from: h */
    public final int m18993h() throws IOException {
        byte o = m18977o();
        if (o >= (byte) 0) {
            return o;
        }
        int i;
        int i2 = o & 127;
        byte o2 = m18977o();
        if (o2 >= (byte) 0) {
            i = o2 << 7;
        } else {
            i2 |= (o2 & 127) << 7;
            o2 = m18977o();
            if (o2 >= (byte) 0) {
                i = o2 << 14;
            } else {
                i2 |= (o2 & 127) << 14;
                o2 = m18977o();
                if (o2 >= (byte) 0) {
                    i = o2 << 21;
                } else {
                    i2 |= (o2 & 127) << 21;
                    o2 = m18977o();
                    i2 |= o2 << 28;
                    if (o2 >= (byte) 0) {
                        return i2;
                    }
                    for (i = 0; i < 5; i++) {
                        if (m18977o() >= (byte) 0) {
                            return i2;
                        }
                    }
                    throw zzfjr.m20332c();
                }
            }
        }
        return i2 | i;
    }

    /* renamed from: i */
    public final long m18994i() throws IOException {
        int i = 0;
        long j = 0;
        while (i < 64) {
            byte o = m18977o();
            long j2 = j | (((long) (o & 127)) << i);
            if ((o & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                return j2;
            }
            i += 7;
            j = j2;
        }
        throw zzfjr.m20332c();
    }

    /* renamed from: j */
    public final int m18995j() throws IOException {
        return (((m18977o() & 255) | ((m18977o() & 255) << 8)) | ((m18977o() & 255) << 16)) | ((m18977o() & 255) << 24);
    }

    /* renamed from: k */
    public final long m18996k() throws IOException {
        return (((((((((long) m18977o()) & 255) | ((((long) m18977o()) & 255) << 8)) | ((((long) m18977o()) & 255) << 16)) | ((((long) m18977o()) & 255) << 24)) | ((((long) m18977o()) & 255) << 32)) | ((((long) m18977o()) & 255) << 40)) | ((((long) m18977o()) & 255) << 48)) | ((((long) m18977o()) & 255) << 56);
    }

    /* renamed from: l */
    public final int m18997l() {
        if (this.f15084h == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return -1;
        }
        return this.f15084h - this.f15082f;
    }

    /* renamed from: m */
    public final int m18998m() {
        return this.f15082f - this.f15078b;
    }
}
