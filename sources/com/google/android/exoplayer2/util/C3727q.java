package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.util.q */
final class C3727q implements Clock {
    C3727q() {
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    public void sleep(long j) {
        SystemClock.sleep(j);
    }

    public HandlerWrapper createHandler(Looper looper, @Nullable Callback callback) {
        return new C3728r(new Handler(looper, callback));
    }
}
