package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public final class zzaey extends zzbfm {
    public static final Creator<zzaey> CREATOR = new da();
    public final String zzcwp;
    public final String zzcwq;
    public final boolean zzcwr;
    public final boolean zzcws;
    public final List<String> zzcwt;
    public final boolean zzcwu;
    public final boolean zzcwv;

    public zzaey(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4) {
        this.zzcwp = str;
        this.zzcwq = str2;
        this.zzcwr = z;
        this.zzcws = z2;
        this.zzcwt = list;
        this.zzcwu = z3;
        this.zzcwv = z4;
    }

    @Nullable
    public static zzaey zzo(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("click_string", "");
        String optString2 = jSONObject.optString("report_url", "");
        boolean optBoolean = jSONObject.optBoolean("rendered_ad_enabled", false);
        boolean optBoolean2 = jSONObject.optBoolean("non_malicious_reporting_enabled", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("allowed_headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        List arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            Object optString3 = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString3)) {
                arrayList.add(optString3.toLowerCase(Locale.ENGLISH));
            }
        }
        return new zzaey(optString, optString2, optBoolean, optBoolean2, arrayList, jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20098a(parcel, 2, this.zzcwp, false);
        oj.m20098a(parcel, 3, this.zzcwq, false);
        oj.m20101a(parcel, 4, this.zzcwr);
        oj.m20101a(parcel, 5, this.zzcws);
        oj.m20110b(parcel, 6, this.zzcwt, false);
        oj.m20101a(parcel, 7, this.zzcwu);
        oj.m20101a(parcel, 8, this.zzcwv);
        oj.m20088a(parcel, i);
    }
}
