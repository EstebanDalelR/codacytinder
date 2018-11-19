package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class tv implements zzdi {
    /* renamed from: a */
    private /* synthetic */ Activity f23466a;

    tv(tr trVar, Activity activity) {
        this.f23466a = activity;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f23466a);
    }
}
