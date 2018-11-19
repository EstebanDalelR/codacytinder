package com.tinder.p257g;

import android.support.annotation.NonNull;
import com.tinder.api.ManagerWebServices;
import com.tinder.managers.FacebookManager;
import com.tinder.model.FacebookAlbum;
import com.tinder.model.FacebookPhoto;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tinder.g.b */
public class C9645b {
    @NonNull
    /* renamed from: a */
    public static ArrayList<FacebookAlbum> m40035a(@NonNull JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has(ManagerWebServices.FB_PARAM_FIELD_ALBUMS)) {
            return new ArrayList(0);
        }
        jSONObject = jSONObject.getJSONObject(ManagerWebServices.FB_PARAM_FIELD_ALBUMS);
        if (!jSONObject.has(ManagerWebServices.FB_DATA)) {
            return new ArrayList(0);
        }
        jSONObject = jSONObject.getJSONArray(ManagerWebServices.FB_DATA);
        ArrayList<FacebookAlbum> arrayList = new ArrayList(jSONObject.length());
        for (int i = 0; i < jSONObject.length(); i++) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(i);
            FacebookAlbum facebookAlbum = new FacebookAlbum();
            facebookAlbum.id = jSONObject2.optString("id");
            facebookAlbum.name = jSONObject2.optString("name");
            String optString = jSONObject2.optString(ManagerWebServices.FB_PARAM_FIELD_COUNT);
            facebookAlbum.count = optString.length() > 0 ? Integer.parseInt(optString) : 0;
            facebookAlbum.thumbnailUrl = FacebookManager.m40470b(facebookAlbum.id, str);
            if (facebookAlbum.id != null) {
                arrayList.add(facebookAlbum);
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public static FacebookAlbum m40034a(@NonNull JSONObject jSONObject) throws JSONException {
        FacebookAlbum facebookAlbum = new FacebookAlbum();
        if (jSONObject.has("photos")) {
            jSONObject = jSONObject.getJSONObject("photos");
            if (jSONObject.has(ManagerWebServices.FB_DATA)) {
                jSONObject = jSONObject.getJSONArray(ManagerWebServices.FB_DATA);
                facebookAlbum.thumbnailUrl = jSONObject.getJSONObject(0).getString("picture");
                facebookAlbum.count = jSONObject.length();
                facebookAlbum.id = ManagerWebServices.FB_PARAM_TAGGED_ID;
                facebookAlbum.name = "Photos of Me";
            }
        }
        return facebookAlbum;
    }

    @NonNull
    /* renamed from: b */
    public static ArrayList<FacebookPhoto> m40036b(@NonNull JSONObject jSONObject) throws JSONException {
        int i = 0;
        if (!jSONObject.has(ManagerWebServices.FB_DATA)) {
            return new ArrayList(0);
        }
        jSONObject = jSONObject.getJSONArray(ManagerWebServices.FB_DATA);
        ArrayList<FacebookPhoto> arrayList = new ArrayList(jSONObject.length());
        while (i < jSONObject.length()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(i);
            FacebookPhoto facebookPhoto = new FacebookPhoto();
            facebookPhoto.sourceUrl = jSONObject2.getString("source");
            facebookPhoto.id = jSONObject2.getString("id");
            facebookPhoto.thumbnailUrl = jSONObject2.getString("picture");
            if (facebookPhoto.id != null) {
                arrayList.add(facebookPhoto);
            }
            i++;
        }
        return arrayList;
    }
}
