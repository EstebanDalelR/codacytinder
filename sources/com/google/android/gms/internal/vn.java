package com.google.android.gms.internal;

import com.google.android.gms.internal.vr.C8160a;
import com.google.android.gms.internal.xb.C8176a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class vn extends zzffu<vn, C8158a> implements zzfhg {
    /* renamed from: g */
    private static final vn f29181g;
    /* renamed from: h */
    private static volatile zzfhk<vn> f29182h;
    /* renamed from: d */
    private int f29183d;
    /* renamed from: e */
    private vr f29184e;
    /* renamed from: f */
    private xb f29185f;

    /* renamed from: com.google.android.gms.internal.vn$a */
    public static final class C8158a extends C8036a<vn, C8158a> implements zzfhg {
        private C8158a() {
            super(vn.f29181g);
        }

        /* renamed from: a */
        public final C8158a m34615a(int i) {
            m34101b();
            ((vn) this.a).m34619a(i);
            return this;
        }

        /* renamed from: a */
        public final C8158a m34616a(vr vrVar) {
            m34101b();
            ((vn) this.a).m34623a(vrVar);
            return this;
        }

        /* renamed from: a */
        public final C8158a m34617a(xb xbVar) {
            m34101b();
            ((vn) this.a).m34624a(xbVar);
            return this;
        }
    }

    static {
        zzffu vnVar = new vn();
        f29181g = vnVar;
        vnVar.mo7626a(C4479g.f16690f, null, null);
        vnVar.f28829b.m18929c();
    }

    private vn() {
    }

    /* renamed from: a */
    public static vn m34618a(zzfes zzfes) throws zzfge {
        return (vn) zzffu.m34105a(f29181g, zzfes);
    }

    /* renamed from: a */
    private final void m34619a(int i) {
        this.f29183d = i;
    }

    /* renamed from: a */
    private final void m34623a(vr vrVar) {
        if (vrVar == null) {
            throw new NullPointerException();
        }
        this.f29184e = vrVar;
    }

    /* renamed from: a */
    private final void m34624a(xb xbVar) {
        if (xbVar == null) {
            throw new NullPointerException();
        }
        this.f29185f = xbVar;
    }

    /* renamed from: d */
    public static C8158a m34625d() {
        zzffu zzffu = f29181g;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8158a) c8036a;
    }

    /* renamed from: a */
    public final int m34627a() {
        return this.f29183d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (vo.f16597a[i - 1]) {
            case 1:
                return new vn();
            case 2:
                return f29181g;
            case 3:
                return null;
            case 4:
                return new C8158a();
            case 5:
                zzh zzh = (zzh) obj;
                vn vnVar = (vn) obj2;
                boolean z2 = this.f29183d != 0;
                int i2 = this.f29183d;
                if (vnVar.f29183d != 0) {
                    z = true;
                }
                this.f29183d = zzh.zza(z2, i2, z, vnVar.f29183d);
                this.f29184e = (vr) zzh.zza(this.f29184e, vnVar.f29184e);
                this.f29185f = (xb) zzh.zza(this.f29185f, vnVar.f29185f);
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
                                    this.f29183d = abk.mo4186i();
                                } else if (i == 18) {
                                    if (this.f29184e != null) {
                                        r5 = this.f29184e;
                                        r3 = (C8036a) r5.mo7626a(C4479g.f16692h, null, null);
                                        r3.m34100a(r5);
                                        r5 = (C8160a) r3;
                                    } else {
                                        r5 = null;
                                    }
                                    this.f29184e = (vr) abk.mo4175a(vr.m34647e(), abq);
                                    if (r5 != null) {
                                        r5.m34100a(this.f29184e);
                                        this.f29184e = (vr) r5.m34102c();
                                    }
                                } else if (i == 26) {
                                    if (this.f29185f != null) {
                                        r5 = this.f29185f;
                                        r3 = (C8036a) r5.mo7626a(C4479g.f16692h, null, null);
                                        r3.m34100a(r5);
                                        r5 = (C8176a) r3;
                                    } else {
                                        r5 = null;
                                    }
                                    this.f29185f = (xb) abk.mo4175a(xb.m34791e(), abq);
                                    if (r5 != null) {
                                        r5.m34100a(this.f29185f);
                                        this.f29185f = (xb) r5.m34102c();
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
                if (f29182h == null) {
                    synchronized (vn.class) {
                        if (f29182h == null) {
                            f29182h = new C7363b(f29181g);
                        }
                    }
                }
                return f29182h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29181g;
    }

    /* renamed from: b */
    public final vr m34629b() {
        return this.f29184e == null ? vr.m34647e() : this.f29184e;
    }

    /* renamed from: c */
    public final xb m34630c() {
        return this.f29185f == null ? xb.m34791e() : this.f29185f;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29183d != 0) {
            zzffg.mo6961c(1, this.f29183d);
        }
        if (this.f29184e != null) {
            zzffg.mo6946a(2, this.f29184e == null ? vr.m34647e() : this.f29184e);
        }
        if (this.f29185f != null) {
            zzffg.mo6946a(3, this.f29185f == null ? xb.m34791e() : this.f29185f);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29183d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29183d);
        }
        if (this.f29184e != null) {
            i2 += zzffg.m27537c(2, this.f29184e == null ? vr.m34647e() : this.f29184e);
        }
        if (this.f29185f != null) {
            i2 += zzffg.m27537c(3, this.f29185f == null ? xb.m34791e() : this.f29185f);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
