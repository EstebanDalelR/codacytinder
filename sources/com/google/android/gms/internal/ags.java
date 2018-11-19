package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.util.C2526k;
import java.util.List;

@zzzv
@TargetApi(14)
public final class ags extends Thread {
    /* renamed from: a */
    private boolean f15223a = false;
    /* renamed from: b */
    private boolean f15224b = false;
    /* renamed from: c */
    private boolean f15225c = false;
    /* renamed from: d */
    private final Object f15226d;
    /* renamed from: e */
    private final ago f15227e;
    /* renamed from: f */
    private final zzzt f15228f;
    /* renamed from: g */
    private final int f15229g;
    /* renamed from: h */
    private final int f15230h;
    /* renamed from: i */
    private final int f15231i;
    /* renamed from: j */
    private final int f15232j;
    /* renamed from: k */
    private final int f15233k;
    /* renamed from: l */
    private final int f15234l;
    /* renamed from: m */
    private final int f15235m;
    /* renamed from: n */
    private final int f15236n;
    /* renamed from: o */
    private final String f15237o;
    /* renamed from: p */
    private final boolean f15238p;

    public ags(ago ago, zzzt zzzt) {
        this.f15227e = ago;
        this.f15228f = zzzt;
        this.f15226d = new Object();
        this.f15230h = ((Integer) aja.m19221f().m19334a(alo.f15434L)).intValue();
        this.f15231i = ((Integer) aja.m19221f().m19334a(alo.f15435M)).intValue();
        this.f15232j = ((Integer) aja.m19221f().m19334a(alo.f15436N)).intValue();
        this.f15233k = ((Integer) aja.m19221f().m19334a(alo.f15437O)).intValue();
        this.f15234l = ((Integer) aja.m19221f().m19334a(alo.f15440R)).intValue();
        this.f15235m = ((Integer) aja.m19221f().m19334a(alo.f15442T)).intValue();
        this.f15236n = ((Integer) aja.m19221f().m19334a(alo.f15443U)).intValue();
        this.f15229g = ((Integer) aja.m19221f().m19334a(alo.f15438P)).intValue();
        this.f15237o = (String) aja.m19221f().m19334a(alo.f15445W);
        this.f15238p = ((Boolean) aja.m19221f().m19334a(alo.f15447Y)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    private final agw m19146a(@Nullable View view, agn agn) {
        int i = 0;
        if (view == null) {
            return new agw(this, 0, 0);
        }
        Context b = ar.h().m19135b();
        if (b != null) {
            String str = (String) view.getTag(b.getResources().getIdentifier((String) aja.m19221f().m19334a(alo.f15444V), "id", b.getPackageName()));
            if (!(TextUtils.isEmpty(this.f15237o) || str == null || !str.equals(this.f15237o))) {
                return new agw(this, 0, 0);
            }
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new agw(this, 0, 0);
            }
            agn.m19119b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new agw(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzanh)) {
            Object obj;
            agn.m19124g();
            WebView webView = (WebView) view;
            if (C2526k.e()) {
                agn.m19124g();
                webView.post(new agu(this, agn, webView, globalVisibleRect));
                obj = 1;
            } else {
                obj = null;
            }
            return obj != null ? new agw(this, 0, 1) : new agw(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new agw(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            while (i < viewGroup.getChildCount()) {
                agw a = m19146a(viewGroup.getChildAt(i), agn);
                i2 += a.f15247a;
                i3 += a.f15248b;
                i++;
            }
            return new agw(this, i2, i3);
        }
    }

    /* renamed from: e */
    private static boolean m19147e() {
        boolean z = false;
        try {
            Context b = ar.h().m19135b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager == null) {
                    return false;
                }
                List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    return false;
                }
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (Process.myPid() == runningAppProcessInfo.pid) {
                        if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                            PowerManager powerManager = (PowerManager) b.getSystemService("power");
                            if (powerManager == null ? false : powerManager.isScreenOn()) {
                                z = true;
                            }
                        }
                    }
                }
            }
            return z;
        } catch (Throwable th) {
            ar.i().m27296a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* renamed from: f */
    private final void m19148f() {
        synchronized (this.f15226d) {
            this.f15224b = true;
            boolean z = this.f15224b;
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("ContentFetchThread: paused, mPause = ");
            stringBuilder.append(z);
            hx.m19911b(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final void m19149a() {
        synchronized (this.f15226d) {
            if (this.f15223a) {
                hx.m19911b("Content hash thread already started, quiting...");
                return;
            }
            this.f15223a = true;
            start();
        }
    }

    /* renamed from: a */
    final void m19150a(View view) {
        try {
            agn agn = new agn(this.f15230h, this.f15231i, this.f15232j, this.f15233k, this.f15234l, this.f15235m, this.f15236n);
            agw a = m19146a(view, agn);
            agn.m19125h();
            if (a.f15247a != 0 || a.f15248b != 0) {
                if (a.f15248b != 0 || agn.m19127j() != 0) {
                    if (a.f15248b != 0 || !this.f15227e.m19129a(agn)) {
                        this.f15227e.m19131c(agn);
                    }
                }
            }
        } catch (Throwable e) {
            hx.m19912b("Exception in fetchContentOnUIThread", e);
            this.f15228f.zza(e, "ContentFetchTask.fetchContent");
        }
    }

    /* renamed from: a */
    final void m19151a(com.google.android.gms.internal.agn r11, android.webkit.WebView r12, java.lang.String r13, boolean r14) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r10 = this;
        r11.m19123f();
        r0 = android.text.TextUtils.isEmpty(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        if (r0 != 0) goto L_0x007c;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0009:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r0.<init>(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = "text";	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r2 = r0.optString(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = r10.f15238p;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        if (r13 != 0) goto L_0x0065;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0018:
        r13 = r12.getTitle();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = android.text.TextUtils.isEmpty(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        if (r13 != 0) goto L_0x0065;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0022:
        r13 = r12.getTitle();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r0 = java.lang.String.valueOf(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r0 = r0.length();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r0 = r0 + 1;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1 = java.lang.String.valueOf(r2);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1 = r1.length();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r0 = r0 + r1;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1.<init>(r0);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1.append(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = "\n";	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1.append(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r4 = r1.toString();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r6 = r12.getX();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r7 = r12.getY();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = r12.getWidth();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r8 = (float) r13;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r12 = r12.getHeight();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r9 = (float) r12;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r3 = r11;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r5 = r14;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r3.m19116a(r4, r5, r6, r7, r8, r9);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        goto L_0x007c;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0065:
        r4 = r12.getX();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r5 = r12.getY();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = r12.getWidth();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r6 = (float) r13;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r12 = r12.getHeight();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r7 = (float) r12;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1 = r11;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r3 = r14;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1.m19116a(r2, r3, r4, r5, r6, r7);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x007c:
        r12 = r11.m19117a();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        if (r12 == 0) goto L_0x0087;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0082:
        r12 = r10.f15227e;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r12.m19130b(r11);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0087:
        return;
    L_0x0088:
        r11 = move-exception;
        r12 = "Failed to get webview content.";
        com.google.android.gms.internal.hx.m19909a(r12, r11);
        r12 = r10.f15228f;
        r13 = "ContentFetchTask.processWebViewContent";
        r12.zza(r11, r13);
        return;
    L_0x0096:
        r11 = "Json string may be malformed.";
        com.google.android.gms.internal.hx.m19911b(r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ags.a(com.google.android.gms.internal.agn, android.webkit.WebView, java.lang.String, boolean):void");
    }

    /* renamed from: b */
    public final agn m19152b() {
        return this.f15227e.m19128a();
    }

    /* renamed from: c */
    public final void m19153c() {
        synchronized (this.f15226d) {
            this.f15224b = false;
            this.f15226d.notifyAll();
            hx.m19911b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: d */
    public final boolean m19154d() {
        return this.f15224b;
    }

    public final void run() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
    L_0x0000:
        r0 = m19147e();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        if (r0 == 0) goto L_0x0059;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x0006:
        r0 = com.google.android.gms.ads.internal.ar.h();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = r0.m19132a();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        if (r0 != 0) goto L_0x0019;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x0010:
        r0 = "ContentFetchThread: no activity. Sleeping.";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        com.google.android.gms.internal.hx.m19911b(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x0015:
        r4.m19148f();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x005f;
    L_0x0019:
        if (r0 == 0) goto L_0x005f;
    L_0x001b:
        r1 = 0;
        r2 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
    L_0x0022:
        r2 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r2 = r2.getDecorView();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
    L_0x002c:
        r0 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r0 = r0.getDecorView();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r2 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r0 = r0.findViewById(r2);	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r1 = r0;
        goto L_0x004c;
    L_0x003d:
        r0 = move-exception;
        r2 = com.google.android.gms.ads.internal.ar.i();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r3 = "ContentFetchTask.extractContent";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r2.m27296a(r0, r3);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = "Failed getting root view of activity. Content not extracted.";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        com.google.android.gms.internal.hx.m19911b(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x004c:
        if (r1 == 0) goto L_0x005f;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x004e:
        if (r1 == 0) goto L_0x005f;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x0050:
        r0 = new com.google.android.gms.internal.agt;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0.<init>(r4, r1);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r1.post(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x005f;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x0059:
        r0 = "ContentFetchTask: sleeping";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        com.google.android.gms.internal.hx.m19911b(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x0015;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x005f:
        r0 = r4.f15229g;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = r0 * 1000;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = (long) r0;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x007c;
    L_0x0068:
        r0 = move-exception;
        r1 = "Error in ContentFetchTask";
        com.google.android.gms.internal.hx.m19912b(r1, r0);
        r1 = r4.f15228f;
        r2 = "ContentFetchTask.run";
        r1.zza(r0, r2);
        goto L_0x007c;
    L_0x0076:
        r0 = move-exception;
        r1 = "Error in ContentFetchTask";
        com.google.android.gms.internal.hx.m19912b(r1, r0);
    L_0x007c:
        r0 = r4.f15226d;
        monitor-enter(r0);
    L_0x007f:
        r1 = r4.f15224b;	 Catch:{ all -> 0x0091 }
        if (r1 == 0) goto L_0x008e;
    L_0x0083:
        r1 = "ContentFetchTask: waiting";	 Catch:{ InterruptedException -> 0x007f }
        com.google.android.gms.internal.hx.m19911b(r1);	 Catch:{ InterruptedException -> 0x007f }
        r1 = r4.f15226d;	 Catch:{ InterruptedException -> 0x007f }
        r1.wait();	 Catch:{ InterruptedException -> 0x007f }
        goto L_0x007f;
    L_0x008e:
        monitor-exit(r0);	 Catch:{ all -> 0x0091 }
        goto L_0x0000;	 Catch:{ all -> 0x0091 }
    L_0x0091:
        r1 = move-exception;	 Catch:{ all -> 0x0091 }
        monitor-exit(r0);	 Catch:{ all -> 0x0091 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ags.run():void");
    }
}
