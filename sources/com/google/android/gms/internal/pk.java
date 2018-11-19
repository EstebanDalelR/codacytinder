package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C2526k;

public final class pk {
    /* renamed from: a */
    private Context f16388a;

    public pk(Context context) {
        this.f16388a = context;
    }

    /* renamed from: a */
    public final int m20124a(String str) {
        return this.f16388a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public final int m20125a(String str, String str2) {
        return this.f16388a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: a */
    public final ApplicationInfo m20126a(String str, int i) throws NameNotFoundException {
        return this.f16388a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: a */
    public final boolean m20127a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return pj.m20123a(this.f16388a);
        }
        if (C2526k.i()) {
            String nameForUid = this.f16388a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f16388a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }

    @android.annotation.TargetApi(19)
    /* renamed from: a */
    public final boolean m20128a(int r5, java.lang.String r6) {
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
        r4 = this;
        r0 = com.google.android.gms.common.util.C2526k.e();
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0017;
    L_0x0008:
        r0 = r4.f16388a;	 Catch:{ SecurityException -> 0x0016 }
        r3 = "appops";	 Catch:{ SecurityException -> 0x0016 }
        r0 = r0.getSystemService(r3);	 Catch:{ SecurityException -> 0x0016 }
        r0 = (android.app.AppOpsManager) r0;	 Catch:{ SecurityException -> 0x0016 }
        r0.checkPackage(r5, r6);	 Catch:{ SecurityException -> 0x0016 }
        return r2;
    L_0x0016:
        return r1;
    L_0x0017:
        r0 = r4.f16388a;
        r0 = r0.getPackageManager();
        r5 = r0.getPackagesForUid(r5);
        if (r6 == 0) goto L_0x0035;
    L_0x0023:
        if (r5 == 0) goto L_0x0035;
    L_0x0025:
        r0 = 0;
    L_0x0026:
        r3 = r5.length;
        if (r0 >= r3) goto L_0x0035;
    L_0x0029:
        r3 = r5[r0];
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0032;
    L_0x0031:
        return r2;
    L_0x0032:
        r0 = r0 + 1;
        goto L_0x0026;
    L_0x0035:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pk.a(int, java.lang.String):boolean");
    }

    /* renamed from: b */
    public final PackageInfo m20129b(String str, int i) throws NameNotFoundException {
        return this.f16388a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: b */
    public final CharSequence m20130b(String str) throws NameNotFoundException {
        return this.f16388a.getPackageManager().getApplicationLabel(this.f16388a.getPackageManager().getApplicationInfo(str, 0));
    }
}
