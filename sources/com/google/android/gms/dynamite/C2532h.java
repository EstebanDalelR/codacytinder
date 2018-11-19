package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

/* renamed from: com.google.android.gms.dynamite.h */
final class C2532h extends PathClassLoader {
    C2532h(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    protected final java.lang.Class<?> loadClass(java.lang.String r2, boolean r3) throws java.lang.ClassNotFoundException {
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
        r0 = "java.";
        r0 = r2.startsWith(r0);
        if (r0 != 0) goto L_0x0015;
    L_0x0008:
        r0 = "android.";
        r0 = r2.startsWith(r0);
        if (r0 != 0) goto L_0x0015;
    L_0x0010:
        r0 = r1.findClass(r2);	 Catch:{ ClassNotFoundException -> 0x0015 }
        return r0;
    L_0x0015:
        r2 = super.loadClass(r2, r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.h.loadClass(java.lang.String, boolean):java.lang.Class<?>");
    }
}
