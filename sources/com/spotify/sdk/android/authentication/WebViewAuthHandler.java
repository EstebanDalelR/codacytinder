package com.spotify.sdk.android.authentication;

import android.app.Activity;
import android.util.Log;
import com.spotify.sdk.android.authentication.AuthenticationHandler.OnCompleteListener;

class WebViewAuthHandler implements AuthenticationHandler {
    private static String TAG = "WebViewAuthHandler";
    private OnCompleteListener mListener;
    private LoginDialog mLoginDialog;

    WebViewAuthHandler() {
    }

    public boolean start(Activity activity, AuthenticationRequest authenticationRequest) {
        Log.d(TAG, "start");
        this.mLoginDialog = new LoginDialog(activity, authenticationRequest);
        this.mLoginDialog.setOnCompleteListener(this.mListener);
        this.mLoginDialog.show();
        return true;
    }

    public void stop() {
        Log.d(TAG, "stop");
        if (this.mLoginDialog != null) {
            this.mLoginDialog.close();
            this.mLoginDialog = null;
        }
    }

    public void setOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.mListener = onCompleteListener;
        if (this.mLoginDialog != null) {
            this.mLoginDialog.setOnCompleteListener(onCompleteListener);
        }
    }
}
