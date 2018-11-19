package com.facebook.ads.internal.p040g;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.g.b */
public class C1406b {
    /* renamed from: a */
    public String f3855a;
    /* renamed from: b */
    public String f3856b;
    /* renamed from: c */
    public String f3857c;
    /* renamed from: d */
    public Date f3858d;
    /* renamed from: e */
    public boolean f3859e;

    public C1406b(String str, String str2, String str3, Date date) {
        this.f3855a = str;
        this.f3856b = str2;
        this.f3857c = str3;
        this.f3858d = date;
        boolean z = (str2 == null || str3 == null) ? false : true;
        this.f3859e = z;
    }

    public C1406b(JSONObject jSONObject) {
        this(jSONObject.optString("url"), jSONObject.optString("key"), jSONObject.optString("value"), new Date(jSONObject.optLong("expiration") * 1000));
    }

    /* renamed from: a */
    public static java.util.List<com.facebook.ads.internal.p040g.C1406b> m4891a(java.lang.String r5) {
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
        r0 = 0;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x000a }
        r1.<init>(r5);	 Catch:{ JSONException -> 0x000a }
        goto L_0x000b;
    L_0x000a:
        r1 = r0;
    L_0x000b:
        if (r1 != 0) goto L_0x000e;
    L_0x000d:
        return r0;
    L_0x000e:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r2 = 0;
    L_0x0014:
        r3 = r1.length();
        if (r2 >= r3) goto L_0x002f;
    L_0x001a:
        r3 = r1.getJSONObject(r2);	 Catch:{ JSONException -> 0x001f }
        goto L_0x0020;
    L_0x001f:
        r3 = r0;
    L_0x0020:
        if (r3 == 0) goto L_0x002c;
    L_0x0022:
        r4 = new com.facebook.ads.internal.g.b;
        r4.<init>(r3);
        if (r4 == 0) goto L_0x002c;
    L_0x0029:
        r5.add(r4);
    L_0x002c:
        r2 = r2 + 1;
        goto L_0x0014;
    L_0x002f:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.g.b.a(java.lang.String):java.util.List<com.facebook.ads.internal.g.b>");
    }

    /* renamed from: a */
    public String m4892a() {
        Date date = this.f3858d;
        if (date == null) {
            date = new Date();
            date.setTime(date.getTime() + 3600000);
        }
        DateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss zzz");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }

    /* renamed from: b */
    public boolean m4893b() {
        return (this.f3856b == null || this.f3857c == null || this.f3855a == null) ? false : true;
    }
}
