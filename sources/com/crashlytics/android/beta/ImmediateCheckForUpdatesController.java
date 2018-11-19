package com.crashlytics.android.beta;

class ImmediateCheckForUpdatesController extends AbstractCheckForUpdatesController {
    public boolean isActivityLifecycleTriggered() {
        return false;
    }

    public ImmediateCheckForUpdatesController() {
        super(true);
    }
}
