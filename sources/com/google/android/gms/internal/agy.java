package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.security.MessageDigest;

@zzzv
public abstract class agy {
    @Nullable
    /* renamed from: b */
    private static MessageDigest f15254b;
    /* renamed from: a */
    protected Object f15255a = new Object();

    @android.support.annotation.Nullable
    /* renamed from: a */
    protected final java.security.MessageDigest m19160a() {
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
        r0 = r3.f15255a;
        monitor-enter(r0);
        r1 = f15254b;	 Catch:{ all -> 0x001e }
        if (r1 == 0) goto L_0x000b;	 Catch:{ all -> 0x001e }
    L_0x0007:
        r1 = f15254b;	 Catch:{ all -> 0x001e }
        monitor-exit(r0);	 Catch:{ all -> 0x001e }
        return r1;
    L_0x000b:
        r1 = 0;
    L_0x000c:
        r2 = 2;
        if (r1 >= r2) goto L_0x001a;
    L_0x000f:
        r2 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x0017 }
        r2 = java.security.MessageDigest.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0017 }
        f15254b = r2;	 Catch:{ NoSuchAlgorithmException -> 0x0017 }
    L_0x0017:
        r1 = r1 + 1;
        goto L_0x000c;
    L_0x001a:
        r1 = f15254b;	 Catch:{ all -> 0x001e }
        monitor-exit(r0);	 Catch:{ all -> 0x001e }
        return r1;	 Catch:{ all -> 0x001e }
    L_0x001e:
        r1 = move-exception;	 Catch:{ all -> 0x001e }
        monitor-exit(r0);	 Catch:{ all -> 0x001e }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.agy.a():java.security.MessageDigest");
    }

    /* renamed from: a */
    abstract byte[] mo4244a(String str);
}
