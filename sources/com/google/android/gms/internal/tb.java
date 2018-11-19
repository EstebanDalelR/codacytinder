package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

public final class tb {
    /* renamed from: e */
    private static final String[] f16520e = new String[]{"/aclk", "/pcs/click"};
    /* renamed from: a */
    private String f16521a = "googleads.g.doubleclick.net";
    /* renamed from: b */
    private String f16522b = "/pagead/ads";
    /* renamed from: c */
    private String f16523c = "ad.doubleclick.net";
    /* renamed from: d */
    private String[] f16524d = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    /* renamed from: f */
    private zzcr f16525f;

    public tb(zzcr zzcr) {
        this.f16525f = zzcr;
    }

    /* renamed from: a */
    private final android.net.Uri m20176a(android.net.Uri r4, android.content.Context r5, java.lang.String r6, boolean r7, android.view.View r8, android.app.Activity r9) throws com.google.android.gms.internal.zzcw {
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
        r0 = r3.m20177c(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r0 == 0) goto L_0x001a;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0006:
        r1 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r2 = "dc_ms=";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = r1.contains(r2);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r1 == 0) goto L_0x002a;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0012:
        r4 = new com.google.android.gms.internal.zzcw;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = "Parameter already exists: dc_ms";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.<init>(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        throw r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x001a:
        r1 = "ms";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = r4.getQueryParameter(r1);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r1 == 0) goto L_0x002a;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0022:
        r4 = new com.google.android.gms.internal.zzcw;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = "Query parameter already exists: ms";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.<init>(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        throw r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x002a:
        if (r7 == 0) goto L_0x0033;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x002c:
        r7 = r3.f16525f;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = r7.zza(r5, r6, r8, r9);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        goto L_0x0039;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0033:
        r6 = r3.f16525f;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = r6.zza(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0039:
        r6 = 0;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r7 = -1;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r0 == 0) goto L_0x00b6;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x003d:
        r8 = "dc_ms";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r9 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0 = ";adurl";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0 = r9.indexOf(r0);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r0 == r7) goto L_0x0076;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x004b:
        r4 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0 = r0 + 1;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = r9.substring(r6, r0);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.<init>(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = "=";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = ";";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = r9.substring(r0);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = android.net.Uri.parse(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        return r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0076:
        r4 = r4.getEncodedPath();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r7 = r9.indexOf(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = r4.length();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = r1 + r7;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = r9.substring(r6, r1);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0.<init>(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = ";";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = "=";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = ";";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r4.length();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r7 = r7 + r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r9.substring(r7);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0.append(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r0.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = android.net.Uri.parse(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        return r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x00b6:
        r8 = "ms";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r9 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0 = "&adurl";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0 = r9.indexOf(r0);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r0 != r7) goto L_0x00ca;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x00c4:
        r0 = "?adurl";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0 = r9.indexOf(r0);	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x00ca:
        if (r0 == r7) goto L_0x00f7;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x00cc:
        r4 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0 = r0 + 1;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = r9.substring(r6, r0);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.<init>(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = "=";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = "&";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = r9.substring(r0);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = android.net.Uri.parse(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        return r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x00f7:
        r4 = r4.buildUpon();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r4.appendQueryParameter(r8, r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r4.build();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        return r4;
    L_0x0104:
        r4 = new com.google.android.gms.internal.zzcw;
        r5 = "Provided Uri is not in a valid state";
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tb.a(android.net.Uri, android.content.Context, java.lang.String, boolean, android.view.View, android.app.Activity):android.net.Uri");
    }

    /* renamed from: c */
    private final boolean m20177c(android.net.Uri r2) {
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
        r1 = this;
        if (r2 != 0) goto L_0x0008;
    L_0x0002:
        r2 = new java.lang.NullPointerException;
        r2.<init>();
        throw r2;
    L_0x0008:
        r2 = r2.getHost();	 Catch:{ NullPointerException -> 0x0013 }
        r0 = r1.f16523c;	 Catch:{ NullPointerException -> 0x0013 }
        r2 = r2.equals(r0);	 Catch:{ NullPointerException -> 0x0013 }
        return r2;
    L_0x0013:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tb.c(android.net.Uri):boolean");
    }

    /* renamed from: a */
    public final Uri m20178a(Uri uri, Context context) throws zzcw {
        return m20176a(uri, context, null, false, null, null);
    }

    /* renamed from: a */
    public final android.net.Uri m20179a(android.net.Uri r9, android.content.Context r10, android.view.View r11, android.app.Activity r12) throws com.google.android.gms.internal.zzcw {
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
        r8 = this;
        r0 = "ai";	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r4 = r9.getQueryParameter(r0);	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r5 = 1;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r1 = r8;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r2 = r9;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r3 = r10;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r6 = r11;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r7 = r12;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r9 = r1.m20176a(r2, r3, r4, r5, r6, r7);	 Catch:{ UnsupportedOperationException -> 0x0011 }
        return r9;
    L_0x0011:
        r9 = new com.google.android.gms.internal.zzcw;
        r10 = "Provided Uri is not in a valid state";
        r9.<init>(r10);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tb.a(android.net.Uri, android.content.Context, android.view.View, android.app.Activity):android.net.Uri");
    }

    /* renamed from: a */
    public final zzcr m20180a() {
        return this.f16525f;
    }

    /* renamed from: a */
    public final void m20181a(MotionEvent motionEvent) {
        this.f16525f.zza(motionEvent);
    }

    /* renamed from: a */
    public final boolean m20182a(android.net.Uri r6) {
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
        r5 = this;
        if (r6 != 0) goto L_0x0008;
    L_0x0002:
        r6 = new java.lang.NullPointerException;
        r6.<init>();
        throw r6;
    L_0x0008:
        r0 = 0;
        r6 = r6.getHost();	 Catch:{ NullPointerException -> 0x0020 }
        r1 = r5.f16524d;	 Catch:{ NullPointerException -> 0x0020 }
        r2 = r1.length;	 Catch:{ NullPointerException -> 0x0020 }
        r3 = 0;	 Catch:{ NullPointerException -> 0x0020 }
    L_0x0011:
        if (r3 >= r2) goto L_0x0020;	 Catch:{ NullPointerException -> 0x0020 }
    L_0x0013:
        r4 = r1[r3];	 Catch:{ NullPointerException -> 0x0020 }
        r4 = r6.endsWith(r4);	 Catch:{ NullPointerException -> 0x0020 }
        if (r4 == 0) goto L_0x001d;
    L_0x001b:
        r6 = 1;
        return r6;
    L_0x001d:
        r3 = r3 + 1;
        goto L_0x0011;
    L_0x0020:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tb.a(android.net.Uri):boolean");
    }

    /* renamed from: b */
    public final boolean m20183b(Uri uri) {
        if (m20182a(uri)) {
            for (String endsWith : f16520e) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }
}
