package com.foursquare.pilgrim;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.content.WakefulBroadcastReceiver;

/* renamed from: com.foursquare.pilgrim.z */
class C1993z {
    /* renamed from: a */
    public static final String f5398a = "z";

    @android.support.annotation.Nullable
    @java.lang.Deprecated
    /* renamed from: a */
    static android.content.ComponentName m7175a(@android.support.annotation.NonNull android.content.Context r2, @android.support.annotation.NonNull android.content.Intent r3) {
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
        r2 = android.support.v4.content.WakefulBroadcastReceiver.startWakefulService(r2, r3);	 Catch:{ IllegalStateException -> 0x000e, RuntimeException -> 0x0006 }
        return r2;
    L_0x0006:
        r2 = f5398a;
        r3 = "Samsung 4.4.2 devices seem to throw an unmarshalling code error";
        com.foursquare.internal.util.FsLog.m6807d(r2, r3);
        return r0;
    L_0x000e:
        r2 = move-exception;
        r3 = f5398a;
        r1 = "Android O throws an exception when we aren't allowed to start a service, presumably this is the issue in this exception";
        com.foursquare.internal.util.FsLog.m6804b(r3, r1, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.z.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: a */
    static boolean m7176a(@Nullable Intent intent) {
        return (intent == null || WakefulBroadcastReceiver.completeWakefulIntent(intent) == null) ? null : true;
    }

    private C1993z() {
        throw new UnsupportedOperationException("No instances");
    }
}
