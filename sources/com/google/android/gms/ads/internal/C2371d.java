package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.aqx;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.ib;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.ir;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzakv;
import com.google.android.gms.internal.zztp;
import com.google.android.gms.internal.zzzv;
import org.json.JSONObject;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.d */
public final class C2371d {
    /* renamed from: a */
    private final Object f7222a = new Object();
    /* renamed from: b */
    private Context f7223b;
    /* renamed from: c */
    private long f7224c = 0;

    /* renamed from: a */
    final /* synthetic */ zzakv m8691a(JSONObject jSONObject) throws Exception {
        if (!jSONObject.optBoolean("isSuccessful", false)) {
            return id.a(null);
        }
        return ar.m8652i().a(this.f7223b, jSONObject.getString("appSettingsJson"));
    }

    /* renamed from: a */
    public final void m8692a(Context context, zzakd zzakd, String str, @Nullable Runnable runnable) {
        m8693a(context, zzakd, true, null, str, null, runnable);
    }

    /* renamed from: a */
    final void m8693a(Context context, zzakd zzakd, boolean z, @Nullable dp dpVar, String str, @Nullable String str2, @Nullable Runnable runnable) {
        if (ar.m8654k().elapsedRealtime() - this.f7224c < 5000) {
            ec.e("Not retrying to fetch app settings");
            return;
        }
        this.f7224c = ar.m8654k().elapsedRealtime();
        Object obj = 1;
        if (dpVar != null) {
            if ((ar.m8654k().currentTimeMillis() - dpVar.a() > ((Long) aja.f().a(alo.cd)).longValue() ? 1 : null) == null) {
                if (dpVar.b()) {
                    obj = null;
                }
            }
        }
        if (obj != null) {
            if (context == null) {
                ec.e("Context not provided to fetch application settings");
            } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                ec.e("App settings could not be fetched. Required parameters missing");
            } else {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f7223b = applicationContext;
                zztp a = ar.m8661r().a(this.f7223b, zzakd).a("google.afma.config.fetchAppSettings", aqx.f15616a, aqx.f15616a);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    zzakv zzg = a.zzg(jSONObject);
                    zzakv a2 = id.a(zzg, new C3735e(this), ir.f16196b);
                    if (runnable != null) {
                        zzg.zza(runnable, ir.f16196b);
                    }
                    ib.a(a2, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Throwable e) {
                    ec.b("Error requesting application settings", e);
                }
            }
        }
    }
}
