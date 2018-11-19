package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public interface CredentialsApi {
    PendingResult<Status> delete(GoogleApiClient googleApiClient, Credential credential);

    PendingResult<Status> disableAutoSignIn(GoogleApiClient googleApiClient);

    PendingIntent getHintPickerIntent(GoogleApiClient googleApiClient, HintRequest hintRequest);

    PendingResult<CredentialRequestResult> request(GoogleApiClient googleApiClient, CredentialRequest credentialRequest);

    PendingResult<Status> save(GoogleApiClient googleApiClient, Credential credential);
}
