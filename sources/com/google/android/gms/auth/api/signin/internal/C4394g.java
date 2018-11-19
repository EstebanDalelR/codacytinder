package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C3781a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.g */
final class C4394g extends C4287a {
    /* renamed from: a */
    private /* synthetic */ C4446f f14569a;

    C4394g(C4446f c4446f) {
        this.f14569a = c4446f;
    }

    public final void zza(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
        if (googleSignInAccount != null) {
            C2453n.m8819a(this.f14569a.f14813a).m8822a(this.f14569a.f14814b, googleSignInAccount);
        }
        this.f14569a.m14223a(new C3781a(googleSignInAccount, status));
    }
}
