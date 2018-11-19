package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.iw;
import com.google.android.gms.internal.zzzv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

@zzzv
public final class aa implements zzt<Object> {
    /* renamed from: a */
    private HashMap<String, iw<JSONObject>> f11784a = new HashMap();

    /* renamed from: a */
    public final Future<JSONObject> m14176a(String str) {
        Future iwVar = new iw();
        this.f11784a.put(str, iwVar);
        return iwVar;
    }

    /* renamed from: b */
    public final void m14177b(String str) {
        iw iwVar = (iw) this.f11784a.get(str);
        if (iwVar == null) {
            ec.c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!iwVar.isDone()) {
            iwVar.cancel(true);
        }
        this.f11784a.remove(str);
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = (String) map.get("fetched_ad");
        ec.b("Received ad from the cache.");
        iw iwVar = (iw) this.f11784a.get(str);
        if (iwVar == null) {
            ec.c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            iwVar.b(new JSONObject(str2));
        } catch (Throwable e) {
            ec.b("Failed constructing JSON object from value passed from javascript", e);
            iwVar.b(null);
        } finally {
            this.f11784a.remove(str);
        }
    }
}
