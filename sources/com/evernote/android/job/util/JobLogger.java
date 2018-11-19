package com.evernote.android.job.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public interface JobLogger {
    void log(int i, @NonNull String str, @NonNull String str2, @Nullable Throwable th);
}
