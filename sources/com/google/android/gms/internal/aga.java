package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.ar;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@zzzv
@TargetApi(14)
public final class aga implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: a */
    private static final long f15157a = ((Long) aja.m19221f().m19334a(alo.aZ)).longValue();
    /* renamed from: b */
    private final Context f15158b;
    /* renamed from: c */
    private Application f15159c;
    /* renamed from: d */
    private final WindowManager f15160d;
    /* renamed from: e */
    private final PowerManager f15161e;
    /* renamed from: f */
    private final KeyguardManager f15162f;
    @Nullable
    /* renamed from: g */
    private BroadcastReceiver f15163g;
    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f15164h;
    /* renamed from: i */
    private WeakReference<View> f15165i;
    /* renamed from: j */
    private age f15166j;
    /* renamed from: k */
    private he f15167k = new he(f15157a);
    /* renamed from: l */
    private boolean f15168l = false;
    /* renamed from: m */
    private int f15169m = -1;
    /* renamed from: n */
    private HashSet<zzgt> f15170n = new HashSet();
    /* renamed from: o */
    private DisplayMetrics f15171o;

    public aga(Context context, View view) {
        this.f15158b = context.getApplicationContext();
        this.f15160d = (WindowManager) context.getSystemService("window");
        this.f15161e = (PowerManager) this.f15158b.getSystemService("power");
        this.f15162f = (KeyguardManager) context.getSystemService("keyguard");
        if (this.f15158b instanceof Application) {
            this.f15159c = (Application) this.f15158b;
            this.f15166j = new age((Application) this.f15158b, this);
        }
        this.f15171o = context.getResources().getDisplayMetrics();
        View view2 = this.f15165i != null ? (View) this.f15165i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m19108b(view2);
        }
        this.f15165i = new WeakReference(view);
        if (view != null) {
            if (ar.g().mo8354a(view)) {
                m19104a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    private final Rect m19101a(Rect rect) {
        return new Rect(m19106b(rect.left), m19106b(rect.top), m19106b(rect.right), m19106b(rect.bottom));
    }

    /* renamed from: a */
    private final void m19102a(int i) {
        int i2 = i;
        if (this.f15170n.size() != 0 && r1.f15165i != null) {
            boolean z;
            boolean z2;
            View view = (View) r1.f15165i.get();
            Object obj = i2 == 1 ? 1 : null;
            Object obj2 = view == null ? 1 : null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            Rect rect5 = new Rect();
            rect5.right = r1.f15160d.getDefaultDisplay().getWidth();
            rect5.bottom = r1.f15160d.getDefaultDisplay().getHeight();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Throwable e) {
                    hx.m19912b("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z = globalVisibleRect;
                z2 = localVisibleRect;
            } else {
                z = false;
                z2 = false;
            }
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            if (r1.f15169m != -1) {
                windowVisibility = r1.f15169m;
            }
            boolean z3 = obj2 == null && ar.e().m19753a(view, r1.f15161e, r1.f15162f) && z && z2 && windowVisibility == 0;
            if (obj != null && !r1.f15167k.m19841a() && z3 == r1.f15168l) {
                return;
            }
            if (z3 || r1.f15168l || i2 != 1) {
                agd agd = new agd(ar.k().elapsedRealtime(), r1.f15161e.isScreenOn(), view != null ? ar.g().mo8354a(view) : false, view != null ? view.getWindowVisibility() : 8, m19101a(rect5), m19101a(rect), m19101a(rect2), z, m19101a(rect3), z2, m19101a(rect4), r1.f15171o.density, z3);
                Iterator it = r1.f15170n.iterator();
                while (it.hasNext()) {
                    ((zzgt) it.next()).zza(agd);
                }
                r1.f15168l = z3;
            }
        }
    }

    /* renamed from: a */
    private final void m19103a(Activity activity, int i) {
        if (this.f15165i != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f15165i.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.f15169m = i;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m19104a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f15164h = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f15163g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f15163g = new agc(this);
            ar.C().m19851a(this.f15158b, this.f15163g, intentFilter);
        }
        if (this.f15159c != null) {
            try {
                this.f15159c.registerActivityLifecycleCallbacks(this.f15166j);
            } catch (Throwable e) {
                hx.m19912b("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: b */
    private final int m19106b(int i) {
        return (int) (((float) i) / this.f15171o.density);
    }

    /* renamed from: b */
    private final void m19107b() {
        ar.e();
        fk.f16060a.post(new agb(this));
    }

    /* renamed from: b */
    private final void m19108b(View view) {
        try {
            if (this.f15164h != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f15164h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f15164h = null;
            }
        } catch (Throwable e) {
            hx.m19912b("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Throwable e2) {
            hx.m19912b("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f15163g != null) {
            try {
                ar.C().m19850a(this.f15158b, this.f15163g);
            } catch (Throwable e22) {
                hx.m19912b("Failed trying to unregister the receiver", e22);
            } catch (Throwable e222) {
                ar.i().m27296a(e222, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f15163g = null;
        }
        if (this.f15159c != null) {
            try {
                this.f15159c.unregisterActivityLifecycleCallbacks(this.f15166j);
            } catch (Throwable e2222) {
                hx.m19912b("Error registering activity lifecycle callbacks.", e2222);
            }
        }
    }

    /* renamed from: a */
    public final void m19109a() {
        m19102a(4);
    }

    /* renamed from: a */
    public final void m19110a(zzgt zzgt) {
        this.f15170n.add(zzgt);
        m19102a(3);
    }

    /* renamed from: b */
    public final void m19111b(zzgt zzgt) {
        this.f15170n.remove(zzgt);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m19103a(activity, 0);
        m19102a(3);
        m19107b();
    }

    public final void onActivityDestroyed(Activity activity) {
        m19102a(3);
        m19107b();
    }

    public final void onActivityPaused(Activity activity) {
        m19103a(activity, 4);
        m19102a(3);
        m19107b();
    }

    public final void onActivityResumed(Activity activity) {
        m19103a(activity, 0);
        m19102a(3);
        m19107b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m19102a(3);
        m19107b();
    }

    public final void onActivityStarted(Activity activity) {
        m19103a(activity, 0);
        m19102a(3);
        m19107b();
    }

    public final void onActivityStopped(Activity activity) {
        m19102a(3);
        m19107b();
    }

    public final void onGlobalLayout() {
        m19102a(2);
        m19107b();
    }

    public final void onScrollChanged() {
        m19102a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f15169m = -1;
        m19104a(view);
        m19102a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f15169m = -1;
        m19102a(3);
        m19107b();
        m19108b(view);
    }
}
