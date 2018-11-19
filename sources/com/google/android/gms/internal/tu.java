package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class tu implements zzdi {
    /* renamed from: a */
    private /* synthetic */ Activity f23465a;

    tu(tr trVar, Activity activity) {
        this.f23465a = activity;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f23465a);
    }
}
