package com.foursquare.pilgrim;

import android.app.IntentService;
import android.content.Intent;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import com.google.android.gms.location.LocationResult;
import java.util.Collections;

public class PilgrimLocationClientFireService extends IntentService {
    /* renamed from: a */
    private static final String f5243a = "PilgrimLocationClientFireService";

    public PilgrimLocationClientFireService() {
        super(f5243a);
        setIntentRedelivery(true);
    }

    protected void onHandleIntent(android.content.Intent r3) {
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
        r2 = this;
        r0 = f5243a;
        r1 = "Doing Location client work!";
        com.foursquare.internal.util.FsLog.m6800a(r0, r1);
        r2.m6871a(r3);	 Catch:{ Exception -> 0x000a, all -> 0x000e }
    L_0x000a:
        com.foursquare.pilgrim.C1993z.m7176a(r3);
        goto L_0x0013;
    L_0x000e:
        r0 = move-exception;
        com.foursquare.pilgrim.C1993z.m7176a(r3);
        throw r0;
    L_0x0013:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.PilgrimLocationClientFireService.onHandleIntent(android.content.Intent):void");
    }

    /* renamed from: a */
    void m6871a(Intent intent) {
        if (aj.m6921a().f5298c.mo2046a() && LocationResult.hasResult(intent)) {
            intent = LocationResult.extractResult(intent).getLastLocation();
            if (intent != null && intent.getTime() > 0) {
                try {
                    ao.m6944a().m6947a(Collections.singletonList(intent), BackgroundWakeupSource.FUSED_CONTINUOUS);
                } catch (Intent intent2) {
                    PilgrimSdk.get().log(LogLevel.ERROR, "Error running Pilgrim engine", intent2);
                    new RealExceptionReporter().reportException(intent2);
                }
                m6870a();
            }
        }
    }

    /* renamed from: a */
    private void m6870a() {
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
        r7 = this;
        r0 = 0;
        r1 = com.foursquare.pilgrim.bh.m7128e();	 Catch:{ Exception -> 0x0064 }
        r3 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0064 }
        r5 = 0;	 Catch:{ Exception -> 0x0064 }
        r5 = r3 - r1;	 Catch:{ Exception -> 0x0064 }
        r1 = java.util.concurrent.TimeUnit.DAYS;	 Catch:{ Exception -> 0x0064 }
        r2 = 1;	 Catch:{ Exception -> 0x0064 }
        r1 = r1.toMillis(r2);	 Catch:{ Exception -> 0x0064 }
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));	 Catch:{ Exception -> 0x0064 }
        if (r3 <= 0) goto L_0x005f;	 Catch:{ Exception -> 0x0064 }
    L_0x0018:
        r1 = com.foursquare.internal.network.C1928e.m6757a();	 Catch:{ Exception -> 0x0064 }
        r2 = com.foursquare.pilgrim.bf.m7089a();	 Catch:{ Exception -> 0x0064 }
        r2 = r2.m7102e();	 Catch:{ Exception -> 0x0064 }
        r1 = r1.m6763b(r2);	 Catch:{ Exception -> 0x0064 }
        r2 = r1.m6774c();	 Catch:{ Exception -> 0x0064 }
        if (r2 == 0) goto L_0x0058;	 Catch:{ Exception -> 0x0064 }
    L_0x002e:
        r1 = r1.m6774c();	 Catch:{ Exception -> 0x0064 }
        r1 = (com.foursquare.pilgrim.C3549d) r1;	 Catch:{ Exception -> 0x0064 }
        r2 = r1.m13377c();	 Catch:{ Exception -> 0x0064 }
        if (r2 == 0) goto L_0x0047;	 Catch:{ Exception -> 0x0064 }
    L_0x003a:
        r2 = com.foursquare.pilgrim.ax.m7003a();	 Catch:{ Exception -> 0x0064 }
        r3 = r1.m13377c();	 Catch:{ Exception -> 0x0064 }
        r2 = r2.m7027a(r7, r3);	 Catch:{ Exception -> 0x0064 }
        r0 = r2;	 Catch:{ Exception -> 0x0064 }
    L_0x0047:
        r2 = r1.m13378d();	 Catch:{ Exception -> 0x0064 }
        if (r2 == 0) goto L_0x0058;	 Catch:{ Exception -> 0x0064 }
    L_0x004d:
        r2 = com.foursquare.pilgrim.ag.m6911a(r7);	 Catch:{ Exception -> 0x0064 }
        r1 = r1.m13378d();	 Catch:{ Exception -> 0x0064 }
        r2.m6913a(r7, r1);	 Catch:{ Exception -> 0x0064 }
    L_0x0058:
        r1 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0064 }
        com.foursquare.pilgrim.bh.m7121c(r1);	 Catch:{ Exception -> 0x0064 }
    L_0x005f:
        if (r0 == 0) goto L_0x0070;
    L_0x0061:
        goto L_0x006d;
    L_0x0062:
        r1 = move-exception;
        goto L_0x0071;
    L_0x0064:
        r1 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0062 }
        com.foursquare.pilgrim.bh.m7121c(r1);	 Catch:{ all -> 0x0062 }
        if (r0 == 0) goto L_0x0070;
    L_0x006d:
        com.foursquare.pilgrim.aj.m6922a(r7);
    L_0x0070:
        return;
    L_0x0071:
        if (r0 == 0) goto L_0x0076;
    L_0x0073:
        com.foursquare.pilgrim.aj.m6922a(r7);
    L_0x0076:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.PilgrimLocationClientFireService.a():void");
    }
}
