package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.facebook.ads.AudienceNetworkActivity;
import org.json.JSONObject;

/* renamed from: com.android.volley.toolbox.e */
public class C4079e extends C3004f<JSONObject> {
    public C4079e(int i, String str, String str2, Listener<JSONObject> listener, ErrorListener errorListener) {
        super(i, str, str2, listener, errorListener);
    }

    public C4079e(String str, Listener<JSONObject> listener, ErrorListener errorListener) {
        super(0, str, null, listener, errorListener);
    }

    public C4079e(int i, String str, Listener<JSONObject> listener, ErrorListener errorListener) {
        super(i, str, null, listener, errorListener);
    }

    public C4079e(int i, String str, JSONObject jSONObject, Listener<JSONObject> listener, ErrorListener errorListener) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), listener, errorListener);
    }

    public C4079e(String str, JSONObject jSONObject, Listener<JSONObject> listener, ErrorListener errorListener) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, (Listener) listener, errorListener);
    }

    protected Response<JSONObject> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.m3042a(new JSONObject(new String(networkResponse.f2336b, C0915c.m3068a(networkResponse.f2337c, AudienceNetworkActivity.WEBVIEW_ENCODING))), C0915c.m3066a(networkResponse));
        } catch (NetworkResponse networkResponse2) {
            return Response.m3041a(new ParseError(networkResponse2));
        } catch (NetworkResponse networkResponse22) {
            return Response.m3041a(new ParseError(networkResponse22));
        }
    }
}
