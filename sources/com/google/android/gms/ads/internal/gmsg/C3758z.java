package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzzv;
import java.util.Map;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.gmsg.z */
public final class C3758z implements zzt<Object> {
    /* renamed from: a */
    private final zzx f11807a;

    public C3758z(zzx zzx) {
        this.f11807a = zzx;
    }

    public final void zza(Object obj, Map<String, String> map) {
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (Throwable e) {
            ec.b("Fail to parse float", e);
        }
        this.f11807a.zzd(equals);
        this.f11807a.zza(equals2, f);
    }
}
