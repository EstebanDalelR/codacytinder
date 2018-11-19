package com.tinder.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.model.InstagramCodeError;
import com.tinder.p257g.C9646c;
import com.tinder.utils.ad;
import javax.inject.Inject;

public class WebViewActivityInstagram extends Activity {
    @Inject
    /* renamed from: a */
    LegacyBreadCrumbTracker f22667a;
    /* renamed from: b */
    private WebView f22668b;
    @Nullable
    /* renamed from: c */
    private String f22669c;
    @Nullable
    /* renamed from: d */
    private ProgressBar f22670d;

    /* renamed from: com.tinder.activities.WebViewActivityInstagram$2 */
    class C61562 extends WebChromeClient {
        /* renamed from: a */
        final /* synthetic */ WebViewActivityInstagram f22664a;

        C61562(WebViewActivityInstagram webViewActivityInstagram) {
            this.f22664a = webViewActivityInstagram;
        }

        public void onProgressChanged(WebView webView, int i) {
            if (i < 100 && this.f22664a.f22670d.getVisibility() == 8) {
                this.f22664a.f22670d.setVisibility(0);
            }
            if (i == 100) {
                this.f22664a.f22670d.setVisibility(8);
            }
        }
    }

    public interface ListenerInstagramAccessCode {
        void onAccessCode(String str);

        void onAccessCodeError(InstagramCodeError instagramCodeError);
    }

    /* renamed from: com.tinder.activities.WebViewActivityInstagram$a */
    private class C6157a extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ WebViewActivityInstagram f22665a;
        /* renamed from: b */
        private ListenerInstagramAccessCode f22666b;

        private C6157a(WebViewActivityInstagram webViewActivityInstagram, ListenerInstagramAccessCode listenerInstagramAccessCode) {
            this.f22665a = webViewActivityInstagram;
            this.f22666b = listenerInstagramAccessCode;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, @NonNull String str) {
            Object obj;
            webView = new StringBuilder();
            webView.append("shouldOverrideUrlLoading: ");
            webView.append(str);
            ad.a(webView.toString());
            webView = Uri.parse(str);
            str = webView.getHost();
            CharSequence scheme = webView.getScheme();
            CharSequence path = webView.getPath();
            if (!TextUtils.equals(scheme, "https")) {
                if (!TextUtils.equals(scheme, "http")) {
                    obj = null;
                    if (!TextUtils.equals(str, "gotinder.com")) {
                        if (TextUtils.equals(str, "www.gotinder.com") != null) {
                            str = null;
                            str = (obj == null && str != null && TextUtils.equals(path, ManagerWebServices.IG_AUTH_URL)) ? true : null;
                            if (str == null) {
                                return false;
                            }
                            str = webView.getQueryParameter("code");
                            if (TextUtils.isEmpty(str)) {
                                this.f22666b.onAccessCode(str);
                            } else {
                                this.f22666b.onAccessCodeError(C9646c.a(webView));
                            }
                            return true;
                        }
                    }
                    str = true;
                    if (obj == null) {
                    }
                    if (str == null) {
                        return false;
                    }
                    str = webView.getQueryParameter("code");
                    if (TextUtils.isEmpty(str)) {
                        this.f22666b.onAccessCodeError(C9646c.a(webView));
                    } else {
                        this.f22666b.onAccessCode(str);
                    }
                    return true;
                }
            }
            obj = 1;
            if (TextUtils.equals(str, "gotinder.com")) {
                if (TextUtils.equals(str, "www.gotinder.com") != null) {
                    str = null;
                    if (obj == null) {
                    }
                    if (str == null) {
                        return false;
                    }
                    str = webView.getQueryParameter("code");
                    if (TextUtils.isEmpty(str)) {
                        this.f22666b.onAccessCode(str);
                    } else {
                        this.f22666b.onAccessCodeError(C9646c.a(webView));
                    }
                    return true;
                }
            }
            str = true;
            if (obj == null) {
            }
            if (str == null) {
                return false;
            }
            str = webView.getQueryParameter("code");
            if (TextUtils.isEmpty(str)) {
                this.f22666b.onAccessCodeError(C9646c.a(webView));
            } else {
                this.f22666b.onAccessCode(str);
            }
            return true;
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ad.c(String.format("onReceivedError errorCode:[%s], description:[%s], failigUrl[%s]", new Object[]{Integer.valueOf(i), str, str2}));
            webView = new Intent();
            webView.putExtra("access_code_error", i);
            this.f22665a.setResult(-2, webView);
            this.f22665a.finish();
        }
    }

    /* renamed from: com.tinder.activities.WebViewActivityInstagram$1 */
    class C72771 implements ListenerInstagramAccessCode {
        /* renamed from: a */
        final /* synthetic */ WebViewActivityInstagram f26203a;

        C72771(WebViewActivityInstagram webViewActivityInstagram) {
            this.f26203a = webViewActivityInstagram;
        }

        public void onAccessCode(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Instagram access code: ");
            stringBuilder.append(str);
            ad.a(stringBuilder.toString());
            Intent intent = this.f26203a.getIntent();
            intent.putExtra("access_code", str);
            this.f26203a.setResult(-1, intent);
            this.f26203a.finish();
        }

        public void onAccessCodeError(InstagramCodeError instagramCodeError) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Instagram access code error: ");
            stringBuilder.append(instagramCodeError);
            ad.a(stringBuilder.toString());
            Intent intent = this.f26203a.getIntent();
            intent.putExtra("access_code_error", instagramCodeError);
            this.f26203a.setResult(-2, intent);
            this.f26203a.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_webview);
        ManagerApp.e().inject(this);
        if (getIntent().getExtras() != null) {
            this.f22669c = getIntent().getExtras().getString("url");
        }
        if (TextUtils.isEmpty(this.f22669c) != null) {
            finish();
        }
        this.f22670d = (ProgressBar) findViewById(R.id.progress_web);
        this.f22668b = (WebView) findViewById(R.id.webView);
        CookieSyncManager.createInstance(this);
        CookieManager.getInstance().removeAllCookie();
        this.f22668b.setWebViewClient(new C6157a(new C72771(this)));
        this.f22668b.setWebChromeClient(new C61562(this));
        bundle = this.f22668b.getSettings();
        bundle.setJavaScriptEnabled(true);
        bundle.setSaveFormData(false);
        bundle.setSavePassword(false);
        bundle.setAllowFileAccess(false);
        bundle.setAllowContentAccess(false);
        this.f22668b.loadUrl(this.f22669c);
    }

    protected void onResume() {
        super.onResume();
        this.f22667a.a(this);
    }
}
