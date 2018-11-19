package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy.C8192a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C6279f;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;
import java.util.List;

public final class xp extends zzffu<xp, C8181a> implements zzfhg {
    /* renamed from: g */
    private static final xp f29287g;
    /* renamed from: h */
    private static volatile zzfhk<xp> f29288h;
    /* renamed from: d */
    private int f29289d;
    /* renamed from: e */
    private int f29290e;
    /* renamed from: f */
    private zzfgd<C8183b> f29291f = zzffu.m34111i();

    /* renamed from: com.google.android.gms.internal.xp$a */
    public static final class C8181a extends C8036a<xp, C8181a> implements zzfhg {
        private C8181a() {
            super(xp.f29287g);
        }
    }

    /* renamed from: com.google.android.gms.internal.xp$b */
    public static final class C8183b extends zzffu<C8183b, C8182a> implements zzfhg {
        /* renamed from: h */
        private static final C8183b f29281h;
        /* renamed from: i */
        private static volatile zzfhk<C8183b> f29282i;
        /* renamed from: d */
        private zzdsy f29283d;
        /* renamed from: e */
        private int f29284e;
        /* renamed from: f */
        private int f29285f;
        /* renamed from: g */
        private int f29286g;

        /* renamed from: com.google.android.gms.internal.xp$b$a */
        public static final class C8182a extends C8036a<C8183b, C8182a> implements zzfhg {
            private C8182a() {
                super(C8183b.f29281h);
            }
        }

        static {
            zzffu c8183b = new C8183b();
            f29281h = c8183b;
            c8183b.mo7626a(C4479g.f16690f, null, null);
            c8183b.f28829b.m18929c();
        }

        private C8183b() {
        }

        /* renamed from: f */
        public static C8183b m34837f() {
            return f29281h;
        }

