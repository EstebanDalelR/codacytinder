package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.C2490g;
import com.google.android.gms.common.C3813b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C2462b;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.C2464a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2498f;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.internal.om;
import com.google.android.gms.internal.tg;
import com.google.android.gms.internal.zzcxd;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class aa extends GoogleApiClient implements zzcd {
    /* renamed from: a */
    final Queue<ck<?, ?>> f11878a = new LinkedList();
    /* renamed from: b */
    final Map<C2462b<?>, zze> f11879b;
    /* renamed from: c */
    Set<Scope> f11880c = new HashSet();
    /* renamed from: d */
    Set<bv> f11881d = null;
    /* renamed from: e */
    final by f11882e;
    /* renamed from: f */
    private final Lock f11883f;
    /* renamed from: g */
    private boolean f11884g;
    /* renamed from: h */
    private final C2498f f11885h;
    /* renamed from: i */
    private zzcc f11886i = null;
    /* renamed from: j */
    private final int f11887j;
    /* renamed from: k */
    private final Context f11888k;
    /* renamed from: l */
    private final Looper f11889l;
    /* renamed from: m */
    private volatile boolean f11890m;
    /* renamed from: n */
    private long f11891n = 120000;
    /* renamed from: o */
    private long f11892o = 5000;
    /* renamed from: p */
    private final af f11893p;
    /* renamed from: q */
    private final C3813b f11894q;
    /* renamed from: r */
    private zzbx f11895r;
    /* renamed from: s */
    private av f11896s;
    /* renamed from: t */
    private Map<Api<?>, Boolean> f11897t;
    /* renamed from: u */
    private C3787a<? extends zzcxd, tg> f11898u;
    /* renamed from: v */
    private final be f11899v = new be();
    /* renamed from: w */
    private final ArrayList<cq> f11900w;
    /* renamed from: x */
    private Integer f11901x = null;
    /* renamed from: y */
    private final zzaf f11902y = new ab(this);

    public aa(Context context, Lock lock, Looper looper, av avVar, C3813b c3813b, C3787a<? extends zzcxd, tg> c3787a, Map<Api<?>, Boolean> map, List<ConnectionCallbacks> list, List<OnConnectionFailedListener> list2, Map<C2462b<?>, zze> map2, int i, int i2, ArrayList<cq> arrayList, boolean z) {
        Looper looper2 = looper;
        this.f11888k = context;
        this.f11883f = lock;
        this.f11884g = false;
        this.f11885h = new C2498f(looper2, this.f11902y);
        this.f11889l = looper2;
        this.f11893p = new af(this, looper2);
        this.f11894q = c3813b;
        this.f11887j = i;
        if (this.f11887j >= 0) {
            r0.f11901x = Integer.valueOf(i2);
        }
        r0.f11897t = map;
        r0.f11879b = map2;
        r0.f11900w = arrayList;
        r0.f11882e = new by(r0.f11879b);
        for (ConnectionCallbacks a : list) {
            r0.f11885h.m9141a(a);
        }
        for (OnConnectionFailedListener a2 : list2) {
            r0.f11885h.m9142a(a2);
        }
        r0.f11896s = avVar;
        r0.f11898u = c3787a;
    }

    /* renamed from: a */
    public static int m14232a(Iterable<zze> iterable, boolean z) {
        Object obj = null;
        Object obj2 = null;
        for (zze zze : iterable) {
            if (zze.zzaay()) {
                obj = 1;
            }
            if (zze.zzabj()) {
                obj2 = 1;
            }
        }
        return obj != null ? (obj2 == null || !z) ? 1 : 2 : 3;
    }

    /* renamed from: a */
    private final void m14233a(GoogleApiClient googleApiClient, bp bpVar, boolean z) {
        om.f16373c.zzd(googleApiClient).mo2487a(new ae(this, bpVar, z, googleApiClient));
    }

    /* renamed from: b */
    private final void m14236b(int i) {
        if (this.f11901x == null) {
            this.f11901x = Integer.valueOf(i);
        } else if (this.f11901x.intValue() != i) {
            String c = m14239c(i);
            String c2 = m14239c(this.f11901x.intValue());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(c).length() + 51) + String.valueOf(c2).length());
            stringBuilder.append("Cannot use sign-in mode: ");
            stringBuilder.append(c);
            stringBuilder.append(". Mode was already set to ");
            stringBuilder.append(c2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (this.f11886i == null) {
            Object obj = null;
            Object obj2 = null;
            for (zze zze : this.f11879b.values()) {
                if (zze.zzaay()) {
                    obj = 1;
                }
                if (zze.zzabj()) {
                    obj2 = 1;
                }
            }
            switch (this.f11901x.intValue()) {
                case 1:
                    if (obj == null) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (obj2 != null) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (obj != null) {
                        if (this.f11884g) {
                            this.f11886i = new C3793b(this.f11888k, this.f11883f, this.f11889l, this.f11894q, this.f11879b, this.f11896s, this.f11897t, this.f11898u, this.f11900w, this, true);
                            return;
                        } else {
                            this.f11886i = cr.m14345a(this.f11888k, this, this.f11883f, this.f11889l, this.f11894q, this.f11879b, this.f11896s, this.f11897t, this.f11898u, this.f11900w);
                            return;
                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            if (this.f11884g && obj2 == null) {
                this.f11886i = new C3793b(this.f11888k, this.f11883f, this.f11889l, this.f11894q, this.f11879b, this.f11896s, this.f11897t, this.f11898u, this.f11900w, this, false);
            } else {
                this.f11886i = new ah(this.f11888k, this, this.f11883f, this.f11889l, this.f11894q, this.f11879b, this.f11896s, this.f11897t, this.f11898u, this.f11900w, this);
            }
        }
    }

    /* renamed from: c */
    private static String m14239c(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: p */
    private final void m14240p() {
        this.f11885h.m9143b();
        this.f11886i.connect();
    }

    /* renamed from: q */
    private final void m14241q() {
        this.f11883f.lock();
        try {
            if (this.f11890m) {
                m14240p();
            }
            this.f11883f.unlock();
        } catch (Throwable th) {
            this.f11883f.unlock();
        }
    }

    /* renamed from: r */
    private final void m14242r() {
        this.f11883f.lock();
        try {
            if (m14264m()) {
                m14240p();
            }
            this.f11883f.unlock();
        } catch (Throwable th) {
            this.f11883f.unlock();
        }
    }

    @NonNull
    /* renamed from: a */
    public final <C extends zze> C mo2490a(@NonNull C2462b<C> c2462b) {
        Object obj = (zze) this.f11879b.get(c2462b);
        ad.m9046a(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    /* renamed from: a */
    public final <A extends zzb, R extends Result, T extends ck<R, A>> T mo2491a(@NonNull T t) {
        ad.m9055b(t.mo3575g() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f11879b.containsKey(t.mo3575g());
        String d = t.m17241h() != null ? t.m17241h().m8847d() : "the API";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(d).length() + 65);
        stringBuilder.append("GoogleApiClient is not configured to use ");
        stringBuilder.append(d);
        stringBuilder.append(" required for this call.");
        ad.m9055b(containsKey, stringBuilder.toString());
        this.f11883f.lock();
        try {
            if (this.f11886i == null) {
                this.f11878a.add(t);
            } else {
                t = this.f11886i.zzd(t);
            }
            this.f11883f.unlock();
            return t;
        } catch (Throwable th) {
            this.f11883f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo2492a(int i) {
        this.f11883f.lock();
        boolean z = true;
        if (!(i == 3 || i == 1)) {
            if (i != 2) {
                z = false;
            }
        }
        try {
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Illegal sign-in mode: ");
            stringBuilder.append(i);
            ad.m9055b(z, stringBuilder.toString());
            m14236b(i);
            m14240p();
        } finally {
            this.f11883f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo2493a(@NonNull OnConnectionFailedListener onConnectionFailedListener) {
        this.f11885h.m9142a(onConnectionFailedListener);
    }

    /* renamed from: a */
    public final void mo2494a(bv bvVar) {
        this.f11883f.lock();
        try {
            if (this.f11881d == null) {
                this.f11881d = new HashSet();
            }
            this.f11881d.add(bvVar);
        } finally {
            this.f11883f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo2495a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f11888k);
        printWriter.append(str).append("mResuming=").print(this.f11890m);
        printWriter.append(" mWorkQueue.size()=").print(this.f11878a.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f11882e.f7512b.size());
        if (this.f11886i != null) {
            this.f11886i.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public final boolean mo2496a(@NonNull Api<?> api) {
        return this.f11879b.containsKey(api.m8846c());
    }

    /* renamed from: a */
    public final boolean mo2497a(zzcu zzcu) {
        return this.f11886i != null && this.f11886i.zza(zzcu);
    }

    /* renamed from: b */
    public final Context mo2498b() {
        return this.f11888k;
    }

    /* renamed from: b */
    public final <A extends zzb, T extends ck<? extends Result, A>> T mo2499b(@NonNull T t) {
        ad.m9055b(t.mo3575g() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f11879b.containsKey(t.mo3575g());
        String d = t.m17241h() != null ? t.m17241h().m8847d() : "the API";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(d).length() + 65);
        stringBuilder.append("GoogleApiClient is not configured to use ");
        stringBuilder.append(d);
        stringBuilder.append(" required for this call.");
        ad.m9055b(containsKey, stringBuilder.toString());
        this.f11883f.lock();
        try {
            if (this.f11886i == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f11890m) {
                this.f11878a.add(t);
                while (!this.f11878a.isEmpty()) {
                    ck ckVar = (ck) this.f11878a.remove();
                    this.f11882e.m8986a(ckVar);
                    ckVar.zzu(Status.zzfnk);
                }
            } else {
                t = this.f11886i.zze(t);
            }
            this.f11883f.unlock();
            return t;
        } catch (Throwable th) {
            this.f11883f.unlock();
        }
    }

    /* renamed from: b */
    public final void mo2500b(@NonNull OnConnectionFailedListener onConnectionFailedListener) {
        this.f11885h.m9144b(onConnectionFailedListener);
    }

    /* renamed from: b */
    public final void mo2501b(bv bvVar) {
        this.f11883f.lock();
        try {
            String str;
            String str2;
            Throwable exception;
            if (this.f11881d == null) {
                str = "GoogleApiClientImpl";
                str2 = "Attempted to remove pending transform when no transforms are registered.";
                exception = new Exception();
            } else if (this.f11881d.remove(bvVar)) {
                if (!m14265n()) {
                    this.f11886i.zzahk();
                }
                this.f11883f.unlock();
            } else {
                str = "GoogleApiClientImpl";
                str2 = "Failed to remove pending transform - this may lead to memory leaks!";
                exception = new Exception();
            }
            Log.wtf(str, str2, exception);
            this.f11883f.unlock();
        } catch (Throwable th) {
            this.f11883f.unlock();
        }
    }

    /* renamed from: c */
    public final Looper mo2502c() {
        return this.f11889l;
    }

    /* renamed from: d */
    public final void mo2503d() {
        if (this.f11886i != null) {
            this.f11886i.zzags();
        }
    }

    /* renamed from: e */
    public final void mo2504e() {
        this.f11883f.lock();
        try {
            boolean z = false;
            if (this.f11887j >= 0) {
                if (this.f11901x != null) {
                    z = true;
                }
                ad.m9051a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f11901x == null) {
                this.f11901x = Integer.valueOf(m14232a(this.f11879b.values(), false));
            } else if (this.f11901x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo2492a(this.f11901x.intValue());
        } finally {
            this.f11883f.unlock();
        }
    }

    /* renamed from: f */
    public final ConnectionResult mo2505f() {
        boolean z = true;
        ad.m9051a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f11883f.lock();
        try {
            if (this.f11887j >= 0) {
                if (this.f11901x == null) {
                    z = false;
                }
                ad.m9051a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f11901x == null) {
                this.f11901x = Integer.valueOf(m14232a(this.f11879b.values(), false));
            } else if (this.f11901x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m14236b(this.f11901x.intValue());
            this.f11885h.m9143b();
            ConnectionResult blockingConnect = this.f11886i.blockingConnect();
            return blockingConnect;
        } finally {
            this.f11883f.unlock();
        }
    }

    /* renamed from: g */
    public final void mo2506g() {
        this.f11883f.lock();
        try {
            this.f11882e.m8985a();
            if (this.f11886i != null) {
                this.f11886i.disconnect();
            }
            this.f11899v.m8977a();
            for (ck ckVar : this.f11878a) {
                ckVar.m14225a(null);
                ckVar.mo2485a();
            }
            this.f11878a.clear();
            if (this.f11886i != null) {
                m14264m();
                this.f11885h.m9137a();
            }
            this.f11883f.unlock();
        } catch (Throwable th) {
            this.f11883f.unlock();
        }
    }

    /* renamed from: h */
    public final void mo2507h() {
        mo2506g();
        mo2504e();
    }

    /* renamed from: i */
    public final PendingResult<Status> mo2508i() {
        ad.m9051a(mo2509j(), (Object) "GoogleApiClient is not connected yet.");
        ad.m9051a(this.f11901x.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        PendingResult<Status> bpVar = new bp(this);
        if (this.f11879b.containsKey(om.f16371a)) {
            m14233a(this, bpVar, false);
            return bpVar;
        }
        AtomicReference atomicReference = new AtomicReference();
        GoogleApiClient b = new C2464a(this.f11888k).m8854a(om.f16372b).m8857a(new ac(this, atomicReference, bpVar)).m8858a(new ad(this, bpVar)).m8853a(this.f11893p).m8860b();
        atomicReference.set(b);
        b.mo2504e();
        return bpVar;
    }

    /* renamed from: j */
    public final boolean mo2509j() {
        return this.f11886i != null && this.f11886i.isConnected();
    }

    /* renamed from: k */
    public final boolean mo2510k() {
        return this.f11886i != null && this.f11886i.isConnecting();
    }

    /* renamed from: m */
    final boolean m14264m() {
        if (!this.f11890m) {
            return false;
        }
        this.f11890m = false;
        this.f11893p.removeMessages(2);
        this.f11893p.removeMessages(1);
        if (this.f11895r != null) {
            this.f11895r.m9013a();
            this.f11895r = null;
        }
        return true;
    }

    /* renamed from: n */
    final boolean m14265n() {
        this.f11883f.lock();
        try {
            if (this.f11881d == null) {
                return false;
            }
            boolean isEmpty = this.f11881d.isEmpty() ^ 1;
            this.f11883f.unlock();
            return isEmpty;
        } finally {
            this.f11883f.unlock();
        }
    }

    /* renamed from: o */
    final String m14266o() {
        Writer stringWriter = new StringWriter();
        mo2495a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final void zzc(ConnectionResult connectionResult) {
        if (!C2490g.m9022b(this.f11888k, connectionResult.getErrorCode())) {
            m14264m();
        }
        if (!this.f11890m) {
            this.f11885h.m9140a(connectionResult);
            this.f11885h.m9137a();
        }
    }

    public final void zzf(int i, boolean z) {
        if (!(i != 1 || z || this.f11890m)) {
            this.f11890m = true;
            if (this.f11895r == null) {
                this.f11895r = C3813b.m14424a(this.f11888k.getApplicationContext(), new ag(this));
            }
            this.f11893p.sendMessageDelayed(this.f11893p.obtainMessage(1), this.f11891n);
            this.f11893p.sendMessageDelayed(this.f11893p.obtainMessage(2), this.f11892o);
        }
        this.f11882e.m8987b();
        this.f11885h.m9138a(i);
        this.f11885h.m9137a();
        if (i == 2) {
            m14240p();
        }
    }

    public final void zzj(Bundle bundle) {
        while (!this.f11878a.isEmpty()) {
            mo2499b((ck) this.f11878a.remove());
        }
        this.f11885h.m9139a(bundle);
    }
}
