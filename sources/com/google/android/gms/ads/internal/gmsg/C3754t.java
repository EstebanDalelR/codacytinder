package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.zzanh;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.t */
final class C3754t implements zzt<zzanh> {
    C3754t() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzanh zzanh = (zzanh) obj;
        if (((Boolean) aja.f().a(alo.bf)).booleanValue()) {
            zzanh.zzaf(Boolean.parseBoolean((String) map.get("disabled")) ^ 1);
        }
    }
}
