package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

public final class am implements zzt<Object> {
    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = "Invalid request: ";
        String valueOf = String.valueOf((String) map.get("errors"));
        hx.m19916e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        ae.f26544f.b(str);
    }
}
