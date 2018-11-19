package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ButterKnife {
    @VisibleForTesting
    /* renamed from: a */
    static final Map<Class<?>, Constructor<? extends Unbinder>> f2066a = new LinkedHashMap();
    /* renamed from: b */
    private static boolean f2067b = false;

    public interface Action<T extends View> {
        @UiThread
        void apply(@NonNull T t, int i);
    }

    public interface Setter<T extends View, V> {
        @UiThread
        void set(@NonNull T t, V v, int i);
    }

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    @UiThread
    @NonNull
    /* renamed from: a */
    public static Unbinder m2673a(@NonNull Activity activity) {
        return m2678b(activity, activity.getWindow().getDecorView());
    }

    @UiThread
    @NonNull
    /* renamed from: a */
    public static Unbinder m2675a(@NonNull View view) {
        return m2678b(view, view);
    }

    @UiThread
    @NonNull
    /* renamed from: a */
    public static Unbinder m2674a(@NonNull Dialog dialog) {
        return m2678b(dialog, dialog.getWindow().getDecorView());
    }

    @UiThread
    @NonNull
    /* renamed from: a */
    public static Unbinder m2676a(@NonNull Object obj, @NonNull View view) {
        return m2678b(obj, view);
    }

    /* renamed from: b */
    private static Unbinder m2678b(@NonNull Object obj, @NonNull View view) {
        StringBuilder stringBuilder;
        Class cls = obj.getClass();
        if (f2067b) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Looking up binding for ");
            stringBuilder2.append(cls.getName());
            Log.d("ButterKnife", stringBuilder2.toString());
        }
        Constructor a = m2677a(cls);
        if (a == null) {
            return Unbinder.f2068a;
        }
        try {
            return (Unbinder) a.newInstance(new Object[]{obj, view});
        } catch (Object obj2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to invoke ");
            stringBuilder.append(a);
            throw new RuntimeException(stringBuilder.toString(), obj2);
        } catch (Object obj22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to invoke ");
            stringBuilder.append(a);
            throw new RuntimeException(stringBuilder.toString(), obj22);
        } catch (Object obj222) {
            obj222 = obj222.getCause();
            if ((obj222 instanceof RuntimeException) != null) {
                throw ((RuntimeException) obj222);
            } else if ((obj222 instanceof Error) != null) {
                throw ((Error) obj222);
            } else {
                throw new RuntimeException("Unable to create binding instance.", obj222);
            }
        }
    }

    @android.support.annotation.UiThread
    @android.support.annotation.CheckResult
    @android.support.annotation.Nullable
    /* renamed from: a */
    private static java.lang.reflect.Constructor<? extends butterknife.Unbinder> m2677a(java.lang.Class<?> r5) {
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
        r0 = f2066a;
        r0 = r0.get(r5);
        r0 = (java.lang.reflect.Constructor) r0;
        if (r0 == 0) goto L_0x0016;
    L_0x000a:
        r5 = f2067b;
        if (r5 == 0) goto L_0x0015;
    L_0x000e:
        r5 = "ButterKnife";
        r1 = "HIT: Cached in binding map.";
        android.util.Log.d(r5, r1);
    L_0x0015:
        return r0;
    L_0x0016:
        r0 = r5.getName();
        r1 = "android.";
        r1 = r0.startsWith(r1);
        if (r1 != 0) goto L_0x00a8;
    L_0x0022:
        r1 = "java.";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x002c;
    L_0x002a:
        goto L_0x00a8;
    L_0x002c:
        r1 = r5.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r2.append(r0);	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r3 = "_ViewBinding";	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r2.append(r3);	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r2 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r1 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r2 = 2;	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r2 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r3 = 0;	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r2[r3] = r5;	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r3 = 1;	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r4 = android.view.View.class;	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r2[r3] = r4;	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r1 = r1.getConstructor(r2);	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r2 = f2067b;	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        if (r2 == 0) goto L_0x00a2;	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
    L_0x0058:
        r2 = "ButterKnife";	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        r3 = "HIT: Loaded binding class and constructor.";	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        android.util.Log.d(r2, r3);	 Catch:{ ClassNotFoundException -> 0x0078, NoSuchMethodException -> 0x0060 }
        goto L_0x00a2;
    L_0x0060:
        r5 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Unable to find binding constructor for ";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0, r5);
        throw r1;
    L_0x0078:
        r0 = f2067b;
        if (r0 == 0) goto L_0x009a;
    L_0x007c:
        r0 = "ButterKnife";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Not found. Trying superclass ";
        r1.append(r2);
        r2 = r5.getSuperclass();
        r2 = r2.getName();
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x009a:
        r0 = r5.getSuperclass();
        r1 = m2677a(r0);
    L_0x00a2:
        r0 = f2066a;
        r0.put(r5, r1);
        return r1;
    L_0x00a8:
        r5 = f2067b;
        if (r5 == 0) goto L_0x00b3;
    L_0x00ac:
        r5 = "ButterKnife";
        r0 = "MISS: Reached framework class. Abandoning search.";
        android.util.Log.d(r5, r0);
    L_0x00b3:
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: butterknife.ButterKnife.a(java.lang.Class):java.lang.reflect.Constructor<? extends butterknife.Unbinder>");
    }
}
