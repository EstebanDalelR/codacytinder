package com.google.android.gms.internal;

import com.google.android.gms.internal.wb.C8165a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class vx extends zzffu<vx, C8163a> implements zzfhg {
    /* renamed from: g */
    private static final vx f29202g;
    /* renamed from: h */
    private static volatile zzfhk<vx> f29203h;
    /* renamed from: d */
    private int f29204d;
    /* renamed from: e */
    private wb f29205e;
    /* renamed from: f */
    private zzfes f29206f = zzfes.f16682a;

    /* renamed from: com.google.android.gms.internal.vx$a */
    public static final class C8163a extends C8036a<vx, C8163a> implements zzfhg {
        private C8163a() {
            super(vx.f29202g);
        }

        /* renamed from: a */
        public final C8163a m34663a(int i) {
            m34101b();
            ((vx) this.a).m34667a(0);
            return this;
        }

        /* renamed from: a */
        public final C8163a m34664a(wb wbVar) {
            m34101b();
            ((vx) this.a).m34671a(wbVar);
            return this;
        }

        /* renamed from: a */
        public final C8163a m34665a(zzfes zzfes) {
            m34101b();
            ((vx) this.a).m34672b(zzfes);
            return this;
        }
    }

    static {
        zzffu vxVar = new vx();
        f29202g = vxVar;
        vxVar.mo7626a(C4479g.f16690f, null, null);
        vxVar.f28829b.m18929c();
    }

    private vx() {
    }

    /* renamed from: a */
    public static vx m34666a(zzfes zzfes) throws zzfge {
        return (vx) zzffu.m34105a(f29202g, zzfes);
    }

    /* renamed from: a */
    private final void m34667a(int i) {
        this.f29204d = i;
    }

    /* renamed from: a */
    private final void m34671a(wb wbVar) {
        if (wbVar == null) {
            throw new NullPointerException();
        }
        this.f29205e = wbVar;
    }

    /* renamed from: b */
    private final void m34672b(zzfes zzfes) {
        if (zzfes == null) {
            throw new NullPointerException();
        }
        this.f29206f = zzfes;
    }

    /* renamed from: d */
    public static C8163a m34673d() {
        zzffu zzffu = f29202g;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8163a) c8036a;
    }

    /* renamed from: a */
    public final int m34675a() {
        return this.f29204d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (vy.f16602a[i - 1]) {
            case 1:
                return new vx();
            case 2:
                return f29202g;
            case 3:
                return null;
            case 4:
                return new C8163a();
            case 5:
                zzh zzh = (zzh) obj;
                vx vxVar = (vx) obj2;
                this.f29204d = zzh.zza(this.f29204d != 0, this.f29204d, vxVar.f29204d != 0, vxVar.f29204d);
                this.f29205e = (wb) zzh.zza(this.f29205e, vxVar.f29205e);
                boolean z2 = this.f29206f != zzfes.f16682a;
                zzfes zzfes = this.f29206f;
                if (vxVar.f29206f != zzfes.f16682a) {
                    z = true;
                }
                this.f29206f = zzh.zza(z2, zzfes, z, vxVar.f29206f);
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
                                    this.f29204d = abk.mo4186i();
                                } else if (i == 18) {
                                    C8036a c8036a;
                                    if (this.f29205e != null) {
                                        zzffu zzffu = this.f29205e;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8165a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29205e = (wb) abk.mo4175a(wb.m34684b(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29205e);
                                        this.f29205e = (wb) c8036a.m34102c();
                                    }
                                } else if (i == 26) {
                                    this.f29206f = abk.mo4185h();
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
                if (f29203h == null) {
                    synchronized (vx.class) {
                        if (f29203h == null) {
                            f29203h = new C7363b(f29202g);
                        }
                    }
                }
                return f29203h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29202g;
    }

    /* renamed from: b */
    public final wb m34677b() {
        return this.f29205e == null ? wb.m34684b() : this.f29205e;
    }

    /* renamed from: c */
    public final zzfes m34678c() {
        return this.f29206f;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29204d != 0) {
            zzffg.mo6961c(1, this.f29204d);
        }
        if (this.f29205e != null) {
            zzffg.mo6946a(2, this.f29205e == null ? wb.m34684b() : this.f29205e);
        }
        if (!this.f29206f.m20310b()) {
            zzffg.mo6945a(3, this.f29206f);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29204d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29204d);
        }
        if (this.f29205e != null) {
            i2 += zzffg.m27537c(2, this.f29205e == null ? wb.m34684b() : this.f29205e);
        }
        if (!this.f29206f.m20310b()) {
            i2 += zzffg.m27536c(3, this.f29206f);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
