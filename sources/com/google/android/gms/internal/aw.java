package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class aw implements zzt<Object> {
    /* renamed from: a */
    private /* synthetic */ av f23223a;

    aw(av avVar) {
        this.f23223a = avVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f23223a.f15761b) {
            if (this.f23223a.f15764e.isDone()) {
            } else if (this.f23223a.f15762c.equals(map.get("request_id"))) {
                ba baVar = new ba(1, map);
                String f = baVar.m19550f();
                String valueOf = String.valueOf(baVar.m19546b());
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(f).length() + 24) + String.valueOf(valueOf).length());
                stringBuilder.append("Invalid ");
                stringBuilder.append(f);
                stringBuilder.append(" request error: ");
                stringBuilder.append(valueOf);
                hx.m19916e(stringBuilder.toString());
                this.f23223a.f15764e.m27364b(baVar);
            }
        }
    }
}
