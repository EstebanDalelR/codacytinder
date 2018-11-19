package com.google.android.gms.internal;

import com.google.android.gms.internal.vv.C8162a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class vr extends zzffu<vr, C8160a> implements zzfhg {
    /* renamed from: g */
    private static final vr f29190g;
    /* renamed from: h */
    private static volatile zzfhk<vr> f29191h;
    /* renamed from: d */
    private int f29192d;
    /* renamed from: e */
    private vv f29193e;
    /* renamed from: f */
    private zzfes f29194f = zzfes.f16682a;

    /* renamed from: com.google.android.gms.internal.vr$a */
    public static final class C8160a extends C8036a<vr, C8160a> implements zzfhg {
        private C8160a() {
            super(vr.f29190g);
        }

        /* renamed from: a */
        public final C8160a m34636a(int i) {
            m34101b();
            ((vr) this.a).m34640a(0);
            return this;
        }

        /* renamed from: a */
        public final C8160a m34637a(vv vvVar) {
            m34101b();
            ((vr) this.a).m34644a(vvVar);
            return this;
        }

        /* renamed from: a */
        public final C8160a m34638a(zzfes zzfes) {
            m34101b();
            ((vr) this.a).m34645b(zzfes);
            return this;
        }
    }

    static {
        zzffu vrVar = new vr();
        f29190g = vrVar;
        vrVar.mo7626a(C4479g.f16690f, null, null);
        vrVar.f28829b.m18929c();
    }

    private vr() {
    }

    /* renamed from: a */
    public static vr m34639a(zzfes zzfes) throws zzfge {
        return (vr) zzffu.m34105a(f29190g, zzfes);
    }

    /* renamed from: a */
    private final void m34640a(int i) {
        this.f29192d = i;
    }

    /* renamed from: a */
    private final void m34644a(vv vvVar) {
        if (vvVar == null) {
            throw new NullPointerException();
        }
        this.f29193e = vvVar;
    }

    /* renamed from: b */
    private final void m34645b(zzfes zzfes) {
        if (zzfes == null) {
            throw new NullPointerException();
        }
        this.f29194f = zzfes;
    }

    /* renamed from: d */
    public static C8160a m34646d() {
        zzffu zzffu = f29190g;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8160a) c8036a;
    }

    /* renamed from: e */
    public static vr m34647e() {
        return f29190g;
    }

    /* renamed from: a */
    public final int m34649a() {
        return this.f29192d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (vs.f16599a[i - 1]) {
            case 1:
                return new vr();
            case 2:
                return f29190g;
            case 3:
                return null;
            case 4:
                return new C8160a();
            case 5:
                zzh zzh = (zzh) obj;
                vr vrVar = (vr) obj2;
                this.f29192d = zzh.zza(this.f29192d != 0, this.f29192d, vrVar.f29192d != 0, vrVar.f29192d);
                this.f29193e = (vv) zzh.zza(this.f29193e, vrVar.f29193e);
                boolean z2 = this.f29194f != zzfes.f16682a;
                zzfes zzfes = this.f29194f;
                if (vrVar.f29194f != zzfes.f16682a) {
                    z = true;
                }
                this.f29194f = zzh.zza(z2, zzfes, z, vrVar.f29194f);
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
                                    this.f29192d = abk.mo4186i();
                                } else if (i == 18) {
                                    C8036a c8036a;
                                    if (this.f29193e != null) {
                                        zzffu zzffu = this.f29193e;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8162a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29193e = (vv) abk.mo4175a(vv.m34659b(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29193e);
                                        this.f29193e = (vv) c8036a.m34102c();
                                    }
                                } else if (i == 26) {
                                    this.f29194f = abk.mo4185h();
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
                if (f29191h == null) {
                    synchronized (vr.class) {
                        if (f29191h == null) {
                            f29191h = new C7363b(f29190g);
                        }
                    }
                }
                return f29191h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29190g;
    }

    /* renamed from: b */
    public final vv m34651b() {
        return this.f29193e == null ? vv.m34659b() : this.f29193e;
    }

    /* renamed from: c */
    public final zzfes m34652c() {
        return this.f29194f;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29192d != 0) {
            zzffg.mo6961c(1, this.f29192d);
        }
        if (this.f29193e != null) {
            zzffg.mo6946a(2, this.f29193e == null ? vv.m34659b() : this.f29193e);
        }
        if (!this.f29194f.m20310b()) {
            zzffg.mo6945a(3, this.f29194f);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29192d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29192d);
        }
        if (this.f29193e != null) {
            i2 += zzffg.m27537c(2, this.f29193e == null ? vv.m34659b() : this.f29193e);
        }
        if (!this.f29194f.m20310b()) {
            i2 += zzffg.m27536c(3, this.f29194f);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
