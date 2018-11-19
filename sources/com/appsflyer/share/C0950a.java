package com.appsflyer.share;

import com.appsflyer.C0929g;
import com.tinder.api.ManagerWebServices;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appsflyer.share.a */
public class C0950a {
    /* renamed from: a */
    private String f2519a;
    /* renamed from: b */
    private String f2520b;
    /* renamed from: c */
    private String f2521c;
    /* renamed from: d */
    private String f2522d;
    /* renamed from: e */
    private String f2523e;
    /* renamed from: f */
    private String f2524f;
    /* renamed from: g */
    private String f2525g;
    /* renamed from: h */
    private String f2526h;
    /* renamed from: i */
    private String f2527i;
    /* renamed from: j */
    private String f2528j;
    /* renamed from: k */
    private String f2529k;
    /* renamed from: l */
    private Map<String, String> f2530l = new HashMap();
    /* renamed from: m */
    private Map<String, String> f2531m = new HashMap();

    public C0950a(String str) {
        this.f2521c = str;
    }

    /* renamed from: a */
    public C0950a m3248a(String str, String str2) {
        this.f2530l.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public C0950a m3250a(Map<String, String> map) {
        if (map != null) {
            this.f2530l.putAll(map);
        }
        return this;
    }

    /* renamed from: a */
    public C0950a m3249a(String str, String str2, String str3) {
        if (str != null) {
            if (str.length() > 0) {
                this.f2526h = m3245b(str, str2);
                return this;
            }
        }
        this.f2526h = String.format("https://%s/%s", new Object[]{C0929g.m3169b("app.%s"), str3});
        return this;
    }

    /* renamed from: b */
    private String m3245b(String str, String str2) {
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        return String.format("https://%s/%s", new Object[]{str2, str});
    }

    /* renamed from: b */
    private StringBuilder m3246b() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f2526h == null || !this.f2526h.startsWith("http")) {
            stringBuilder.append(C0929g.m3169b("https://app.%s"));
        } else {
            stringBuilder.append(this.f2526h);
        }
        if (this.f2527i != null) {
            stringBuilder.append('/');
            stringBuilder.append(this.f2527i);
        }
        this.f2531m.put("pid", this.f2521c);
        stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
        stringBuilder.append("pid=");
        stringBuilder.append(m3247c(this.f2521c, "media source"));
        if (this.f2522d != null) {
            this.f2531m.put("af_referrer_uid", this.f2522d);
            stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
            stringBuilder.append("af_referrer_uid=");
            stringBuilder.append(m3247c(this.f2522d, "referrerUID"));
        }
        if (this.f2519a != null) {
            this.f2531m.put("af_channel", this.f2519a);
            stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
            stringBuilder.append("af_channel=");
            stringBuilder.append(m3247c(this.f2519a, "channel"));
        }
        if (this.f2523e != null) {
            this.f2531m.put("af_referrer_customer_id", this.f2523e);
            stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
            stringBuilder.append("af_referrer_customer_id=");
            stringBuilder.append(m3247c(this.f2523e, "referrerCustomerId"));
        }
        if (this.f2520b != null) {
            this.f2531m.put("c", this.f2520b);
            stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
            stringBuilder.append("c=");
            stringBuilder.append(m3247c(this.f2520b, ManagerWebServices.PARAM_DISCOUNT_CAMPAIGN));
        }
        if (this.f2524f != null) {
            this.f2531m.put("af_referrer_name", this.f2524f);
            stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
            stringBuilder.append("af_referrer_name=");
            stringBuilder.append(m3247c(this.f2524f, "referrerName"));
        }
        if (this.f2525g != null) {
            this.f2531m.put("af_referrer_image_url", this.f2525g);
            stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
            stringBuilder.append("af_referrer_image_url=");
            stringBuilder.append(m3247c(this.f2525g, "referrerImageURL"));
        }
        if (this.f2529k != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.f2529k);
            stringBuilder2.append(this.f2529k.endsWith("/") ? "" : "/");
            if (this.f2528j != null) {
                stringBuilder2.append(this.f2528j);
            }
            this.f2531m.put("af_dp", stringBuilder2.toString());
            stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
            stringBuilder.append("af_dp=");
            stringBuilder.append(m3247c(this.f2529k, "baseDeeplink"));
            if (this.f2528j != null) {
                stringBuilder.append(this.f2529k.endsWith("/") ? "" : "%2F");
                stringBuilder.append(m3247c(this.f2528j, "deeplinkPath"));
            }
        }
        for (String str : this.f2530l.keySet()) {
            String stringBuilder3 = stringBuilder.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(str);
            stringBuilder4.append("=");
            stringBuilder4.append(m3247c((String) this.f2530l.get(str), str));
            if (!stringBuilder3.contains(stringBuilder4.toString())) {
                stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
                stringBuilder.append(str);
                stringBuilder.append('=');
                stringBuilder.append(m3247c((String) this.f2530l.get(str), str));
            }
        }
        return stringBuilder;
    }

    /* renamed from: c */
    private java.lang.String m3247c(java.lang.String r3, java.lang.String r4) {
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
        r2 = this;
        r0 = "utf8";	 Catch:{ UnsupportedEncodingException -> 0x000a, Throwable -> 0x0007 }
        r0 = java.net.URLEncoder.encode(r3, r0);	 Catch:{ UnsupportedEncodingException -> 0x000a, Throwable -> 0x0007 }
        return r0;
    L_0x0007:
        r3 = "";
        return r3;
    L_0x000a:
        r0 = new java.lang.StringBuilder;
        r1 = "Illegal ";
        r0.<init>(r1);
        r0.append(r4);
        r4 = ": ";
        r0.append(r4);
        r0.append(r3);
        r3 = r0.toString();
        com.appsflyer.AFLogger.m3083d(r3);
        r3 = "";
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.a.c(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public String m3251a() {
        return m3246b().toString();
    }
}
