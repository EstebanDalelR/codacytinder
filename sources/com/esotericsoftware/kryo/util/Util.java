package com.esotericsoftware.kryo.util;

import com.esotericsoftware.minlog.Log;
import java.util.concurrent.ConcurrentHashMap;

public class Util {
    public static final boolean IS_ANDROID = "Dalvik".equals(System.getProperty("java.vm.name"));
    private static final ConcurrentHashMap<String, Boolean> classAvailabilities = new ConcurrentHashMap();
    @Deprecated
    public static boolean isAndroid = IS_ANDROID;

    public static int swapInt(int i) {
        return ((i >> 24) & 255) | ((((i & 255) << 24) | ((65280 & i) << 8)) | ((16711680 & i) >> 8));
    }

    public static long swapLong(long j) {
        return (((((((((j >> 0) & 255) << 56) | (((j >> 8) & 255) << 48)) | (((j >> 16) & 255) << 40)) | (((j >> 24) & 255) << 32)) | (((j >> 32) & 255) << 24)) | (((j >> 40) & 255) << 16)) | (((j >> 48) & 255) << 8)) | (((j >> 56) & 255) << 0);
    }

    public static boolean isClassAvailable(java.lang.String r3) {
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
        r0 = classAvailabilities;
        r0 = r0.get(r3);
        r0 = (java.lang.Boolean) r0;
        if (r0 != 0) goto L_0x0033;
    L_0x000a:
        java.lang.Class.forName(r3);	 Catch:{ Exception -> 0x0013 }
        r0 = 1;	 Catch:{ Exception -> 0x0013 }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ Exception -> 0x0013 }
        goto L_0x002e;
    L_0x0013:
        r0 = "kryo";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Class not available: ";
        r1.append(r2);
        r1.append(r3);
        r1 = r1.toString();
        com.esotericsoftware.minlog.Log.debug(r0, r1);
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);
    L_0x002e:
        r1 = classAvailabilities;
        r1.put(r3, r0);
    L_0x0033:
        r3 = r0.booleanValue();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.Util.isClassAvailable(java.lang.String):boolean");
    }

    public static Class getWrapperClass(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        return Void.class;
    }

    public static Class getPrimitiveClass(Class cls) {
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        return cls == Void.class ? Void.TYPE : cls;
    }

    public static boolean isWrapperClass(Class cls) {
        if (!(cls == Integer.class || cls == Float.class || cls == Boolean.class || cls == Long.class || cls == Byte.class || cls == Character.class || cls == Short.class)) {
            if (cls != Double.class) {
                return null;
            }
        }
        return true;
    }

    public static void log(String str, Object obj) {
        if (obj == null) {
            if (Log.TRACE != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(": null");
                Log.trace("kryo", stringBuilder.toString());
            }
            return;
        }
        Class cls = obj.getClass();
        if (!(cls.isPrimitive() || cls == Boolean.class || cls == Byte.class || cls == Character.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class)) {
            if (cls != String.class) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append(": ");
                stringBuilder2.append(string(obj));
                Log.debug("kryo", stringBuilder2.toString());
            }
        }
        if (Log.TRACE) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(": ");
            stringBuilder2.append(string(obj));
            Log.trace("kryo", stringBuilder2.toString());
        }
    }

    public static java.lang.String string(java.lang.Object r3) {
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
        if (r3 != 0) goto L_0x0005;
    L_0x0002:
        r3 = "null";
        return r3;
    L_0x0005:
        r0 = r3.getClass();
        r1 = r0.isArray();
        if (r1 == 0) goto L_0x0014;
    L_0x000f:
        r3 = className(r0);
        return r3;
    L_0x0014:
        r1 = "toString";	 Catch:{ Exception -> 0x0033 }
        r2 = 0;	 Catch:{ Exception -> 0x0033 }
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0033 }
        r1 = r0.getMethod(r1, r2);	 Catch:{ Exception -> 0x0033 }
        r1 = r1.getDeclaringClass();	 Catch:{ Exception -> 0x0033 }
        r2 = java.lang.Object.class;	 Catch:{ Exception -> 0x0033 }
        if (r1 != r2) goto L_0x0033;	 Catch:{ Exception -> 0x0033 }
    L_0x0025:
        r1 = com.esotericsoftware.minlog.Log.TRACE;	 Catch:{ Exception -> 0x0033 }
        if (r1 == 0) goto L_0x002e;	 Catch:{ Exception -> 0x0033 }
    L_0x0029:
        r1 = className(r0);	 Catch:{ Exception -> 0x0033 }
        goto L_0x0032;	 Catch:{ Exception -> 0x0033 }
    L_0x002e:
        r1 = r0.getSimpleName();	 Catch:{ Exception -> 0x0033 }
    L_0x0032:
        return r1;
    L_0x0033:
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Throwable -> 0x0038 }
        return r3;
    L_0x0038:
        r3 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = com.esotericsoftware.minlog.Log.TRACE;
        if (r2 == 0) goto L_0x0047;
    L_0x0042:
        r0 = className(r0);
        goto L_0x004b;
    L_0x0047:
        r0 = r0.getSimpleName();
    L_0x004b:
        r1.append(r0);
        r0 = "(Exception ";
        r1.append(r0);
        r1.append(r3);
        r3 = " in toString)";
        r1.append(r3);
        r3 = r1.toString();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.Util.string(java.lang.Object):java.lang.String");
    }

    public static String className(Class cls) {
        if (cls.isArray()) {
            Class elementClass = getElementClass(cls);
            StringBuilder stringBuilder = new StringBuilder(16);
            cls = getDimensionCount(cls);
            for (int i = 0; i < cls; i++) {
                stringBuilder.append("[]");
            }
            cls = new StringBuilder();
            cls.append(className(elementClass));
            cls.append(stringBuilder);
            return cls.toString();
        }
        if (!(cls.isPrimitive() || cls == Object.class || cls == Boolean.class || cls == Byte.class || cls == Character.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class)) {
            if (cls != String.class) {
                return cls.getName();
            }
        }
        return cls.getSimpleName();
    }

    public static int getDimensionCount(Class cls) {
        int i = 0;
        for (cls = cls.getComponentType(); cls != null; cls = cls.getComponentType()) {
            i++;
        }
        return i;
    }

    public static Class getElementClass(Class cls) {
        while (cls.getComponentType() != null) {
            cls = cls.getComponentType();
        }
        return cls;
    }
}
