package com.tinder.analytics.fireworks;

public interface FireworksSyncListener {
    void onSyncCompleted();

    void onSyncError(Throwable th);
}
