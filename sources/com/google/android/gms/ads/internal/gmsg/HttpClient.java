package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fe;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.hq;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzzv;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

@Keep
@KeepName
@zzzv
public class HttpClient implements zzt<zza> {
    private final Context mContext;
    private final zzakd zzapr;

    @zzzv
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$a */
    static class C2372a {
        /* renamed from: a */
        private final String f7225a;
        /* renamed from: b */
        private final String f7226b;

        public C2372a(String str, String str2) {
            this.f7225a = str;
            this.f7226b = str2;
        }

        /* renamed from: a */
        public final String m8694a() {
            return this.f7225a;
        }

        /* renamed from: b */
        public final String m8695b() {
            return this.f7226b;
        }
    }

    @zzzv
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$b */
    static class C2373b {
        /* renamed from: a */
        private final String f7227a;
        /* renamed from: b */
        private final URL f7228b;
        /* renamed from: c */
        private final ArrayList<C2372a> f7229c;
        /* renamed from: d */
        private final String f7230d;

        C2373b(String str, URL url, ArrayList<C2372a> arrayList, String str2) {
            this.f7227a = str;
            this.f7228b = url;
            this.f7229c = arrayList;
            this.f7230d = str2;
        }

        /* renamed from: a */
        public final String m8696a() {
            return this.f7227a;
        }

        /* renamed from: b */
        public final URL m8697b() {
            return this.f7228b;
        }

        /* renamed from: c */
        public final ArrayList<C2372a> m8698c() {
            return this.f7229c;
        }

        /* renamed from: d */
        public final String m8699d() {
            return this.f7230d;
        }
    }

    @zzzv
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$c */
    class C2374c {
        /* renamed from: a */
        private final C2375d f7231a;
        /* renamed from: b */
        private final boolean f7232b;
        /* renamed from: c */
        private final String f7233c;

        public C2374c(HttpClient httpClient, boolean z, C2375d c2375d, String str) {
            this.f7232b = z;
            this.f7231a = c2375d;
            this.f7233c = str;
        }

        /* renamed from: a */
        public final String m8700a() {
            return this.f7233c;
        }

        /* renamed from: b */
        public final C2375d m8701b() {
            return this.f7231a;
        }

        /* renamed from: c */
        public final boolean m8702c() {
            return this.f7232b;
        }
    }

    @zzzv
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$d */
    static class C2375d {
        /* renamed from: a */
        private final String f7234a;
        /* renamed from: b */
        private final int f7235b;
        /* renamed from: c */
        private final List<C2372a> f7236c;
        /* renamed from: d */
        private final String f7237d;

        C2375d(String str, int i, List<C2372a> list, String str2) {
            this.f7234a = str;
            this.f7235b = i;
            this.f7236c = list;
            this.f7237d = str2;
        }

        /* renamed from: a */
        public final String m8703a() {
            return this.f7234a;
        }

        /* renamed from: b */
        public final int m8704b() {
            return this.f7235b;
        }

        /* renamed from: c */
        public final Iterable<C2372a> m8705c() {
            return this.f7236c;
        }

        /* renamed from: d */
        public final String m8706d() {
            return this.f7237d;
        }
    }

    public HttpClient(Context context, zzakd zzakd) {
        this.mContext = context;
        this.zzapr = zzakd;
    }

    private final C2374c zza(C2373b c2373b) {
        HttpURLConnection httpURLConnection;
        Exception e;
        C2374c c2374c;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) c2373b.m8697b().openConnection();
            try {
                byte[] bArr;
                ar.m8648e().a(this.mContext, this.zzapr.zzcv, false, httpURLConnection);
                ArrayList c = c2373b.m8698c();
                int size = c.size();
                int i = 0;
                while (i < size) {
                    Object obj = c.get(i);
                    i++;
                    C2372a c2372a = (C2372a) obj;
                    httpURLConnection.addRequestProperty(c2372a.m8694a(), c2372a.m8695b());
                }
                if (TextUtils.isEmpty(c2373b.m8699d())) {
                    bArr = null;
                } else {
                    httpURLConnection.setDoOutput(true);
                    bArr = c2373b.m8699d().getBytes();
                    httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.close();
                }
                hq hqVar = new hq();
                hqVar.a(httpURLConnection, bArr);
                List arrayList = new ArrayList();
                if (httpURLConnection.getHeaderFields() != null) {
                    for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
                        for (String c2372a2 : (List) entry.getValue()) {
                            arrayList.add(new C2372a((String) entry.getKey(), c2372a2));
                        }
                    }
                }
                String a = c2373b.m8696a();
                int responseCode = httpURLConnection.getResponseCode();
                ar.m8648e();
                C2375d c2375d = new C2375d(a, responseCode, arrayList, fk.a(new InputStreamReader(httpURLConnection.getInputStream())));
                hqVar.a(httpURLConnection, c2375d.m8704b());
                hqVar.a(c2375d.m8706d());
                C2374c c2374c2 = new C2374c(this, true, c2375d, null);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return c2374c2;
            } catch (Exception e2) {
                e = e2;
                try {
                    c2374c = new C2374c(this, false, null, e.toString());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return c2374c;
                } catch (Throwable th2) {
                    th = th2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
            c2374c = new C2374c(this, false, null, e.toString());
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return c2374c;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private static JSONObject zza(C2375d c2375d) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", c2375d.m8703a());
            if (c2375d.m8706d() != null) {
                jSONObject.put("body", c2375d.m8706d());
            }
            JSONArray jSONArray = new JSONArray();
            for (C2372a c2372a : c2375d.m8705c()) {
                jSONArray.put(new JSONObject().put("key", c2372a.m8694a()).put("value", c2372a.m8695b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", c2375d.m8704b());
            return jSONObject;
        } catch (Throwable e) {
            ec.b("Error constructing JSON for http response.", e);
            return jSONObject;
        }
    }

    private static C2373b zzd(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        URL url = null;
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (Throwable e) {
            ec.b("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C2372a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new C2373b(optString, url, arrayList, optString3);
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) {
        Throwable e;
        JSONObject jSONObject2 = new JSONObject();
        String str = "";
        Object optString;
        try {
            optString = jSONObject.optString("http_request_id");
            try {
                C2374c zza = zza(zzd(jSONObject));
                if (zza.m8702c()) {
                    jSONObject2.put("response", zza(zza.m8701b()));
                    jSONObject2.put("success", true);
                    return jSONObject2;
                }
                jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", zza.m8700a());
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                ec.b("Error executing http request.", e);
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", e.toString());
                    return jSONObject2;
                } catch (Throwable e3) {
                    ec.b("Error executing http request.", e3);
                    return jSONObject2;
                }
            }
        } catch (Exception e4) {
            e3 = e4;
            optString = str;
            ec.b("Error executing http request.", e3);
            jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
            jSONObject2.put("success", false);
            jSONObject2.put("reason", e3.toString());
            return jSONObject2;
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        fe.a(new C2378x(this, map, (zza) obj));
    }
}
