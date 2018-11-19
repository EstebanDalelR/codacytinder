package com.spotify.sdk.android.authentication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.spotify.sdk.android.authentication.AuthenticationHandler.OnCompleteListener;

class LoginDialog extends Dialog {
    private static final int DEFAULT_THEME = 16973840;
    private static final int MAX_HEIGHT_DP = 640;
    private static final int MAX_WIDTH_DP = 400;
    private static final String TAG = "com.spotify.sdk.android.authentication.LoginDialog";
    private static final String WEBVIEW_URIS = "^(.+\\.facebook\\.com)|(accounts\\.spotify\\.com)$";
    private boolean mAttached;
    private OnCompleteListener mListener;
    private ProgressDialog mProgressDialog;
    private boolean mResultDelivered;
    private final Uri mUri;

    /* renamed from: com.spotify.sdk.android.authentication.LoginDialog$1 */
    class C59611 implements OnCancelListener {
        C59611() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            LoginDialog.this.dismiss();
        }
    }

    public LoginDialog(Activity activity, AuthenticationRequest authenticationRequest) {
        super(activity, DEFAULT_THEME);
        this.mUri = authenticationRequest.toUri();
    }

    public LoginDialog(Activity activity, int i, AuthenticationRequest authenticationRequest) {
        super(activity, i);
        this.mUri = authenticationRequest.toUri();
    }

    public void setOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.mListener = onCompleteListener;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mResultDelivered = null;
        this.mProgressDialog = new ProgressDialog(getContext());
        this.mProgressDialog.setMessage(getContext().getString(C5963R.string.com_spotify_sdk_login_progress));
        this.mProgressDialog.requestWindowFeature(1);
        this.mProgressDialog.setOnCancelListener(new C59611());
        requestWindowFeature(1);
        getWindow().setSoftInputMode(16);
        getWindow().setBackgroundDrawableResource(17301673);
        setContentView(C5963R.layout.com_spotify_sdk_login_dialog);
        setLayoutSize();
        createWebView(this.mUri);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void createWebView(Uri uri) {
        if (!internetPermissionGranted()) {
            Log.e(TAG, "Missing INTERNET permission");
        }
        final WebView webView = (WebView) findViewById(C5963R.id.com_spotify_sdk_login_webview);
        final LinearLayout linearLayout = (LinearLayout) findViewById(C5963R.id.com_spotify_sdk_login_webview_container);
        final String queryParameter = uri.getQueryParameter(QueryParams.REDIRECT_URI);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        webView.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                if (LoginDialog.this.mAttached) {
                    LoginDialog.this.mProgressDialog.dismiss();
                }
                webView.setVisibility(0);
                linearLayout.setVisibility(0);
                super.onPageFinished(webView, str);
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (LoginDialog.this.mAttached != null) {
                    LoginDialog.this.mProgressDialog.show();
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView = Uri.parse(str);
                if (str.startsWith(queryParameter) != null) {
                    LoginDialog.this.sendComplete(webView);
                    return true;
                } else if (webView.getAuthority().matches(LoginDialog.WEBVIEW_URIS) != null) {
                    return null;
                } else {
                    LoginDialog.this.getContext().startActivity(new Intent("android.intent.action.VIEW", webView));
                    return true;
                }
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                LoginDialog.this.sendError(new Error(String.format("%s, code: %s, failing url: %s", new Object[]{str, Integer.valueOf(i), str2})));
            }
        });
        webView.loadUrl(uri.toString());
    }

    private void sendComplete(Uri uri) {
        this.mResultDelivered = true;
        if (this.mListener != null) {
            this.mListener.onComplete(AuthenticationResponse.fromUri(uri));
        }
        close();
    }

    private void sendError(Throwable th) {
        this.mResultDelivered = true;
        if (this.mListener != null) {
            this.mListener.onError(th);
        }
        close();
    }

    public void onAttachedToWindow() {
        this.mAttached = true;
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.mAttached = false;
        super.onDetachedFromWindow();
    }

    protected void onStop() {
        if (!(this.mResultDelivered || this.mListener == null)) {
            this.mListener.onCancel();
        }
        this.mResultDelivered = true;
        this.mProgressDialog.dismiss();
        super.onStop();
    }

    public void close() {
        if (this.mAttached) {
            dismiss();
        }
    }

    private boolean internetPermissionGranted() {
        return getContext().getPackageManager().checkPermission("android.permission.INTERNET", getContext().getPackageName()) == 0;
    }

    private void setLayoutSize() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = -1;
        int i2 = ((float) displayMetrics.widthPixels) / displayMetrics.density > 400.0f ? (int) (displayMetrics.density * 400.0f) : -1;
        if (((float) displayMetrics.heightPixels) / displayMetrics.density > 640.0f) {
            i = (int) (displayMetrics.density * 640.0f);
        }
        ((LinearLayout) findViewById(C5963R.id.com_spotify_sdk_login_webview_container)).setLayoutParams(new LayoutParams(i2, i, 17));
    }

    static void clearCookies(Context context) {
        WebViewUtils.clearFacebookCookies(context);
        WebViewUtils.clearCookiesForDomain(context, "spotify.com");
        WebViewUtils.clearCookiesForDomain(context, ".spotify.com");
        WebViewUtils.clearCookiesForDomain(context, "https://spotify.com");
        WebViewUtils.clearCookiesForDomain(context, "https://.spotify.com");
    }
}
