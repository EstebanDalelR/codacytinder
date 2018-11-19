package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.util.C2526k;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.overlay.j */
public final class C2400j {
    /* renamed from: a */
    public static void m8731a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzcje == 4 && adOverlayInfoParcel.zzcix == null) {
            if (adOverlayInfoParcel.zzciw != null) {
                adOverlayInfoParcel.zzciw.onAdClicked();
            }
            ar.m8645b();
            C2394a.m8730a(context, adOverlayInfoParcel.zzciv, adOverlayInfoParcel.zzcjd);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzaty.zzdel);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.zza(intent, adOverlayInfoParcel);
        if (!C2526k.m9216g()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        ar.m8648e();
        fk.a(context, intent);
    }
}
