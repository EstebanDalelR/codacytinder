package io.branch.referral;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;

/* renamed from: io.branch.referral.k */
class C15591k {
    /* renamed from: q */
    private static C15591k f48236q;
    /* renamed from: a */
    private final String f48237a;
    /* renamed from: b */
    private final boolean f48238b;
    /* renamed from: c */
    private final String f48239c;
    /* renamed from: d */
    private final String f48240d;
    /* renamed from: e */
    private final int f48241e;
    /* renamed from: f */
    private final int f48242f;
    /* renamed from: g */
    private final int f48243g;
    /* renamed from: h */
    private final boolean f48244h;
    /* renamed from: i */
    private final String f48245i;
    /* renamed from: j */
    private final String f48246j;
    /* renamed from: k */
    private final int f48247k;
    /* renamed from: l */
    private final String f48248l;
    /* renamed from: m */
    private final String f48249m;
    /* renamed from: n */
    private final String f48250n;
    /* renamed from: o */
    private final String f48251o;
    /* renamed from: p */
    private final String f48252p;

    /* renamed from: a */
    public static C15591k m58373a(boolean z, aa aaVar, boolean z2) {
        if (f48236q == null) {
            f48236q = new C15591k(z, aaVar, z2);
        }
        return f48236q;
    }

    /* renamed from: a */
    public static C15591k m58372a() {
        return f48236q;
    }

    private C15591k(boolean z, aa aaVar, boolean z2) {
        if (z2) {
            this.f48237a = aaVar.m58292a(true);
        } else {
            this.f48237a = aaVar.m58292a(z);
        }
        this.f48238b = aaVar.m58293a();
        this.f48239c = aaVar.m58299f();
        this.f48240d = aaVar.m58300g();
        z = aaVar.m58305l();
        this.f48241e = z.densityDpi;
        this.f48242f = z.heightPixels;
        this.f48243g = z.widthPixels;
        this.f48244h = aaVar.m58306m();
        this.f48245i = aa.m58290n();
        this.f48246j = aaVar.m58303j();
        this.f48247k = aaVar.m58304k();
        this.f48249m = aaVar.m58295b();
        this.f48250n = aaVar.m58298e();
        this.f48251o = aaVar.m58301h();
        this.f48252p = aaVar.m58302i();
        this.f48248l = aaVar.m58307o();
    }

