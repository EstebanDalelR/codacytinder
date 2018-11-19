package com.google.android.exoplayer2.util;

import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.exoplayer2.util.l */
public final class C2303l {
    /* renamed from: a */
    private byte[] f6932a;
    /* renamed from: b */
    private int f6933b;
    /* renamed from: c */
    private int f6934c;
    /* renamed from: d */
    private int f6935d;

    public C2303l(byte[] bArr, int i, int i2) {
        m8420a(bArr, i, i2);
    }

    /* renamed from: a */
    public void m8420a(byte[] bArr, int i, int i2) {
        this.f6932a = bArr;
        this.f6934c = i;
        this.f6933b = i2;
        this.f6935d = null;
        m8417g();
    }

    /* renamed from: a */
    public void m8418a() {
        int i = 1;
        int i2 = this.f6935d + 1;
        this.f6935d = i2;
        if (i2 == 8) {
            this.f6935d = 0;
            i2 = this.f6934c;
            if (m8415d(this.f6934c + 1)) {
                i = 2;
            }
            this.f6934c = i2 + i;
        }
        m8417g();
    }

    /* renamed from: a */
    public void m8419a(int i) {
        int i2 = this.f6934c;
        int i3 = i / 8;
        this.f6934c += i3;
        this.f6935d += i - (i3 * 8);
        if (this.f6935d > 7) {
            this.f6934c++;
            this.f6935d -= 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f6934c) {
                m8417g();
                return;
            } else if (m8415d(i2) != 0) {
                this.f6934c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: b */
    public boolean m8422b(int i) {
        int i2 = this.f6934c;
        int i3 = i / 8;
        int i4 = this.f6934c + i3;
        int i5 = (this.f6935d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 <= i4 && i4 < this.f6933b) {
                if (m8415d(i2)) {
                    i4++;
                    i2 += 2;
                }
            }
        }
        if (i4 < this.f6933b) {
            return true;
        }
        if (i4 == this.f6933b && r3 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m8421b() {
        boolean z = (this.f6932a[this.f6934c] & (ProfileEditingConfig.DEFAULT_MAX_LENGTH >> this.f6935d)) != 0;
        m8418a();
        return z;
    }

    /* renamed from: c */
    public int m8423c(int i) {
        this.f6935d += i;
        int i2 = 0;
        while (true) {
            int i3 = 2;
            if (this.f6935d <= 8) {
                break;
            }
            this.f6935d -= 8;
            i2 |= (this.f6932a[this.f6934c] & 255) << this.f6935d;
            int i4 = this.f6934c;
            if (!m8415d(this.f6934c + 1)) {
                i3 = 1;
            }
            this.f6934c = i4 + i3;
        }
        i = (-1 >>> (32 - i)) & (i2 | ((this.f6932a[this.f6934c] & 255) >> (8 - this.f6935d)));
        if (this.f6935d == 8) {
            this.f6935d = 0;
            int i5 = this.f6934c;
            if (!m8415d(this.f6934c + 1)) {
                i3 = 1;
            }
            this.f6934c = i5 + i3;
        }
        m8417g();
        return i;
    }

    /* renamed from: c */
    public boolean m8424c() {
        int i = this.f6934c;
        int i2 = this.f6935d;
        int i3 = 0;
        while (this.f6934c < this.f6933b && !m8421b()) {
            i3++;
        }
        Object obj = this.f6934c == this.f6933b ? 1 : null;
        this.f6934c = i;
        this.f6935d = i2;
        if (obj == null && m8422b((i3 * 2) + 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public int m8425d() {
        return m8416f();
    }

    /* renamed from: e */
    public int m8426e() {
        int f = m8416f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: f */
    private int m8416f() {
        int i = 0;
        int i2 = 0;
        while (!m8421b()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = m8423c(i2);
        }
        return i3 + i;
    }

    /* renamed from: d */
    private boolean m8415d(int i) {
        return 2 <= i && i < this.f6933b && this.f6932a[i] == (byte) 3 && this.f6932a[i - 2] == (byte) 0 && this.f6932a[i - 1] == 0;
    }

    /* renamed from: g */
    private void m8417g() {
        boolean z = this.f6934c >= 0 && (this.f6934c < this.f6933b || (this.f6934c == this.f6933b && this.f6935d == 0));
        C2289a.m8313b(z);
    }
}
