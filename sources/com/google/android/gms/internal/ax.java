package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class ax implements zzt<Object> {
    /* renamed from: a */
    private /* synthetic */ av f23225a;

    ax(av avVar) {
        this.f23225a = avVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f23225a.f15761b) {
            if (this.f23225a.f15764e.isDone()) {
                return;
            }
            ba baVar = new ba(-2, map);
            if (this.f23225a.f15762c.equals(baVar.m19552h())) {
                String e = baVar.m19549e();
                if (e == null) {
                    hx.m19916e("URL missing in loadAdUrl GMSG.");
                    return;
                }
                if (e.contains("%40mediation_adapters%40")) {
                    String replaceAll = e.replaceAll("%40mediation_adapters%40", dx.m19650a(this.f23225a.f15760a, (String) map.get("check_adapters"), this.f23225a.f15763d));
                    baVar.m19545a(replaceAll);
                    e = "Ad request URL modified to ";
                    replaceAll = String.valueOf(replaceAll);
                    ec.m27332a(replaceAll.length() != 0 ? e.concat(replaceAll) : new String(e));
                }
                this.f23225a.f15764e.m27364b(baVar);
                return;
            }
        }
    }
}
