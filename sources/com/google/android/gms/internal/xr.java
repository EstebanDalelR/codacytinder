package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C6279f;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class xr extends zzffu<xr, C8184a> implements zzfhg {
    /* renamed from: g */
    private static final xr f29298g;
    /* renamed from: h */
    private static volatile zzfhk<xr> f29299h;
    /* renamed from: d */
    private int f29300d;
    /* renamed from: e */
    private int f29301e;
    /* renamed from: f */
    private zzfgd<C8186b> f29302f = zzffu.m34111i();

    /* renamed from: com.google.android.gms.internal.xr$a */
    public static final class C8184a extends C8036a<xr, C8184a> implements zzfhg {
        private C8184a() {
            super(xr.f29298g);
        }

        /* renamed from: a */
        public final C8184a m34851a(int i) {
            m34101b();
            ((xr) this.a).m34870a(i);
            return this;
        }

        /* renamed from: a */
        public final C8184a m34852a(C8186b c8186b) {
            m34101b();
            ((xr) this.a).m34871a(c8186b);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.xr$b */
    public static final class C8186b extends zzffu<C8186b, C8185a> implements zzfhg {
        /* renamed from: h */
        private static final C8186b f29292h;
        /* renamed from: i */
        private static volatile zzfhk<C8186b> f29293i;
        /* renamed from: d */
        private String f29294d = "";
        /* renamed from: e */
        private int f29295e;
        /* renamed from: f */
        private int f29296f;
        /* renamed from: g */
        private int f29297g;

        /* renamed from: com.google.android.gms.internal.xr$b$a */
        public static final class C8185a extends C8036a<C8186b, C8185a> implements zzfhg {
            private C8185a() {
                super(C8186b.f29292h);
            }

            /* renamed from: a */
            public final C8185a m34853a(int i) {
                m34101b();
                ((C8186b) this.a).m34858a(i);
                return this;
            }

            /* renamed from: a */
            public final C8185a m34854a(zzdtb zzdtb) {
                m34101b();
                ((C8186b) this.a).m34863a(zzdtb);
                return this;
            }

            /* renamed from: a */
            public final C8185a m34855a(zzdtt zzdtt) {
                m34101b();
                ((C8186b) this.a).m34864a(zzdtt);
                return this;
            }

            /* renamed from: a */
            public final C8185a m34856a(String str) {
                m34101b();
                ((C8186b) this.a).m34865a(str);
                return this;
            }
        }

        static {
            zzffu c8186b = new C8186b();
            f29292h = c8186b;
            c8186b.mo7626a(C4479g.f16690f, null, null);
            c8186b.f28829b.m18929c();
        }

        private C8186b() {
        }

        /* renamed from: a */
        public static C8185a m34857a() {
            zzffu zzffu = f29292h;
            C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
            c8036a.m34100a(zzffu);
            return (C8185a) c8036a;
        }

        /* renamed from: a */
        private final void m34858a(int i) {
            this.f29296f = i;
        }

        /* renamed from: a */
        private final void m34863a(zzdtb zzdtb) {
            if (zzdtb == null) {
                throw new NullPointerException();
            }
            this.f29295e = zzdtb.zzhq();
        }

        /* renamed from: a */
        private final void m34864a(zzdtt zzdtt) {
            if (zzdtt == null) {
                throw new NullPointerException();
            }
            this.f29297g = zzdtt.zzhq();
        }

        /* renamed from: a */
        private final void m34865a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f29294d = str;
        }

        /* renamed from: b */
        public static C8186b m34866b() {
            return f29292h;
        }

        /* renamed from: a */
        protected final Object mo7626a(int i, Object obj, Object obj2) {
            boolean z = true;
            Object obj3 = null;
            switch (xs.f16635a[i - 1]) {
                case 1:
                    return new C8186b();
                case 2:
                    return f29292h;
                case 3:
                    return null;
                case 4:
                    return new C8185a();
                case 5:
                    zzh zzh = (zzh) obj;
                    C8186b c8186b = (C8186b) obj2;
                    this.f29294d = zzh.zza(this.f29294d.isEmpty() ^ true, this.f29294d, c8186b.f29294d.isEmpty() ^ true, c8186b.f29294d);
                    this.f29295e = zzh.zza(this.f29295e != 0, this.f29295e, c8186b.f29295e != 0, c8186b.f29295e);
                    this.f29296f = zzh.zza(this.f29296f != 0, this.f29296f, c8186b.f29296f != 0, c8186b.f29296f);
                    boolean z2 = this.f29297g != 0;
                    int i2 = this.f29297g;
                    if (c8186b.f29297g == 0) {
                        z = false;
                    }
                    this.f29297g = zzh.zza(z2, i2, z, c8186b.f29297g);
                    return this;
                case 6:
                    abk abk = (abk) obj;
                    if (((abq) obj2) != null) {
                        while (obj3 == null) {
                            try {
                                i = abk.mo4174a();
                                if (i != 0) {
                                    if (i == 10) {
                                        this.f29294d = abk.mo4184g();
                                    } else if (i == 16) {
                                        this.f29295e = abk.mo4187j();
                                    } else if (i == 24) {
                                        this.f29296f = abk.mo4186i();
                                    } else if (i == 32) {
                                        this.f29297g = abk.mo4187j();
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
                    if (f29293i == null) {
                        synchronized (C8186b.class) {
                            if (f29293i == null) {
                                f29293i = new C7363b(f29292h);
                            }
                        }
                    }
                    return f29293i;
                case 9:
                    return Byte.valueOf((byte) 1);
                case 10:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
            return f29292h;
        }

        public final void zza(zzffg zzffg) throws IOException {
            if (!this.f29294d.isEmpty()) {
                zzffg.mo6947a(1, this.f29294d);
            }
            if (this.f29295e != zzdtb.UNKNOWN_STATUS.zzhq()) {
                zzffg.mo6955b(2, this.f29295e);
            }
            if (this.f29296f != 0) {
                zzffg.mo6961c(3, this.f29296f);
            }
            if (this.f29297g != zzdtt.UNKNOWN_PREFIX.zzhq()) {
                zzffg.mo6955b(4, this.f29297g);
            }
            this.b.m18926a(zzffg);
        }

        public final int zzho() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f29294d.isEmpty()) {
                i2 = 0 + zzffg.m27528b(1, this.f29294d);
            }
            if (this.f29295e != zzdtb.UNKNOWN_STATUS.zzhq()) {
                i2 += zzffg.m27552g(2, this.f29295e);
            }
            if (this.f29296f != 0) {
                i2 += zzffg.m27546e(3, this.f29296f);
            }
            if (this.f29297g != zzdtt.UNKNOWN_PREFIX.zzhq()) {
                i2 += zzffg.m27552g(4, this.f29297g);
            }
            i2 += this.b.m18931e();
            this.c = i2;
            return i2;
        }
    }

    static {
        zzffu xrVar = new xr();
        f29298g = xrVar;
        xrVar.mo7626a(C4479g.f16690f, null, null);
        xrVar.f28829b.m18929c();
    }

    private xr() {
    }

    /* renamed from: a */
    public static C8184a m34869a() {
        zzffu zzffu = f29298g;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8184a) c8036a;
    }

    /* renamed from: a */
    private final void m34870a(int i) {
        this.f29301e = i;
    }

    /* renamed from: a */
    private final void m34871a(C8186b c8186b) {
        if (c8186b == null) {
            throw new NullPointerException();
        }
        if (!this.f29302f.zzcvi()) {
            zzfgd zzfgd = this.f29302f;
            int size = zzfgd.size();
            this.f29302f = zzfgd.zzly(size == 0 ? 10 : size << 1);
        }
        this.f29302f.add(c8186b);
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        int i2;
        switch (xs.f16635a[i - 1]) {
            case 1:
                return new xr();
            case 2:
                return f29298g;
            case 3:
                this.f29302f.zzbiy();
                return null;
            case 4:
                return new C8184a();
            case 5:
                zzh zzh = (zzh) obj;
                xr xrVar = (xr) obj2;
                boolean z2 = this.f29301e != 0;
                i2 = this.f29301e;
                if (xrVar.f29301e != 0) {
                    z = true;
                }
                this.f29301e = zzh.zza(z2, i2, z, xrVar.f29301e);
                this.f29302f = zzh.zza(this.f29302f, xrVar.f29302f);
                if (zzh == C6279f.f23549a) {
                    this.f29300d |= xrVar.f29300d;
                }
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
                                    this.f29301e = abk.mo4186i();
                                } else if (i == 18) {
                                    if (!this.f29302f.zzcvi()) {
                                        zzfgd zzfgd = this.f29302f;
                                        i2 = zzfgd.size();
                                        this.f29302f = zzfgd.zzly(i2 == 0 ? 10 : i2 << 1);
                                    }
                                    this.f29302f.add((C8186b) abk.mo4175a(C8186b.m34866b(), abq));
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
                if (f29299h == null) {
                    synchronized (xr.class) {
                        if (f29299h == null) {
                            f29299h = new C7363b(f29298g);
                        }
                    }
                }
                return f29299h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29298g;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29301e != 0) {
            zzffg.mo6961c(1, this.f29301e);
        }
        for (int i = 0; i < this.f29302f.size(); i++) {
            zzffg.mo6946a(2, (zzfhe) this.f29302f.get(i));
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        i = this.f29301e != 0 ? zzffg.m27546e(1, this.f29301e) + 0 : 0;
        while (i2 < this.f29302f.size()) {
            i += zzffg.m27537c(2, (zzfhe) this.f29302f.get(i2));
            i2++;
        }
        i += this.b.m18931e();
        this.c = i;
        return i;
    }
}
