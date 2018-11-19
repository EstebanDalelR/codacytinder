package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzanh;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.w */
final class C3757w implements zzt<zzanh> {
    C3757w() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzanh zzanh = (zzanh) obj;
        if (map.keySet().contains("start")) {
            zzanh.zzag(true);
        }
        if (map.keySet().contains("stop")) {
            zzanh.zzag(false);
        }
    }
}
