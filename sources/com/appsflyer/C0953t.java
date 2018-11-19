package com.appsflyer;

/* renamed from: com.appsflyer.t */
final class C0953t {
    /* renamed from: a */
    private C0951a f2532a = new C30121(this);

    /* renamed from: com.appsflyer.t$a */
    interface C0951a {
        /* renamed from: a */
        Class<?> mo1229a(String str) throws ClassNotFoundException;
    }

    /* renamed from: com.appsflyer.t$b */
    enum C0952b {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT("android_native", "android_native");
        
        private String classLoaderName;
        private String platformName;

        private C0952b(String str, String str2) {
            this.platformName = str;
            this.classLoaderName = str2;
        }
    }

    /* renamed from: com.appsflyer.t$1 */
    class C30121 implements C0951a {
        /* renamed from: a */
        final /* synthetic */ C0953t f9388a;

        C30121(C0953t c0953t) {
            this.f9388a = c0953t;
        }

        /* renamed from: a */
        public final Class<?> mo1229a(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    }

    /* renamed from: a */
    final String m3253a() {
        for (C0952b c0952b : C0952b.values()) {
            if (m3254a(c0952b.classLoaderName)) {
                return c0952b.platformName;
            }
        }
        return C0952b.DEFAULT.platformName;
    }

    C0953t() {
    }

    /* renamed from: a */
    final boolean m3254a(java.lang.String r4) {
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
        r0 = 0;
        r1 = r3.f2532a;	 Catch:{ ClassNotFoundException -> 0x0027, Throwable -> 0x001e }
        r1.mo1229a(r4);	 Catch:{ ClassNotFoundException -> 0x0027, Throwable -> 0x001e }
        r1 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0027, Throwable -> 0x001e }
        r2 = "Class: ";	 Catch:{ ClassNotFoundException -> 0x0027, Throwable -> 0x001e }
        r1.<init>(r2);	 Catch:{ ClassNotFoundException -> 0x0027, Throwable -> 0x001e }
        r1.append(r4);	 Catch:{ ClassNotFoundException -> 0x0027, Throwable -> 0x001e }
        r4 = " is found.";	 Catch:{ ClassNotFoundException -> 0x0027, Throwable -> 0x001e }
        r1.append(r4);	 Catch:{ ClassNotFoundException -> 0x0027, Throwable -> 0x001e }
        r4 = r1.toString();	 Catch:{ ClassNotFoundException -> 0x0027, Throwable -> 0x001e }
        com.appsflyer.AFLogger.m3072a(r4);	 Catch:{ ClassNotFoundException -> 0x0027, Throwable -> 0x001e }
        r4 = 1;
        return r4;
    L_0x001e:
        r4 = move-exception;
        r1 = r4.getMessage();
        com.appsflyer.AFLogger.m3073a(r1, r4);
        return r0;
    L_0x0027:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.t.a(java.lang.String):boolean");
    }
}
