package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdView.Type;
import com.facebook.ads.internal.p049l.C1517a;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.x */
public class C3275x extends C1351a {
    /* renamed from: c */
    private final C3276y f10019c;
    /* renamed from: d */
    private Type f10020d;
    /* renamed from: e */
    private boolean f10021e;
    /* renamed from: f */
    private boolean f10022f;
    /* renamed from: g */
    private boolean f10023g;
    /* renamed from: h */
    private View f10024h;
    /* renamed from: i */
    private List<View> f10025i;

    public C3275x(Context context, C1352b c1352b, C1517a c1517a, C3276y c3276y) {
        super(context, c1352b, c1517a);
        this.f10019c = c3276y;
    }

    /* renamed from: b */
    private java.lang.String m12588b(android.view.View r1) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = this;
        r1 = r0.m12589c(r1);	 Catch:{ JSONException -> 0x0009 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0009 }
        return r1;
    L_0x0009:
        r1 = "Json exception";
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.x.b(android.view.View):java.lang.String");
    }

    /* renamed from: c */
    private JSONObject m12589c(View view) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("id", Integer.valueOf(view.getId()));
        jSONObject.putOpt("class", view.getClass());
        r4 = new Object[2];
        int i = 0;
        r4[0] = Integer.valueOf(view.getTop());
        boolean z = true;
        r4[1] = Integer.valueOf(view.getLeft());
        jSONObject.putOpt("origin", String.format("{x:%d, y:%d}", r4));
        jSONObject.putOpt(ManagerWebServices.PARAM_SIZE, String.format("{h:%d, w:%d}", new Object[]{Integer.valueOf(view.getHeight()), Integer.valueOf(view.getWidth())}));
        if (this.f10025i == null || !this.f10025i.contains(view)) {
            z = false;
        }
        jSONObject.putOpt("clickable", Boolean.valueOf(z));
        Object obj = "unknown";
        if (view instanceof Button) {
            obj = AnalyticsConstants.VALUE_SHARE_METHOD_BUTTON;
        } else if (view instanceof TextView) {
            obj = ManagerWebServices.PARAM_TEXT;
        } else if (view instanceof ImageView) {
            obj = ManagerWebServices.IG_PARAM_IMAGE;
        } else if (view instanceof MediaView) {
            obj = "mediaview";
        } else if (view instanceof ViewGroup) {
            obj = "viewgroup";
        }
        jSONObject.putOpt("type", obj);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            JSONArray jSONArray = new JSONArray();
            while (i < viewGroup.getChildCount()) {
                jSONArray.put(m12589c(viewGroup.getChildAt(i)));
                i++;
            }
            jSONObject.putOpt("list", jSONArray);
        }
        return jSONObject;
    }

    /* renamed from: d */
    private java.lang.String m12590d(android.view.View r4) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r4.getWidth();
        if (r0 <= 0) goto L_0x004d;
    L_0x0006:
        r0 = r4.getHeight();
        if (r0 > 0) goto L_0x000d;
    L_0x000c:
        goto L_0x004d;
    L_0x000d:
        r0 = r4.getWidth();	 Catch:{ Exception -> 0x004a }
        r1 = r4.getHeight();	 Catch:{ Exception -> 0x004a }
        r2 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ Exception -> 0x004a }
        r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2);	 Catch:{ Exception -> 0x004a }
        r1 = r4.getResources();	 Catch:{ Exception -> 0x004a }
        r1 = r1.getDisplayMetrics();	 Catch:{ Exception -> 0x004a }
        r1 = r1.densityDpi;	 Catch:{ Exception -> 0x004a }
        r0.setDensity(r1);	 Catch:{ Exception -> 0x004a }
        r1 = new android.graphics.Canvas;	 Catch:{ Exception -> 0x004a }
        r1.<init>(r0);	 Catch:{ Exception -> 0x004a }
        r4.draw(r1);	 Catch:{ Exception -> 0x004a }
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ Exception -> 0x004a }
        r4.<init>();	 Catch:{ Exception -> 0x004a }
        r1 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ Exception -> 0x004a }
        r2 = r3.f10019c;	 Catch:{ Exception -> 0x004a }
        r2 = r2.mo3308h();	 Catch:{ Exception -> 0x004a }
        r0.compress(r1, r2, r4);	 Catch:{ Exception -> 0x004a }
        r4 = r4.toByteArray();	 Catch:{ Exception -> 0x004a }
        r0 = 0;	 Catch:{ Exception -> 0x004a }
        r4 = android.util.Base64.encodeToString(r4, r0);	 Catch:{ Exception -> 0x004a }
        return r4;
    L_0x004a:
        r4 = "";
        return r4;
    L_0x004d:
        r4 = "";
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.x.d(android.view.View):java.lang.String");
    }

    /* renamed from: a */
    public void m12591a(View view) {
        this.f10024h = view;
    }

    /* renamed from: a */
    public void m12592a(Type type) {
        this.f10020d = type;
    }

    /* renamed from: a */
    public void m12593a(List<View> list) {
        this.f10025i = list;
    }

    /* renamed from: a */
    protected void mo1731a(Map<String, String> map) {
        if (this.f10019c != null) {
            if (this.a != null) {
                map.put("mil", String.valueOf(this.a.mo1682a()));
                map.put("eil", String.valueOf(this.a.mo3287b()));
                map.put("eil_source", this.a.mo3288c());
            }
            if (this.f10020d != null) {
                map.put("nti", String.valueOf(this.f10020d.getValue()));
            }
            if (this.f10021e) {
                map.put("nhs", Boolean.TRUE.toString());
            }
            if (this.f10022f) {
                map.put("nmv", Boolean.TRUE.toString());
            }
            if (this.f10023g) {
                map.put("nmvap", Boolean.TRUE.toString());
            }
            if (this.f10024h != null && this.f10019c.mo3305e()) {
                map.put("view", m12588b(this.f10024h));
            }
            if (this.f10024h != null && this.f10019c.mo3304d()) {
                map.put("snapshot", m12590d(this.f10024h));
            }
            this.f10019c.mo3300a((Map) map);
        }
    }

    /* renamed from: a */
    public void m12595a(boolean z) {
        this.f10021e = z;
    }

    /* renamed from: b */
    public void m12596b(boolean z) {
        this.f10022f = z;
    }

    /* renamed from: c */
    public void m12597c(boolean z) {
        this.f10023g = z;
    }
}
