package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzanh;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.v */
final class C3756v implements zzt<zzanh> {
    C3756v() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzanh zzanh = (zzanh) obj;
        if (map.keySet().contains("start")) {
            zzanh.zzsz().i();
        } else if (map.keySet().contains("stop")) {
            zzanh.zzsz().j();
        } else {
            if (map.keySet().contains("cancel")) {
                zzanh.zzsz().k();
            }
        }
    }
}
