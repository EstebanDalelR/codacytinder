package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import java.lang.ref.WeakReference;

@RequiresApi(api = 14)
/* renamed from: com.appsflyer.w */
final class C0958w implements ActivityLifecycleCallbacks {
    /* renamed from: a */
    private static C0958w f2546a;
    /* renamed from: b */
    private boolean f2547b = false;
    /* renamed from: c */
    private boolean f2548c = true;
    /* renamed from: d */
    private C0957b f2549d = null;

    /* renamed from: com.appsflyer.w$a */
    class C0956a extends AsyncTask<Void, Void, Void> {
        /* renamed from: a */
        WeakReference<Context> f2544a;
        /* renamed from: b */
        final /* synthetic */ C0958w f2545b;

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m3260a((Void[]) objArr);
        }

        public C0956a(C0958w c0958w, WeakReference<Context> weakReference) {
            this.f2545b = c0958w;
            this.f2544a = weakReference;
        }

        /* renamed from: a */
        protected final Void m3260a(Void... voidArr) {
            try {
                Thread.sleep(500);
            } catch (Throwable e) {
                AFLogger.m3073a("Sleeping attempt failed (essential for background state verification)\n", e);
            }
            if (!(this.f2545b.f2547b == null || this.f2545b.f2548c == null)) {
                this.f2545b.f2547b = false;
                try {
                    this.f2545b.f2549d.mo1220a(this.f2544a);
                } catch (Throwable e2) {
                    AFLogger.m3073a("Listener threw exception! ", e2);
                    cancel(1);
                }
            }
            this.f2544a.clear();
            return null;
        }
    }

    /* renamed from: com.appsflyer.w$b */
    interface C0957b {
        /* renamed from: a */
        void mo1219a(Activity activity);

        /* renamed from: a */
        void mo1220a(WeakReference<Context> weakReference);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    C0958w() {
    }

    /* renamed from: a */
    static C0958w m3263a() {
        if (f2546a == null) {
            f2546a = new C0958w();
        }
        return f2546a;
    }

    /* renamed from: b */
    public static C0958w m3266b() {
        if (f2546a != null) {
            return f2546a;
        }
        throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameter init/get");
    }

    /* renamed from: a */
    public final void m3269a(Application application, C0957b c0957b) {
        this.f2549d = c0957b;
        if (VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(f2546a);
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f2548c = false;
        int i = this.f2547b ^ 1;
        this.f2547b = true;
        if (i != 0) {
            try {
                this.f2549d.mo1219a(activity);
            } catch (Throwable e) {
                AFLogger.m3073a("Listener threw exception! ", e);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.f2548c = true;
        try {
            new C0956a(this, new WeakReference(activity.getApplicationContext())).executeOnExecutor(C0919a.m3116a().m3118b(), new Void[0]);
        } catch (Throwable e) {
            AFLogger.m3073a("backgroundTask.executeOnExecutor failed with RejectedExecutionException Exception", e);
        } catch (Throwable e2) {
            AFLogger.m3073a("backgroundTask.executeOnExecutor failed with Exception", e2);
        }
    }
}
