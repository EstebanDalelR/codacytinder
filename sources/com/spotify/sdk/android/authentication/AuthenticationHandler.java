package com.spotify.sdk.android.authentication;

import android.app.Activity;

public interface AuthenticationHandler {

    public interface OnCompleteListener {
        void onCancel();

        void onComplete(AuthenticationResponse authenticationResponse);

        void onError(Throwable th);
    }

    void setOnCompleteListener(OnCompleteListener onCompleteListener);

    boolean start(Activity activity, AuthenticationRequest authenticationRequest);

    void stop();
}
