package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class agi implements zzhc {
    /* renamed from: a */
    private /* synthetic */ Activity f22939a;

    agi(age age, Activity activity) {
        this.f22939a = activity;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f22939a);
    }
}
