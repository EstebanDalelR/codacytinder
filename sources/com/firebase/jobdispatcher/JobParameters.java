package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public interface JobParameters {
    int[] getConstraints();

    @Nullable
    Bundle getExtras();

    int getLifetime();

    @NonNull
    RetryStrategy getRetryStrategy();

    @NonNull
    String getService();

    @NonNull
    String getTag();

    @NonNull
    C1885m getTrigger();

    @Nullable
    C1887o getTriggerReason();

    boolean isRecurring();

    boolean shouldReplaceCurrent();
}
