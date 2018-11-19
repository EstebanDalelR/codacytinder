package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.C2521f;

/* renamed from: com.google.android.gms.internal.j */
final class C6267j implements C4473k {
    /* renamed from: a */
    private /* synthetic */ Context f23343a;

    C6267j(Context context) {
        this.f23343a = context;
    }

    /* renamed from: a */
    public final boolean mo4632a(zzakd zzakd) {
        aja.m19216a();
        boolean c = hn.m19877c(this.f23343a);
        Object obj = (((Boolean) aja.m19221f().m19334a(alo.cK)).booleanValue() && zzakd.zzdel) ? 1 : null;
        if (!C4471i.m19918b(this.f23343a, zzakd.zzdel) || !c || obj != null) {
            return true;
        }
        if (C2521f.c(this.f23343a)) {
            if (!((Boolean) aja.m19221f().m19334a(alo.f15426D)).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
