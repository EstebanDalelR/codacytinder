package com.evernote.android.job;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import com.evernote.android.job.gcm.C3140a;
import com.evernote.android.job.p031b.C4119a;
import com.evernote.android.job.p032c.C4333a;
import com.evernote.android.job.p099a.C4118a;
import com.evernote.android.job.v14.C3143a;
import com.evernote.android.job.v14.PlatformAlarmReceiver;
import com.evernote.android.job.v14.PlatformAlarmService;
import com.evernote.android.job.v14.PlatformAlarmServiceExact;
import com.evernote.android.job.v21.C3144a;
import com.evernote.android.job.v21.PlatformJobService;

public enum JobApi {
    V_26(true, false, true),
    V_24(true, false, false),
    V_21(true, true, false),
    V_19(true, true, true),
    V_14(false, true, true),
    GCM(true, false, true);
    
    private static final String JOB_SCHEDULER_PERMISSION = "android.permission.BIND_JOB_SERVICE";
    private volatile JobProxy mCachedProxy;
    private final boolean mFlexSupport;
    private final boolean mSupportsExecutionWindow;
    private final boolean mSupportsTransientJobs;

    private JobApi(boolean z, boolean z2, boolean z3) {
        this.mSupportsExecutionWindow = z;
        this.mFlexSupport = z2;
        this.mSupportsTransientJobs = z3;
    }

    boolean supportsExecutionWindow() {
        return this.mSupportsExecutionWindow;
    }

    boolean isFlexSupport() {
        return this.mFlexSupport;
    }

    boolean supportsTransientJobs() {
        return this.mSupportsTransientJobs;
    }

