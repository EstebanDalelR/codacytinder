package com.google.android.m4b.maps.bm;

import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.bo.C4847g;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.am;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.bm.a */
public final class C4820a {
    /* renamed from: a */
    private final C7436c f17608a;
    /* renamed from: b */
    private final C4847g f17609b;
    /* renamed from: c */
    private final af f17610c;
    /* renamed from: d */
    private final Set<C4699a> f17611d;

    public C4820a(C7436c c7436c, C4847g c4847g, af afVar, String[] strArr) {
        this.f17608a = c7436c;
        this.f17609b = c4847g;
        if (afVar == null) {
            afVar = c4847g.mo5089a().m32214e();
        }
        this.f17610c = afVar;
        this.f17611d = new HashSet();
        for (String a : strArr) {
            this.f17611d.add(C4699a.m20895a(a));
        }
    }

    /* renamed from: a */
    public final C7436c m21386a() {
        return this.f17608a;
    }

    /* renamed from: b */
    public final al m21389b() {
        return this.f17609b.mo5089a();
    }

    /* renamed from: a */
    public final boolean m21388a(am amVar) {
        return this.f17609b.mo5091a(amVar);
    }

    /* renamed from: c */
    public final af m21390c() {
        return this.f17610c;
    }

    /* renamed from: a */
    static com.google.android.m4b.maps.bo.af m21384a(java.lang.String r4) {
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
        r0 = com.google.android.m4b.maps.bn.C4831a.m21408a(r4);
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r4 = r0.m21411a();
        r0 = r0.m21412b();
        r4 = com.google.android.m4b.maps.bo.af.m21466b(r4, r0);
        return r4;
    L_0x0013:
        r0 = "0x1:0x";
        r0 = r4.startsWith(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x004f;
    L_0x001c:
        r0 = r4.length();
        r2 = 14;
        r3 = 6;
        if (r0 > r2) goto L_0x002c;
    L_0x0025:
        r0 = "0";
        r4 = r4.substring(r3);
        goto L_0x0040;
    L_0x002c:
        r0 = r4.length();
        r0 = r0 + -8;
        r0 = r4.substring(r3, r0);
        r2 = r4.length();
        r2 = r2 + -8;
        r4 = r4.substring(r2);
    L_0x0040:
        r0 = com.google.android.m4b.maps.ax.C4702d.m20906b(r0);	 Catch:{ NumberFormatException -> 0x004e }
        r4 = com.google.android.m4b.maps.ax.C4702d.m20906b(r4);	 Catch:{ NumberFormatException -> 0x004e }
        r2 = new com.google.android.m4b.maps.bo.af;	 Catch:{ NumberFormatException -> 0x004e }
        r2.<init>(r0, r4);	 Catch:{ NumberFormatException -> 0x004e }
        return r2;
    L_0x004e:
        return r1;
    L_0x004f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bm.a.a(java.lang.String):com.google.android.m4b.maps.bo.af");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4820a)) {
            return false;
        }
        C4820a c4820a = (C4820a) obj;
        return c4820a.f17608a.equals(this.f17608a) && c4820a.f17609b.equals(this.f17609b) && c4820a.f17610c.equals(this.f17610c) && c4820a.f17611d.equals(this.f17611d) != null;
    }

    public final int hashCode() {
        return (((((this.f17609b.hashCode() * 31) + this.f17610c.hashCode()) * 31) + this.f17611d.hashCode()) * 31) + this.f17608a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17608a);
        String valueOf2 = String.valueOf(this.f17609b);
        String valueOf3 = String.valueOf(this.f17610c);
        String valueOf4 = String.valueOf(this.f17611d);
        StringBuilder stringBuilder = new StringBuilder((((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length());
        stringBuilder.append("[");
        stringBuilder.append(valueOf);
        stringBuilder.append(" : ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" : ");
        stringBuilder.append(valueOf3);
        stringBuilder.append(" : ");
        stringBuilder.append(valueOf4);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static Collection<C4820a> m21385a(Collection<C4820a> collection, am amVar) {
        if (collection.isEmpty()) {
            return collection;
        }
        Collection linkedList = new LinkedList();
        for (C4820a c4820a : collection) {
            if (c4820a.m21388a(amVar)) {
                linkedList.add(c4820a);
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    final void m21387a(Set<C4699a> set) {
        set.addAll(this.f17611d);
        this.f17611d.clear();
    }
}
