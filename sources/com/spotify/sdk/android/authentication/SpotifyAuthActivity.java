package com.spotify.sdk.android.authentication;

import android.app.Activity;
import android.content.Intent;

public class SpotifyAuthActivity {
    static final String EXTRA_ERROR = "ERROR";
    static final String EXTRA_REPLY = "REPLY";
    private static final String EXTRA_VERSION = "VERSION";
    static final String KEY_ACCESS_TOKEN = "ACCESS_TOKEN";
    static final String KEY_AUTHORIZATION_CODE = "AUTHORIZATION_CODE";
    static final String KEY_CLIENT_ID = "CLIENT_ID";
    static final String KEY_EXPIRES_IN = "EXPIRES_IN";
    static final String KEY_REDIRECT_URI = "REDIRECT_URI";
    static final String KEY_REQUESTED_SCOPES = "SCOPES";
    static final String KEY_RESPONSE_TYPE = "RESPONSE_TYPE";
    private static final int PROTOCOL_VERSION = 1;
    static final String RESPONSE_TYPE_CODE = "code";
    static final String RESPONSE_TYPE_TOKEN = "token";
    private static final String SPOTIFY_AUTH_ACTIVITY = "com.spotify.mobile.android.sso.AuthorizationActivity";
    private static final String SPOTIFY_PACKAGE_NAME = "com.spotify.music";
    private static final String[] SPOTIFY_PACKAGE_SUFFIXES = new String[]{".debug", ".canary", ".partners", ""};
    private Activity mContextActivity;
    private AuthenticationRequest mRequest;

    public SpotifyAuthActivity(Activity activity, AuthenticationRequest authenticationRequest) {
        this.mContextActivity = activity;
        this.mRequest = authenticationRequest;
    }

    public boolean startAuthActivity() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r5.createAuthActivityIntent();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r2 = "VERSION";
        r3 = 1;
        r0.putExtra(r2, r3);
        r2 = "CLIENT_ID";
        r4 = r5.mRequest;
        r4 = r4.getClientId();
        r0.putExtra(r2, r4);
        r2 = "REDIRECT_URI";
        r4 = r5.mRequest;
        r4 = r4.getRedirectUri();
        r0.putExtra(r2, r4);
        r2 = "RESPONSE_TYPE";
        r4 = r5.mRequest;
        r4 = r4.getResponseType();
        r0.putExtra(r2, r4);
        r2 = "SCOPES";
        r4 = r5.mRequest;
        r4 = r4.getScopes();
        r0.putExtra(r2, r4);
        r2 = r5.mContextActivity;	 Catch:{ ActivityNotFoundException -> 0x0042 }
        r4 = 1138; // 0x472 float:1.595E-42 double:5.62E-321;	 Catch:{ ActivityNotFoundException -> 0x0042 }
        r2.startActivityForResult(r0, r4);	 Catch:{ ActivityNotFoundException -> 0x0042 }
        return r3;
    L_0x0042:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.sdk.android.authentication.SpotifyAuthActivity.startAuthActivity():boolean");
    }

    private Intent createAuthActivityIntent() {
        Intent intent = null;
        for (String str : SPOTIFY_PACKAGE_SUFFIXES) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SPOTIFY_PACKAGE_NAME);
            stringBuilder.append(str);
            intent = tryResolveActivity(stringBuilder.toString(), SPOTIFY_AUTH_ACTIVITY);
            if (intent != null) {
                break;
            }
        }
        return intent;
    }

    private Intent tryResolveActivity(String str, String str2) {
        str = new Intent().setClassName(str, str2);
        return this.mContextActivity.getPackageManager().resolveActivity(str, 0) == null ? null : str;
    }

    public void stopAuthActivity() {
        this.mContextActivity.finishActivity(LoginActivity.REQUEST_CODE);
    }
}
