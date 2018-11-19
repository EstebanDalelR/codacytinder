package com.foursquare.pilgrim;

import java.util.ArrayList;
import java.util.List;

abstract class bd {
    /* renamed from: a */
    private final List<String> f5354a = new ArrayList();

    /* renamed from: a */
    public abstract boolean mo2049a();

    bd() {
    }

    /* renamed from: a */
    void m7085a(String str) {
        synchronized (this.f5354a) {
            this.f5354a.add(str);
        }
    }

    /* renamed from: b */
    String m7087b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        synchronized (this.f5354a) {
            for (String str2 : this.f5354a) {
                stringBuilder.append("\n");
                stringBuilder.append(str);
                stringBuilder.append(str2);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static void m7084a(com.foursquare.pilgrim.bd r3) {
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
        r0 = 0;
    L_0x0001:
        r1 = 5;
        if (r0 >= r1) goto L_0x0013;
    L_0x0004:
        r1 = r3.mo2049a();
        if (r1 == 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0013;
    L_0x000b:
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        java.lang.Thread.sleep(r1);	 Catch:{ Exception -> 0x0010 }
    L_0x0010:
        r0 = r0 + 1;
        goto L_0x0001;
    L_0x0013:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.bd.a(com.foursquare.pilgrim.bd):void");
    }
}
