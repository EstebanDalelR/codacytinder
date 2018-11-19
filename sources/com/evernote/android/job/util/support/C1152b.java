package com.evernote.android.job.util.support;

import com.evernote.android.job.util.C3142c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.evernote.android.job.util.support.b */
public final class C1152b {
    /* renamed from: a */
    private static final C3142c f3034a = new C3142c("PersistableBundleCompat");
    /* renamed from: b */
    private final Map<String, Object> f3035b;

    public C1152b() {
        this(new HashMap());
    }

    public C1152b(C1152b c1152b) {
        this(new HashMap(c1152b.f3035b));
    }

    private C1152b(Map<String, Object> map) {
        this.f3035b = map;
    }

    /* renamed from: a */
    public void m3935a(String str, boolean z) {
        this.f3035b.put(str, Boolean.valueOf(z));
    }

    /* renamed from: b */
    public boolean m3939b(String str, boolean z) {
        str = this.f3035b.get(str);
        return str instanceof Boolean ? ((Boolean) str).booleanValue() : z;
    }

    /* renamed from: a */
    public void m3933a(String str, long j) {
        this.f3035b.put(str, Long.valueOf(j));
    }

    /* renamed from: b */
    public long m3937b(String str, long j) {
        str = this.f3035b.get(str);
        return str instanceof Long ? ((Long) str).longValue() : j;
    }

    /* renamed from: a */
    public void m3934a(String str, String str2) {
        this.f3035b.put(str, str2);
    }

    /* renamed from: b */
    public String m3938b(String str, String str2) {
        str = this.f3035b.get(str);
        return str instanceof String ? str : str2;
    }

    /* renamed from: a */
    public boolean m3936a(String str) {
        return this.f3035b.containsKey(str);
    }

    /* renamed from: a */
    public void m3932a(C1152b c1152b) {
        this.f3035b.putAll(c1152b.f3035b);
    }

    @android.support.annotation.NonNull
    /* renamed from: a */
    public java.lang.String m3931a() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = new java.io.ByteArrayOutputStream;
        r0.<init>();
        r1 = r3.f3035b;	 Catch:{ XmlPullParserException -> 0x0022, XmlPullParserException -> 0x0022, Error -> 0x0016 }
        com.evernote.android.job.util.support.XmlUtils.m3904a(r1, r0);	 Catch:{ XmlPullParserException -> 0x0022, XmlPullParserException -> 0x0022, Error -> 0x0016 }
        r1 = "UTF-8";	 Catch:{ XmlPullParserException -> 0x0022, XmlPullParserException -> 0x0022, Error -> 0x0016 }
        r1 = r0.toString(r1);	 Catch:{ XmlPullParserException -> 0x0022, XmlPullParserException -> 0x0022, Error -> 0x0016 }
        r0.close();	 Catch:{ IOException -> 0x0013 }
    L_0x0013:
        return r1;
    L_0x0014:
        r1 = move-exception;
        goto L_0x002e;
    L_0x0016:
        r1 = move-exception;
        r2 = f3034a;	 Catch:{ all -> 0x0014 }
        r2.m12117a(r1);	 Catch:{ all -> 0x0014 }
        r1 = "";	 Catch:{ all -> 0x0014 }
        r0.close();	 Catch:{ IOException -> 0x0021 }
    L_0x0021:
        return r1;
    L_0x0022:
        r1 = move-exception;
        r2 = f3034a;	 Catch:{ all -> 0x0014 }
        r2.m12117a(r1);	 Catch:{ all -> 0x0014 }
        r1 = "";	 Catch:{ all -> 0x0014 }
        r0.close();	 Catch:{ IOException -> 0x002d }
    L_0x002d:
        return r1;
    L_0x002e:
        r0.close();	 Catch:{ IOException -> 0x0031 }
    L_0x0031:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.util.support.b.a():java.lang.String");
    }

    @android.support.annotation.NonNull
    /* renamed from: b */
    public static com.evernote.android.job.util.support.C1152b m3930b(@android.support.annotation.NonNull java.lang.String r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 0;
        r1 = new java.io.ByteArrayInputStream;	 Catch:{ XmlPullParserException -> 0x0037, XmlPullParserException -> 0x0037, VerifyError -> 0x0026 }
        r2 = "UTF-8";	 Catch:{ XmlPullParserException -> 0x0037, XmlPullParserException -> 0x0037, VerifyError -> 0x0026 }
        r3 = r3.getBytes(r2);	 Catch:{ XmlPullParserException -> 0x0037, XmlPullParserException -> 0x0037, VerifyError -> 0x0026 }
        r1.<init>(r3);	 Catch:{ XmlPullParserException -> 0x0037, XmlPullParserException -> 0x0037, VerifyError -> 0x0026 }
        r3 = com.evernote.android.job.util.support.XmlUtils.m3898a(r1);	 Catch:{ XmlPullParserException -> 0x0021, XmlPullParserException -> 0x0021, VerifyError -> 0x001e, all -> 0x001b }
        r0 = new com.evernote.android.job.util.support.b;	 Catch:{ XmlPullParserException -> 0x0021, XmlPullParserException -> 0x0021, VerifyError -> 0x001e, all -> 0x001b }
        r0.<init>(r3);	 Catch:{ XmlPullParserException -> 0x0021, XmlPullParserException -> 0x0021, VerifyError -> 0x001e, all -> 0x001b }
        if (r1 == 0) goto L_0x001a;
    L_0x0017:
        r1.close();	 Catch:{ IOException -> 0x001a }
    L_0x001a:
        return r0;
    L_0x001b:
        r3 = move-exception;
        r0 = r1;
        goto L_0x0048;
    L_0x001e:
        r3 = move-exception;
        r0 = r1;
        goto L_0x0027;
    L_0x0021:
        r3 = move-exception;
        r0 = r1;
        goto L_0x0038;
    L_0x0024:
        r3 = move-exception;
        goto L_0x0048;
    L_0x0026:
        r3 = move-exception;
    L_0x0027:
        r1 = f3034a;	 Catch:{ all -> 0x0024 }
        r1.m12117a(r3);	 Catch:{ all -> 0x0024 }
        r3 = new com.evernote.android.job.util.support.b;	 Catch:{ all -> 0x0024 }
        r3.<init>();	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x0036;
    L_0x0033:
        r0.close();	 Catch:{ IOException -> 0x0036 }
    L_0x0036:
        return r3;
    L_0x0037:
        r3 = move-exception;
    L_0x0038:
        r1 = f3034a;	 Catch:{ all -> 0x0024 }
        r1.m12117a(r3);	 Catch:{ all -> 0x0024 }
        r3 = new com.evernote.android.job.util.support.b;	 Catch:{ all -> 0x0024 }
        r3.<init>();	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x0047;
    L_0x0044:
        r0.close();	 Catch:{ IOException -> 0x0047 }
    L_0x0047:
        return r3;
    L_0x0048:
        if (r0 == 0) goto L_0x004d;
    L_0x004a:
        r0.close();	 Catch:{ IOException -> 0x004d }
    L_0x004d:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.util.support.b.b(java.lang.String):com.evernote.android.job.util.support.b");
    }
}
