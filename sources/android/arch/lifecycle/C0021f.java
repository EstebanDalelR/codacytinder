package android.arch.lifecycle;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import io.fabric.sdk.android.services.events.C15645a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.lifecycle.f */
public class C0021f {
    /* renamed from: a */
    private static Map<Class, Integer> f50a = new HashMap();
    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends GeneratedAdapter>>> f51b = new HashMap();

    @NonNull
    /* renamed from: a */
    static GenericLifecycleObserver m102a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class cls = obj.getClass();
        if (C0021f.m105b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f51b.get(cls);
        int i = 0;
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(C0021f.m101a((Constructor) list.get(0), obj));
        }
        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[list.size()];
        while (i < list.size()) {
            generatedAdapterArr[i] = C0021f.m101a((Constructor) list.get(i), obj);
            i++;
        }
        return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
    }

    /* renamed from: a */
    private static GeneratedAdapter m101a(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            return (GeneratedAdapter) constructor.newInstance(new Object[]{obj});
        } catch (Constructor<? extends GeneratedAdapter> constructor2) {
            throw new RuntimeException(constructor2);
        } catch (Constructor<? extends GeneratedAdapter> constructor22) {
            throw new RuntimeException(constructor22);
        } catch (Constructor<? extends GeneratedAdapter> constructor222) {
            throw new RuntimeException(constructor222);
        }
    }

    @android.support.annotation.Nullable
    /* renamed from: a */
    private static java.lang.reflect.Constructor<? extends android.arch.lifecycle.GeneratedAdapter> m104a(java.lang.Class<?> r4) {
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
        r0 = r4.getPackage();	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r1 = r4.getCanonicalName();	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        if (r0 == 0) goto L_0x000f;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
    L_0x000a:
        r0 = r0.getName();	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        goto L_0x0011;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
    L_0x000f:
        r0 = "";	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
    L_0x0011:
        r2 = r0.isEmpty();	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r3 = 1;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        if (r2 == 0) goto L_0x0019;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
    L_0x0018:
        goto L_0x0022;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
    L_0x0019:
        r2 = r0.length();	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r2 = r2 + r3;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r1 = r1.substring(r2);	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
    L_0x0022:
        r1 = android.arch.lifecycle.C0021f.m103a(r1);	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r2 = r0.isEmpty();	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        if (r2 == 0) goto L_0x002d;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
    L_0x002c:
        goto L_0x0041;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
    L_0x002d:
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r2.append(r0);	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r0 = ".";	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r2.append(r0);	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r2.append(r1);	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r1 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
    L_0x0041:
        r0 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r1 = new java.lang.Class[r3];	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r2 = 0;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r1[r2] = r4;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r4 = r0.getDeclaredConstructor(r1);	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        r0 = r4.isAccessible();	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
        if (r0 != 0) goto L_0x0057;	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
    L_0x0054:
        r4.setAccessible(r3);	 Catch:{ ClassNotFoundException -> 0x005f, NoSuchMethodException -> 0x0058 }
    L_0x0057:
        return r4;
    L_0x0058:
        r4 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r4);
        throw r0;
    L_0x005f:
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.arch.lifecycle.f.a(java.lang.Class):java.lang.reflect.Constructor<? extends android.arch.lifecycle.GeneratedAdapter>");
    }

    /* renamed from: b */
    private static int m105b(Class<?> cls) {
        if (f50a.containsKey(cls)) {
            return ((Integer) f50a.get(cls)).intValue();
        }
        int c = C0021f.m106c(cls);
        f50a.put(cls, Integer.valueOf(c));
        return c;
    }

    /* renamed from: c */
    private static int m106c(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = C0021f.m104a((Class) cls);
        if (a != null) {
            f51b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0015a.f37a.m84a(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            Object obj = null;
            if (C0021f.m107d(superclass)) {
                if (C0021f.m105b(superclass) == 1) {
                    return 1;
                }
                obj = new ArrayList((Collection) f51b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (C0021f.m107d(cls2)) {
                    if (C0021f.m105b(cls2) == 1) {
                        return 1;
                    }
                    if (obj == null) {
                        obj = new ArrayList();
                    }
                    obj.addAll((Collection) f51b.get(cls2));
                }
            }
            if (obj == null) {
                return 1;
            }
            f51b.put(cls, obj);
            return 2;
        }
    }

    /* renamed from: d */
    private static boolean m107d(Class<?> cls) {
        return (cls == null || LifecycleObserver.class.isAssignableFrom(cls) == null) ? null : true;
    }

    /* renamed from: a */
    public static String m103a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.replace(".", C15645a.ROLL_OVER_FILE_NAME_SEPARATOR));
        stringBuilder.append("_LifecycleAdapter");
        return stringBuilder.toString();
    }
}
