package com.google.android.m4b.maps.bm;

import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C6517d;
import com.google.android.m4b.maps.bo.C6519h;
import com.google.android.m4b.maps.bo.C6524p;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bo;
import com.google.android.m4b.maps.bq.C4870j;
import com.google.android.m4b.maps.bq.C6534d;
import com.google.android.m4b.maps.br.C4874b;
import com.google.android.m4b.maps.br.C4875d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.bm.b */
public final class C6478b implements C4874b, C4875d {
    /* renamed from: a */
    private final C4870j f24003a;
    /* renamed from: b */
    private final C6534d f24004b;
    /* renamed from: c */
    private final ba f24005c;
    /* renamed from: d */
    private final Map<C7436c, C4821a> f24006d = Collections.synchronizedMap(ax.m20623b());
    /* renamed from: e */
    private final Collection<C4820a> f24007e = Collections.synchronizedList(new ArrayList());
    /* renamed from: f */
    private volatile boolean f24008f;
    /* renamed from: g */
    private volatile C4822b f24009g;

    /* renamed from: com.google.android.m4b.maps.bm.b$a */
    static class C4821a {
        /* renamed from: a */
        private final C7436c f17612a;
        /* renamed from: b */
        private final C6519h f17613b = new C6519h();
        /* renamed from: c */
        private af f17614c;

        public C4821a(C6517d c6517d) {
            this.f17612a = C7436c.m32017b(c6517d.mo5107a().toString());
            c6517d.m28688b().m21694a(this.f17613b);
        }

        /* renamed from: a */
        public final void m21393a(af afVar) {
            this.f17614c = afVar;
        }

