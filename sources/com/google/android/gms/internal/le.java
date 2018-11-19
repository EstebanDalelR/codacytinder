package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.bn;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.overlay.C4275c;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzbl;
import com.google.android.gms.common.util.C2526k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@zzzv
final class le extends WebView implements OnGlobalLayoutListener, DownloadListener, zzanh {
    /* renamed from: A */
    private alz f28761A;
    /* renamed from: B */
    private alz f28762B;
    /* renamed from: C */
    private ama f28763C;
    /* renamed from: D */
    private WeakReference<OnClickListener> f28764D;
    /* renamed from: E */
    private C4275c f28765E;
    /* renamed from: F */
    private boolean f28766F;
    /* renamed from: G */
    private hm f28767G;
    /* renamed from: H */
    private int f28768H = -1;
    /* renamed from: I */
    private int f28769I = -1;
    /* renamed from: J */
    private int f28770J = -1;
    /* renamed from: K */
    private int f28771K = -1;
    /* renamed from: L */
    private Map<String, ko> f28772L;
    /* renamed from: M */
    private final WindowManager f28773M;
    /* renamed from: N */
    private final ahw f28774N;
    /* renamed from: a */
    private final lz f28775a;
    /* renamed from: b */
    private final Object f28776b = new Object();
    @Nullable
    /* renamed from: c */
    private final tb f28777c;
    /* renamed from: d */
    private final zzakd f28778d;
    /* renamed from: e */
    private final zzbl f28779e;
    /* renamed from: f */
    private final bn f28780f;
    /* renamed from: g */
    private ku f28781g;
    /* renamed from: h */
    private C4275c f28782h;
    /* renamed from: i */
    private mb f28783i;
    /* renamed from: j */
    private String f28784j;
    /* renamed from: k */
    private boolean f28785k;
    /* renamed from: l */
    private boolean f28786l;
    /* renamed from: m */
    private boolean f28787m;
    /* renamed from: n */
    private boolean f28788n;
    /* renamed from: o */
    private Boolean f28789o;
    /* renamed from: p */
    private int f28790p;
    /* renamed from: q */
    private boolean f28791q = true;
    /* renamed from: r */
    private boolean f28792r = false;
    /* renamed from: s */
    private String f28793s = "";
    /* renamed from: t */
    private li f28794t;
    /* renamed from: u */
    private boolean f28795u;
    /* renamed from: v */
    private boolean f28796v;
    /* renamed from: w */
    private zzoq f28797w;
    /* renamed from: x */
    private int f28798x;
    /* renamed from: y */
    private int f28799y;
    /* renamed from: z */
    private alz f28800z;

