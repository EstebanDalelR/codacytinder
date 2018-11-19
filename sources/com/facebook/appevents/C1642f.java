package com.facebook.appevents;

import android.content.Context;
import com.facebook.GraphRequest;
import com.facebook.ads.AdError;
import com.facebook.internal.C1701b;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.facebook.appevents.f */
class C1642f {
    /* renamed from: a */
    private List<AppEvent> f4533a = new ArrayList();
    /* renamed from: b */
    private List<AppEvent> f4534b = new ArrayList();
    /* renamed from: c */
    private int f4535c;
    /* renamed from: d */
    private C1701b f4536d;
    /* renamed from: e */
    private String f4537e;
    /* renamed from: f */
    private final int f4538f = AdError.NETWORK_ERROR_CODE;

    public C1642f(C1701b c1701b, String str) {
        this.f4536d = c1701b;
        this.f4537e = str;
    }

    /* renamed from: a */
    public synchronized void m5576a(AppEvent appEvent) {
        if (this.f4533a.size() + this.f4534b.size() >= AdError.NETWORK_ERROR_CODE) {
            this.f4535c++;
        } else {
            this.f4533a.add(appEvent);
        }
    }

    /* renamed from: a */
    public synchronized int m5574a() {
        return this.f4533a.size();
    }

    /* renamed from: a */
    public synchronized void m5577a(boolean z) {
        if (z) {
            this.f4533a.addAll(this.f4534b);
        }
        this.f4534b.clear();
        this.f4535c = false;
    }

    /* renamed from: a */
    public int m5575a(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.f4535c;
            this.f4534b.addAll(this.f4533a);
            this.f4533a.clear();
            JSONArray jSONArray = new JSONArray();
            for (AppEvent appEvent : this.f4534b) {
                if (!appEvent.m5519d()) {
                    Utility.m5793b("Event with invalid checksum: %s", appEvent.toString());
                } else if (z || !appEvent.m5517b()) {
                    jSONArray.put(appEvent.m5518c());
                }
            }
            if (jSONArray.length()) {
                m5572a(graphRequest, context, i, jSONArray, z2);
                return jSONArray.length();
            }
            return null;
        }
    }

    /* renamed from: b */
    public synchronized List<AppEvent> m5578b() {
        List<AppEvent> list;
        list = this.f4533a;
        this.f4533a = new ArrayList();
        return list;
    }

    /* renamed from: a */
    private void m5572a(com.facebook.GraphRequest r4, android.content.Context r5, int r6, org.json.JSONArray r7, boolean r8) {
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
        r0 = com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS;	 Catch:{ JSONException -> 0x0014 }
        r1 = r3.f4536d;	 Catch:{ JSONException -> 0x0014 }
        r2 = r3.f4537e;	 Catch:{ JSONException -> 0x0014 }
        r5 = com.facebook.appevents.internal.AppEventsLoggerUtility.m5579a(r0, r1, r2, r8, r5);	 Catch:{ JSONException -> 0x0014 }
        r8 = r3.f4535c;	 Catch:{ JSONException -> 0x0014 }
        if (r8 <= 0) goto L_0x0019;	 Catch:{ JSONException -> 0x0014 }
    L_0x000e:
        r8 = "num_skipped_events";	 Catch:{ JSONException -> 0x0014 }
        r5.put(r8, r6);	 Catch:{ JSONException -> 0x0014 }
        goto L_0x0019;
    L_0x0014:
        r5 = new org.json.JSONObject;
        r5.<init>();
    L_0x0019:
        r4.m4056a(r5);
        r5 = r4.m4061e();
        if (r5 != 0) goto L_0x0027;
    L_0x0022:
        r5 = new android.os.Bundle;
        r5.<init>();
    L_0x0027:
        r6 = r7.toString();
        if (r6 == 0) goto L_0x0039;
    L_0x002d:
        r7 = "custom_events_file";
        r8 = r3.m5573a(r6);
        r5.putByteArray(r7, r8);
        r4.m4054a(r6);
    L_0x0039:
        r4.m4051a(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.f.a(com.facebook.GraphRequest, android.content.Context, int, org.json.JSONArray, boolean):void");
    }

    /* renamed from: a */
    private byte[] m5573a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Exception e) {
            Utility.m5777a("Encoding exception: ", e);
            return null;
        }
    }
}
