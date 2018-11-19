package com.leanplum;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.leanplum.p069a.an;
import com.leanplum.p069a.aq;
import com.leanplum.p069a.bo;

final class LeanplumActivityHelper$2 implements ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    LeanplumActivityHelper$2() {
    }

    public final void onActivityStopped(Activity activity) {
        try {
            LeanplumActivityHelper.a(activity);
        } catch (Activity activity2) {
            bo.a(activity2);
        }
    }

    public final void onActivityResumed(final Activity activity) {
        try {
            if (Leanplum.isInterfaceEditingEnabled()) {
                aq.a().a(new Runnable(this) {
                    /* renamed from: b */
                    private /* synthetic */ LeanplumActivityHelper$2 f21123b;

                    public final void run() {
                        an.a().applyInterfaceEdits(activity);
                    }
                });
            }
            LeanplumActivityHelper.b(activity);
            if (Leanplum.isScreenTrackingEnabled()) {
                Leanplum.advanceTo(activity.getLocalClassName());
            }
        } catch (Activity activity2) {
            bo.a(activity2);
        }
    }

    public final void onActivityPaused(Activity activity) {
        try {
            LeanplumActivityHelper.c(activity);
        } catch (Activity activity2) {
            bo.a(activity2);
        }
    }
}