    /* renamed from: a */
    public void m58376a(org.json.JSONObject r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f48237a;	 Catch:{ JSONException -> 0x00da }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x00da }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x0020;	 Catch:{ JSONException -> 0x00da }
    L_0x000a:
        r0 = io.branch.referral.Defines.Jsonkey.HardwareID;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48237a;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = io.branch.referral.Defines.Jsonkey.IsHardwareIDReal;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48238b;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x0020:
        r0 = r2.f48239c;	 Catch:{ JSONException -> 0x00da }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x00da }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x0035;	 Catch:{ JSONException -> 0x00da }
    L_0x002a:
        r0 = io.branch.referral.Defines.Jsonkey.Brand;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48239c;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x0035:
        r0 = r2.f48240d;	 Catch:{ JSONException -> 0x00da }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x00da }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x004a;	 Catch:{ JSONException -> 0x00da }
    L_0x003f:
        r0 = io.branch.referral.Defines.Jsonkey.Model;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48240d;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x004a:
        r0 = io.branch.referral.Defines.Jsonkey.ScreenDpi;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48241e;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = io.branch.referral.Defines.Jsonkey.ScreenHeight;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48242f;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = io.branch.referral.Defines.Jsonkey.ScreenWidth;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48243g;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = io.branch.referral.Defines.Jsonkey.WiFi;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48244h;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = io.branch.referral.Defines.Jsonkey.UIMode;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48248l;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = r2.f48246j;	 Catch:{ JSONException -> 0x00da }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x00da }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x0096;	 Catch:{ JSONException -> 0x00da }
    L_0x008b:
        r0 = io.branch.referral.Defines.Jsonkey.OS;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48246j;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x0096:
        r0 = io.branch.referral.Defines.Jsonkey.OSVersion;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48247k;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = r2.f48251o;	 Catch:{ JSONException -> 0x00da }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x00b4;	 Catch:{ JSONException -> 0x00da }
    L_0x00a9:
        r0 = io.branch.referral.Defines.Jsonkey.Country;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48251o;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x00b4:
        r0 = r2.f48252p;	 Catch:{ JSONException -> 0x00da }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x00c7;	 Catch:{ JSONException -> 0x00da }
    L_0x00bc:
        r0 = io.branch.referral.Defines.Jsonkey.Language;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48252p;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x00c7:
        r0 = r2.f48245i;	 Catch:{ JSONException -> 0x00da }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x00da;	 Catch:{ JSONException -> 0x00da }
    L_0x00cf:
        r0 = io.branch.referral.Defines.Jsonkey.LocalIP;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f48245i;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x00da:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.k.a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public void m58375a(android.content.Context r3, io.branch.referral.C15593m r4, org.json.JSONObject r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f48237a;	 Catch:{ JSONException -> 0x0132 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x001a;	 Catch:{ JSONException -> 0x0132 }
    L_0x000a:
        r0 = r2.f48238b;	 Catch:{ JSONException -> 0x0132 }
        if (r0 == 0) goto L_0x001a;	 Catch:{ JSONException -> 0x0132 }
    L_0x000e:
        r0 = io.branch.referral.Defines.Jsonkey.AndroidID;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f48237a;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
        goto L_0x0024;	 Catch:{ JSONException -> 0x0132 }
    L_0x001a:
        r0 = io.branch.referral.Defines.Jsonkey.UnidentifiedDevice;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = 1;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x0024:
        r0 = r2.f48239c;	 Catch:{ JSONException -> 0x0132 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x0039;	 Catch:{ JSONException -> 0x0132 }
    L_0x002e:
        r0 = io.branch.referral.Defines.Jsonkey.Brand;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f48239c;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x0039:
        r0 = r2.f48240d;	 Catch:{ JSONException -> 0x0132 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x004e;	 Catch:{ JSONException -> 0x0132 }
    L_0x0043:
        r0 = io.branch.referral.Defines.Jsonkey.Model;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f48240d;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x004e:
        r0 = io.branch.referral.Defines.Jsonkey.ScreenDpi;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f48241e;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
        r0 = io.branch.referral.Defines.Jsonkey.ScreenHeight;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f48242f;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
        r0 = io.branch.referral.Defines.Jsonkey.ScreenWidth;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f48243g;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
        r0 = r2.f48246j;	 Catch:{ JSONException -> 0x0132 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x0084;	 Catch:{ JSONException -> 0x0132 }
    L_0x0079:
        r0 = io.branch.referral.Defines.Jsonkey.OS;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f48246j;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x0084:
        r0 = io.branch.referral.Defines.Jsonkey.OSVersion;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f48247k;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
        r0 = r2.f48251o;	 Catch:{ JSONException -> 0x0132 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x00a2;	 Catch:{ JSONException -> 0x0132 }
    L_0x0097:
        r0 = io.branch.referral.Defines.Jsonkey.Country;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f48251o;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x00a2:
        r0 = r2.f48252p;	 Catch:{ JSONException -> 0x0132 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x00b5;	 Catch:{ JSONException -> 0x0132 }
    L_0x00aa:
        r0 = io.branch.referral.Defines.Jsonkey.Language;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f48252p;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x00b5:
        r0 = r2.f48245i;	 Catch:{ JSONException -> 0x0132 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x00c8;	 Catch:{ JSONException -> 0x0132 }
    L_0x00bd:
        r0 = io.branch.referral.Defines.Jsonkey.LocalIP;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f48245i;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x00c8:
        if (r4 == 0) goto L_0x00e3;	 Catch:{ JSONException -> 0x0132 }
    L_0x00ca:
        r0 = r4.m58427g();	 Catch:{ JSONException -> 0x0132 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x00e3;	 Catch:{ JSONException -> 0x0132 }
    L_0x00d6:
        r0 = io.branch.referral.Defines.Jsonkey.DeviceFingerprintID;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r1 = r4.m58427g();	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x00e3:
        r0 = r4.m58433j();	 Catch:{ JSONException -> 0x0132 }
        if (r0 == 0) goto L_0x00fe;	 Catch:{ JSONException -> 0x0132 }
    L_0x00e9:
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x00fe;	 Catch:{ JSONException -> 0x0132 }
    L_0x00f1:
        r0 = io.branch.referral.Defines.Jsonkey.DeveloperIdentity;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.getKey();	 Catch:{ JSONException -> 0x0132 }
        r4 = r4.m58433j();	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r4);	 Catch:{ JSONException -> 0x0132 }
    L_0x00fe:
        r4 = io.branch.referral.Defines.Jsonkey.AppVersion;	 Catch:{ JSONException -> 0x0132 }
        r4 = r4.getKey();	 Catch:{ JSONException -> 0x0132 }
        r0 = io.branch.referral.C15591k.m58372a();	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m58377b();	 Catch:{ JSONException -> 0x0132 }
        r5.put(r4, r0);	 Catch:{ JSONException -> 0x0132 }
        r4 = io.branch.referral.Defines.Jsonkey.SDK;	 Catch:{ JSONException -> 0x0132 }
        r4 = r4.getKey();	 Catch:{ JSONException -> 0x0132 }
        r0 = "android";	 Catch:{ JSONException -> 0x0132 }
        r5.put(r4, r0);	 Catch:{ JSONException -> 0x0132 }
        r4 = io.branch.referral.Defines.Jsonkey.SdkVersion;	 Catch:{ JSONException -> 0x0132 }
        r4 = r4.getKey();	 Catch:{ JSONException -> 0x0132 }
        r0 = "2.17.1";	 Catch:{ JSONException -> 0x0132 }
        r5.put(r4, r0);	 Catch:{ JSONException -> 0x0132 }
        r4 = io.branch.referral.Defines.Jsonkey.UserAgent;	 Catch:{ JSONException -> 0x0132 }
        r4 = r4.getKey();	 Catch:{ JSONException -> 0x0132 }
        r3 = r2.m58374a(r3);	 Catch:{ JSONException -> 0x0132 }
        r5.put(r4, r3);	 Catch:{ JSONException -> 0x0132 }
    L_0x0132:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.k.a(android.content.Context, io.branch.referral.m, org.json.JSONObject):void");
    }

    /* renamed from: b */
    public String m58377b() {
        return this.f48250n;
    }

    /* renamed from: c */
    public boolean m58378c() {
        return this.f48238b;
    }

    /* renamed from: d */
    public String m58379d() {
        return this.f48237a.equals("bnc_no_value") ? null : this.f48237a;
    }

    /* renamed from: e */
    public String m58380e() {
        return this.f48246j;
    }

    /* renamed from: a */
    private String m58374a(Context context) {
        return VERSION.SDK_INT >= 17 ? WebSettings.getDefaultUserAgent(context) : "";
    }
}
