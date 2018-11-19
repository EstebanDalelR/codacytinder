package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.amp;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanm;
import com.tinder.api.ManagerWebServices;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.r */
final class C3774r implements zzanm {
    /* renamed from: a */
    private /* synthetic */ amp f11833a;
    /* renamed from: b */
    private /* synthetic */ String f11834b;
    /* renamed from: c */
    private /* synthetic */ zzanh f11835c;

    C3774r(amp amp, String str, zzanh zzanh) {
        this.f11833a = amp;
        this.f11834b = str;
        this.f11835c = zzanh;
    }

    public final void zza(zzanh zzanh, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", this.f11833a.getHeadline());
            jSONObject.put("body", this.f11833a.getBody());
            jSONObject.put("call_to_action", this.f11833a.getCallToAction());
            jSONObject.put("advertiser", this.f11833a.getAdvertiser());
            jSONObject.put("logo", C2406p.m8737a(this.f11833a.zzjz()));
            JSONArray jSONArray = new JSONArray();
            List<Object> images = this.f11833a.getImages();
            if (images != null) {
                for (Object a : images) {
                    jSONArray.put(C2406p.m8737a(C2406p.m8741b(a)));
                }
            }
            jSONObject.put(ManagerWebServices.PARAM_SPOTIFY_IMAGES, jSONArray);
            jSONObject.put("extras", C2406p.m8743b(this.f11833a.getExtras(), this.f11834b));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ManagerWebServices.PARAM_KEY_ASSETS, jSONObject);
            jSONObject2.put("template_id", "1");
            this.f11835c.zzb("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (Throwable e) {
            ec.c("Exception occurred when loading assets", e);
        }
    }
}
