package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C4393d;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.av;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.d */
final class C4284d extends C3787a<C4393d, GoogleSignInOptions> {
    C4284d() {
    }

    /* renamed from: a */
    public final /* synthetic */ zze mo3558a(Context context, Looper looper, av avVar, @Nullable Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new C4393d(context, looper, avVar, (GoogleSignInOptions) obj, connectionCallbacks, onConnectionFailedListener);
    }

    /* renamed from: a */
    public final /* synthetic */ List mo3559a(@Nullable Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.zzabe();
    }
}
