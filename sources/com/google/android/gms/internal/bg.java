package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import org.json.JSONObject;

@zzzv
public final class bg extends bi {
    /* renamed from: a */
    private final Object f23228a = new Object();
    /* renamed from: b */
    private final Context f23229b;
    @Nullable
    /* renamed from: c */
    private SharedPreferences f23230c;
    /* renamed from: d */
    private final zztp<JSONObject, JSONObject> f23231d;

    public bg(Context context, zztp<JSONObject, JSONObject> zztp) {
        this.f23229b = context.getApplicationContext();
        this.f23231d = zztp;
    }

    /* renamed from: a */
    public final zzakv<Void> mo4565a() {
        synchronized (this.f23228a) {
            if (this.f23230c == null) {
                this.f23230c = this.f23229b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (ar.k().currentTimeMillis() - this.f23230c.getLong("js_last_update", 0) < ((Long) aja.m19221f().m19334a(alo.bH)).longValue()) {
            return id.m19920a(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzakd.zzrd().zzcv);
            jSONObject.put("mf", aja.m19221f().m19334a(alo.bI));
            jSONObject.put("cl", "179146524");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            return id.m19923a(this.f23231d.zzg(jSONObject), new bh(this), ir.f16196b);
        } catch (Throwable e) {
            hx.m19912b("Unable to populate SDK Core Constants parameters.", e);
            return id.m19920a(null);
        }
    }

    /* renamed from: a */
    final /* synthetic */ Void m27268a(JSONObject jSONObject) {
        alo.m19338a(this.f23229b, 1, jSONObject);
        this.f23230c.edit().putLong("js_last_update", ar.k().currentTimeMillis()).apply();
        return null;
    }
}
