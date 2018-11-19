package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C2490g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C2462b;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.zzan;
import com.google.android.gms.common.internal.zzbt;
import com.google.android.gms.internal.tg;
import com.google.android.gms.internal.zzcxd;
import com.google.android.gms.internal.zzcxq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.n */
public final class C3803n implements zzbh {
    /* renamed from: a */
    private final ah f12006a;
    /* renamed from: b */
    private final Lock f12007b;
    /* renamed from: c */
    private final Context f12008c;
    /* renamed from: d */
    private final C2490g f12009d;
    /* renamed from: e */
    private ConnectionResult f12010e;
    /* renamed from: f */
    private int f12011f;
    /* renamed from: g */
    private int f12012g = 0;
    /* renamed from: h */
    private int f12013h;
    /* renamed from: i */
    private final Bundle f12014i = new Bundle();
    /* renamed from: j */
    private final Set<C2462b> f12015j = new HashSet();
    /* renamed from: k */
    private zzcxd f12016k;
    /* renamed from: l */
    private boolean f12017l;
    /* renamed from: m */
    private boolean f12018m;
    /* renamed from: n */
    private boolean f12019n;
    /* renamed from: o */
    private zzan f12020o;
    /* renamed from: p */
    private boolean f12021p;
    /* renamed from: q */
    private boolean f12022q;
    /* renamed from: r */
    private final av f12023r;
    /* renamed from: s */
    private final Map<Api<?>, Boolean> f12024s;
    /* renamed from: t */
    private final C3787a<? extends zzcxd, tg> f12025t;
    /* renamed from: u */
    private ArrayList<Future<?>> f12026u = new ArrayList();

