package com.tinder.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.utils.av;

public class al extends Dialog implements OnClickListener {
    /* renamed from: a */
    private WebView f31007a = ((WebView) findViewById(R.id.web_dialog_webview));
    /* renamed from: b */
    private String f31008b;

    /* renamed from: com.tinder.dialogs.al$1 */
    class C88511 extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ al f31006a;

        C88511(al alVar) {
            this.f31006a = alVar;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return this.f31006a.f31008b.equals(Uri.parse(str).getHost()) ^ 1;
        }
    }

    public al(@NonNull Context context, String str, String str2) {
        super(context, 16973840);
        getWindow().setLayout(av.b(), av.c());
        getWindow().setWindowAnimations(R.style.dialog_up_down_animation);
        setContentView(R.layout.view_web_dialog);
        findViewById(R.id.view_back_icon).setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.view_back_title);
        textView.setText(str2);
        textView.setOnClickListener(this);
        this.f31007a.setLayerType(1, null);
        this.f31007a.setScrollBarStyle(33554432);
        context = this.f31007a.getSettings();
        context.setLoadWithOverviewMode(true);
        context.setJavaScriptEnabled(true);
        context.setDomStorageEnabled(true);
        context.setBuiltInZoomControls(true);
        context.setUserAgentString(ManagerWebServices.USER_AGENT_STRING);
        context.setAllowContentAccess(false);
        context.setAllowFileAccess(false);
        this.f31007a.setWebViewClient(new C88511(this));
        this.f31007a.loadUrl(str);
        this.f31008b = Uri.parse(str).getHost();
    }

    public void onClick(@NonNull View view) {
        switch (view.getId()) {
            case R.id.view_back_icon:
                dismiss();
                return;
            case R.id.view_back_title:
                dismiss();
                return;
            default:
                return;
        }
    }
}
