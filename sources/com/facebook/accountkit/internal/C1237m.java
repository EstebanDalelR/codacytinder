package com.facebook.accountkit.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.accountkit.AccountKitError;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.security.InvalidParameterException;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.accountkit.internal.m */
public final class C1237m {
    /* renamed from: a */
    private final Context f3315a;
    /* renamed from: b */
    private final String f3316b;
    /* renamed from: c */
    private String f3317c = UUID.randomUUID().toString();
    /* renamed from: d */
    private final boolean f3318d;

    C1237m(Context context, String str, boolean z) {
        this.f3315a = context;
        this.f3316b = str;
        this.f3318d = z;
    }

    /* renamed from: a */
    void m4371a(Bundle bundle) {
        bundle.putString("accountkitLoggingRef", this.f3317c);
    }

    /* renamed from: b */
    void m4381b(Bundle bundle) {
        if (bundle != null) {
            this.f3317c = bundle.getString("accountkitLoggingRef");
        } else {
            this.f3317c = UUID.randomUUID().toString();
        }
    }

    /* renamed from: a */
    public void m4372a(String str) {
        new AppEventsLogger(this.f3315a, this.f3316b).m4208a(str, null, null);
    }

    /* renamed from: a */
    public void m4373a(String str, Bundle bundle) {
        new AppEventsLogger(this.f3315a, this.f3316b).m4208a(str, null, bundle);
    }

    /* renamed from: a */
    public void m4379a(String str, String str2, boolean z, JSONObject jSONObject) {
        Bundle c = m4369c();
        c.putString("3_type", str2);
        c.putString("8_view_state", z ? "presented" : "dismissed");
        if (jSONObject != null) {
            c.putString("7_extras", jSONObject.toString());
        }
        new AppEventsLogger(this.f3315a, this.f3316b).m4208a(str, (Double) null, c);
        if (this.f3318d != null) {
            new C1236l(this.f3315a).m4366a(str, c, z);
        }
    }

    /* renamed from: a */
    public void m4378a(String str, String str2, JSONObject jSONObject) {
        Bundle c = m4369c();
        c.putString("3_type", str2);
        c.putString("8_view_state", Property.VISIBLE);
        if (jSONObject != null) {
            c.putString("7_extras", jSONObject.toString());
        }
        new AppEventsLogger(this.f3315a, this.f3316b).m4208a(str, (Double) null, c);
    }

    /* renamed from: a */
    public void m4380a(String str, JSONObject jSONObject) {
        Bundle c = m4369c();
        if (jSONObject != null) {
            c.putString("7_extras", jSONObject.toString());
        }
        new AppEventsLogger(this.f3315a, this.f3316b).m4208a(str, null, c);
    }

    /* renamed from: b */
    public void m4382b(String str, String str2, JSONObject jSONObject) {
        Bundle c = m4369c();
        c.putString("3_type", str2);
        if (jSONObject != null) {
            c.putString("7_extras", jSONObject.toString());
        }
        new AppEventsLogger(this.f3315a, this.f3316b).m4208a(str, (Double) null, c);
    }

    /* renamed from: a */
    public void m4375a(String str, LoginModelImpl loginModelImpl) {
        if (loginModelImpl != null) {
            Bundle c = m4369c();
            if (loginModelImpl instanceof PhoneLoginModelImpl) {
                c.putString("3_type", "phone");
                c.putString("9_country_code", ((PhoneLoginModelImpl) loginModelImpl).getPhoneNumber().getCountryCodeIso());
            } else if (loginModelImpl instanceof EmailLoginModelImpl) {
                c.putString("3_type", "email");
            } else {
                throw new InvalidParameterException("Unexpected loginModel type");
            }
            c.putString("2_state", loginModelImpl.getStatus().toString());
            AccountKitError error = loginModelImpl.getError();
            if (error != null) {
                c.putString("5_error_code", Integer.toString(error.getErrorType().getCode()));
                c.putString("6_error_message", error.getErrorType().getMessage());
            }
            new AppEventsLogger(this.f3315a, this.f3316b).m4208a(str, null, c);
            if (this.f3318d) {
                C1236l c1236l;
                if (!str.equals("ak_seamless_pending")) {
                    if (!str.equals("ak_fetch_seamless_login_token")) {
                        if (str.equals("ak_login_verify") || str.equals("ak_login_complete")) {
                            c.putString("10_verification_method", "confirmation_code");
                        }
                        c1236l = new C1236l(this.f3315a);
                        if (str.equals("ak_login_complete") && (loginModelImpl instanceof EmailLoginModelImpl) != null) {
                            c1236l.m4367a("ak_login_verify", null, c);
                        }
                        c1236l.m4367a(str, null, c);
                    }
                }
                c.putString("10_verification_method", "instant_verification");
                c1236l = new C1236l(this.f3315a);
                c1236l.m4367a("ak_login_verify", null, c);
                c1236l.m4367a(str, null, c);
            }
        }
    }

