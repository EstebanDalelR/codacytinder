package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class agm implements zzhc {
    /* renamed from: a */
    private /* synthetic */ Activity f22947a;

    agm(age age, Activity activity) {
        this.f22947a = activity;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f22947a);
    }
}
