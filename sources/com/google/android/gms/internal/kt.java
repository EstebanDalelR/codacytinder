package com.google.android.gms.internal;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzzv
public final class kt extends ko {
    /* renamed from: b */
    private static final Set<String> f26911b = Collections.synchronizedSet(new HashSet());
    /* renamed from: c */
    private static final DecimalFormat f26912c = new DecimalFormat("#,###");
    /* renamed from: d */
    private File f26913d;
    /* renamed from: e */
    private boolean f26914e;

    public kt(zzamp zzamp) {
        super(zzamp);
        File cacheDir = this.a.getCacheDir();
        if (cacheDir == null) {
            hx.m19916e("Context.getCacheDir() returned null");
            return;
        }
        this.f26913d = new File(cacheDir, "admobVideoStreams");
        if (this.f26913d.isDirectory() || this.f26913d.mkdirs()) {
            if (this.f26913d.setReadable(true, false)) {
                if (this.f26913d.setExecutable(true, false)) {
                    return;
                }
            }
            String str = "Could not set cache file permissions at ";
            String valueOf = String.valueOf(this.f26913d.getAbsolutePath());
            hx.m19916e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f26913d = null;
            return;
        }
        str = "Could not create preload cache directory at ";
        valueOf = String.valueOf(this.f26913d.getAbsolutePath());
        hx.m19916e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        this.f26913d = null;
    }

    /* renamed from: a */
    private final File m31595a(File file) {
        return new File(this.f26913d, String.valueOf(file.getName()).concat(".done"));
    }

    /* renamed from: a */
    public final void mo6887a() {
        this.f26914e = true;
    }

