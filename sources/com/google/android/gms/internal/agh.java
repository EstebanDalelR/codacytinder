package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class agh implements zzhc {
    /* renamed from: a */
    private /* synthetic */ Activity f22938a;

    agh(age age, Activity activity) {
        this.f22938a = activity;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f22938a);
    }
}
