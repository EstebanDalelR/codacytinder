package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class zzdsy extends zzffu<zzdsy, C8192a> implements zzfhg {
    /* renamed from: g */
    private static final zzdsy f29323g;
    /* renamed from: h */
    private static volatile zzfhk<zzdsy> f29324h;
    /* renamed from: d */
    private String f29325d = "";
    /* renamed from: e */
    private zzfes f29326e = zzfes.f16682a;
    /* renamed from: f */
    private int f29327f;

    public enum zzb implements zzfga {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final zzfgb<zzb> zzbcl = null;
        private final int value;

        static {
            zzbcl = new xj();
        }

        private zzb(int i) {
            this.value = i;
        }

        public static zzb zzft(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_KEYMATERIAL;
                case 1:
                    return SYMMETRIC;
                case 2:
                    return ASYMMETRIC_PRIVATE;
                case 3:
                    return ASYMMETRIC_PUBLIC;
                case 4:
                    return REMOTE;
                default:
                    return null;
            }
        }

        public final int zzhq() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.google.android.gms.internal.zzdsy$a */
    public static final class C8192a extends C8036a<zzdsy, C8192a> implements zzfhg {
        private C8192a() {
            super(zzdsy.f29323g);
        }

        /* renamed from: a */
        public final C8192a m34921a(zzb zzb) {
            m34101b();
            ((zzdsy) this.a).m34924a(zzb);
            return this;
        }

        /* renamed from: a */
        public final C8192a m34922a(zzfes zzfes) {
            m34101b();
            ((zzdsy) this.a).m34928a(zzfes);
            return this;
        }

        /* renamed from: a */
        public final C8192a m34923a(String str) {
            m34101b();
            ((zzdsy) this.a).m34929a(str);
            return this;
        }
    }

    static {
        zzffu zzdsy = new zzdsy();
        f29323g = zzdsy;
        zzdsy.mo7626a(C4479g.f16690f, null, null);
        zzdsy.f28829b.m18929c();
    }

    private zzdsy() {
    }

    /* renamed from: a */
    private final void m34924a(zzb zzb) {
        if (zzb == null) {
            throw new NullPointerException();
        }
        this.f29327f = zzb.zzhq();
    }

    /* renamed from: a */
    private final void m34928a(zzfes zzfes) {
        if (zzfes == null) {
            throw new NullPointerException();
        }
        this.f29326e = zzfes;
    }

    /* renamed from: a */
    private final void m34929a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f29325d = str;
    }

    /* renamed from: d */
    public static C8192a m34930d() {
        zzffu zzffu = f29323g;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8192a) c8036a;
    }

    /* renamed from: e */
    public static zzdsy m34931e() {
        return f29323g;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (xh.f16618a[i - 1]) {
            case 1:
                return new zzdsy();
            case 2:
                return f29323g;
            case 3:
                return null;
            case 4:
                return new C8192a();
            case 5:
                zzh zzh = (zzh) obj;
                zzdsy zzdsy = (zzdsy) obj2;
                this.f29325d = zzh.zza(this.f29325d.isEmpty() ^ true, this.f29325d, zzdsy.f29325d.isEmpty() ^ true, zzdsy.f29325d);
                this.f29326e = zzh.zza(this.f29326e != zzfes.f16682a, this.f29326e, zzdsy.f29326e != zzfes.f16682a, zzdsy.f29326e);
                boolean z2 = this.f29327f != 0;
                int i2 = this.f29327f;
                if (zzdsy.f29327f == 0) {
                    z = false;
                }
                this.f29327f = zzh.zza(z2, i2, z, zzdsy.f29327f);
                return this;
            case 6:
                abk abk = (abk) obj;
                if (((abq) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 10) {
                                    this.f29325d = abk.mo4184g();
                                } else if (i == 18) {
                                    this.f29326e = abk.mo4185h();
                                } else if (i == 24) {
                                    this.f29327f = abk.mo4187j();
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
                if (f29324h == null) {
                    synchronized (zzdsy.class) {
                        if (f29324h == null) {
                            f29324h = new C7363b(f29323g);
                        }
                    }
                }
                return f29324h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29323g;
    }

    /* renamed from: a */
    public final String m34934a() {
        return this.f29325d;
    }

    /* renamed from: b */
    public final zzfes m34935b() {
        return this.f29326e;
    }

    /* renamed from: c */
    public final zzb m34936c() {
        zzb zzft = zzb.zzft(this.f29327f);
        return zzft == null ? zzb.UNRECOGNIZED : zzft;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (!this.f29325d.isEmpty()) {
            zzffg.mo6947a(1, this.f29325d);
        }
        if (!this.f29326e.m20310b()) {
            zzffg.mo6945a(2, this.f29326e);
        }
        if (this.f29327f != zzb.UNKNOWN_KEYMATERIAL.zzhq()) {
            zzffg.mo6955b(3, this.f29327f);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f29325d.isEmpty()) {
            i2 = 0 + zzffg.m27528b(1, this.f29325d);
        }
        if (!this.f29326e.m20310b()) {
            i2 += zzffg.m27536c(2, this.f29326e);
        }
        if (this.f29327f != zzb.UNKNOWN_KEYMATERIAL.zzhq()) {
            i2 += zzffg.m27552g(3, this.f29327f);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
