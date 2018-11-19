package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class ts implements zzdi {
    /* renamed from: a */
    private /* synthetic */ Activity f23462a;
    /* renamed from: b */
    private /* synthetic */ Bundle f23463b;

    ts(tr trVar, Activity activity, Bundle bundle) {
        this.f23462a = activity;
        this.f23463b = bundle;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f23462a, this.f23463b);
    }
}
