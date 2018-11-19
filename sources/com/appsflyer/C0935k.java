package com.appsflyer;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: com.appsflyer.k */
final class C0935k {

    /* renamed from: com.appsflyer.k$a */
    static final class C0934a {
        /* renamed from: a */
        static final C0935k f2480a = new C0935k();
    }

    C0935k() {
    }

    /* renamed from: a */
    public static C0935k m3196a() {
        return C0934a.f2480a;
    }

    @android.support.annotation.Nullable
    /* renamed from: a */
    final android.location.Location m3198a(@android.support.annotation.NonNull android.content.Context r3) {
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
        r0 = 0;
        r1 = "location";	 Catch:{ Throwable -> 0x0010 }
        r1 = r3.getSystemService(r1);	 Catch:{ Throwable -> 0x0010 }
        r1 = (android.location.LocationManager) r1;	 Catch:{ Throwable -> 0x0010 }
        r3 = r2.m3193a(r3, r1);	 Catch:{ Throwable -> 0x0010 }
        if (r3 == 0) goto L_0x0010;
    L_0x000f:
        r0 = r3;
    L_0x0010:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.k.a(android.content.Context):android.location.Location");
    }

    @Nullable
    /* renamed from: a */
    private Location m3193a(Context context, LocationManager locationManager) {
        return m3195a(m3194a(context, locationManager, "network", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), m3194a(context, locationManager, "gps", "android.permission.ACCESS_FINE_LOCATION"));
    }

    @Nullable
    /* renamed from: a */
    private Location m3195a(Location location, Location location2) {
        if (location2 == null && location == null) {
            return null;
        }
        if (location2 != null || location == null) {
            return ((location != null || location2 == null) && 60000 < location.getTime() - location2.getTime()) ? location : location2;
        } else {
            return location;
        }
    }

    @Nullable
    /* renamed from: a */
    private Location m3194a(@NonNull Context context, @NonNull LocationManager locationManager, @NonNull String str, @NonNull String... strArr) {
        return C0935k.m3197a(context, strArr) != null ? locationManager.getLastKnownLocation(str) : null;
    }

    /* renamed from: a */
    private static boolean m3197a(@NonNull Context context, @NonNull String[] strArr) {
        for (String a : strArr) {
            if (C0932h.m3180a(context, a)) {
                return true;
            }
        }
        return false;
    }
}
