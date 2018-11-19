package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class fx implements zzm {
    /* renamed from: a */
    private static boolean f23303a = cg.f15916a;
    @Deprecated
    /* renamed from: b */
    private zzaq f23304b;
    /* renamed from: c */
    private final ex f23305c;
    /* renamed from: d */
    private gw f23306d;

    public fx(ex exVar) {
        this(exVar, new gw(4096));
    }

    private fx(ex exVar, gw gwVar) {
        this.f23305c = exVar;
        this.f23304b = exVar;
        this.f23306d = gwVar;
    }

    @Deprecated
    public fx(zzaq zzaq) {
        this(zzaq, new gw(4096));
    }

    @Deprecated
    private fx(zzaq zzaq, gw gwVar) {
        this.f23304b = zzaq;
        this.f23305c = new dw(zzaq);
        this.f23306d = gwVar;
    }

    /* renamed from: a */
    private static List<ajr> m27338a(List<ajr> list, pt ptVar) {
        Set treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (ajr a : list) {
                treeSet.add(a.m19223a());
            }
        }
        List<ajr> arrayList = new ArrayList(list);
        if (ptVar.f16405h != null) {
            if (!ptVar.f16405h.isEmpty()) {
                for (ajr ajr : ptVar.f16405h) {
                    if (!treeSet.contains(ajr.m19223a())) {
                        arrayList.add(ajr);
                    }
                }
            }
        } else if (!ptVar.f16404g.isEmpty()) {
            for (Entry entry : ptVar.f16404g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new ajr((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m27339a(String str, aom<?> aom, zzad zzad) throws zzad {
        zzaa i = aom.m19396i();
        int h = aom.m19395h();
        try {
            i.zza(zzad);
            aom.m19388b(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(h)}));
        } catch (zzad zzad2) {
            aom.m19388b(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(h)}));
            throw zzad2;
        }
    }

    /* renamed from: a */
    private final byte[] m27340a(java.io.InputStream r6, int r7) throws java.io.IOException, com.google.android.gms.internal.zzab {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = new com.google.android.gms.internal.md;
        r1 = r5.f23306d;
        r0.<init>(r1, r7);
        r7 = 0;
        r1 = 0;
        if (r6 != 0) goto L_0x0013;
    L_0x000b:
        r2 = new com.google.android.gms.internal.zzab;	 Catch:{ all -> 0x0011 }
        r2.<init>();	 Catch:{ all -> 0x0011 }
        throw r2;	 Catch:{ all -> 0x0011 }
    L_0x0011:
        r2 = move-exception;	 Catch:{ all -> 0x0011 }
        goto L_0x0044;	 Catch:{ all -> 0x0011 }
    L_0x0013:
        r2 = r5.f23306d;	 Catch:{ all -> 0x0011 }
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ all -> 0x0011 }
        r2 = r2.m19835a(r3);	 Catch:{ all -> 0x0011 }
    L_0x001b:
        r1 = r6.read(r2);	 Catch:{ all -> 0x0040 }
        r3 = -1;	 Catch:{ all -> 0x0040 }
        if (r1 == r3) goto L_0x0026;	 Catch:{ all -> 0x0040 }
    L_0x0022:
        r0.write(r2, r7, r1);	 Catch:{ all -> 0x0040 }
        goto L_0x001b;	 Catch:{ all -> 0x0040 }
    L_0x0026:
        r1 = r0.toByteArray();	 Catch:{ all -> 0x0040 }
        if (r6 == 0) goto L_0x0037;
    L_0x002c:
        r6.close();	 Catch:{ IOException -> 0x0030 }
        goto L_0x0037;
    L_0x0030:
        r6 = "Error occurred when closing InputStream";
        r7 = new java.lang.Object[r7];
        com.google.android.gms.internal.cg.m19567a(r6, r7);
    L_0x0037:
        r6 = r5.f23306d;
        r6.m19834a(r2);
        r0.close();
        return r1;
    L_0x0040:
        r1 = move-exception;
        r4 = r2;
        r2 = r1;
        r1 = r4;
    L_0x0044:
        if (r6 == 0) goto L_0x0051;
    L_0x0046:
        r6.close();	 Catch:{ IOException -> 0x004a }
        goto L_0x0051;
    L_0x004a:
        r6 = "Error occurred when closing InputStream";
        r7 = new java.lang.Object[r7];
        com.google.android.gms.internal.cg.m19567a(r6, r7);
    L_0x0051:
        r6 = r5.f23306d;
        r6.m19834a(r1);
        r0.close();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fx.a(java.io.InputStream, int):byte[]");
    }

    public com.google.android.gms.internal.amz zzc(com.google.android.gms.internal.aom<?> r28) throws com.google.android.gms.internal.zzad {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r27 = this;
        r1 = r27;
        r2 = r28;
        r3 = android.os.SystemClock.elapsedRealtime();
    L_0x0008:
        r5 = java.util.Collections.emptyList();
        r8 = 0;
        r9 = 0;
        r10 = r28.m19393f();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        if (r10 != 0) goto L_0x0019;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
    L_0x0014:
        r10 = java.util.Collections.emptyMap();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        goto L_0x003d;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
    L_0x0019:
        r11 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        r11.<init>();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        r12 = r10.f16399b;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        if (r12 == 0) goto L_0x0029;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
    L_0x0022:
        r12 = "If-None-Match";	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        r13 = r10.f16399b;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        r11.put(r12, r13);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
    L_0x0029:
        r12 = r10.f16401d;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        r14 = 0;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        if (r16 <= 0) goto L_0x003c;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
    L_0x0031:
        r12 = "If-Modified-Since";	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        r13 = r10.f16401d;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        r10 = com.google.android.gms.internal.lh.m20029a(r13);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        r11.put(r12, r10);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
    L_0x003c:
        r10 = r11;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
    L_0x003d:
        r11 = r1.f23305c;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        r10 = r11.mo6862a(r2, r10);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0120 }
        r12 = r10.m20039a();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x011b }
        r11 = r10.m20040b();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x011b }
        r5 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r12 != r5) goto L_0x008d;
    L_0x004f:
        r5 = r28.m19393f();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        if (r5 != 0) goto L_0x006b;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
    L_0x0055:
        r5 = new com.google.android.gms.internal.amz;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r14 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r15 = 0;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r16 = 1;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r12 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r17 = 0;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r17 = r12 - r3;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r13 = r5;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r19 = r11;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r13.<init>(r14, r15, r16, r17, r19);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        return r5;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
    L_0x006b:
        r25 = m27338a(r11, r5);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r12 = new com.google.android.gms.internal.amz;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r20 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r5 = r5.f16398a;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r22 = 1;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r13 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r15 = 0;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r23 = r13 - r3;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r19 = r12;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r21 = r5;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r19.<init>(r20, r21, r22, r23, r25);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        return r12;
    L_0x0086:
        r0 = move-exception;
        r5 = r0;
        r13 = r8;
        r17 = r11;
        goto L_0x0126;
    L_0x008d:
        r5 = r10.m20042d();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0114 }
        if (r5 == 0) goto L_0x009c;
    L_0x0093:
        r13 = r10.m20041c();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        r5 = r1.m27340a(r5, r13);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0086 }
        goto L_0x009e;
    L_0x009c:
        r5 = new byte[r9];	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x0114 }
    L_0x009e:
        r13 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r8 = 0;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r6 = r13 - r3;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r8 = f23303a;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        if (r8 != 0) goto L_0x00af;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
    L_0x00a9:
        r13 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        if (r8 <= 0) goto L_0x00e9;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
    L_0x00af:
        r8 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r13 = 5;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r13 = new java.lang.Object[r13];	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r13[r9] = r2;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r7 = 1;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r13[r7] = r6;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        if (r5 == 0) goto L_0x00cb;
    L_0x00bf:
        r6 = r5.length;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x00c5 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x00c5 }
        goto L_0x00cd;
    L_0x00c5:
        r0 = move-exception;
        r13 = r5;
        r17 = r11;
        goto L_0x0125;
    L_0x00cb:
        r6 = "null";	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
    L_0x00cd:
        r7 = 2;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r13[r7] = r6;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r6 = 3;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r7 = java.lang.Integer.valueOf(r12);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r13[r6] = r7;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r6 = 4;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r7 = r28.m19396i();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r7 = r7.zzc();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r13[r6] = r7;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        com.google.android.gms.internal.cg.m19569b(r8, r13);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
    L_0x00e9:
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        if (r12 < r6) goto L_0x0105;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
    L_0x00ed:
        r6 = 299; // 0x12b float:4.19E-43 double:1.477E-321;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        if (r12 <= r6) goto L_0x00f2;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
    L_0x00f1:
        goto L_0x0105;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
    L_0x00f2:
        r6 = new com.google.android.gms.internal.amz;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r14 = 0;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010e }
        r13 = 0;
        r15 = r7 - r3;
        r7 = r11;
        r11 = r6;
        r13 = r5;
        r17 = r7;
        r11.<init>(r12, r13, r14, r15, r17);	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010c }
        return r6;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010c }
    L_0x0105:
        r7 = r11;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010c }
        r6 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010c }
        r6.<init>();	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010c }
        throw r6;	 Catch:{ SocketTimeoutException -> 0x01b8, MalformedURLException -> 0x0196, IOException -> 0x010c }
    L_0x010c:
        r0 = move-exception;
        goto L_0x0110;
    L_0x010e:
        r0 = move-exception;
        r7 = r11;
    L_0x0110:
        r13 = r5;
        r17 = r7;
        goto L_0x0125;
    L_0x0114:
        r0 = move-exception;
        r7 = r11;
        r5 = r0;
        r17 = r7;
        r13 = r8;
        goto L_0x0126;
    L_0x011b:
        r0 = move-exception;
        r17 = r5;
        r13 = r8;
        goto L_0x0125;
    L_0x0120:
        r0 = move-exception;
        r17 = r5;
        r10 = r8;
        r13 = r10;
    L_0x0125:
        r5 = r0;
    L_0x0126:
        if (r10 == 0) goto L_0x0190;
    L_0x0128:
        r5 = r10.m20039a();
        r6 = "Unexpected response code %d for %s";
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r8 = java.lang.Integer.valueOf(r5);
        r7[r9] = r8;
        r8 = r28.m19392e();
        r9 = 1;
        r7[r9] = r8;
        com.google.android.gms.internal.cg.m19570c(r6, r7);
        if (r13 == 0) goto L_0x0188;
    L_0x0143:
        r6 = new com.google.android.gms.internal.amz;
        r14 = 0;
        r7 = android.os.SystemClock.elapsedRealtime();
        r15 = r7 - r3;
        r11 = r6;
        r12 = r5;
        r11.<init>(r12, r13, r14, r15, r17);
        r7 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r5 == r7) goto L_0x017c;
    L_0x0155:
        r7 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r5 != r7) goto L_0x015a;
    L_0x0159:
        goto L_0x017c;
    L_0x015a:
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r5 < r2) goto L_0x0168;
    L_0x015e:
        r2 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        if (r5 > r2) goto L_0x0168;
    L_0x0162:
        r2 = new com.google.android.gms.internal.zzg;
        r2.<init>(r6);
        throw r2;
    L_0x0168:
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r5 < r2) goto L_0x0176;
    L_0x016c:
        r2 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        if (r5 > r2) goto L_0x0176;
    L_0x0170:
        r2 = new com.google.android.gms.internal.zzab;
        r2.<init>(r6);
        throw r2;
    L_0x0176:
        r2 = new com.google.android.gms.internal.zzab;
        r2.<init>(r6);
        throw r2;
    L_0x017c:
        r5 = "auth";
        r7 = new com.google.android.gms.internal.zza;
        r7.<init>(r6);
        m27339a(r5, r2, r7);
        goto L_0x0008;
    L_0x0188:
        r5 = "network";
        r6 = new com.google.android.gms.internal.zzo;
        r6.<init>();
        goto L_0x01bf;
    L_0x0190:
        r2 = new com.google.android.gms.internal.zzq;
        r2.<init>(r5);
        throw r2;
    L_0x0196:
        r0 = move-exception;
        r3 = r0;
        r4 = new java.lang.RuntimeException;
        r5 = "Bad URL ";
        r2 = r28.m19392e();
        r2 = java.lang.String.valueOf(r2);
        r6 = r2.length();
        if (r6 == 0) goto L_0x01af;
    L_0x01aa:
        r2 = r5.concat(r2);
        goto L_0x01b4;
    L_0x01af:
        r2 = new java.lang.String;
        r2.<init>(r5);
    L_0x01b4:
        r4.<init>(r2, r3);
        throw r4;
    L_0x01b8:
        r5 = "socket";
        r6 = new com.google.android.gms.internal.zzac;
        r6.<init>();
    L_0x01bf:
        m27339a(r5, r2, r6);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fx.zzc(com.google.android.gms.internal.aom):com.google.android.gms.internal.amz");
    }
}
