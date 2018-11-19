package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.C2422a;
import com.google.android.gms.auth.api.signin.C3781a;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C3791c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.c */
public final class C3783c implements GoogleSignInApi {
    /* renamed from: a */
    private static GoogleSignInOptions m14211a(GoogleApiClient googleApiClient) {
        return ((C4393d) googleApiClient.mo2490a(C2422a.f7344b)).mo3771c();
    }

    public final Intent getSignInIntent(GoogleApiClient googleApiClient) {
        return C2451e.m8813a(googleApiClient.mo2498b(), C3783c.m14211a(googleApiClient));
    }

    public final C3781a getSignInResultFromIntent(Intent intent) {
        return C2451e.m8814a(intent);
    }

    public final PendingResult<Status> revokeAccess(GoogleApiClient googleApiClient) {
        return C2451e.m8818b(googleApiClient, googleApiClient.mo2498b(), false);
    }

    public final PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        return C2451e.m8815a(googleApiClient, googleApiClient.mo2498b(), false);
    }

    public final C3791c<C3781a> silentSignIn(GoogleApiClient googleApiClient) {
        return C2451e.m8816a(googleApiClient, googleApiClient.mo2498b(), C3783c.m14211a(googleApiClient), false);
    }
}
