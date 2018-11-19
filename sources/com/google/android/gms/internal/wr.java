package com.google.android.gms.internal;

import com.google.android.gms.internal.wn.C8170a;
import com.google.android.gms.internal.wx.C8175a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class wr extends zzffu<wr, C8172a> implements zzfhg {
    /* renamed from: g */
    private static final wr f29235g;
    /* renamed from: h */
    private static volatile zzfhk<wr> f29236h;
    /* renamed from: d */
    private wx f29237d;
    /* renamed from: e */
    private wn f29238e;
    /* renamed from: f */
    private int f29239f;

    /* renamed from: com.google.android.gms.internal.wr$a */
    public static final class C8172a extends C8036a<wr, C8172a> implements zzfhg {
        private C8172a() {
            super(wr.f29235g);
        }
    }

    static {
        zzffu wrVar = new wr();
        f29235g = wrVar;
        wrVar.mo7626a(C4479g.f16690f, null, null);
        wrVar.f28829b.m18929c();
    }

    private wr() {
    }

    /* renamed from: d */
    public static wr m34731d() {
        return f29235g;
    }

    /* renamed from: a */
    public final wx m34733a() {
        return this.f29237d == null ? wx.m34774d() : this.f29237d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (ws.f16611a[i - 1]) {
            case 1:
                return new wr();
            case 2:
                return f29235g;
            case 3:
                return null;
            case 4:
                return new C8172a();
            case 5:
                zzh zzh = (zzh) obj;
                wr wrVar = (wr) obj2;
                this.f29237d = (wx) zzh.zza(this.f29237d, wrVar.f29237d);
                this.f29238e = (wn) zzh.zza(this.f29238e, wrVar.f29238e);
                boolean z2 = this.f29239f != 0;
                int i2 = this.f29239f;
                if (wrVar.f29239f != 0) {
                    z = true;
                }
                this.f29239f = zzh.zza(z2, i2, z, wrVar.f29239f);
                return this;
            case 6:
                abk abk = (abk) obj;
                abq abq = (abq) obj2;
                if (abq != null) {
                    while (!z) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                zzffu zzffu;
                                C8036a c8036a;
                                C8036a c8036a2;
                                if (i == 10) {
                                    if (this.f29237d != null) {
                                        zzffu = this.f29237d;
                                        c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a.m34100a(zzffu);
                                        c8036a2 = (C8175a) c8036a;
                                    } else {
                                        c8036a2 = null;
                                    }
                                    this.f29237d = (wx) abk.mo4175a(wx.m34774d(), abq);
                                    if (c8036a2 != null) {
                                        c8036a2.m34100a(this.f29237d);
                                        this.f29237d = (wx) c8036a2.m34102c();
                                    }
                                } else if (i == 18) {
                                    if (this.f29238e != null) {
                                        zzffu = this.f29238e;
                                        c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a.m34100a(zzffu);
                                        c8036a2 = (C8170a) c8036a;
                                    } else {
                                        c8036a2 = null;
                                    }
                                    this.f29238e = (wn) abk.mo4175a(wn.m34723b(), abq);
                                    if (c8036a2 != null) {
                                        c8036a2.m34100a(this.f29238e);
                                        this.f29238e = (wn) c8036a2.m34102c();
                                    }
                                } else if (i == 24) {
                                    this.f29239f = abk.mo4187j();
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
                if (f29236h == null) {
                    synchronized (wr.class) {
                        if (f29236h == null) {
                            f29236h = new C7363b(f29235g);
                        }
                    }
                }
                return f29236h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29235g;
    }

    /* renamed from: b */
    public final wn m34735b() {
        return this.f29238e == null ? wn.m34723b() : this.f29238e;
    }

    /* renamed from: c */
    public final zzdsa m34736c() {
        zzdsa zzfn = zzdsa.zzfn(this.f29239f);
        return zzfn == null ? zzdsa.UNRECOGNIZED : zzfn;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29237d != null) {
            zzffg.mo6946a(1, this.f29237d == null ? wx.m34774d() : this.f29237d);
        }
        if (this.f29238e != null) {
            zzffg.mo6946a(2, this.f29238e == null ? wn.m34723b() : this.f29238e);
        }
        if (this.f29239f != zzdsa.UNKNOWN_FORMAT.zzhq()) {
            zzffg.mo6955b(3, this.f29239f);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29237d != null) {
            i2 = 0 + zzffg.m27537c(1, this.f29237d == null ? wx.m34774d() : this.f29237d);
        }
        if (this.f29238e != null) {
            i2 += zzffg.m27537c(2, this.f29238e == null ? wn.m34723b() : this.f29238e);
        }
        if (this.f29239f != zzdsa.UNKNOWN_FORMAT.zzhq()) {
            i2 += zzffg.m27552g(3, this.f29239f);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
