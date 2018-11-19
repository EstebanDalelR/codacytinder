package com.google.android.gms.internal;

import com.google.android.gms.internal.xp.C8183b;
import com.google.android.gms.internal.xr.C8186b;
import com.google.android.gms.internal.zzffu.C8036a;
import java.security.GeneralSecurityException;

public final class ui {
    /* renamed from: a */
    private xp f16575a;

    private ui(xp xpVar) {
        this.f16575a = xpVar;
    }

    /* renamed from: a */
    static final ui m20223a(xp xpVar) throws GeneralSecurityException {
        if (xpVar != null) {
            if (xpVar.m34850c() > 0) {
                return new ui(xpVar);
            }
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: a */
    final xp m20224a() {
        return this.f16575a;
    }

    public final String toString() {
        xp xpVar = this.f16575a;
        C8036a a = xr.m34869a().m34851a(xpVar.m34847a());
        for (C8183b c8183b : xpVar.m34849b()) {
            a.m34852a((C8186b) C8186b.m34857a().m34856a(c8183b.m34841b().m34934a()).m34854a(c8183b.m34842c()).m34855a(c8183b.m34844e()).m34853a(c8183b.m34843d()).m34103d());
        }
        return ((xr) a.m34103d()).toString();
    }
}
