package com.appsflyer;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.x */
final class C3013x extends C0928f {
    /* renamed from: b */
    private C0959a f9389b;
    /* renamed from: c */
    private String f9390c;

    /* renamed from: com.appsflyer.x$a */
    interface C0959a {
        /* renamed from: a */
        void mo1221a(String str);

        /* renamed from: a */
        void mo1222a(Map<String, String> map);
    }

    C3013x(Uri uri, C3010d c3010d) {
        super(c3010d);
        if (TextUtils.isEmpty(uri.getHost()) == null && TextUtils.isEmpty(uri.getPath()) == null) {
            c3010d = uri.getPath().split("/");
            if (uri.getHost().contains("onelink.me") != null && c3010d.length == 3) {
                this.a = c3010d[1];
                this.f9390c = c3010d[2];
            }
        }
    }

    /* renamed from: a */
    final void m11756a(@NonNull C0959a c0959a) {
        this.f9389b = c0959a;
    }

    /* renamed from: c */
    final boolean mo1230c() {
        return (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.f9390c)) ? false : true;
    }

    /* renamed from: a */
    final void mo1217a(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod("GET");
    }

    /* renamed from: a */
    final String mo1215a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C0929g.m3169b("https://onelink.%s/shortlink-sdk/v1"));
        stringBuilder.append("/");
        stringBuilder.append(this.a);
        stringBuilder.append("?id=");
        stringBuilder.append(this.f9390c);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    final void mo1216a(String str) {
        try {
            Map hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.optString(str2));
            }
            this.f9389b.mo1222a(hashMap);
        } catch (Throwable e) {
            this.f9389b.mo1221a("Can't parse one link data");
            StringBuilder stringBuilder = new StringBuilder("Error while parsing to json ");
            stringBuilder.append(str);
            AFLogger.m3073a(stringBuilder.toString(), e);
        }
    }

    /* renamed from: b */
    final void mo1218b() {
        this.f9389b.mo1221a("Can't get one link data");
    }
}
