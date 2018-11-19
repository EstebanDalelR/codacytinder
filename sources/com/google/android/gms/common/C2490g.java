package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C2502k;
import com.google.android.gms.common.util.C2521f;

/* renamed from: com.google.android.gms.common.g */
public class C2490g {
    /* renamed from: a */
    private static final C2490g f7553a = new C2490g();
    /* renamed from: b */
    public static final int f7554b = C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    C2490g() {
    }

    @Nullable
    /* renamed from: a */
    public static Intent m9019a(Context context, int i, @Nullable String str) {
        switch (i) {
            case 1:
            case 2:
                return (context == null || !C2521f.m9200b(context)) ? C2502k.m9165a("com.google.android.gms", C2490g.m9020a(context, str)) : C2502k.m9163a();
            case 3:
                return C2502k.m9164a("com.google.android.gms");
            default:
                return null;
        }
    }

    /* renamed from: a */
    private static java.lang.String m9020a(@android.support.annotation.Nullable android.content.Context r2, @android.support.annotation.Nullable java.lang.String r3) {
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
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "gcore_";
        r0.append(r1);
        r1 = f7554b;
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r1 = android.text.TextUtils.isEmpty(r3);
        if (r1 != 0) goto L_0x001d;
    L_0x001a:
        r0.append(r3);
    L_0x001d:
        r3 = "-";
        r0.append(r3);
        if (r2 == 0) goto L_0x002b;
    L_0x0024:
        r3 = r2.getPackageName();
        r0.append(r3);
    L_0x002b:
        r3 = "-";
        r0.append(r3);
        if (r2 == 0) goto L_0x0044;
    L_0x0032:
        r3 = com.google.android.gms.internal.pl.a(r2);	 Catch:{ NameNotFoundException -> 0x0044 }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x0044 }
        r1 = 0;	 Catch:{ NameNotFoundException -> 0x0044 }
        r2 = r3.b(r2, r1);	 Catch:{ NameNotFoundException -> 0x0044 }
        r2 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x0044 }
        r0.append(r2);	 Catch:{ NameNotFoundException -> 0x0044 }
    L_0x0044:
        r2 = r0.toString();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.g.a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static C2490g m9021b() {
        return f7553a;
    }

    /* renamed from: b */
    public static boolean m9022b(Context context, int i) {
        return C2513p.zze(context, i);
    }

    /* renamed from: c */
    public static void m9023c(Context context) {
        C2513p.zzce(context);
    }

    /* renamed from: d */
    public static int m9024d(Context context) {
        return C2513p.zzcf(context);
    }

    /* renamed from: a */
    public int mo2566a(Context context) {
        int isGooglePlayServicesAvailable = C2513p.isGooglePlayServicesAvailable(context);
        return C2513p.zze(context, isGooglePlayServicesAvailable) ? 18 : isGooglePlayServicesAvailable;
    }

    @Nullable
    /* renamed from: a */
    public PendingIntent mo2567a(Context context, int i, int i2) {
        return m9027a(context, i, i2, null);
    }

    @Nullable
    /* renamed from: a */
    public final PendingIntent m9027a(Context context, int i, int i2, @Nullable String str) {
        Intent a = C2490g.m9019a(context, i, str);
        return a == null ? null : PendingIntent.getActivity(context, i2, a, 268435456);
    }

    /* renamed from: a */
    public boolean mo2568a(int i) {
        return C2513p.isUserRecoverableError(i);
    }

    /* renamed from: b */
    public String mo2569b(int i) {
        return C2513p.getErrorString(i);
    }

    @Nullable
    @Deprecated
    /* renamed from: c */
    public final Intent m9030c(int i) {
        return C2490g.m9019a(null, i, null);
    }
}
