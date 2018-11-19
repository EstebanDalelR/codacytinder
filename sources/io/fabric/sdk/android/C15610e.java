package io.fabric.sdk.android;

import android.os.SystemClock;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: io.fabric.sdk.android.e */
class C15610e implements Callable<Map<String, C15612h>> {
    /* renamed from: a */
    final String f48328a;

    public /* synthetic */ Object call() throws Exception {
        return m58578a();
    }

    C15610e(String str) {
        this.f48328a = str;
    }

    /* renamed from: a */
    public Map<String, C15612h> m58578a() throws Exception {
        Map<String, C15612h> hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(m58576c());
        hashMap.putAll(m58577d());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("finish scanning in ");
        stringBuilder.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        C15608c.m58560h().mo12802v("Fabric", stringBuilder.toString());
        return hashMap;
    }

    /* renamed from: c */
    private java.util.Map<java.lang.String, io.fabric.sdk.android.C15612h> m58576c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = "com.google.android.gms.ads.e";	 Catch:{ Exception -> 0x0027 }
        java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x0027 }
        r1 = new io.fabric.sdk.android.h;	 Catch:{ Exception -> 0x0027 }
        r2 = "com.google.firebase.firebase-ads";	 Catch:{ Exception -> 0x0027 }
        r3 = "0.0.0";	 Catch:{ Exception -> 0x0027 }
        r4 = "binary";	 Catch:{ Exception -> 0x0027 }
        r1.<init>(r2, r3, r4);	 Catch:{ Exception -> 0x0027 }
        r2 = r1.m58580a();	 Catch:{ Exception -> 0x0027 }
        r0.put(r2, r1);	 Catch:{ Exception -> 0x0027 }
        r1 = io.fabric.sdk.android.C15608c.m58560h();	 Catch:{ Exception -> 0x0027 }
        r2 = "Fabric";	 Catch:{ Exception -> 0x0027 }
        r3 = "Found kit: com.google.firebase.firebase-ads";	 Catch:{ Exception -> 0x0027 }
        r1.mo12802v(r2, r3);	 Catch:{ Exception -> 0x0027 }
    L_0x0027:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.e.c():java.util.Map<java.lang.String, io.fabric.sdk.android.h>");
    }

    /* renamed from: d */
    private java.util.Map<java.lang.String, io.fabric.sdk.android.C15612h> m58577d() throws java.lang.Exception {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = r10.m58579b();
        r2 = r1.entries();
    L_0x000d:
        r3 = r2.hasMoreElements();
        if (r3 == 0) goto L_0x0063;
    L_0x0013:
        r3 = r2.nextElement();
        r3 = (java.util.zip.ZipEntry) r3;
        r4 = r3.getName();
        r5 = "fabric/";
        r4 = r4.startsWith(r5);
        if (r4 == 0) goto L_0x000d;
    L_0x0025:
        r4 = r3.getName();
        r4 = r4.length();
        r5 = "fabric/";
        r5 = r5.length();
        if (r4 <= r5) goto L_0x000d;
    L_0x0035:
        r3 = r10.m58575a(r3, r1);
        if (r3 == 0) goto L_0x000d;
    L_0x003b:
        r4 = r3.m58580a();
        r0.put(r4, r3);
        r4 = io.fabric.sdk.android.C15608c.m58560h();
        r5 = "Fabric";
        r6 = "Found kit:[%s] version:[%s]";
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r9 = r3.m58580a();
        r7[r8] = r9;
        r8 = 1;
        r3 = r3.m58581b();
        r7[r8] = r3;
        r3 = java.lang.String.format(r6, r7);
        r4.mo12802v(r5, r3);
        goto L_0x000d;
    L_0x0063:
        if (r1 == 0) goto L_0x0068;
    L_0x0065:
        r1.close();	 Catch:{ IOException -> 0x0068 }
    L_0x0068:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.e.d():java.util.Map<java.lang.String, io.fabric.sdk.android.h>");
    }

    /* renamed from: a */
    private C15612h m58575a(ZipEntry zipEntry, ZipFile zipFile) {
        Closeable inputStream;
        Throwable e;
        StringBuilder stringBuilder;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                Object property = properties.getProperty("fabric-identifier");
                Object property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (!TextUtils.isEmpty(property)) {
                    if (!TextUtils.isEmpty(property2)) {
                        C15612h c15612h = new C15612h(property, property2, property3);
                        CommonUtils.m58602a(inputStream);
                        return c15612h;
                    }
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Invalid format of fabric file,");
                stringBuilder2.append(zipEntry.getName());
                throw new IllegalStateException(stringBuilder2.toString());
            } catch (IOException e2) {
                e = e2;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error when parsing fabric properties ");
                    stringBuilder.append(zipEntry.getName());
                    C15608c.m58560h().mo12794e("Fabric", stringBuilder.toString(), e);
                    CommonUtils.m58602a(inputStream);
                    return null;
                } catch (Throwable th) {
                    zipEntry = th;
                    CommonUtils.m58602a(inputStream);
                    throw zipEntry;
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error when parsing fabric properties ");
            stringBuilder.append(zipEntry.getName());
            C15608c.m58560h().mo12794e("Fabric", stringBuilder.toString(), e);
            CommonUtils.m58602a(inputStream);
            return null;
        } catch (Throwable th2) {
            zipEntry = th2;
            inputStream = null;
            CommonUtils.m58602a(inputStream);
            throw zipEntry;
        }
    }

    /* renamed from: b */
    protected ZipFile m58579b() throws IOException {
        return new ZipFile(this.f48328a);
    }
}