        /* renamed from: a */
        protected final Object mo7626a(int i, Object obj, Object obj2) {
            boolean z = true;
            Object obj3 = null;
            switch (xq.f16634a[i - 1]) {
                case 1:
                    return new C8183b();
                case 2:
                    return f29281h;
                case 3:
                    return null;
                case 4:
                    return new C8182a();
                case 5:
                    zzh zzh = (zzh) obj;
                    C8183b c8183b = (C8183b) obj2;
                    this.f29283d = (zzdsy) zzh.zza(this.f29283d, c8183b.f29283d);
                    this.f29284e = zzh.zza(this.f29284e != 0, this.f29284e, c8183b.f29284e != 0, c8183b.f29284e);
                    this.f29285f = zzh.zza(this.f29285f != 0, this.f29285f, c8183b.f29285f != 0, c8183b.f29285f);
                    boolean z2 = this.f29286g != 0;
                    int i2 = this.f29286g;
                    if (c8183b.f29286g == 0) {
                        z = false;
                    }
                    this.f29286g = zzh.zza(z2, i2, z, c8183b.f29286g);
                    return this;
                case 6:
                    abk abk = (abk) obj;
                    abq abq = (abq) obj2;
                    if (abq != null) {
                        while (obj3 == null) {
                            try {
                                i = abk.mo4174a();
                                if (i != 0) {
                                    if (i == 10) {
                                        C8036a c8036a;
                                        if (this.f29283d != null) {
                                            zzffu zzffu = this.f29283d;
                                            C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                            c8036a2.m34100a(zzffu);
                                            c8036a = (C8192a) c8036a2;
                                        } else {
                                            c8036a = null;
                                        }
                                        this.f29283d = (zzdsy) abk.mo4175a(zzdsy.m34931e(), abq);
                                        if (c8036a != null) {
                                            c8036a.m34100a(this.f29283d);
                                            this.f29283d = (zzdsy) c8036a.m34102c();
                                        }
                                    } else if (i == 16) {
                                        this.f29284e = abk.mo4187j();
                                    } else if (i == 24) {
                                        this.f29285f = abk.mo4186i();
                                    } else if (i == 32) {
                                        this.f29286g = abk.mo4187j();
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
                    if (f29282i == null) {
                        synchronized (C8183b.class) {
                            if (f29282i == null) {
                                f29282i = new C7363b(f29281h);
                            }
                        }
                    }
                    return f29282i;
                case 9:
                    return Byte.valueOf((byte) 1);
                case 10:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
            return f29281h;
        }

        /* renamed from: a */
        public final boolean m34840a() {
            return this.f29283d != null;
        }

        /* renamed from: b */
        public final zzdsy m34841b() {
            return this.f29283d == null ? zzdsy.m34931e() : this.f29283d;
        }

        /* renamed from: c */
        public final zzdtb m34842c() {
            zzdtb zzfu = zzdtb.zzfu(this.f29284e);
            return zzfu == null ? zzdtb.UNRECOGNIZED : zzfu;
        }

        /* renamed from: d */
        public final int m34843d() {
            return this.f29285f;
        }

        /* renamed from: e */
        public final zzdtt m34844e() {
            zzdtt zzgd = zzdtt.zzgd(this.f29286g);
            return zzgd == null ? zzdtt.UNRECOGNIZED : zzgd;
        }

        public final void zza(zzffg zzffg) throws IOException {
            if (this.f29283d != null) {
                zzffg.mo6946a(1, this.f29283d == null ? zzdsy.m34931e() : this.f29283d);
            }
            if (this.f29284e != zzdtb.UNKNOWN_STATUS.zzhq()) {
                zzffg.mo6955b(2, this.f29284e);
            }
            if (this.f29285f != 0) {
                zzffg.mo6961c(3, this.f29285f);
            }
            if (this.f29286g != zzdtt.UNKNOWN_PREFIX.zzhq()) {
                zzffg.mo6955b(4, this.f29286g);
            }
            this.b.m18926a(zzffg);
        }

        public final int zzho() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f29283d != null) {
                i2 = 0 + zzffg.m27537c(1, this.f29283d == null ? zzdsy.m34931e() : this.f29283d);
            }
            if (this.f29284e != zzdtb.UNKNOWN_STATUS.zzhq()) {
                i2 += zzffg.m27552g(2, this.f29284e);
            }
            if (this.f29285f != 0) {
                i2 += zzffg.m27546e(3, this.f29285f);
            }
            if (this.f29286g != zzdtt.UNKNOWN_PREFIX.zzhq()) {
                i2 += zzffg.m27552g(4, this.f29286g);
            }
            i2 += this.b.m18931e();
            this.c = i2;
            return i2;
        }
    }

    static {
        zzffu xpVar = new xp();
        f29287g = xpVar;
        xpVar.mo7626a(C4479g.f16690f, null, null);
        xpVar.f28829b.m18929c();
    }

    private xp() {
    }

    /* renamed from: a */
    public static xp m34845a(byte[] bArr) throws zzfge {
        return (xp) zzffu.m34107a(f29287g, bArr);
    }

    /* renamed from: a */
    public final int m34847a() {
        return this.f29290e;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        int i2;
        switch (xq.f16634a[i - 1]) {
            case 1:
                return new xp();
            case 2:
                return f29287g;
            case 3:
                this.f29291f.zzbiy();
                return null;
            case 4:
                return new C8181a();
            case 5:
                zzh zzh = (zzh) obj;
                xp xpVar = (xp) obj2;
                boolean z2 = this.f29290e != 0;
                i2 = this.f29290e;
                if (xpVar.f29290e != 0) {
                    z = true;
                }
                this.f29290e = zzh.zza(z2, i2, z, xpVar.f29290e);
                this.f29291f = zzh.zza(this.f29291f, xpVar.f29291f);
                if (zzh == C6279f.f23549a) {
                    this.f29289d |= xpVar.f29289d;
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
                                    this.f29290e = abk.mo4186i();
                                } else if (i == 18) {
                                    if (!this.f29291f.zzcvi()) {
                                        zzfgd zzfgd = this.f29291f;
                                        i2 = zzfgd.size();
                                        this.f29291f = zzfgd.zzly(i2 == 0 ? 10 : i2 << 1);
                                    }
                                    this.f29291f.add((C8183b) abk.mo4175a(C8183b.m34837f(), abq));
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
                if (f29288h == null) {
                    synchronized (xp.class) {
                        if (f29288h == null) {
                            f29288h = new C7363b(f29287g);
                        }
                    }
                }
                return f29288h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29287g;
    }

    /* renamed from: b */
    public final List<C8183b> m34849b() {
        return this.f29291f;
    }

    /* renamed from: c */
    public final int m34850c() {
        return this.f29291f.size();
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29290e != 0) {
            zzffg.mo6961c(1, this.f29290e);
        }
        for (int i = 0; i < this.f29291f.size(); i++) {
            zzffg.mo6946a(2, (zzfhe) this.f29291f.get(i));
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        i = this.f29290e != 0 ? zzffg.m27546e(1, this.f29290e) + 0 : 0;
        while (i2 < this.f29291f.size()) {
            i += zzffg.m27537c(2, (zzfhe) this.f29291f.get(i2));
            i2++;
        }
        i += this.b.m18931e();
        this.c = i;
        return i;
    }
}
