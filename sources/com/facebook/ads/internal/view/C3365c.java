package com.facebook.ads.internal.view;

import android.content.Context;
import android.net.http.SslError;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.p047k.C1476a;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1491i;
import com.facebook.ads.internal.p047k.ai;
import com.facebook.ads.internal.p049l.C1517a;
import com.facebook.ads.internal.p049l.C1517a.C1516a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.c */
public class C3365c extends C1556b {
    /* renamed from: a */
    private static final String f10229a = "c";
    @Nullable
    /* renamed from: b */
    private final C1560b f10230b;
    /* renamed from: c */
    private ai f10231c = new ai();
    /* renamed from: d */
    private C1517a f10232d;

    /* renamed from: com.facebook.ads.internal.view.c$2 */
    class C15572 extends WebChromeClient {
        /* renamed from: a */
        final /* synthetic */ C3365c f4340a;

        C15572(C3365c c3365c) {
            this.f4340a = c3365c;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c$3 */
    class C15583 extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ C3365c f4341a;

        C15583(C3365c c3365c) {
            this.f4341a = c3365c;
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Map hashMap = new HashMap();
            this.f4341a.f10232d.m5350a(hashMap);
            hashMap.put("touch", C1490h.m5244a(this.f4341a.getTouchData()));
            if (this.f4341a.f10230b != null) {
                this.f4341a.f10230b.mo1653a(str, hashMap);
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c$a */
    public class C1559a {
        /* renamed from: a */
        final /* synthetic */ C3365c f4342a;
        /* renamed from: b */
        private final String f4343b = C1559a.class.getSimpleName();

        public C1559a(C3365c c3365c) {
            this.f4342a = c3365c;
        }

        @JavascriptInterface
        public void alert(String str) {
            Log.e(this.f4343b, str);
        }

        @JavascriptInterface
        public String getAnalogInfo() {
            return C1490h.m5244a(C1476a.m5161a());
        }

        @JavascriptInterface
        public void onPageInitialized() {
            if (!this.f4342a.m5423c()) {
                if (this.f4342a.f10230b != null) {
                    this.f4342a.f10230b.mo1651a();
                }
                if (this.f4342a.f10232d != null) {
                    this.f4342a.f10232d.m5348a();
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c$b */
    public interface C1560b {
        /* renamed from: a */
        void mo1651a();

        /* renamed from: a */
        void mo1652a(int i);

        /* renamed from: a */
        void mo1653a(String str, Map<String, String> map);

        /* renamed from: b */
        void mo1654b();
    }

    public C3365c(Context context, final C1560b c1560b, int i) {
        super(context);
        this.f10230b = c1560b;
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        addJavascriptInterface(new C1559a(this), "AdControl");
        this.f10232d = new C1517a(this, i, new C1516a(this) {
            /* renamed from: b */
            final /* synthetic */ C3365c f10155b;

            /* renamed from: a */
            public void mo1681a() {
                this.f10155b.f10231c.m5183a();
                if (c1560b != null) {
                    c1560b.mo1654b();
                }
            }
        });
    }

    /* renamed from: a */
    protected WebChromeClient mo1785a() {
        return new C15572(this);
    }

    /* renamed from: a */
    public void m12960a(int i, int i2) {
        this.f10232d.m5349a(i);
        this.f10232d.m5352b(i2);
    }

    /* renamed from: b */
    protected WebViewClient mo1786b() {
        return new C15583(this);
    }

    public void destroy() {
        if (this.f10232d != null) {
            this.f10232d.m5351b();
            this.f10232d = null;
        }
        C1491i.m5259a(this);
        super.destroy();
    }

    public Map<String, String> getTouchData() {
        return this.f10231c.m5188e();
    }

    public C1517a getViewabilityChecker() {
        return this.f10232d;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f10231c.m5184a(motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f10230b != null) {
            this.f10230b.mo1652a(i);
        }
        if (this.f10232d != null) {
            if (i == 0) {
                this.f10232d.m5348a();
            } else if (i == 8) {
                this.f10232d.m5351b();
            }
        }
    }
}
