package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class xn extends zzffu<xn, C8180a> implements zzfhg {
    /* renamed from: i */
    private static final xn f29274i;
    /* renamed from: j */
    private static volatile zzfhk<xn> f29275j;
    /* renamed from: d */
    private String f29276d = "";
    /* renamed from: e */
    private String f29277e = "";
    /* renamed from: f */
    private int f29278f;
    /* renamed from: g */
    private boolean f29279g;
    /* renamed from: h */
    private String f29280h = "";

    /* renamed from: com.google.android.gms.internal.xn$a */
    public static final class C8180a extends C8036a<xn, C8180a> implements zzfhg {
        private C8180a() {
            super(xn.f29274i);
        }

        /* renamed from: a */
        public final C8180a m34813a(int i) {
            m34101b();
            ((xn) this.a).m34818a(0);
            return this;
        }

        /* renamed from: a */
        public final C8180a m34814a(String str) {
            m34101b();
            ((xn) this.a).m34822a(str);
            return this;
        }

        /* renamed from: a */
        public final C8180a m34815a(boolean z) {
            m34101b();
            ((xn) this.a).m34823a(true);
            return this;
        }

        /* renamed from: b */
        public final C8180a m34816b(String str) {
            m34101b();
            ((xn) this.a).m34825b(str);
            return this;
        }

        /* renamed from: c */
        public final C8180a m34817c(String str) {
            m34101b();
            ((xn) this.a).m34827c(str);
            return this;
        }
    }

    static {
        zzffu xnVar = new xn();
        f29274i = xnVar;
        xnVar.mo7626a(C4479g.f16690f, null, null);
        xnVar.f28829b.m18929c();
    }

    private xn() {
    }

    /* renamed from: a */
    private final void m34818a(int i) {
        this.f29278f = i;
    }

    /* renamed from: a */
    private final void m34822a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f29276d = str;
    }

    /* renamed from: a */
    private final void m34823a(boolean z) {
        this.f29279g = z;
    }

    /* renamed from: b */
    private final void m34825b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f29277e = str;
    }

    /* renamed from: c */
    private final void m34827c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f29280h = str;
    }

    /* renamed from: f */
    public static C8180a m34828f() {
        zzffu zzffu = f29274i;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8180a) c8036a;
    }

    /* renamed from: g */
    public static xn m34829g() {
        return f29274i;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (xo.f16633a[i - 1]) {
            case 1:
                return new xn();
            case 2:
                return f29274i;
            case 3:
                return null;
            case 4:
                return new C8180a();
            case 5:
                zzh zzh = (zzh) obj;
                xn xnVar = (xn) obj2;
                this.f29276d = zzh.zza(this.f29276d.isEmpty() ^ true, this.f29276d, xnVar.f29276d.isEmpty() ^ true, xnVar.f29276d);
                this.f29277e = zzh.zza(this.f29277e.isEmpty() ^ true, this.f29277e, xnVar.f29277e.isEmpty() ^ true, xnVar.f29277e);
                boolean z2 = this.f29278f != 0;
                int i2 = this.f29278f;
                if (xnVar.f29278f != 0) {
                    z = true;
                }
                this.f29278f = zzh.zza(z2, i2, z, xnVar.f29278f);
                this.f29279g = zzh.zza(this.f29279g, this.f29279g, xnVar.f29279g, xnVar.f29279g);
                this.f29280h = zzh.zza(this.f29280h.isEmpty() ^ true, this.f29280h, true ^ xnVar.f29280h.isEmpty(), xnVar.f29280h);
                return this;
            case 6:
                abk abk = (abk) obj;
                if (((abq) obj2) != null) {
                    while (!z) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 10) {
                                    this.f29276d = abk.mo4184g();
                                } else if (i == 18) {
                                    this.f29277e = abk.mo4184g();
                                } else if (i == 24) {
                                    this.f29278f = abk.mo4186i();
                                } else if (i == 32) {
                                    this.f29279g = abk.mo4182e();
                                } else if (i == 42) {
                                    this.f29280h = abk.mo4184g();
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
                if (f29275j == null) {
                    synchronized (xn.class) {
                        if (f29275j == null) {
                            f29275j = new C7363b(f29274i);
                        }
                    }
                }
                return f29275j;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29274i;
    }

    /* renamed from: a */
    public final String m34832a() {
        return this.f29276d;
    }

    /* renamed from: b */
    public final String m34833b() {
        return this.f29277e;
    }

    /* renamed from: c */
    public final int m34834c() {
        return this.f29278f;
    }

    /* renamed from: d */
    public final boolean m34835d() {
        return this.f29279g;
    }

    /* renamed from: e */
    public final String m34836e() {
        return this.f29280h;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (!this.f29276d.isEmpty()) {
            zzffg.mo6947a(1, this.f29276d);
        }
        if (!this.f29277e.isEmpty()) {
            zzffg.mo6947a(2, this.f29277e);
        }
        if (this.f29278f != 0) {
            zzffg.mo6961c(3, this.f29278f);
        }
        if (this.f29279g) {
            zzffg.mo6948a(4, this.f29279g);
        }
        if (!this.f29280h.isEmpty()) {
            zzffg.mo6947a(5, this.f29280h);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f29276d.isEmpty()) {
            i2 = 0 + zzffg.m27528b(1, this.f29276d);
        }
        if (!this.f29277e.isEmpty()) {
            i2 += zzffg.m27528b(2, this.f29277e);
        }
        if (this.f29278f != 0) {
            i2 += zzffg.m27546e(3, this.f29278f);
        }
        if (this.f29279g) {
            i2 += zzffg.m27529b(4, this.f29279g);
        }
        if (!this.f29280h.isEmpty()) {
            i2 += zzffg.m27528b(5, this.f29280h);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
