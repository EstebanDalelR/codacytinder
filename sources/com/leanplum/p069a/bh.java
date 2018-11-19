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

/* renamed from: com.leanplum.a.bh */
final class bh {
    /* renamed from: a */
    private String f21200a;
    /* renamed from: b */
    private bn f21201b;
    /* renamed from: c */
    private String f21202c;
    /* renamed from: d */
    private int f21203d;
    /* renamed from: e */
    private br f21204e;
    /* renamed from: f */
    private Handler f21205f;
    /* renamed from: g */
    private Looper f21206g;

    public bh(URI uri, bn bnVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri.toString().replaceAll("/$", ""));
        stringBuilder.append("/socket.io/1/");
        this.f21200a = stringBuilder.toString();
        this.f21201b = bnVar;
    }

    /* renamed from: c */
    private static String m25092c() {
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

    /* renamed from: a */
    private static byte[] m25087a(InputStream inputStream) throws IOException {
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
    private static String m25088b(InputStream inputStream) throws IOException {
        return new String(bh.m25087a(inputStream));
    }

    /* renamed from: a */
    public final void m25100a(String str, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("args", jSONArray);
        this.f21205f.post(new bi(this, jSONObject));
    }

    /* renamed from: d */
    private void m25094d() throws URISyntaxException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f21200a);
        stringBuilder.append("websocket/");
        stringBuilder.append(this.f21202c);
        this.f21204e = new br(new URI(stringBuilder.toString()), new bj(this), null);
        this.f21204e.m25127b();
    }

    /* renamed from: a */
    public final void m25099a() throws IOException {
        m25096e();
    }

    /* renamed from: e */
    private void m25096e() {
        if (this.f21204e != null) {
            this.f21204e.m25129c();
            this.f21204e = null;
        }
        if (this.f21206g != null) {
            this.f21206g.quit();
        }
        this.f21206g = null;
        this.f21205f = null;
    }

    /* renamed from: b */
    public final void m25101b() {
        if (this.f21204e == null) {
            new bm(this).start();
        }
    }

    /* renamed from: b */
    private static String m25089b(HttpUriRequest httpUriRequest) throws IOException {
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
            stringBuilder3 = new String(bh.m25087a(newInstance.execute(httpUriRequest).getEntity().getContent()));
            return stringBuilder3;
        } finally {
            newInstance.close();
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m25098g(bh bhVar) throws URISyntaxException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bhVar.f21200a);
        stringBuilder.append("websocket/");
        stringBuilder.append(bhVar.f21202c);
        bhVar.f21204e = new br(new URI(stringBuilder.toString()), new bj(bhVar), null);
        bhVar.f21204e.m25127b();
    }
}
