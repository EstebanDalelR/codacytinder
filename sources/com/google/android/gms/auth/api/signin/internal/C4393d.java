package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C2445a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4295c;
import com.google.android.gms.common.internal.av;

/* renamed from: com.google.android.gms.auth.api.signin.internal.d */
public final class C4393d extends C4295c<zzu> {
    /* renamed from: d */
    private final GoogleSignInOptions f14568d;

    public C4393d(Context context, Looper looper, av avVar, GoogleSignInOptions googleSignInOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, avVar, connectionCallbacks, onConnectionFailedListener);
        if (googleSignInOptions == null) {
            googleSignInOptions = new C2445a().m8812c();
        }
        if (!avVar.m9113e().isEmpty()) {
            C2445a c2445a = new C2445a(googleSignInOptions);
            for (Scope a : avVar.m9113e()) {
                c2445a.m8810a(a, new Scope[0]);
            }
            googleSignInOptions = c2445a.m8812c();
        }
        this.f14568d = googleSignInOptions;
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo3768a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof zzu ? (zzu) queryLocalInterface : new C3786r(iBinder);
    }

    /* renamed from: a */
    protected final String mo3769a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: b */
    protected final String mo3770b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* renamed from: c */
    public final GoogleSignInOptions mo3771c() {
        return this.f14568d;
    }

    public final Intent getSignInIntent() {
        return C2451e.m8813a(m9095j(), this.f14568d);
    }

    public final boolean zzabj() {
        return true;
    }
}