    private le(lz lzVar, mb mbVar, String str, boolean z, boolean z2, @Nullable tb tbVar, zzakd zzakd, amb amb, zzbl zzbl, bn bnVar, ahw ahw) {
        super(lzVar);
        this.f28775a = lzVar;
        this.f28783i = mbVar;
        this.f28784j = str;
        this.f28787m = z;
        this.f28790p = -1;
        this.f28777c = tbVar;
        this.f28778d = zzakd;
        this.f28779e = zzbl;
        this.f28780f = bnVar;
        this.f28773M = (WindowManager) getContext().getSystemService("window");
        this.f28774N = ahw;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable e) {
            hx.m19912b("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(ar.e().m19746a((Context) lzVar, zzakd.zzcv));
        ar.g().mo6865a(getContext(), settings);
        setDownloadListener(this);
        m34013d();
        if (C2526k.c()) {
            addJavascriptInterface(new ll(this, new lm(this)), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f28767G = new hm(this.f28775a.m20037a(), this, this, null);
        m34017h();
        this.f28763C = new ama(new amb(true, "make_wv", this.f28784j));
        this.f28763C.m19358a().m19363a(amb);
        this.f28761A = alu.m19352a(this.f28763C.m19358a());
        this.f28763C.m19359a("native:view_create", this.f28761A);
        this.f28762B = null;
        this.f28800z = null;
        ar.g().mo7669b((Context) lzVar);
    }

    /* renamed from: a */
    static le m34002a(Context context, mb mbVar, String str, boolean z, boolean z2, @Nullable tb tbVar, zzakd zzakd, amb amb, zzbl zzbl, bn bnVar, ahw ahw) {
        return new le(new lz(context), mbVar, str, z, z2, tbVar, zzakd, amb, zzbl, bnVar, ahw);
    }

    /* renamed from: a */
    private final void m34004a(Boolean bool) {
        synchronized (this.f28776b) {
            this.f28789o = bool;
        }
        ar.i().m27294a(bool);
    }

    /* renamed from: a */
    private final void m34005a(String str) {
        synchronized (this.f28776b) {
            if (isDestroyed()) {
                hx.m19916e("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    /* renamed from: a */
    private final void m34006a(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zza("onAdVisibilityChanged", hashMap);
    }

    /* renamed from: a */
    private final boolean m34007a() {
        boolean z = false;
        if (!this.f28781g.m20012b() && !this.f28781g.m20013c()) {
            return false;
        }
        int b;
        int b2;
        ar.e();
        DisplayMetrics a = fk.m19682a(this.f28773M);
        aja.m19216a();
        int b3 = hn.m19872b(a, a.widthPixels);
        aja.m19216a();
        int b4 = hn.m19872b(a, a.heightPixels);
        Activity a2 = this.f28775a.m20037a();
        if (a2 != null) {
            if (a2.getWindow() != null) {
                ar.e();
                int[] a3 = fk.m19710a(a2);
                aja.m19216a();
                b = hn.m19872b(a, a3[0]);
                aja.m19216a();
                b2 = hn.m19872b(a, a3[1]);
                if (this.f28769I != b3 && this.f28768H == b4 && this.f28770J == b && this.f28771K == b2) {
                    return false;
                }
                if (!(this.f28769I == b3 && this.f28768H == b4)) {
                    z = true;
                }
                this.f28769I = b3;
                this.f28768H = b4;
                this.f28770J = b;
                this.f28771K = b2;
                new atv(this).m19487a(b3, b4, b, b2, a.density, this.f28773M.getDefaultDisplay().getRotation());
                return z;
            }
        }
        b = b3;
        b2 = b4;
        if (this.f28769I != b3) {
        }
        z = true;
        this.f28769I = b3;
        this.f28768H = b4;
        this.f28770J = b;
        this.f28771K = b2;
        new atv(this).m19487a(b3, b4, b, b2, a.density, this.f28773M.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: b */
    private final Boolean m34009b() {
        Boolean bool;
        synchronized (this.f28776b) {
            bool = this.f28789o;
        }
        return bool;
    }

    /* renamed from: b */
    private final void m34010b(java.lang.String r4) {
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
        r3 = this;
        r0 = com.google.android.gms.common.util.C2526k.e();
        if (r0 == 0) goto L_0x0074;
    L_0x0006:
        r0 = r3.m34009b();
        r1 = 0;
        if (r0 != 0) goto L_0x0039;
    L_0x000d:
        r0 = r3.f28776b;
        monitor-enter(r0);
        r2 = com.google.android.gms.ads.internal.ar.i();	 Catch:{ all -> 0x0036 }
        r2 = r2.m27311i();	 Catch:{ all -> 0x0036 }
        r3.f28789o = r2;	 Catch:{ all -> 0x0036 }
        r2 = r3.f28789o;	 Catch:{ all -> 0x0036 }
        if (r2 != 0) goto L_0x0034;
    L_0x001e:
        r2 = "(function(){})()";	 Catch:{ IllegalStateException -> 0x002c }
        r3.evaluateJavascript(r2, r1);	 Catch:{ IllegalStateException -> 0x002c }
        r2 = 1;	 Catch:{ IllegalStateException -> 0x002c }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ IllegalStateException -> 0x002c }
        r3.m34004a(r2);	 Catch:{ IllegalStateException -> 0x002c }
        goto L_0x0034;
    L_0x002c:
        r2 = 0;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x0036 }
        r3.m34004a(r2);	 Catch:{ all -> 0x0036 }
    L_0x0034:
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        goto L_0x0039;	 Catch:{ all -> 0x0036 }
    L_0x0036:
        r4 = move-exception;	 Catch:{ all -> 0x0036 }
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        throw r4;
    L_0x0039:
        r0 = r3.m34009b();
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x005a;
    L_0x0043:
        r0 = r3.f28776b;
        monitor-enter(r0);
        r2 = r3.isDestroyed();	 Catch:{ all -> 0x0057 }
        if (r2 != 0) goto L_0x0050;	 Catch:{ all -> 0x0057 }
    L_0x004c:
        r3.evaluateJavascript(r4, r1);	 Catch:{ all -> 0x0057 }
        goto L_0x0055;	 Catch:{ all -> 0x0057 }
    L_0x0050:
        r4 = "The webview is destroyed. Ignoring action.";	 Catch:{ all -> 0x0057 }
        com.google.android.gms.internal.hx.m19916e(r4);	 Catch:{ all -> 0x0057 }
    L_0x0055:
        monitor-exit(r0);	 Catch:{ all -> 0x0057 }
        return;	 Catch:{ all -> 0x0057 }
    L_0x0057:
        r4 = move-exception;	 Catch:{ all -> 0x0057 }
        monitor-exit(r0);	 Catch:{ all -> 0x0057 }
        throw r4;
    L_0x005a:
        r0 = "javascript:";
        r4 = java.lang.String.valueOf(r4);
        r1 = r4.length();
        if (r1 == 0) goto L_0x006b;
    L_0x0066:
        r4 = r0.concat(r4);
        goto L_0x0070;
    L_0x006b:
        r4 = new java.lang.String;
        r4.<init>(r0);
    L_0x0070:
        r3.m34005a(r4);
        return;
    L_0x0074:
        r0 = "javascript:";
        r4 = java.lang.String.valueOf(r4);
        r1 = r4.length();
        if (r1 == 0) goto L_0x0085;
    L_0x0080:
        r4 = r0.concat(r4);
        goto L_0x008a;
    L_0x0085:
        r4 = new java.lang.String;
        r4.<init>(r0);
    L_0x008a:
        r3.m34005a(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.le.b(java.lang.String):void");
    }

    /* renamed from: c */
    private final void m34011c() {
        alu.m19353a(this.f28763C.m19358a(), this.f28761A, "aeh2");
    }

    /* renamed from: d */
    private final void m34013d() {
        synchronized (this.f28776b) {
            if (!this.f28787m) {
                if (!this.f28783i.m20048d()) {
                    if (VERSION.SDK_INT < 18) {
                        hx.m19911b("Disabling hardware acceleration on an AdView.");
                        synchronized (this.f28776b) {
                            if (!this.f28788n) {
                                ar.g().mo6869c((View) this);
                            }
                            this.f28788n = true;
                        }
                    } else {
                        hx.m19911b("Enabling hardware acceleration on an AdView.");
                        m34014e();
                    }
                }
            }
            hx.m19911b("Enabling hardware acceleration on an overlay.");
            m34014e();
        }
    }

    /* renamed from: e */
    private final void m34014e() {
        synchronized (this.f28776b) {
            if (this.f28788n) {
                ar.g().mo6867b((View) this);
            }
            this.f28788n = false;
        }
    }

    /* renamed from: f */
    private final void m34015f() {
        synchronized (this.f28776b) {
            if (!this.f28766F) {
                this.f28766F = true;
                ar.i().m27326x();
            }
        }
    }

    /* renamed from: g */
    private final void m34016g() {
        synchronized (this.f28776b) {
            this.f28772L = null;
        }
    }

    /* renamed from: h */
    private final void m34017h() {
        if (this.f28763C != null) {
            amb a = this.f28763C.m19358a();
            if (!(a == null || ar.i().m27307e() == null)) {
                ar.i().m27307e().m19350a(a);
            }
        }
    }

    public final void destroy() {
        synchronized (this.f28776b) {
            m34017h();
            this.f28767G.m19858b();
            if (this.f28782h != null) {
                this.f28782h.a();
                this.f28782h.onDestroy();
                this.f28782h = null;
            }
            this.f28781g.m20022l();
            if (this.f28786l) {
                return;
            }
            ar.x();
            km.m19979a((zzamp) this);
            m34016g();
            this.f28786l = true;
            ec.m27332a("Initiating WebView self destruct sequence in 3...");
            this.f28781g.m20017g();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(19)
    public final void evaluateJavascript(java.lang.String r3, android.webkit.ValueCallback<java.lang.String> r4) {
        /*
        r2 = this;
        r0 = r2.f28776b;
        monitor-enter(r0);
        r1 = r2.isDestroyed();	 Catch:{ all -> 0x001b }
        if (r1 == 0) goto L_0x0016;
    L_0x0009:
        r3 = "The webview is destroyed. Ignoring action.";
        com.google.android.gms.internal.hx.m19916e(r3);	 Catch:{ all -> 0x001b }
        if (r4 == 0) goto L_0x0014;
    L_0x0010:
        r3 = 0;
        r4.onReceiveValue(r3);	 Catch:{ all -> 0x001b }
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        return;
    L_0x0016:
        super.evaluateJavascript(r3, r4);	 Catch:{ all -> 0x001b }
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        return;
    L_0x001b:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.le.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f28776b != null) {
                synchronized (this.f28776b) {
                    if (!this.f28786l) {
                        this.f28781g.m20022l();
                        ar.x();
                        km.m19979a((zzamp) this);
                        m34016g();
                        m34015f();
                    }
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.f28764D.get();
    }

    public final String getRequestId() {
        String str;
        synchronized (this.f28776b) {
            str = this.f28793s;
        }
        return str;
    }

    public final int getRequestedOrientation() {
        int i;
        synchronized (this.f28776b) {
            i = this.f28790p;
        }
        return i;
    }

    public final WebView getWebView() {
        return this;
    }

    public final boolean isDestroyed() {
        boolean z;
        synchronized (this.f28776b) {
            z = this.f28786l;
        }
        return z;
    }

    public final void loadData(String str, String str2, String str3) {
        synchronized (this.f28776b) {
            if (isDestroyed()) {
                hx.m19916e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(str, str2, str3);
            }
        }
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.f28776b) {
            if (isDestroyed()) {
                hx.m19916e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }
    }

    public final void loadUrl(String str) {
        synchronized (this.f28776b) {
            if (isDestroyed()) {
                hx.m19916e("The webview is destroyed. Ignoring action.");
            } else {
                try {
                    super.loadUrl(str);
                } catch (Throwable e) {
                    ar.i().m27296a(e, "AdWebViewImpl.loadUrl");
                    hx.m19914c("Could not call loadUrl. ", e);
                }
            }
        }
    }

    protected final void onAttachedToWindow() {
        synchronized (this.f28776b) {
            super.onAttachedToWindow();
            if (!isDestroyed()) {
                this.f28767G.m19859c();
            }
            boolean z = this.f28795u;
            if (this.f28781g != null && this.f28781g.m20013c()) {
                if (!this.f28796v) {
                    OnGlobalLayoutListener d = this.f28781g.m20014d();
                    if (d != null) {
                        ar.y();
                        if (this == null) {
                            throw null;
                        }
                        jb.m19936a((View) this, d);
                    }
                    OnScrollChangedListener e = this.f28781g.m20015e();
                    if (e != null) {
                        ar.y();
                        if (this == null) {
                            throw null;
                        }
                        jb.m19937a((View) this, e);
                    }
                    this.f28796v = true;
                }
                m34007a();
                z = true;
            }
            m34006a(z);
        }
    }

    protected final void onDetachedFromWindow() {
        synchronized (this.f28776b) {
            if (!isDestroyed()) {
                this.f28767G.m19860d();
            }
            super.onDetachedFromWindow();
            if (this.f28796v && this.f28781g != null && this.f28781g.m20013c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.f28781g.m20014d();
                if (d != null) {
                    ar.g().mo7623a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = this.f28781g.m20015e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f28796v = false;
            }
        }
        m34006a(false);
    }

    public final void onDownloadStart(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5) {
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
        r0 = this;
        r2 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2.<init>(r3);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3 = android.net.Uri.parse(r1);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2.setDataAndType(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3 = r0.getContext();	 Catch:{ ActivityNotFoundException -> 0x0019 }
        com.google.android.gms.internal.fk.m19696a(r3, r2);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        return;
    L_0x0019:
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r2 = r2 + 51;
        r3 = java.lang.String.valueOf(r4);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Couldn't find an Activity to view url/mimetype: ";
        r3.append(r2);
        r3.append(r1);
        r1 = " / ";
        r3.append(r1);
        r3.append(r4);
        r1 = r3.toString();
        com.google.android.gms.internal.hx.m19911b(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.le.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (!(this.f28781g == null || this.f28781g.m20023m() == null)) {
                    this.f28781g.m20023m().zzdb();
                }
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) aja.m19221f().m19334a(alo.ar)).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if (motionEvent.getActionMasked() == 8 && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean a = m34007a();
        C4275c zzsv = zzsv();
        if (zzsv != null && a) {
            zzsv.e();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"DrawAllocation"})
    protected final void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        r0 = r7.f28776b;
        monitor-enter(r0);
        r1 = r7.isDestroyed();	 Catch:{ all -> 0x0199 }
        r2 = 0;
        if (r1 == 0) goto L_0x000f;
    L_0x000a:
        r7.setMeasuredDimension(r2, r2);	 Catch:{ all -> 0x0199 }
        monitor-exit(r0);	 Catch:{ all -> 0x0199 }
        return;
    L_0x000f:
        r1 = r7.isInEditMode();	 Catch:{ all -> 0x0199 }
        if (r1 != 0) goto L_0x0194;
    L_0x0015:
        r1 = r7.f28787m;	 Catch:{ all -> 0x0199 }
        if (r1 != 0) goto L_0x0194;
    L_0x0019:
        r1 = r7.f28783i;	 Catch:{ all -> 0x0199 }
        r1 = r1.m20049e();	 Catch:{ all -> 0x0199 }
        if (r1 == 0) goto L_0x0023;
    L_0x0021:
        goto L_0x0194;
    L_0x0023:
        r1 = r7.f28783i;	 Catch:{ all -> 0x0199 }
        r1 = r1.m20050f();	 Catch:{ all -> 0x0199 }
        if (r1 == 0) goto L_0x006f;
    L_0x002b:
        r1 = r7.zzsg();	 Catch:{ all -> 0x0199 }
        r2 = 0;
        if (r1 == 0) goto L_0x0037;
    L_0x0032:
        r1 = r1.getAspectRatio();	 Catch:{ all -> 0x0199 }
        goto L_0x0038;
    L_0x0037:
        r1 = 0;
    L_0x0038:
        r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x0041;
    L_0x003c:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x0199 }
        monitor-exit(r0);	 Catch:{ all -> 0x0199 }
        return;
    L_0x0041:
        r8 = android.view.View.MeasureSpec.getSize(r8);	 Catch:{ all -> 0x0199 }
        r9 = android.view.View.MeasureSpec.getSize(r9);	 Catch:{ all -> 0x0199 }
        r2 = (float) r9;	 Catch:{ all -> 0x0199 }
        r2 = r2 * r1;
        r2 = (int) r2;	 Catch:{ all -> 0x0199 }
        r3 = (float) r8;	 Catch:{ all -> 0x0199 }
        r3 = r3 / r1;
        r3 = (int) r3;	 Catch:{ all -> 0x0199 }
        if (r9 != 0) goto L_0x005a;
    L_0x0052:
        if (r3 == 0) goto L_0x005a;
    L_0x0054:
        r9 = (float) r3;	 Catch:{ all -> 0x0199 }
        r9 = r9 * r1;
        r2 = (int) r9;	 Catch:{ all -> 0x0199 }
        r9 = r3;
        goto L_0x0062;
    L_0x005a:
        if (r8 != 0) goto L_0x0062;
    L_0x005c:
        if (r2 == 0) goto L_0x0062;
    L_0x005e:
        r8 = (float) r2;	 Catch:{ all -> 0x0199 }
        r8 = r8 / r1;
        r3 = (int) r8;	 Catch:{ all -> 0x0199 }
        r8 = r2;
    L_0x0062:
        r8 = java.lang.Math.min(r2, r8);	 Catch:{ all -> 0x0199 }
        r9 = java.lang.Math.min(r3, r9);	 Catch:{ all -> 0x0199 }
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x0199 }
        monitor-exit(r0);	 Catch:{ all -> 0x0199 }
        return;
    L_0x006f:
        r1 = r7.f28783i;	 Catch:{ all -> 0x0199 }
        r1 = r1.m20047c();	 Catch:{ all -> 0x0199 }
        if (r1 == 0) goto L_0x00c9;
    L_0x0077:
        r1 = com.google.android.gms.internal.alo.bW;	 Catch:{ all -> 0x0199 }
        r2 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x0199 }
        r1 = r2.m19334a(r1);	 Catch:{ all -> 0x0199 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x0199 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0199 }
        if (r1 != 0) goto L_0x00c4;
    L_0x0089:
        r1 = com.google.android.gms.common.util.C2526k.c();	 Catch:{ all -> 0x0199 }
        if (r1 != 0) goto L_0x0090;
    L_0x008f:
        goto L_0x00c4;
    L_0x0090:
        r1 = "/contentHeight";
        r2 = new com.google.android.gms.internal.lf;	 Catch:{ all -> 0x0199 }
        r2.<init>(r7);	 Catch:{ all -> 0x0199 }
        r7.zza(r1, r2);	 Catch:{ all -> 0x0199 }
        r1 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();";
        r7.m34010b(r1);	 Catch:{ all -> 0x0199 }
        r1 = r7.f28775a;	 Catch:{ all -> 0x0199 }
        r1 = r1.getResources();	 Catch:{ all -> 0x0199 }
        r1 = r1.getDisplayMetrics();	 Catch:{ all -> 0x0199 }
        r1 = r1.density;	 Catch:{ all -> 0x0199 }
        r8 = android.view.View.MeasureSpec.getSize(r8);	 Catch:{ all -> 0x0199 }
        r2 = r7.f28799y;	 Catch:{ all -> 0x0199 }
        r3 = -1;
        if (r2 == r3) goto L_0x00bb;
    L_0x00b4:
        r9 = r7.f28799y;	 Catch:{ all -> 0x0199 }
        r9 = (float) r9;	 Catch:{ all -> 0x0199 }
        r9 = r9 * r1;
        r9 = (int) r9;	 Catch:{ all -> 0x0199 }
        goto L_0x00bf;
    L_0x00bb:
        r9 = android.view.View.MeasureSpec.getSize(r9);	 Catch:{ all -> 0x0199 }
    L_0x00bf:
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x0199 }
        monitor-exit(r0);	 Catch:{ all -> 0x0199 }
        return;
    L_0x00c4:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x0199 }
        monitor-exit(r0);	 Catch:{ all -> 0x0199 }
        return;
    L_0x00c9:
        r1 = r7.f28783i;	 Catch:{ all -> 0x0199 }
        r1 = r1.m20048d();	 Catch:{ all -> 0x0199 }
        if (r1 == 0) goto L_0x00e8;
    L_0x00d1:
        r8 = new android.util.DisplayMetrics;	 Catch:{ all -> 0x0199 }
        r8.<init>();	 Catch:{ all -> 0x0199 }
        r9 = r7.f28773M;	 Catch:{ all -> 0x0199 }
        r9 = r9.getDefaultDisplay();	 Catch:{ all -> 0x0199 }
        r9.getMetrics(r8);	 Catch:{ all -> 0x0199 }
        r9 = r8.widthPixels;	 Catch:{ all -> 0x0199 }
        r8 = r8.heightPixels;	 Catch:{ all -> 0x0199 }
        r7.setMeasuredDimension(r9, r8);	 Catch:{ all -> 0x0199 }
        monitor-exit(r0);	 Catch:{ all -> 0x0199 }
        return;
    L_0x00e8:
        r1 = android.view.View.MeasureSpec.getMode(r8);	 Catch:{ all -> 0x0199 }
        r8 = android.view.View.MeasureSpec.getSize(r8);	 Catch:{ all -> 0x0199 }
        r3 = android.view.View.MeasureSpec.getMode(r9);	 Catch:{ all -> 0x0199 }
        r9 = android.view.View.MeasureSpec.getSize(r9);	 Catch:{ all -> 0x0199 }
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r1 == r5) goto L_0x0108;
    L_0x0101:
        if (r1 != r4) goto L_0x0104;
    L_0x0103:
        goto L_0x0108;
    L_0x0104:
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x0109;
    L_0x0108:
        r1 = r8;
    L_0x0109:
        if (r3 == r5) goto L_0x010d;
    L_0x010b:
        if (r3 != r4) goto L_0x010e;
    L_0x010d:
        r6 = r9;
    L_0x010e:
        r3 = r7.f28783i;	 Catch:{ all -> 0x0199 }
        r3 = r3.f16368b;	 Catch:{ all -> 0x0199 }
        r4 = 8;
        if (r3 > r1) goto L_0x0132;
    L_0x0116:
        r1 = r7.f28783i;	 Catch:{ all -> 0x0199 }
        r1 = r1.f16367a;	 Catch:{ all -> 0x0199 }
        if (r1 <= r6) goto L_0x011d;
    L_0x011c:
        goto L_0x0132;
    L_0x011d:
        r8 = r7.getVisibility();	 Catch:{ all -> 0x0199 }
        if (r8 == r4) goto L_0x0126;
    L_0x0123:
        r7.setVisibility(r2);	 Catch:{ all -> 0x0199 }
    L_0x0126:
        r8 = r7.f28783i;	 Catch:{ all -> 0x0199 }
        r8 = r8.f16368b;	 Catch:{ all -> 0x0199 }
        r9 = r7.f28783i;	 Catch:{ all -> 0x0199 }
        r9 = r9.f16367a;	 Catch:{ all -> 0x0199 }
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x0199 }
        goto L_0x0192;
    L_0x0132:
        r1 = r7.f28775a;	 Catch:{ all -> 0x0199 }
        r1 = r1.getResources();	 Catch:{ all -> 0x0199 }
        r1 = r1.getDisplayMetrics();	 Catch:{ all -> 0x0199 }
        r1 = r1.density;	 Catch:{ all -> 0x0199 }
        r3 = r7.f28783i;	 Catch:{ all -> 0x0199 }
        r3 = r3.f16368b;	 Catch:{ all -> 0x0199 }
        r3 = (float) r3;	 Catch:{ all -> 0x0199 }
        r3 = r3 / r1;
        r3 = (int) r3;	 Catch:{ all -> 0x0199 }
        r5 = r7.f28783i;	 Catch:{ all -> 0x0199 }
        r5 = r5.f16367a;	 Catch:{ all -> 0x0199 }
        r5 = (float) r5;	 Catch:{ all -> 0x0199 }
        r5 = r5 / r1;
        r5 = (int) r5;	 Catch:{ all -> 0x0199 }
        r8 = (float) r8;	 Catch:{ all -> 0x0199 }
        r8 = r8 / r1;
        r8 = (int) r8;	 Catch:{ all -> 0x0199 }
        r9 = (float) r9;	 Catch:{ all -> 0x0199 }
        r9 = r9 / r1;
        r9 = (int) r9;	 Catch:{ all -> 0x0199 }
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0199 }
        r6.<init>(r1);	 Catch:{ all -> 0x0199 }
        r1 = "Not enough space to show ad. Needs ";
        r6.append(r1);	 Catch:{ all -> 0x0199 }
        r6.append(r3);	 Catch:{ all -> 0x0199 }
        r1 = "x";
        r6.append(r1);	 Catch:{ all -> 0x0199 }
        r6.append(r5);	 Catch:{ all -> 0x0199 }
        r1 = " dp, but only has ";
        r6.append(r1);	 Catch:{ all -> 0x0199 }
        r6.append(r8);	 Catch:{ all -> 0x0199 }
        r8 = "x";
        r6.append(r8);	 Catch:{ all -> 0x0199 }
        r6.append(r9);	 Catch:{ all -> 0x0199 }
        r8 = " dp.";
        r6.append(r8);	 Catch:{ all -> 0x0199 }
        r8 = r6.toString();	 Catch:{ all -> 0x0199 }
        com.google.android.gms.internal.hx.m19916e(r8);	 Catch:{ all -> 0x0199 }
        r8 = r7.getVisibility();	 Catch:{ all -> 0x0199 }
        if (r8 == r4) goto L_0x018f;
    L_0x018b:
        r8 = 4;
        r7.setVisibility(r8);	 Catch:{ all -> 0x0199 }
    L_0x018f:
        r7.setMeasuredDimension(r2, r2);	 Catch:{ all -> 0x0199 }
    L_0x0192:
        monitor-exit(r0);	 Catch:{ all -> 0x0199 }
        return;
    L_0x0194:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x0199 }
        monitor-exit(r0);	 Catch:{ all -> 0x0199 }
        return;
    L_0x0199:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0199 }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.le.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!isDestroyed()) {
            try {
                super.onPause();
            } catch (Throwable e) {
                hx.m19912b("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!isDestroyed()) {
            try {
                super.onResume();
            } catch (Throwable e) {
                hx.m19912b("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f28781g.m20013c()) {
            synchronized (this.f28776b) {
                if (this.f28797w != null) {
                    this.f28797w.zzc(motionEvent);
                }
            }
        } else if (this.f28777c != null) {
            this.f28777c.m20181a(motionEvent);
        }
        return isDestroyed() ? false : super.onTouchEvent(motionEvent);
    }

    public final void setContext(Context context) {
        this.f28775a.setBaseContext(context);
        this.f28767G.m19857a(this.f28775a.m20037a());
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f28764D = new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final void setRequestedOrientation(int i) {
        synchronized (this.f28776b) {
            this.f28790p = i;
            if (this.f28782h != null) {
                this.f28782h.a(this.f28790p);
            }
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof ku) {
            this.f28781g = (ku) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!isDestroyed()) {
            try {
                super.stopLoading();
            } catch (Throwable e) {
                hx.m19912b("Could not stop loading webview.", e);
            }
        }
    }

    public final void zza(zzc zzc) {
        this.f28781g.m19999a(zzc);
    }

    public final void zza(agd agd) {
        synchronized (this.f28776b) {
            this.f28795u = agd.f15174a;
        }
        m34006a(agd.f15174a);
    }

    public final void zza(li liVar) {
        synchronized (this.f28776b) {
            if (this.f28794t != null) {
                hx.m19913c("Attempt to create multiple AdWebViewVideoControllers.");
                return;
            }
            this.f28794t = liVar;
        }
    }

    public final void zza(mb mbVar) {
        synchronized (this.f28776b) {
            this.f28783i = mbVar;
            requestLayout();
        }
    }

    public final void zza(String str, zzt<? super zzanh> zzt) {
        if (this.f28781g != null) {
            this.f28781g.m20005a(str, (zzt) zzt);
        }
    }

    public final void zza(java.lang.String r2, java.util.Map<java.lang.String, ?> r3) {
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
        r1 = this;
        r0 = com.google.android.gms.ads.internal.ar.e();	 Catch:{ JSONException -> 0x000c }
        r3 = r0.m19748a(r3);	 Catch:{ JSONException -> 0x000c }
        r1.zza(r2, r3);
        return;
    L_0x000c:
        r2 = "Could not convert parameters to JSON.";
        com.google.android.gms.internal.hx.m19916e(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.le.zza(java.lang.String, java.util.Map):void");
    }

    public final void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        str = "Dispatching AFMA event: ";
        jSONObject2 = String.valueOf(stringBuilder.toString());
        hx.m19911b(jSONObject2.length() != 0 ? str.concat(jSONObject2) : new String(str));
        m34010b(stringBuilder.toString());
    }

    public final void zza(boolean z, int i) {
        this.f28781g.m20008a(z, i);
    }

    public final void zza(boolean z, int i, String str) {
        this.f28781g.m20009a(z, i, str);
    }

    public final void zza(boolean z, int i, String str, String str2) {
        this.f28781g.m20010a(z, i, str, str2);
    }

    public final void zzac(boolean z) {
        this.f28781g.m20007a(z);
    }

    public final void zzad(boolean z) {
        synchronized (this.f28776b) {
            Object obj = z != this.f28787m ? 1 : null;
            this.f28787m = z;
            m34013d();
            if (obj != null) {
                new atv(this).m19491c(z ? "expanded" : "default");
            }
        }
    }

    public final void zzae(boolean z) {
        synchronized (this.f28776b) {
            if (this.f28782h != null) {
                this.f28782h.a(this.f28781g.m20012b(), z);
            } else {
                this.f28785k = z;
            }
        }
    }

    public final void zzaf(boolean z) {
        synchronized (this.f28776b) {
            this.f28791q = z;
        }
    }

    public final void zzag(int i) {
        if (i == 0) {
            alu.m19353a(this.f28763C.m19358a(), this.f28761A, "aebb2");
        }
        m34011c();
        if (this.f28763C.m19358a() != null) {
            this.f28763C.m19358a().m19365a("close_type", String.valueOf(i));
        }
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f28778d.zzcv);
        zza("onhide", hashMap);
    }

    public final void zzag(boolean z) {
        synchronized (this.f28776b) {
            this.f28798x += z ? 1 : -1;
            if (this.f28798x <= 0 && this.f28782h != null) {
                this.f28782h.g();
            }
        }
    }

    public final void zzb(C4275c c4275c) {
        synchronized (this.f28776b) {
            this.f28782h = c4275c;
        }
    }

    public final void zzb(zzoq zzoq) {
        synchronized (this.f28776b) {
            this.f28797w = zzoq;
        }
    }

    public final void zzb(String str, zzt<? super zzanh> zzt) {
        if (this.f28781g != null) {
            this.f28781g.m20011b(str, zzt);
        }
    }

    public final void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(jSONObject2).length());
        stringBuilder.append(str);
        stringBuilder.append("(");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        m34010b(stringBuilder.toString());
    }

    public final bn zzbq() {
        return this.f28780f;
    }

    public final void zzc(C4275c c4275c) {
        synchronized (this.f28776b) {
            this.f28765E = c4275c;
        }
    }

    public final void zzcq() {
        synchronized (this.f28776b) {
            this.f28792r = true;
            if (this.f28779e != null) {
                this.f28779e.zzcq();
            }
        }
    }

    public final void zzcr() {
        synchronized (this.f28776b) {
            this.f28792r = false;
            if (this.f28779e != null) {
                this.f28779e.zzcr();
            }
        }
    }

    public final void zzcz(String str) {
        synchronized (this.f28776b) {
            try {
                super.loadUrl(str);
            } catch (Throwable e) {
                ar.i().m27296a(e, "AdWebViewImpl.loadUrlUnsafe");
                hx.m19914c("Could not call loadUrl. ", e);
            }
        }
    }

    public final void zzda(String str) {
        synchronized (this.f28776b) {
            if (str == null) {
                str = "";
            }
            this.f28793s = str;
        }
    }

    public final void zzmz() {
        if (this.f28800z == null) {
            alu.m19353a(this.f28763C.m19358a(), this.f28761A, "aes2");
            this.f28800z = alu.m19352a(this.f28763C.m19358a());
            this.f28763C.m19359a("native:view_show", this.f28800z);
        }
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f28778d.zzcv);
        zza("onshow", hashMap);
    }

    public final void zzna() {
        C4275c zzsv = zzsv();
        if (zzsv != null) {
            zzsv.f();
        }
    }

    public final ju zzsf() {
        return null;
    }

    public final li zzsg() {
        li liVar;
        synchronized (this.f28776b) {
            liVar = this.f28794t;
        }
        return liVar;
    }

    public final alz zzsh() {
        return this.f28761A;
    }

    public final Activity zzsi() {
        return this.f28775a.m20037a();
    }

    public final ama zzsj() {
        return this.f28763C;
    }

    public final zzakd zzsk() {
        return this.f28778d;
    }

    public final int zzsl() {
        return getMeasuredHeight();
    }

    public final int zzsm() {
        return getMeasuredWidth();
    }

    public final void zzss() {
        m34011c();
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f28778d.zzcv);
        zza("onhide", hashMap);
    }

    public final void zzst() {
        Map hashMap = new HashMap(3);
        ar.e();
        hashMap.put("app_muted", String.valueOf(fk.m19725d()));
        ar.e();
        hashMap.put("app_volume", String.valueOf(fk.m19719c()));
        ar.e();
        hashMap.put("device_volume", String.valueOf(fk.m19738j(getContext())));
        zza("volume", hashMap);
    }

    public final Context zzsu() {
        return this.f28775a.m20038b();
    }

    public final C4275c zzsv() {
        C4275c c4275c;
        synchronized (this.f28776b) {
            c4275c = this.f28782h;
        }
        return c4275c;
    }

    public final C4275c zzsw() {
        C4275c c4275c;
        synchronized (this.f28776b) {
            c4275c = this.f28765E;
        }
        return c4275c;
    }

    public final mb zzsx() {
        mb mbVar;
        synchronized (this.f28776b) {
            mbVar = this.f28783i;
        }
        return mbVar;
    }

    public final String zzsy() {
        String str;
        synchronized (this.f28776b) {
            str = this.f28784j;
        }
        return str;
    }

    public final ku zzsz() {
        return this.f28781g;
    }

    public final boolean zzta() {
        boolean z;
        synchronized (this.f28776b) {
            z = this.f28785k;
        }
        return z;
    }

    public final tb zztb() {
        return this.f28777c;
    }

    public final boolean zztc() {
        boolean z;
        synchronized (this.f28776b) {
            z = this.f28787m;
        }
        return z;
    }

    public final void zztd() {
        synchronized (this.f28776b) {
            ec.m27332a("Destroying WebView!");
            m34015f();
            fk.f16060a.post(new lg(this));
        }
    }

    public final boolean zzte() {
        boolean z;
        synchronized (this.f28776b) {
            z = this.f28791q;
        }
        return z;
    }

    public final boolean zztf() {
        boolean z;
        synchronized (this.f28776b) {
            z = this.f28792r;
        }
        return z;
    }

    public final boolean zztg() {
        boolean z;
        synchronized (this.f28776b) {
            z = this.f28798x > 0;
        }
        return z;
    }

    public final void zzth() {
        this.f28767G.m19856a();
    }

    public final void zzti() {
        if (this.f28762B == null) {
            this.f28762B = alu.m19352a(this.f28763C.m19358a());
            this.f28763C.m19359a("native:view_load", this.f28762B);
        }
    }

    public final zzoq zztj() {
        zzoq zzoq;
        synchronized (this.f28776b) {
            zzoq = this.f28797w;
        }
        return zzoq;
    }

    public final void zztk() {
        setBackgroundColor(0);
    }

    public final void zztl() {
        ec.m27332a("Cannot add text view to inner AdWebView");
    }
}
