package com.google.android.gms.internal;

import com.google.android.gms.internal.wb.C8165a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class vz extends zzffu<vz, C8164a> implements zzfhg {
    /* renamed from: f */
    private static final vz f29207f;
    /* renamed from: g */
    private static volatile zzfhk<vz> f29208g;
    /* renamed from: d */
    private wb f29209d;
    /* renamed from: e */
    private int f29210e;

    /* renamed from: com.google.android.gms.internal.vz$a */
    public static final class C8164a extends C8036a<vz, C8164a> implements zzfhg {
        private C8164a() {
            super(vz.f29207f);
        }
    }

    static {
        zzffu vzVar = new vz();
        f29207f = vzVar;
        vzVar.mo7626a(C4479g.f16690f, null, null);
        vzVar.f28829b.m18929c();
    }

    private vz() {
    }

    /* renamed from: a */
    public static vz m34679a(zzfes zzfes) throws zzfge {
        return (vz) zzffu.m34105a(f29207f, zzfes);
    }

    /* renamed from: a */
    public final wb m34681a() {
        return this.f29209d == null ? wb.m34684b() : this.f29209d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (wa.f16603a[i - 1]) {
            case 1:
                return new vz();
            case 2:
                return f29207f;
            case 3:
                return null;
            case 4:
                return new C8164a();
            case 5:
                zzh zzh = (zzh) obj;
                vz vzVar = (vz) obj2;
                this.f29209d = (wb) zzh.zza(this.f29209d, vzVar.f29209d);
                boolean z2 = this.f29210e != 0;
                int i2 = this.f29210e;
                if (vzVar.f29210e != 0) {
                    z = true;
                }
                this.f29210e = zzh.zza(z2, i2, z, vzVar.f29210e);
                return this;
            case 6:
                abk abk = (abk) obj;
                abq abq = (abq) obj2;
                if (abq != null) {
                    while (!z) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 10) {
                                    C8036a c8036a;
                                    if (this.f29209d != null) {
                                        zzffu zzffu = this.f29209d;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8165a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29209d = (wb) abk.mo4175a(wb.m34684b(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29209d);
                                        this.f29209d = (wb) c8036a.m34102c();
                                    }
                                } else if (i == 16) {
                                    this.f29210e = abk.mo4186i();
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
                if (f29208g == null) {
                    synchronized (vz.class) {
                        if (f29208g == null) {
                            f29208g = new C7363b(f29207f);
                        }
                    }
                }
                return f29208g;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29207f;
    }

    /* renamed from: b */
    public final int m34683b() {
        return this.f29210e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29209d != null) {
            zzffg.mo6946a(1, this.f29209d == null ? wb.m34684b() : this.f29209d);
        }
        if (this.f29210e != 0) {
            zzffg.mo6961c(2, this.f29210e);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29209d != null) {
            i2 = 0 + zzffg.m27537c(1, this.f29209d == null ? wb.m34684b() : this.f29209d);
        }
        if (this.f29210e != 0) {
            i2 += zzffg.m27546e(2, this.f29210e);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