    /* renamed from: a */
    public final boolean mo6888a(java.lang.String r31) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r30 = this;
        r8 = r30;
        r9 = r31;
        r1 = r8.f26913d;
        r10 = 0;
        r11 = 0;
        if (r1 != 0) goto L_0x0010;
    L_0x000a:
        r1 = "noCacheDir";
    L_0x000c:
        r8.m27423a(r9, r10, r1, r10);
        return r11;
    L_0x0010:
        r1 = r8.f26913d;
        if (r1 != 0) goto L_0x0016;
    L_0x0014:
        r4 = 0;
        goto L_0x0034;
    L_0x0016:
        r1 = r8.f26913d;
        r1 = r1.listFiles();
        r2 = r1.length;
        r3 = 0;
        r4 = 0;
    L_0x001f:
        if (r3 >= r2) goto L_0x0034;
    L_0x0021:
        r5 = r1[r3];
        r5 = r5.getName();
        r6 = ".done";
        r5 = r5.endsWith(r6);
        if (r5 != 0) goto L_0x0031;
    L_0x002f:
        r4 = r4 + 1;
    L_0x0031:
        r3 = r3 + 1;
        goto L_0x001f;
    L_0x0034:
        r1 = com.google.android.gms.internal.alo.f15459j;
        r2 = com.google.android.gms.internal.aja.m19221f();
        r1 = r2.m19334a(r1);
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        if (r4 <= r1) goto L_0x0098;
    L_0x0046:
        r1 = r8.f26913d;
        if (r1 != 0) goto L_0x004c;
    L_0x004a:
        r1 = 0;
        goto L_0x008d;
    L_0x004c:
        r1 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r3 = r8.f26913d;
        r3 = r3.listFiles();
        r4 = r3.length;
        r5 = r1;
        r2 = r10;
        r1 = 0;
    L_0x005b:
        if (r1 >= r4) goto L_0x0078;
    L_0x005d:
        r7 = r3[r1];
        r12 = r7.getName();
        r13 = ".done";
        r12 = r12.endsWith(r13);
        if (r12 != 0) goto L_0x0075;
    L_0x006b:
        r12 = r7.lastModified();
        r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1));
        if (r14 >= 0) goto L_0x0075;
    L_0x0073:
        r2 = r7;
        r5 = r12;
    L_0x0075:
        r1 = r1 + 1;
        goto L_0x005b;
    L_0x0078:
        if (r2 == 0) goto L_0x004a;
    L_0x007a:
        r1 = r2.delete();
        r2 = r8.m31595a(r2);
        r3 = r2.isFile();
        if (r3 == 0) goto L_0x008d;
    L_0x0088:
        r2 = r2.delete();
        r1 = r1 & r2;
    L_0x008d:
        if (r1 != 0) goto L_0x0010;
    L_0x008f:
        r1 = "Unable to expire stream cache";
        com.google.android.gms.internal.hx.m19916e(r1);
        r1 = "expireFailed";
        goto L_0x000c;
    L_0x0098:
        com.google.android.gms.internal.aja.m19216a();
        r1 = com.google.android.gms.internal.hn.m19864a(r31);
        r12 = new java.io.File;
        r2 = r8.f26913d;
        r12.<init>(r2, r1);
        r13 = r8.m31595a(r12);
        r1 = r12.isFile();
        r14 = 1;
        if (r1 == 0) goto L_0x00de;
    L_0x00b1:
        r1 = r13.isFile();
        if (r1 == 0) goto L_0x00de;
    L_0x00b7:
        r1 = r12.length();
        r1 = (int) r1;
        r2 = "Stream cache hit at ";
        r3 = java.lang.String.valueOf(r31);
        r4 = r3.length();
        if (r4 == 0) goto L_0x00cd;
    L_0x00c8:
        r2 = r2.concat(r3);
        goto L_0x00d3;
    L_0x00cd:
        r3 = new java.lang.String;
        r3.<init>(r2);
        r2 = r3;
    L_0x00d3:
        com.google.android.gms.internal.hx.m19911b(r2);
        r2 = r12.getAbsolutePath();
        r8.m27422a(r9, r2, r1);
        return r14;
    L_0x00de:
        r1 = r8.f26913d;
        r1 = r1.getAbsolutePath();
        r1 = java.lang.String.valueOf(r1);
        r2 = java.lang.String.valueOf(r31);
        r3 = r2.length();
        if (r3 == 0) goto L_0x00f8;
    L_0x00f2:
        r1 = r1.concat(r2);
        r15 = r1;
        goto L_0x00fe;
    L_0x00f8:
        r2 = new java.lang.String;
        r2.<init>(r1);
        r15 = r2;
    L_0x00fe:
        r1 = f26911b;
        monitor-enter(r1);
        r2 = f26911b;	 Catch:{ all -> 0x04d9 }
        r2 = r2.contains(r15);	 Catch:{ all -> 0x04d9 }
        if (r2 == 0) goto L_0x012e;	 Catch:{ all -> 0x04d9 }
    L_0x0109:
        r2 = "Stream cache already in progress at ";	 Catch:{ all -> 0x04d9 }
        r3 = java.lang.String.valueOf(r31);	 Catch:{ all -> 0x04d9 }
        r4 = r3.length();	 Catch:{ all -> 0x04d9 }
        if (r4 == 0) goto L_0x011a;	 Catch:{ all -> 0x04d9 }
    L_0x0115:
        r2 = r2.concat(r3);	 Catch:{ all -> 0x04d9 }
        goto L_0x0120;	 Catch:{ all -> 0x04d9 }
    L_0x011a:
        r3 = new java.lang.String;	 Catch:{ all -> 0x04d9 }
        r3.<init>(r2);	 Catch:{ all -> 0x04d9 }
        r2 = r3;	 Catch:{ all -> 0x04d9 }
    L_0x0120:
        com.google.android.gms.internal.hx.m19916e(r2);	 Catch:{ all -> 0x04d9 }
        r2 = r12.getAbsolutePath();	 Catch:{ all -> 0x04d9 }
        r3 = "inProgress";	 Catch:{ all -> 0x04d9 }
        r8.m27423a(r9, r2, r3, r10);	 Catch:{ all -> 0x04d9 }
        monitor-exit(r1);	 Catch:{ all -> 0x04d9 }
        return r11;	 Catch:{ all -> 0x04d9 }
    L_0x012e:
        r2 = f26911b;	 Catch:{ all -> 0x04d9 }
        r2.add(r15);	 Catch:{ all -> 0x04d9 }
        monitor-exit(r1);	 Catch:{ all -> 0x04d9 }
        r16 = "error";
        com.google.android.gms.ads.internal.ar.p();	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r1 = com.google.android.gms.internal.alo.f15464o;	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r2 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r1 = r2.m19334a(r1);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r1 = (java.lang.Integer) r1;	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r1 = r1.intValue();	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r1 = com.google.android.gms.internal.ix.m19935a(r9, r1);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r2 = r1 instanceof java.net.HttpURLConnection;	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        if (r2 == 0) goto L_0x01b2;
    L_0x0151:
        r2 = r1;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r2 = (java.net.HttpURLConnection) r2;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r2 = r2.getResponseCode();	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3 = 400; // 0x190 float:5.6E-43 double:1.976E-321;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        if (r2 < r3) goto L_0x01b2;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
    L_0x015c:
        r1 = "badUrl";	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3 = "HTTP request failed. Code: ";	 Catch:{ IOException -> 0x01a5, IOException -> 0x01a5 }
        r4 = java.lang.Integer.toString(r2);	 Catch:{ IOException -> 0x01a5, IOException -> 0x01a5 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x01a5, IOException -> 0x01a5 }
        r5 = r4.length();	 Catch:{ IOException -> 0x01a5, IOException -> 0x01a5 }
        if (r5 == 0) goto L_0x0173;	 Catch:{ IOException -> 0x01a5, IOException -> 0x01a5 }
    L_0x016e:
        r3 = r3.concat(r4);	 Catch:{ IOException -> 0x01a5, IOException -> 0x01a5 }
        goto L_0x0179;	 Catch:{ IOException -> 0x01a5, IOException -> 0x01a5 }
    L_0x0173:
        r4 = new java.lang.String;	 Catch:{ IOException -> 0x01a5, IOException -> 0x01a5 }
        r4.<init>(r3);	 Catch:{ IOException -> 0x01a5, IOException -> 0x01a5 }
        r3 = r4;
    L_0x0179:
        r4 = new java.io.IOException;	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r5 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r5 = r5.length();	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r5 = r5 + 32;	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r6.<init>(r5);	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r5 = "HTTP status code ";	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r6.append(r5);	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r6.append(r2);	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r2 = " at ";	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r6.append(r2);	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r6.append(r9);	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r2 = r6.toString();	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        r4.<init>(r2);	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
        throw r4;	 Catch:{ IOException -> 0x01a2, IOException -> 0x01a2 }
    L_0x01a2:
        r0 = move-exception;
        r2 = r1;
        goto L_0x01a8;
    L_0x01a5:
        r0 = move-exception;
        r2 = r1;
        r3 = r10;
    L_0x01a8:
        r1 = r0;
        goto L_0x0446;
    L_0x01ab:
        r0 = move-exception;
        r1 = r0;
        r3 = r10;
        r2 = r16;
        goto L_0x0446;
    L_0x01b2:
        r7 = r1.getContentLength();	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        if (r7 >= 0) goto L_0x01e1;
    L_0x01b8:
        r1 = "Stream cache aborted, missing content-length header at ";	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r2 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3 = r2.length();	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        if (r3 == 0) goto L_0x01c9;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
    L_0x01c4:
        r1 = r1.concat(r2);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        goto L_0x01cf;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
    L_0x01c9:
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r2.<init>(r1);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = r2;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
    L_0x01cf:
        com.google.android.gms.internal.hx.m19916e(r1);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r2 = "contentLengthMissing";	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r8.m27423a(r9, r1, r2, r10);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = f26911b;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1.remove(r15);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        return r11;
    L_0x01e1:
        r2 = f26912c;	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r3 = (long) r7;	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r2 = r2.format(r3);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r3 = com.google.android.gms.internal.alo.f15460k;	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r4 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r3 = r4.m19334a(r3);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r3 = (java.lang.Integer) r3;	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r6 = r3.intValue();	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        if (r7 <= r6) goto L_0x024f;
    L_0x01fa:
        r1 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = r1.length();	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = r1 + 33;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3 = r3.length();	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = r1 + r3;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3.<init>(r1);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = "Content length ";	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3.append(r1);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3.append(r2);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = " exceeds limit at ";	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3.append(r1);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3.append(r9);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = r3.toString();	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        com.google.android.gms.internal.hx.m19916e(r1);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = "File too big for full file cache. Size: ";	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3 = r2.length();	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        if (r3 == 0) goto L_0x023a;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
    L_0x0235:
        r1 = r1.concat(r2);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        goto L_0x0240;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
    L_0x023a:
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r2.<init>(r1);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = r2;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
    L_0x0240:
        r2 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r3 = "sizeExceeded";	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r8.m27423a(r9, r2, r3, r1);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1 = f26911b;	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        r1.remove(r15);	 Catch:{ IOException -> 0x01ab, IOException -> 0x01ab }
        return r11;
    L_0x024f:
        r3 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r3 = r3.length();	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r3 = r3 + 20;	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r4 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r4 = r4.length();	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r3 = r3 + r4;	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r4.<init>(r3);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r3 = "Caching ";	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r4.append(r3);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r4.append(r2);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r2 = " bytes from ";	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r4.append(r2);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r4.append(r9);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r2 = r4.toString();	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        com.google.android.gms.internal.hx.m19911b(r2);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r1 = r1.getInputStream();	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r5 = java.nio.channels.Channels.newChannel(r1);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r4 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r4.<init>(r12);	 Catch:{ IOException -> 0x0440, IOException -> 0x0440 }
        r3 = r4.getChannel();	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r1 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r2 = java.nio.ByteBuffer.allocate(r1);	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r1 = com.google.android.gms.ads.internal.ar.k();	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r17 = r1.currentTimeMillis();	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r10 = com.google.android.gms.internal.alo.f15463n;	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r11 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r10 = r11.m19334a(r10);	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r10 = (java.lang.Long) r10;	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r10 = r10.longValue();	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r14 = new com.google.android.gms.internal.he;	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r14.<init>(r10);	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r10 = com.google.android.gms.internal.alo.f15462m;	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r11 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r10 = r11.m19334a(r10);	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r10 = (java.lang.Long) r10;	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r10 = r10.longValue();	 Catch:{ IOException -> 0x0438, IOException -> 0x0438 }
        r19 = r4;
        r4 = 0;
    L_0x02c5:
        r20 = r5.read(r2);	 Catch:{ IOException -> 0x0434, IOException -> 0x0434 }
        if (r20 < 0) goto L_0x03cc;
    L_0x02cb:
        r4 = r4 + r20;
        if (r4 <= r6) goto L_0x030b;
    L_0x02cf:
        r1 = "sizeExceeded";	 Catch:{ IOException -> 0x0302, IOException -> 0x0302 }
        r2 = "File too big for full file cache. Size: ";	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r3 = java.lang.Integer.toString(r4);	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r4 = r3.length();	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        if (r4 == 0) goto L_0x02e7;	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
    L_0x02e1:
        r2 = r2.concat(r3);	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r10 = r2;	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        goto L_0x02ed;	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
    L_0x02e7:
        r3 = new java.lang.String;	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r3.<init>(r2);	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r10 = r3;
    L_0x02ed:
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x02f5, IOException -> 0x02f5 }
        r3 = "stream cache file size limit exceeded";	 Catch:{ IOException -> 0x02f5, IOException -> 0x02f5 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x02f5, IOException -> 0x02f5 }
        throw r2;	 Catch:{ IOException -> 0x02f5, IOException -> 0x02f5 }
    L_0x02f5:
        r0 = move-exception;
        r2 = r1;
        r3 = r10;
        r10 = r19;
        goto L_0x01a8;
    L_0x02fc:
        r0 = move-exception;
        r2 = r1;
        r10 = r19;
        goto L_0x043d;
    L_0x0302:
        r0 = move-exception;
        r1 = r0;
        r2 = r16;
        r10 = r19;
    L_0x0308:
        r3 = 0;
        goto L_0x0446;
    L_0x030b:
        r2.flip();	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
    L_0x030e:
        r20 = r3.write(r2);	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
        if (r20 > 0) goto L_0x030e;	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
    L_0x0314:
        r2.clear();	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
        r20 = r1.currentTimeMillis();	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
        r22 = 0;
        r22 = r20 - r17;
        r20 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r20 = r20 * r10;
        r24 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1));
        if (r24 <= 0) goto L_0x0355;
    L_0x0327:
        r1 = "downloadTimeout";	 Catch:{ IOException -> 0x0302, IOException -> 0x0302 }
        r2 = java.lang.Long.toString(r10);	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r3 = r3.length();	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r3 = r3 + 29;	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r4.<init>(r3);	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r3 = "Timeout exceeded. Limit: ";	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r4.append(r3);	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r4.append(r2);	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r2 = " sec";	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r4.append(r2);	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r10 = r4.toString();	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x02f5, IOException -> 0x02f5 }
        r3 = "stream cache time limit exceeded";	 Catch:{ IOException -> 0x02f5, IOException -> 0x02f5 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x02f5, IOException -> 0x02f5 }
        throw r2;	 Catch:{ IOException -> 0x02f5, IOException -> 0x02f5 }
    L_0x0355:
        r25 = r1;
        r1 = r8.f26914e;	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
        if (r1 == 0) goto L_0x0365;
    L_0x035b:
        r1 = "externalAbort";	 Catch:{ IOException -> 0x0302, IOException -> 0x0302 }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r3 = "abort requested";	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        r2.<init>(r3);	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
        throw r2;	 Catch:{ IOException -> 0x02fc, IOException -> 0x02fc }
    L_0x0365:
        r1 = r14.m19841a();	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
        if (r1 == 0) goto L_0x039c;	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
    L_0x036b:
        r20 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
        r1 = com.google.android.gms.internal.hn.f16157a;	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
        r26 = r10;	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
        r10 = new com.google.android.gms.internal.kp;	 Catch:{ IOException -> 0x03c2, IOException -> 0x03c2 }
        r11 = 0;
        r28 = r1;
        r21 = r25;
        r1 = r10;
        r22 = r2;
        r2 = r8;
        r23 = r3;
        r3 = r9;
        r29 = r19;
        r19 = r4;
        r4 = r20;
        r20 = r5;
        r5 = r19;
        r24 = r6;
        r6 = r7;
        r25 = r7;
        r7 = r11;
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x039a, IOException -> 0x039a }
        r1 = r28;	 Catch:{ IOException -> 0x039a, IOException -> 0x039a }
        r1.post(r10);	 Catch:{ IOException -> 0x039a, IOException -> 0x039a }
        goto L_0x03ae;
    L_0x039a:
        r0 = move-exception;
        goto L_0x03c5;
    L_0x039c:
        r22 = r2;
        r23 = r3;
        r20 = r5;
        r24 = r6;
        r26 = r10;
        r29 = r19;
        r21 = r25;
        r19 = r4;
        r25 = r7;
    L_0x03ae:
        r4 = r19;
        r5 = r20;
        r1 = r21;
        r2 = r22;
        r3 = r23;
        r6 = r24;
        r7 = r25;
        r10 = r26;
        r19 = r29;
        goto L_0x02c5;
    L_0x03c2:
        r0 = move-exception;
        r29 = r19;
    L_0x03c5:
        r1 = r0;
        r2 = r16;
        r10 = r29;
        goto L_0x0308;
    L_0x03cc:
        r1 = r19;
        r1.close();	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r2 = 3;	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r2 = com.google.android.gms.internal.hx.m19910a(r2);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        if (r2 == 0) goto L_0x040e;	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
    L_0x03d8:
        r2 = f26912c;	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r5 = (long) r4;	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r2 = r2.format(r5);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r3 = r3.length();	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r3 = r3 + 22;	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r5 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r5 = r5.length();	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r3 = r3 + r5;	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r5.<init>(r3);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r3 = "Preloaded ";	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r5.append(r3);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r5.append(r2);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r2 = " bytes from ";	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r5.append(r2);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r5.append(r9);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r2 = r5.toString();	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        com.google.android.gms.internal.hx.m19911b(r2);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
    L_0x040e:
        r2 = 0;	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r3 = 1;	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r12.setReadable(r3, r2);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r2 = r13.isFile();	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        if (r2 == 0) goto L_0x0421;	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
    L_0x0419:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r13.setLastModified(r2);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        goto L_0x0424;
    L_0x0421:
        r13.createNewFile();	 Catch:{ IOException -> 0x0424 }
    L_0x0424:
        r2 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r8.m27422a(r9, r2, r4);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r2 = f26911b;	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r2.remove(r15);	 Catch:{ IOException -> 0x0432, IOException -> 0x0432 }
        r2 = 1;
        return r2;
    L_0x0432:
        r0 = move-exception;
        goto L_0x043a;
    L_0x0434:
        r0 = move-exception;
        r1 = r19;
        goto L_0x043a;
    L_0x0438:
        r0 = move-exception;
        r1 = r4;
    L_0x043a:
        r10 = r1;
        r2 = r16;
    L_0x043d:
        r3 = 0;
        goto L_0x01a8;
    L_0x0440:
        r0 = move-exception;
        r1 = r0;
        r2 = r16;
        r3 = 0;
        r10 = 0;
    L_0x0446:
        r4 = r1 instanceof java.lang.RuntimeException;
        if (r4 == 0) goto L_0x0453;
    L_0x044a:
        r4 = com.google.android.gms.ads.internal.ar.i();
        r5 = "VideoStreamFullFileCache.preload";
        r4.m27296a(r1, r5);
    L_0x0453:
        r10.close();	 Catch:{ IOException -> 0x0456, IOException -> 0x0456 }
    L_0x0456:
        r4 = r8.f26914e;
        if (r4 == 0) goto L_0x047e;
    L_0x045a:
        r1 = java.lang.String.valueOf(r31);
        r1 = r1.length();
        r1 = r1 + 26;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r1);
        r1 = "Preload aborted for URL \"";
        r4.append(r1);
        r4.append(r9);
        r1 = "\"";
        r4.append(r1);
        r1 = r4.toString();
        com.google.android.gms.internal.hx.m19915d(r1);
        goto L_0x04a1;
    L_0x047e:
        r4 = java.lang.String.valueOf(r31);
        r4 = r4.length();
        r4 = r4 + 25;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Preload failed for URL \"";
        r5.append(r4);
        r5.append(r9);
        r4 = "\"";
        r5.append(r4);
        r4 = r5.toString();
        com.google.android.gms.internal.hx.m19914c(r4, r1);
    L_0x04a1:
        r1 = r12.exists();
        if (r1 == 0) goto L_0x04cb;
    L_0x04a7:
        r1 = r12.delete();
        if (r1 != 0) goto L_0x04cb;
    L_0x04ad:
        r1 = "Could not delete partial cache file at ";
        r4 = r12.getAbsolutePath();
        r4 = java.lang.String.valueOf(r4);
        r5 = r4.length();
        if (r5 == 0) goto L_0x04c2;
    L_0x04bd:
        r1 = r1.concat(r4);
        goto L_0x04c8;
    L_0x04c2:
        r4 = new java.lang.String;
        r4.<init>(r1);
        r1 = r4;
    L_0x04c8:
        com.google.android.gms.internal.hx.m19916e(r1);
    L_0x04cb:
        r1 = r12.getAbsolutePath();
        r8.m27423a(r9, r1, r2, r3);
        r1 = f26911b;
        r1.remove(r15);
        r1 = 0;
        return r1;
    L_0x04d9:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r1);	 Catch:{ all -> 0x04d9 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.kt.a(java.lang.String):boolean");
    }
}