    /* renamed from: a */
    public void m4377a(String str, String str2) {
        m4368a(str, str2, null);
    }

    /* renamed from: a */
    public void m4374a(String str, InternalAccountKitError internalAccountKitError) {
        m4368a(str, "error", internalAccountKitError);
    }

    /* renamed from: a */
    void m4376a(String str, PhoneUpdateModelImpl phoneUpdateModelImpl) {
        if (phoneUpdateModelImpl != null) {
            Bundle c = m4369c();
            c.putString("3_type", "phone_update");
            c.putString("9_country_code", phoneUpdateModelImpl.getPhoneNumber().getCountryCodeIso());
            c.putString("2_state", phoneUpdateModelImpl.getStatus().toString());
            phoneUpdateModelImpl = phoneUpdateModelImpl.getError();
            if (phoneUpdateModelImpl != null) {
                c.putString("5_error_code", Integer.toString(phoneUpdateModelImpl.getErrorType().getCode()));
                c.putString("6_error_message", phoneUpdateModelImpl.getErrorType().getMessage());
            }
            new AppEventsLogger(this.f3315a, this.f3316b).m4208a(str, null, c);
        }
    }

    /* renamed from: a */
    private void m4368a(java.lang.String r3, java.lang.String r4, com.facebook.accountkit.internal.InternalAccountKitError r5) {
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
        r1 = "fetch_status";	 Catch:{ JSONException -> 0x000a }
        r0.put(r1, r4);	 Catch:{ JSONException -> 0x000a }
    L_0x000a:
        r4 = r2.m4369c();
        r1 = "7_extras";
        r0 = r0.toString();
        r4.putString(r1, r0);
        if (r5 == 0) goto L_0x002f;
    L_0x0019:
        r0 = "5_error_code";
        r1 = r5.getCode();
        r1 = java.lang.Integer.toString(r1);
        r4.putString(r0, r1);
        r0 = "6_error_message";
        r5 = r5.getMessage();
        r4.putString(r0, r5);
    L_0x002f:
        r5 = new com.facebook.accountkit.internal.AppEventsLogger;
        r0 = r2.f3315a;
        r1 = r2.f3316b;
        r5.<init>(r0, r1);
        r0 = 0;
        r5.m4208a(r3, r0, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.m.a(java.lang.String, java.lang.String, com.facebook.accountkit.internal.InternalAccountKitError):void");
    }

    /* renamed from: a */
    String m4370a() {
        return this.f3317c;
    }

    /* renamed from: b */
    public boolean m4383b() {
        return this.f3318d && C1236l.m4365a();
    }

    /* renamed from: c */
    private Bundle m4369c() {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_logger_ref", this.f3317c == null ? "" : this.f3317c);
        bundle.putString("2_state", "");
        bundle.putString("3_type", "");
        bundle.putString("4_result", "");
        bundle.putString("6_error_message", "");
        bundle.putString("8_view_state", "");
        bundle.putString("5_error_code", "");
        bundle.putString("11_sdk", "Android");
        bundle.putString("7_extras", "");
        return bundle;
    }
}
