package com.tinder.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.C3006i;
import com.tinder.listeners.StatusCodeListener;
import com.tinder.managers.C2652a;
import com.tinder.utils.ad;
import io.fabric.sdk.android.services.common.C15616a;
import java.util.Map;
import java.util.TreeMap;

public class CustomJsonRequest extends C3006i {
    private static final String PROTOCOL_CHARSET = "utf-8";
    private StatusCodeListener mCustomListener;
    private final Map<String, String> mHeaders;
    private String mPayload;
    private NetworkResponse mResponse;

    static final /* synthetic */ void lambda$new$0$CustomJsonRequest(String str) {
    }

    @NonNull
    public String getBodyContentType() {
        return C15616a.ACCEPT_JSON_VALUE;
    }

    public CustomJsonRequest(int i, String str, Map<String, String> map, String str2, Listener<String> listener, ErrorListener errorListener) {
        super(i, str, listener, errorListener);
        this.mHeaders = map;
        this.mPayload = str2;
        i = new StringBuilder();
        i.append("url=");
        i.append(str);
        i.append(", mPayload=");
        i.append(str2);
        ad.a(i.toString());
    }

    public CustomJsonRequest(int i, String str, Map<String, String> map, String str2, StatusCodeListener statusCodeListener) {
        super(i, str, CustomJsonRequest$$Lambda$0.$instance, new CustomJsonRequest$$Lambda$1(statusCodeListener));
        this.mCustomListener = statusCodeListener;
        this.mHeaders = map;
        this.mPayload = str2;
    }

    static final /* synthetic */ void lambda$new$1$CustomJsonRequest(StatusCodeListener statusCodeListener, VolleyError volleyError) {
        if (volleyError.f2358a != null) {
            statusCodeListener.onResponse(volleyError.f2358a.f2335a);
        } else {
            statusCodeListener.onResponse(500);
        }
    }

    @Nullable
    public static CustomJsonRequest get(String str, Map<String, String> map, Listener<String> listener, ErrorListener errorListener) {
        CustomJsonRequest customJsonRequest = new CustomJsonRequest(0, str, map, null, listener, errorListener);
        customJsonRequest.setTag(str);
        return customJsonRequest;
    }

    @NonNull
    public static CustomJsonRequest post(String str, Map<String, String> map, String str2, Listener<String> listener, ErrorListener errorListener) {
        CustomJsonRequest customJsonRequest = new CustomJsonRequest(1, str, map, str2, listener, errorListener);
        customJsonRequest.setTag(str);
        return customJsonRequest;
    }

    @NonNull
    public static CustomJsonRequest put(String str, Map<String, String> map, String str2, Listener<String> listener, ErrorListener errorListener) {
        CustomJsonRequest customJsonRequest = new CustomJsonRequest(2, str, map, str2, listener, errorListener);
        customJsonRequest.setTag(str);
        return customJsonRequest;
    }

    public Map<String, String> getHeaders() throws AuthFailureError {
        return this.mHeaders != null ? this.mHeaders : super.getHeaders();
    }

    protected Response<String> parseNetworkResponse(NetworkResponse networkResponse) {
        this.mResponse = networkResponse;
        return super.parseNetworkResponse(networkResponse);
    }

    protected void deliverResponse(String str) {
        super.deliverResponse(str);
        if (this.mCustomListener != null) {
            this.mCustomListener.onResponse(this.mResponse.f2335a);
        }
    }

    @android.support.annotation.Nullable
    public byte[] getBody() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Returning ";
        r0.append(r1);
        r1 = r4.mPayload;
        r0.append(r1);
        r0 = r0.toString();
        com.tinder.utils.ad.a(r0);
        r0 = r4.mPayload;	 Catch:{ UnsupportedEncodingException -> 0x0027 }
        if (r0 != 0) goto L_0x001e;	 Catch:{ UnsupportedEncodingException -> 0x0027 }
    L_0x001a:
        r0 = "";	 Catch:{ UnsupportedEncodingException -> 0x0027 }
        r4.mPayload = r0;	 Catch:{ UnsupportedEncodingException -> 0x0027 }
    L_0x001e:
        r0 = r4.mPayload;	 Catch:{ UnsupportedEncodingException -> 0x0027 }
        r1 = "utf-8";	 Catch:{ UnsupportedEncodingException -> 0x0027 }
        r0 = r0.getBytes(r1);	 Catch:{ UnsupportedEncodingException -> 0x0027 }
        return r0;
    L_0x0027:
        r0 = "Unsupported Encoding while trying to get the bytes of %s using %s";
        r1 = 2;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r3 = r4.mPayload;
        r1[r2] = r3;
        r2 = 1;
        r3 = "utf-8";
        r1[r2] = r3;
        com.android.volley.C0911f.d(r0, r1);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.CustomJsonRequest.getBody():byte[]");
    }

    public static Map<String, String> getTinderHeaders() {
        Map<String, String> treeMap = new TreeMap();
        treeMap.put("User-Agent", ManagerWebServices.USER_AGENT_STRING);
        treeMap.put("os-version", ManagerWebServices.PARAM_OS_VERSION_VALUE);
        treeMap.put("app-version", ManagerWebServices.PARAM_APP_VERSION_VALUE);
        treeMap.put("platform", "android");
        if (C2652a.a() != null) {
            treeMap.put("X-Auth-Token", C2652a.a());
        }
        return treeMap;
    }
}
