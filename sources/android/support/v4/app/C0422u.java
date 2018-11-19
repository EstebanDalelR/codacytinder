package android.support.v4.app;

import android.app.NotificationManager;
import android.content.Context;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* renamed from: android.support.v4.app.u */
public final class C0422u {
    /* renamed from: a */
    private static final Object f1417a = new Object();
    @GuardedBy("sEnabledNotificationListenersLock")
    /* renamed from: b */
    private static Set<String> f1418b = new HashSet();
    /* renamed from: e */
    private static final Object f1419e = new Object();
    /* renamed from: c */
    private final Context f1420c;
    /* renamed from: d */
    private final NotificationManager f1421d = ((NotificationManager) this.f1420c.getSystemService("notification"));

    @NonNull
    /* renamed from: a */
    public static C0422u m1577a(@NonNull Context context) {
        return new C0422u(context);
    }

    private C0422u(Context context) {
        this.f1420c = context;
    }

    /* renamed from: a */
    public boolean m1578a() {
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
        r11 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 24;
        if (r0 < r1) goto L_0x000d;
    L_0x0006:
        r0 = r11.f1421d;
        r0 = r0.areNotificationsEnabled();
        return r0;
    L_0x000d:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 19;
        r2 = 1;
        if (r0 < r1) goto L_0x0083;
    L_0x0014:
        r0 = r11.f1420c;
        r1 = "appops";
        r0 = r0.getSystemService(r1);
        r0 = (android.app.AppOpsManager) r0;
        r1 = r11.f1420c;
        r1 = r1.getApplicationInfo();
        r3 = r11.f1420c;
        r3 = r3.getApplicationContext();
        r3 = r3.getPackageName();
        r1 = r1.uid;
        r4 = android.app.AppOpsManager.class;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r4 = r4.getName();	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r4 = java.lang.Class.forName(r4);	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r5 = "checkOpNoThrow";	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r6 = 3;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r7 = new java.lang.Class[r6];	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r8 = java.lang.Integer.TYPE;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r9 = 0;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r7[r9] = r8;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r8 = java.lang.Integer.TYPE;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r7[r2] = r8;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r8 = java.lang.String.class;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r10 = 2;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r7[r10] = r8;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r5 = r4.getMethod(r5, r7);	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r7 = "OP_POST_NOTIFICATION";	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r4 = r4.getDeclaredField(r7);	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r7 = java.lang.Integer.class;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r4 = r4.get(r7);	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r4 = (java.lang.Integer) r4;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r4 = r4.intValue();	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r6 = new java.lang.Object[r6];	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r6[r9] = r4;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r6[r2] = r1;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r6[r10] = r3;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r0 = r5.invoke(r0, r6);	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r0 = (java.lang.Integer) r0;	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        r0 = r0.intValue();	 Catch:{ ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082, ClassNotFoundException -> 0x0082 }
        if (r0 != 0) goto L_0x0080;
    L_0x007f:
        goto L_0x0081;
    L_0x0080:
        r2 = 0;
    L_0x0081:
        return r2;
    L_0x0082:
        return r2;
    L_0x0083:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.u.a():boolean");
    }
}
