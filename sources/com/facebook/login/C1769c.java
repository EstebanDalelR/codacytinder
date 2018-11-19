package com.facebook.login;

import android.os.Bundle;
import com.facebook.appevents.AppEventsLogger;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.login.c */
class C1769c {
    /* renamed from: a */
    private final AppEventsLogger f4849a;
    /* renamed from: b */
    private String f4850b;
    /* renamed from: c */
    private String f4851c;

    C1769c(android.content.Context r2, java.lang.String r3) {
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
        r1 = this;
        r1.<init>();
        r1.f4850b = r3;
        r3 = com.facebook.appevents.AppEventsLogger.m5528b(r2, r3);
        r1.f4849a = r3;
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x001e }
        if (r2 == 0) goto L_0x001e;	 Catch:{ NameNotFoundException -> 0x001e }
    L_0x0011:
        r3 = "com.facebook.katana";	 Catch:{ NameNotFoundException -> 0x001e }
        r0 = 0;	 Catch:{ NameNotFoundException -> 0x001e }
        r2 = r2.getPackageInfo(r3, r0);	 Catch:{ NameNotFoundException -> 0x001e }
        if (r2 == 0) goto L_0x001e;	 Catch:{ NameNotFoundException -> 0x001e }
    L_0x001a:
        r2 = r2.versionName;	 Catch:{ NameNotFoundException -> 0x001e }
        r1.f4851c = r2;	 Catch:{ NameNotFoundException -> 0x001e }
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.c.<init>(android.content.Context, java.lang.String):void");
    }

    /* renamed from: a */
    public String m6102a() {
        return this.f4850b;
    }

    /* renamed from: a */
    static Bundle m6101a(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    /* renamed from: a */
    public void m6103a(com.facebook.login.LoginClient.Request r6) {
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
        r5 = this;
        r0 = r6.getAuthId();
        r0 = com.facebook.login.C1769c.m6101a(r0);
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x005c }
        r1.<init>();	 Catch:{ JSONException -> 0x005c }
        r2 = "login_behavior";	 Catch:{ JSONException -> 0x005c }
        r3 = r6.getLoginBehavior();	 Catch:{ JSONException -> 0x005c }
        r3 = r3.toString();	 Catch:{ JSONException -> 0x005c }
        r1.put(r2, r3);	 Catch:{ JSONException -> 0x005c }
        r2 = "request_code";	 Catch:{ JSONException -> 0x005c }
        r3 = com.facebook.login.LoginClient.getLoginRequestCode();	 Catch:{ JSONException -> 0x005c }
        r1.put(r2, r3);	 Catch:{ JSONException -> 0x005c }
        r2 = "permissions";	 Catch:{ JSONException -> 0x005c }
        r3 = ",";	 Catch:{ JSONException -> 0x005c }
        r4 = r6.getPermissions();	 Catch:{ JSONException -> 0x005c }
        r3 = android.text.TextUtils.join(r3, r4);	 Catch:{ JSONException -> 0x005c }
        r1.put(r2, r3);	 Catch:{ JSONException -> 0x005c }
        r2 = "default_audience";	 Catch:{ JSONException -> 0x005c }
        r3 = r6.getDefaultAudience();	 Catch:{ JSONException -> 0x005c }
        r3 = r3.toString();	 Catch:{ JSONException -> 0x005c }
        r1.put(r2, r3);	 Catch:{ JSONException -> 0x005c }
        r2 = "isReauthorize";	 Catch:{ JSONException -> 0x005c }
        r6 = r6.isRerequest();	 Catch:{ JSONException -> 0x005c }
        r1.put(r2, r6);	 Catch:{ JSONException -> 0x005c }
        r6 = r5.f4851c;	 Catch:{ JSONException -> 0x005c }
        if (r6 == 0) goto L_0x0053;	 Catch:{ JSONException -> 0x005c }
    L_0x004c:
        r6 = "facebookVersion";	 Catch:{ JSONException -> 0x005c }
        r2 = r5.f4851c;	 Catch:{ JSONException -> 0x005c }
        r1.put(r6, r2);	 Catch:{ JSONException -> 0x005c }
    L_0x0053:
        r6 = "6_extras";	 Catch:{ JSONException -> 0x005c }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x005c }
        r0.putString(r6, r1);	 Catch:{ JSONException -> 0x005c }
    L_0x005c:
        r6 = r5.f4849a;
        r1 = "fb_mobile_login_start";
        r2 = 0;
        r6.logSdkEvent(r1, r2, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.c.a(com.facebook.login.LoginClient$Request):void");
    }

    /* renamed from: a */
    public void m6107a(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3, com.facebook.login.LoginClient.Result.Code r4, java.util.Map<java.lang.String, java.lang.String> r5, java.lang.Exception r6) {
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
        r1 = this;
        r2 = com.facebook.login.C1769c.m6101a(r2);
        if (r4 == 0) goto L_0x000f;
    L_0x0006:
        r0 = "2_result";
        r4 = r4.getLoggingValue();
        r2.putString(r0, r4);
    L_0x000f:
        if (r6 == 0) goto L_0x0020;
    L_0x0011:
        r4 = r6.getMessage();
        if (r4 == 0) goto L_0x0020;
    L_0x0017:
        r4 = "5_error_message";
        r6 = r6.getMessage();
        r2.putString(r4, r6);
    L_0x0020:
        r4 = r3.isEmpty();
        r6 = 0;
        if (r4 != 0) goto L_0x002d;
    L_0x0027:
        r4 = new org.json.JSONObject;
        r4.<init>(r3);
        goto L_0x002e;
    L_0x002d:
        r4 = r6;
    L_0x002e:
        if (r5 == 0) goto L_0x005a;
    L_0x0030:
        if (r4 != 0) goto L_0x0038;
    L_0x0032:
        r3 = new org.json.JSONObject;
        r3.<init>();
        r4 = r3;
    L_0x0038:
        r3 = r5.entrySet();	 Catch:{ JSONException -> 0x005a }
        r3 = r3.iterator();	 Catch:{ JSONException -> 0x005a }
    L_0x0040:
        r5 = r3.hasNext();	 Catch:{ JSONException -> 0x005a }
        if (r5 == 0) goto L_0x005a;	 Catch:{ JSONException -> 0x005a }
    L_0x0046:
        r5 = r3.next();	 Catch:{ JSONException -> 0x005a }
        r5 = (java.util.Map.Entry) r5;	 Catch:{ JSONException -> 0x005a }
        r0 = r5.getKey();	 Catch:{ JSONException -> 0x005a }
        r0 = (java.lang.String) r0;	 Catch:{ JSONException -> 0x005a }
        r5 = r5.getValue();	 Catch:{ JSONException -> 0x005a }
        r4.put(r0, r5);	 Catch:{ JSONException -> 0x005a }
        goto L_0x0040;
    L_0x005a:
        if (r4 == 0) goto L_0x0065;
    L_0x005c:
        r3 = "6_extras";
        r4 = r4.toString();
        r2.putString(r3, r4);
    L_0x0065:
        r3 = r1.f4849a;
        r4 = "fb_mobile_login_complete";
        r3.logSdkEvent(r4, r6, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.c.a(java.lang.String, java.util.Map, com.facebook.login.LoginClient$Result$Code, java.util.Map, java.lang.Exception):void");
    }

    /* renamed from: a */
    public void m6104a(String str, String str2) {
        str = C1769c.m6101a(str);
        str.putString("3_method", str2);
        this.f4849a.logSdkEvent("fb_mobile_login_method_start", null, str);
    }

    /* renamed from: a */
    public void m6106a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        str = C1769c.m6101a(str);
        if (str3 != null) {
            str.putString("2_result", str3);
        }
        if (str4 != null) {
            str.putString("5_error_message", str4);
        }
        if (str5 != null) {
            str.putString("4_error_code", str5);
        }
        if (map != null && map.isEmpty() == null) {
            str.putString("6_extras", new JSONObject(map).toString());
        }
        str.putString("3_method", str2);
        this.f4849a.logSdkEvent("fb_mobile_login_method_complete", null, str);
    }

    /* renamed from: b */
    public void m6108b(String str, String str2) {
        str = C1769c.m6101a(str);
        str.putString("3_method", str2);
        this.f4849a.logSdkEvent("fb_mobile_login_method_not_tried", null, str);
    }

    /* renamed from: c */
    public void m6109c(String str, String str2) {
        m6105a(str, str2, "");
    }

    /* renamed from: a */
    public void m6105a(String str, String str2, String str3) {
        Bundle a = C1769c.m6101a("");
        a.putString("2_result", Code.ERROR.getLoggingValue());
        a.putString("5_error_message", str2);
        a.putString("3_method", str3);
        this.f4849a.logSdkEvent(str, null, a);
    }
}
