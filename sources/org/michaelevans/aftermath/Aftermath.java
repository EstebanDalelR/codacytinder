package org.michaelevans.aftermath;

import android.content.Intent;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Aftermath {
    private static final Map<Class<?>, IAftermathDelegate> AFTERMATHS = new LinkedHashMap();
    public static final String ANDROID_PREFIX = "android.";
    public static final String JAVA_PREFIX = "java.";
    private static final IAftermathDelegate NO_OP = null;
    public static final String SUFFIX = "$$Aftermath";
    private static final String TAG = "Aftermath";
    private static boolean debug = false;

    public static void onActivityResult(Object obj, int i, int i2, Intent intent) {
        Class cls = obj.getClass();
        if (debug) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Looking up aftermath for ");
            stringBuilder.append(cls.getName());
            Log.d(str, stringBuilder.toString());
        }
        IAftermathDelegate findActivityForResultForClass = findActivityForResultForClass(cls);
        if (findActivityForResultForClass != NO_OP) {
            findActivityForResultForClass.onActivityResult(obj, i, i2, intent);
        }
    }

    public static void onRequestPermissionResult(Object obj, int i, String[] strArr, int[] iArr) {
        Class cls = obj.getClass();
        if (debug) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Looking up aftermath for ");
            stringBuilder.append(cls.getName());
            Log.d(str, stringBuilder.toString());
        }
        IAftermathDelegate findActivityForResultForClass = findActivityForResultForClass(cls);
        if (findActivityForResultForClass != NO_OP) {
            findActivityForResultForClass.onRequestPermissionsResult(obj, i, strArr, iArr);
        }
    }

    private static org.michaelevans.aftermath.IAftermathDelegate findActivityForResultForClass(java.lang.Class<?> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = AFTERMATHS;
        r0 = r0.get(r4);
        r0 = (org.michaelevans.aftermath.IAftermathDelegate) r0;
        if (r0 == 0) goto L_0x0016;
    L_0x000a:
        r4 = debug;
        if (r4 == 0) goto L_0x0015;
    L_0x000e:
        r4 = "Aftermath";
        r1 = "HIT: Cached in aftermath map.";
        android.util.Log.d(r4, r1);
    L_0x0015:
        return r0;
    L_0x0016:
        r1 = r4.getName();
        r2 = "android.";
        r2 = r1.startsWith(r2);
        if (r2 != 0) goto L_0x00a4;
    L_0x0022:
        r2 = "java.";
        r2 = r1.startsWith(r2);
        if (r2 == 0) goto L_0x002c;
    L_0x002a:
        goto L_0x00a4;
    L_0x002c:
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0068, IllegalAccessException -> 0x005d }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0068, IllegalAccessException -> 0x005d }
        r2.append(r1);	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0068, IllegalAccessException -> 0x005d }
        r1 = "$$Aftermath";	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0068, IllegalAccessException -> 0x005d }
        r2.append(r1);	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0068, IllegalAccessException -> 0x005d }
        r1 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0068, IllegalAccessException -> 0x005d }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0068, IllegalAccessException -> 0x005d }
        r1 = r1.newInstance();	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0068, IllegalAccessException -> 0x005d }
        r1 = (org.michaelevans.aftermath.IAftermathDelegate) r1;	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0068, IllegalAccessException -> 0x005d }
        r0 = debug;	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0058, IllegalAccessException -> 0x0053 }
        if (r0 == 0) goto L_0x009d;	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0058, IllegalAccessException -> 0x0053 }
    L_0x004b:
        r0 = "Aftermath";	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0058, IllegalAccessException -> 0x0053 }
        r2 = "HIT: Class loaded aftermath class.";	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0058, IllegalAccessException -> 0x0053 }
        android.util.Log.d(r0, r2);	 Catch:{ ClassNotFoundException -> 0x0073, InstantiationException -> 0x0058, IllegalAccessException -> 0x0053 }
        goto L_0x009d;
    L_0x0053:
        r0 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
        goto L_0x005e;
    L_0x0058:
        r0 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
        goto L_0x0069;
    L_0x005d:
        r1 = move-exception;
    L_0x005e:
        r2 = "Aftermath";
        r1 = r1.getMessage();
        android.util.Log.e(r2, r1);
        goto L_0x009e;
    L_0x0068:
        r1 = move-exception;
    L_0x0069:
        r2 = "Aftermath";
        r1 = r1.getMessage();
        android.util.Log.e(r2, r1);
        goto L_0x009e;
    L_0x0073:
        r0 = debug;
        if (r0 == 0) goto L_0x0095;
    L_0x0077:
        r0 = "Aftermath";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Not found. Trying superclass ";
        r1.append(r2);
        r2 = r4.getSuperclass();
        r2 = r2.getName();
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0095:
        r0 = r4.getSuperclass();
        r1 = findActivityForResultForClass(r0);
    L_0x009d:
        r0 = r1;
    L_0x009e:
        r1 = AFTERMATHS;
        r1.put(r4, r0);
        return r0;
    L_0x00a4:
        r4 = debug;
        if (r4 == 0) goto L_0x00af;
    L_0x00a8:
        r4 = "Aftermath";
        r0 = "MISS: Reached framework class. Abandoning search.";
        android.util.Log.d(r4, r0);
    L_0x00af:
        r4 = NO_OP;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.michaelevans.aftermath.Aftermath.findActivityForResultForClass(java.lang.Class):org.michaelevans.aftermath.IAftermathDelegate");
    }
}
