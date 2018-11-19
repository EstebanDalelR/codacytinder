package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ec;
import com.tinder.api.ManagerWebServices;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.r */
final class C3752r implements zzt<Object> {
    C3752r() {
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = "Received log message: ";
        String valueOf = String.valueOf((String) map.get(ManagerWebServices.PARAM_TEASER_STRING));
        ec.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
