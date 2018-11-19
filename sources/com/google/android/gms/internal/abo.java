package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;

final class abo implements adw {
    /* renamed from: a */
    private final zzffg f22883a;

    private abo(zzffg zzffg) {
        this.f22883a = (zzffg) abx.m18860a(zzffg, "output");
    }

    /* renamed from: a */
    public static abo m27010a(zzffg zzffg) {
        return zzffg.f23545a != null ? zzffg.f23545a : new abo(zzffg);
    }

    /* renamed from: a */
    public final int mo4192a() {
        return C4479g.f16695k;
    }

    /* renamed from: a */
    public final void mo4193a(int i, Object obj) {
        try {
            if (obj instanceof zzfes) {
                this.f22883a.mo6957b(i, (zzfes) obj);
            } else {
                this.f22883a.mo6958b(i, (zzfhe) obj);
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
