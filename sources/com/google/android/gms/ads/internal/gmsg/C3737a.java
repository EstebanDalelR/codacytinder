package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzzv;
import java.util.Map;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.gmsg.a */
public final class C3737a implements zzt<Object> {
    /* renamed from: a */
    private final zzb f11783a;

    public C3737a(zzb zzb) {
        this.f11783a = zzb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            ec.e("App event with no name parameter.");
        } else {
            this.f11783a.onAppEvent(str, (String) map.get("info"));
        }
    }
}
