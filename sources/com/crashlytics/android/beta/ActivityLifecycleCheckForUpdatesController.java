package com.crashlytics.android.beta;

import android.annotation.TargetApi;
import android.app.Activity;
import io.fabric.sdk.android.C15606a;
import io.fabric.sdk.android.C15606a.C15605b;
import java.util.concurrent.ExecutorService;

@TargetApi(14)
class ActivityLifecycleCheckForUpdatesController extends AbstractCheckForUpdatesController {
    private final C15605b callbacks = new C31261();
    private final ExecutorService executorService;

    /* renamed from: com.crashlytics.android.beta.ActivityLifecycleCheckForUpdatesController$1 */
    class C31261 extends C15605b {

        /* renamed from: com.crashlytics.android.beta.ActivityLifecycleCheckForUpdatesController$1$1 */
        class C10861 implements Runnable {
            C10861() {
            }

            public void run() {
                ActivityLifecycleCheckForUpdatesController.this.checkForUpdates();
            }
        }

        C31261() {
        }

        public void onActivityStarted(Activity activity) {
            if (ActivityLifecycleCheckForUpdatesController.this.signalExternallyReady() != null) {
                ActivityLifecycleCheckForUpdatesController.this.executorService.submit(new C10861());
            }
        }
    }

    public boolean isActivityLifecycleTriggered() {
        return true;
    }

    public ActivityLifecycleCheckForUpdatesController(C15606a c15606a, ExecutorService executorService) {
        this.executorService = executorService;
        c15606a.a(this.callbacks);
    }
}
