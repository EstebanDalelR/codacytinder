package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class xl extends zzffu<xl, C8179a> implements zzfhg {
    /* renamed from: g */
    private static final xl f29269g;
    /* renamed from: h */
    private static volatile zzfhk<xl> f29270h;
    /* renamed from: d */
    private String f29271d = "";
    /* renamed from: e */
    private zzfes f29272e = zzfes.f16682a;
    /* renamed from: f */
    private int f29273f;

    /* renamed from: com.google.android.gms.internal.xl$a */
    public static final class C8179a extends C8036a<xl, C8179a> implements zzfhg {
        private C8179a() {
            super(xl.f29269g);
        }
    }

    static {
        zzffu xlVar = new xl();
        f29269g = xlVar;
        xlVar.mo7626a(C4479g.f16690f, null, null);
        xlVar.f28829b.m18929c();
    }

    private xl() {
    }

    /* renamed from: c */
    public static xl m34808c() {
        return f29269g;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (xm.f16632a[i - 1]) {
            case 1:
                return new xl();
            case 2:
                return f29269g;
            case 3:
                return null;
            case 4:
                return new C8179a();
            case 5:
                zzh zzh = (zzh) obj;
                xl xlVar = (xl) obj2;
                this.f29271d = zzh.zza(this.f29271d.isEmpty() ^ true, this.f29271d, xlVar.f29271d.isEmpty() ^ true, xlVar.f29271d);
                this.f29272e = zzh.zza(this.f29272e != zzfes.f16682a, this.f29272e, xlVar.f29272e != zzfes.f16682a, xlVar.f29272e);
                boolean z2 = this.f29273f != 0;
                int i2 = this.f29273f;
                if (xlVar.f29273f == 0) {
                    z = false;
                }
                this.f29273f = zzh.zza(z2, i2, z, xlVar.f29273f);
                return this;
            case 6:
                abk abk = (abk) obj;
                if (((abq) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 10) {
                                    this.f29271d = abk.mo4184g();
                                } else if (i == 18) {
                                    this.f29272e = abk.mo4185h();
                                } else if (i == 24) {
                                    this.f29273f = abk.mo4187j();
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
                if (f29270h == null) {
                    synchronized (xl.class) {
                        if (f29270h == null) {
                            f29270h = new C7363b(f29269g);
                        }
                    }
                }
                return f29270h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29269g;
    }

    /* renamed from: a */
    public final String m34811a() {
        return this.f29271d;
    }

    /* renamed from: b */
    public final zzfes m34812b() {
        return this.f29272e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (!this.f29271d.isEmpty()) {
            zzffg.mo6947a(1, this.f29271d);
        }
        if (!this.f29272e.m20310b()) {
            zzffg.mo6945a(2, this.f29272e);
        }
        if (this.f29273f != zzdtt.UNKNOWN_PREFIX.zzhq()) {
            zzffg.mo6955b(3, this.f29273f);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f29271d.isEmpty()) {
            i2 = 0 + zzffg.m27528b(1, this.f29271d);
        }
        if (!this.f29272e.m20310b()) {
            i2 += zzffg.m27536c(2, this.f29272e);
        }
        if (this.f29273f != zzdtt.UNKNOWN_PREFIX.zzhq()) {
            i2 += zzffg.m27552g(3, this.f29273f);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
