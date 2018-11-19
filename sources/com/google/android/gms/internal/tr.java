package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class tr implements ActivityLifecycleCallbacks {
    /* renamed from: a */
    private final Application f16545a;
    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f16546b;
    /* renamed from: c */
    private boolean f16547c = false;

    public tr(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f16546b = new WeakReference(activityLifecycleCallbacks);
        this.f16545a = application;
    }

    /* renamed from: a */
    private final void m20191a(com.google.android.gms.internal.zzdi r2) {
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
        r0 = r1.f16546b;	 Catch:{ Exception -> 0x001a }
        r0 = r0.get();	 Catch:{ Exception -> 0x001a }
        r0 = (android.app.Application.ActivityLifecycleCallbacks) r0;	 Catch:{ Exception -> 0x001a }
        if (r0 == 0) goto L_0x000e;	 Catch:{ Exception -> 0x001a }
    L_0x000a:
        r2.zza(r0);	 Catch:{ Exception -> 0x001a }
        return;	 Catch:{ Exception -> 0x001a }
    L_0x000e:
        r2 = r1.f16547c;	 Catch:{ Exception -> 0x001a }
        if (r2 != 0) goto L_0x001a;	 Catch:{ Exception -> 0x001a }
    L_0x0012:
        r2 = r1.f16545a;	 Catch:{ Exception -> 0x001a }
        r2.unregisterActivityLifecycleCallbacks(r1);	 Catch:{ Exception -> 0x001a }
        r2 = 1;	 Catch:{ Exception -> 0x001a }
        r1.f16547c = r2;	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tr.a(com.google.android.gms.internal.zzdi):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m20191a(new ts(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m20191a(new ty(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m20191a(new tv(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m20191a(new tu(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m20191a(new tx(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m20191a(new tt(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m20191a(new tw(this, activity));
    }
}
