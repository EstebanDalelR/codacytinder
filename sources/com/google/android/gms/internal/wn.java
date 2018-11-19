package com.google.android.gms.internal;

import com.google.android.gms.internal.xl.C8179a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class wn extends zzffu<wn, C8170a> implements zzfhg {
    /* renamed from: e */
    private static final wn f29229e;
    /* renamed from: f */
    private static volatile zzfhk<wn> f29230f;
    /* renamed from: d */
    private xl f29231d;

    /* renamed from: com.google.android.gms.internal.wn$a */
    public static final class C8170a extends C8036a<wn, C8170a> implements zzfhg {
        private C8170a() {
            super(wn.f29229e);
        }
    }

    static {
        zzffu wnVar = new wn();
        f29229e = wnVar;
        wnVar.mo7626a(C4479g.f16690f, null, null);
        wnVar.f28829b.m18929c();
    }

    private wn() {
    }

    /* renamed from: b */
    public static wn m34723b() {
        return f29229e;
    }

    /* renamed from: a */
    public final xl m34725a() {
        return this.f29231d == null ? xl.m34808c() : this.f29231d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        switch (wo.f16609a[i - 1]) {
            case 1:
                return new wn();
            case 2:
                return f29229e;
            case 3:
                return null;
            case 4:
                return new C8170a();
            case 5:
                this.f29231d = (xl) ((zzh) obj).zza(this.f29231d, ((wn) obj2).f29231d);
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
                                if (a == 18) {
                                    C8036a c8036a;
                                    if (this.f29231d != null) {
                                        zzffu zzffu = this.f29231d;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8179a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29231d = (xl) abk.mo4175a(xl.m34808c(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29231d);
                                        this.f29231d = (xl) c8036a.m34102c();
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
                if (f29230f == null) {
                    synchronized (wn.class) {
                        if (f29230f == null) {
                            f29230f = new C7363b(f29229e);
                        }
                    }
                }
                return f29230f;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29229e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29231d != null) {
            zzffg.mo6946a(2, this.f29231d == null ? xl.m34808c() : this.f29231d);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29231d != null) {
            i2 = 0 + zzffg.m27537c(2, this.f29231d == null ? xl.m34808c() : this.f29231d);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
