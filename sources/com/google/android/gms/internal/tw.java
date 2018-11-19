package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class tw implements zzdi {
    /* renamed from: a */
    private /* synthetic */ Activity f23467a;

    tw(tr trVar, Activity activity) {
        this.f23467a = activity;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f23467a);
    }
}
