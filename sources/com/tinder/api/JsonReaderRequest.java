package com.tinder.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.C0915c;
import com.google.gson.stream.JsonReader;
import com.tinder.utils.ab;
import com.tinder.utils.ad;
import io.fabric.sdk.android.services.common.C15616a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public abstract class JsonReaderRequest<T> extends Request<T> {
    @Nullable
    private String body;
    @NonNull
    protected Listener<T> listener;
    private final Map<String, String> mHeaders = new HashMap(6);
    private int statusCode;

    @Nullable
    public abstract T readJson(JsonReader jsonReader) throws Exception;

    public JsonReaderRequest(int i, @NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull Listener<T> listener, @NonNull ErrorListener errorListener) {
        super(i, str, errorListener);
        this.body = str2;
        init(str3, listener);
    }

    public JsonReaderRequest(int i, @NonNull String str, @Nullable String str2, @NonNull Listener<T> listener, @NonNull ErrorListener errorListener) {
        super(i, str, errorListener);
        init(str2, listener);
    }

    private void init(@Nullable String str, @NonNull Listener<T> listener) {
        this.listener = listener;
        this.mHeaders.put("User-Agent", ManagerWebServices.USER_AGENT_STRING);
        this.mHeaders.put("os-version", ManagerWebServices.PARAM_OS_VERSION_VALUE);
        this.mHeaders.put("app-version", ManagerWebServices.PARAM_APP_VERSION_VALUE);
        this.mHeaders.put("platform", "android");
        this.mHeaders.put("Accept-Language", ab.a());
        if (str != null) {
            this.mHeaders.put("X-Auth-Token", str);
        }
    }

    @NonNull
    public Map<String, String> getHeaders() throws AuthFailureError {
        return this.mHeaders;
    }

    protected Response<T> parseNetworkResponse(@NonNull NetworkResponse networkResponse) {
        JsonReader jsonReader;
        InputStream byteArrayInputStream = new ByteArrayInputStream(networkResponse.f2336b);
        this.statusCode = networkResponse.f2335a;
        Object obj = null;
        try {
            jsonReader = new JsonReader(new InputStreamReader(byteArrayInputStream, "UTF-8"));
        } catch (Throwable e) {
            Throwable e2;
            ad.a("Failed to decode response data as UTF-8", e2);
            jsonReader = null;
        }
        try {
            obj = readJson(jsonReader);
            e2 = null;
        } catch (Exception e3) {
            e2 = e3;
        }
        if (jsonReader != null) {
            try {
                jsonReader.close();
            } catch (Throwable e4) {
                ad.a("Failed to close reader.", e4);
            }
        }
        if (obj != null) {
            return Response.a(obj, C0915c.a(networkResponse));
        }
        if (e2 != null) {
            return Response.a(new VolleyError(e2));
        }
        return Response.a(new VolleyError("Unknown error"));
    }

    protected void deliverResponse(T t) {
        this.listener.onResponse(t);
    }

    public byte[] getBody() throws AuthFailureError {
        if (this.body != null) {
            return this.body.getBytes();
        }
        return super.getBody();
    }

    public String getBodyContentType() {
        if (this.body != null) {
            return C15616a.ACCEPT_JSON_VALUE;
        }
        return super.getBodyContentType();
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
