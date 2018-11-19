package com.google.android.gms.internal;

import com.google.android.gms.internal.xv.C8188a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class xt extends zzffu<xt, C8187a> implements zzfhg {
    /* renamed from: f */
    private static final xt f29303f;
    /* renamed from: g */
    private static volatile zzfhk<xt> f29304g;
    /* renamed from: d */
    private int f29305d;
    /* renamed from: e */
    private xv f29306e;

    /* renamed from: com.google.android.gms.internal.xt$a */
    public static final class C8187a extends C8036a<xt, C8187a> implements zzfhg {
        private C8187a() {
            super(xt.f29303f);
        }

        /* renamed from: a */
        public final C8187a m34876a(int i) {
            m34101b();
            ((xt) this.a).m34879a(0);
            return this;
        }

        /* renamed from: a */
        public final C8187a m34877a(xv xvVar) {
            m34101b();
            ((xt) this.a).m34882a(xvVar);
            return this;
        }
    }

    static {
        zzffu xtVar = new xt();
        f29303f = xtVar;
        xtVar.mo7626a(C4479g.f16690f, null, null);
        xtVar.f28829b.m18929c();
    }

    private xt() {
    }

    /* renamed from: a */
    public static xt m34878a(zzfes zzfes) throws zzfge {
        return (xt) zzffu.m34105a(f29303f, zzfes);
    }

    /* renamed from: a */
    private final void m34879a(int i) {
        this.f29305d = i;
    }

    /* renamed from: a */
    private final void m34882a(xv xvVar) {
        if (xvVar == null) {
            throw new NullPointerException();
        }
        this.f29306e = xvVar;
    }

    /* renamed from: c */
    public static C8187a m34883c() {
        zzffu zzffu = f29303f;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8187a) c8036a;
    }

    /* renamed from: a */
    public final int m34885a() {
        return this.f29305d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (xu.f16636a[i - 1]) {
            case 1:
                return new xt();
            case 2:
                return f29303f;
            case 3:
                return null;
            case 4:
                return new C8187a();
            case 5:
                zzh zzh = (zzh) obj;
                xt xtVar = (xt) obj2;
                boolean z2 = this.f29305d != 0;
                int i2 = this.f29305d;
                if (xtVar.f29305d != 0) {
                    z = true;
                }
                this.f29305d = zzh.zza(z2, i2, z, xtVar.f29305d);
                this.f29306e = (xv) zzh.zza(this.f29306e, xtVar.f29306e);
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
                                    this.f29305d = abk.mo4186i();
                                } else if (i == 18) {
                                    C8036a c8036a;
                                    if (this.f29306e != null) {
                                        zzffu zzffu = this.f29306e;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8188a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29306e = (xv) abk.mo4175a(xv.m34889b(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29306e);
                                        this.f29306e = (xv) c8036a.m34102c();
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
                if (f29304g == null) {
                    synchronized (xt.class) {
                        if (f29304g == null) {
                            f29304g = new C7363b(f29303f);
                        }
                    }
                }
                return f29304g;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29303f;
    }

    /* renamed from: b */
    public final xv m34887b() {
        return this.f29306e == null ? xv.m34889b() : this.f29306e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29305d != 0) {
            zzffg.mo6961c(1, this.f29305d);
        }
        if (this.f29306e != null) {
            zzffg.mo6946a(2, this.f29306e == null ? xv.m34889b() : this.f29306e);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29305d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29305d);
        }
        if (this.f29306e != null) {
            i2 += zzffg.m27537c(2, this.f29306e == null ? xv.m34889b() : this.f29306e);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
