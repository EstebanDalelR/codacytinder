package com.tinder.p257g;

import android.support.annotation.NonNull;
import com.tinder.api.ManagerWebServices;
import com.tinder.passport.model.PassportLocation;
import com.tinder.utils.C15375x;
import com.tinder.utils.ad;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tinder.g.d */
public class C9647d {
    @NonNull
    /* renamed from: a */
    public static PassportLocation m40039a(@NonNull JSONObject jSONObject) throws JSONException {
        jSONObject = jSONObject.optJSONArray(ManagerWebServices.PARAM_RESULTS);
        if (jSONObject != null) {
            if (jSONObject.length() != 0) {
                return (PassportLocation) C15375x.a().fromJson(jSONObject.getJSONObject(0).toString(), PassportLocation.class);
            }
        }
        return new PassportLocation();
    }

    @NonNull
    /* renamed from: b */
    public static PassportLocation m40041b(@NonNull JSONObject jSONObject) throws JSONException {
        try {
            return (PassportLocation) C15375x.a().fromJson(jSONObject.toString(), PassportLocation.class);
        } catch (JSONObject jSONObject2) {
            ad.c(jSONObject2.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static void m40040a(@NonNull PassportLocation passportLocation, @NonNull JSONObject jSONObject) {
        passportLocation.setLatitude(jSONObject.optDouble(ManagerWebServices.PARAM_LAT));
        passportLocation.setLongitude(jSONObject.optDouble(ManagerWebServices.PARAM_LON));
    }
}
