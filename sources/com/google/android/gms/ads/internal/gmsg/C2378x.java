package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.gmsg.x */
final class C2378x implements Runnable {
    /* renamed from: a */
    final /* synthetic */ zza f7260a;
    /* renamed from: b */
    private /* synthetic */ Map f7261b;
    /* renamed from: c */
    private /* synthetic */ HttpClient f7262c;

    C2378x(HttpClient httpClient, Map map, zza zza) {
        this.f7262c = httpClient;
        this.f7261b = map;
        this.f7260a = zza;
    }

    public final void run() {
        ec.b("Received Http request.");
        try {
            JSONObject send = this.f7262c.send(new JSONObject((String) this.f7261b.get("http_request")));
            if (send == null) {
                ec.c("Response should not be null.");
            } else {
                fk.f16060a.post(new C2379y(this, send));
            }
        } catch (Throwable e) {
            ec.b("Error converting request to json.", e);
        }
    }
}
