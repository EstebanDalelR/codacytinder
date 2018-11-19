package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class xf extends zzffu<xf, C8178a> implements zzfhg {
    /* renamed from: f */
    private static final xf f29265f;
    /* renamed from: g */
    private static volatile zzfhk<xf> f29266g;
    /* renamed from: d */
    private int f29267d;
    /* renamed from: e */
    private int f29268e;

    /* renamed from: com.google.android.gms.internal.xf$a */
    public static final class C8178a extends C8036a<xf, C8178a> implements zzfhg {
        private C8178a() {
            super(xf.f29265f);
        }
    }

    static {
        zzffu xfVar = new xf();
        f29265f = xfVar;
        xfVar.mo7626a(C4479g.f16690f, null, null);
        xfVar.f28829b.m18929c();
    }

    private xf() {
    }

    /* renamed from: c */
    public static xf m34803c() {
        return f29265f;
    }

    /* renamed from: a */
    public final zzdsq m34805a() {
        zzdsq zzfr = zzdsq.zzfr(this.f29267d);
        return zzfr == null ? zzdsq.UNRECOGNIZED : zzfr;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (xg.f16617a[i - 1]) {
            case 1:
                return new xf();
            case 2:
                return f29265f;
            case 3:
                return null;
            case 4:
                return new C8178a();
            case 5:
                zzh zzh = (zzh) obj;
                xf xfVar = (xf) obj2;
                this.f29267d = zzh.zza(this.f29267d != 0, this.f29267d, xfVar.f29267d != 0, xfVar.f29267d);
                boolean z2 = this.f29268e != 0;
                int i2 = this.f29268e;
                if (xfVar.f29268e == 0) {
                    z = false;
                }
                this.f29268e = zzh.zza(z2, i2, z, xfVar.f29268e);
                return this;
            case 6:
                abk abk = (abk) obj;
                if (((abq) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 8) {
                                    this.f29267d = abk.mo4187j();
                                } else if (i == 16) {
                                    this.f29268e = abk.mo4186i();
                                } else if (m34113a(i, abk)) {
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
                if (f29266g == null) {
                    synchronized (xf.class) {
                        if (f29266g == null) {
                            f29266g = new C7363b(f29265f);
                        }
                    }
                }
                return f29266g;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29265f;
    }

    /* renamed from: b */
    public final int m34807b() {
        return this.f29268e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29267d != zzdsq.UNKNOWN_HASH.zzhq()) {
            zzffg.mo6955b(1, this.f29267d);
        }
        if (this.f29268e != 0) {
            zzffg.mo6961c(2, this.f29268e);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29267d != zzdsq.UNKNOWN_HASH.zzhq()) {
            i2 = 0 + zzffg.m27552g(1, this.f29267d);
        }
        if (this.f29268e != 0) {
            i2 += zzffg.m27546e(2, this.f29268e);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
