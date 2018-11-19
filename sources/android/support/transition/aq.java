package android.support.transition;

import android.graphics.Matrix;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

@RequiresApi(21)
class aq extends ap {
    /* renamed from: a */
    private static Method f14732a;
    /* renamed from: b */
    private static boolean f14733b;
    /* renamed from: c */
    private static Method f14734c;
    /* renamed from: d */
    private static boolean f14735d;

    aq() {
    }

    /* renamed from: a */
    public void mo347a(@android.support.annotation.NonNull android.view.View r4, @android.support.annotation.NonNull android.graphics.Matrix r5) {
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
        r3.m18435a();
        r0 = f14732a;
        if (r0 == 0) goto L_0x001e;
    L_0x0007:
        r0 = f14732a;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1 = 1;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r2 = 0;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1[r2] = r5;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r0.invoke(r4, r1);	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        goto L_0x001e;
    L_0x0013:
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;
        r4 = r4.getCause();
        r5.<init>(r4);
        throw r5;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.aq.a(android.view.View, android.graphics.Matrix):void");
    }

    /* renamed from: b */
    public void mo349b(@android.support.annotation.NonNull android.view.View r4, @android.support.annotation.NonNull android.graphics.Matrix r5) {
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
        r3.m18436b();
        r0 = f14734c;
        if (r0 == 0) goto L_0x001e;
    L_0x0007:
        r0 = f14734c;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1 = 1;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r2 = 0;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1[r2] = r5;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r0.invoke(r4, r1);	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        goto L_0x001e;
    L_0x0013:
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;
        r4 = r4.getCause();
        r5.<init>(r4);
        throw r5;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.aq.b(android.view.View, android.graphics.Matrix):void");
    }

    /* renamed from: a */
    private void m18435a() {
        if (!f14733b) {
            try {
                f14732a = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f14732a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f14733b = true;
        }
    }

    /* renamed from: b */
    private void m18436b() {
        if (!f14735d) {
            try {
                f14734c = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f14734c.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f14735d = true;
        }
    }
}
