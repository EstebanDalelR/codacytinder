package com.tinder.api;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.toolbox.HttpStack;
import com.tinder.analytics.fireworks.api.C6224b;
import com.tinder.common.utils.C8578a;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.C15958m;
import okhttp3.C15963q.C15962a;
import okhttp3.C15964r;
import okhttp3.C15966s;
import okhttp3.C15968t;
import okhttp3.C17692o;
import okhttp3.C17692o.C15961a;
import okhttp3.Protocol;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class OkHttpStack implements HttpStack {
    private final C17692o mClient;
    private final EnvironmentProvider mEnvironmentProvider;
    private final C6224b mFireworksUrlProvider;

    /* renamed from: com.tinder.api.OkHttpStack$1 */
    static /* synthetic */ class C62451 {
        static final /* synthetic */ int[] $SwitchMap$okhttp3$Protocol = new int[Protocol.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = okhttp3.Protocol.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$okhttp3$Protocol = r0;
            r0 = $SwitchMap$okhttp3$Protocol;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = okhttp3.Protocol.HTTP_1_0;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$okhttp3$Protocol;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = okhttp3.Protocol.HTTP_1_1;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$okhttp3$Protocol;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = okhttp3.Protocol.SPDY_3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = $SwitchMap$okhttp3$Protocol;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = okhttp3.Protocol.HTTP_2;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.OkHttpStack.1.<clinit>():void");
        }
    }

    public OkHttpStack(C17692o c17692o, EnvironmentProvider environmentProvider, C6224b c6224b) {
        this.mClient = c17692o;
        this.mEnvironmentProvider = environmentProvider;
        this.mFireworksUrlProvider = c6224b;
    }

    public HttpResponse performRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        C15961a z = this.mClient.z();
        long timeoutMs = (long) request.getTimeoutMs();
        z.a(timeoutMs, TimeUnit.MILLISECONDS);
        z.b(timeoutMs, TimeUnit.MILLISECONDS);
        z.c(timeoutMs, TimeUnit.MILLISECONDS);
        C15962a c15962a = new C15962a();
        c15962a.a(parseUrlFromRequest(request));
        applyHeaders(request, map, c15962a);
        setConnectionParametersForRequest(c15962a, request);
        request = z.b().newCall(c15962a.d()).execute();
        HttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(parseProtocol(request.b()), request.c(), request.e()));
        basicHttpResponse.setEntity(entityFromOkHttpResponse(request));
        request = request.g();
        map = request.a();
        for (int i = 0; i < map; i++) {
            String a = request.a(i);
            String b = request.b(i);
            if (a != null) {
                basicHttpResponse.addHeader(new BasicHeader(a, b));
            }
        }
        return basicHttpResponse;
    }

    @VisibleForTesting
    String parseUrlFromRequest(@NonNull Request request) {
        request = request.getUrl();
        if (!C8578a.a(request)) {
            if (!request.contains("http")) {
                String parseBaseUrlForPath = parseBaseUrlForPath(request);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(parseBaseUrlForPath);
                stringBuilder.append(request);
                return stringBuilder.toString();
            }
        }
        return request;
    }

    protected void applyHeaders(Request<?> request, Map<String, String> map, C15962a c15962a) throws AuthFailureError {
        request = request.getHeaders();
        for (String str : request.keySet()) {
            c15962a.b(str, (String) request.get(str));
        }
        request = map.keySet().iterator();
        while (request.hasNext()) {
            String str2 = (String) request.next();
            c15962a.b(str2, (String) map.get(str2));
        }
    }

    private String parseBaseUrlForPath(String str) {
        if (str.hashCode() == -1107739771) {
            if (str.equals("batch/event") != null) {
                str = null;
                if (str == null) {
                    return this.mEnvironmentProvider.getUrlBase();
                }
                return this.mFireworksUrlProvider.m26861b();
            }
        }
        str = -1;
        if (str == null) {
            return this.mFireworksUrlProvider.m26861b();
        }
        return this.mEnvironmentProvider.getUrlBase();
    }

    private static HttpEntity entityFromOkHttpResponse(C15966s c15966s) throws IOException {
        HttpEntity basicHttpEntity = new BasicHttpEntity();
        C15968t h = c15966s.h();
        basicHttpEntity.setContent(h.byteStream());
        basicHttpEntity.setContentLength(h.contentLength());
        basicHttpEntity.setContentEncoding(c15966s.a("Content-Encoding"));
        if (h.contentType() != null) {
            basicHttpEntity.setContentType(h.contentType().a());
        }
        return basicHttpEntity;
    }

    private static void setConnectionParametersForRequest(C15962a c15962a, Request<?> request) throws IOException, AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    c15962a.a(C15964r.create(C15958m.a(request.getPostBodyContentType()), postBody));
                    return;
                }
                return;
            case 0:
                c15962a.a();
                return;
            case 1:
                c15962a.a(createRequestBody(request));
                return;
            case 2:
                c15962a.c(createRequestBody(request));
                return;
            case 3:
                c15962a.c();
                return;
            case 4:
                c15962a.b();
                return;
            case 5:
                c15962a.a("OPTIONS", null);
                return;
            case 6:
                c15962a.a("TRACE", null);
                return;
            case 7:
                c15962a.d(createRequestBody(request));
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private static ProtocolVersion parseProtocol(Protocol protocol) {
        switch (C62451.$SwitchMap$okhttp3$Protocol[protocol.ordinal()]) {
            case 1:
                return new ProtocolVersion("HTTP", 1, 0);
            case 2:
                return new ProtocolVersion("HTTP", 1, 1);
            case 3:
                return new ProtocolVersion("SPDY", 3, 1);
            case 4:
                return new ProtocolVersion("HTTP", 2, 0);
            default:
                throw new IllegalAccessError("Unkwown protocol");
        }
    }

    private static C15964r createRequestBody(Request request) throws AuthFailureError {
        byte[] body = request.getBody();
        if (body == null) {
            return null;
        }
        return C15964r.create(C15958m.a(request.getBodyContentType()), body);
    }
}
