package android.support.transition;

import android.animation.LayoutTransition;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@RequiresApi(14)
class ag implements ai {
    /* renamed from: a */
    private static LayoutTransition f8868a;
    /* renamed from: b */
    private static Field f8869b;
    /* renamed from: c */
    private static boolean f8870c;
    /* renamed from: d */
    private static Method f8871d;
    /* renamed from: e */
    private static boolean f8872e;

    /* renamed from: android.support.transition.ag$1 */
    class C03271 extends LayoutTransition {
        /* renamed from: a */
        final /* synthetic */ ag f1144a;

        public boolean isChangingLayout() {
            return true;
        }

        C03271(ag agVar) {
            this.f1144a = agVar;
        }
    }

    ag() {
    }

    /* renamed from: a */
    public ae mo340a(@NonNull ViewGroup viewGroup) {
        return ac.m15708a(viewGroup);
    }

    /* renamed from: a */
    public void mo341a(@android.support.annotation.NonNull android.view.ViewGroup r6, boolean r7) {
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
        r5 = this;
        r0 = f8868a;
        r1 = 1;
        r2 = 0;
        r3 = 0;
        if (r0 != 0) goto L_0x002a;
    L_0x0007:
        r0 = new android.support.transition.ag$1;
        r0.<init>(r5);
        f8868a = r0;
        r0 = f8868a;
        r4 = 2;
        r0.setAnimator(r4, r3);
        r0 = f8868a;
        r0.setAnimator(r2, r3);
        r0 = f8868a;
        r0.setAnimator(r1, r3);
        r0 = f8868a;
        r4 = 3;
        r0.setAnimator(r4, r3);
        r0 = f8868a;
        r4 = 4;
        r0.setAnimator(r4, r3);
    L_0x002a:
        if (r7 == 0) goto L_0x004a;
    L_0x002c:
        r7 = r6.getLayoutTransition();
        if (r7 == 0) goto L_0x0044;
    L_0x0032:
        r0 = r7.isRunning();
        if (r0 == 0) goto L_0x003b;
    L_0x0038:
        m10906a(r7);
    L_0x003b:
        r0 = f8868a;
        if (r7 == r0) goto L_0x0044;
    L_0x003f:
        r0 = android.support.transition.C0351r.C0350a.transition_layout_save;
        r6.setTag(r0, r7);
    L_0x0044:
        r7 = f8868a;
        r6.setLayoutTransition(r7);
        goto L_0x009e;
    L_0x004a:
        r6.setLayoutTransition(r3);
        r7 = f8870c;
        if (r7 != 0) goto L_0x006a;
    L_0x0051:
        r7 = android.view.ViewGroup.class;	 Catch:{ NoSuchFieldException -> 0x0061 }
        r0 = "mLayoutSuppressed";	 Catch:{ NoSuchFieldException -> 0x0061 }
        r7 = r7.getDeclaredField(r0);	 Catch:{ NoSuchFieldException -> 0x0061 }
        f8869b = r7;	 Catch:{ NoSuchFieldException -> 0x0061 }
        r7 = f8869b;	 Catch:{ NoSuchFieldException -> 0x0061 }
        r7.setAccessible(r1);	 Catch:{ NoSuchFieldException -> 0x0061 }
        goto L_0x0068;
    L_0x0061:
        r7 = "ViewGroupUtilsApi14";
        r0 = "Failed to access mLayoutSuppressed field by reflection";
        android.util.Log.i(r7, r0);
    L_0x0068:
        f8870c = r1;
    L_0x006a:
        r7 = f8869b;
        if (r7 == 0) goto L_0x0087;
    L_0x006e:
        r7 = f8869b;	 Catch:{ IllegalAccessException -> 0x0080 }
        r7 = r7.getBoolean(r6);	 Catch:{ IllegalAccessException -> 0x0080 }
        if (r7 == 0) goto L_0x007e;
    L_0x0076:
        r0 = f8869b;	 Catch:{ IllegalAccessException -> 0x007c }
        r0.setBoolean(r6, r2);	 Catch:{ IllegalAccessException -> 0x007c }
        goto L_0x007e;
    L_0x007c:
        r2 = r7;
        goto L_0x0080;
    L_0x007e:
        r2 = r7;
        goto L_0x0087;
    L_0x0080:
        r7 = "ViewGroupUtilsApi14";
        r0 = "Failed to get mLayoutSuppressed field by reflection";
        android.util.Log.i(r7, r0);
    L_0x0087:
        if (r2 == 0) goto L_0x008c;
    L_0x0089:
        r6.requestLayout();
    L_0x008c:
        r7 = android.support.transition.C0351r.C0350a.transition_layout_save;
        r7 = r6.getTag(r7);
        r7 = (android.animation.LayoutTransition) r7;
        if (r7 == 0) goto L_0x009e;
    L_0x0096:
        r0 = android.support.transition.C0351r.C0350a.transition_layout_save;
        r6.setTag(r0, r3);
        r6.setLayoutTransition(r7);
    L_0x009e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ag.a(android.view.ViewGroup, boolean):void");
    }

    /* renamed from: a */
    private static void m10906a(android.animation.LayoutTransition r5) {
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
        r0 = f8872e;
        r1 = 0;
        if (r0 != 0) goto L_0x0021;
    L_0x0005:
        r0 = 1;
        r2 = android.animation.LayoutTransition.class;	 Catch:{ NoSuchMethodException -> 0x0018 }
        r3 = "cancel";	 Catch:{ NoSuchMethodException -> 0x0018 }
        r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0018 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0018 }
        f8871d = r2;	 Catch:{ NoSuchMethodException -> 0x0018 }
        r2 = f8871d;	 Catch:{ NoSuchMethodException -> 0x0018 }
        r2.setAccessible(r0);	 Catch:{ NoSuchMethodException -> 0x0018 }
        goto L_0x001f;
    L_0x0018:
        r2 = "ViewGroupUtilsApi14";
        r3 = "Failed to access cancel method by reflection";
        android.util.Log.i(r2, r3);
    L_0x001f:
        f8872e = r0;
    L_0x0021:
        r0 = f8871d;
        if (r0 == 0) goto L_0x003c;
    L_0x0025:
        r0 = f8871d;	 Catch:{ IllegalAccessException -> 0x0035, InvocationTargetException -> 0x002d }
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x0035, InvocationTargetException -> 0x002d }
        r0.invoke(r5, r1);	 Catch:{ IllegalAccessException -> 0x0035, InvocationTargetException -> 0x002d }
        goto L_0x003c;
    L_0x002d:
        r5 = "ViewGroupUtilsApi14";
        r0 = "Failed to invoke cancel method by reflection";
        android.util.Log.i(r5, r0);
        goto L_0x003c;
    L_0x0035:
        r5 = "ViewGroupUtilsApi14";
        r0 = "Failed to access cancel method by reflection";
        android.util.Log.i(r5, r0);
    L_0x003c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ag.a(android.animation.LayoutTransition):void");
    }
}
