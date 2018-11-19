package com.appsflyer;

import android.support.annotation.WorkerThread;
import com.appsflyer.share.C0950a;
import com.tinder.api.ManagerWebServices;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateOneLinkHttpTask extends C0928f {
    /* renamed from: b */
    private ResponseListener f9341b;
    /* renamed from: c */
    private Map<String, String> f9342c;
    /* renamed from: d */
    private String f9343d;
    /* renamed from: e */
    private String f9344e;
    /* renamed from: f */
    private boolean f9345f;

    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    /* renamed from: a */
    void mo1217a(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        if (!this.f9345f) {
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject(this.f9342c);
            jSONObject.put("ttl", this.f9343d);
            jSONObject.put(ManagerWebServices.FB_DATA, jSONObject2);
            httpsURLConnection.connect();
            DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
            dataOutputStream.writeBytes(jSONObject.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    String mo1215a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C0929g.m3169b("https://onelink.%s/shortlink-sdk/v1"));
        stringBuilder.append("/");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    void mo1216a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.f9341b.onResponse(jSONObject.optString((String) keys.next()));
            }
        } catch (Throwable e) {
            this.f9341b.onResponseError("Can't parse one link data");
            StringBuilder stringBuilder = new StringBuilder("Error while parsing to json ");
            stringBuilder.append(str);
            AFLogger.m3073a(stringBuilder.toString(), e);
        }
    }

    /* renamed from: b */
    void mo1218b() {
        this.f9341b.onResponse(new C0950a("af_app_invites").m3249a(this.a, AppsFlyerProperties.m3086a().m3090a("onelinkDomain"), this.f9344e).m3248a("af_siteid", this.f9344e).m3250a(this.f9342c).m3251a());
    }
}
