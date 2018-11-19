package com.evernote.android.job.util;

import android.os.SystemClock;

public interface Clock {
    /* renamed from: a */
    public static final Clock f3015a = new C31411();

    /* renamed from: com.evernote.android.job.util.Clock$1 */
    static class C31411 implements Clock {
        C31411() {
        }

        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }

        public long elapsedRealtime() {
            return SystemClock.elapsedRealtime();
        }
    }

    long currentTimeMillis();

    long elapsedRealtime();
}
