package com.facebook.ads.internal.p047k;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p041h.C3288g;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.k.g */
public class C1488g {

    /* renamed from: com.facebook.ads.internal.k.g$a */
    public interface C1487a {
        /* renamed from: D */
        String mo1728D();

        /* renamed from: F */
        C1486f mo1729F();

        /* renamed from: G */
        Collection<String> mo1730G();
    }

    /* renamed from: a */
    public static Collection<String> m5233a(JSONArray jSONArray) {
        if (jSONArray != null) {
            if (jSONArray.length() != 0) {
                Collection hashSet = new HashSet();
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.optString(i));
                }
                return hashSet;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m5234a(Context context, C1487a c1487a) {
        C1486f F = c1487a.mo1729F();
        if (F == null || F == C1486f.NONE) {
            return false;
        }
        Collection<String> G = c1487a.mo1730G();
        if (G == null || G.isEmpty()) {
            return false;
        }
        Object obj;
        for (String a : G) {
            if (C1488g.m5235a(context, a)) {
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj == (F == C1486f.INSTALLED ? 1 : null)) {
            Object D = c1487a.mo1728D();
            if (!TextUtils.isEmpty(D)) {
                C3288g.m12671a(context).mo1747b(D, null);
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m5235a(android.content.Context r2, java.lang.String r3) {
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
        r0 = android.text.TextUtils.isEmpty(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r2 = r2.getPackageManager();
        r0 = 1;
        r2.getPackageInfo(r3, r0);	 Catch:{ NameNotFoundException -> 0x0011, NameNotFoundException -> 0x0011 }
        return r0;
    L_0x0011:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.g.a(android.content.Context, java.lang.String):boolean");
    }
}
