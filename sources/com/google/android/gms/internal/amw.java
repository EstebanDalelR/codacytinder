package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class amw implements zzt<Object> {
    /* renamed from: a */
    private final WeakReference<zzot> f23007a;
    /* renamed from: b */
    private final String f23008b;

    public amw(zzot zzot, String str) {
        this.f23007a = new WeakReference(zzot);
        this.f23008b = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("ads_id");
        String str2 = (String) map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.f23008b.equals(str)) {
            try {
                Integer.parseInt((String) map.get("eventType"));
            } catch (Throwable e) {
                hx.m19912b("Parse Scion log event type error", e);
            }
            zzot zzot;
            if ("_ai".equals(str2)) {
                zzot = (zzot) this.f23007a.get();
                if (zzot != null) {
                    zzot.zzbz();
                }
                return;
            }
            if ("_ac".equals(str2)) {
                zzot = (zzot) this.f23007a.get();
                if (zzot != null) {
                    zzot.zzca();
                }
            }
        }
    }
}
