package com.facebook.ads.internal.view.p050a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.p047k.C1491i;
import com.facebook.ads.internal.p047k.C1500n;
import com.facebook.ads.internal.view.C1556b;
import java.util.HashSet;
import java.util.Set;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.a.d */
public class C3325d extends C1556b {
    /* renamed from: a */
    private static final String f10128a = "d";
    /* renamed from: b */
    private static final Set<String> f10129b = new HashSet(2);
    /* renamed from: c */
    private C1543a f10130c;
    /* renamed from: d */
    private C1500n f10131d;
    /* renamed from: e */
    private long f10132e = -1;
    /* renamed from: f */
    private long f10133f = -1;
    /* renamed from: g */
    private long f10134g = -1;
    /* renamed from: h */
    private long f10135h = -1;

    /* renamed from: com.facebook.ads.internal.view.a.d$1 */
    class C15411 extends WebChromeClient {
        /* renamed from: a */
        final /* synthetic */ C3325d f4312a;

        C15411(C3325d c3325d) {
            this.f4312a = c3325d;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            if (!TextUtils.isEmpty(message) && consoleMessage.messageLevel() == MessageLevel.LOG) {
                this.f4312a.f10131d.m5282a(message);
            }
            return true;
        }

        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            this.f4312a.f10131d.m5281a();
            if (this.f4312a.f10130c != null) {
                this.f4312a.f10130c.mo1819a(i);
            }
        }

        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (this.f4312a.f10130c != null) {
                this.f4312a.f10130c.mo1821b(str);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.a.d$2 */
    class C15422 extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ C3325d f4313a;

        C15422(C3325d c3325d) {
            this.f4313a = c3325d;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f4313a.f10130c != null) {
                this.f4313a.f10130c.mo1822c(str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f4313a.f10130c != null) {
                this.f4313a.f10130c.mo1820a(str);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse = Uri.parse(str);
            if (!C3325d.f10129b.contains(parse.getScheme())) {
                try {
                    this.f4313a.getContext().startActivity(new Intent("android.intent.action.VIEW", parse));
                    return true;
                } catch (Throwable e) {
                    Log.w(C3325d.f10128a, "Activity not found to handle URI.", e);
                } catch (Throwable e2) {
                    Log.e(C3325d.f10128a, "Unknown exception occurred when trying to handle URI.", e2);
                }
            }
            return false;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.a.d$a */
    public interface C1543a {
        /* renamed from: a */
        void mo1819a(int i);

        /* renamed from: a */
        void mo1820a(String str);

        /* renamed from: b */
        void mo1821b(String str);

        /* renamed from: c */
        void mo1822c(String str);
    }

    static {
        f10129b.add("http");
        f10129b.add("https");
    }

    public C3325d(Context context) {
        super(context);
        m12840f();
    }

    /* renamed from: a */
    public static boolean m12836a(String str) {
        return f10129b.contains(str);
    }

    /* renamed from: f */
    private void m12840f() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        this.f10131d = new C1500n(this);
    }

    /* renamed from: g */
    private void m12841g() {
        if (this.f10133f > -1 && this.f10134g > -1 && this.f10135h > -1) {
            this.f10131d.m5283a(false);
        }
    }

    /* renamed from: a */
    protected WebChromeClient mo1785a() {
        return new C15411(this);
    }

    /* renamed from: a */
    public void m12843a(long j) {
        if (this.f10132e < 0) {
            this.f10132e = j;
        }
    }

    /* renamed from: b */
    protected WebViewClient mo1786b() {
        return new C15422(this);
    }

    /* renamed from: b */
    public void m12845b(long j) {
        if (this.f10133f < 0) {
            this.f10133f = j;
        }
        m12841g();
    }

    /* renamed from: b */
    public void m12846b(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = 0;
        r2.evaluateJavascript(r3, r0);	 Catch:{ IllegalStateException -> 0x0005 }
        return;
    L_0x0005:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "javascript:";
        r0.append(r1);
        r0.append(r3);
        r3 = r0.toString();
        r2.loadUrl(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.a.d.b(java.lang.String):void");
    }

    /* renamed from: c */
    public void m12847c(long j) {
        if (this.f10135h < 0) {
            this.f10135h = j;
        }
        m12841g();
    }

    public void destroy() {
        C1491i.m5259a(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.f10133f;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        return copyBackForwardList.getSize() > 0 ? copyBackForwardList.getItemAtIndex(0).getUrl() : getUrl();
    }

    public long getLoadFinishMs() {
        return this.f10135h;
    }

    public long getResponseEndMs() {
        return this.f10132e;
    }

    public long getScrollReadyMs() {
        return this.f10134g;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10134g < 0 && computeVerticalScrollRange() > getHeight()) {
            this.f10134g = System.currentTimeMillis();
            m12841g();
        }
    }

    public void setListener(C1543a c1543a) {
        this.f10130c = c1543a;
    }
}
