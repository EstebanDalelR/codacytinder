package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzanh;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.u */
final class C3755u implements zzt<zzanh> {
    C3755u() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzanh zzanh = (zzanh) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzanh.zzcq();
            return;
        }
        if ("resume".equals(str)) {
            zzanh.zzcr();
        }
    }
}
