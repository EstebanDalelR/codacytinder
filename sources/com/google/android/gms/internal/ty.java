package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ty implements zzdi {
    /* renamed from: a */
    private /* synthetic */ Activity f23470a;

    ty(tr trVar, Activity activity) {
        this.f23470a = activity;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f23470a);
    }
}
