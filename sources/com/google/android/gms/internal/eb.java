package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

final class eb extends dy {
    /* renamed from: a */
    private Context f26884a;

    eb(Context context) {
        this.f26884a = context;
    }

    /* renamed from: a */
    public final void mo6837a() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f26884a);
        } catch (Throwable e) {
            hx.m19912b("Fail to get isAdIdFakeForDebugLogging", e);
            isAdIdFakeForDebugLogging = false;
        }
        hq.m19893a(isAdIdFakeForDebugLogging);
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("Update ad debug logging enablement as ");
        stringBuilder.append(isAdIdFakeForDebugLogging);
        hx.m19916e(stringBuilder.toString());
    }

    /* renamed from: b */
    public final void mo6838b() {
    }
}
