package com.tinder.common;

import android.app.Application;

public interface CrashReporter {
    void initialize(Application application);

    boolean isInitialized();

    void log(String str);

    void logException(Throwable th);
}
