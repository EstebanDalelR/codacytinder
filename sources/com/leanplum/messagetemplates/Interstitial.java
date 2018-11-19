package com.leanplum.messagetemplates;

import android.app.Activity;
import android.content.Context;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.PostponableAction;
import com.leanplum.callbacks.VariablesChangedCallback;

public class Interstitial extends BaseMessageDialog {
    /* renamed from: a */
    private static final String f25662a = "Interstitial";

    /* renamed from: com.leanplum.messagetemplates.Interstitial$1 */
    final class C70561 extends ActionCallback {
        C70561() {
        }

        public final boolean onResponse(final ActionContext actionContext) {
            Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback(this) {
                /* renamed from: b */
                private /* synthetic */ C70561 f25661b;

                /* renamed from: com.leanplum.messagetemplates.Interstitial$1$1$1 */
                final class C70541 extends PostponableAction {
                    /* renamed from: a */
                    private /* synthetic */ C70551 f25659a;

                    C70541(C70551 c70551) {
                        this.f25659a = c70551;
                    }

                    public final void run() {
                        Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
                        if (currentActivity != null) {
                            Interstitial interstitial = new Interstitial(currentActivity, new InterstitialOptions(actionContext));
                            if (!currentActivity.isFinishing()) {
                                interstitial.show();
                            }
                        }
                    }
                }

                public final void variablesChanged() {
                    LeanplumActivityHelper.queueActionUponActive(new C70541(this));
                }
            });
            return true;
        }
    }

    public Interstitial(Activity activity, InterstitialOptions interstitialOptions) {
        super(activity, true, interstitialOptions, null, null);
        this.options = interstitialOptions;
    }

    public static void register(Context context) {
        Leanplum.defineAction(f25662a, 3, InterstitialOptions.toArgs(context), new C70561());
    }
}
