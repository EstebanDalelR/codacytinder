package com.leanplum.p069a;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.leanplum.a.br */
final class br {
    /* renamed from: a */
    private static final String f21215a = "WebSocketClient";
    /* renamed from: k */
    private static TrustManager[] f21216k;
    /* renamed from: b */
    private URI f21217b;
    /* renamed from: c */
    private bv f21218c;
    /* renamed from: d */
    private Socket f21219d;
    /* renamed from: e */
    private Thread f21220e;
    /* renamed from: f */
    private HandlerThread f21221f;
    /* renamed from: g */
    private Handler f21222g;
    /* renamed from: h */
    private List<BasicNameValuePair> f21223h;
    /* renamed from: i */
    private C5729y f21224i;
    /* renamed from: j */
    private final Object f21225j = new Object();

    /* renamed from: a */
    private static void m25111a(TrustManager[] trustManagerArr) {
        f21216k = trustManagerArr;
    }

    public br(URI uri, bv bvVar, List<BasicNameValuePair> list) {
        this.f21217b = uri;
        this.f21218c = bvVar;
        this.f21223h = null;
        this.f21224i = new C5729y(this);
        this.f21221f = new HandlerThread("websocket-thread");
        this.f21221f.start();
        this.f21222g = new Handler(this.f21221f.getLooper());
    }

    /* renamed from: a */
    public final bv m25124a() {
        return this.f21218c;
    }

    /* renamed from: b */
    public final void m25127b() {
        if (this.f21220e == null || !this.f21220e.isAlive()) {
            this.f21220e = new Thread(new bs(this));
            this.f21220e.start();
        }
    }

    /* renamed from: c */
    public final void m25129c() {
        if (this.f21219d != null) {
            this.f21222g.post(new bt(this));
        }
    }

    /* renamed from: a */
    public final void m25125a(String str) {
        m25128b(this.f21224i.m25174a(str));
    }

    /* renamed from: a */
    public final void m25126a(byte[] bArr) {
        m25128b(this.f21224i.m25175a(bArr));
    }

    /* renamed from: b */
    private static StatusLine m25114b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return BasicLineParser.parseStatusLine(str, new BasicLineParser());
    }

    /* renamed from: c */
    private static Header m25116c(String str) {
        return BasicLineParser.parseHeader(str, new BasicLineParser());
    }

    /* renamed from: a */
    private static String m25107a(C5730z c5730z) throws IOException {
        int read = c5730z.read();
        if (read == -1) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("");
        while (read != 10) {
            if (read != 13) {
                stringBuilder.append((char) read);
            }
            read = c5730z.read();
            if (read == -1) {
                return null;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: d */
    private static String m25117d() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) ((int) (Math.random() * 256.0d));
        }
        return Base64.encodeToString(bArr, 0).trim();
    }

    /* renamed from: b */
    final void m25128b(byte[] bArr) {
        this.f21222g.post(new bu(this, bArr));
    }

    /* renamed from: e */
    private static SSLSocketFactory m25120e() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, f21216k, null);
        return instance.getSocketFactory();
    }

    /* renamed from: b */
    static /* synthetic */ SSLSocketFactory m25112b(br brVar) throws NoSuchAlgorithmException, KeyManagementException {
        brVar = SSLContext.getInstance("TLS");
        brVar.init(null, f21216k, null);
        return brVar.getSocketFactory();
    }

    /* renamed from: d */
    static /* synthetic */ String m25118d(br brVar) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) ((int) (Math.random() * 256.0d));
        }
        return Base64.encodeToString(bArr, 0).trim();
    }

    /* renamed from: a */
    static /* synthetic */ String m25106a(br brVar, C5730z c5730z) throws IOException {
        brVar = c5730z.read();
        if (brVar == -1) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("");
        while (brVar != 10) {
            if (brVar != 13) {
                stringBuilder.append((char) brVar);
            }
            brVar = c5730z.read();
            if (brVar == -1) {
                return null;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static /* synthetic */ StatusLine m25110a(br brVar, String str) {
        if (TextUtils.isEmpty(str) != null) {
            return null;
        }
        return BasicLineParser.parseStatusLine(str, new BasicLineParser());
    }
}
