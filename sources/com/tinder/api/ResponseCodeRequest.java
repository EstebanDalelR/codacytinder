package com.tinder.api;

import android.support.annotation.Nullable;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.C0915c;
import com.tinder.managers.C2652a;
import com.tinder.utils.ab;
import com.tinder.utils.ad;
import java.util.HashMap;
import java.util.Map;

public class ResponseCodeRequest extends Request<Boolean> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", new Object[]{"utf-8"});
    private int mExpectedStatus;
    private final Map<String, String> mHeaders = new HashMap();
    private Listener<Boolean> mListener;
    private String mRequestBody;
    private int mStatusCode;

    public static class Factory {
        public ResponseCodeRequest createRequest(int i, String str, @Nullable String str2, int i2, Listener<Boolean> listener, ErrorListener errorListener) {
            return new ResponseCodeRequest(i, str, str2, i2, listener, errorListener);
        }
    }

    public ResponseCodeRequest(int i, String str, @Nullable String str2, int i2, Listener<Boolean> listener, ErrorListener errorListener) {
        super(i, str, errorListener);
        i = new StringBuilder();
        i.append("url=");
        i.append(str);
        ad.a(i.toString());
        i = new StringBuilder();
        i.append("token=");
        i.append(C2652a.a());
        ad.a(i.toString());
        this.mRequestBody = str2;
        this.mListener = listener;
        this.mExpectedStatus = i2;
        this.mHeaders.put("User-Agent", ManagerWebServices.USER_AGENT_STRING);
        this.mHeaders.put("os-version", ManagerWebServices.PARAM_OS_VERSION_VALUE);
        this.mHeaders.put("app-version", ManagerWebServices.PARAM_APP_VERSION_VALUE);
        this.mHeaders.put("platform", "android");
        this.mHeaders.put("Accept-Language", ab.a());
        if (C2652a.a() != 0) {
            this.mHeaders.put("X-Auth-Token", C2652a.a());
        }
    }

    public Map<String, String> getHeaders() throws AuthFailureError {
        return this.mHeaders;
    }

    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    public byte[] getPostBody() {
        return getBody();
    }

    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    public byte[] getBody() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.mRequestBody;	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        if (r1 != 0) goto L_0x0006;	 Catch:{ UnsupportedEncodingException -> 0x0010 }
    L_0x0005:
        goto L_0x000f;	 Catch:{ UnsupportedEncodingException -> 0x0010 }
    L_0x0006:
        r1 = r5.mRequestBody;	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        r2 = "utf-8";	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        r1 = r1.getBytes(r2);	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        r0 = r1;
    L_0x000f:
        return r0;
    L_0x0010:
        r1 = "Unsupported Encoding while trying to get the bytes of %s using %s";
        r2 = 2;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r5.mRequestBody;
        r2[r3] = r4;
        r3 = 1;
        r4 = "utf-8";
        r2[r3] = r4;
        com.android.volley.C0911f.d(r1, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.ResponseCodeRequest.getBody():byte[]");
    }

    protected Response<Boolean> parseNetworkResponse(NetworkResponse networkResponse) {
        if (networkResponse == null) {
            return Response.a(new VolleyError("No response."));
        }
        this.mStatusCode = networkResponse.f2335a;
        if (this.mStatusCode == this.mExpectedStatus) {
            return Response.a(Boolean.valueOf(true), C0915c.a(networkResponse));
        }
        return Response.a(new VolleyError(networkResponse));
    }

    protected void onFinish() {
        super.onFinish();
        this.mListener = null;
    }

    protected void deliverResponse(Boolean bool) {
        if (this.mListener != null) {
            this.mListener.onResponse(bool);
        }
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }
}
