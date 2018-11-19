package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

class am {
    /* renamed from: a */
    static final Property<View, Float> f1150a = new Property<View, Float>(Float.class, "translationAlpha") {
        public /* synthetic */ Object get(Object obj) {
            return m1243a((View) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m1244a((View) obj, (Float) obj2);
        }

        /* renamed from: a */
        public Float m1243a(View view) {
            return Float.valueOf(am.m1255c(view));
        }

        /* renamed from: a */
        public void m1244a(View view, Float f) {
            am.m1249a(view, f.floatValue());
        }
    };
    /* renamed from: b */
    static final Property<View, Rect> f1151b = new Property<View, Rect>(Rect.class, "clipBounds") {
        public /* synthetic */ Object get(Object obj) {
            return m1245a((View) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m1246a((View) obj, (Rect) obj2);
        }

        /* renamed from: a */
        public Rect m1245a(View view) {
            return ViewCompat.m2170B(view);
        }

        /* renamed from: a */
        public void m1246a(View view, Rect rect) {
            ViewCompat.m2182a(view, rect);
        }
    };
    /* renamed from: c */
    private static final as f1152c;
    /* renamed from: d */
    private static Field f1153d;
    /* renamed from: e */
    private static boolean f1154e;

    static {
        if (VERSION.SDK_INT >= 22) {
            f1152c = new ar();
        } else if (VERSION.SDK_INT >= 21) {
            f1152c = new aq();
        } else if (VERSION.SDK_INT >= 19) {
            f1152c = new ap();
        } else if (VERSION.SDK_INT >= 18) {
            f1152c = new ao();
        } else {
            f1152c = new an();
        }
    }

    /* renamed from: a */
    static al m1247a(@NonNull View view) {
        return f1152c.mo344a(view);
    }

    /* renamed from: b */
    static av m1253b(@NonNull View view) {
        return f1152c.mo348b(view);
    }

    /* renamed from: a */
    static void m1249a(@NonNull View view, float f) {
        f1152c.mo345a(view, f);
    }

    /* renamed from: c */
    static float m1255c(@NonNull View view) {
        return f1152c.mo350c(view);
    }

    /* renamed from: d */
    static void m1256d(@NonNull View view) {
        f1152c.mo351d(view);
    }

    /* renamed from: e */
    static void m1257e(@NonNull View view) {
        f1152c.mo352e(view);
    }

    /* renamed from: a */
    static void m1250a(@android.support.annotation.NonNull android.view.View r2, int r3) {
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
        m1248a();
        r0 = f1153d;
        if (r0 == 0) goto L_0x0015;
    L_0x0007:
        r0 = f1153d;	 Catch:{ IllegalAccessException -> 0x0015 }
        r0 = r0.getInt(r2);	 Catch:{ IllegalAccessException -> 0x0015 }
        r1 = f1153d;	 Catch:{ IllegalAccessException -> 0x0015 }
        r0 = r0 & -13;	 Catch:{ IllegalAccessException -> 0x0015 }
        r3 = r3 | r0;	 Catch:{ IllegalAccessException -> 0x0015 }
        r1.setInt(r2, r3);	 Catch:{ IllegalAccessException -> 0x0015 }
    L_0x0015:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.am.a(android.view.View, int):void");
    }

    /* renamed from: a */
    static void m1252a(@NonNull View view, @NonNull Matrix matrix) {
        f1152c.mo347a(view, matrix);
    }

    /* renamed from: b */
    static void m1254b(@NonNull View view, @NonNull Matrix matrix) {
        f1152c.mo349b(view, matrix);
    }

    /* renamed from: a */
    static void m1251a(@NonNull View view, int i, int i2, int i3, int i4) {
        f1152c.mo346a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    private static void m1248a() {
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
        r0 = f1154e;
        if (r0 != 0) goto L_0x001e;
    L_0x0004:
        r0 = 1;
        r1 = android.view.View.class;	 Catch:{ NoSuchFieldException -> 0x0015 }
        r2 = "mViewFlags";	 Catch:{ NoSuchFieldException -> 0x0015 }
        r1 = r1.getDeclaredField(r2);	 Catch:{ NoSuchFieldException -> 0x0015 }
        f1153d = r1;	 Catch:{ NoSuchFieldException -> 0x0015 }
        r1 = f1153d;	 Catch:{ NoSuchFieldException -> 0x0015 }
        r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x0015 }
        goto L_0x001c;
    L_0x0015:
        r1 = "ViewUtils";
        r2 = "fetchViewFlagsField: ";
        android.util.Log.i(r1, r2);
    L_0x001c:
        f1154e = r0;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.am.a():void");
    }
}
