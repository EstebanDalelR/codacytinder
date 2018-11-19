package com.facebook.network.connectionclass;

import java.util.NoSuchElementException;
import javax.annotation.Nullable;

/* renamed from: com.facebook.network.connectionclass.a */
class C1794a {
    @Nullable
    /* renamed from: a */
    private byte[] f4907a;
    /* renamed from: b */
    private int f4908b;
    /* renamed from: c */
    private int f4909c;
    /* renamed from: d */
    private char f4910d;
    /* renamed from: e */
    private boolean f4911e;

    C1794a() {
    }

    /* renamed from: a */
    public C1794a m6195a(byte[] bArr, int i) {
        this.f4907a = bArr;
        this.f4908b = 0;
        this.f4909c = i;
        this.f4911e = false;
        return this;
    }

    /* renamed from: a */
    public C1794a m6194a(char c) {
        m6190c();
        this.f4910d = c;
        this.f4911e = true;
        return this;
    }

    /* renamed from: c */
    private void m6190c() {
        if (this.f4907a == null) {
            throw new IllegalStateException("Must call reset first");
        }
    }

    /* renamed from: d */
    private void m6191d() {
        if (!this.f4911e) {
            throw new IllegalStateException("Must call useDelimiter first");
        }
    }

    /* renamed from: a */
    public boolean m6196a(String str) throws NoSuchElementException {
        int i = this.f4908b;
        if (str.length() != m6192e()) {
            return false;
        }
        int i2 = i;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != this.f4907a[i2]) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* renamed from: a */
    public int m6193a() throws NoSuchElementException {
        m6190c();
        m6191d();
        int i = this.f4908b;
        return C1794a.m6188a(this.f4907a, i, m6192e() + i);
    }

    /* renamed from: b */
    public void m6197b() throws NoSuchElementException {
        m6190c();
        m6191d();
        m6192e();
    }

    /* renamed from: e */
    private int m6192e() throws NoSuchElementException {
        m6190c();
        m6191d();
        if (this.f4909c <= this.f4908b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Reading past end of input stream at ");
            stringBuilder.append(this.f4908b);
            stringBuilder.append(".");
            throw new NoSuchElementException(stringBuilder.toString());
        }
        int a = C1794a.m6189a(this.f4907a, this.f4908b, this.f4909c, this.f4910d);
        if (a == -1) {
            a = this.f4909c - this.f4908b;
            this.f4908b = this.f4909c;
            return a;
        }
        int i = a - this.f4908b;
        this.f4908b = a + 1;
        return i;
    }

    /* renamed from: a */
    private static int m6188a(byte[] bArr, int i, int i2) throws NumberFormatException {
        int i3 = 0;
        while (i < i2) {
            int i4 = i + 1;
            i = bArr[i] - 48;
            if (i >= 0) {
                if (i <= 9) {
                    i3 = (i3 * 10) + i;
                    i = i4;
                }
            }
            i = new StringBuilder();
            i.append("Invalid int in buffer at ");
            i.append(i4 - 1);
            i.append(".");
            throw new NumberFormatException(i.toString());
        }
        return i3;
    }

    /* renamed from: a */
    private static int m6189a(byte[] bArr, int i, int i2, char c) {
        while (i < i2) {
            if (bArr[i] == c) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
