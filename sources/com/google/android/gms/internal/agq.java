package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
final class agq implements ActivityLifecycleCallbacks {
    @Nullable
    /* renamed from: a */
    private Activity f15212a;
    /* renamed from: b */
    private Context f15213b;
    /* renamed from: c */
    private final Object f15214c = new Object();
    /* renamed from: d */
    private boolean f15215d = true;
    /* renamed from: e */
    private boolean f15216e = false;
    /* renamed from: f */
    private final List<zzhj> f15217f = new ArrayList();
    /* renamed from: g */
    private final List<zzhw> f15218g = new ArrayList();
    /* renamed from: h */
    private Runnable f15219h;
    /* renamed from: i */
    private boolean f15220i = false;
    /* renamed from: j */
    private long f15221j;

    agq() {
    }

    /* renamed from: a */
    private final void m19137a(Activity activity) {
        synchronized (this.f15214c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f15212a = activity;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public final Activity m19142a() {
        return this.f15212a;
    }

    /* renamed from: a */
    public final void m19143a(Application application, Context context) {
        if (!this.f15220i) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m19137a((Activity) context);
            }
            this.f15213b = application;
            this.f15221j = ((Long) aja.m19221f().m19334a(alo.av)).longValue();
            this.f15220i = true;
        }
    }

    /* renamed from: a */
    public final void m19144a(zzhj zzhj) {
        synchronized (this.f15214c) {
            this.f15217f.add(zzhj);
        }
    }

    @Nullable
    /* renamed from: b */
    public final Context m19145b() {
        return this.f15213b;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f15214c) {
            if (this.f15212a == null) {
                return;
            }
            if (this.f15212a.equals(activity)) {
                this.f15212a = null;
            }
            Iterator it = this.f15218g.iterator();
            while (it.hasNext()) {
                try {
                    if (((zzhw) it.next()).zza(activity)) {
                        it.remove();
                    }
                } catch (Throwable e) {
                    ar.i().m27296a(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    hx.m19912b("onActivityStateChangedListener threw exception.", e);
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m19137a(activity);
        synchronized (this.f15214c) {
            Iterator it = this.f15218g.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.f15216e = true;
        if (this.f15219h != null) {
            fk.f16060a.removeCallbacks(this.f15219h);
        }
        Handler handler = fk.f16060a;
        Runnable agr = new agr(this);
        this.f15219h = agr;
        handler.postDelayed(agr, this.f15221j);
    }

    public final void onActivityResumed(Activity activity) {
        m19137a(activity);
        this.f15216e = false;
        int i = this.f15215d ^ 1;
        this.f15215d = true;
        if (this.f15219h != null) {
            fk.f16060a.removeCallbacks(this.f15219h);
        }
        synchronized (this.f15214c) {
            Iterator it = this.f15218g.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (i != 0) {
                for (zzhj zzg : this.f15217f) {
                    try {
                        zzg.zzg(true);
                    } catch (Throwable e) {
                        hx.m19912b("OnForegroundStateChangedListener threw exception.", e);
                    }
                }
            } else {
                hx.m19911b("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m19137a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
