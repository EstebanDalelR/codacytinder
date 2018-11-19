package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.BinderThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.zzbt;
import com.google.android.gms.internal.td;
import com.google.android.gms.internal.tg;
import com.google.android.gms.internal.tj;
import com.google.android.gms.internal.zzcxd;
import com.google.android.gms.internal.zzcxq;
import java.util.Set;

public final class bl extends tj implements ConnectionCallbacks, OnConnectionFailedListener {
    /* renamed from: a */
    private static C3787a<? extends zzcxd, tg> f14572a = td.f16530a;
    /* renamed from: b */
    private final Context f14573b;
    /* renamed from: c */
    private final Handler f14574c;
    /* renamed from: d */
    private final C3787a<? extends zzcxd, tg> f14575d;
    /* renamed from: e */
    private Set<Scope> f14576e;
    /* renamed from: f */
    private av f14577f;
    /* renamed from: g */
    private zzcxd f14578g;
    /* renamed from: h */
    private zzcy f14579h;

    @WorkerThread
    public bl(Context context, Handler handler, @NonNull av avVar) {
        this(context, handler, avVar, f14572a);
    }

    @WorkerThread
    public bl(Context context, Handler handler, @NonNull av avVar, C3787a<? extends zzcxd, tg> c3787a) {
        this.f14573b = context;
        this.f14574c = handler;
        this.f14577f = (av) ad.m9046a((Object) avVar, (Object) "ClientSettings must not be null");
        this.f14576e = avVar.m9112d();
        this.f14575d = c3787a;
    }

    @WorkerThread
    /* renamed from: a */
    private final void m18155a(zzcxq zzcxq) {
        ConnectionResult zzahf = zzcxq.zzahf();
        if (zzahf.isSuccess()) {
            zzbt zzbdi = zzcxq.zzbdi();
            zzahf = zzbdi.zzahf();
            if (zzahf.isSuccess()) {
                this.f14579h.zzb(zzbdi.zzalp(), this.f14576e);
                this.f14578g.disconnect();
            }
            String valueOf = String.valueOf(zzahf);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 48);
            stringBuilder.append("Sign-in succeeded with resolve account failure: ");
            stringBuilder.append(valueOf);
            Log.wtf("SignInCoordinator", stringBuilder.toString(), new Exception());
        }
        this.f14579h.zzh(zzahf);
        this.f14578g.disconnect();
    }

    /* renamed from: a */
    public final zzcxd m18156a() {
        return this.f14578g;
    }

    @WorkerThread
    /* renamed from: a */
    public final void m18157a(zzcy zzcy) {
        if (this.f14578g != null) {
            this.f14578g.disconnect();
        }
        this.f14577f.m9109a(Integer.valueOf(System.identityHashCode(this)));
        this.f14578g = (zzcxd) this.f14575d.mo3558a(this.f14573b, this.f14574c.getLooper(), this.f14577f, this.f14577f.m9117i(), this, this);
        this.f14579h = zzcy;
        if (this.f14576e != null) {
            if (!this.f14576e.isEmpty()) {
                this.f14578g.connect();
                return;
            }
        }
        this.f14574c.post(new bm(this));
    }

    /* renamed from: b */
    public final void m18158b() {
        if (this.f14578g != null) {
            this.f14578g.disconnect();
        }
    }

    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle) {
        this.f14578g.zza(this);
    }

    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f14579h.zzh(connectionResult);
    }

    @WorkerThread
    public final void onConnectionSuspended(int i) {
        this.f14578g.disconnect();
    }

    @BinderThread
    public final void zzb(zzcxq zzcxq) {
        this.f14574c.post(new bn(this, zzcxq));
    }
}
