package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class tx implements zzdi {
    /* renamed from: a */
    private /* synthetic */ Activity f23468a;
    /* renamed from: b */
    private /* synthetic */ Bundle f23469b;

    tx(tr trVar, Activity activity, Bundle bundle) {
        this.f23468a = activity;
        this.f23469b = bundle;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f23468a, this.f23469b);
    }
}
