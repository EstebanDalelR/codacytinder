package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.C15642c;
import io.fabric.sdk.android.services.concurrency.internal.C17340a;
import io.fabric.sdk.android.services.concurrency.internal.C17341b;
import io.fabric.sdk.android.services.events.FilesSender;
import java.io.File;
import java.util.List;

class AnswersRetryFilesSender implements FilesSender {
    private static final int BACKOFF_MS = 1000;
    private static final int BACKOFF_POWER = 8;
    private static final double JITTER_PERCENT = 0.1d;
    private static final int MAX_RETRIES = 5;
    private final SessionAnalyticsFilesSender filesSender;
    private final RetryManager retryManager;

    public static AnswersRetryFilesSender build(SessionAnalyticsFilesSender sessionAnalyticsFilesSender) {
        return new AnswersRetryFilesSender(sessionAnalyticsFilesSender, new RetryManager(new C15642c(new RandomBackoff(new C17341b(1000, 8), JITTER_PERCENT), new C17340a(5))));
    }

    AnswersRetryFilesSender(SessionAnalyticsFilesSender sessionAnalyticsFilesSender, RetryManager retryManager) {
        this.filesSender = sessionAnalyticsFilesSender;
        this.retryManager = retryManager;
    }

    public boolean send(List<File> list) {
        long nanoTime = System.nanoTime();
        if (!this.retryManager.canRetry(nanoTime)) {
            return false;
        }
        if (this.filesSender.send(list) != null) {
            this.retryManager.reset();
            return true;
        }
        this.retryManager.recordRetry(nanoTime);
        return false;
    }
}
