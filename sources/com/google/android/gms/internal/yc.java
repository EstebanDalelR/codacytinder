package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C6279f;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;
import java.util.List;

public final class yc extends zzffu<yc, C8191a> implements zzfhg {
    /* renamed from: g */
    private static final yc f29318g;
    /* renamed from: h */
    private static volatile zzfhk<yc> f29319h;
    /* renamed from: d */
    private int f29320d;
    /* renamed from: e */
    private String f29321e = "";
    /* renamed from: f */
    private zzfgd<xn> f29322f = zzffu.m34111i();

    /* renamed from: com.google.android.gms.internal.yc$a */
    public static final class C8191a extends C8036a<yc, C8191a> implements zzfhg {
        private C8191a() {
            super(yc.f29318g);
        }

        /* renamed from: a */
        public final C8191a m34911a(xn xnVar) {
            m34101b();
            ((yc) this.a).m34913a(xnVar);
            return this;
        }

        /* renamed from: a */
        public final C8191a m34912a(String str) {
            m34101b();
            ((yc) this.a).m34916a(str);
            return this;
        }
    }

    static {
        zzffu ycVar = new yc();
        f29318g = ycVar;
        ycVar.mo7626a(C4479g.f16690f, null, null);
        ycVar.f28829b.m18929c();
    }

    private yc() {
    }

    /* renamed from: a */
    private final void m34913a(xn xnVar) {
        if (xnVar == null) {
            throw new NullPointerException();
        }
        if (!this.f29322f.zzcvi()) {
            zzfgd zzfgd = this.f29322f;
            int size = zzfgd.size();
            this.f29322f = zzfgd.zzly(size == 0 ? 10 : size << 1);
        }
        this.f29322f.add(xnVar);
    }

    /* renamed from: a */
    private final void m34916a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f29321e = str;
    }

    /* renamed from: b */
    public static C8191a m34917b() {
        zzffu zzffu = f29318g;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8191a) c8036a;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        switch (yd.f16640a[i - 1]) {
            case 1:
                return new yc();
            case 2:
                return f29318g;
            case 3:
                this.f29322f.zzbiy();
                return null;
            case 4:
                return new C8191a();
            case 5:
                zzh zzh = (zzh) obj;
                yc ycVar = (yc) obj2;
                this.f29321e = zzh.zza(this.f29321e.isEmpty() ^ true, this.f29321e, true ^ ycVar.f29321e.isEmpty(), ycVar.f29321e);
                this.f29322f = zzh.zza(this.f29322f, ycVar.f29322f);
                if (zzh == C6279f.f23549a) {
                    this.f29320d |= ycVar.f29320d;
                }
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
                                int i2 = 10;
                                if (a == 10) {
                                    this.f29321e = abk.mo4184g();
                                } else if (a == 18) {
                                    if (!this.f29322f.zzcvi()) {
                                        zzfgd zzfgd = this.f29322f;
                                        int size = zzfgd.size();
                                        if (size != 0) {
                                            i2 = size << 1;
                                        }
                                        this.f29322f = zzfgd.zzly(i2);
                                    }
                                    this.f29322f.add((xn) abk.mo4175a(xn.m34829g(), abq));
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
                if (f29319h == null) {
                    synchronized (yc.class) {
                        if (f29319h == null) {
                            f29319h = new C7363b(f29318g);
                        }
                    }
                }
                return f29319h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29318g;
    }

    /* renamed from: a */
    public final List<xn> m34920a() {
        return this.f29322f;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (!this.f29321e.isEmpty()) {
            zzffg.mo6947a(1, this.f29321e);
        }
        for (int i = 0; i < this.f29322f.size(); i++) {
            zzffg.mo6946a(2, (zzfhe) this.f29322f.get(i));
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        i = !this.f29321e.isEmpty() ? zzffg.m27528b(1, this.f29321e) + 0 : 0;
        while (i2 < this.f29322f.size()) {
            i += zzffg.m27537c(2, (zzfhe) this.f29322f.get(i2));
            i2++;
        }
        i += this.b.m18931e();
        this.c = i;
        return i;
    }
}
