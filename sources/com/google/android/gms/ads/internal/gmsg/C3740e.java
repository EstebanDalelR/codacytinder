package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzzv;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.gmsg.e */
public final class C3740e implements zzt<Object> {
    /* renamed from: a */
    private final Object f11799a = new Object();
    /* renamed from: b */
    private final Map<String, zzae> f11800b = new HashMap();

    /* renamed from: a */
    public final void m14181a(String str, zzae zzae) {
        synchronized (this.f11799a) {
            this.f11800b.put(str, zzae);
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("result");
        synchronized (this.f11799a) {
            zzae zzae = (zzae) this.f11800b.remove(str);
            if (zzae == null) {
                str4 = "Received result for unexpected method invocation: ";
                str = String.valueOf(str);
                ec.e(str.length() != 0 ? str4.concat(str) : new String(str4));
                return;
            } else if (!TextUtils.isEmpty(str2)) {
                zzae.zzau(str3);
                return;
            } else if (str4 == null) {
                zzae.zze(null);
                return;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str4);
                    if (ec.a()) {
                        str4 = "Result GMSG: ";
                        str2 = String.valueOf(jSONObject.toString(2));
                        ec.a(str2.length() != 0 ? str4.concat(str2) : new String(str4));
                    }
                    zzae.zze(jSONObject);
                } catch (JSONException e) {
                    zzae.zzau(e.getMessage());
                }
            }
        }
    }
}
