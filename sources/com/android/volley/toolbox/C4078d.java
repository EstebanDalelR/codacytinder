package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.facebook.ads.AudienceNetworkActivity;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.android.volley.toolbox.d */
public class C4078d extends C3004f<JSONArray> {
    public C4078d(int i, String str, String str2, Listener<JSONArray> listener, ErrorListener errorListener) {
        super(i, str, str2, listener, errorListener);
    }

    public C4078d(String str, Listener<JSONArray> listener, ErrorListener errorListener) {
        super(0, str, null, listener, errorListener);
    }

    public C4078d(int i, String str, Listener<JSONArray> listener, ErrorListener errorListener) {
        super(i, str, null, listener, errorListener);
    }

    public C4078d(int i, String str, JSONArray jSONArray, Listener<JSONArray> listener, ErrorListener errorListener) {
        super(i, str, jSONArray == null ? null : jSONArray.toString(), listener, errorListener);
    }

    public C4078d(int i, String str, JSONObject jSONObject, Listener<JSONArray> listener, ErrorListener errorListener) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), listener, errorListener);
    }

    public C4078d(String str, JSONArray jSONArray, Listener<JSONArray> listener, ErrorListener errorListener) {
        this(jSONArray == null ? 0 : 1, str, jSONArray, (Listener) listener, errorListener);
    }

    public C4078d(String str, JSONObject jSONObject, Listener<JSONArray> listener, ErrorListener errorListener) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, (Listener) listener, errorListener);
    }

    protected Response<JSONArray> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.m3042a(new JSONArray(new String(networkResponse.f2336b, C0915c.m3068a(networkResponse.f2337c, AudienceNetworkActivity.WEBVIEW_ENCODING))), C0915c.m3066a(networkResponse));
        } catch (NetworkResponse networkResponse2) {
            return Response.m3041a(new ParseError(networkResponse2));
        } catch (NetworkResponse networkResponse22) {
            return Response.m3041a(new ParseError(networkResponse22));
        }
    }
}
