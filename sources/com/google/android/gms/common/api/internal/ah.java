package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.C2490g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C2462b;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.internal.tg;
import com.google.android.gms.internal.zzcxd;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class ah implements zzcc, zzu {
    /* renamed from: a */
    final Map<C2462b<?>, zze> f13944a;
    /* renamed from: b */
    final Map<C2462b<?>, ConnectionResult> f13945b = new HashMap();
    /* renamed from: c */
    int f13946c;
    /* renamed from: d */
    final aa f13947d;
    /* renamed from: e */
    final zzcd f13948e;
    /* renamed from: f */
    private final Lock f13949f;
    /* renamed from: g */
    private final Condition f13950g;
    /* renamed from: h */
    private final Context f13951h;
    /* renamed from: i */
    private final C2490g f13952i;
    /* renamed from: j */
    private final aj f13953j;
    /* renamed from: k */
    private av f13954k;
    /* renamed from: l */
    private Map<Api<?>, Boolean> f13955l;
    /* renamed from: m */
    private C3787a<? extends zzcxd, tg> f13956m;
    /* renamed from: n */
    private volatile zzbh f13957n;
    /* renamed from: o */
    private ConnectionResult f13958o = null;

    public ah(Context context, aa aaVar, Lock lock, Looper looper, C2490g c2490g, Map<C2462b<?>, zze> map, av avVar, Map<Api<?>, Boolean> map2, C3787a<? extends zzcxd, tg> c3787a, ArrayList<cq> arrayList, zzcd zzcd) {
        this.f13951h = context;
        this.f13949f = lock;
        this.f13952i = c2490g;
        this.f13944a = map;
        this.f13954k = avVar;
        this.f13955l = map2;
        this.f13956m = c3787a;
        this.f13947d = aaVar;
        this.f13948e = zzcd;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((cq) obj).m14343a(this);
        }
        this.f13953j = new aj(this, looper);
        this.f13950g = lock.newCondition();
        this.f13957n = new C3811y(this);
    }

    /* renamed from: a */
    final void m17175a() {
        this.f13949f.lock();
        try {
            this.f13957n = new C3803n(this, this.f13954k, this.f13955l, this.f13952i, this.f13956m, this.f13949f, this.f13951h);
            this.f13957n.begin();
            this.f13950g.signalAll();
        } finally {
            this.f13949f.unlock();
        }
    }

    /* renamed from: a */
    final void m17176a(ConnectionResult connectionResult) {
        this.f13949f.lock();
        try {
            this.f13958o = connectionResult;
            this.f13957n = new C3811y(this);
            this.f13957n.begin();
            this.f13950g.signalAll();
        } finally {
            this.f13949f.unlock();
        }
    }

    /* renamed from: a */
    final void m17177a(ai aiVar) {
        this.f13953j.sendMessage(this.f13953j.obtainMessage(1, aiVar));
    }

    /* renamed from: a */
    final void m17178a(RuntimeException runtimeException) {
        this.f13953j.sendMessage(this.f13953j.obtainMessage(2, runtimeException));
    }

    /* renamed from: b */
    final void m17179b() {
        this.f13949f.lock();
        try {
            this.f13947d.m14264m();
            this.f13957n = new C3800k(this);
            this.f13957n.begin();
            this.f13950g.signalAll();
        } finally {
            this.f13949f.unlock();
        }
    }

    public final com.google.android.gms.common.ConnectionResult blockingConnect() {
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
        r3 = this;
        r3.connect();
    L_0x0003:
        r0 = r3.isConnecting();
        r1 = 0;
        if (r0 == 0) goto L_0x001f;
    L_0x000a:
        r0 = r3.f13950g;	 Catch:{ InterruptedException -> 0x0010 }
        r0.await();	 Catch:{ InterruptedException -> 0x0010 }
        goto L_0x0003;
    L_0x0010:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        r0 = new com.google.android.gms.common.ConnectionResult;
        r2 = 15;
        r0.<init>(r2, r1);
        return r0;
    L_0x001f:
        r0 = r3.isConnected();
        if (r0 == 0) goto L_0x0028;
    L_0x0025:
        r0 = com.google.android.gms.common.ConnectionResult.zzfkr;
        return r0;
    L_0x0028:
        r0 = r3.f13958o;
        if (r0 == 0) goto L_0x002f;
    L_0x002c:
        r0 = r3.f13958o;
        return r0;
    L_0x002f:
        r0 = new com.google.android.gms.common.ConnectionResult;
        r2 = 13;
        r0.<init>(r2, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.ah.blockingConnect():com.google.android.gms.common.ConnectionResult");
    }

    public final com.google.android.gms.common.ConnectionResult blockingConnect(long r4, java.util.concurrent.TimeUnit r6) {
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
        r3 = this;
        r3.connect();
        r4 = r6.toNanos(r4);
    L_0x0007:
        r6 = r3.isConnecting();
        r0 = 0;
        if (r6 == 0) goto L_0x0035;
    L_0x000e:
        r1 = 0;
        r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r6 > 0) goto L_0x001f;
    L_0x0014:
        r3.disconnect();	 Catch:{ InterruptedException -> 0x0026 }
        r4 = new com.google.android.gms.common.ConnectionResult;	 Catch:{ InterruptedException -> 0x0026 }
        r5 = 14;	 Catch:{ InterruptedException -> 0x0026 }
        r4.<init>(r5, r0);	 Catch:{ InterruptedException -> 0x0026 }
        return r4;	 Catch:{ InterruptedException -> 0x0026 }
    L_0x001f:
        r6 = r3.f13950g;	 Catch:{ InterruptedException -> 0x0026 }
        r4 = r6.awaitNanos(r4);	 Catch:{ InterruptedException -> 0x0026 }
        goto L_0x0007;
    L_0x0026:
        r4 = java.lang.Thread.currentThread();
        r4.interrupt();
        r4 = new com.google.android.gms.common.ConnectionResult;
        r5 = 15;
        r4.<init>(r5, r0);
        return r4;
    L_0x0035:
        r4 = r3.isConnected();
        if (r4 == 0) goto L_0x003e;
    L_0x003b:
        r4 = com.google.android.gms.common.ConnectionResult.zzfkr;
        return r4;
    L_0x003e:
        r4 = r3.f13958o;
        if (r4 == 0) goto L_0x0045;
    L_0x0042:
        r4 = r3.f13958o;
        return r4;
    L_0x0045:
        r4 = new com.google.android.gms.common.ConnectionResult;
        r5 = 13;
        r4.<init>(r5, r0);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.ah.blockingConnect(long, java.util.concurrent.TimeUnit):com.google.android.gms.common.ConnectionResult");
    }

    public final void connect() {
        this.f13957n.connect();
    }

    public final void disconnect() {
        if (this.f13957n.disconnect()) {
            this.f13945b.clear();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f13957n);
        for (Api api : this.f13955l.keySet()) {
            printWriter.append(str).append(api.m8847d()).println(":");
            ((zze) this.f13944a.get(api.m8846c())).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Nullable
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        C2462b c = api.m8846c();
        if (this.f13944a.containsKey(c)) {
            if (((zze) this.f13944a.get(c)).isConnected()) {
                return ConnectionResult.zzfkr;
            }
            if (this.f13945b.containsKey(c)) {
                return (ConnectionResult) this.f13945b.get(c);
            }
        }
        return null;
    }

    public final boolean isConnected() {
        return this.f13957n instanceof C3800k;
    }

    public final boolean isConnecting() {
        return this.f13957n instanceof C3803n;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        this.f13949f.lock();
        try {
            this.f13957n.onConnected(bundle);
        } finally {
            this.f13949f.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
        this.f13949f.lock();
        try {
            this.f13957n.onConnectionSuspended(i);
        } finally {
            this.f13949f.unlock();
        }
    }

    public final void zza(@NonNull ConnectionResult connectionResult, @NonNull Api<?> api, boolean z) {
        this.f13949f.lock();
        try {
            this.f13957n.zza(connectionResult, api, z);
        } finally {
            this.f13949f.unlock();
        }
    }

    public final boolean zza(zzcu zzcu) {
        return false;
    }

    public final void zzags() {
    }

    public final void zzahk() {
        if (isConnected()) {
            ((C3800k) this.f13957n).m14380a();
        }
    }

    public final <A extends zzb, R extends Result, T extends ck<R, A>> T zzd(@NonNull T t) {
        t.m14231f();
        return this.f13957n.zzd(t);
    }

    public final <A extends zzb, T extends ck<? extends Result, A>> T zze(@NonNull T t) {
        t.m14231f();
        return this.f13957n.zze(t);
    }
}
