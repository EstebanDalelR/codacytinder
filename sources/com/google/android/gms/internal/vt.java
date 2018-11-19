package com.google.android.gms.internal;

import com.google.android.gms.internal.vv.C8162a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class vt extends zzffu<vt, C8161a> implements zzfhg {
    /* renamed from: f */
    private static final vt f29195f;
    /* renamed from: g */
    private static volatile zzfhk<vt> f29196g;
    /* renamed from: d */
    private vv f29197d;
    /* renamed from: e */
    private int f29198e;

    /* renamed from: com.google.android.gms.internal.vt$a */
    public static final class C8161a extends C8036a<vt, C8161a> implements zzfhg {
        private C8161a() {
            super(vt.f29195f);
        }
    }

    static {
        zzffu vtVar = new vt();
        f29195f = vtVar;
        vtVar.mo7626a(C4479g.f16690f, null, null);
        vtVar.f28829b.m18929c();
    }

    private vt() {
    }

    /* renamed from: a */
    public static vt m34653a(zzfes zzfes) throws zzfge {
        return (vt) zzffu.m34105a(f29195f, zzfes);
    }

    /* renamed from: c */
    public static vt m34654c() {
        return f29195f;
    }

    /* renamed from: a */
    public final vv m34656a() {
        return this.f29197d == null ? vv.m34659b() : this.f29197d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (vu.f16600a[i - 1]) {
            case 1:
                return new vt();
            case 2:
                return f29195f;
            case 3:
                return null;
            case 4:
                return new C8161a();
            case 5:
                zzh zzh = (zzh) obj;
                vt vtVar = (vt) obj2;
                this.f29197d = (vv) zzh.zza(this.f29197d, vtVar.f29197d);
                boolean z2 = this.f29198e != 0;
                int i2 = this.f29198e;
                if (vtVar.f29198e != 0) {
                    z = true;
                }
                this.f29198e = zzh.zza(z2, i2, z, vtVar.f29198e);
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
                                    if (this.f29197d != null) {
                                        zzffu zzffu = this.f29197d;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8162a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29197d = (vv) abk.mo4175a(vv.m34659b(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29197d);
                                        this.f29197d = (vv) c8036a.m34102c();
                                    }
                                } else if (i == 16) {
                                    this.f29198e = abk.mo4186i();
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
                if (f29196g == null) {
                    synchronized (vt.class) {
                        if (f29196g == null) {
                            f29196g = new C7363b(f29195f);
                        }
                    }
                }
                return f29196g;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29195f;
    }

    /* renamed from: b */
    public final int m34658b() {
        return this.f29198e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29197d != null) {
            zzffg.mo6946a(1, this.f29197d == null ? vv.m34659b() : this.f29197d);
        }
        if (this.f29198e != 0) {
            zzffg.mo6961c(2, this.f29198e);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29197d != null) {
            i2 = 0 + zzffg.m27537c(1, this.f29197d == null ? vv.m34659b() : this.f29197d);
        }
        if (this.f29198e != 0) {
            i2 += zzffg.m27546e(2, this.f29198e);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
