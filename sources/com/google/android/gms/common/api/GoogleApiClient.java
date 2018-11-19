package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.C2880a;
import android.view.View;
import com.google.android.gms.common.C3813b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions;
import com.google.android.gms.common.api.Api.C2462b;
import com.google.android.gms.common.api.Api.C2463c;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.internal.aa;
import com.google.android.gms.common.api.internal.ay;
import com.google.android.gms.common.api.internal.bv;
import com.google.android.gms.common.api.internal.ch;
import com.google.android.gms.common.api.internal.ck;
import com.google.android.gms.common.api.internal.cq;
import com.google.android.gms.common.api.internal.zzcu;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.internal.td;
import com.google.android.gms.internal.tg;
import com.google.android.gms.internal.zzcxd;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

public abstract class GoogleApiClient {
    /* renamed from: a */
    private static final Set<GoogleApiClient> f7437a = Collections.newSetFromMap(new WeakHashMap());

    public interface ConnectionCallbacks {
        void onConnected(@Nullable Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$a */
    public static final class C2464a {
        /* renamed from: a */
        private Account f7418a;
        /* renamed from: b */
        private final Set<Scope> f7419b = new HashSet();
        /* renamed from: c */
        private final Set<Scope> f7420c = new HashSet();
        /* renamed from: d */
        private int f7421d;
        /* renamed from: e */
        private View f7422e;
        /* renamed from: f */
        private String f7423f;
        /* renamed from: g */
        private String f7424g;
        /* renamed from: h */
        private final Map<Api<?>, ax> f7425h = new C2880a();
        /* renamed from: i */
        private final Context f7426i;
        /* renamed from: j */
        private final Map<Api<?>, ApiOptions> f7427j = new C2880a();
        /* renamed from: k */
        private ay f7428k;
        /* renamed from: l */
        private int f7429l = -1;
        /* renamed from: m */
        private OnConnectionFailedListener f7430m;
        /* renamed from: n */
        private Looper f7431n;
        /* renamed from: o */
        private C3813b f7432o = C3813b.m14425a();
        /* renamed from: p */
        private C3787a<? extends zzcxd, tg> f7433p = td.f16530a;
        /* renamed from: q */
        private final ArrayList<ConnectionCallbacks> f7434q = new ArrayList();
        /* renamed from: r */
        private final ArrayList<OnConnectionFailedListener> f7435r = new ArrayList();
        /* renamed from: s */
        private boolean f7436s = false;

        public C2464a(@NonNull Context context) {
            this.f7426i = context;
            this.f7431n = context.getMainLooper();
            this.f7423f = context.getPackageName();
            this.f7424g = context.getClass().getName();
        }

        /* renamed from: a */
        private final <O extends ApiOptions> void m8852a(Api<O> api, O o, Scope... scopeArr) {
            Set hashSet = new HashSet(api.m8844a().mo3559a(o));
            for (Object add : scopeArr) {
                hashSet.add(add);
            }
            this.f7425h.put(api, new ax(hashSet));
        }

        /* renamed from: a */
        public final C2464a m8853a(@NonNull Handler handler) {
            ad.m9046a((Object) handler, (Object) "Handler must not be null");
            this.f7431n = handler.getLooper();
            return this;
        }

        /* renamed from: a */
        public final C2464a m8854a(@NonNull Api<? extends NotRequiredOptions> api) {
            ad.m9046a((Object) api, (Object) "Api must not be null");
            this.f7427j.put(api, null);
            Collection a = api.m8844a().mo3559a(null);
            this.f7420c.addAll(a);
            this.f7419b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final <O extends HasOptions> C2464a m8855a(@NonNull Api<O> api, @NonNull O o) {
            ad.m9046a((Object) api, (Object) "Api must not be null");
            ad.m9046a((Object) o, (Object) "Null options are not permitted for this Api");
            this.f7427j.put(api, o);
            Collection a = api.m8844a().mo3559a(o);
            this.f7420c.addAll(a);
            this.f7419b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final C2464a m8856a(@NonNull Api<? extends NotRequiredOptions> api, Scope... scopeArr) {
            ad.m9046a((Object) api, (Object) "Api must not be null");
            this.f7427j.put(api, null);
            m8852a(api, null, scopeArr);
            return this;
        }

        /* renamed from: a */
        public final C2464a m8857a(@NonNull ConnectionCallbacks connectionCallbacks) {
            ad.m9046a((Object) connectionCallbacks, (Object) "Listener must not be null");
            this.f7434q.add(connectionCallbacks);
            return this;
        }

        /* renamed from: a */
        public final C2464a m8858a(@NonNull OnConnectionFailedListener onConnectionFailedListener) {
            ad.m9046a((Object) onConnectionFailedListener, (Object) "Listener must not be null");
            this.f7435r.add(onConnectionFailedListener);
            return this;
        }

        /* renamed from: a */
        public final av m8859a() {
            tg tgVar = tg.f28809a;
            if (this.f7427j.containsKey(td.f16531b)) {
                tgVar = (tg) this.f7427j.get(td.f16531b);
            }
            return new av(this.f7418a, this.f7419b, this.f7425h, this.f7421d, this.f7422e, this.f7423f, this.f7424g, tgVar);
        }

        /* renamed from: b */
        public final GoogleApiClient m8860b() {
            boolean z;
            ad.m9055b(this.f7427j.isEmpty() ^ true, "must call addApi() to add at least one API");
            av a = m8859a();
            Api api = null;
            Map f = a.m9114f();
            Map c2880a = new C2880a();
            Map c2880a2 = new C2880a();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f7427j.keySet().iterator();
            Object obj = null;
            while (it.hasNext()) {
                Api api2 = (Api) it.next();
                Object obj2 = r1.f7427j.get(api2);
                boolean z2 = f.get(api2) != null;
                c2880a.put(api2, Boolean.valueOf(z2));
                cq cqVar = new cq(api2, z2);
                arrayList.add(cqVar);
                C2463c b = api2.m8845b();
                C2463c c2463c = b;
                cq cqVar2 = cqVar;
                Map map = f;
                Api api3 = api2;
                Iterator it2 = it;
                zze a2 = b.mo3558a(r1.f7426i, r1.f7431n, a, obj2, cqVar2, cqVar2);
                c2880a2.put(api3.m8846c(), a2);
                if (c2463c.m8842a() == 1) {
                    obj = obj2 != null ? 1 : null;
                }
                if (a2.zzabj()) {
                    if (api != null) {
                        String d = api3.m8847d();
                        String d2 = api.m8847d();
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(d).length() + 21) + String.valueOf(d2).length());
                        stringBuilder.append(d);
                        stringBuilder.append(" cannot be used with ");
                        stringBuilder.append(d2);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    api = api3;
                }
                f = map;
                it = it2;
            }
            if (api == null) {
                z = true;
            } else if (obj != null) {
                d = api.m8847d();
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(d).length() + 82);
                stringBuilder2.append("With using ");
                stringBuilder2.append(d);
                stringBuilder2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                throw new IllegalStateException(stringBuilder2.toString());
            } else {
                z = true;
                ad.m9052a(r1.f7418a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.m8847d());
                ad.m9052a(r1.f7419b.equals(r1.f7420c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.m8847d());
            }
            av avVar = a;
            GoogleApiClient aaVar = new aa(r1.f7426i, new ReentrantLock(), r1.f7431n, avVar, r1.f7432o, r1.f7433p, c2880a, r1.f7434q, r1.f7435r, c2880a2, r1.f7429l, aa.m14232a(c2880a2.values(), z), arrayList, false);
            synchronized (GoogleApiClient.f7437a) {
                try {
                    GoogleApiClient.f7437a.add(aaVar);
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                    }
                }
            }
            if (r1.f7429l >= 0) {
                ch.m17229b(r1.f7428k).m17231a(r1.f7429l, aaVar, r1.f7430m);
            }
            return aaVar;
        }
    }

    /* renamed from: a */
    public static Set<GoogleApiClient> m8861a() {
        Set<GoogleApiClient> set;
        synchronized (f7437a) {
            set = f7437a;
        }
        return set;
    }

    @NonNull
    /* renamed from: a */
    public <C extends zze> C mo2490a(@NonNull C2462b<C> c2462b) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <A extends zzb, R extends Result, T extends ck<R, A>> T mo2491a(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo2492a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo2493a(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    /* renamed from: a */
    public void mo2494a(bv bvVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo2495a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public boolean mo2496a(@NonNull Api<?> api) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo2497a(zzcu zzcu) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Context mo2498b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <A extends zzb, T extends ck<? extends Result, A>> T mo2499b(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract void mo2500b(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    /* renamed from: b */
    public void mo2501b(bv bvVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public Looper mo2502c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo2503d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public abstract void mo2504e();

    /* renamed from: f */
    public abstract ConnectionResult mo2505f();

    /* renamed from: g */
    public abstract void mo2506g();

    /* renamed from: h */
    public abstract void mo2507h();

    /* renamed from: i */
    public abstract PendingResult<Status> mo2508i();

    /* renamed from: j */
    public abstract boolean mo2509j();

    /* renamed from: k */
    public abstract boolean mo2510k();
}
