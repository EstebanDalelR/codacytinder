package com.google.android.gms.internal;

import java.util.Map;
import org.json.JSONObject;

final class ana implements zzanm {
    /* renamed from: a */
    private /* synthetic */ Map f23011a;
    /* renamed from: b */
    private /* synthetic */ amy f23012b;

    ana(amy amy, Map map) {
        this.f23012b = amy;
        this.f23011a = map;
    }

    public final void zza(zzanh zzanh, boolean z) {
        this.f23012b.f23010b.f15512b = (String) this.f23011a.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", this.f23012b.f23010b.f15512b);
            this.f23012b.f23009a.zza("sendMessageToNativeJs", jSONObject);
        } catch (Throwable e) {
            hx.m19912b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
