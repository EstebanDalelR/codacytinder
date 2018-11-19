package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.settings.C15656b;
import java.io.IOException;

class DisabledSessionAnalyticsManagerStrategy implements SessionAnalyticsManagerStrategy {
    public void cancelTimeBasedFileRollOver() {
    }

    public void deleteAllEvents() {
    }

    public void processEvent(Builder builder) {
    }

    public boolean rollFileOver() throws IOException {
        return false;
    }

    public void scheduleTimeBasedRollOverIfNeeded() {
    }

    public void sendEvents() {
    }

    public void setAnalyticsSettingsData(C15656b c15656b, String str) {
    }

    DisabledSessionAnalyticsManagerStrategy() {
    }
}
