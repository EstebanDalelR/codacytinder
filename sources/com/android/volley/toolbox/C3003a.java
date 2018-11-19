package com.android.volley.toolbox;

import com.android.volley.C0911f;
import com.android.volley.Cache.C0901a;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.tinder.api.ManagerWebServices;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.impl.cookie.DateUtils;

/* renamed from: com.android.volley.toolbox.a */
public class C3003a implements Network {
    /* renamed from: a */
    protected static final boolean f9336a = C0911f.f2387b;
    /* renamed from: d */
    private static int f9337d = 3000;
    /* renamed from: e */
    private static int f9338e = 4096;
    /* renamed from: b */
    protected final HttpStack f9339b;
    /* renamed from: c */
    protected final C0914b f9340c;

    public C3003a(HttpStack httpStack) {
        this(httpStack, new C0914b(f9338e));
    }

    public C3003a(HttpStack httpStack, C0914b c0914b) {
        this.f9339b = httpStack;
        this.f9340c = c0914b;
    }

    public com.android.volley.NetworkResponse performRequest(com.android.volley.Request<?> r25) throws com.android.volley.VolleyError {
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
        r24 = this;
        r7 = r24;
        r8 = r25;
        r9 = android.os.SystemClock.elapsedRealtime();
    L_0x0008:
        r1 = java.util.Collections.emptyMap();
        r2 = 0;
        r11 = 0;
        r12 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        r13 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        r3 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00ed }
        r3.<init>();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00ed }
        r4 = r25.getCacheEntry();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00ed }
        r7.m11628a(r3, r4);	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00ed }
        r4 = r7.f9339b;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00ed }
        r14 = r4.performRequest(r8, r3);	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00ed }
        r6 = r14.getStatusLine();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00e7 }
        r15 = r6.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00e7 }
        r3 = r14.getAllHeaders();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00e7 }
        r5 = com.android.volley.toolbox.C3003a.m11625a(r3);	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00e7 }
        r1 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r15 != r1) goto L_0x007c;
    L_0x0038:
        r1 = r25.getCacheEntry();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        if (r1 != 0) goto L_0x0055;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
    L_0x003e:
        r1 = new com.android.volley.NetworkResponse;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r17 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r18 = 0;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r20 = 1;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r6 = 0;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r21 = r3 - r9;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r16 = r1;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r19 = r5;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r16.<init>(r17, r18, r19, r20, r21);	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        return r1;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
    L_0x0055:
        r3 = r1.f2334g;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r3.putAll(r5);	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r3 = new com.android.volley.NetworkResponse;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r16 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r4 = r1.f2328a;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r1 = r1.f2334g;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r19 = 1;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r17 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r6 = 0;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r20 = r17 - r9;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r15 = r3;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r17 = r4;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r18 = r1;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r15.<init>(r16, r17, r18, r19, r20);	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        return r3;
    L_0x0074:
        r0 = move-exception;
        r1 = r0;
        r17 = r2;
        r18 = r5;
        goto L_0x00f4;
    L_0x007c:
        if (r15 == r13) goto L_0x0080;
    L_0x007e:
        if (r15 != r12) goto L_0x008b;
    L_0x0080:
        r1 = "Location";	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00de }
        r1 = r5.get(r1);	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00de }
        r1 = (java.lang.String) r1;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00de }
        r8.setRedirectUrl(r1);	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00de }
    L_0x008b:
        r1 = r14.getEntity();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00de }
        if (r1 == 0) goto L_0x009a;
    L_0x0091:
        r1 = r14.getEntity();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        r1 = r7.m11629a(r1);	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x0074 }
        goto L_0x009c;
    L_0x009a:
        r1 = new byte[r11];	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00de }
    L_0x009c:
        r22 = r1;
        r1 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d7 }
        r3 = 0;
        r3 = r1 - r9;
        r1 = r7;
        r2 = r3;
        r4 = r8;
        r23 = r5;
        r5 = r22;
        r1.m11626a(r2, r4, r5, r6);	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        if (r15 < r1) goto L_0x00cf;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
    L_0x00b3:
        r1 = 299; // 0x12b float:4.19E-43 double:1.477E-321;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        if (r15 <= r1) goto L_0x00b8;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
    L_0x00b7:
        goto L_0x00cf;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
    L_0x00b8:
        r1 = new com.android.volley.NetworkResponse;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r19 = 0;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r4 = 0;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r20 = r2 - r9;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r2 = r15;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r15 = r1;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r16 = r2;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r17 = r22;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r18 = r23;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r15.<init>(r16, r17, r18, r19, r20);	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        return r1;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
    L_0x00cf:
        r1 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        r1.<init>();	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
        throw r1;	 Catch:{ SocketTimeoutException -> 0x019f, ConnectTimeoutException -> 0x0193, MalformedURLException -> 0x0176, IOException -> 0x00d5 }
    L_0x00d5:
        r0 = move-exception;
        goto L_0x00da;
    L_0x00d7:
        r0 = move-exception;
        r23 = r5;
    L_0x00da:
        r1 = r0;
        r17 = r22;
        goto L_0x00e4;
    L_0x00de:
        r0 = move-exception;
        r23 = r5;
        r1 = r0;
        r17 = r2;
    L_0x00e4:
        r18 = r23;
        goto L_0x00f4;
    L_0x00e7:
        r0 = move-exception;
        r18 = r1;
        r17 = r2;
        goto L_0x00f3;
    L_0x00ed:
        r0 = move-exception;
        r18 = r1;
        r14 = r2;
        r17 = r14;
    L_0x00f3:
        r1 = r0;
    L_0x00f4:
        if (r14 == 0) goto L_0x0170;
    L_0x00f6:
        r2 = r14.getStatusLine();
        r2 = r2.getStatusCode();
        r3 = 1;
        r4 = 2;
        if (r2 == r13) goto L_0x0119;
    L_0x0102:
        if (r2 != r12) goto L_0x0105;
    L_0x0104:
        goto L_0x0119;
    L_0x0105:
        r5 = "Unexpected response code %d for %s";
        r4 = new java.lang.Object[r4];
        r6 = java.lang.Integer.valueOf(r2);
        r4[r11] = r6;
        r6 = r25.getUrl();
        r4[r3] = r6;
        com.android.volley.C0911f.m3058c(r5, r4);
        goto L_0x012c;
    L_0x0119:
        r5 = "Request at %s has been redirected to %s";
        r4 = new java.lang.Object[r4];
        r6 = r25.getOriginUrl();
        r4[r11] = r6;
        r6 = r25.getUrl();
        r4[r3] = r6;
        com.android.volley.C0911f.m3058c(r5, r4);
    L_0x012c:
        if (r17 == 0) goto L_0x016a;
    L_0x012e:
        r1 = new com.android.volley.NetworkResponse;
        r19 = 0;
        r3 = android.os.SystemClock.elapsedRealtime();
        r20 = r3 - r9;
        r15 = r1;
        r16 = r2;
        r15.<init>(r16, r17, r18, r19, r20);
        r3 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r2 == r3) goto L_0x015e;
    L_0x0142:
        r3 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r2 != r3) goto L_0x0147;
    L_0x0146:
        goto L_0x015e;
    L_0x0147:
        if (r2 == r13) goto L_0x0152;
    L_0x0149:
        if (r2 != r12) goto L_0x014c;
    L_0x014b:
        goto L_0x0152;
    L_0x014c:
        r2 = new com.android.volley.ServerError;
        r2.<init>(r1);
        throw r2;
    L_0x0152:
        r2 = "redirect";
        r3 = new com.android.volley.RedirectError;
        r3.<init>(r1);
        com.android.volley.toolbox.C3003a.m11627a(r2, r8, r3);
        goto L_0x0008;
    L_0x015e:
        r2 = "auth";
        r3 = new com.android.volley.AuthFailureError;
        r3.<init>(r1);
        com.android.volley.toolbox.C3003a.m11627a(r2, r8, r3);
        goto L_0x0008;
    L_0x016a:
        r2 = new com.android.volley.NetworkError;
        r2.<init>(r1);
        throw r2;
    L_0x0170:
        r2 = new com.android.volley.NoConnectionError;
        r2.<init>(r1);
        throw r2;
    L_0x0176:
        r0 = move-exception;
        r1 = r0;
        r2 = new java.lang.RuntimeException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Bad URL ";
        r3.append(r4);
        r4 = r25.getUrl();
        r3.append(r4);
        r3 = r3.toString();
        r2.<init>(r3, r1);
        throw r2;
    L_0x0193:
        r1 = "connection";
        r2 = new com.android.volley.TimeoutError;
        r2.<init>();
        com.android.volley.toolbox.C3003a.m11627a(r1, r8, r2);
        goto L_0x0008;
    L_0x019f:
        r1 = "socket";
        r2 = new com.android.volley.TimeoutError;
        r2.<init>();
        com.android.volley.toolbox.C3003a.m11627a(r1, r8, r2);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.a.performRequest(com.android.volley.Request):com.android.volley.NetworkResponse");
    }

    /* renamed from: a */
    private void m11626a(long j, Request<?> request, byte[] bArr, StatusLine statusLine) {
        if (f9336a || j > ((long) f9337d)) {
            String str = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : ManagerWebServices.NULL_STRING_VALUE;
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount());
            C0911f.m3057b(str, objArr);
        }
    }

    /* renamed from: a */
    private static void m11627a(String str, Request<?> request, VolleyError volleyError) throws VolleyError {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.retry(volleyError);
            request.addMarker(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(timeoutMs)}));
        } catch (VolleyError volleyError2) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(timeoutMs)}));
            throw volleyError2;
        }
    }

    /* renamed from: a */
    private void m11628a(Map<String, String> map, C0901a c0901a) {
        if (c0901a != null) {
            if (c0901a.f2329b != null) {
                map.put("If-None-Match", c0901a.f2329b);
            }
            if (c0901a.f2331d > 0) {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(c0901a.f2331d)));
            }
        }
    }

    /* renamed from: a */
    private byte[] m11629a(org.apache.http.HttpEntity r7) throws java.io.IOException, com.android.volley.ServerError {
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
        r6 = this;
        r0 = new com.android.volley.toolbox.h;
        r1 = r6.f9340c;
        r2 = r7.getContentLength();
        r2 = (int) r2;
        r0.<init>(r1, r2);
        r1 = 0;
        r2 = 0;
        r3 = r7.getContent();	 Catch:{ all -> 0x0048 }
        if (r3 != 0) goto L_0x001a;	 Catch:{ all -> 0x0048 }
    L_0x0014:
        r3 = new com.android.volley.ServerError;	 Catch:{ all -> 0x0048 }
        r3.<init>();	 Catch:{ all -> 0x0048 }
        throw r3;	 Catch:{ all -> 0x0048 }
    L_0x001a:
        r4 = r6.f9340c;	 Catch:{ all -> 0x0048 }
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ all -> 0x0048 }
        r4 = r4.m3064a(r5);	 Catch:{ all -> 0x0048 }
    L_0x0022:
        r2 = r3.read(r4);	 Catch:{ all -> 0x0045 }
        r5 = -1;	 Catch:{ all -> 0x0045 }
        if (r2 == r5) goto L_0x002d;	 Catch:{ all -> 0x0045 }
    L_0x0029:
        r0.write(r4, r1, r2);	 Catch:{ all -> 0x0045 }
        goto L_0x0022;	 Catch:{ all -> 0x0045 }
    L_0x002d:
        r2 = r0.toByteArray();	 Catch:{ all -> 0x0045 }
        r7.consumeContent();	 Catch:{ IOException -> 0x0035 }
        goto L_0x003c;
    L_0x0035:
        r7 = "Error occured when calling consumingContent";
        r1 = new java.lang.Object[r1];
        com.android.volley.C0911f.m3055a(r7, r1);
    L_0x003c:
        r7 = r6.f9340c;
        r7.m3063a(r4);
        r0.close();
        return r2;
    L_0x0045:
        r3 = move-exception;
        r2 = r4;
        goto L_0x0049;
    L_0x0048:
        r3 = move-exception;
    L_0x0049:
        r7.consumeContent();	 Catch:{ IOException -> 0x004d }
        goto L_0x0054;
    L_0x004d:
        r7 = "Error occured when calling consumingContent";
        r1 = new java.lang.Object[r1];
        com.android.volley.C0911f.m3055a(r7, r1);
    L_0x0054:
        r7 = r6.f9340c;
        r7.m3063a(r2);
        r0.close();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.a.a(org.apache.http.HttpEntity):byte[]");
    }

    /* renamed from: a */
    protected static Map<String, String> m11625a(Header[] headerArr) {
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }
}
