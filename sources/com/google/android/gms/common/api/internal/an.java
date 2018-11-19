package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.C2467b;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.aj;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.internal.zzcxd;
import com.google.android.gms.tasks.C4501b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class an<O extends ApiOptions> implements ConnectionCallbacks, OnConnectionFailedListener, zzu {
    /* renamed from: a */
    final /* synthetic */ al f13959a;
    /* renamed from: b */
    private final Queue<C2475a> f13960b = new LinkedList();
    /* renamed from: c */
    private final zze f13961c;
    /* renamed from: d */
    private final zzb f13962d;
    /* renamed from: e */
    private final cg<O> f13963e;
    /* renamed from: f */
    private final C2477f f13964f;
    /* renamed from: g */
    private final Set<ci> f13965g = new HashSet();
    /* renamed from: h */
    private final Map<bd<?>, bi> f13966h = new HashMap();
    /* renamed from: i */
    private final int f13967i;
    /* renamed from: j */
    private final bl f13968j;
    /* renamed from: k */
    private boolean f13969k;
    /* renamed from: l */
    private ConnectionResult f13970l = null;

    @WorkerThread
    public an(al alVar, C2467b<O> c2467b) {
        this.f13959a = alVar;
        this.f13961c = c2467b.mo2552a(alVar.f7475q.getLooper(), this);
        this.f13962d = this.f13961c instanceof aj ? aj.m18160c() : this.f13961c;
        this.f13963e = c2467b.m8901b();
        this.f13964f = new C2477f();
        this.f13967i = c2467b.m8904c();
        if (this.f13961c.zzaay()) {
            this.f13968j = c2467b.mo2553a(alVar.f7466h, alVar.f7475q);
        } else {
            this.f13968j = null;
        }
    }

    @WorkerThread
    /* renamed from: b */
    private final void m17181b(ConnectionResult connectionResult) {
        for (ci ciVar : this.f13965g) {
            String str = null;
            if (connectionResult == ConnectionResult.zzfkr) {
                str = this.f13961c.zzagi();
            }
            ciVar.m8995a(this.f13963e, connectionResult, str);
        }
        this.f13965g.clear();
    }

    @android.support.annotation.WorkerThread
    /* renamed from: b */
    private final void m17182b(com.google.android.gms.common.api.internal.C2475a r3) {
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
        r2 = this;
        r0 = r2.f13964f;
        r1 = r2.m17203k();
        r3.mo2528a(r0, r1);
        r3.mo2527a(r2);	 Catch:{ DeadObjectException -> 0x000d }
        return;
    L_0x000d:
        r3 = 1;
        r2.onConnectionSuspended(r3);
        r3 = r2.f13961c;
        r3.disconnect();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.an.b(com.google.android.gms.common.api.internal.a):void");
    }

    @android.support.annotation.WorkerThread
    /* renamed from: n */
    private final void m17185n() {
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
        r4 = this;
        r4.m17196d();
        r0 = com.google.android.gms.common.ConnectionResult.zzfkr;
        r4.m17181b(r0);
        r4.m17187p();
        r0 = r4.f13966h;
        r0 = r0.values();
        r0 = r0.iterator();
    L_0x0015:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0037;
    L_0x001b:
        r1 = r0.next();
        r1 = (com.google.android.gms.common.api.internal.bi) r1;
        r1 = r1.f7498a;	 Catch:{ DeadObjectException -> 0x002e, RemoteException -> 0x0015 }
        r2 = r4.f13962d;	 Catch:{ DeadObjectException -> 0x002e, RemoteException -> 0x0015 }
        r3 = new com.google.android.gms.tasks.b;	 Catch:{ DeadObjectException -> 0x002e, RemoteException -> 0x0015 }
        r3.<init>();	 Catch:{ DeadObjectException -> 0x002e, RemoteException -> 0x0015 }
        r1.m8979a(r2, r3);	 Catch:{ DeadObjectException -> 0x002e, RemoteException -> 0x0015 }
        goto L_0x0015;
    L_0x002e:
        r0 = 1;
        r4.onConnectionSuspended(r0);
        r0 = r4.f13961c;
        r0.disconnect();
    L_0x0037:
        r0 = r4.f13961c;
        r0 = r0.isConnected();
        if (r0 == 0) goto L_0x0053;
    L_0x003f:
        r0 = r4.f13960b;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0053;
    L_0x0047:
        r0 = r4.f13960b;
        r0 = r0.remove();
        r0 = (com.google.android.gms.common.api.internal.C2475a) r0;
        r4.m17182b(r0);
        goto L_0x0037;
    L_0x0053:
        r4.m17188q();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.an.n():void");
    }

    @WorkerThread
    /* renamed from: o */
    private final void m17186o() {
        m17196d();
        this.f13969k = true;
        this.f13964f.m9011c();
        this.f13959a.f7475q.sendMessageDelayed(Message.obtain(this.f13959a.f7475q, 9, this.f13963e), this.f13959a.f7463c);
        this.f13959a.f7475q.sendMessageDelayed(Message.obtain(this.f13959a.f7475q, 11, this.f13963e), this.f13959a.f7464d);
        this.f13959a.f7468j = -1;
    }

    @WorkerThread
    /* renamed from: p */
    private final void m17187p() {
        if (this.f13969k) {
            this.f13959a.f7475q.removeMessages(11, this.f13963e);
            this.f13959a.f7475q.removeMessages(9, this.f13963e);
            this.f13969k = false;
        }
    }

    /* renamed from: q */
    private final void m17188q() {
        this.f13959a.f7475q.removeMessages(12, this.f13963e);
        this.f13959a.f7475q.sendMessageDelayed(this.f13959a.f7475q.obtainMessage(12, this.f13963e), this.f13959a.f7465e);
    }

    @WorkerThread
    /* renamed from: a */
    public final void m17189a() {
        ad.m9049a(this.f13959a.f7475q);
        m17191a(al.f7459a);
        this.f13964f.m9010b();
        for (bd ceVar : (bd[]) this.f13966h.keySet().toArray(new bd[this.f13966h.size()])) {
            m17192a(new ce(ceVar, new C4501b()));
        }
        m17181b(new ConnectionResult(4));
        if (this.f13961c.isConnected()) {
            this.f13961c.zza(new ar(this));
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void m17190a(@NonNull ConnectionResult connectionResult) {
        ad.m9049a(this.f13959a.f7475q);
        this.f13961c.disconnect();
        onConnectionFailed(connectionResult);
    }

    @WorkerThread
    /* renamed from: a */
    public final void m17191a(Status status) {
        ad.m9049a(this.f13959a.f7475q);
        for (C2475a a : this.f13960b) {
            a.mo2526a(status);
        }
        this.f13960b.clear();
    }

    @WorkerThread
    /* renamed from: a */
    public final void m17192a(C2475a c2475a) {
        ad.m9049a(this.f13959a.f7475q);
        if (this.f13961c.isConnected()) {
            m17182b(c2475a);
            m17188q();
            return;
        }
        this.f13960b.add(c2475a);
        if (this.f13970l == null || !this.f13970l.hasResolution()) {
            m17201i();
        } else {
            onConnectionFailed(this.f13970l);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void m17193a(ci ciVar) {
        ad.m9049a(this.f13959a.f7475q);
        this.f13965g.add(ciVar);
    }

    /* renamed from: b */
    public final zze m17194b() {
        return this.f13961c;
    }

    /* renamed from: c */
    public final Map<bd<?>, bi> m17195c() {
        return this.f13966h;
    }

    @WorkerThread
    /* renamed from: d */
    public final void m17196d() {
        ad.m9049a(this.f13959a.f7475q);
        this.f13970l = null;
    }

    @WorkerThread
    /* renamed from: e */
    public final ConnectionResult m17197e() {
        ad.m9049a(this.f13959a.f7475q);
        return this.f13970l;
    }

    @WorkerThread
    /* renamed from: f */
    public final void m17198f() {
        ad.m9049a(this.f13959a.f7475q);
        if (this.f13969k) {
            m17201i();
        }
    }

    @WorkerThread
    /* renamed from: g */
    public final void m17199g() {
        ad.m9049a(this.f13959a.f7475q);
        if (this.f13969k) {
            m17187p();
            m17191a(this.f13959a.f7467i.mo2566a(this.f13959a.f7466h) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
            this.f13961c.disconnect();
        }
    }

    @WorkerThread
    /* renamed from: h */
    public final void m17200h() {
        ad.m9049a(this.f13959a.f7475q);
        if (this.f13961c.isConnected() && this.f13966h.size() == 0) {
            if (this.f13964f.m9009a()) {
                m17188q();
                return;
            }
            this.f13961c.disconnect();
        }
    }

    @WorkerThread
    /* renamed from: i */
    public final void m17201i() {
        ad.m9049a(this.f13959a.f7475q);
        if (!this.f13961c.isConnected() && !this.f13961c.isConnecting()) {
            if (this.f13961c.zzagg() && this.f13959a.f7468j != 0) {
                this.f13959a.f7468j = this.f13959a.f7467i.mo2566a(this.f13959a.f7466h);
                if (this.f13959a.f7468j != 0) {
                    onConnectionFailed(new ConnectionResult(this.f13959a.f7468j, null));
                    return;
                }
            }
            zzj atVar = new at(this.f13959a, this.f13961c, this.f13963e);
            if (this.f13961c.zzaay()) {
                this.f13968j.m18157a((zzcy) atVar);
            }
            this.f13961c.zza(atVar);
        }
    }

    /* renamed from: j */
    final boolean m17202j() {
        return this.f13961c.isConnected();
    }

    /* renamed from: k */
    public final boolean m17203k() {
        return this.f13961c.zzaay();
    }

    /* renamed from: l */
    public final int m17204l() {
        return this.f13967i;
    }

    /* renamed from: m */
    final zzcxd m17205m() {
        return this.f13968j == null ? null : this.f13968j.m18156a();
    }

    public final void onConnected(@Nullable Bundle bundle) {
        if (Looper.myLooper() == this.f13959a.f7475q.getLooper()) {
            m17185n();
        } else {
            this.f13959a.f7475q.post(new ao(this));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.WorkerThread
    public final void onConnectionFailed(@android.support.annotation.NonNull com.google.android.gms.common.ConnectionResult r5) {
        /*
        r4 = this;
        r0 = r4.f13959a;
        r0 = r0.f7475q;
        com.google.android.gms.common.internal.ad.m9049a(r0);
        r0 = r4.f13968j;
        if (r0 == 0) goto L_0x0012;
    L_0x000d:
        r0 = r4.f13968j;
        r0.m18158b();
    L_0x0012:
        r4.m17196d();
        r0 = r4.f13959a;
        r1 = -1;
        r0.f7468j = r1;
        r4.m17181b(r5);
        r0 = r5.getErrorCode();
        r1 = 4;
        if (r0 != r1) goto L_0x002d;
    L_0x0025:
        r5 = com.google.android.gms.common.api.internal.al.f7460b;
        r4.m17191a(r5);
        return;
    L_0x002d:
        r0 = r4.f13960b;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0038;
    L_0x0035:
        r4.f13970l = r5;
        return;
    L_0x0038:
        r0 = com.google.android.gms.common.api.internal.al.f7461f;
        monitor-enter(r0);
        r1 = r4.f13959a;	 Catch:{ all -> 0x00c9 }
        r1 = r1.f7472n;	 Catch:{ all -> 0x00c9 }
        if (r1 == 0) goto L_0x0060;
    L_0x0045:
        r1 = r4.f13959a;	 Catch:{ all -> 0x00c9 }
        r1 = r1.f7473o;	 Catch:{ all -> 0x00c9 }
        r2 = r4.f13963e;	 Catch:{ all -> 0x00c9 }
        r1 = r1.contains(r2);	 Catch:{ all -> 0x00c9 }
        if (r1 == 0) goto L_0x0060;
    L_0x0053:
        r1 = r4.f13959a;	 Catch:{ all -> 0x00c9 }
        r1 = r1.f7472n;	 Catch:{ all -> 0x00c9 }
        r2 = r4.f13967i;	 Catch:{ all -> 0x00c9 }
        r1.m14337b(r5, r2);	 Catch:{ all -> 0x00c9 }
        monitor-exit(r0);	 Catch:{ all -> 0x00c9 }
        return;
    L_0x0060:
        monitor-exit(r0);	 Catch:{ all -> 0x00c9 }
        r0 = r4.f13959a;
        r1 = r4.f13967i;
        r0 = r0.m8960a(r5, r1);
        if (r0 != 0) goto L_0x00c8;
    L_0x006b:
        r5 = r5.getErrorCode();
        r0 = 18;
        if (r5 != r0) goto L_0x0076;
    L_0x0073:
        r5 = 1;
        r4.f13969k = r5;
    L_0x0076:
        r5 = r4.f13969k;
        if (r5 == 0) goto L_0x0098;
    L_0x007a:
        r5 = r4.f13959a;
        r5 = r5.f7475q;
        r0 = r4.f13959a;
        r0 = r0.f7475q;
        r1 = 9;
        r2 = r4.f13963e;
        r0 = android.os.Message.obtain(r0, r1, r2);
        r1 = r4.f13959a;
        r1 = r1.f7463c;
        r5.sendMessageDelayed(r0, r1);
        return;
    L_0x0098:
        r5 = new com.google.android.gms.common.api.Status;
        r0 = 17;
        r1 = r4.f13963e;
        r1 = r1.m8993a();
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r2 = r2 + 38;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "API: ";
        r3.append(r2);
        r3.append(r1);
        r1 = " is not available on this device.";
        r3.append(r1);
        r1 = r3.toString();
        r5.<init>(r0, r1);
        r4.m17191a(r5);
    L_0x00c8:
        return;
    L_0x00c9:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00c9 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.an.onConnectionFailed(com.google.android.gms.common.ConnectionResult):void");
    }

    public final void onConnectionSuspended(int i) {
        if (Looper.myLooper() == this.f13959a.f7475q.getLooper()) {
            m17186o();
        } else {
            this.f13959a.f7475q.post(new ap(this));
        }
    }

    public final void zza(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (Looper.myLooper() == this.f13959a.f7475q.getLooper()) {
            onConnectionFailed(connectionResult);
        } else {
            this.f13959a.f7475q.post(new aq(this, connectionResult));
        }
    }
}
