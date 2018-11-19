package com.facebook.ads.internal.adapters;

import com.tinder.api.ManagerWebServices;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.c */
public class C1353c implements Serializable {
    private static final long serialVersionUID = 85021702336014823L;
    /* renamed from: a */
    private final String f3630a;
    /* renamed from: b */
    private final String f3631b;
    /* renamed from: c */
    private final String f3632c;
    /* renamed from: d */
    private final String f3633d;
    /* renamed from: e */
    private final String f3634e;
    /* renamed from: f */
    private final String f3635f;
    /* renamed from: g */
    private final int f3636g;
    /* renamed from: h */
    private final int f3637h;
    /* renamed from: i */
    private final String f3638i;
    /* renamed from: j */
    private final boolean f3639j;
    /* renamed from: k */
    private final int f3640k;

    private C1353c(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, boolean z, int i3) {
        this.f3630a = str;
        this.f3631b = str2;
        this.f3632c = str3;
        this.f3633d = str4;
        this.f3634e = str5;
        this.f3635f = str6;
        this.f3636g = i;
        this.f3637h = i2;
        this.f3638i = str7;
        this.f3639j = z;
        this.f3640k = i3;
    }

    /* renamed from: a */
    static C1353c m4734a(JSONObject jSONObject) {
        int parseInt;
        int parseInt2;
        String optString = jSONObject.optString(ManagerWebServices.PARAM_JOB_TITLE);
        String optString2 = jSONObject.optString("subtitle");
        String optString3 = jSONObject.optString("body");
        String optString4 = jSONObject.optString("call_to_action");
        if (ManagerWebServices.NULL_STRING_VALUE.equalsIgnoreCase(optString4)) {
            optString4 = "";
        }
        String str = optString4;
        optString4 = jSONObject.optString("fbad_command");
        if (ManagerWebServices.NULL_STRING_VALUE.equalsIgnoreCase(optString4)) {
            optString4 = "";
        }
        String str2 = optString4;
        optString4 = "";
        JSONObject optJSONObject = jSONObject.optJSONObject(ManagerWebServices.IG_PARAM_IMAGE);
        if (optJSONObject != null) {
            optString4 = optJSONObject.optString("url");
            parseInt = Integer.parseInt(optJSONObject.optString("width"));
            parseInt2 = Integer.parseInt(optJSONObject.optString("height"));
        } else {
            parseInt = 0;
            parseInt2 = 0;
        }
        String optString5 = jSONObject.optString("video_url");
        boolean optBoolean = jSONObject.optBoolean("video_autoplay_enabled");
        return new C1353c(optString, optString2, optString3, str, str2, optString4, parseInt, parseInt2, optString5, optBoolean, optBoolean ? jSONObject.optInt("unskippable_seconds", 0) : 0);
    }

    /* renamed from: a */
    public String m4735a() {
        return this.f3630a;
    }

    /* renamed from: b */
    public String m4736b() {
        return this.f3631b;
    }

    /* renamed from: c */
    public String m4737c() {
        return this.f3632c;
    }

    /* renamed from: d */
    public String m4738d() {
        return this.f3633d;
    }

    /* renamed from: e */
    public String m4739e() {
        return this.f3634e;
    }

    /* renamed from: f */
    public String m4740f() {
        return this.f3635f;
    }

    /* renamed from: g */
    public int m4741g() {
        return this.f3636g;
    }

    /* renamed from: h */
    public int m4742h() {
        return this.f3637h;
    }

    /* renamed from: i */
    public String m4743i() {
        return this.f3638i;
    }

    /* renamed from: j */
    public boolean m4744j() {
        return this.f3639j;
    }

    /* renamed from: k */
    public int m4745k() {
        return this.f3640k;
    }
}
