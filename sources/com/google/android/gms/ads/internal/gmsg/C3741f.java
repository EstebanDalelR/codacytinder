package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzaeq;
import com.google.android.gms.internal.zzzv;
import com.tinder.api.ManagerWebServices;
import java.util.Map;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.gmsg.f */
public final class C3741f implements zzt<Object> {
    /* renamed from: a */
    private final zzag f11801a;

    public C3741f(zzag zzag) {
        this.f11801a = zzag;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzaeq zzaeq = null;
            try {
                int parseInt = Integer.parseInt((String) map.get(ManagerWebServices.PARAM_AMOUNT));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzaeq = new zzaeq(str2, parseInt);
                }
            } catch (Throwable e) {
                ec.c("Unable to parse reward amount.", e);
            }
            this.f11801a.zzb(zzaeq);
            return;
        }
        if ("video_start".equals(str)) {
            this.f11801a.zzdl();
        }
    }
}
