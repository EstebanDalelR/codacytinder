package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.ads.AdError;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.C1659i.C1658a;
import com.facebook.internal.C1709i;
import com.facebook.internal.C1712j;
import com.facebook.internal.C1738r;
import com.facebook.internal.Utility;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.appevents.internal.a */
public class C1649a {
    /* renamed from: a */
    private static final String f4551a = C1649a.class.getCanonicalName();
    /* renamed from: b */
    private static final ScheduledExecutorService f4552b = Executors.newSingleThreadScheduledExecutor();
    /* renamed from: c */
    private static volatile ScheduledFuture f4553c;
    /* renamed from: d */
    private static final Object f4554d = new Object();
    /* renamed from: e */
    private static AtomicInteger f4555e = new AtomicInteger(0);
    /* renamed from: f */
    private static volatile C1655g f4556f;
    /* renamed from: g */
    private static AtomicBoolean f4557g = new AtomicBoolean(false);
    /* renamed from: h */
    private static String f4558h;
    /* renamed from: i */
    private static long f4559i;

    /* renamed from: com.facebook.appevents.internal.a$1 */
    static class C16441 implements ActivityLifecycleCallbacks {
        C16441() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C1738r.m5978a(LoggingBehavior.APP_EVENTS, C1649a.f4551a, "onActivityCreated");
            C1650b.m5599b();
            C1649a.m5583a(activity);
        }

        public void onActivityStarted(Activity activity) {
            C1738r.m5978a(LoggingBehavior.APP_EVENTS, C1649a.f4551a, "onActivityStarted");
        }

        public void onActivityResumed(Activity activity) {
            C1738r.m5978a(LoggingBehavior.APP_EVENTS, C1649a.f4551a, "onActivityResumed");
            C1650b.m5599b();
            C1649a.m5586b(activity);
        }

        public void onActivityPaused(Activity activity) {
            C1738r.m5978a(LoggingBehavior.APP_EVENTS, C1649a.f4551a, "onActivityPaused");
            C1650b.m5599b();
            C1649a.m5590d(activity);
        }

        public void onActivityStopped(Activity activity) {
            C1738r.m5978a(LoggingBehavior.APP_EVENTS, C1649a.f4551a, "onActivityStopped");
            AppEventsLogger.m5529c();
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C1738r.m5978a(LoggingBehavior.APP_EVENTS, C1649a.f4551a, "onActivitySaveInstanceState");
        }

        public void onActivityDestroyed(Activity activity) {
            C1738r.m5978a(LoggingBehavior.APP_EVENTS, C1649a.f4551a, "onActivityDestroyed");
        }
    }

    /* renamed from: a */
    public static void m5584a(Application application, String str) {
        if (f4557g.compareAndSet(false, true)) {
            f4558h = str;
            application.registerActivityLifecycleCallbacks(new C16441());
        }
    }

    /* renamed from: a */
    public static UUID m5581a() {
        return f4556f != null ? f4556f.m5618g() : null;
    }

    /* renamed from: a */
    public static void m5583a(Activity activity) {
        final long currentTimeMillis = System.currentTimeMillis();
        final Context applicationContext = activity.getApplicationContext();
        final String c = Utility.m5796c((Context) activity);
        final C1659i a = C1658a.m5626a(activity);
        f4552b.execute(new Runnable() {
            public void run() {
                if (C1649a.f4556f == null) {
                    C1655g a = C1655g.m5610a();
                    if (a != null) {
                        C1656h.m5624a(applicationContext, c, a, C1649a.f4558h);
                    }
                    C1649a.f4556f = new C1655g(Long.valueOf(currentTimeMillis), null);
                    C1649a.f4556f.m5612a(a);
                    C1656h.m5625a(applicationContext, c, a, C1649a.f4558h);
                }
            }
        });
    }

    /* renamed from: b */
    public static void m5586b(Activity activity) {
        f4555e.incrementAndGet();
        C1649a.m5597k();
        final long currentTimeMillis = System.currentTimeMillis();
        f4559i = currentTimeMillis;
        final Context applicationContext = activity.getApplicationContext();
        activity = Utility.m5796c((Context) activity);
        f4552b.execute(new Runnable() {
            public void run() {
                if (C1649a.f4556f == null) {
                    C1649a.f4556f = new C1655g(Long.valueOf(currentTimeMillis), null);
                    C1656h.m5625a(applicationContext, activity, null, C1649a.f4558h);
                } else if (C1649a.f4556f.m5614c() != null) {
                    long longValue = currentTimeMillis - C1649a.f4556f.m5614c().longValue();
                    if (longValue > ((long) (C1649a.m5596j() * AdError.NETWORK_ERROR_CODE))) {
                        C1656h.m5624a(applicationContext, activity, C1649a.f4556f, C1649a.f4558h);
                        C1656h.m5625a(applicationContext, activity, null, C1649a.f4558h);
                        C1649a.f4556f = new C1655g(Long.valueOf(currentTimeMillis), null);
                    } else if (longValue > 1000) {
                        C1649a.f4556f.m5616e();
                    }
                }
                C1649a.f4556f.m5613a(Long.valueOf(currentTimeMillis));
                C1649a.f4556f.m5621j();
            }
        });
    }

    /* renamed from: d */
    private static void m5590d(Activity activity) {
        if (f4555e.decrementAndGet() < 0) {
            f4555e.set(0);
            Log.w(f4551a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        C1649a.m5597k();
        final long currentTimeMillis = System.currentTimeMillis();
        final Context applicationContext = activity.getApplicationContext();
        activity = Utility.m5796c((Context) activity);
        f4552b.execute(new Runnable() {

            /* renamed from: com.facebook.appevents.internal.a$4$1 */
            class C16471 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C16484 f4547a;

                C16471(C16484 c16484) {
                    this.f4547a = c16484;
                }

                public void run() {
                    if (C1649a.f4555e.get() <= 0) {
                        C1656h.m5624a(applicationContext, activity, C1649a.f4556f, C1649a.f4558h);
                        C1655g.m5611b();
                        C1649a.f4556f = null;
                    }
                    synchronized (C1649a.f4554d) {
                        C1649a.f4553c = null;
                    }
                }
            }

            public void run() {
                if (C1649a.f4556f == null) {
                    C1649a.f4556f = new C1655g(Long.valueOf(currentTimeMillis), null);
                }
                C1649a.f4556f.m5613a(Long.valueOf(currentTimeMillis));
                if (C1649a.f4555e.get() <= 0) {
                    Runnable c16471 = new C16471(this);
                    synchronized (C1649a.f4554d) {
                        C1649a.f4553c = C1649a.f4552b.schedule(c16471, (long) C1649a.m5596j(), TimeUnit.SECONDS);
                    }
                }
                long i = C1649a.f4559i;
                long j = 0;
                if (i > 0) {
                    j = (currentTimeMillis - i) / 1000;
                }
                C1652c.m5602a(activity, j);
                C1649a.f4556f.m5621j();
            }
        });
    }

    /* renamed from: j */
    private static int m5596j() {
        C1709i a = C1712j.m5907a(FacebookSdk.m3998i());
        if (a == null) {
            return C1653d.m5607a();
        }
        return a.m5900e();
    }

    /* renamed from: k */
    private static void m5597k() {
        synchronized (f4554d) {
            if (f4553c != null) {
                f4553c.cancel(false);
            }
            f4553c = null;
        }
    }
}
