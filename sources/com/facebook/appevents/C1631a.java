package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.appevents.a */
class C1631a {
    /* renamed from: a */
    private static final String f4515a = "a";
    /* renamed from: b */
    private static ReentrantReadWriteLock f4516b = new ReentrantReadWriteLock();
    /* renamed from: c */
    private static String f4517c = null;
    /* renamed from: d */
    private static volatile boolean f4518d = false;

    /* renamed from: com.facebook.appevents.a$1 */
    static class C16301 implements Runnable {
        C16301() {
        }

        public void run() {
            C1631a.m5546d();
        }
    }

    C1631a() {
    }

    /* renamed from: a */
    public static void m5543a() {
        if (!f4518d) {
            AppEventsLogger.m5533g().execute(new C16301());
        }
    }

    /* renamed from: b */
    public static String m5544b() {
        if (!f4518d) {
            Log.w(f4515a, "initStore should have been called before calling setUserID");
            C1631a.m5546d();
        }
        f4516b.readLock().lock();
        try {
            String str = f4517c;
            return str;
        } finally {
            f4516b.readLock().unlock();
        }
    }

    /* renamed from: d */
    private static void m5546d() {
        if (!f4518d) {
            f4516b.writeLock().lock();
            try {
                if (!f4518d) {
                    f4517c = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m3994e()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    f4518d = true;
                    f4516b.writeLock().unlock();
                }
            } finally {
                f4516b.writeLock().unlock();
            }
        }
    }
}
