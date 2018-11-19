package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p125y.C5579p;

/* renamed from: com.google.android.m4b.maps.cg.s */
public final class C5188s {
    /* renamed from: a */
    private final Context f19289a;
    /* renamed from: b */
    private final cb f19290b;
    /* renamed from: c */
    private final Resources f19291c;
    /* renamed from: d */
    private String f19292d;
    /* renamed from: e */
    private boolean f19293e = false;
    /* renamed from: f */
    private boolean f19294f = false;

    public C5188s(android.content.Context r2, com.google.android.m4b.maps.cg.cb r3, android.content.res.Resources r4) {
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
        r1 = this;
        r1.<init>();
        r0 = 0;
        r1.f19293e = r0;
        r1.f19294f = r0;
        r1.f19289a = r2;
        r1.f19290b = r3;
        r1.f19291c = r4;
        r2 = r1.f19289a;
        r2 = r2.getPackageManager();
        r3 = "com.google.android.apps.gmm";
        r3 = com.google.android.m4b.maps.cg.C5188s.m23184a(r3, r2);
        if (r3 == 0) goto L_0x0021;
    L_0x001c:
        r3 = "com.google.android.apps.gmm";
        r1.f19292d = r3;
        goto L_0x0031;
    L_0x0021:
        r3 = "com.google.android.apps.maps";
        r3 = com.google.android.m4b.maps.cg.C5188s.m23184a(r3, r2);
        if (r3 == 0) goto L_0x002e;
    L_0x0029:
        r3 = "com.google.android.apps.maps";
        r1.f19292d = r3;
        goto L_0x0031;
    L_0x002e:
        r3 = 0;
        r1.f19292d = r3;
    L_0x0031:
        r3 = r1.f19292d;
        if (r3 == 0) goto L_0x0052;
    L_0x0035:
        r3 = r1.f19292d;	 Catch:{ NameNotFoundException -> 0x0052 }
        r4 = 1;	 Catch:{ NameNotFoundException -> 0x0052 }
        r2 = r2.getPackageInfo(r3, r4);	 Catch:{ NameNotFoundException -> 0x0052 }
        r2 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x0052 }
        r3 = 700000000; // 0x29b92700 float:8.222416E-14 double:3.45845952E-315;	 Catch:{ NameNotFoundException -> 0x0052 }
        if (r2 <= r3) goto L_0x0045;	 Catch:{ NameNotFoundException -> 0x0052 }
    L_0x0043:
        r3 = 1;	 Catch:{ NameNotFoundException -> 0x0052 }
        goto L_0x0046;	 Catch:{ NameNotFoundException -> 0x0052 }
    L_0x0045:
        r3 = 0;	 Catch:{ NameNotFoundException -> 0x0052 }
    L_0x0046:
        r1.f19293e = r3;	 Catch:{ NameNotFoundException -> 0x0052 }
        r3 = 703000000; // 0x29e6edc0 float:1.0255295E-13 double:3.47328149E-315;	 Catch:{ NameNotFoundException -> 0x0052 }
        if (r2 <= r3) goto L_0x004e;	 Catch:{ NameNotFoundException -> 0x0052 }
    L_0x004d:
        goto L_0x004f;	 Catch:{ NameNotFoundException -> 0x0052 }
    L_0x004e:
        r4 = 0;	 Catch:{ NameNotFoundException -> 0x0052 }
    L_0x004f:
        r1.f19294f = r4;	 Catch:{ NameNotFoundException -> 0x0052 }
        return;
    L_0x0052:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.s.<init>(android.content.Context, com.google.android.m4b.maps.cg.cb, android.content.res.Resources):void");
    }

    /* renamed from: a */
    public final void m23185a(az azVar) {
        if (!C5398g.m23589e(this.f19289a)) {
            this.f19290b.mo5310b(C5164a.INTENT_DIRECTIONS);
            azVar = azVar.getPosition();
            double d = azVar.latitude;
            double d2 = azVar.longitude;
            azVar = new StringBuilder(90);
            azVar.append("http://maps.google.com/maps?saddr=&daddr=");
            azVar.append(d);
            azVar.append(",");
            azVar.append(d2);
            m23183a(azVar.toString());
        }
    }

    /* renamed from: a */
    public final void m23186a(CameraPosition cameraPosition, az azVar, boolean z) {
        if (!C5398g.m23589e(this.f19289a)) {
            String stringBuilder;
            if (z) {
                if (azVar == null) {
                    this.f19290b.mo5310b(C5164a.INTENT_VIEW_MULTIPLE_MARKERS_NONE_SELECTED);
                } else {
                    this.f19290b.mo5310b(C5164a.INTENT_VIEW_MULTIPLE_MARKERS_ONE_SELECTED);
                }
            } else if (azVar != null) {
                this.f19290b.mo5310b(C5164a.INTENT_VIEW_ONE_MARKER);
            } else {
                this.f19290b.mo5310b(C5164a.INTENT_VIEW_NO_MARKERS);
            }
            double d = cameraPosition.target.latitude;
            double d2 = cameraPosition.target.longitude;
            z = new StringBuilder(56);
            z.append("geo:");
            z.append(d);
            z.append(",");
            z.append(d2);
            z.append("?z=");
            z = z.toString();
            StringBuilder stringBuilder2;
            if (this.f19293e) {
                z = String.valueOf(z);
                cameraPosition = cameraPosition.zoom;
                stringBuilder2 = new StringBuilder(String.valueOf(z).length() + 15);
                stringBuilder2.append(z);
                stringBuilder2.append(cameraPosition);
                stringBuilder = stringBuilder2.toString();
            } else {
                z = String.valueOf(z);
                cameraPosition = (int) Math.floor((double) cameraPosition.zoom);
                stringBuilder2 = new StringBuilder(String.valueOf(z).length() + 11);
                stringBuilder2.append(z);
                stringBuilder2.append(cameraPosition);
                stringBuilder = stringBuilder2.toString();
            }
            if (azVar != null) {
                z = azVar.getPosition();
                cameraPosition = String.valueOf(stringBuilder);
                d = z.latitude;
                d2 = z.longitude;
                z = new StringBuilder(String.valueOf(cameraPosition).length() + 52);
                z.append(cameraPosition);
                z.append("&q=");
                z.append(d);
                z.append(",");
                z.append(d2);
                stringBuilder = z.toString();
                azVar = azVar.getTitle();
                if (!C5579p.m24319b(azVar) && this.f19294f) {
                    cameraPosition = String.valueOf(stringBuilder);
                    z = new StringBuilder((String.valueOf(cameraPosition).length() + 2) + String.valueOf(azVar).length());
                    z.append(cameraPosition);
                    z.append("(");
                    z.append(azVar);
                    z.append(")");
                    stringBuilder = z.toString();
                }
            }
            m23183a(stringBuilder);
        }
    }

    /* renamed from: a */
    private void m23183a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        if (this.f19292d != null) {
            intent.setPackage(this.f19292d);
            this.f19289a.startActivity(intent);
            return;
        }
        Toast.makeText(this.f19289a, this.f19291c.getString(C4513R.string.maps_NO_GMM), 0).show();
    }

    /* renamed from: a */
    private static boolean m23184a(java.lang.String r1, android.content.pm.PackageManager r2) {
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
        r0 = 1;
        r2.getPackageInfo(r1, r0);	 Catch:{ NameNotFoundException -> 0x0005 }
        return r0;
    L_0x0005:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.s.a(java.lang.String, android.content.pm.PackageManager):boolean");
    }
}
