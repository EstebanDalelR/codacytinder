package com.spotify.sdk.android.authentication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.spotify.sdk.android.authentication.AuthenticationResponse.Builder;
import com.spotify.sdk.android.authentication.AuthenticationResponse.Type;
import com.tinder.api.ManagerWebServices;

public class LoginActivity extends Activity implements AuthenticationClientListener {
    static final String EXTRA_AUTH_REQUEST = "EXTRA_AUTH_REQUEST";
    static final String EXTRA_AUTH_RESPONSE = "EXTRA_AUTH_RESPONSE";
    private static final String NO_CALLER_ERROR = "Can't use LoginActivity with a null caller. Possible reasons: calling activity has a singleInstance mode or LoginActivity is in a singleInstance/singleTask mode";
    private static final String NO_REQUEST_ERROR = "No authentication request";
    public static final int REQUEST_CODE = 1138;
    private static final int RESULT_ERROR = -2;
    private static final String TAG = "com.spotify.sdk.android.authentication.LoginActivity";
    private AuthenticationClient mAuthenticationClient;
    private AuthenticationRequest mRequest;

    public void onClientCancelled() {
    }

    public static Intent getAuthIntent(Activity activity, AuthenticationRequest authenticationRequest) {
        if (activity != null) {
            if (authenticationRequest != null) {
                Intent intent = new Intent(activity, LoginActivity.class);
                intent.putExtra(EXTRA_AUTH_REQUEST, authenticationRequest);
                return intent;
            }
        }
        throw new IllegalArgumentException("Context activity or request can't be null");
    }

    public static AuthenticationResponse getResponseFromIntent(Intent intent) {
        return (intent == null || intent.getParcelableExtra(EXTRA_AUTH_RESPONSE) == null) ? null : (AuthenticationResponse) intent.getParcelableExtra(EXTRA_AUTH_RESPONSE);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5963R.layout.com_spotify_sdk_login_activity);
        this.mRequest = (AuthenticationRequest) getIntent().getParcelableExtra(EXTRA_AUTH_REQUEST);
        if (this.mRequest != null) {
            this.mAuthenticationClient = new AuthenticationClient(this);
            this.mAuthenticationClient.setOnCompleteListener(this);
            this.mAuthenticationClient.authenticate(this.mRequest);
            return;
        }
        Log.e(TAG, NO_REQUEST_ERROR);
        setResult(null);
        finish();
    }

    protected void onResume() {
        super.onResume();
        if (getCallingActivity() != null) {
            this.mAuthenticationClient.authenticate(this.mRequest);
            return;
        }
        Log.e(TAG, NO_CALLER_ERROR);
        finish();
    }

    protected void onDestroy() {
        this.mAuthenticationClient.cancel();
        this.mAuthenticationClient.setOnCompleteListener(null);
        super.onDestroy();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == REQUEST_CODE) {
            i = new Builder();
            if (i2 == -2) {
                Log.d(TAG, "Error authenticating");
                i.setType(Type.ERROR);
                if (intent == null) {
                    i2 = "Invalid message format";
                } else {
                    i2 = intent.getStringExtra("ERROR");
                }
                if (i2 == 0) {
                    i2 = "Unknown error";
                }
                i.setError(i2);
            } else {
                Object obj = -1;
                if (i2 == -1) {
                    Bundle bundle = (Bundle) intent.getParcelableExtra("REPLY");
                    if (bundle != null) {
                        intent = bundle.getString("RESPONSE_TYPE");
                        String str = TAG;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Response: ");
                        stringBuilder.append(intent);
                        Log.d(str, stringBuilder.toString());
                        int hashCode = intent.hashCode();
                        if (hashCode != 3059181) {
                            if (hashCode == 110541305) {
                                if (intent.equals(ManagerWebServices.PARAM_TOKEN) != null) {
                                    obj = null;
                                }
                            }
                        } else if (intent.equals("code") != null) {
                            obj = 1;
                        }
                        switch (obj) {
                            case null:
                                intent = bundle.getString("ACCESS_TOKEN");
                                i2 = bundle.getInt("EXPIRES_IN");
                                i.setType(Type.TOKEN);
                                i.setAccessToken(intent);
                                i.setExpiresIn(i2);
                                break;
                            case 1:
                                i2 = bundle.getString("AUTHORIZATION_CODE");
                                i.setType(Type.CODE);
                                i.setCode(i2);
                                break;
                            default:
                                i.setType(Type.UNKNOWN);
                                break;
                        }
                    }
                    i.setType(Type.ERROR);
                    i.setError("Missing response data");
                } else {
                    i.setType(Type.EMPTY);
                }
            }
            this.mAuthenticationClient.setOnCompleteListener(this);
            this.mAuthenticationClient.complete(i.build());
        }
    }

    public void onClientComplete(AuthenticationResponse authenticationResponse) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_AUTH_RESPONSE, authenticationResponse);
        setResult(-1, intent);
        finish();
    }
}
