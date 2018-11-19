package com.google.android.m4b.maps.p102b;

import com.google.android.m4b.maps.p101a.C4520e;
import com.google.android.m4b.maps.p101a.C4525k;
import com.google.android.m4b.maps.p101a.C4531o;
import com.google.android.m4b.maps.p101a.C4532r;
import com.google.android.m4b.maps.p101a.C4535s;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;

/* renamed from: com.google.android.m4b.maps.b.a */
public final class C6421a implements C4520e {
    /* renamed from: a */
    private static boolean f23824a = C4535s.f16849a;
    /* renamed from: b */
    private static int f23825b = 3000;
    /* renamed from: c */
    private static int f23826c = 4096;
    /* renamed from: d */
    private C4739e f23827d;
    /* renamed from: e */
    private C4735b f23828e;

    public C6421a(C4739e c4739e) {
        this(c4739e, new C4735b(f23826c));
    }

    private C6421a(C4739e c4739e, C4735b c4735b) {
        this.f23827d = c4739e;
        this.f23828e = c4735b;
    }

    /* renamed from: a */
    public final com.google.android.m4b.maps.p101a.C4522h mo4899a(com.google.android.m4b.maps.p101a.C4525k<?> r24) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r23 = this;
        r1 = r23;
        r2 = r24;
        r3 = android.os.SystemClock.elapsedRealtime();
    L_0x0008:
        r5 = java.util.Collections.emptyMap();
        r6 = 2;
        r7 = 1;
        r8 = 0;
        r10 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r10.<init>();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r11 = r24.m20436e();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        if (r11 == 0) goto L_0x003d;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
    L_0x001a:
        r12 = r11.f16771b;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        if (r12 == 0) goto L_0x0025;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
    L_0x001e:
        r12 = "If-None-Match";	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r13 = r11.f16771b;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r10.put(r12, r13);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
    L_0x0025:
        r12 = r11.f16773d;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r14 = 0;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        if (r16 <= 0) goto L_0x003d;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
    L_0x002d:
        r12 = new java.util.Date;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r13 = r11.f16773d;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r12.<init>(r13);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r11 = "If-Modified-Since";	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r12 = org.apache.http.impl.cookie.DateUtils.formatDate(r12);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r10.put(r11, r12);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
    L_0x003d:
        r11 = r1.f23827d;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r10 = r11.mo4903a(r2, r10);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0139 }
        r11 = r10.getStatusLine();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0134 }
        r13 = r11.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0134 }
        r12 = r10.getAllHeaders();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0134 }
        r12 = com.google.android.m4b.maps.p102b.C6421a.m28044a(r12);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0134 }
        r5 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r13 != r5) goto L_0x0098;
    L_0x0057:
        r5 = r24.m20436e();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        if (r5 != 0) goto L_0x0073;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
    L_0x005d:
        r5 = new com.google.android.m4b.maps.a.h;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r15 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r16 = 0;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r18 = 1;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r13 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r11 = 0;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r19 = r13 - r3;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r14 = r5;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r17 = r12;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r14.<init>(r15, r16, r17, r18, r19);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        return r5;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
    L_0x0073:
        r11 = r5.f16776g;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r11.putAll(r12);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r11 = new com.google.android.m4b.maps.a.h;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r14 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r15 = r5.f16770a;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r5 = r5.f16776g;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r17 = 1;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r18 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r13 = 0;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r20 = r18 - r3;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r13 = r11;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r16 = r5;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r18 = r20;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r13.<init>(r14, r15, r16, r17, r18);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        return r11;
    L_0x0092:
        r0 = move-exception;
        r5 = r0;
        r14 = r12;
    L_0x0095:
        r13 = 0;
        goto L_0x013e;
    L_0x0098:
        r5 = r10.getEntity();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x012a }
        if (r5 == 0) goto L_0x00a7;
    L_0x009e:
        r5 = r10.getEntity();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        r5 = r1.m28046a(r5);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0092 }
        goto L_0x00a9;
    L_0x00a7:
        r5 = new byte[r8];	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x012a }
    L_0x00a9:
        r14 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x0121 }
        r16 = 0;
        r22 = r10;
        r9 = r14 - r3;
        r14 = f23824a;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        if (r14 != 0) goto L_0x00c4;
    L_0x00b7:
        r14 = f23825b;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x00bf }
        r14 = (long) r14;
        r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1));
        if (r16 <= 0) goto L_0x00fa;
    L_0x00be:
        goto L_0x00c4;
    L_0x00bf:
        r0 = move-exception;
        r13 = r5;
        r14 = r12;
        goto L_0x0127;
    L_0x00c4:
        r14 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r15 = 5;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r15 = new java.lang.Object[r15];	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r15[r8] = r2;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r9 = java.lang.Long.valueOf(r9);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r15[r7] = r9;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        if (r5 == 0) goto L_0x00d9;
    L_0x00d3:
        r9 = r5.length;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x00bf }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x00bf }
        goto L_0x00db;
    L_0x00d9:
        r9 = "null";	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
    L_0x00db:
        r15[r6] = r9;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r9 = 3;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r10 = r11.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r15[r9] = r10;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r9 = 4;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r10 = r24.m20446o();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r10 = r10.m20462b();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r15[r9] = r10;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        com.google.android.m4b.maps.p101a.C4535s.m20469b(r14, r15);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
    L_0x00fa:
        r9 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        if (r13 < r9) goto L_0x0116;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
    L_0x00fe:
        r9 = 299; // 0x12b float:4.19E-43 double:1.477E-321;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        if (r13 <= r9) goto L_0x0103;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
    L_0x0102:
        goto L_0x0116;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
    L_0x0103:
        r9 = new com.google.android.m4b.maps.a.h;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r16 = 0;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r10 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011f }
        r14 = 0;
        r17 = r10 - r3;
        r10 = r12;
        r12 = r9;
        r14 = r5;
        r15 = r10;
        r12.<init>(r13, r14, r15, r16, r17);	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011d }
        return r9;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011d }
    L_0x0116:
        r10 = r12;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011d }
        r9 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011d }
        r9.<init>();	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011d }
        throw r9;	 Catch:{ SocketTimeoutException -> 0x01b9, ConnectTimeoutException -> 0x01ad, MalformedURLException -> 0x0193, IOException -> 0x011d }
    L_0x011d:
        r0 = move-exception;
        goto L_0x0125;
    L_0x011f:
        r0 = move-exception;
        goto L_0x0124;
    L_0x0121:
        r0 = move-exception;
        r22 = r10;
    L_0x0124:
        r10 = r12;
    L_0x0125:
        r13 = r5;
        r14 = r10;
    L_0x0127:
        r10 = r22;
        goto L_0x013d;
    L_0x012a:
        r0 = move-exception;
        r22 = r10;
        r10 = r12;
        r5 = r0;
        r14 = r10;
        r10 = r22;
        goto L_0x0095;
    L_0x0134:
        r0 = move-exception;
        r22 = r10;
        r14 = r5;
        goto L_0x013c;
    L_0x0139:
        r0 = move-exception;
        r14 = r5;
        r10 = 0;
    L_0x013c:
        r13 = 0;
    L_0x013d:
        r5 = r0;
    L_0x013e:
        if (r10 == 0) goto L_0x018d;
    L_0x0140:
        r5 = r10.getStatusLine();
        r5 = r5.getStatusCode();
        r9 = "Unexpected response code %d for %s";
        r6 = new java.lang.Object[r6];
        r10 = java.lang.Integer.valueOf(r5);
        r6[r8] = r10;
        r8 = r24.m20434c();
        r6[r7] = r8;
        com.google.android.m4b.maps.p101a.C4535s.m20470c(r9, r6);
        if (r13 == 0) goto L_0x0186;
    L_0x015d:
        r6 = new com.google.android.m4b.maps.a.h;
        r15 = 0;
        r7 = android.os.SystemClock.elapsedRealtime();
        r16 = r7 - r3;
        r11 = r6;
        r12 = r5;
        r11.<init>(r12, r13, r14, r15, r16);
        r7 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r5 == r7) goto L_0x017a;
    L_0x016f:
        r7 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r5 != r7) goto L_0x0174;
    L_0x0173:
        goto L_0x017a;
    L_0x0174:
        r2 = new com.google.android.m4b.maps.a.p;
        r2.<init>(r6);
        throw r2;
    L_0x017a:
        r5 = "auth";
        r7 = new com.google.android.m4b.maps.a.a;
        r7.<init>(r6);
        com.google.android.m4b.maps.p102b.C6421a.m28045a(r5, r2, r7);
        goto L_0x0008;
    L_0x0186:
        r2 = new com.google.android.m4b.maps.a.g;
        r3 = 0;
        r2.<init>(r3);
        throw r2;
    L_0x018d:
        r2 = new com.google.android.m4b.maps.a.i;
        r2.<init>(r5);
        throw r2;
    L_0x0193:
        r0 = move-exception;
        r3 = r0;
        r4 = new java.lang.RuntimeException;
        r5 = new java.lang.StringBuilder;
        r6 = "Bad URL ";
        r5.<init>(r6);
        r2 = r24.m20434c();
        r5.append(r2);
        r2 = r5.toString();
        r4.<init>(r2, r3);
        throw r4;
    L_0x01ad:
        r5 = "connection";
        r6 = new com.google.android.m4b.maps.a.q;
        r6.<init>();
        com.google.android.m4b.maps.p102b.C6421a.m28045a(r5, r2, r6);
        goto L_0x0008;
    L_0x01b9:
        r5 = "socket";
        r6 = new com.google.android.m4b.maps.a.q;
        r6.<init>();
        com.google.android.m4b.maps.p102b.C6421a.m28045a(r5, r2, r6);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.b.a.a(com.google.android.m4b.maps.a.k):com.google.android.m4b.maps.a.h");
    }

    /* renamed from: a */
    private static void m28045a(String str, C4525k<?> c4525k, C4532r c4532r) {
        C4531o o = c4525k.m20446o();
        int n = c4525k.m20445n();
        try {
            o.m20461a(c4532r);
            c4525k.m20430a(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(n)}));
        } catch (C4532r c4532r2) {
            c4525k.m20430a(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(n)}));
            throw c4532r2;
        }
    }

    /* renamed from: a */
    private byte[] m28046a(org.apache.http.HttpEntity r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = new com.google.android.m4b.maps.b.h;
        r1 = r6.f23828e;
        r2 = r7.getContentLength();
        r2 = (int) r2;
        r0.<init>(r1, r2);
        r1 = 0;
        r2 = 0;
        r3 = r7.getContent();	 Catch:{ all -> 0x0048 }
        if (r3 != 0) goto L_0x001a;	 Catch:{ all -> 0x0048 }
    L_0x0014:
        r3 = new com.google.android.m4b.maps.a.p;	 Catch:{ all -> 0x0048 }
        r3.<init>();	 Catch:{ all -> 0x0048 }
        throw r3;	 Catch:{ all -> 0x0048 }
    L_0x001a:
        r4 = r6.f23828e;	 Catch:{ all -> 0x0048 }
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ all -> 0x0048 }
        r4 = r4.m21074a(r5);	 Catch:{ all -> 0x0048 }
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
        com.google.android.m4b.maps.p101a.C4535s.m20467a(r7, r1);
    L_0x003c:
        r7 = r6.f23828e;
        r7.m21073a(r4);
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
        com.google.android.m4b.maps.p101a.C4535s.m20467a(r7, r1);
    L_0x0054:
        r7 = r6.f23828e;
        r7.m21073a(r2);
        r0.close();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.b.a.a(org.apache.http.HttpEntity):byte[]");
    }

    /* renamed from: a */
    private static Map<String, String> m28044a(Header[] headerArr) {
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }
}
