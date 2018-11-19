package com.crashlytics.android.answers;

import android.app.Activity;
import android.os.Bundle;
import io.fabric.sdk.android.C15606a.C15605b;

class AnswersLifecycleCallbacks extends C15605b {
    private final SessionAnalyticsManager analyticsManager;
    private final BackgroundManager backgroundManager;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public AnswersLifecycleCallbacks(SessionAnalyticsManager sessionAnalyticsManager, BackgroundManager backgroundManager) {
        this.analyticsManager = sessionAnalyticsManager;
        this.backgroundManager = backgroundManager;
    }

    public void onActivityStarted(Activity activity) {
        this.analyticsManager.onLifecycle(activity, Type.START);
    }

    public void onActivityResumed(Activity activity) {
        this.analyticsManager.onLifecycle(activity, Type.RESUME);
        this.backgroundManager.onActivityResumed();
    }

    public void onActivityPaused(Activity activity) {
        this.analyticsManager.onLifecycle(activity, Type.PAUSE);
        this.backgroundManager.onActivityPaused();
    }

    public void onActivityStopped(Activity activity) {
        this.analyticsManager.onLifecycle(activity, Type.STOP);
    }
}
