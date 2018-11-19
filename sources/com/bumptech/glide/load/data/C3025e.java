package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.model.C1036d;
import com.bumptech.glide.p026d.C0980b;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.data.e */
public class C3025e implements DataFetcher<InputStream> {
    /* renamed from: a */
    private static final C0997b f9424a = new C3024a();
    /* renamed from: b */
    private final C1036d f9425b;
    /* renamed from: c */
    private final C0997b f9426c;
    /* renamed from: d */
    private HttpURLConnection f9427d;
    /* renamed from: e */
    private InputStream f9428e;
    /* renamed from: f */
    private volatile boolean f9429f;

    /* renamed from: com.bumptech.glide.load.data.e$b */
    interface C0997b {
        /* renamed from: a */
        HttpURLConnection mo1272a(URL url) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.data.e$a */
    private static class C3024a implements C0997b {
        private C3024a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo1272a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public /* synthetic */ Object loadData(Priority priority) throws Exception {
        return m11928a(priority);
    }

    public C3025e(C1036d c1036d) {
        this(c1036d, f9424a);
    }

    C3025e(C1036d c1036d, C0997b c0997b) {
        this.f9425b = c1036d;
        this.f9426c = c0997b;
    }

    /* renamed from: a */
    public InputStream m11928a(Priority priority) throws Exception {
        return m11927a(this.f9425b.m3578a(), 0, null, this.f9425b.m3580c());
    }

    /* renamed from: a */
    private java.io.InputStream m11927a(java.net.URL r4, int r5, java.net.URL r6, java.util.Map<java.lang.String, java.lang.String> r7) throws java.io.IOException {
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
        r3 = this;
        r0 = 5;
        if (r5 < r0) goto L_0x000b;
    L_0x0003:
        r4 = new java.io.IOException;
        r5 = "Too many (> 5) redirects!";
        r4.<init>(r5);
        throw r4;
    L_0x000b:
        if (r6 == 0) goto L_0x0023;
    L_0x000d:
        r0 = r4.toURI();	 Catch:{ URISyntaxException -> 0x0023 }
        r6 = r6.toURI();	 Catch:{ URISyntaxException -> 0x0023 }
        r6 = r0.equals(r6);	 Catch:{ URISyntaxException -> 0x0023 }
        if (r6 == 0) goto L_0x0023;	 Catch:{ URISyntaxException -> 0x0023 }
    L_0x001b:
        r6 = new java.io.IOException;	 Catch:{ URISyntaxException -> 0x0023 }
        r0 = "In re-direct loop";	 Catch:{ URISyntaxException -> 0x0023 }
        r6.<init>(r0);	 Catch:{ URISyntaxException -> 0x0023 }
        throw r6;	 Catch:{ URISyntaxException -> 0x0023 }
    L_0x0023:
        r6 = r3.f9426c;
        r6 = r6.mo1272a(r4);
        r3.f9427d = r6;
        r6 = r7.entrySet();
        r6 = r6.iterator();
    L_0x0033:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0051;
    L_0x0039:
        r0 = r6.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r3.f9427d;
        r2 = r0.getKey();
        r2 = (java.lang.String) r2;
        r0 = r0.getValue();
        r0 = (java.lang.String) r0;
        r1.addRequestProperty(r2, r0);
        goto L_0x0033;
    L_0x0051:
        r6 = r3.f9427d;
        r0 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        r6.setConnectTimeout(r0);
        r6 = r3.f9427d;
        r6.setReadTimeout(r0);
        r6 = r3.f9427d;
        r0 = 0;
        r6.setUseCaches(r0);
        r6 = r3.f9427d;
        r0 = 1;
        r6.setDoInput(r0);
        r6 = r3.f9427d;
        r6.connect();
        r6 = r3.f9429f;
        if (r6 == 0) goto L_0x0074;
    L_0x0072:
        r4 = 0;
        return r4;
    L_0x0074:
        r6 = r3.f9427d;
        r6 = r6.getResponseCode();
        r1 = r6 / 100;
        r2 = 2;
        if (r1 != r2) goto L_0x0086;
    L_0x007f:
        r4 = r3.f9427d;
        r4 = r3.m11926a(r4);
        return r4;
    L_0x0086:
        r2 = 3;
        if (r1 != r2) goto L_0x00aa;
    L_0x0089:
        r6 = r3.f9427d;
        r1 = "Location";
        r6 = r6.getHeaderField(r1);
        r1 = android.text.TextUtils.isEmpty(r6);
        if (r1 == 0) goto L_0x009f;
    L_0x0097:
        r4 = new java.io.IOException;
        r5 = "Received empty or null redirect url";
        r4.<init>(r5);
        throw r4;
    L_0x009f:
        r1 = new java.net.URL;
        r1.<init>(r4, r6);
        r5 = r5 + r0;
        r4 = r3.m11927a(r1, r5, r4, r7);
        return r4;
    L_0x00aa:
        r4 = -1;
        if (r6 != r4) goto L_0x00b5;
    L_0x00ad:
        r4 = new java.io.IOException;
        r5 = "Unable to retrieve response code from HttpUrlConnection.";
        r4.<init>(r5);
        throw r4;
    L_0x00b5:
        r4 = new java.io.IOException;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r7 = "Request failed ";
        r5.append(r7);
        r5.append(r6);
        r6 = ": ";
        r5.append(r6);
        r6 = r3.f9427d;
        r6 = r6.getResponseMessage();
        r5.append(r6);
        r5 = r5.toString();
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.e.a(java.net.URL, int, java.net.URL, java.util.Map):java.io.InputStream");
    }

    /* renamed from: a */
    private InputStream m11926a(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f9428e = C0980b.m3387a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got non empty content encoding: ");
                stringBuilder.append(httpURLConnection.getContentEncoding());
                Log.d("HttpUrlFetcher", stringBuilder.toString());
            }
            this.f9428e = httpURLConnection.getInputStream();
        }
        return this.f9428e;
    }

    public void cleanup() {
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
        r1 = this;
        r0 = r1.f9428e;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r1.f9428e;	 Catch:{ IOException -> 0x0009 }
        r0.close();	 Catch:{ IOException -> 0x0009 }
    L_0x0009:
        r0 = r1.f9427d;
        if (r0 == 0) goto L_0x0012;
    L_0x000d:
        r0 = r1.f9427d;
        r0.disconnect();
    L_0x0012:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.e.cleanup():void");
    }

    public String getId() {
        return this.f9425b.m3581d();
    }

    public void cancel() {
        this.f9429f = true;
    }
}
