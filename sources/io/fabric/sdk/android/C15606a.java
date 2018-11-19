package io.fabric.sdk.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: io.fabric.sdk.android.a */
public class C15606a {
    /* renamed from: a */
    private final Application f48301a;
    /* renamed from: b */
    private C15604a f48302b;

    /* renamed from: io.fabric.sdk.android.a$a */
    private static class C15604a {
        /* renamed from: a */
        private final Set<ActivityLifecycleCallbacks> f48299a = new HashSet();
        /* renamed from: b */
        private final Application f48300b;

        C15604a(Application application) {
            this.f48300b = application;
        }

        @TargetApi(14)
        /* renamed from: a */
        private void m58541a() {
            for (ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : this.f48299a) {
                this.f48300b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }

        @TargetApi(14)
        /* renamed from: a */
        private boolean m58544a(final C15605b c15605b) {
            if (this.f48300b == null) {
                return null;
            }
            ActivityLifecycleCallbacks c156031 = new ActivityLifecycleCallbacks(this) {
                /* renamed from: b */
                final /* synthetic */ C15604a f48298b;

                public void onActivityCreated(Activity activity, Bundle bundle) {
                    c15605b.onActivityCreated(activity, bundle);
                }

                public void onActivityStarted(Activity activity) {
                    c15605b.onActivityStarted(activity);
                }

                public void onActivityResumed(Activity activity) {
                    c15605b.onActivityResumed(activity);
                }

                public void onActivityPaused(Activity activity) {
                    c15605b.onActivityPaused(activity);
                }

                public void onActivityStopped(Activity activity) {
                    c15605b.onActivityStopped(activity);
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    c15605b.onActivitySaveInstanceState(activity, bundle);
                }

                public void onActivityDestroyed(Activity activity) {
                    c15605b.onActivityDestroyed(activity);
                }
            };
            this.f48300b.registerActivityLifecycleCallbacks(c156031);
            this.f48299a.add(c156031);
            return true;
        }
    }

    /* renamed from: io.fabric.sdk.android.a$b */
    public static abstract class C15605b {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public C15606a(Context context) {
        this.f48301a = (Application) context.getApplicationContext();
        if (VERSION.SDK_INT >= 14) {
            this.f48302b = new C15604a(this.f48301a);
        }
    }

    /* renamed from: a */
    public boolean m58546a(C15605b c15605b) {
        return (this.f48302b == null || this.f48302b.m58544a(c15605b) == null) ? null : true;
    }

    /* renamed from: a */
    public void m58545a() {
        if (this.f48302b != null) {
            this.f48302b.m58541a();
        }
    }
}
