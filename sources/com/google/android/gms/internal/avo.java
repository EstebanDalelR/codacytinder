package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.aa;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.bo;
import com.google.android.gms.ads.internal.gmsg.ab;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.js.C2388t;
import com.google.android.gms.ads.internal.js.JavascriptEngineFactory;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@zzzv
public final class avo extends auv<avo> {
    /* renamed from: c */
    private static final long f26826c = TimeUnit.SECONDS.toMillis(60);
    /* renamed from: d */
    private static final Object f26827d = new Object();
    /* renamed from: e */
    private static boolean f26828e = false;
    /* renamed from: f */
    private static C2388t f26829f;
    /* renamed from: a */
    private JavascriptEngineFactory f26830a;
    /* renamed from: b */
    private zzakv<zzanh> f26831b;
    /* renamed from: g */
    private final ab f26832g;
    /* renamed from: h */
    private final amw f26833h;
    /* renamed from: i */
    private final Context f26834i;
    /* renamed from: j */
    private final zzakd f26835j;
    /* renamed from: k */
    private final aa f26836k;
    /* renamed from: l */
    private final tb f26837l;
    /* renamed from: m */
    private final Object f26838m = new Object();
    /* renamed from: n */
    private String f26839n;

    public avo(Context context, aa aaVar, String str, tb tbVar, zzakd zzakd) {
        hx.m19915d("Webview loading for native ads.");
        this.f26834i = context;
        this.f26836k = aaVar;
        this.f26837l = tbVar;
        this.f26835j = zzakd;
        this.f26839n = str;
        this.f26830a = new JavascriptEngineFactory();
        ar.f();
        zzakv a = kz.m20025a(this.f26834i, this.f26835j, (String) aja.m19221f().m19334a(alo.bK), this.f26837l, this.f26836k.a());
        this.f26832g = new ab(this.f26834i);
        this.f26833h = new amw(aaVar, str);
        this.f26831b = id.m19922a(a, new avp(this), ir.f16196b);
        ib.m19919a(this.f26831b, "WebViewNativeAdsUtil.constructor");
    }

    /* renamed from: a */
    final /* synthetic */ zzakv m31524a(zzanh zzanh) throws Exception {
        hx.m19915d("Javascript has loaded for native ads.");
        zzanh.zzsz().m20004a(this.f26836k, this.f26836k, this.f26836k, this.f26836k, false, null, new bo(this.f26834i, null, null), null, null);
        zzanh.zzsz().m20005a("/logScionEvent", this.f26832g);
        zzanh.zzsz().m20005a("/logScionEvent", this.f26833h);
        return id.m19920a(zzanh);
    }

    /* renamed from: a */
    final /* synthetic */ zzakv m31525a(JSONObject jSONObject, zzanh zzanh) throws Exception {
        jSONObject.put("ads_id", this.f26839n);
        zzanh.zzb("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return id.m19920a(new JSONObject());
    }

    /* renamed from: a */
    final /* synthetic */ void m31526a(zzanh zzanh, auw auw, iw iwVar, zzanh zzanh2, Map map) {
        try {
            JSONObject jSONObject;
            boolean z;
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str);
                z = true;
            } else {
                jSONObject = new JSONObject(str2);
                z = false;
            }
            if (this.f26839n.equals(jSONObject.optString("ads_id", ""))) {
                zzanh.zzb("/nativeAdPreProcess", auw.f15742a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                jSONObject2.put("json", jSONObject);
                iwVar.m27364b(jSONObject2);
            }
        } catch (Throwable th) {
            hx.m19912b("Error while preprocessing json.", th);
            iwVar.m27363a(th);
        }
    }

    /* renamed from: b */
    final /* synthetic */ zzakv m31527b(JSONObject jSONObject, zzanh zzanh) throws Exception {
        jSONObject.put("ads_id", this.f26839n);
        zzanh.zzb("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return id.m19920a(new JSONObject());
    }

    /* renamed from: c */
    final /* synthetic */ zzakv m31528c(JSONObject jSONObject, zzanh zzanh) throws Exception {
        jSONObject.put("ads_id", this.f26839n);
        zzakv iwVar = new iw();
        auw auw = new auw();
        zzt avt = new avt(this, zzanh, auw, iwVar);
        auw.f15742a = avt;
        zzanh.zza("/nativeAdPreProcess", avt);
        zzanh.zzb("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return iwVar;
    }

    public final void zza(String str, zzt zzt) {
        id.m19930a(this.f26831b, new avu(this, str, zzt), ir.f16195a);
    }

    public final void zza(String str, JSONObject jSONObject) {
        id.m19930a(this.f26831b, new avw(this, str, jSONObject), ir.f16195a);
    }

    public final void zzb(String str, zzt zzt) {
        id.m19930a(this.f26831b, new avv(this, str, zzt), ir.f16195a);
    }

    public final zzakv<JSONObject> zzi(JSONObject jSONObject) {
        return id.m19922a(this.f26831b, new avq(this, jSONObject), ir.f16195a);
    }

    public final zzakv<JSONObject> zzj(JSONObject jSONObject) {
        return id.m19922a(this.f26831b, new avr(this, jSONObject), ir.f16195a);
    }

    public final zzakv<JSONObject> zzk(JSONObject jSONObject) {
        return id.m19922a(this.f26831b, new avs(this, jSONObject), ir.f16195a);
    }

    public final void zzls() {
        id.m19930a(this.f26831b, new avx(this), ir.f16195a);
    }
}
