package com.google.android.m4b.maps.p107g;

import android.content.pm.PackageInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.m4b.maps.p107g.C5396e.C5372a;
import com.google.android.m4b.maps.p107g.C5396e.C6677b;

/* renamed from: com.google.android.m4b.maps.g.h */
public final class C5399h {
    /* renamed from: a */
    private static final C5399h f20344a = new C5399h();

    private C5399h() {
    }

    /* renamed from: a */
    public static C5399h m23591a() {
        return f20344a;
    }

    /* renamed from: a */
    public final boolean m23593a(android.content.pm.PackageManager r4, java.lang.String r5) {
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
        r3 = this;
        r0 = 64;
        r1 = 0;
        r0 = r4.getPackageInfo(r5, r0);	 Catch:{ NameNotFoundException -> 0x002a }
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return r1;
    L_0x000a:
        r4 = com.google.android.m4b.maps.p107g.C5398g.m23582a(r4);
        r5 = 1;
        if (r4 == 0) goto L_0x0016;
    L_0x0011:
        r4 = com.google.android.m4b.maps.p107g.C5399h.m23592a(r0, r5);
        return r4;
    L_0x0016:
        r4 = com.google.android.m4b.maps.p107g.C5399h.m23592a(r0, r1);
        if (r4 != 0) goto L_0x0029;
    L_0x001c:
        r5 = com.google.android.m4b.maps.p107g.C5399h.m23592a(r0, r5);
        if (r5 == 0) goto L_0x0029;
    L_0x0022:
        r5 = "GoogleSignatureVerifier";
        r0 = "Test-keys aren't accepted on this build.";
        android.util.Log.w(r5, r0);
    L_0x0029:
        return r4;
    L_0x002a:
        r4 = "GoogleSignatureVerifier";
        r0 = 3;
        r4 = android.util.Log.isLoggable(r4, r0);
        if (r4 == 0) goto L_0x0058;
    L_0x0033:
        r4 = "GoogleSignatureVerifier";
        r0 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r5);
        r2 = r2.length();
        r2 = r2 + 56;
        r0.<init>(r2);
        r2 = "Package manager can't find package ";
        r0.append(r2);
        r0.append(r5);
        r5 = ", defaulting to false";
        r0.append(r5);
        r5 = r0.toString();
        android.util.Log.d(r4, r5);
    L_0x0058:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.g.h.a(android.content.pm.PackageManager, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static boolean m23592a(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        C5372a c6677b = new C6677b(packageInfo.signatures[0].toByteArray());
        if (z) {
            packageInfo = C5396e.m23573a();
        } else {
            packageInfo = C5396e.m23575b();
        }
        if (packageInfo.contains(c6677b) != null) {
            return true;
        }
        if (Log.isLoggable("GoogleSignatureVerifier", true) != null) {
            packageInfo = "GoogleSignatureVerifier";
            z = "Signature not valid.  Found: \n";
            String valueOf = String.valueOf(Base64.encodeToString(c6677b.mo5401a(), 0));
            Log.v(packageInfo, valueOf.length() != 0 ? z.concat(valueOf) : new String(z));
        }
        return false;
    }

    /* renamed from: a */
    static C5372a m23590a(PackageInfo packageInfo, C5372a... c5372aArr) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C5372a c6677b = new C6677b(packageInfo.signatures[0].toByteArray());
        for (packageInfo = null; packageInfo < c5372aArr.length; packageInfo++) {
            if (c5372aArr[packageInfo].equals(c6677b)) {
                return c5372aArr[packageInfo];
            }
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2) != null) {
            packageInfo = "GoogleSignatureVerifier";
            c5372aArr = "Signature not valid.  Found: \n";
            String valueOf = String.valueOf(Base64.encodeToString(c6677b.mo5401a(), 0));
            Log.v(packageInfo, valueOf.length() != 0 ? c5372aArr.concat(valueOf) : new String(c5372aArr));
        }
        return null;
    }
}
