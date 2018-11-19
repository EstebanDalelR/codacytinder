package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class vv extends zzffu<vv, C8162a> implements zzfhg {
    /* renamed from: e */
    private static final vv f29199e;
    /* renamed from: f */
    private static volatile zzfhk<vv> f29200f;
    /* renamed from: d */
    private int f29201d;

    /* renamed from: com.google.android.gms.internal.vv$a */
    public static final class C8162a extends C8036a<vv, C8162a> implements zzfhg {
        private C8162a() {
            super(vv.f29199e);
        }
    }

    static {
        zzffu vvVar = new vv();
        f29199e = vvVar;
        vvVar.mo7626a(C4479g.f16690f, null, null);
        vvVar.f28829b.m18929c();
    }

    private vv() {
    }

    /* renamed from: b */
    public static vv m34659b() {
        return f29199e;
    }

    /* renamed from: a */
    public final int m34661a() {
        return this.f29201d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (vw.f16601a[i - 1]) {
            case 1:
                return new vv();
            case 2:
                return f29199e;
            case 3:
                return null;
            case 4:
                return new C8162a();
            case 5:
                zzh zzh = (zzh) obj;
                vv vvVar = (vv) obj2;
                boolean z2 = this.f29201d != 0;
                int i2 = this.f29201d;
                if (vvVar.f29201d != 0) {
                    z = true;
                }
                this.f29201d = zzh.zza(z2, i2, z, vvVar.f29201d);
                return this;
            case 6:
                abk abk = (abk) obj;
                if (((abq) obj2) != null) {
                    while (!z) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 8) {
                                    this.f29201d = abk.mo4186i();
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
                if (f29200f == null) {
                    synchronized (vv.class) {
                        if (f29200f == null) {
                            f29200f = new C7363b(f29199e);
                        }
                    }
                }
                return f29200f;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29199e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29201d != 0) {
            zzffg.mo6961c(1, this.f29201d);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29201d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29201d);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
