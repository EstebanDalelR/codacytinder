package com.android.volley.toolbox;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
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
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class HurlStack implements HttpStack {
    /* renamed from: a */
    private final UrlRewriter f9334a;
    /* renamed from: b */
    private final SSLSocketFactory f9335b;

    public interface UrlRewriter {
        String rewriteUrl(String str);
    }

    /* renamed from: a */
    private static boolean m11622a(int i, int i2) {
        return (i == 4 || ((100 <= i2 && i2 < Callback.DEFAULT_DRAG_ANIMATION_DURATION) || i2 == 204 || i2 == 304)) ? false : true;
    }

    public HttpResponse performRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        String url = request.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(request.getHeaders());
        hashMap.putAll(map);
        if (this.f9334a != null) {
            map = this.f9334a.rewriteUrl(url);
            if (map == null) {
                map = new StringBuilder();
                map.append("URL blocked by rewriter: ");
                map.append(url);
                throw new IOException(map.toString());
            }
        }
        map = url;
        HttpURLConnection a = m11619a(new URL(map), (Request) request);
        for (String str : hashMap.keySet()) {
            a.addRequestProperty(str, (String) hashMap.get(str));
        }
        m11621a(a, (Request) request);
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (a.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        StatusLine basicStatusLine = new BasicStatusLine(protocolVersion, a.getResponseCode(), a.getResponseMessage());
        HttpResponse basicHttpResponse = new BasicHttpResponse(basicStatusLine);
        if (m11622a(request.getMethod(), basicStatusLine.getStatusCode()) != null) {
            basicHttpResponse.setEntity(m11620a(a));
        }
        request = a.getHeaderFields().entrySet().iterator();
        while (request.hasNext() != null) {
            Entry entry = (Entry) request.next();
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return basicHttpResponse;
    }

    /* renamed from: a */
    private static org.apache.http.HttpEntity m11620a(java.net.HttpURLConnection r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.HurlStack.a(java.net.HttpURLConnection):org.apache.http.HttpEntity");
    }

    /* renamed from: a */
    protected HttpURLConnection m11624a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: a */
    private HttpURLConnection m11619a(URL url, Request<?> request) throws IOException {
        HttpURLConnection a = m11624a(url);
        request = request.getTimeoutMs();
        a.setConnectTimeout(request);
        a.setReadTimeout(request);
        a.setUseCaches(null);
        a.setDoInput(true);
        if (!("https".equals(url.getProtocol()) == null || this.f9335b == null)) {
            ((HttpsURLConnection) a).setSSLSocketFactory(this.f9335b);
        }
        return a;
    }

    /* renamed from: a */
    static void m11621a(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.addRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, request.getPostBodyContentType());
                    request = new DataOutputStream(httpURLConnection.getOutputStream());
                    request.write(postBody);
                    request.close();
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m11623b(httpURLConnection, request);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m11623b(httpURLConnection, request);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m11623b(httpURLConnection, request);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* renamed from: b */
    private static void m11623b(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, request.getBodyContentType());
            request = new DataOutputStream(httpURLConnection.getOutputStream());
            request.write(body);
            request.close();
        }
    }
}
