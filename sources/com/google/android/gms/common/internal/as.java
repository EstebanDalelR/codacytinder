package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.BinderThread;
import com.google.android.gms.common.ConnectionResult;

public final class as extends am {
    /* renamed from: a */
    private IBinder f13988a;
    /* renamed from: b */
    private /* synthetic */ al f13989b;

    @BinderThread
    public as(al alVar, int i, IBinder iBinder, Bundle bundle) {
        this.f13989b = alVar;
        super(alVar, i, bundle);
        this.f13988a = iBinder;
    }

    /* renamed from: a */
    protected final void mo3581a(ConnectionResult connectionResult) {
        if (this.f13989b.f7600v != null) {
            this.f13989b.f7600v.onConnectionFailed(connectionResult);
        }
        this.f13989b.m9086a(connectionResult);
    }

    /* renamed from: a */
    protected final boolean mo3582a() {
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
        r6 = this;
        r0 = 0;
        r1 = r6.f13988a;	 Catch:{ RemoteException -> 0x0087 }
        r1 = r1.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x0087 }
        r2 = r6.f13989b;
        r2 = r2.mo3770b();
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x004b;
    L_0x0013:
        r2 = "GmsClient";
        r3 = r6.f13989b;
        r3 = r3.mo3770b();
        r4 = java.lang.String.valueOf(r3);
        r4 = r4.length();
        r4 = r4 + 34;
        r5 = java.lang.String.valueOf(r1);
        r5 = r5.length();
        r4 = r4 + r5;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "service descriptor mismatch: ";
        r5.append(r4);
        r5.append(r3);
        r3 = " vs. ";
        r5.append(r3);
        r5.append(r1);
        r1 = r5.toString();
        android.util.Log.e(r2, r1);
        return r0;
    L_0x004b:
        r1 = r6.f13989b;
        r2 = r6.f13988a;
        r1 = r1.mo3768a(r2);
        if (r1 == 0) goto L_0x0086;
    L_0x0055:
        r2 = r6.f13989b;
        r3 = 2;
        r4 = 4;
        r2 = r2.m9068a(r3, r4, r1);
        if (r2 != 0) goto L_0x0068;
    L_0x005f:
        r2 = r6.f13989b;
        r3 = 3;
        r1 = r2.m9068a(r3, r4, r1);
        if (r1 == 0) goto L_0x0086;
    L_0x0068:
        r0 = r6.f13989b;
        r1 = 0;
        r0.f7603y = r1;
        r0 = r6.f13989b;
        r0 = r0.zzafi();
        r1 = r6.f13989b;
        r1 = r1.f7599u;
        if (r1 == 0) goto L_0x0085;
    L_0x007c:
        r1 = r6.f13989b;
        r1 = r1.f7599u;
        r1.onConnected(r0);
    L_0x0085:
        r0 = 1;
    L_0x0086:
        return r0;
    L_0x0087:
        r1 = "GmsClient";
        r2 = "service probably died";
        android.util.Log.w(r1, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.as.a():boolean");
    }
}