    public C3803n(ah ahVar, av avVar, Map<Api<?>, Boolean> map, C2490g c2490g, C3787a<? extends zzcxd, tg> c3787a, Lock lock, Context context) {
        this.f12006a = ahVar;
        this.f12023r = avVar;
        this.f12024s = map;
        this.f12009d = c2490g;
        this.f12025t = c3787a;
        this.f12007b = lock;
        this.f12008c = context;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m14384a(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.Api<?> r6, boolean r7) {
        /*
        r4 = this;
        r0 = r6.m8844a();
        r0 = r0.m8842a();
        r1 = 0;
        r2 = 1;
        if (r7 == 0) goto L_0x0024;
    L_0x000c:
        r7 = r5.hasResolution();
        if (r7 == 0) goto L_0x0014;
    L_0x0012:
        r7 = 1;
        goto L_0x0022;
    L_0x0014:
        r7 = r4.f12009d;
        r3 = r5.getErrorCode();
        r7 = r7.m9030c(r3);
        if (r7 == 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0012;
    L_0x0021:
        r7 = 0;
    L_0x0022:
        if (r7 == 0) goto L_0x002d;
    L_0x0024:
        r7 = r4.f12010e;
        if (r7 == 0) goto L_0x002c;
    L_0x0028:
        r7 = r4.f12011f;
        if (r0 >= r7) goto L_0x002d;
    L_0x002c:
        r1 = 1;
    L_0x002d:
        if (r1 == 0) goto L_0x0033;
    L_0x002f:
        r4.f12010e = r5;
        r4.f12011f = r0;
    L_0x0033:
        r7 = r4.f12006a;
        r7 = r7.f13945b;
        r6 = r6.m8846c();
        r7.put(r6, r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.n.a(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.Api, boolean):void");
    }

    /* renamed from: a */
    private final void m14388a(zzcxq zzcxq) {
        if (m14391a(0)) {
            ConnectionResult zzahf = zzcxq.zzahf();
            if (zzahf.isSuccess()) {
                zzbt zzbdi = zzcxq.zzbdi();
                zzahf = zzbdi.zzahf();
                if (zzahf.isSuccess()) {
                    this.f12019n = true;
                    this.f12020o = zzbdi.zzalp();
                    this.f12021p = zzbdi.zzalq();
                    this.f12022q = zzbdi.zzalr();
                    m14396b();
                    return;
                }
                String valueOf = String.valueOf(zzahf);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
                stringBuilder.append("Sign-in succeeded with resolve account failure: ");
                stringBuilder.append(valueOf);
                Log.wtf("GoogleApiClientConnecting", stringBuilder.toString(), new Exception());
                m14397b(zzahf);
            } else if (m14392a(zzahf)) {
                m14402d();
                m14396b();
            } else {
                m14397b(zzahf);
            }
        }
    }

    /* renamed from: a */
    private final void m14389a(boolean z) {
        if (this.f12016k != null) {
            if (this.f12016k.isConnected() && z) {
                this.f12016k.zzbdb();
            }
            this.f12016k.disconnect();
            this.f12020o = null;
        }
    }

    /* renamed from: a */
    private final boolean m14390a() {
        this.f12013h--;
        if (this.f12013h > 0) {
            return false;
        }
        ConnectionResult connectionResult;
        if (this.f12013h < 0) {
            Log.w("GoogleApiClientConnecting", this.f12006a.f13947d.m14266o());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            connectionResult = new ConnectionResult(8, null);
        } else if (this.f12010e == null) {
            return true;
        } else {
            this.f12006a.f13946c = this.f12011f;
            connectionResult = this.f12010e;
        }
        m14397b(connectionResult);
        return false;
    }

    /* renamed from: a */
    private final boolean m14391a(int i) {
        if (this.f12012g == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f12006a.f13947d.m14266o());
        String valueOf = String.valueOf(this);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
        stringBuilder.append("Unexpected callback in ");
        stringBuilder.append(valueOf);
        Log.w("GoogleApiClientConnecting", stringBuilder.toString());
        int i2 = this.f12013h;
        stringBuilder = new StringBuilder(33);
        stringBuilder.append("mRemainingConnections=");
        stringBuilder.append(i2);
        Log.w("GoogleApiClientConnecting", stringBuilder.toString());
        valueOf = C3803n.m14395b(this.f12012g);
        String b = C3803n.m14395b(i);
        stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(b).length());
        stringBuilder.append("GoogleApiClient connecting is in step ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" but received callback for step ");
        stringBuilder.append(b);
        Log.wtf("GoogleApiClientConnecting", stringBuilder.toString(), new Exception());
        m14397b(new ConnectionResult(8, null));
        return false;
    }

    /* renamed from: a */
    private final boolean m14392a(ConnectionResult connectionResult) {
        return this.f12017l && !connectionResult.hasResolution();
    }

    /* renamed from: b */
    private static String m14395b(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: b */
    private final void m14396b() {
        if (this.f12013h == 0) {
            if (!this.f12018m || this.f12019n) {
                ArrayList arrayList = new ArrayList();
                this.f12012g = 1;
                this.f12013h = this.f12006a.f13944a.size();
                for (C2462b c2462b : this.f12006a.f13944a.keySet()) {
                    if (!this.f12006a.f13945b.containsKey(c2462b)) {
                        arrayList.add((zze) this.f12006a.f13944a.get(c2462b));
                    } else if (m14390a()) {
                        m14400c();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f12026u.add(ak.m8933a().submit(new C3808t(this, arrayList)));
                }
            }
        }
    }

    /* renamed from: b */
    private final void m14397b(ConnectionResult connectionResult) {
        m14403e();
        m14389a(connectionResult.hasResolution() ^ 1);
        this.f12006a.m17176a(connectionResult);
        this.f12006a.f13948e.zzc(connectionResult);
    }

    /* renamed from: c */
    private final void m14400c() {
        this.f12006a.m17179b();
        ak.m8933a().execute(new C2478o(this));
        if (this.f12016k != null) {
            if (this.f12021p) {
                this.f12016k.zza(this.f12020o, this.f12022q);
            }
            m14389a(false);
        }
        for (C2462b c2462b : this.f12006a.f13945b.keySet()) {
            ((zze) this.f12006a.f13944a.get(c2462b)).disconnect();
        }
        this.f12006a.f13948e.zzj(this.f12014i.isEmpty() ? null : this.f12014i);
    }

    /* renamed from: d */
    private final void m14402d() {
        this.f12018m = false;
        this.f12006a.f13947d.f11880c = Collections.emptySet();
        for (C2462b c2462b : this.f12015j) {
            if (!this.f12006a.f13945b.containsKey(c2462b)) {
                this.f12006a.f13945b.put(c2462b, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: e */
    private final void m14403e() {
        ArrayList arrayList = this.f12026u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.f12026u.clear();
    }

    /* renamed from: f */
    private final Set<Scope> m14406f() {
        if (this.f12023r == null) {
            return Collections.emptySet();
        }
        Set<Scope> hashSet = new HashSet(this.f12023r.m9112d());
        Map f = this.f12023r.m9114f();
        for (Api api : f.keySet()) {
            if (!this.f12006a.f13945b.containsKey(api.m8846c())) {
                hashSet.addAll(((ax) f.get(api)).f7627a);
            }
        }
        return hashSet;
    }

    public final void begin() {
        this.f12006a.f13945b.clear();
        this.f12018m = false;
        this.f12010e = null;
        this.f12012g = 0;
        this.f12017l = true;
        this.f12019n = false;
        this.f12021p = false;
        Map hashMap = new HashMap();
        int i = 0;
        for (Api api : this.f12024s.keySet()) {
            zze zze = (zze) this.f12006a.f13944a.get(api.m8846c());
            i |= api.m8844a().m8842a() == 1 ? 1 : 0;
            boolean booleanValue = ((Boolean) this.f12024s.get(api)).booleanValue();
            if (zze.zzaay()) {
                this.f12018m = true;
                if (booleanValue) {
                    this.f12015j.add(api.m8846c());
                } else {
                    this.f12017l = false;
                }
            }
            hashMap.put(zze, new C3804p(this, api, booleanValue));
        }
        if (i != 0) {
            this.f12018m = false;
        }
        if (this.f12018m) {
            this.f12023r.m9109a(Integer.valueOf(System.identityHashCode(this.f12006a.f13947d)));
            OnConnectionFailedListener c3810w = new C3810w();
            this.f12016k = (zzcxd) this.f12025t.mo3558a(this.f12008c, this.f12006a.f13947d.mo2502c(), this.f12023r, this.f12023r.m9117i(), c3810w, c3810w);
        }
        this.f12013h = this.f12006a.f13944a.size();
        this.f12026u.add(ak.m8933a().submit(new C3805q(this, hashMap)));
    }

    public final void connect() {
    }

    public final boolean disconnect() {
        m14403e();
        m14389a(true);
        this.f12006a.m17176a(null);
        return true;
    }

    public final void onConnected(Bundle bundle) {
        if (m14391a(1)) {
            if (bundle != null) {
                this.f12014i.putAll(bundle);
            }
            if (m14390a()) {
                m14400c();
            }
        }
    }

    public final void onConnectionSuspended(int i) {
        m14397b(new ConnectionResult(8, null));
    }

    public final void zza(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (m14391a(1)) {
            m14384a(connectionResult, api, z);
            if (m14390a()) {
                m14400c();
            }
        }
    }

    public final <A extends zzb, R extends Result, T extends ck<R, A>> T zzd(T t) {
        this.f12006a.f13947d.f11878a.add(t);
        return t;
    }

    public final <A extends zzb, T extends ck<? extends Result, A>> T zze(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
