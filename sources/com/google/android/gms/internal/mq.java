package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.C2422a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ad;

public final class mq implements CredentialsApi {
    public final PendingResult<Status> delete(GoogleApiClient googleApiClient, Credential credential) {
        return googleApiClient.b(new mu(this, googleApiClient, credential));
    }

    public final PendingResult<Status> disableAutoSignIn(GoogleApiClient googleApiClient) {
        return googleApiClient.b(new mv(this, googleApiClient));
    }

    public final PendingIntent getHintPickerIntent(GoogleApiClient googleApiClient, HintRequest hintRequest) {
        ad.b(googleApiClient.a(C2422a.f7346d), "Auth.CREDENTIALS_API must be added to GoogleApiClient to use this API");
        return my.m20052a(googleApiClient.b(), ((mz) googleApiClient.a(C2422a.f7343a)).m34026c(), hintRequest);
    }

    public final PendingResult<CredentialRequestResult> request(GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        return googleApiClient.a(new mr(this, googleApiClient, credentialRequest));
    }

    public final PendingResult<Status> save(GoogleApiClient googleApiClient, Credential credential) {
        return googleApiClient.b(new mt(this, googleApiClient, credential));
    }
}
