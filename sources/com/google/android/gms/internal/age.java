package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class age implements ActivityLifecycleCallbacks {
    /* renamed from: a */
    private final Application f15187a;
    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f15188b;
    /* renamed from: c */
    private boolean f15189c = false;

    public age(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f15188b = new WeakReference(activityLifecycleCallbacks);
        this.f15187a = application;
    }

    /* renamed from: a */
    private final void m19112a(zzhc zzhc) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f15188b.get();
            if (activityLifecycleCallbacks != null) {
                zzhc.zza(activityLifecycleCallbacks);
                return;
            }
            if (!this.f15189c) {
                this.f15187a.unregisterActivityLifecycleCallbacks(this);
                this.f15189c = true;
            }
        } catch (Throwable e) {
            hx.m19912b("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m19112a(new agf(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m19112a(new agm(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m19112a(new agi(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m19112a(new agh(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m19112a(new agl(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m19112a(new agg(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m19112a(new agj(this, activity));
    }
}
