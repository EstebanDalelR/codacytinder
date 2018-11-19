package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C2422a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.C2464a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.s */
public final class C4289s extends C3784p {
    /* renamed from: a */
    private final Context f13942a;

    public C4289s(Context context) {
        this.f13942a = context;
    }

    /* renamed from: a */
    private final void m17170a() {
        if (!C2513p.zzf(this.f13942a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder stringBuilder = new StringBuilder(52);
            stringBuilder.append("Calling UID ");
            stringBuilder.append(callingUid);
            stringBuilder.append(" is not Google Play services.");
            throw new SecurityException(stringBuilder.toString());
        }
    }

    public final void zzabo() {
        m17170a();
        C2457v a = C2457v.m8829a(this.f13942a);
        GoogleSignInAccount a2 = a.m8834a();
        HasOptions hasOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (a2 != null) {
            hasOptions = a.m8837b();
        }
        GoogleApiClient b = new C2464a(this.f13942a).m8855a(C2422a.f7347e, hasOptions).m8860b();
        try {
            if (b.mo2505f().isSuccess()) {
                if (a2 != null) {
                    C2422a.f7350h.revokeAccess(b);
                } else {
                    b.mo2508i();
                }
            }
            b.mo2506g();
        } catch (Throwable th) {
            b.mo2506g();
        }
    }

    public final void zzabp() {
        m17170a();
        C2453n.m8819a(this.f13942a).m8821a();
    }
}
