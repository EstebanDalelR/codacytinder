package com.leanplum.messagetemplates;

import android.app.Activity;
import android.content.Context;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.PostponableAction;
import com.leanplum.callbacks.VariablesChangedCallback;

public class CenterPopup extends BaseMessageDialog {
    /* renamed from: a */
    private static final String f25652a = "Center Popup";

    /* renamed from: com.leanplum.messagetemplates.CenterPopup$1 */
    final class C70501 extends ActionCallback {
        C70501() {
        }

        public final boolean onResponse(final ActionContext actionContext) {
            Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback(this) {
                /* renamed from: b */
                private /* synthetic */ C70501 f25651b;

                /* renamed from: com.leanplum.messagetemplates.CenterPopup$1$1$1 */
                final class C70481 extends PostponableAction {
                    /* renamed from: a */
                    private /* synthetic */ C70491 f25649a;

                    C70481(C70491 c70491) {
                        this.f25649a = c70491;
                    }

                    public final void run() {
                        Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
                        if (currentActivity != null) {
                            CenterPopup centerPopup = new CenterPopup(currentActivity, new CenterPopupOptions(actionContext));
                            if (!currentActivity.isFinishing()) {
                                centerPopup.show();
                            }
                        }
                    }
                }

                public final void variablesChanged() {
                    LeanplumActivityHelper.queueActionUponActive(new C70481(this));
                }
            });
            return true;
        }
    }

    public CenterPopup(Activity activity, CenterPopupOptions centerPopupOptions) {
        super(activity, false, centerPopupOptions, null, null);
        this.options = centerPopupOptions;
    }

    public static void register(Context context) {
        Leanplum.defineAction(f25652a, 3, CenterPopupOptions.toArgs(context), new C70501());
    }
}
