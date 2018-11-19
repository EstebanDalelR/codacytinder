package com.google.android.gms.internal;

import com.google.android.gms.internal.xf.C8178a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class xb extends zzffu<xb, C8176a> implements zzfhg {
    /* renamed from: g */
    private static final xb f29256g;
    /* renamed from: h */
    private static volatile zzfhk<xb> f29257h;
    /* renamed from: d */
    private int f29258d;
    /* renamed from: e */
    private xf f29259e;
    /* renamed from: f */
    private zzfes f29260f = zzfes.f16682a;

    /* renamed from: com.google.android.gms.internal.xb$a */
    public static final class C8176a extends C8036a<xb, C8176a> implements zzfhg {
        private C8176a() {
            super(xb.f29256g);
        }

        /* renamed from: a */
        public final C8176a m34780a(int i) {
            m34101b();
            ((xb) this.a).m34784a(0);
            return this;
        }

        /* renamed from: a */
        public final C8176a m34781a(xf xfVar) {
            m34101b();
            ((xb) this.a).m34788a(xfVar);
            return this;
        }

        /* renamed from: a */
        public final C8176a m34782a(zzfes zzfes) {
            m34101b();
            ((xb) this.a).m34789b(zzfes);
            return this;
        }
    }

    static {
        zzffu xbVar = new xb();
        f29256g = xbVar;
        xbVar.mo7626a(C4479g.f16690f, null, null);
        xbVar.f28829b.m18929c();
    }

    private xb() {
    }

    /* renamed from: a */
    public static xb m34783a(zzfes zzfes) throws zzfge {
        return (xb) zzffu.m34105a(f29256g, zzfes);
    }

    /* renamed from: a */
    private final void m34784a(int i) {
        this.f29258d = i;
    }

    /* renamed from: a */
    private final void m34788a(xf xfVar) {
        if (xfVar == null) {
            throw new NullPointerException();
        }
        this.f29259e = xfVar;
    }

    /* renamed from: b */
    private final void m34789b(zzfes zzfes) {
        if (zzfes == null) {
            throw new NullPointerException();
        }
        this.f29260f = zzfes;
    }

    /* renamed from: d */
    public static C8176a m34790d() {
        zzffu zzffu = f29256g;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8176a) c8036a;
    }

    /* renamed from: e */
    public static xb m34791e() {
        return f29256g;
    }

    /* renamed from: a */
    public final int m34793a() {
        return this.f29258d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (xc.f16615a[i - 1]) {
            case 1:
                return new xb();
            case 2:
                return f29256g;
            case 3:
                return null;
            case 4:
                return new C8176a();
            case 5:
                zzh zzh = (zzh) obj;
                xb xbVar = (xb) obj2;
                this.f29258d = zzh.zza(this.f29258d != 0, this.f29258d, xbVar.f29258d != 0, xbVar.f29258d);
                this.f29259e = (xf) zzh.zza(this.f29259e, xbVar.f29259e);
                boolean z2 = this.f29260f != zzfes.f16682a;
                zzfes zzfes = this.f29260f;
                if (xbVar.f29260f != zzfes.f16682a) {
                    z = true;
                }
                this.f29260f = zzh.zza(z2, zzfes, z, xbVar.f29260f);
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
                                    this.f29258d = abk.mo4186i();
                                } else if (i == 18) {
                                    C8036a c8036a;
                                    if (this.f29259e != null) {
                                        zzffu zzffu = this.f29259e;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8178a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29259e = (xf) abk.mo4175a(xf.m34803c(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29259e);
                                        this.f29259e = (xf) c8036a.m34102c();
                                    }
                                } else if (i == 26) {
                                    this.f29260f = abk.mo4185h();
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
                if (f29257h == null) {
                    synchronized (xb.class) {
                        if (f29257h == null) {
                            f29257h = new C7363b(f29256g);
                        }
                    }
                }
                return f29257h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29256g;
    }

    /* renamed from: b */
    public final xf m34795b() {
        return this.f29259e == null ? xf.m34803c() : this.f29259e;
    }

    /* renamed from: c */
    public final zzfes m34796c() {
        return this.f29260f;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29258d != 0) {
            zzffg.mo6961c(1, this.f29258d);
        }
        if (this.f29259e != null) {
            zzffg.mo6946a(2, this.f29259e == null ? xf.m34803c() : this.f29259e);
        }
        if (!this.f29260f.m20310b()) {
            zzffg.mo6945a(3, this.f29260f);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29258d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29258d);
        }
        if (this.f29259e != null) {
            i2 += zzffg.m27537c(2, this.f29259e == null ? xf.m34803c() : this.f29259e);
        }
        if (!this.f29260f.m20310b()) {
            i2 += zzffg.m27536c(3, this.f29260f);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
