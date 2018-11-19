package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.p047k.aj;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.adapters.e */
public class C1356e {
    /* renamed from: a */
    private static final Set<C1358g> f3643a = new HashSet();
    /* renamed from: b */
    private static final Map<AdPlacementType, String> f3644b = new ConcurrentHashMap();

    static {
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
        r0 = new java.util.HashSet;
        r0.<init>();
        f3643a = r0;
        r0 = new java.util.concurrent.ConcurrentHashMap;
        r0.<init>();
        f3644b = r0;
        r0 = com.facebook.ads.internal.adapters.C1358g.m4751a();
        r0 = r0.iterator();
    L_0x0016:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x005a;
    L_0x001c:
        r1 = r0.next();
        r1 = (com.facebook.ads.internal.adapters.C1358g) r1;
        r2 = 0;
        r3 = com.facebook.ads.internal.adapters.C1356e.C13551.f3642a;
        r4 = r1.f3664l;
        r4 = r4.ordinal();
        r3 = r3[r4];
        switch(r3) {
            case 1: goto L_0x003d;
            case 2: goto L_0x003a;
            case 3: goto L_0x0037;
            case 4: goto L_0x0034;
            case 5: goto L_0x0031;
            default: goto L_0x0030;
        };
    L_0x0030:
        goto L_0x003f;
    L_0x0031:
        r2 = com.facebook.ads.internal.adapters.aa.class;
        goto L_0x003f;
    L_0x0034:
        r2 = com.facebook.ads.internal.adapters.C3274t.class;
        goto L_0x003f;
    L_0x0037:
        r2 = com.facebook.ads.internal.adapters.C3276y.class;
        goto L_0x003f;
    L_0x003a:
        r2 = com.facebook.ads.internal.adapters.InterstitialAdapter.class;
        goto L_0x003f;
    L_0x003d:
        r2 = com.facebook.ads.internal.adapters.BannerAdapter.class;
    L_0x003f:
        if (r2 == 0) goto L_0x0016;
    L_0x0041:
        r3 = r1.f3661i;
        if (r3 != 0) goto L_0x004c;
    L_0x0045:
        r4 = r1.f3662j;	 Catch:{ ClassNotFoundException -> 0x004c }
        r4 = java.lang.Class.forName(r4);	 Catch:{ ClassNotFoundException -> 0x004c }
        r3 = r4;
    L_0x004c:
        if (r3 == 0) goto L_0x0016;
    L_0x004e:
        r2 = r2.isAssignableFrom(r3);
        if (r2 == 0) goto L_0x0016;
    L_0x0054:
        r2 = f3643a;
        r2.add(r1);
        goto L_0x0016;
    L_0x005a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.e.<clinit>():void");
    }

    /* renamed from: a */
    public static AdAdapter m4746a(C1357f c1357f, AdPlacementType adPlacementType) {
        try {
            C1358g b = C1356e.m4749b(c1357f, adPlacementType);
            if (b != null && f3643a.contains(b)) {
                Class cls = b.f3661i;
                if (cls == null) {
                    cls = Class.forName(b.f3662j);
                }
                return (AdAdapter) cls.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public static AdAdapter m4747a(String str, AdPlacementType adPlacementType) {
        return C1356e.m4746a(C1357f.m4750a(str), adPlacementType);
    }

    /* renamed from: a */
    public static String m4748a(AdPlacementType adPlacementType) {
        if (f3644b.containsKey(adPlacementType)) {
            return (String) f3644b.get(adPlacementType);
        }
        Set hashSet = new HashSet();
        for (C1358g c1358g : f3643a) {
            if (c1358g.f3664l == adPlacementType) {
                hashSet.add(c1358g.f3663k.toString());
            }
        }
        String a = aj.m5189a(hashSet, ",");
        f3644b.put(adPlacementType, a);
        return a;
    }

    /* renamed from: b */
    private static C1358g m4749b(C1357f c1357f, AdPlacementType adPlacementType) {
        for (C1358g c1358g : f3643a) {
            if (c1358g.f3663k == c1357f && c1358g.f3664l == adPlacementType) {
                return c1358g;
            }
        }
        return null;
    }
}
