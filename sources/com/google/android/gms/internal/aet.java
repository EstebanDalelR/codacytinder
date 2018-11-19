package com.google.android.gms.internal;

import java.io.IOException;

public final class aet extends adz<aet> implements Cloneable {
    /* renamed from: a */
    private int f26610a;
    /* renamed from: b */
    private String f26611b;
    /* renamed from: c */
    private String f26612c;

    public aet() {
        this.f26610a = 0;
        this.f26611b = "";
        this.f26612c = "";
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: b */
    private aet m31390b() {
        try {
            return (aet) super.mo6840c();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26610a != 0) {
            a += ady.m19008b(1, this.f26610a);
        }
        if (!(this.f26611b == null || this.f26611b.equals(""))) {
            a += ady.m19010b(2, this.f26611b);
        }
        return (this.f26612c == null || this.f26612c.equals("")) ? a : a + ady.m19010b(3, this.f26612c);
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f26610a = adx.m18985c();
            } else if (a == 18) {
                this.f26611b = adx.m18989e();
            } else if (a == 26) {
                this.f26612c = adx.m18989e();
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26610a != 0) {
            ady.m19021a(1, this.f26610a);
        }
        if (!(this.f26611b == null || this.f26611b.equals(""))) {
            ady.m19024a(2, this.f26611b);
        }
        if (!(this.f26612c == null || this.f26612c.equals(""))) {
            ady.m19024a(3, this.f26612c);
        }
        super.mo4218a(ady);
    }

    /* renamed from: c */
    public final /* synthetic */ adz mo6840c() throws CloneNotSupportedException {
        return (aet) clone();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m31390b();
    }

    /* renamed from: d */
    public final /* synthetic */ aee mo4220d() throws CloneNotSupportedException {
        return (aet) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aet)) {
            return false;
        }
        aet aet = (aet) obj;
        if (this.f26610a != aet.f26610a) {
            return false;
        }
        if (this.f26611b == null) {
            if (aet.f26611b != null) {
                return false;
            }
        } else if (!this.f26611b.equals(aet.f26611b)) {
            return false;
        }
        if (this.f26612c == null) {
            if (aet.f26612c != null) {
                return false;
            }
        } else if (!this.f26612c.equals(aet.f26612c)) {
            return false;
        }
        if (this.X != null) {
            if (!this.X.m19041b()) {
                return this.X.equals(aet.X);
            }
        }
        return aet.X == null || aet.X.m19041b();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f26610a) * 31) + (this.f26611b == null ? 0 : this.f26611b.hashCode())) * 31) + (this.f26612c == null ? 0 : this.f26612c.hashCode())) * 31;
        if (this.X != null) {
            if (!this.X.m19041b()) {
                i = this.X.hashCode();
            }
        }
        return hashCode + i;
    }
}
