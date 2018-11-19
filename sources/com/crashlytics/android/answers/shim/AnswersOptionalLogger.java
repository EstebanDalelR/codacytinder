package com.crashlytics.android.answers.shim;

public class AnswersOptionalLogger {
    private static final String TAG = "AnswersOptionalLogger";
    private static final KitEventLogger logger;

    static {
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
        r0 = com.crashlytics.android.answers.shim.AnswersKitEventLogger.create();	 Catch:{ NoClassDefFoundError -> 0x000d, NoClassDefFoundError -> 0x000d, Throwable -> 0x0005 }
        goto L_0x000e;
    L_0x0005:
        r0 = move-exception;
        r1 = "AnswersOptionalLogger";
        r2 = "Unexpected error creating AnswersKitEventLogger";
        android.util.Log.w(r1, r2, r0);
    L_0x000d:
        r0 = 0;
    L_0x000e:
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0015;
    L_0x0011:
        r0 = com.crashlytics.android.answers.shim.NoopKitEventLogger.create();
    L_0x0015:
        logger = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.answers.shim.AnswersOptionalLogger.<clinit>():void");
    }

    public static KitEventLogger get() {
        return logger;
    }
}
