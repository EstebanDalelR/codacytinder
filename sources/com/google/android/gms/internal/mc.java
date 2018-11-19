package com.google.android.gms.internal;

import com.tinder.api.ManagerWebServices;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.SSLSocketFactory;

public final class mc extends ex {
    /* renamed from: a */
    private final zzas f26929a;
    /* renamed from: b */
    private final SSLSocketFactory f26930b;

    public mc() {
        this(null);
    }

    private mc(zzas zzas) {
        this(null, null);
    }

    private mc(zzas zzas, SSLSocketFactory sSLSocketFactory) {
        this.f26929a = null;
        this.f26930b = null;
    }

    /* renamed from: a */
    private static java.io.InputStream m31606a(java.net.HttpURLConnection r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r1.getInputStream();	 Catch:{ IOException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = r1.getErrorStream();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mc.a(java.net.HttpURLConnection):java.io.InputStream");
    }

    /* renamed from: a */
    private static List<ajr> m31607a(Map<String, List<String>> map) {
        List<ajr> arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String ajr : (List) entry.getValue()) {
                    arrayList.add(new ajr((String) entry.getKey(), ajr));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m31608a(HttpURLConnection httpURLConnection, aom<?> aom) throws IOException, zza {
        byte[] a = aom.mo6871a();
        if (a != null) {
            httpURLConnection.setDoOutput(true);
            String str = ManagerWebServices.PARAM_CONTENT_TYPE;
            String str2 = "application/x-www-form-urlencoded; charset=";
            String valueOf = String.valueOf("UTF-8");
            httpURLConnection.addRequestProperty(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(a);
            dataOutputStream.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final com.google.android.gms.internal.ma mo6862a(com.google.android.gms.internal.aom<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException, com.google.android.gms.internal.zza {
        /*
        r6 = this;
        r0 = r7.m19392e();
        r1 = new java.util.HashMap;
        r1.<init>();
        r2 = r7.mo6872b();
        r1.putAll(r2);
        r1.putAll(r8);
        r8 = r6.f26929a;
        if (r8 == 0) goto L_0x003c;
    L_0x0017:
        r8 = r6.f26929a;
        r8 = r8.zzg(r0);
        if (r8 != 0) goto L_0x003d;
    L_0x001f:
        r7 = new java.io.IOException;
        r8 = "URL blocked by rewriter: ";
        r0 = java.lang.String.valueOf(r0);
        r1 = r0.length();
        if (r1 == 0) goto L_0x0032;
    L_0x002d:
        r8 = r8.concat(r0);
        goto L_0x0038;
    L_0x0032:
        r0 = new java.lang.String;
        r0.<init>(r8);
        r8 = r0;
    L_0x0038:
        r7.<init>(r8);
        throw r7;
    L_0x003c:
        r8 = r0;
    L_0x003d:
        r0 = new java.net.URL;
        r0.<init>(r8);
        r8 = r0.openConnection();
        r8 = (java.net.HttpURLConnection) r8;
        r2 = java.net.HttpURLConnection.getFollowRedirects();
        r8.setInstanceFollowRedirects(r2);
        r2 = r7.m19395h();
        r8.setConnectTimeout(r2);
        r8.setReadTimeout(r2);
        r2 = 0;
        r8.setUseCaches(r2);
        r3 = 1;
        r8.setDoInput(r3);
        r4 = "https";
        r0 = r0.getProtocol();
        r4.equals(r0);
        r0 = r1.keySet();
        r0 = r0.iterator();
    L_0x0072:
        r4 = r0.hasNext();
        if (r4 == 0) goto L_0x0088;
    L_0x0078:
        r4 = r0.next();
        r4 = (java.lang.String) r4;
        r5 = r1.get(r4);
        r5 = (java.lang.String) r5;
        r8.addRequestProperty(r4, r5);
        goto L_0x0072;
    L_0x0088:
        r0 = r7.m19389c();
        switch(r0) {
            case -1: goto L_0x00b7;
            case 0: goto L_0x00b2;
            case 1: goto L_0x00a9;
            case 2: goto L_0x00a6;
            case 3: goto L_0x00a3;
            case 4: goto L_0x00a0;
            case 5: goto L_0x009d;
            case 6: goto L_0x009a;
            case 7: goto L_0x0097;
            default: goto L_0x008f;
        };
    L_0x008f:
        r7 = new java.lang.IllegalStateException;
        r8 = "Unknown method type.";
        r7.<init>(r8);
        throw r7;
    L_0x0097:
        r0 = "PATCH";
        goto L_0x00ab;
    L_0x009a:
        r0 = "TRACE";
        goto L_0x00b4;
    L_0x009d:
        r0 = "OPTIONS";
        goto L_0x00b4;
    L_0x00a0:
        r0 = "HEAD";
        goto L_0x00b4;
    L_0x00a3:
        r0 = "DELETE";
        goto L_0x00b4;
    L_0x00a6:
        r0 = "PUT";
        goto L_0x00ab;
    L_0x00a9:
        r0 = "POST";
    L_0x00ab:
        r8.setRequestMethod(r0);
        m31608a(r8, r7);
        goto L_0x00b7;
    L_0x00b2:
        r0 = "GET";
    L_0x00b4:
        r8.setRequestMethod(r0);
    L_0x00b7:
        r0 = r8.getResponseCode();
        r1 = -1;
        if (r0 != r1) goto L_0x00c6;
    L_0x00be:
        r7 = new java.io.IOException;
        r8 = "Could not retrieve response code from HttpUrlConnection.";
        r7.<init>(r8);
        throw r7;
    L_0x00c6:
        r7 = r7.m19389c();
        r1 = 4;
        if (r7 == r1) goto L_0x00de;
    L_0x00cd:
        r7 = 100;
        if (r7 > r0) goto L_0x00d5;
    L_0x00d1:
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 < r7) goto L_0x00de;
    L_0x00d5:
        r7 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        if (r0 == r7) goto L_0x00de;
    L_0x00d9:
        r7 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r0 == r7) goto L_0x00de;
    L_0x00dd:
        r2 = 1;
    L_0x00de:
        if (r2 != 0) goto L_0x00ee;
    L_0x00e0:
        r7 = new com.google.android.gms.internal.ma;
        r8 = r8.getHeaderFields();
        r8 = m31607a(r8);
        r7.<init>(r0, r8);
        return r7;
    L_0x00ee:
        r7 = new com.google.android.gms.internal.ma;
        r1 = r8.getHeaderFields();
        r1 = m31607a(r1);
        r2 = r8.getContentLength();
        r8 = m31606a(r8);
        r7.<init>(r0, r1, r2, r8);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mc.a(com.google.android.gms.internal.aom, java.util.Map):com.google.android.gms.internal.ma");
    }
}
