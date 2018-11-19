package android.support.transition;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

@RequiresApi(19)
class ap extends ao {
    /* renamed from: a */
    private static Method f14134a;
    /* renamed from: b */
    private static boolean f14135b;
    /* renamed from: c */
    private static Method f14136c;
    /* renamed from: d */
    private static boolean f14137d;

    /* renamed from: d */
    public void mo351d(@NonNull View view) {
    }

    /* renamed from: e */
    public void mo352e(@NonNull View view) {
    }

    ap() {
    }

    /* renamed from: a */
    public void mo345a(@android.support.annotation.NonNull android.view.View r4, float r5) {
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
        r3.m17461a();
        r0 = f14134a;
        if (r0 == 0) goto L_0x0022;
    L_0x0007:
        r0 = f14134a;	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r1 = 1;	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r2 = 0;	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r1[r2] = r5;	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r0.invoke(r4, r1);	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        goto L_0x0025;
    L_0x0017:
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;
        r4 = r4.getCause();
        r5.<init>(r4);
        throw r5;
    L_0x0022:
        r4.setAlpha(r5);
    L_0x0025:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ap.a(android.view.View, float):void");
    }

    /* renamed from: c */
    public float mo350c(@android.support.annotation.NonNull android.view.View r3) {
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
        r2.m17462b();
        r0 = f14136c;
        if (r0 == 0) goto L_0x0022;
    L_0x0007:
        r0 = f14136c;	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        r1 = 0;	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        r0 = r0.invoke(r3, r1);	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        r0 = (java.lang.Float) r0;	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        r0 = r0.floatValue();	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        return r0;
    L_0x0017:
        r3 = move-exception;
        r0 = new java.lang.RuntimeException;
        r3 = r3.getCause();
        r0.<init>(r3);
        throw r0;
    L_0x0022:
        r3 = super.mo350c(r3);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ap.c(android.view.View):float");
    }

    /* renamed from: a */
    private void m17461a() {
        if (!f14135b) {
            try {
                f14134a = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f14134a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f14135b = true;
        }
    }

    /* renamed from: b */
    private void m17462b() {
        if (!f14137d) {
            try {
                f14136c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f14136c.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f14137d = true;
        }
    }
}
