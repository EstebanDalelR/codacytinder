package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.JsonWriter;
import com.google.android.gms.common.util.C2518b;
import com.google.android.gms.common.util.C3827e;
import com.google.android.gms.common.util.zzd;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.GlobalConfig;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

@zzzv
public final class hq {
    /* renamed from: a */
    private static Object f16165a = new Object();
    @GuardedBy("sLock")
    /* renamed from: b */
    private static boolean f16166b = false;
    @GuardedBy("sLock")
    /* renamed from: c */
    private static boolean f16167c = false;
    /* renamed from: d */
    private static zzd f16168d = C3827e.a();
    /* renamed from: e */
    private static final Set<String> f16169e = new HashSet(Arrays.asList(new String[0]));
    /* renamed from: f */
    private final List<String> f16170f;

    public hq() {
        this(null);
    }

    public hq(@Nullable String str) {
        List asList;
        if (m19901c()) {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String str2 = "network_request_";
                uuid = String.valueOf(uuid);
                strArr[0] = uuid.length() != 0 ? str2.concat(uuid) : new String(str2);
                asList = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String str3 = "ad_request_";
                str = String.valueOf(str);
                strArr2[0] = str.length() != 0 ? str3.concat(str) : new String(str3);
                str = "network_request_";
                uuid = String.valueOf(uuid);
                strArr2[1] = uuid.length() != 0 ? str.concat(uuid) : new String(str);
                asList = Arrays.asList(strArr2);
            }
        } else {
            asList = new ArrayList();
        }
        this.f16170f = asList;
    }

    /* renamed from: a */
    public static void m19887a() {
        synchronized (f16165a) {
            f16166b = false;
            f16167c = false;
            hx.m19916e("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m19888a(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m19889a(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    private static void m19889a(JsonWriter jsonWriter, @Nullable Map<String, ?> map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!f16169e.contains(str)) {
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            hx.m19913c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String str2 : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(str2);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m19890a(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    private final void m19891a(String str, hw hwVar) {
        Writer stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f16168d.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f16170f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            hwVar.mo4625a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (Throwable e) {
            hx.m19912b("unable to log", e);
        }
        m19900c(stringWriter.toString());
    }

    /* renamed from: a */
    static final /* synthetic */ void m19892a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name(ManagerWebServices.PARAM_SPOTIFY_URI).value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m19889a(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(C2518b.a(bArr));
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    public static void m19893a(boolean z) {
        synchronized (f16165a) {
            f16166b = true;
            f16167c = z;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m19894a(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        String str;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a = C2518b.a(bArr);
        if (length < 10000) {
            str = "body";
        } else {
            a = hn.m19864a(a);
            if (a != null) {
                str = "bodydigest";
            }
            jsonWriter.name("bodylength").value((long) length);
            jsonWriter.endObject();
        }
        jsonWriter.name(str).value(a);
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    public static boolean m19895a(Context context) {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        return ((Boolean) aja.m19221f().m19334a(alo.aT)).booleanValue() && Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    /* renamed from: b */
    private final void m19896b(@Nullable String str) {
        m19891a("onNetworkRequestError", new hu(str));
    }

    /* renamed from: b */
    private final void m19897b(String str, String str2, @Nullable Map<String, ?> map, @Nullable byte[] bArr) {
        m19891a("onNetworkRequest", new hr(str, str2, map, bArr));
    }

    /* renamed from: b */
    private final void m19898b(@Nullable Map<String, ?> map, int i) {
        m19891a("onNetworkResponse", new hs(i, map));
    }

    /* renamed from: b */
    public static boolean m19899b() {
        boolean z;
        synchronized (f16165a) {
            z = f16166b;
        }
        return z;
    }

    /* renamed from: c */
    private static synchronized void m19900c(String str) {
        synchronized (hq.class) {
            hx.m19915d("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + GlobalConfig.DEFAULT_RECS_INTERVAL;
                String str2 = "GMA Debug CONTENT ";
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                hx.m19915d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                i = i2;
            }
            hx.m19915d("GMA Debug FINISH");
        }
    }

    /* renamed from: c */
    public static boolean m19901c() {
        boolean z;
        synchronized (f16165a) {
            z = f16166b && f16167c;
        }
        return z;
    }

    /* renamed from: a */
    public final void m19902a(@Nullable String str) {
        if (m19901c() && str != null) {
            m19907a(str.getBytes());
        }
    }

    /* renamed from: a */
    public final void m19903a(String str, String str2, @Nullable Map<String, ?> map, @Nullable byte[] bArr) {
        if (m19901c()) {
            m19897b(str, str2, map, bArr);
        }
    }

    /* renamed from: a */
    public final void m19904a(HttpURLConnection httpURLConnection, int i) {
        String responseMessage;
        if (m19901c()) {
            m19898b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < Callback.DEFAULT_DRAG_ANIMATION_DURATION || i >= MapboxConstants.ANIMATION_DURATION) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String str = "Can not get error message from error HttpURLConnection\n";
                    responseMessage = String.valueOf(e.getMessage());
                    hx.m19916e(responseMessage.length() != 0 ? str.concat(responseMessage) : new String(str));
                    responseMessage = null;
                }
                m19896b(responseMessage);
            }
        }
    }

    /* renamed from: a */
    public final void m19905a(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        if (m19901c()) {
            m19897b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* renamed from: a */
    public final void m19906a(@Nullable Map<String, ?> map, int i) {
        if (m19901c()) {
            m19898b(map, i);
            if (i < Callback.DEFAULT_DRAG_ANIMATION_DURATION || i >= MapboxConstants.ANIMATION_DURATION) {
                m19896b(null);
            }
        }
    }

    /* renamed from: a */
    public final void m19907a(byte[] bArr) {
        m19891a("onNetworkResponseBody", new ht(bArr));
    }
}
