package com.tinder.p257g;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.InstagramCodeError;
import com.tinder.model.InstagramCodeError.Builder;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.InstagramPhoto;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tinder.g.c */
public class C9646c {
    @NonNull
    /* renamed from: a */
    public static InstagramDataSet m40038a(@NonNull JSONObject jSONObject) {
        InstagramDataSet instagramDataSet = new InstagramDataSet();
        jSONObject = jSONObject.optJSONObject(ManagerWebServices.IG_PARAM_INSTAGRAM);
        if (jSONObject != null) {
            String optString = jSONObject.optString(ManagerWebServices.IG_PARAM_LAST_FETCH_TIME);
            String optString2 = jSONObject.optString(ManagerWebServices.IG_PARAM_PROFILE_PIC);
            String optString3 = jSONObject.optString("username");
            int i = 0;
            int optInt = jSONObject.optInt(ManagerWebServices.IG_PARAM_MEDIA_COUNT, 0);
            instagramDataSet.lastFetchTime = optString;
            instagramDataSet.profileImageUrl = optString2;
            instagramDataSet.username = optString3;
            instagramDataSet.mediaCount = optInt;
            jSONObject = jSONObject.optJSONArray("photos");
            List arrayList = new ArrayList(0);
            if (jSONObject != null) {
                arrayList = new ArrayList(jSONObject.length());
                while (i < jSONObject.length()) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(i);
                    InstagramPhoto instagramPhoto = new InstagramPhoto();
                    instagramPhoto.mUrlLarge = optJSONObject.optString(ManagerWebServices.IG_PARAM_IMAGE);
                    instagramPhoto.mUrlSmall = optJSONObject.optString(ManagerWebServices.IG_PARAM_THUMB);
                    String optString4 = optJSONObject.optString(ManagerWebServices.IG_PARAM_LINK);
                    String optString5 = optJSONObject.optString("id");
                    instagramPhoto.mTimestamp = optJSONObject.optLong(ManagerWebServices.IG_PARAM_TIMESTAMP) * 1000;
                    instagramPhoto.mLink = optString4;
                    instagramPhoto.photoId = optString5;
                    arrayList.add(instagramPhoto);
                    i++;
                }
            }
            instagramDataSet.photos = arrayList;
        }
        return instagramDataSet;
    }

    @NonNull
    /* renamed from: a */
    public static InstagramCodeError m40037a(@NonNull Uri uri) {
        Object queryParameter = uri.getQueryParameter("status");
        int parseInt = !TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0;
        String queryParameter2 = uri.getQueryParameter("error");
        return new Builder(queryParameter2).ErrorReason(uri.getQueryParameter(ManagerWebServices.PARAM_ERROR_REASON)).ErrorDescription(uri.getQueryParameter(ManagerWebServices.PARAM_ERROR_DESCRIPTION)).StatusCode(parseInt).build();
    }
}
