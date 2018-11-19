package io.fabric.sdk.android.services.settings;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.services.common.C15616a;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.fabric.sdk.android.services.settings.k */
class C17352k extends C15616a implements SettingsSpiCall {
    /* renamed from: a */
    boolean m63440a(int i) {
        if (!(i == Callback.DEFAULT_DRAG_ANIMATION_DURATION || i == 201 || i == 202)) {
            if (i != 203) {
                return false;
            }
        }
        return true;
    }

    public C17352k(C15611g c15611g, String str, String str2, HttpRequestFactory httpRequestFactory) {
        this(c15611g, str, str2, httpRequestFactory, HttpMethod.GET);
    }

    C17352k(C15611g c15611g, String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod) {
        super(c15611g, str, str2, httpRequestFactory, httpMethod);
    }

    public JSONObject invoke(C15667r c15667r) {
        StringBuilder stringBuilder;
        Throwable e;
        Throwable th;
        try {
            Map a = m63436a(c15667r);
            HttpRequest httpRequest = getHttpRequest(a);
            try {
                c15667r = m63435a(httpRequest, c15667r);
                try {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Requesting settings from ");
                    stringBuilder2.append(getUrl());
                    C15608c.m58560h().mo12791d("Fabric", stringBuilder2.toString());
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Settings query params were: ");
                    stringBuilder2.append(a);
                    C15608c.m58560h().mo12791d("Fabric", stringBuilder2.toString());
                    JSONObject a2 = m63439a((HttpRequest) c15667r);
                    if (c15667r != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Settings request ID: ");
                        stringBuilder.append(c15667r.m58780b(C15616a.HEADER_REQUEST_ID));
                        C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
                    }
                    return a2;
                } catch (HttpRequestException e2) {
                    e = e2;
                    try {
                        C15608c.m58560h().mo12794e("Fabric", "Settings request failed.", e);
                        if (c15667r != null) {
                            return null;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Settings request ID: ");
                        stringBuilder.append(c15667r.m58780b(C15616a.HEADER_REQUEST_ID));
                        C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (c15667r != null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Settings request ID: ");
                            stringBuilder.append(c15667r.m58780b(C15616a.HEADER_REQUEST_ID));
                            C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
                        }
                        throw th;
                    }
                }
            } catch (HttpRequestException e3) {
                e = e3;
                c15667r = httpRequest;
                C15608c.m58560h().mo12794e("Fabric", "Settings request failed.", e);
                if (c15667r != null) {
                    return null;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Settings request ID: ");
                stringBuilder.append(c15667r.m58780b(C15616a.HEADER_REQUEST_ID));
                C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
                return null;
            } catch (Throwable th3) {
                th = th3;
                c15667r = httpRequest;
                if (c15667r != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Settings request ID: ");
                    stringBuilder.append(c15667r.m58780b(C15616a.HEADER_REQUEST_ID));
                    C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
                }
                throw th;
            }
        } catch (HttpRequestException e4) {
            e = e4;
            c15667r = null;
            C15608c.m58560h().mo12794e("Fabric", "Settings request failed.", e);
            if (c15667r != null) {
                return null;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Settings request ID: ");
            stringBuilder.append(c15667r.m58780b(C15616a.HEADER_REQUEST_ID));
            C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
            return null;
        } catch (C15667r c15667r2) {
            th = c15667r2;
            c15667r2 = null;
            if (c15667r2 != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Settings request ID: ");
                stringBuilder.append(c15667r2.m58780b(C15616a.HEADER_REQUEST_ID));
                C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
            }
            throw th;
        }
    }

    /* renamed from: a */
    JSONObject m63439a(HttpRequest httpRequest) {
        int b = httpRequest.m58778b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Settings result was: ");
        stringBuilder.append(b);
        C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
        if (m63440a(b)) {
            return m63437a(httpRequest.m58789e());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Failed to retrieve settings from ");
        stringBuilder2.append(getUrl());
        C15608c.m58560h().mo12793e("Fabric", stringBuilder2.toString());
        return null;
    }

    /* renamed from: a */
    private JSONObject m63437a(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse settings JSON from ");
            stringBuilder.append(getUrl());
            C15608c.m58560h().mo12792d("Fabric", stringBuilder.toString(), e);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Settings response ");
            stringBuilder2.append(str);
            C15608c.m58560h().mo12791d("Fabric", stringBuilder2.toString());
            return null;
        }
    }

    /* renamed from: a */
    private Map<String, String> m63436a(C15667r c15667r) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("build_version", c15667r.f48523h);
        hashMap.put("display_version", c15667r.f48522g);
        hashMap.put("source", Integer.toString(c15667r.f48524i));
        if (c15667r.f48525j != null) {
            hashMap.put("icon_hash", c15667r.f48525j);
        }
        String str = c15667r.f48521f;
        if (!CommonUtils.m58618d(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    private HttpRequest m63435a(HttpRequest httpRequest, C15667r c15667r) {
        m63438a(httpRequest, C15616a.HEADER_API_KEY, c15667r.f48516a);
        m63438a(httpRequest, C15616a.HEADER_CLIENT_TYPE, "android");
        m63438a(httpRequest, C15616a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        m63438a(httpRequest, C15616a.HEADER_ACCEPT, C15616a.ACCEPT_JSON_VALUE);
        m63438a(httpRequest, "X-CRASHLYTICS-DEVICE-MODEL", c15667r.f48517b);
        m63438a(httpRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", c15667r.f48518c);
        m63438a(httpRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c15667r.f48519d);
        m63438a(httpRequest, "X-CRASHLYTICS-INSTALLATION-ID", c15667r.f48520e);
        return httpRequest;
    }

    /* renamed from: a */
    private void m63438a(HttpRequest httpRequest, String str, String str2) {
        if (str2 != null) {
            httpRequest.m58768a(str, str2);
        }
    }
}
