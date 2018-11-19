package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import org.json.JSONObject;

final /* synthetic */ class aqy implements zztr {
    /* renamed from: a */
    static final zztr f23049a = new aqy();

    private aqy() {
    }

    public final Object zzf(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(aqx.f15617b));
    }
}
