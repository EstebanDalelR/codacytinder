package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.events.C15645a;
import io.fabric.sdk.android.services.events.EventsStorage;
import io.fabric.sdk.android.services.settings.C15656b;
import java.io.IOException;
import java.util.UUID;

class SessionAnalyticsFilesManager extends C15645a<SessionEvent> {
    private static final String SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION = ".tap";
    private static final String SESSION_ANALYTICS_TO_SEND_FILE_PREFIX = "sa";
    private C15656b analyticsSettingsData;

    SessionAnalyticsFilesManager(Context context, SessionEventTransform sessionEventTransform, CurrentTimeProvider currentTimeProvider, EventsStorage eventsStorage) throws IOException {
        super(context, sessionEventTransform, currentTimeProvider, eventsStorage, 100);
    }

    protected String generateUniqueRollOverFileName() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SESSION_ANALYTICS_TO_SEND_FILE_PREFIX);
        stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
        stringBuilder.append(randomUUID.toString());
        stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
        stringBuilder.append(this.currentTimeProvider.getCurrentTimeMillis());
        stringBuilder.append(SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION);
        return stringBuilder.toString();
    }

    protected int getMaxFilesToKeep() {
        return this.analyticsSettingsData == null ? super.getMaxFilesToKeep() : this.analyticsSettingsData.f48453e;
    }

    protected int getMaxByteSizePerFile() {
        return this.analyticsSettingsData == null ? super.getMaxByteSizePerFile() : this.analyticsSettingsData.f48451c;
    }

    void setAnalyticsSettingsData(C15656b c15656b) {
        this.analyticsSettingsData = c15656b;
    }
}
