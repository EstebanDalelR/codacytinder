package com.facebook.ads.internal.server;

import android.text.TextUtils;
import com.facebook.ads.internal.p040g.C1405a;
import com.facebook.ads.internal.p040g.C1409d;
import com.facebook.ads.internal.p040g.C1410e;
import com.facebook.ads.internal.server.C1532e.C1531a;
import com.tinder.api.ManagerWebServices;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.server.d */
public class C1530d {
    /* renamed from: a */
    private static C1530d f4281a = new C1530d();

    /* renamed from: a */
    public static synchronized C1530d m5388a() {
        C1530d c1530d;
        synchronized (C1530d.class) {
            c1530d = f4281a;
        }
        return c1530d;
    }

    /* renamed from: a */
    private C3323f m5389a(JSONObject jSONObject) {
        int i = 0;
        JSONObject jSONObject2 = jSONObject.getJSONArray("placements").getJSONObject(0);
        C1409d c1409d = new C1409d(C1410e.m4900a(jSONObject2.getJSONObject("definition")), jSONObject2.optString("feature_config"));
        if (jSONObject2.has("ads")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("ads");
            while (i < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                c1409d.m4896a(new C1405a(jSONObject3.optString("adapter"), jSONObject3.optJSONObject(ManagerWebServices.FB_DATA), jSONObject3.optJSONArray("trackers")));
                i++;
            }
        }
        return new C3323f(c1409d, jSONObject.optString("server_request_id"), jSONObject.optString("server_response"));
    }

    /* renamed from: b */
    private com.facebook.ads.internal.server.C3324g m5390b(org.json.JSONObject r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = "placements";	 Catch:{ JSONException -> 0x0034 }
        r0 = r7.getJSONArray(r0);	 Catch:{ JSONException -> 0x0034 }
        r1 = 0;	 Catch:{ JSONException -> 0x0034 }
        r0 = r0.getJSONObject(r1);	 Catch:{ JSONException -> 0x0034 }
        r2 = "definition";	 Catch:{ JSONException -> 0x0034 }
        r2 = r0.getJSONObject(r2);	 Catch:{ JSONException -> 0x0034 }
        r2 = com.facebook.ads.internal.p040g.C1410e.m4900a(r2);	 Catch:{ JSONException -> 0x0034 }
        r3 = "feature_config";	 Catch:{ JSONException -> 0x0034 }
        r0 = r0.optString(r3);	 Catch:{ JSONException -> 0x0034 }
        r3 = new com.facebook.ads.internal.server.g;	 Catch:{ JSONException -> 0x0034 }
        r4 = "message";	 Catch:{ JSONException -> 0x0034 }
        r5 = "";	 Catch:{ JSONException -> 0x0034 }
        r4 = r7.optString(r4, r5);	 Catch:{ JSONException -> 0x0034 }
        r5 = "code";	 Catch:{ JSONException -> 0x0034 }
        r1 = r7.optInt(r5, r1);	 Catch:{ JSONException -> 0x0034 }
        r5 = new com.facebook.ads.internal.g.d;	 Catch:{ JSONException -> 0x0034 }
        r5.<init>(r2, r0);	 Catch:{ JSONException -> 0x0034 }
        r3.<init>(r4, r1, r5);	 Catch:{ JSONException -> 0x0034 }
        return r3;
    L_0x0034:
        r7 = r6.m5391c(r7);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.server.d.b(org.json.JSONObject):com.facebook.ads.internal.server.g");
    }

    /* renamed from: c */
    private C3324g m5391c(JSONObject jSONObject) {
        return new C3324g(jSONObject.optString("message", ""), jSONObject.optInt("code", 0), null);
    }

    /* renamed from: a */
    public C1532e m5392a(String str) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            str = jSONObject.optString("type");
            Object obj = -1;
            int hashCode = str.hashCode();
            if (hashCode != 96432) {
                if (hashCode == 96784904) {
                    if (str.equals("error")) {
                        obj = 1;
                    }
                }
            } else if (str.equals("ads")) {
                obj = null;
            }
            switch (obj) {
                case null:
                    return m5389a(jSONObject);
                case 1:
                    return m5390b(jSONObject);
                default:
                    JSONObject optJSONObject = jSONObject.optJSONObject("error");
                    if (optJSONObject != null) {
                        return m5391c(optJSONObject);
                    }
                    break;
            }
        }
        return new C1532e(C1531a.UNKNOWN);
    }
}
