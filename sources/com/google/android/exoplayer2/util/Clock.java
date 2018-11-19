package com.google.android.exoplayer2.util;

import android.os.Handler.Callback;
import android.os.Looper;
import android.support.annotation.Nullable;

public interface Clock {
    /* renamed from: a */
    public static final Clock f6878a = new C3727q();

    HandlerWrapper createHandler(Looper looper, @Nullable Callback callback);

    long elapsedRealtime();

    void sleep(long j);

    long uptimeMillis();
}
