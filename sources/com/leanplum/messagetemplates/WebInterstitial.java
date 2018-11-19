package com.leanplum.messagetemplates;

import android.app.Activity;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.PostponableAction;

public class WebInterstitial extends BaseMessageDialog {
    /* renamed from: a */
    private static final String f25665a = "Web Interstitial";

    /* renamed from: com.leanplum.messagetemplates.WebInterstitial$1 */
    final class C70581 extends ActionCallback {
        C70581() {
        }

        public final boolean onResponse(final ActionContext actionContext) {
            LeanplumActivityHelper.queueActionUponActive(new PostponableAction(this) {
                /* renamed from: b */
                private /* synthetic */ C70581 f25664b;

                public final void run() {
                    Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
                    if (currentActivity != null) {
                        WebInterstitial webInterstitial = new WebInterstitial(currentActivity, new WebInterstitialOptions(actionContext));
                        if (!currentActivity.isFinishing()) {
                            webInterstitial.show();
                        }
                    }
                }
            });
            return true;
        }
    }

    public WebInterstitial(Activity activity, WebInterstitialOptions webInterstitialOptions) {
        super(activity, true, null, webInterstitialOptions, null);
        this.webOptions = webInterstitialOptions;
    }

    public static void register() {
        Leanplum.defineAction(f25665a, 3, WebInterstitialOptions.toArgs(), new C70581());
    }
}
