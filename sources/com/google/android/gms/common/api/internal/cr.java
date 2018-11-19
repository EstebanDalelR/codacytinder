package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.C2880a;
import android.util.Log;
import com.google.android.gms.common.C2490g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C2462b;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.internal.tg;
import com.google.android.gms.internal.zzcxd;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

final class cr implements zzcc {
    /* renamed from: a */
    private final Context f11974a;
    /* renamed from: b */
    private final aa f11975b;
    /* renamed from: c */
    private final Looper f11976c;
    /* renamed from: d */
    private final ah f11977d;
    /* renamed from: e */
    private final ah f11978e;
    /* renamed from: f */
    private final Map<C2462b<?>, ah> f11979f;
    /* renamed from: g */
    private final Set<zzcu> f11980g = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: h */
    private final zze f11981h;
    /* renamed from: i */
    private Bundle f11982i;
    /* renamed from: j */
    private ConnectionResult f11983j = null;
    /* renamed from: k */
    private ConnectionResult f11984k = null;
    /* renamed from: l */
    private boolean f11985l = false;
    /* renamed from: m */
    private final Lock f11986m;
    /* renamed from: n */
    private int f11987n = 0;

    private cr(Context context, aa aaVar, Lock lock, Looper looper, C2490g c2490g, Map<C2462b<?>, zze> map, Map<C2462b<?>, zze> map2, av avVar, C3787a<? extends zzcxd, tg> c3787a, zze zze, ArrayList<cq> arrayList, ArrayList<cq> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        Context context2 = context;
        this.f11974a = context2;
        this.f11975b = aaVar;
        Lock lock2 = lock;
        this.f11986m = lock2;
        Looper looper2 = looper;
        this.f11976c = looper2;
        this.f11981h = zze;
        Context context3 = context2;
        Lock lock3 = lock2;
        C2490g c2490g2 = c2490g;
        ah ahVar = r3;
        ah ahVar2 = new ah(context3, this.f11975b, lock3, looper2, c2490g2, map2, null, map4, null, arrayList2, new ct());
        this.f11977d = ahVar;
        this.f11978e = new ah(context3, this.f11975b, lock3, looper, c2490g2, map, avVar, map3, c3787a, arrayList, new cu());
        Map c2880a = new C2880a();
        for (C2462b put : map2.keySet()) {
            c2880a.put(put, r0.f11977d);
        }
        for (C2462b put2 : map.keySet()) {
            c2880a.put(put2, r0.f11978e);
        }
        r0.f11979f = Collections.unmodifiableMap(c2880a);
    }

