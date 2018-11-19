package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

public final class aeu extends adz<aeu> implements Cloneable {
    /* renamed from: a */
    private byte[] f26613a;
    /* renamed from: b */
    private String f26614b;
    /* renamed from: c */
    private byte[][] f26615c;
    /* renamed from: d */
    private boolean f26616d;

    public aeu() {
        this.f26613a = aeh.f15114h;
        this.f26614b = "";
        this.f26615c = aeh.f15113g;
        this.f26616d = false;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: b */
    private aeu m31396b() {
        try {
            aeu aeu = (aeu) super.mo6840c();
            if (this.f26615c != null && this.f26615c.length > 0) {
                aeu.f26615c = (byte[][]) this.f26615c.clone();
            }
            return aeu;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (!Arrays.equals(this.f26613a, aeh.f15114h)) {
            a += ady.m19011b(1, this.f26613a);
        }
        if (this.f26615c != null && this.f26615c.length > 0) {
            int i = 0;
            int i2 = 0;
            for (byte[] bArr : this.f26615c) {
                if (bArr != null) {
                    i2++;
                    i += ady.m19012b(bArr);
                }
            }
            a = (a + i) + (i2 * 1);
        }
        if (this.f26616d) {
            a += ady.m19007b(3) + 1;
        }
        return (this.f26614b == null || this.f26614b.equals("")) ? a : a + ady.m19010b(4, this.f26614b);
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f26613a = adx.m18991f();
            } else if (a == 18) {
                a = aeh.m19070a(adx, 18);
                int length = this.f26615c == null ? 0 : this.f26615c.length;
                Object obj = new byte[(a + length)][];
                if (length != 0) {
                    System.arraycopy(this.f26615c, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = adx.m18991f();
                    adx.m18978a();
                    length++;
                }
                obj[length] = adx.m18991f();
                this.f26615c = obj;
            } else if (a == 24) {
                this.f26616d = adx.m18988d();
            } else if (a == 34) {
                this.f26614b = adx.m18989e();
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (!Arrays.equals(this.f26613a, aeh.f15114h)) {
            ady.m19026a(1, this.f26613a);
        }
        if (this.f26615c != null && this.f26615c.length > 0) {
            for (byte[] bArr : this.f26615c) {
                if (bArr != null) {
                    ady.m19026a(2, bArr);
                }
            }
        }
        if (this.f26616d) {
            ady.m19025a(3, this.f26616d);
        }
        if (!(this.f26614b == null || this.f26614b.equals(""))) {
            ady.m19024a(4, this.f26614b);
        }
        super.mo4218a(ady);
    }

    /* renamed from: c */
    public final /* synthetic */ adz mo6840c() throws CloneNotSupportedException {
        return (aeu) clone();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m31396b();
    }

    /* renamed from: d */
    public final /* synthetic */ aee mo4220d() throws CloneNotSupportedException {
        return (aeu) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aeu)) {
            return false;
        }
        aeu aeu = (aeu) obj;
        if (!Arrays.equals(this.f26613a, aeu.f26613a)) {
            return false;
        }
        if (this.f26614b == null) {
            if (aeu.f26614b != null) {
                return false;
            }
        } else if (!this.f26614b.equals(aeu.f26614b)) {
            return false;
        }
        if (!aed.m19055a(this.f26615c, aeu.f26615c) || this.f26616d != aeu.f26616d) {
            return false;
        }
        if (this.X != null) {
            if (!this.X.m19041b()) {
                return this.X.equals(aeu.X);
            }
        }
        return aeu.X == null || aeu.X.m19041b();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f26613a)) * 31) + (this.f26614b == null ? 0 : this.f26614b.hashCode())) * 31) + aed.m19050a(this.f26615c)) * 31) + (this.f26616d ? 1231 : 1237)) * 31;
        if (this.X != null) {
            if (!this.X.m19041b()) {
                i = this.X.hashCode();
            }
        }
        return hashCode + i;
    }
}
