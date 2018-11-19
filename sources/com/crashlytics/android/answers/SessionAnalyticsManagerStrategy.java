package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.events.FileRollOverManager;
import io.fabric.sdk.android.services.settings.C15656b;

interface SessionAnalyticsManagerStrategy extends FileRollOverManager {
    void deleteAllEvents();

    void processEvent(Builder builder);

    void sendEvents();

    void setAnalyticsSettingsData(C15656b c15656b, String str);
}