        /* renamed from: a */
        public final C4820a m21392a() {
            return new C4820a(this.f17612a, this.f17613b, this.f17614c, new String[0]);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bm.b$b */
    public interface C4822b {
        /* renamed from: a */
        void mo5095a(C6478b c6478b, Collection<C4820a> collection);
    }

    public C6478b(C4870j c4870j, C6534d c6534d, ba baVar) {
        this.f24003a = c4870j;
        this.f24004b = c6534d;
        this.f24005c = baVar;
    }

    /* renamed from: a */
    public final void m28431a(C4822b c4822b) {
        this.f24009g = c4822b;
        this.f24003a.mo7079a(this.f24005c, (C4875d) this);
    }

    /* renamed from: a */
    public final ba m28429a() {
        return this.f24005c;
    }

    /* renamed from: a */
    public final void mo5079a(com.google.android.m4b.maps.bo.ba r6, int r7, com.google.android.m4b.maps.bo.az r8) {
        /* JADX: method processing error */
/*
Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:410)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:308)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:249)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:68)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = 3;
        if (r7 != r0) goto L_0x0004;
    L_0x0003:
        return;
    L_0x0004:
        r1 = 2;
        if (r7 != r1) goto L_0x0034;
    L_0x0007:
        r7 = "BuildingBoundFetcher";
        r7 = com.google.android.m4b.maps.ay.C4728u.m21050a(r7, r0);
        if (r7 == 0) goto L_0x0065;
    L_0x000f:
        r7 = "BuildingBoundFetcher";
        r1 = java.lang.String.valueOf(r6);
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r3 = r3 + 15;
        r2.<init>(r3);
        r3 = "Tile not found ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        android.util.Log.d(r7, r1);
        goto L_0x0065;
    L_0x0034:
        r1 = 1;
        if (r7 != r1) goto L_0x0065;
    L_0x0037:
        r7 = "BuildingBoundFetcher";
        r7 = com.google.android.m4b.maps.ay.C4728u.m21050a(r7, r0);
        if (r7 == 0) goto L_0x0063;
    L_0x003f:
        r7 = "BuildingBoundFetcher";
        r2 = java.lang.String.valueOf(r6);
        r3 = new java.lang.StringBuilder;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r4 = r4 + 13;
        r3.<init>(r4);
        r4 = "IO error for ";
        r3.append(r4);
        r3.append(r2);
        r2 = r3.toString();
        android.util.Log.d(r7, r2);
    L_0x0063:
        r5.f24008f = r1;
    L_0x0065:
        r7 = 0;
        if (r8 == 0) goto L_0x00ab;
    L_0x0068:
        r8 = (com.google.android.m4b.maps.bo.bo) r8;
        r7 = com.google.android.m4b.maps.bm.C6478b.m28427a(r8);
        r8 = "BuildingBoundFetcher";
        r8 = com.google.android.m4b.maps.ay.C4728u.m21050a(r8, r0);
        if (r8 == 0) goto L_0x00ab;
    L_0x0076:
        r8 = "BuildingBoundFetcher";
        r6 = java.lang.String.valueOf(r6);
        r0 = r7.size();
        r1 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r6);
        r2 = r2.length();
        r2 = r2 + 35;
        r1.<init>(r2);
        r2 = "Tile ";
        r1.append(r2);
        r1.append(r6);
        r6 = " has ";
        r1.append(r6);
        r1.append(r0);
        r6 = " indoor areas ";
        r1.append(r6);
        r6 = r1.toString();
        android.util.Log.d(r8, r6);
    L_0x00ab:
        if (r7 == 0) goto L_0x00f8;
    L_0x00ad:
        r6 = r7.size();
        if (r6 != 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00f8;
    L_0x00b4:
        r6 = r7.iterator();
    L_0x00b8:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x00d3;
    L_0x00be:
        r7 = r6.next();
        r7 = (com.google.android.m4b.maps.bo.C6517d) r7;
        r8 = new com.google.android.m4b.maps.bm.b$a;
        r8.<init>(r7);
        r7 = r5.f24006d;
        r0 = r8.f17612a;
        r7.put(r0, r8);
        goto L_0x00b8;
    L_0x00d3:
        r6 = r5.f24006d;
        r6 = r6.values();
        r6 = com.google.android.m4b.maps.aa.au.m20525a(r6);
        r6 = r6.iterator();
    L_0x00e1:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x00f7;
    L_0x00e7:
        r7 = r6.next();
        r7 = (com.google.android.m4b.maps.bm.C6478b.C4821a) r7;
        r8 = r5.f24004b;
        r7 = r7.f17612a;
        r8.m28811a(r7, r5);
        goto L_0x00e1;
    L_0x00f7:
        return;
    L_0x00f8:
        r5.m28428b();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bm.b.a(com.google.android.m4b.maps.bo.ba, int, com.google.android.m4b.maps.bo.az):void");
    }

    /* renamed from: a */
    public final void mo5078a(C7436c c7436c, int i, C6524p c6524p) {
        synchronized (this.f24006d) {
            C4821a c4821a = (C4821a) this.f24006d.remove(c7436c);
            boolean isEmpty = this.f24006d.isEmpty();
        }
        if (c4821a != null) {
            if (c6524p != null) {
                c4821a.m21393a(c6524p.m28753f());
                this.f24007e.add(c4821a.m21392a());
            }
            if (i == 1) {
                this.f24008f = true;
            }
            if (isEmpty) {
                m28428b();
            }
        }
    }

    /* renamed from: b */
    private void m28428b() {
        if (this.f24009g != null) {
            if (this.f24008f) {
                this.f24009g.mo5095a(this, null);
            } else {
                this.f24009g.mo5095a(this, this.f24007e);
            }
        }
    }

    /* renamed from: a */
    private static Collection<C6517d> m28427a(bo boVar) {
        Collection arrayList = new ArrayList();
        boVar = boVar.mo7546k();
        while (boVar.hasNext()) {
            C4848k c4848k = (C4848k) boVar.next();
            if (c4848k.mo5109h() == 3) {
                C6517d c6517d = (C6517d) c4848k;
                if (c6517d.m28697k()) {
                    C4699a a = c6517d.mo5107a();
                    if (!(a == null || a == C4699a.f17284a)) {
                        arrayList.add(c6517d);
                    }
                }
            }
        }
        return arrayList;
    }
}
