package com.google.android.gms.internal;

import com.google.android.gms.internal.vt.C8161a;
import com.google.android.gms.internal.xd.C8177a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class vp extends zzffu<vp, C8159a> implements zzfhg {
    /* renamed from: f */
    private static final vp f29186f;
    /* renamed from: g */
    private static volatile zzfhk<vp> f29187g;
    /* renamed from: d */
    private vt f29188d;
    /* renamed from: e */
    private xd f29189e;

    /* renamed from: com.google.android.gms.internal.vp$a */
    public static final class C8159a extends C8036a<vp, C8159a> implements zzfhg {
        private C8159a() {
            super(vp.f29186f);
        }
    }

    static {
        zzffu vpVar = new vp();
        f29186f = vpVar;
        vpVar.mo7626a(C4479g.f16690f, null, null);
        vpVar.f28829b.m18929c();
    }

    private vp() {
    }

    /* renamed from: a */
    public static vp m34631a(zzfes zzfes) throws zzfge {
        return (vp) zzffu.m34105a(f29186f, zzfes);
    }

    /* renamed from: a */
    public final vt m34633a() {
        return this.f29188d == null ? vt.m34654c() : this.f29188d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        switch (vq.f16598a[i - 1]) {
            case 1:
                return new vp();
            case 2:
                return f29186f;
            case 3:
                return null;
            case 4:
                return new C8159a();
            case 5:
                zzh zzh = (zzh) obj;
                vp vpVar = (vp) obj2;
                this.f29188d = (vt) zzh.zza(this.f29188d, vpVar.f29188d);
                this.f29189e = (xd) zzh.zza(this.f29189e, vpVar.f29189e);
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
                                zzffu zzffu;
                                C8036a c8036a;
                                C8036a c8036a2;
                                if (a == 10) {
                                    if (this.f29188d != null) {
                                        zzffu = this.f29188d;
                                        c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a.m34100a(zzffu);
                                        c8036a2 = (C8161a) c8036a;
                                    } else {
                                        c8036a2 = null;
                                    }
                                    this.f29188d = (vt) abk.mo4175a(vt.m34654c(), abq);
                                    if (c8036a2 != null) {
                                        c8036a2.m34100a(this.f29188d);
                                        this.f29188d = (vt) c8036a2.m34102c();
                                    }
                                } else if (a == 18) {
                                    if (this.f29189e != null) {
                                        zzffu = this.f29189e;
                                        c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a.m34100a(zzffu);
                                        c8036a2 = (C8177a) c8036a;
                                    } else {
                                        c8036a2 = null;
                                    }
                                    this.f29189e = (xd) abk.mo4175a(xd.m34798c(), abq);
                                    if (c8036a2 != null) {
                                        c8036a2.m34100a(this.f29189e);
                                        this.f29189e = (xd) c8036a2.m34102c();
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
                if (f29187g == null) {
                    synchronized (vp.class) {
                        if (f29187g == null) {
                            f29187g = new C7363b(f29186f);
                        }
                    }
                }
                return f29187g;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29186f;
    }

    /* renamed from: b */
    public final xd m34635b() {
        return this.f29189e == null ? xd.m34798c() : this.f29189e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29188d != null) {
            zzffg.mo6946a(1, this.f29188d == null ? vt.m34654c() : this.f29188d);
        }
        if (this.f29189e != null) {
            zzffg.mo6946a(2, this.f29189e == null ? xd.m34798c() : this.f29189e);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29188d != null) {
            i2 = 0 + zzffg.m27537c(1, this.f29188d == null ? vt.m34654c() : this.f29188d);
        }
        if (this.f29189e != null) {
            i2 += zzffg.m27537c(2, this.f29189e == null ? xd.m34798c() : this.f29189e);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
