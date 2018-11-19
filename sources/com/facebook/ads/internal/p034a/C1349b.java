package com.facebook.ads.internal.p034a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p041h.C1425f;
import com.tinder.api.ManagerWebServices;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.a.b */
public class C1349b {
    /* renamed from: a */
    private static final String f3619a = "b";

    /* renamed from: a */
    public static C1348a m4701a(Context context, C1425f c1425f, String str, Uri uri, Map<String, String> map) {
        String authority = uri.getAuthority();
        String queryParameter = uri.getQueryParameter("video_url");
        if (!TextUtils.isEmpty(uri.getQueryParameter(ManagerWebServices.FB_DATA))) {
            try {
                JSONObject jSONObject = new JSONObject(uri.getQueryParameter(ManagerWebServices.FB_DATA));
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    map.put(str2, jSONObject.getString(str2));
                }
            } catch (Throwable e) {
                Log.w(f3619a, "Unable to parse json data in AdActionFactory.", e);
            }
        }
        Object obj = -1;
        int hashCode = authority.hashCode();
        if (hashCode != -1458789996) {
            if (hashCode != 109770977) {
                if (hashCode == 1546100943) {
                    if (authority.equals("open_link")) {
                        obj = 1;
                    }
                }
            } else if (authority.equals("store")) {
                obj = null;
            }
        } else if (authority.equals("passthrough")) {
            obj = 2;
        }
        switch (obj) {
            case null:
                return queryParameter != null ? null : new C3249c(context, c1425f, str, uri, map);
            case 1:
                return new C3250d(context, c1425f, str, uri, map);
            case 2:
                return new C3251e(context, c1425f, str, uri, map);
            default:
                return new C3252f(context, c1425f, str, uri);
        }
    }

    /* renamed from: a */
    public static boolean m4702a(String str) {
        if (!"store".equalsIgnoreCase(str)) {
            if (!"open_link".equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
