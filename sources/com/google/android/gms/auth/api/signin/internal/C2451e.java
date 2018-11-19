package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.signin.C3781a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C2468d;
import com.google.android.gms.common.api.C3791c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.al;
import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.ow;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
public final class C2451e {
    /* renamed from: a */
    private static ow f7391a = new ow("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m8813a(Context context, GoogleSignInOptions googleSignInOptions) {
        f7391a.a("getSignInIntent()", new Object[0]);
        Parcelable signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Nullable
    /* renamed from: a */
    public static C3781a m8814a(Intent intent) {
        if (intent != null) {
            if (intent.hasExtra("googleSignInStatus") || intent.hasExtra("googleSignInAccount")) {
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
                Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
                if (googleSignInAccount != null) {
                    status = Status.zzfni;
                }
                return new C3781a(googleSignInAccount, status);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static PendingResult<Status> m8815a(GoogleApiClient googleApiClient, Context context, boolean z) {
        f7391a.a("Signing out", new Object[0]);
        C2451e.m8817a(context);
        return z ? C2468d.m8909a(Status.zzfni, googleApiClient) : googleApiClient.mo2499b(new C4447h(googleApiClient));
    }

    /* renamed from: a */
    public static C3791c<C3781a> m8816a(GoogleApiClient googleApiClient, Context context, GoogleSignInOptions googleSignInOptions, boolean z) {
        Result c3781a;
        f7391a.a("silentSignIn()", new Object[0]);
        f7391a.a("getEligibleSavedSignInResult()", new Object[0]);
        ad.m9045a((Object) googleSignInOptions);
        GoogleSignInOptions c = C2453n.m8819a(context).m8824c();
        if (c != null) {
            Account account = c.getAccount();
            Account account2 = googleSignInOptions.getAccount();
            boolean equals = account == null ? account2 == null : account.equals(account2);
            if (equals && !googleSignInOptions.zzabf() && ((!googleSignInOptions.isIdTokenRequested() || (c.isIdTokenRequested() && googleSignInOptions.getServerClientId().equals(c.getServerClientId()))) && new HashSet(c.zzabe()).containsAll(new HashSet(googleSignInOptions.zzabe())))) {
                GoogleSignInAccount b = C2453n.m8819a(context).m8823b();
                if (!(b == null || b.zza())) {
                    c3781a = new C3781a(b, Status.zzfni);
                    if (c3781a != null) {
                        f7391a.a("Eligible saved sign in result found", new Object[0]);
                        return C2468d.m8910b(c3781a, googleApiClient);
                    } else if (z) {
                        return C2468d.m8910b(new C3781a(null, new Status(4)), googleApiClient);
                    } else {
                        f7391a.a("trySilentSignIn()", new Object[0]);
                        return new bf(googleApiClient.mo2491a(new C4446f(googleApiClient, context, googleSignInOptions)));
                    }
                }
            }
        }
        c3781a = null;
        if (c3781a != null) {
            f7391a.a("Eligible saved sign in result found", new Object[0]);
            return C2468d.m8910b(c3781a, googleApiClient);
        } else if (z) {
            return C2468d.m8910b(new C3781a(null, new Status(4)), googleApiClient);
        } else {
            f7391a.a("trySilentSignIn()", new Object[0]);
            return new bf(googleApiClient.mo2491a(new C4446f(googleApiClient, context, googleSignInOptions)));
        }
    }

    /* renamed from: a */
    private static void m8817a(Context context) {
        C2453n.m8819a(context).m8821a();
        for (GoogleApiClient d : GoogleApiClient.m8861a()) {
            d.mo2503d();
        }
        al.m8939b();
    }

    /* renamed from: b */
    public static PendingResult<Status> m8818b(GoogleApiClient googleApiClient, Context context, boolean z) {
        f7391a.a("Revoking access", new Object[0]);
        C2451e.m8817a(context);
        return z ? C2468d.m8908a(Status.zzfnn, googleApiClient) : googleApiClient.mo2499b(new C4448j(googleApiClient));
    }
}
