package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class wj extends zzffu<wj, C8169a> implements zzfhg {
    /* renamed from: f */
    private static final wj f29225f;
    /* renamed from: g */
    private static volatile zzfhk<wj> f29226g;
    /* renamed from: d */
    private int f29227d;
    /* renamed from: e */
    private zzfes f29228e = zzfes.f16682a;

    /* renamed from: com.google.android.gms.internal.wj$a */
    public static final class C8169a extends C8036a<wj, C8169a> implements zzfhg {
        private C8169a() {
            super(wj.f29225f);
        }

        /* renamed from: a */
        public final C8169a m34711a(int i) {
            m34101b();
            ((wj) this.a).m34714a(0);
            return this;
        }

        /* renamed from: a */
        public final C8169a m34712a(zzfes zzfes) {
            m34101b();
            ((wj) this.a).m34717b(zzfes);
            return this;
        }
    }

    static {
        zzffu wjVar = new wj();
        f29225f = wjVar;
        wjVar.mo7626a(C4479g.f16690f, null, null);
        wjVar.f28829b.m18929c();
    }

    private wj() {
    }

    /* renamed from: a */
    public static wj m34713a(zzfes zzfes) throws zzfge {
        return (wj) zzffu.m34105a(f29225f, zzfes);
    }

    /* renamed from: a */
    private final void m34714a(int i) {
        this.f29227d = i;
    }

    /* renamed from: b */
    private final void m34717b(zzfes zzfes) {
        if (zzfes == null) {
            throw new NullPointerException();
        }
        this.f29228e = zzfes;
    }

    /* renamed from: c */
    public static C8169a m34718c() {
        zzffu zzffu = f29225f;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8169a) c8036a;
    }

    /* renamed from: a */
    public final int m34720a() {
        return this.f29227d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (wk.f16608a[i - 1]) {
            case 1:
                return new wj();
            case 2:
                return f29225f;
            case 3:
                return null;
            case 4:
                return new C8169a();
            case 5:
                zzh zzh = (zzh) obj;
                wj wjVar = (wj) obj2;
                this.f29227d = zzh.zza(this.f29227d != 0, this.f29227d, wjVar.f29227d != 0, wjVar.f29227d);
                boolean z2 = this.f29228e != zzfes.f16682a;
                zzfes zzfes = this.f29228e;
                if (wjVar.f29228e == zzfes.f16682a) {
                    z = false;
                }
                this.f29228e = zzh.zza(z2, zzfes, z, wjVar.f29228e);
                return this;
            case 6:
                abk abk = (abk) obj;
                if (((abq) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 8) {
                                    this.f29227d = abk.mo4186i();
                                } else if (i == 18) {
                                    this.f29228e = abk.mo4185h();
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
                if (f29226g == null) {
                    synchronized (wj.class) {
                        if (f29226g == null) {
                            f29226g = new C7363b(f29225f);
                        }
                    }
                }
                return f29226g;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29225f;
    }

    /* renamed from: b */
    public final zzfes m34722b() {
        return this.f29228e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29227d != 0) {
            zzffg.mo6961c(1, this.f29227d);
        }
        if (!this.f29228e.m20310b()) {
            zzffg.mo6945a(2, this.f29228e);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29227d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29227d);
        }
        if (!this.f29228e.m20310b()) {
            i2 += zzffg.m27536c(2, this.f29228e);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
