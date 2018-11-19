package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.amn;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanm;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.q */
final class C3773q implements zzanm {
    /* renamed from: a */
    private /* synthetic */ amn f11830a;
    /* renamed from: b */
    private /* synthetic */ String f11831b;
    /* renamed from: c */
    private /* synthetic */ zzanh f11832c;

    C3773q(amn amn, String str, zzanh zzanh) {
        this.f11830a = amn;
        this.f11831b = str;
        this.f11832c = zzanh;
    }

    public final void zza(zzanh zzanh, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", this.f11830a.getHeadline());
            jSONObject.put("body", this.f11830a.getBody());
            jSONObject.put("call_to_action", this.f11830a.getCallToAction());
            jSONObject.put("price", this.f11830a.getPrice());
            jSONObject.put("star_rating", String.valueOf(this.f11830a.getStarRating()));
            jSONObject.put("store", this.f11830a.getStore());
            jSONObject.put(AnalyticsConstants.VALUE_SHARE_METHOD_ICON, C2406p.m8737a(this.f11830a.zzjs()));
            JSONArray jSONArray = new JSONArray();
            List<Object> images = this.f11830a.getImages();
            if (images != null) {
                for (Object a : images) {
                    jSONArray.put(C2406p.m8737a(C2406p.m8741b(a)));
                }
            }
            jSONObject.put(ManagerWebServices.PARAM_SPOTIFY_IMAGES, jSONArray);
            jSONObject.put("extras", C2406p.m8743b(this.f11830a.getExtras(), this.f11831b));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ManagerWebServices.PARAM_KEY_ASSETS, jSONObject);
            jSONObject2.put("template_id", "2");
            this.f11832c.zzb("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (Throwable e) {
            ec.c("Exception occurred when loading assets", e);
        }
    }
}
