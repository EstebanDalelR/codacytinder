package okio;

import java.util.Arrays;

final class SegmentedByteString extends ByteString {
    /* renamed from: f */
    final transient byte[][] f55088f;
    /* renamed from: g */
    final transient int[] f55089g;

    SegmentedByteString(C18549c c18549c, int i) {
        super(null);
        C15983r.m60641a(c18549c.f57797b, 0, (long) i);
        int i2 = 0;
        C15980o c15980o = c18549c.f57796a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (c15980o.f49613c == c15980o.f49612b) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += c15980o.f49613c - c15980o.f49612b;
            i4++;
            c15980o = c15980o.f49616f;
        }
        this.f55088f = new byte[i4][];
        this.f55089g = new int[(i4 * 2)];
        C15980o c15980o2 = c18549c.f57796a;
        c18549c = null;
        while (i2 < i) {
            this.f55088f[c18549c] = c15980o2.f49611a;
            i2 += c15980o2.f49613c - c15980o2.f49612b;
            if (i2 > i) {
                i2 = i;
            }
            this.f55089g[c18549c] = i2;
            this.f55089g[this.f55088f.length + c18549c] = c15980o2.f49612b;
            c15980o2.f49614d = true;
            c18549c++;
            c15980o2 = c15980o2.f49616f;
        }
    }

    /* renamed from: a */
    public String mo13419a() {
        return m64429k().mo13419a();
    }

    /* renamed from: b */
    public String mo13424b() {
        return m64429k().mo13424b();
    }

    /* renamed from: f */
    public String mo13429f() {
        return m64429k().mo13429f();
    }

    /* renamed from: g */
    public ByteString mo13430g() {
        return m64429k().mo13430g();
    }

    /* renamed from: c */
    public ByteString mo13425c() {
        return m64429k().mo13425c();
    }

    /* renamed from: d */
    public ByteString mo13426d() {
        return m64429k().mo13426d();
    }

    /* renamed from: e */
    public ByteString mo13427e() {
        return m64429k().mo13427e();
    }

    /* renamed from: a */
    public ByteString mo13420a(int i, int i2) {
        return m64429k().mo13420a(i, i2);
    }

    /* renamed from: a */
    public byte mo13418a(int i) {
        int i2;
        C15983r.m60641a((long) this.f55089g[this.f55088f.length - 1], (long) i, 1);
        int b = m64428b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.f55089g[b - 1];
        }
        return this.f55088f[b][(i - i2) + this.f55089g[this.f55088f.length + b]];
    }

    /* renamed from: b */
    private int m64428b(int i) {
        i = Arrays.binarySearch(this.f55089g, 0, this.f55088f.length, i + 1);
        return i >= 0 ? i : i ^ -1;
    }

    /* renamed from: h */
    public int mo13431h() {
        return this.f55089g[this.f55088f.length - 1];
    }

    /* renamed from: i */
    public byte[] mo13433i() {
        Object obj = new byte[this.f55089g[this.f55088f.length - 1]];
        int length = this.f55088f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f55089g[length + i];
            int i4 = this.f55089g[i];
            System.arraycopy(this.f55088f[i], i3, obj, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return obj;
    }

    /* renamed from: a */
    void mo13421a(C18549c c18549c) {
        int length = this.f55088f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f55089g[length + i];
            int i4 = this.f55089g[i];
            C15980o c15980o = new C15980o(this.f55088f[i], i3, (i3 + i4) - i2, true, false);
            if (c18549c.f57796a == null) {
                c15980o.f49617g = c15980o;
                c15980o.f49616f = c15980o;
                c18549c.f57796a = c15980o;
            } else {
                c18549c.f57796a.f49617g.m60626a(c15980o);
            }
            i++;
            i2 = i4;
        }
        c18549c.f57797b += (long) i2;
    }

    /* renamed from: a */
    public boolean mo13422a(int i, ByteString byteString, int i2, int i3) {
        if (i >= 0) {
            if (i <= mo13431h() - i3) {
                int b = m64428b(i);
                while (i3 > 0) {
                    int i4;
                    if (b == 0) {
                        i4 = 0;
                    } else {
                        i4 = this.f55089g[b - 1];
                    }
                    int min = Math.min(i3, ((this.f55089g[b] - i4) + i4) - i);
                    if (!byteString.mo13423a(i2, this.f55088f[b], (i - i4) + this.f55089g[this.f55088f.length + b], min)) {
                        return false;
                    }
                    i += min;
                    i2 += min;
                    i3 -= min;
                    b++;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo13423a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0 && i <= mo13431h() - i3 && i2 >= 0) {
            if (i2 <= bArr.length - i3) {
                int b = m64428b(i);
                while (i3 > 0) {
                    int i4;
                    if (b == 0) {
                        i4 = 0;
                    } else {
                        i4 = this.f55089g[b - 1];
                    }
                    int min = Math.min(i3, ((this.f55089g[b] - i4) + i4) - i);
                    if (!C15983r.m60643a(this.f55088f[b], (i - i4) + this.f55089g[this.f55088f.length + b], bArr, i2, min)) {
                        return false;
                    }
                    i += min;
                    i2 += min;
                    i3 -= min;
                    b++;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private ByteString m64429k() {
        return new ByteString(mo13433i());
    }

    /* renamed from: j */
    byte[] mo13434j() {
        return mo13433i();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.mo13431h() == mo13431h() && mo13422a(0, byteString, 0, mo13431h()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        i = this.f55088f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            byte[] bArr = this.f55088f[i2];
            int i5 = this.f55089g[i + i2];
            int i6 = this.f55089g[i2];
            i3 = (i6 - i3) + i5;
            while (i5 < i3) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.d = i4;
        return i4;
    }

    public String toString() {
        return m64429k().toString();
    }

    private Object writeReplace() {
        return m64429k();
    }
}
