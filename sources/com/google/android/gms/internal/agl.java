package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class agl implements zzhc {
    /* renamed from: a */
    private /* synthetic */ Activity f22945a;
    /* renamed from: b */
    private /* synthetic */ Bundle f22946b;

    agl(age age, Activity activity, Bundle bundle) {
        this.f22945a = activity;
        this.f22946b = bundle;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f22945a, this.f22946b);
    }
}
