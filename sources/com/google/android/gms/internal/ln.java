package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.bo;
import com.google.android.gms.ads.internal.overlay.C4275c;

@zzzv
@TargetApi(11)
public class ln extends WebChromeClient {
    /* renamed from: a */
    private final zzanh f16351a;

    public ln(zzanh zzanh) {
        this.f16351a = zzanh;
    }

    /* renamed from: a */
    private static Context m20034a(WebView webView) {
        if (!(webView instanceof zzanh)) {
            return webView.getContext();
        }
        zzanh zzanh = (zzanh) webView;
        Context zzsi = zzanh.zzsi();
        return zzsi != null ? zzsi : zzanh.getContext();
    }

    /* renamed from: a */
    private final boolean m20035a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            AlertDialog create;
            if (!(this.f16351a == null || this.f16351a.zzsz() == null || this.f16351a.zzsz().m19995a() == null)) {
                bo a = this.f16351a.zzsz().m19995a();
                if (!(a == null || a.b())) {
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(str3).length());
                    stringBuilder.append("window.");
                    stringBuilder.append(str);
                    stringBuilder.append("('");
                    stringBuilder.append(str3);
                    stringBuilder.append("')");
                    a.a(stringBuilder.toString());
                    return false;
                }
            }
            Builder builder = new Builder(context);
            builder.setTitle(str2);
            if (z) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                View textView = new TextView(context);
                textView.setText(str3);
                View editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                create = builder.setView(linearLayout).setPositiveButton(17039370, new lt(jsPromptResult, editText)).setNegativeButton(17039360, new ls(jsPromptResult)).setOnCancelListener(new lr(jsPromptResult)).create();
            } else {
                create = builder.setMessage(str3).setPositiveButton(17039370, new lq(jsResult)).setNegativeButton(17039360, new lp(jsResult)).setOnCancelListener(new lo(jsResult)).create();
            }
            create.show();
            return true;
        } catch (Throwable e) {
            hx.m19914c("Fail to display Dialog.", e);
            return true;
        }
    }

    /* renamed from: a */
    protected final void m20036a(View view, int i, CustomViewCallback customViewCallback) {
        C4275c zzsv = this.f16351a.zzsv();
        if (zzsv == null) {
            hx.m19916e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzsv.a(view, customViewCallback);
        zzsv.a(i);
    }

    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof zzanh) {
            C4275c zzsv = ((zzanh) webView).zzsv();
            if (zzsv == null) {
                str = "Tried to close an AdWebView not associated with an overlay.";
            } else {
                zzsv.a();
                return;
            }
        }
        str = "Tried to close a WebView that wasn't an AdWebView.";
        hx.m19916e(str);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(message).length() + 19) + String.valueOf(sourceId).length());
        stringBuilder.append("JS: ");
        stringBuilder.append(message);
        stringBuilder.append(" (");
        stringBuilder.append(sourceId);
        stringBuilder.append(":");
        stringBuilder.append(lineNumber);
        stringBuilder.append(")");
        message = stringBuilder.toString();
        if (message.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (lu.f16359a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                hx.m19913c(message);
                break;
            case 2:
                hx.m19916e(message);
                break;
            case 5:
                hx.m19911b(message);
                break;
            default:
                hx.m19915d(message);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.f16351a.zzsz());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        long j5 = 0;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j4), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            } else if (j2 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j, j4)) {
                j5 = j + j2;
            }
            j5 = j;
        } else if (j2 <= j4 && j2 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            j5 = j2;
        }
        quotaUpdater.updateQuota(j5);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (callback != null) {
            boolean z;
            ar.e();
            if (!fk.m19706a(this.f16351a.getContext(), this.f16351a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) {
                ar.e();
                if (!fk.m19706a(this.f16351a.getContext(), this.f16351a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        C4275c zzsv = this.f16351a.zzsv();
        if (zzsv == null) {
            hx.m19916e("Could not get ad overlay when hiding custom view.");
        } else {
            zzsv.b();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m20035a(m20034a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m20035a(m20034a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m20035a(m20034a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m20035a(m20034a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = j + PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        m20036a(view, -1, customViewCallback);
    }
}