    public boolean isSupported(Context context) {
        boolean z = true;
        switch (this) {
            case V_26:
                if (VERSION.SDK_INT < 26 || isServiceEnabled(context, PlatformJobService.class) == null) {
                    z = false;
                }
                return z;
            case V_24:
                if (VERSION.SDK_INT < 24 || isServiceEnabledAndHasPermission(context, PlatformJobService.class, JOB_SCHEDULER_PERMISSION) == null) {
                    z = false;
                }
                return z;
            case V_21:
                if (VERSION.SDK_INT < 21 || isServiceEnabledAndHasPermission(context, PlatformJobService.class, JOB_SCHEDULER_PERMISSION) == null) {
                    z = false;
                }
                return z;
            case V_19:
                if (VERSION.SDK_INT < 19 || !isServiceEnabled(context, PlatformAlarmService.class) || isBroadcastEnabled(context, PlatformAlarmReceiver.class) == null) {
                    z = false;
                }
                return z;
            case V_14:
                if (!C1133b.m3796b()) {
                    if (!isServiceEnabled(context, PlatformAlarmService.class) || !isServiceEnabled(context, PlatformAlarmServiceExact.class) || isBroadcastEnabled(context, PlatformAlarmReceiver.class) == null) {
                        z = false;
                    }
                }
                return z;
            case GCM:
                return C1130a.m3790a(context);
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    @NonNull
    private JobProxy createProxy(Context context) {
        switch (this) {
            case V_26:
                return new C4333a(context);
            case V_24:
                return new C4119a(context);
            case V_21:
                return new C3144a(context);
            case V_19:
                return new C4118a(context);
            case V_14:
                return new C3143a(context);
            case GCM:
                return new C3140a(context);
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    @NonNull
    synchronized JobProxy getProxy(Context context) {
        if (this.mCachedProxy == null) {
            this.mCachedProxy = createProxy(context);
        }
        return this.mCachedProxy;
    }

    public synchronized void invalidateCachedProxy() {
        this.mCachedProxy = null;
    }

    private boolean isServiceEnabled(@android.support.annotation.NonNull android.content.Context r3, @android.support.annotation.NonNull java.lang.Class<? extends android.app.Service> r4) {
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
        r1 = new android.content.Intent;	 Catch:{ Exception -> 0x0018 }
        r1.<init>(r3, r4);	 Catch:{ Exception -> 0x0018 }
        r3 = r3.getPackageManager();	 Catch:{ Exception -> 0x0018 }
        r3 = r3.queryIntentServices(r1, r0);	 Catch:{ Exception -> 0x0018 }
        if (r3 == 0) goto L_0x0017;	 Catch:{ Exception -> 0x0018 }
    L_0x0010:
        r3 = r3.isEmpty();	 Catch:{ Exception -> 0x0018 }
        if (r3 != 0) goto L_0x0017;
    L_0x0016:
        r0 = 1;
    L_0x0017:
        return r0;
    L_0x0018:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.JobApi.isServiceEnabled(android.content.Context, java.lang.Class):boolean");
    }

    private static boolean isServiceEnabledAndHasPermission(@android.support.annotation.NonNull android.content.Context r2, @android.support.annotation.NonNull java.lang.Class<? extends android.app.Service> r3, @android.support.annotation.NonNull java.lang.String r4) {
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
        r0 = 0;
        r1 = new android.content.Intent;	 Catch:{ Exception -> 0x0039 }
        r1.<init>(r2, r3);	 Catch:{ Exception -> 0x0039 }
        r2 = r2.getPackageManager();	 Catch:{ Exception -> 0x0039 }
        r2 = r2.queryIntentServices(r1, r0);	 Catch:{ Exception -> 0x0039 }
        if (r2 == 0) goto L_0x0038;	 Catch:{ Exception -> 0x0039 }
    L_0x0010:
        r3 = r2.isEmpty();	 Catch:{ Exception -> 0x0039 }
        if (r3 == 0) goto L_0x0017;	 Catch:{ Exception -> 0x0039 }
    L_0x0016:
        goto L_0x0038;	 Catch:{ Exception -> 0x0039 }
    L_0x0017:
        r2 = r2.iterator();	 Catch:{ Exception -> 0x0039 }
    L_0x001b:
        r3 = r2.hasNext();	 Catch:{ Exception -> 0x0039 }
        if (r3 == 0) goto L_0x0037;	 Catch:{ Exception -> 0x0039 }
    L_0x0021:
        r3 = r2.next();	 Catch:{ Exception -> 0x0039 }
        r3 = (android.content.pm.ResolveInfo) r3;	 Catch:{ Exception -> 0x0039 }
        r1 = r3.serviceInfo;	 Catch:{ Exception -> 0x0039 }
        if (r1 == 0) goto L_0x001b;	 Catch:{ Exception -> 0x0039 }
    L_0x002b:
        r3 = r3.serviceInfo;	 Catch:{ Exception -> 0x0039 }
        r3 = r3.permission;	 Catch:{ Exception -> 0x0039 }
        r3 = r4.equals(r3);	 Catch:{ Exception -> 0x0039 }
        if (r3 == 0) goto L_0x001b;
    L_0x0035:
        r2 = 1;
        return r2;
    L_0x0037:
        return r0;
    L_0x0038:
        return r0;
    L_0x0039:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.JobApi.isServiceEnabledAndHasPermission(android.content.Context, java.lang.Class, java.lang.String):boolean");
    }

    private boolean isBroadcastEnabled(@android.support.annotation.NonNull android.content.Context r3, @android.support.annotation.NonNull java.lang.Class<? extends android.content.BroadcastReceiver> r4) {
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
        r1 = new android.content.Intent;	 Catch:{ Exception -> 0x0018 }
        r1.<init>(r3, r4);	 Catch:{ Exception -> 0x0018 }
        r3 = r3.getPackageManager();	 Catch:{ Exception -> 0x0018 }
        r3 = r3.queryBroadcastReceivers(r1, r0);	 Catch:{ Exception -> 0x0018 }
        if (r3 == 0) goto L_0x0017;	 Catch:{ Exception -> 0x0018 }
    L_0x0010:
        r3 = r3.isEmpty();	 Catch:{ Exception -> 0x0018 }
        if (r3 != 0) goto L_0x0017;
    L_0x0016:
        r0 = 1;
    L_0x0017:
        return r0;
    L_0x0018:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.JobApi.isBroadcastEnabled(android.content.Context, java.lang.Class):boolean");
    }

    @NonNull
    public static JobApi getDefault(Context context) {
        if (V_26.isSupported(context) && C1133b.m3794a(V_26)) {
            return V_26;
        }
        if (V_24.isSupported(context) && C1133b.m3794a(V_24)) {
            return V_24;
        }
        if (V_21.isSupported(context) && C1133b.m3794a(V_21)) {
            return V_21;
        }
        if (GCM.isSupported(context) && C1133b.m3794a(GCM)) {
            return GCM;
        }
        if (V_19.isSupported(context) != null && C1133b.m3794a(V_19) != null) {
            return V_19;
        }
        if (C1133b.m3794a(V_14) != null) {
            return V_14;
        }
        throw new IllegalStateException("All supported APIs are disabled");
    }
}
