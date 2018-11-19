package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.lang.ref.WeakReference;

public final class xi implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: a */
    private static final Handler f16619a = new Handler(Looper.getMainLooper());
    /* renamed from: b */
    private final Context f16620b;
    /* renamed from: c */
    private Application f16621c;
    /* renamed from: d */
    private final PowerManager f16622d;
    /* renamed from: e */
    private final KeyguardManager f16623e;
    /* renamed from: f */
    private final ub f16624f;
    /* renamed from: g */
    private BroadcastReceiver f16625g;
    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f16626h;
    /* renamed from: i */
    private WeakReference<View> f16627i;
    /* renamed from: j */
    private tr f16628j;
    /* renamed from: k */
    private boolean f16629k = false;
    /* renamed from: l */
    private int f16630l = -1;
    /* renamed from: m */
    private long f16631m = -3;

    public xi(ub ubVar, View view) {
        this.f16624f = ubVar;
        this.f16620b = ubVar.f16550a;
        this.f16622d = (PowerManager) this.f16620b.getSystemService("power");
        this.f16623e = (KeyguardManager) this.f16620b.getSystemService("keyguard");
        if (this.f16620b instanceof Application) {
            this.f16621c = (Application) this.f16620b;
            this.f16628j = new tr((Application) this.f16620b, this);
        }
        m20266a(view);
    }

    /* renamed from: a */
    private final void m20259a(Activity activity, int i) {
        if (this.f16627i != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f16627i.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.f16630l = i;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m20261b() {
        f16619a.post(new yh(this));
    }

    /* renamed from: b */
    private final void m20262b(android.view.View r3) {
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
        r2 = this;
        r3 = r3.getViewTreeObserver();
        r0 = r3.isAlive();
        if (r0 == 0) goto L_0x0017;
    L_0x000a:
        r0 = new java.lang.ref.WeakReference;
        r0.<init>(r3);
        r2.f16626h = r0;
        r3.addOnScrollChangedListener(r2);
        r3.addOnGlobalLayoutListener(r2);
    L_0x0017:
        r3 = r2.f16625g;
        if (r3 != 0) goto L_0x003d;
    L_0x001b:
        r3 = new android.content.IntentFilter;
        r3.<init>();
        r0 = "android.intent.action.SCREEN_ON";
        r3.addAction(r0);
        r0 = "android.intent.action.SCREEN_OFF";
        r3.addAction(r0);
        r0 = "android.intent.action.USER_PRESENT";
        r3.addAction(r0);
        r0 = new com.google.android.gms.internal.ze;
        r0.<init>(r2);
        r2.f16625g = r0;
        r0 = r2.f16620b;
        r1 = r2.f16625g;
        r0.registerReceiver(r1, r3);
    L_0x003d:
        r3 = r2.f16621c;
        if (r3 == 0) goto L_0x0048;
    L_0x0041:
        r3 = r2.f16621c;	 Catch:{ Exception -> 0x0048 }
        r0 = r2.f16628j;	 Catch:{ Exception -> 0x0048 }
        r3.registerActivityLifecycleCallbacks(r0);	 Catch:{ Exception -> 0x0048 }
    L_0x0048:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.xi.b(android.view.View):void");
    }

    /* renamed from: c */
    private final void m20263c() {
        if (this.f16627i != null) {
            View view = (View) this.f16627i.get();
            boolean z = false;
            if (view == null) {
                this.f16631m = -3;
                this.f16629k = false;
                return;
            }
            Object obj;
            int windowVisibility;
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            boolean localVisibleRect = view.getLocalVisibleRect(new Rect());
            if (!this.f16624f.m20217j()) {
                if (this.f16623e.inKeyguardRestrictedInputMode()) {
                    Activity a = vk.m20251a(view);
                    if (a != null) {
                        Window window = a.getWindow();
                        LayoutParams attributes = window == null ? null : window.getAttributes();
                        if (!(attributes == null || (attributes.flags & 524288) == 0)) {
                            obj = 1;
                            if (obj != null) {
                            }
                        }
                    }
                    obj = null;
                    if (obj != null) {
                    }
                }
                obj = null;
                windowVisibility = view.getWindowVisibility();
                if (this.f16630l != -1) {
                    windowVisibility = this.f16630l;
                }
                if (view.getVisibility() == 0 && view.isShown() && this.f16622d.isScreenOn() && r4 != null && localVisibleRect && globalVisibleRect && r6 == 0) {
                    z = true;
                }
                if (this.f16629k != z) {
                    this.f16631m = z ? SystemClock.elapsedRealtime() : -2;
                    this.f16629k = z;
                }
            }
            obj = 1;
            windowVisibility = view.getWindowVisibility();
            if (this.f16630l != -1) {
                windowVisibility = this.f16630l;
            }
            z = true;
            if (this.f16629k != z) {
                if (z) {
                }
                this.f16631m = z ? SystemClock.elapsedRealtime() : -2;
                this.f16629k = z;
            }
        }
    }

    /* renamed from: c */
    private final void m20264c(android.view.View r4) {
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
        r3 = this;
        r0 = 0;
        r1 = r3.f16626h;	 Catch:{ Exception -> 0x001d }
        if (r1 == 0) goto L_0x001d;	 Catch:{ Exception -> 0x001d }
    L_0x0005:
        r1 = r3.f16626h;	 Catch:{ Exception -> 0x001d }
        r1 = r1.get();	 Catch:{ Exception -> 0x001d }
        r1 = (android.view.ViewTreeObserver) r1;	 Catch:{ Exception -> 0x001d }
        if (r1 == 0) goto L_0x001b;	 Catch:{ Exception -> 0x001d }
    L_0x000f:
        r2 = r1.isAlive();	 Catch:{ Exception -> 0x001d }
        if (r2 == 0) goto L_0x001b;	 Catch:{ Exception -> 0x001d }
    L_0x0015:
        r1.removeOnScrollChangedListener(r3);	 Catch:{ Exception -> 0x001d }
        r1.removeGlobalOnLayoutListener(r3);	 Catch:{ Exception -> 0x001d }
    L_0x001b:
        r3.f16626h = r0;	 Catch:{ Exception -> 0x001d }
    L_0x001d:
        r4 = r4.getViewTreeObserver();	 Catch:{ Exception -> 0x002d }
        r1 = r4.isAlive();	 Catch:{ Exception -> 0x002d }
        if (r1 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0027:
        r4.removeOnScrollChangedListener(r3);	 Catch:{ Exception -> 0x002d }
        r4.removeGlobalOnLayoutListener(r3);	 Catch:{ Exception -> 0x002d }
    L_0x002d:
        r4 = r3.f16625g;
        if (r4 == 0) goto L_0x003a;
    L_0x0031:
        r4 = r3.f16620b;	 Catch:{ Exception -> 0x0038 }
        r1 = r3.f16625g;	 Catch:{ Exception -> 0x0038 }
        r4.unregisterReceiver(r1);	 Catch:{ Exception -> 0x0038 }
    L_0x0038:
        r3.f16625g = r0;
    L_0x003a:
        r4 = r3.f16621c;
        if (r4 == 0) goto L_0x0045;
    L_0x003e:
        r4 = r3.f16621c;	 Catch:{ Exception -> 0x0045 }
        r0 = r3.f16628j;	 Catch:{ Exception -> 0x0045 }
        r4.unregisterActivityLifecycleCallbacks(r0);	 Catch:{ Exception -> 0x0045 }
    L_0x0045:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.xi.c(android.view.View):void");
    }

    /* renamed from: a */
    public final long m20265a() {
        if (this.f16631m == -2 && this.f16627i.get() == null) {
            this.f16631m = -3;
        }
        return this.f16631m;
    }

    /* renamed from: a */
    final void m20266a(View view) {
        long j;
        View view2 = this.f16627i != null ? (View) this.f16627i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m20264c(view2);
        }
        this.f16627i = new WeakReference(view);
        if (view != null) {
            Object obj;
            if (view.getWindowToken() == null) {
                if (view.getWindowVisibility() == 8) {
                    obj = null;
                    if (obj != null) {
                        m20262b(view);
                    }
                    view.addOnAttachStateChangeListener(this);
                    j = -2;
                }
            }
            obj = 1;
            if (obj != null) {
                m20262b(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f16631m = j;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m20259a(activity, 0);
        m20263c();
    }

    public final void onActivityDestroyed(Activity activity) {
        m20263c();
    }

    public final void onActivityPaused(Activity activity) {
        m20259a(activity, 4);
        m20263c();
    }

    public final void onActivityResumed(Activity activity) {
        m20259a(activity, 0);
        m20263c();
        m20261b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m20263c();
    }

    public final void onActivityStarted(Activity activity) {
        m20259a(activity, 0);
        m20263c();
    }

    public final void onActivityStopped(Activity activity) {
        m20263c();
    }

    public final void onGlobalLayout() {
        m20263c();
    }

    public final void onScrollChanged() {
        m20263c();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f16630l = -1;
        m20262b(view);
        m20263c();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f16630l = -1;
        m20263c();
        m20261b();
        m20264c(view);
    }
}
