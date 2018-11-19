package okio;

import javax.annotation.Nullable;

/* renamed from: okio.o */
final class C15980o {
    /* renamed from: a */
    final byte[] f49611a;
    /* renamed from: b */
    int f49612b;
    /* renamed from: c */
    int f49613c;
    /* renamed from: d */
    boolean f49614d;
    /* renamed from: e */
    boolean f49615e;
    /* renamed from: f */
    C15980o f49616f;
    /* renamed from: g */
    C15980o f49617g;

    C15980o() {
        this.f49611a = new byte[8192];
        this.f49615e = true;
        this.f49614d = false;
    }

    C15980o(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f49611a = bArr;
        this.f49612b = i;
        this.f49613c = i2;
        this.f49614d = z;
        this.f49615e = z2;
    }

    /* renamed from: a */
    C15980o m60624a() {
        this.f49614d = true;
        return new C15980o(this.f49611a, this.f49612b, this.f49613c, true, false);
    }

    /* renamed from: b */
    C15980o m60628b() {
        return new C15980o((byte[]) this.f49611a.clone(), this.f49612b, this.f49613c, false, true);
    }

    @Nullable
    /* renamed from: c */
    public C15980o m60629c() {
        C15980o c15980o = this.f49616f != this ? this.f49616f : null;
        this.f49617g.f49616f = this.f49616f;
        this.f49616f.f49617g = this.f49617g;
        this.f49616f = null;
        this.f49617g = null;
        return c15980o;
    }

    /* renamed from: a */
    public C15980o m60626a(C15980o c15980o) {
        c15980o.f49617g = this;
        c15980o.f49616f = this.f49616f;
        this.f49616f.f49617g = c15980o;
        this.f49616f = c15980o;
        return c15980o;
    }

    /* renamed from: a */
    public C15980o m60625a(int i) {
        if (i > 0) {
            if (i <= this.f49613c - this.f49612b) {
                C15980o a;
                if (i >= 1024) {
                    a = m60624a();
                } else {
                    a = C15981p.m60631a();
                    System.arraycopy(this.f49611a, this.f49612b, a.f49611a, 0, i);
                }
                a.f49613c = a.f49612b + i;
                this.f49612b += i;
                this.f49617g.m60626a(a);
                return a;
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public void m60630d() {
        if (this.f49617g == this) {
            throw new IllegalStateException();
        } else if (this.f49617g.f49615e) {
            int i = this.f49613c - this.f49612b;
            if (i <= (8192 - this.f49617g.f49613c) + (this.f49617g.f49614d ? 0 : this.f49617g.f49612b)) {
                m60627a(this.f49617g, i);
                m60629c();
                C15981p.m60632a(this);
            }
        }
    }

    /* renamed from: a */
    public void m60627a(C15980o c15980o, int i) {
        if (c15980o.f49615e) {
            if (c15980o.f49613c + i > 8192) {
                if (c15980o.f49614d) {
                    throw new IllegalArgumentException();
                } else if ((c15980o.f49613c + i) - c15980o.f49612b > 8192) {
                    throw new IllegalArgumentException();
                } else {
                    System.arraycopy(c15980o.f49611a, c15980o.f49612b, c15980o.f49611a, 0, c15980o.f49613c - c15980o.f49612b);
                    c15980o.f49613c -= c15980o.f49612b;
                    c15980o.f49612b = 0;
                }
            }
            System.arraycopy(this.f49611a, this.f49612b, c15980o.f49611a, c15980o.f49613c, i);
            c15980o.f49613c += i;
            this.f49612b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
