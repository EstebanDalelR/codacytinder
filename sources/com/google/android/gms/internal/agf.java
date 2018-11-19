package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class agf implements zzhc {
    /* renamed from: a */
    private /* synthetic */ Activity f22935a;
    /* renamed from: b */
    private /* synthetic */ Bundle f22936b;

    agf(age age, Activity activity, Bundle bundle) {
        this.f22935a = activity;
        this.f22936b = bundle;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f22935a, this.f22936b);
    }
}
