package com.google.android.m4b.maps.p102b;

import com.google.android.m4b.maps.p101a.C4525k;
import com.tinder.api.ManagerWebServices;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.google.android.m4b.maps.b.f */
public final class C6423f implements C4739e {
    /* renamed from: a */
    private final C4740a f23833a;
    /* renamed from: b */
    private final SSLSocketFactory f23834b;

    /* renamed from: com.google.android.m4b.maps.b.f$a */
    public interface C4740a {
        /* renamed from: a */
        String mo4898a(String str);
    }

    public C6423f() {
        this(null);
    }

    public C6423f(C4740a c4740a) {
        this(c4740a, null);
    }

    private C6423f(C4740a c4740a, SSLSocketFactory sSLSocketFactory) {
        this.f23833a = c4740a;
        this.f23834b = null;
    }

    /* renamed from: a */
    public final HttpResponse mo4903a(C4525k<?> c4525k, Map<String, String> map) {
        String c = c4525k.m20434c();
        HashMap hashMap = new HashMap();
        hashMap.putAll(c4525k.mo4887h());
        hashMap.putAll(map);
        if (this.f23833a != null) {
            map = this.f23833a.mo4898a(c);
            if (map == null) {
                map = new StringBuilder("URL blocked by rewriter: ");
                map.append(c);
                throw new IOException(map.toString());
            }
        }
        map = c;
        URL url = new URL(map);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        int n = c4525k.m20445n();
        httpURLConnection.setConnectTimeout(n);
        httpURLConnection.setReadTimeout(n);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && this.f23834b != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f23834b);
        }
        for (String str : hashMap.keySet()) {
            httpURLConnection.addRequestProperty(str, (String) hashMap.get(str));
        }
        switch (c4525k.m20422a()) {
            case -1:
                byte[] i = c4525k.m20440i();
                if (i != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.addRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, c4525k.mo4888j());
                    c4525k = new DataOutputStream(httpURLConnection.getOutputStream());
                    c4525k.write(i);
                    c4525k.close();
                    break;
                }
                break;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                C6423f.m28065a(httpURLConnection, (C4525k) c4525k);
                break;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                C6423f.m28065a(httpURLConnection, (C4525k) c4525k);
                break;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                C6423f.m28065a(httpURLConnection, (C4525k) c4525k);
                break;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
        c4525k = new ProtocolVersion("HTTP", 1, 1);
        if (httpURLConnection.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        c4525k = new BasicHttpResponse(new BasicStatusLine(c4525k, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage()));
        c4525k.setEntity(C6423f.m28064a(httpURLConnection));
        map = httpURLConnection.getHeaderFields().entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            if (entry.getKey() != null) {
                c4525k.addHeader(new BasicHeader((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return c4525k;
    }

    /* renamed from: a */
    private static org.apache.http.HttpEntity m28064a(java.net.HttpURLConnection r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = new org.apache.http.entity.BasicHttpEntity;
        r0.<init>();
        r1 = r3.getInputStream();	 Catch:{ IOException -> 0x000a }
        goto L_0x000e;
    L_0x000a:
        r1 = r3.getErrorStream();
    L_0x000e:
        r0.setContent(r1);
        r1 = r3.getContentLength();
        r1 = (long) r1;
        r0.setContentLength(r1);
        r1 = r3.getContentEncoding();
        r0.setContentEncoding(r1);
        r3 = r3.getContentType();
        r0.setContentType(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.b.f.a(java.net.HttpURLConnection):org.apache.http.HttpEntity");
    }

    /* renamed from: a */
    private static void m28065a(HttpURLConnection httpURLConnection, C4525k<?> c4525k) {
        byte[] k = c4525k.mo4889k();
        if (k != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, c4525k.mo4888j());
            c4525k = new DataOutputStream(httpURLConnection.getOutputStream());
            c4525k.write(k);
            c4525k.close();
        }
    }
}
