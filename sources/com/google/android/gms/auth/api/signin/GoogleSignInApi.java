package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import com.google.android.gms.common.api.C3791c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public interface GoogleSignInApi {
    Intent getSignInIntent(GoogleApiClient googleApiClient);

    C3781a getSignInResultFromIntent(Intent intent);

    PendingResult<Status> revokeAccess(GoogleApiClient googleApiClient);

    PendingResult<Status> signOut(GoogleApiClient googleApiClient);

    C3791c<C3781a> silentSignIn(GoogleApiClient googleApiClient);
}
