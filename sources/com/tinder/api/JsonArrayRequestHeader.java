package com.tinder.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.C4078d;
import com.tinder.utils.ad;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArrayRequestHeader extends C4078d {
    private final Map<String, String> mHeaders = new HashMap();
    private int mStatusCode;

    public JsonArrayRequestHeader(int i, String str, JSONObject jSONObject, Listener<JSONArray> listener, ErrorListener errorListener, String str2) {
        super(i, str, jSONObject, listener, errorListener);
        setupHeaders(str2);
    }

    public JsonArrayRequestHeader(String str, Listener<JSONArray> listener, ErrorListener errorListener, String str2) {
        super(str, listener, errorListener);
        setupHeaders(str2);
    }

    public JsonArrayRequestHeader(int i, String str, Listener<JSONArray> listener, ErrorListener errorListener, String str2) {
        super(i, str, listener, errorListener);
        i = new StringBuilder();
        i.append("url=");
        i.append(str);
        i.append(", token=");
        i.append(str2);
        ad.a(i.toString());
        setupHeaders(str2);
    }

    private void setupHeaders(@Nullable String str) {
        this.mHeaders.put("User-Agent", ManagerWebServices.USER_AGENT_STRING);
        this.mHeaders.put("os-version", ManagerWebServices.PARAM_OS_VERSION_VALUE);
        this.mHeaders.put("app-version", ManagerWebServices.PARAM_APP_VERSION_VALUE);
        this.mHeaders.put("platform", "android");
        if (str != null) {
            this.mHeaders.put("X-Auth-Token", str);
        }
    }

    protected Response<JSONArray> parseNetworkResponse(NetworkResponse networkResponse) {
        this.mStatusCode = networkResponse.f2335a;
        return super.parseNetworkResponse(networkResponse);
    }

    @NonNull
    public Map<String, String> getHeaders() throws AuthFailureError {
        return this.mHeaders;
    }

    public void setHeader(String str, String str2) {
        this.mHeaders.put(str, str2);
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }
}
