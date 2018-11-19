package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.overlay.C4275c;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzanh;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.p */
final class C3750p implements zzt<zzanh> {
    C3750p() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzanh zzanh = (zzanh) obj;
        C4275c zzsv = zzanh.zzsv();
        if (zzsv != null) {
            zzsv.m17143a();
            return;
        }
        C4275c zzsw = zzanh.zzsw();
        if (zzsw != null) {
            zzsw.m17143a();
        } else {
            ec.e("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
