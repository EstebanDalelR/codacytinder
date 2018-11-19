package com.leanplum.p069a;

import android.net.http.AndroidHttpClient;
import android.os.Handler;
import android.os.Looper;
import com.leanplum.Leanplum;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.client.methods.HttpUriRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.q */
public class C5727q {
    /* renamed from: A */
    private static String f21230A = "kinds";
    /* renamed from: B */
    private static String f21231B = "limitTracking";
    /* renamed from: C */
    private static String f21232C = "message";
    /* renamed from: D */
    private static String f21233D = "messageId";
    /* renamed from: E */
    private static String f21234E = "newUserId";
    /* renamed from: F */
    private static String f21235F = "newsfeedMessageId";
    /* renamed from: G */
    private static String f21236G = "newsfeedMessages";
    /* renamed from: H */
    private static String f21237H = "params";
    /* renamed from: I */
    private static String f21238I = "sdkVersion";
    /* renamed from: J */
    private static String f21239J = "state";
    /* renamed from: K */
    private static String f21240K = "time";
    /* renamed from: L */
    private static String f21241L = "type";
    /* renamed from: M */
    private static String f21242M = "token";
    /* renamed from: N */
    private static String f21243N = "trafficSource";
    /* renamed from: O */
    private static String f21244O = "updateDate";
    /* renamed from: P */
    private static String f21245P = "userId";
    /* renamed from: Q */
    private static String f21246Q = "userAttributes";
    /* renamed from: R */
    private static String f21247R = "value";
    /* renamed from: S */
    private static String f21248S = "vars";
    /* renamed from: T */
    private static String f21249T = "versionName";
    /* renamed from: a */
    private static String f21250a = "action";
    /* renamed from: b */
    private static String f21251b = "actionDefinitions";
    /* renamed from: c */
    private static String f21252c = "appId";
    /* renamed from: d */
    private static String f21253d = "background";
    /* renamed from: e */
    private static String f21254e = "client";
    /* renamed from: f */
    private static String f21255f = "clientKey";
    /* renamed from: g */
    private static String f21256g = "data";
    /* renamed from: h */
    private static String f21257h = "devMode";
    /* renamed from: i */
    private static String f21258i = "deviceId";
    /* renamed from: j */
    private static String f21259j = "deviceModel";
    /* renamed from: k */
    private static String f21260k = "deviceName";
    /* renamed from: l */
    private static String f21261l = "gcmRegistrationId";
    /* renamed from: m */
    private static String f21262m = "systemName";
    /* renamed from: n */
    private static String f21263n = "systemVersion";
    /* renamed from: o */
    private static String f21264o = "email";
    /* renamed from: p */
    private static String f21265p = "event";
    /* renamed from: q */
    private static String f21266q = "file";
    /* renamed from: r */
    private static String f21267r = "fileAttributes";
    /* renamed from: s */
    private static String f21268s = "googlePlayPurchaseData";
    /* renamed from: t */
    private static String f21269t = "googlePlayPurchaseDataSignature";
    /* renamed from: u */
    private static String f21270u = "currencyCode";
    /* renamed from: v */
    private static String f21271v = "item";
    /* renamed from: w */
    private static String f21272w = "includeDefaults";
    /* renamed from: x */
    private static String f21273x = "includeMessageId";
    /* renamed from: y */
    private static String f21274y = "info";
    /* renamed from: z */
    private static String f21275z = "installDate";
    /* renamed from: U */
    private String f21276U;
    /* renamed from: V */
    private bn f21277V;
    /* renamed from: W */
    private String f21278W;
    /* renamed from: X */
    private int f21279X;
    /* renamed from: Y */
    private ak f21280Y;
    /* renamed from: Z */
    private Handler f21281Z;
    private Looper aa;

    public C5727q(URI uri, bn bnVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri.toString().replaceAll("/$", ""));
        stringBuilder.append("/socket.io/1/");
        this.f21276U = stringBuilder.toString();
        this.f21277V = bnVar;
    }

    /* renamed from: c */
    private static String m25146c() {
        String stringBuilder;
        if (Leanplum.getContext() != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(bo.a(Leanplum.getContext()));
            stringBuilder2.append("/");
            stringBuilder2.append(bo.a());
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "websocket";
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder);
        stringBuilder3.append("(");
        stringBuilder3.append(aw.e());
        stringBuilder3.append("; ");
        stringBuilder3.append(C2590h.f8064i);
        stringBuilder3.append("; ");
        stringBuilder3.append(C2590h.f8063h);
        stringBuilder3.append("/p");
        stringBuilder3.append(")");
        return stringBuilder3.toString();
    }

    /* renamed from: b */
    private static String m25143b(HttpUriRequest httpUriRequest) throws IOException {
        String stringBuilder;
        if (Leanplum.getContext() != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(bo.a(Leanplum.getContext()));
            stringBuilder2.append("/");
            stringBuilder2.append(bo.a());
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "websocket";
        }
        String stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder);
        stringBuilder3.append("(");
        stringBuilder3.append(aw.e());
        stringBuilder3.append("; ");
        stringBuilder3.append(C2590h.f8064i);
        stringBuilder3.append("; ");
        stringBuilder3.append(C2590h.f8063h);
        stringBuilder3.append("/p");
        stringBuilder3.append(")");
        AndroidHttpClient newInstance = AndroidHttpClient.newInstance(stringBuilder3.toString());
        try {
            stringBuilder3 = new String(C5727q.m25141a(newInstance.execute(httpUriRequest).getEntity().getContent()));
            return stringBuilder3;
        } finally {
            newInstance.close();
        }
    }

    /* renamed from: a */
    private static byte[] m25141a(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        inputStream = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = dataInputStream.read(inputStream);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(inputStream, 0, read);
        }
    }

    /* renamed from: b */
    private static String m25142b(InputStream inputStream) throws IOException {
        return new String(C5727q.m25141a(inputStream));
    }

    /* renamed from: a */
    public void m25154a(String str, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("args", jSONArray);
        this.f21281Z.post(new bi(this, jSONObject));
    }

    /* renamed from: d */
    private void m25148d() throws URISyntaxException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f21276U);
        stringBuilder.append("websocket/");
        stringBuilder.append(this.f21278W);
        this.f21280Y = new ak(new URI(stringBuilder.toString()), new C7040r(this), null);
        this.f21280Y.m25058c();
    }

    /* renamed from: a */
    public void m25153a() throws IOException {
        m25150e();
    }

    /* renamed from: e */
    private void m25150e() {
        if (this.f21280Y != null) {
            this.f21280Y.m25059d();
            this.f21280Y = null;
        }
        if (this.aa != null) {
            this.aa.quit();
        }
        this.aa = null;
        this.f21281Z = null;
    }

    /* renamed from: b */
    public void m25155b() {
        if (this.f21280Y == null) {
            new bm(this).start();
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m25152g(C5727q c5727q) throws URISyntaxException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c5727q.f21276U);
        stringBuilder.append("websocket/");
        stringBuilder.append(c5727q.f21278W);
        c5727q.f21280Y = new ak(new URI(stringBuilder.toString()), new C7040r(c5727q), null);
        c5727q.f21280Y.m25058c();
    }
}
