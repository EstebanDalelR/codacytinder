package com.tinder.api;

import android.support.annotation.Nullable;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.C4079e;
import com.tinder.utils.ab;
import com.tinder.utils.ad;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class JsonObjectRequestHeader extends C4079e {
    private final Map<String, String> headers;
    private int statusCode;

    public JsonObjectRequestHeader(int i, String str, JSONObject jSONObject, Listener<JSONObject> listener, ErrorListener errorListener, @Nullable String str2) {
        JSONObject jSONObject2 = (jSONObject == null && i == 1) ? new JSONObject() : jSONObject;
        super(i, str, jSONObject2, listener, errorListener);
        this.headers = new HashMap();
        i = new StringBuilder();
        i.append("url=");
        i.append(str);
        ad.a(i.toString());
        i = new StringBuilder();
        i.append("jsonObject=");
        i.append(jSONObject);
        ad.a(i.toString());
        i = new StringBuilder();
        i.append("token=");
        i.append(str2);
        ad.a(i.toString());
        this.headers.put("User-Agent", ManagerWebServices.USER_AGENT_STRING);
        this.headers.put("os-version", ManagerWebServices.PARAM_OS_VERSION_VALUE);
        this.headers.put("app-version", ManagerWebServices.PARAM_APP_VERSION_VALUE);
        this.headers.put("platform", "android");
        this.headers.put("Accept-Language", ab.a());
        if (str2 != null) {
            this.headers.put("X-Auth-Token", str2);
        }
    }

    public void addHeader(String str, String str2) {
        this.headers.put(str, str2);
    }

    protected Response<JSONObject> parseNetworkResponse(NetworkResponse networkResponse) {
        this.statusCode = networkResponse.f2335a;
        return super.parseNetworkResponse(networkResponse);
    }

    public Map<String, String> getHeaders() throws AuthFailureError {
        return this.headers;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
