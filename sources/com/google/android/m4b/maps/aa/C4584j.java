package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5566g;
import com.tinder.api.ManagerWebServices;
import java.util.Collection;

/* renamed from: com.google.android.m4b.maps.aa.j */
public final class C4584j {
    /* renamed from: a */
    static final C5566g f16988a = C5566g.m24266a(", ").mo5819b(ManagerWebServices.NULL_STRING_VALUE);

    /* renamed from: a */
    static boolean m20672a(java.util.Collection<?> r1, java.lang.Object r2) {
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
        com.google.android.m4b.maps.p125y.C5571j.m24292a(r1);
        r0 = 0;
        r1 = r1.contains(r2);	 Catch:{ ClassCastException -> 0x000a, NullPointerException -> 0x0009 }
        return r1;
    L_0x0009:
        return r0;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.j.a(java.util.Collection, java.lang.Object):boolean");
    }

    /* renamed from: a */
    static StringBuilder m20670a(int i) {
        C4583i.m20668a(i, ManagerWebServices.PARAM_SIZE);
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }

    /* renamed from: a */
    static <T> Collection<T> m20671a(Iterable<T> iterable) {
        return (Collection) iterable;
    }
}
