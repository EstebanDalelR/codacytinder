package com.foursquare.pilgrim;

import android.content.Context;
import android.net.wifi.ScanResult;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.GoogleMotionReading;
import java.util.List;

abstract class BaseSpeedStrategy {

    enum MotionState {
        STOPPED,
        MOVING,
        UNKNOWN
    }

    /* renamed from: com.foursquare.pilgrim.BaseSpeedStrategy$a */
    static class C1950a {
        @android.support.annotation.NonNull
        /* renamed from: a */
        static com.foursquare.pilgrim.BaseSpeedStrategy m6845a(@android.support.annotation.NonNull android.content.Context r2, @android.support.annotation.Nullable com.foursquare.api.types.StopDetectionAlgorithm r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            if (r3 != 0) goto L_0x0004;
        L_0x0002:
            r3 = com.foursquare.api.types.StopDetectionAlgorithm.EMA;
        L_0x0004:
            r0 = com.foursquare.pilgrim.BaseSpeedStrategy.C19491.f5229a;
            r1 = r3.ordinal();
            r0 = r0[r1];
            switch(r0) {
                case 1: goto L_0x003d;
                case 2: goto L_0x0026;
                default: goto L_0x000f;
            };
        L_0x000f:
            r2 = new java.lang.RuntimeException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "Unexpected stop-detection algorithm: ";
            r0.append(r1);
            r0.append(r3);
            r3 = r0.toString();
            r2.<init>(r3);
            throw r2;
        L_0x0026:
            r2 = new java.lang.IllegalStateException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "HMM model removed, but we were still expecting to use it. Algo: ";
            r0.append(r1);
            r0.append(r3);
            r3 = r0.toString();
            r2.<init>(r3);
            throw r2;
        L_0x003d:
            r2 = com.foursquare.pilgrim.am.m6938a(r2);	 Catch:{ Exception -> 0x004c }
            r3 = com.foursquare.pilgrim.C3552h.class;	 Catch:{ Exception -> 0x004c }
            r2 = com.foursquare.internal.api.C1913a.m6650a(r2, r3);	 Catch:{ Exception -> 0x004c }
            r2 = (com.foursquare.pilgrim.BaseSpeedStrategy) r2;	 Catch:{ Exception -> 0x004c }
            if (r2 == 0) goto L_0x004c;
        L_0x004b:
            return r2;
        L_0x004c:
            r2 = new com.foursquare.pilgrim.h;
            r2.<init>();
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.BaseSpeedStrategy.a.a(android.content.Context, com.foursquare.api.types.StopDetectionAlgorithm):com.foursquare.pilgrim.BaseSpeedStrategy");
        }
    }

    /* renamed from: a */
    abstract FoursquareLocation mo2051a();

    /* renamed from: a */
    abstract void mo2052a(Context context) throws Exception;

    /* renamed from: a */
    abstract void mo2053a(FoursquareLocation foursquareLocation, GoogleMotionReading googleMotionReading, List<ScanResult> list, ax axVar) throws Exception;

    /* renamed from: a */
    abstract boolean mo2054a(FoursquareLocation foursquareLocation);

    /* renamed from: b */
    abstract double mo2055b();

    /* renamed from: c */
    abstract MotionState mo2056c();

    /* renamed from: d */
    String mo2057d() {
        return "";
    }

    BaseSpeedStrategy() {
    }
}
