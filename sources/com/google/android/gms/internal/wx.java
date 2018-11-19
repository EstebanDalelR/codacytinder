package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class wx extends zzffu<wx, C8175a> implements zzfhg {
    /* renamed from: g */
    private static final wx f29251g;
    /* renamed from: h */
    private static volatile zzfhk<wx> f29252h;
    /* renamed from: d */
    private int f29253d;
    /* renamed from: e */
    private int f29254e;
    /* renamed from: f */
    private zzfes f29255f = zzfes.f16682a;

    /* renamed from: com.google.android.gms.internal.wx$a */
    public static final class C8175a extends C8036a<wx, C8175a> implements zzfhg {
        private C8175a() {
            super(wx.f29251g);
        }
    }

    static {
        zzffu wxVar = new wx();
        f29251g = wxVar;
        wxVar.mo7626a(C4479g.f16690f, null, null);
        wxVar.f28829b.m18929c();
    }

    private wx() {
    }

    /* renamed from: d */
    public static wx m34774d() {
        return f29251g;
    }

    /* renamed from: a */
    public final zzdso m34776a() {
        zzdso zzfq = zzdso.zzfq(this.f29253d);
        return zzfq == null ? zzdso.UNRECOGNIZED : zzfq;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (wy.f16614a[i - 1]) {
            case 1:
                return new wx();
            case 2:
                return f29251g;
            case 3:
                return null;
            case 4:
                return new C8175a();
            case 5:
                zzh zzh = (zzh) obj;
                wx wxVar = (wx) obj2;
                this.f29253d = zzh.zza(this.f29253d != 0, this.f29253d, wxVar.f29253d != 0, wxVar.f29253d);
                this.f29254e = zzh.zza(this.f29254e != 0, this.f29254e, wxVar.f29254e != 0, wxVar.f29254e);
                boolean z2 = this.f29255f != zzfes.f16682a;
                zzfes zzfes = this.f29255f;
                if (wxVar.f29255f == zzfes.f16682a) {
                    z = false;
                }
                this.f29255f = zzh.zza(z2, zzfes, z, wxVar.f29255f);
                return this;
            case 6:
                abk abk = (abk) obj;
                if (((abq) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 8) {
                                    this.f29253d = abk.mo4187j();
                                } else if (i == 16) {
                                    this.f29254e = abk.mo4187j();
                                } else if (i == 90) {
                                    this.f29255f = abk.mo4185h();
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
                if (f29252h == null) {
                    synchronized (wx.class) {
                        if (f29252h == null) {
                            f29252h = new C7363b(f29251g);
                        }
                    }
                }
                return f29252h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29251g;
    }

    /* renamed from: b */
    public final zzdsq m34778b() {
        zzdsq zzfr = zzdsq.zzfr(this.f29254e);
        return zzfr == null ? zzdsq.UNRECOGNIZED : zzfr;
    }

    /* renamed from: c */
    public final zzfes m34779c() {
        return this.f29255f;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29253d != zzdso.UNKNOWN_CURVE.zzhq()) {
            zzffg.mo6955b(1, this.f29253d);
        }
        if (this.f29254e != zzdsq.UNKNOWN_HASH.zzhq()) {
            zzffg.mo6955b(2, this.f29254e);
        }
        if (!this.f29255f.m20310b()) {
            zzffg.mo6945a(11, this.f29255f);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29253d != zzdso.UNKNOWN_CURVE.zzhq()) {
            i2 = 0 + zzffg.m27552g(1, this.f29253d);
        }
        if (this.f29254e != zzdsq.UNKNOWN_HASH.zzhq()) {
            i2 += zzffg.m27552g(2, this.f29254e);
        }
        if (!this.f29255f.m20310b()) {
            i2 += zzffg.m27536c(11, this.f29255f);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
