package com.google.android.m4b.maps.bw;

import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.android.m4b.maps.bw.b */
public class C4969b {
    /* renamed from: c */
    private static final Logger f18344c = Logger.getLogger(C4969b.class.getCanonicalName());
    /* renamed from: a */
    private List<String> f18345a = null;
    /* renamed from: b */
    private byte[] f18346b = null;

    /* renamed from: com.google.android.m4b.maps.bw.b$a */
    public static class C4968a extends Exception {
        public C4968a(String str) {
            super(str);
        }
    }

    public C4969b(List<String> list, byte[] bArr) {
        C5571j.m24292a((Object) list);
        boolean z = false;
        C5571j.m24298a(list.size() > 0, (Object) "The list of featureIds is empty");
        C5571j.m24292a((Object) bArr);
        if (bArr.length > 0) {
            z = true;
        }
        C5571j.m24298a(z, (Object) "The featureMapRaster is empty");
        this.f18345a = list;
        this.f18346b = bArr;
    }

    /* renamed from: a */
    public final java.util.List<java.lang.String> m22237a(int r7, int r8) {
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
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
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
        r6 = this;
        r0 = 0;
        r1 = r6.m22235c(r0);
        if (r1 == 0) goto L_0x000c;
    L_0x0007:
        r1 = r6.f18346b;
        com.google.android.m4b.maps.bw.C4969b.m22233a(r1);
    L_0x000c:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = 3;
        r2 = r6.m22232a(r2);
        r3 = r6.m22236d(r8);
        r4 = 1;
        r2 = r2 - r4;
        if (r8 != r2) goto L_0x0022;
    L_0x001e:
        r8 = r6.f18346b;
        r8 = r8.length;
        goto L_0x0027;
    L_0x0022:
        r8 = r8 + r4;
        r8 = r6.m22236d(r8);
    L_0x0027:
        r2 = 0;
    L_0x0028:
        if (r2 > r7) goto L_0x0077;
    L_0x002a:
        if (r3 >= r8) goto L_0x0077;
    L_0x002c:
        r5 = r6.m22235c(r3);
        r3 = r3 + 1;
        switch(r5) {
            case 1: goto L_0x0074;
            case 2: goto L_0x006c;
            case 3: goto L_0x0064;
            case 4: goto L_0x0035;
            case 5: goto L_0x0056;
            case 6: goto L_0x0048;
            case 7: goto L_0x003a;
            case 8: goto L_0x0036;
            default: goto L_0x0035;
        };
    L_0x0035:
        goto L_0x0028;
    L_0x0036:
        r1.clear();
        goto L_0x0028;
    L_0x003a:
        r5 = r6.m22234b(r3);
        r5 = java.lang.Integer.valueOf(r5);
        r1.add(r5);
        r3 = r3 + 3;
        goto L_0x0028;
    L_0x0048:
        r5 = r6.m22232a(r3);
        r5 = java.lang.Integer.valueOf(r5);
        r1.add(r5);
        r3 = r3 + 2;
        goto L_0x0028;
    L_0x0056:
        r5 = r6.m22235c(r3);
        r5 = java.lang.Integer.valueOf(r5);
        r1.add(r5);
        r3 = r3 + 1;
        goto L_0x0028;
    L_0x0064:
        r5 = r6.m22232a(r3);
        r2 = r2 + r5;
        r3 = r3 + 2;
        goto L_0x0028;
    L_0x006c:
        r5 = r6.m22235c(r3);
        r2 = r2 + r5;
        r3 = r3 + 1;
        goto L_0x0028;
    L_0x0074:
        r2 = r2 + 1;
        goto L_0x0028;
    L_0x0077:
        r7 = new java.util.ArrayList;
        r7.<init>();
    L_0x007c:
        r8 = r1.size();
        if (r0 >= r8) goto L_0x00b3;
    L_0x0082:
        r8 = r1.get(r0);
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        r2 = r6.f18345a;
        r2 = r2.size();
        r2 = r2 - r4;
        if (r8 <= r2) goto L_0x009d;
    L_0x0095:
        r7 = new com.google.android.m4b.maps.bw.b$a;
        r8 = "FeatureIndex is bigger than the total number of features available";
        r7.<init>(r8);
        throw r7;
    L_0x009d:
        r8 = r6.f18345a;
        r2 = r1.get(r0);
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r8 = r8.get(r2);
        r7.add(r8);
        r0 = r0 + 1;
        goto L_0x007c;
    L_0x00b3:
        r8 = r7.size();
        if (r8 <= r4) goto L_0x00e3;
    L_0x00b9:
        r8 = new java.util.HashSet;
        r8.<init>();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r7.iterator();
    L_0x00c7:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00dd;
    L_0x00cd:
        r2 = r1.next();
        r2 = (java.lang.String) r2;
        r3 = r8.add(r2);
        if (r3 == 0) goto L_0x00c7;
    L_0x00d9:
        r0.add(r2);
        goto L_0x00c7;
    L_0x00dd:
        r7.clear();
        r7.addAll(r0);
    L_0x00e3:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bw.b.a(int, int):java.util.List<java.lang.String>");
    }

    /* renamed from: a */
    private int m22232a(int i) {
        int i2 = i + 1;
        if (i2 > this.f18346b.length) {
            C4969b.m22233a(this.f18346b);
        }
        return (m22235c(i) << 6) + m22235c(i2);
    }

    /* renamed from: b */
    private int m22234b(int i) {
        int i2 = i + 2;
        if (i2 > this.f18346b.length) {
            C4969b.m22233a(this.f18346b);
        }
        return ((m22235c(i) << 12) + (m22235c(i + 1) << 6)) + m22235c(i2);
    }

    /* renamed from: c */
    private int m22235c(int i) {
        if (i > this.f18346b.length) {
            C4969b.m22233a(this.f18346b);
        }
        return this.f18346b[i] - 63;
    }

    /* renamed from: d */
    private int m22236d(int i) {
        return m22234b((i * 3) + 5);
    }

    /* renamed from: a */
    private static void m22233a(byte[] bArr) {
        Object str = new String(bArr);
        if (str.length() > 100) {
            str = str.substring(null, 100);
        }
        bArr = "Invalid featureMap raster:";
        String valueOf = String.valueOf(str);
        bArr = valueOf.length() != 0 ? bArr.concat(valueOf) : new String(bArr);
        if (C4728u.m21050a(C4969b.class.getSimpleName(), 6)) {
            Log.e(C4969b.class.getSimpleName(), bArr);
        }
        throw new C4968a(bArr);
    }
}
