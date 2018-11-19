package android.arch.persistence.room;

import android.arch.persistence.room.C0091e.C0088a;
import android.content.Context;
import android.support.annotation.NonNull;

/* renamed from: android.arch.persistence.room.d */
public class C0087d {
    @NonNull
    /* renamed from: a */
    public static <T extends C0091e> C0088a<T> m275a(@NonNull Context context, @NonNull Class<T> cls, @NonNull String str) {
        if (str != null) {
            if (str.trim().length() != 0) {
                return new C0088a(context, cls, str);
            }
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    @NonNull
    /* renamed from: a */
    public static <T extends C0091e> C0088a<T> m274a(@NonNull Context context, @NonNull Class<T> cls) {
        return new C0088a(context, cls, null);
    }

    @android.support.annotation.NonNull
    /* renamed from: a */
    static <T, C> T m276a(java.lang.Class<C> r5, java.lang.String r6) {
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
        r0 = r5.getPackage();
        r0 = r0.getName();
        r1 = r5.getCanonicalName();
        r2 = r0.isEmpty();
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x001d;
    L_0x0013:
        r2 = r0.length();
        r2 = r2 + 1;
        r1 = r1.substring(r2);
    L_0x001d:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = 46;
        r4 = 95;
        r1 = r1.replace(r3, r4);
        r2.append(r1);
        r2.append(r6);
        r6 = r2.toString();
        r1 = r0.isEmpty();	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
        if (r1 == 0) goto L_0x003c;	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
    L_0x003a:
        r0 = r6;	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
        goto L_0x0050;	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
    L_0x003c:
        r1 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
        r1.<init>();	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
        r1.append(r0);	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
        r0 = ".";	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
        r1.append(r0);	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
        r1.append(r6);	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
        r0 = r1.toString();	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
    L_0x0050:
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
        r0 = r0.newInstance();	 Catch:{ ClassNotFoundException -> 0x008f, IllegalAccessException -> 0x0074, InstantiationException -> 0x0059 }
        return r0;
    L_0x0059:
        r6 = new java.lang.RuntimeException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Failed to create an instance of ";
        r0.append(r1);
        r5 = r5.getCanonicalName();
        r0.append(r5);
        r5 = r0.toString();
        r6.<init>(r5);
        throw r6;
    L_0x0074:
        r6 = new java.lang.RuntimeException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Cannot access the constructor";
        r0.append(r1);
        r5 = r5.getCanonicalName();
        r0.append(r5);
        r5 = r0.toString();
        r6.<init>(r5);
        throw r6;
    L_0x008f:
        r0 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "cannot find implementation for ";
        r1.append(r2);
        r5 = r5.getCanonicalName();
        r1.append(r5);
        r5 = ". ";
        r1.append(r5);
        r1.append(r6);
        r5 = " does not exist";
        r1.append(r5);
        r5 = r1.toString();
        r0.<init>(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.arch.persistence.room.d.a(java.lang.Class, java.lang.String):T");
    }
}
