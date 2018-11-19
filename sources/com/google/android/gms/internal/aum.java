package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.C4269a;
import com.google.android.gms.ads.internal.aa;
import com.google.android.gms.common.util.C2526k;

@zzzv
public final class aum {
    /* renamed from: a */
    public static zzaif m19499a(Context context, C4269a c4269a, dm dmVar, tb tbVar, @Nullable zzanh zzanh, zzux zzux, zzyb zzyb, amb amb) {
        zzaif auq;
        zzaax zzaax = dmVar.f15996b;
        zzaif aur;
        if (zzaax.zzcow) {
            aur = new aur(context, dmVar, zzux, zzyb, amb, zzanh);
        } else {
            if (!zzaax.zzben) {
                if (!(c4269a instanceof aa)) {
                    auq = (((Boolean) aja.m19221f().m19334a(alo.ab)).booleanValue() && C2526k.e() && !C2526k.g() && zzanh != null && zzanh.zzsx().m20048d()) ? new auq(context, dmVar, zzanh, zzyb) : new aun(context, dmVar, zzanh, zzyb);
                }
            }
            if (zzaax.zzben && (c4269a instanceof aa)) {
                aur = new aut(context, (aa) c4269a, dmVar, tbVar, zzyb, amb);
            } else {
                auq = new auo(dmVar, zzyb);
            }
        }
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(auq.getClass().getName());
        hx.m19911b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        auq.zznd();
        return auq;
    }
}
