package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class tt implements zzdi {
    /* renamed from: a */
    private /* synthetic */ Activity f23464a;

    tt(tr trVar, Activity activity) {
        this.f23464a = activity;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f23464a);
    }
}
