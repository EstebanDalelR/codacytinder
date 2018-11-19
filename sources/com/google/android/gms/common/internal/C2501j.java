package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.j */
final class C2501j implements ServiceConnection {
    /* renamed from: a */
    private final Set<ServiceConnection> f7644a = new HashSet();
    /* renamed from: b */
    private int f7645b = 2;
    /* renamed from: c */
    private boolean f7646c;
    /* renamed from: d */
    private IBinder f7647d;
    /* renamed from: e */
    private final C2500h f7648e;
    /* renamed from: f */
    private ComponentName f7649f;
    /* renamed from: g */
    private /* synthetic */ C3819i f7650g;

    public C2501j(C3819i c3819i, C2500h c2500h) {
        this.f7650g = c3819i;
        this.f7648e = c2500h;
    }

    /* renamed from: a */
    public final void m9153a(ServiceConnection serviceConnection, String str) {
        this.f7650g.f12070d;
        this.f7650g.f12068b;
        this.f7648e.m9152d();
        this.f7644a.add(serviceConnection);
    }

    /* renamed from: a */
    public final void m9154a(java.lang.String r8) {
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
        r7 = this;
        r0 = 3;
        r7.f7645b = r0;
        r0 = r7.f7650g;
        r1 = r0.f12070d;
        r0 = r7.f7650g;
        r2 = r0.f12068b;
        r0 = r7.f7648e;
        r4 = r0.m9152d();
        r0 = r7.f7648e;
        r6 = r0.m9151c();
        r3 = r8;
        r5 = r7;
        r8 = r1.m9183a(r2, r3, r4, r5, r6);
        r7.f7646c = r8;
        r8 = r7.f7646c;
        if (r8 == 0) goto L_0x0044;
    L_0x0027:
        r8 = r7.f7650g;
        r8 = r8.f12069c;
        r0 = 1;
        r1 = r7.f7648e;
        r8 = r8.obtainMessage(r0, r1);
        r0 = r7.f7650g;
        r0 = r0.f12069c;
        r1 = r7.f7650g;
        r1 = r1.f12072f;
        r0.sendMessageDelayed(r8, r1);
        return;
    L_0x0044:
        r8 = 2;
        r7.f7645b = r8;
        r8 = r7.f7650g;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r8.f12070d;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r8 = r7.f7650g;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r8 = r8.f12068b;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r8.unbindService(r7);	 Catch:{ IllegalArgumentException -> 0x0055 }
    L_0x0055:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.j.a(java.lang.String):void");
    }

    /* renamed from: a */
    public final boolean m9155a() {
        return this.f7646c;
    }

    /* renamed from: a */
    public final boolean m9156a(ServiceConnection serviceConnection) {
        return this.f7644a.contains(serviceConnection);
    }

    /* renamed from: b */
    public final int m9157b() {
        return this.f7645b;
    }

    /* renamed from: b */
    public final void m9158b(ServiceConnection serviceConnection, String str) {
        this.f7650g.f12070d;
        this.f7650g.f12068b;
        this.f7644a.remove(serviceConnection);
    }

    /* renamed from: b */
    public final void m9159b(String str) {
        this.f7650g.f12069c.removeMessages(1, this.f7648e);
        this.f7650g.f12070d;
        this.f7650g.f12068b.unbindService(this);
        this.f7646c = false;
        this.f7645b = 2;
    }

    /* renamed from: c */
    public final boolean m9160c() {
        return this.f7644a.isEmpty();
    }

    /* renamed from: d */
    public final IBinder m9161d() {
        return this.f7647d;
    }

    /* renamed from: e */
    public final ComponentName m9162e() {
        return this.f7649f;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f7650g.f12067a) {
            this.f7650g.f12069c.removeMessages(1, this.f7648e);
            this.f7647d = iBinder;
            this.f7649f = componentName;
            for (ServiceConnection onServiceConnected : this.f7644a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f7645b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f7650g.f12067a) {
            this.f7650g.f12069c.removeMessages(1, this.f7648e);
            this.f7647d = null;
            this.f7649f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f7644a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f7645b = 2;
        }
    }
}
