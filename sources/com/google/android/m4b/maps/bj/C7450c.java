package com.google.android.m4b.maps.bj;

import com.google.android.m4b.maps.bo.C7462l;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bf;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bp;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bz.C6570b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bj.c */
public final class C7450c extends C6464i {
    /* renamed from: d */
    private bp f27332d;
    /* renamed from: e */
    private final List<ba> f27333e = new ArrayList();
    /* renamed from: f */
    private final af f27334f = new af();
    /* renamed from: g */
    private C6570b f27335g;
    /* renamed from: h */
    private bp f27336h;
    /* renamed from: i */
    private float f27337i;
    /* renamed from: j */
    private final float f27338j;
    /* renamed from: k */
    private long f27339k = null;

    public C7450c(bg bgVar, int i, bf bfVar, C4981g c4981g) {
        super(bgVar, bfVar, c4981g);
        this.f27338j = (float) (i * i);
    }

    /* renamed from: a */
    public final List<ba> mo5020a(C6570b c6570b) {
        bp u = c6570b.m29265u();
        if (this.f27332d != null && u.equals(this.f27332d)) {
            boolean z;
            if (this.f27333e.isEmpty()) {
                z = true;
            } else {
                z = ((ba) this.f27333e.get(0)).m21627j().equals(this.b.m21648a());
            }
            if (z) {
                return this.f27333e;
            }
        }
        this.f27339k++;
        C7462l c7462l = (C7462l) u.mo5133c();
        int c = (int) c6570b.m29244c(c7462l.m32263d().m21483c(c7462l.m32262c()), (float) c6570b.m29249e());
        this.f27333e.clear();
        this.f27335g = c6570b;
        this.f27336h = c6570b.m29265u();
        this.f27337i = (float) Math.cos((double) (c6570b.m29255k() * 0.017453292f));
        ArrayList a = ba.m21607a(u.mo5129a(), c, this.b.m21648a());
        for (int i = 0; i < a.size(); i++) {
            m32158a((ba) a.get(i), c6570b.m29242b(), false);
        }
        this.f27332d = u;
        return this.f27333e;
    }

    /* renamed from: a */
    public final long mo5017a() {
        return this.f27339k;
    }

    /* renamed from: a */
    private void m32158a(com.google.android.m4b.maps.bo.ba r5, com.google.android.m4b.maps.bo.af r6, boolean r7) {
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
        r4 = this;
        if (r7 == 0) goto L_0x000f;
    L_0x0002:
        r7 = r4.f27336h;
        r0 = r5.m21626i();
        r7 = r7.mo5135b(r0);
        if (r7 != 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r7 = r5.m21619b();
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r0 >> r7;
        r1 = r4.f27334f;
        r2 = r5.m21622e();
        r2 = r2 + r0;
        r3 = r5.m21623f();
        r3 = r3 + r0;
        r1.m21487d(r2, r3);
        r1 = r4.f27335g;
        r2 = r4.f27334f;
        r3 = 1;
        r1 = r1.m29232a(r2, r3);
        r2 = r4.f27335g;
        r0 = r0 * 2;
        r0 = (float) r0;
        r0 = r2.m29241b(r0, r1);
        r1 = r4.f27337i;
        r1 = r1 * r0;
        r0 = r0 * r1;
        r1 = r4.f27338j;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 < 0) goto L_0x006c;
    L_0x0043:
        r0 = 30;
        if (r7 >= r0) goto L_0x006c;
    L_0x0047:
        r7 = r4.m28339b(r5, r6);
        r0 = r7.isEmpty();
        if (r0 == 0) goto L_0x0057;
    L_0x0051:
        r6 = r4.f27333e;
        r6.add(r5);
        goto L_0x0071;
    L_0x0057:
        r5 = r7.iterator();
    L_0x005b:
        r7 = r5.hasNext();
        if (r7 == 0) goto L_0x006b;
    L_0x0061:
        r7 = r5.next();
        r7 = (com.google.android.m4b.maps.bo.ba) r7;
        r4.m32158a(r7, r6, r3);
        goto L_0x005b;
    L_0x006b:
        return;
    L_0x006c:
        r6 = r4.f27333e;
        r6.add(r5);
    L_0x0071:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bj.c.a(com.google.android.m4b.maps.bo.ba, com.google.android.m4b.maps.bo.af, boolean):void");
    }
}
