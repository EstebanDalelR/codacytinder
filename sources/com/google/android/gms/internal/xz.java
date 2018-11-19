package com.google.android.gms.internal;

import com.google.android.gms.internal.xl.C8179a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class xz extends zzffu<xz, C8190a> implements zzfhg {
    /* renamed from: f */
    private static final xz f29314f;
    /* renamed from: g */
    private static volatile zzfhk<xz> f29315g;
    /* renamed from: d */
    private String f29316d = "";
    /* renamed from: e */
    private xl f29317e;

    /* renamed from: com.google.android.gms.internal.xz$a */
    public static final class C8190a extends C8036a<xz, C8190a> implements zzfhg {
        private C8190a() {
            super(xz.f29314f);
        }
    }

    static {
        zzffu xzVar = new xz();
        f29314f = xzVar;
        xzVar.mo7626a(C4479g.f16690f, null, null);
        xzVar.f28829b.m18929c();
    }

    private xz() {
    }

    /* renamed from: a */
    public static xz m34905a(zzfes zzfes) throws zzfge {
        return (xz) zzffu.m34105a(f29314f, zzfes);
    }

    /* renamed from: c */
    public static xz m34906c() {
        return f29314f;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        switch (ya.f16639a[i - 1]) {
            case 1:
                return new xz();
            case 2:
                return f29314f;
            case 3:
                return null;
            case 4:
                return new C8190a();
            case 5:
                zzh zzh = (zzh) obj;
                xz xzVar = (xz) obj2;
                this.f29316d = zzh.zza(this.f29316d.isEmpty() ^ true, this.f29316d, true ^ xzVar.f29316d.isEmpty(), xzVar.f29316d);
                this.f29317e = (xl) zzh.zza(this.f29317e, xzVar.f29317e);
                return this;
            case 6:
                abk abk = (abk) obj;
                abq abq = (abq) obj2;
                if (abq != null) {
                    Object obj3 = null;
                    while (obj3 == null) {
                        try {
                            int a = abk.mo4174a();
                            if (a != 0) {
                                if (a == 10) {
                                    this.f29316d = abk.mo4184g();
                                } else if (a == 18) {
                                    C8036a c8036a;
                                    if (this.f29317e != null) {
                                        zzffu zzffu = this.f29317e;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8179a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29317e = (xl) abk.mo4175a(xl.m34808c(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29317e);
                                        this.f29317e = (xl) c8036a.m34102c();
                                    }
                                } else if (m34113a(a, abk)) {
                                }
                            }
                            obj3 = 1;
                        } catch (zzfge e) {
                            throw new RuntimeException(e.m20323a(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new zzfge(e2.getMessage()).m20323a(this));
                        }
                    }
                    break;
                }
                throw new NullPointerException();
            case 7:
                break;
            case 8:
                if (f29315g == null) {
                    synchronized (xz.class) {
                        if (f29315g == null) {
                            f29315g = new C7363b(f29314f);
                        }
                    }
                }
                return f29315g;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29314f;
    }

    /* renamed from: a */
    public final String m34909a() {
        return this.f29316d;
    }

    /* renamed from: b */
    public final xl m34910b() {
        return this.f29317e == null ? xl.m34808c() : this.f29317e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (!this.f29316d.isEmpty()) {
            zzffg.mo6947a(1, this.f29316d);
        }
        if (this.f29317e != null) {
            zzffg.mo6946a(2, this.f29317e == null ? xl.m34808c() : this.f29317e);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f29316d.isEmpty()) {
            i2 = 0 + zzffg.m27528b(1, this.f29316d);
        }
        if (this.f29317e != null) {
            i2 += zzffg.m27537c(2, this.f29317e == null ? xl.m34808c() : this.f29317e);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
