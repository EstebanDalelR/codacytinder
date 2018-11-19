package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class agg implements zzhc {
    /* renamed from: a */
    private /* synthetic */ Activity f22937a;

    agg(age age, Activity activity) {
        this.f22937a = activity;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f22937a);
    }
}
