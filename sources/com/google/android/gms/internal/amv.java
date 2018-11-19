package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.internal.ad;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public class amv implements zzos {
    /* renamed from: a */
    boolean f22995a;
    /* renamed from: b */
    private final Object f22996b = new Object();
    /* renamed from: c */
    private final zzot f22997c;
    /* renamed from: d */
    private final Context f22998d;
    @Nullable
    /* renamed from: e */
    private final JSONObject f22999e;
    @Nullable
    /* renamed from: f */
    private final zzzb f23000f;
    @Nullable
    /* renamed from: g */
    private final zzou f23001g;
    /* renamed from: h */
    private final tb f23002h;
    @Nullable
    /* renamed from: i */
    private final zzakd f23003i;
    @Nullable
    /* renamed from: j */
    private String f23004j;
    @Nullable
    /* renamed from: k */
    private dd f23005k;
    /* renamed from: l */
    private WeakReference<View> f23006l = null;

    public amv(Context context, zzot zzot, @Nullable zzzb zzzb, tb tbVar, @Nullable JSONObject jSONObject, @Nullable zzou zzou, @Nullable zzakd zzakd, @Nullable String str) {
        this.f22998d = context;
        this.f22997c = zzot;
        this.f23000f = zzzb;
        this.f23002h = tbVar;
        this.f22999e = jSONObject;
        this.f23001g = zzou;
        this.f23003i = zzakd;
        this.f23004j = str;
    }

    /* renamed from: a */
    private final int m27141a(int i) {
        aja.m19216a();
        return hn.m19871b(this.f22998d, i);
    }

    /* renamed from: a */
    private final JSONObject m27142a(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m27141a(rect.right - rect.left));
        jSONObject.put("height", m27141a(rect.bottom - rect.top));
        jSONObject.put("x", m27141a(rect.left));
        jSONObject.put("y", m27141a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: a */
    private final org.json.JSONObject m27143a(java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r13, android.view.View r14) {
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
        r12 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r13 == 0) goto L_0x0104;
    L_0x0007:
        if (r14 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r14 = m27148b(r14);
        monitor-enter(r13);
        r1 = r13.entrySet();	 Catch:{ all -> 0x0101 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0101 }
    L_0x0017:
        r2 = r1.hasNext();	 Catch:{ all -> 0x0101 }
        if (r2 == 0) goto L_0x00ff;	 Catch:{ all -> 0x0101 }
    L_0x001d:
        r2 = r1.next();	 Catch:{ all -> 0x0101 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0101 }
        r3 = r2.getValue();	 Catch:{ all -> 0x0101 }
        r3 = (java.lang.ref.WeakReference) r3;	 Catch:{ all -> 0x0101 }
        r3 = r3.get();	 Catch:{ all -> 0x0101 }
        r3 = (android.view.View) r3;	 Catch:{ all -> 0x0101 }
        if (r3 == 0) goto L_0x0017;	 Catch:{ all -> 0x0101 }
    L_0x0031:
        r4 = m27148b(r3);	 Catch:{ all -> 0x0101 }
        r5 = new org.json.JSONObject;	 Catch:{ all -> 0x0101 }
        r5.<init>();	 Catch:{ all -> 0x0101 }
        r6 = new org.json.JSONObject;	 Catch:{ all -> 0x0101 }
        r6.<init>();	 Catch:{ all -> 0x0101 }
        r7 = "width";	 Catch:{ JSONException -> 0x00f8 }
        r8 = r3.getMeasuredWidth();	 Catch:{ JSONException -> 0x00f8 }
        r8 = r12.m27141a(r8);	 Catch:{ JSONException -> 0x00f8 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f8 }
        r7 = "height";	 Catch:{ JSONException -> 0x00f8 }
        r8 = r3.getMeasuredHeight();	 Catch:{ JSONException -> 0x00f8 }
        r8 = r12.m27141a(r8);	 Catch:{ JSONException -> 0x00f8 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f8 }
        r7 = "x";	 Catch:{ JSONException -> 0x00f8 }
        r8 = 0;	 Catch:{ JSONException -> 0x00f8 }
        r9 = r4[r8];	 Catch:{ JSONException -> 0x00f8 }
        r10 = r14[r8];	 Catch:{ JSONException -> 0x00f8 }
        r9 = r9 - r10;	 Catch:{ JSONException -> 0x00f8 }
        r9 = r12.m27141a(r9);	 Catch:{ JSONException -> 0x00f8 }
        r6.put(r7, r9);	 Catch:{ JSONException -> 0x00f8 }
        r7 = "y";	 Catch:{ JSONException -> 0x00f8 }
        r9 = 1;	 Catch:{ JSONException -> 0x00f8 }
        r10 = r4[r9];	 Catch:{ JSONException -> 0x00f8 }
        r11 = r14[r9];	 Catch:{ JSONException -> 0x00f8 }
        r10 = r10 - r11;	 Catch:{ JSONException -> 0x00f8 }
        r10 = r12.m27141a(r10);	 Catch:{ JSONException -> 0x00f8 }
        r6.put(r7, r10);	 Catch:{ JSONException -> 0x00f8 }
        r7 = "relative_to";	 Catch:{ JSONException -> 0x00f8 }
        r10 = "ad_view";	 Catch:{ JSONException -> 0x00f8 }
        r6.put(r7, r10);	 Catch:{ JSONException -> 0x00f8 }
        r7 = "frame";	 Catch:{ JSONException -> 0x00f8 }
        r5.put(r7, r6);	 Catch:{ JSONException -> 0x00f8 }
        r6 = new android.graphics.Rect;	 Catch:{ JSONException -> 0x00f8 }
        r6.<init>();	 Catch:{ JSONException -> 0x00f8 }
        r7 = r3.getLocalVisibleRect(r6);	 Catch:{ JSONException -> 0x00f8 }
        if (r7 == 0) goto L_0x0093;	 Catch:{ JSONException -> 0x00f8 }
    L_0x008e:
        r4 = r12.m27142a(r6);	 Catch:{ JSONException -> 0x00f8 }
        goto L_0x00c6;	 Catch:{ JSONException -> 0x00f8 }
    L_0x0093:
        r6 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00f8 }
        r6.<init>();	 Catch:{ JSONException -> 0x00f8 }
        r7 = "width";	 Catch:{ JSONException -> 0x00f8 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f8 }
        r7 = "height";	 Catch:{ JSONException -> 0x00f8 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f8 }
        r7 = "x";	 Catch:{ JSONException -> 0x00f8 }
        r10 = r4[r8];	 Catch:{ JSONException -> 0x00f8 }
        r8 = r14[r8];	 Catch:{ JSONException -> 0x00f8 }
        r10 = r10 - r8;	 Catch:{ JSONException -> 0x00f8 }
        r8 = r12.m27141a(r10);	 Catch:{ JSONException -> 0x00f8 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f8 }
        r7 = "y";	 Catch:{ JSONException -> 0x00f8 }
        r4 = r4[r9];	 Catch:{ JSONException -> 0x00f8 }
        r8 = r14[r9];	 Catch:{ JSONException -> 0x00f8 }
        r4 = r4 - r8;	 Catch:{ JSONException -> 0x00f8 }
        r4 = r12.m27141a(r4);	 Catch:{ JSONException -> 0x00f8 }
        r6.put(r7, r4);	 Catch:{ JSONException -> 0x00f8 }
        r4 = "relative_to";	 Catch:{ JSONException -> 0x00f8 }
        r7 = "ad_view";	 Catch:{ JSONException -> 0x00f8 }
        r6.put(r4, r7);	 Catch:{ JSONException -> 0x00f8 }
        r4 = r6;	 Catch:{ JSONException -> 0x00f8 }
    L_0x00c6:
        r6 = "visible_bounds";	 Catch:{ JSONException -> 0x00f8 }
        r5.put(r6, r4);	 Catch:{ JSONException -> 0x00f8 }
        r4 = r3 instanceof android.widget.TextView;	 Catch:{ JSONException -> 0x00f8 }
        if (r4 == 0) goto L_0x00ed;	 Catch:{ JSONException -> 0x00f8 }
    L_0x00cf:
        r3 = (android.widget.TextView) r3;	 Catch:{ JSONException -> 0x00f8 }
        r4 = "text_color";	 Catch:{ JSONException -> 0x00f8 }
        r6 = r3.getCurrentTextColor();	 Catch:{ JSONException -> 0x00f8 }
        r5.put(r4, r6);	 Catch:{ JSONException -> 0x00f8 }
        r4 = "font_size";	 Catch:{ JSONException -> 0x00f8 }
        r6 = r3.getTextSize();	 Catch:{ JSONException -> 0x00f8 }
        r6 = (double) r6;	 Catch:{ JSONException -> 0x00f8 }
        r5.put(r4, r6);	 Catch:{ JSONException -> 0x00f8 }
        r4 = "text";	 Catch:{ JSONException -> 0x00f8 }
        r3 = r3.getText();	 Catch:{ JSONException -> 0x00f8 }
        r5.put(r4, r3);	 Catch:{ JSONException -> 0x00f8 }
    L_0x00ed:
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x00f8 }
        r2 = (java.lang.String) r2;	 Catch:{ JSONException -> 0x00f8 }
        r0.put(r2, r5);	 Catch:{ JSONException -> 0x00f8 }
        goto L_0x0017;
    L_0x00f8:
        r2 = "Unable to get asset views information";	 Catch:{ all -> 0x0101 }
        com.google.android.gms.internal.hx.m19916e(r2);	 Catch:{ all -> 0x0101 }
        goto L_0x0017;	 Catch:{ all -> 0x0101 }
    L_0x00ff:
        monitor-exit(r13);	 Catch:{ all -> 0x0101 }
        return r0;	 Catch:{ all -> 0x0101 }
    L_0x0101:
        r14 = move-exception;	 Catch:{ all -> 0x0101 }
        monitor-exit(r13);	 Catch:{ all -> 0x0101 }
        throw r14;
    L_0x0104:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.amv.a(java.util.Map, android.view.View):org.json.JSONObject");
    }

    /* renamed from: a */
    private final void m27144a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        ad.b("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f22999e);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            jSONObject = new JSONObject();
            jSONObject.put("asset_id", str);
            jSONObject.put("template", this.f23001g.zzju());
            ar.g();
            jSONObject.put("is_privileged_process", fq.m19763e());
            boolean z = false;
            jSONObject.put("has_custom_click_handler", this.f22997c.zzs(this.f23001g.getCustomTemplateId()) != null);
            String str2 = "has_custom_click_handler";
            if (this.f22997c.zzs(this.f23001g.getCustomTemplateId()) != null) {
                z = true;
            }
            jSONObject7.put(str2, z);
            try {
                jSONObject2 = this.f22999e.optJSONObject("tracking_urls_and_actions");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject.put("click_signals", this.f23002h.m20180a().zza(this.f22998d, jSONObject2.optString("click_string"), view));
            } catch (Throwable e) {
                hx.m19912b("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.f23004j);
            ib.m19919a(this.f23000f.zzj(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (Throwable e2) {
            hx.m19912b("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: a */
    private static boolean m27145a(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    /* renamed from: a */
    private final boolean m27146a(String str) {
        JSONObject optJSONObject = this.f22999e == null ? null : this.f22999e.optJSONObject("allow_pub_event_reporting");
        return optJSONObject == null ? false : optJSONObject.optBoolean(str, false);
    }

    /* renamed from: a */
    private final boolean m27147a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        ad.b("recordImpression must be called on the main UI thread.");
        if (this.f22995a) {
            return true;
        }
        this.f22995a = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f22999e);
            jSONObject6.put("ads_id", this.f23004j);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            ib.m19919a(this.f23000f.zzk(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.f22997c.zza((zzos) this);
            this.f22997c.zzcc();
            return true;
        } catch (Throwable e) {
            hx.m19912b("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: b */
    private static int[] m27148b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: c */
    private final org.json.JSONObject m27149c(android.view.View r8) {
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
        r7 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r8 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = m27148b(r8);	 Catch:{ Exception -> 0x0091 }
        r2 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0091 }
        r2.<init>();	 Catch:{ Exception -> 0x0091 }
        r3 = "width";	 Catch:{ Exception -> 0x0091 }
        r4 = r8.getMeasuredWidth();	 Catch:{ Exception -> 0x0091 }
        r4 = r7.m27141a(r4);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r4);	 Catch:{ Exception -> 0x0091 }
        r3 = "height";	 Catch:{ Exception -> 0x0091 }
        r4 = r8.getMeasuredHeight();	 Catch:{ Exception -> 0x0091 }
        r4 = r7.m27141a(r4);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r4);	 Catch:{ Exception -> 0x0091 }
        r3 = "x";	 Catch:{ Exception -> 0x0091 }
        r4 = 0;	 Catch:{ Exception -> 0x0091 }
        r5 = r1[r4];	 Catch:{ Exception -> 0x0091 }
        r5 = r7.m27141a(r5);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r5);	 Catch:{ Exception -> 0x0091 }
        r3 = "y";	 Catch:{ Exception -> 0x0091 }
        r5 = 1;	 Catch:{ Exception -> 0x0091 }
        r6 = r1[r5];	 Catch:{ Exception -> 0x0091 }
        r6 = r7.m27141a(r6);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r6);	 Catch:{ Exception -> 0x0091 }
        r3 = "relative_to";	 Catch:{ Exception -> 0x0091 }
        r6 = "window";	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r6);	 Catch:{ Exception -> 0x0091 }
        r3 = "frame";	 Catch:{ Exception -> 0x0091 }
        r0.put(r3, r2);	 Catch:{ Exception -> 0x0091 }
        r2 = new android.graphics.Rect;	 Catch:{ Exception -> 0x0091 }
        r2.<init>();	 Catch:{ Exception -> 0x0091 }
        r8 = r8.getGlobalVisibleRect(r2);	 Catch:{ Exception -> 0x0091 }
        if (r8 == 0) goto L_0x005f;	 Catch:{ Exception -> 0x0091 }
    L_0x005a:
        r8 = r7.m27142a(r2);	 Catch:{ Exception -> 0x0091 }
        goto L_0x008b;	 Catch:{ Exception -> 0x0091 }
    L_0x005f:
        r8 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0091 }
        r8.<init>();	 Catch:{ Exception -> 0x0091 }
        r2 = "width";	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r4);	 Catch:{ Exception -> 0x0091 }
        r2 = "height";	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r4);	 Catch:{ Exception -> 0x0091 }
        r2 = "x";	 Catch:{ Exception -> 0x0091 }
        r3 = r1[r4];	 Catch:{ Exception -> 0x0091 }
        r3 = r7.m27141a(r3);	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r3);	 Catch:{ Exception -> 0x0091 }
        r2 = "y";	 Catch:{ Exception -> 0x0091 }
        r1 = r1[r5];	 Catch:{ Exception -> 0x0091 }
        r1 = r7.m27141a(r1);	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r1);	 Catch:{ Exception -> 0x0091 }
        r1 = "relative_to";	 Catch:{ Exception -> 0x0091 }
        r2 = "window";	 Catch:{ Exception -> 0x0091 }
        r8.put(r1, r2);	 Catch:{ Exception -> 0x0091 }
    L_0x008b:
        r1 = "visible_bounds";	 Catch:{ Exception -> 0x0091 }
        r0.put(r1, r8);	 Catch:{ Exception -> 0x0091 }
        return r0;
    L_0x0091:
        r8 = "Unable to get native ad view bounding box";
        com.google.android.gms.internal.hx.m19916e(r8);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.amv.c(android.view.View):org.json.JSONObject");
    }

    /* renamed from: d */
    private static org.json.JSONObject m27150d(android.view.View r3) {
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
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r3 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ Exception -> 0x001a }
        r3 = com.google.android.gms.internal.fk.m19723d(r3);	 Catch:{ Exception -> 0x001a }
        r1 = "contained_in_scroll_view";	 Catch:{ Exception -> 0x001a }
        r2 = -1;	 Catch:{ Exception -> 0x001a }
        if (r3 == r2) goto L_0x0016;	 Catch:{ Exception -> 0x001a }
    L_0x0014:
        r3 = 1;	 Catch:{ Exception -> 0x001a }
        goto L_0x0017;	 Catch:{ Exception -> 0x001a }
    L_0x0016:
        r3 = 0;	 Catch:{ Exception -> 0x001a }
    L_0x0017:
        r0.put(r1, r3);	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.amv.d(android.view.View):org.json.JSONObject");
    }

    /* renamed from: e */
    private final org.json.JSONObject m27151e(android.view.View r3) {
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
        r2 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r3 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = "can_show_on_lock_screen";	 Catch:{ JSONException -> 0x0023 }
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ JSONException -> 0x0023 }
        r3 = com.google.android.gms.internal.fk.m19721c(r3);	 Catch:{ JSONException -> 0x0023 }
        r0.put(r1, r3);	 Catch:{ JSONException -> 0x0023 }
        r3 = "is_keyguard_locked";	 Catch:{ JSONException -> 0x0023 }
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ JSONException -> 0x0023 }
        r1 = r2.f22998d;	 Catch:{ JSONException -> 0x0023 }
        r1 = com.google.android.gms.internal.fk.m19740l(r1);	 Catch:{ JSONException -> 0x0023 }
        r0.put(r3, r1);	 Catch:{ JSONException -> 0x0023 }
        return r0;
    L_0x0023:
        r3 = "Unable to get lock screen information";
        com.google.android.gms.internal.hx.m19916e(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.amv.e(android.view.View):org.json.JSONObject");
    }

    /* renamed from: a */
    public void mo6848a(View view, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        if (((Boolean) aja.m19221f().m19334a(alo.bO)).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                synchronized (map) {
                    for (Entry value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener(onTouchListener);
                            view2.setClickable(true);
                            view2.setOnClickListener(onClickListener);
                        }
                    }
                }
            }
            if (map2 != null) {
                synchronized (map2) {
                    for (Entry value2 : map2.entrySet()) {
                        View view3 = (View) ((WeakReference) value2.getValue()).get();
                        if (view3 != null) {
                            view3.setOnTouchListener(onTouchListener);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m27153a(Map<String, WeakReference<View>> map) {
        if (this.f23001g.zzjw() != null) {
            if ("2".equals(this.f23001g.zzju())) {
                ar.i().m27289a(this.f22998d, this.f22997c.getAdUnitId(), this.f23001g.zzju(), map.containsKey("2011"));
            } else if ("1".equals(this.f23001g.zzju())) {
                ar.i().m27289a(this.f22998d, this.f22997c.getAdUnitId(), this.f23001g.zzju(), map.containsKey("1009"));
            }
        }
    }

    /* renamed from: a */
    public final boolean m27154a(View view, zzoq zzoq) {
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        View zzjw = this.f23001g.zzjw();
        if (zzjw == null) {
            return false;
        }
        ViewParent parent = zzjw.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(zzjw);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(zzjw, layoutParams);
        this.f22997c.zza(zzoq);
        return true;
    }

    /* renamed from: c */
    public zzanh mo6849c() throws zzanv {
        if (this.f22999e == null || this.f22999e.optJSONObject("overlay") == null) {
            return null;
        }
        kz f = ar.f();
        Context context = this.f22998d;
        zzjn zzf = zzjn.zzf(this.f22998d);
        zzanh a = f.m20026a(context, mb.m20045a(zzf), zzf.zzbek, false, false, this.f23002h, this.f23003i, null, null, null, ahw.m19185a());
        if (a != null) {
            if (a == null) {
                throw null;
            }
            ((View) a).setVisibility(8);
            new amx(a).m19374a(this.f23000f);
        }
        return a;
    }

    @Nullable
    /* renamed from: d */
    public final dd m27156d() {
        if (!ar.z().m19602c(this.f22998d)) {
            return null;
        }
        if (this.f23005k == null) {
            this.f23005k = new dd(this.f22998d, this.f22997c.getAdUnitId());
        }
        return this.f23005k;
    }

    public final Context getContext() {
        return this.f22998d;
    }

    public final void performClick(Bundle bundle) {
        if (bundle == null) {
            hx.m19911b("Click data is null. No click is reported.");
        } else if (m27146a("click_reporting")) {
            m27144a(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, ar.e().m19747a(bundle, null));
        } else {
            hx.m19913c("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        if (m27146a("impression_reporting")) {
            return m27147a(null, null, null, null, ar.e().m19747a(bundle, null));
        }
        hx.m19913c("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return false;
    }

    public final void reportTouchEvent(Bundle bundle) {
        if (bundle == null) {
            hx.m19911b("Touch event data is null. No touch event is reported.");
        } else if (m27146a("touch_reporting")) {
            this.f23002h.m20180a().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        } else {
            hx.m19913c("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public android.view.View zza(android.view.View.OnClickListener r7, boolean r8) {
        /*
        r6 = this;
        r0 = r6.f23001g;
        r0 = r0.zzjv();
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r7 = 0;
        return r7;
    L_0x000a:
        r1 = new android.widget.RelativeLayout$LayoutParams;
        r2 = -2;
        r1.<init>(r2, r2);
        if (r8 != 0) goto L_0x0038;
    L_0x0012:
        r8 = r0.m31444f();
        r2 = 9;
        r3 = 10;
        if (r8 == 0) goto L_0x0032;
    L_0x001c:
        r4 = 12;
        r5 = 11;
        switch(r8) {
            case 2: goto L_0x002e;
            case 3: goto L_0x002a;
            default: goto L_0x0023;
        };
    L_0x0023:
        r1.addRule(r3);
    L_0x0026:
        r1.addRule(r5);
        goto L_0x0038;
    L_0x002a:
        r1.addRule(r4);
        goto L_0x0035;
    L_0x002e:
        r1.addRule(r4);
        goto L_0x0026;
    L_0x0032:
        r1.addRule(r3);
    L_0x0035:
        r1.addRule(r2);
    L_0x0038:
        r8 = new com.google.android.gms.internal.aml;
        r2 = r6.f22998d;
        r8.<init>(r2, r0, r1);
        r8.setOnClickListener(r7);
        r7 = com.google.android.gms.internal.alo.bQ;
        r0 = com.google.android.gms.internal.aja.m19221f();
        r7 = r0.m19334a(r7);
        r7 = (java.lang.CharSequence) r7;
        r8.setContentDescription(r7);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.amv.zza(android.view.View$OnClickListener, boolean):android.view.View");
    }

    public final void zza(android.view.View r4, com.google.android.gms.internal.zzoq r5) {
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
        r5 = r3.m27154a(r4, r5);
        if (r5 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r5 = new android.widget.FrameLayout$LayoutParams;
        r0 = -1;
        r5.<init>(r0, r0);
        r0 = r4;
        r0 = (android.widget.FrameLayout) r0;
        r0.removeAllViews();
        r0 = r3.f23001g;
        r0 = r0 instanceof com.google.android.gms.internal.zzov;
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        return;
    L_0x001a:
        r0 = r3.f23001g;
        r0 = (com.google.android.gms.internal.zzov) r0;
        r1 = r0.getImages();
        if (r1 == 0) goto L_0x006b;
    L_0x0024:
        r1 = r0.getImages();
        r1 = r1.size();
        if (r1 <= 0) goto L_0x006b;
    L_0x002e:
        r0 = r0.getImages();
        r1 = 0;
        r0 = r0.get(r1);
        r1 = r0 instanceof android.os.IBinder;
        if (r1 == 0) goto L_0x0042;
    L_0x003b:
        r0 = (android.os.IBinder) r0;
        r0 = com.google.android.gms.internal.ano.m27158a(r0);
        goto L_0x0043;
    L_0x0042:
        r0 = 0;
    L_0x0043:
        if (r0 == 0) goto L_0x006b;
    L_0x0045:
        r0 = r0.zzjr();	 Catch:{ RemoteException -> 0x0066 }
        if (r0 == 0) goto L_0x0065;	 Catch:{ RemoteException -> 0x0066 }
    L_0x004b:
        r0 = com.google.android.gms.dynamic.C4296b.a(r0);	 Catch:{ RemoteException -> 0x0066 }
        r0 = (android.graphics.drawable.Drawable) r0;	 Catch:{ RemoteException -> 0x0066 }
        r1 = new android.widget.ImageView;	 Catch:{ RemoteException -> 0x0066 }
        r2 = r3.f22998d;	 Catch:{ RemoteException -> 0x0066 }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x0066 }
        r1.setImageDrawable(r0);	 Catch:{ RemoteException -> 0x0066 }
        r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE;	 Catch:{ RemoteException -> 0x0066 }
        r1.setScaleType(r0);	 Catch:{ RemoteException -> 0x0066 }
        r4 = (android.widget.FrameLayout) r4;	 Catch:{ RemoteException -> 0x0066 }
        r4.addView(r1, r5);	 Catch:{ RemoteException -> 0x0066 }
    L_0x0065:
        return;
    L_0x0066:
        r4 = "Could not get drawable from image";
        com.google.android.gms.internal.hx.m19916e(r4);
    L_0x006b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.amv.zza(android.view.View, com.google.android.gms.internal.zzoq):void");
    }

    public final void zza(View view, String str, @Nullable Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        Throwable e;
        JSONObject a = m27143a((Map) map, view2);
        JSONObject c = m27149c(view2);
        JSONObject d = m27150d(view2);
        JSONObject e2 = m27151e(view2);
        JSONObject jSONObject2 = null;
        try {
            JSONObject a2 = ar.e().m19747a(bundle, null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", a2);
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e3) {
                e = e3;
                jSONObject2 = jSONObject3;
                hx.m19912b("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                m27144a(view, c, a, d, e2, str, jSONObject, null);
            }
        } catch (Exception e4) {
            e = e4;
            hx.m19912b("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject2;
            m27144a(view, c, a, d, e2, str, jSONObject, null);
        }
        m27144a(view, c, a, d, e2, str, jSONObject, null);
    }

    public void zza(View view, Map<String, WeakReference<View>> map) {
        m27147a(m27149c(view), m27143a((Map) map, view), m27150d(view), m27151e(view), null);
    }

    public void zza(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        ad.b("performClick must be called on the main UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Entry entry : map.entrySet()) {
                    if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                        zza(view, (String) entry.getKey(), bundle, map, view2);
                        return;
                    }
                }
            }
        }
        if ("2".equals(this.f23001g.zzju())) {
            zza(view, "2099", bundle, map, view2);
            return;
        }
        if ("1".equals(this.f23001g.zzju())) {
            zza(view, "1099", bundle, map, view2);
        }
    }

    public void zzb(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) aja.m19221f().m19334a(alo.bN)).booleanValue()) {
            view.setOnTouchListener(null);
            view.setClickable(false);
            view.setOnClickListener(null);
            if (map != null) {
                synchronized (map) {
                    for (Entry value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener(null);
                            view2.setClickable(false);
                            view2.setOnClickListener(null);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5) {
        /*
        r3 = this;
        r0 = r3.f22996b;
        monitor-enter(r0);
        r1 = r3.f22995a;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x0009:
        r1 = m27145a(r4);	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0014;
    L_0x000f:
        r3.zza(r4, r5);	 Catch:{ all -> 0x005e }
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x0014:
        r1 = com.google.android.gms.internal.alo.bV;	 Catch:{ all -> 0x005e }
        r2 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x005e }
        r1 = r2.m19334a(r1);	 Catch:{ all -> 0x005e }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x005c;
    L_0x0026:
        if (r5 == 0) goto L_0x005c;
    L_0x0028:
        monitor-enter(r5);	 Catch:{ all -> 0x005e }
        r1 = r5.entrySet();	 Catch:{ all -> 0x0059 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0059 }
    L_0x0031:
        r2 = r1.hasNext();	 Catch:{ all -> 0x0059 }
        if (r2 == 0) goto L_0x0057;
    L_0x0037:
        r2 = r1.next();	 Catch:{ all -> 0x0059 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0059 }
        r2 = r2.getValue();	 Catch:{ all -> 0x0059 }
        r2 = (java.lang.ref.WeakReference) r2;	 Catch:{ all -> 0x0059 }
        r2 = r2.get();	 Catch:{ all -> 0x0059 }
        r2 = (android.view.View) r2;	 Catch:{ all -> 0x0059 }
        if (r2 == 0) goto L_0x0031;
    L_0x004b:
        r2 = m27145a(r2);	 Catch:{ all -> 0x0059 }
        if (r2 == 0) goto L_0x0031;
    L_0x0051:
        r3.zza(r4, r5);	 Catch:{ all -> 0x0059 }
        monitor-exit(r5);	 Catch:{ all -> 0x0059 }
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x0057:
        monitor-exit(r5);	 Catch:{ all -> 0x0059 }
        goto L_0x005c;
    L_0x0059:
        r4 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0059 }
        throw r4;	 Catch:{ all -> 0x005e }
    L_0x005c:
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x005e:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.amv.zzc(android.view.View, java.util.Map):void");
    }

    public final void zzd(MotionEvent motionEvent) {
        this.f23002h.m20181a(motionEvent);
    }

    public final void zzi(View view) {
        if (((Boolean) aja.m19221f().m19334a(alo.bt)).booleanValue() && this.f23002h != null) {
            zzcr a = this.f23002h.m20180a();
            if (a != null) {
                a.zzb(view);
            }
        }
    }

    public final void zzk(View view) {
        this.f23006l = new WeakReference(view);
    }

    public boolean zzkc() {
        amk zzjv = this.f23001g.zzjv();
        return zzjv != null && zzjv.m31445g();
    }

    public boolean zzkd() {
        return this.f22999e != null && this.f22999e.optBoolean("allow_pub_owned_ad_view", false);
    }

    public void zzkh() {
        this.f23000f.zzls();
    }

    public void zzki() {
        this.f22997c.zzcv();
    }

    public final View zzkj() {
        return this.f23006l != null ? (View) this.f23006l.get() : null;
    }
}
