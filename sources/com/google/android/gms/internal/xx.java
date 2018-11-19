package com.google.android.gms.internal;

import com.google.android.gms.internal.xz.C8190a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class xx extends zzffu<xx, C8189a> implements zzfhg {
    /* renamed from: f */
    private static final xx f29310f;
    /* renamed from: g */
    private static volatile zzfhk<xx> f29311g;
    /* renamed from: d */
    private int f29312d;
    /* renamed from: e */
    private xz f29313e;

    /* renamed from: com.google.android.gms.internal.xx$a */
    public static final class C8189a extends C8036a<xx, C8189a> implements zzfhg {
        private C8189a() {
            super(xx.f29310f);
        }

        /* renamed from: a */
        public final C8189a m34893a(int i) {
            m34101b();
            ((xx) this.a).m34896a(0);
            return this;
        }

        /* renamed from: a */
        public final C8189a m34894a(xz xzVar) {
            m34101b();
            ((xx) this.a).m34899a(xzVar);
            return this;
        }
    }

    static {
        zzffu xxVar = new xx();
        f29310f = xxVar;
        xxVar.mo7626a(C4479g.f16690f, null, null);
        xxVar.f28829b.m18929c();
    }

    private xx() {
    }

    /* renamed from: a */
    public static xx m34895a(zzfes zzfes) throws zzfge {
        return (xx) zzffu.m34105a(f29310f, zzfes);
    }

    /* renamed from: a */
    private final void m34896a(int i) {
        this.f29312d = i;
    }

    /* renamed from: a */
    private final void m34899a(xz xzVar) {
        if (xzVar == null) {
            throw new NullPointerException();
        }
        this.f29313e = xzVar;
    }

    /* renamed from: c */
    public static C8189a m34900c() {
        zzffu zzffu = f29310f;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8189a) c8036a;
    }

    /* renamed from: a */
    public final int m34902a() {
        return this.f29312d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (xy.f16638a[i - 1]) {
            case 1:
                return new xx();
            case 2:
                return f29310f;
            case 3:
                return null;
            case 4:
                return new C8189a();
            case 5:
                zzh zzh = (zzh) obj;
                xx xxVar = (xx) obj2;
                boolean z2 = this.f29312d != 0;
                int i2 = this.f29312d;
                if (xxVar.f29312d != 0) {
                    z = true;
                }
                this.f29312d = zzh.zza(z2, i2, z, xxVar.f29312d);
                this.f29313e = (xz) zzh.zza(this.f29313e, xxVar.f29313e);
                return this;
            case 6:
                abk abk = (abk) obj;
                abq abq = (abq) obj2;
                if (abq != null) {
                    while (!z) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 8) {
                                    this.f29312d = abk.mo4186i();
                                } else if (i == 18) {
                                    C8036a c8036a;
                                    if (this.f29313e != null) {
                                        zzffu zzffu = this.f29313e;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8190a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29313e = (xz) abk.mo4175a(xz.m34906c(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29313e);
                                        this.f29313e = (xz) c8036a.m34102c();
                                    }
                                } else if (m34113a(i, abk)) {
                                }
                            }
                            z = true;
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
                if (f29311g == null) {
                    synchronized (xx.class) {
                        if (f29311g == null) {
                            f29311g = new C7363b(f29310f);
                        }
                    }
                }
                return f29311g;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29310f;
    }

    /* renamed from: b */
    public final xz m34904b() {
        return this.f29313e == null ? xz.m34906c() : this.f29313e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29312d != 0) {
            zzffg.mo6961c(1, this.f29312d);
        }
        if (this.f29313e != null) {
            zzffg.mo6946a(2, this.f29313e == null ? xz.m34906c() : this.f29313e);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29312d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29312d);
        }
        if (this.f29313e != null) {
            i2 += zzffg.m27537c(2, this.f29313e == null ? xz.m34906c() : this.f29313e);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
