package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.C2880a;
import com.google.android.gms.common.C2490g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C2462b;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.internal.pg;
import com.google.android.gms.internal.tg;
import com.google.android.gms.internal.zzcxd;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C3793b implements zzcc {
    /* renamed from: a */
    private final Map<C2462b<?>, cv<?>> f11926a = new HashMap();
    /* renamed from: b */
    private final Map<C2462b<?>, cv<?>> f11927b = new HashMap();
    /* renamed from: c */
    private final Map<Api<?>, Boolean> f11928c;
    /* renamed from: d */
    private final al f11929d;
    /* renamed from: e */
    private final aa f11930e;
    /* renamed from: f */
    private final Lock f11931f;
    /* renamed from: g */
    private final Looper f11932g;
    /* renamed from: h */
    private final C2490g f11933h;
    /* renamed from: i */
    private final Condition f11934i;
    /* renamed from: j */
    private final av f11935j;
    /* renamed from: k */
    private final boolean f11936k;
    /* renamed from: l */
    private final boolean f11937l;
    /* renamed from: m */
    private final Queue<ck<?, ?>> f11938m = new LinkedList();
    /* renamed from: n */
    private boolean f11939n;
    /* renamed from: o */
    private Map<cg<?>, ConnectionResult> f11940o;
    /* renamed from: p */
    private Map<cg<?>, ConnectionResult> f11941p;
    /* renamed from: q */
    private C3796e f11942q;
    /* renamed from: r */
    private ConnectionResult f11943r;

    public C3793b(Context context, Lock lock, Looper looper, C2490g c2490g, Map<C2462b<?>, zze> map, av avVar, Map<Api<?>, Boolean> map2, C3787a<? extends zzcxd, tg> c3787a, ArrayList<cq> arrayList, aa aaVar, boolean z) {
        this.f11931f = lock;
        Looper looper2 = looper;
        this.f11932g = looper2;
        this.f11934i = lock.newCondition();
        this.f11933h = c2490g;
        this.f11930e = aaVar;
        this.f11928c = map2;
        av avVar2 = avVar;
        this.f11935j = avVar2;
        this.f11936k = z;
        Map hashMap = new HashMap();
        for (Api api : map2.keySet()) {
            hashMap.put(api.m8846c(), api);
        }
        Map hashMap2 = new HashMap();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            cq cqVar = (cq) obj;
            hashMap2.put(cqVar.f11971a, cqVar);
        }
        Object obj2 = null;
        Object obj3 = 1;
        Object obj4 = null;
        for (Entry entry : map.entrySet()) {
            Object obj5;
            Object obj6;
            Object obj7;
            Api api2 = (Api) hashMap.get(entry.getKey());
            zze zze = (zze) entry.getValue();
            if (zze.zzagg()) {
                if (((Boolean) r0.f11928c.get(api2)).booleanValue()) {
                    obj5 = obj3;
                    obj6 = obj4;
                } else {
                    obj5 = obj3;
                    obj6 = 1;
                }
                obj7 = 1;
            } else {
                obj7 = obj2;
                obj6 = obj4;
                obj5 = null;
            }
            cv cvVar = r1;
            zze zze2 = zze;
            Entry entry2 = entry;
            cv cvVar2 = new cv(context, api2, looper2, zze, (cq) hashMap2.get(api2), avVar2, c3787a);
            r0.f11926a.put((C2462b) entry2.getKey(), cvVar);
            if (zze2.zzaay()) {
                r0.f11927b.put((C2462b) entry2.getKey(), cvVar);
            }
            obj4 = obj6;
            obj3 = obj5;
            obj2 = obj7;
            looper2 = looper;
        }
        boolean z2 = obj2 != null && obj3 == null && obj4 == null;
        r0.f11937l = z2;
        r0.f11929d = al.m8936a();
    }

    @Nullable
    /* renamed from: a */
    private final ConnectionResult m14279a(@NonNull C2462b<?> c2462b) {
        this.f11931f.lock();
        try {
            cv cvVar = (cv) this.f11926a.get(c2462b);
            if (this.f11940o == null || cvVar == null) {
                this.f11931f.unlock();
                return null;
            }
            ConnectionResult connectionResult = (ConnectionResult) this.f11940o.get(cvVar.m8901b());
            return connectionResult;
        } finally {
            this.f11931f.unlock();
        }
    }

    /* renamed from: a */
    private final boolean m14283a() {
        this.f11931f.lock();
        try {
            if (this.f11939n) {
                if (this.f11936k) {
                    for (C2462b a : this.f11927b.keySet()) {
                        ConnectionResult a2 = m14279a(a);
                        if (a2 != null) {
                            if (!a2.isSuccess()) {
                            }
                        }
                    }
                    this.f11931f.unlock();
                    return true;
                }
            }
            this.f11931f.unlock();
            return false;
        } catch (Throwable th) {
            this.f11931f.unlock();
        }
    }

    /* renamed from: a */
    private final <T extends ck<? extends Result, ? extends zzb>> boolean m14286a(@NonNull T t) {
        C2462b g = t.mo3575g();
        ConnectionResult a = m14279a(g);
        if (a == null || a.getErrorCode() != 4) {
            return false;
        }
        t.zzu(new Status(4, null, this.f11929d.m8952a(((cv) this.f11926a.get(g)).m8901b(), System.identityHashCode(this.f11930e))));
        return true;
    }

    /* renamed from: a */
    private final boolean m14287a(cv<?> cvVar, ConnectionResult connectionResult) {
        return !connectionResult.isSuccess() && !connectionResult.hasResolution() && ((Boolean) this.f11928c.get(cvVar.m8895a())).booleanValue() && cvVar.mo2554g().zzagg() && this.f11933h.mo2568a(connectionResult.getErrorCode());
    }

    /* renamed from: b */
    private final void m14289b() {
        if (this.f11935j == null) {
            this.f11930e.f11880c = Collections.emptySet();
            return;
        }
        Set hashSet = new HashSet(this.f11935j.m9112d());
        Map f = this.f11935j.m9114f();
        for (Api api : f.keySet()) {
            ConnectionResult connectionResult = getConnectionResult(api);
            if (connectionResult != null && connectionResult.isSuccess()) {
                hashSet.addAll(((ax) f.get(api)).f7627a);
            }
        }
        this.f11930e.f11880c = hashSet;
    }

    /* renamed from: c */
    private final void m14292c() {
        while (!this.f11938m.isEmpty()) {
            zze((ck) this.f11938m.remove());
        }
        this.f11930e.zzj(null);
    }

    @Nullable
    /* renamed from: d */
    private final ConnectionResult m14293d() {
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i = 0;
        int i2 = 0;
        for (cv cvVar : this.f11926a.values()) {
            Api a = cvVar.m8895a();
            ConnectionResult connectionResult3 = (ConnectionResult) this.f11940o.get(cvVar.m8901b());
            if (!connectionResult3.isSuccess() && (!((Boolean) this.f11928c.get(a)).booleanValue() || connectionResult3.hasResolution() || this.f11933h.mo2568a(connectionResult3.getErrorCode()))) {
                int a2;
                if (connectionResult3.getErrorCode() == 4 && this.f11936k) {
                    a2 = a.m8844a().m8842a();
                    if (connectionResult2 == null || i2 > a2) {
                        connectionResult2 = connectionResult3;
                        i2 = a2;
                    }
                } else {
                    a2 = a.m8844a().m8842a();
                    if (connectionResult == null || i > a2) {
                        connectionResult = connectionResult3;
                        i = a2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
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
        r0 = r3.f11934i;	 Catch:{ InterruptedException -> 0x0010 }
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
        r0 = r3.f11943r;
        if (r0 == 0) goto L_0x002f;
    L_0x002c:
        r0 = r3.f11943r;
        return r0;
    L_0x002f:
        r0 = new com.google.android.gms.common.ConnectionResult;
        r2 = 13;
        r0.<init>(r2, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.b.blockingConnect():com.google.android.gms.common.ConnectionResult");
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
        r6 = r3.f11934i;	 Catch:{ InterruptedException -> 0x0026 }
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
        r4 = r3.f11943r;
        if (r4 == 0) goto L_0x0045;
    L_0x0042:
        r4 = r3.f11943r;
        return r4;
    L_0x0045:
        r4 = new com.google.android.gms.common.ConnectionResult;
        r5 = 13;
        r4.<init>(r5, r0);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.b.blockingConnect(long, java.util.concurrent.TimeUnit):com.google.android.gms.common.ConnectionResult");
    }

    public final void connect() {
        this.f11931f.lock();
        try {
            if (!this.f11939n) {
                this.f11939n = true;
                this.f11940o = null;
                this.f11941p = null;
                this.f11942q = null;
                this.f11943r = null;
                this.f11929d.m8964d();
                this.f11929d.m8955a(this.f11926a.values()).a(new pg(this.f11932g), new C3795d());
            }
            this.f11931f.unlock();
        } catch (Throwable th) {
            this.f11931f.unlock();
        }
    }

    public final void disconnect() {
        this.f11931f.lock();
        try {
            this.f11939n = false;
            this.f11940o = null;
            this.f11941p = null;
            if (this.f11942q != null) {
                this.f11942q.m14368a();
                this.f11942q = null;
            }
            this.f11943r = null;
            while (!this.f11938m.isEmpty()) {
                ck ckVar = (ck) this.f11938m.remove();
                ckVar.m14225a(null);
                ckVar.mo2485a();
            }
            this.f11934i.signalAll();
        } finally {
            this.f11931f.unlock();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Nullable
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        return m14279a(api.m8846c());
    }

    public final boolean isConnected() {
        this.f11931f.lock();
        try {
            boolean z = this.f11940o != null && this.f11943r == null;
            this.f11931f.unlock();
            return z;
        } catch (Throwable th) {
            this.f11931f.unlock();
        }
    }

    public final boolean isConnecting() {
        this.f11931f.lock();
        try {
            boolean z = this.f11940o == null && this.f11939n;
            this.f11931f.unlock();
            return z;
        } catch (Throwable th) {
            this.f11931f.unlock();
        }
    }

    public final boolean zza(zzcu zzcu) {
        this.f11931f.lock();
        try {
            if (!this.f11939n || m14283a()) {
                this.f11931f.unlock();
                return false;
            }
            this.f11929d.m8964d();
            this.f11942q = new C3796e(this, zzcu);
            this.f11929d.m8955a(this.f11927b.values()).a(new pg(this.f11932g), this.f11942q);
            return true;
        } finally {
            this.f11931f.unlock();
        }
    }

    public final void zzags() {
        this.f11931f.lock();
        try {
            this.f11929d.m8965e();
            if (this.f11942q != null) {
                this.f11942q.m14368a();
                this.f11942q = null;
            }
            if (this.f11941p == null) {
                this.f11941p = new C2880a(this.f11927b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (cv b : this.f11927b.values()) {
                this.f11941p.put(b.m8901b(), connectionResult);
            }
            if (this.f11940o != null) {
                this.f11940o.putAll(this.f11941p);
            }
            this.f11931f.unlock();
        } catch (Throwable th) {
            this.f11931f.unlock();
        }
    }

    public final void zzahk() {
    }

    public final <A extends zzb, R extends Result, T extends ck<R, A>> T zzd(@NonNull T t) {
        if (this.f11936k && m14286a((ck) t)) {
            return t;
        }
        if (isConnected()) {
            this.f11930e.f11882e.m8986a(t);
            return ((cv) this.f11926a.get(t.mo3575g())).m8897a((ck) t);
        }
        this.f11938m.add(t);
        return t;
    }

    public final <A extends zzb, T extends ck<? extends Result, A>> T zze(@NonNull T t) {
        C2462b g = t.mo3575g();
        if (this.f11936k && m14286a((ck) t)) {
            return t;
        }
        this.f11930e.f11882e.m8986a(t);
        return ((cv) this.f11926a.get(g)).m8902b((ck) t);
    }
}
