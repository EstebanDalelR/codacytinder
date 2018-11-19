package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class xv extends zzffu<xv, C8188a> implements zzfhg {
    /* renamed from: e */
    private static final xv f29307e;
    /* renamed from: f */
    private static volatile zzfhk<xv> f29308f;
    /* renamed from: d */
    private String f29309d = "";

    /* renamed from: com.google.android.gms.internal.xv$a */
    public static final class C8188a extends C8036a<xv, C8188a> implements zzfhg {
        private C8188a() {
            super(xv.f29307e);
        }
    }

    static {
        zzffu xvVar = new xv();
        f29307e = xvVar;
        xvVar.mo7626a(C4479g.f16690f, null, null);
        xvVar.f28829b.m18929c();
    }

    private xv() {
    }

    /* renamed from: a */
    public static xv m34888a(zzfes zzfes) throws zzfge {
        return (xv) zzffu.m34105a(f29307e, zzfes);
    }

    /* renamed from: b */
    public static xv m34889b() {
        return f29307e;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        switch (xw.f16637a[i - 1]) {
            case 1:
                return new xv();
            case 2:
                return f29307e;
            case 3:
                return null;
            case 4:
                return new C8188a();
            case 5:
                xv xvVar = (xv) obj2;
                this.f29309d = ((zzh) obj).zza(this.f29309d.isEmpty() ^ true, this.f29309d, true ^ xvVar.f29309d.isEmpty(), xvVar.f29309d);
                return this;
            case 6:
                abk abk = (abk) obj;
                if (((abq) obj2) != null) {
                    Object obj3 = null;
                    while (obj3 == null) {
                        try {
                            int a = abk.mo4174a();
                            if (a != 0) {
                                if (a == 10) {
                                    this.f29309d = abk.mo4184g();
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
                if (f29308f == null) {
                    synchronized (xv.class) {
                        if (f29308f == null) {
                            f29308f = new C7363b(f29307e);
                        }
                    }
                }
                return f29308f;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29307e;
    }

    /* renamed from: a */
    public final String m34892a() {
        return this.f29309d;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (!this.f29309d.isEmpty()) {
            zzffg.mo6947a(1, this.f29309d);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f29309d.isEmpty()) {
            i2 = 0 + zzffg.m27528b(1, this.f29309d);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
