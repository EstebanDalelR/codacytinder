package com.google.android.gms.internal;

import java.io.IOException;

public final class aes extends adz<aes> implements Cloneable {
    /* renamed from: a */
    private String[] f26605a;
    /* renamed from: b */
    private String[] f26606b;
    /* renamed from: c */
    private int[] f26607c;
    /* renamed from: d */
    private long[] f26608d;
    /* renamed from: e */
    private long[] f26609e;

    public aes() {
        this.f26605a = aeh.f15112f;
        this.f26606b = aeh.f15112f;
        this.f26607c = aeh.f15107a;
        this.f26608d = aeh.f15108b;
        this.f26609e = aeh.f15108b;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: b */
    private aes m31384b() {
        try {
            aes aes = (aes) super.mo6840c();
            if (this.f26605a != null && this.f26605a.length > 0) {
                aes.f26605a = (String[]) this.f26605a.clone();
            }
            if (this.f26606b != null && this.f26606b.length > 0) {
                aes.f26606b = (String[]) this.f26606b.clone();
            }
            if (this.f26607c != null && this.f26607c.length > 0) {
                aes.f26607c = (int[]) this.f26607c.clone();
            }
            if (this.f26608d != null && this.f26608d.length > 0) {
                aes.f26608d = (long[]) this.f26608d.clone();
            }
            if (this.f26609e != null && this.f26609e.length > 0) {
                aes.f26609e = (long[]) this.f26609e.clone();
            }
            return aes;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int i;
        int i2;
        int i3;
        int a = super.mo4217a();
        if (this.f26605a != null && this.f26605a.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.f26605a) {
                if (str != null) {
                    i2++;
                    i += ady.m19003a(str);
                }
            }
            a = (a + i) + (i2 * 1);
        }
        if (this.f26606b != null && this.f26606b.length > 0) {
            i = 0;
            i2 = 0;
            for (String str2 : this.f26606b) {
                if (str2 != null) {
                    i2++;
                    i += ady.m19003a(str2);
                }
            }
            a = (a + i) + (i2 * 1);
        }
        if (this.f26607c != null && this.f26607c.length > 0) {
            i = 0;
            for (int i22 : this.f26607c) {
                i += ady.m18999a(i22);
            }
            a = (a + i) + (this.f26607c.length * 1);
        }
        if (this.f26608d != null && this.f26608d.length > 0) {
            i = 0;
            for (long a2 : this.f26608d) {
                i += ady.m19000a(a2);
            }
            a = (a + i) + (this.f26608d.length * 1);
        }
        if (this.f26609e == null || this.f26609e.length <= 0) {
            return a;
        }
        i3 = 0;
        for (long a3 : this.f26609e) {
            i3 += ady.m19000a(a3);
        }
        return (a + i3) + (this.f26609e.length * 1);
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            int length;
            Object obj;
            if (a == 10) {
                a = aeh.m19070a(adx, 10);
                length = this.f26605a == null ? 0 : this.f26605a.length;
                obj = new String[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f26605a, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = adx.m18989e();
                    adx.m18978a();
                    length++;
                }
                obj[length] = adx.m18989e();
                this.f26605a = obj;
            } else if (a == 18) {
                a = aeh.m19070a(adx, 18);
                length = this.f26606b == null ? 0 : this.f26606b.length;
                obj = new String[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f26606b, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = adx.m18989e();
                    adx.m18978a();
                    length++;
                }
                obj[length] = adx.m18989e();
                this.f26606b = obj;
            } else if (a != 24) {
                int i;
                Object obj2;
                if (a == 26) {
                    a = adx.m18986c(adx.m18993h());
                    length = adx.m18998m();
                    i = 0;
                    while (adx.m18997l() > 0) {
                        adx.m18985c();
                        i++;
                    }
                    adx.m18990e(length);
                    length = this.f26607c == null ? 0 : this.f26607c.length;
                    obj2 = new int[(i + length)];
                    if (length != 0) {
                        System.arraycopy(this.f26607c, 0, obj2, 0, length);
                    }
                    while (length < obj2.length) {
                        obj2[length] = adx.m18985c();
                        length++;
                    }
                    this.f26607c = obj2;
                } else if (a == 32) {
                    a = aeh.m19070a(adx, 32);
                    length = this.f26608d == null ? 0 : this.f26608d.length;
                    obj = new long[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f26608d, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = adx.m18982b();
                        adx.m18978a();
                        length++;
                    }
                    obj[length] = adx.m18982b();
                    this.f26608d = obj;
                } else if (a == 34) {
                    a = adx.m18986c(adx.m18993h());
                    length = adx.m18998m();
                    i = 0;
                    while (adx.m18997l() > 0) {
                        adx.m18982b();
                        i++;
                    }
                    adx.m18990e(length);
                    length = this.f26608d == null ? 0 : this.f26608d.length;
                    obj2 = new long[(i + length)];
                    if (length != 0) {
                        System.arraycopy(this.f26608d, 0, obj2, 0, length);
                    }
                    while (length < obj2.length) {
                        obj2[length] = adx.m18982b();
                        length++;
                    }
                    this.f26608d = obj2;
                } else if (a == 40) {
                    a = aeh.m19070a(adx, 40);
                    length = this.f26609e == null ? 0 : this.f26609e.length;
                    obj = new long[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f26609e, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = adx.m18982b();
                        adx.m18978a();
                        length++;
                    }
                    obj[length] = adx.m18982b();
                    this.f26609e = obj;
                } else if (a == 42) {
                    a = adx.m18986c(adx.m18993h());
                    length = adx.m18998m();
                    i = 0;
                    while (adx.m18997l() > 0) {
                        adx.m18982b();
                        i++;
                    }
                    adx.m18990e(length);
                    length = this.f26609e == null ? 0 : this.f26609e.length;
                    obj2 = new long[(i + length)];
                    if (length != 0) {
                        System.arraycopy(this.f26609e, 0, obj2, 0, length);
                    }
                    while (length < obj2.length) {
                        obj2[length] = adx.m18982b();
                        length++;
                    }
                    this.f26609e = obj2;
                } else if (!super.m27063a(adx, a)) {
                    return this;
                }
                adx.m18987d(a);
            } else {
                a = aeh.m19070a(adx, 24);
                length = this.f26607c == null ? 0 : this.f26607c.length;
                obj = new int[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f26607c, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = adx.m18985c();
                    adx.m18978a();
                    length++;
                }
                obj[length] = adx.m18985c();
                this.f26607c = obj;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26605a != null && this.f26605a.length > 0) {
            for (String str : this.f26605a) {
                if (str != null) {
                    ady.m19024a(1, str);
                }
            }
        }
        if (this.f26606b != null && this.f26606b.length > 0) {
            for (String str2 : this.f26606b) {
                if (str2 != null) {
                    ady.m19024a(2, str2);
                }
            }
        }
        if (this.f26607c != null && this.f26607c.length > 0) {
            for (int a : this.f26607c) {
                ady.m19021a(3, a);
            }
        }
        if (this.f26608d != null && this.f26608d.length > 0) {
            for (long b : this.f26608d) {
                ady.m19028b(4, b);
            }
        }
        if (this.f26609e != null && this.f26609e.length > 0) {
            for (long b2 : this.f26609e) {
                ady.m19028b(5, b2);
            }
        }
        super.mo4218a(ady);
    }

    /* renamed from: c */
    public final /* synthetic */ adz mo6840c() throws CloneNotSupportedException {
        return (aes) clone();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m31384b();
    }

    /* renamed from: d */
    public final /* synthetic */ aee mo4220d() throws CloneNotSupportedException {
        return (aes) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aes)) {
            return false;
        }
        aes aes = (aes) obj;
        if (!aed.m19054a(this.f26605a, aes.f26605a) || !aed.m19054a(this.f26606b, aes.f26606b) || !aed.m19052a(this.f26607c, aes.f26607c) || !aed.m19053a(this.f26608d, aes.f26608d) || !aed.m19053a(this.f26609e, aes.f26609e)) {
            return false;
        }
        if (this.X != null) {
            if (!this.X.m19041b()) {
                return this.X.equals(aes.X);
            }
        }
        return aes.X == null || aes.X.m19041b();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((((getClass().getName().hashCode() + 527) * 31) + aed.m19049a(this.f26605a)) * 31) + aed.m19049a(this.f26606b)) * 31) + aed.m19047a(this.f26607c)) * 31) + aed.m19048a(this.f26608d)) * 31) + aed.m19048a(this.f26609e)) * 31;
        if (this.X != null) {
            if (!this.X.m19041b()) {
                hashCode = this.X.hashCode();
                return hashCode2 + hashCode;
            }
        }
        hashCode = 0;
        return hashCode2 + hashCode;
    }
}
