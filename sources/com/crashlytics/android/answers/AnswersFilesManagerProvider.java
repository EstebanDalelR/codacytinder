package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.common.C17335m;
import io.fabric.sdk.android.services.events.C18334b;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.IOException;

class AnswersFilesManagerProvider {
    static final String SESSION_ANALYTICS_FILE_NAME = "session_analytics.tap";
    static final String SESSION_ANALYTICS_TO_SEND_DIR = "session_analytics_to_send";
    final Context context;
    final FileStore fileStore;

    public AnswersFilesManagerProvider(Context context, FileStore fileStore) {
        this.context = context;
        this.fileStore = fileStore;
    }

    public SessionAnalyticsFilesManager getAnalyticsFilesManager() throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
        }
        return new SessionAnalyticsFilesManager(this.context, new SessionEventTransform(), new C17335m(), new C18334b(this.context, this.fileStore.getFilesDir(), SESSION_ANALYTICS_FILE_NAME, SESSION_ANALYTICS_TO_SEND_DIR));
    }
}