    /* renamed from: a */
    public static cr m14345a(Context context, aa aaVar, Lock lock, Looper looper, C2490g c2490g, Map<C2462b<?>, zze> map, av avVar, Map<Api<?>, Boolean> map2, C3787a<? extends zzcxd, tg> c3787a, ArrayList<cq> arrayList) {
        Map<Api<?>, Boolean> map3 = map2;
        Map c2880a = new C2880a();
        Map c2880a2 = new C2880a();
        zze zze = null;
        for (Entry entry : map.entrySet()) {
            zze zze2 = (zze) entry.getValue();
            if (zze2.zzabj()) {
                zze = zze2;
            }
            if (zze2.zzaay()) {
                c2880a.put((C2462b) entry.getKey(), zze2);
            } else {
                c2880a2.put((C2462b) entry.getKey(), zze2);
            }
        }
        ad.m9051a(c2880a.isEmpty() ^ 1, (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        Map c2880a3 = new C2880a();
        Map c2880a4 = new C2880a();
        for (Api api : map2.keySet()) {
            C2462b c = api.m8846c();
            if (c2880a.containsKey(c)) {
                c2880a3.put(api, (Boolean) map3.get(api));
            } else if (c2880a2.containsKey(c)) {
                c2880a4.put(api, (Boolean) map3.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            cq cqVar = (cq) obj;
            if (c2880a3.containsKey(cqVar.f11971a)) {
                arrayList2.add(cqVar);
            } else if (c2880a4.containsKey(cqVar.f11971a)) {
                arrayList3.add(cqVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new cr(context, aaVar, lock, looper, c2490g, c2880a, c2880a2, avVar, c3787a, zze, arrayList2, arrayList3, c2880a3, c2880a4);
    }

    /* renamed from: a */
    private final void m14347a() {
        if (m14358b(this.f11983j)) {
            if (!m14358b(this.f11984k)) {
                if (!m14359c()) {
                    if (this.f11984k != null) {
                        if (this.f11987n == 1) {
                            m14356b();
                            return;
                        }
                        m14350a(this.f11984k);
                        this.f11977d.disconnect();
                        return;
                    }
                }
            }
            switch (this.f11987n) {
                case 1:
                    break;
                case 2:
                    this.f11975b.zzj(this.f11982i);
                    break;
                default:
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    break;
            }
            m14356b();
            this.f11987n = 0;
        } else if (this.f11983j != null && m14358b(this.f11984k)) {
            this.f11978e.disconnect();
            m14350a(this.f11983j);
        } else if (!(this.f11983j == null || this.f11984k == null)) {
            ConnectionResult connectionResult = this.f11983j;
            if (this.f11978e.f13946c < this.f11977d.f13946c) {
                connectionResult = this.f11984k;
            }
            m14350a(connectionResult);
        }
    }

    /* renamed from: a */
    private final void m14348a(int i, boolean z) {
        this.f11975b.zzf(i, z);
        this.f11984k = null;
        this.f11983j = null;
    }

    /* renamed from: a */
    private final void m14349a(Bundle bundle) {
        if (this.f11982i == null) {
            this.f11982i = bundle;
            return;
        }
        if (bundle != null) {
            this.f11982i.putAll(bundle);
        }
    }

    /* renamed from: a */
    private final void m14350a(ConnectionResult connectionResult) {
        switch (this.f11987n) {
            case 1:
                break;
            case 2:
                this.f11975b.zzc(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        m14356b();
        this.f11987n = 0;
    }

    /* renamed from: a */
    private final boolean m14353a(ck<? extends Result, ? extends zzb> ckVar) {
        C2462b g = ckVar.mo3575g();
        ad.m9055b(this.f11979f.containsKey(g), "GoogleApiClient is not configured to use the API required for this call.");
        return ((ah) this.f11979f.get(g)).equals(this.f11978e);
    }

    /* renamed from: b */
    private final void m14356b() {
        for (zzcu zzabi : this.f11980g) {
            zzabi.zzabi();
        }
        this.f11980g.clear();
    }

    /* renamed from: b */
    private static boolean m14358b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    /* renamed from: c */
    private final boolean m14359c() {
        return this.f11984k != null && this.f11984k.getErrorCode() == 4;
    }

    @Nullable
    /* renamed from: d */
    private final PendingIntent m14361d() {
        return this.f11981h == null ? null : PendingIntent.getActivity(this.f11974a, System.identityHashCode(this.f11975b), this.f11981h.getSignInIntent(), 134217728);
    }

    public final ConnectionResult blockingConnect() {
        throw new UnsupportedOperationException();
    }

    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void connect() {
        this.f11987n = 2;
        this.f11985l = false;
        this.f11984k = null;
        this.f11983j = null;
        this.f11977d.connect();
        this.f11978e.connect();
    }

    public final void disconnect() {
        this.f11984k = null;
        this.f11983j = null;
        this.f11987n = 0;
        this.f11977d.disconnect();
        this.f11978e.disconnect();
        m14356b();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f11978e.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f11977d.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Nullable
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        return ((ah) this.f11979f.get(api.m8846c())).equals(this.f11978e) ? m14359c() ? new ConnectionResult(4, m14361d()) : this.f11978e.getConnectionResult(api) : this.f11977d.getConnectionResult(api);
    }

    public final boolean isConnected() {
        this.f11986m.lock();
        try {
            boolean z = true;
            if (this.f11977d.isConnected()) {
                if (!(this.f11978e.isConnected() || m14359c())) {
                    if (this.f11987n == 1) {
                    }
                }
                this.f11986m.unlock();
                return z;
            }
            z = false;
            this.f11986m.unlock();
            return z;
        } catch (Throwable th) {
            this.f11986m.unlock();
        }
    }

    public final boolean isConnecting() {
        this.f11986m.lock();
        try {
            boolean z = this.f11987n == 2;
            this.f11986m.unlock();
            return z;
        } catch (Throwable th) {
            this.f11986m.unlock();
        }
    }

    public final boolean zza(zzcu zzcu) {
        boolean z;
        this.f11986m.lock();
        try {
            if ((isConnecting() || isConnected()) && !this.f11978e.isConnected()) {
                this.f11980g.add(zzcu);
                z = true;
                if (this.f11987n == 0) {
                    this.f11987n = 1;
                }
                this.f11984k = null;
                this.f11978e.connect();
                return z;
            }
            this.f11986m.unlock();
            return false;
        } finally {
            z = this.f11986m;
            z.unlock();
        }
    }

    public final void zzags() {
        this.f11986m.lock();
        try {
            boolean isConnecting = isConnecting();
            this.f11978e.disconnect();
            this.f11984k = new ConnectionResult(4);
            if (isConnecting) {
                new Handler(this.f11976c).post(new cs(this));
            } else {
                m14356b();
            }
            this.f11986m.unlock();
        } catch (Throwable th) {
            this.f11986m.unlock();
        }
    }

    public final void zzahk() {
        this.f11977d.zzahk();
        this.f11978e.zzahk();
    }

    public final <A extends zzb, R extends Result, T extends ck<R, A>> T zzd(@NonNull T t) {
        if (!m14353a((ck) t)) {
            return this.f11977d.zzd(t);
        }
        if (!m14359c()) {
            return this.f11978e.zzd(t);
        }
        t.zzu(new Status(4, null, m14361d()));
        return t;
    }

    public final <A extends zzb, T extends ck<? extends Result, A>> T zze(@NonNull T t) {
        if (!m14353a((ck) t)) {
            return this.f11977d.zze(t);
        }
        if (!m14359c()) {
            return this.f11978e.zze(t);
        }
        t.zzu(new Status(4, null, m14361d()));
        return t;
    }
}
