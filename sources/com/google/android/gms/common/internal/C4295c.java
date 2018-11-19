package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.C3813b;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.c */
public abstract class C4295c<T extends IInterface> extends al<T> implements zze, zzaf {
    /* renamed from: d */
    private final av f13991d;
    /* renamed from: e */
    private final Set<Scope> f13992e;
    /* renamed from: f */
    private final Account f13993f;

    protected C4295c(Context context, Looper looper, int i, av avVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, C2499g.m9145a(context), C3813b.m14425a(), i, avVar, (ConnectionCallbacks) ad.m9045a((Object) connectionCallbacks), (OnConnectionFailedListener) ad.m9045a((Object) onConnectionFailedListener));
    }

    private C4295c(Context context, Looper looper, C2499g c2499g, C3813b c3813b, int i, av avVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        al alVar = this;
        ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        super(context, looper, c2499g, c3813b, i, connectionCallbacks2 == null ? null : new C3817d(connectionCallbacks2), onConnectionFailedListener2 == null ? null : new C3818e(onConnectionFailedListener2), avVar.m9116h());
        alVar.f13991d = avVar;
        alVar.f13993f = avVar.m9110b();
        Set e = avVar.m9113e();
        Set<Scope> a = m17256a(e);
        for (Scope contains : a) {
            if (!e.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        alVar.f13992e = a;
    }

    @NonNull
    /* renamed from: a */
    protected Set<Scope> m17256a(@NonNull Set<Scope> set) {
        return set;
    }

    /* renamed from: d */
    public final Account mo3583d() {
        return this.f13993f;
    }

    /* renamed from: e */
    protected final av mo3584e() {
        return this.f13991d;
    }

    /* renamed from: f */
    protected final Set<Scope> mo3585f() {
        return this.f13992e;
    }

    /* renamed from: g */
    public zzc[] mo3586g() {
        return new zzc[0];
    }
}
