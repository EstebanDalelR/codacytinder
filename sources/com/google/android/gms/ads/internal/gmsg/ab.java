package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.internal.zzzv;
import java.util.Map;

@zzzv
public final class ab implements zzt<Object> {
    /* renamed from: a */
    private final Context f11785a;

    public ab(Context context) {
        this.f11785a = context;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (ar.m8669z().a(this.f11785a)) {
            ar.m8669z().a(this.f11785a, (String) map.get("eventName"), (String) map.get("eventId"));
        }
    }
}
