package com.facebook.share.internal;

import android.support.annotation.Nullable;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class OpenGraphJSONUtility {

    public interface PhotoJSONProcessor {
        JSONObject toJSONObject(SharePhoto sharePhoto);
    }

    /* renamed from: a */
    public static JSONObject m6346a(ShareOpenGraphAction shareOpenGraphAction, PhotoJSONProcessor photoJSONProcessor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphAction.keySet()) {
            jSONObject.put(str, m6344a(shareOpenGraphAction.get(str), photoJSONProcessor));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m6347a(ShareOpenGraphObject shareOpenGraphObject, PhotoJSONProcessor photoJSONProcessor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphObject.keySet()) {
            jSONObject.put(str, m6344a(shareOpenGraphObject.get(str), photoJSONProcessor));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONArray m6345a(List list, PhotoJSONProcessor photoJSONProcessor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : list) {
            jSONArray.put(m6344a(a, photoJSONProcessor));
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static Object m6344a(@Nullable Object obj, PhotoJSONProcessor photoJSONProcessor) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (!((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer))) {
            if (!(obj instanceof Long)) {
                if (obj instanceof SharePhoto) {
                    return photoJSONProcessor != null ? photoJSONProcessor.toJSONObject((SharePhoto) obj) : null;
                } else {
                    if (obj instanceof ShareOpenGraphObject) {
                        return m6347a((ShareOpenGraphObject) obj, photoJSONProcessor);
                    }
                    if (obj instanceof List) {
                        return m6345a((List) obj, photoJSONProcessor);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid object found for JSON serialization: ");
                    stringBuilder.append(obj.toString());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        return obj;
    }
}
