package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.upstream.f */
public final class C3723f implements DataSource {
    /* renamed from: a */
    private final Context f11747a;
    /* renamed from: b */
    private final TransferListener<? super DataSource> f11748b;
    /* renamed from: c */
    private final DataSource f11749c;
    /* renamed from: d */
    private DataSource f11750d;
    /* renamed from: e */
    private DataSource f11751e;
    /* renamed from: f */
    private DataSource f11752f;
    /* renamed from: g */
    private DataSource f11753g;
    /* renamed from: h */
    private DataSource f11754h;
    /* renamed from: i */
    private DataSource f11755i;
    /* renamed from: j */
    private DataSource f11756j;

    public C3723f(Context context, TransferListener<? super DataSource> transferListener, DataSource dataSource) {
        this.f11747a = context.getApplicationContext();
        this.f11748b = transferListener;
        this.f11749c = (DataSource) C2289a.m8309a((Object) dataSource);
    }

    public long open(DataSpec dataSpec) throws IOException {
        C2289a.m8313b(this.f11756j == null);
        String scheme = dataSpec.f6822a.getScheme();
        if (C2314v.m8478a(dataSpec.f6822a)) {
            if (dataSpec.f6822a.getPath().startsWith("/android_asset/")) {
                this.f11756j = m14143b();
            } else {
                this.f11756j = m14142a();
            }
        } else if ("asset".equals(scheme)) {
            this.f11756j = m14143b();
        } else if ("content".equals(scheme)) {
            this.f11756j = m14144c();
        } else if ("rtmp".equals(scheme)) {
            this.f11756j = m14145d();
        } else if (ManagerWebServices.FB_DATA.equals(scheme)) {
            this.f11756j = m14146e();
        } else if ("rawresource".equals(scheme)) {
            this.f11756j = m14147f();
        } else {
            this.f11756j = this.f11749c;
        }
        return this.f11756j.open(dataSpec);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f11756j.read(bArr, i, i2);
    }

    public Uri getUri() {
        return this.f11756j == null ? null : this.f11756j.getUri();
    }

    public void close() throws IOException {
        if (this.f11756j != null) {
            try {
                this.f11756j.close();
            } finally {
                this.f11756j = null;
            }
        }
    }

    /* renamed from: a */
    private DataSource m14142a() {
        if (this.f11750d == null) {
            this.f11750d = new FileDataSource(this.f11748b);
        }
        return this.f11750d;
    }

    /* renamed from: b */
    private DataSource m14143b() {
        if (this.f11751e == null) {
            this.f11751e = new AssetDataSource(this.f11747a, this.f11748b);
        }
        return this.f11751e;
    }

    /* renamed from: c */
    private DataSource m14144c() {
        if (this.f11752f == null) {
            this.f11752f = new ContentDataSource(this.f11747a, this.f11748b);
        }
        return this.f11752f;
    }

    /* renamed from: d */
    private com.google.android.exoplayer2.upstream.DataSource m14145d() {
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
        r0 = r3.f11753g;
        if (r0 != 0) goto L_0x0034;
    L_0x0004:
        r0 = "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource";	 Catch:{ ClassNotFoundException -> 0x0025, Exception -> 0x001c }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0025, Exception -> 0x001c }
        r1 = 0;	 Catch:{ ClassNotFoundException -> 0x0025, Exception -> 0x001c }
        r2 = new java.lang.Class[r1];	 Catch:{ ClassNotFoundException -> 0x0025, Exception -> 0x001c }
        r0 = r0.getConstructor(r2);	 Catch:{ ClassNotFoundException -> 0x0025, Exception -> 0x001c }
        r1 = new java.lang.Object[r1];	 Catch:{ ClassNotFoundException -> 0x0025, Exception -> 0x001c }
        r0 = r0.newInstance(r1);	 Catch:{ ClassNotFoundException -> 0x0025, Exception -> 0x001c }
        r0 = (com.google.android.exoplayer2.upstream.DataSource) r0;	 Catch:{ ClassNotFoundException -> 0x0025, Exception -> 0x001c }
        r3.f11753g = r0;	 Catch:{ ClassNotFoundException -> 0x0025, Exception -> 0x001c }
        goto L_0x002c;
    L_0x001c:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = "Error instantiating RTMP extension";
        r1.<init>(r2, r0);
        throw r1;
    L_0x0025:
        r0 = "DefaultDataSource";
        r1 = "Attempting to play RTMP stream without depending on the RTMP extension";
        android.util.Log.w(r0, r1);
    L_0x002c:
        r0 = r3.f11753g;
        if (r0 != 0) goto L_0x0034;
    L_0x0030:
        r0 = r3.f11749c;
        r3.f11753g = r0;
    L_0x0034:
        r0 = r3.f11753g;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.f.d():com.google.android.exoplayer2.upstream.DataSource");
    }

    /* renamed from: e */
    private DataSource m14146e() {
        if (this.f11754h == null) {
            this.f11754h = new C3717b();
        }
        return this.f11754h;
    }

    /* renamed from: f */
    private DataSource m14147f() {
        if (this.f11755i == null) {
            this.f11755i = new RawResourceDataSource(this.f11747a, this.f11748b);
        }
        return this.f11755i;
    }
}
