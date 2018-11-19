package com.google.android.gms.internal;

import com.google.android.gms.internal.wr.C8172a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class wp extends zzffu<wp, C8171a> implements zzfhg {
    /* renamed from: e */
    private static final wp f29232e;
    /* renamed from: f */
    private static volatile zzfhk<wp> f29233f;
    /* renamed from: d */
    private wr f29234d;

    /* renamed from: com.google.android.gms.internal.wp$a */
    public static final class C8171a extends C8036a<wp, C8171a> implements zzfhg {
        private C8171a() {
            super(wp.f29232e);
        }
    }

    static {
        zzffu wpVar = new wp();
        f29232e = wpVar;
        wpVar.mo7626a(C4479g.f16690f, null, null);
        wpVar.f28829b.m18929c();
    }

    private wp() {
    }

    /* renamed from: a */
    public static wp m34727a(zzfes zzfes) throws zzfge {
        return (wp) zzffu.m34105a(f29232e, zzfes);
    }

    /* renamed from: a */
    public final wr m34729a() {
        return this.f29234d == null ? wr.m34731d() : this.f29234d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        switch (wq.f16610a[i - 1]) {
            case 1:
                return new wp();
            case 2:
                return f29232e;
            case 3:
                return null;
            case 4:
                return new C8171a();
            case 5:
                this.f29234d = (wr) ((zzh) obj).zza(this.f29234d, ((wp) obj2).f29234d);
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
                                if (a == 10) {
                                    C8036a c8036a;
                                    if (this.f29234d != null) {
                                        zzffu zzffu = this.f29234d;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8172a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29234d = (wr) abk.mo4175a(wr.m34731d(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29234d);
                                        this.f29234d = (wr) c8036a.m34102c();
                                    }
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
                if (f29233f == null) {
                    synchronized (wp.class) {
                        if (f29233f == null) {
                            f29233f = new C7363b(f29232e);
                        }
                    }
                }
                return f29233f;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29232e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29234d != null) {
            zzffg.mo6946a(1, this.f29234d == null ? wr.m34731d() : this.f29234d);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29234d != null) {
            i2 = 0 + zzffg.m27537c(1, this.f29234d == null ? wr.m34731d() : this.f29234d);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
