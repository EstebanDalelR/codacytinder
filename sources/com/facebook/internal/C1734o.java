package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C1724k.C1720d;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.facebook.internal.o */
class C1734o {
    /* renamed from: a */
    static final String f4792a = "o";
    /* renamed from: b */
    private static C1724k f4793b;

    /* renamed from: com.facebook.internal.o$a */
    private static class C1733a extends BufferedInputStream {
        /* renamed from: a */
        HttpURLConnection f4791a;

        C1733a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            this.f4791a = httpURLConnection;
        }

        public void close() throws IOException {
            super.close();
            Utility.m5779a(this.f4791a);
        }
    }

    C1734o() {
    }

    /* renamed from: a */
    static synchronized C1724k m5966a(Context context) throws IOException {
        C1724k c1724k;
        synchronized (C1734o.class) {
            if (f4793b == null) {
                f4793b = new C1724k(f4792a, new C1720d());
            }
            c1724k = f4793b;
        }
        return c1724k;
    }

    /* renamed from: a */
    static InputStream m5968a(Uri uri, Context context) {
        if (uri != null && C1734o.m5969a(uri)) {
            try {
                return C1734o.m5966a(context).m5940a(uri.toString());
            } catch (Uri uri2) {
                C1738r.m5976a(LoggingBehavior.CACHE, 5, f4792a, uri2.toString());
            }
        }
        return null;
    }

    /* renamed from: a */
    static java.io.InputStream m5967a(android.content.Context r3, java.net.HttpURLConnection r4) throws java.io.IOException {
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
        r0 = r4.getResponseCode();
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 != r1) goto L_0x0031;
    L_0x0008:
        r0 = r4.getURL();
        r0 = r0.toString();
        r0 = android.net.Uri.parse(r0);
        r1 = r4.getInputStream();
        r2 = com.facebook.internal.C1734o.m5969a(r0);	 Catch:{ IOException -> 0x0032 }
        if (r2 == 0) goto L_0x0032;	 Catch:{ IOException -> 0x0032 }
    L_0x001e:
        r3 = com.facebook.internal.C1734o.m5966a(r3);	 Catch:{ IOException -> 0x0032 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0032 }
        r2 = new com.facebook.internal.o$a;	 Catch:{ IOException -> 0x0032 }
        r2.<init>(r1, r4);	 Catch:{ IOException -> 0x0032 }
        r3 = r3.m5941a(r0, r2);	 Catch:{ IOException -> 0x0032 }
        r1 = r3;
        goto L_0x0032;
    L_0x0031:
        r1 = 0;
    L_0x0032:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.o.a(android.content.Context, java.net.HttpURLConnection):java.io.InputStream");
    }

    /* renamed from: a */
    private static boolean m5969a(Uri uri) {
        if (uri != null) {
            uri = uri.getHost();
            if (uri.endsWith("fbcdn.net")) {
                return true;
            }
            if (uri.startsWith("fbcdn") && uri.endsWith("akamaihd.net") != null) {
                return true;
            }
        }
        return null;
    }
}
