package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@zzzv
public final class zzaaz extends zzbfm {
    public static final Creator<zzaaz> CREATOR = new C4478v();
    public final boolean zzcpw;
    @Nullable
    public final List<String> zzcpx;

    public zzaaz() {
        this(false, Collections.emptyList());
    }

    public zzaaz(boolean z, List<String> list) {
        this.zzcpw = z;
        this.zzcpx = list;
    }

    @Nullable
    public static zzaaz zzl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzaaz();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        List arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (Throwable e) {
                    hx.m19914c("Error grabbing url from json.", e);
                }
            }
        }
        return new zzaaz(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20101a(parcel, 2, this.zzcpw);
        oj.m20110b(parcel, 3, this.zzcpx, false);
        oj.m20088a(parcel, i);
    }
}
