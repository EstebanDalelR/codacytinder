package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;
import org.json.JSONObject;

final class and implements zzt<Object> {
    /* renamed from: a */
    private /* synthetic */ zzzb f23017a;
    /* renamed from: b */
    private /* synthetic */ amx f23018b;

    and(amx amx, zzzb zzzb) {
        this.f23018b = amx;
        this.f23017a = zzzb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.f23018b.f15512b);
            this.f23017a.zza("sendMessageToNativeJs", jSONObject);
        } catch (Throwable e) {
            hx.m19912b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
