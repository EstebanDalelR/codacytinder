package com.foursquare.pilgrim;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.content.C0432b;
import com.google.android.gms.location.C4485e;
import com.google.android.gms.location.C6281c;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: com.foursquare.pilgrim.b */
final class C1971b {
    /* renamed from: a */
    private static final String f5348a = "b";

    /* renamed from: com.foursquare.pilgrim.b$1 */
    class C35341 extends C4485e {
        /* renamed from: a */
        final /* synthetic */ ab f10618a;

        C35341(ab abVar) {
            this.f10618a = abVar;
        }

        public void onLocationResult(LocationResult locationResult) {
            this.f10618a.m6894a(locationResult);
        }
    }

    /* renamed from: com.foursquare.pilgrim.b$2 */
    class C35352 implements OnFailureListener {
        public void onFailure(@NonNull Exception exception) {
        }

        C35352() {
        }
    }

    @NonNull
    @WorkerThread
    /* renamed from: a */
    static bg<LocationResult, Throwable> m7057a(@NonNull Context context, @NonNull C6281c c6281c, @NonNull Looper looper, @NonNull LocationRequest locationRequest) throws IllegalStateException {
        if (C1971b.m7059a()) {
            throw new IllegalStateException("Cannot awaitSingleLocation on the main thread");
        }
        locationRequest.setNumUpdates(1);
        ab abVar = new ab();
        C4485e c35341 = new C35341(abVar);
        if (C1971b.m7060a(context, "android.permission.ACCESS_FINE_LOCATION") == null) {
            throw new IllegalStateException("The app does not have location permission");
        }
        c6281c.a(locationRequest, c35341, looper).a(new C35352());
        context = abVar.m6893a();
        c6281c.a(c35341);
        return context;
    }

    /* renamed from: a */
    static boolean m7060a(@NonNull Context context, @NonNull String str) {
        return C0432b.m1645b(context, str) == null ? true : null;
    }

    /* renamed from: a */
    static boolean m7059a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    static boolean m7061a(@NonNull HandlerThread handlerThread) {
        if (VERSION.SDK_INT >= 18) {
            return handlerThread.quitSafely();
        }
        return handlerThread.quit();
    }

    /* renamed from: b */
    static boolean m7063b() {
        return VERSION.SDK_INT >= 26;
    }

    @Nullable
    /* renamed from: a */
    static PackageInfo m7055a(@NonNull Context context) {
        return C1971b.m7056a(context, 0);
    }

    @android.support.annotation.Nullable
    /* renamed from: a */
    static android.content.pm.PackageInfo m7056a(@android.support.annotation.NonNull android.content.Context r1, int r2) {
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
        r0 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x000d }
        r1 = r1.getPackageName();	 Catch:{ NameNotFoundException -> 0x000d }
        r1 = r0.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x000d }
        return r1;
    L_0x000d:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.b.a(android.content.Context, int):android.content.pm.PackageInfo");
    }

    @NonNull
    /* renamed from: a */
    static String m7058a(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        context = C1971b.m7062b(context, str);
        return context != null ? context : str2;
    }

    @android.support.annotation.Nullable
    /* renamed from: b */
    static java.lang.String m7062b(@android.support.annotation.NonNull android.content.Context r3, @android.support.annotation.NonNull java.lang.String r4) {
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
        r0 = r3.getPackageManager();	 Catch:{ NameNotFoundException -> 0x001c }
        r1 = r3.getPackageName();	 Catch:{ NameNotFoundException -> 0x001c }
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x001c }
        r0 = r0.getApplicationInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x001c }
        r0 = r0.metaData;	 Catch:{ NameNotFoundException -> 0x001c }
        r0 = com.foursquare.pilgrim.ah.m6917a(r0);	 Catch:{ NameNotFoundException -> 0x001c }
        r0 = (android.os.Bundle) r0;	 Catch:{ NameNotFoundException -> 0x001c }
        r3 = 0;
        r3 = r0.getString(r4, r3);
        return r3;
    L_0x001c:
        r4 = new java.lang.RuntimeException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Pilgrim SDK's context object didn't have a valid package name!? Package name was: ";
        r0.append(r1);
        r3 = r3.getPackageName();
        r0.append(r3);
        r3 = r0.toString();
        r4.<init>(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.b.b(android.content.Context, java.lang.String):java.lang.String");
    }

    private C1971b() {
        throw new UnsupportedOperationException("no instances");
    }
}
