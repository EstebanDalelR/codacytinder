package com.google.android.gms.internal;

import com.google.android.gms.internal.wv.C8174a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class wt extends zzffu<wt, C8173a> implements zzfhg {
    /* renamed from: g */
    private static final wt f29240g;
    /* renamed from: h */
    private static volatile zzfhk<wt> f29241h;
    /* renamed from: d */
    private int f29242d;
    /* renamed from: e */
    private wv f29243e;
    /* renamed from: f */
    private zzfes f29244f = zzfes.f16682a;

    /* renamed from: com.google.android.gms.internal.wt$a */
    public static final class C8173a extends C8036a<wt, C8173a> implements zzfhg {
        private C8173a() {
            super(wt.f29240g);
        }

        /* renamed from: a */
        public final C8173a m34737a(int i) {
            m34101b();
            ((wt) this.a).m34741a(0);
            return this;
        }

        /* renamed from: a */
        public final C8173a m34738a(wv wvVar) {
            m34101b();
            ((wt) this.a).m34745a(wvVar);
            return this;
        }

        /* renamed from: a */
        public final C8173a m34739a(zzfes zzfes) {
            m34101b();
            ((wt) this.a).m34746b(zzfes);
            return this;
        }
    }

    static {
        zzffu wtVar = new wt();
        f29240g = wtVar;
        wtVar.mo7626a(C4479g.f16690f, null, null);
        wtVar.f28829b.m18929c();
    }

    private wt() {
    }

    /* renamed from: a */
    public static wt m34740a(zzfes zzfes) throws zzfge {
        return (wt) zzffu.m34105a(f29240g, zzfes);
    }

    /* renamed from: a */
    private final void m34741a(int i) {
        this.f29242d = i;
    }

    /* renamed from: a */
    private final void m34745a(wv wvVar) {
        if (wvVar == null) {
            throw new NullPointerException();
        }
        this.f29243e = wvVar;
    }

    /* renamed from: b */
    private final void m34746b(zzfes zzfes) {
        if (zzfes == null) {
            throw new NullPointerException();
        }
        this.f29244f = zzfes;
    }

    /* renamed from: d */
    public static C8173a m34747d() {
        zzffu zzffu = f29240g;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8173a) c8036a;
    }

    /* renamed from: a */
    public final int m34749a() {
        return this.f29242d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (wu.f16612a[i - 1]) {
            case 1:
                return new wt();
            case 2:
                return f29240g;
            case 3:
                return null;
            case 4:
                return new C8173a();
            case 5:
                zzh zzh = (zzh) obj;
                wt wtVar = (wt) obj2;
                this.f29242d = zzh.zza(this.f29242d != 0, this.f29242d, wtVar.f29242d != 0, wtVar.f29242d);
                this.f29243e = (wv) zzh.zza(this.f29243e, wtVar.f29243e);
                boolean z2 = this.f29244f != zzfes.f16682a;
                zzfes zzfes = this.f29244f;
                if (wtVar.f29244f != zzfes.f16682a) {
                    z = true;
                }
                this.f29244f = zzh.zza(z2, zzfes, z, wtVar.f29244f);
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
                                    this.f29242d = abk.mo4186i();
                                } else if (i == 18) {
                                    C8036a c8036a;
                                    if (this.f29243e != null) {
                                        zzffu zzffu = this.f29243e;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8174a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29243e = (wv) abk.mo4175a(wv.m34767f(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29243e);
                                        this.f29243e = (wv) c8036a.m34102c();
                                    }
                                } else if (i == 26) {
                                    this.f29244f = abk.mo4185h();
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
                if (f29241h == null) {
                    synchronized (wt.class) {
                        if (f29241h == null) {
                            f29241h = new C7363b(f29240g);
                        }
                    }
                }
                return f29241h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29240g;
    }

    /* renamed from: b */
    public final wv m34751b() {
        return this.f29243e == null ? wv.m34767f() : this.f29243e;
    }

    /* renamed from: c */
    public final zzfes m34752c() {
        return this.f29244f;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29242d != 0) {
            zzffg.mo6961c(1, this.f29242d);
        }
        if (this.f29243e != null) {
            zzffg.mo6946a(2, this.f29243e == null ? wv.m34767f() : this.f29243e);
        }
        if (!this.f29244f.m20310b()) {
            zzffg.mo6945a(3, this.f29244f);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29242d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29242d);
        }
        if (this.f29243e != null) {
            i2 += zzffg.m27537c(2, this.f29243e == null ? wv.m34767f() : this.f29243e);
        }
        if (!this.f29244f.m20310b()) {
            i2 += zzffg.m27536c(3, this.f29244f);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
