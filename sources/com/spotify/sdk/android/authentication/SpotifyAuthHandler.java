package com.spotify.sdk.android.authentication;

import android.app.Activity;
import android.util.Log;
import com.spotify.sdk.android.authentication.AuthenticationHandler.OnCompleteListener;

class SpotifyAuthHandler implements AuthenticationHandler {
    private static String TAG = "SpotifyAuthHandler";
    private SpotifyAuthActivity mSpotifyAuthActivity;

    public void setOnCompleteListener(OnCompleteListener onCompleteListener) {
    }

    SpotifyAuthHandler() {
    }

    public boolean start(Activity activity, AuthenticationRequest authenticationRequest) {
        Log.d(TAG, "start");
        this.mSpotifyAuthActivity = new SpotifyAuthActivity(activity, authenticationRequest);
        return this.mSpotifyAuthActivity.startAuthActivity();
    }

    public void stop() {
        Log.d(TAG, "stop");
        if (this.mSpotifyAuthActivity != null) {
            this.mSpotifyAuthActivity.stopAuthActivity();
        }
    }
}
