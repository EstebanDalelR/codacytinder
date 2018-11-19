package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class agj implements zzhc {
    /* renamed from: a */
    private /* synthetic */ Activity f22940a;

    agj(age age, Activity activity) {
        this.f22940a = activity;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f22940a);
    }
}
