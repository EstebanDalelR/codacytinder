package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class wb extends zzffu<wb, C8165a> implements zzfhg {
    /* renamed from: e */
    private static final wb f29211e;
    /* renamed from: f */
    private static volatile zzfhk<wb> f29212f;
    /* renamed from: d */
    private int f29213d;

    /* renamed from: com.google.android.gms.internal.wb$a */
    public static final class C8165a extends C8036a<wb, C8165a> implements zzfhg {
        private C8165a() {
            super(wb.f29211e);
        }
    }

    static {
        zzffu wbVar = new wb();
        f29211e = wbVar;
        wbVar.mo7626a(C4479g.f16690f, null, null);
        wbVar.f28829b.m18929c();
    }

    private wb() {
    }

    /* renamed from: b */
    public static wb m34684b() {
        return f29211e;
    }

    /* renamed from: a */
    public final int m34686a() {
        return this.f29213d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (wc.f16604a[i - 1]) {
            case 1:
                return new wb();
            case 2:
                return f29211e;
            case 3:
                return null;
            case 4:
                return new C8165a();
            case 5:
                zzh zzh = (zzh) obj;
                wb wbVar = (wb) obj2;
                boolean z2 = this.f29213d != 0;
                int i2 = this.f29213d;
                if (wbVar.f29213d != 0) {
                    z = true;
                }
                this.f29213d = zzh.zza(z2, i2, z, wbVar.f29213d);
                return this;
            case 6:
                abk abk = (abk) obj;
                if (((abq) obj2) != null) {
                    while (!z) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 8) {
                                    this.f29213d = abk.mo4186i();
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
                if (f29212f == null) {
                    synchronized (wb.class) {
                        if (f29212f == null) {
                            f29212f = new C7363b(f29211e);
                        }
                    }
                }
                return f29212f;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29211e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29213d != 0) {
            zzffg.mo6961c(1, this.f29213d);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29213d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29213d);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
