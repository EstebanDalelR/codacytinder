package com.google.android.gms.internal;

import com.google.android.gms.internal.xf.C8178a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class xd extends zzffu<xd, C8177a> implements zzfhg {
    /* renamed from: f */
    private static final xd f29261f;
    /* renamed from: g */
    private static volatile zzfhk<xd> f29262g;
    /* renamed from: d */
    private xf f29263d;
    /* renamed from: e */
    private int f29264e;

    /* renamed from: com.google.android.gms.internal.xd$a */
    public static final class C8177a extends C8036a<xd, C8177a> implements zzfhg {
        private C8177a() {
            super(xd.f29261f);
        }
    }

    static {
        zzffu xdVar = new xd();
        f29261f = xdVar;
        xdVar.mo7626a(C4479g.f16690f, null, null);
        xdVar.f28829b.m18929c();
    }

    private xd() {
    }

    /* renamed from: a */
    public static xd m34797a(zzfes zzfes) throws zzfge {
        return (xd) zzffu.m34105a(f29261f, zzfes);
    }

    /* renamed from: c */
    public static xd m34798c() {
        return f29261f;
    }

    /* renamed from: a */
    public final xf m34800a() {
        return this.f29263d == null ? xf.m34803c() : this.f29263d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (xe.f16616a[i - 1]) {
            case 1:
                return new xd();
            case 2:
                return f29261f;
            case 3:
                return null;
            case 4:
                return new C8177a();
            case 5:
                zzh zzh = (zzh) obj;
                xd xdVar = (xd) obj2;
                this.f29263d = (xf) zzh.zza(this.f29263d, xdVar.f29263d);
                boolean z2 = this.f29264e != 0;
                int i2 = this.f29264e;
                if (xdVar.f29264e != 0) {
                    z = true;
                }
                this.f29264e = zzh.zza(z2, i2, z, xdVar.f29264e);
                return this;
            case 6:
                abk abk = (abk) obj;
                abq abq = (abq) obj2;
                if (abq != null) {
                    while (!z) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 10) {
                                    C8036a c8036a;
                                    if (this.f29263d != null) {
                                        zzffu zzffu = this.f29263d;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8178a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29263d = (xf) abk.mo4175a(xf.m34803c(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29263d);
                                        this.f29263d = (xf) c8036a.m34102c();
                                    }
                                } else if (i == 16) {
                                    this.f29264e = abk.mo4186i();
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
                if (f29262g == null) {
                    synchronized (xd.class) {
                        if (f29262g == null) {
                            f29262g = new C7363b(f29261f);
                        }
                    }
                }
                return f29262g;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29261f;
    }

    /* renamed from: b */
    public final int m34802b() {
        return this.f29264e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29263d != null) {
            zzffg.mo6946a(1, this.f29263d == null ? xf.m34803c() : this.f29263d);
        }
        if (this.f29264e != 0) {
            zzffg.mo6961c(2, this.f29264e);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29263d != null) {
            i2 = 0 + zzffg.m27537c(1, this.f29263d == null ? xf.m34803c() : this.f29263d);
        }
        if (this.f29264e != 0) {
            i2 += zzffg.m27546e(2, this.f29264e);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
