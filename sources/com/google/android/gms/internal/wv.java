package com.google.android.gms.internal;

import com.google.android.gms.internal.wr.C8172a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class wv extends zzffu<wv, C8174a> implements zzfhg {
    /* renamed from: h */
    private static final wv f29245h;
    /* renamed from: i */
    private static volatile zzfhk<wv> f29246i;
    /* renamed from: d */
    private int f29247d;
    /* renamed from: e */
    private wr f29248e;
    /* renamed from: f */
    private zzfes f29249f = zzfes.f16682a;
    /* renamed from: g */
    private zzfes f29250g = zzfes.f16682a;

    /* renamed from: com.google.android.gms.internal.wv$a */
    public static final class C8174a extends C8036a<wv, C8174a> implements zzfhg {
        private C8174a() {
            super(wv.f29245h);
        }

        /* renamed from: a */
        public final C8174a m34753a(int i) {
            m34101b();
            ((wv) this.a).m34758a(0);
            return this;
        }

        /* renamed from: a */
        public final C8174a m34754a(wr wrVar) {
            m34101b();
            ((wv) this.a).m34759a(wrVar);
            return this;
        }

        /* renamed from: a */
        public final C8174a m34755a(zzfes zzfes) {
            m34101b();
            ((wv) this.a).m34764b(zzfes);
            return this;
        }

        /* renamed from: b */
        public final C8174a m34756b(zzfes zzfes) {
            m34101b();
            ((wv) this.a).m34765c(zzfes);
            return this;
        }
    }

    static {
        zzffu wvVar = new wv();
        f29245h = wvVar;
        wvVar.mo7626a(C4479g.f16690f, null, null);
        wvVar.f28829b.m18929c();
    }

    private wv() {
    }

    /* renamed from: a */
    public static wv m34757a(zzfes zzfes) throws zzfge {
        return (wv) zzffu.m34105a(f29245h, zzfes);
    }

    /* renamed from: a */
    private final void m34758a(int i) {
        this.f29247d = i;
    }

    /* renamed from: a */
    private final void m34759a(wr wrVar) {
        if (wrVar == null) {
            throw new NullPointerException();
        }
        this.f29248e = wrVar;
    }

    /* renamed from: b */
    private final void m34764b(zzfes zzfes) {
        if (zzfes == null) {
            throw new NullPointerException();
        }
        this.f29249f = zzfes;
    }

    /* renamed from: c */
    private final void m34765c(zzfes zzfes) {
        if (zzfes == null) {
            throw new NullPointerException();
        }
        this.f29250g = zzfes;
    }

    /* renamed from: e */
    public static C8174a m34766e() {
        zzffu zzffu = f29245h;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8174a) c8036a;
    }

    /* renamed from: f */
    public static wv m34767f() {
        return f29245h;
    }

    /* renamed from: a */
    public final int m34769a() {
        return this.f29247d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (ww.f16613a[i - 1]) {
            case 1:
                return new wv();
            case 2:
                return f29245h;
            case 3:
                return null;
            case 4:
                return new C8174a();
            case 5:
                zzh zzh = (zzh) obj;
                wv wvVar = (wv) obj2;
                this.f29247d = zzh.zza(this.f29247d != 0, this.f29247d, wvVar.f29247d != 0, wvVar.f29247d);
                this.f29248e = (wr) zzh.zza(this.f29248e, wvVar.f29248e);
                this.f29249f = zzh.zza(this.f29249f != zzfes.f16682a, this.f29249f, wvVar.f29249f != zzfes.f16682a, wvVar.f29249f);
                boolean z2 = this.f29250g != zzfes.f16682a;
                zzfes zzfes = this.f29250g;
                if (wvVar.f29250g == zzfes.f16682a) {
                    z = false;
                }
                this.f29250g = zzh.zza(z2, zzfes, z, wvVar.f29250g);
                return this;
            case 6:
                abk abk = (abk) obj;
                abq abq = (abq) obj2;
                if (abq != null) {
                    while (obj3 == null) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 8) {
                                    this.f29247d = abk.mo4186i();
                                } else if (i == 18) {
                                    C8036a c8036a;
                                    if (this.f29248e != null) {
                                        zzffu zzffu = this.f29248e;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8172a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29248e = (wr) abk.mo4175a(wr.m34731d(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29248e);
                                        this.f29248e = (wr) c8036a.m34102c();
                                    }
                                } else if (i == 26) {
                                    this.f29249f = abk.mo4185h();
                                } else if (i == 34) {
                                    this.f29250g = abk.mo4185h();
                                } else if (m34113a(i, abk)) {
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
                if (f29246i == null) {
                    synchronized (wv.class) {
                        if (f29246i == null) {
                            f29246i = new C7363b(f29245h);
                        }
                    }
                }
                return f29246i;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29245h;
    }

    /* renamed from: b */
    public final wr m34771b() {
        return this.f29248e == null ? wr.m34731d() : this.f29248e;
    }

    /* renamed from: c */
    public final zzfes m34772c() {
        return this.f29249f;
    }

    /* renamed from: d */
    public final zzfes m34773d() {
        return this.f29250g;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29247d != 0) {
            zzffg.mo6961c(1, this.f29247d);
        }
        if (this.f29248e != null) {
            zzffg.mo6946a(2, this.f29248e == null ? wr.m34731d() : this.f29248e);
        }
        if (!this.f29249f.m20310b()) {
            zzffg.mo6945a(3, this.f29249f);
        }
        if (!this.f29250g.m20310b()) {
            zzffg.mo6945a(4, this.f29250g);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29247d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29247d);
        }
        if (this.f29248e != null) {
            i2 += zzffg.m27537c(2, this.f29248e == null ? wr.m34731d() : this.f29248e);
        }
        if (!this.f29249f.m20310b()) {
            i2 += zzffg.m27536c(3, this.f29249f);
        }
        if (!this.f29250g.m20310b()) {
            i2 += zzffg.m27536c(4, this.f29250g);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
