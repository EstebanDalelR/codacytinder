package com.google.android.gms.internal;

import java.io.IOException;

public final class aew extends adz<aew> implements Cloneable {
    /* renamed from: a */
    private static volatile aew[] f26640a;
    /* renamed from: b */
    private String f26641b;
    /* renamed from: c */
    private String f26642c;

    public aew() {
        this.f26641b = "";
        this.f26642c = "";
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: b */
    public static aew[] m31409b() {
        if (f26640a == null) {
            synchronized (aed.f15102b) {
                if (f26640a == null) {
                    f26640a = new aew[0];
                }
            }
        }
        return f26640a;
    }

    /* renamed from: g */
    private aew m31410g() {
        try {
            return (aew) super.mo6840c();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (!(this.f26641b == null || this.f26641b.equals(""))) {
            a += ady.m19010b(1, this.f26641b);
        }
        return (this.f26642c == null || this.f26642c.equals("")) ? a : a + ady.m19010b(2, this.f26642c);
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f26641b = adx.m18989e();
            } else if (a == 18) {
                this.f26642c = adx.m18989e();
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (!(this.f26641b == null || this.f26641b.equals(""))) {
            ady.m19024a(1, this.f26641b);
        }
        if (!(this.f26642c == null || this.f26642c.equals(""))) {
            ady.m19024a(2, this.f26642c);
        }
        super.mo4218a(ady);
    }

    /* renamed from: c */
    public final /* synthetic */ adz mo6840c() throws CloneNotSupportedException {
        return (aew) clone();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m31410g();
    }

    /* renamed from: d */
    public final /* synthetic */ aee mo4220d() throws CloneNotSupportedException {
        return (aew) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aew)) {
            return false;
        }
        aew aew = (aew) obj;
        if (this.f26641b == null) {
            if (aew.f26641b != null) {
                return false;
            }
        } else if (!this.f26641b.equals(aew.f26641b)) {
            return false;
        }
        if (this.f26642c == null) {
            if (aew.f26642c != null) {
                return false;
            }
        } else if (!this.f26642c.equals(aew.f26642c)) {
            return false;
        }
        if (this.X != null) {
            if (!this.X.m19041b()) {
                return this.X.equals(aew.X);
            }
        }
        return aew.X == null || aew.X.m19041b();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f26641b == null ? 0 : this.f26641b.hashCode())) * 31) + (this.f26642c == null ? 0 : this.f26642c.hashCode())) * 31;
        if (this.X != null) {
            if (!this.X.m19041b()) {
                i = this.X.hashCode();
            }
        }
        return hashCode + i;
    }
}
