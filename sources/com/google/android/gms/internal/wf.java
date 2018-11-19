package com.google.android.gms.internal;

import com.google.android.gms.internal.wh.C8168a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class wf extends zzffu<wf, C8167a> implements zzfhg {
    /* renamed from: f */
    private static final wf f29219f;
    /* renamed from: g */
    private static volatile zzfhk<wf> f29220g;
    /* renamed from: d */
    private wh f29221d;
    /* renamed from: e */
    private int f29222e;

    /* renamed from: com.google.android.gms.internal.wf$a */
    public static final class C8167a extends C8036a<wf, C8167a> implements zzfhg {
        private C8167a() {
            super(wf.f29219f);
        }
    }

    static {
        zzffu wfVar = new wf();
        f29219f = wfVar;
        wfVar.mo7626a(C4479g.f16690f, null, null);
        wfVar.f28829b.m18929c();
    }

    private wf() {
    }

    /* renamed from: a */
    public static wf m34703a(zzfes zzfes) throws zzfge {
        return (wf) zzffu.m34105a(f29219f, zzfes);
    }

    /* renamed from: a */
    public final wh m34705a() {
        return this.f29221d == null ? wh.m34708a() : this.f29221d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (wg.f16606a[i - 1]) {
            case 1:
                return new wf();
            case 2:
                return f29219f;
            case 3:
                return null;
            case 4:
                return new C8167a();
            case 5:
                zzh zzh = (zzh) obj;
                wf wfVar = (wf) obj2;
                this.f29221d = (wh) zzh.zza(this.f29221d, wfVar.f29221d);
                boolean z2 = this.f29222e != 0;
                int i2 = this.f29222e;
                if (wfVar.f29222e != 0) {
                    z = true;
                }
                this.f29222e = zzh.zza(z2, i2, z, wfVar.f29222e);
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
                                    if (this.f29221d != null) {
                                        zzffu zzffu = this.f29221d;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8168a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29221d = (wh) abk.mo4175a(wh.m34708a(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29221d);
                                        this.f29221d = (wh) c8036a.m34102c();
                                    }
                                } else if (i == 16) {
                                    this.f29222e = abk.mo4186i();
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
                if (f29220g == null) {
                    synchronized (wf.class) {
                        if (f29220g == null) {
                            f29220g = new C7363b(f29219f);
                        }
                    }
                }
                return f29220g;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29219f;
    }

    /* renamed from: b */
    public final int m34707b() {
        return this.f29222e;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29221d != null) {
            zzffg.mo6946a(1, this.f29221d == null ? wh.m34708a() : this.f29221d);
        }
        if (this.f29222e != 0) {
            zzffg.mo6961c(2, this.f29222e);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29221d != null) {
            i2 = 0 + zzffg.m27537c(1, this.f29221d == null ? wh.m34708a() : this.f29221d);
        }
        if (this.f29222e != 0) {
            i2 += zzffg.m27546e(2, this.f29222e);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}
